package yj2;

import a14.C0000n0;
import fy3.C32227p;
import oj2.C62035b;
import rx3.C13598b0;
import rx3.C13604l;
import wj2.C53183e;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.ringtone.RingtoneSettingHelper$getRingBackPlayInfo$2", mo125469f = "RingtoneSettingHelper.kt", mo125470l = {155, 160, 168}, mo125471m = "invokeSuspend")
/* renamed from: yj2.b */
public final class C53529b extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends C53183e, ? extends C62035b>>, Object> {

    /* renamed from: d */
    public Object f150497d;

    /* renamed from: e */
    public int f150498e;

    /* renamed from: f */
    public final /* synthetic */ String f150499f;

    /* renamed from: g */
    public final /* synthetic */ boolean f150500g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53529b(String str, boolean z, C15601d<? super C53529b> dVar) {
        super(2, dVar);
        this.f150499f = str;
        this.f150500g = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C53529b(this.f150499f, this.f150500g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C53529b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097 A[Catch:{ Exception -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0 A[Catch:{ Exception -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd A[Catch:{ Exception -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd A[Catch:{ Exception -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6 A[Catch:{ Exception -> 0x002b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r14.f150498e
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = "MicroMsg.RingtoneSettingHelper"
            r6 = 0
            if (r1 == 0) goto L_0x002e
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ Exception -> 0x002b }
            goto L_0x00cf
        L_0x0017:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x001f:
            java.lang.Object r1 = r14.f150497d
            ve3.q r1 = (ve3.C52847q) r1
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ Exception -> 0x002b }
            goto L_0x0089
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ Exception -> 0x002b }
            goto L_0x0049
        L_0x002b:
            r15 = move-exception
            goto L_0x0109
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r15)
            vj2.f r7 = new vj2.f     // Catch:{ Exception -> 0x002b }
            java.lang.String r15 = r14.f150499f     // Catch:{ Exception -> 0x002b }
            boolean r1 = r14.f150500g     // Catch:{ Exception -> 0x002b }
            r7.<init>(r15, r1)     // Catch:{ Exception -> 0x002b }
            r8 = 0
            r10 = 0
            r12 = 3
            r13 = 0
            r14.f150498e = r4     // Catch:{ Exception -> 0x002b }
            r11 = r14
            java.lang.Object r15 = q40.C89456b.m111831a(r7, r8, r10, r11, r12, r13)     // Catch:{ Exception -> 0x002b }
            if (r15 != r0) goto L_0x0049
            return r0
        L_0x0049:
            ve3.r r15 = (ve3.C52849r) r15     // Catch:{ Exception -> 0x002b }
            ve3.q r1 = r15.f147623e     // Catch:{ Exception -> 0x002b }
            ve3.p r15 = r15.f147622d     // Catch:{ Exception -> 0x002b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002b }
            r4.<init>()     // Catch:{ Exception -> 0x002b }
            java.lang.String r7 = "getRingBackPlayInfo name:"
            r4.append(r7)     // Catch:{ Exception -> 0x002b }
            java.lang.String r7 = r14.f150499f     // Catch:{ Exception -> 0x002b }
            r4.append(r7)     // Catch:{ Exception -> 0x002b }
            java.lang.String r7 = ", global:"
            r4.append(r7)     // Catch:{ Exception -> 0x002b }
            r4.append(r1)     // Catch:{ Exception -> 0x002b }
            java.lang.String r7 = ", friend:"
            r4.append(r7)     // Catch:{ Exception -> 0x002b }
            r4.append(r15)     // Catch:{ Exception -> 0x002b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x002b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)     // Catch:{ Exception -> 0x002b }
            if (r15 == 0) goto L_0x00bb
            r14.f150497d = r1     // Catch:{ Exception -> 0x002b }
            r14.f150498e = r3     // Catch:{ Exception -> 0x002b }
            a14.h0 r3 = a14.C53872d1.f151119c     // Catch:{ Exception -> 0x002b }
            yj2.c r4 = new yj2.c     // Catch:{ Exception -> 0x002b }
            r4.<init>(r15, r6)     // Catch:{ Exception -> 0x002b }
            java.lang.Object r15 = a14.C53895h.m60469g(r3, r4, r14)     // Catch:{ Exception -> 0x002b }
            if (r15 != r0) goto L_0x0089
            return r0
        L_0x0089:
            oj2.b r15 = (oj2.C62035b) r15     // Catch:{ Exception -> 0x002b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002b }
            r3.<init>()     // Catch:{ Exception -> 0x002b }
            java.lang.String r4 = "friendPlayInfo isValid:"
            r3.append(r4)     // Catch:{ Exception -> 0x002b }
            if (r15 == 0) goto L_0x00a0
            boolean r4 = r15.mo86982a()     // Catch:{ Exception -> 0x002b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x002b }
            goto L_0x00a1
        L_0x00a0:
            r4 = r6
        L_0x00a1:
            r3.append(r4)     // Catch:{ Exception -> 0x002b }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x002b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)     // Catch:{ Exception -> 0x002b }
            if (r15 == 0) goto L_0x00bb
            boolean r3 = r15.mo86982a()     // Catch:{ Exception -> 0x002b }
            if (r3 == 0) goto L_0x00bb
            rx3.l r0 = new rx3.l     // Catch:{ Exception -> 0x002b }
            wj2.e r1 = wj2.C53183e.EXCLUSIVE     // Catch:{ Exception -> 0x002b }
            r0.<init>(r1, r15)     // Catch:{ Exception -> 0x002b }
            return r0
        L_0x00bb:
            if (r1 == 0) goto L_0x0101
            r14.f150497d = r6     // Catch:{ Exception -> 0x002b }
            r14.f150498e = r2     // Catch:{ Exception -> 0x002b }
            a14.h0 r15 = a14.C53872d1.f151119c     // Catch:{ Exception -> 0x002b }
            yj2.d r2 = new yj2.d     // Catch:{ Exception -> 0x002b }
            r2.<init>(r1, r6)     // Catch:{ Exception -> 0x002b }
            java.lang.Object r15 = a14.C53895h.m60469g(r15, r2, r14)     // Catch:{ Exception -> 0x002b }
            if (r15 != r0) goto L_0x00cf
            return r0
        L_0x00cf:
            oj2.b r15 = (oj2.C62035b) r15     // Catch:{ Exception -> 0x002b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002b }
            r0.<init>()     // Catch:{ Exception -> 0x002b }
            java.lang.String r1 = "globalPlayInfo isValid:"
            r0.append(r1)     // Catch:{ Exception -> 0x002b }
            if (r15 == 0) goto L_0x00e6
            boolean r1 = r15.mo86982a()     // Catch:{ Exception -> 0x002b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x002b }
            goto L_0x00e7
        L_0x00e6:
            r1 = r6
        L_0x00e7:
            r0.append(r1)     // Catch:{ Exception -> 0x002b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x002b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x002b }
            if (r15 == 0) goto L_0x0101
            boolean r0 = r15.mo86982a()     // Catch:{ Exception -> 0x002b }
            if (r0 == 0) goto L_0x0101
            rx3.l r0 = new rx3.l     // Catch:{ Exception -> 0x002b }
            wj2.e r1 = wj2.C53183e.GLOBAL     // Catch:{ Exception -> 0x002b }
            r0.<init>(r1, r15)     // Catch:{ Exception -> 0x002b }
            return r0
        L_0x0101:
            rx3.l r15 = new rx3.l     // Catch:{ Exception -> 0x002b }
            wj2.e r0 = wj2.C53183e.DEFAULT     // Catch:{ Exception -> 0x002b }
            r15.<init>(r0, r6)     // Catch:{ Exception -> 0x002b }
            return r15
        L_0x0109:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getRingBackPlayInfo error:"
            r0.append(r1)
            java.lang.String r15 = r15.getLocalizedMessage()
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r15)
            rx3.l r15 = new rx3.l
            wj2.e r0 = wj2.C53183e.UNKNOWN
            r15.<init>(r0, r6)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: yj2.C53529b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
