package fr1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.newtips.NewTipPreference;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C7879t1;
import f40.C86709a0;
import gy3.C87412m;
import ke3.C88144b;
import lc3.C10485b;
import o40.C61926c;
import pj3.C47511g;
import rs1.C13442s8;
import te3.C51978xi1;
import te3.C64586nn1;
import up1.C37521f;

/* renamed from: fr1.f */
public final class C8191f implements C8195i {

    /* renamed from: a */
    public final String f27105a;

    /* renamed from: b */
    public final C47511g f27106b;

    /* renamed from: c */
    public final Context f27107c;

    /* renamed from: d */
    public String f27108d = "";

    /* renamed from: fr1.f$a */
    public static final class C8192a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C8191f f27109d;

        public C8192a(C8191f fVar) {
            this.f27109d = fVar;
        }

        public void onChanged(Object obj) {
            String str;
            C51978xi1 xi12;
            C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
            Class cls = FinderCommonFeatureService.class;
            C8191f fVar = this.f27109d;
            Preference a = fVar.f27106b.mo72519a(fVar.f27105a);
            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.plugin.newtips.NewTipPreference");
            boolean z = false;
            ((NewTipPreference) a).mo25956f(aVar != null ? aVar.f12908a : false);
            if (aVar != null && aVar.f12908a) {
                z = true;
            }
            if (z) {
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("OriginalEntrance");
                C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("OriginalEntrance");
                if (G5 == null || (xi12 = G5.field_ctrInfo) == null || (str = xi12.f144673h) == null) {
                    str = "";
                }
                if (!C87412m.m108589b(str, this.f27109d.f27108d)) {
                    C8191f fVar2 = this.f27109d;
                    fVar2.f27108d = str;
                    if (G5 != null && R5 != null) {
                        C58413v0 v0Var = C58413v0.f167346a;
                        C13442s8 f = C13442s8.f38060Q0.mo12873f(fVar2.f27107c);
                        C58413v0.m67781i(v0Var, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, G5, R5, 1, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                    }
                }
            }
        }
    }

    public C8191f(String str, C47511g gVar, Context context) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(gVar, "preferenceScreen");
        C87412m.m108594g(context, "context");
        this.f27105a = str;
        this.f27106b = gVar;
        this.f27107c = context;
    }

    /* renamed from: a */
    public void mo9233a() {
        boolean z;
        Class cls = FinderCommonFeatureService.class;
        Preference a = this.f27106b.mo72519a(this.f27105a);
        C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.plugin.newtips.NewTipPreference");
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0 y0Var = (C58417y0) c;
        Context context = this.f27107c;
        View view = ((NewTipPreference) a).f115224L;
        if (view == null) {
            z = false;
        } else {
            z = view.getVisibility() == 0;
        }
        C58417y0.fy0(y0Var, context, 6, 1, z, 0, 0, (String) null, 112, (Object) null);
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("OriginalEntrance");
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("OriginalEntrance");
        if (!(G5 == null || R5 == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f27107c);
            C58413v0.m67781i(v0Var, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, G5, R5, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
        }
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("OriginalEntrance");
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77272l("FinderPosterEntrance", new int[]{1000});
        C37521f.f99374d.getClass();
        String c2 = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderShowOriginalCertificationUrl");
        if (Util.isNullOrNil(c2)) {
            c2 = "https://support.weixin.qq.com/cgi-bin/mmfindersupport-bin/newreadtemplate?t=page/outer_page/original_plan&wechat_real_lang=zh_CN";
        } else {
            C87412m.m108593f(c2, "url");
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", c2);
        C88144b.m109791i(this.f27107c, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: b */
    public void mo9234b(boolean z) {
        this.f27106b.mo72529n(this.f27105a, true);
        if (C7879t1.f26497a.mo8994b()) {
            this.f27106b.mo72529n(this.f27105a, false);
            C2479n0 n0Var = C2479n0.f12955a;
            C54219z<C2479n0.C2480a> zVar = C2479n0.f12966l;
            Context context = this.f27107c;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C61926c.m72695t(zVar, (MMActivity) context, new C8192a(this));
            if (z) {
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0.fy0((C58417y0) c, this.f27107c, 6, 2, false, 0, 0, (String) null, 120, (Object) null);
            }
        }
    }

    /* renamed from: c */
    public String mo9235c() {
        return this.f27105a;
    }

    public void onCreate() {
    }

    public void onResume() {
    }

    public void onStop() {
        this.f27108d = "";
    }
}
