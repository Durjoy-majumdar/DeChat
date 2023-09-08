package qj1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import cj1.C54795n5;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGameInfoView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import gj1.C59468c;
import gy3.C87412m;
import h81.C32735h;
import i70.C87667c;
import p204mr.C61567i;
import p204mr.C61570q;
import p671qy.C63343g;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C51463ty0;

/* renamed from: qj1.x6 */
public final class C63102x6 extends C62660c {

    /* renamed from: p */
    public final FinderLiveGameInfoView f179066p;

    /* renamed from: q */
    public final C58124b f179067q;

    /* renamed from: r */
    public final String f179068r = "MicroMsg.FinderLiveGameInfoPlugin";

    /* renamed from: s */
    public boolean f179069s = true;

    /* renamed from: t */
    public boolean f179070t = true;

    /* renamed from: u */
    public C59468c f179071u;

    /* renamed from: v */
    public View f179072v;

    /* renamed from: w */
    public int f179073w;

    /* renamed from: x */
    public boolean f179074x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63102x6(FinderLiveGameInfoView finderLiveGameInfoView, C58124b bVar) {
        super(finderLiveGameInfoView, bVar, (C49712hj1) null);
        C87412m.m108594g(finderLiveGameInfoView, "gameInfoView");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f179066p = finderLiveGameInfoView;
        this.f179067q = bVar;
    }

