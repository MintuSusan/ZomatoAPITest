package core;

public interface EndPoint {

    String getRestMethodPath();
    String getHostUrl();
     main.java.core.HttpMethod getRestHttpMethodType();
    ParametersType getRestParametersType();

}
