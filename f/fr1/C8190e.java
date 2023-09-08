package fr1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C87412m;
import pj3.C47511g;
import rs1.C13442s8;
import zc1.C66785b;

/* renamed from: fr1.e */
public final class C8190e implements C8195i {

    /* renamed from: a */
    public final String f27102a;

    /* renamed from: b */
    public final C47511g f27103b;

    /* renamed from: c */
    public final Context f27104c;

    public C8190e(String str, C47511g gVar, Context context) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(gVar, "preferenceScreen");
        C87412m.m108594g(context, "context");
        this.f27102a = str;
        this.f27103b = gVar;
        this.f27104c = context;
    }

    /* renamed from: a */
    public void mo9233a() {
        Intent intent = new Intent();
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.fy0((C58417y0) c, this.f27104c, 7, 1, false, 0, 0, (String) null, 120, (Object) null);
        C13442s8.f38060Q0.mo12871c(this.f27104c, intent);
        Context context = this.f27104c;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13295yB((MMActivity) context, (Intent) null, true);
    }

    /* renamed from: b */
    public void mo9234b(boolean z) {
        C58969q b = C58961d.f168673a.mo84155b(Util.nullAsNil(C66785b.f191882e.mo90662O5()));
        if (((b != null ? b.field_extFlag : 0) & 131072) > 0) {
            if (z) {
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0.fy0((C58417y0) c, this.f27104c, 7, 2, false, 0, 0, (String) null, 120, (Object) null);
            }
            this.f27103b.mo72529n(this.f27102a, false);
            return;
        }
        this.f27103b.mo72529n(this.f27102a, true);
    }

    /* renamed from: c */
    public String mo9235c() {
        return this.f27102a;
    }

    public void onCreate() {
    }

    public void onResume() {
    }

    public void onStop() {
    }
}
