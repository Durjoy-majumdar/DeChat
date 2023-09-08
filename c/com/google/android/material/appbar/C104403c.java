package com.google.android.material.appbar;

import android.view.View;
import p849e3.C107207u;

/* renamed from: com.google.android.material.appbar.c */
public class C104403c {

    /* renamed from: a */
    public final View f309113a;

    /* renamed from: b */
    public int f309114b;

    /* renamed from: c */
    public int f309115c;

    /* renamed from: d */
    public int f309116d;

    public C104403c(View view) {
        this.f309113a = view;
    }

    /* renamed from: a */
    public boolean mo146263a(int i) {
        if (this.f309116d == i) {
            return false;
        }
        this.f309116d = i;
        mo146264b();
        return true;
    }

    /* renamed from: b */
    public final void mo146264b() {
        View view = this.f309113a;
        C107207u.m145166g(view, this.f309116d - (view.getTop() - this.f309114b));
        View view2 = this.f309113a;
        C107207u.m145165f(view2, 0 - (view2.getLeft() - this.f309115c));
    }
}
