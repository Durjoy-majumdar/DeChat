package or0;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode;
import com.tencent.p014mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C77389a;
import qo3.C77398g;
import rx3.C13598b0;

/* renamed from: or0.i */
public final class C11729i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WxaShortLinkInfo f34322d;

    /* renamed from: e */
    public final /* synthetic */ Activity f34323e;

    /* renamed from: f */
    public final /* synthetic */ Activity f34324f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f34325g;

    /* renamed from: h */
    public final /* synthetic */ AbsWxaShortLinkLauncher f34326h;

    /* renamed from: i */
    public final /* synthetic */ String f34327i;

    /* renamed from: j */
    public final /* synthetic */ C32226l<WxaShortLinkLaunchErrorCode, C13598b0> f34328j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11729i(WxaShortLinkInfo wxaShortLinkInfo, Activity activity, Activity activity2, C32224a<C13598b0> aVar, AbsWxaShortLinkLauncher absWxaShortLinkLauncher, String str, C32226l<? super WxaShortLinkLaunchErrorCode, C13598b0> lVar) {
        super(0);
        this.f34322d = wxaShortLinkInfo;
        this.f34323e = activity;
        this.f34324f = activity2;
        this.f34325g = aVar;
        this.f34326h = absWxaShortLinkLauncher;
        this.f34327i = str;
        this.f34328j = lVar;
    }

    public Object invoke() {
        String str;
        if (Util.isNullOrNil(this.f34322d.f108867i)) {
            str = this.f34323e.getString(C0966R.string.f7874un);
        } else {
            str = this.f34323e.getString(C0966R.string.f7873um, new Object[]{this.f34322d.f108867i});
        }
        C87412m.m108593f(str, "if (Util.isNullOrNil(inf…lert_mgs, info.nickName))");
        Activity activity = this.f34324f;
        C77389a aVar = new C77389a();
        aVar.f225660q = str;
        aVar.f225668y = false;
        aVar.f225663t = activity.getString(C0966R.string.f7871uk);
        aVar.f225664u = this.f34324f.getString(C0966R.string.f7872ul);
        aVar.f225620C = new C11727g(this.f34325g);
        aVar.f225621D = new C11728h(this.f34326h, this.f34323e, this.f34327i, this.f34328j);
        C77398g gVar = new C77398g(activity, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        return C13598b0.f38549a;
    }
}
