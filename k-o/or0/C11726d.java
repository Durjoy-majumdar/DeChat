package or0;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode;
import com.tencent.p014mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import qo3.C77389a;
import qo3.C77398g;
import rx3.C13598b0;

/* renamed from: or0.d */
public final class C11726d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Activity f34310d;

    /* renamed from: e */
    public final /* synthetic */ WxaShortLinkInfo f34311e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f34312f;

    /* renamed from: g */
    public final /* synthetic */ AbsWxaShortLinkLauncher f34313g;

    /* renamed from: h */
    public final /* synthetic */ Activity f34314h;

    /* renamed from: i */
    public final /* synthetic */ String f34315i;

    /* renamed from: j */
    public final /* synthetic */ C32226l<WxaShortLinkLaunchErrorCode, C13598b0> f34316j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11726d(Activity activity, WxaShortLinkInfo wxaShortLinkInfo, C32224a<C13598b0> aVar, AbsWxaShortLinkLauncher absWxaShortLinkLauncher, Activity activity2, String str, C32226l<? super WxaShortLinkLaunchErrorCode, C13598b0> lVar) {
        super(0);
        this.f34310d = activity;
        this.f34311e = wxaShortLinkInfo;
        this.f34312f = aVar;
        this.f34313g = absWxaShortLinkLauncher;
        this.f34314h = activity2;
        this.f34315i = str;
        this.f34316j = lVar;
    }

    public Object invoke() {
        Activity activity = this.f34310d;
        C77389a aVar = new C77389a();
        String string = activity.getString(C0966R.string.f7873um);
        C87412m.m108593f(string, "ctx.getString(R.string.a…rt_link_launch_alert_mgs)");
        String format = String.format(string, Arrays.copyOf(new Object[]{this.f34311e.f108867i}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        aVar.f225660q = format;
        aVar.f225668y = false;
        aVar.f225663t = this.f34310d.getString(C0966R.string.f7871uk);
        aVar.f225664u = this.f34310d.getString(C0966R.string.f7872ul);
        aVar.f225620C = new C11724b(this.f34312f);
        aVar.f225621D = new C11725c(this.f34313g, this.f34314h, this.f34315i, this.f34316j);
        C77398g gVar = new C77398g(activity, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        return C13598b0.f38549a;
    }
}
