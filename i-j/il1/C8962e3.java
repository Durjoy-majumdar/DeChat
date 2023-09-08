package il1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import cl1.C0696x;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import q40.C12040d;
import rx3.C13598b0;
import te3.C49486fy0;
import te3.C49914iy0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveFansListWidget$adjustShowModifyView$1", mo125469f = "FinderLiveFansListWidget.kt", mo125470l = {143, 367, 374}, mo125471m = "invokeSuspend")
/* renamed from: il1.e3 */
public final class C8962e3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f28310d;

    /* renamed from: e */
    public /* synthetic */ Object f28311e;

    /* renamed from: f */
    public final /* synthetic */ C8953d3 f28312f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveFansListWidget$adjustShowModifyView$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveFansListWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: il1.e3$a */
    public static final class C8963a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f28313d;

        /* renamed from: e */
        public final /* synthetic */ C8953d3 f28314e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8963a(C0287e eVar, C15601d dVar, C8953d3 d3Var) {
            super(2, dVar);
            this.f28313d = eVar;
            this.f28314e = d3Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8963a(this.f28313d, dVar, this.f28314e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8963a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0280a aVar = (C0280a) ((C0281b) this.f28313d).f843b;
            StringBuilder sb = new StringBuilder();
            sb.append("finderlivefanclubgetcustomgi errType:");
            C12040d dVar = aVar.f841a;
            Integer num = null;
            sb.append(dVar != null ? new Integer(dVar.f35057e) : null);
            sb.append(", errCode:");
            C12040d dVar2 = aVar.f841a;
            if (dVar2 != null) {
                num = new Integer(dVar2.f35058f);
            }
            sb.append(num);
            Log.m105924i("FinderLiveFansListWidget", sb.toString());
            this.f28314e.f28293w.setText(C0966R.string.dln);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveFansListWidget$adjustShowModifyView$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveFansListWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: il1.e3$b */
    public static final class C8964b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f28315d;

        /* renamed from: e */
        public final /* synthetic */ C8953d3 f28316e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8964b(C0287e eVar, C15601d dVar, C8953d3 d3Var) {
            super(2, dVar);
            this.f28315d = eVar;
            this.f28316e = d3Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8964b(this.f28315d, dVar, this.f28316e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8964b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            List<C49486fy0> list;
            Class cls = C0696x.class;
            ResultKt.throwOnFailure(obj);
            C49914iy0 iy02 = (C49914iy0) ((C0288f) this.f28315d).f855b;
            if (iy02.f135744d.size() > 0) {
                this.f28316e.f28293w.setText(C0966R.string.a2z);
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                C0696x xVar = (C0696x) finderLiveService.mo77630e(cls);
                if (!(xVar == null || (list = xVar.f1646i) == null)) {
                    LinkedList<C49486fy0> linkedList = iy02.f135744d;
                    C87412m.m108593f(linkedList, "it.custom_gifts");
                    ((ArrayList) list).addAll(linkedList);
                }
                C0696x xVar2 = (C0696x) finderLiveService.mo77630e(cls);
                if (xVar2 != null) {
                    xVar2.f1647j = iy02.f135745e;
                }
            } else {
                this.f28316e.f28293w.setText(C0966R.string.dln);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8962e3(C8953d3 d3Var, C15601d<? super C8962e3> dVar) {
        super(2, dVar);
        this.f28312f = d3Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C8962e3 e3Var = new C8962e3(this.f28312f, dVar);
        e3Var.f28311e = obj;
        return e3Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8962e3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f28310d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r5) goto L_0x0029
            if (r1 == r4) goto L_0x0021
            if (r1 != r3) goto L_0x0019
            java.lang.Object r0 = r8.f28311e
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x009b
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            java.lang.Object r1 = r8.f28311e
            bi1.e r1 = (bi1.C0287e) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x007d
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x005c
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f28311e
            a14.n0 r9 = (a14.C0000n0) r9
            te3.hy0 r1 = new te3.hy0
            r1.<init>()
            je1.h2 r6 = je1.C46523h2.f125330a
            r7 = 11250(0x2bf2, float:1.5765E-41)
            te3.ig0 r6 = r6.mo71859a(r7)
            r1.f134954d = r6
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r6 = r6.mo90662O5()
            r1.f134955e = r6
            ob0.b r1 = r1.mo73340b()
            wx3.f r9 = r9.getCoroutineContext()
            r8.f28310d = r5
            java.lang.Object r9 = bi1.C0283d.m243a(r1, r9, r8)
            if (r9 != r0) goto L_0x005c
            return r0
        L_0x005c:
            r1 = r9
            bi1.e r1 = (bi1.C0287e) r1
            il1.d3 r9 = r8.f28312f
            boolean r5 = r1 instanceof bi1.C0288f
            if (r5 == 0) goto L_0x007d
            wx3.f r5 = r1.f854a
            if (r5 != 0) goto L_0x006d
            wx3.f r5 = r8.getContext()
        L_0x006d:
            il1.e3$b r6 = new il1.e3$b
            r6.<init>(r1, r2, r9)
            r8.f28311e = r1
            r8.f28310d = r4
            java.lang.Object r9 = a14.C53895h.m60469g(r5, r6, r8)
            if (r9 != r0) goto L_0x007d
            return r0
        L_0x007d:
            il1.d3 r9 = r8.f28312f
            boolean r4 = r1 instanceof bi1.C0281b
            if (r4 == 0) goto L_0x009b
            wx3.f r4 = r1.f854a
            if (r4 != 0) goto L_0x008b
            wx3.f r4 = r8.getContext()
        L_0x008b:
            il1.e3$a r5 = new il1.e3$a
            r5.<init>(r1, r2, r9)
            r8.f28311e = r1
            r8.f28310d = r3
            java.lang.Object r9 = a14.C53895h.m60469g(r4, r5, r8)
            if (r9 != r0) goto L_0x009b
            return r0
        L_0x009b:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C8962e3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
