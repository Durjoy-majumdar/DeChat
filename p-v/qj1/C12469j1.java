package qj1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C0696x;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87412m;
import il1.C9002h2;
import il1.C9118u;
import qo3.C12925w;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C50326ly0;

/* renamed from: qj1.j1 */
public final class C12469j1 extends C62660c {

    /* renamed from: p */
    public final C58124b f35873p;

    /* renamed from: q */
    public final Activity f35874q;

    /* renamed from: r */
    public C9118u f35875r;

    /* renamed from: s */
    public boolean f35876s;

    /* renamed from: qj1.j1$a */
    public /* synthetic */ class C12470a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35877a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[199] = 1;
            f35877a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12469j1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35873p = bVar;
        Context context = viewGroup.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        this.f35874q = activity;
        if (activity.getIntent().getIntExtra("KEY_PARAMS_DO_ACTION", 0) == 2) {
            this.f35876s = true;
        }
    }

    /* renamed from: Z0 */
    public final void mo12127Z0(Bundle bundle) {
        C9002h2 h2Var;
        if (this.f35875r == null) {
            C9118u uVar = new C9118u(this.f35874q, this.f166287d, mo87684A0());
            this.f35875r = uVar;
            uVar.f28732b.mo9935a(this);
            uVar.f28733c.mo9935a(this);
        }
        C9118u uVar2 = this.f35875r;
        C9002h2 h2Var2 = uVar2 != null ? uVar2.f28733c : null;
        boolean z = false;
        if (h2Var2 != null) {
            h2Var2.setFromWish(bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SHOW_FANS_FROM_WISH") : false);
        }
        C50326ly0 ly02 = ((C0696x) mo87696x0(C0696x.class)).f1644g;
        boolean z2 = true;
        if (ly02 == null || !ly02.f137707e) {
            z2 = false;
        }
        if (z2) {
            C9118u uVar3 = this.f35875r;
            if (uVar3 != null) {
                if (bundle != null) {
                    z = bundle.getBoolean("PARAM_FINDER_LIVE_SHOW_FANS_MODIFY");
                }
                uVar3.f28732b.mo9759e((C12925w) null, z);
                return;
            }
            return;
        }
        C9118u uVar4 = this.f35875r;
        if (uVar4 != null && (h2Var = uVar4.f28733c) != null) {
            h2Var.mo9810c();
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b0 */
    public void mo11966b0(int i, int i2, Bundle bundle) {
        C9002h2 h2Var;
        if (((C54991o) mo87696x0(C54991o.class)).mo75999e4() && this.f35876s) {
            Log.m105924i("FinderLiveAnchorFansClubPlugin", "liveState:" + i + ",uiState:" + i2);
            if (this.f35875r == null) {
                C9118u uVar = new C9118u(this.f35874q, this.f166287d, mo87684A0());
                this.f35875r = uVar;
                uVar.f28732b.mo9935a(this);
                uVar.f28733c.mo9935a(this);
            }
            C50326ly0 ly02 = ((C0696x) mo87696x0(C0696x.class)).f1644g;
            if (ly02 != null && ly02.f137707e) {
                C9118u uVar2 = this.f35875r;
                if (uVar2 != null) {
                    uVar2.f28732b.mo9759e((C12925w) null, true);
                }
            } else {
                C9118u uVar3 = this.f35875r;
                if (!(uVar3 == null || (h2Var = uVar3.f28733c) == null)) {
                    h2Var.mo9810c();
                }
            }
            this.f35876s = false;
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h0 */
    public void mo8378h0(boolean z, int i) {
        C9118u uVar = this.f35875r;
        if (uVar != null) {
            uVar.mo9934a(i, z);
        }
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        C9118u uVar = this.f35875r;
        if (uVar != null) {
            uVar.f28732b.mo9935a(this);
            uVar.f28733c.mo9935a(this);
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C12470a.f35877a[bVar.ordinal()] == 1) {
            mo12127Z0(bundle);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C9118u uVar = this.f35875r;
        if (uVar != null) {
            uVar.f28732b.mo9760f();
            C9002h2 h2Var = uVar.f28733c;
            h2Var.f28738f = null;
            h2Var.f28441n = null;
            h2Var.f28444q.setOnVisibilityListener((C32226l<? super Boolean, C13598b0>) null);
        }
    }
}
