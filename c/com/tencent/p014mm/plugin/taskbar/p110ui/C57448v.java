package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.v */
public class C57448v extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f164571d;

    /* renamed from: e */
    public final /* synthetic */ int f164572e;

    /* renamed from: f */
    public final /* synthetic */ View f164573f;

    /* renamed from: g */
    public final /* synthetic */ int f164574g;

    /* renamed from: h */
    public final /* synthetic */ ViewPropertyAnimator f164575h;

    /* renamed from: i */
    public final /* synthetic */ C57440s f164576i;

    public C57448v(C57440s sVar, RecyclerView.C16631z zVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f164576i = sVar;
        this.f164571d = zVar;
        this.f164572e = i;
        this.f164573f = view;
        this.f164574g = i2;
        this.f164575h = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f164572e != 0) {
            this.f164573f.setTranslationX(0.0f);
        }
        if (this.f164574g != 0) {
            this.f164573f.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f164575h.setListener((Animator.AnimatorListener) null);
        this.f164576i.mo91175w(this.f164571d);
        this.f164576i.f164543p.remove(this.f164571d);
        this.f164576i.mo81038D();
    }

    public void onAnimationStart(Animator animator) {
        this.f164576i.mo91178z(this.f164571d);
    }
}
