package zo1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.replay.bullet.LiveDanmakuView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.List;
import p001ak.C54053a;
import p001ak.C54057e;
import p006bk.C54484g;
import p464ck.C54869f;
import p848dk.C58297b;
import p848dk.C58306h;
import p871zj.C66846j;
import te3.C51343t41;
import te3.C64674r41;
import uo3.C78253a;
import wo1.C15575n;
import wo1.C15577r;
import wo1.C66154f;
import wo1.C66158l;
import wo1.C66159p;
import wo1.C66160q;
import wo1.C78649o;

/* renamed from: zo1.e */
public final class C66919e implements C66846j.C66848b {

    /* renamed from: a */
    public final /* synthetic */ C66158l f192284a;

    /* renamed from: b */
    public final /* synthetic */ C66917d f192285b;

    public C66919e(C66158l lVar, C66917d dVar) {
        this.f192284a = lVar;
        this.f192285b = dVar;
    }

    /* renamed from: a */
    public void mo84284a(C54053a<?, ?> aVar, C58306h hVar, C58297b bVar) {
        String str;
        View anchorView;
        C87412m.m108594g(aVar, "danmaku");
        C87412m.m108594g(hVar, "touchPoint");
        C87412m.m108594g(bVar, "clickResult");
        float f = hVar.f166951d + (aVar.f151363t / 2.0f);
        float f2 = hVar.f166952e + aVar.f151364u;
        if (f <= 0.0f || f2 <= 0.0f) {
            String str2 = this.f192284a.f190158l;
            Log.m105928w(str2, "danmakuClick: error xOffset=" + f + ", yOffset=" + f2);
            return;
        }
        C66917d dVar = this.f192285b;
        long j = this.f192284a.f190125e;
        dVar.getClass();
        C54057e eVar = aVar instanceof C54057e ? (C54057e) aVar : null;
        if (eVar != null) {
            DATA data = ((C54057e) aVar).f151367x;
            C87412m.m108592e(data, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveMsgProxy");
            C51343t41 t412 = (C51343t41) data;
            String str3 = dVar.f192278r;
            StringBuilder sb = new StringBuilder();
            sb.append("danmakuClick: xOffset=");
            sb.append(f);
            sb.append(", yOffset=");
            sb.append(f2);
            sb.append(", info=[time:");
            C64674r41 r412 = t412.f141953d;
            sb.append(r412 != null ? Integer.valueOf(r412.f185138u) : null);
            sb.append(",nickname:");
            C64674r41 r413 = t412.f141953d;
            sb.append(r413 != null ? r413.f185124d : null);
            sb.append(",content:");
            C64674r41 r414 = t412.f141953d;
            sb.append(r414 != null ? r414.f185126f : null);
            sb.append("}]");
            Log.m105924i(str3, sb.toString());
            C54869f.C54870a aVar2 = eVar.f151373E;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.replay.bullet.ReplayTextDanmakuRender.BulletViewHolder");
            C15577r.C15578a aVar3 = (C15577r.C15578a) aVar2;
            C64674r41 r415 = t412.f141953d;
            if (r415 == null || (str = r415.f185130j) == null) {
                str = "";
            }
            aVar3.mo14337e(true, str, (Object) null);
            aVar.f151366w = true;
            C66154f fVar = dVar.f192281u;
            if (fVar != null) {
                C66846j k = ((C66158l) fVar).mo90203k();
                k.mo90848g(true);
                k.mo90845d();
                C66939o0 o0Var = (C66939o0) dVar.mo87687E0(C66939o0.class);
                if (o0Var != null) {
                    o0Var.f192324s.performClick();
                }
            }
            LiveDanmakuView liveDanmakuView = dVar.f192279s;
            if (liveDanmakuView != null && (anchorView = liveDanmakuView.getAnchorView()) != null) {
                Context context = anchorView.getContext();
                C87412m.m108593f(context, "_anchorView.context");
                C45795b A0 = dVar.mo87684A0();
                C66920f fVar2 = new C66920f(aVar3, t412, aVar, dVar);
                C39423g gVar = new C39423g(dVar);
                C87412m.m108594g(A0, "buContext");
                int[] iArr = new int[2];
                anchorView.getLocationInWindow(iArr);
                int i = (int) (((float) iArr[0]) + f);
                int i2 = (int) (((float) iArr[1]) + f2);
                C15575n nVar = new C15575n(t412, gVar, A0, context);
                C66159p pVar = new C66159p(fVar2);
                if (i > 0 && i2 > 0) {
                    C78253a aVar4 = C66160q.f190160a;
                    if (aVar4 != null) {
                        aVar4.mo108266a();
                    }
                    C78253a aVar5 = new C78253a(anchorView.getContext());
                    aVar5.f229257z = true;
                    aVar5.f229233I = true;
                    aVar5.f229227C = pVar;
                    aVar5.f229235K = C78649o.f230348a;
                    C66160q.f190160a = aVar5;
                    aVar5.f229251t = nVar;
                    aVar5.f229240f = anchorView;
                    if (!(anchorView instanceof TextView) && (i == 0 || i2 == 0)) {
                        aVar5.mo108277l();
                    }
                    aVar5.f229254w.clear();
                    aVar5.f229254w.mo107146h(1, context.getResources().getString(C0966R.string.dxw), C0966R.raw.icons_filled_report_problem, -1);
                    if (i == 0 && i2 == 0) {
                        aVar5.mo70679m();
                    } else {
                        aVar5.mo71743n(i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo84285b(List<C54053a<Object, C54484g>> list) {
    }

    /* renamed from: c */
    public void mo84286c(boolean z) {
    }
}
