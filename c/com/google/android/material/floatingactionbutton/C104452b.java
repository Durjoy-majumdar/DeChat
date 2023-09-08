package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C104453c;

/* renamed from: com.google.android.material.floatingactionbutton.b */
public class C104452b extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ boolean f309392d;

    /* renamed from: e */
    public final /* synthetic */ C104453c f309393e;

    public C104452b(C104453c cVar, boolean z, C104453c.C104457d dVar) {
        this.f309393e = cVar;
        this.f309392d = z;
    }

    public void onAnimationEnd(Animator animator) {
        C104453c cVar = this.f309393e;
        cVar.f309401a = 0;
        cVar.f309402b = null;
    }

    public void onAnimationStart(Animator animator) {
        this.f309393e.f309419s.mo146842b(0, this.f309392d);
        C104453c cVar = this.f309393e;
        cVar.f309401a = 2;
        cVar.f309402b = animator;
    }
}
