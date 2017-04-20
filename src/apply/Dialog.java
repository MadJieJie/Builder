package apply;

/**
 * @author Created by MadJieJie on 2017/1/24-18:37.
 * @brief
 * @attention
 */
public class Dialog implements IDialogBuilder
{
	private final Controller mController;
	
	protected Dialog ()
	{
		mController = new Controller();
	}
	
	public Dialog setTitle ( String title )
	{
		mController.setTitle(title);
		return this;
	}
	
	public Dialog setMessage ( String message )
	{
		mController.setMessage(message);
		return this;
	}
	
	@Override
	public void show ()
	{
		if ( mController.getTitle() != null )
			System.out.println(mController.getTitle());
		
		if ( mController.getMessage() != null )
			System.out.println(mController.getMessage());
	}
	
	
	public static class Builder
	{
		Controller.DialogParams mParams;
		
		public Builder ()
		{
			mParams = new Controller.DialogParams();
		}
		
		public Builder setTitle ( String title )
		{
			mParams.mTitle = title;
			return this;
		}
		
		public Builder setMessage ( String message )
		{
			mParams.mMessage = message;
			return this;
		}
		
		public Dialog create ()
		{
			final Dialog dialog = new Dialog();
			mParams.apply(dialog.mController);
			return dialog;
		}
		
	}
	
	
}
