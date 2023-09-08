package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import au0.C67107a;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84975p1;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.e0 */
public final class C104858e0 extends C104930w0 {

    /* renamed from: A */
    public C67107a f311396A;

    /* renamed from: B */
    public boolean f311397B = false;

    /* renamed from: C */
    public String f311398C = "cursor";

    /* renamed from: D */
    public MotionEvent f311399D;

    /* renamed from: E */
    public boolean f311400E = false;

    /* renamed from: F */
    public final C104897m1<C104858e0> f311401F = new C104897m1<>(this);

    /* renamed from: v */
    public final InputFilter f311402v = new C84953d();

    /* renamed from: w */
    public float f311403w;

    /* renamed from: x */
    public float f311404x = 0.0f;

    /* renamed from: y */
    public float f311405y = 1.2f;

    /* renamed from: z */
    public float f311406z = getTextSize();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.e0$a */
    public class C84951a extends Spannable.Factory {
        public C84951a() {
        }

        public Spannable newSpannable(CharSequence charSequence) {
            Spannable newSpannable = super.newSpannable(charSequence);
            if (C104858e0.this.f311396A != null && !TextUtils.isEmpty(newSpannable)) {
                newSpannable.setSpan(C104858e0.this.f311396A, 0, newSpannable.length(), 18);
            }
            return newSpannable;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.e0$c */
    public class C84952c implements View.OnLongClickListener {
        public C84952c() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputWidgetMultiLine$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            boolean m = C104858e0.this.mo117831m();
            C117292a.m165362h(m, this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputWidgetMultiLine$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return m;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.e0$d */
    public class C84953d implements InputFilter {
        public C84953d() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (TextUtils.isEmpty(charSequence) || C104858e0.this.f311396A == null) {
                return null;
            }
            Spannable spannableStringBuilder = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(C104858e0.this.f311396A, 0, spannableStringBuilder.length(), 18);
            return spannableStringBuilder;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.e0$b */
    public class C104859b implements C104863f1.C104866c {
        public C104859b() {
        }

        /* renamed from: a */
        public void mo148728a(int i, int i2) {
            C104858e0.this.mo148765D();
        }
    }

    public C104858e0(Context context) {
        super(context);
        super.setSingleLine(false);
        super.setLineSpacing(0.0f, 1.0f);
        setVerticalScrollbarPosition(2);
        setSpannableFactory(new C84951a());
        mo148814l(new C104859b());
        setOnLongClickListener(new C84952c());
        this.f311403w = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        setAutoHeight(false);
        setAdjustKeyboardTo("cursor");
        mo148766E(0.0f, false);
    }

    /* renamed from: D */
    public void mo148765D() {
        if (!this.f311397B) {
            return;
        }
        if (getMeasuredHeight() > getMaxHeight()) {
            setMeasuredDimension(getMeasuredWidth(), getMaxHeight());
        } else if (getMeasuredHeight() < getMinHeight() && getMinHeight() > 0) {
            setMeasuredDimension(getMeasuredWidth(), getMinHeight());
        }
    }

    /* renamed from: E */
    public final void mo148766E(float f, boolean z) {
        if (f <= 0.0f) {
            f = (this.f311405y * this.f311406z) + this.f311404x;
        }
        C67107a aVar = this.f311396A;
        if (aVar != null) {
            if (!(aVar.f192699d != Math.round(f))) {
                return;
            }
        }
        C67107a aVar2 = this.f311396A;
        if (aVar2 == null) {
            this.f311396A = new C67107a(f, 17);
        } else {
            aVar2.f192699d = Math.round(f);
        }
        if (z) {
            if (hasFocus()) {
                invalidate();
                return;
            }
            mo148943w();
            setText(getEditableText());
            mo148918A();
        }
    }

    public boolean canScrollVertically(int i) {
        if (mo148941t() <= getHeight()) {
            return false;
        }
        return super.canScrollVertically(i);
    }

    public String getAdjustKeyboardTo() {
        return this.f311398C;
    }

    public View getInputPanel() {
        return C84983t0.m104783y(this);
    }

    public int getLineHeight() {
        C67107a aVar = this.f311396A;
        return aVar != null ? aVar.f192699d : super.getLineHeight();
    }

    @Deprecated
    public float getLineSpacingExtra() {
        return super.getLineSpacingExtra();
    }

    @Deprecated
    public float getLineSpacingMultiplier() {
        return super.getLineSpacingMultiplier();
    }

    /* renamed from: m */
    public boolean mo117831m() {
        if (!this.f311397B) {
            int t = mo148941t();
            int measuredHeight = getMeasuredHeight();
        }
        return !isFocusable() && !this.f311566r;
    }

    /* renamed from: n */
    public void mo148773n(float f, float f2) {
        int a;
        if (isEnabled()) {
            if (mo117831m() && (a = C84975p1.C84976a.m104770a(this, f + ((float) getScrollX()), f2 + ((float) getScrollY()))) >= 0) {
                setSelection(a);
            }
            performClick();
        }
    }

    /* renamed from: o */
    public boolean mo148774o() {
        return true;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b9, code lost:
        if (r3[0].f311521g != false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0315, code lost:
        if (r2 != 3) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0168, code lost:
        if (r10 != 3) goto L_0x02bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0164  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r16.mo117831m()
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x030a
            android.view.ViewParent r2 = r16.getParent()
            boolean r2 = r2 instanceof ct0.C86130d
            if (r2 == 0) goto L_0x030a
            int r2 = r17.getActionMasked()
            if (r2 != 0) goto L_0x002a
            android.view.ViewParent r2 = r16.getParent()
            ct0.d r2 = (ct0.C86130d) r2
            boolean r2 = r2.mo117834p(r1)
            if (r2 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r6
        L_0x002a:
            com.tencent.mm.plugin.appbrand.widget.input.m1<com.tencent.mm.plugin.appbrand.widget.input.e0> r2 = r0.f311401F
            java.lang.String r7 = r2.f311469b
            java.lang.String r8 = "processTouchEvent"
            ct0.C86128a.m106644c(r7, r8, r1)
            Input r7 = r2.f311468a
            int r8 = r17.getActionIndex()
            float r9 = r1.getX(r8)
            float r8 = r1.getY(r8)
            int r10 = r17.getActionMasked()
            if (r10 == 0) goto L_0x0058
            android.view.MotionEvent r10 = r2.f311472e
            if (r10 != 0) goto L_0x0058
            java.lang.String r1 = r2.f311469b
            java.lang.String r3 = "[textscroll] no pointer down before, just return"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r3)
            r2.mo148861b()
            goto L_0x0309
        L_0x0058:
            int r10 = r17.getActionMasked()
            if (r10 == 0) goto L_0x0108
            if (r10 == r5) goto L_0x00a4
            if (r10 == r4) goto L_0x006b
            if (r10 == r3) goto L_0x0066
            goto L_0x0106
        L_0x0066:
            r2.mo148861b()
            goto L_0x0106
        L_0x006b:
            float r10 = r2.f311470c
            float r11 = -r10
            int r12 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r12 < 0) goto L_0x008c
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x008c
            int r11 = r7.getWidth()
            float r11 = (float) r11
            float r11 = r11 + r10
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x008c
            int r9 = r7.getHeight()
            float r9 = (float) r9
            float r9 = r9 + r10
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x008c
            r8 = 1
            goto L_0x008d
        L_0x008c:
            r8 = 0
        L_0x008d:
            if (r8 == 0) goto L_0x0097
            android.view.MotionEvent r8 = r2.f311472e
            boolean r8 = r2.mo148860a(r8, r1)
            if (r8 != 0) goto L_0x0148
        L_0x0097:
            r2.f311473f = r6
            java.lang.Runnable r8 = r2.f311474g
            r7.removeCallbacks(r8)
            java.lang.Runnable r8 = r2.f311475h
            r7.removeCallbacks(r8)
            goto L_0x0106
        L_0x00a4:
            java.lang.String r10 = r2.f311469b
            java.lang.Object[] r11 = new java.lang.Object[r5]
            boolean r12 = r2.f311473f
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r11[r6] = r12
            java.lang.String r12 = "[apptouch] ACTION_UP, pointerDown %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r10, r12, r11)
            boolean r10 = r2.f311473f
            if (r10 == 0) goto L_0x0103
            android.view.MotionEvent r10 = r2.f311472e
            if (r10 == 0) goto L_0x0103
            Input r10 = r2.f311468a
            sn0.e$f r10 = sn0.C90259e.m112995c(r10)
            sn0.e$f r11 = r2.f311471d
            if (r11 == 0) goto L_0x00fc
            float r11 = r11.f259091b
            float r12 = r10.f259091b
            float r11 = r11 - r12
            float r11 = java.lang.Math.abs(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x00fc
            sn0.e$f r11 = r2.f311471d
            float r11 = r11.f259092c
            float r10 = r10.f259092c
            float r11 = r11 - r10
            float r10 = java.lang.Math.abs(r11)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x00e6
            goto L_0x00fc
        L_0x00e6:
            android.view.MotionEvent r10 = r2.f311472e
            boolean r10 = r2.mo148860a(r10, r1)
            if (r10 != 0) goto L_0x00f6
            java.lang.String r7 = r2.f311469b
            java.lang.String r8 = "[apptouch] check tap on ACTION_UP exceed tap scope"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r8)
            goto L_0x0103
        L_0x00f6:
            com.tencent.mm.plugin.appbrand.widget.input.f1 r7 = (com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1) r7
            r7.mo148773n(r9, r8)
            goto L_0x0103
        L_0x00fc:
            java.lang.String r7 = r2.f311469b
            java.lang.String r8 = "[apptouch] check tap on ACTION_UP, but view has moved."
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r8)
        L_0x0103:
            r2.mo148861b()
        L_0x0106:
            r7 = 0
            goto L_0x0149
        L_0x0108:
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r17)
            r2.f311472e = r8
            sn0.e$f r8 = sn0.C90259e.m112995c(r7)
            r2.f311471d = r8
            android.view.ViewParent r8 = r7.getParent()
        L_0x0118:
            if (r8 == 0) goto L_0x012e
            boolean r9 = r8 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x012e
            r9 = r8
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            boolean r9 = r9.shouldDelayChildPressedState()
            if (r9 == 0) goto L_0x0129
            r8 = 1
            goto L_0x012f
        L_0x0129:
            android.view.ViewParent r8 = r8.getParent()
            goto L_0x0118
        L_0x012e:
            r8 = 0
        L_0x012f:
            java.lang.Runnable r9 = r2.f311474g
            r7.removeCallbacks(r9)
            if (r8 == 0) goto L_0x0141
            java.lang.Runnable r8 = r2.f311474g
            int r9 = android.view.ViewConfiguration.getTapTimeout()
            long r9 = (long) r9
            r7.postDelayed(r8, r9)
            goto L_0x0148
        L_0x0141:
            java.lang.Runnable r7 = r2.f311474g
            com.tencent.mm.plugin.appbrand.widget.input.m1$a r7 = (com.tencent.p014mm.plugin.appbrand.widget.input.C104897m1.C104898a) r7
            r7.run()
        L_0x0148:
            r7 = 1
        L_0x0149:
            Input r8 = r2.f311468a
            android.text.Editable r9 = r8.getText()
            r10 = -1
            boolean r10 = r8.canScrollVertically(r10)
            if (r10 != 0) goto L_0x015e
            boolean r10 = r8.canScrollVertically(r5)
            if (r10 != 0) goto L_0x015e
            goto L_0x02bc
        L_0x015e:
            int r10 = r17.getActionMasked()
            if (r10 == 0) goto L_0x02be
            if (r10 == r5) goto L_0x02ac
            if (r10 == r4) goto L_0x016c
            if (r10 == r3) goto L_0x02ac
            goto L_0x02bc
        L_0x016c:
            int r3 = r9.length()
            java.lang.Class<com.tencent.mm.plugin.appbrand.widget.input.o1$a> r10 = com.tencent.p014mm.plugin.appbrand.widget.input.C104909o1.C104910a.class
            java.lang.Object[] r3 = r9.getSpans(r6, r3, r10)
            com.tencent.mm.plugin.appbrand.widget.input.o1$a[] r3 = (com.tencent.p014mm.plugin.appbrand.widget.input.C104909o1.C104910a[]) r3
            int r10 = r3.length
            if (r10 <= 0) goto L_0x02bc
            r10 = r3[r6]
            boolean r10 = r10.f311520f
            if (r10 != 0) goto L_0x01b4
            android.content.Context r10 = r8.getContext()
            android.view.ViewConfiguration r10 = android.view.ViewConfiguration.get(r10)
            int r10 = r10.getScaledTouchSlop()
            float r11 = r17.getX()
            r12 = r3[r6]
            float r12 = r12.f311518d
            float r11 = r11 - r12
            float r11 = java.lang.Math.abs(r11)
            float r10 = (float) r10
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x01b0
            float r11 = r17.getY()
            r12 = r3[r6]
            float r12 = r12.f311519e
            float r11 = r11 - r12
            float r11 = java.lang.Math.abs(r11)
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x01b4
        L_0x01b0:
            r10 = r3[r6]
            r10.f311520f = r5
        L_0x01b4:
            r10 = r3[r6]
            boolean r11 = r10.f311520f
            if (r11 == 0) goto L_0x02bc
            r10.f311521g = r5
            int r10 = r17.getMetaState()
            r10 = r10 & r5
            if (r10 != 0) goto L_0x01d4
            int r10 = android.text.method.MetaKeyKeyListener.getMetaState(r9, r5)
            if (r10 == r5) goto L_0x01d4
            r10 = 2048(0x800, float:2.87E-42)
            int r9 = android.text.method.MetaKeyKeyListener.getMetaState(r9, r10)
            if (r9 == 0) goto L_0x01d2
            goto L_0x01d4
        L_0x01d2:
            r9 = 0
            goto L_0x01d5
        L_0x01d4:
            r9 = 1
        L_0x01d5:
            if (r9 == 0) goto L_0x01e9
            float r9 = r17.getX()
            r10 = r3[r6]
            float r10 = r10.f311518d
            float r9 = r9 - r10
            float r10 = r17.getY()
            r11 = r3[r6]
            float r11 = r11.f311519e
            goto L_0x01fa
        L_0x01e9:
            r9 = r3[r6]
            float r9 = r9.f311518d
            float r10 = r17.getX()
            float r9 = r9 - r10
            r10 = r3[r6]
            float r10 = r10.f311519e
            float r11 = r17.getY()
        L_0x01fa:
            float r10 = r10 - r11
            r11 = r3[r6]
            float r12 = r17.getX()
            r11.f311518d = r12
            r11 = r3[r6]
            float r12 = r17.getY()
            r11.f311519e = r12
            r11 = r3[r6]
            r11.getClass()
            int r11 = r8.getScrollX()
            int r9 = (int) r9
            int r11 = r11 + r9
            int r9 = r8.getScrollY()
            int r10 = (int) r10
            int r9 = r9 + r10
            int r10 = r8.getTotalPaddingTop()
            int r12 = r8.getTotalPaddingBottom()
            int r10 = r10 + r12
            android.text.Layout r12 = r8.getLayout()
            int r13 = r12.getHeight()
            int r14 = r8.getHeight()
            int r14 = r14 - r10
            int r13 = r13 - r14
            int r9 = java.lang.Math.min(r9, r13)
            int r9 = java.lang.Math.max(r9, r6)
            int r10 = r8.getScrollX()
            int r13 = r8.getScrollY()
            int r14 = r8.getTotalPaddingLeft()
            int r15 = r8.getTotalPaddingRight()
            int r14 = r14 + r15
            int r15 = r8.getWidth()
            int r15 = r15 - r14
            int r14 = r12.getLineForVertical(r9)
            android.text.Layout$Alignment r5 = r12.getParagraphAlignment(r14)
            int r12 = r12.getParagraphDirection(r14)
            if (r12 <= 0) goto L_0x0261
            r12 = 1
            goto L_0x0262
        L_0x0261:
            r12 = 0
        L_0x0262:
            int r14 = r15 + 0
            if (r14 >= r15) goto L_0x027f
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r5 != r11) goto L_0x026d
            int r15 = r15 - r14
            int r15 = r15 / r4
            goto L_0x027a
        L_0x026d:
            if (r12 == 0) goto L_0x0273
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r5 == r4) goto L_0x0279
        L_0x0273:
            if (r12 != 0) goto L_0x027d
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r5 != r4) goto L_0x027d
        L_0x0279:
            int r15 = r15 - r14
        L_0x027a:
            int r4 = 0 - r15
            goto L_0x0288
        L_0x027d:
            r4 = 0
            goto L_0x0288
        L_0x027f:
            int r15 = r15 - r15
            int r4 = java.lang.Math.min(r11, r15)
            int r4 = java.lang.Math.max(r4, r6)
        L_0x0288:
            r8.scrollTo(r4, r9)
            int r4 = r8.getScrollX()
            if (r10 != r4) goto L_0x02a3
            int r4 = r8.getScrollY()
            if (r13 == r4) goto L_0x0298
            goto L_0x02a3
        L_0x0298:
            r3 = r3[r6]
            boolean r3 = r3.f311522h
            if (r3 == 0) goto L_0x029f
            goto L_0x02f0
        L_0x029f:
            com.tencent.p014mm.plugin.appbrand.widget.input.C104909o1.m140643a(r8)
            goto L_0x02bc
        L_0x02a3:
            r8.cancelLongPress()
            r3 = r3[r6]
            r4 = 1
            r3.f311522h = r4
            goto L_0x02f0
        L_0x02ac:
            com.tencent.mm.plugin.appbrand.widget.input.o1$a[] r3 = com.tencent.p014mm.plugin.appbrand.widget.input.C104909o1.m140643a(r8)
            if (r3 == 0) goto L_0x02bc
            int r4 = r3.length
            if (r4 <= 0) goto L_0x02bc
            r3 = r3[r6]
            boolean r3 = r3.f311521g
            if (r3 == 0) goto L_0x02bc
            goto L_0x02f0
        L_0x02bc:
            r5 = 0
            goto L_0x02f1
        L_0x02be:
            int r3 = r9.length()
            java.lang.Class<com.tencent.mm.plugin.appbrand.widget.input.o1$a> r4 = com.tencent.p014mm.plugin.appbrand.widget.input.C104909o1.C104910a.class
            java.lang.Object[] r3 = r9.getSpans(r6, r3, r4)
            com.tencent.mm.plugin.appbrand.widget.input.o1$a[] r3 = (com.tencent.p014mm.plugin.appbrand.widget.input.C104909o1.C104910a[]) r3
            r4 = 0
        L_0x02cb:
            int r5 = r3.length
            if (r4 >= r5) goto L_0x02d6
            r5 = r3[r4]
            r9.removeSpan(r5)
            int r4 = r4 + 1
            goto L_0x02cb
        L_0x02d6:
            com.tencent.mm.plugin.appbrand.widget.input.o1$a r3 = new com.tencent.mm.plugin.appbrand.widget.input.o1$a
            float r4 = r17.getX()
            float r5 = r17.getY()
            int r10 = r8.getScrollX()
            int r8 = r8.getScrollY()
            r3.<init>(r4, r5, r10, r8)
            r4 = 17
            r9.setSpan(r3, r6, r6, r4)
        L_0x02f0:
            r5 = 1
        L_0x02f1:
            r6 = r7 | r5
            java.lang.String r2 = r2.f311469b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[textscroll] handled | "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            ct0.C86128a.m106644c(r2, r3, r1)
        L_0x0309:
            return r6
        L_0x030a:
            int r2 = r17.getActionMasked()
            if (r2 == 0) goto L_0x0392
            r5 = 1
            if (r2 == r5) goto L_0x0361
            if (r2 == r4) goto L_0x0319
            if (r2 == r3) goto L_0x0361
            goto L_0x039b
        L_0x0319:
            boolean r2 = r0.f311400E
            if (r2 == 0) goto L_0x039b
            android.view.MotionEvent r2 = r0.f311399D
            int r3 = r2.getActionIndex()
            float r2 = r2.getX(r3)
            android.view.MotionEvent r3 = r0.f311399D
            int r4 = r3.getActionIndex()
            float r3 = r3.getY(r4)
            int r4 = r17.getActionIndex()
            float r4 = r1.getX(r4)
            int r5 = r17.getActionIndex()
            float r5 = r1.getY(r5)
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            float r4 = r0.f311403w
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0358
            float r3 = r3 - r5
            float r2 = java.lang.Math.abs(r3)
            float r3 = r0.f311403w
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0358
            goto L_0x039b
        L_0x0358:
            r16.cancelLongPress()
            r0.setPressed(r6)
            r0.f311400E = r6
            goto L_0x039b
        L_0x0361:
            r0.f311400E = r6
            android.view.MotionEvent r2 = r0.f311399D
            if (r2 == 0) goto L_0x036d
            r2.recycle()
            r2 = 0
            r0.f311399D = r2
        L_0x036d:
            boolean r2 = r0.f311400E
            if (r2 == 0) goto L_0x038a
            int r2 = r17.getActionIndex()
            float r2 = r1.getX(r2)
            int r3 = r17.getActionIndex()
            float r3 = r1.getY(r3)
            int r2 = com.tencent.p014mm.plugin.appbrand.widget.input.C84975p1.C84976a.m104770a(r0, r2, r3)
            if (r2 < 0) goto L_0x038a
            r0.setSelection(r2)
        L_0x038a:
            android.view.ViewParent r2 = r16.getParent()
            if (r2 != 0) goto L_0x039b
            r2 = 1
            return r2
        L_0x0392:
            r2 = 1
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r17)
            r0.f311399D = r3
            r0.f311400E = r2
        L_0x039b:
            boolean r1 = super.onTouchEvent(r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.input.C104858e0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performHapticFeedback(int i, int i2) {
        return super.performHapticFeedback(i, i2);
    }

    public void scrollBy(int i, int i2) {
        super.scrollBy(i, i2);
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    public void setAdjustKeyboardTo(String str) {
        this.f311398C = str;
    }

    public void setAutoHeight(boolean z) {
        this.f311397B = z;
        setVerticalScrollBarEnabled(!z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        if (this.f311402v != null) {
            int i = 0;
            if (inputFilterArr == null) {
                inputFilterArr = new InputFilter[0];
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            while (i < inputFilterArr.length) {
                inputFilterArr2[i] = inputFilterArr[i];
                i++;
            }
            inputFilterArr2[i] = this.f311402v;
            inputFilterArr = inputFilterArr2;
        }
        super.setFilters(inputFilterArr);
    }

    public void setGravity(int i) {
        super.setGravity((i & -81 & -17) | 48);
    }

    public final void setInputType(int i) {
        super.setInputType(i | 131072);
    }

    public void setLineHeight(float f) {
        if (f > 0.0f) {
            mo148766E(f, true);
        }
    }

    public void setLineSpace(float f) {
        setLineSpacing(f, this.f311405y);
    }

    public void setLineSpacing(float f, float f2) {
        this.f311404x = f;
        this.f311405y = f2;
        mo148766E(0.0f, true);
    }

    public void setSingleLine(boolean z) {
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.f311406z = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
        mo148766E(0.0f, true);
    }

    /* renamed from: v */
    public void mo148790v() {
        C84975p1.m104767b(this).restartInput(this);
    }

    /* renamed from: z */
    public Editable mo148791z(Editable editable) {
        this.f311564p.mo148956a(editable);
        if (this.f311396A != null && !TextUtils.isEmpty(editable)) {
            editable.setSpan(this.f311396A, 0, editable.length(), 18);
        }
        return editable;
    }
}
