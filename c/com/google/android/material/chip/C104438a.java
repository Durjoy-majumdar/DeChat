package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p1050v2.C111325g;
import p1145q8.C110370c;
import p1148r8.C110504a;
import p1162x2.C112019a;
import p1162x2.C112022d;
import p1162x2.C112023e;
import p161h8.C108168h;
import p874c3.C104279a;

/* renamed from: com.google.android.material.chip.a */
public class C104438a extends Drawable implements C112022d, Drawable.Callback {

    /* renamed from: a1 */
    public static final int[] f309292a1 = {16842910};

    /* renamed from: A */
    public boolean f309293A;

    /* renamed from: B */
    public Drawable f309294B;

    /* renamed from: C */
    public C108168h f309295C;

    /* renamed from: D */
    public C108168h f309296D;

    /* renamed from: E */
    public float f309297E;

    /* renamed from: F */
    public float f309298F;

    /* renamed from: G */
    public float f309299G;

    /* renamed from: H */
    public float f309300H;

    /* renamed from: I */
    public float f309301I;

    /* renamed from: J */
    public float f309302J;

    /* renamed from: K */
    public float f309303K;

    /* renamed from: L */
    public float f309304L;

    /* renamed from: M */
    public final Context f309305M;

    /* renamed from: N */
    public final TextPaint f309306N;

    /* renamed from: P */
    public final Paint f309307P;

    /* renamed from: Q */
    public final Paint.FontMetrics f309308Q;

    /* renamed from: Q0 */
    public PorterDuff.Mode f309309Q0;

    /* renamed from: R */
    public final RectF f309310R;

    /* renamed from: R0 */
    public int[] f309311R0;

    /* renamed from: S */
    public final PointF f309312S;

    /* renamed from: S0 */
    public boolean f309313S0;

    /* renamed from: T */
    public int f309314T;

    /* renamed from: T0 */
    public ColorStateList f309315T0;

    /* renamed from: U */
    public int f309316U;

    /* renamed from: U0 */
    public WeakReference<C104440b> f309317U0;

    /* renamed from: V */
    public int f309318V;

    /* renamed from: V0 */
    public boolean f309319V0;

    /* renamed from: W */
    public int f309320W;

    /* renamed from: W0 */
    public float f309321W0;

    /* renamed from: X */
    public boolean f309322X;

    /* renamed from: X0 */
    public TextUtils.TruncateAt f309323X0;

    /* renamed from: Y */
    public int f309324Y;

    /* renamed from: Y0 */
    public boolean f309325Y0;

    /* renamed from: Z */
    public int f309326Z;

    /* renamed from: Z0 */
    public int f309327Z0;

    /* renamed from: d */
    public ColorStateList f309328d;

    /* renamed from: e */
    public float f309329e;

    /* renamed from: f */
    public float f309330f;

    /* renamed from: g */
    public ColorStateList f309331g;

    /* renamed from: h */
    public float f309332h;

    /* renamed from: i */
    public ColorStateList f309333i;

    /* renamed from: j */
    public CharSequence f309334j;

    /* renamed from: n */
    public CharSequence f309335n;

    /* renamed from: o */
    public C110370c f309336o;

    /* renamed from: p */
    public final C111325g.C111328d f309337p = new C104439a();

    /* renamed from: p0 */
    public ColorFilter f309338p0;

    /* renamed from: q */
    public boolean f309339q;

    /* renamed from: r */
    public Drawable f309340r;

    /* renamed from: s */
    public ColorStateList f309341s;

    /* renamed from: t */
    public float f309342t;

    /* renamed from: u */
    public boolean f309343u;

    /* renamed from: v */
    public Drawable f309344v;

    /* renamed from: w */
    public ColorStateList f309345w;

    /* renamed from: x */
    public float f309346x;

    /* renamed from: x0 */
    public PorterDuffColorFilter f309347x0;

    /* renamed from: y */
    public CharSequence f309348y;

    /* renamed from: y0 */
    public ColorStateList f309349y0;

    /* renamed from: z */
    public boolean f309350z;

    /* renamed from: com.google.android.material.chip.a$a */
    public class C104439a extends C111325g.C111328d {
        public C104439a() {
        }

        /* renamed from: c */
        public void mo144403c(int i) {
        }

