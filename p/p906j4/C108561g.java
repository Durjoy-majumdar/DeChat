package p906j4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p1042u.C111055b;
import p1050v2.C111318d;
import p1050v2.C111331h;
import p1057w2.C111712c;
import p1162x2.C112019a;

/* renamed from: j4.g */
public class C108561g extends C108560f {

    /* renamed from: p */
    public static final PorterDuff.Mode f324961p = PorterDuff.Mode.SRC_IN;

    /* renamed from: e */
    public C108568g f324962e;

    /* renamed from: f */
    public PorterDuffColorFilter f324963f;

    /* renamed from: g */
    public ColorFilter f324964g;

    /* renamed from: h */
    public boolean f324965h;

    /* renamed from: i */
    public boolean f324966i;

    /* renamed from: j */
    public final float[] f324967j;

    /* renamed from: n */
    public final Matrix f324968n;

    /* renamed from: o */
    public final Rect f324969o;

    /* renamed from: j4.g$a */
    public static class C108562a extends C108566e {
        public C108562a() {
        }

        public C108562a(C108562a aVar) {
            super(aVar);
        }
    }

    /* renamed from: j4.g$d */
    public static abstract class C108565d {
        /* renamed from: a */
        public boolean mo159517a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo159518b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: j4.g$g */
    public static class C108568g extends Drawable.ConstantState {

        /* renamed from: a */
        public int f325013a;

        /* renamed from: b */
        public C108567f f325014b;

        /* renamed from: c */
        public ColorStateList f325015c;

        /* renamed from: d */
        public PorterDuff.Mode f325016d;

        /* renamed from: e */
        public boolean f325017e;

        /* renamed from: f */
        public Bitmap f325018f;

        /* renamed from: g */
        public ColorStateList f325019g;

        /* renamed from: h */
        public PorterDuff.Mode f325020h;

        /* renamed from: i */
        public int f325021i;

        /* renamed from: j */
        public boolean f325022j;

        /* renamed from: k */
        public boolean f325023k;

        /* renamed from: l */
        public Paint f325024l;

        public C108568g(C108568g gVar) {
            this.f325015c = null;
            this.f325016d = C108561g.f324961p;
            if (gVar != null) {
                this.f325013a = gVar.f325013a;
                C108567f fVar = new C108567f(gVar.f325014b);
                this.f325014b = fVar;
                if (gVar.f325014b.f325002e != null) {
                    fVar.f325002e = new Paint(gVar.f325014b.f325002e);
                }
                if (gVar.f325014b.f325001d != null) {
                    this.f325014b.f325001d = new Paint(gVar.f325014b.f325001d);
                }
                this.f325015c = gVar.f325015c;
                this.f325016d = gVar.f325016d;
                this.f325017e = gVar.f325017e;
            }
        }

        public int getChangingConfigurations() {
            return this.f325013a;
        }

        public Drawable newDrawable() {
            return new C108561g(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C108561g(this);
        }

        public C108568g() {
            this.f325015c = null;
            this.f325016d = C108561g.f324961p;
            this.f325014b = new C108567f();
        }
    }

    public C108561g() {
        this.f324966i = true;
        this.f324967j = new float[9];
        this.f324968n = new Matrix();
        this.f324969o = new Rect();
        this.f324962e = new C108568g();
    }

