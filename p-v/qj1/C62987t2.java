package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import cj1.C54768h6;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import d60.C58124b;
import gy3.C87412m;
import j50.C60735a;
import ok1.C62042e;
import rx3.C13604l;
import te3.C49712hj1;
import wg1.C65954a0;
import wg1.C66065o0;
import wg1.C66089v;
import wg1.C66096w;

/* renamed from: qj1.t2 */
public final class C62987t2 extends C62660c {

    /* renamed from: p */
    public final C58124b f178715p;

    /* renamed from: q */
    public C66089v f178716q;

    /* renamed from: r */
    public C66096w f178717r;

    /* renamed from: s */
    public C12657s2 f178718s;

    /* renamed from: t */
    public C12765z2 f178719t;

    /* renamed from: qj1.t2$a */
    public static final class C62988a {

        /* renamed from: a */
        public final int f178720a;

        /* renamed from: b */
        public final int f178721b;

        /* renamed from: c */
        public final int f178722c;

        /* renamed from: d */
        public final long f178723d;

        public C62988a(int i, int i2, int i3, long j) {
            this.f178720a = i;
            this.f178721b = i2;
            this.f178722c = i3;
            this.f178723d = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C62988a)) {
                return false;
            }
            C62988a aVar = (C62988a) obj;
            return this.f178720a == aVar.f178720a && this.f178721b == aVar.f178721b && this.f178722c == aVar.f178722c && this.f178723d == aVar.f178723d;
        }

        public int hashCode() {
            long j = this.f178723d;
            return (((((this.f178720a * 31) + this.f178721b) * 31) + this.f178722c) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "songId:" + this.f178720a + ", playStatus:" + this.f178721b + ", songVolume:" + this.f178722c + ", songOptVersion:" + this.f178723d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62987t2(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178715p = bVar;
        if (C62042e.f176370a.mo87027N0() && ((C54991o) mo87696x0(C54991o.class)).f154301c3) {
            viewGroup.setElevation((float) viewGroup.getContext().getResources().getDimensionPixelSize(C0966R.dimen.adb));
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        if (this.f178716q == null || this.f178717r == null) {
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            this.f178716q = new C65954a0(context, mo87684A0(), this.f178715p, this);
            ViewGroup viewGroup = this.f166287d;
            Context context2 = viewGroup.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f178717r = new C66065o0(viewGroup, (MMActivity) context2, mo87684A0(), this.f178716q);
        }
        C66089v vVar = this.f178716q;
        if (vVar != null) {
            C66096w wVar = this.f178717r;
            C87412m.m108591d(wVar);
            vVar.onAttach(wVar);
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C66089v vVar;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 27) {
            C66089v vVar2 = this.f178716q;
            if (vVar2 != null) {
                ((C65954a0) vVar2).mo90008x0();
                return;
            }
            C60735a c = FinderLiveService.f159376d.mo77627c();
            if (c != null) {
                c.mo85701t0();
            }
        } else if (ordinal == 109) {
            Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("PARAM_FINDER_LIVE_MUSIC_ID")) : null;
            C13604l<C54768h6, Integer> a = ((C54991o) mo87696x0(C54991o.class)).f154232N2.mo75644a(valueOf != null ? valueOf.intValue() : 0);
            C54768h6 h6Var = (C54768h6) a.f38555d;
            if (h6Var != null && (vVar = this.f178716q) != null) {
                ((C65954a0) vVar).mo89994O(h6Var, ((Number) a.f38556e).intValue(), false);
            }
        } else if (ordinal == 87) {
            mo10792g(0);
            C66089v vVar3 = this.f178716q;
            if (vVar3 != null) {
                ((C65954a0) vVar3).mo89996Y();
            }
        } else if (ordinal == 88) {
            mo10792g(8);
            C66089v vVar4 = this.f178716q;
            if (vVar4 != null) {
                ((C65954a0) vVar4).mo90007x();
            }
            if (this.f178718s == null) {
                this.f178718s = (C12657s2) mo87687E0(C12657s2.class);
            }
            C12657s2 s2Var = this.f178718s;
            if (s2Var != null) {
                s2Var.mo12242Z0();
            }
            if (this.f178719t == null) {
                this.f178719t = (C12765z2) mo87687E0(C12765z2.class);
            }
            C12765z2 z2Var = this.f178719t;
            if (z2Var != null) {
                z2Var.mo12305Z0();
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C66089v vVar = this.f178716q;
        if (vVar != null) {
            ((C65954a0) vVar).onDetach();
        }
    }
}
