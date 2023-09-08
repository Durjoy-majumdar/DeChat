package or0;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode;
import com.tencent.p014mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import java.util.regex.Pattern;
import rx3.C13598b0;

/* renamed from: or0.j */
public final class C47396j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AbsWxaShortLinkLauncher f127166d;

    /* renamed from: e */
    public final /* synthetic */ Activity f127167e;

    /* renamed from: f */
    public final /* synthetic */ WxaShortLinkInfo f127168f;

    /* renamed from: g */
    public final /* synthetic */ String f127169g;

    /* renamed from: h */
    public final /* synthetic */ C32226l<WxaShortLinkLaunchErrorCode, C13598b0> f127170h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47396j(AbsWxaShortLinkLauncher absWxaShortLinkLauncher, Activity activity, WxaShortLinkInfo wxaShortLinkInfo, String str, C32226l<? super WxaShortLinkLaunchErrorCode, C13598b0> lVar) {
        super(0);
        this.f127166d = absWxaShortLinkLauncher;
        this.f127167e = activity;
        this.f127168f = wxaShortLinkInfo;
        this.f127169g = str;
        this.f127170h = lVar;
    }

    public Object invoke() {
        AbsWxaShortLinkLauncher absWxaShortLinkLauncher = this.f127166d;
        Activity activity = this.f127167e;
        WxaShortLinkInfo wxaShortLinkInfo = this.f127168f;
        AbsWxaShortLinkLauncher.WxaShortLinkLaunchParams wxaShortLinkLaunchParams = new AbsWxaShortLinkLauncher.WxaShortLinkLaunchParams(wxaShortLinkInfo.f108862d, wxaShortLinkInfo.f108864f, wxaShortLinkInfo.f108865g, wxaShortLinkInfo.f108866h, this.f127169g, wxaShortLinkInfo.f108868j);
        C32226l<WxaShortLinkLaunchErrorCode, C13598b0> lVar = this.f127170h;
        Pattern pattern = AbsWxaShortLinkLauncher.f108855a;
        absWxaShortLinkLauncher.getClass();
        absWxaShortLinkLauncher.mo63356b(activity, wxaShortLinkLaunchParams, new C47393a(absWxaShortLinkLauncher, activity, wxaShortLinkLaunchParams, lVar));
        return C13598b0.f38549a;
    }
}
