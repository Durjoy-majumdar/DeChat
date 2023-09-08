package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.material.circularreveal.C104444c;

public class CircularRevealLinearLayout extends LinearLayout implements C104444c {

    /* renamed from: d */
    public final C104442b f309354d = new C104442b(this);

    public CircularRevealLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo146664a() {
        this.f309354d.getClass();
    }

    /* renamed from: b */
    public void mo146665b(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: c */
    public void mo146666c() {
        this.f309354d.getClass();
    }

    /* renamed from: d */
    public boolean mo146667d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        C104442b bVar = this.f309354d;
        if (bVar != null) {
            bVar.mo146685a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f309354d.f309360e;
    }

    public int getCircularRevealScrimColor() {
        return this.f309354d.mo146686b();
    }

    public C104444c.C104448d getRevealInfo() {
        return this.f309354d.mo146687c();
    }

    public boolean isOpaque() {
        C104442b bVar = this.f309354d;
        return bVar != null ? bVar.mo146688d() : super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f309354d.mo146689e(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f309354d.mo146690f(i);
    }

    public void setRevealInfo(C104444c.C104448d dVar) {
        this.f309354d.mo146691g(dVar);
    }
}
