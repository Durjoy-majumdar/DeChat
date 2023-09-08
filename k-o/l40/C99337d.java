package l40;

import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import m40.C99786a;

/* renamed from: l40.d */
public class C99337d {

    /* renamed from: s */
    public static C99338e f291268s = new C99338e(3);

    /* renamed from: t */
    public static final SpannableString f291269t = new SpannableString("");

    /* renamed from: a */
    public CharSequence f291270a = null;

    /* renamed from: b */
    public CharSequence f291271b = null;

    /* renamed from: c */
    public int f291272c = 0;

    /* renamed from: d */
    public int f291273d = 0;

    /* renamed from: e */
    public TextPaint f291274e = null;

    /* renamed from: f */
    public int f291275f = 0;

    /* renamed from: g */
    public Layout.Alignment f291276g = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: h */
    public int f291277h = 51;

    /* renamed from: i */
    public TextUtils.TruncateAt f291278i = null;

    /* renamed from: j */
    public int f291279j = -1;

    /* renamed from: k */
    public int f291280k = Integer.MAX_VALUE;

    /* renamed from: l */
    public TextDirectionHeuristic f291281l = null;

    /* renamed from: m */
    public float f291282m = 0.0f;

    /* renamed from: n */
    public float f291283n = 1.1f;

    /* renamed from: o */
    public boolean f291284o = false;

    /* renamed from: p */
    public int f291285p = -1;

    /* renamed from: q */
    public int f291286q = -1;

    /* renamed from: r */
    public InputFilter.LengthFilter f291287r = null;

    /* renamed from: c */
    public static C99337d m129494c() {
        C99337d dVar;
        C99338e eVar = f291268s;
        synchronized (eVar.f291290c) {
            int i = eVar.f291289b;
            dVar = null;
            if (i > 0) {
                int i2 = i - 1;
                C99337d[] dVarArr = eVar.f291288a;
                C99337d dVar2 = dVarArr[i2];
                dVarArr[i2] = null;
                eVar.f291289b = i2;
                dVar = dVar2;
            }
        }
        return dVar == null ? new C99337d() : dVar;
    }

