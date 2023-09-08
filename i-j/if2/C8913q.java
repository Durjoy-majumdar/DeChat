package if2;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthTestUIC$simulateMod$1", mo125469f = "NewBizInfoAuthTestUIC.kt", mo125470l = {80}, mo125471m = "invokeSuspend")
/* renamed from: if2.q */
public final class C8913q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f28197d;

    /* renamed from: e */
    public int f28198e;

    /* renamed from: f */
    public int f28199f;

    /* renamed from: g */
    public int f28200g;

    /* renamed from: h */
    public Object f28201h;

    /* renamed from: i */
    public Object f28202i;

    /* renamed from: j */
    public Object f28203j;

    /* renamed from: n */
    public Object f28204n;

    /* renamed from: o */
    public int f28205o;

    /* renamed from: p */
    public final /* synthetic */ String[] f28206p;

    /* renamed from: q */
    public final /* synthetic */ String f28207q;

    /* renamed from: r */
    public final /* synthetic */ C8908n f28208r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8913q(String[] strArr, String str, C8908n nVar, C15601d<? super C8913q> dVar) {
        super(2, dVar);
        this.f28206p = strArr;
        this.f28207q = str;
        this.f28208r = nVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8913q(this.f28206p, this.f28207q, this.f28208r, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8913q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f28205o
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            int r2 = r0.f28200g
            int r5 = r0.f28199f
            int r6 = r0.f28198e
            int r7 = r0.f28197d
            java.lang.Object r8 = r0.f28204n
            java.lang.String[] r8 = (java.lang.String[]) r8
            java.lang.Object r9 = r0.f28203j
            if2.n r9 = (if2.C8908n) r9
            java.lang.Object r10 = r0.f28202i
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r0.f28201h
            java.lang.String[] r11 = (java.lang.String[]) r11
            kotlin.ResultKt.throwOnFailure(r20)
            r12 = r0
            r13 = r8
            r14 = r9
            r15 = r10
            r0 = r11
            r11 = 1
            r8 = r6
            goto L_0x00b4
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r20)
            r2 = 5
            java.lang.String[] r5 = r0.f28206p
            java.lang.String r6 = r0.f28207q
            if2.n r7 = r0.f28208r
            r9 = r0
            r8 = 0
        L_0x0043:
            if (r8 >= r2) goto L_0x00cb
            int r10 = r5.length
            r13 = r5
            r15 = r6
            r14 = r7
            r12 = r9
            r6 = 0
            r5 = r2
            r7 = r13
            r2 = r10
        L_0x004e:
            if (r6 >= r2) goto L_0x00bc
            r11 = r13[r6]
            t83.c$a r16 = new t83.c$a
            r10 = 1
            r17 = 1
            java.lang.String r18 = ""
            r9 = r16
            r20 = r11
            r11 = r15
            r3 = r12
            r12 = r20
            r4 = r13
            r13 = r18
            r0 = r14
            r14 = r17
            r9.<init>(r10, r11, r12, r13, r14)
            r16.mo9225i()
            rx3.g r9 = r0.f28192d
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI r9 = (com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.auth.NewBizInfoAuthMainUI) r9
            androidx.appcompat.app.AppCompatActivity r9 = r9.getContext()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "mod: "
            r10.append(r11)
            r11 = r20
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            nj3.C76912y0.m92773l(r9, r10)
            r9 = 1001(0x3e9, double:4.946E-321)
            r3.f28201h = r7
            r3.f28202i = r15
            r3.f28203j = r0
            r3.f28204n = r4
            r3.f28197d = r5
            r3.f28198e = r8
            r3.f28199f = r6
            r3.f28200g = r2
            r11 = 1
            r3.f28205o = r11
            java.lang.Object r9 = a14.C53965x0.m60607b(r9, r3)
            if (r9 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            r14 = r0
            r12 = r3
            r13 = r4
            r0 = r7
            r7 = r5
            r5 = r6
        L_0x00b4:
            int r6 = r5 + 1
            r5 = r7
            r4 = 1
            r7 = r0
            r0 = r19
            goto L_0x004e
        L_0x00bc:
            r3 = r12
            r0 = r14
            r11 = 1
            int r8 = r8 + 1
            r9 = r3
            r2 = r5
            r5 = r7
            r6 = r15
            r4 = 1
            r7 = r0
            r0 = r19
            goto L_0x0043
        L_0x00cb:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: if2.C8913q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
