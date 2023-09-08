package com.robinhood.ticker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.tencent.thumbplayer.api.TPOptionalID;
import java.util.HashMap;
import java.util.HashSet;
import p1154s9.C110781a;
import p1154s9.C110782b;

public class TickerView extends View {

    /* renamed from: x */
    public static final Interpolator f309662x = new AccelerateDecelerateInterpolator();

    /* renamed from: d */
    public final Paint f309663d;

    /* renamed from: e */
    public final C104500c f309664e;

    /* renamed from: f */
    public final C110782b f309665f;

    /* renamed from: g */
    public final ValueAnimator f309666g = ValueAnimator.ofFloat(new float[]{1.0f});

    /* renamed from: h */
    public final Rect f309667h = new Rect();

    /* renamed from: i */
    public String f309668i;

    /* renamed from: j */
    public int f309669j;

    /* renamed from: n */
    public int f309670n;

    /* renamed from: o */
    public int f309671o;

    /* renamed from: p */
    public int f309672p;

    /* renamed from: q */
    public float f309673q;

    /* renamed from: r */
    public int f309674r;

    /* renamed from: s */
    public long f309675s;

    /* renamed from: t */
    public long f309676t;

    /* renamed from: u */
    public Interpolator f309677u;

    /* renamed from: v */
    public boolean f309678v;

    /* renamed from: w */
    public String f309679w;

    /* renamed from: com.robinhood.ticker.TickerView$c */
    public enum C67446c {
        ANY,
        UP,
        DOWN
    }

