package fr1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Util;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C87412m;
import o40.C61926c;
import pj3.C47511g;
import zc1.C66785b;

/* renamed from: fr1.h */
public final class C8194h implements C8195i {

    /* renamed from: a */
    public final String f27117a;

    /* renamed from: b */
    public final C47511g f27118b;

    /* renamed from: c */
    public final Context f27119c;

    /* renamed from: d */
    public final String f27120d = "PosterCenterSettleToAgencyPref";

    public C8194h(String str, C47511g gVar, Context context) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(gVar, "preferenceScreen");
        C87412m.m108594g(context, "context");
        this.f27117a = str;
        this.f27118b = gVar;
        this.f27119c = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r0 = (r0 = r0.field_agencyCollaborateInfo).f133833d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9233a() {
        /*
            r5 = this;
            fe1.d$b r0 = fe1.C58961d.f168673a
            zc1.b r1 = zc1.C66785b.f191882e
            java.lang.String r1 = r1.mo90662O5()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            fe1.q r0 = r0.mo84155b(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001e
            te3.g4 r0 = r0.field_agencyCollaborateInfo
            if (r0 == 0) goto L_0x001e
            te3.h4 r0 = r0.f133833d
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r0.f134438e
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            java.lang.String r2 = r5.f27120d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "jumpUrl:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "rawUrl"
            r2.putExtra(r3, r0)
            android.content.Context r0 = r5.f27119c
            java.lang.String r3 = "webview"
            java.lang.String r4 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r0, r3, r4, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fr1.C8194h.mo9233a():void");
    }

    /* renamed from: b */
    public void mo9234b(boolean z) {
        C58969q b = C58961d.f168673a.mo84155b(Util.nullAsNil(C66785b.f191882e.mo90662O5()));
        if (C61926c.m72696u((int) (b != null ? b.field_liveSwitchFlag : 0), 1024)) {
            this.f27118b.mo72529n(this.f27117a, false);
        } else {
            this.f27118b.mo72529n(this.f27117a, true);
        }
    }

    /* renamed from: c */
    public String mo9235c() {
        return this.f27117a;
    }

    public void onCreate() {
    }

    public void onResume() {
    }

    public void onStop() {
    }
}
