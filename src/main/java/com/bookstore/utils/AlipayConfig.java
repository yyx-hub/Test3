package com.bookstore.utils;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/1 19:10
 */
public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102400750413";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCdDTDKPpyO96ojoUOSYF8JLbdoF9CPweATiR3dVbLtXASJm5Yew5wo3axJ8IGK2nF9DhYt+bIE3opaghcVPr0uzx5gBdoVdUhR48m2p23WjE2ciHsh9wpEIklSntOCG6i6W6TMvhF2denRiCVabTkSxN/knuCEcgHQ4T9tEKKaog5zuw5b1+KUCp7OkAw5LGCAoFrVpLF+P8ywVa+cvKZOG4rfOVAmaXY6nw79X7OqjaAQkDMQwUYq++lVxZNSOeOgWVGgA8Fb2XcITQrXwGOcOj3GVhmbd1i2mRQx7in/8mqYd1CooNybmuRb65dVz0keNCsAJeQ72yr6olBxWUHxAgMBAAECggEAPTGmkSdUWWCnKrrrWV2zqh/mFukwmtMwPGxw9o0t6s6v9e5p0BLoBgRZ3XWZBEGZduDGQ6PHeZ48yodl9yE7FcIeU8vz7eiFBWN8dW9HnRGOLDAByno3xdSWPVsljsy4MeUDkcN9imrncH1cEJ/+XRHZK3u8f97sVjduP1D8CsP9O3ObIzf7LgYZEvd+ZbXUxAM4K8pqarZO6HRVHbk8zVvgCeV8CpCP1ViHfGTv7gR5vFu/dl1oO7O46gQ5YWDTBtCdZn7kBkWdtz8ImUXrbq3r1Xz/l670dSZvRAg40SaHcptn02rtUJv0AYivhcVppCvYCwsNwxyL2EZWc8tnAQKBgQDe4bBM3/VGhClpKrrN5Qe/QDLp17jqV529mpFzMONtTrWq4yTEJCZNtvx3OfLiOmjljrPHGMdP/WuWObYHq4Guh5XtQ+mRwBppcS0VtSMKP6jvroTcxmf1CjDckrIjnIR3uMRpZ82/IdZJ2XDLMkxkmWYqB5xe6M1x4gCGlSGAdwKBgQC0Y1tfFvYx0P1ec4vtMZ1Oi+V1p0dN/yrI13+b1to9bDkmLrYr7ZrLGgHnHM3lx4SSE+5ttj5Od7Wm3JIT75mG0xzagQgdl3quqhWxhervnHlMxpDdquOjeM8mg7sYGVSt+F861X0iAvpzt8QXD7uFJP2FO43DawKqc462q8IS1wKBgBCjECHs5cYpv12WTvNnkTh5dlN2QttbRu8MRqcukwtpwK3M3sW1XRaX/ih4LuUsLwBTsp+9/cK+y/UewbO43alFfa+ETj8O8+nDBPaF2uO89MNPZ6ODO+dSp2sPmDSITmsRY7fqg7UstW41yPGiA4nO2Y1xm/6JqixCDn/9Sc7pAoGANo8una4mPJ8HYz/zfIRbHdy2REWaDX82A5UaZZowXA+VoXTTaKnu/asaFDrkE7Gq6TvaC5jpc3ZFnPhtvlXjy6GiwnvwZnLgil+rPAxTKLHdBlmwizsaquDpVq7VMc7Hi+7pbrQPqu/XrJRSXN9HSlgLzfZbRFXjcoaNDbcZdfUCgYEArj900C1hYrXvluw2fEsqre8IiYG5n1G2u6F9PC1wZtecD3uno3P4fH54FR0oKZgxmk3sQ7dq2x4kX9rkR7gZsAOsA2aKtznutSAMKbUsJSnCCverROcuj1BMqClK0edo2zm6eqEf5gYshW33kZnKfSUTPPCuSbx1phmrvc2e640=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnQ0wyj6cjveqI6FDkmBfCS23aBfQj8HgE4kd3VWy7VwEiZuWHsOcKN2sSfCBitpxfQ4WLfmyBN6KWoIXFT69Ls8eYAXaFXVIUePJtqdt1oxNnIh7IfcKRCJJUp7TghuoulukzL4RdnXp0YglWm05EsTf5J7ghHIB0OE/bRCimqIOc7sOW9filAqezpAMOSxggKBa1aSxfj/MsFWvnLymThuK3zlQJml2Op8O/V+zqo2gEJAzEMFGKvvpVcWTUjnjoFlRoAPBW9l3CE0K18BjnDo9xlYZm3dYtpkUMe4p//JqmHdQqKDcm5rkW+uXVc9JHjQrACXkO9sq+qJQcVlB8QIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/bookstore_war_exploded/client/order/paysuccess";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
