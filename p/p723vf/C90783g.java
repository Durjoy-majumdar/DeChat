package p723vf;

import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87413o;
import java.util.HashMap;
import java.util.regex.Pattern;
import rx3.C13598b0;

/* renamed from: vf.g */
public final class C90783g extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0 f260696d;

    /* renamed from: e */
    public final /* synthetic */ Pattern f260697e;

    /* renamed from: f */
    public final /* synthetic */ HashMap f260698f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90783g(int i, C8479f0 f0Var, Pattern pattern, HashMap hashMap) {
        super(1);
        this.f260696d = f0Var;
        this.f260697e = pattern;
        this.f260698f = hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:181:0x03ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "line"
            gy3.C87412m.m108594g(r1, r2)
            gy3.f0 r2 = r0.f260696d
            T r2 = r2.f27484d
            vf.n r2 = (p723vf.C90791n) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x03cc
            java.lang.String r2 = "Size:"
            boolean r2 = z04.C112551y.m153819s(r1, r2, r3)
            r5 = 32
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.lang.String r7 = " "
            java.lang.String r8 = "(this as java.lang.String).substring(startIndex)"
            if (r2 == 0) goto L_0x0092
            r2 = 5
            java.lang.String r2 = r1.substring(r2)
            gy3.C87412m.m108593f(r2, r8)
            int r8 = r2.length()
            int r8 = r8 - r4
            r9 = 0
            r10 = 0
        L_0x0034:
            if (r9 > r8) goto L_0x0057
            if (r10 != 0) goto L_0x003a
            r11 = r9
            goto L_0x003b
        L_0x003a:
            r11 = r8
        L_0x003b:
            char r11 = r2.charAt(r11)
            int r11 = gy3.C87412m.m108596i(r11, r5)
            if (r11 > 0) goto L_0x0047
            r11 = 1
            goto L_0x0048
        L_0x0047:
            r11 = 0
        L_0x0048:
            if (r10 != 0) goto L_0x0051
            if (r11 != 0) goto L_0x004e
            r10 = 1
            goto L_0x0034
        L_0x004e:
            int r9 = r9 + 1
            goto L_0x0034
        L_0x0051:
            if (r11 != 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            int r8 = r8 + -1
            goto L_0x0034
        L_0x0057:
            int r8 = r8 + r4
            java.lang.CharSequence r2 = r2.subSequence(r9, r8)
            java.lang.String r8 = r2.toString()
            java.lang.String[] r9 = new java.lang.String[]{r7}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r2 = z04.C112550d0.m153785U(r8, r9, r10, r11, r12, r13)
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r5)
            if (r2 == 0) goto L_0x008c
            java.lang.String[] r2 = (java.lang.String[]) r2
            gy3.f0 r5 = r0.f260696d
            T r5 = r5.f27484d
            vf.n r5 = (p723vf.C90791n) r5
            gy3.C87412m.m108591d(r5)
            long r6 = r5.f260714d
            r2 = r2[r3]
            long r8 = java.lang.Long.parseLong(r2)
            long r6 = r6 + r8
            r5.f260714d = r6
            goto L_0x03bd
        L_0x008c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x0092:
            java.lang.String r2 = "Rss:"
            boolean r2 = z04.C112551y.m153819s(r1, r2, r3)
            r9 = 4
            if (r2 == 0) goto L_0x0107
            java.lang.String r2 = r1.substring(r9)
            gy3.C87412m.m108593f(r2, r8)
            int r8 = r2.length()
            int r8 = r8 - r4
            r9 = 0
            r10 = 0
        L_0x00a9:
            if (r9 > r8) goto L_0x00cc
            if (r10 != 0) goto L_0x00af
            r11 = r9
            goto L_0x00b0
        L_0x00af:
            r11 = r8
        L_0x00b0:
            char r11 = r2.charAt(r11)
            int r11 = gy3.C87412m.m108596i(r11, r5)
            if (r11 > 0) goto L_0x00bc
            r11 = 1
            goto L_0x00bd
        L_0x00bc:
            r11 = 0
        L_0x00bd:
            if (r10 != 0) goto L_0x00c6
            if (r11 != 0) goto L_0x00c3
            r10 = 1
            goto L_0x00a9
        L_0x00c3:
            int r9 = r9 + 1
            goto L_0x00a9
        L_0x00c6:
            if (r11 != 0) goto L_0x00c9
            goto L_0x00cc
        L_0x00c9:
            int r8 = r8 + -1
            goto L_0x00a9
        L_0x00cc:
            int r8 = r8 + r4
            java.lang.CharSequence r2 = r2.subSequence(r9, r8)
            java.lang.String r8 = r2.toString()
            java.lang.String[] r9 = new java.lang.String[]{r7}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r2 = z04.C112550d0.m153785U(r8, r9, r10, r11, r12, r13)
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r5)
            if (r2 == 0) goto L_0x0101
            java.lang.String[] r2 = (java.lang.String[]) r2
            gy3.f0 r5 = r0.f260696d
            T r5 = r5.f27484d
            vf.n r5 = (p723vf.C90791n) r5
            gy3.C87412m.m108591d(r5)
            long r6 = r5.f260715e
            r2 = r2[r3]
            long r8 = java.lang.Long.parseLong(r2)
            long r6 = r6 + r8
            r5.f260715e = r6
            goto L_0x03bd
        L_0x0101:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x0107:
            java.lang.String r2 = "Pss:"
            boolean r2 = z04.C112551y.m153819s(r1, r2, r3)
            if (r2 == 0) goto L_0x017b
            java.lang.String r2 = r1.substring(r9)
            gy3.C87412m.m108593f(r2, r8)
            int r8 = r2.length()
            int r8 = r8 - r4
            r9 = 0
            r10 = 0
        L_0x011d:
            if (r9 > r8) goto L_0x0140
            if (r10 != 0) goto L_0x0123
            r11 = r9
            goto L_0x0124
        L_0x0123:
            r11 = r8
        L_0x0124:
            char r11 = r2.charAt(r11)
            int r11 = gy3.C87412m.m108596i(r11, r5)
            if (r11 > 0) goto L_0x0130
            r11 = 1
            goto L_0x0131
        L_0x0130:
            r11 = 0
        L_0x0131:
            if (r10 != 0) goto L_0x013a
            if (r11 != 0) goto L_0x0137
            r10 = 1
            goto L_0x011d
        L_0x0137:
            int r9 = r9 + 1
            goto L_0x011d
        L_0x013a:
            if (r11 != 0) goto L_0x013d
            goto L_0x0140
        L_0x013d:
            int r8 = r8 + -1
            goto L_0x011d
        L_0x0140:
            int r8 = r8 + r4
            java.lang.CharSequence r2 = r2.subSequence(r9, r8)
            java.lang.String r8 = r2.toString()
            java.lang.String[] r9 = new java.lang.String[]{r7}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r2 = z04.C112550d0.m153785U(r8, r9, r10, r11, r12, r13)
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r5)
            if (r2 == 0) goto L_0x0175
            java.lang.String[] r2 = (java.lang.String[]) r2
            gy3.f0 r5 = r0.f260696d
            T r5 = r5.f27484d
            vf.n r5 = (p723vf.C90791n) r5
            gy3.C87412m.m108591d(r5)
            long r6 = r5.f260716f
            r2 = r2[r3]
            long r8 = java.lang.Long.parseLong(r2)
            long r6 = r6 + r8
            r5.f260716f = r6
            goto L_0x03bd
        L_0x0175:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x017b:
            java.lang.String r2 = "Shared_Clean:"
            boolean r2 = z04.C112551y.m153819s(r1, r2, r3)
            r9 = 13
            if (r2 == 0) goto L_0x01f1
            java.lang.String r2 = r1.substring(r9)
            gy3.C87412m.m108593f(r2, r8)
            int r8 = r2.length()
            int r8 = r8 - r4
            r9 = 0
            r10 = 0
        L_0x0193:
            if (r9 > r8) goto L_0x01b6
            if (r10 != 0) goto L_0x0199
            r11 = r9
            goto L_0x019a
        L_0x0199:
            r11 = r8
        L_0x019a:
            char r11 = r2.charAt(r11)
            int r11 = gy3.C87412m.m108596i(r11, r5)
            if (r11 > 0) goto L_0x01a6
            r11 = 1
            goto L_0x01a7
        L_0x01a6:
            r11 = 0
        L_0x01a7:
            if (r10 != 0) goto L_0x01b0
            if (r11 != 0) goto L_0x01ad
            r10 = 1
            goto L_0x0193
        L_0x01ad:
            int r9 = r9 + 1
            goto L_0x0193
        L_0x01b0:
            if (r11 != 0) goto L_0x01b3
            goto L_0x01b6
        L_0x01b3:
            int r8 = r8 + -1
            goto L_0x0193
        L_0x01b6:
            int r8 = r8 + r4
            java.lang.CharSequence r2 = r2.subSequence(r9, r8)
            java.lang.String r8 = r2.toString()
            java.lang.String[] r9 = new java.lang.String[]{r7}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r2 = z04.C112550d0.m153785U(r8, r9, r10, r11, r12, r13)
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r5)
            if (r2 == 0) goto L_0x01eb
            java.lang.String[] r2 = (java.lang.String[]) r2
            gy3.f0 r5 = r0.f260696d
            T r5 = r5.f27484d
            vf.n r5 = (p723vf.C90791n) r5
            gy3.C87412m.m108591d(r5)
            long r6 = r5.f260717g
            r2 = r2[r3]
            long r8 = java.lang.Long.parseLong(r2)
            long r6 = r6 + r8
            r5.f260717g = r6
            goto L_0x03bd
        L_0x01eb:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x01f1:
            java.lang.String r2 = "Shared_Dirty:"
            boolean r2 = z04.C112551y.m153819s(r1, r2, r3)
            if (r2 == 0) goto L_0x0265
            java.lang.String r2 = r1.substring(r9)
            gy3.C87412m.m108593f(r2, r8)
            int r8 = r2.length()
            int r8 = r8 - r4
            r9 = 0
            r10 = 0
        L_0x0207:
            if (r9 > r8) goto L_0x022a
            if (r10 != 0) goto L_0x020d
            r11 = r9
            goto L_0x020e
        L_0x020d:
            r11 = r8
        L_0x020e:
            char r11 = r2.charAt(r11)
            int r11 = gy3.C87412m.m108596i(r11, r5)
            if (r11 > 0) goto L_0x021a
            r11 = 1
            goto L_0x021b
        L_0x021a:
            r11 = 0
        L_0x021b:
            if (r10 != 0) goto L_0x0224
            if (r11 != 0) goto L_0x0221
            r10 = 1
            goto L_0x0207
        L_0x0221:
            int r9 = r9 + 1
            goto L_0x0207
        L_0x0224:
            if (r11 != 0) goto L_0x0227
            goto L_0x022a
        L_0x0227:
            int r8 = r8 + -1
            goto L_0x0207
        L_0x022a:
            int r8 = r8 + r4
            java.lang.CharSequence r2 = r2.subSequence(r9, r8)
            java.lang.String r8 = r2.toString()
            java.lang.String[] r9 = new java.lang.String[]{r7}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r2 = z04.C112550d0.m153785U(r8, r9, r10, r11, r12, r13)
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r5)
            if (r2 == 0) goto L_0x025f
            java.lang.String[] r2 = (java.lang.String[]) r2
            gy3.f0 r5 = r0.f260696d
            T r5 = r5.f27484d
            vf.n r5 = (p723vf.C90791n) r5
            gy3.C87412m.m108591d(r5)
            long r6 = r5.f260718h
            r2 = r2[r3]
            long r8 = java.lang.Long.parseLong(r2)
            long r6 = r6 + r8
            r5.f260718h = r6
            goto L_0x03bd
        L_0x025f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x0265:
            java.lang.String r2 = "Private_Clean:"
            boolean r2 = z04.C112551y.m153819s(r1, r2, r3)
            r9 = 14
            if (r2 == 0) goto L_0x02db
            java.lang.String r2 = r1.substring(r9)
            gy3.C87412m.m108593f(r2, r8)
            int r8 = r2.length()
            int r8 = r8 - r4
            r9 = 0
            r10 = 0
        L_0x027d:
            if (r9 > r8) goto L_0x02a0
            if (r10 != 0) goto L_0x0283
            r11 = r9
            goto L_0x0284
        L_0x0283:
            r11 = r8
        L_0x0284:
            char r11 = r2.charAt(r11)
            int r11 = gy3.C87412m.m108596i(r11, r5)
            if (r11 > 0) goto L_0x0290
            r11 = 1
            goto L_0x0291
        L_0x0290:
            r11 = 0
        L_0x0291:
            if (r10 != 0) goto L_0x029a
            if (r11 != 0) goto L_0x0297
            r10 = 1
            goto L_0x027d
        L_0x0297:
            int r9 = r9 + 1
            goto L_0x027d
        L_0x029a:
            if (r11 != 0) goto L_0x029d
            goto L_0x02a0
        L_0x029d:
            int r8 = r8 + -1
            goto L_0x027d
        L_0x02a0:
            int r8 = r8 + r4
            java.lang.CharSequence r2 = r2.subSequence(r9, r8)
            java.lang.String r8 = r2.toString()
            java.lang.String[] r9 = new java.lang.String[]{r7}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r2 = z04.C112550d0.m153785U(r8, r9, r10, r11, r12, r13)
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r5)
            if (r2 == 0) goto L_0x02d5
            java.lang.String[] r2 = (java.lang.String[]) r2
            gy3.f0 r5 = r0.f260696d
            T r5 = r5.f27484d
            vf.n r5 = (p723vf.C90791n) r5
            gy3.C87412m.m108591d(r5)
            long r6 = r5.f260719i
            r2 = r2[r3]
            long r8 = java.lang.Long.parseLong(r2)
            long r6 = r6 + r8
            r5.f260719i = r6
            goto L_0x03bd
        L_0x02d5:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x02db:
            java.lang.String r2 = "Private_Dirty:"
            boolean r2 = z04.C112551y.m153819s(r1, r2, r3)
            if (r2 == 0) goto L_0x034f
            java.lang.String r2 = r1.substring(r9)
            gy3.C87412m.m108593f(r2, r8)
            int r8 = r2.length()
            int r8 = r8 - r4
            r9 = 0
            r10 = 0
        L_0x02f1:
            if (r9 > r8) goto L_0x0314
            if (r10 != 0) goto L_0x02f7
            r11 = r9
            goto L_0x02f8
        L_0x02f7:
            r11 = r8
        L_0x02f8:
            char r11 = r2.charAt(r11)
            int r11 = gy3.C87412m.m108596i(r11, r5)
            if (r11 > 0) goto L_0x0304
            r11 = 1
            goto L_0x0305
        L_0x0304:
            r11 = 0
        L_0x0305:
            if (r10 != 0) goto L_0x030e
            if (r11 != 0) goto L_0x030b
            r10 = 1
            goto L_0x02f1
        L_0x030b:
            int r9 = r9 + 1
            goto L_0x02f1
        L_0x030e:
            if (r11 != 0) goto L_0x0311
            goto L_0x0314
        L_0x0311:
            int r8 = r8 + -1
            goto L_0x02f1
        L_0x0314:
            int r8 = r8 + r4
            java.lang.CharSequence r2 = r2.subSequence(r9, r8)
            java.lang.String r8 = r2.toString()
            java.lang.String[] r9 = new java.lang.String[]{r7}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r2 = z04.C112550d0.m153785U(r8, r9, r10, r11, r12, r13)
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r5)
            if (r2 == 0) goto L_0x0349
            java.lang.String[] r2 = (java.lang.String[]) r2
            gy3.f0 r5 = r0.f260696d
            T r5 = r5.f27484d
            vf.n r5 = (p723vf.C90791n) r5
            gy3.C87412m.m108591d(r5)
            long r6 = r5.f260720j
            r2 = r2[r3]
            long r8 = java.lang.Long.parseLong(r2)
            long r6 = r6 + r8
            r5.f260720j = r6
            goto L_0x03bd
        L_0x0349:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x034f:
            java.lang.String r2 = "SwapPss:"
            boolean r2 = z04.C112551y.m153819s(r1, r2, r3)
            if (r2 == 0) goto L_0x03c5
            r2 = 8
            java.lang.String r2 = r1.substring(r2)
            gy3.C87412m.m108593f(r2, r8)
            int r8 = r2.length()
            int r8 = r8 - r4
            r9 = 0
            r10 = 0
        L_0x0367:
            if (r9 > r8) goto L_0x038a
            if (r10 != 0) goto L_0x036d
            r11 = r9
            goto L_0x036e
        L_0x036d:
            r11 = r8
        L_0x036e:
            char r11 = r2.charAt(r11)
            int r11 = gy3.C87412m.m108596i(r11, r5)
            if (r11 > 0) goto L_0x037a
            r11 = 1
            goto L_0x037b
        L_0x037a:
            r11 = 0
        L_0x037b:
            if (r10 != 0) goto L_0x0384
            if (r11 != 0) goto L_0x0381
            r10 = 1
            goto L_0x0367
        L_0x0381:
            int r9 = r9 + 1
            goto L_0x0367
        L_0x0384:
            if (r11 != 0) goto L_0x0387
            goto L_0x038a
        L_0x0387:
            int r8 = r8 + -1
            goto L_0x0367
        L_0x038a:
            int r8 = r8 + r4
            java.lang.CharSequence r2 = r2.subSequence(r9, r8)
            java.lang.String r8 = r2.toString()
            java.lang.String[] r9 = new java.lang.String[]{r7}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r2 = z04.C112550d0.m153785U(r8, r9, r10, r11, r12, r13)
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r5)
            if (r2 == 0) goto L_0x03bf
            java.lang.String[] r2 = (java.lang.String[]) r2
            gy3.f0 r5 = r0.f260696d
            T r5 = r5.f27484d
            vf.n r5 = (p723vf.C90791n) r5
            gy3.C87412m.m108591d(r5)
            long r6 = r5.f260721k
            r2 = r2[r3]
            long r8 = java.lang.Long.parseLong(r2)
            long r6 = r6 + r8
            r5.f260721k = r6
        L_0x03bd:
            r2 = 1
            goto L_0x03c6
        L_0x03bf:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x03c5:
            r2 = 0
        L_0x03c6:
            if (r2 == 0) goto L_0x03ca
            goto L_0x0469
        L_0x03ca:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x03cc:
            java.util.regex.Pattern r2 = r0.f260697e
            java.util.regex.Matcher r1 = r2.matcher(r1)
            java.lang.String r2 = "pattern.matcher(line)"
            gy3.C87412m.m108593f(r1, r2)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x0469
            java.lang.String r2 = r1.group(r4)
            r5 = 2
            java.lang.String r1 = r1.group(r5)
            if (r1 == 0) goto L_0x03ef
            boolean r5 = z04.C112551y.m153811k(r1)
            if (r5 == 0) goto L_0x03f0
        L_0x03ef:
            r3 = 1
        L_0x03f0:
            if (r3 == 0) goto L_0x03f4
            java.lang.String r1 = "[no-name]"
        L_0x03f4:
            gy3.f0 r3 = r0.f260696d
            java.util.HashMap r4 = r0.f260698f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r6 = 124(0x7c, float:1.74E-43)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.Object r4 = r4.get(r5)
            vf.n r4 = (p723vf.C90791n) r4
            r3.f27484d = r4
            gy3.f0 r3 = r0.f260696d
            T r4 = r3.f27484d
            vf.n r4 = (p723vf.C90791n) r4
            if (r4 != 0) goto L_0x0459
            vf.n r4 = new vf.n
            r7 = r4
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 2047(0x7ff, float:2.868E-42)
            r29 = 0
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r29)
            r3.f27484d = r4
            java.util.HashMap r3 = r0.f260698f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r3.put(r5, r4)
            r4.f260712b = r2
            r4.f260711a = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0459:
            gy3.f0 r1 = r0.f260696d
            T r1 = r1.f27484d
            vf.n r1 = (p723vf.C90791n) r1
            gy3.C87412m.m108591d(r1)
            long r2 = r1.f260713c
            r4 = 1
            long r2 = r2 + r4
            r1.f260713c = r2
        L_0x0469:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p723vf.C90783g.invoke(java.lang.Object):java.lang.Object");
    }
}
