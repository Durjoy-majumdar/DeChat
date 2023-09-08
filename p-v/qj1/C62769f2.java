package qj1;

import al1.C54130j;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import cj1.C54795n5;
import cl1.C54949c0;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget;
import com.tencent.p014mm.plugin.finder.live.view.C56081l;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import dj1.C45360g;
import gi1.C59463a;
import gi1.C59464c;
import gy3.C87412m;
import nh1.C61741k;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49765hx0;
import te3.C51887ww2;

/* renamed from: qj1.f2 */
public final class C62769f2 implements C56081l.C56084d {

    /* renamed from: a */
    public final /* synthetic */ C63068w1 f178177a;

    public C62769f2(C63068w1 w1Var) {
        this.f178177a = w1Var;
    }

    /* renamed from: a */
    public void mo78176a(C54130j jVar) {
        C87412m.m108594g(jVar, "linkUser");
        String str = this.f178177a.f178988q;
        Log.m105924i(str, "onAcceptItemClick user: " + jVar.f151997a);
        C63068w1 w1Var = this.f178177a;
        String str2 = jVar.f152002f;
        w1Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("PARAM_FINDER_LIVE_MIC_ID", str2);
        w1Var.f178987p.statusChange(C58124b.C58125b.FINDER_LIVE_LINK_MIC_ANCHOR_ACCEPT, bundle);
    }

    /* renamed from: b */
    public void mo78177b() {
    }

    /* renamed from: c */
    public void mo78178c(C54130j jVar) {
        C87412m.m108594g(jVar, "linkUser");
        Bundle bundle = new Bundle();
        C63068w1 w1Var = this.f178177a;
        bundle.putString("PARAM_FINDER_LIVE_MIC_ID", jVar.f152002f);
        w1Var.f178987p.statusChange(C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, bundle);
    }

