package p259w6;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
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
import rx3.C13601g;
import rx3.C13603j;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: w6.b */
public final class C111735b extends C106969c implements C24725u1 {

    /* renamed from: i */
    public final Drawable f334617i;

    /* renamed from: j */
    public final C60690y0 f334618j = C108500f2.m146996c(0, (C108497e2) null, 2, (Object) null);

    /* renamed from: n */
    public final C13601g f334619n = C36568h.m40985a(new C111736a(this));

    /* renamed from: w6.b$a */
    public static final class C111736a extends C87413o implements C32224a<C111734a> {

        /* renamed from: d */
        public final /* synthetic */ C111735b f334620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111736a(C111735b bVar) {
            super(0);
            this.f334620d = bVar;
        }

        public Object invoke() {
            return new C111734a(this.f334620d);
        }
    }

    public C111735b(Drawable drawable) {
        C87412m.m108594g(drawable, "drawable");
        this.f334617i = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* renamed from: a */
    public boolean mo84456a(float f) {
        this.f334617i.setAlpha(C61595o.m72297e(C60641c.m70921b(f * ((float) 255)), 0, 255));
        return true;
    }

    /* renamed from: b */
    public void mo51625b() {
        mo51627d();
    }

    /* renamed from: c */
    public void mo51626c() {
        this.f334617i.setCallback((Drawable.Callback) ((C36570n) this.f334619n).getValue());
        this.f334617i.setVisible(true, true);
        Drawable drawable = this.f334617i;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    /* renamed from: d */
    public void mo51627d() {
        Drawable drawable = this.f334617i;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        this.f334617i.setVisible(false, false);
        this.f334617i.setCallback((Drawable.Callback) null);
    }

    /* renamed from: e */
    public boolean mo84457e(C103274x xVar) {
        this.f334617i.setColorFilter(xVar == null ? null : xVar.f304519a);
        return true;
    }

    /* renamed from: f */
    public boolean mo157378f(C33183o oVar) {
        C87412m.m108594g(oVar, "layoutDirection");
        int i = 0;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        Drawable drawable = this.f334617i;
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
        return C112546l.m153761a((float) this.f334617i.getIntrinsicWidth(), (float) this.f334617i.getIntrinsicHeight());
    }

    /* renamed from: i */
    public void mo84459i(C104231f fVar) {
        C87412m.m108594g(fVar, "<this>");
        C103262s i = fVar.mo145815B().mo145835i();
        ((Number) ((C108494d2) this.f334618j).getValue()).intValue();
        this.f334617i.setBounds(0, 0, C60641c.m70921b(C112545k.m153758d(fVar.mo145819e())), C60641c.m70921b(C112545k.m153756b(fVar.mo145819e())));
        try {
            i.mo142944c();
            Drawable drawable = this.f334617i;
            Canvas canvas = C103226c.f304431a;
            drawable.draw(((C103223b) i).f304427a);
        } finally {
            i.mo142943b();
        }
    }
}
