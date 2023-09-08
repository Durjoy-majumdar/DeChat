package com.tencent.p014mm.plugin.downloader.api;

import android.net.Uri;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.GetAppIdByUrlEvent;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ld2.C46848g;

/* renamed from: com.tencent.mm.plugin.downloader.api.b */
public class C40910b {

    /* renamed from: a */
    public static final String[] f110049a = {"dlied4.myapp.com", "dlied5.myapp.com"};

    /* renamed from: b */
    public static final Map<String, String> f110050b = new ConcurrentHashMap();

    /* renamed from: com.tencent.mm.plugin.downloader.api.b$a */
    public static class C40911a implements C80916r<IPCString, IPCString> {
        private C40911a() {
        }

        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            String str = null;
            if (iPCString == null) {
                return null;
            }
            String str2 = iPCString.f10315d;
            String str3 = (String) ((ConcurrentHashMap) C40910b.f110050b).get(str2);
            if (Util.isNullOrNil(str3)) {
                GetAppIdByUrlEvent getAppIdByUrlEvent = new GetAppIdByUrlEvent();
                getAppIdByUrlEvent.f107580d.f107582a = str2;
                getAppIdByUrlEvent.publish();
                str3 = getAppIdByUrlEvent.f107581e.f107583a;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                Log.m105924i("MicroMsg.GameDownloadExtension", "getOpenId invoke in main thread");
                C44561j i = C44565l.m48989i(str3, false, false);
                if (i != null && !Util.isNullOrNil(i.field_openId)) {
                    str = i.field_openId;
                }
            } else {
                Log.m105924i("MicroMsg.GameDownloadExtension", "getOpenId invoke in worker thread");
                str = C46848g.Cx0().mo69342c(str3);
            }
            return new IPCString(str);
        }
    }

    /* renamed from: a */
    public static String m44268a(String str) {
        String str2 = "";
        String host = Util.isNullOrNil(str) ? str2 : Uri.parse(str).getHost();
        if (Util.isNullOrNil(host) || !Arrays.asList(f110049a).contains(host)) {
            Log.m105924i("MicroMsg.GameDownloadExtension", "domain is not dlied4/dlied5");
            return str;
        }
        IPCString iPCString = (IPCString) C80907o.m98783f(MainProcessIPCService.f108404e, new IPCString(str), C40911a.class);
        if (iPCString != null) {
            str2 = iPCString.f10315d;
        }
        String b = m44269b(m44269b(str, String.format("openid=%s", new Object[]{str2})), "p=wechat");
        Log.m105925i("MicroMsg.GameDownloadExtension", "after openid added, url: %s", b);
        return b;
    }

    /* renamed from: b */
    public static String m44269b(String str, String str2) {
        try {
            URI uri = new URI(str);
            String query = uri.getQuery();
            if (query != null) {
                str2 = query + "&" + str2;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
        } catch (URISyntaxException unused) {
            return str;
        }
    }

    /* renamed from: c */
    public static synchronized void m44270c(String str, String... strArr) {
        synchronized (C40910b.class) {
            if (!Util.isNullOrNil(str) && strArr != null) {
                for (int i = 0; i < strArr.length; i++) {
                    if (!Util.isNullOrNil(strArr[i])) {
                        ((ConcurrentHashMap) f110050b).put(strArr[i], str);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public static synchronized void m44271d(String... strArr) {
        synchronized (C40910b.class) {
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i++) {
                    if (!Util.isNullOrNil(strArr[i])) {
                        ((ConcurrentHashMap) f110050b).remove(strArr[i]);
                    }
                }
            }
        }
    }
}
