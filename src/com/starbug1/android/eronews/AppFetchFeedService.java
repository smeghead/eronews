package com.starbug1.android.eronews;

import java.util.ArrayList;
import java.util.List;

import com.starbug1.android.newsapp.FetchFeedService;
import com.starbug1.android.newsapp.data.NewsListItem;

public class AppFetchFeedService extends FetchFeedService {

//	private final Pattern imageUrl_ = Pattern.compile("<img.*?src=\"([^\"]*)\"", Pattern.MULTILINE);
//	private Pattern erogContent_ = Pattern.compile("div class=\"entry\"(.*)p class=\"extended\"", Pattern.DOTALL);

	@Override
	protected List<Feed> getFeeds() {
		List<Feed> feeds = new ArrayList<Feed>();
		
		feeds.add(new Feed("adult_pics", "http://blog.livedoor.jp/adult_pics/index.rdf") {

			@Override
			public String getImageUrl(String content, NewsListItem item) {
				return null;
			}
			
		});
		feeds.add(new Feed("erogazosk", "http://erogazosk.gger.jp/index.rdf") {

			@Override
			public String getImageUrl(String content, NewsListItem item) {
				return null;
			}
			
		});
		feeds.add(new Feed("avinfolie", "http://blog.livedoor.jp/avinfolie/index.rdf") {

			@Override
			public String getImageUrl(String content, NewsListItem item) {
				return null;
			}
			
		});
		
		return feeds;
	}
	
	@Override
	public void onCreate() {

		super.onCreate();
	}

	@Override
	protected boolean isValidItem(NewsListItem item) {
		if (item.getLink().toString().indexOf("/blog/") != -1) {
			return false;
		}
		return super.isValidItem(item);
	}
	
	
}
