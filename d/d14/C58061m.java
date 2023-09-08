package d14;

import c14.C54649x;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.m */
public final /* synthetic */ class C58061m {

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", mo125469f = "Channels.kt", mo125470l = {51, 62}, mo125471m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: d14.m$a */
    public static final class C58062a<T> extends C66704d {

        /* renamed from: d */
        public Object f166066d;

        /* renamed from: e */
        public Object f166067e;

        /* renamed from: f */
        public boolean f166068f;

        /* renamed from: g */
        public /* synthetic */ Object f166069g;

        /* renamed from: h */
        public int f166070h;

        public C58062a(C15601d<? super C58062a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f166069g = obj;
            this.f166070h |= Integer.MIN_VALUE;
            return C58061m.m67219a((C45253g) null, (C54649x) null, false, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073 A[Catch:{ all -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076 A[Catch:{ all -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079 A[Catch:{ all -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0089 A[SYNTHETIC, Splitter:B:42:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a A[Catch:{ all -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m67219a(d14.C45253g<? super T> r6, c14.C54649x<? extends T> r7, boolean r8, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            boolean r0 = r9 instanceof d14.C58061m.C58062a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            d14.m$a r0 = (d14.C58061m.C58062a) r0
            int r1 = r0.f166070h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166070h = r1
            goto L_0x0018
        L_0x0013:
            d14.m$a r0 = new d14.m$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f166069g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166070h
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0051
            if (r2 == r3) goto L_0x003f
            if (r2 != r4) goto L_0x0037
            boolean r6 = r0.f166068f
            java.lang.Object r7 = r0.f166067e
            c14.x r7 = (c14.C54649x) r7
            java.lang.Object r8 = r0.f166066d
            d14.g r8 = (d14.C45253g) r8
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x007c }
        L_0x0033:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L_0x0058
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            boolean r6 = r0.f166068f
            java.lang.Object r7 = r0.f166067e
            c14.x r7 = (c14.C54649x) r7
            java.lang.Object r8 = r0.f166066d
            d14.g r8 = (d14.C45253g) r8
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x007c }
            c14.l r9 = (c14.C54630l) r9     // Catch:{ all -> 0x007c }
            java.lang.Object r9 = r9.f153153a     // Catch:{ all -> 0x007c }
            goto L_0x006a
        L_0x0051:
            kotlin.ResultKt.throwOnFailure(r9)
            boolean r9 = r6 instanceof d14.C58072n1
            if (r9 != 0) goto L_0x00a8
        L_0x0058:
            r0.f166066d = r6     // Catch:{ all -> 0x009c }
            r0.f166067e = r7     // Catch:{ all -> 0x009c }
            r0.f166068f = r8     // Catch:{ all -> 0x009c }
            r0.f166070h = r3     // Catch:{ all -> 0x009c }
            java.lang.Object r9 = r7.mo75513f(r0)     // Catch:{ all -> 0x009c }
            if (r9 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x006a:
            boolean r2 = r9 instanceof c14.C54630l.C54631a     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x008a
            boolean r8 = r9 instanceof c14.C54630l.C54631a     // Catch:{ all -> 0x007c }
            r0 = 0
            if (r8 == 0) goto L_0x0076
            c14.l$a r9 = (c14.C54630l.C54631a) r9     // Catch:{ all -> 0x007c }
            goto L_0x0077
        L_0x0076:
            r9 = r0
        L_0x0077:
            if (r9 == 0) goto L_0x007e
            java.lang.Throwable r8 = r9.f153154a     // Catch:{ all -> 0x007c }
            goto L_0x007f
        L_0x007c:
            r8 = move-exception
            goto L_0x00a0
        L_0x007e:
            r8 = r0
        L_0x007f:
            if (r8 != 0) goto L_0x0089
            if (r6 == 0) goto L_0x0086
            c14.C54633m.m61481a(r7, r0)
        L_0x0086:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        L_0x0089:
            throw r8     // Catch:{ all -> 0x007c }
        L_0x008a:
            c14.C54630l.m61480a(r9)     // Catch:{ all -> 0x007c }
            r0.f166066d = r8     // Catch:{ all -> 0x007c }
            r0.f166067e = r7     // Catch:{ all -> 0x007c }
            r0.f166068f = r6     // Catch:{ all -> 0x007c }
            r0.f166070h = r4     // Catch:{ all -> 0x007c }
            java.lang.Object r9 = r8.emit(r9, r0)     // Catch:{ all -> 0x007c }
            if (r9 != r1) goto L_0x0033
            return r1
        L_0x009c:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x00a0:
            throw r8     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r9 = move-exception
            if (r6 == 0) goto L_0x00a7
            c14.C54633m.m61481a(r7, r8)
        L_0x00a7:
            throw r9
        L_0x00a8:
            d14.n1 r6 = (d14.C58072n1) r6
            java.lang.Throwable r6 = r6.f166092d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58061m.m67219a(d14.g, c14.x, boolean, wx3.d):java.lang.Object");
    }
}
