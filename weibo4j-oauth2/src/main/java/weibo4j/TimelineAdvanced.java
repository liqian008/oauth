package weibo4j;

import java.net.URLEncoder;

import weibo4j.model.PostParameter;
import weibo4j.model.Status;
import weibo4j.model.WeiboException;
import weibo4j.util.WeiboConfig;

/**
 * 高级接口，可以使用图片url发布微博
 * @author liqian
 *
 */
public class TimelineAdvanced extends Weibo {

	private static final long serialVersionUID = 6235150828015082132L;

	public TimelineAdvanced(String access_token) {
		this.access_token = access_token;
	}

	
	/**
	 * 发布一条带图片的微博
	 * 
	 * @param status
	 *            要发布的微博文本内容，必须做URLencode，内容不超过140个汉字
	 * @param imageUrl
	 * @return Status
	 * @throws WeiboException
	 *             when Weibo service or network is unavailable
	 * @version weibo4j-V2 1.0.0
	 * @see http://open.weibo.com/wiki/2/statuses/upload_url_text
	 * @since JDK 1.5
	 */
	public Status updateUrlText(String status, String imageUrl) throws WeiboException {
//		System.out.println("content: "+status + ", weibo status length: "+status.length());
		return new Status(client.post(WeiboConfig.getValue("baseURL")
				+ "statuses/upload_url_text.json",
				new PostParameter[] { new PostParameter("status", status),  new PostParameter("url", imageUrl) },
				access_token));
	}

	

}
