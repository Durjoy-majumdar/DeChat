package lq1;

import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import je1.C46523h2;
import nq1.C61886a;
import ob0.C47350c;
import pe3.C89349b;
import qq1.C63317a;
import rx3.C13598b0;
import te3.C64236ao1;
import te3.C64887zn1;
import u60.C14121l;

/* renamed from: lq1.q */
public final class C61375q extends C87413o implements C32226l<C14121l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ UniCommentDrawerPresenter f174573d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61375q(UniCommentDrawerPresenter uniCommentDrawerPresenter) {
        super(1);
        this.f174573d = uniCommentDrawerPresenter;
    }

    public Object invoke(Object obj) {
        String str;
        C14121l lVar = (C14121l) obj;
        C87412m.m108594g(lVar, "task");
        StringBuilder sb = new StringBuilder();
        sb.append("loadMoreData before lastBuffer ");
        if (this.f174573d.f161385p == null) {
            str = "null";
        } else {
            C89349b bVar = this.f174573d.f161385p;
            str = MD5Util.getMD5String(bVar != null ? bVar.mo123703f() : null);
        }
        sb.append(str);
        Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", sb.toString());
        C61886a aVar = new C61886a();
        UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f174573d;
        C63317a aVar2 = uniCommentDrawerPresenter.f161380h;
        if (aVar2 != null) {
            String str2 = aVar2.f179669a;
            String str3 = aVar2.f179670b;
            C89349b bVar2 = uniCommentDrawerPresenter.f161385p;
            C87412m.m108594g(str2, "app_name");
            C87412m.m108594g(str3, "entity_id");
            C47350c.C47352b bVar3 = new C47350c.C47352b();
            C64887zn1 zn12 = new C64887zn1();
            zn12.f186746e = str2;
            zn12.f186747f = str3;
            zn12.f186745d = C46523h2.f125330a.mo71859a(6953);
            zn12.f186752n = 2;
            zn12.f186755q = bVar2;
            bVar3.f127066a = zn12;
            bVar3.f127067b = new C64236ao1();
            bVar3.f127068c = "/cgi-bin/micromsg-bin/finderunigetcomment";
            bVar3.f127069d = 6953;
            aVar.mo123453j(bVar3.mo72403a());
            aVar.mo9225i().mo123064p(new C61373o(this.f174573d)).mo123062e(new C61374p(this.f174573d, lVar)).mo11397F(this.f174573d);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("feedObj");
        throw null;
    }
}
