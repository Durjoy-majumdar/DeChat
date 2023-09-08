package com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.widget;

import a73.C103319d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.C106550a;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import g73.C107761f;
import g73.C107762g;
import g73.C75893h;
import h73.C108149a;
import h73.C108150b;
import h73.C108151c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg3.C76577a;
import lg3.C76695c;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import p823sg.C77710q;
import p823sg.C90193h;
import te3.C49666h63;
import te3.C51018qv3;
import te3.C64437i63;
import te3.C64551mb3;
import te3.C64576nb3;

/* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView */
public class PatternLockView extends View {

    /* renamed from: A */
    public Bitmap f318335A;

    /* renamed from: B */
    public float f318336B;

    /* renamed from: C */
    public float f318337C;

    /* renamed from: D */
    public boolean f318338D;

    /* renamed from: E */
    public long f318339E;

    /* renamed from: F */
    public int f318340F;

    /* renamed from: G */
    public int f318341G;

    /* renamed from: H */
    public float f318342H;

    /* renamed from: I */
    public float f318343I;

    /* renamed from: J */
    public C106552a f318344J;

    /* renamed from: d */
    public Paint f318345d = new Paint();

    /* renamed from: e */
    public Paint f318346e = new Paint();

    /* renamed from: f */
    public Path f318347f = new Path();

    /* renamed from: g */
    public Matrix f318348g = new Matrix();

    /* renamed from: h */
    public Rect f318349h = new Rect();

    /* renamed from: i */
    public Rect f318350i = new Rect();

    /* renamed from: j */
    public ArrayList<C75893h> f318351j = new ArrayList<>(9);

    /* renamed from: n */
    public boolean[][] f318352n = ((boolean[][]) Array.newInstance(Boolean.TYPE, new int[]{3, 3}));

    /* renamed from: o */
    public C106554c f318353o;

    /* renamed from: p */
    public int f318354p;

    /* renamed from: q */
    public int f318355q;

    /* renamed from: r */
    public float f318356r;

    /* renamed from: s */
    public boolean f318357s;

    /* renamed from: t */
    public boolean f318358t;

    /* renamed from: u */
    public boolean f318359u;

    /* renamed from: v */
    public int f318360v;

    /* renamed from: w */
    public C106553b f318361w;

    /* renamed from: x */
    public Bitmap f318362x;

    /* renamed from: y */
    public Bitmap f318363y;

    /* renamed from: z */
    public Bitmap f318364z;

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView$a */
    public interface C106552a {
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView$b */
    public enum C106553b {
        Correct,
        Wrong,
        Animate
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView$c */
    public enum C106554c {
        Square,
        Rectangle
    }

