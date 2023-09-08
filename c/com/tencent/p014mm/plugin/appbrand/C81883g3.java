package com.tencent.p014mm.plugin.appbrand;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import bt0.C79813g;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.g3 */
public final class C81883g3 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ObjectAnimator f240176d;

    /* renamed from: e */
    public final /* synthetic */ C83928t1 f240177e;

    /* renamed from: f */
    public final /* synthetic */ int f240178f;

    /* renamed from: g */
    public final /* synthetic */ int f240179g;

    /* renamed from: h */
    public final /* synthetic */ C81931i3 f240180h;

    /* renamed from: com.tencent.mm.plugin.appbrand.g3$a */
    public static final class C81884a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ObjectAnimator f240181d;

        /* renamed from: e */
        public final /* synthetic */ C83928t1 f240182e;

        /* renamed from: f */
        public final /* synthetic */ int f240183f;

        /* renamed from: g */
        public final /* synthetic */ int f240184g;

        /* renamed from: h */
        public final /* synthetic */ C81931i3 f240185h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81884a(ObjectAnimator objectAnimator, C83928t1 t1Var, int i, int i2, C81931i3 i3Var) {
            super(0);
            this.f240181d = objectAnimator;
            this.f240182e = t1Var;
            this.f240183f = i;
            this.f240184g = i2;
            this.f240185h = i3Var;
        }

        public Object invoke() {
            this.f240181d.cancel();
            C79813g gVar = this.f240182e.f245025i1;
            C87412m.m108591d(gVar);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(gVar.getSecurityTipsTextView(), "textColor", new int[]{this.f240183f, this.f240184g});
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.setDuration(300);
            ofInt.addListener(new C81833f3(ofInt, this.f240185h));
            ofInt.start();
            return C13598b0.f38549a;
        }
    }

    public C81883g3(ObjectAnimator objectAnimator, C83928t1 t1Var, int i, int i2, C81931i3 i3Var) {
        this.f240176d = objectAnimator;
        this.f240177e = t1Var;
        this.f240178f = i;
        this.f240179g = i2;
        this.f240180h = i3Var;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C61926c.m72666K(300, new C81884a(this.f240176d, this.f240177e, this.f240178f, this.f240179g, this.f240180h));
    }
}
