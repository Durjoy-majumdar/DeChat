package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.ui.QTextView */
public class QTextView extends View {

    /* renamed from: d */
    public TextPaint f316295d;

    /* renamed from: e */
    public String f316296e = "";

    /* renamed from: f */
    public int f316297f;

    /* renamed from: g */
    public String f316298g;

    /* renamed from: h */
    public String f316299h;

    /* renamed from: i */
    public int f316300i;

    /* renamed from: j */
    public boolean f316301j;

    /* renamed from: n */
    public int f316302n;

    /* renamed from: o */
    public boolean f316303o;

    /* renamed from: p */
    public boolean f316304p;

    /* renamed from: q */
    public C106166a f316305q;

    /* renamed from: r */
    public C106166a f316306r;

    /* renamed from: s */
    public Context f316307s;

    /* renamed from: t */
    public int f316308t = -1;

    /* renamed from: u */
    public int f316309u = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.QTextView$a */
    public static class C106166a {

        /* renamed from: h */
        public static final /* synthetic */ int f316310h = 0;

        /* renamed from: a */
        public boolean f316311a = false;

        /* renamed from: b */
        public ArrayList<int[]> f316312b = new ArrayList<>();

        /* renamed from: c */
        public float f316313c;

        /* renamed from: d */
        public float f316314d;

        /* renamed from: e */
        public float f316315e;

        /* renamed from: f */
        public int f316316f = 0;

        /* renamed from: g */
        public String f316317g = "";

