package sel11.may2;

public class CustomXpath {

	public static void main(String[] args) {
		
		// xpath : address of element in dom
		
		// 1. absolute xpath 
		//    /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
		
		// relative xpath /custom xpath
		// xpath axes : relationshiop : parent, child, siblings
		// function
		
		//  // htmltag[@attribute='value']
		
		//  //input[@id='input-email']
		//  //input[@name='email']
		//   // //input[@placeholder='E-Mail Address']
		
		
		//  //input --- 6 elements
		// 	//input[@id]
		//	//input[@placeholder]
		
		//	//htmltag[@attr1='val1' and @attr2='val2' and @attr3='val3']
		//		//input[@id='input-firstname' and @name='firstname' and @type='text' ]
		//		//input[@id='input-firstname' and @name and @type='text' ]
		//		//input[@id and @name and @type ]
		//		//htmltag[@attr1='val1' or @attr2='val2']
		//		//input[@type='text' or @name='search' or @type='email']
		
		//		//*[@attr='value']
		//		//*[@type='text']	100:3
		//		//input[@type='text']-- 14:3 -- better performance
		
		
		// text() in xpath text functions in xpath
		//  	//htmltag[text()='value']
		//		//h1[text()='Register Account']
		//		//legend[text()='Your Personal Details']
		//		//a[text()='My Account']
		//		//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']
		
		// contains() in xpath
		//		//htmltag[contains(@attr,'value')]
		//		//input[contains(@id,'email')]
		//		//input[contains(@placeholder,'E-Mail')]
		
		
		// 	htmltag[contains(@attr,'value') and @attr2='value']
		//		//input[contains(@type,'text') and @id='input-email']
		
		//		input[contains(@id='input')] -- wrong xpath
		
		//		htmltag[contains(@attr1='val') and contains(@attr2,val)]
		// input[contains(@placeholder='E-Mail Address') and contains(@name='email')]
		
		//dynamic elements with dynamic attributes
		// <input id='firstname_12345'/>
		// <input id='firstname_56788'/>
		// <input id='firstname_76543'/>
		// By.id("firstname_12345")
		//input[contains(@id,'firstname_')]
		
		//contains with text()
		//  //htmltag[contains(text(),'value')]
		//    //h2[contains(text(),'New')]
		//	 //p[contains(text(),'keep track of the orders you have')]
		//	  //a[contains(text(),'Conditions')]
		// //a[contains(text(),'Address') and @class='list-group-item']
		
		
		// starts-with() function for xpath
		// htmltag[starts-with(@attr,'value')]
		//a[starts-with(@id,'firstname_')]
		// //input[starts-with(@placeholder,'E-Mail')]
		//input[starts-with(@placeholder,'E-Mail') and contains(@id,'email')]
		
		
		// starts-with() with text
		// htmltag[starts-with(text(),'value')]
		// //p[starts-with(text(),'By creating an account')]
		
		// browser does not support ends with xpath latest xpath version
		// ends with : not available
		
		// indexing in xpath
		// (//a[text()='Forgotten Password'])[2]
		// (//input[@id])[6]
		
		//position()
		// (//input[@id])[position()=1]
		// (//input[@id])[1]
		
		// last()
		// (//input[@id])[last()-3]
		// (//input[@id])[last()-last()+5]
		// ((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		
		// text with space:
		// //label[normalize-space()='Yes']
		// //label[normalize-space()='No']
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
