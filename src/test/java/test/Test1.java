package test;

import org.testng.annotations.Test;

public class Test1 extends BaseTest{
    @Test()
    public void testInput(){
        wikipedia.input("IA");
        wikipedia.clickBtnSearch();
    }
}