    public PatternLockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106554c cVar = C106554c.Square;
        this.f318353o = cVar;
        this.f318354p = 6;
        this.f318355q = 200;
        this.f318356r = 0.66f;
        this.f318357s = false;
        this.f318358t = true;
        this.f318359u = false;
        this.f318360v = isInEditMode() ? -1 : getResources().getColor(C0966R.color.f2939n);
        this.f318361w = C106553b.Correct;
        this.f318362x = null;
        this.f318363y = null;
        this.f318364z = null;
        this.f318335A = null;
        this.f318336B = -1.0f;
        this.f318337C = -1.0f;
        this.f318338D = false;
        this.f318339E = 0;
        this.f318340F = 0;
        this.f318341G = 0;
        this.f318342H = 0.0f;
        this.f318343I = 0.0f;
        this.f318344J = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C103319d.f304624a);
        this.f318358t = obtainStyledAttributes.getBoolean(4, this.f318358t);
        this.f318355q = obtainStyledAttributes.getInt(1, this.f318355q);
        this.f318354p = obtainStyledAttributes.getInt(2, this.f318354p);
        this.f318357s = obtainStyledAttributes.getBoolean(0, this.f318357s);
        int i = obtainStyledAttributes.getInt(3, this.f318353o.ordinal());
        if (i == 0) {
            this.f318353o = cVar;
        } else if (i != 1) {
            this.f318353o = cVar;
        } else {
            this.f318353o = C106554c.Rectangle;
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
        this.f318346e.setStyle(Paint.Style.STROKE);
        this.f318346e.setStrokeJoin(Paint.Join.ROUND);
        this.f318346e.setStrokeCap(Paint.Cap.ROUND);
        this.f318346e.setAntiAlias(true);
        this.f318346e.setDither(false);
        this.f318346e.setAlpha(this.f318355q);
        this.f318345d.setAntiAlias(true);
        this.f318345d.setDither(true);
        if (!isInEditMode()) {
            if (this.f318362x == null) {
                this.f318362x = mo153228e(C76577a.m92158i(getContext(), C0966R.C0969drawable.a88));
                Bitmap e = mo153228e(C76577a.m92158i(getContext(), C76695c.m92341b() ? C0966R.C0969drawable.a8_ : C0966R.C0969drawable.a89));
                this.f318363y = e;
                this.f318364z = e;
                this.f318335A = mo153228e(C76577a.m92158i(getContext(), C76695c.m92341b() ? C0966R.C0969drawable.a8b : C0966R.C0969drawable.a8a));
            }
            this.f318354p = (int) (((float) this.f318354p) * BitmapUtil.getDefaultDisplayMetrics().density);
            Bitmap[] bitmapArr = {this.f318362x, this.f318363y, this.f318364z, this.f318335A};
            for (int i2 = 0; i2 < 4; i2++) {
                Bitmap bitmap = bitmapArr[i2];
                this.f318340F = Math.max(bitmap.getWidth(), this.f318340F);
                this.f318341G = Math.max(bitmap.getHeight(), this.f318341G);
            }
        }
    }

