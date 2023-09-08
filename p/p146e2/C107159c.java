package p146e2;

import android.graphics.Canvas;
import android.graphics.Path;
import android.text.TextUtils;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p1163y1.C112355a;
import p1163y1.C112356b;
import p1166z0.C112539e;
import p1166z0.C112541g;
import p1166z0.C112546l;
import p268x1.C111994b;
import p268x1.C111995c;
import p268x1.C112010q;
import p436a1.C103223b;
import p436a1.C103226c;
import p436a1.C103240i;
import p436a1.C103257q;
import p436a1.C103262s;
import p436a1.C103264s0;
import p436a1.C27726j0;
import p544h2.C108014f;
import p544h2.C32658d;
import p560i2.C108319b;
import p735w1.C111692g;
import p735w1.C38007y;
import rx3.C13601g;

/* renamed from: e2.c */
public final class C107159c implements C111692g {

    /* renamed from: a */
    public final C107160d f320730a;

    /* renamed from: b */
    public final int f320731b;

    /* renamed from: c */
    public final long f320732c;

    /* renamed from: d */
    public final C112010q f320733d;

    /* renamed from: e */
    public final List<C112541g> f320734e;

    /* renamed from: f */
    public final C13601g f320735f;

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ff, code lost:
        r14 = r14 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0229, code lost:
        r14 = r14 - ((float) r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x022b, code lost:
        r12 = new p1166z0.C112541g(r5, r14, r11, ((float) r9.mo109302b()) + r14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0101 A[LOOP:1: B:83:0x00ff->B:84:0x0101, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C107159c(p146e2.C107160d r17, int r18, boolean r19, long r20, gy3.C8480h r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r16.<init>()
            r0.f320730a = r1
            r0.f320731b = r2
            r3 = r20
            r0.f320732c = r3
            r5 = 0
            r6 = 1
            if (r2 < r6) goto L_0x0017
            r7 = 1
            goto L_0x0018
        L_0x0017:
            r7 = 0
        L_0x0018:
            if (r7 == 0) goto L_0x0251
            w1.z r1 = r1.f320737b
            w1.k r1 = r1.f334380b
            h2.e r1 = r1.f100437a
            if (r1 != 0) goto L_0x0023
            goto L_0x0029
        L_0x0023:
            int r7 = r1.f86670a
            if (r7 != r6) goto L_0x0029
            r7 = 1
            goto L_0x002a
        L_0x0029:
            r7 = 0
        L_0x002a:
            r8 = 3
            r9 = 4
            r10 = 2
            if (r7 == 0) goto L_0x0030
            goto L_0x006a
        L_0x0030:
            if (r1 != 0) goto L_0x0033
            goto L_0x0039
        L_0x0033:
            int r7 = r1.f86670a
            if (r7 != r10) goto L_0x0039
            r7 = 1
            goto L_0x003a
        L_0x0039:
            r7 = 0
        L_0x003a:
            if (r7 == 0) goto L_0x003e
            r8 = 4
            goto L_0x006a
        L_0x003e:
            if (r1 != 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            int r7 = r1.f86670a
            if (r7 != r8) goto L_0x0047
            r7 = 1
            goto L_0x0048
        L_0x0047:
            r7 = 0
        L_0x0048:
            if (r7 == 0) goto L_0x004c
            r8 = 2
            goto L_0x006a
        L_0x004c:
            r7 = 5
            if (r1 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            int r8 = r1.f86670a
            if (r8 != r7) goto L_0x0056
            r7 = 1
            goto L_0x0057
        L_0x0056:
            r7 = 0
        L_0x0057:
            if (r7 == 0) goto L_0x005a
            goto L_0x0069
        L_0x005a:
            r7 = 6
            if (r1 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            int r8 = r1.f86670a
            if (r8 != r7) goto L_0x0064
            r7 = 1
            goto L_0x0065
        L_0x0064:
            r7 = 0
        L_0x0065:
            if (r7 == 0) goto L_0x0069
            r8 = 1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r1 != 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            int r1 = r1.f86670a
            if (r1 != r9) goto L_0x0073
            r1 = 1
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            r7 = 0
            if (r19 == 0) goto L_0x007a
            android.text.TextUtils$TruncateAt r9 = android.text.TextUtils.TruncateAt.END
            goto L_0x007b
        L_0x007a:
            r9 = r7
        L_0x007b:
            x1.q r11 = r0.mo157584w(r8, r1, r9, r2)
            if (r19 == 0) goto L_0x00c9
            boolean r12 = r11.f335296a
            if (r12 == 0) goto L_0x0090
            android.text.Layout r12 = r11.f335297b
            int r13 = r11.f335298c
            int r13 = r13 + -1
            int r12 = r12.getLineBottom(r13)
            goto L_0x0096
        L_0x0090:
            android.text.Layout r12 = r11.f335297b
            int r12 = r12.getHeight()
        L_0x0096:
            int r13 = r11.f335299d
            int r12 = r12 + r13
            int r13 = r11.f335300e
            int r12 = r12 + r13
            int r13 = p560i2.C108319b.m146696g(r20)
            if (r12 <= r13) goto L_0x00c9
            if (r2 <= r6) goto L_0x00c9
            int r2 = p560i2.C108319b.m146696g(r20)
            int r3 = r11.f335298c
            r4 = 0
        L_0x00ab:
            if (r4 >= r3) goto L_0x00ba
            float r12 = r11.mo163668b(r4)
            float r13 = (float) r2
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x00b7
            goto L_0x00bc
        L_0x00b7:
            int r4 = r4 + 1
            goto L_0x00ab
        L_0x00ba:
            int r4 = r11.f335298c
        L_0x00bc:
            if (r4 <= 0) goto L_0x00c6
            int r2 = r0.f320731b
            if (r4 == r2) goto L_0x00c6
            x1.q r11 = r0.mo157584w(r8, r1, r9, r4)
        L_0x00c6:
            r0.f320733d = r11
            goto L_0x00cb
        L_0x00c9:
            r0.f320733d = r11
        L_0x00cb:
            x1.q r1 = r0.f320733d
            java.lang.CharSequence r2 = r1.mo163670e()
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 != 0) goto L_0x00d8
            g2.a[] r1 = new p1112g2.C107695a[r5]
            goto L_0x00fd
        L_0x00d8:
            java.lang.CharSequence r2 = r1.mo163670e()
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r1 = r1.mo163670e()
            int r1 = r1.length()
            java.lang.Class<g2.a> r3 = p1112g2.C107695a.class
            java.lang.Object[] r1 = r2.getSpans(r5, r1, r3)
            g2.a[] r1 = (p1112g2.C107695a[]) r1
            java.lang.String r2 = "brushSpans"
            gy3.C87412m.m108593f(r1, r2)
            int r2 = r1.length
            if (r2 != 0) goto L_0x00f8
            r2 = 1
            goto L_0x00f9
        L_0x00f8:
            r2 = 0
        L_0x00f9:
            if (r2 == 0) goto L_0x00fd
            g2.a[] r1 = new p1112g2.C107695a[r5]
        L_0x00fd:
            int r2 = r1.length
            r3 = 0
        L_0x00ff:
            if (r3 >= r2) goto L_0x011c
            r4 = r1[r3]
            long r8 = r0.f320732c
            int r8 = p560i2.C108319b.m146697h(r8)
            float r8 = (float) r8
            float r9 = r16.getHeight()
            long r8 = p1166z0.C112546l.m153761a(r8, r9)
            z0.k r11 = new z0.k
            r11.<init>(r8)
            r4.f322203e = r11
            int r3 = r3 + 1
            goto L_0x00ff
        L_0x011c:
            e2.d r1 = r0.f320730a
            java.lang.CharSequence r1 = r1.f320743h
            boolean r2 = r1 instanceof android.text.Spanned
            if (r2 != 0) goto L_0x0128
            sx3.f0 r1 = sx3.C64186f0.f181907d
            goto L_0x0241
        L_0x0128:
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r3 = r1.length()
            java.lang.Class<z1.g> r4 = p925z1.C79301g.class
            java.lang.Object[] r2 = r2.getSpans(r5, r3, r4)
            java.lang.String r3 = "getSpans(0, length, PlaceholderSpan::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
            r8 = 0
        L_0x0142:
            if (r8 >= r4) goto L_0x0240
            r9 = r2[r8]
            z1.g r9 = (p925z1.C79301g) r9
            r11 = r1
            android.text.Spanned r11 = (android.text.Spanned) r11
            int r12 = r11.getSpanStart(r9)
            int r11 = r11.getSpanEnd(r9)
            x1.q r13 = r0.f320733d
            android.text.Layout r13 = r13.f335297b
            int r13 = r13.getLineForOffset(r12)
            x1.q r14 = r0.f320733d
            android.text.Layout r14 = r14.f335297b
            int r14 = r14.getEllipsisCount(r13)
            if (r14 <= 0) goto L_0x0171
            x1.q r14 = r0.f320733d
            android.text.Layout r14 = r14.f335297b
            int r14 = r14.getEllipsisStart(r13)
            if (r11 <= r14) goto L_0x0171
            r14 = 1
            goto L_0x0172
        L_0x0171:
            r14 = 0
        L_0x0172:
            x1.q r15 = r0.f320733d
            android.text.Layout r5 = r15.f335297b
            int r5 = r5.getEllipsisStart(r13)
            if (r5 != 0) goto L_0x0183
            android.text.Layout r5 = r15.f335297b
            int r5 = r5.getLineEnd(r13)
            goto L_0x018d
        L_0x0183:
            android.text.Layout r5 = r15.f335297b
            java.lang.CharSequence r5 = r5.getText()
            int r5 = r5.length()
        L_0x018d:
            if (r11 <= r5) goto L_0x0191
            r5 = 1
            goto L_0x0192
        L_0x0191:
            r5 = 0
        L_0x0192:
            if (r14 != 0) goto L_0x0237
            if (r5 == 0) goto L_0x0198
            goto L_0x0237
        L_0x0198:
            h2.d r5 = r0.mo157582u(r12)
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x01b5
            if (r5 != r6) goto L_0x01af
            float r5 = r0.mo157581t(r12, r6)
            int r11 = r9.mo109303c()
            float r11 = (float) r11
            float r5 = r5 - r11
            goto L_0x01b9
        L_0x01af:
            rx3.j r1 = new rx3.j
            r1.<init>()
            throw r1
        L_0x01b5:
            float r5 = r0.mo157581t(r12, r6)
        L_0x01b9:
            int r11 = r9.mo109303c()
            float r11 = (float) r11
            float r11 = r11 + r5
            x1.q r12 = r0.f320733d
            int r14 = r9.f232810i
            switch(r14) {
                case 0: goto L_0x0221;
                case 1: goto L_0x021c;
                case 2: goto L_0x0213;
                case 3: goto L_0x0201;
                case 4: goto L_0x01f4;
                case 5: goto L_0x01e3;
                case 6: goto L_0x01ce;
                default: goto L_0x01c6;
            }
        L_0x01c6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected verticalAlignment"
            r1.<init>(r2)
            throw r1
        L_0x01ce:
            android.graphics.Paint$FontMetricsInt r14 = r9.mo109301a()
            int r15 = r14.ascent
            int r14 = r14.descent
            int r15 = r15 + r14
            int r14 = r9.mo109302b()
            int r15 = r15 - r14
            int r15 = r15 / r10
            float r14 = (float) r15
            float r12 = r12.mo163667a(r13)
            goto L_0x01ff
        L_0x01e3:
            android.graphics.Paint$FontMetricsInt r14 = r9.mo109301a()
            int r14 = r14.descent
            float r14 = (float) r14
            float r12 = r12.mo163667a(r13)
            float r14 = r14 + r12
            int r12 = r9.mo109302b()
            goto L_0x0229
        L_0x01f4:
            android.graphics.Paint$FontMetricsInt r14 = r9.mo109301a()
            int r14 = r14.ascent
            float r14 = (float) r14
            float r12 = r12.mo163667a(r13)
        L_0x01ff:
            float r14 = r14 + r12
            goto L_0x022b
        L_0x0201:
            float r14 = r12.mo163669c(r13)
            float r12 = r12.mo163668b(r13)
            float r14 = r14 + r12
            int r12 = r9.mo109302b()
            float r12 = (float) r12
            float r14 = r14 - r12
            float r12 = (float) r10
            float r14 = r14 / r12
            goto L_0x022b
        L_0x0213:
            float r14 = r12.mo163668b(r13)
            int r12 = r9.mo109302b()
            goto L_0x0229
        L_0x021c:
            float r14 = r12.mo163669c(r13)
            goto L_0x022b
        L_0x0221:
            float r14 = r12.mo163667a(r13)
            int r12 = r9.mo109302b()
        L_0x0229:
            float r12 = (float) r12
            float r14 = r14 - r12
        L_0x022b:
            int r9 = r9.mo109302b()
            float r9 = (float) r9
            float r9 = r9 + r14
            z0.g r12 = new z0.g
            r12.<init>(r5, r14, r11, r9)
            goto L_0x0238
        L_0x0237:
            r12 = r7
        L_0x0238:
            r3.add(r12)
            int r8 = r8 + 1
            r5 = 0
            goto L_0x0142
        L_0x0240:
            r1 = r3
        L_0x0241:
            r0.f320734e = r1
            rx3.i r1 = rx3.C13602i.NONE
            e2.b r2 = new e2.b
            r2.<init>(r0)
            rx3.g r1 = rx3.C36568h.m40986b(r1, r2)
            r0.f320735f = r1
            return
        L_0x0251:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "maxLines should be greater than 0"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p146e2.C107159c.<init>(e2.d, int, boolean, long, gy3.h):void");
    }

    /* renamed from: a */
    public float mo157561a(int i) {
        return this.f320733d.mo163669c(i);
    }

    /* renamed from: b */
    public int mo157562b(int i) {
        return this.f320733d.f335297b.getLineStart(i);
    }

    /* renamed from: c */
    public int mo157563c(int i) {
        return this.f320733d.f335297b.getLineForOffset(i);
    }

    /* renamed from: d */
    public float mo157564d(int i) {
        return this.f320733d.mo163668b(i);
    }

    /* renamed from: e */
    public float mo157565e(int i) {
        return this.f320733d.f335297b.getLineRight(i);
    }

    /* renamed from: f */
    public C32658d mo157566f(int i) {
        return this.f320733d.f335297b.getParagraphDirection(this.f320733d.f335297b.getLineForOffset(i)) == 1 ? C32658d.Ltr : C32658d.Rtl;
    }

    /* renamed from: g */
    public float mo157567g() {
        return this.f320733d.mo163667a(0);
    }

    public float getHeight() {
        C112010q qVar = this.f320733d;
        return (float) ((qVar.f335296a ? qVar.f335297b.getLineBottom(qVar.f335298c - 1) : qVar.f335297b.getHeight()) + qVar.f335299d + qVar.f335300e);
    }

    /* renamed from: h */
    public C112541g mo157569h(int i) {
        if (i >= 0 && i <= this.f320730a.f320743h.length()) {
            float d = C112010q.m152727d(this.f320733d, i, false, 2, (Object) null);
            int lineForOffset = this.f320733d.f335297b.getLineForOffset(i);
            return new C112541g(d, this.f320733d.mo163669c(lineForOffset), d, this.f320733d.mo163668b(lineForOffset));
        }
        throw new AssertionError("offset(" + i + ") is out of bounds (0," + this.f320730a.f320743h.length());
    }

    /* renamed from: i */
    public float mo157570i() {
        int i = this.f320731b;
        C112010q qVar = this.f320733d;
        int i2 = qVar.f335298c;
        return i < i2 ? qVar.mo163667a(i - 1) : qVar.mo163667a(i2 - 1);
    }

    /* renamed from: j */
    public C112541g mo157571j(int i) {
        float d = C112010q.m152727d(this.f320733d, i, false, 2, (Object) null);
        float d2 = C112010q.m152727d(this.f320733d, i + 1, false, 2, (Object) null);
        int lineForOffset = this.f320733d.f335297b.getLineForOffset(i);
        return new C112541g(d, this.f320733d.mo163669c(lineForOffset), d2, this.f320733d.mo163668b(lineForOffset));
    }

    /* renamed from: k */
    public long mo157572k(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C112355a aVar = (C112355a) this.f320735f.getValue();
        C112356b bVar = aVar.f336379a;
        bVar.mo164072a(i);
        if (aVar.f336379a.mo164076e(bVar.f336384d.preceding(i))) {
            C112356b bVar2 = aVar.f336379a;
            bVar2.mo164072a(i);
            i2 = i;
            while (i2 != -1) {
                if (bVar2.mo164076e(i2) && !bVar2.mo164074c(i2)) {
                    break;
                }
                bVar2.mo164072a(i2);
                i2 = bVar2.f336384d.preceding(i2);
            }
        } else {
            C112356b bVar3 = aVar.f336379a;
            bVar3.mo164072a(i);
            if (bVar3.mo164075d(i)) {
                if (!bVar3.f336384d.isBoundary(i) || bVar3.mo164073b(i)) {
                    i5 = bVar3.f336384d.preceding(i);
                } else {
                    i2 = i;
                }
            } else if (bVar3.mo164073b(i)) {
                i5 = bVar3.f336384d.preceding(i);
            } else {
                i2 = -1;
            }
            i2 = i5;
        }
        if (i2 == -1) {
            i2 = i;
        }
        C112355a aVar2 = (C112355a) this.f320735f.getValue();
        C112356b bVar4 = aVar2.f336379a;
        bVar4.mo164072a(i);
        if (aVar2.f336379a.mo164074c(bVar4.f336384d.following(i))) {
            C112356b bVar5 = aVar2.f336379a;
            bVar5.mo164072a(i);
            i3 = i;
            while (i3 != -1) {
                if (!bVar5.mo164076e(i3) && bVar5.mo164074c(i3)) {
                    break;
                }
                bVar5.mo164072a(i3);
                i3 = bVar5.f336384d.following(i3);
            }
        } else {
            C112356b bVar6 = aVar2.f336379a;
            bVar6.mo164072a(i);
            if (bVar6.mo164073b(i)) {
                if (!bVar6.f336384d.isBoundary(i) || bVar6.mo164075d(i)) {
                    i4 = bVar6.f336384d.following(i);
                } else {
                    i3 = i;
                }
            } else if (bVar6.mo164075d(i)) {
                i4 = bVar6.f336384d.following(i);
            } else {
                i3 = -1;
            }
            i3 = i4;
        }
        if (i3 != -1) {
            i = i3;
        }
        return C38007y.m41701a(i2, i);
    }

    /* renamed from: l */
    public int mo157573l(long j) {
        C112010q qVar = this.f320733d;
        int lineForVertical = qVar.f335297b.getLineForVertical(qVar.f335299d + ((int) C112539e.m153739d(j)));
        C112010q qVar2 = this.f320733d;
        return qVar2.f335297b.getOffsetForHorizontal(lineForVertical, C112539e.m153738c(j));
    }

    /* renamed from: m */
    public int mo157574m(int i, boolean z) {
        if (z) {
            C112010q qVar = this.f320733d;
            if (qVar.f335297b.getEllipsisStart(i) == 0) {
                return qVar.f335297b.getLineVisibleEnd(i);
            }
            return qVar.f335297b.getEllipsisStart(i) + qVar.f335297b.getLineStart(i);
        }
        C112010q qVar2 = this.f320733d;
        return qVar2.f335297b.getEllipsisStart(i) == 0 ? qVar2.f335297b.getLineEnd(i) : qVar2.f335297b.getText().length();
    }

    /* renamed from: n */
    public int mo157575n(float f) {
        C112010q qVar = this.f320733d;
        return qVar.f335297b.getLineForVertical(qVar.f335299d + ((int) f));
    }

    /* renamed from: o */
    public float mo157576o(int i) {
        return this.f320733d.f335297b.getLineLeft(i);
    }

    /* renamed from: p */
    public void mo157577p(C103262s sVar, long j, C103264s0 s0Var, C108014f fVar) {
        C87412m.m108594g(sVar, "canvas");
        C107162e eVar = this.f320730a.f320742g;
        eVar.mo157589b(j);
        eVar.mo157590c(s0Var);
        eVar.mo157591d(fVar);
        Canvas canvas = C103226c.f304431a;
        Canvas canvas2 = ((C103223b) sVar).f304427a;
        if (this.f320733d.f335296a) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, (float) C108319b.m146697h(this.f320732c), getHeight());
        }
        this.f320733d.mo163671f(canvas2);
        if (this.f320733d.f335296a) {
            canvas2.restore();
        }
    }

    /* renamed from: q */
    public void mo157578q(C103262s sVar, C103257q qVar, C103264s0 s0Var, C108014f fVar) {
        C87412m.m108594g(sVar, "canvas");
        C87412m.m108594g(qVar, "brush");
        C107162e eVar = this.f320730a.f320742g;
        eVar.mo157588a(qVar, C112546l.m153761a((float) C108319b.m146697h(this.f320732c), getHeight()));
        eVar.mo157590c(s0Var);
        eVar.mo157591d(fVar);
        Canvas canvas = C103226c.f304431a;
        Canvas canvas2 = ((C103223b) sVar).f304427a;
        if (this.f320733d.f335296a) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, (float) C108319b.m146697h(this.f320732c), getHeight());
        }
        this.f320733d.mo163671f(canvas2);
        if (this.f320733d.f335296a) {
            canvas2.restore();
        }
    }

    /* renamed from: r */
    public boolean mo157579r(int i) {
        return this.f320733d.f335297b.getEllipsisStart(i) != 0;
    }

    /* renamed from: s */
    public C27726j0 mo157580s(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z || i2 > this.f320730a.f320743h.length()) {
            throw new AssertionError("Start(" + i + ") or End(" + i2 + ") is out of Range(0.." + this.f320730a.f320743h.length() + "), or start > end!");
        }
        Path path = new Path();
        C112010q qVar = this.f320733d;
        qVar.getClass();
        qVar.f335297b.getSelectionPath(i, i2, path);
        if (qVar.f335299d != 0 && !path.isEmpty()) {
            path.offset(0.0f, (float) qVar.f335299d);
        }
        return new C103240i(path);
    }

