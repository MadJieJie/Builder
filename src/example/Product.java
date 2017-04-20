package example;

/**
 * @author Created by MadJieJie on 2017/4/17-14:00.
 * @brief
 * @attention
 */
public class Product
{
	public String title;
	public String message;
	
	public void show ()
	{
		System.out.println("title:" + title);
		System.out.println("message:" + message);
	}
	
	public void setTitle ( String title )
	{
		this.title = title;
	}
	
	
	public void setMessage ( String message )
	{
		this.message = message;
	}
}
