package or0;

import com.tencent.p014mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import gy3.C87412m;

/* renamed from: or0.m */
public final class C47399m implements C47398l {

    /* renamed from: a */
    public static final C47399m f127176a = new C47399m();

    /* renamed from: b */
    public static final LruCache<String, WxaShortLinkInfo> f127177b = new LruCache<>(128);

    /* renamed from: a */
    public void mo72420a(String str, WxaShortLinkInfo wxaShortLinkInfo) {
        C87412m.m108594g(str, "shortLink");
        C87412m.m108594g(wxaShortLinkInfo, "info");
        f127177b.put(str, wxaShortLinkInfo);
    }
}
