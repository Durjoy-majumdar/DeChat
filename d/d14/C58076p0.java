package d14;

import e14.C58499p;
import fy3.C32228q;
import fy3.C32231t;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: d14.p0 */
public final class C58076p0 implements C45252f<Object> {

    /* renamed from: d */
    public final /* synthetic */ C45252f[] f166101d;

    /* renamed from: e */
    public final /* synthetic */ C32231t f166102e;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", mo125469f = "Zip.kt", mo125470l = {333, 333}, mo125471m = "invokeSuspend")
    /* renamed from: d14.p0$a */
    public static final class C58077a extends C91594j implements C32228q<C45253g<Object>, Object[], C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f166103d;

        /* renamed from: e */
        public /* synthetic */ Object f166104e;

        /* renamed from: f */
        public /* synthetic */ Object f166105f;

        /* renamed from: g */
        public final /* synthetic */ C32231t f166106g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58077a(C15601d dVar, C32231t tVar) {
            super(3, dVar);
            this.f166106g = tVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C58077a aVar = new C58077a((C15601d) obj3, this.f166106g);
            aVar.f166104e = (C45253g) obj;
            aVar.f166105f = (Object[]) obj2;
            return aVar.invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: d14.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r11.f166103d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0020
                if (r1 == r3) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0053
            L_0x0010:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0018:
                java.lang.Object r1 = r11.f166104e
                d14.g r1 = (d14.C45253g) r1
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0047
            L_0x0020:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.f166104e
                r1 = r12
                d14.g r1 = (d14.C45253g) r1
                java.lang.Object r12 = r11.f166105f
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                fy3.t r4 = r11.f166106g
                r5 = 0
                r5 = r12[r5]
                r6 = r12[r3]
                r7 = r12[r2]
                r8 = 3
                r8 = r12[r8]
                r9 = 4
                r9 = r12[r9]
                r11.f166104e = r1
                r11.f166103d = r3
                r10 = r11
                java.lang.Object r12 = r4.mo14122L(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L_0x0047
                return r0
            L_0x0047:
                r3 = 0
                r11.f166104e = r3
                r11.f166103d = r2
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto L_0x0053
                return r0
            L_0x0053:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: d14.C58076p0.C58077a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C58076p0(C45252f[] fVarArr, C32231t tVar) {
        this.f166101d = fVarArr;
        this.f166102e = tVar;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g gVar, C15601d dVar) {
        Object a = C58499p.m67934a(gVar, this.f166101d, C45256s0.f122599d, new C58077a((C15601d) null, this.f166102e), dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }
}
