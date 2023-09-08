package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: d */
    public C104403c f309107d;

    /* renamed from: e */
    public int f309108e = 0;

    public ViewOffsetBehavior() {
    }

    /* renamed from: f */
    public boolean mo94960f(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo146256x(coordinatorLayout, v, i);
        if (this.f309107d == null) {
            this.f309107d = new C104403c(v);
        }
        C104403c cVar = this.f309107d;
        cVar.f309114b = cVar.f309113a.getTop();
        cVar.f309115c = cVar.f309113a.getLeft();
        cVar.mo146264b();
        int i2 = this.f309108e;
        if (i2 == 0) {
            return true;
        }
        this.f309107d.mo146263a(i2);
        this.f309108e = 0;
        return true;
    }

    /* renamed from: w */
    public int mo146259w() {
        C104403c cVar = this.f309107d;
        if (cVar != null) {
            return cVar.f309116d;
        }
        return 0;
    }

    /* renamed from: x */
    public void mo146256x(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo144913s(v, i);
    }

    /* renamed from: y */
    public boolean mo146260y(int i) {
        C104403c cVar = this.f309107d;
        if (cVar != null) {
            return cVar.mo146263a(i);
        }
        this.f309108e = i;
        return false;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
