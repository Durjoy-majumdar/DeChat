package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C104453c;
import com.google.android.material.internal.VisibilityAwareImageButton;

/* renamed from: com.google.android.material.floatingactionbutton.a */
public class C104451a extends AnimatorListenerAdapter {

    /* renamed from: d */
    public boolean f309389d;

    /* renamed from: e */
    public final /* synthetic */ boolean f309390e;

    /* renamed from: f */
    public final /* synthetic */ C104453c f309391f;

    public C104451a(C104453c cVar, boolean z, C104453c.C104457d dVar) {
        this.f309391f = cVar;
        this.f309390e = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.f309389d = true;
    }

    public void onAnimationEnd(Animator animator) {
        C104453c cVar = this.f309391f;
        cVar.f309401a = 0;
        cVar.f309402b = null;
        if (!this.f309389d) {
            VisibilityAwareImageButton visibilityAwareImageButton = cVar.f309419s;
            boolean z = this.f309390e;
            visibilityAwareImageButton.mo146842b(z ? 8 : 4, z);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f309391f.f309419s.mo146842b(0, this.f309390e);
        C104453c cVar = this.f309391f;
        cVar.f309401a = 1;
        cVar.f309402b = animator;
        this.f309389d = false;
    }
}
