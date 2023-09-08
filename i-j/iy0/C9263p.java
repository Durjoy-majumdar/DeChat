package iy0;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.file.XVFSFile;
import ex0.C45700h;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import z04.C112551y;

/* renamed from: iy0.p */
public final class C9263p {

    /* renamed from: a */
    public static final MMKVSlotManager f29013a;

    /* renamed from: b */
    public static final C13601g f29014b = C36568h.m40985a(C9264a.f29015d);

    /* renamed from: iy0.p$a */
    public static final class C9264a extends C87413o implements C32224a<ArrayList<String>> {

        /* renamed from: d */
        public static final C9264a f29015d = new C9264a();

        public C9264a() {
            super(0);
        }

        public Object invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("channels-aladin.wxqcloud.qq.com");
            arrayList.add("channels.weixin.qq.com");
            Log.m105925i("MicroMsg.WebPrefetcherUrlQueryManager", "hostWhiteList: %s", C110818d0.m150921S(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
            return arrayList;
        }
    }

    /* renamed from: iy0.p$b */
    public static final class C9265b extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C9265b f29016d = new C9265b();

        public C9265b() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("_webview_web_prefetcher_url_query_info");
        }
    }

    static {
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) ((C36570n) C36568h.m40985a(C9265b.f29016d)).getValue();
        C87412m.m108593f(multiProcessMMKV, "kvUrlQuery");
        f29013a = new MMKVSlotManager(multiProcessMMKV, 604800);
    }

    /* renamed from: a */
    public static final String m8906a(String str) {
        try {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            if (host == null) {
                host = "";
            }
            if (!((ArrayList) ((C36570n) f29014b).getValue()).contains(host)) {
                return "";
            }
            String path = parse.getPath();
            if (path == null) {
                path = "";
            }
            boolean z = true;
            if (host.length() > 0) {
                if (path.length() <= 0) {
                    z = false;
                }
                if (z) {
                    return host + XVFSFile.SEPARATOR_CHAR + path;
                }
            }
            return "";
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebPrefetcherUrlQueryManager", e, "getKey exception", new Object[0]);
        }
    }

    /* renamed from: b */
    public static final String m8907b(String str, C45700h.C45702b bVar) {
        String str2 = bVar.f123504a;
        C87412m.m108593f(str2, "info.url");
        boolean z = false;
        if (!C112551y.m153819s(str2, "http", false)) {
            return "";
        }
        if (!(str.length() > 0)) {
            return "";
        }
        List<String> list = bVar.f123514k;
        if (list == null || list.isEmpty()) {
            z = true;
        }
        if (z) {
            return "";
        }
        List<String> list2 = bVar.f123514k;
        C87412m.m108593f(list2, "info.queryList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
        for (String encode : list2) {
            arrayList.add(URLEncoder.encode(encode));
        }
        return C110818d0.m150921S(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
    }

    /* renamed from: c */
    public static final String m8908c(String str, HashMap<String, String> hashMap) {
        String str2;
        C87412m.m108594g(str, "url");
        return (!(hashMap == null || hashMap.isEmpty()) && (str2 = hashMap.get(m8906a(str))) != null) ? str2 : "";
    }
}
