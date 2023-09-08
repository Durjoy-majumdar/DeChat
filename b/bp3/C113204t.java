package bp3;

import fy3.C32226l;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: bp3.t */
public final class C113204t {

    @C91590f(mo125468c = "com.tencent.mm.util.SystraceKtKt", mo125469f = "SystraceKt.kt", mo125470l = {15}, mo125471m = "systraceCo")
    /* renamed from: bp3.t$a */
    public static final class C113205a<T> extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f338713d;

        /* renamed from: e */
        public int f338714e;

        public C113205a(C15601d<? super C113205a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f338713d = obj;
            this.f338714e |= Integer.MIN_VALUE;
            return C113204t.m154919a((String) null, (C32226l) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m154919a(java.lang.String r4, fy3.C32226l<? super wx3.C15601d<? super T>, ? extends java.lang.Object> r5, wx3.C15601d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof bp3.C113204t.C113205a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            bp3.t$a r0 = (bp3.C113204t.C113205a) r0
            int r1 = r0.f338714e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338714e = r1
            goto L_0x0018
        L_0x0013:
            bp3.t$a r0 = new bp3.t$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f338713d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f338714e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x0027 }
            goto L_0x0040
        L_0x0027:
            r4 = move-exception
            goto L_0x0044
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            bp3.C79760s.m96908a(r4)     // Catch:{ all -> 0x0027 }
            r0.f338714e = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r6 = r5.invoke(r0)     // Catch:{ all -> 0x0027 }
            if (r6 != r1) goto L_0x0040
            return r1
        L_0x0040:
            bp3.C79760s.m96909b()
            return r6
        L_0x0044:
            bp3.C79760s.m96909b()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bp3.C113204t.m154919a(java.lang.String, fy3.l, wx3.d):java.lang.Object");
    }
}
