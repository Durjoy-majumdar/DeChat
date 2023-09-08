package com.tencent.p014mm.plugin.appbrand.jsapi.websocket;

import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83094a;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83103f;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.WcWss;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Timer;
import javax.net.ssl.X509TrustManager;
import sp0.C90272a;
import sp0.C90309m;
import ys0.C91580c;
import ys0.C91581d;
import ys0.C91582e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.c */
public class C83098c implements C83103f {

    /* renamed from: d */
    public String f242889d;

    /* renamed from: e */
    public String f242890e;

    /* renamed from: f */
    public URI f242891f;

    /* renamed from: g */
    public Map<String, String> f242892g;

    /* renamed from: h */
    public ArrayList f242893h = new ArrayList();

    /* renamed from: i */
    public ArrayList f242894i = new ArrayList();

    /* renamed from: j */
    public WssConfig f242895j;

    /* renamed from: n */
    public String f242896n;

    /* renamed from: o */
    public int f242897o = -1;

    /* renamed from: p */
    public Timer f242898p = null;

    /* renamed from: q */
    public ArrayList<String> f242899q;

    /* renamed from: r */
    public C83103f.C83104a f242900r;

    /* renamed from: s */
    public WcWss.C83093a f242901s;

    /* renamed from: t */
    public C83099a f242902t = C83099a.NOT_YET_CONNECTED;

    /* renamed from: u */
    public X509TrustManager f242903u;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.c$a */
    public enum C83099a {
        NOT_YET_CONNECTED,
        OPEN,
        CLOSING,
        CLOSED
    }

    public C83098c(String str, String str2, URI uri, Map<String, String> map, WssConfig wssConfig, ArrayList<String> arrayList, C90272a aVar) {
        this.f242889d = str;
        this.f242890e = str2;
        this.f242891f = uri;
        this.f242892g = map;
        this.f242895j = wssConfig;
        this.f242899q = arrayList;
        this.f242903u = C90309m.m113082q(aVar);
        Map<String, String> map2 = this.f242892g;
        if (map2 == null) {
            Log.m105920e("MicroMsg.AppBrandWcWssSocket", "header is null");
            return;
        }
        for (Map.Entry next : map2.entrySet()) {
            this.f242893h.add(next.getKey());
            this.f242894i.add(next.getValue());
        }
    }

