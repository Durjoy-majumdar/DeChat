package com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.util.WXWebReporter;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar */
public class TimeCropSliderSeekBar extends View {

    /* renamed from: A */
    public int f316700A;

    /* renamed from: B */
    public Paint f316701B;

    /* renamed from: C */
    public float f316702C;

    /* renamed from: D */
    public int f316703D;

    /* renamed from: E */
    public int f316704E;

    /* renamed from: F */
    public Rect f316705F;

    /* renamed from: G */
    public Rect f316706G;

    /* renamed from: H */
    public boolean f316707H;

    /* renamed from: I */
    public boolean f316708I;

    /* renamed from: J */
    public View.OnTouchListener f316709J;

    /* renamed from: d */
    public C106238b f316710d;

    /* renamed from: e */
    public boolean f316711e;

    /* renamed from: f */
    public boolean f316712f;

    /* renamed from: g */
    public int f316713g;

    /* renamed from: h */
    public int f316714h;

    /* renamed from: i */
    public boolean f316715i;

    /* renamed from: j */
    public boolean f316716j;

    /* renamed from: n */
    public Drawable f316717n;

    /* renamed from: o */
    public Drawable f316718o;

    /* renamed from: p */
    public int f316719p;

    /* renamed from: q */
    public float f316720q;

    /* renamed from: r */
    public int f316721r;

    /* renamed from: s */
    public float f316722s;

    /* renamed from: t */
    public Paint f316723t;

    /* renamed from: u */
    public Paint f316724u;

    /* renamed from: v */
    public int f316725v;

    /* renamed from: w */
    public float f316726w;

    /* renamed from: x */
    public Paint f316727x;

    /* renamed from: y */
    public Paint f316728y;

    /* renamed from: z */
    public int f316729z;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar$a */
    public class C106237a implements View.OnTouchListener {

        /* renamed from: d */
        public boolean f316730d = false;

        /* renamed from: e */
        public float f316731e;

        /* renamed from: f */
        public float f316732f;

        /* renamed from: g */
        public boolean f316733g = false;

        /* renamed from: h */
        public float f316734h;

        /* renamed from: i */
        public float f316735i;

