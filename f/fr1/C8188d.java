package fr1;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.newtips.NewTipPreference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import eb0.C31543z5;
import er1.C58684b;
import fe1.C58961d;
import gy3.C87412m;
import o40.C61926c;
import pj3.C47511g;
import rs1.C13442s8;
import te3.C51978xi1;
import te3.C64586nn1;
import tf0.C13883o1;
import zc1.C66785b;

/* renamed from: fr1.d */
public final class C8188d implements C8195i {

    /* renamed from: a */
    public final String f27097a;

    /* renamed from: b */
    public final C47511g f27098b;

    /* renamed from: c */
    public final Context f27099c;

    /* renamed from: d */
    public String f27100d = "";

    /* renamed from: fr1.d$a */
    public static final class C8189a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C8188d f27101d;

        public C8189a(C8188d dVar) {
            this.f27101d = dVar;
        }

        public void onChanged(Object obj) {
            String str;
            C51978xi1 xi12;
            C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
            Class cls = FinderCommonFeatureService.class;
            C8188d dVar = this.f27101d;
            Preference a = dVar.f27098b.mo72519a(dVar.f27097a);
            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.plugin.newtips.NewTipPreference");
            boolean z = false;
            ((NewTipPreference) a).mo25956f(aVar != null ? aVar.f12908a : false);
            if (aVar != null && aVar.f12908a) {
                z = true;
            }
            if (z) {
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderSettingLiveTask");
                C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderSettingLiveTask");
                if (G5 == null || (xi12 = G5.field_ctrInfo) == null || (str = xi12.f144673h) == null) {
                    str = "";
                }
                if (!C87412m.m108589b(str, this.f27101d.f27100d)) {
                    C8188d dVar2 = this.f27101d;
                    dVar2.f27100d = str;
                    if (G5 != null && R5 != null) {
                        C58413v0 v0Var = C58413v0.f167346a;
                        C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                        Context context = dVar2.f27099c;
                        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        C13442s8 f = aVar2.mo12873f((MMActivity) context);
                        C58413v0.m67781i(v0Var, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, G5, R5, 1, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                    }
                }
            }
        }
    }

    public C8188d(String str, C47511g gVar, Context context) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(gVar, "preferenceScreen");
        C87412m.m108594g(context, "context");
        this.f27097a = str;
        this.f27098b = gVar;
        this.f27099c = context;
    }

    /* renamed from: a */
    public void mo9233a() {
        Class cls = FinderCommonFeatureService.class;
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderSettingLiveTask");
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderSettingLiveTask");
        if (!(G5 == null || R5 == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f27099c;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C13442s8 f = aVar.mo12873f((MMActivity) context);
            C58413v0.m67781i(v0Var, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, G5, R5, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
        }
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("FinderSettingLiveTask");
        C7335d c = C86312j.m106911c(C58684b.class);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        ((C13883o1) c).mo13279ch(this.f27099c, (Intent) null, 1, (String) null);
        C115669n.INSTANCE.mo160131h(22748, 1, 2, Long.valueOf(C31543z5.m39453c()), C66785b.f191882e.mo90662O5());
    }

    /* renamed from: b */
    public void mo9234b(boolean z) {
        this.f27098b.mo72529n(this.f27097a, true);
        if (C58961d.f168673a.mo84157d("Entrance_PrimarySetting")) {
            this.f27098b.mo72529n(this.f27097a, false);
            C2479n0 n0Var = C2479n0.f12955a;
            C54219z<C2479n0.C2480a> zVar = C2479n0.f12949F;
            Context context = this.f27099c;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C61926c.m72695t(zVar, (MMActivity) context, new C8189a(this));
            if (z) {
                C115669n.INSTANCE.mo160131h(22748, 1, 1, Long.valueOf(C31543z5.m39453c()), C66785b.f191882e.mo90662O5());
            }
        }
    }

    /* renamed from: c */
    public String mo9235c() {
        return this.f27097a;
    }

    public void onCreate() {
    }

    public void onResume() {
    }

    public void onStop() {
        this.f27100d = "";
    }
}
