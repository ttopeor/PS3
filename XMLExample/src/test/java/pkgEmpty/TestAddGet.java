package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgMain.XMLReader;

import pkgLibrary.*;




public class TestAddGet {
	

	@Test
	public void test() throws Exception{
	Catalog cat = XMLReader.ReadCatalog();
	cat.AddBook("bk000");
	Book b = cat.GetBook("bk000");
	assertEquals("bk000",b.getId());
	}

}