    /* renamed from: com.robinhood.ticker.TickerView$a */
    public class C104494a implements ValueAnimator.AnimatorUpdateListener {
        public C104494a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TickerView.this.f309665f.mo162338a(valueAnimator.getAnimatedFraction());
            TickerView.this.mo147094a();
            TickerView.this.invalidate();
        }
    }

    /* renamed from: com.robinhood.ticker.TickerView$b */
    public class C104495b extends AnimatorListenerAdapter {
        public C104495b() {
        }

        public void onAnimationEnd(Animator animator) {
            C110782b bVar = TickerView.this.f309665f;
            int size = bVar.f331403a.size();
            for (int i = 0; i < size; i++) {
                C104499b bVar2 = bVar.f331403a.get(i);
                bVar2.mo147125a();
                bVar2.f309709n = bVar2.f309707l;
            }
            TickerView.this.mo147094a();
            TickerView.this.invalidate();
        }
    }

    /* renamed from: com.robinhood.ticker.TickerView$d */
    public class C104496d {

        /* renamed from: a */
        public int f309682a;

        /* renamed from: b */
        public int f309683b;

        /* renamed from: c */
        public float f309684c;

        /* renamed from: d */
        public float f309685d;

        /* renamed from: e */
        public float f309686e;

        /* renamed from: f */
        public String f309687f;

        /* renamed from: g */
        public int f309688g = -16777216;

        /* renamed from: h */
        public float f309689h;

        /* renamed from: i */
        public int f309690i;

        public C104496d(TickerView tickerView, Resources resources) {
            this.f309689h = TypedValue.applyDimension(2, 12.0f, resources.getDisplayMetrics());
            this.f309682a = 8388611;
        }

        /* renamed from: a */
        public void mo147123a(TypedArray typedArray) {
            this.f309682a = typedArray.getInt(4, this.f309682a);
            this.f309683b = typedArray.getColor(6, this.f309683b);
            this.f309684c = typedArray.getFloat(7, this.f309684c);
            this.f309685d = typedArray.getFloat(8, this.f309685d);
            this.f309686e = typedArray.getFloat(9, this.f309686e);
            this.f309687f = typedArray.getString(5);
            this.f309688g = typedArray.getColor(3, this.f309688g);
            this.f309689h = typedArray.getDimension(1, this.f309689h);
            this.f309690i = typedArray.getInt(2, this.f309690i);
        }
    }

    public TickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint(1);
        this.f309663d = textPaint;
        C104500c cVar = new C104500c(textPaint);
        this.f309664e = cVar;
        this.f309665f = new C110782b(cVar);
        mo147096c(context, attributeSet, 0, 0);
    }

    /* renamed from: a */
    public final void mo147094a() {
        boolean z = false;
        boolean z2 = this.f309669j != mo147095b();
        if (this.f309670n != ((int) this.f309664e.f309715c) + getPaddingTop() + getPaddingBottom()) {
            z = true;
        }
        if (z2 || z) {
            requestLayout();
        }
    }

    /* renamed from: b */
    public final int mo147095b() {
        int i = 0;
        float f = 0.0f;
        if (this.f309678v) {
            C110782b bVar = this.f309665f;
            int size = bVar.f331403a.size();
            while (i < size) {
                C104499b bVar2 = bVar.f331403a.get(i);
                bVar2.mo147125a();
                f += bVar2.f309707l;
                i++;
            }
        } else {
            C110782b bVar3 = this.f309665f;
            int size2 = bVar3.f331403a.size();
            while (i < size2) {
                C104499b bVar4 = bVar3.f331403a.get(i);
                bVar4.mo147125a();
                f += bVar4.f309709n;
                i++;
            }
        }
        return ((int) f) + getPaddingLeft() + getPaddingRight();
    }

    /* renamed from: c */
    public void mo147096c(Context context, AttributeSet attributeSet, int i, int i2) {
        C104496d dVar = new C104496d(this, context.getResources());
        int[] iArr = C110781a.f331402a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
            dVar.mo147123a(obtainStyledAttributes2);
            obtainStyledAttributes2.recycle();
        }
        dVar.mo147123a(obtainStyledAttributes);
        this.f309677u = f309662x;
        this.f309676t = (long) obtainStyledAttributes.getInt(11, TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
        this.f309678v = obtainStyledAttributes.getBoolean(10, false);
        this.f309671o = dVar.f309682a;
        int i3 = dVar.f309683b;
        if (i3 != 0) {
            this.f309663d.setShadowLayer(dVar.f309686e, dVar.f309684c, dVar.f309685d, i3);
        }
        int i4 = dVar.f309690i;
        if (i4 != 0) {
            this.f309674r = i4;
            setTypeface(this.f309663d.getTypeface());
        }
        setTextColor(dVar.f309688g);
        setTextSize(dVar.f309689h);
        int i5 = obtainStyledAttributes.getInt(12, 0);
        boolean z = true;
        if (i5 == 1) {
            setCharacterLists("0123456789");
        } else if (i5 == 2) {
            setCharacterLists("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        } else if (isInEditMode()) {
            setCharacterLists("0123456789");
        }
        int i6 = obtainStyledAttributes.getInt(13, 0);
        if (i6 == 0) {
            this.f309664e.f309717e = C67446c.ANY;
        } else if (i6 == 1) {
            this.f309664e.f309717e = C67446c.UP;
        } else if (i6 == 2) {
            this.f309664e.f309717e = C67446c.DOWN;
        } else {
            throw new IllegalArgumentException("Unsupported ticker_defaultPreferredScrollingDirection: " + i6);
        }
        if (this.f309665f.f331405c == null) {
            z = false;
        }
        if (z) {
            mo147097d(dVar.f309687f, false);
        } else {
            this.f309679w = dVar.f309687f;
        }
        obtainStyledAttributes.recycle();
        this.f309666g.addUpdateListener(new C104494a());
        this.f309666g.addListener(new C104495b());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo147097d(java.lang.String r27, boolean r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            java.lang.String r2 = r0.f309668i
            boolean r2 = android.text.TextUtils.equals(r1, r2)
            if (r2 == 0) goto L_0x000d
            return
        L_0x000d:
            r0.f309668i = r1
            r2 = 0
            if (r1 != 0) goto L_0x0015
            char[] r3 = new char[r2]
            goto L_0x0019
        L_0x0015:
            char[] r3 = r27.toCharArray()
        L_0x0019:
            s9.b r4 = r0.f309665f
            com.robinhood.ticker.a[] r5 = r4.f331405c
            if (r5 == 0) goto L_0x02fd
            r5 = 0
        L_0x0020:
            java.util.ArrayList<com.robinhood.ticker.b> r6 = r4.f331403a
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0043
            java.util.ArrayList<com.robinhood.ticker.b> r6 = r4.f331403a
            java.lang.Object r6 = r6.get(r5)
            com.robinhood.ticker.b r6 = (com.robinhood.ticker.C104499b) r6
            r6.mo147125a()
            float r6 = r6.f309707l
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x003d
            int r5 = r5 + 1
            goto L_0x0020
        L_0x003d:
            java.util.ArrayList<com.robinhood.ticker.b> r6 = r4.f331403a
            r6.remove(r5)
            goto L_0x0020
        L_0x0043:
            java.util.ArrayList<com.robinhood.ticker.b> r5 = r4.f331403a
            int r5 = r5.size()
            char[] r6 = new char[r5]
            r7 = 0
        L_0x004c:
            if (r7 >= r5) goto L_0x005d
            java.util.ArrayList<com.robinhood.ticker.b> r8 = r4.f331403a
            java.lang.Object r8 = r8.get(r7)
            com.robinhood.ticker.b r8 = (com.robinhood.ticker.C104499b) r8
            char r8 = r8.f309698c
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x004c
        L_0x005d:
            java.util.Set<java.lang.Character> r7 = r4.f331406d
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r10 = 0
            r11 = 0
        L_0x006a:
            r12 = 1
            if (r10 != r5) goto L_0x006f
            r13 = 1
            goto L_0x0070
        L_0x006f:
            r13 = 0
        L_0x0070:
            int r14 = r3.length
            if (r11 != r14) goto L_0x0075
            r14 = 1
            goto L_0x0076
        L_0x0075:
            r14 = 0
        L_0x0076:
            r15 = 2
            if (r13 == 0) goto L_0x007c
            if (r14 == 0) goto L_0x007c
            goto L_0x009d
        L_0x007c:
            if (r13 == 0) goto L_0x008d
            int r5 = r3.length
            int r5 = r5 - r11
            r6 = 0
        L_0x0081:
            if (r6 >= r5) goto L_0x009d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r8.add(r7)
            int r6 = r6 + 1
            goto L_0x0081
        L_0x008d:
            if (r14 == 0) goto L_0x0166
            int r5 = r5 - r10
            r6 = 0
        L_0x0091:
            if (r6 >= r5) goto L_0x009d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r8.add(r7)
            int r6 = r6 + 1
            goto L_0x0091
        L_0x009d:
            int r5 = r8.size()
            int[] r6 = new int[r5]
            r7 = 0
        L_0x00a4:
            int r9 = r8.size()
            if (r7 >= r9) goto L_0x00b9
            java.lang.Object r9 = r8.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r6[r7] = r9
            int r7 = r7 + 1
            goto L_0x00a4
        L_0x00b9:
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x00bc:
            if (r7 >= r5) goto L_0x010f
            r10 = r6[r7]
            if (r10 == 0) goto L_0x00fb
            if (r10 == r12) goto L_0x00ed
            if (r10 != r15) goto L_0x00d4
            java.util.ArrayList<com.robinhood.ticker.b> r10 = r4.f331403a
            java.lang.Object r10 = r10.get(r8)
            com.robinhood.ticker.b r10 = (com.robinhood.ticker.C104499b) r10
            r10.mo147127c(r2)
            int r8 = r8 + 1
            goto L_0x010c
        L_0x00d4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown action: "
            r2.append(r3)
            r3 = r6[r7]
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00ed:
            java.util.ArrayList<com.robinhood.ticker.b> r10 = r4.f331403a
            com.robinhood.ticker.b r11 = new com.robinhood.ticker.b
            com.robinhood.ticker.a[] r13 = r4.f331405c
            com.robinhood.ticker.c r14 = r4.f331404b
            r11.<init>(r13, r14)
            r10.add(r8, r11)
        L_0x00fb:
            java.util.ArrayList<com.robinhood.ticker.b> r10 = r4.f331403a
            java.lang.Object r10 = r10.get(r8)
            com.robinhood.ticker.b r10 = (com.robinhood.ticker.C104499b) r10
            char r11 = r3[r9]
            r10.mo147127c(r11)
            int r8 = r8 + 1
            int r9 = r9 + 1
        L_0x010c:
            int r7 = r7 + 1
            goto L_0x00bc
        L_0x010f:
            r26.setContentDescription(r27)
            if (r28 == 0) goto L_0x013c
            android.animation.ValueAnimator r1 = r0.f309666g
            boolean r1 = r1.isRunning()
            if (r1 == 0) goto L_0x0121
            android.animation.ValueAnimator r1 = r0.f309666g
            r1.cancel()
        L_0x0121:
            android.animation.ValueAnimator r1 = r0.f309666g
            long r2 = r0.f309675s
            r1.setStartDelay(r2)
            android.animation.ValueAnimator r1 = r0.f309666g
            long r2 = r0.f309676t
            r1.setDuration(r2)
            android.animation.ValueAnimator r1 = r0.f309666g
            android.view.animation.Interpolator r2 = r0.f309677u
            r1.setInterpolator(r2)
            android.animation.ValueAnimator r1 = r0.f309666g
            r1.start()
            goto L_0x0165
        L_0x013c:
            s9.b r1 = r0.f309665f
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.mo162338a(r3)
            s9.b r1 = r0.f309665f
            java.util.ArrayList<com.robinhood.ticker.b> r3 = r1.f331403a
            int r3 = r3.size()
        L_0x014b:
            if (r2 >= r3) goto L_0x015f
            java.util.ArrayList<com.robinhood.ticker.b> r4 = r1.f331403a
            java.lang.Object r4 = r4.get(r2)
            com.robinhood.ticker.b r4 = (com.robinhood.ticker.C104499b) r4
            r4.mo147125a()
            float r5 = r4.f309707l
            r4.f309709n = r5
            int r2 = r2 + 1
            goto L_0x014b
        L_0x015f:
            r26.mo147094a()
            r26.invalidate()
        L_0x0165:
            return
        L_0x0166:
            char r13 = r6[r10]
            java.lang.Character r13 = java.lang.Character.valueOf(r13)
            r14 = r7
            java.util.HashSet r14 = (java.util.HashSet) r14
            boolean r13 = r14.contains(r13)
            char r16 = r3[r11]
            java.lang.Character r12 = java.lang.Character.valueOf(r16)
            boolean r12 = r14.contains(r12)
            if (r13 == 0) goto L_0x02c5
            if (r12 == 0) goto L_0x02c5
            int r12 = r10 + 1
        L_0x0183:
            if (r12 >= r5) goto L_0x0197
            char r13 = r6[r12]
            java.lang.Character r13 = java.lang.Character.valueOf(r13)
            boolean r13 = r14.contains(r13)
            if (r13 != 0) goto L_0x0194
            r16 = r12
            goto L_0x0199
        L_0x0194:
            int r12 = r12 + 1
            goto L_0x0183
        L_0x0197:
            r16 = r5
        L_0x0199:
            int r12 = r11 + 1
        L_0x019b:
            int r13 = r3.length
            if (r12 >= r13) goto L_0x01ae
            char r13 = r3[r12]
            java.lang.Character r13 = java.lang.Character.valueOf(r13)
            boolean r13 = r14.contains(r13)
            if (r13 != 0) goto L_0x01ab
            goto L_0x01af
        L_0x01ab:
            int r12 = r12 + 1
            goto L_0x019b
        L_0x01ae:
            int r12 = r3.length
        L_0x01af:
            r14 = r12
            int r12 = r16 - r10
            int r13 = r14 - r11
            int r15 = java.lang.Math.max(r12, r13)
            if (r12 != r13) goto L_0x01d3
            r10 = 0
        L_0x01bb:
            if (r10 >= r15) goto L_0x01c7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r8.add(r11)
            int r10 = r10 + 1
            goto L_0x01bb
        L_0x01c7:
            r24 = r3
            r21 = r4
            r23 = r5
            r25 = r6
            r18 = 0
            goto L_0x027d
        L_0x01d3:
            int r12 = r12 + 1
            int r13 = r13 + 1
            r2 = 2
            int[] r0 = new int[r2]
            r2 = 1
            r0[r2] = r13
            r2 = 0
            r0[r2] = r12
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)
            int[][] r0 = (int[][]) r0
            r2 = 0
        L_0x01e9:
            if (r2 >= r12) goto L_0x01f4
            r19 = r0[r2]
            r18 = 0
            r19[r18] = r2
            int r2 = r2 + 1
            goto L_0x01e9
        L_0x01f4:
            r18 = 0
            r2 = 0
        L_0x01f7:
            if (r2 >= r13) goto L_0x0200
            r19 = r0[r18]
            r19[r2] = r2
            int r2 = r2 + 1
            goto L_0x01f7
        L_0x0200:
            r2 = 1
        L_0x0201:
            if (r2 >= r12) goto L_0x0253
            r1 = 1
        L_0x0204:
            if (r1 >= r13) goto L_0x0246
            int r19 = r2 + -1
            int r20 = r19 + r10
            r21 = r4
            char r4 = r6[r20]
            int r20 = r1 + -1
            int r22 = r20 + r11
            r23 = r5
            char r5 = r3[r22]
            if (r4 != r5) goto L_0x021a
            r4 = 0
            goto L_0x021b
        L_0x021a:
            r4 = 1
        L_0x021b:
            r5 = r0[r2]
            r19 = r0[r19]
            r22 = r19[r1]
            r24 = r3
            r17 = 1
            int r3 = r22 + 1
            r22 = r5[r20]
            r25 = r6
            int r6 = r22 + 1
            r19 = r19[r20]
            int r4 = r19 + r4
            int r4 = java.lang.Math.min(r6, r4)
            int r3 = java.lang.Math.min(r3, r4)
            r5[r1] = r3
            int r1 = r1 + 1
            r4 = r21
            r5 = r23
            r3 = r24
            r6 = r25
            goto L_0x0204
        L_0x0246:
            r24 = r3
            r21 = r4
            r23 = r5
            r25 = r6
            int r2 = r2 + 1
            r1 = r27
            goto L_0x0201
        L_0x0253:
            r24 = r3
            r21 = r4
            r23 = r5
            r25 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            int r15 = r15 * 2
            r1.<init>(r15)
            int r12 = r12 + -1
        L_0x0264:
            int r13 = r13 + -1
        L_0x0266:
            if (r12 > 0) goto L_0x0282
            if (r13 <= 0) goto L_0x026b
            goto L_0x0282
        L_0x026b:
            int r0 = r1.size()
            r2 = 1
            int r0 = r0 - r2
        L_0x0271:
            if (r0 < 0) goto L_0x027d
            java.lang.Object r2 = r1.get(r0)
            r8.add(r2)
            int r0 = r0 + -1
            goto L_0x0271
        L_0x027d:
            r11 = r14
            r10 = r16
            goto L_0x02ee
        L_0x0282:
            if (r12 != 0) goto L_0x028d
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.add(r3)
            goto L_0x0264
        L_0x028d:
            if (r13 != 0) goto L_0x0298
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.add(r3)
            goto L_0x02bd
        L_0x0298:
            r2 = r0[r12]
            int r3 = r13 + -1
            r2 = r2[r3]
            int r4 = r12 + -1
            r5 = r0[r4]
            r6 = r5[r13]
            r3 = r5[r3]
            if (r2 >= r6) goto L_0x02b3
            if (r2 >= r3) goto L_0x02b3
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.add(r3)
            goto L_0x0264
        L_0x02b3:
            if (r6 >= r3) goto L_0x02c0
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.add(r3)
        L_0x02bd:
            int r12 = r12 + -1
            goto L_0x0266
        L_0x02c0:
            r1.add(r9)
            r12 = r4
            goto L_0x0264
        L_0x02c5:
            r24 = r3
            r21 = r4
            r23 = r5
            r25 = r6
            r18 = 0
            if (r13 == 0) goto L_0x02da
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
            goto L_0x02ec
        L_0x02da:
            if (r12 == 0) goto L_0x02e7
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
            int r10 = r10 + 1
            goto L_0x02ee
        L_0x02e7:
            r8.add(r9)
            int r10 = r10 + 1
        L_0x02ec:
            int r11 = r11 + 1
        L_0x02ee:
            r0 = r26
            r1 = r27
            r4 = r21
            r5 = r23
            r3 = r24
            r6 = r25
            r2 = 0
            goto L_0x006a
        L_0x02fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Need to call #setCharacterLists first."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.ticker.TickerView.mo147097d(java.lang.String, boolean):void");
    }

    public boolean getAnimateMeasurementChange() {
        return this.f309678v;
    }

    public long getAnimationDelay() {
        return this.f309675s;
    }

    public long getAnimationDuration() {
        return this.f309676t;
    }

    public Interpolator getAnimationInterpolator() {
        return this.f309677u;
    }

    public int getGravity() {
        return this.f309671o;
    }

    public String getText() {
        return this.f309668i;
    }

    public int getTextColor() {
        return this.f309672p;
    }

    public float getTextSize() {
        return this.f309673q;
    }

    public Typeface getTypeface() {
        return this.f309663d.getTypeface();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        C110782b bVar = this.f309665f;
        int size = bVar.f331403a.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            C104499b bVar2 = bVar.f331403a.get(i);
            bVar2.mo147125a();
            f += bVar2.f309707l;
        }
        float f2 = this.f309664e.f309715c;
        int i2 = this.f309671o;
        Rect rect = this.f309667h;
        int width = rect.width();
        int height = rect.height();
        float f3 = (i2 & 16) == 16 ? ((float) rect.top) + ((((float) height) - f2) / 2.0f) : 0.0f;
        float f4 = (i2 & 1) == 1 ? ((float) rect.left) + ((((float) width) - f) / 2.0f) : 0.0f;
        if ((i2 & 48) == 48) {
            f3 = 0.0f;
        }
        if ((i2 & 80) == 80) {
            f3 = ((float) rect.top) + (((float) height) - f2);
        }
        if ((i2 & 8388611) == 8388611) {
            f4 = 0.0f;
        }
        if ((i2 & 8388613) == 8388613) {
            f4 = ((float) rect.left) + (((float) width) - f);
        }
        canvas.translate(f4, f3);
        canvas.clipRect(0.0f, 0.0f, f, f2);
        canvas.translate(0.0f, this.f309664e.f309716d);
        C110782b bVar3 = this.f309665f;
        Paint paint = this.f309663d;
        int size2 = bVar3.f331403a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C104499b bVar4 = bVar3.f331403a.get(i3);
            if (bVar4.mo147126b(canvas, paint, bVar4.f309700e, bVar4.f309703h, bVar4.f309704i)) {
                int i4 = bVar4.f309703h;
                if (i4 >= 0) {
                    bVar4.f309698c = bVar4.f309700e[i4];
                }
                bVar4.f309710o = bVar4.f309704i;
            }
            Paint paint2 = paint;
            bVar4.mo147126b(canvas, paint2, bVar4.f309700e, bVar4.f309703h + 1, bVar4.f309704i - bVar4.f309705j);
            bVar4.mo147126b(canvas, paint2, bVar4.f309700e, bVar4.f309703h - 1, bVar4.f309704i + bVar4.f309705j);
            bVar4.mo147125a();
            canvas.translate(bVar4.f309707l, 0.0f);
        }
        canvas.restore();
    }

    public void onMeasure(int i, int i2) {
        this.f309669j = mo147095b();
        this.f309670n = ((int) this.f309664e.f309715c) + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSize(this.f309669j, i), View.resolveSize(this.f309670n, i2));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f309667h.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    public void setAnimateMeasurementChange(boolean z) {
        this.f309678v = z;
    }

    public void setAnimationDelay(long j) {
        this.f309675s = j;
    }

    public void setAnimationDuration(long j) {
        this.f309676t = j;
    }

    public void setAnimationInterpolator(Interpolator interpolator) {
        this.f309677u = interpolator;
    }

    public void setCharacterLists(String... strArr) {
        C110782b bVar = this.f309665f;
        bVar.getClass();
        bVar.f331405c = new C104497a[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            bVar.f331405c[i] = new C104497a(strArr[i]);
        }
        bVar.f331406d = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bVar.f331406d.addAll(((HashMap) bVar.f331405c[i2].f309693c).keySet());
        }
        String str = this.f309679w;
        if (str != null) {
            mo147097d(str, false);
            this.f309679w = null;
        }
    }

    public void setGravity(int i) {
        if (this.f309671o != i) {
            this.f309671o = i;
            invalidate();
        }
    }

    public void setPreferredScrollingDirection(C67446c cVar) {
        this.f309664e.f309717e = cVar;
    }

    public void setText(String str) {
        mo147097d(str, !TextUtils.isEmpty(this.f309668i));
    }

    public void setTextColor(int i) {
        if (this.f309672p != i) {
            this.f309672p = i;
            this.f309663d.setColor(i);
            invalidate();
        }
    }

    public void setTextSize(float f) {
        if (this.f309673q != f) {
            this.f309673q = f;
            this.f309663d.setTextSize(f);
            C104500c cVar = this.f309664e;
            ((HashMap) cVar.f309714b).clear();
            Paint.FontMetrics fontMetrics = cVar.f309713a.getFontMetrics();
            float f2 = fontMetrics.bottom;
            float f3 = fontMetrics.top;
            cVar.f309715c = f2 - f3;
            cVar.f309716d = -f3;
            mo147094a();
            invalidate();
        }
    }

    public void setTypeface(Typeface typeface) {
        int i = this.f309674r;
        if (i == 3) {
            typeface = Typeface.create(typeface, 3);
        } else if (i == 1) {
            typeface = Typeface.create(typeface, 1);
        } else if (i == 2) {
            typeface = Typeface.create(typeface, 2);
        }
        this.f309663d.setTypeface(typeface);
        C104500c cVar = this.f309664e;
        ((HashMap) cVar.f309714b).clear();
        Paint.FontMetrics fontMetrics = cVar.f309713a.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        cVar.f309715c = f - f2;
        cVar.f309716d = -f2;
        mo147094a();
        invalidate();
    }

    public TickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TextPaint textPaint = new TextPaint(1);
        this.f309663d = textPaint;
        C104500c cVar = new C104500c(textPaint);
        this.f309664e = cVar;
        this.f309665f = new C110782b(cVar);
        mo147096c(context, attributeSet, i, 0);
    }
}
