package rs1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.ResultKt;
import o40.C61926c;
import q40.C12040d;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49100d53;
import te3.C50574np0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderProjectionScreenUIC$requestFeedUrl$2", mo125469f = "FinderProjectionScreenUIC.kt", mo125470l = {200, 758, 765}, mo125471m = "invokeSuspend")
/* renamed from: rs1.p8 */
public final class C48082p8 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f128930d;

    /* renamed from: e */
    public /* synthetic */ Object f128931e;

    /* renamed from: f */
    public final /* synthetic */ C56711j f128932f;

    /* renamed from: g */
    public final /* synthetic */ long f128933g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderProjectionScreenUIC$requestFeedUrl$2$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderProjectionScreenUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: rs1.p8$a */
    public static final class C48083a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f128934d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48083a(C0287e eVar, C15601d dVar) {
            super(2, dVar);
            this.f128934d = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C48083a(this.f128934d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C48083a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0280a aVar = (C0280a) ((C0281b) this.f128934d).f843b;
            StringBuilder sb = new StringBuilder();
            sb.append("requestFeedUrl: fail, errType=");
            C12040d dVar = aVar.f841a;
            Integer num = null;
            sb.append(dVar != null ? new Integer(dVar.f35057e) : null);
            sb.append(", errCode=");
            C12040d dVar2 = aVar.f841a;
            if (dVar2 != null) {
                num = new Integer(dVar2.f35058f);
            }
            sb.append(num);
            Log.m105920e("FinderProjectionScreenUIC", sb.toString());
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderProjectionScreenUIC$requestFeedUrl$2$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderProjectionScreenUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: rs1.p8$b */
    public static final class C48084b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f128935d;

        /* renamed from: e */
        public final /* synthetic */ C0000n0 f128936e;

        /* renamed from: f */
        public final /* synthetic */ long f128937f;

        /* renamed from: g */
        public final /* synthetic */ C56711j f128938g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48084b(C0287e eVar, C15601d dVar, C0000n0 n0Var, long j, C56711j jVar) {
            super(2, dVar);
            this.f128935d = eVar;
            this.f128936e = n0Var;
            this.f128937f = j;
            this.f128938g = jVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C48084b(this.f128935d, dVar, this.f128936e, this.f128937f, this.f128938g);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C48084b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C13598b0 b0Var;
            ResultKt.throwOnFailure(obj);
            LinkedList<C49100d53> linkedList = ((C50574np0) ((C0288f) this.f128935d).f855b).f138711d;
            C87412m.m108593f(linkedList, "resp.object_screen_cast");
            C49100d53 d532 = (C49100d53) C110818d0.m150916N(linkedList);
            if (d532 != null) {
                Log.m105924i("FinderProjectionScreenUIC", "requestFeedUrl: requestId=" + C61926c.m72691p(this.f128937f) + ", resultId=" + C61926c.m72691p(d532.f132134d) + ", videoUrl=" + d532.f132135e + ", expired_time=" + d532.f132136f);
                ((HashMap) ((C36570n) this.f128938g.f162608z).getValue()).put(new Long(d532.f132134d), d532);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105920e("FinderProjectionScreenUIC", "requestFeedUrl: fail, resp is empty");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48082p8(C56711j jVar, long j, C15601d<? super C48082p8> dVar) {
        super(2, dVar);
        this.f128932f = jVar;
        this.f128933g = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C48082p8 p8Var = new C48082p8(this.f128932f, this.f128933g, dVar);
        p8Var.f128931e = obj;
        return p8Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C48082p8) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f128930d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0033
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r0 = r13.f128931e
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00eb
        L_0x0019:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0021:
            java.lang.Object r1 = r13.f128931e
            bi1.e r1 = (bi1.C0287e) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00cf
        L_0x002a:
            java.lang.Object r1 = r13.f128931e
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r14)
        L_0x0031:
            r9 = r1
            goto L_0x00a9
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f128931e
            r1 = r14
            a14.n0 r1 = (a14.C0000n0) r1
            rs1.s8$a r14 = rs1.C13442s8.f38060Q0
            com.tencent.mm.plugin.finder.viewmodel.component.j r6 = r13.f128932f
            androidx.appcompat.app.AppCompatActivity r6 = r6.getActivity()
            rs1.s8 r14 = r14.mo12873f(r6)
            if (r14 == 0) goto L_0x004e
            te3.hj1 r14 = r14.mo12861q3()
            goto L_0x004f
        L_0x004e:
            r14 = r5
        L_0x004f:
            te3.mp0 r6 = new te3.mp0
            r6.<init>()
            long r7 = r13.f128933g
            je1.h2 r9 = je1.C46523h2.f125330a
            r10 = 7340(0x1cac, float:1.0286E-41)
            te3.ig0 r14 = r9.mo71860b(r10, r14)
            r6.f138141d = r14
            zc1.b r14 = zc1.C66785b.f191882e
            java.lang.String r14 = r14.mo90662O5()
            r6.f138142e = r14
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            r14.add(r9)
            r6.f138143f = r14
            ob0.c$b r14 = new ob0.c$b
            r14.<init>()
            r14.f127069d = r10
            java.lang.String r7 = "/cgi-bin/micromsg-bin/findergetscreencast"
            r14.f127068c = r7
            r14.f127066a = r6
            te3.np0 r6 = new te3.np0
            r6.<init>()
            r14.f127067b = r6
            ob0.c r14 = r14.mo72403a()
            java.lang.Class<ht1.s1> r6 = ht1.C8802s1.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.s1 r6 = (ht1.C8802s1) r6
            ob0.b r6 = r6.mo9632ui()
            r6.mo123453j(r14)
            r13.f128931e = r1
            r13.f128930d = r4
            java.lang.Object r14 = bi1.C0283d.m245c(r6, r5, r13, r4, r5)
            if (r14 != r0) goto L_0x0031
            return r0
        L_0x00a9:
            r1 = r14
            bi1.e r1 = (bi1.C0287e) r1
            long r10 = r13.f128933g
            com.tencent.mm.plugin.finder.viewmodel.component.j r12 = r13.f128932f
            boolean r14 = r1 instanceof bi1.C0288f
            if (r14 == 0) goto L_0x00cf
            wx3.f r14 = r1.f854a
            if (r14 != 0) goto L_0x00bc
            wx3.f r14 = r13.getContext()
        L_0x00bc:
            rs1.p8$b r4 = new rs1.p8$b
            r8 = 0
            r6 = r4
            r7 = r1
            r6.<init>(r7, r8, r9, r10, r12)
            r13.f128931e = r1
            r13.f128930d = r3
            java.lang.Object r14 = a14.C53895h.m60469g(r14, r4, r13)
            if (r14 != r0) goto L_0x00cf
            return r0
        L_0x00cf:
            boolean r14 = r1 instanceof bi1.C0281b
            if (r14 == 0) goto L_0x00eb
            wx3.f r14 = r1.f854a
            if (r14 != 0) goto L_0x00db
            wx3.f r14 = r13.getContext()
        L_0x00db:
            rs1.p8$a r3 = new rs1.p8$a
            r3.<init>(r1, r5)
            r13.f128931e = r1
            r13.f128930d = r2
            java.lang.Object r14 = a14.C53895h.m60469g(r14, r3, r13)
            if (r14 != r0) goto L_0x00eb
            return r0
        L_0x00eb:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C48082p8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
