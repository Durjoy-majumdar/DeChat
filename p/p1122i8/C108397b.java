package p1122i8;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.button.MaterialButton;
import p1148r8.C110504a;

/* renamed from: i8.b */
public class C108397b {

    /* renamed from: a */
    public final MaterialButton f324573a;

    /* renamed from: b */
    public int f324574b;

    /* renamed from: c */
    public int f324575c;

    /* renamed from: d */
    public int f324576d;

    /* renamed from: e */
    public int f324577e;

    /* renamed from: f */
    public int f324578f;

    /* renamed from: g */
    public int f324579g;

    /* renamed from: h */
    public PorterDuff.Mode f324580h;

    /* renamed from: i */
    public ColorStateList f324581i;

    /* renamed from: j */
    public ColorStateList f324582j;

    /* renamed from: k */
    public ColorStateList f324583k;

    /* renamed from: l */
    public final Paint f324584l = new Paint(1);

    /* renamed from: m */
    public GradientDrawable f324585m;

    /* renamed from: n */
    public GradientDrawable f324586n;

    /* renamed from: o */
    public GradientDrawable f324587o;

    /* renamed from: p */
    public boolean f324588p;

    public C108397b(MaterialButton materialButton) {
        new Rect();
        new RectF();
        this.f324588p = false;
        this.f324573a = materialButton;
    }

    /* renamed from: a */
    public final Drawable mo158931a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f324585m = gradientDrawable;
        gradientDrawable.setCornerRadius(((float) this.f324578f) + 1.0E-5f);
        this.f324585m.setColor(-1);
        mo158932b();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.f324586n = gradientDrawable2;
        gradientDrawable2.setCornerRadius(((float) this.f324578f) + 1.0E-5f);
        this.f324586n.setColor(0);
        this.f324586n.setStroke(this.f324579g, this.f324582j);
        InsetDrawable insetDrawable = new InsetDrawable(new LayerDrawable(new Drawable[]{this.f324585m, this.f324586n}), this.f324574b, this.f324576d, this.f324575c, this.f324577e);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.f324587o = gradientDrawable3;
        gradientDrawable3.setCornerRadius(((float) this.f324578f) + 1.0E-5f);
        this.f324587o.setColor(-1);
        return new C108396a(C110504a.m150442a(this.f324583k), insetDrawable, this.f324587o);
    }

    /* renamed from: b */
    public final void mo158932b() {
        GradientDrawable gradientDrawable = this.f324585m;
        if (gradientDrawable != null) {
            gradientDrawable.setTintList(this.f324581i);
            PorterDuff.Mode mode = this.f324580h;
            if (mode != null) {
                this.f324585m.setTintMode(mode);
            }
        }
    }
}
