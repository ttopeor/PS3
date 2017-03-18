package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgMain.XMLReader;

import pkgLibrary.*;

public class TestGetAdd {
		

		@Test
		public void test1() throws Exception{
			Catalog cat = XMLReader.ReadCatalog();
			cat.AddBook("bk000");
			Book b = cat.GetBook("bk000");
			assertEquals("bk000",b.getId());
		}
		
		@Test
		
		public void test2() throws Exception{
			Catalog cat = XMLReader.ReadCatalog();
			Book b = cat.GetBook("bk101");
			assertEquals("bk101",b.getId());
		}
		
		@Test
		public void test3() throws Exception {
			Book b = new Book("bk999");
			Catalog cat = new Catalog();
			cat = XMLReader.ReadCatalog();
			cat.AddBook(b.getId());
		
		}
		

 }
