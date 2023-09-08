package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import cj1.C54785k6;
import cl1.C54991o;
import cl1.C54994o1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import il1.C60482p0;
import te3.C49712hj1;
import wg1.C66010g0;
import wg1.C66045m0;
import wg1.C66109y0;
import wg1.C66112z0;

/* renamed from: qj1.x2 */
public final class C63100x2 extends C62660c {

    /* renamed from: p */
    public final C58124b f179060p;

    /* renamed from: q */
    public final String f179061q = "Finder.FinderLiveAnchorSingSongListPlugin";

    /* renamed from: r */
    public C66109y0 f179062r;

    /* renamed from: s */
    public C66112z0 f179063s;

    /* renamed from: qj1.x2$a */
    public static final class C12732a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C63100x2 f36474d;

        public C12732a(C63100x2 x2Var) {
            this.f36474d = x2Var;
        }

        public void onChanged(Object obj) {
            String str = (String) obj;
            String str2 = this.f36474d.f179061q;
            Log.m105924i(str2, "anchor openSongList songName: " + str);
            if (!(str == null || str.length() == 0)) {
                FinderLiveService.f159376d.getClass();
                if (FinderLiveService.f159380h) {
                    this.f36474d.mo10792g(0);
                    C66109y0 y0Var = this.f36474d.f179062r;
                    if (y0Var != null) {
                        ((C66010g0) y0Var).mo90047P0(false);
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63100x2(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f179060p = bVar;
        ((C54994o1) mo87684A0().mo71262a(C54994o1.class)).f154401h.observe(this, new C12732a(this));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h0 */
    public void mo8378h0(boolean z, int i) {
        C60482p0 p0Var;
        C66112z0 z0Var = this.f179063s;
        if (z0Var != null && (p0Var = ((C66045m0) z0Var).f189877J) != null) {
            p0Var.mo85442a(i);
        }
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        if (this.f179062r == null || this.f179063s == null) {
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            this.f179062r = new C66010g0(context, mo87684A0(), this.f179060p, this);
            ViewGroup viewGroup = this.f166287d;
            Context context2 = viewGroup.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f179063s = new C66045m0(viewGroup, (MMActivity) context2, mo87684A0(), this.f179062r);
        }
        C66109y0 y0Var = this.f179062r;
        if (y0Var != null) {
            C66112z0 z0Var = this.f179063s;
            C87412m.m108591d(z0Var);
            y0Var.onAttach(z0Var);
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        LiveBottomSheetPanel liveBottomSheetPanel;
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        C66112z0 z0Var = this.f179063s;
        if (z0Var == null || (liveBottomSheetPanel = ((C66045m0) z0Var).f189895v) == null) {
            return true;
        }
        liveBottomSheetPanel.mo78802a();
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C66109y0 y0Var;
        C66112z0 z0Var;
        C66112z0 z0Var2;
        Class cls = C54994o1.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 27) {
            ((C54994o1) mo87696x0(cls)).f154404n.clear();
            C54785k6 a = ((C54994o1) mo87696x0(cls)).f154399f.mo75658a();
            Integer value = ((C54994o1) mo87696x0(cls)).f154399f.f153478a.getValue();
            if (a != null && value != null && (y0Var = this.f179062r) != null) {
                ((C66010g0) y0Var).mo90045A(a);
            }
        } else if (ordinal == 91) {
            mo10792g(0);
            C66109y0 y0Var2 = this.f179062r;
            if (y0Var2 != null) {
                ((C66010g0) y0Var2).mo90047P0(false);
            }
        } else if (ordinal == 92) {
            mo10792g(8);
            C66109y0 y0Var3 = this.f179062r;
            if (!(y0Var3 == null || (z0Var2 = ((C66010g0) y0Var3).f189774h) == null)) {
                z0Var2.mo90083o();
            }
            C66109y0 y0Var4 = this.f179062r;
            if (y0Var4 != null && (z0Var = ((C66010g0) y0Var4).f189774h) != null) {
                z0Var.mo90075O();
            }
        }
    }
}
