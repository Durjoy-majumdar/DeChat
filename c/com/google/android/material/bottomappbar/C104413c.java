package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

/* renamed from: com.google.android.material.bottomappbar.c */
public class C104413c extends AnimatorListenerAdapter {

    /* renamed from: d */
    public boolean f309153d;

    /* renamed from: e */
    public final /* synthetic */ ActionMenuView f309154e;

    /* renamed from: f */
    public final /* synthetic */ int f309155f;

    /* renamed from: g */
    public final /* synthetic */ boolean f309156g;

    /* renamed from: h */
    public final /* synthetic */ BottomAppBar f309157h;

    public C104413c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f309157h = bottomAppBar;
        this.f309154e = actionMenuView;
        this.f309155f = i;
        this.f309156g = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.f309153d = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f309153d) {
            BottomAppBar bottomAppBar = this.f309157h;
            ActionMenuView actionMenuView = this.f309154e;
            int i = this.f309155f;
            boolean z = this.f309156g;
            int i2 = BottomAppBar.f309135W0;
            bottomAppBar.mo146290z(actionMenuView, i, z);
        }
    }
}
