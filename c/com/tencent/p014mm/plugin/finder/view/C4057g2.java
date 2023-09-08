package com.tencent.p014mm.plugin.finder.view;

import ak1.C0077k0;
import android.content.Context;
import android.view.View;
import bl3.C39818r;
import c30.C104289g;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p204mr.C61568m;
import rs1.C13442s8;
import te3.C49098d51;
import te3.C49712hj1;
import te3.C50523nc3;
import zp3.C23555k;

/* renamed from: com.tencent.mm.plugin.finder.view.g2 */
public final class C4057g2 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C49098d51 f18174a;

    /* renamed from: b */
    public final /* synthetic */ FinderFeedLiveNoticeView f18175b;

    /* renamed from: c */
    public final /* synthetic */ String f18176c;

    public C4057g2(C49098d51 d512, FinderFeedLiveNoticeView finderFeedLiveNoticeView, String str) {
        this.f18174a = d512;
        this.f18175b = finderFeedLiveNoticeView;
        this.f18176c = str;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            C104289g gVar = new C104289g();
            boolean z2 = false;
            gVar.mo145967r("source_type", 0);
            C50523nc3 nc32 = this.f18174a.f132128q;
            gVar.mo145967r("pay_type", Integer.valueOf((nc32 == null || !nc32.f138532d) ? 0 : 1));
            String str = this.f18174a.f132126o;
            if (str != null) {
                if (str.length() > 0) {
                    z2 = true;
                }
            }
            gVar.mo145967r(PatchedFlutterActivity.EXTRA_PAGE_TYPE, z2 ? "get_ticket" : "");
            C39818r rVar = C39818r.f106831a;
            Context context = this.f18175b.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C49712hj1 q3 = ((C13442s8) rVar.mo62444c((MMActivity) context).mo75002a(C13442s8.class)).mo12861q3();
            C7335d c = C86312j.m106911c(C61568m.class);
            C87412m.m108593f(c, "getService(IHellLiveVisitorReoprter::class.java)");
            C61568m mVar = (C61568m) c;
            C0077k0 k0Var = C0077k0.ExposeProfile;
            String str2 = this.f18176c;
            String valueOf = String.valueOf(q3.f134675i);
            String str3 = this.f18174a.f132121g;
            C61568m.C61569a.m72263a(mVar, k0Var, str2, 0, 0, valueOf, (String) null, (Long) null, (String) null, (String) null, str3 == null ? "" : str3, gVar.toString(), this.f18174a.f132122h, (String) null, this.f18175b.f17745h, q3.f134675i, 4576, (Object) null);
        }
    }
}
