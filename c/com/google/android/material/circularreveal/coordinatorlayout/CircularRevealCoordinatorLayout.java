package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.C104442b;
import com.google.android.material.circularreveal.C104444c;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements C104444c {

    /* renamed from: D */
    public final C104442b f309369D = new C104442b(this);

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo146664a() {
        this.f309369D.getClass();
    }

    /* renamed from: b */
    public void mo146665b(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: c */
    public void mo146666c() {
        this.f309369D.getClass();
    }

    /* renamed from: d */
    public boolean mo146667d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        C104442b bVar = this.f309369D;
        if (bVar != null) {
            bVar.mo146685a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f309369D.f309360e;
    }

    public int getCircularRevealScrimColor() {
        return this.f309369D.mo146686b();
    }

    public C104444c.C104448d getRevealInfo() {
        return this.f309369D.mo146687c();
    }

    public boolean isOpaque() {
        C104442b bVar = this.f309369D;
        return bVar != null ? bVar.mo146688d() : super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f309369D.mo146689e(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f309369D.mo146690f(i);
    }

    public void setRevealInfo(C104444c.C104448d dVar) {
        this.f309369D.mo146691g(dVar);
    }
}
