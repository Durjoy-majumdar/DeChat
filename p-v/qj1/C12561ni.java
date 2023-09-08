package qj1;

import a14.C0000n0;
import android.content.Context;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.LinkedList;
import kotlin.ResultKt;
import nj3.C76912y0;
import nl1.C11217a;
import q40.C12040d;
import rx3.C13598b0;
import te3.C48648a11;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$updateRewardWishList$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {289, 358, 365}, mo125471m = "invokeSuspend")
/* renamed from: qj1.ni */
public final class C12561ni extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f36052d;

    /* renamed from: e */
    public int f36053e;

    /* renamed from: f */
    public final /* synthetic */ C12453ii f36054f;

    /* renamed from: g */
    public final /* synthetic */ LinkedList<C11217a> f36055g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$updateRewardWishList$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.ni$a */
    public static final class C12562a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f36056d;

        /* renamed from: e */
        public final /* synthetic */ C12453ii f36057e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12562a(C0287e eVar, C15601d dVar, C12453ii iiVar) {
            super(2, dVar);
            this.f36056d = eVar;
            this.f36057e = iiVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12562a(this.f36056d, dVar, this.f36057e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12562a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C12040d dVar = ((C0280a) ((C0281b) this.f36056d).f843b).f841a;
            if (dVar != null) {
                Context context = this.f36057e.f166287d.getContext();
                C76912y0.m92768g(context, "操作失败: " + dVar.f35058f);
                Log.m105924i("FinderLiveWishPanelPlug", "updateRewardWishList error: " + dVar.f35058f + " msg: " + dVar.f35059g);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$updateRewardWishList$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.ni$b */
    public static final class C12563b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f36058d;

        /* renamed from: e */
        public final /* synthetic */ C12453ii f36059e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12563b(C0287e eVar, C15601d dVar, C12453ii iiVar) {
            super(2, dVar);
            this.f36058d = eVar;
            this.f36059e = iiVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12563b(this.f36058d, dVar, this.f36059e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12563b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C48648a11 a112 = (C48648a11) ((C0288f) this.f36058d).f855b;
            C76912y0.m92768g(this.f36059e.f166287d.getContext(), "已完成");
            this.f36059e.mo12125b1().mo9763a();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12561ni(C12453ii iiVar, LinkedList<C11217a> linkedList, C15601d<? super C12561ni> dVar) {
        super(2, dVar);
        this.f36054f = iiVar;
        this.f36055g = linkedList;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C12561ni(this.f36054f, this.f36055g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12561ni) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r12.f36053e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0031
            if (r2 == r5) goto L_0x002c
            if (r2 == r4) goto L_0x0023
            if (r2 != r3) goto L_0x001b
            java.lang.Object r0 = r12.f36052d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0125
        L_0x001b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0023:
            java.lang.Object r0 = r12.f36052d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0107
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00e6
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r13)
            te3.fa1 r13 = new te3.fa1
            r13.<init>()
            qj1.ii r2 = r12.f36054f
            java.util.LinkedList<nl1.a> r7 = r12.f36055g
            je1.h2 r8 = je1.C46523h2.f125330a
            r9 = 9989(0x2705, float:1.3998E-41)
            te3.ig0 r8 = r8.mo71859a(r9)
            r13.f133380d = r8
            zc1.b r8 = zc1.C66785b.f191882e
            java.lang.String r8 = r8.mo90662O5()
            r13.f133381e = r8
            androidx.lifecycle.i0 r8 = r2.mo87696x0(r0)
            cl1.u r8 = (cl1.C55001u) r8
            long r10 = r8.f154416j
            r13.f133383g = r10
            fj1.b$a r8 = fj1.C45795b.f123697j
            fj1.b r8 = fj1.C45795b.f123698n
            if (r8 == 0) goto L_0x0068
            androidx.lifecycle.i0 r8 = r8.mo71262a(r0)
            cl1.u r8 = (cl1.C55001u) r8
            byte[] r8 = r8.f154417n
            goto L_0x0069
        L_0x0068:
            r8 = r6
        L_0x0069:
            pe3.b r8 = pe3.C89349b.m111674a(r8)
            r13.f133382f = r8
            androidx.lifecycle.i0 r0 = r2.mo87696x0(r0)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r10 = r0.f182392d
            r13.f133384h = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = sx3.C36907w.m41090l(r7, r2)
            r0.<init>(r2)
            java.util.Iterator r2 = r7.iterator()
        L_0x008a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00ab
            java.lang.Object r7 = r2.next()
            nl1.a r7 = (nl1.C11217a) r7
            te3.sp2 r8 = new te3.sp2
            r8.<init>()
            te3.p11 r10 = r7.f33072a
            r8.f141663d = r10
            long r10 = r7.f33073b
            r8.f141664e = r10
            long r10 = r7.f33074c
            r8.f141665f = r10
            r0.add(r8)
            goto L_0x008a
        L_0x00ab:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>(r0)
            r13.f133385i = r2
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            r0.f127069d = r9
            java.lang.String r2 = "/cgi-bin/micromsg-bin/finderliveupdaterewardwishlist"
            r0.f127068c = r2
            r0.f127066a = r13
            te3.a11 r13 = new te3.a11
            r13.<init>()
            r0.f127067b = r13
            ob0.c r13 = r0.mo72403a()
            java.lang.Class<ht1.s1> r0 = ht1.C8802s1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.s1 r0 = (ht1.C8802s1) r0
            ob0.b r0 = r0.mo9632ui()
            r0.mo123453j(r13)
            a14.h0 r13 = a14.C53872d1.f151117a
            a14.k2 r13 = f14.C58901s.f168555a
            r12.f36053e = r5
            java.lang.Object r13 = bi1.C0283d.m243a(r0, r13, r12)
            if (r13 != r1) goto L_0x00e6
            return r1
        L_0x00e6:
            r0 = r13
            bi1.e r0 = (bi1.C0287e) r0
            qj1.ii r13 = r12.f36054f
            boolean r2 = r0 instanceof bi1.C0288f
            if (r2 == 0) goto L_0x0107
            wx3.f r2 = r0.f854a
            if (r2 != 0) goto L_0x00f7
            wx3.f r2 = r12.getContext()
        L_0x00f7:
            qj1.ni$b r5 = new qj1.ni$b
            r5.<init>(r0, r6, r13)
            r12.f36052d = r0
            r12.f36053e = r4
            java.lang.Object r13 = a14.C53895h.m60469g(r2, r5, r12)
            if (r13 != r1) goto L_0x0107
            return r1
        L_0x0107:
            qj1.ii r13 = r12.f36054f
            boolean r2 = r0 instanceof bi1.C0281b
            if (r2 == 0) goto L_0x0125
            wx3.f r2 = r0.f854a
            if (r2 != 0) goto L_0x0115
            wx3.f r2 = r12.getContext()
        L_0x0115:
            qj1.ni$a r4 = new qj1.ni$a
            r4.<init>(r0, r6, r13)
            r12.f36052d = r0
            r12.f36053e = r3
            java.lang.Object r13 = a14.C53895h.m60469g(r2, r4, r12)
            if (r13 != r1) goto L_0x0125
            return r1
        L_0x0125:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12561ni.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
