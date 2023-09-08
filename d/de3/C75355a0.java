package de3;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: de3.a0 */
public class C75355a0 implements View.OnTouchListener {

    /* renamed from: w */
    public static int f221518w = ViewConfiguration.getTapTimeout();

    /* renamed from: x */
    public static int f221519x;

    /* renamed from: d */
    public C75359b0 f221520d = null;

    /* renamed from: e */
    public boolean f221521e = false;

    /* renamed from: f */
    public View f221522f = null;

    /* renamed from: g */
    public View f221523g;

    /* renamed from: h */
    public boolean f221524h = false;

    /* renamed from: i */
    public String f221525i;

    /* renamed from: j */
    public Context f221526j = null;

    /* renamed from: n */
    public C75354a f221527n;

    /* renamed from: o */
    public int f221528o;

    /* renamed from: p */
    public int f221529p;

    /* renamed from: q */
    public View.OnLongClickListener f221530q;

    /* renamed from: r */
    public float f221531r = -1.0f;

    /* renamed from: s */
    public float f221532s = -1.0f;

    /* renamed from: t */
    public MMHandler f221533t = new MMHandler(Looper.getMainLooper());

    /* renamed from: u */
    public C75358c f221534u = new C75358c((C75356a) null);

    /* renamed from: v */
    public C75357b f221535v = new C75357b();

    /* renamed from: de3.a0$b */
    public class C75357b implements Runnable {
        public C75357b() {
        }

