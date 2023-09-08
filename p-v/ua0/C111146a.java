package ua0;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import gy3.C87412m;
import iy3.C60641c;
import my3.C61595o;
import p1104d1.C106969c;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C24725u1;
import p175j0.C60690y0;
import p436a1.C103223b;
import p436a1.C103226c;
import p436a1.C103262s;
import p436a1.C103274x;
import p560i2.C33183o;
import p835c1.C104231f;
import rx3.C13603j;

/* renamed from: ua0.a */
public final class C111146a extends C106969c implements C24725u1 {

    /* renamed from: i */
    public final Drawable f332855i;

    /* renamed from: j */
    public final C60690y0 f332856j = C108500f2.m146996c(0, (C108497e2) null, 2, (Object) null);

    public C111146a(Drawable drawable) {
        C87412m.m108594g(drawable, "drawable");
        this.f332855i = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* renamed from: a */
    public boolean mo84456a(float f) {
        this.f332855i.setAlpha(C61595o.m72297e(C60641c.m70921b(f * ((float) 255)), 0, 255));
        return true;
    }

    /* renamed from: b */
    public void mo51625b() {
    }

    /* renamed from: c */
    public void mo51626c() {
    }

    /* renamed from: d */
    public void mo51627d() {
    }

    /* renamed from: e */
    public boolean mo84457e(C103274x xVar) {
        this.f332855i.setColorFilter(xVar != null ? xVar.f304519a : null);
        return true;
    }

    /* renamed from: f */
    public boolean mo157378f(C33183o oVar) {
        C87412m.m108594g(oVar, "layoutDirection");
        int i = 0;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        Drawable drawable = this.f332855i;
        int ordinal = oVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 1;
            } else {
                throw new C13603j();
            }
        }
        return drawable.setLayoutDirection(i);
    }

    /* renamed from: h */
    public long mo84458h() {
        return C112546l.m153761a((float) this.f332855i.getIntrinsicWidth(), (float) this.f332855i.getIntrinsicHeight());
    }

    /* renamed from: i */
    public void mo84459i(C104231f fVar) {
        C87412m.m108594g(fVar, "<this>");
        C103262s i = fVar.mo145815B().mo145835i();
        ((Number) ((C108494d2) this.f332856j).getValue()).intValue();
        this.f332855i.setBounds(0, 0, C60641c.m70921b(C112545k.m153758d(fVar.mo145819e())), C60641c.m70921b(C112545k.m153756b(fVar.mo145819e())));
        try {
            i.mo142944c();
            Drawable drawable = this.f332855i;
            Canvas canvas = C103226c.f304431a;
            drawable.draw(((C103223b) i).f304427a);
        } finally {
            i.mo142943b();
        }
    }
}
