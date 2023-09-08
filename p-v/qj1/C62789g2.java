package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import al1.C54130j;
import android.animation.Animator;
import android.os.Bundle;
import cj1.C54795n5;
import cl1.C54963d0;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import il1.C60541x4;
import java.util.ArrayList;
import te3.C49765hx0;
import zc1.C66785b;

/* renamed from: qj1.g2 */
public final class C62789g2 implements FinderLiveApplyLinkAnchorView.C55975c {

    /* renamed from: a */
    public final /* synthetic */ C63068w1 f178234a;

    public C62789g2(C63068w1 w1Var) {
        this.f178234a = w1Var;
    }

    /* renamed from: a */
    public void mo77781a(C54130j jVar) {
        Class cls = C54963d0.class;
        C87412m.m108594g(jVar, "linkUser");
        if (this.f178234a.mo88003Z0()) {
            if (Util.isEqual((Object) ((C54963d0) this.f178234a.mo87696x0(cls)).f154073p, (Object) jVar.f151999c)) {
                C58124b.C7172a.m7372a(this.f178234a.f178987p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null, 2, (Object) null);
                return;
            }
            this.f178234a.mo88004a1();
            ((C54963d0) this.f178234a.mo87696x0(cls)).f154073p = jVar;
            C58124b.C7172a.m7372a(this.f178234a.f178987p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_ACCEPT_PK, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: b */
    public void mo77782b() {
        C58124b.C7172a.m7372a(this.f178234a.f178987p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_CANCEL_BATTLE, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: c */
    public void mo77783c() {
        C63118y3 y3Var = (C63118y3) this.f178234a.mo87687E0(C63118y3.class);
        if (y3Var != null) {
            y3Var.mo88046c1();
        }
    }

    /* renamed from: d */
    public void mo77784d() {
        if (this.f178234a.mo88003Z0()) {
            C60541x4 x4Var = this.f178234a.f178997z;
            ArrayList<C49765hx0> arrayList = x4Var.f172583y;
            if (arrayList == null || arrayList.isEmpty()) {
                x4Var.mo85508c();
            } else {
                x4Var.mo85507b();
            }
            x4Var.f172565d.setVisibility(0);
            x4Var.f172565d.animate().translationX(0.0f).setListener((Animator.AnimatorListener) null).start();
            ((C54108o) C86312j.m106911c(C54108o.class)).Xx0(C54067f0.C54087y.ENTER_INVITE_ANCHOR_LINKMIC_TAB, "", -1, -1);
        }
    }

    /* renamed from: e */
    public void mo77785e() {
        C58124b.C7172a.m7372a(this.f178234a.f178987p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_ACCEPT_BATTLE, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: f */
    public void mo77786f() {
        C58124b.C7172a.m7372a(this.f178234a.f178987p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null, 2, (Object) null);
        this.f178234a.mo88004a1();
    }

    /* renamed from: g */
    public void mo77787g() {
        C58124b.C7172a.m7372a(this.f178234a.f178987p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_APPLY_BATTLE, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: h */
    public void mo77788h() {
        Class cls = C54963d0.class;
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C54067f0 f0Var = C54108o.f151869h;
        ((C54108o) c).Kx0(12, (String) null);
        if (this.f178234a.mo88003Z0()) {
            C63068w1 w1Var = this.f178234a;
            if (w1Var.f178986J || ((C54963d0) w1Var.mo87696x0(cls)).f154078u == 5) {
                String str = this.f178234a.f178988q;
                Log.m105924i(str, "onRandomMatchClick: return, inRandomMatchProcess = " + this.f178234a.f178986J + ", linkMicState = " + ((C54963d0) this.f178234a.mo87696x0(cls)).f154078u);
                return;
            }
            C63068w1 w1Var2 = this.f178234a;
            Class cls2 = C55001u.class;
            Log.m105924i(w1Var2.f178988q, "launchRandomMatch: start");
            w1Var2.f178986J = true;
            C54795n5 D0 = w1Var2.mo14476D0();
            if (D0 != null) {
                D0.mo75709M(((C55001u) w1Var2.mo87684A0().mo71262a(cls2)).f154417n, ((C55001u) w1Var2.mo87684A0().mo71262a(cls2)).f154420q.f182392d, ((C55001u) w1Var2.mo87684A0().mo71262a(cls2)).f154416j, ((C55001u) w1Var2.mo87684A0().mo71262a(cls2)).f154423t, C66785b.f191882e.mo90662O5(), 1, new C63116y1(w1Var2));
            }
        }
    }
}
