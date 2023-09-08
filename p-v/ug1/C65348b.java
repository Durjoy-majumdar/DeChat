package ug1;

import a14.C53872d1;
import a14.C53934p0;
import a14.C53973z1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import cl1.C54951d;
import cl1.C54985m;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import nk1.C11207i;
import org.libpag.PAGView;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C49712hj1;
import wx3.C15601d;

/* renamed from: ug1.b */
public final class C65348b extends C62660c {

    /* renamed from: p */
    public final PAGView f188107p;

    /* renamed from: q */
    public C53973z1 f188108q;

    /* renamed from: ug1.b$a */
    public static final class C65349a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C65348b f188109d;

        public C65349a(C65348b bVar) {
            this.f188109d = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f188109d.f188107p.stop();
            this.f188109d.f188107p.setVisibility(8);
        }
    }

    /* renamed from: ug1.b$b */
    public static final class C65350b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C65348b f188110d;

        public C65350b(C65348b bVar) {
            this.f188110d = bVar;
        }

        public void onChanged(Object obj) {
            C54985m.C54987c cVar = (C54985m.C54987c) obj;
            C13598b0 b0Var = null;
            if (cVar != null) {
                C65348b bVar = this.f188110d;
                if (cVar.f154169b) {
                    bVar.getClass();
                    Log.m105924i("FinderLiveCheerAnimationPlugin", "showCheerAnimation isLandscape: " + bVar.mo82893g0() + " data : " + cVar);
                    C53973z1 z1Var = bVar.f188108q;
                    if (z1Var != null) {
                        C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                    }
                    bVar.f188107p.stop();
                    bVar.f188107p.setProgress(0.0d);
                    bVar.f188108q = C11207i.m11072h(bVar, C53872d1.f151119c, (C53934p0) null, new C65353c(bVar, cVar, (C15601d<? super C65353c>) null), 2, (Object) null);
                } else {
                    bVar.mo89455Z0(true);
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                this.f188110d.mo89455Z0(true);
            }
        }
    }

    /* renamed from: ug1.b$c */
    public static final class C65351c<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C65348b f188111d;

        /* renamed from: ug1.b$c$a */
        public /* synthetic */ class C65352a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f188112a;

            static {
                int[] iArr = new int[C54951d.C54952a.values().length];
                iArr[4] = 1;
                iArr[2] = 2;
                iArr[1] = 3;
                iArr[3] = 4;
                f188112a = iArr;
            }
        }

        public C65351c(C65348b bVar) {
            this.f188111d = bVar;
        }

        public void onChanged(Object obj) {
            C54951d.C54952a aVar = (C54951d.C54952a) obj;
            Log.m105924i("FinderLiveCheerAnimationPlugin", "onVideoPlayStateChange: " + aVar);
            int i = aVar == null ? -1 : C65352a.f188112a[aVar.ordinal()];
            if (i == 1 || i == 2) {
                this.f188111d.f188107p.setAlpha(1.0f);
            } else if (i == 3 || i == 4) {
                this.f188111d.f188107p.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65348b(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        mo10792g(8);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f357696k11);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.cheer_animation_pag)");
        PAGView pAGView = (PAGView) findViewById;
        this.f188107p = pAGView;
        pAGView.setVisibility(8);
    }

    /* renamed from: U0 */
    public void mo12048U0() {
        ((C54985m) mo87696x0(C54985m.class)).f154162j.observe(this, new C65350b(this));
        ((C54951d) mo87696x0(C54951d.class)).f154007o.observe(this, new C65351c(this));
    }

    /* renamed from: Z0 */
    public final void mo89455Z0(boolean z) {
        Log.m105924i("FinderLiveCheerAnimationPlugin", "hideCheerAnimation: " + mo14483f0());
        if (z) {
            if (this.f188107p.getVisibility() == 0) {
                this.f166287d.animate().alpha(0.0f).setDuration(1000).setListener(new C65349a(this)).start();
            } else {
                this.f188107p.stop();
            }
            C54985m mVar = (C54985m) mo87696x0(C54985m.class);
            Log.m105924i("LiveCheerAnimationSlice", "notifyCheerBtnAnimationShow");
            mVar.f154163n.postValue(mVar.f154161i.getValue());
        } else {
            this.f188107p.setVisibility(8);
            this.f188107p.stop();
        }
        C53973z1 z1Var = this.f188108q;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        ((C54985m) mo87696x0(C54985m.class)).f154167r = true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        ((C54985m) mo87696x0(C54985m.class)).f154167r = false;
        mo89455Z0(false);
    }
}
