package or0;

import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager", mo125469f = "WxaShortLinkRiskManager.kt", mo125470l = {54}, mo125471m = "uploadScreenshotToCdnSuspended")
/* renamed from: or0.p */
public final class C11734p extends C66704d {

    /* renamed from: d */
    public Object f34336d;

    /* renamed from: e */
    public Object f34337e;

    /* renamed from: f */
    public /* synthetic */ Object f34338f;

    /* renamed from: g */
    public final /* synthetic */ WxaShortLinkRiskManager f34339g;

    /* renamed from: h */
    public int f34340h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11734p(WxaShortLinkRiskManager wxaShortLinkRiskManager, C15601d<? super C11734p> dVar) {
        super(dVar);
        this.f34339g = wxaShortLinkRiskManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.f34338f = obj;
        this.f34340h |= Integer.MIN_VALUE;
        return WxaShortLinkRiskManager.m1951a(this.f34339g, (C83928t1) null, (String) null, this);
    }
}
