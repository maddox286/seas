package cn.markxx.enums;

/**
 * @author maddox
 * @date 2021/05/08
 */
public interface StatusCode {
    /**
     * 获取StatusCode里的状态码
     */
    int getCode();

    /**
     * 获取StatusCode里的Msg
     */
    String getMsg();
}
