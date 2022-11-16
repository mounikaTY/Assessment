package DetailValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class validation extends BaseClass
{
	  @Test
		public void verifingDetails() 
		{
		    
		  String IMDB_CountryName = commonpage.GetCountryName(movieName,driver) ;
		  System.out.println(IMDB_CountryName);
		  String IMDB_ReleaseDate = commonpage.GetReleaseDate() ; 
		  System.out.println(IMDB_ReleaseDate);
		
		  String WIKI_CountryName = wikipage.GetCountryName(url1, driver, webdriver);
		  System.out.println(WIKI_CountryName);
		  String WIKI_ReleaseDate = wikipage.GetReleaseDate() ; 
		  System.out.println(WIKI_ReleaseDate);
		  
		  Assert.assertEquals(IMDB_CountryName, WIKI_CountryName);
		  System.out.println("The details present in both wiki and imdb country name is same");
		  if(WIKI_ReleaseDate.contains("17 December 2021") || IMDB_ReleaseDate.contains("December 17 2021"))
		  {
			  System.out.println("The details present in both wiki and imdb release date is same");
		  }
		  else
			  System.out.println("The details present in both wiki and imdb release date is not same");
		  
			  
		  
		 
		  
		}
}
