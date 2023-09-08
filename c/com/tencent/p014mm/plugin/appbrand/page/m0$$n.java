package com.tencent.p014mm.plugin.appbrand.page;

import android.view.animation.Animation;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$n */
public class m0$$n implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ Runnable f244795a;

    /* renamed from: b */
    public final /* synthetic */ C83820i0 f244796b;

    /* renamed from: c */
    public final /* synthetic */ C83849m0 f244797c;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$n$a */
    public class C83851a implements Runnable {
        public C83851a() {
        }

        public void run() {
            if (!m0$$n.this.f244797c.f244736d) {
                m0$$n.this.f244795a.run();
            }
            C83820i0 i0Var = m0$$n.this.f244796b;
            int i = C83849m0.f244729G;
            i0Var.setTag(C0966R.C0970id.f5951t6, (Object) null);
        }
    }

    public m0$$n(C83849m0 m0Var, Runnable runnable, C83820i0 i0Var) {
        this.f244797c = m0Var;
        this.f244795a = runnable;
        this.f244796b = i0Var;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f244795a != null) {
            C83851a aVar = new C83851a();
            if (animation.getStartTime() == Long.MIN_VALUE) {
                aVar.run();
            } else if (!this.f244797c.f244736d) {
                this.f244797c.post(aVar);
            }
        } else {
            C83820i0 i0Var = this.f244796b;
            int i = C83849m0.f244729G;
            i0Var.setTag(C0966R.C0970id.f5951t6, (Object) null);
        }
        this.f244796b.setIsAnimating(false);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