    /* renamed from: a */
    public final void mo153224a() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.f318352n[i][i2] = false;
            }
        }
    }

    /* renamed from: b */
    public void mo153225b() {
        this.f318351j.clear();
        mo153224a();
        C106553b bVar = C106553b.Correct;
        this.f318361w = bVar;
        invalidate();
        if (this.f318344J != null) {
            setDisplayMode(bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g73.C75893h mo153226c(float r11, float r12) {
        /*
            r10 = this;
            float r0 = r10.f318343I
            float r1 = r10.f318356r
            float r1 = r1 * r0
            int r2 = r10.getPaddingTop()
            float r2 = (float) r2
            float r3 = r0 - r1
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r2 = r2 + r3
            r3 = 0
            r5 = 0
        L_0x0013:
            r6 = -1
            r7 = 3
            if (r5 >= r7) goto L_0x0028
            float r8 = (float) r5
            float r8 = r8 * r0
            float r8 = r8 + r2
            int r9 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x0025
            float r8 = r8 + r1
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            int r5 = r5 + 1
            goto L_0x0013
        L_0x0028:
            r5 = -1
        L_0x0029:
            r12 = 0
            if (r5 < 0) goto L_0x005e
            float r0 = r10.f318342H
            float r1 = r10.f318356r
            float r1 = r1 * r0
            int r2 = r10.getPaddingLeft()
            float r2 = (float) r2
            float r8 = r0 - r1
            float r8 = r8 / r4
            float r2 = r2 + r8
        L_0x003b:
            if (r3 >= r7) goto L_0x004f
            float r4 = (float) r3
            float r4 = r4 * r0
            float r4 = r4 + r2
            int r8 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x004c
            float r4 = r4 + r1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x004c
            r6 = r3
            goto L_0x004f
        L_0x004c:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x004f:
            if (r6 < 0) goto L_0x005e
            boolean[][] r11 = r10.f318352n
            r11 = r11[r5]
            boolean r11 = r11[r6]
            if (r11 != 0) goto L_0x005e
            g73.h r11 = g73.C75893h.m91153a(r5, r6)
            goto L_0x005f
        L_0x005e:
            r11 = r12
        L_0x005f:
            if (r11 == 0) goto L_0x0087
            boolean[][] r12 = r10.f318352n
            int r0 = r11.f222569a
            r12 = r12[r0]
            int r0 = r11.f222570b
            r1 = 1
            r12[r0] = r1
            java.util.ArrayList<g73.h> r12 = r10.f318351j
            r12.add(r11)
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView$a r12 = r10.f318344J
            if (r12 == 0) goto L_0x007f
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<g73.h> r2 = r10.f318351j
            r0.<init>(r2)
            r12.getClass()
        L_0x007f:
            boolean r12 = r10.f318357s
            if (r12 == 0) goto L_0x0086
            r10.performHapticFeedback(r1, r7)
        L_0x0086:
            return r11
        L_0x0087:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.widget.PatternLockView.mo153226c(float, float):g73.h");
    }

    /* renamed from: d */
    public final void mo153227d(Canvas canvas, int i, int i2, boolean z) {
        Bitmap bitmap;
        C106553b bVar = C106553b.Wrong;
        if (!z || (!this.f318358t && this.f318361w != bVar)) {
            bitmap = this.f318362x;
        } else if (this.f318338D) {
            bitmap = this.f318363y;
        } else {
            C106553b bVar2 = this.f318361w;
            if (bVar2 == bVar) {
                bitmap = this.f318335A;
            } else if (bVar2 == C106553b.Correct || bVar2 == C106553b.Animate) {
                bitmap = this.f318364z;
            } else {
                throw new IllegalStateException("unknown display mode " + this.f318361w);
            }
        }
        int i3 = this.f318340F;
        int i4 = this.f318341G;
        float f = this.f318342H;
        int i5 = (int) ((this.f318343I - ((float) i4)) * 0.5f);
        float f2 = getResources().getDisplayMetrics().density * 33.0f;
        float min = Math.min((this.f318342H - f2) / ((float) this.f318340F), 1.0f);
        float min2 = Math.min((this.f318343I - f2) / ((float) this.f318341G), 1.0f);
        this.f318348g.setTranslate((float) (i + ((int) ((f - ((float) i3)) * 0.5f))), (float) (i2 + i5));
        this.f318348g.preTranslate((float) (this.f318340F / 2), (float) (this.f318341G / 2));
        this.f318348g.preScale(min, min2);
        this.f318348g.preTranslate((float) ((-this.f318340F) / 2), (float) ((-this.f318341G) / 2));
        if (!isInEditMode()) {
            canvas.drawBitmap(bitmap, this.f318348g, this.f318345d);
        }
    }

    /* renamed from: e */
    public final Bitmap mo153228e(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: f */
    public final float mo153229f(int i) {
        float f = this.f318342H;
        return ((float) getPaddingLeft()) + (((float) i) * f) + (f * 0.5f);
    }

    /* renamed from: g */
    public final float mo153230g(int i) {
        float f = this.f318343I;
        return ((float) getPaddingTop()) + (((float) i) * f) + (f * 0.5f);
    }

    public boolean getDisplayLine() {
        return this.f318358t;
    }

    public boolean getEnableHapticFeedback() {
        return this.f318357s;
    }

    public boolean getEnableInput() {
        return this.f318359u;
    }

    public List<C75893h> getPattern() {
        return new ArrayList(this.f318351j);
    }

    public int getSuggestedMinimumHeight() {
        return (int) ((((double) ((float) this.f318341G)) * 3.0d) / ((double) getResources().getDisplayMetrics().density));
    }

    public int getSuggestedMinimumWidth() {
        return (int) ((((double) ((float) this.f318340F)) * 3.0d) / ((double) getResources().getDisplayMetrics().density));
    }

    public void onDraw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        C106553b bVar = C106553b.Animate;
        ArrayList<C75893h> arrayList = this.f318351j;
        int size = arrayList.size();
        boolean[][] zArr = this.f318352n;
        if (this.f318361w == bVar) {
            int elapsedRealtime = ((int) (SystemClock.elapsedRealtime() - this.f318339E)) % ((size + 1) * 700);
            int i = elapsedRealtime / 700;
            mo153224a();
            for (int i2 = 0; i2 < i; i2++) {
                C75893h hVar = arrayList.get(i2);
                zArr[hVar.f222569a][hVar.f222570b] = true;
            }
            if (i > 0 && i < size) {
                float f2 = ((float) (elapsedRealtime % 700)) / 700.0f;
                C75893h hVar2 = arrayList.get(i - 1);
                float f3 = mo153229f(hVar2.f222570b);
                float g = mo153230g(hVar2.f222569a);
                C75893h hVar3 = arrayList.get(i);
                this.f318336B = f3 + ((mo153229f(hVar3.f222570b) - f3) * f2);
                this.f318337C = g + (f2 * (mo153230g(hVar3.f222569a) - g));
            }
            invalidate();
        }
        this.f318346e.setColor(this.f318360v);
        this.f318346e.setStrokeWidth((float) this.f318354p);
        Path path = this.f318347f;
        path.rewind();
        boolean z = this.f318358t || this.f318361w == C106553b.Wrong;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        float f4 = this.f318342H;
        float f5 = this.f318343I;
        boolean z2 = (this.f318345d.getFlags() & 2) != 0;
        this.f318345d.setFilterBitmap(true);
        int i3 = 0;
        while (i3 < 3) {
            float f6 = ((float) paddingTop) + (((float) i3) * f5);
            boolean z3 = z2;
            int i4 = 0;
            while (i4 < 3) {
                int i5 = paddingLeft;
                float f7 = ((float) paddingLeft) + (((float) i4) * f4);
                boolean z4 = zArr[i3][i4];
                if (!z4) {
                    f = f4;
                    mo153227d(canvas2, (int) f7, (int) f6, z4);
                } else {
                    f = f4;
                }
                i4++;
                paddingLeft = i5;
                f4 = f;
            }
            int i6 = paddingLeft;
            float f8 = f4;
            i3++;
            z2 = z3;
        }
        int i7 = paddingLeft;
        float f9 = f4;
        boolean z5 = z2;
        if (z) {
            int i8 = 0;
            boolean z6 = false;
            while (i8 < size) {
                C75893h hVar4 = arrayList.get(i8);
                boolean[] zArr2 = zArr[hVar4.f222569a];
                int i9 = hVar4.f222570b;
                if (!zArr2[i9]) {
                    break;
                }
                float f15 = mo153229f(i9);
                float g2 = mo153230g(hVar4.f222569a);
                if (i8 == 0) {
                    path.moveTo(f15, g2);
                } else {
                    path.lineTo(f15, g2);
                }
                i8++;
                z6 = true;
            }
            if ((this.f318338D || this.f318361w == bVar) && z6) {
                path.lineTo(this.f318336B, this.f318337C);
            }
            canvas2.drawPath(path, this.f318346e);
        }
        for (int i15 = 0; i15 < 3; i15++) {
            float f16 = ((float) paddingTop) + (((float) i15) * f5);
            int i16 = 0;
            while (i16 < 3) {
                int i17 = i7;
                float f17 = ((float) i17) + (((float) i16) * f9);
                boolean z7 = zArr[i15][i16];
                if (z7) {
                    mo153227d(canvas2, (int) f17, (int) f16, z7);
                }
                i16++;
                i7 = i17;
            }
            int i18 = i7;
        }
        this.f318345d.setFilterBitmap(z5);
    }

    public void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.max(size, suggestedMinimumWidth);
        } else if (mode != 0) {
            suggestedMinimumWidth = size;
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.max(size2, suggestedMinimumHeight);
        } else if (mode2 != 0) {
            suggestedMinimumHeight = size2;
        }
        if (this.f318353o == C106554c.Square) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, suggestedMinimumHeight);
            suggestedMinimumHeight = suggestedMinimumWidth;
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        C106553b bVar = C106553b.Correct;
        String str = savedState.f318365d;
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            byte[] bytes = str.getBytes();
            for (byte b : bytes) {
                arrayList.add(C75893h.m91153a(b / 3, b % 3));
            }
            this.f318351j.clear();
            mo153224a();
            this.f318351j.addAll(arrayList);
            Iterator<C75893h> it = this.f318351j.iterator();
            while (it.hasNext()) {
                C75893h next = it.next();
                this.f318352n[next.f222569a][next.f222570b] = true;
            }
            setDisplayMode(bVar);
            this.f318361w = C106553b.values()[savedState.f318366e];
            this.f318358t = savedState.f318367f;
            this.f318359u = savedState.f318368g;
            this.f318357s = savedState.f318369h;
            return;
        }
        throw new IllegalArgumentException("Serialized pattern is null");
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        ArrayList<C75893h> arrayList = this.f318351j;
        if (arrayList != null) {
            int size = arrayList.size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                C75893h hVar = arrayList.get(i);
                bArr[i] = (byte) ((hVar.f222569a * 3) + hVar.f222570b);
            }
            return new SavedState(onSaveInstanceState, new String(bArr), this.f318361w.ordinal(), this.f318358t, this.f318359u, this.f318357s);
        }
        throw new IllegalArgumentException("pattern is null");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f318342H = ((float) ((i - getPaddingLeft()) - getPaddingRight())) / 3.0f;
        this.f318343I = ((float) ((i2 - getPaddingTop()) - getPaddingBottom())) / 3.0f;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        C106553b bVar = C106553b.Correct;
        int i = 0;
        if (!this.f318359u || !isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        float f = 0.5f;
        if (action == 0) {
            this.f318351j.clear();
            mo153224a();
            this.f318361w = bVar;
            invalidate();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            C75893h c = mo153226c(x, y);
            if (c != null) {
                this.f318338D = true;
                this.f318361w = bVar;
            } else {
                this.f318338D = false;
            }
            if (c != null) {
                float f2 = mo153229f(c.f222570b);
                float g = mo153230g(c.f222569a);
                float f3 = this.f318342H * 0.5f;
                float f4 = this.f318343I * 0.5f;
                invalidate((int) (f2 - f3), (int) (g - f4), (int) (f2 + f3), (int) (g + f4));
            }
            this.f318336B = x;
            this.f318337C = y;
            return true;
        } else if (action == 1) {
            if (!this.f318351j.isEmpty()) {
                this.f318338D = false;
                C106552a aVar = this.f318344J;
                if (aVar != null) {
                    ArrayList arrayList = new ArrayList(this.f318351j);
                    GestureGuardLogicUI gestureGuardLogicUI = (GestureGuardLogicUI) aVar;
                    int i2 = gestureGuardLogicUI.f318301f;
                    if (i2 == 16) {
                        if (arrayList.size() < 4) {
                            setEnableInput(false);
                            setDisplayMode(C106553b.Wrong);
                            gestureGuardLogicUI.mo153214Q7(String.format(gestureGuardLogicUI.getString(C0966R.string.fe5), new Object[]{4}), new C106550a(gestureGuardLogicUI, this));
                        } else {
                            gestureGuardLogicUI.f318305j = arrayList;
                            mo153225b();
                            gestureGuardLogicUI.f318301f = 17;
                            gestureGuardLogicUI.mo153213P7(2, true);
                            gestureGuardLogicUI.mo153210M7();
                        }
                    } else if (i2 == 0) {
                        C108149a aVar2 = new C108149a(gestureGuardLogicUI, arrayList);
                        C64576nb3 c2 = C107761f.m145986c();
                        C64551mb3 b = C107761f.m145985b();
                        C115669n.INSTANCE.mo160131h(11453, new Object[0]);
                        gestureGuardLogicUI.mo153215R7(new C108150b(gestureGuardLogicUI));
                        boolean h = C107762g.m146000h(c2);
                        boolean g2 = C107762g.m145999g(b);
                        boolean z2 = !g2 || (h && b.f184274e < c2.f184452d);
                        Log.m105924i("MicroMsg.GestureGuardLogicUI", String.format("isInfoValid:%b, isBuffValid:%b, verify by server:%b", new Object[]{Boolean.valueOf(h), Boolean.valueOf(g2), Boolean.valueOf(z2)}));
                        if (z2) {
                            C47350c.C47352b bVar2 = new C47350c.C47352b();
                            bVar2.f127066a = new C49666h63();
                            bVar2.f127067b = new C64437i63();
                            bVar2.f127069d = 689;
                            bVar2.f127068c = "/cgi-bin/micromsg-bin/oppatternlock";
                            C47350c a = bVar2.mo72403a();
                            C49666h63 h632 = (C49666h63) a.f127055a.f127080a;
                            h632.f134461d = 2;
                            C51018qv3 qv32 = new C51018qv3();
                            qv32.mo73350k(C107762g.m145995c(arrayList));
                            h632.f134462e = qv32;
                            C89144l0.m111429e(a, new C108151c(gestureGuardLogicUI, aVar2), false);
                        } else {
                            gestureGuardLogicUI.mo153206I7();
                            C64551mb3 b2 = C107761f.m145985b();
                            if (b2 == null) {
                                z = true;
                            } else {
                                z = new String(b2.f184275f.f140574f.f257327a).equals(C90193h.m112878f((new C77710q(C86709a0.m107523b().mo121110g()).longValue() + '_' + new String(C107762g.m145995c(arrayList))).getBytes()));
                            }
                            if (z) {
                                aVar2.mo1488a(3, 0, (String) null, (C47350c) null, (C117747y) null);
                            } else {
                                aVar2.mo1488a(3, -3, (String) null, (C47350c) null, (C117747y) null);
                            }
                        }
                    } else if (i2 == 17) {
                        if (gestureGuardLogicUI.f318305j.equals(arrayList)) {
                            mo153225b();
                            gestureGuardLogicUI.f318307o = false;
                            gestureGuardLogicUI.f318308p = 0;
                            C107761f.m145989f();
                            C107761f.m145987d();
                            C107761f.m145988e();
                            C107761f.f322498a = -1;
                            gestureGuardLogicUI.f318301f = 18;
                        } else {
                            gestureGuardLogicUI.f318301f = 19;
                        }
                        gestureGuardLogicUI.mo153210M7();
                    }
                }
                invalidate();
            }
            return true;
        } else if (action == 2) {
            float f5 = (float) this.f318354p;
            int historySize = motionEvent.getHistorySize();
            this.f318349h.setEmpty();
            boolean z3 = false;
            while (i < historySize + 1) {
                float historicalX = i < historySize ? motionEvent2.getHistoricalX(i) : motionEvent.getX();
                float historicalY = i < historySize ? motionEvent2.getHistoricalY(i) : motionEvent.getY();
                C75893h c3 = mo153226c(historicalX, historicalY);
                int size = this.f318351j.size();
                if (c3 != null && size == 1) {
                    this.f318338D = true;
                }
                float abs = Math.abs(historicalX - this.f318336B);
                float abs2 = Math.abs(historicalY - this.f318337C);
                if (abs > 0.0f || abs2 > 0.0f) {
                    z3 = true;
                }
                if (this.f318338D && size > 0) {
                    C75893h hVar = this.f318351j.get(size - 1);
                    float f6 = mo153229f(hVar.f222570b);
                    float g3 = mo153230g(hVar.f222569a);
                    float min = Math.min(f6, historicalX) - f5;
                    float max = Math.max(f6, historicalX) + f5;
                    float min2 = Math.min(g3, historicalY) - f5;
                    float max2 = Math.max(g3, historicalY) + f5;
                    if (c3 != null) {
                        float f7 = this.f318342H * f;
                        float f8 = this.f318343I * f;
                        float f9 = mo153229f(c3.f222570b);
                        float g4 = mo153230g(c3.f222569a);
                        min = Math.min(f9 - f7, min);
                        max = Math.max(f9 + f7, max);
                        min2 = Math.min(g4 - f8, min2);
                        max2 = Math.max(g4 + f8, max2);
                    }
                    this.f318349h.union(Math.round(min), Math.round(min2), Math.round(max), Math.round(max2));
                }
                i++;
                f = 0.5f;
            }
            float x2 = motionEvent.getX();
            this.f318336B = x2;
            if (x2 < ((float) (getPaddingLeft() + this.f318354p))) {
                this.f318336B = (float) (getPaddingLeft() + this.f318354p);
            } else if (this.f318336B > ((float) (((getPaddingLeft() + getWidth()) - getPaddingRight()) - this.f318354p))) {
                this.f318336B = (float) (((getPaddingLeft() + getWidth()) - getPaddingRight()) - this.f318354p);
            }
            float y2 = motionEvent.getY();
            this.f318337C = y2;
            if (y2 < ((float) (getPaddingTop() + this.f318354p))) {
                this.f318337C = (float) (getPaddingTop() + this.f318354p);
            } else if (this.f318337C > ((float) (((getPaddingTop() + getHeight()) - getPaddingRight()) - this.f318354p))) {
                this.f318337C = (float) (((getPaddingTop() + getHeight()) - getPaddingBottom()) - this.f318354p);
            }
            if (z3) {
                this.f318350i.union(this.f318349h);
                invalidate(this.f318350i);
                this.f318350i.set(this.f318349h);
            }
            return true;
        } else if (action != 3) {
            return false;
        } else {
            if (this.f318338D) {
                this.f318338D = false;
                this.f318351j.clear();
                mo153224a();
                this.f318361w = bVar;
                invalidate();
                if (this.f318344J != null) {
                    setDisplayMode(bVar);
                }
            }
            return true;
        }
    }

    public void setDisplayLine(boolean z) {
        this.f318358t = z;
        invalidate();
    }

    public void setDisplayMode(C106553b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            this.f318360v = getResources().getColor(C0966R.color.f2939n);
        } else if (ordinal == 1) {
            this.f318360v = getResources().getColor(C0966R.color.f3535wz);
        } else if (ordinal == 2) {
            if (this.f318351j.size() != 0) {
                this.f318359u = false;
                this.f318360v = getResources().getColor(C0966R.color.f2939n);
                C75893h hVar = this.f318351j.get(0);
                this.f318336B = mo153229f(hVar.f222570b);
                this.f318337C = mo153230g(hVar.f222569a);
                mo153224a();
                this.f318339E = SystemClock.elapsedRealtime();
            } else {
                throw new IllegalStateException("You should set a pattern before animating.");
            }
        }
        this.f318361w = bVar;
        invalidate();
    }

    public void setEnableHapticFeedback(boolean z) {
        this.f318357s = z;
    }

    public void setEnableInput(boolean z) {
        this.f318359u = z;
    }

    public void setOnPatternListener(C106552a aVar) {
        this.f318344J = aVar;
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C106551a();

        /* renamed from: d */
        public String f318365d;

        /* renamed from: e */
        public int f318366e;

        /* renamed from: f */
        public boolean f318367f;

        /* renamed from: g */
        public boolean f318368g;

        /* renamed from: h */
        public boolean f318369h;

        /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView$SavedState$a */
        public class C106551a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f318365d = parcel.readString();
            this.f318366e = parcel.readInt();
            this.f318367f = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
            this.f318368g = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
            this.f318369h = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f318365d);
            parcel.writeInt(this.f318366e);
            parcel.writeValue(Boolean.valueOf(this.f318367f));
            parcel.writeValue(Boolean.valueOf(this.f318368g));
            parcel.writeValue(Boolean.valueOf(this.f318369h));
        }

        public SavedState(Parcelable parcelable, String str, int i, boolean z, boolean z2, boolean z3) {
            super(parcelable);
            this.f318365d = str;
            this.f318366e = i;
            this.f318367f = z;
            this.f318368g = z2;
            this.f318369h = z3;
        }
    }
}
