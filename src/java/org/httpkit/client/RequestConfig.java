package org.httpkit.client;

import org.httpkit.HttpMethod;

import java.net.SocketOption;
import java.util.Map;

public class RequestConfig {
    public static String DEFAULT_USER_AGENT = "http-kit/2.0";

    final int timeout;
    final int keepAlive;
    final Object body;
    final Map<String, Object> headers;
    final HttpMethod method;
    final Map<SocketOption, Object> socketOptions;

    public RequestConfig(HttpMethod method, Map<String, Object> headers, Object body,
                         int timeoutMs, int keepAliveMs, Map<SocketOption, Object> socketOptions) {
        this.timeout = timeoutMs;
        this.keepAlive = keepAliveMs;
        this.headers = headers;
        this.body = body;
        this.method = method;
        this.socketOptions = socketOptions;
    }

    public RequestConfig() { // for easy test only
        this(HttpMethod.GET, null, null, 40000, -1, null);
    }
}
