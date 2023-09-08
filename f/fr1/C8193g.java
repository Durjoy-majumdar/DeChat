package fr1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import ke3.C88144b;
import pj3.C47511g;

/* renamed from: fr1.g */
public final class C8193g implements C8195i {

    /* renamed from: a */
    public final String f27110a;

    /* renamed from: b */
    public final C47511g f27111b;

    /* renamed from: c */
    public final Context f27112c;

    /* renamed from: d */
    public final String f27113d = "Finder.PosterCenterPosterGuidePref";

    /* renamed from: e */
    public String f27114e = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fls) + "/touch/scene_product.html?scene_id=kf7428");

    /* renamed from: f */
    public String f27115f = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fls) + "/touch/scene_faq.html?scene_id=kf7467");

    /* renamed from: g */
    public String f27116g = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fls) + "/touch/scene_faq.html?scene_id=kf7468");

    public C8193g(String str, C47511g gVar, Context context) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(gVar, "preferenceScreen");
        C87412m.m108594g(context, "context");
        this.f27110a = str;
        this.f27111b = gVar;
        this.f27112c = context;
    }

    /* renamed from: a */
    public void mo9233a() {
        Intent intent = new Intent();
        String str = LocaleUtil.isSimplifiedChineseAppLang() ? this.f27114e : LocaleUtil.isTraditionalChineseAppLang() ? this.f27115f : C87412m.m108589b(LocaleUtil.getApplicationLanguage(), "en") ? this.f27116g : this.f27116g;
        String str2 = this.f27113d;
        Log.m105924i(str2, "url = " + str);
        intent.putExtra("rawUrl", str);
        C88144b.m109791i(this.f27112c, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.fy0((C58417y0) c, this.f27112c, 4, 1, false, 0, 0, (String) null, 120, (Object) null);
    }

    /* renamed from: b */
    public void mo9234b(boolean z) {
    }

    /* renamed from: c */
    public String mo9235c() {
        return this.f27110a;
    }

    public void onCreate() {
    }

    public void onResume() {
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.fy0((C58417y0) c, this.f27112c, 4, 2, false, 0, 0, (String) null, 120, (Object) null);
    }

    public void onStop() {
    }
}
