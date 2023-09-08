package com.tencent.p014mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$m */
public class m0$$m extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C83820i0 f244791d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f244792e;

    /* renamed from: f */
    public final /* synthetic */ C83849m0 f244793f;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$m$a */
    public class C83850a implements Runnable {
        public C83850a() {
        }

        public void run() {
            if (!m0$$m.this.f244793f.f244736d) {
                m0$$m.this.f244792e.run();
            }
        }
    }

    public m0$$m(C83849m0 m0Var, C83820i0 i0Var, Runnable runnable) {
        this.f244793f = m0Var;
        this.f244791d = i0Var;
        this.f244792e = runnable;
    }

    public void onAnimationCancel(Animator animator) {
        C83820i0 i0Var = this.f244791d;
        int i = C83849m0.f244729G;
        i0Var.setTag(C0966R.C0970id.f5951t6, (Object) null);
        Runnable runnable = this.f244792e;
        if (runnable != null) {
            this.f244793f.removeCallbacks(runnable);
            if (!this.f244793f.f244736d) {
                this.f244792e.run();
            }
        }
        this.f244791d.setIsAnimating(false);
    }

    public void onAnimationEnd(Animator animator) {
        C83820i0 i0Var = this.f244791d;
        int i = C83849m0.f244729G;
        i0Var.setTag(C0966R.C0970id.f5951t6, (Object) null);
        if (this.f244792e != null) {
            this.f244793f.post(new C83850a());
        }
        this.f244791d.setIsAnimating(false);
    }
}