    /* renamed from: a */
    public PorterDuffColorFilter mo159491a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f324960d;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        if ((r15 == r8.getWidth() && r3 == r6.f325018f.getHeight()) == false) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.drawable.Drawable r2 = r0.f324960d
            if (r2 == 0) goto L_0x000c
            r2.draw(r1)
            return
        L_0x000c:
            android.graphics.Rect r2 = r0.f324969o
            r0.copyBounds(r2)
            android.graphics.Rect r2 = r0.f324969o
            int r2 = r2.width()
            if (r2 <= 0) goto L_0x019b
            android.graphics.Rect r2 = r0.f324969o
            int r2 = r2.height()
            if (r2 > 0) goto L_0x0023
            goto L_0x019b
        L_0x0023:
            android.graphics.ColorFilter r2 = r0.f324964g
            if (r2 != 0) goto L_0x0029
            android.graphics.PorterDuffColorFilter r2 = r0.f324963f
        L_0x0029:
            android.graphics.Matrix r3 = r0.f324968n
            r1.getMatrix(r3)
            android.graphics.Matrix r3 = r0.f324968n
            float[] r4 = r0.f324967j
            r3.getValues(r4)
            float[] r3 = r0.f324967j
            r4 = 0
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r5 = r0.f324967j
            r6 = 4
            r5 = r5[r6]
            float r5 = java.lang.Math.abs(r5)
            float[] r6 = r0.f324967j
            r7 = 1
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            float[] r8 = r0.f324967j
            r9 = 3
            r8 = r8[r9]
            float r8 = java.lang.Math.abs(r8)
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x0064
            int r6 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0068
        L_0x0064:
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x0068:
            android.graphics.Rect r6 = r0.f324969o
            int r6 = r6.width()
            float r6 = (float) r6
            float r6 = r6 * r3
            int r3 = (int) r6
            android.graphics.Rect r6 = r0.f324969o
            int r6 = r6.height()
            float r6 = (float) r6
            float r6 = r6 * r5
            int r5 = (int) r6
            r6 = 2048(0x800, float:2.87E-42)
            int r15 = java.lang.Math.min(r6, r3)
            int r3 = java.lang.Math.min(r6, r5)
            if (r15 <= 0) goto L_0x019b
            if (r3 > 0) goto L_0x008c
            goto L_0x019b
        L_0x008c:
            int r5 = r19.save()
            android.graphics.Rect r6 = r0.f324969o
            int r8 = r6.left
            float r8 = (float) r8
            int r6 = r6.top
            float r6 = (float) r6
            r1.translate(r8, r6)
            boolean r6 = r18.isAutoMirrored()
            if (r6 == 0) goto L_0x00a9
            int r6 = p1162x2.C112019a.m152744b(r18)
            if (r6 != r7) goto L_0x00a9
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            if (r6 == 0) goto L_0x00bb
            android.graphics.Rect r6 = r0.f324969o
            int r6 = r6.width()
            float r6 = (float) r6
            r1.translate(r6, r9)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.scale(r6, r10)
        L_0x00bb:
            android.graphics.Rect r6 = r0.f324969o
            r6.offsetTo(r4, r4)
            j4.g$g r6 = r0.f324962e
            android.graphics.Bitmap r8 = r6.f325018f
            if (r8 == 0) goto L_0x00d9
            int r8 = r8.getWidth()
            if (r15 != r8) goto L_0x00d6
            android.graphics.Bitmap r8 = r6.f325018f
            int r8 = r8.getHeight()
            if (r3 != r8) goto L_0x00d6
            r8 = 1
            goto L_0x00d7
        L_0x00d6:
            r8 = 0
        L_0x00d7:
            if (r8 != 0) goto L_0x00e3
        L_0x00d9:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r15, r3, r8)
            r6.f325018f = r8
            r6.f325023k = r7
        L_0x00e3:
            boolean r6 = r0.f324966i
            if (r6 != 0) goto L_0x0103
            j4.g$g r6 = r0.f324962e
            android.graphics.Bitmap r8 = r6.f325018f
            r8.eraseColor(r4)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            android.graphics.Bitmap r8 = r6.f325018f
            r14.<init>(r8)
            j4.g$f r11 = r6.f325014b
            j4.g$c r12 = r11.f325004g
            android.graphics.Matrix r13 = p906j4.C108561g.C108567f.f324997p
            r17 = 0
            r16 = r3
            r11.mo159555a(r12, r13, r14, r15, r16, r17)
            goto L_0x015d
        L_0x0103:
            j4.g$g r6 = r0.f324962e
            boolean r8 = r6.f325023k
            if (r8 != 0) goto L_0x0127
            android.content.res.ColorStateList r8 = r6.f325019g
            android.content.res.ColorStateList r9 = r6.f325015c
            if (r8 != r9) goto L_0x0127
            android.graphics.PorterDuff$Mode r8 = r6.f325020h
            android.graphics.PorterDuff$Mode r9 = r6.f325016d
            if (r8 != r9) goto L_0x0127
            boolean r8 = r6.f325022j
            boolean r9 = r6.f325017e
            if (r8 != r9) goto L_0x0127
            int r8 = r6.f325021i
            j4.g$f r6 = r6.f325014b
            int r6 = r6.getRootAlpha()
            if (r8 != r6) goto L_0x0127
            r6 = 1
            goto L_0x0128
        L_0x0127:
            r6 = 0
        L_0x0128:
            if (r6 != 0) goto L_0x015d
            j4.g$g r6 = r0.f324962e
            android.graphics.Bitmap r8 = r6.f325018f
            r8.eraseColor(r4)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            android.graphics.Bitmap r8 = r6.f325018f
            r14.<init>(r8)
            j4.g$f r11 = r6.f325014b
            j4.g$c r12 = r11.f325004g
            android.graphics.Matrix r13 = p906j4.C108561g.C108567f.f324997p
            r17 = 0
            r16 = r3
            r11.mo159555a(r12, r13, r14, r15, r16, r17)
            j4.g$g r3 = r0.f324962e
            android.content.res.ColorStateList r6 = r3.f325015c
            r3.f325019g = r6
            android.graphics.PorterDuff$Mode r6 = r3.f325016d
            r3.f325020h = r6
            j4.g$f r6 = r3.f325014b
            int r6 = r6.getRootAlpha()
            r3.f325021i = r6
            boolean r6 = r3.f325017e
            r3.f325022j = r6
            r3.f325023k = r4
        L_0x015d:
            j4.g$g r3 = r0.f324962e
            android.graphics.Rect r6 = r0.f324969o
            j4.g$f r8 = r3.f325014b
            int r8 = r8.getRootAlpha()
            r9 = 255(0xff, float:3.57E-43)
            if (r8 >= r9) goto L_0x016c
            r4 = 1
        L_0x016c:
            r8 = 0
            if (r4 != 0) goto L_0x0173
            if (r2 != 0) goto L_0x0173
            r2 = r8
            goto L_0x0193
        L_0x0173:
            android.graphics.Paint r4 = r3.f325024l
            if (r4 != 0) goto L_0x0181
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.f325024l = r4
            r4.setFilterBitmap(r7)
        L_0x0181:
            android.graphics.Paint r4 = r3.f325024l
            j4.g$f r7 = r3.f325014b
            int r7 = r7.getRootAlpha()
            r4.setAlpha(r7)
            android.graphics.Paint r4 = r3.f325024l
            r4.setColorFilter(r2)
            android.graphics.Paint r2 = r3.f325024l
        L_0x0193:
            android.graphics.Bitmap r3 = r3.f325018f
            r1.drawBitmap(r3, r8, r6, r2)
            r1.restoreToCount(r5)
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p906j4.C108561g.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.getAlpha() : this.f324962e.f325014b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f324962e.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f324960d != null && Build.VERSION.SDK_INT >= 24) {
            return new C108569h(this.f324960d.getConstantState());
        }
        this.f324962e.f325013a = getChangingConfigurations();
        return this.f324962e;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f324962e.f325014b.f325006i;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f324962e.f325014b.f325005h;
    }

    public int getOpacity() {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.isAutoMirrored() : this.f324962e.f325017e;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C108568g gVar = this.f324962e;
            if (gVar != null) {
                C108567f fVar = gVar.f325014b;
                if (fVar.f325011n == null) {
                    fVar.f325011n = Boolean.valueOf(fVar.f325004g.mo159517a());
                }
                if (fVar.f325011n.booleanValue() || ((colorStateList = this.f324962e.f325015c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public Drawable mutate() {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f324965h && super.mutate() == this) {
            this.f324962e = new C108568g(this.f324962e);
            this.f324965h = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C108568g gVar = this.f324962e;
        ColorStateList colorStateList = gVar.f325015c;
        if (!(colorStateList == null || (mode = gVar.f325016d) == null)) {
            this.f324963f = mo159491a(this.f324963f, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C108567f fVar = gVar.f325014b;
        if (fVar.f325011n == null) {
            fVar.f325011n = Boolean.valueOf(fVar.f325004g.mo159517a());
        }
        if (fVar.f325011n.booleanValue()) {
            boolean b = gVar.f325014b.f325004g.mo159518b(iArr);
            gVar.f325023k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f324962e.f325014b.getRootAlpha() != i) {
            this.f324962e.f325014b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f324962e.f325017e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f324964g = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            C112019a.m152746d(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            C112019a.m152747e(drawable, colorStateList);
            return;
        }
        C108568g gVar = this.f324962e;
        if (gVar.f325015c != colorStateList) {
            gVar.f325015c = colorStateList;
            this.f324963f = mo159491a(this.f324963f, colorStateList, gVar.f325016d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            C112019a.m152748f(drawable, mode);
            return;
        }
        C108568g gVar = this.f324962e;
        if (gVar.f325016d != mode) {
            gVar.f325016d = mode;
            this.f324963f = mo159491a(this.f324963f, gVar.f325015c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: j4.g$e */
    public static abstract class C108566e extends C108565d {

        /* renamed from: a */
        public C111712c.C111713a[] f324994a = null;

        /* renamed from: b */
        public String f324995b;

        /* renamed from: c */
        public int f324996c;

        public C108566e() {
        }

        public C111712c.C111713a[] getPathData() {
            return this.f324994a;
        }

        public String getPathName() {
            return this.f324995b;
        }

        public void setPathData(C111712c.C111713a[] aVarArr) {
            if (!C111712c.m152278a(this.f324994a, aVarArr)) {
                this.f324994a = C111712c.m152282e(aVarArr);
                return;
            }
            C111712c.C111713a[] aVarArr2 = this.f324994a;
            for (int i = 0; i < aVarArr.length; i++) {
                aVarArr2[i].f334392a = aVarArr[i].f334392a;
                int i2 = 0;
                while (true) {
                    float[] fArr = aVarArr[i].f334393b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    aVarArr2[i].f334393b[i2] = fArr[i2];
                    i2++;
                }
            }
        }

        public C108566e(C108566e eVar) {
            this.f324995b = eVar.f324995b;
            this.f324996c = eVar.f324996c;
            this.f324994a = C111712c.m152282e(eVar.f324994a);
        }
    }

    /* renamed from: j4.g$h */
    public static class C108569h extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f325025a;

        public C108569h(Drawable.ConstantState constantState) {
            this.f325025a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f325025a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f325025a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C108561g gVar = new C108561g();
            gVar.f324960d = (VectorDrawable) this.f325025a.newDrawable();
            return gVar;
        }

        public Drawable newDrawable(Resources resources) {
            C108561g gVar = new C108561g();
            gVar.f324960d = (VectorDrawable) this.f325025a.newDrawable(resources);
            return gVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C108561g gVar = new C108561g();
            gVar.f324960d = (VectorDrawable) this.f325025a.newDrawable(resources, theme);
            return gVar;
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        C108568g gVar;
        C108567f fVar;
        ArrayDeque arrayDeque;
        TypedArray typedArray;
        C108563b bVar;
        int i2;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.inflate(resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        C108568g gVar2 = this.f324962e;
        gVar2.f325014b = new C108567f();
        TypedArray h = C111331h.m151821h(resources2, theme2, attributeSet2, C108552a.f324938a);
        C108568g gVar3 = this.f324962e;
        C108567f fVar2 = gVar3.f325014b;
        int d = C111331h.m151817d(h, xmlPullParser2, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        if (d == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (d != 5) {
            if (d != 9) {
                switch (d) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        gVar3.f325016d = mode;
        int i4 = 1;
        ColorStateList colorStateList = h.getColorStateList(1);
        if (colorStateList != null) {
            gVar3.f325015c = colorStateList;
        }
        gVar3.f325017e = C111331h.m151814a(h, xmlPullParser2, "autoMirrored", 5, gVar3.f325017e);
        fVar2.f325007j = C111331h.m151816c(h, xmlPullParser2, "viewportWidth", 7, fVar2.f325007j);
        float c = C111331h.m151816c(h, xmlPullParser2, "viewportHeight", 8, fVar2.f325008k);
        fVar2.f325008k = c;
        if (fVar2.f325007j <= 0.0f) {
            throw new XmlPullParserException(h.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (c > 0.0f) {
            fVar2.f325005h = h.getDimension(3, fVar2.f325005h);
            int i5 = 2;
            float dimension = h.getDimension(2, fVar2.f325006i);
            fVar2.f325006i = dimension;
            if (fVar2.f325005h <= 0.0f) {
                throw new XmlPullParserException(h.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                fVar2.setAlpha(C111331h.m151816c(h, xmlPullParser2, "alpha", 4, fVar2.getAlpha()));
                int i6 = 0;
                String string = h.getString(0);
                if (string != null) {
                    fVar2.f325010m = string;
                    fVar2.f325012o.put(string, fVar2);
                }
                h.recycle();
                gVar2.f325013a = getChangingConfigurations();
                gVar2.f325023k = true;
                C108568g gVar4 = this.f324962e;
                C108567f fVar3 = gVar4.f325014b;
                ArrayDeque arrayDeque2 = new ArrayDeque();
                arrayDeque2.push(fVar3.f325004g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z = true;
                while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != i3)) {
                    if (eventType == i5) {
                        String name = xmlPullParser.getName();
                        C108564c cVar = (C108564c) arrayDeque2.peek();
                        if ("path".equals(name)) {
                            C108563b bVar2 = new C108563b();
                            TypedArray h2 = C111331h.m151821h(resources2, theme2, attributeSet2, C108552a.f324940c);
                            if (!C111331h.m151820g(xmlPullParser2, "pathData")) {
                                arrayDeque = arrayDeque2;
                                fVar = fVar3;
                                gVar = gVar2;
                                i = depth;
                                typedArray = h2;
                                bVar = bVar2;
                            } else {
                                String string2 = h2.getString(i6);
                                if (string2 != null) {
                                    bVar2.f324995b = string2;
                                }
                                String string3 = h2.getString(2);
                                if (string3 != null) {
                                    bVar2.f324994a = C111712c.m152280c(string3);
                                }
                                arrayDeque = arrayDeque2;
                                fVar = fVar3;
                                gVar = gVar2;
                                i = depth;
                                typedArray = h2;
                                bVar = bVar2;
                                bVar.f324972f = C111331h.m151815b(h2, xmlPullParser, theme, "fillColor", 1, 0);
                                bVar.f324975i = C111331h.m151816c(typedArray, xmlPullParser2, "fillAlpha", 12, bVar.f324975i);
                                int d2 = C111331h.m151817d(typedArray, xmlPullParser2, "strokeLineCap", 8, -1);
                                Paint.Cap cap = bVar.f324979m;
                                if (d2 == 0) {
                                    i2 = 2;
                                    cap = Paint.Cap.BUTT;
                                } else if (d2 != 1) {
                                    i2 = 2;
                                    if (d2 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                } else {
                                    i2 = 2;
                                    cap = Paint.Cap.ROUND;
                                }
                                bVar.f324979m = cap;
                                int d3 = C111331h.m151817d(typedArray, xmlPullParser2, "strokeLineJoin", 9, -1);
                                Paint.Join join = bVar.f324980n;
                                if (d3 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (d3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (d3 == i2) {
                                    join = Paint.Join.BEVEL;
                                }
                                bVar.f324980n = join;
                                bVar.f324981o = C111331h.m151816c(typedArray, xmlPullParser2, "strokeMiterLimit", 10, bVar.f324981o);
                                bVar.f324970d = C111331h.m151815b(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                                bVar.f324973g = C111331h.m151816c(typedArray, xmlPullParser2, "strokeAlpha", 11, bVar.f324973g);
                                bVar.f324971e = C111331h.m151816c(typedArray, xmlPullParser2, "strokeWidth", 4, bVar.f324971e);
                                bVar.f324977k = C111331h.m151816c(typedArray, xmlPullParser2, "trimPathEnd", 6, bVar.f324977k);
                                bVar.f324978l = C111331h.m151816c(typedArray, xmlPullParser2, "trimPathOffset", 7, bVar.f324978l);
                                bVar.f324976j = C111331h.m151816c(typedArray, xmlPullParser2, "trimPathStart", 5, bVar.f324976j);
                                bVar.f324974h = C111331h.m151817d(typedArray, xmlPullParser2, "fillType", 13, bVar.f324974h);
                            }
                            typedArray.recycle();
                            cVar.f324983b.add(bVar);
                            if (bVar.getPathName() != null) {
                                fVar.f325012o.put(bVar.getPathName(), bVar);
                            }
                            gVar4.f325013a |= bVar.f324996c;
                            arrayDeque2 = arrayDeque;
                            z = false;
                        } else {
                            ArrayDeque arrayDeque3 = arrayDeque2;
                            fVar = fVar3;
                            gVar = gVar2;
                            i = depth;
                            if ("clip-path".equals(name)) {
                                C108562a aVar = new C108562a();
                                if (C111331h.m151820g(xmlPullParser2, "pathData")) {
                                    TypedArray h3 = C111331h.m151821h(resources2, theme2, attributeSet2, C108552a.f324941d);
                                    String string4 = h3.getString(0);
                                    if (string4 != null) {
                                        aVar.f324995b = string4;
                                    }
                                    String string5 = h3.getString(1);
                                    if (string5 != null) {
                                        aVar.f324994a = C111712c.m152280c(string5);
                                    }
                                    h3.recycle();
                                }
                                cVar.f324983b.add(aVar);
                                if (aVar.getPathName() != null) {
                                    fVar.f325012o.put(aVar.getPathName(), aVar);
                                }
                                gVar4.f325013a = aVar.f324996c | gVar4.f325013a;
                            } else if ("group".equals(name)) {
                                C108564c cVar2 = new C108564c();
                                TypedArray h4 = C111331h.m151821h(resources2, theme2, attributeSet2, C108552a.f324939b);
                                cVar2.f324984c = C111331h.m151816c(h4, xmlPullParser2, "rotation", 5, cVar2.f324984c);
                                cVar2.f324985d = h4.getFloat(1, cVar2.f324985d);
                                cVar2.f324986e = h4.getFloat(2, cVar2.f324986e);
                                cVar2.f324987f = C111331h.m151816c(h4, xmlPullParser2, "scaleX", 3, cVar2.f324987f);
                                cVar2.f324988g = C111331h.m151816c(h4, xmlPullParser2, "scaleY", 4, cVar2.f324988g);
                                cVar2.f324989h = C111331h.m151816c(h4, xmlPullParser2, "translateX", 6, cVar2.f324989h);
                                cVar2.f324990i = C111331h.m151816c(h4, xmlPullParser2, "translateY", 7, cVar2.f324990i);
                                String string6 = h4.getString(0);
                                if (string6 != null) {
                                    cVar2.f324993l = string6;
                                }
                                cVar2.mo159535c();
                                h4.recycle();
                                cVar.f324983b.add(cVar2);
                                arrayDeque2 = arrayDeque3;
                                arrayDeque2.push(cVar2);
                                if (cVar2.getGroupName() != null) {
                                    fVar.f325012o.put(cVar2.getGroupName(), cVar2);
                                }
                                gVar4.f325013a = cVar2.f324992k | gVar4.f325013a;
                            }
                            arrayDeque2 = arrayDeque3;
                        }
                    } else {
                        fVar = fVar3;
                        gVar = gVar2;
                        i = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque2.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = 2;
                    i4 = 1;
                    i3 = 3;
                    fVar3 = fVar;
                    gVar2 = gVar;
                    depth = i;
                    i6 = 0;
                }
                C108568g gVar5 = gVar2;
                if (!z) {
                    C108568g gVar6 = gVar5;
                    this.f324963f = mo159491a(this.f324963f, gVar6.f325015c, gVar6.f325016d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(h.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(h.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public C108561g(C108568g gVar) {
        this.f324966i = true;
        this.f324967j = new float[9];
        this.f324968n = new Matrix();
        this.f324969o = new Rect();
        this.f324962e = gVar;
        this.f324963f = mo159491a(this.f324963f, gVar.f325015c, gVar.f325016d);
    }

    /* renamed from: j4.g$b */
    public static class C108563b extends C108566e {

        /* renamed from: d */
        public C111318d f324970d;

        /* renamed from: e */
        public float f324971e = 0.0f;

        /* renamed from: f */
        public C111318d f324972f;

        /* renamed from: g */
        public float f324973g = 1.0f;

        /* renamed from: h */
        public int f324974h = 0;

        /* renamed from: i */
        public float f324975i = 1.0f;

        /* renamed from: j */
        public float f324976j = 0.0f;

        /* renamed from: k */
        public float f324977k = 1.0f;

        /* renamed from: l */
        public float f324978l = 0.0f;

        /* renamed from: m */
        public Paint.Cap f324979m = Paint.Cap.BUTT;

        /* renamed from: n */
        public Paint.Join f324980n = Paint.Join.MITER;

        /* renamed from: o */
        public float f324981o = 4.0f;

        public C108563b() {
        }

        /* renamed from: a */
        public boolean mo159517a() {
            return this.f324972f.mo163012b() || this.f324970d.mo163012b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo159518b(int[] r7) {
            /*
                r6 = this;
                v2.d r0 = r6.f324972f
                boolean r1 = r0.mo163012b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001c
                android.content.res.ColorStateList r1 = r0.f333286b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f333287c
                if (r1 == r4) goto L_0x001c
                r0.f333287c = r1
                r0 = 1
                goto L_0x001d
            L_0x001c:
                r0 = 0
            L_0x001d:
                v2.d r1 = r6.f324970d
                boolean r4 = r1.mo163012b()
                if (r4 == 0) goto L_0x0036
                android.content.res.ColorStateList r4 = r1.f333286b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f333287c
                if (r7 == r4) goto L_0x0036
                r1.f333287c = r7
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p906j4.C108561g.C108563b.mo159518b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f324975i;
        }

        public int getFillColor() {
            return this.f324972f.f333287c;
        }

        public float getStrokeAlpha() {
            return this.f324973g;
        }

        public int getStrokeColor() {
            return this.f324970d.f333287c;
        }

        public float getStrokeWidth() {
            return this.f324971e;
        }

        public float getTrimPathEnd() {
            return this.f324977k;
        }

        public float getTrimPathOffset() {
            return this.f324978l;
        }

        public float getTrimPathStart() {
            return this.f324976j;
        }

        public void setFillAlpha(float f) {
            this.f324975i = f;
        }

        public void setFillColor(int i) {
            this.f324972f.f333287c = i;
        }

        public void setStrokeAlpha(float f) {
            this.f324973g = f;
        }

        public void setStrokeColor(int i) {
            this.f324970d.f333287c = i;
        }

        public void setStrokeWidth(float f) {
            this.f324971e = f;
        }

        public void setTrimPathEnd(float f) {
            this.f324977k = f;
        }

        public void setTrimPathOffset(float f) {
            this.f324978l = f;
        }

        public void setTrimPathStart(float f) {
            this.f324976j = f;
        }

        public C108563b(C108563b bVar) {
            super(bVar);
            this.f324970d = bVar.f324970d;
            this.f324971e = bVar.f324971e;
            this.f324973g = bVar.f324973g;
            this.f324972f = bVar.f324972f;
            this.f324974h = bVar.f324974h;
            this.f324975i = bVar.f324975i;
            this.f324976j = bVar.f324976j;
            this.f324977k = bVar.f324977k;
            this.f324978l = bVar.f324978l;
            this.f324979m = bVar.f324979m;
            this.f324980n = bVar.f324980n;
            this.f324981o = bVar.f324981o;
        }
    }

    /* renamed from: j4.g$c */
    public static class C108564c extends C108565d {

        /* renamed from: a */
        public final Matrix f324982a;

        /* renamed from: b */
        public final ArrayList<C108565d> f324983b;

        /* renamed from: c */
        public float f324984c;

        /* renamed from: d */
        public float f324985d;

        /* renamed from: e */
        public float f324986e;

        /* renamed from: f */
        public float f324987f;

        /* renamed from: g */
        public float f324988g;

        /* renamed from: h */
        public float f324989h;

        /* renamed from: i */
        public float f324990i;

        /* renamed from: j */
        public final Matrix f324991j;

        /* renamed from: k */
        public int f324992k;

        /* renamed from: l */
        public String f324993l;

        public C108564c() {
            this.f324982a = new Matrix();
            this.f324983b = new ArrayList<>();
            this.f324984c = 0.0f;
            this.f324985d = 0.0f;
            this.f324986e = 0.0f;
            this.f324987f = 1.0f;
            this.f324988g = 1.0f;
            this.f324989h = 0.0f;
            this.f324990i = 0.0f;
            this.f324991j = new Matrix();
            this.f324993l = null;
        }

        /* renamed from: a */
        public boolean mo159517a() {
            for (int i = 0; i < this.f324983b.size(); i++) {
                if (this.f324983b.get(i).mo159517a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo159518b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f324983b.size(); i++) {
                z |= this.f324983b.get(i).mo159518b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public final void mo159535c() {
            this.f324991j.reset();
            this.f324991j.postTranslate(-this.f324985d, -this.f324986e);
            this.f324991j.postScale(this.f324987f, this.f324988g);
            this.f324991j.postRotate(this.f324984c, 0.0f, 0.0f);
            this.f324991j.postTranslate(this.f324989h + this.f324985d, this.f324990i + this.f324986e);
        }

        public String getGroupName() {
            return this.f324993l;
        }

        public Matrix getLocalMatrix() {
            return this.f324991j;
        }

        public float getPivotX() {
            return this.f324985d;
        }

        public float getPivotY() {
            return this.f324986e;
        }

        public float getRotation() {
            return this.f324984c;
        }

        public float getScaleX() {
            return this.f324987f;
        }

        public float getScaleY() {
            return this.f324988g;
        }

        public float getTranslateX() {
            return this.f324989h;
        }

        public float getTranslateY() {
            return this.f324990i;
        }

        public void setPivotX(float f) {
            if (f != this.f324985d) {
                this.f324985d = f;
                mo159535c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f324986e) {
                this.f324986e = f;
                mo159535c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f324984c) {
                this.f324984c = f;
                mo159535c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f324987f) {
                this.f324987f = f;
                mo159535c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f324988g) {
                this.f324988g = f;
                mo159535c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f324989h) {
                this.f324989h = f;
                mo159535c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f324990i) {
                this.f324990i = f;
                mo159535c();
            }
        }

        public C108564c(C108564c cVar, C111055b<String, Object> bVar) {
            C108566e eVar;
            this.f324982a = new Matrix();
            this.f324983b = new ArrayList<>();
            this.f324984c = 0.0f;
            this.f324985d = 0.0f;
            this.f324986e = 0.0f;
            this.f324987f = 1.0f;
            this.f324988g = 1.0f;
            this.f324989h = 0.0f;
            this.f324990i = 0.0f;
            Matrix matrix = new Matrix();
            this.f324991j = matrix;
            this.f324993l = null;
            this.f324984c = cVar.f324984c;
            this.f324985d = cVar.f324985d;
            this.f324986e = cVar.f324986e;
            this.f324987f = cVar.f324987f;
            this.f324988g = cVar.f324988g;
            this.f324989h = cVar.f324989h;
            this.f324990i = cVar.f324990i;
            String str = cVar.f324993l;
            this.f324993l = str;
            this.f324992k = cVar.f324992k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f324991j);
            ArrayList<C108565d> arrayList = cVar.f324983b;
            for (int i = 0; i < arrayList.size(); i++) {
                C108565d dVar = arrayList.get(i);
                if (dVar instanceof C108564c) {
                    this.f324983b.add(new C108564c((C108564c) dVar, bVar));
                } else {
                    if (dVar instanceof C108563b) {
                        eVar = new C108563b((C108563b) dVar);
                    } else if (dVar instanceof C108562a) {
                        eVar = new C108562a((C108562a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f324983b.add(eVar);
                    String str2 = eVar.f324995b;
                    if (str2 != null) {
                        bVar.put(str2, eVar);
                    }
                }
            }
        }
    }

    /* renamed from: j4.g$f */
    public static class C108567f {

        /* renamed from: p */
        public static final Matrix f324997p = new Matrix();

        /* renamed from: a */
        public final Path f324998a;

        /* renamed from: b */
        public final Path f324999b;

        /* renamed from: c */
        public final Matrix f325000c;

        /* renamed from: d */
        public Paint f325001d;

        /* renamed from: e */
        public Paint f325002e;

        /* renamed from: f */
        public PathMeasure f325003f;

        /* renamed from: g */
        public final C108564c f325004g;

        /* renamed from: h */
        public float f325005h;

        /* renamed from: i */
        public float f325006i;

        /* renamed from: j */
        public float f325007j;

        /* renamed from: k */
        public float f325008k;

        /* renamed from: l */
        public int f325009l;

        /* renamed from: m */
        public String f325010m;

        /* renamed from: n */
        public Boolean f325011n;

        /* renamed from: o */
        public final C111055b<String, Object> f325012o;

        public C108567f() {
            this.f325000c = new Matrix();
            this.f325005h = 0.0f;
            this.f325006i = 0.0f;
            this.f325007j = 0.0f;
            this.f325008k = 0.0f;
            this.f325009l = 255;
            this.f325010m = null;
            this.f325011n = null;
            this.f325012o = new C111055b<>();
            this.f325004g = new C108564c();
            this.f324998a = new Path();
            this.f324999b = new Path();
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        /* renamed from: a */
        public final void mo159555a(C108564c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            C108567f fVar;
            boolean z;
            C108567f fVar2 = this;
            C108564c cVar2 = cVar;
            Canvas canvas2 = canvas;
            ColorFilter colorFilter2 = colorFilter;
            cVar2.f324982a.set(matrix);
            cVar2.f324982a.preConcat(cVar2.f324991j);
            canvas.save();
            ? r112 = 0;
            C108567f fVar3 = fVar2;
            int i3 = 0;
            while (i3 < cVar2.f324983b.size()) {
                C108565d dVar = cVar2.f324983b.get(i3);
                if (dVar instanceof C108564c) {
                    mo159555a((C108564c) dVar, cVar2.f324982a, canvas, i, i2, colorFilter);
                } else if (dVar instanceof C108566e) {
                    C108566e eVar = (C108566e) dVar;
                    float f = ((float) i) / fVar3.f325007j;
                    float f2 = ((float) i2) / fVar3.f325008k;
                    float min = Math.min(f, f2);
                    Matrix matrix2 = cVar2.f324982a;
                    fVar3.f325000c.set(matrix2);
                    fVar3.f325000c.postScale(f, f2);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f3 = min;
                    float f4 = (fArr[r112] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r112], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                    if (abs == 0.0f) {
                        fVar = this;
                    } else {
                        fVar = this;
                        Path path = fVar.f324998a;
                        eVar.getClass();
                        path.reset();
                        C111712c.C111713a[] aVarArr = eVar.f324994a;
                        if (aVarArr != null) {
                            C111712c.C111713a.m152284b(aVarArr, path);
                        }
                        Path path2 = fVar.f324998a;
                        fVar.f324999b.reset();
                        if (eVar instanceof C108562a) {
                            fVar.f324999b.addPath(path2, fVar.f325000c);
                            canvas2.clipPath(fVar.f324999b);
                        } else {
                            C108563b bVar = (C108563b) eVar;
                            float f5 = bVar.f324976j;
                            if (!(f5 == 0.0f && bVar.f324977k == 1.0f)) {
                                float f6 = bVar.f324978l;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (bVar.f324977k + f6) % 1.0f;
                                if (fVar.f325003f == null) {
                                    fVar.f325003f = new PathMeasure();
                                }
                                fVar.f325003f.setPath(fVar.f324998a, r112);
                                float length = fVar.f325003f.getLength();
                                float f9 = f7 * length;
                                float f15 = f8 * length;
                                path2.reset();
                                if (f9 > f15) {
                                    fVar.f325003f.getSegment(f9, length, path2, true);
                                    fVar.f325003f.getSegment(0.0f, f15, path2, true);
                                } else {
                                    fVar.f325003f.getSegment(f9, f15, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            fVar.f324999b.addPath(path2, fVar.f325000c);
                            C111318d dVar2 = bVar.f324972f;
                            if ((dVar2.f333285a != null) || dVar2.f333287c != 0) {
                                if (fVar.f325002e == null) {
                                    Paint paint = new Paint(1);
                                    fVar.f325002e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = fVar.f325002e;
                                Shader shader = dVar2.f333285a;
                                if (shader != null) {
                                    shader.setLocalMatrix(fVar.f325000c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.f324975i * 255.0f));
                                } else {
                                    int i4 = dVar2.f333287c;
                                    float f16 = bVar.f324975i;
                                    PorterDuff.Mode mode = C108561g.f324961p;
                                    paint2.setColor((i4 & 16777215) | (((int) (((float) Color.alpha(i4)) * f16)) << 24));
                                }
                                paint2.setColorFilter(colorFilter2);
                                fVar.f324999b.setFillType(bVar.f324974h == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas2.drawPath(fVar.f324999b, paint2);
                            }
                            C111318d dVar3 = bVar.f324970d;
                            if ((dVar3.f333285a != null) || dVar3.f333287c != 0) {
                                if (fVar.f325001d == null) {
                                    z = true;
                                    Paint paint3 = new Paint(1);
                                    fVar.f325001d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z = true;
                                }
                                Paint paint4 = fVar.f325001d;
                                Paint.Join join = bVar.f324980n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f324979m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f324981o);
                                Shader shader2 = dVar3.f333285a;
                                if (shader2 == null) {
                                    z = false;
                                }
                                if (z) {
                                    shader2.setLocalMatrix(fVar.f325000c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f324973g * 255.0f));
                                } else {
                                    int i5 = dVar3.f333287c;
                                    float f17 = bVar.f324973g;
                                    PorterDuff.Mode mode2 = C108561g.f324961p;
                                    paint4.setColor((i5 & 16777215) | (((int) (((float) Color.alpha(i5)) * f17)) << 24));
                                }
                                paint4.setColorFilter(colorFilter2);
                                paint4.setStrokeWidth(bVar.f324971e * abs * f3);
                                canvas2.drawPath(fVar.f324999b, paint4);
                            }
                        }
                    }
                    fVar3 = fVar;
                    i3++;
                    fVar2 = fVar;
                    r112 = 0;
                }
                int i6 = i;
                int i7 = i2;
                fVar = fVar2;
                i3++;
                fVar2 = fVar;
                r112 = 0;
            }
            C108567f fVar4 = fVar2;
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f325009l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f325009l = i;
        }

        public C108567f(C108567f fVar) {
            this.f325000c = new Matrix();
            this.f325005h = 0.0f;
            this.f325006i = 0.0f;
            this.f325007j = 0.0f;
            this.f325008k = 0.0f;
            this.f325009l = 255;
            this.f325010m = null;
            this.f325011n = null;
            C111055b<String, Object> bVar = new C111055b<>();
            this.f325012o = bVar;
            this.f325004g = new C108564c(fVar.f325004g, bVar);
            this.f324998a = new Path(fVar.f324998a);
            this.f324999b = new Path(fVar.f324999b);
            this.f325005h = fVar.f325005h;
            this.f325006i = fVar.f325006i;
            this.f325007j = fVar.f325007j;
            this.f325008k = fVar.f325008k;
            this.f325009l = fVar.f325009l;
            this.f325010m = fVar.f325010m;
            String str = fVar.f325010m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f325011n = fVar.f325011n;
        }
    }
}
