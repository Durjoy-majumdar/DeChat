package p1139o8;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import java.util.WeakHashMap;
import p1115h.C107922a;
import p161h8.C108164a;
import p282z2.C16095a;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p874c3.C104282d;

/* renamed from: o8.c */
public final class C109969c {

    /* renamed from: A */
    public float f329077A;

    /* renamed from: B */
    public int[] f329078B;

    /* renamed from: C */
    public boolean f329079C;

    /* renamed from: D */
    public final TextPaint f329080D;

    /* renamed from: E */
    public final TextPaint f329081E;

    /* renamed from: F */
    public TimeInterpolator f329082F;

    /* renamed from: G */
    public TimeInterpolator f329083G;

    /* renamed from: H */
    public float f329084H;

    /* renamed from: I */
    public float f329085I;

    /* renamed from: J */
    public float f329086J;

    /* renamed from: K */
    public int f329087K;

    /* renamed from: L */
    public float f329088L;

    /* renamed from: M */
    public float f329089M;

    /* renamed from: N */
    public float f329090N;

    /* renamed from: O */
    public int f329091O;

    /* renamed from: a */
    public final View f329092a;

    /* renamed from: b */
    public boolean f329093b;

    /* renamed from: c */
    public float f329094c;

    /* renamed from: d */
    public final Rect f329095d;

    /* renamed from: e */
    public final Rect f329096e;

    /* renamed from: f */
    public final RectF f329097f;

    /* renamed from: g */
    public int f329098g = 16;

    /* renamed from: h */
    public int f329099h = 16;

    /* renamed from: i */
    public float f329100i = 15.0f;

    /* renamed from: j */
    public float f329101j = 15.0f;

    /* renamed from: k */
    public ColorStateList f329102k;

    /* renamed from: l */
    public ColorStateList f329103l;

    /* renamed from: m */
    public float f329104m;

    /* renamed from: n */
    public float f329105n;

    /* renamed from: o */
    public float f329106o;

    /* renamed from: p */
    public float f329107p;

    /* renamed from: q */
    public float f329108q;

    /* renamed from: r */
    public float f329109r;

    /* renamed from: s */
    public Typeface f329110s;

    /* renamed from: t */
    public Typeface f329111t;

    /* renamed from: u */
    public Typeface f329112u;

    /* renamed from: v */
    public CharSequence f329113v;

    /* renamed from: w */
    public CharSequence f329114w;

    /* renamed from: x */
    public boolean f329115x;

    /* renamed from: y */
    public Bitmap f329116y;

    /* renamed from: z */
    public float f329117z;

    public C109969c(View view) {
        this.f329092a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f329080D = textPaint;
        this.f329081E = new TextPaint(textPaint);
        this.f329096e = new Rect();
        this.f329095d = new Rect();
        this.f329097f = new RectF();
    }

