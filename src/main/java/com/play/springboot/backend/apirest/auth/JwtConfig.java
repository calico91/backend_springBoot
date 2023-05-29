package com.play.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "clave.secreta.123456";
	
	public static final String RSA_PRIVADA = "-----BEGIN PRIVATE KEY-----\r\n"
			+ "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCyHgFObiM98iyo\r\n"
			+ "zBtxZ+unHoiTBOAGGcvuPLGVr5azZNyxqjYZkA+3CTNH1FqOcf7ev+qabvUwqwdY\r\n"
			+ "QbamAqYU2QB2f3AZRXpRgwfTIk/X2XK46XJHnp/+4OIIhAkoKBj6izcsiCwD2PE0\r\n"
			+ "atkTQSS7/E5N2NANgw8rRMWLcZGm4YxfXAi6pXy4klUUMw23BLZrBqbmyVvcnOdq\r\n"
			+ "JWHQVGchXQhtpmJbAcpqHfq4uHqXGg1FDmwLAw0d1O9Ua8Y7jIHc7UMKL2OzRYCi\r\n"
			+ "iCMV64XiobDMOQZlW6k/sihlH/SJondFs6LyJxHYA0WUNQafOdld4kqoVK6XRSpt\r\n"
			+ "nMjl/+rbAgMBAAECggEAFH+m2iuLZhirPRiTBp/VcLFEjy7zcqBLZkqZNsczdR05\r\n"
			+ "gj+QOaw+XWvzTo6eMWCQhXrZeWvQT16PhNUN5oMi2/6xXUct/n/kI4y3PNGTwMf8\r\n"
			+ "ulKGMr81s0lBmjCf4Sg5il61OyxyFwCY7ysQz8oie86osFrbGYL+HuurlHBojnzw\r\n"
			+ "qKHhxnlnVkZAgMtkqVCyR3m4dF/gFP9c47ROa+yCFG9WgfJ2gadiykIfKNQtImqE\r\n"
			+ "x23IJ5MWbbBv6tICe8fccnQ4jP+rk7zoR0svJO05gUNiELD8XuJa5jQrapmCGFYO\r\n"
			+ "5ZO3WFdPDTU1/h8h+zKMExMEgi5Uy+ZR7J+GIJAyQQKBgQDpa3vc7mHmkZlIzuHH\r\n"
			+ "oXocpxMzLM7KZTm/EUAxMbRm4n5GOvOUNb2G2MG7OUpPWuhsjloP9416OElkZj9U\r\n"
			+ "0j0IZR83iemg2dPntQtx7kSyF4PnZPIl/+cKewkfVmOoIQFcksHp1lDhySipk0G/\r\n"
			+ "Ev/7WQCLaV41C3wWgJfZIqfM+wKBgQDDWPsp368WIodz01Jscr6f3n5SSmarJFbi\r\n"
			+ "xpO5tr+oPI8qyRhpVajxVsqLZ47SdRSoVGmt6KaHbpKPMsLUHwAQ0JuVron26dro\r\n"
			+ "IS0Mv6RBdx1ENqXduCWfWU+/XdVs/JwyjMARpkYxiK9CS7J1ZFCzaZKTOmLXGrLr\r\n"
			+ "ewQv4EYzoQKBgBvlFHBarKh5TfA9iQ3qZkV2Uf0TpcLaRgRnc1xtrDl/Z8fM078q\r\n"
			+ "jPPIg550QkUpgA05FdpCo02v3FV7QqZIWbLfItPoT1tBrOlL4YpEB0GhPcoxbh7M\r\n"
			+ "bjf6bCSqlk5JY3hEsZfYXOIewBVD29+RzbWj9USz2uZL8RBfXcY9NgBxAoGAcjlo\r\n"
			+ "e56o8Ud1bpuleXZK0o41zQZmLDJOf8HfhVs/jC8FA96cYJNO+vdl7ce68oK1dowN\r\n"
			+ "UzxTi6NzHTpwQ7pwvmRMZWSulWs+rjcf8XFpqUHuIgHWUOQpU5jUkbBbaKP47XHx\r\n"
			+ "qSBRsQscd6Ztjkj/CzlzFJWyT9bzwc+nrhr00aECgYAdn/btrztrDCWdL+h26aVZ\r\n"
			+ "0lfguCleMLx1PZcE59LLrvGxJtiSnWF/gdpEhLdxMgHSD1uc6UD1NkxfpAO5qbli\r\n"
			+ "8lBH04uts/LS7ic9ptwcvCMlJqpjAYB79hT8r4Bt8z9gX2XCD3nazjuZjQyM3uH6\r\n" 
			+ "Egt2RAbuCnrxHqoTU8THFQ==\r\n"
			+ "-----END PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsh4BTm4jPfIsqMwbcWfr\r\n"
			+ "px6IkwTgBhnL7jyxla+Ws2Tcsao2GZAPtwkzR9RajnH+3r/qmm71MKsHWEG2pgKm\r\n"
			+ "FNkAdn9wGUV6UYMH0yJP19lyuOlyR56f/uDiCIQJKCgY+os3LIgsA9jxNGrZE0Ek\r\n"
			+ "u/xOTdjQDYMPK0TFi3GRpuGMX1wIuqV8uJJVFDMNtwS2awam5slb3JznaiVh0FRn\r\n"
			+ "IV0IbaZiWwHKah36uLh6lxoNRQ5sCwMNHdTvVGvGO4yB3O1DCi9js0WAoogjFeuF\r\n"
			+ "4qGwzDkGZVupP7IoZR/0iaJ3RbOi8icR2ANFlDUGnznZXeJKqFSul0UqbZzI5f/q\r\n" 
			+ "2wIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
