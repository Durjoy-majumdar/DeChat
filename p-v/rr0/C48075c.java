package rr0;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import p170ic.C87687a;
import rx3.C13598b0;

/* renamed from: rr0.c */
public final class C48075c extends C87413o implements C32226l<MMActivity, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f128923d;

    /* renamed from: e */
    public final /* synthetic */ WxaExposedParams f128924e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48075c(String str, WxaExposedParams wxaExposedParams) {
        super(1);
        this.f128923d = str;
        this.f128924e = wxaExposedParams;
    }

    public Object invoke(Object obj) {
        MMActivity mMActivity = (MMActivity) obj;
        C87412m.m108594g(mMActivity, LocaleUtil.ITALIAN);
        mMActivity.mmSetOnActivityResultCallback(new C48074b(this.f128923d, mMActivity));
        Intent intent = new Intent();
        WxaExposedParams wxaExposedParams = this.f128924e;
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, mMActivity.getString(C0966R.string.f7820sm));
        intent.putExtra("rawUrl", C83727p2.m102772b(wxaExposedParams));
        intent.putExtra("forceHideShare", true);
        C13598b0 b0Var = C13598b0.f38549a;
        C88144b.m109796n(mMActivity, "webview", ".ui.tools.WebViewUI", intent, C87687a.m109085a(mMActivity), true);
        mMActivity.overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
        return C13598b0.f38549a;
    }
}