        public void run() {
            C75355a0 a0Var = C75355a0.this;
            View.OnLongClickListener onLongClickListener = a0Var.f221530q;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(a0Var.f221523g);
                Log.m105918d("MicroMsg.PressSpanTouchListener", "handle onLongClickListener");
                C75355a0 a0Var2 = C75355a0.this;
                a0Var2.f221524h = true;
                a0Var2.mo105677b();
            }
            View view = C75355a0.this.f221523g;
            if (view != null && view.isPressed()) {
                Log.m105918d("MicroMsg.PressSpanTouchListener", "long pressed timeout");
                C75355a0 a0Var3 = C75355a0.this;
                a0Var3.f221524h = true;
                a0Var3.mo105677b();
            }
        }
    }

    /* renamed from: de3.a0$c */
    public class C75358c implements Runnable {
        public C75358c(C75356a aVar) {
        }

        public void run() {
            C75355a0 a0Var = C75355a0.this;
            int i = C75355a0.f221518w;
            if (a0Var.f221523g != null) {
                a0Var.f221533t.postDelayed(a0Var.f221535v, (long) (C75355a0.f221519x - i));
            }
        }
    }

    static {
        int longPressTimeout = ViewConfiguration.getLongPressTimeout();
        f221519x = longPressTimeout;
        int i = f221518w;
        if (longPressTimeout > i * 2) {
            f221519x = longPressTimeout - i;
        }
        Log.m105919d("MicroMsg.PressSpanTouchListener", "long press timeout:%d", Integer.valueOf(f221519x));
    }

    public C75355a0() {
    }

    /* renamed from: a */
    public final void mo105676a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            mo105677b();
        }
    }

    /* renamed from: b */
    public void mo105677b() {
        C75359b0 b0Var = this.f221520d;
        if (b0Var != null) {
            b0Var.setIsPressed(false);
            this.f221520d.setContext((Context) null);
            this.f221522f.invalidate();
            this.f221522f = null;
            this.f221520d = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r18, android.view.MotionEvent r19) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            r8 = r19
            r0.add(r8)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/pluginsdk/ui/span/PressSpanTouchListener"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r17
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            boolean r0 = r7 instanceof android.widget.TextView
            r9 = 0
            if (r0 != 0) goto L_0x003f
            boolean r1 = r7 instanceof com.tencent.p014mm.kiss.widget.textview.StaticTextView
            if (r1 != 0) goto L_0x003f
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/pluginsdk/ui/span/PressSpanTouchListener"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r17
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r9
        L_0x003f:
            int r1 = r19.getAction()
            r2 = 2131315572(0x7f094b74, float:1.8249601E38)
            r3 = 2
            r4 = 1
            if (r1 != 0) goto L_0x005d
            int[] r1 = new int[r3]
            float r5 = r19.getRawX()
            int r5 = (int) r5
            r1[r9] = r5
            float r5 = r19.getRawY()
            int r5 = (int) r5
            r1[r4] = r5
            r7.setTag(r2, r1)
        L_0x005d:
            r6.f221523g = r7
            if (r0 == 0) goto L_0x007c
            boolean r0 = r7 instanceof com.tencent.p014mm.kiss.widget.textview.PLSysTextView
            if (r0 == 0) goto L_0x006d
            r0 = r7
            com.tencent.mm.kiss.widget.textview.PLSysTextView r0 = (com.tencent.p014mm.kiss.widget.textview.PLSysTextView) r0
            android.text.Layout r0 = r0.getTvLayout()
            goto L_0x0074
        L_0x006d:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.text.Layout r0 = r0.getLayout()
        L_0x0074:
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r1 = r1.getText()
            goto L_0x008c
        L_0x007c:
            r0 = r7
            com.tencent.mm.kiss.widget.textview.StaticTextView r0 = (com.tencent.p014mm.kiss.widget.textview.StaticTextView) r0
            android.text.Layout r1 = r0.getTvLayout()
            java.lang.CharSequence r0 = r0.getText()
            r16 = r1
            r1 = r0
            r0 = r16
        L_0x008c:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r19)
            boolean r8 = r1 instanceof android.text.Spanned
            if (r8 == 0) goto L_0x02a4
            if (r0 == 0) goto L_0x02a4
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r8 = r5.getAction()
            r18.invalidate()
            if (r1 == 0) goto L_0x00a9
            boolean r10 = de3.C45334i.m50245a(r7, r1)
            if (r10 == 0) goto L_0x00a9
            goto L_0x02a4
        L_0x00a9:
            r10 = 3
            if (r8 == r4) goto L_0x00b2
            if (r8 == 0) goto L_0x00b2
            if (r8 == r3) goto L_0x00b2
            if (r8 != r10) goto L_0x02a4
        L_0x00b2:
            float r8 = r5.getX()
            int r8 = (int) r8
            float r11 = r5.getY()
            int r11 = (int) r11
            boolean r12 = r7 instanceof com.tencent.p014mm.kiss.widget.textview.StaticTextView
            if (r12 == 0) goto L_0x00f0
            r13 = r7
            com.tencent.mm.kiss.widget.textview.StaticTextView r13 = (com.tencent.p014mm.kiss.widget.textview.StaticTextView) r13
            int r14 = r13.getHorizontalDrawOffset()
            if (r8 < r14) goto L_0x00eb
            int r14 = r0.getWidth()
            int r15 = r13.getHorizontalDrawOffset()
            int r14 = r14 + r15
            if (r8 <= r14) goto L_0x00d5
            goto L_0x00eb
        L_0x00d5:
            int r14 = r13.getVerticalDrawOffset()
            if (r11 < r14) goto L_0x00e6
            int r14 = r0.getHeight()
            int r13 = r13.getVerticalDrawOffset()
            int r14 = r14 + r13
            if (r11 <= r14) goto L_0x0124
        L_0x00e6:
            r6.mo105676a(r5)
            goto L_0x02a4
        L_0x00eb:
            r6.mo105676a(r5)
            goto L_0x02a4
        L_0x00f0:
            boolean r13 = r7 instanceof android.widget.TextView
            if (r13 == 0) goto L_0x0124
            r13 = r7
            android.widget.TextView r13 = (android.widget.TextView) r13
            int r14 = r13.getTotalPaddingLeft()
            if (r8 < r14) goto L_0x011f
            int r14 = r0.getWidth()
            int r15 = r13.getTotalPaddingLeft()
            int r14 = r14 + r15
            if (r8 <= r14) goto L_0x0109
            goto L_0x011f
        L_0x0109:
            int r14 = r13.getTotalPaddingTop()
            if (r11 < r14) goto L_0x011a
            int r14 = r0.getHeight()
            int r13 = r13.getTotalPaddingTop()
            int r14 = r14 + r13
            if (r11 <= r14) goto L_0x0124
        L_0x011a:
            r6.mo105676a(r5)
            goto L_0x02a4
        L_0x011f:
            r6.mo105676a(r5)
            goto L_0x02a4
        L_0x0124:
            boolean r13 = r7 instanceof android.widget.TextView
            if (r13 == 0) goto L_0x0135
            r12 = r7
            android.widget.TextView r12 = (android.widget.TextView) r12
            int r14 = r12.getTotalPaddingLeft()
            int r8 = r8 - r14
            int r12 = r12.getTotalPaddingTop()
            goto L_0x014d
        L_0x0135:
            if (r12 == 0) goto L_0x0144
            r12 = r7
            com.tencent.mm.kiss.widget.textview.StaticTextView r12 = (com.tencent.p014mm.kiss.widget.textview.StaticTextView) r12
            int r14 = r12.getHorizontalDrawOffset()
            int r8 = r8 - r14
            int r12 = r12.getVerticalDrawOffset()
            goto L_0x014d
        L_0x0144:
            int r12 = r18.getPaddingLeft()
            int r8 = r8 - r12
            int r12 = r18.getPaddingTop()
        L_0x014d:
            int r11 = r11 - r12
            int r12 = r18.getScrollX()
            int r8 = r8 + r12
            int r12 = r18.getScrollY()
            int r11 = r11 + r12
            int r11 = r0.getLineForVertical(r11)
            float r8 = (float) r8
            int r0 = r0.getOffsetForHorizontal(r11, r8)
            if (r13 == 0) goto L_0x016b
            int r8 = r1.length()
            if (r0 >= r8) goto L_0x016b
            int r0 = r0 + 1
        L_0x016b:
            int r8 = r5.getAction()
            java.lang.Class<de3.b0> r11 = de3.C75359b0.class
            java.lang.Object[] r0 = r1.getSpans(r0, r0, r11)
            de3.b0[] r0 = (de3.C75359b0[]) r0
            int r1 = r0.length
            int r1 = r1 - r4
            int r11 = r0.length
            if (r11 == 0) goto L_0x028f
            if (r8 != r4) goto L_0x01d7
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r6.f221533t
            de3.a0$c r1 = r6.f221534u
            r0.removeCallbacks(r1)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r6.f221533t
            de3.a0$b r1 = r6.f221535v
            r0.removeCallbacks(r1)
            boolean r0 = r6.f221524h
            if (r0 == 0) goto L_0x019c
            r17.mo105677b()
            r6.f221524h = r9
            boolean r0 = r6.f221521e
            r7.setClickable(r0)
            goto L_0x02a0
        L_0x019c:
            r6.f221524h = r9
            de3.b0 r0 = r6.f221520d
            if (r0 == 0) goto L_0x01c6
            java.lang.String r1 = r6.f221525i
            r0.setSessionId(r1)
            de3.b0 r0 = r6.f221520d
            de3.a r1 = r6.f221527n
            int r2 = r6.f221528o
            r0.setAdTagClickCallback(r1, r2)
            de3.b0 r0 = r6.f221520d
            int r1 = r6.f221529p
            r0.setAdTagClickScene(r1)
            android.content.Context r0 = r6.f221526j
            if (r0 == 0) goto L_0x01c0
            de3.b0 r1 = r6.f221520d
            r1.setContext(r0)
        L_0x01c0:
            de3.b0 r0 = r6.f221520d
            r0.onClick(r7)
            goto L_0x01cd
        L_0x01c6:
            java.lang.String r0 = "MicroMsg.PressSpanTouchListener"
            java.lang.String r1 = "ACTION_UP error, lastClickSpan is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x01cd:
            boolean r0 = r6.f221521e
            r7.setClickable(r0)
            r17.mo105677b()
            goto L_0x02a0
        L_0x01d7:
            if (r8 == 0) goto L_0x01f6
            if (r8 != r3) goto L_0x01dc
            goto L_0x01f6
        L_0x01dc:
            if (r8 != r10) goto L_0x0292
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r6.f221533t
            de3.a0$c r1 = r6.f221534u
            r0.removeCallbacks(r1)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r6.f221533t
            de3.a0$b r1 = r6.f221535v
            r0.removeCallbacks(r1)
            boolean r0 = r6.f221521e
            r7.setClickable(r0)
            r17.mo105677b()
            goto L_0x02a0
        L_0x01f6:
            if (r8 != 0) goto L_0x0217
            int r10 = f221519x
            if (r10 <= 0) goto L_0x0217
            float r10 = r5.getRawX()
            r6.f221531r = r10
            float r10 = r5.getRawY()
            r6.f221532s = r10
            android.view.View r10 = r6.f221523g
            if (r10 == 0) goto L_0x0217
            com.tencent.mm.sdk.platformtools.MMHandler r10 = r6.f221533t
            de3.a0$b r11 = r6.f221535v
            int r12 = f221519x
            int r12 = r12 - r9
            long r12 = (long) r12
            r10.postDelayed(r11, r12)
        L_0x0217:
            if (r8 != 0) goto L_0x0236
            int[] r10 = new int[r3]
            float r11 = r5.getRawX()
            int r11 = (int) r11
            r10[r9] = r11
            float r11 = r5.getRawY()
            int r11 = (int) r11
            r10[r4] = r11
            android.view.View r11 = r6.f221523g
            r11.setTag(r2, r10)
            r6.f221524h = r9
            boolean r2 = r18.isClickable()
            r6.f221521e = r2
        L_0x0236:
            if (r8 != r3) goto L_0x025f
            float r2 = r5.getRawX()
            float r3 = r6.f221531r
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            r3 = 1084227584(0x40a00000, float:5.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0258
            float r2 = r5.getRawY()
            float r8 = r6.f221532s
            float r2 = r2 - r8
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x025f
        L_0x0258:
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r6.f221533t
            de3.a0$b r3 = r6.f221535v
            r2.removeCallbacks(r3)
        L_0x025f:
            r17.mo105677b()
            r2 = r0[r1]
            r6.f221520d = r2
            r6.f221522f = r7
            r3 = 0
            r2.setContext(r3)
            r2 = r0[r1]
            r2.setIsPressed(r4)
            r2 = r0[r1]
            r2.setEnable(r4)
            r18.invalidate()
            boolean r2 = r6.f221524h
            if (r2 == 0) goto L_0x028d
            r2 = r0[r1]
            r2.setIsPressed(r9)
            r0 = r0[r1]
            r0.setEnable(r9)
            boolean r0 = r6.f221521e
            r7.setClickable(r0)
            goto L_0x02a0
        L_0x028d:
            r0 = 1
            goto L_0x02a1
        L_0x028f:
            r17.mo105677b()
        L_0x0292:
            if (r8 != r4) goto L_0x0296
            r6.f221524h = r9
        L_0x0296:
            if (r8 == r10) goto L_0x029a
            if (r8 != r4) goto L_0x02a0
        L_0x029a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.f221531r = r0
            r6.f221532s = r0
        L_0x02a0:
            r0 = 0
        L_0x02a1:
            if (r0 == 0) goto L_0x02a4
            r9 = 1
        L_0x02a4:
            r5.recycle()
            java.lang.String r2 = "com/tencent/mm/pluginsdk/ui/span/PressSpanTouchListener"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r0 = r9
            r1 = r17
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: de3.C75355a0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C75355a0(Context context) {
        this.f221526j = context;
    }
}
