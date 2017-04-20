import apply.Dialog;
import example.ConcreteBuilder;
import example.Director;
import example.Product;

/**
 * @author Created by MadJieJie on 2017/1/24-18:44.
 * @brief
 * @attention
 */
public class Test
{
	
	public static void main(String[] args)
	{
		testExample();
		testApply();
	}
	
	private static void testExample()
	{
		ConcreteBuilder AConcreteBuilder = new ConcreteBuilder();       //set builder.
		Director director = new Director(AConcreteBuilder);         //set director.
		director.setTitleAndMessage("MadJieJie","I like you."); //construct
		Product AProduct = AConcreteBuilder.getProduct();                   //Only have a product can be quote.
		
		ConcreteBuilder BConcreteBuilder = new ConcreteBuilder();       //set builder.
		director = new Director(BConcreteBuilder);
		director.setTitleAndMessage("Rain","We are just friend."); //construct
		Product BProduct = BConcreteBuilder.getProduct();
		
		AProduct.show();
		BProduct.show();
	}
	
	private static void testApply()
	{
		Dialog.Builder builder = new Dialog.Builder();
		builder.setTitle("MadJieJie");
		builder.setMessage("I love you");
		Dialog dialog = builder.create() ;
		dialog.show();
	}
	
}
