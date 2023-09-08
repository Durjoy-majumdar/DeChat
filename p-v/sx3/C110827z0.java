package sx3;

import fy3.C32227p;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import wx3.C15601d;
import y04.C66486j;
import yx3.C91590f;
import yx3.C91593i;

@C91590f(mo125468c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", mo125469f = "SlidingWindow.kt", mo125470l = {34, 40, 49, 55, 58}, mo125471m = "invokeSuspend")
/* renamed from: sx3.z0 */
public final class C110827z0 extends C91593i implements C32227p<C66486j<? super List<Object>>, C15601d<? super C13598b0>, Object> {

    /* renamed from: e */
    public Object f331554e;

    /* renamed from: f */
    public Object f331555f;

    /* renamed from: g */
    public int f331556g;

    /* renamed from: h */
    public int f331557h;

    /* renamed from: i */
    public /* synthetic */ Object f331558i;

    /* renamed from: j */
    public final /* synthetic */ int f331559j;

    /* renamed from: n */
    public final /* synthetic */ int f331560n;

    /* renamed from: o */
    public final /* synthetic */ Iterator<Object> f331561o;

    /* renamed from: p */
    public final /* synthetic */ boolean f331562p;

    /* renamed from: q */
    public final /* synthetic */ boolean f331563q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110827z0(int i, int i2, Iterator<Object> it, boolean z, boolean z2, C15601d<? super C110827z0> dVar) {
        super(2, dVar);
        this.f331559j = i;
        this.f331560n = i2;
        this.f331561o = it;
        this.f331562p = z;
        this.f331563q = z2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C110827z0 z0Var = new C110827z0(this.f331559j, this.f331560n, this.f331561o, this.f331562p, this.f331563q, dVar);
        z0Var.f331558i = obj;
        return z0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C110827z0) create((C66486j) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00b9 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f331557h
            r3 = 0
            r4 = 2
            r5 = 3
            r6 = 4
            r7 = 5
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r9) goto L_0x0047
            if (r2 == r4) goto L_0x0042
            if (r2 == r5) goto L_0x0030
            if (r2 == r6) goto L_0x0022
            if (r2 != r7) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0022:
            java.lang.Object r2 = r0.f331554e
            sx3.v0 r2 = (sx3.C110824v0) r2
            java.lang.Object r4 = r0.f331558i
            y04.j r4 = (y04.C66486j) r4
            kotlin.ResultKt.throwOnFailure(r18)
            r11 = r0
            goto L_0x0198
        L_0x0030:
            java.lang.Object r2 = r0.f331555f
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f331554e
            sx3.v0 r4 = (sx3.C110824v0) r4
            java.lang.Object r10 = r0.f331558i
            y04.j r10 = (y04.C66486j) r10
            kotlin.ResultKt.throwOnFailure(r18)
            r11 = r0
            goto L_0x0163
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x01b4
        L_0x0047:
            int r2 = r0.f331556g
            java.lang.Object r5 = r0.f331555f
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f331554e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r0.f331558i
            y04.j r7 = (y04.C66486j) r7
            kotlin.ResultKt.throwOnFailure(r18)
            r12 = r2
            r2 = r0
            goto L_0x00a8
        L_0x005b:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r0.f331558i
            y04.j r2 = (y04.C66486j) r2
            int r10 = r0.f331559j
            r11 = 1024(0x400, float:1.435E-42)
            if (r10 <= r11) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r11 = r10
        L_0x006a:
            int r12 = r0.f331560n
            int r12 = r12 - r10
            if (r12 < 0) goto L_0x00db
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r11)
            java.util.Iterator<java.lang.Object> r6 = r0.f331561o
            r7 = r2
            r2 = r0
            r16 = r6
            r6 = r5
            r5 = r16
        L_0x007d:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x00b9
            java.lang.Object r10 = r5.next()
            if (r8 <= 0) goto L_0x008c
            int r8 = r8 + -1
            goto L_0x007d
        L_0x008c:
            r6.add(r10)
            int r10 = r6.size()
            int r11 = r2.f331559j
            if (r10 != r11) goto L_0x007d
            r2.f331558i = r7
            r2.f331554e = r6
            r2.f331555f = r5
            r2.f331556g = r12
            r2.f331557h = r9
            java.lang.Object r8 = r7.mo90571e(r6, r2)
            if (r8 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            boolean r8 = r2.f331562p
            if (r8 == 0) goto L_0x00b0
            r6.clear()
            goto L_0x00b7
        L_0x00b0:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = r2.f331559j
            r6.<init>(r8)
        L_0x00b7:
            r8 = r12
            goto L_0x007d
        L_0x00b9:
            boolean r5 = r6.isEmpty()
            r5 = r5 ^ r9
            if (r5 == 0) goto L_0x01b4
            boolean r5 = r2.f331563q
            if (r5 != 0) goto L_0x00cc
            int r5 = r6.size()
            int r8 = r2.f331559j
            if (r5 != r8) goto L_0x01b4
        L_0x00cc:
            r2.f331558i = r3
            r2.f331554e = r3
            r2.f331555f = r3
            r2.f331557h = r4
            java.lang.Object r2 = r7.mo90571e(r6, r2)
            if (r2 != r1) goto L_0x01b4
            return r1
        L_0x00db:
            sx3.v0 r4 = new sx3.v0
            java.lang.Object[] r10 = new java.lang.Object[r11]
            r4.<init>(r10, r8)
            java.util.Iterator<java.lang.Object> r10 = r0.f331561o
            r11 = r0
            r16 = r10
            r10 = r2
            r2 = r16
        L_0x00ea:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0172
            java.lang.Object r12 = r2.next()
            int r13 = r4.mo52189f()
            int r14 = r4.f331548f
            if (r13 != r14) goto L_0x00fe
            r13 = 1
            goto L_0x00ff
        L_0x00fe:
            r13 = 0
        L_0x00ff:
            if (r13 != 0) goto L_0x016a
            java.lang.Object[] r13 = r4.f331547e
            int r15 = r4.f331549g
            int r8 = r4.f331550h
            int r15 = r15 + r8
            int r15 = r15 % r14
            r13[r15] = r12
            int r8 = r8 + 1
            r4.f331550h = r8
            int r8 = r4.mo52189f()
            int r12 = r4.f331548f
            if (r8 != r12) goto L_0x0119
            r8 = 1
            goto L_0x011a
        L_0x0119:
            r8 = 0
        L_0x011a:
            if (r8 == 0) goto L_0x0168
            int r8 = r4.f331550h
            int r13 = r11.f331559j
            if (r8 >= r13) goto L_0x0149
            int r8 = r12 >> 1
            int r12 = r12 + r8
            int r12 = r12 + r9
            if (r12 <= r13) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r13 = r12
        L_0x012a:
            int r8 = r4.f331549g
            if (r8 != 0) goto L_0x013a
            java.lang.Object[] r8 = r4.f331547e
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r13)
            java.lang.String r12 = "copyOf(this, newSize)"
            gy3.C87412m.m108593f(r8, r12)
            goto L_0x0140
        L_0x013a:
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.Object[] r8 = r4.toArray(r8)
        L_0x0140:
            sx3.v0 r12 = new sx3.v0
            int r4 = r4.f331550h
            r12.<init>(r8, r4)
            r4 = r12
            goto L_0x0168
        L_0x0149:
            boolean r8 = r11.f331562p
            if (r8 == 0) goto L_0x014f
            r8 = r4
            goto L_0x0154
        L_0x014f:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
        L_0x0154:
            r11.f331558i = r10
            r11.f331554e = r4
            r11.f331555f = r2
            r11.f331557h = r5
            java.lang.Object r8 = r10.mo90571e(r8, r11)
            if (r8 != r1) goto L_0x0163
            return r1
        L_0x0163:
            int r8 = r11.f331560n
            r4.mo162402i(r8)
        L_0x0168:
            r8 = 0
            goto L_0x00ea
        L_0x016a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "ring buffer is full"
            r1.<init>(r2)
            throw r1
        L_0x0172:
            boolean r2 = r11.f331563q
            if (r2 == 0) goto L_0x01b4
            r2 = r4
            r4 = r10
        L_0x0178:
            int r5 = r2.f331550h
            int r8 = r11.f331560n
            if (r5 <= r8) goto L_0x019e
            boolean r5 = r11.f331562p
            if (r5 == 0) goto L_0x0184
            r5 = r2
            goto L_0x0189
        L_0x0184:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
        L_0x0189:
            r11.f331558i = r4
            r11.f331554e = r2
            r11.f331555f = r3
            r11.f331557h = r6
            java.lang.Object r5 = r4.mo90571e(r5, r11)
            if (r5 != r1) goto L_0x0198
            return r1
        L_0x0198:
            int r5 = r11.f331560n
            r2.mo162402i(r5)
            goto L_0x0178
        L_0x019e:
            boolean r5 = r2.isEmpty()
            r5 = r5 ^ r9
            if (r5 == 0) goto L_0x01b4
            r11.f331558i = r3
            r11.f331554e = r3
            r11.f331555f = r3
            r11.f331557h = r7
            java.lang.Object r2 = r4.mo90571e(r2, r11)
            if (r2 != r1) goto L_0x01b4
            return r1
        L_0x01b4:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sx3.C110827z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