        /* renamed from: d */
        public void mo144404d(Typeface typeface) {
            C104438a aVar = C104438a.this;
            aVar.f309319V0 = true;
            aVar.mo146626g();
            C104438a.this.invalidateSelf();
        }
    }

    /* renamed from: com.google.android.material.chip.a$b */
    public interface C104440b {
        /* renamed from: a */
        void mo146444a();
    }

    public C104438a(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.f309306N = textPaint;
        this.f309307P = new Paint(1);
        this.f309308Q = new Paint.FontMetrics();
        this.f309310R = new RectF();
        this.f309312S = new PointF();
        this.f309326Z = 255;
        this.f309309Q0 = PorterDuff.Mode.SRC_IN;
        this.f309317U0 = new WeakReference<>((Object) null);
        this.f309319V0 = true;
        this.f309305M = context;
        this.f309334j = "";
        textPaint.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f309292a1;
        setState(iArr);
        if (!Arrays.equals(this.f309311R0, iArr)) {
            this.f309311R0 = iArr;
            if (mo146618D()) {
                mo146633h(getState(), iArr);
            }
        }
        this.f309325Y0 = true;
    }

    /* renamed from: f */
    public static boolean m139569f(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public void mo146615A(C110370c cVar) {
        if (this.f309336o != cVar) {
            this.f309336o = cVar;
            if (cVar != null) {
                cVar.mo161879c(this.f309305M, this.f309306N, this.f309337p);
                this.f309319V0 = true;
            }
            onStateChange(getState());
            mo146626g();
        }
    }

    /* renamed from: B */
    public final boolean mo146616B() {
        return this.f309293A && this.f309294B != null && this.f309322X;
    }

    /* renamed from: C */
    public final boolean mo146617C() {
        return this.f309339q && this.f309340r != null;
    }

    /* renamed from: D */
    public final boolean mo146618D() {
        return this.f309343u && this.f309344v != null;
    }

    /* renamed from: E */
    public final void mo146619E(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: a */
    public final void mo146620a(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C112019a.m152745c(drawable, C112019a.m152744b(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f309344v) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f309311R0);
                }
                drawable.setTintList(this.f309345w);
            } else if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    /* renamed from: b */
    public final void mo146621b(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo146617C() || mo146616B()) {
            float f = this.f309297E + this.f309298F;
            if (C112019a.m152744b(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.f309342t;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.f309342t;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f309342t;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: c */
    public float mo146622c() {
        if (mo146617C() || mo146616B()) {
            return this.f309298F + this.f309342t + this.f309299G;
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final float mo146623d() {
        if (mo146618D()) {
            return this.f309302J + this.f309346x + this.f309303K;
        }
        return 0.0f;
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f309326Z) != 0) {
            if (i < 255) {
                float f = (float) bounds.left;
                float f2 = (float) bounds.top;
                float f3 = (float) bounds.right;
                float f4 = (float) bounds.bottom;
                i2 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
            } else {
                i2 = 0;
            }
            this.f309307P.setColor(this.f309314T);
            this.f309307P.setStyle(Paint.Style.FILL);
            Paint paint = this.f309307P;
            ColorFilter colorFilter = this.f309338p0;
            if (colorFilter == null) {
                colorFilter = this.f309347x0;
            }
            paint.setColorFilter(colorFilter);
            this.f309310R.set(bounds);
            RectF rectF = this.f309310R;
            float f5 = this.f309330f;
            canvas2.drawRoundRect(rectF, f5, f5, this.f309307P);
            if (this.f309332h > 0.0f) {
                this.f309307P.setColor(this.f309316U);
                this.f309307P.setStyle(Paint.Style.STROKE);
                Paint paint2 = this.f309307P;
                ColorFilter colorFilter2 = this.f309338p0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f309347x0;
                }
                paint2.setColorFilter(colorFilter2);
                RectF rectF2 = this.f309310R;
                float f6 = this.f309332h / 2.0f;
                rectF2.set(((float) bounds.left) + f6, ((float) bounds.top) + f6, ((float) bounds.right) - f6, ((float) bounds.bottom) - f6);
                float f7 = this.f309330f - (this.f309332h / 2.0f);
                canvas2.drawRoundRect(this.f309310R, f7, f7, this.f309307P);
            }
            this.f309307P.setColor(this.f309318V);
            this.f309307P.setStyle(Paint.Style.FILL);
            this.f309310R.set(bounds);
            RectF rectF3 = this.f309310R;
            float f8 = this.f309330f;
            canvas2.drawRoundRect(rectF3, f8, f8, this.f309307P);
            if (mo146617C()) {
                mo146621b(bounds, this.f309310R);
                RectF rectF4 = this.f309310R;
                float f9 = rectF4.left;
                float f15 = rectF4.top;
                canvas2.translate(f9, f15);
                this.f309340r.setBounds(0, 0, (int) this.f309310R.width(), (int) this.f309310R.height());
                this.f309340r.draw(canvas2);
                canvas2.translate(-f9, -f15);
            }
            if (mo146616B()) {
                mo146621b(bounds, this.f309310R);
                RectF rectF5 = this.f309310R;
                float f16 = rectF5.left;
                float f17 = rectF5.top;
                canvas2.translate(f16, f17);
                this.f309294B.setBounds(0, 0, (int) this.f309310R.width(), (int) this.f309310R.height());
                this.f309294B.draw(canvas2);
                canvas2.translate(-f16, -f17);
            }
            if (this.f309325Y0 && this.f309335n != null) {
                PointF pointF = this.f309312S;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.f309335n != null) {
                    float c = this.f309297E + mo146622c() + this.f309300H;
                    if (C112019a.m152744b(this) == 0) {
                        pointF.x = ((float) bounds.left) + c;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - c;
                        align = Paint.Align.RIGHT;
                    }
                    this.f309306N.getFontMetrics(this.f309308Q);
                    Paint.FontMetrics fontMetrics = this.f309308Q;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF6 = this.f309310R;
                rectF6.setEmpty();
                if (this.f309335n != null) {
                    float c2 = this.f309297E + mo146622c() + this.f309300H;
                    float d = this.f309304L + mo146623d() + this.f309301I;
                    if (C112019a.m152744b(this) == 0) {
                        rectF6.left = ((float) bounds.left) + c2;
                        rectF6.right = ((float) bounds.right) - d;
                    } else {
                        rectF6.left = ((float) bounds.left) + d;
                        rectF6.right = ((float) bounds.right) - c2;
                    }
                    rectF6.top = (float) bounds.top;
                    rectF6.bottom = (float) bounds.bottom;
                }
                if (this.f309336o != null) {
                    this.f309306N.drawableState = getState();
                    this.f309336o.mo161878b(this.f309305M, this.f309306N, this.f309337p);
                }
                this.f309306N.setTextAlign(align);
                boolean z = Math.round(mo146625e()) > Math.round(this.f309310R.width());
                if (z) {
                    int save = canvas.save();
                    canvas2.clipRect(this.f309310R);
                    i3 = save;
                } else {
                    i3 = 0;
                }
                CharSequence charSequence = this.f309335n;
                if (z && this.f309323X0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f309306N, this.f309310R.width(), this.f309323X0);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.f309312S;
                canvas.drawText(charSequence2, 0, length, pointF2.x, pointF2.y, this.f309306N);
                if (z) {
                    canvas2.restoreToCount(i3);
                }
            }
            if (mo146618D()) {
                RectF rectF7 = this.f309310R;
                rectF7.setEmpty();
                if (mo146618D()) {
                    float f18 = this.f309304L + this.f309303K;
                    if (C112019a.m152744b(this) == 0) {
                        float f19 = ((float) bounds.right) - f18;
                        rectF7.right = f19;
                        rectF7.left = f19 - this.f309346x;
                    } else {
                        float f25 = ((float) bounds.left) + f18;
                        rectF7.left = f25;
                        rectF7.right = f25 + this.f309346x;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f26 = this.f309346x;
                    float f27 = exactCenterY - (f26 / 2.0f);
                    rectF7.top = f27;
                    rectF7.bottom = f27 + f26;
                }
                RectF rectF8 = this.f309310R;
                float f28 = rectF8.left;
                float f29 = rectF8.top;
                canvas2.translate(f28, f29);
                this.f309344v.setBounds(0, 0, (int) this.f309310R.width(), (int) this.f309310R.height());
                this.f309344v.draw(canvas2);
                canvas2.translate(-f28, -f29);
            }
            if (this.f309326Z < 255) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    /* renamed from: e */
    public final float mo146625e() {
        if (!this.f309319V0) {
            return this.f309321W0;
        }
        CharSequence charSequence = this.f309335n;
        float measureText = charSequence == null ? 0.0f : this.f309306N.measureText(charSequence, 0, charSequence.length());
        this.f309321W0 = measureText;
        this.f309319V0 = false;
        return measureText;
    }

    /* renamed from: g */
    public void mo146626g() {
        C104440b bVar = this.f309317U0.get();
        if (bVar != null) {
            bVar.mo146444a();
        }
    }

    public int getAlpha() {
        return this.f309326Z;
    }

    public ColorFilter getColorFilter() {
        return this.f309338p0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f309329e;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f309297E + mo146622c() + this.f309300H + mo146625e() + this.f309301I + mo146623d() + this.f309304L), this.f309327Z0);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f309330f);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f309329e, this.f309330f);
        }
        outline.setAlpha(((float) this.f309326Z) / 255.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f8  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo146633h(int[] r9, int[] r10) {
        /*
            r8 = this;
            boolean r0 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.f309328d
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r8.f309314T
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r8.f309314T
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r8.f309314T = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r1 = r8.f309331g
            if (r1 == 0) goto L_0x0024
            int r3 = r8.f309316U
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            int r3 = r8.f309316U
            if (r3 == r1) goto L_0x002c
            r8.f309316U = r1
            r0 = 1
        L_0x002c:
            android.content.res.ColorStateList r1 = r8.f309315T0
            if (r1 == 0) goto L_0x0037
            int r3 = r8.f309318V
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            int r3 = r8.f309318V
            if (r3 == r1) goto L_0x0043
            r8.f309318V = r1
            boolean r1 = r8.f309313S0
            if (r1 == 0) goto L_0x0043
            r0 = 1
        L_0x0043:
            q8.c r1 = r8.f309336o
            if (r1 == 0) goto L_0x0052
            android.content.res.ColorStateList r1 = r1.f330128b
            if (r1 == 0) goto L_0x0052
            int r3 = r8.f309320W
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            int r3 = r8.f309320W
            if (r3 == r1) goto L_0x005a
            r8.f309320W = r1
            r0 = 1
        L_0x005a:
            int[] r1 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r1 != 0) goto L_0x0064
            goto L_0x0071
        L_0x0064:
            int r5 = r1.length
            r6 = 0
        L_0x0066:
            if (r6 >= r5) goto L_0x0071
            r7 = r1[r6]
            if (r7 != r3) goto L_0x006e
            r1 = 1
            goto L_0x0072
        L_0x006e:
            int r6 = r6 + 1
            goto L_0x0066
        L_0x0071:
            r1 = 0
        L_0x0072:
            if (r1 == 0) goto L_0x007a
            boolean r1 = r8.f309350z
            if (r1 == 0) goto L_0x007a
            r1 = 1
            goto L_0x007b
        L_0x007a:
            r1 = 0
        L_0x007b:
            boolean r3 = r8.f309322X
            if (r3 == r1) goto L_0x0095
            android.graphics.drawable.Drawable r3 = r8.f309294B
            if (r3 == 0) goto L_0x0095
            float r0 = r8.mo146622c()
            r8.f309322X = r1
            float r1 = r8.mo146622c()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0094
            r0 = 1
            r1 = 1
            goto L_0x0096
        L_0x0094:
            r0 = 1
        L_0x0095:
            r1 = 0
        L_0x0096:
            android.content.res.ColorStateList r3 = r8.f309349y0
            if (r3 == 0) goto L_0x00a1
            int r5 = r8.f309324Y
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x00a2
        L_0x00a1:
            r3 = 0
        L_0x00a2:
            int r5 = r8.f309324Y
            if (r5 == r3) goto L_0x00c3
            r8.f309324Y = r3
            android.content.res.ColorStateList r0 = r8.f309349y0
            android.graphics.PorterDuff$Mode r3 = r8.f309309Q0
            if (r0 == 0) goto L_0x00bf
            if (r3 != 0) goto L_0x00b1
            goto L_0x00bf
        L_0x00b1:
            int[] r5 = r8.getState()
            int r0 = r0.getColorForState(r5, r2)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r0, r3)
            goto L_0x00c0
        L_0x00bf:
            r2 = 0
        L_0x00c0:
            r8.f309347x0 = r2
            goto L_0x00c4
        L_0x00c3:
            r4 = r0
        L_0x00c4:
            android.graphics.drawable.Drawable r0 = r8.f309340r
            boolean r0 = m139569f(r0)
            if (r0 == 0) goto L_0x00d3
            android.graphics.drawable.Drawable r0 = r8.f309340r
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x00d3:
            android.graphics.drawable.Drawable r0 = r8.f309294B
            boolean r0 = m139569f(r0)
            if (r0 == 0) goto L_0x00e2
            android.graphics.drawable.Drawable r0 = r8.f309294B
            boolean r9 = r0.setState(r9)
            r4 = r4 | r9
        L_0x00e2:
            android.graphics.drawable.Drawable r9 = r8.f309344v
            boolean r9 = m139569f(r9)
            if (r9 == 0) goto L_0x00f1
            android.graphics.drawable.Drawable r9 = r8.f309344v
            boolean r9 = r9.setState(r10)
            r4 = r4 | r9
        L_0x00f1:
            if (r4 == 0) goto L_0x00f6
            r8.invalidateSelf()
        L_0x00f6:
            if (r1 == 0) goto L_0x00fb
            r8.mo146626g()
        L_0x00fb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C104438a.mo146633h(int[], int[]):boolean");
    }

    /* renamed from: i */
    public void mo146634i(boolean z) {
        if (this.f309350z != z) {
            this.f309350z = z;
            float c = mo146622c();
            if (!z && this.f309322X) {
                this.f309322X = false;
            }
            float c2 = mo146622c();
            invalidateSelf();
            if (c != c2) {
                mo146626g();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f309328d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f309331g;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        if (this.f309313S0) {
            ColorStateList colorStateList4 = this.f309315T0;
            if (colorStateList4 != null && colorStateList4.isStateful()) {
                return true;
            }
        }
        C110370c cVar = this.f309336o;
        if ((cVar == null || (colorStateList = cVar.f330128b) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        if ((this.f309293A && this.f309294B != null && this.f309350z) || m139569f(this.f309340r) || m139569f(this.f309294B)) {
            return true;
        }
        ColorStateList colorStateList5 = this.f309349y0;
        return colorStateList5 != null && colorStateList5.isStateful();
    }

    /* renamed from: j */
    public void mo146637j(Drawable drawable) {
        if (this.f309294B != drawable) {
            float c = mo146622c();
            this.f309294B = drawable;
            float c2 = mo146622c();
            mo146619E(this.f309294B);
            mo146620a(this.f309294B);
            invalidateSelf();
            if (c != c2) {
                mo146626g();
            }
        }
    }

    /* renamed from: k */
    public void mo146638k(boolean z) {
        if (this.f309293A != z) {
            boolean B = mo146616B();
            this.f309293A = z;
            boolean B2 = mo146616B();
            if (B != B2) {
                if (B2) {
                    mo146620a(this.f309294B);
                } else {
                    mo146619E(this.f309294B);
                }
                invalidateSelf();
                mo146626g();
            }
        }
    }

    /* renamed from: l */
    public void mo146639l(Drawable drawable) {
        Drawable drawable2 = this.f309340r;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof C112023e) {
            drawable2 = ((C112023e) drawable2).mo163694b();
        }
        if (drawable2 != drawable) {
            float c = mo146622c();
            if (drawable != null) {
                drawable3 = C112019a.m152749g(drawable).mutate();
            }
            this.f309340r = drawable3;
            float c2 = mo146622c();
            mo146619E(drawable2);
            if (mo146617C()) {
                mo146620a(this.f309340r);
            }
            invalidateSelf();
            if (c != c2) {
                mo146626g();
            }
        }
    }

    /* renamed from: m */
    public void mo146640m(float f) {
        if (this.f309342t != f) {
            float c = mo146622c();
            this.f309342t = f;
            float c2 = mo146622c();
            invalidateSelf();
            if (c != c2) {
                mo146626g();
            }
        }
    }

    /* renamed from: n */
    public void mo146641n(ColorStateList colorStateList) {
        if (this.f309341s != colorStateList) {
            this.f309341s = colorStateList;
            if (mo146617C()) {
                this.f309340r.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: o */
    public void mo146642o(boolean z) {
        if (this.f309339q != z) {
            boolean C = mo146617C();
            this.f309339q = z;
            boolean C2 = mo146617C();
            if (C != C2) {
                if (C2) {
                    mo146620a(this.f309340r);
                } else {
                    mo146619E(this.f309340r);
                }
                invalidateSelf();
                mo146626g();
            }
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (mo146617C()) {
            onLayoutDirectionChanged |= this.f309340r.setLayoutDirection(i);
        }
        if (mo146616B()) {
            onLayoutDirectionChanged |= this.f309294B.setLayoutDirection(i);
        }
        if (mo146618D()) {
            onLayoutDirectionChanged |= this.f309344v.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (mo146617C()) {
            onLevelChange |= this.f309340r.setLevel(i);
        }
        if (mo146616B()) {
            onLevelChange |= this.f309294B.setLevel(i);
        }
        if (mo146618D()) {
            onLevelChange |= this.f309344v.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        return mo146633h(iArr, this.f309311R0);
    }

    /* renamed from: p */
    public void mo146646p(float f) {
        if (this.f309332h != f) {
            this.f309332h = f;
            this.f309307P.setStrokeWidth(f);
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public void mo146647q(Drawable drawable) {
        Drawable drawable2 = this.f309344v;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof C112023e) {
            drawable2 = ((C112023e) drawable2).mo163694b();
        }
        if (drawable2 != drawable) {
            float d = mo146623d();
            if (drawable != null) {
                drawable3 = C112019a.m152749g(drawable).mutate();
            }
            this.f309344v = drawable3;
            float d2 = mo146623d();
            mo146619E(drawable2);
            if (mo146618D()) {
                mo146620a(this.f309344v);
            }
            invalidateSelf();
            if (d != d2) {
                mo146626g();
            }
        }
    }

    /* renamed from: r */
    public void mo146648r(float f) {
        if (this.f309303K != f) {
            this.f309303K = f;
            invalidateSelf();
            if (mo146618D()) {
                mo146626g();
            }
        }
    }

    /* renamed from: s */
    public void mo146649s(float f) {
        if (this.f309346x != f) {
            this.f309346x = f;
            invalidateSelf();
            if (mo146618D()) {
                mo146626g();
            }
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f309326Z != i) {
            this.f309326Z = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f309338p0 != colorFilter) {
            this.f309338p0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f309349y0 != colorStateList) {
            this.f309349y0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f309309Q0 != mode) {
            this.f309309Q0 = mode;
            ColorStateList colorStateList = this.f309349y0;
            this.f309347x0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (mo146617C()) {
            visible |= this.f309340r.setVisible(z, z2);
        }
        if (mo146616B()) {
            visible |= this.f309294B.setVisible(z, z2);
        }
        if (mo146618D()) {
            visible |= this.f309344v.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t */
    public void mo146656t(float f) {
        if (this.f309302J != f) {
            this.f309302J = f;
            invalidateSelf();
            if (mo146618D()) {
                mo146626g();
            }
        }
    }

    /* renamed from: u */
    public void mo146657u(ColorStateList colorStateList) {
        if (this.f309345w != colorStateList) {
            this.f309345w = colorStateList;
            if (mo146618D()) {
                this.f309344v.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public void mo146659v(boolean z) {
        if (this.f309343u != z) {
            boolean D = mo146618D();
            this.f309343u = z;
            boolean D2 = mo146618D();
            if (D != D2) {
                if (D2) {
                    mo146620a(this.f309344v);
                } else {
                    mo146619E(this.f309344v);
                }
                invalidateSelf();
                mo146626g();
            }
        }
    }

    /* renamed from: w */
    public void mo146660w(float f) {
        if (this.f309299G != f) {
            float c = mo146622c();
            this.f309299G = f;
            float c2 = mo146622c();
            invalidateSelf();
            if (c != c2) {
                mo146626g();
            }
        }
    }

    /* renamed from: x */
    public void mo146661x(float f) {
        if (this.f309298F != f) {
            float c = mo146622c();
            this.f309298F = f;
            float c2 = mo146622c();
            invalidateSelf();
            if (c != c2) {
                mo146626g();
            }
        }
    }

    /* renamed from: y */
    public void mo146662y(ColorStateList colorStateList) {
        if (this.f309333i != colorStateList) {
            this.f309333i = colorStateList;
            this.f309315T0 = this.f309313S0 ? C110504a.m150442a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: z */
    public void mo146663z(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.f309334j != charSequence) {
            this.f309334j = charSequence;
            this.f309335n = C104279a.m139188c().mo145942d(charSequence);
            this.f309319V0 = true;
            invalidateSelf();
            mo146626g();
        }
    }
}