    /* renamed from: Z0 */
    public final void mo88032Z0() {
        Class cls = C63343g.class;
        Class cls2 = C54991o.class;
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_show_game_info_view_android, 1);
        if (this.f179070t) {
            this.f179070t = false;
            if (Qe != 1) {
                C115669n.INSTANCE.mo175911u(1740, 0);
                Log.m105926v("FinderLiveGameReporter", "abtest closed");
            }
        }
        if (Qe == 0) {
            mo10792g(8);
            Log.m105920e(this.f179068r, "show_game_info_view is 0, hide gameInfo entrance");
        } else if (mo82893g0()) {
            mo10792g(8);
            Log.m105920e(this.f179068r, "now not support landscape, hide gameInfo entrance");
        } else if (this.f179074x) {
            Log.m105924i(this.f179068r, "paused, return");
        } else {
            C51463ty0 ty02 = ((C54991o) mo87696x0(cls2)).f154179A1;
            if (ty02 == null) {
                mo10792g(8);
                Log.m105920e(this.f179068r, "liveGameData is null");
                C115669n.INSTANCE.mo175911u(1740, 5);
                Log.m105926v("FinderLiveGameReporter", "liveData Empty");
                return;
            }
            Log.m105925i(this.f179068r, "liveGameData visibility:%d", Integer.valueOf(ty02.f142469d));
            this.f179066p.setSurfaceMgr(this.f179071u);
            if (ty02.f142469d == 0) {
                mo10792g(8);
                return;
            }
            if (mo14483f0() != 0) {
                mo10792g(0);
                mo88033a1(true);
                Log.m105924i(this.f179068r, "show game data");
                this.f179066p.setup((C54991o) mo87684A0().mo71262a(cls2));
            }
            FinderLiveGameInfoView finderLiveGameInfoView = this.f179066p;
            finderLiveGameInfoView.getClass();
            C89349b bVar = ty02.f142470e;
            String g = bVar != null ? bVar.mo123704g("UTF-8") : null;
            if (!C87412m.m108589b(finderLiveGameInfoView.f159764n, g) && g != null) {
                finderLiveGameInfoView.f159764n = g;
                finderLiveGameInfoView.mo77940f(g);
            } else if (g == null) {
                Log.m105926v("MicroMsg.FinderLiveGameInfoView", "game data invalid");
            } else {
                Log.m105926v("MicroMsg.FinderLiveGameInfoView", "skip same game data");
            }
            String str = this.f179068r;
            Log.m105918d(str, "firstFrame:" + this.f179069s);
            if (this.f179069s) {
                ((C63343g) C86312j.m106911c(cls)).oo0(((C63343g) C86312j.m106911c(cls)).Xv0());
                this.f179069s = false;
                C115669n.INSTANCE.mo175911u(1740, 10);
                Log.m105926v("FinderLiveGameReporter", "first frame return");
            }
        }
    }

    /* renamed from: a1 */
    public final void mo88033a1(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f179066p.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (z) {
            layoutParams2.bottomMargin = this.f166287d.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3707bz);
            this.f179066p.setSurfaceMgr(this.f179071u);
            this.f179066p.setup((C54991o) mo87684A0().mo71262a(C54991o.class));
        } else {
            layoutParams2.bottomMargin = this.f166287d.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv);
        }
        this.f179066p.setLayoutParams(layoutParams2);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        C51463ty0 ty02 = ((C54991o) mo87696x0(C54991o.class)).f154179A1;
        return !(ty02 != null && ty02.f142469d == 1) || mo82893g0();
    }

    /* renamed from: b1 */
    public final void mo88034b1(int i, View view, int i2) {
        C87412m.m108594g(view, "preview");
        if (!mo82893g0()) {
            ViewGroup.LayoutParams layoutParams = this.f179066p.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (i2 > 0) {
                layoutParams2.topMargin = i + i2;
                this.f179073w = i2;
            } else {
                int i3 = this.f179073w;
                if (i3 > 0) {
                    layoutParams2.topMargin = i3 + i;
                } else {
                    layoutParams2.topMargin = view.getHeight() + i;
                }
            }
            this.f179066p.setLayoutParams(layoutParams2);
            Log.m105925i(this.f179068r, "y:%d, preview.height:%d, topMargin:%d， topMarginPreviewParent:%d, previewHeight:%d", Integer.valueOf(i), Integer.valueOf(view.getHeight()), Integer.valueOf(layoutParams2.topMargin), Integer.valueOf(i), Integer.valueOf(i2));
            if (this.f179072v == null) {
                this.f179072v = view;
            }
            mo87689H0(this.f179066p, this.f179068r);
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C54991o) mo87696x0(C54991o.class)).mo75999e4() || i != 0) {
            super.mo10792g(i);
            return;
        }
        C54795n5 D0 = mo14476D0();
        if (D0 != null) {
            D0.mo75716T(this.f179066p, i);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: r0 */
    public void mo8358r0() {
        C87667c<?, ?>.a aVar;
        Log.m105924i(this.f179068r, "pause");
        C59468c cVar = this.f179066p.f159766p;
        if (!(cVar == null || (aVar = cVar.f169940c) == null)) {
            aVar.mo122102e();
        }
        this.f179074x = true;
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        C87667c<?, ?>.a aVar;
        C59468c cVar = this.f179066p.f159766p;
        if (!(cVar == null || (aVar = cVar.f169940c) == null)) {
            aVar.mo122105h();
        }
        this.f179074x = false;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            View view = this.f179072v;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                mo88034b1(iArr[1], view, 0);
            }
        } else if (ordinal == 118) {
            mo88032Z0();
        } else if (ordinal == 186) {
            mo88033a1(true);
        } else if (ordinal == 187) {
            mo88033a1(false);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        Log.m105924i(this.f179068r, "unMount");
        super.mo3211w0();
        if (!this.f179069s) {
            C61570q qVar = C61570q.GAME_LOAD_STATUS;
            StringBuilder sb = new StringBuilder();
            sb.append("isGameLoad=");
            sb.append(!this.f179069s);
            ((C61567i) C86312j.m106911c(C61567i.class)).mo86501dh(qVar, sb.toString());
        }
        this.f179066p.f159765o = false;
        C59468c cVar = this.f179071u;
        if (cVar != null) {
            cVar.mo84570b();
        }
        this.f179072v = null;
    }
}