    /* renamed from: e */
    public static C91582e m101919e(C83098c cVar, int i, String[] strArr, String[] strArr2) {
        String str;
        if (i == 1) {
            String path = cVar.f242891f.getPath();
            String query = cVar.f242891f.getQuery();
            if (path == null || path.length() == 0) {
                path = "/";
            }
            if (query != null) {
                path = path + "?" + query;
            }
            int port = cVar.f242891f.getPort();
            if (port == -1) {
                String scheme = cVar.f242891f.getScheme();
                if (scheme.equals("wss")) {
                    port = JsApiPauseDownloadTask.CTRL_INDEX;
                } else if (scheme.equals("ws")) {
                    port = 80;
                } else {
                    Log.m105921e("MicroMsg.AppBrandWcWssSocket", "getPort unkonow scheme:%s", scheme);
                }
            }
            if (port == -1 || port == 80) {
                str = cVar.f242891f.getHost();
            } else {
                str = cVar.f242891f.getHost() + XVFSFile.PATH_SEPARATOR + port;
            }
            C91580c cVar2 = new C91580c();
            if (path == null) {
                Log.m105924i("MicroMsg.AppBrandNetWork.HandshakeImpl1Client", "http resource descriptor must not be null");
            } else {
                cVar2.f262428b = path;
            }
            cVar2.mo125463g("Host", str);
            if (strArr == null || strArr2 == null) {
                Log.m105925i("MicroMsg.AppBrandWcWssSocket", "buildHandshake header args is null type:%s", Integer.valueOf(i));
                Map<String, String> map = cVar.f242892g;
                if (map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        cVar2.mo125463g((String) next.getKey(), (String) next.getValue());
                    }
                    return cVar2;
                }
                Log.m105929w("MicroMsg.AppBrandWcWssSocket", "buildHandshake mHeaders is null type:%s", Integer.valueOf(i));
                return cVar2;
            } else if (strArr.length == strArr2.length) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    cVar2.mo125463g(strArr[i2], strArr2[i2]);
                }
                Log.m105925i("MicroMsg.AppBrandWcWssSocket", "buildHandshake headerKey.length:%s, type:%s", Integer.valueOf(strArr.length), Integer.valueOf(i));
                return cVar2;
            } else {
                Log.m105929w("MicroMsg.AppBrandWcWssSocket", "buildHandshake headerKey != headerValue type:%s", Integer.valueOf(i));
                return cVar2;
            }
        } else {
            cVar.getClass();
            if (i == 2) {
                C91581d dVar = new C91581d();
                if (strArr == null || strArr2 == null) {
                    Log.m105929w("MicroMsg.AppBrandWcWssSocket", "buildHandshake header args is null type:%s", Integer.valueOf(i));
                    return dVar;
                } else if (strArr.length == strArr2.length) {
                    for (int i3 = 0; i3 < strArr.length; i3++) {
                        dVar.mo125463g(strArr[i3], strArr2[i3]);
                    }
                    return dVar;
                } else {
                    Log.m105929w("MicroMsg.AppBrandWcWssSocket", "buildHandshake headerKey != headerValue type:%s", Integer.valueOf(i));
                    return dVar;
                }
            } else {
                Log.m105929w("MicroMsg.AppBrandWcWssSocket", "buildHandshake unknow type:%s", Integer.valueOf(i));
                return null;
            }
        }
    }

    /* renamed from: a */
    public void mo115351a(Timer timer) {
        this.f242898p = timer;
    }

    /* renamed from: b */
    public void mo115352b(String str) {
        Log.m105924i("MicroMsg.AppBrandWcWssSocket", "send text");
        if (this.f242897o < 0) {
            ((C83094a.C83095a) this.f242900r).mo115349a("error socket id");
            return;
        }
        try {
            ByteBuffer wrap = ByteBuffer.wrap(str.getBytes("UTF8"));
            byte[] bArr = new byte[wrap.remaining()];
            wrap.get(bArr);
            WcWss.sendBuffer(this.f242889d, this.f242897o, bArr, true);
        } catch (UnsupportedEncodingException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandWcWssSocket", e, "unsupport encoding UnsupportedEncodingException", new Object[0]);
            ((C83094a.C83095a) this.f242900r).mo115349a("unsupport encoding");
        }
    }

    /* renamed from: c */
    public void mo115353c(ByteBuffer byteBuffer) {
        Log.m105924i("MicroMsg.AppBrandWcWssSocket", "send bytes");
        if (this.f242897o < 0) {
            ((C83094a.C83095a) this.f242900r).mo115349a("error socket id");
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        WcWss.sendBuffer(this.f242889d, this.f242897o, bArr, false);
    }

    public void close() {
        Log.m105924i("MicroMsg.AppBrandWcWssSocket", "close");
        mo115355d("default_close", 1000);
    }

    /* renamed from: d */
    public void mo115355d(String str, int i) {
        Log.m105925i("MicroMsg.AppBrandWcWssSocket", "close reason:%s,code:%s", str, Integer.valueOf(i));
        int i2 = this.f242897o;
        if (i2 < 0) {
            ((C83094a.C83095a) this.f242900r).mo115349a("error socket id");
            return;
        }
        C83099a aVar = this.f242902t;
        C83099a aVar2 = C83099a.CLOSING;
        if (!(aVar == aVar2 || aVar == C83099a.CLOSED)) {
            this.f242902t = aVar2;
        }
        WcWss.closeSocket(this.f242889d, i2, i, str);
    }

    /* renamed from: f */
    public Timer mo115356f() {
        return this.f242898p;
    }

    public String getTaskId() {
        return this.f242896n;
    }

    public boolean isOpen() {
        return this.f242902t == C83099a.OPEN;
    }
}
