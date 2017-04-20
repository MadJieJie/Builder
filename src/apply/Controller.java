package apply;

/**
 * @author Created by MadJieJie on 2017/4/17-11:56.
 * @brief
 * @attention
 */
public class Controller
{
	public String mTitle;
	public String mMessage;
	
	public String getTitle ()
	{
		return mTitle;
	}
	
	public void setTitle ( String title )
	{
		mTitle = title;
	}
	
	public String getMessage ()
	{
		return mMessage;
	}
	
	public void setMessage ( String message )
	{
		mMessage = message;
	}
	
	public static class DialogParams
	{
		public String mTitle;
		public String mMessage;
		
		public void apply ( Controller controller )
		{
			
			if ( mTitle != null )
			{
				controller.setTitle(mTitle);
			}
			
			if ( mMessage != null )
			{
				controller.setMessage(mMessage);
			}
			
		}
		
	}
	
}
