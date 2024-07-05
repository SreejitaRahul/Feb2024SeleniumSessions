package sel12.may6;

public class XpathAxes {

	public static void main(String[] args) {
	
		// parent to child:
		// direct child: /
		// direct + indirect child: //
		
		////div[@id='content']//form//input - input elements under form of the div
		
		// //div[@id='content']/div --- direct div-- 1 element
		// //div[@id='content']//div-- direct + indrect div-- 7 elements
		
		// (//div[@class='form-group'])[2]/input
		// (//div[@class='form-group'])[2]/a
		
		// //input[@id='input-email']/../../../../../../../../../..
		// //input[@id='input-email']/..
		// //input[@id='input-email']/parent::div
		
		
		//  //option[@value='Albania']/parent::select
		// 	//option[@value='Albania']/parent::select/parent::div
		// 	//input[@id='input-email']/ancestor::form
		//  //input[@id='input-email']/ancestor::div ---immediate grandparent and all related grandparents
		
		//  https://selectorshub.com/xpath-practice-page/
		//  //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		// 	//a[text()='Joe.Root']/ancestor::tr/td/input[@type='checkbox']
		//	//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		
		
		// https://classic.freecrm.com/index.cfm?CFID=2218264&CFTOKEN=87004be8e618e3de-F562DE82-E427-6D92-CD372C05D16F0F17&jsessionid=b630a088771d6b6954981c54b622d2c62114
		// //a[text()='Mustafa Hanif']/parent::td/preceding-sibling::td/child::input[@type='checkbox']
		
		// //a[text()='Naseema shaik']/parent::td/following-sibling::td/a[@context='company']
		
		
		
		
		
		
		
	}

}
