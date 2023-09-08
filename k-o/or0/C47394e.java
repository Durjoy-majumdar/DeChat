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

/* renamed from: or0.e */
public final class C47394e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AbsWxaShortLinkLauncher f127156d;

    /* renamed from: e */
    public final /* synthetic */ Activity f127157e;

    /* renamed from: f */
    public final /* synthetic */ WxaShortLinkInfo f127158f;

    /* renamed from: g */
    public final /* synthetic */ String f127159g;

    /* renamed from: h */
    public final /* synthetic */ C32226l<WxaShortLinkLaunchErrorCode, C13598b0> f127160h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47394e(AbsWxaShortLinkLauncher absWxaShortLinkLauncher, Activity activity, WxaShortLinkInfo wxaShortLinkInfo, String str, C32226l<? super WxaShortLinkLaunchErrorCode, C13598b0> lVar) {
        super(0);
        this.f127156d = absWxaShortLinkLauncher;
        this.f127157e = activity;
        this.f127158f = wxaShortLinkInfo;
        this.f127159g = str;
        this.f127160h = lVar;
    }

    public Object invoke() {
        AbsWxaShortLinkLauncher absWxaShortLinkLauncher = this.f127156d;
        Activity activity = this.f127157e;
        WxaShortLinkInfo wxaShortLinkInfo = this.f127158f;
        AbsWxaShortLinkLauncher.WxaShortLinkLaunchParams wxaShortLinkLaunchParams = new AbsWxaShortLinkLauncher.WxaShortLinkLaunchParams(wxaShortLinkInfo.f108862d, wxaShortLinkInfo.f108864f, wxaShortLinkInfo.f108865g, wxaShortLinkInfo.f108866h, this.f127159g, "");
        C32226l<WxaShortLinkLaunchErrorCode, C13598b0> lVar = this.f127160h;
        Pattern pattern = AbsWxaShortLinkLauncher.f108855a;
        absWxaShortLinkLauncher.getClass();
        absWxaShortLinkLauncher.mo63356b(activity, wxaShortLinkLaunchParams, new C47393a(absWxaShortLinkLauncher, activity, wxaShortLinkLaunchParams, lVar));
        return C13598b0.f38549a;
    }
}