    /* renamed from: a */
    public static int m149474a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: g */
    public static float m149475g(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = C108164a.f323890a;
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public final boolean mo161304b(CharSequence charSequence) {
        View view = this.f329092a;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        boolean z = true;
        if (C107207u.C107209c.m145195d(view) != 1) {
            z = false;
        }
        return ((C104282d.C104285c) (z ? C104282d.f308638d : C104282d.f308637c)).mo145946b(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    public final void mo161305c(float f) {
        float f2;
        boolean z;
        if (this.f329113v != null) {
            float width = (float) this.f329096e.width();
            float width2 = (float) this.f329095d.width();
            boolean z2 = true;
            if (Math.abs(f - this.f329101j) < 0.001f) {
                f2 = this.f329101j;
                this.f329117z = 1.0f;
                Typeface typeface = this.f329112u;
                Typeface typeface2 = this.f329110s;
                if (typeface != typeface2) {
                    this.f329112u = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f329100i;
                Typeface typeface3 = this.f329112u;
                Typeface typeface4 = this.f329111t;
                if (typeface3 != typeface4) {
                    this.f329112u = typeface4;
                    z = true;
                } else {
                    z = false;
                }
                if (Math.abs(f - f3) < 0.001f) {
                    this.f329117z = 1.0f;
                } else {
                    this.f329117z = f / this.f329100i;
                }
                float f4 = this.f329101j / this.f329100i;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
            }
            if (width > 0.0f) {
                z = this.f329077A != f2 || this.f329079C || z;
                this.f329077A = f2;
                this.f329079C = false;
            }
            if (this.f329114w == null || z) {
                this.f329080D.setTextSize(this.f329077A);
                this.f329080D.setTypeface(this.f329112u);
                TextPaint textPaint = this.f329080D;
                if (this.f329117z == 1.0f) {
                    z2 = false;
                }
                textPaint.setLinearText(z2);
                CharSequence ellipsize = TextUtils.ellipsize(this.f329113v, this.f329080D, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f329114w)) {
                    this.f329114w = ellipsize;
                    this.f329115x = mo161304b(ellipsize);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo161306d(Canvas canvas) {
        int save = canvas.save();
        if (this.f329114w != null && this.f329093b) {
            float f = this.f329108q;
            float f2 = this.f329109r;
            this.f329080D.ascent();
            this.f329080D.descent();
            float f3 = this.f329117z;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            CharSequence charSequence = this.f329114w;
            canvas.drawText(charSequence, 0, charSequence.length(), f, f2, this.f329080D);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: e */
    public float mo161307e() {
        TextPaint textPaint = this.f329081E;
        textPaint.setTextSize(this.f329101j);
        textPaint.setTypeface(this.f329110s);
        return -this.f329081E.ascent();
    }

    /* renamed from: f */
    public int mo161308f() {
        int[] iArr = this.f329078B;
        return iArr != null ? this.f329103l.getColorForState(iArr, 0) : this.f329103l.getDefaultColor();
    }

    /* renamed from: h */
    public void mo161309h() {
        this.f329093b = this.f329096e.width() > 0 && this.f329096e.height() > 0 && this.f329095d.width() > 0 && this.f329095d.height() > 0;
    }

    /* renamed from: i */
    public final Typeface mo161310i(int i) {
        TypedArray obtainStyledAttributes = this.f329092a.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public void mo161311j() {
        if (this.f329092a.getHeight() > 0 && this.f329092a.getWidth() > 0) {
            float f = this.f329077A;
            mo161305c(this.f329101j);
            CharSequence charSequence = this.f329114w;
            float f2 = 0.0f;
            float measureText = charSequence != null ? this.f329080D.measureText(charSequence, 0, charSequence.length()) : 0.0f;
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f329099h, this.f329115x ? 1 : 0);
            int i = absoluteGravity & 112;
            if (i == 48) {
                this.f329105n = ((float) this.f329096e.top) - this.f329080D.ascent();
            } else if (i != 80) {
                this.f329105n = ((float) this.f329096e.centerY()) + (((this.f329080D.descent() - this.f329080D.ascent()) / 2.0f) - this.f329080D.descent());
            } else {
                this.f329105n = (float) this.f329096e.bottom;
            }
            int i2 = absoluteGravity & 8388615;
            if (i2 == 1) {
                this.f329107p = ((float) this.f329096e.centerX()) - (measureText / 2.0f);
            } else if (i2 != 5) {
                this.f329107p = (float) this.f329096e.left;
            } else {
                this.f329107p = ((float) this.f329096e.right) - measureText;
            }
            mo161305c(this.f329100i);
            CharSequence charSequence2 = this.f329114w;
            if (charSequence2 != null) {
                f2 = this.f329080D.measureText(charSequence2, 0, charSequence2.length());
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f329098g, this.f329115x ? 1 : 0);
            int i3 = absoluteGravity2 & 112;
            if (i3 == 48) {
                this.f329104m = ((float) this.f329095d.top) - this.f329080D.ascent();
            } else if (i3 != 80) {
                this.f329104m = ((float) this.f329095d.centerY()) + (((this.f329080D.descent() - this.f329080D.ascent()) / 2.0f) - this.f329080D.descent());
            } else {
                this.f329104m = (float) this.f329095d.bottom;
            }
            int i4 = absoluteGravity2 & 8388615;
            if (i4 == 1) {
                this.f329106o = ((float) this.f329095d.centerX()) - (f2 / 2.0f);
            } else if (i4 != 5) {
                this.f329106o = (float) this.f329095d.left;
            } else {
                this.f329106o = ((float) this.f329095d.right) - f2;
            }
            Bitmap bitmap = this.f329116y;
            if (bitmap != null) {
                bitmap.recycle();
                this.f329116y = null;
            }
            mo161316o(f);
            float f3 = this.f329094c;
            this.f329097f.left = m149475g((float) this.f329095d.left, (float) this.f329096e.left, f3, this.f329082F);
            this.f329097f.top = m149475g(this.f329104m, this.f329105n, f3, this.f329082F);
            this.f329097f.right = m149475g((float) this.f329095d.right, (float) this.f329096e.right, f3, this.f329082F);
            this.f329097f.bottom = m149475g((float) this.f329095d.bottom, (float) this.f329096e.bottom, f3, this.f329082F);
            this.f329108q = m149475g(this.f329106o, this.f329107p, f3, this.f329082F);
            this.f329109r = m149475g(this.f329104m, this.f329105n, f3, this.f329082F);
            mo161316o(m149475g(this.f329100i, this.f329101j, f3, this.f329083G));
            ColorStateList colorStateList = this.f329103l;
            ColorStateList colorStateList2 = this.f329102k;
            if (colorStateList != colorStateList2) {
                TextPaint textPaint = this.f329080D;
                int[] iArr = this.f329078B;
                textPaint.setColor(m149474a(iArr != null ? colorStateList2.getColorForState(iArr, 0) : colorStateList2.getDefaultColor(), mo161308f(), f3));
            } else {
                this.f329080D.setColor(mo161308f());
            }
            this.f329080D.setShadowLayer(m149475g(this.f329088L, this.f329084H, f3, (TimeInterpolator) null), m149475g(this.f329089M, this.f329085I, f3, (TimeInterpolator) null), m149475g(this.f329090N, this.f329086J, f3, (TimeInterpolator) null), m149474a(this.f329091O, this.f329087K, f3));
            View view = this.f329092a;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(view);
        }
    }

    /* renamed from: k */
    public void mo161312k(int i) {
        ColorStateList colorStateList;
        int resourceId;
        Context context = this.f329092a.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C107593a.f321896B);
        if (obtainStyledAttributes.hasValue(3)) {
            if (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = C107922a.m146227a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(3);
            }
            this.f329103l = colorStateList;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f329101j = (float) obtainStyledAttributes.getDimensionPixelSize(0, (int) this.f329101j);
        }
        this.f329087K = obtainStyledAttributes.getInt(6, 0);
        this.f329085I = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f329086J = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f329084H = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        this.f329110s = mo161310i(i);
        mo161311j();
    }

    /* renamed from: l */
    public void mo161313l(ColorStateList colorStateList) {
        if (this.f329103l != colorStateList) {
            this.f329103l = colorStateList;
            mo161311j();
        }
    }

    /* renamed from: m */
    public void mo161314m(int i) {
        ColorStateList colorStateList;
        int resourceId;
        Context context = this.f329092a.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C107593a.f321896B);
        if (obtainStyledAttributes.hasValue(3)) {
            if (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = C107922a.m146227a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(3);
            }
            this.f329102k = colorStateList;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f329100i = (float) obtainStyledAttributes.getDimensionPixelSize(0, (int) this.f329100i);
        }
        this.f329091O = obtainStyledAttributes.getInt(6, 0);
        this.f329089M = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f329090N = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f329088L = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        this.f329111t = mo161310i(i);
        mo161311j();
    }

    /* renamed from: n */
    public void mo161315n(float f) {
        float a = C16095a.m14979a(f, 0.0f, 1.0f);
        if (a != this.f329094c) {
            this.f329094c = a;
            this.f329097f.left = m149475g((float) this.f329095d.left, (float) this.f329096e.left, a, this.f329082F);
            this.f329097f.top = m149475g(this.f329104m, this.f329105n, a, this.f329082F);
            this.f329097f.right = m149475g((float) this.f329095d.right, (float) this.f329096e.right, a, this.f329082F);
            this.f329097f.bottom = m149475g((float) this.f329095d.bottom, (float) this.f329096e.bottom, a, this.f329082F);
            this.f329108q = m149475g(this.f329106o, this.f329107p, a, this.f329082F);
            this.f329109r = m149475g(this.f329104m, this.f329105n, a, this.f329082F);
            mo161316o(m149475g(this.f329100i, this.f329101j, a, this.f329083G));
            ColorStateList colorStateList = this.f329103l;
            ColorStateList colorStateList2 = this.f329102k;
            if (colorStateList != colorStateList2) {
                TextPaint textPaint = this.f329080D;
                int[] iArr = this.f329078B;
                textPaint.setColor(m149474a(iArr != null ? colorStateList2.getColorForState(iArr, 0) : colorStateList2.getDefaultColor(), mo161308f(), a));
            } else {
                this.f329080D.setColor(mo161308f());
            }
            this.f329080D.setShadowLayer(m149475g(this.f329088L, this.f329084H, a, (TimeInterpolator) null), m149475g(this.f329089M, this.f329085I, a, (TimeInterpolator) null), m149475g(this.f329090N, this.f329086J, a, (TimeInterpolator) null), m149474a(this.f329091O, this.f329087K, a));
            View view = this.f329092a;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(view);
        }
    }

    /* renamed from: o */
    public final void mo161316o(float f) {
        mo161305c(f);
        View view = this.f329092a;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145183k(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r3 = r2.f329102k;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo161317p(int[] r3) {
        /*
            r2 = this;
            r2.f329078B = r3
            android.content.res.ColorStateList r3 = r2.f329103l
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x000e
            boolean r3 = r3.isStateful()
            if (r3 != 0) goto L_0x0018
        L_0x000e:
            android.content.res.ColorStateList r3 = r2.f329102k
            if (r3 == 0) goto L_0x001a
            boolean r3 = r3.isStateful()
            if (r3 == 0) goto L_0x001a
        L_0x0018:
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            if (r3 == 0) goto L_0x0021
            r2.mo161311j()
            return r0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1139o8.C109969c.mo161317p(int[]):boolean");
    }
}
