package g52;

import com.tencent.mars.cdn.CronetLogic;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g52.b */
public enum C87160b {
    ;

    /* renamed from: g52.b$a */
    public enum C87161a {
        None("none"),
        Mobile_2g("2g"),
        Mobile_3g("3g"),
        Mobile_4g("4g"),
        Mobile_5g("5g"),
        Wifi("wifi"),
        Unknown("unknown");
        

        /* renamed from: d */
        public final String f252779d;

        /* access modifiers changed from: public */
        C87161a(String str) {
            this.f252779d = str;
        }
    }

    /* renamed from: a */
    public static synchronized Map<String, Object> m108191a(CronetLogic.WebPageProfile webPageProfile) {
        HashMap hashMap;
        synchronized (C87160b.class) {
            hashMap = new HashMap();
            if (webPageProfile != null) {
                hashMap.put("redirectStart", Long.valueOf(webPageProfile.redirectStart));
                hashMap.put("redirectEnd", Long.valueOf(webPageProfile.redirectEnd));
                hashMap.put("fetchStart", Long.valueOf(webPageProfile.fetchStart));
                hashMap.put("domainLookUpStart", Long.valueOf(webPageProfile.domainLookUpStart));
                hashMap.put("domainLookUpEnd", Long.valueOf(webPageProfile.domainLookUpEnd));
                hashMap.put("connectStart", Long.valueOf(webPageProfile.connectStart));
                hashMap.put("connectEnd", Long.valueOf(webPageProfile.connectEnd));
                hashMap.put("SSLconnectionStart", Long.valueOf(webPageProfile.SSLconnectionStart));
                hashMap.put("SSLconnectionEnd", Long.valueOf(webPageProfile.SSLconnectionEnd));
                hashMap.put("requestStart", Long.valueOf(webPageProfile.requestStart));
                hashMap.put("requestEnd", Long.valueOf(webPageProfile.requestEnd));
                hashMap.put("responseStart", Long.valueOf(webPageProfile.responseStart));
                hashMap.put("responseEnd", Long.valueOf(webPageProfile.responseEnd));
                hashMap.put("rtt", Integer.valueOf(webPageProfile.rtt));
                hashMap.put("estimate_nettype", Integer.valueOf(webPageProfile.networkTypeEstimate));
                hashMap.put("httpRttEstimate", Integer.valueOf(webPageProfile.httpRttEstimate));
                hashMap.put("transportRttEstimate", Integer.valueOf(webPageProfile.transportRttEstimate));
                hashMap.put("downstreamThroughputKbpsEstimate", Integer.valueOf(webPageProfile.downstreamThroughputKbpsEstimate));
                hashMap.put("throughputKbps", Integer.valueOf(webPageProfile.throughputKbps));
                hashMap.put("peerIP", webPageProfile.peerIP);
                hashMap.put("port", Integer.valueOf(webPageProfile.port));
                hashMap.put("protocol", webPageProfile.protocol);
                hashMap.put("socketReused", Boolean.valueOf(webPageProfile.socketReused));
                hashMap.put("sendBytesCount", Long.valueOf(webPageProfile.sendBytesCount));
                hashMap.put("receivedBytedCount", Long.valueOf(webPageProfile.receivedBytedCount));
            }
        }
        return hashMap;
    }
}
