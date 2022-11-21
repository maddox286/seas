package cn.markxx.exception;

import cn.markxx.enums.StatusCode;

/**
 * 自定义的API异常
 *
 * @author maddox
 * @date 2021/05/08
 */
public class ApiException extends RuntimeException {
    private final int code;
    private final String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    /**
     * 手动设置异常
     *
     * @param statusCode Http 异常码
     */
    public ApiException(StatusCode statusCode) {
        super((String) null);
        // 状态码
        this.code = statusCode.getCode();
        // 状态码配套的msg
        this.msg = statusCode.getMsg();
    }

    /**
     * 手动设置异常 自定义
     *
     * @param statusCode 实现StatusCode接口的枚举类
     * @param message    自定义信息
     */
    public ApiException(StatusCode statusCode, String message) {
        // message用于用户设置抛出错误详情，例如：当前价格-5，小于0
        super(message);
        // 状态码
        this.code = statusCode.getCode();
        // 状态码配套的msg
        this.msg = statusCode.getMsg();
    }

    /**
     * 默认异常使用APP_ERROR状态码
     *
     * @param message 在自定义信息
     */
    public ApiException(String message) {
        super(message);
        this.code = 400;
        this.msg = "Bad Request";
    }

    /**
     * 自定义格式的异常 默认不附带data信息
     *
     * @param code 错误码
     * @param msg  错误细节
     */
    public ApiException(int code, String msg) {
        super((String) null);
        // 状态码
        this.code = code;
        // 状态码配套的msg
        this.msg = msg;
    }
}
