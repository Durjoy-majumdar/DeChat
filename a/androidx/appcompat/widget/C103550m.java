package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.m */
public class C103550m {

    /* renamed from: k */
    public static final RectF f305807k = new RectF();

    /* renamed from: l */
    public static ConcurrentHashMap<String, Method> f305808l = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f305809a = 0;

    /* renamed from: b */
    public boolean f305810b = false;

    /* renamed from: c */
    public float f305811c = -1.0f;

    /* renamed from: d */
    public float f305812d = -1.0f;

    /* renamed from: e */
    public float f305813e = -1.0f;

    /* renamed from: f */
    public int[] f305814f = new int[0];

    /* renamed from: g */
    public boolean f305815g = false;

    /* renamed from: h */
    public TextPaint f305816h;

    /* renamed from: i */
    public final TextView f305817i;

    /* renamed from: j */
    public final Context f305818j;

    public C103550m(TextView textView) {
        this.f305817i = textView;
        this.f305818j = textView.getContext();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo144405a() {
        /*
            r6 = this;
            boolean r0 = r6.mo144412h()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000e
            int r0 = r6.f305809a
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            boolean r0 = r6.f305810b
            if (r0 == 0) goto L_0x0096
            android.widget.TextView r0 = r6.f305817i
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L_0x0095
            android.widget.TextView r0 = r6.f305817i
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L_0x0027
            goto L_0x0095
        L_0x0027:
            android.widget.TextView r0 = r6.f305817i
            java.lang.String r3 = "getHorizontallyScrolling"
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.reflect.Method r3 = r6.mo144408d(r3)     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            java.lang.Object r4 = r3.invoke(r0, r5)     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            goto L_0x003a
        L_0x0038:
            r0 = move-exception
            throw r0
        L_0x003a:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x0045
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0059
        L_0x0045:
            android.widget.TextView r0 = r6.f305817i
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r3 = r6.f305817i
            int r3 = r3.getTotalPaddingLeft()
            int r0 = r0 - r3
            android.widget.TextView r3 = r6.f305817i
            int r3 = r3.getTotalPaddingRight()
            int r0 = r0 - r3
        L_0x0059:
            android.widget.TextView r3 = r6.f305817i
            int r3 = r3.getHeight()
            android.widget.TextView r4 = r6.f305817i
            int r4 = r4.getCompoundPaddingBottom()
            int r3 = r3 - r4
            android.widget.TextView r4 = r6.f305817i
            int r4 = r4.getCompoundPaddingTop()
            int r3 = r3 - r4
            if (r0 <= 0) goto L_0x0095
            if (r3 > 0) goto L_0x0072
            goto L_0x0095
        L_0x0072:
            android.graphics.RectF r4 = f305807k
            monitor-enter(r4)
            r4.setEmpty()     // Catch:{ all -> 0x0092 }
            float r0 = (float) r0     // Catch:{ all -> 0x0092 }
            r4.right = r0     // Catch:{ all -> 0x0092 }
            float r0 = (float) r3     // Catch:{ all -> 0x0092 }
            r4.bottom = r0     // Catch:{ all -> 0x0092 }
            int r0 = r6.mo144407c(r4)     // Catch:{ all -> 0x0092 }
            float r0 = (float) r0     // Catch:{ all -> 0x0092 }
            android.widget.TextView r3 = r6.f305817i     // Catch:{ all -> 0x0092 }
            float r3 = r3.getTextSize()     // Catch:{ all -> 0x0092 }
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0090
            r6.mo144409e(r2, r0)     // Catch:{ all -> 0x0092 }
        L_0x0090:
            monitor-exit(r4)     // Catch:{ all -> 0x0092 }
            goto L_0x0096
        L_0x0092:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0092 }
            throw r0
        L_0x0095:
            return
        L_0x0096:
            r6.f305810b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103550m.mo144405a():void");
    }

    /* renamed from: b */
    public final int[] mo144406b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r10 = android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo144407c(android.graphics.RectF r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            int[] r2 = r1.f305814f
            int r2 = r2.length
            if (r2 == 0) goto L_0x0145
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = 1
            r6 = 0
        L_0x000e:
            if (r5 > r2) goto L_0x0140
            int r6 = r5 + r2
            int r6 = r6 / 2
            int[] r7 = r1.f305814f
            r7 = r7[r6]
            android.widget.TextView r8 = r1.f305817i
            java.lang.CharSequence r8 = r8.getText()
            android.widget.TextView r9 = r1.f305817i
            android.text.method.TransformationMethod r9 = r9.getTransformationMethod()
            if (r9 == 0) goto L_0x002f
            android.widget.TextView r10 = r1.f305817i
            java.lang.CharSequence r9 = r9.getTransformation(r8, r10)
            if (r9 == 0) goto L_0x002f
            r8 = r9
        L_0x002f:
            int r9 = android.os.Build.VERSION.SDK_INT
            android.widget.TextView r10 = r1.f305817i
            int r15 = r10.getMaxLines()
            android.text.TextPaint r10 = r1.f305816h
            if (r10 != 0) goto L_0x0043
            android.text.TextPaint r10 = new android.text.TextPaint
            r10.<init>()
            r1.f305816h = r10
            goto L_0x0046
        L_0x0043:
            r10.reset()
        L_0x0046:
            android.text.TextPaint r10 = r1.f305816h
            android.widget.TextView r11 = r1.f305817i
            android.text.TextPaint r11 = r11.getPaint()
            r10.set(r11)
            android.text.TextPaint r10 = r1.f305816h
            float r7 = (float) r7
            r10.setTextSize(r7)
            android.widget.TextView r7 = r1.f305817i
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.String r11 = "getLayoutAlignment"
            java.lang.reflect.Method r11 = r1.mo144408d(r11)     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            java.lang.Object r10 = r11.invoke(r7, r12)     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            goto L_0x006a
        L_0x0068:
            r0 = move-exception
            throw r0
        L_0x006a:
            r14 = r10
            android.text.Layout$Alignment r14 = (android.text.Layout.Alignment) r14
            r7 = 23
            r13 = -1
            if (r9 < r7) goto L_0x00e0
            float r7 = r0.right
            int r7 = java.lang.Math.round(r7)
            android.widget.TextView r9 = r1.f305817i
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            java.lang.String r11 = "getTextDirectionHeuristic"
            java.lang.reflect.Method r11 = r1.mo144408d(r11)     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
            java.lang.Object r10 = r11.invoke(r9, r12)     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
            goto L_0x008b
        L_0x0089:
            r0 = move-exception
            throw r0
        L_0x008b:
            android.text.TextDirectionHeuristic r10 = (android.text.TextDirectionHeuristic) r10
            int r9 = r8.length()
            android.text.TextPaint r11 = r1.f305816h
            android.text.StaticLayout$Builder r7 = android.text.StaticLayout.Builder.obtain(r8, r4, r9, r11, r7)
            android.text.StaticLayout$Builder r7 = r7.setAlignment(r14)
            android.widget.TextView r9 = r1.f305817i
            float r9 = r9.getLineSpacingExtra()
            android.widget.TextView r11 = r1.f305817i
            float r11 = r11.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r7 = r7.setLineSpacing(r9, r11)
            android.widget.TextView r9 = r1.f305817i
            boolean r9 = r9.getIncludeFontPadding()
            android.text.StaticLayout$Builder r7 = r7.setIncludePad(r9)
            android.widget.TextView r9 = r1.f305817i
            int r9 = r9.getBreakStrategy()
            android.text.StaticLayout$Builder r7 = r7.setBreakStrategy(r9)
            android.widget.TextView r9 = r1.f305817i
            int r9 = r9.getHyphenationFrequency()
            android.text.StaticLayout$Builder r7 = r7.setHyphenationFrequency(r9)
            if (r15 != r13) goto L_0x00cf
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00d0
        L_0x00cf:
            r9 = r15
        L_0x00d0:
            android.text.StaticLayout$Builder r7 = r7.setMaxLines(r9)
            android.text.StaticLayout$Builder r7 = r7.setTextDirection(r10)
            android.text.StaticLayout r7 = r7.build()
            r9 = r7
            r7 = r15
            r4 = -1
            goto L_0x0108
        L_0x00e0:
            float r7 = r0.right
            int r7 = java.lang.Math.round(r7)
            android.widget.TextView r9 = r1.f305817i
            float r9 = r9.getLineSpacingMultiplier()
            android.widget.TextView r10 = r1.f305817i
            float r16 = r10.getLineSpacingExtra()
            android.widget.TextView r10 = r1.f305817i
            boolean r17 = r10.getIncludeFontPadding()
            android.text.StaticLayout r18 = new android.text.StaticLayout
            android.text.TextPaint r12 = r1.f305816h
            r10 = r18
            r11 = r8
            r4 = -1
            r13 = r7
            r7 = r15
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r9 = r18
        L_0x0108:
            if (r7 == r4) goto L_0x0120
            int r4 = r9.getLineCount()
            if (r4 > r7) goto L_0x012b
            int r4 = r9.getLineCount()
            int r4 = r4 - r3
            int r4 = r9.getLineEnd(r4)
            int r7 = r8.length()
            if (r4 == r7) goto L_0x0120
            goto L_0x012b
        L_0x0120:
            int r4 = r9.getHeight()
            float r4 = (float) r4
            float r7 = r0.bottom
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x012d
        L_0x012b:
            r4 = 0
            goto L_0x012e
        L_0x012d:
            r4 = 1
        L_0x012e:
            if (r4 == 0) goto L_0x013a
            int r6 = r6 + 1
            r4 = 0
            r19 = r6
            r6 = r5
            r5 = r19
            goto L_0x000e
        L_0x013a:
            int r6 = r6 + -1
            r2 = r6
            r4 = 0
            goto L_0x000e
        L_0x0140:
            int[] r0 = r1.f305814f
            r0 = r0[r6]
            return r0
        L_0x0145:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "No available text sizes to choose from."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103550m.mo144407c(android.graphics.RectF):int");
    }

    /* renamed from: d */
    public final Method mo144408d(String str) {
        try {
            Method method = f305808l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f305808l.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public void mo144409e(int i, float f) {
        Context context = this.f305818j;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f305817i.getPaint().getTextSize()) {
            this.f305817i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f305817i.isInLayout();
            if (this.f305817i.getLayout() != null) {
                this.f305810b = false;
                try {
                    Method d = mo144408d("nullLayouts");
                    if (d != null) {
                        d.invoke(this.f305817i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f305817i.requestLayout();
                } else {
                    this.f305817i.forceLayout();
                }
                this.f305817i.invalidate();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo144410f() {
        if (!mo144412h() || this.f305809a != 1) {
            this.f305810b = false;
        } else {
            if (!this.f305815g || this.f305814f.length == 0) {
                float round = (float) Math.round(this.f305812d);
                int i = 1;
                while (Math.round(this.f305811c + round) <= Math.round(this.f305813e)) {
                    i++;
                    round += this.f305811c;
                }
                int[] iArr = new int[i];
                float f = this.f305812d;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f305811c;
                }
                this.f305814f = mo144406b(iArr);
            }
            this.f305810b = true;
        }
        return this.f305810b;
    }

    /* renamed from: g */
    public final boolean mo144411g() {
        int[] iArr = this.f305814f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f305815g = z;
        if (z) {
            this.f305809a = 1;
            this.f305812d = (float) iArr[0];
            this.f305813e = (float) iArr[length - 1];
            this.f305811c = -1.0f;
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo144412h() {
        return !(this.f305817i instanceof AppCompatEditText);
    }

    /* renamed from: i */
    public final void mo144413i(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size " + "text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f305809a = 1;
            this.f305812d = f;
            this.f305813e = f2;
            this.f305811c = f3;
            this.f305815g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }
}