        static {
            new HashMap();
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00da A[LOOP:1: B:29:0x00da->B:32:0x00e2, LOOP_START, PHI: r2 
          PHI: (r2v19 int) = (r2v2 int), (r2v21 int) binds: [B:28:0x00d7, B:32:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x011c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo152002a(java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, int r23, android.text.TextPaint r24) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                r3 = r21
                r4 = r22
                r5 = r23
                r6 = r24
                java.lang.String r7 = "breakText"
                java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r1)
                r9.append(r2)
                r9.append(r3)
                r9.append(r4)
                r9.append(r5)
                java.lang.String r9 = r9.toString()
                java.lang.String r10 = r0.f316317g
                boolean r10 = r9.equals(r10)
                if (r10 == 0) goto L_0x003b
                int r1 = r0.f316316f
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                return r1
            L_0x003b:
                r0.f316317g = r9
                java.util.ArrayList<int[]> r9 = r0.f316312b
                r9.clear()
                r9 = 0
                r0.f316311a = r9
                r10 = 0
                r0.f316313c = r10
                r0.f316314d = r10
                r0.f316315e = r10
                r11 = 1056964608(0x3f000000, float:0.5)
                r12 = 2
                r13 = -1
                r14 = 1
                if (r5 != r13) goto L_0x006e
                java.util.ArrayList<int[]> r2 = r0.f316312b
                int[] r3 = new int[r12]
                r3[r9] = r9
                int r4 = r19.length()
                r3[r14] = r4
                r2.add(r3)
                float r1 = r6.measureText(r1)
                float r1 = r1 + r11
                int r1 = (int) r1
                r0.f316316f = r1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                return r1
            L_0x006e:
                if (r2 == 0) goto L_0x0076
                float r2 = r6.measureText(r2)
                r0.f316314d = r2
            L_0x0076:
                if (r3 == 0) goto L_0x007e
                float r2 = r6.measureText(r3)
                r0.f316315e = r2
            L_0x007e:
                r2 = 0
                r3 = -1
                r15 = 0
                r16 = 1
            L_0x0083:
                int r10 = r19.length()
                if (r2 >= r10) goto L_0x0136
                if (r3 != r13) goto L_0x008c
                r3 = r2
            L_0x008c:
                java.util.ArrayList<int[]> r10 = r0.f316312b
                int r10 = r10.size()
                if (r10 != r4) goto L_0x0098
                r0.f316311a = r14
                goto L_0x0136
            L_0x0098:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                char r13 = r1.charAt(r2)
                r10.append(r13)
                java.lang.String r13 = ""
                r10.append(r13)
                java.lang.String r10 = r10.toString()
                float r10 = r6.measureText(r10)
                char r13 = r1.charAt(r2)
                r11 = 10
                if (r13 != r11) goto L_0x00c8
                java.util.ArrayList<int[]> r11 = r0.f316312b
                int[] r13 = new int[r12]
                r13[r9] = r3
                int r17 = r2 + -1
                r13[r14] = r17
                r11.add(r13)
            L_0x00c6:
                r11 = 1
                goto L_0x00ff
            L_0x00c8:
                float r11 = r15 + r10
                float r13 = (float) r5
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 < 0) goto L_0x00fe
                char r11 = r1.charAt(r2)
                r13 = 32
                if (r11 == r13) goto L_0x00f0
                if (r16 != 0) goto L_0x00da
                goto L_0x00f0
            L_0x00da:
                char r11 = r1.charAt(r2)
                if (r11 == r13) goto L_0x00e4
                int r2 = r2 + -1
                if (r2 != 0) goto L_0x00da
            L_0x00e4:
                java.util.ArrayList<int[]> r11 = r0.f316312b
                int[] r13 = new int[r12]
                r13[r9] = r3
                r13[r14] = r2
                r11.add(r13)
                goto L_0x00c6
            L_0x00f0:
                int r2 = r2 + -1
                java.util.ArrayList<int[]> r11 = r0.f316312b
                int[] r13 = new int[r12]
                r13[r9] = r3
                r13[r14] = r2
                r11.add(r13)
                goto L_0x00c6
            L_0x00fe:
                r11 = 0
            L_0x00ff:
                if (r11 == 0) goto L_0x011c
                java.util.ArrayList<int[]> r3 = r0.f316312b
                int r3 = r3.size()
                int r10 = r4 + -1
                if (r3 != r10) goto L_0x0119
                float r3 = (float) r5
                float r5 = r0.f316314d
                float r10 = r0.f316315e
                float r5 = r5 + r10
                float r3 = r3 - r5
                int r3 = (int) r3
                r5 = r3
                r3 = -1
                r15 = 0
                r16 = 0
                goto L_0x012f
            L_0x0119:
                r3 = -1
                r15 = 0
                goto L_0x012f
            L_0x011c:
                float r15 = r15 + r10
                int r10 = r19.length()
                int r10 = r10 - r14
                if (r2 != r10) goto L_0x012f
                java.util.ArrayList<int[]> r10 = r0.f316312b
                int[] r11 = new int[r12]
                r11[r9] = r3
                r11[r14] = r2
                r10.add(r11)
            L_0x012f:
                int r2 = r2 + 1
                r11 = 1056964608(0x3f000000, float:0.5)
                r13 = -1
                goto L_0x0083
            L_0x0136:
                boolean r2 = r0.f316311a
                if (r2 == 0) goto L_0x0156
                java.util.ArrayList<int[]> r2 = r0.f316312b
                int r3 = r2.size()
                int r3 = r3 - r14
                java.lang.Object r2 = r2.get(r3)
                int[] r2 = (int[]) r2
                r3 = r2[r9]
                r2 = r2[r14]
                int r2 = r2 + r14
                java.lang.String r2 = r1.substring(r3, r2)
                float r2 = r6.measureText(r2)
                r0.f316313c = r2
            L_0x0156:
                java.util.ArrayList<int[]> r2 = r0.f316312b
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0164
                r0.f316316f = r9
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                return r9
            L_0x0164:
                java.util.ArrayList<int[]> r2 = r0.f316312b
                int r2 = r2.size()
                if (r2 != r14) goto L_0x017a
                float r1 = r6.measureText(r1)
                r2 = 1056964608(0x3f000000, float:0.5)
                float r1 = r1 + r2
                int r1 = (int) r1
                r0.f316316f = r1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                return r1
            L_0x017a:
                r0.f316316f = r5
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.QTextView.C106166a.mo152002a(java.lang.String, java.lang.String, java.lang.String, int, int, android.text.TextPaint):int");
        }

        /* renamed from: b */
        public List<int[]> mo152003b() {
            SnsMethodCalculate.markStartTimeMs("getLines", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            ArrayList<int[]> arrayList = this.f316312b;
            SnsMethodCalculate.markEndTimeMs("getLines", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            return arrayList;
        }
    }

    static {
        new HashMap();
    }

    public QTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f316307s = context;
        mo151988b();
    }

