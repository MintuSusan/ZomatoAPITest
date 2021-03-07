package main.java.core;

import core.APIMethod;
import core.Environments;

public class APIMethods {
    public static APIMethod GET_ZOMATO_CATEGORIES = new APIMethod(Environments.getZomatoEndPoint(),"categories", main.java.core.HttpMethod.GET);

}