    /* renamed from: t */
    public float mo157581t(int i, boolean z) {
        return z ? C112010q.m152727d(this.f320733d, i, false, 2, (Object) null) : ((C111994b) this.f320733d.f335302g.getValue()).mo163664a(i, false, false);
    }

    /* renamed from: u */
    public C32658d mo157582u(int i) {
        return this.f320733d.f335297b.isRtlCharAt(i) ? C32658d.Rtl : C32658d.Ltr;
    }

    /* renamed from: v */
    public List<C112541g> mo157583v() {
        return this.f320734e;
    }

    /* renamed from: w */
    public final C112010q mo157584w(int i, int i2, TextUtils.TruncateAt truncateAt, int i3) {
        CharSequence charSequence = this.f320730a.f320743h;
        float h = (float) C108319b.m146697h(this.f320732c);
        C107160d dVar = this.f320730a;
        C107162e eVar = dVar.f320742g;
        int i4 = dVar.f320746k;
        C111995c cVar = dVar.f320744i;
        C87412m.m108594g(dVar.f320737b, "<this>");
        return new C112010q(charSequence, h, eVar, i, truncateAt, i4, 1.0f, 0.0f, true, true, i3, 0, 0, i2, (int[]) null, (int[]) null, cVar, 55424, (C8480h) null);
    }
}