        public C106237a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:60:0x01c8  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01da  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            /*
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r9)
                r0.add(r10)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r1 = "android/view/View$OnTouchListener"
                java.lang.String r2 = "onTouch"
                java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r4 = r8
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                boolean r0 = r0.f316711e
                r6 = 0
                if (r0 != 0) goto L_0x0033
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r6
            L_0x0033:
                int r0 = r10.getActionMasked()
                r7 = 1
                if (r0 == 0) goto L_0x016a
                if (r0 == r7) goto L_0x012c
                r1 = 2
                if (r0 == r1) goto L_0x0050
                r1 = 3
                if (r0 == r1) goto L_0x012c
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r6
            L_0x0050:
                boolean r0 = r8.f316730d
                if (r0 != 0) goto L_0x0062
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r6
            L_0x0062:
                boolean r0 = r8.f316733g
                if (r0 == 0) goto L_0x00e2
                float r0 = r10.getX()
                float r1 = r8.f316731e
                float r0 = r0 - r1
                r1 = 0
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x00a0
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r1 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                float r2 = r8.f316735i
                float r2 = r2 + r0
                int r3 = r1.getWidth()
                int r1 = r1.f316703D
                int r3 = r3 - r1
                float r3 = (float) r3
                float r1 = (float) r1
                float r1 = java.lang.Math.max(r1, r2)
                float r1 = java.lang.Math.min(r1, r3)
                float r2 = r8.f316735i
                float r1 = r1 - r2
                float r0 = java.lang.Math.min(r1, r0)
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r1 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                float r2 = r8.f316735i
                float r2 = r2 + r0
                r1.mo152218f(r6, r2)
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r1 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                float r2 = r8.f316734h
                float r2 = r2 + r0
                r1.mo152218f(r7, r2)
                goto L_0x00cd
            L_0x00a0:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r1 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                float r2 = r8.f316734h
                float r2 = r2 + r0
                int r3 = r1.getWidth()
                int r1 = r1.f316703D
                int r3 = r3 - r1
                float r3 = (float) r3
                float r1 = (float) r1
                float r1 = java.lang.Math.max(r1, r2)
                float r1 = java.lang.Math.min(r1, r3)
                float r2 = r8.f316734h
                float r1 = r1 - r2
                float r0 = java.lang.Math.max(r1, r0)
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r1 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                float r2 = r8.f316734h
                float r2 = r2 + r0
                r1.mo152218f(r7, r2)
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r1 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                float r2 = r8.f316735i
                float r2 = r2 + r0
                r1.mo152218f(r6, r2)
            L_0x00cd:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar$b r0 = r0.f316710d
                r0.mo152231c(r6)
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r7
            L_0x00e2:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                boolean r2 = r0.f316712f
                if (r2 == 0) goto L_0x00f6
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r7
            L_0x00f6:
                boolean r0 = r0.mo152215c(r7)
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r2 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                float r3 = r10.getX()
                boolean r2 = r2.mo152218f(r0, r3)
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r3 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                boolean r4 = r3.f316716j
                if (r4 == 0) goto L_0x0113
                if (r2 == 0) goto L_0x0113
                boolean r4 = r3.f316715i
                if (r4 != 0) goto L_0x0113
                r3.performHapticFeedback(r6, r1)
            L_0x0113:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r1 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                r1.f316715i = r2
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar$b r1 = r1.f316710d
                if (r1 == 0) goto L_0x011e
                r1.mo152231c(r0)
            L_0x011e:
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r7
            L_0x012c:
                boolean r0 = r8.f316730d
                if (r0 != 0) goto L_0x013e
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r6
            L_0x013e:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar$b r1 = r0.f316710d
                if (r1 == 0) goto L_0x014b
                boolean r0 = r0.mo152215c(r7)
                r1.mo152230b(r0)
            L_0x014b:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                boolean r1 = r0.mo152215c(r7)
                com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.m142967a(r0, r1, r6)
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                r0.f316715i = r6
                r8.f316730d = r6
                r8.f316733g = r6
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r7
            L_0x016a:
                float r0 = r10.getX()
                r8.f316731e = r0
                float r0 = r10.getY()
                r8.f316732f = r0
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                android.graphics.drawable.Drawable r0 = r0.f316717n
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.centerX()
                float r0 = (float) r0
                r8.f316734h = r0
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                android.graphics.drawable.Drawable r0 = r0.f316718o
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.centerX()
                float r0 = (float) r0
                r8.f316735i = r0
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                float r1 = r8.f316731e
                float r2 = r8.f316732f
                android.graphics.drawable.Drawable r3 = r0.f316717n
                android.graphics.Rect r3 = r3.getBounds()
                int r3 = r3.right
                float r3 = (float) r3
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x01c5
                android.graphics.drawable.Drawable r3 = r0.f316718o
                android.graphics.Rect r3 = r3.getBounds()
                int r3 = r3.left
                float r3 = (float) r3
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 >= 0) goto L_0x01c5
                int r1 = r0.f316729z
                float r3 = (float) r1
                int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x01c5
                int r0 = r0.f316700A
                int r1 = r1 + r0
                float r0 = (float) r1
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x01c5
                r0 = 1
                goto L_0x01c6
            L_0x01c5:
                r0 = 0
            L_0x01c6:
                if (r0 == 0) goto L_0x01da
                r8.f316733g = r7
                r8.f316730d = r7
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r7
            L_0x01da:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                android.graphics.drawable.Drawable r1 = r0.f316717n
                float r2 = r8.f316731e
                float r3 = r8.f316732f
                boolean r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.m142968b(r0, r1, r2, r3)
                if (r0 == 0) goto L_0x0226
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                boolean r0 = r0.mo152215c(r7)
                if (r0 == 0) goto L_0x01fe
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r6
            L_0x01fe:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar$b r0 = r0.f316710d
                if (r0 == 0) goto L_0x0207
                r0.mo152229a(r7)
            L_0x0207:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                android.graphics.drawable.Drawable r0 = r0.f316717n
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.left
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.m142967a(r0, r7, r7)
                r8.f316730d = r7
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r7
            L_0x0226:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                android.graphics.drawable.Drawable r1 = r0.f316718o
                float r2 = r8.f316731e
                float r3 = r8.f316732f
                boolean r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.m142968b(r0, r1, r2, r3)
                if (r0 == 0) goto L_0x0272
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                boolean r0 = r0.mo152215c(r6)
                if (r0 == 0) goto L_0x024a
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r6
            L_0x024a:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar$b r0 = r0.f316710d
                if (r0 == 0) goto L_0x0253
                r0.mo152229a(r6)
            L_0x0253:
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                android.graphics.drawable.Drawable r0 = r0.f316718o
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.right
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar r0 = com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.this
                com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.m142967a(r0, r6, r7)
                r8.f316730d = r7
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r7
            L_0x0272:
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r8
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar.C106237a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar$b */
    public interface C106238b {
        /* renamed from: a */
        void mo152229a(boolean z);

