package a14;

import java.util.Collection;
import java.util.List;
import sx3.C64186f0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: a14.d */
public final class C53869d {

    @C91590f(mo125468c = "kotlinx.coroutines.AwaitKt", mo125469f = "Await.kt", mo125470l = {54}, mo125471m = "joinAll")
    /* renamed from: a14.d$a */
    public static final class C53870a extends C66704d {

        /* renamed from: d */
        public Object f151112d;

        /* renamed from: e */
        public int f151113e;

        /* renamed from: f */
        public int f151114f;

        /* renamed from: g */
        public /* synthetic */ Object f151115g;

        /* renamed from: h */
        public int f151116h;

        public C53870a(C15601d<? super C53870a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f151115g = obj;
            this.f151116h |= Integer.MIN_VALUE;
            return C53869d.m60386b((C53973z1[]) null, this);
        }
    }

    /* renamed from: a */
    public static final <T> Object m60385a(Collection<? extends C53953u0<? extends T>> collection, C15601d<? super List<? extends T>> dVar) {
        if (collection.isEmpty()) {
            return C64186f0.f181907d;
        }
        Object[] array = collection.toArray(new C53953u0[0]);
        if (array != null) {
            return new C53862c((C53953u0[]) array).mo74488a(dVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m60386b(a14.C53973z1[] r5, wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            boolean r0 = r6 instanceof a14.C53869d.C53870a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            a14.d$a r0 = (a14.C53869d.C53870a) r0
            int r1 = r0.f151116h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f151116h = r1
            goto L_0x0018
        L_0x0013:
            a14.d$a r0 = new a14.d$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f151115g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f151116h
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r5 = r0.f151114f
            int r2 = r0.f151113e
            java.lang.Object r4 = r0.f151112d
            a14.z1[] r4 = (a14.C53973z1[]) r4
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r4
            goto L_0x0053
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = 0
            int r2 = r5.length
            r6 = r5
            r5 = r2
            r2 = 0
        L_0x0040:
            if (r2 >= r5) goto L_0x0055
            r4 = r6[r2]
            r0.f151112d = r6
            r0.f151113e = r2
            r0.f151114f = r5
            r0.f151116h = r3
            java.lang.Object r4 = r4.mo74521O(r0)
            if (r4 != r1) goto L_0x0053
            return r1
        L_0x0053:
            int r2 = r2 + r3
            goto L_0x0040
        L_0x0055:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53869d.m60386b(a14.z1[], wx3.d):java.lang.Object");
    }
}
