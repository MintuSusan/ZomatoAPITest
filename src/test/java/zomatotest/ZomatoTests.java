package zomatotest;

import org.testng.annotations.Test;
import zomatolibrary.BaseLibrary;

public class ZomatoTests extends  BaseLibrary{
    BaseLibrary lib = new BaseLibrary();
    @Test
    public void TC001() throws  Exception {
        getRestaurantCategories();


    }

}
