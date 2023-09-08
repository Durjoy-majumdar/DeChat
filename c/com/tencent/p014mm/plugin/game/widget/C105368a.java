package com.tencent.p014mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.widget.a */
public class C105368a {

    /* renamed from: a */
    public TextView f313206a;

    /* renamed from: b */
    public TextPaint f313207b;

    /* renamed from: c */
    public float f313208c;

    /* renamed from: d */
    public int f313209d;

    /* renamed from: e */
    public float f313210e;

    /* renamed from: f */
    public float f313211f;

    /* renamed from: g */
    public float f313212g;

    /* renamed from: h */
    public boolean f313213h;

    /* renamed from: i */
    public boolean f313214i;

    /* renamed from: j */
    public ArrayList<C105371c> f313215j;

    /* renamed from: k */
    public TextWatcher f313216k = new C105370b((C105369a) null);

    /* renamed from: com.tencent.mm.plugin.game.widget.a$b */
    public class C105370b implements TextWatcher {
        public C105370b(C105369a aVar) {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C105368a.this.mo150051a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.widget.a$c */
    public interface C105371c {
        /* renamed from: a */
        void mo150037a(float f, float f2);
    }

    public C105368a(TextView textView) {
        float f = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.f313206a = textView;
        this.f313207b = new TextPaint();
        float textSize = textView.getTextSize();
        if (this.f313208c != textSize) {
            this.f313208c = textSize;
        }
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        this.f313209d = (transformationMethod == null || !(transformationMethod instanceof SingleLineTransformationMethod)) ? textView.getMaxLines() : 1;
        this.f313210e = f * 8.0f;
        this.f313211f = this.f313208c;
        this.f313212g = 0.5f;
    }

    /* renamed from: b */
    public static float m141528b(CharSequence charSequence, TextPaint textPaint, float f, int i, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        StaticLayout staticLayout;
        int i2;
        float f5;
        TextPaint textPaint2 = textPaint;
        float f6 = f;
        int i3 = i;
        float f7 = (f2 + f3) / 2.0f;
        textPaint2.setTextSize(TypedValue.applyDimension(0, f7, displayMetrics));
        if (i3 != 1) {
            staticLayout = new StaticLayout(charSequence, textPaint, (int) f6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            i2 = staticLayout.getLineCount();
        } else {
            staticLayout = null;
            i2 = 1;
        }
        if (i2 > i3) {
            return f3 - f2 < f4 ? f2 : m141528b(charSequence, textPaint, f, i, f2, f7, f4, displayMetrics);
        }
        if (i2 < i3) {
            return m141528b(charSequence, textPaint, f, i, f7, f3, f4, displayMetrics);
        }
        float f8 = 0.0f;
        if (i3 == 1) {
            f5 = textPaint2.measureText(charSequence, 0, charSequence.length());
        } else {
            CharSequence charSequence2 = charSequence;
            for (int i4 = 0; i4 < i2; i4++) {
                if (staticLayout.getLineWidth(i4) > f8) {
                    f8 = staticLayout.getLineWidth(i4);
                }
            }
            f5 = f8;
        }
        return f3 - f2 < f4 ? f2 : f5 > f6 ? m141528b(charSequence, textPaint, f, i, f2, f7, f4, displayMetrics) : f5 < f6 ? m141528b(charSequence, textPaint, f, i, f7, f3, f4, displayMetrics) : f7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150051a() {
        /*
            r24 = this;
            r0 = r24
            android.widget.TextView r1 = r0.f313206a
            float r1 = r1.getTextSize()
            r2 = 1
            r0.f313214i = r2
            android.widget.TextView r3 = r0.f313206a
            android.text.TextPaint r12 = r0.f313207b
            float r13 = r0.f313210e
            float r14 = r0.f313211f
            int r15 = r0.f313209d
            float r11 = r0.f313212g
            r10 = 0
            if (r15 <= 0) goto L_0x00c4
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r15 != r4) goto L_0x0021
            goto L_0x00c4
        L_0x0021:
            int r4 = r3.getWidth()
            int r5 = r3.getPaddingLeft()
            int r4 = r4 - r5
            int r5 = r3.getPaddingRight()
            int r9 = r4 - r5
            if (r9 > 0) goto L_0x0034
            goto L_0x00c4
        L_0x0034:
            java.lang.CharSequence r4 = r3.getText()
            android.text.method.TransformationMethod r5 = r3.getTransformationMethod()
            if (r5 == 0) goto L_0x0042
            java.lang.CharSequence r4 = r5.getTransformation(r4, r3)
        L_0x0042:
            r8 = r4
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            r16 = 0
            if (r4 == 0) goto L_0x0053
            android.content.res.Resources r5 = r4.getResources()
        L_0x0053:
            android.util.DisplayMetrics r7 = r5.getDisplayMetrics()
            android.text.TextPaint r4 = r3.getPaint()
            r12.set(r4)
            r12.setTextSize(r14)
            if (r15 != r2) goto L_0x0078
            int r2 = r8.length()
            float r2 = r12.measureText(r8, r10, r2)
            float r4 = (float) r9
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0071
            goto L_0x0078
        L_0x0071:
            r22 = r7
            r2 = r8
            r4 = r9
            r18 = r11
            goto L_0x00aa
        L_0x0078:
            float r2 = (float) r9
            float r4 = android.util.TypedValue.applyDimension(r10, r14, r7)
            r12.setTextSize(r4)
            android.text.StaticLayout r17 = new android.text.StaticLayout
            int r2 = (int) r2
            android.text.Layout$Alignment r18 = android.text.Layout.Alignment.ALIGN_NORMAL
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 1
            r4 = r17
            r5 = r8
            r6 = r12
            r22 = r7
            r7 = r2
            r2 = r8
            r8 = r18
            r23 = r9
            r9 = r19
            r10 = r20
            r18 = r11
            r11 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r4 = r17.getLineCount()
            if (r4 <= r15) goto L_0x00b9
            r4 = r23
        L_0x00aa:
            float r6 = (float) r4
            r4 = r2
            r5 = r12
            r7 = r15
            r8 = r16
            r9 = r14
            r10 = r18
            r11 = r22
            float r14 = m141528b(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00b9:
            int r2 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r13 = r14
        L_0x00bf:
            r2 = 0
            r3.setTextSize(r2, r13)
            goto L_0x00c5
        L_0x00c4:
            r2 = 0
        L_0x00c5:
            r0.f313214i = r2
            android.widget.TextView r2 = r0.f313206a
            float r2 = r2.getTextSize()
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00ea
            java.util.ArrayList<com.tencent.mm.plugin.game.widget.a$c> r3 = r0.f313215j
            if (r3 != 0) goto L_0x00d6
            goto L_0x00ea
        L_0x00d6:
            java.util.Iterator r3 = r3.iterator()
        L_0x00da:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00ea
            java.lang.Object r4 = r3.next()
            com.tencent.mm.plugin.game.widget.a$c r4 = (com.tencent.p014mm.plugin.game.widget.C105368a.C105371c) r4
            r4.mo150037a(r2, r1)
            goto L_0x00da
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.widget.C105368a.mo150051a():void");
    }

    /* renamed from: c */
    public C105368a mo150052c(boolean z) {
        if (this.f313213h != z) {
            this.f313213h = z;
            if (z) {
                this.f313206a.addTextChangedListener(this.f313216k);
                mo150051a();
            } else {
                this.f313206a.removeTextChangedListener(this.f313216k);
                this.f313206a.setTextSize(0, this.f313208c);
            }
        }
        return this;
    }

    /* renamed from: d */
    public C105368a mo150053d(int i, float f) {
        Context context = this.f313206a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, system.getDisplayMetrics());
        if (applyDimension != this.f313210e) {
            this.f313210e = applyDimension;
            mo150051a();
        }
        return this;
    }
}