    /* renamed from: a */
    public final int mo151987a(int i) {
        SnsMethodCalculate.markStartTimeMs("breakWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        if (this.f316304p) {
            C106166a aVar = this.f316305q;
            int i2 = C106166a.f316310h;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            String str = aVar.f316317g;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            if (Util.isNullOrNil(str)) {
                C106166a aVar2 = this.f316305q;
                TextPaint textPaint = this.f316295d;
                aVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("breakText", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                int a = aVar2.mo152002a(this.f316296e, (String) null, (String) null, -1, (i - getPaddingLeft()) - getPaddingRight(), textPaint);
                SnsMethodCalculate.markEndTimeMs("breakText", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                this.f316309u = a;
            }
        } else {
            C106166a aVar3 = this.f316306r;
            int i3 = C106166a.f316310h;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            String str2 = aVar3.f316317g;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            if (Util.isNullOrNil(str2)) {
                this.f316309u = this.f316306r.mo152002a(this.f316296e, this.f316298g, this.f316299h, this.f316300i, (i - getPaddingLeft()) - getPaddingRight(), this.f316295d);
            }
        }
        int paddingLeft = this.f316309u + getPaddingLeft() + getPaddingRight();
        SnsMethodCalculate.markEndTimeMs("breakWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        return paddingLeft;
    }

    /* renamed from: b */
    public final void mo151988b() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f316304p = false;
        this.f316301j = true;
        this.f316303o = false;
        this.f316300i = -1;
        this.f316298g = "...";
        this.f316299h = "";
        this.f316302n = -16776961;
        this.f316305q = new C106166a();
        this.f316306r = new C106166a();
        TextPaint textPaint = new TextPaint();
        this.f316295d = textPaint;
        textPaint.setAntiAlias(true);
        if (this.f316308t == -1) {
            int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f316307s, 12.0f);
            this.f316308t = fromDPToPix;
            this.f316295d.setTextSize((float) fromDPToPix);
        } else {
            this.f316295d.setTextSize(13.0f);
        }
        this.f316295d.setColor(-16777216);
        this.f316295d.setTextAlign(Paint.Align.LEFT);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public boolean getIsExpanded() {
        SnsMethodCalculate.markStartTimeMs("getIsExpanded", "com.tencent.mm.plugin.sns.ui.QTextView");
        boolean z = this.f316304p;
        SnsMethodCalculate.markEndTimeMs("getIsExpanded", "com.tencent.mm.plugin.sns.ui.QTextView");
        return z;
    }

    public String getText() {
        SnsMethodCalculate.markStartTimeMs("getText", "com.tencent.mm.plugin.sns.ui.QTextView");
        String str = this.f316296e;
        SnsMethodCalculate.markEndTimeMs("getText", "com.tencent.mm.plugin.sns.ui.QTextView");
        return str;
    }

    public void onDraw(Canvas canvas) {
        List<int[]> list;
        C106166a aVar;
        Canvas canvas2 = canvas;
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.QTextView");
        super.onDraw(canvas);
        if (this.f316304p) {
            aVar = this.f316305q;
            list = aVar.mo152003b();
        } else {
            aVar = this.f316306r;
            list = aVar.mo152003b();
        }
        C106166a aVar2 = aVar;
        List<int[]> list2 = list;
        float paddingLeft = (float) getPaddingLeft();
        char c = 0;
        float paddingTop = (float) (getPaddingTop() + (-this.f316297f));
        int i = 0;
        while (i < list2.size()) {
            int[] iArr = list2.get(i);
            int i2 = i;
            canvas.drawText(this.f316296e, iArr[c], iArr[1] + 1, paddingLeft, paddingTop, this.f316295d);
            if (i2 == list2.size() - 1) {
                aVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("getRequiredEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                boolean z = aVar2.f316311a;
                SnsMethodCalculate.markEndTimeMs("getRequiredEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                if (z) {
                    String str = this.f316298g;
                    SnsMethodCalculate.markStartTimeMs("getLengthLastEllipsizedLine", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                    float f = aVar2.f316313c;
                    SnsMethodCalculate.markEndTimeMs("getLengthLastEllipsizedLine", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                    canvas2.drawText(str, f + paddingLeft, paddingTop, this.f316295d);
                    if (this.f316301j) {
                        int color = this.f316295d.getColor();
                        this.f316295d.setColor(this.f316302n);
                        if (this.f316303o) {
                            String str2 = this.f316299h;
                            SnsMethodCalculate.markStartTimeMs("getLengthEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            float f2 = aVar2.f316315e;
                            SnsMethodCalculate.markEndTimeMs("getLengthEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            canvas2.drawText(str2, ((float) canvas.getWidth()) - ((f2 + ((float) getPaddingRight())) + ((float) getPaddingLeft())), paddingTop, this.f316295d);
                        } else {
                            String str3 = this.f316299h;
                            SnsMethodCalculate.markStartTimeMs("getLengthLastEllipsizedLinePlusEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            SnsMethodCalculate.markEndTimeMs("getLengthLastEllipsizedLinePlusEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            canvas2.drawText(str3, aVar2.f316313c + aVar2.f316314d + paddingLeft, paddingTop, this.f316295d);
                        }
                        this.f316295d.setColor(color);
                    }
                }
            }
            paddingTop += ((float) (-this.f316297f)) + this.f316295d.descent();
            if (paddingTop > ((float) canvas.getHeight())) {
                break;
            }
            i = i2 + 1;
            c = 0;
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.QTextView");
        SnsMethodCalculate.markStartTimeMs("measureWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            mo151987a(size);
        } else if (mode == Integer.MIN_VALUE) {
            size = Math.min(mo151987a(size), size);
        } else {
            mo151987a(size);
            size = 0;
        }
        SnsMethodCalculate.markEndTimeMs("measureWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        SnsMethodCalculate.markStartTimeMs("measureHeight", "com.tencent.mm.plugin.sns.ui.QTextView");
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f316297f = (int) this.f316295d.ascent();
        if (mode2 != 1073741824) {
            int size3 = ((this.f316304p ? ((ArrayList) this.f316305q.mo152003b()).size() : ((ArrayList) this.f316306r.mo152003b()).size()) * ((int) (((float) (-this.f316297f)) + this.f316295d.descent()))) + getPaddingTop() + getPaddingBottom();
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(size3, size2) : size3;
        }
        SnsMethodCalculate.markEndTimeMs("measureHeight", "com.tencent.mm.plugin.sns.ui.QTextView");
        setMeasuredDimension(size, size2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setColorEllpsizeMore(int i) {
        SnsMethodCalculate.markStartTimeMs("setColorEllpsizeMore", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f316302n = i;
        SnsMethodCalculate.markEndTimeMs("setColorEllpsizeMore", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setDrawEllipsizeMoreString(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setDrawEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f316301j = z;
        SnsMethodCalculate.markEndTimeMs("setDrawEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setEllipsis(String str) {
        SnsMethodCalculate.markStartTimeMs("setEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f316298g = str;
        SnsMethodCalculate.markEndTimeMs("setEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setEllipsisMore(String str) {
        SnsMethodCalculate.markStartTimeMs("setEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f316299h = str;
        SnsMethodCalculate.markEndTimeMs("setEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setMaxLines(int i) {
        SnsMethodCalculate.markStartTimeMs("setMaxLines", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f316300i = i;
        SnsMethodCalculate.markEndTimeMs("setMaxLines", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setRightAlignEllipsizeMoreString(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setRightAlignEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f316303o = z;
        SnsMethodCalculate.markEndTimeMs("setRightAlignEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setText(String str) {
        SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.QTextView");
        if (Util.isNullOrNil(this.f316296e)) {
            this.f316296e = "";
        }
        this.f316296e = str;
        C106166a aVar = this.f316305q;
        int i = C106166a.f316310h;
        SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        aVar.f316317g = "";
        SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        C106166a aVar2 = this.f316306r;
        SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        aVar2.f316317g = "";
        SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        requestLayout();
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setTextColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f316295d.setColor(i);
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public void setTextSize(int i) {
        SnsMethodCalculate.markStartTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f316295d.setTextSize((float) i);
        requestLayout();
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public QTextView(Context context) {
        super(context);
        this.f316307s = context;
        mo151988b();
    }
}
