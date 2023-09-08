package com.tencent.mapsdk.internal;

import android.net.Uri;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.http.HttpProxy;
import com.tencent.map.tools.net.http.HttpProxyRule;
import com.tencent.map.tools.net.processor.RequestProcessor;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.lt */
public final class C113947lt implements RequestProcessor {

    /* renamed from: a */
    private final List<HttpProxyRule> f340825a;

    /* renamed from: b */
    private final boolean f340826b = false;

    private C113947lt(List<HttpProxyRule> list) {
        this.f340825a = list;
    }

    /* renamed from: a */
    public static C113947lt m157885a(List<HttpProxyRule> list) {
        return new C113947lt(list);
    }

    /* renamed from: b */
    private static C113947lt m157886b(List<HttpProxyRule> list) {
        return m157885a(list);
    }

    public final void onRequest(NetRequest netRequest) {
        HttpProxy httpProxy;
        String str = netRequest.url;
        boolean z = this.f340826b;
        List<HttpProxyRule> list = this.f340825a;
        if (list != null && !list.isEmpty()) {
            String str2 = str;
            boolean z2 = false;
            for (int i = 0; i < this.f340825a.size(); i++) {
                HttpProxyRule httpProxyRule = this.f340825a.get(i);
                if (httpProxyRule.match(str)) {
                    str2 = httpProxyRule.replaceHost(str);
                    z2 = true;
                }
            }
            if (z2) {
                Uri parse = Uri.parse(str2);
                String host = parse.getHost();
                int port = parse.getPort();
                if (port < 0 || port > 65535) {
                    port = C113600ck.f339986i.equals(parse.getScheme()) ? JsApiPauseDownloadTask.CTRL_INDEX : 80;
                }
                httpProxy = new HttpProxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port)), str2, z);
                netRequest.proxy = httpProxy;
            }
        }
        httpProxy = null;
        netRequest.proxy = httpProxy;
    }

    /* renamed from: a */
    private HttpProxy m157884a(String str, boolean z) {
        List<HttpProxyRule> list = this.f340825a;
        if (list != null && !list.isEmpty()) {
            String str2 = str;
            boolean z2 = false;
            for (int i = 0; i < this.f340825a.size(); i++) {
                HttpProxyRule httpProxyRule = this.f340825a.get(i);
                if (httpProxyRule.match(str)) {
                    str2 = httpProxyRule.replaceHost(str);
                    z2 = true;
                }
            }
            if (z2) {
                Uri parse = Uri.parse(str2);
                String host = parse.getHost();
                int port = parse.getPort();
                if (port < 0 || port > 65535) {
                    port = C113600ck.f339986i.equals(parse.getScheme()) ? JsApiPauseDownloadTask.CTRL_INDEX : 80;
                }
                return new HttpProxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port)), str2, z);
            }
        }
        return null;
    }
}