        /* renamed from: b */
        void mo152230b(boolean z);

        /* renamed from: c */
        void mo152231c(boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar$c */
    public class C106239c extends Drawable {

        /* renamed from: a */
        public boolean f316737a = false;

        /* renamed from: b */
        public Drawable f316738b;

        /* renamed from: c */
        public Drawable f316739c;

        public C106239c(Drawable drawable, Drawable drawable2) {
            this.f316738b = drawable;
            this.f316739c = drawable2;
        }

        public void draw(Canvas canvas) {
            Drawable drawable = this.f316737a ? this.f316738b : this.f316739c;
            if (!getBounds().equals(drawable.getBounds())) {
                drawable.setBounds(getBounds());
            }
            drawable.draw(canvas);
        }

        public int getOpacity() {
            return -3;
        }

        public void setAlpha(int i) {
            this.f316738b.setAlpha(i);
            this.f316739c.setAlpha(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.f316738b.setColorFilter(colorFilter);
            this.f316739c.setColorFilter(colorFilter);
        }
    }

    public TimeCropSliderSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m142967a(TimeCropSliderSeekBar timeCropSliderSeekBar, boolean z, boolean z2) {
        Drawable drawable;
        if (timeCropSliderSeekBar.f316711e && (drawable = timeCropSliderSeekBar.f316717n) != null && timeCropSliderSeekBar.f316718o != null && drawable.getBounds().width() > 0 && timeCropSliderSeekBar.f316718o.getBounds().width() > 0) {
            C106239c cVar = z ? (C106239c) timeCropSliderSeekBar.f316717n : (C106239c) timeCropSliderSeekBar.f316718o;
            if (cVar.f316737a != z2) {
                cVar.f316737a = z2;
                TimeCropSliderSeekBar.this.invalidate();
            }
            timeCropSliderSeekBar.postInvalidate();
        }
    }

    /* renamed from: b */
    public static boolean m142968b(TimeCropSliderSeekBar timeCropSliderSeekBar, Drawable drawable, float f, float f2) {
        if (!timeCropSliderSeekBar.f316711e || drawable == null) {
            return false;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.bottom;
        int i2 = timeCropSliderSeekBar.f316704E;
        return f2 <= ((float) (i + i2)) && f2 >= ((float) (bounds.top - i2)) && f >= ((float) (bounds.left - i2)) && f <= ((float) (bounds.right + i2));
    }

    /* renamed from: c */
    public final boolean mo152215c(boolean z) {
        return z ? ((C106239c) this.f316717n).f316737a : ((C106239c) this.f316718o).f316737a;
    }

    /* renamed from: d */
    public void mo152216d() {
        this.f316717n = new C106239c(C76577a.m92158i(getContext(), C0966R.C0969drawable.icon_filled_clip_border), C76577a.m92158i(getContext(), C0966R.C0969drawable.icon_filled_clip_border));
        this.f316718o = new C106239c(C76577a.m92158i(getContext(), C0966R.C0969drawable.icon_filled_clip_border), C76577a.m92158i(getContext(), C0966R.C0969drawable.icon_filled_clip_border));
        this.f316708I = false;
        int b = C76577a.m92151b(getContext(), 16);
        this.f316719p = b;
        this.f316720q = ((float) b) * 0.5f;
        this.f316704E = C76577a.m92151b(getContext(), 8);
        mo152217e();
        postInvalidate();
    }

    /* renamed from: e */
    public final void mo152217e() {
        Drawable drawable = this.f316717n;
        int i = this.f316703D;
        int i2 = this.f316719p;
        drawable.setBounds(i - (i2 / 2), 0, i + (i2 / 2), getHeight());
        Drawable drawable2 = this.f316718o;
        int i3 = this.f316703D;
        int i4 = this.f316713g;
        int i5 = this.f316719p;
        drawable2.setBounds((i3 + i4) - (i5 / 2), 0, i4 + i3 + (i5 / 2), getHeight());
    }

    /* renamed from: f */
    public boolean mo152218f(boolean z, float f) {
        Drawable drawable;
        float f2;
        float f3;
        if (!this.f316711e || (drawable = this.f316717n) == null || this.f316718o == null || drawable.getBounds().width() <= 0 || this.f316718o.getBounds().width() <= 0) {
            return false;
        }
        if (z) {
            f3 = ((float) (this.f316718o.getBounds().right - this.f316714h)) + this.f316720q;
            f2 = Math.max((float) this.f316703D, ((float) (this.f316718o.getBounds().right - this.f316713g)) - this.f316720q);
        } else {
            f2 = ((float) (this.f316717n.getBounds().left + this.f316714h)) - this.f316720q;
            f3 = Math.min((float) (getWidth() - this.f316703D), ((float) (this.f316717n.getBounds().left + this.f316713g)) + this.f316720q);
        }
        float max = Math.max(f2, Math.min(f, f3));
        boolean z2 = max == f2 || max == f3;
        if (z) {
            Rect bounds = this.f316717n.getBounds();
            bounds.offsetTo((int) Math.ceil((double) (max - this.f316720q)), 0);
            this.f316717n.setBounds(bounds);
        } else {
            Rect bounds2 = this.f316718o.getBounds();
            bounds2.offsetTo((int) Math.floor((double) (max - this.f316720q)), 0);
            this.f316718o.setBounds(bounds2);
        }
        postInvalidate();
        return z2;
    }

    public int getLeftSliderBound() {
        return (int) (((float) this.f316717n.getBounds().left) + this.f316720q);
    }

    public int getRightSliderBound() {
        return (int) (((float) this.f316718o.getBounds().right) - this.f316720q);
    }

    public void onDraw(Canvas canvas) {
        if (this.f316722s > 0.0f) {
            float width = ((float) getWidth()) * this.f316722s;
            int i = this.f316721r;
            float f = width - (((float) i) * 0.5f);
            int i2 = this.f316729z;
            canvas.drawRect(f, (float) i2, width + (((float) i) * 0.5f), (float) (i2 + (this.f316708I ? getHeight() : this.f316700A)), this.f316723t);
        }
        if (this.f316711e) {
            int centerX = this.f316717n.getBounds().centerX();
            int centerX2 = this.f316718o.getBounds().centerX();
            if ((mo152215c(true) || mo152215c(false)) && this.f316708I) {
                float f2 = this.f316702C;
                canvas.drawRect(((float) this.f316703D) + f2, f2, ((float) (getWidth() - this.f316703D)) - this.f316702C, ((float) getBottom()) - this.f316702C, this.f316701B);
            }
            if (this.f316717n.getBounds().left > 0) {
                canvas.drawRect(0.0f, 0.0f, (float) centerX, (float) getHeight(), this.f316727x);
            }
            if (this.f316718o.getBounds().right < getWidth()) {
                canvas.drawRect((float) centerX2, 0.0f, (float) getWidth(), (float) getHeight(), this.f316727x);
            }
            if (this.f316707H && this.f316700A != 0) {
                canvas.drawRect((float) centerX, (float) (this.f316729z - getTop()), (float) centerX2, (float) ((this.f316729z + this.f316700A) - getTop()), this.f316728y);
            }
            if (this.f316708I) {
                float f3 = this.f316726w;
                float f4 = (float) centerX;
                float f5 = (float) centerX2;
                canvas.drawLine(f4, f3, f5, f3, this.f316724u);
                canvas.drawLine(f4, ((float) getHeight()) - this.f316726w, f5, ((float) getHeight()) - this.f316726w, this.f316724u);
            }
            this.f316717n.draw(canvas);
            this.f316718o.draw(canvas);
        }
    }

    public void setContentHeight(int i) {
        this.f316700A = i;
    }

    public void setContentTop(int i) {
        this.f316729z = i;
    }

    public void setCursorPos(float f) {
        if (this.f316711e) {
            this.f316722s = f;
            invalidate();
        }
    }

    public void setEnableHapticAtEdge(boolean z) {
        this.f316716j = z;
    }

    public void setMaskColor(int i) {
        this.f316727x.setColor(i);
    }

    public void setOnSliderTouchListener(C106238b bVar) {
        this.f316710d = bVar;
    }

    public TimeCropSliderSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f316711e = false;
        this.f316712f = false;
        this.f316715i = false;
        this.f316716j = false;
        this.f316722s = -1.0f;
        this.f316729z = 0;
        this.f316700A = 0;
        this.f316703D = 0;
        this.f316707H = true;
        this.f316708I = true;
        this.f316709J = new C106237a();
        int b = C76577a.m92151b(getContext(), 8);
        this.f316719p = b;
        this.f316720q = ((float) b) * 0.5f;
        this.f316704E = C76577a.m92151b(getContext(), 16);
        this.f316717n = new C106239c(C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_selected), C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_normal));
        this.f316718o = new C106239c(C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_selected), C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_normal));
        this.f316708I = true;
        postInvalidate();
        this.f316721r = C76577a.m92151b(getContext(), 2);
        C76577a.m92157h(getContext(), C0966R.dimen.as5);
        this.f316722s = -1.0f;
        Paint paint = new Paint();
        this.f316723t = paint;
        paint.setColor(C76577a.m92153d(getContext(), C0966R.color.f2975b6));
        this.f316723t.setAlpha(102);
        Paint paint2 = new Paint();
        this.f316727x = paint2;
        paint2.setColor(C76577a.m92153d(getContext(), C0966R.color.f3131gg));
        this.f316727x.setAlpha(102);
        Paint paint3 = new Paint();
        this.f316728y = paint3;
        paint3.setColor(C76577a.m92153d(getContext(), C0966R.color.f2960ag));
        this.f316728y.setAlpha(102);
        Paint paint4 = new Paint();
        this.f316724u = paint4;
        paint4.setColor(C76577a.m92153d(getContext(), C0966R.color.al6));
        this.f316724u.setStyle(Paint.Style.STROKE);
        int round = Math.round(TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f316725v = round;
        this.f316724u.setStrokeWidth((float) round);
        this.f316726w = ((float) this.f316725v) * 0.5f;
        Paint paint5 = new Paint();
        this.f316701B = paint5;
        paint5.setColor(C76577a.m92153d(getContext(), C0966R.color.al6));
        this.f316701B.setStyle(Paint.Style.STROKE);
        float round2 = (float) Math.round(TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f316702C = 0.5f * round2;
        this.f316701B.setStrokeWidth(round2);
        this.f316701B.setAlpha(WXWebReporter.WXWEB_GET_REFLECT_MMKV_METHED_FAILED);
        setOnTouchListener(this.f316709J);
    }
}
