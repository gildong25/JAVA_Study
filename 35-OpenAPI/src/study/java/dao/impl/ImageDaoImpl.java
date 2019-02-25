package study.java.dao.impl;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import study.java.dao.ImageDao;
import study.java.helper.HttpHelper;
import study.java.helper.JsonHelper;
import study.java.model.ImageItem;

public class ImageDaoImpl implements ImageDao {

	@Override
	public List<ImageItem> getImageSearchList(String keyword) {
		List<ImageItem> list = null;

		// 검색어
		String search = null;

		/** 한글일 경우 URLEncoding 처리가 되어야 한다. */
		try {
			search = URLEncoder.encode(keyword, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// DAUM OpenAPI 주소
		String url = "http://apis.daum.net/search/image" + "?q=" + search
				+ "&apikey=ef91238f81a6680742a47aa84677b7c1c75620d4"
				+ "&output=json";

		// JSON파일을 읽어서 객체로 변환
		InputStream is = HttpHelper.getInstance().getWebData(url, "utf-8");

		// 통신결과가 없다면 처리 중단
		if (is == null) {
			System.out.println("데이터 다운로드 실패");
			return null;
		}

		// 통신에 성공하였으므로, 리턴할 List 할당
		list = new ArrayList<ImageItem>();

		// 통신 결과를 JSON으로 변환
		JSONObject json = JsonHelper.getInstance().getJSONObject(is, "utf-8");

		// 원하는 데이터에 접근하기
		JSONObject channel = json.getJSONObject("channel");
		JSONArray item = channel.getJSONArray("item");

		// 배열의 항목 수 만큼 반복
		for (int i = 0; i < item.length(); i++) {
			// 배열의 각 요소 추출
			JSONObject obj = item.getJSONObject(i);
			// 값 추출
			String title = obj.getString("title");
			String link = obj.getString("link");
			String thumbnail = obj.getString("thumbnail");
			int width = obj.getInt("width");
			int height = obj.getInt("height");
			String pubDate = obj.getString("pubDate");
			// 추출한 값을 객체화 하여 List에 추가
			list.add(new ImageItem(title, link, thumbnail, 
					width, height, pubDate));
		}

		return list;
	}

}
