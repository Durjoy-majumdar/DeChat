package pr0;

import com.tencent.p014mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import lp3.C88631d;
import rx3.C13598b0;

/* renamed from: pr0.c */
public final class C12002c<T> implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C32227p<Boolean, WxaShortLinkInfo, C13598b0> f34999a;

    public C12002c(C32227p<? super Boolean, ? super WxaShortLinkInfo, C13598b0> pVar) {
        this.f34999a = pVar;
    }

    /* renamed from: a */
    public final void mo1720a(Object obj) {
        if (obj instanceof Exception) {
            Log.m105920e("MicroMsg.CgiCheckWxaShortLink", "checkAsync exception" + ((Exception) obj).getMessage());
        }
        this.f34999a.invoke(Boolean.FALSE, null);
    }
}
