package or0;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: or0.a */
public final class C47393a extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AbsWxaShortLinkLauncher f127152d;

    /* renamed from: e */
    public final /* synthetic */ Activity f127153e;

    /* renamed from: f */
    public final /* synthetic */ AbsWxaShortLinkLauncher.WxaShortLinkLaunchParams f127154f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<WxaShortLinkLaunchErrorCode, C13598b0> f127155g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47393a(AbsWxaShortLinkLauncher absWxaShortLinkLauncher, Activity activity, AbsWxaShortLinkLauncher.WxaShortLinkLaunchParams wxaShortLinkLaunchParams, C32226l<? super WxaShortLinkLaunchErrorCode, C13598b0> lVar) {
        super(1);
        this.f127152d = absWxaShortLinkLauncher;
        this.f127153e = activity;
        this.f127154f = wxaShortLinkLaunchParams;
        this.f127155g = lVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.f127152d.mo63357c(this.f127153e, this.f127154f.f108860h, booleanValue);
        C32226l<WxaShortLinkLaunchErrorCode, C13598b0> lVar = this.f127155g;
        if (lVar != null) {
            lVar.invoke(booleanValue ? WxaShortLinkLaunchErrorCode.SUCCESS : WxaShortLinkLaunchErrorCode.LAUNCH_PHASE_FAIL);
        }
        return C13598b0.f38549a;
    }
}