    /* renamed from: d */
    public static C99337d m129495d(CharSequence charSequence, int i, C99786a aVar) {
        if (charSequence == null) {
            charSequence = "";
        }
        int length = charSequence.length();
        C99337d c = m129494c();
        c.f291270a = charSequence.toString();
        c.f291271b = charSequence;
        c.f291272c = 0;
        c.f291273d = length;
        c.f291275f = i;
        c.f291274e = new TextPaint();
        int i2 = aVar.f292453a;
        if (i2 != -1 && i2 >= 0) {
            c.f291280k = i2;
        }
        int i3 = aVar.f292455c;
        if (i3 != -1 && i3 >= 0) {
            c.f291285p = i3;
            c.f291287r = new InputFilter.LengthFilter(c.f291285p);
        }
        Layout.Alignment alignment = aVar.f292457e;
        if (alignment != null) {
            c.f291276g = alignment;
        }
        TextUtils.TruncateAt truncateAt = aVar.f292458f;
        if (truncateAt != null) {
            c.f291278i = truncateAt;
        }
        c.f291277h = aVar.f292459g;
        int i4 = aVar.f292460h;
        if (i4 != -1 && i4 >= 0) {
            c.f291279j = i4;
        }
        float f = aVar.f292461i;
        float f2 = aVar.f292462j;
        c.f291282m = f;
        c.f291283n = f2;
        c.f291284o = false;
        float f3 = aVar.f292464l;
        if (f3 != -1.0f) {
            c.f291274e.setTextSize(f3);
        }
        int i5 = aVar.f292465m;
        if (i5 != -1) {
            c.f291274e.setColor(i5);
        }
        int i6 = aVar.f292466n;
        if (i6 != -1) {
            c.f291274e.linkColor = i6;
        }
        TextPaint textPaint = aVar.f292456d;
        if (textPaint != null) {
            c.f291274e = textPaint;
        }
        int i7 = aVar.f292467o;
        if (i7 >= 0 && i7 >= 0) {
            c.f291286q = i7;
        }
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
        r3 = r11.f291280k;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l40.C99339f mo138734a() {
        /*
            r11 = this;
            android.text.TextUtils$TruncateAt r0 = r11.f291278i
            if (r0 == 0) goto L_0x0008
            int r1 = r11.f291279j
            if (r1 > 0) goto L_0x000a
        L_0x0008:
            int r1 = r11.f291275f
        L_0x000a:
            r2 = 1
            if (r0 != 0) goto L_0x0015
            int r0 = r11.f291280k
            if (r0 != r2) goto L_0x0015
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r11.f291278i = r0
        L_0x0015:
            int r0 = r11.f291285p
            if (r0 <= 0) goto L_0x0040
            android.text.InputFilter$LengthFilter r3 = r11.f291287r
            if (r3 == 0) goto L_0x0040
            java.lang.CharSequence r4 = r11.f291271b
            r5 = 0
            int r6 = r4.length()
            android.text.SpannableString r7 = f291269t
            r8 = 0
            r9 = 0
            java.lang.CharSequence r0 = r3.filter(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0040
            r11.f291271b = r0
            int r3 = r11.f291273d
            int r0 = r0.length()
            if (r3 <= r0) goto L_0x0040
            java.lang.CharSequence r0 = r11.f291271b
            int r0 = r0.length()
            r11.f291273d = r0
        L_0x0040:
            android.text.Layout$Alignment r0 = r11.f291276g
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            r4 = 3
            if (r0 != r3) goto L_0x006d
            int r0 = r11.f291277h
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r5
            if (r0 == r2) goto L_0x0069
            if (r0 == r4) goto L_0x0066
            r5 = 5
            if (r0 == r5) goto L_0x0061
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 == r5) goto L_0x0066
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 == r5) goto L_0x0061
            r11.f291276g = r3
            goto L_0x006d
        L_0x0061:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r11.f291276g = r0
            goto L_0x006d
        L_0x0066:
            r11.f291276g = r3
            goto L_0x006d
        L_0x0069:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            r11.f291276g = r0
        L_0x006d:
            android.text.TextPaint r0 = r11.f291274e
            r0.setAntiAlias(r2)
            r0 = 0
            android.text.TextDirectionHeuristic r3 = r11.f291281l
            r5 = 0
            if (r3 == 0) goto L_0x0086
            r3 = 18
            boolean r3 = p206nj.C11171e.m11046c(r3)
            if (r3 == 0) goto L_0x0091
            android.text.TextDirectionHeuristic r3 = r11.f291281l
            android.text.TextDirectionHeuristic r6 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r3 != r6) goto L_0x0091
        L_0x0086:
            int r3 = r11.f291280k
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r6) goto L_0x0093
            r6 = -1
            if (r3 != r6) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r3 = 0
            goto L_0x0094
        L_0x0093:
            r3 = 1
        L_0x0094:
            java.lang.CharSequence r6 = r11.f291271b     // Catch:{ Exception -> 0x009d }
            int r7 = r11.f291286q     // Catch:{ Exception -> 0x009d }
            android.text.StaticLayout r0 = r11.mo138735b(r6, r3, r1, r7)     // Catch:{ Exception -> 0x009d }
            goto L_0x0109
        L_0x009d:
            r6 = move-exception
            java.lang.String r7 = "StaticTextView.StaticLayoutBuilder"
            java.lang.String r8 = "build static layout error: %s"
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.String r6 = r6.getMessage()
            r9[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)
            r6 = 0
        L_0x00ae:
            if (r6 >= r4) goto L_0x0109
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x00f1 }
            java.lang.CharSequence r8 = r11.f291271b     // Catch:{ Exception -> 0x00f1 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00f1 }
            int r8 = r7.length()     // Catch:{ Exception -> 0x00f1 }
            java.lang.Class<android.text.style.MetricAffectingSpan> r9 = android.text.style.MetricAffectingSpan.class
            java.lang.Object[] r8 = r7.getSpans(r5, r8, r9)     // Catch:{ Exception -> 0x00f1 }
            android.text.style.MetricAffectingSpan[] r8 = (android.text.style.MetricAffectingSpan[]) r8     // Catch:{ Exception -> 0x00f1 }
            if (r8 == 0) goto L_0x00d7
            int r9 = r8.length     // Catch:{ Exception -> 0x00f1 }
            if (r9 <= 0) goto L_0x00d7
            r8 = r8[r5]     // Catch:{ Exception -> 0x00f1 }
            int r8 = r7.getSpanStart(r8)     // Catch:{ Exception -> 0x00f1 }
            int r8 = r8 - r2
            java.lang.String r9 = " "
            r7.insert(r8, r9)     // Catch:{ Exception -> 0x00f1 }
            int r6 = r6 + 1
            goto L_0x00d9
        L_0x00d7:
            r6 = 100
        L_0x00d9:
            r11.f291271b = r7     // Catch:{ Exception -> 0x00f1 }
            int r8 = r11.f291286q     // Catch:{ Exception -> 0x00f1 }
            android.text.StaticLayout r0 = r11.mo138735b(r7, r3, r1, r8)     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r7 = "StaticTextView.StaticLayoutBuilder"
            java.lang.String r8 = "fix from build static layout, fixCount: %s"
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00f1 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00f1 }
            r9[r5] = r10     // Catch:{ Exception -> 0x00f1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ Exception -> 0x00f1 }
            goto L_0x0109
        L_0x00f1:
            r7 = move-exception
            java.lang.String r8 = "StaticTextView.StaticLayoutBuilder"
            java.lang.String r9 = "fix, build static layout error: %s, fixCount: %s"
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r7 = r7.getMessage()
            r10[r5] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r10[r2] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r10)
            goto L_0x00ae
        L_0x0109:
            if (r0 != 0) goto L_0x0119
            java.lang.CharSequence r0 = r11.f291271b
            java.lang.String r0 = r0.toString()
            r11.f291271b = r0
            int r4 = r11.f291286q
            android.text.StaticLayout r0 = r11.mo138735b(r0, r3, r1, r4)
        L_0x0119:
            l40.f r1 = new l40.f
            r1.<init>(r0)
            java.lang.CharSequence r0 = r11.f291270a
            r1.f291294d = r0
            java.lang.CharSequence r0 = r11.f291271b
            r1.f291295e = r0
            int r0 = r11.f291285p
            r1.f291293c = r0
            int r0 = r11.f291280k
            r1.f291292b = r0
            android.text.Layout$Alignment r0 = r11.f291276g
            r1.f291297g = r0
            android.text.TextUtils$TruncateAt r0 = r11.f291278i
            r1.f291298h = r0
            android.text.TextPaint r0 = r11.f291274e
            r1.f291296f = r0
            int r0 = r11.f291277h
            r1.f291299i = r0
            int r0 = r11.f291286q
            r1.f291300j = r0
            l40.e r0 = f291268s
            java.lang.Object r3 = r0.f291290c
            monitor-enter(r3)
            r4 = 0
        L_0x0148:
            int r6 = r0.f291289b     // Catch:{ all -> 0x0174 }
            if (r4 >= r6) goto L_0x0157
            l40.d[] r6 = r0.f291288a     // Catch:{ all -> 0x0174 }
            r6 = r6[r4]     // Catch:{ all -> 0x0174 }
            if (r6 != r11) goto L_0x0154
            r5 = 1
            goto L_0x0157
        L_0x0154:
            int r4 = r4 + 1
            goto L_0x0148
        L_0x0157:
            if (r5 != 0) goto L_0x016c
            r11.mo138736e()     // Catch:{ all -> 0x0174 }
            int r4 = r0.f291289b     // Catch:{ all -> 0x0174 }
            l40.d[] r5 = r0.f291288a     // Catch:{ all -> 0x0174 }
            int r6 = r5.length     // Catch:{ all -> 0x0174 }
            if (r4 >= r6) goto L_0x016a
            r5[r4] = r11     // Catch:{ all -> 0x0174 }
            int r4 = r4 + r2
            r0.f291289b = r4     // Catch:{ all -> 0x0174 }
            monitor-exit(r3)     // Catch:{ all -> 0x0174 }
            goto L_0x016b
        L_0x016a:
            monitor-exit(r3)     // Catch:{ all -> 0x0174 }
        L_0x016b:
            return r1
        L_0x016c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0174 }
            java.lang.String r1 = "Already in the pool!"
            r0.<init>(r1)     // Catch:{ all -> 0x0174 }
            throw r0     // Catch:{ all -> 0x0174 }
        L_0x0174:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0174 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.C99337d.mo138734a():l40.f");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final android.text.StaticLayout mo138735b(java.lang.CharSequence r33, boolean r34, int r35, int r36) {
        /*
            r32 = this;
            r1 = r32
            r3 = r33
            r13 = r35
            r0 = r36
            java.lang.Class<n40.a> r2 = n40.C100068a.class
            if (r0 < 0) goto L_0x004d
            int r2 = r1.f291272c
            int r4 = r1.f291273d
            android.text.TextPaint r5 = r1.f291274e
            int r6 = r1.f291275f
            android.text.StaticLayout$Builder r2 = android.text.StaticLayout.Builder.obtain(r3, r2, r4, r5, r6)
            android.text.Layout$Alignment r3 = r1.f291276g
            android.text.StaticLayout$Builder r2 = r2.setAlignment(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            android.text.StaticLayout$Builder r2 = r2.setTextDirection(r3)
            float r3 = r1.f291282m
            float r4 = r1.f291283n
            android.text.StaticLayout$Builder r2 = r2.setLineSpacing(r3, r4)
            boolean r3 = r1.f291284o
            android.text.StaticLayout$Builder r2 = r2.setIncludePad(r3)
            android.text.TextUtils$TruncateAt r3 = r1.f291278i
            android.text.StaticLayout$Builder r2 = r2.setEllipsize(r3)
            android.text.StaticLayout$Builder r2 = r2.setEllipsizedWidth(r13)
            android.text.StaticLayout$Builder r0 = r2.setBreakStrategy(r0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            android.text.StaticLayout$Builder r0 = r0.setMaxLines(r2)
            android.text.StaticLayout r0 = r0.build()
            goto L_0x0200
        L_0x004d:
            if (r34 == 0) goto L_0x006d
            android.text.StaticLayout r0 = new android.text.StaticLayout
            int r4 = r1.f291272c
            int r5 = r1.f291273d
            android.text.TextPaint r6 = r1.f291274e
            int r7 = r1.f291275f
            android.text.Layout$Alignment r8 = r1.f291276g
            float r9 = r1.f291283n
            float r10 = r1.f291282m
            boolean r11 = r1.f291284o
            android.text.TextUtils$TruncateAt r12 = r1.f291278i
            r2 = r0
            r3 = r33
            r13 = r35
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0200
        L_0x006d:
            android.text.TextDirectionHeuristic r0 = r1.f291281l
            if (r0 != 0) goto L_0x0075
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            r1.f291281l = r0
        L_0x0075:
            int r4 = r1.f291272c
            int r5 = r1.f291273d
            android.text.TextPaint r6 = r1.f291274e
            int r7 = r1.f291275f
            android.text.Layout$Alignment r8 = r1.f291276g
            android.text.TextDirectionHeuristic r9 = r1.f291281l
            float r10 = r1.f291283n
            float r11 = r1.f291282m
            boolean r12 = r1.f291284o
            android.text.TextUtils$TruncateAt r14 = r1.f291278i
            int r15 = r1.f291280k
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ Exception -> 0x017f }
            java.lang.Object r0 = n40.C100068a.f293129b     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x0095
            monitor-exit(r2)     // Catch:{ Exception -> 0x017f }
        L_0x0092:
            r16 = r0
            goto L_0x009b
        L_0x0095:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR     // Catch:{ ClassNotFoundException -> 0x0228, NoSuchFieldException -> 0x021c, IllegalAccessException -> 0x0210, all -> 0x0204 }
            n40.C100068a.f293129b = r0     // Catch:{ ClassNotFoundException -> 0x0228, NoSuchFieldException -> 0x021c, IllegalAccessException -> 0x0210, all -> 0x0204 }
            monitor-exit(r2)     // Catch:{ Exception -> 0x017f }
            goto L_0x0092
        L_0x009b:
            monitor-enter(r2)     // Catch:{ Exception -> 0x017f }
            java.lang.reflect.Constructor<android.text.StaticLayout> r0 = n40.C100068a.f293128a     // Catch:{ all -> 0x0201 }
            r17 = 12
            r18 = 11
            r19 = 10
            r20 = 9
            r21 = 8
            r22 = 7
            r23 = 6
            r24 = 5
            r25 = 4
            r26 = 3
            r27 = 2
            if (r0 == 0) goto L_0x00bf
            monitor-exit(r2)     // Catch:{ Exception -> 0x017f }
            r29 = r9
            r31 = r14
            r30 = r15
            goto L_0x0185
        L_0x00bf:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0201 }
            r1 = 29
            if (r0 < r1) goto L_0x00c7
            r0 = 1
            goto L_0x00c8
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            if (r0 == 0) goto L_0x00d4
            monitor-exit(r2)     // Catch:{ Exception -> 0x017f }
            r29 = r9
            r31 = r14
            r30 = r15
        L_0x00d1:
            r0 = 0
            goto L_0x0185
        L_0x00d4:
            java.lang.Class<android.text.TextDirectionHeuristic> r0 = android.text.TextDirectionHeuristic.class
            r29 = r9
            r1 = 13
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            java.lang.Class<java.lang.CharSequence> r1 = java.lang.CharSequence.class
            r30 = 0
            r9[r30] = r1     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            r28 = 1
            r9[r28] = r1     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            r9[r27] = r1     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            java.lang.Class<android.text.TextPaint> r30 = android.text.TextPaint.class
            r9[r26] = r30     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            r9[r25] = r1     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            java.lang.Class<android.text.Layout$Alignment> r30 = android.text.Layout.Alignment.class
            r9[r24] = r30     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            r9[r23] = r0     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            r9[r22] = r0     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            r9[r21] = r0     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            r9[r20] = r0     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            java.lang.Class<android.text.TextUtils$TruncateAt> r0 = android.text.TextUtils.TruncateAt.class
            r9[r19] = r0     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            r9[r18] = r1     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            r9[r17] = r1     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            java.lang.Class<android.text.StaticLayout> r0 = android.text.StaticLayout.class
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r9)     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            n40.C100068a.f293128a = r0     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x011e, ClassNotFoundException -> 0x011c, all -> 0x011a }
            r31 = r14
            r30 = r15
            r0 = 0
            goto L_0x0155
        L_0x011a:
            r0 = move-exception
            goto L_0x0123
        L_0x011c:
            r0 = move-exception
            goto L_0x0135
        L_0x011e:
            r0 = move-exception
            goto L_0x0147
        L_0x0120:
            r0 = move-exception
            r29 = r9
        L_0x0123:
            java.lang.String r1 = "StaticTextView.StaticLayoutWithMaxLines"
            java.lang.String r9 = "Other error."
            r31 = r14
            r30 = r15
            r15 = 0
            java.lang.Object[] r14 = new java.lang.Object[r15]     // Catch:{ all -> 0x0201 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r9, r14)     // Catch:{ all -> 0x0201 }
            goto L_0x0155
        L_0x0132:
            r0 = move-exception
            r29 = r9
        L_0x0135:
            r31 = r14
            r30 = r15
            java.lang.String r1 = "StaticTextView.StaticLayoutWithMaxLines"
            java.lang.String r9 = "TextDirectionHeuristic class not found."
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x0201 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r9, r15)     // Catch:{ all -> 0x0201 }
            goto L_0x0155
        L_0x0144:
            r0 = move-exception
            r29 = r9
        L_0x0147:
            r31 = r14
            r30 = r15
            java.lang.String r1 = "StaticTextView.StaticLayoutWithMaxLines"
            java.lang.String r9 = "StaticLayout constructor with max lines not found."
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x0201 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r9, r15)     // Catch:{ all -> 0x0201 }
        L_0x0155:
            if (r0 == 0) goto L_0x0182
            java.lang.String r1 = "StaticTextView.StaticLayoutWithMaxLines"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0201 }
            r9.<init>()     // Catch:{ all -> 0x0201 }
            java.lang.String r14 = "create StaticLayout constructor fail: "
            r9.append(r14)     // Catch:{ all -> 0x0201 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0201 }
            r9.append(r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0201 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r0 = "StaticTextView.StaticLayoutWithMaxLines"
            java.lang.String r1 = "use builtin StaticLayout.Builder as fallback!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)     // Catch:{ all -> 0x0201 }
            monitor-exit(r2)     // Catch:{ Exception -> 0x017f }
            goto L_0x00d1
        L_0x017c:
            r0 = move-exception
            goto L_0x0271
        L_0x017f:
            r0 = move-exception
            goto L_0x0256
        L_0x0182:
            java.lang.reflect.Constructor<android.text.StaticLayout> r0 = n40.C100068a.f293128a     // Catch:{ all -> 0x0201 }
            monitor-exit(r2)     // Catch:{ Exception -> 0x017f }
        L_0x0185:
            if (r0 != 0) goto L_0x01b5
            r0 = r16
            android.text.TextDirectionHeuristic r0 = (android.text.TextDirectionHeuristic) r0     // Catch:{ Exception -> 0x017f }
            android.text.StaticLayout$Builder r1 = android.text.StaticLayout.Builder.obtain(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x017f }
            android.text.StaticLayout$Builder r1 = r1.setAlignment(r8)     // Catch:{ Exception -> 0x017f }
            android.text.StaticLayout$Builder r0 = r1.setTextDirection(r0)     // Catch:{ Exception -> 0x017f }
            android.text.StaticLayout$Builder r0 = r0.setLineSpacing(r11, r10)     // Catch:{ Exception -> 0x017f }
            android.text.StaticLayout$Builder r0 = r0.setIncludePad(r12)     // Catch:{ Exception -> 0x017f }
            android.text.StaticLayout$Builder r0 = r0.setEllipsizedWidth(r13)     // Catch:{ Exception -> 0x017f }
            r1 = r31
            android.text.StaticLayout$Builder r0 = r0.setEllipsize(r1)     // Catch:{ Exception -> 0x017f }
            r9 = r30
            android.text.StaticLayout$Builder r0 = r0.setMaxLines(r9)     // Catch:{ Exception -> 0x017f }
            android.text.StaticLayout r0 = r0.build()     // Catch:{ Exception -> 0x017f }
            monitor-exit(r2)
            goto L_0x0200
        L_0x01b5:
            r9 = r30
            r1 = r31
            r14 = 13
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x017f }
            r15 = 0
            r14[r15] = r3     // Catch:{ Exception -> 0x017f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x017f }
            r4 = 1
            r14[r4] = r3     // Catch:{ Exception -> 0x017f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x017f }
            r14[r27] = r3     // Catch:{ Exception -> 0x017f }
            r14[r26] = r6     // Catch:{ Exception -> 0x017f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x017f }
            r14[r25] = r3     // Catch:{ Exception -> 0x017f }
            r14[r24] = r8     // Catch:{ Exception -> 0x017f }
            r14[r23] = r29     // Catch:{ Exception -> 0x017f }
            java.lang.Float r3 = java.lang.Float.valueOf(r10)     // Catch:{ Exception -> 0x017f }
            r14[r22] = r3     // Catch:{ Exception -> 0x017f }
            java.lang.Float r3 = java.lang.Float.valueOf(r11)     // Catch:{ Exception -> 0x017f }
            r14[r21] = r3     // Catch:{ Exception -> 0x017f }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x017f }
            r14[r20] = r3     // Catch:{ Exception -> 0x017f }
            r14[r19] = r1     // Catch:{ Exception -> 0x017f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r35)     // Catch:{ Exception -> 0x017f }
            r14[r18] = r1     // Catch:{ Exception -> 0x017f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x017f }
            r14[r17] = r1     // Catch:{ Exception -> 0x017f }
            java.lang.Object r0 = r0.newInstance(r14)     // Catch:{ Exception -> 0x017f }
            android.text.StaticLayout r0 = (android.text.StaticLayout) r0     // Catch:{ Exception -> 0x017f }
            monitor-exit(r2)
        L_0x0200:
            return r0
        L_0x0201:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x017f }
            throw r0     // Catch:{ Exception -> 0x017f }
        L_0x0204:
            r0 = move-exception
            java.lang.String r1 = "StaticTextView.StaticLayoutWithMaxLines"
            java.lang.String r3 = "Other error."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0253 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r4)     // Catch:{ all -> 0x0253 }
            goto L_0x0233
        L_0x0210:
            r0 = move-exception
            java.lang.String r1 = "StaticTextView.StaticLayoutWithMaxLines"
            java.lang.String r3 = "TextDirectionHeuristics.FIRSTSTRONG_LTR not accessible."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0253 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r4)     // Catch:{ all -> 0x0253 }
            goto L_0x0233
        L_0x021c:
            r0 = move-exception
            java.lang.String r1 = "StaticTextView.StaticLayoutWithMaxLines"
            java.lang.String r3 = "TextDirectionHeuristics.FIRSTSTRONG_LTR not found."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0253 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r4)     // Catch:{ all -> 0x0253 }
            goto L_0x0233
        L_0x0228:
            r0 = move-exception
            java.lang.String r1 = "StaticTextView.StaticLayoutWithMaxLines"
            java.lang.String r3 = "TextDirectionHeuristic class not found."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0253 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r4)     // Catch:{ all -> 0x0253 }
        L_0x0233:
            java.lang.String r1 = "StaticTextView.StaticLayoutWithMaxLines"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0253 }
            r3.<init>()     // Catch:{ all -> 0x0253 }
            java.lang.String r4 = "#tryGetTextDirection fail, error: "
            r3.append(r4)     // Catch:{ all -> 0x0253 }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x0253 }
            r3.append(r4)     // Catch:{ all -> 0x0253 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0253 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)     // Catch:{ all -> 0x0253 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0253 }
            r1.<init>(r0)     // Catch:{ all -> 0x0253 }
            throw r1     // Catch:{ all -> 0x0253 }
        L_0x0253:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x017f }
            throw r0     // Catch:{ Exception -> 0x017f }
        L_0x0256:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r3.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r4 = "Error creating StaticLayout with max lines: "
            r3.append(r4)     // Catch:{ all -> 0x017c }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x017c }
            r3.append(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x017c }
            r1.<init>(r0)     // Catch:{ all -> 0x017c }
            throw r1     // Catch:{ all -> 0x017c }
        L_0x0271:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.C99337d.mo138735b(java.lang.CharSequence, boolean, int, int):android.text.StaticLayout");
    }

    /* renamed from: e */
    public void mo138736e() {
        this.f291270a = null;
        this.f291271b = null;
        this.f291272c = 0;
        this.f291273d = 0;
        this.f291274e = new TextPaint();
        this.f291275f = 0;
        this.f291276g = Layout.Alignment.ALIGN_NORMAL;
        this.f291277h = 51;
        this.f291278i = null;
        this.f291279j = 0;
        this.f291280k = Integer.MAX_VALUE;
        this.f291281l = null;
        this.f291282m = 0.0f;
        this.f291283n = 1.0f;
        this.f291284o = false;
        this.f291285p = 0;
        this.f291287r = null;
        this.f291286q = -1;
    }
}
