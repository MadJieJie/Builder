package example;

/**
 * @author Created by MadJieJie on 2017/4/17-14:00.
 * @brief
 * @attention
 */
public class Director
{
	private final ConcreteBuilder mConcreteBuilder;
	
	public Director ( ConcreteBuilder concreteBuilder )
	{
		mConcreteBuilder = concreteBuilder;
	}
	
	
	public Director setTitleAndMessage(String title,String message)
	{
		mConcreteBuilder.setTitle(title);
		mConcreteBuilder.setMessage(message);
		return this;
	}
	
}
