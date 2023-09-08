package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.google.android.material.circularreveal.C104442b;
import com.google.android.material.circularreveal.C104444c;

public class CircularRevealCardView extends CardView implements C104444c {

    /* renamed from: n */
    public final C104442b f309368n = new C104442b(this);

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo146664a() {
        this.f309368n.getClass();
    }

    /* renamed from: b */
    public void mo146665b(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: c */
    public void mo146666c() {
        this.f309368n.getClass();
    }

    /* renamed from: d */
    public boolean mo146667d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        C104442b bVar = this.f309368n;
        if (bVar != null) {
            bVar.mo146685a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f309368n.f309360e;
    }

    public int getCircularRevealScrimColor() {
        return this.f309368n.mo146686b();
    }

    public C104444c.C104448d getRevealInfo() {
        return this.f309368n.mo146687c();
    }

    public boolean isOpaque() {
        C104442b bVar = this.f309368n;
        return bVar != null ? bVar.mo146688d() : super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f309368n.mo146689e(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f309368n.mo146690f(i);
    }

    public void setRevealInfo(C104444c.C104448d dVar) {
        this.f309368n.mo146691g(dVar);
    }
}
