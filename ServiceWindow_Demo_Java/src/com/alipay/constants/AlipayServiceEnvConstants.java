

/**

 * Alipay.com Inc.

 * Copyright (c) 2004-2014 All Rights Reserved.

 */

package com.alipay.constants;


/**
 * 支付宝服务窗环境常量（demo中常量只是参考，需要修改成自己的常量值）
 * 
 * @author taixu.zqq
 * @version $Id: AlipayServiceConstants.java, v 0.1 2014年7月24日 下午4:33:49 taixu.zqq Exp $
 */
public class AlipayServiceEnvConstants {

    /**支付宝公钥-从支付宝生活号详情页面获取*/
	public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1sexgWdpRAmose9pHBT/eieX0Oj3ksrVu6ep5eqqi/GPH5wmryRafjD4xoc7RiV58wbp7to34Z4QnZUMWvsBAL2H9JmLbOE8Tv5VnbHF0hGn4kwZwLnXfF7yFV1E9vB5/3qAs1IgZxFFUTn4/OSVDZq3TaS7jdaO3s2AgoAzRdIObkXA5I0zwDB5oyl+ndY24IZaAJy0UTRqCA3qtZRzrBcvWzbupJ1ho1AoVrfeEfhIVrYYbIwqr7CzjsYWV+a8PQZN897xERm6wcNjRHhwSn9ALNr3NZ3kbinVvgSL1MgmZKk2XUHU5ausxxg18uFZYxjQLk0v8I0vDloZrXX5BwIDAQAB";
    
    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET      = "GBK";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET           = "GBK";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE         = "RSA2";
    
    /**开发者账号PID*/
    public static final String PARTNER           = "";

    /** 服务窗appId  */
    //TODO !!!! 注：该appId必须设为开发者自己的生活号id  
    public static final String APP_ID            = "2021001192693791";

    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患 
    public static final String PRIVATE_KEY       = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDWx7GBZ2lECaix72kcFP96J5fQ6PeSytW7p6nl6qqL8Y8fnCavJFp+MPjGhztGJXnzBunu2jfhnhCdlQxa+wEAvYf0mYts4TxO/lWdscXSEafiTBnAudd8XvIVXUT28Hn/eoCzUiBnEUVROfj85JUNmrdNpLuN1o7ezYCCgDNF0g5uRcDkjTPAMHmjKX6d1jbghloAnLRRNGoIDeq1lHOsFy9bNu6knWGjUChWt94R+EhWthhsjCqvsLOOxhZX5rw9Bk3z3vERGbrBw2NEeHBKf0As2vc1neRuKdW+BIvUyCZkqTZdQdTlq6zHGDXy4VljGNAuTS/wjS8OWhmtdfkHAgMBAAECggEBAM4hpZieWQb1hjQPo/9Rn8frC+dyT3lQtkR9q69/wuLAmS4rPW1GJJuMAJb43sh520qFTirwwEUG4Md8bvk6gUHmpP76BjgfCzR9IEpSfZsZWtjzVJwFQGya6xfaBgBB17R8K9zuay7AApjsXKzJ7Mu7u0UHXwHH9CKddELLK2pLZmSqFYQU2lWKbcU365nYBAAyZUctGCMjfk+wVtFnbbpSAC912+62BOSFuZHjEDkAmnoYjF8av87rVOeJcFqzrEVkgF9/BA7vd5eUHTAFeTgNJ3AuaIM1meItTx4h7hMmSkvk4SnXnoBgdKLAamasymXFQ7jJ+N3zgNGd2wNXdUECgYEA+1PIGGu7sf8QZl4uudDCH6og7ZUmzcoj8PUrhafysAW3n4auQWjcWhEN3F07LFxVGSmp6RAU+i6sBqLCdi5mbby1l/9kL3uQDWz+ZkBXlSAGmp7fPDx9krhkiXYf22//Yqo8yi1eTk/VMvcjcezrXnupvsMxMbaRCKED3JtJjPcCgYEA2sX2Ibw71PxoMRiwsJ9hk9h9WX7hp5Y/TCKf8cw3bs5VnuIxYlEyBlkczYTJgRq14mUlOvqG1tuSrFcnUhjtfq2zoYgFwFSrt5NJgdBvhIH10e//6V2ROAMv2wdtVk1WzfWrxfAEksmUtyjqajVbLrCBYq5yLrnVNmr/djwHQHECgYEAtB0D3nR+y/5GS4adp+7y3+x1sq5cY8jE3y9k5GFLLFi8kqfbg+bZW/ay30U1XgJBvkm8idlLn0wJXqwP/tAb+fLulSKjMuAziVueKbtcyPNtqCvJQgr710UsT9MG26U0+gmUjTPcTPUrjl3M2h13RHwNVzfdronvAKcb9GKZYFsCgYBtpTW8pqieEHrv0F4Nx3OSM7hvOEZEResnb1sWRrGpmUQUQ21YxzT5NYRYBKsxR3/NHcBRFOqrmJSkR3HvlYrCKLCUzqWDRWxirzDyHNMnaDMZqt1pynlTx1Uew1QrIsvUocIbjDXek6UzPxBtdpxihBf0q1WS0ZRol6u9SEyiIQKBgQDOgUmuP4rXMjC08FtvyJJs9JW0TI+HsI4wSie50Ee0RUROPv4yMagzk+JoZhwyapoJPuyDMtYdiGg0NQrRr1/CeCkiMCO5NFIHW4GGx2NwB7y94ID9HV/qgzomIVVjN4bQ+nQJ80NI8OiHpnS825DCgza7IVycNgXbTXHN1aRa2Q==";
    
    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1sexgWdpRAmose9pHBT/eieX0Oj3ksrVu6ep5eqqi/GPH5wmryRafjD4xoc7RiV58wbp7to34Z4QnZUMWvsBAL2H9JmLbOE8Tv5VnbHF0hGn4kwZwLnXfF7yFV1E9vB5/3qAs1IgZxFFUTn4/OSVDZq3TaS7jdaO3s2AgoAzRdIObkXA5I0zwDB5oyl+ndY24IZaAJy0UTRqCA3qtZRzrBcvWzbupJ1ho1AoVrfeEfhIVrYYbIwqr7CzjsYWV+a8PQZN897xERm6wcNjRHhwSn9ALNr3NZ3kbinVvgSL1MgmZKk2XUHU5ausxxg18uFZYxjQLk0v8I0vDloZrXX5BwIDAQAB";
    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";

}