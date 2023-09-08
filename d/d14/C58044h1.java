package d14;

import c14.C54624g;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import e14.C58491m;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import tx3.C26314b;
import wx3.C15601d;
import wx3.C66217g;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: d14.h1 */
public final class C58044h1 implements C58032e1 {

    /* renamed from: b */
    public final long f166020b;

    /* renamed from: c */
    public final long f166021c;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", mo125469f = "SharingStarted.kt", mo125470l = {178, 180, 182, 183, 185}, mo125471m = "invokeSuspend")
    /* renamed from: d14.h1$a */
    public static final class C58045a extends C91594j implements C32228q<C45253g<? super C58025c1>, Integer, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f166022d;

        /* renamed from: e */
        public /* synthetic */ Object f166023e;

        /* renamed from: f */
        public /* synthetic */ int f166024f;

        /* renamed from: g */
        public final /* synthetic */ C58044h1 f166025g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58045a(C58044h1 h1Var, C15601d<? super C58045a> dVar) {
            super(3, dVar);
            this.f166025g = h1Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj2).intValue();
            C58045a aVar = new C58045a(this.f166025g, (C15601d) obj3);
            aVar.f166023e = (C45253g) obj;
            aVar.f166024f = intValue;
            return aVar.invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: d14.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0093 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r9.f166022d
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x003a
                if (r1 == r6) goto L_0x0036
                if (r1 == r5) goto L_0x002e
                if (r1 == r4) goto L_0x0026
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                goto L_0x0036
            L_0x0016:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x001e:
                java.lang.Object r1 = r9.f166023e
                d14.g r1 = (d14.C45253g) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x0086
            L_0x0026:
                java.lang.Object r1 = r9.f166023e
                d14.g r1 = (d14.C45253g) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x0077
            L_0x002e:
                java.lang.Object r1 = r9.f166023e
                d14.g r1 = (d14.C45253g) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x0060
            L_0x0036:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x0094
            L_0x003a:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.f166023e
                r1 = r10
                d14.g r1 = (d14.C45253g) r1
                int r10 = r9.f166024f
                if (r10 <= 0) goto L_0x0051
                d14.c1 r10 = d14.C58025c1.START
                r9.f166022d = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x0094
                return r0
            L_0x0051:
                d14.h1 r10 = r9.f166025g
                long r6 = r10.f166020b
                r9.f166023e = r1
                r9.f166022d = r5
                java.lang.Object r10 = a14.C53965x0.m60607b(r6, r9)
                if (r10 != r0) goto L_0x0060
                return r0
            L_0x0060:
                d14.h1 r10 = r9.f166025g
                long r5 = r10.f166021c
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L_0x0086
                d14.c1 r10 = d14.C58025c1.STOP
                r9.f166023e = r1
                r9.f166022d = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x0077
                return r0
            L_0x0077:
                d14.h1 r10 = r9.f166025g
                long r4 = r10.f166021c
                r9.f166023e = r1
                r9.f166022d = r3
                java.lang.Object r10 = a14.C53965x0.m60607b(r4, r9)
                if (r10 != r0) goto L_0x0086
                return r0
            L_0x0086:
                d14.c1 r10 = d14.C58025c1.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f166023e = r3
                r9.f166022d = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x0094
                return r0
            L_0x0094:
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: d14.C58044h1.C58045a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", mo125469f = "SharingStarted.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: d14.h1$b */
    public static final class C58046b extends C91594j implements C32227p<C58025c1, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f166026d;

        public C58046b(C15601d<? super C58046b> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C58046b bVar = new C58046b(dVar);
            bVar.f166026d = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C58046b) create((C58025c1) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return Boolean.valueOf(((C58025c1) this.f166026d) != C58025c1.START);
        }
    }

    public C58044h1(long j, long j2) {
        this.f166020b = j;
        this.f166021c = j2;
        boolean z = true;
        if (j >= 0) {
            if (!(j2 < 0 ? false : z)) {
                throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    /* renamed from: a */
    public C45252f<C58025c1> mo82822a(C58050i1<Integer> i1Var) {
        C58045a aVar = new C58045a(this, (C15601d<? super C58045a>) null);
        int i = C58031e0.f165996a;
        return C58042h.m67196e(new C58096y(new C58491m(aVar, i1Var, C66217g.f190253d, -2, C54624g.SUSPEND), new C58046b((C15601d<? super C58046b>) null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C58044h1) {
            C58044h1 h1Var = (C58044h1) obj;
            return this.f166020b == h1Var.f166020b && this.f166021c == h1Var.f166021c;
        }
    }

    public int hashCode() {
        long j = this.f166020b;
        long j2 = this.f166021c;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        C26314b bVar = new C26314b(2);
        if (this.f166020b > 0) {
            bVar.add("stopTimeout=" + this.f166020b + LocaleUtil.MALAY);
        }
        if (this.f166021c < MAlarmHandler.NEXT_FIRE_INTERVAL) {
            bVar.add("replayExpiration=" + this.f166021c + LocaleUtil.MALAY);
        }
        List a = C26236u.m33718a(bVar);
        return "SharingStarted.WhileSubscribed(" + C110818d0.m150921S(a, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null) + ')';
    }
}
