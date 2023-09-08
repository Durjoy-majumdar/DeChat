package p247u3;

import gy3.C87412m;
import p247u3.C65153r;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: u3.x0 */
public abstract class C65192x0<Key, Value> extends C65153r<Key, Value> {

    /* renamed from: u3.x0$a */
    public static abstract class C65193a<Key, Value> {
    }

    /* renamed from: u3.x0$b */
    public static abstract class C65194b<Key, Value> {
    }

    @C91590f(mo125468c = "androidx.paging.PageKeyedDataSource", mo125469f = "PageKeyedDataSource.kt", mo125470l = {190, 196, 197}, mo125471m = "load$paging_common")
    /* renamed from: u3.x0$c */
    public static final class C65195c extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f187692d;

        /* renamed from: e */
        public int f187693e;

        /* renamed from: f */
        public final /* synthetic */ C65192x0 f187694f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65195c(C65192x0 x0Var, C15601d dVar) {
            super(dVar);
            this.f187694f = x0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f187692d = obj;
            this.f187693e |= Integer.MIN_VALUE;
            return this.f187694f.mo89317b((C65153r.C65158e) null, this);
        }
    }

    public C65192x0() {
        super(C65153r.C65157d.PAGE_KEYED);
    }

    /* renamed from: a */
    public Key mo89316a(Value value) {
        C87412m.m108594g(value, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89317b(p247u3.C65153r.C65158e<Key> r13, wx3.C15601d<? super p247u3.C65153r.C65154a<Value>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof p247u3.C65192x0.C65195c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            u3.x0$c r0 = (p247u3.C65192x0.C65195c) r0
            int r1 = r0.f187693e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f187693e = r1
            goto L_0x0018
        L_0x0013:
            u3.x0$c r0 = new u3.x0$c
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f187692d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f187693e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r5) goto L_0x003a
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00bd
        L_0x002e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0099
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0061
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r14)
            u3.i0 r14 = r13.f187578a
            u3.i0 r2 = p247u3.C65069i0.REFRESH
            if (r14 != r2) goto L_0x0064
            r0.f187693e = r5
            a14.m r13 = new a14.m
            wx3.d r14 = xx3.C66447b.m78392b(r0)
            r13.<init>(r14, r5)
            r13.mo74609p()
            u3.z0 r14 = new u3.z0
            r14.<init>(r13)
            java.lang.Object r14 = r13.mo74608o()
            if (r14 != r1) goto L_0x0061
            return r1
        L_0x0061:
            u3.r$a r14 = (p247u3.C65153r.C65154a) r14
            goto L_0x00bf
        L_0x0064:
            K r2 = r13.f187579b
            if (r2 != 0) goto L_0x0075
            u3.r$a r14 = new u3.r$a
            sx3.f0 r7 = sx3.C64186f0.f181907d
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00bf
        L_0x0075:
            u3.i0 r6 = p247u3.C65069i0.PREPEND
            java.lang.String r7 = "key"
            if (r14 != r6) goto L_0x009c
            gy3.C87412m.m108594g(r2, r7)
            r0.f187693e = r4
            a14.m r13 = new a14.m
            wx3.d r14 = xx3.C66447b.m78392b(r0)
            r13.<init>(r14, r5)
            r13.mo74609p()
            u3.y0 r14 = new u3.y0
            r0 = 0
            r14.<init>(r13, r0)
            java.lang.Object r14 = r13.mo74608o()
            if (r14 != r1) goto L_0x0099
            return r1
        L_0x0099:
            u3.r$a r14 = (p247u3.C65153r.C65154a) r14
            goto L_0x00bf
        L_0x009c:
            u3.i0 r4 = p247u3.C65069i0.APPEND
            if (r14 != r4) goto L_0x00c0
            gy3.C87412m.m108594g(r2, r7)
            r0.f187693e = r3
            a14.m r13 = new a14.m
            wx3.d r14 = xx3.C66447b.m78392b(r0)
            r13.<init>(r14, r5)
            r13.mo74609p()
            u3.y0 r14 = new u3.y0
            r14.<init>(r13, r5)
            java.lang.Object r14 = r13.mo74608o()
            if (r14 != r1) goto L_0x00bd
            return r1
        L_0x00bd:
            u3.r$a r14 = (p247u3.C65153r.C65154a) r14
        L_0x00bf:
            return r14
        L_0x00c0:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported type "
            r0.append(r1)
            u3.i0 r13 = r13.f187578a
            java.lang.String r13 = r13.toString()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p247u3.C65192x0.mo89317b(u3.r$e, wx3.d):java.lang.Object");
    }
}
