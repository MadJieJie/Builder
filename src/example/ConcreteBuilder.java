package example;

/**
 * @author Created by MadJieJie on 2017/4/17-14:01.
 * @brief
 * @attention
 */
public class ConcreteBuilder implements Builder
{
	private Product mProduct = new Product();
	
	@Override
	public void setTitle ( String title )
	{
		mProduct.setTitle(title);
	}
	
	@Override
	public void setMessage ( String message )
	{
		mProduct.setMessage(message);
	}
	
	@Override
	public Product getProduct ()
	{
		return mProduct;
	}
}
