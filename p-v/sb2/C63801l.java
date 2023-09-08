package sb2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p529fv.C59325i;
import p529fv.C59326j;
import p646pn.C110234e;
import p646pn.C62408g;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vv0.C65884b;
import wv0.C78727a;
import xv0.C112181e;

/* renamed from: sb2.l */
public final class C63801l extends UIComponent {

    /* renamed from: d */
    public boolean f180867d;

    /* renamed from: e */
    public boolean f180868e;

    /* renamed from: f */
    public boolean f180869f;

    /* renamed from: g */
    public final C13601g f180870g = C36568h.m40985a(C63802a.f180872d);

    /* renamed from: h */
    public final C13601g f180871h = C36568h.m40985a(C63803b.f180873d);

    /* renamed from: sb2.l$a */
    public static final class C63802a extends C87413o implements C32224a<C62408g> {

        /* renamed from: d */
        public static final C63802a f180872d = new C63802a();

        public C63802a() {
            super(0);
        }

        public Object invoke() {
            C110234e eVar = (C110234e) C86312j.m106911c(C110234e.class);
            if (eVar != null) {
                return eVar.mo161397YJ();
            }
            return null;
        }
    }

    /* renamed from: sb2.l$b */
    public static final class C63803b extends C87413o implements C32224a<C59325i> {

        /* renamed from: d */
        public static final C63803b f180873d = new C63803b();

        public C63803b() {
            super(0);
        }

        public Object invoke() {
            C59326j jVar = (C59326j) C86312j.m106911c(C59326j.class);
            if (jVar != null) {
                return jVar.N30();
            }
            return null;
        }
    }

    /* renamed from: sb2.l$c */
    public static final class C63804c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C63801l f180874d;

        public C63804c(C63801l lVar) {
            this.f180874d = lVar;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            C63801l lVar = this.f180874d;
            lVar.f180868e = false;
            lVar.getActivity().finish();
            this.f180874d.getActivity().overridePendingTransition(0, 0);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C63801l lVar = this.f180874d;
            lVar.f180868e = false;
            lVar.getActivity().finish();
            this.f180874d.getActivity().overridePendingTransition(0, 0);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f180874d.f180868e = true;
        }
    }

    /* renamed from: sb2.l$d */
    public static final class C63805d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C63801l f180875d;

        public C63805d(C63801l lVar) {
            this.f180875d = lVar;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            C63801l lVar = this.f180875d;
            lVar.f180867d = false;
            lVar.mo88592c3();
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C63801l lVar = this.f180875d;
            lVar.f180867d = false;
            lVar.mo88592c3();
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C63801l lVar = this.f180875d;
            lVar.f180867d = true;
            C59325i d3 = lVar.mo88593d3();
            if (d3 != null) {
                d3.mo90537e(true);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63801l(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo88592c3() {
        if (!this.f180869f) {
            C59325i d3 = mo88593d3();
            if (d3 != null) {
                d3.mo64003o();
            }
            this.f180869f = true;
        }
    }

    /* renamed from: d3 */
    public final C59325i mo88593d3() {
        return (C59325i) ((C36570n) this.f180871h).getValue();
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v12, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onBackPressed() {
        /*
            r9 = this;
            boolean r0 = r9.f180868e
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            fv.i r0 = r9.mo88593d3()
            r2 = 0
            if (r0 == 0) goto L_0x0021
            r0.mo84423M(r2)
            boolean r3 = r0.mo90541w()
            if (r3 != 0) goto L_0x001e
            qc0.m r3 = qc0.C101093a.m132480b()
            r0.mo84427y(r3)
            goto L_0x0021
        L_0x001e:
            r0.mo90537e(r2)
        L_0x0021:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0[r2] = r3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0[r1] = r3
            java.lang.String r1 = "MicroMsg.MusicMvFloatBallAnimationUIC"
            java.lang.String r3 = "onBackPressed hideAllFloatBall: %s, needExitAnimation: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            rx3.g r0 = r9.f180870g
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            pn.g r3 = (p646pn.C62408g) r3
            r0 = 0
            if (r3 == 0) goto L_0x0069
            r4 = 0
            androidx.appcompat.app.AppCompatActivity r1 = r9.getActivity()
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r1, r5)
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            com.tencent.mm.ui.MMActivityController r1 = r1.getController()
            if (r1 == 0) goto L_0x0059
            android.view.View r0 = r1.mo177094s()
        L_0x0059:
            r5 = r0
            r6 = 0
            r7 = 0
            sb2.l$c r8 = new sb2.l$c
            r8.<init>(r9)
            boolean r0 = r3.mo87457b(r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0069:
            if (r0 == 0) goto L_0x006f
            boolean r2 = r0.booleanValue()
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63801l.onBackPressed():boolean");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C59325i d3 = mo88593d3();
        if (d3 != null) {
            d3.mo84423M(true);
        }
        if (getActivity() instanceof MMActivity) {
            this.f180867d = true;
            C62408g gVar = (C62408g) ((C36570n) this.f180870g).getValue();
            if (gVar != null) {
                Intent intent = getActivity().getIntent();
                AppCompatActivity activity = getActivity();
                C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                MMActivityController controller = ((MMActivity) activity).getController();
                gVar.mo87456a(intent, controller != null ? controller.mo177094s() : null, (C78727a) null, new C63805d(this));
            }
        }
    }

    public void onPause() {
        super.onPause();
        C59325i d3 = mo88593d3();
        if (d3 != null) {
            d3.mo64001C();
        }
        this.f180869f = false;
    }

    public void onResume() {
        super.onResume();
        if (!this.f180867d) {
            mo88592c3();
        }
        C65884b.m77629a(getActivity(), false);
    }

    public void onStart() {
        C112181e pY;
        super.onStart();
        C59325i d3 = mo88593d3();
        if (d3 != null) {
            d3.onStart();
        }
        Intent intent = getActivity().getIntent();
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("key_enter_from_float_ball", false);
        }
        if (!z && (pY = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY()) != null) {
            pY.mo149144t();
        }
    }

    public void onStop() {
        super.onStop();
        C59325i d3 = mo88593d3();
        if (d3 != null) {
            d3.onStop();
        }
        C112181e pY = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY();
        if (pY != null) {
            pY.mo149130k0();
        }
    }
}