    /* renamed from: d */
    public void mo78179d() {
        C63068w1 w1Var = this.f178177a;
        Class cls = C54963d0.class;
        w1Var.f166287d.setBackground((Drawable) null);
        w1Var.mo88005b1();
        int i = 1;
        w1Var.f178977A = true;
        C58124b.C58125b bVar = C58124b.C58125b.FINDER_LIVE_MODE_SWITCH;
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", w1Var.f178978B);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", w1Var.f178979C);
        C13598b0 b0Var = C13598b0.f38549a;
        ((FinderLiveMicModeSelectWidget) ((C36570n) w1Var.f178981E).getValue()).mo77590z(bVar, bundle);
        C51887ww2 ww22 = ((C54963d0) w1Var.mo87696x0(cls)).f154048B;
        C59464c value = ((C54963d0) w1Var.mo87696x0(cls)).f154077t.getValue();
        if (ww22 != null && value != null) {
            C59464c cVar = value;
            FinderLiveMicModeSelectWidget finderLiveMicModeSelectWidget = (FinderLiveMicModeSelectWidget) ((C36570n) w1Var.f178981E).getValue();
            finderLiveMicModeSelectWidget.getClass();
            Class cls2 = C54949c0.class;
            if (!((C54991o) finderLiveMicModeSelectWidget.f159315h.mo87696x0(C54991o.class)).f154273W1) {
                C61741k kVar = finderLiveMicModeSelectWidget.f159318n;
                if (kVar != null) {
                    kVar.f175477j.setVisibility(8);
                } else {
                    C87412m.m108603p("uiBinding");
                    throw null;
                }
            } else {
                C61741k kVar2 = finderLiveMicModeSelectWidget.f159318n;
                if (kVar2 != null) {
                    kVar2.f175477j.setVisibility(0);
                } else {
                    C87412m.m108603p("uiBinding");
                    throw null;
                }
            }
            finderLiveMicModeSelectWidget.f159326v = cVar;
            C59463a aVar = (C59463a) C110818d0.m150916N(cVar.f169896a);
            finderLiveMicModeSelectWidget.f159320p = aVar != null ? aVar.mo84561a() : finderLiveMicModeSelectWidget.f159319o;
            int i2 = cVar.f169898c;
            if (i2 == 1) {
                finderLiveMicModeSelectWidget.mo77579B(2, finderLiveMicModeSelectWidget.mo77583s());
                C61741k kVar3 = finderLiveMicModeSelectWidget.f159318n;
                if (kVar3 != null) {
                    kVar3.f175470c.setCheck(true);
                    finderLiveMicModeSelectWidget.f159323s = 0;
                    i = 2;
                } else {
                    C87412m.m108603p("uiBinding");
                    throw null;
                }
            } else if (i2 == 2) {
                finderLiveMicModeSelectWidget.mo77582r();
                finderLiveMicModeSelectWidget.f159323s = 1;
                C61741k kVar4 = finderLiveMicModeSelectWidget.f159318n;
                if (kVar4 != null) {
                    kVar4.f175470c.setCheck(false);
                    i = 3;
                } else {
                    C87412m.m108603p("uiBinding");
                    throw null;
                }
            } else if (i2 != 3) {
                finderLiveMicModeSelectWidget.mo77584t();
                finderLiveMicModeSelectWidget.f159323s = 0;
                C61741k kVar5 = finderLiveMicModeSelectWidget.f159318n;
                if (kVar5 != null) {
                    kVar5.f175470c.setCheck(false);
                } else {
                    C87412m.m108603p("uiBinding");
                    throw null;
                }
            } else {
                finderLiveMicModeSelectWidget.mo77579B(4, finderLiveMicModeSelectWidget.mo77581q());
                finderLiveMicModeSelectWidget.f159323s = 1;
                C61741k kVar6 = finderLiveMicModeSelectWidget.f159318n;
                if (kVar6 != null) {
                    kVar6.f175470c.setCheck(true);
                    i = 4;
                } else {
                    C87412m.m108603p("uiBinding");
                    throw null;
                }
            }
            finderLiveMicModeSelectWidget.f159321q = i;
            finderLiveMicModeSelectWidget.f159322r = i;
            finderLiveMicModeSelectWidget.f159328x = false;
            finderLiveMicModeSelectWidget.mo77578A(finderLiveMicModeSelectWidget.f159315h.mo87684A0());
            C54949c0 c0Var = (C54949c0) finderLiveMicModeSelectWidget.f159315h.mo87696x0(cls2);
            String string = finderLiveMicModeSelectWidget.f28306d.getResources().getString(C0966R.string.f8117l6);
            C61741k kVar7 = finderLiveMicModeSelectWidget.f159318n;
            if (kVar7 != null) {
                kVar7.f175476i.setText(string);
                C54949c0 c0Var2 = (C54949c0) finderLiveMicModeSelectWidget.f159315h.mo87696x0(cls2);
                String string2 = finderLiveMicModeSelectWidget.f28306d.getResources().getString(C0966R.string.f8114l0);
                C61741k kVar8 = finderLiveMicModeSelectWidget.f159318n;
                if (kVar8 != null) {
                    kVar8.f175473f.setText(string2);
                    finderLiveMicModeSelectWidget.mo77586v(false);
                    finderLiveMicModeSelectWidget.mo3431p();
                    return;
                }
                C87412m.m108603p("uiBinding");
                throw null;
            }
            C87412m.m108603p("uiBinding");
            throw null;
        }
    }

    /* renamed from: e */
    public void mo78180e() {
    }

    /* renamed from: f */
    public void mo78181f(C54130j jVar) {
        C54795n5 D0;
        String str = this.f178177a.f178988q;
        Log.m105924i(str, "onCloseInvalidApplyMic " + jVar);
        if (jVar != null && (D0 = this.f178177a.mo14476D0()) != null) {
            D0.mo75700D(1, (C49765hx0) null, jVar.f151997a, jVar.f152002f, (C45360g.C45361a) null);
        }
    }
}
