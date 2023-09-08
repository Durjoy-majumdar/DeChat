package qj1;

import a14.C0000n0;
import android.content.Context;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import cj1.C54795n5;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import nj3.C76912y0;
import ok1.C62042e;
import ol1.C11476b;
import ol1.C11486h;
import q40.C12040d;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C48648a11;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$getRewardWishList$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {314, 354, 361}, mo125471m = "invokeSuspend")
/* renamed from: qj1.li */
public final class C12509li extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f35967d;

    /* renamed from: e */
    public /* synthetic */ Object f35968e;

    /* renamed from: f */
    public final /* synthetic */ C12453ii f35969f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$getRewardWishList$1$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.li$a */
    public static final class C12510a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C12453ii f35970d;

        /* renamed from: qj1.li$a$a */
        public static final class C12511a extends C87413o implements C32227p<Long, Long, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C12453ii f35971d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12511a(C12453ii iiVar) {
                super(2);
                this.f35971d = iiVar;
            }

            public Object invoke(Object obj, Object obj2) {
                long longValue = ((Number) obj).longValue();
                ((Number) obj2).longValue();
                Log.m105924i("FinderLiveWishPanelPlug", "getRewardWishList wecoinBalance: " + longValue);
                ((C54991o) this.f35971d.mo87696x0(C54991o.class)).mo76019q4(longValue);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12510a(C12453ii iiVar, C15601d<? super C12510a> dVar) {
            super(2, dVar);
            this.f35970d = iiVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12510a(this.f35970d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12510a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C54795n5 D0 = this.f35970d.mo14476D0();
            if (D0 == null) {
                return null;
            }
            D0.mo75729d(System.currentTimeMillis(), new C12511a(this.f35970d));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$getRewardWishList$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.li$b */
    public static final class C12512b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f35972d;

        /* renamed from: e */
        public final /* synthetic */ C12453ii f35973e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12512b(C0287e eVar, C15601d dVar, C12453ii iiVar) {
            super(2, dVar);
            this.f35972d = eVar;
            this.f35973e = iiVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12512b(this.f35972d, dVar, this.f35973e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12512b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C12040d dVar = ((C0280a) ((C0281b) this.f35972d).f843b).f841a;
            if (dVar != null) {
                Context context = this.f35973e.f166287d.getContext();
                C76912y0.m92767f(context, "服务异常: " + dVar.f35058f);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$getRewardWishList$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.li$c */
    public static final class C12513c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f35974d;

        /* renamed from: e */
        public final /* synthetic */ C12453ii f35975e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12513c(C0287e eVar, C15601d dVar, C12453ii iiVar) {
            super(2, dVar);
            this.f35974d = eVar;
            this.f35975e = iiVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12513c(this.f35974d, dVar, this.f35975e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12513c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C48648a11 a112 = (C48648a11) ((C0288f) this.f35974d).f855b;
            C62042e eVar = C62042e.f176370a;
            (eVar.mo87027N0() ? (C11476b) ((C36570n) this.f35975e.f35838r).getValue() : (C11486h) ((C36570n) this.f35975e.f35839s).getValue()).mo11445q().postValue(a112);
            C12453ii iiVar = this.f35975e;
            (iiVar.mo11126D() ? eVar.mo87027N0() ? (C11476b) ((C36570n) iiVar.f35838r).getValue() : (C11486h) ((C36570n) iiVar.f35839s).getValue() : iiVar.mo12125b1()).mo3431p();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12509li(C12453ii iiVar, C15601d<? super C12509li> dVar) {
        super(2, dVar);
        this.f35969f = iiVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C12509li liVar = new C12509li(this.f35969f, dVar);
        liVar.f35968e = obj;
        return liVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12509li) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f35967d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x002d
            if (r1 == r4) goto L_0x0029
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r0 = r13.f35968e
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00b4
        L_0x0019:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0021:
            java.lang.Object r1 = r13.f35968e
            bi1.e r1 = (bi1.C0287e) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0096
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0075
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f35968e
            r6 = r14
            a14.n0 r6 = (a14.C0000n0) r6
            ok1.e r14 = ok1.C62042e.f176370a
            boolean r14 = r14.mo87027N0()
            if (r14 != 0) goto L_0x004b
            r7 = 0
            r8 = 0
            qj1.li$a r9 = new qj1.li$a
            qj1.ii r14 = r13.f35969f
            r9.<init>(r14, r5)
            r10 = 3
            r11 = 0
            a14.C53895h.m60464b(r6, r7, r8, r9, r10, r11)
        L_0x004b:
            qj1.ii r14 = r13.f35969f
            it1.c r14 = r14.mo12124a1()
            qj1.ii r1 = r13.f35969f
            android.view.ViewGroup r1 = r1.f166287d
            android.content.Context r7 = r1.getContext()
            java.lang.String r1 = "root.context"
            gy3.C87412m.m108593f(r7, r1)
            r8 = 0
            r9 = 0
            r11 = 6
            r12 = 0
            r6 = r14
            it1.C60625c.m70894l(r6, r7, r8, r9, r11, r12)
            a14.h0 r1 = a14.C53872d1.f151117a
            a14.k2 r1 = f14.C58901s.f168555a
            r13.f35967d = r4
            java.lang.Object r14 = bi1.C0283d.m243a(r14, r1, r13)
            if (r14 != r0) goto L_0x0075
            return r0
        L_0x0075:
            r1 = r14
            bi1.e r1 = (bi1.C0287e) r1
            qj1.ii r14 = r13.f35969f
            boolean r4 = r1 instanceof bi1.C0288f
            if (r4 == 0) goto L_0x0096
            wx3.f r4 = r1.f854a
            if (r4 != 0) goto L_0x0086
            wx3.f r4 = r13.getContext()
        L_0x0086:
            qj1.li$c r6 = new qj1.li$c
            r6.<init>(r1, r5, r14)
            r13.f35968e = r1
            r13.f35967d = r3
            java.lang.Object r14 = a14.C53895h.m60469g(r4, r6, r13)
            if (r14 != r0) goto L_0x0096
            return r0
        L_0x0096:
            qj1.ii r14 = r13.f35969f
            boolean r3 = r1 instanceof bi1.C0281b
            if (r3 == 0) goto L_0x00b4
            wx3.f r3 = r1.f854a
            if (r3 != 0) goto L_0x00a4
            wx3.f r3 = r13.getContext()
        L_0x00a4:
            qj1.li$b r4 = new qj1.li$b
            r4.<init>(r1, r5, r14)
            r13.f35968e = r1
            r13.f35967d = r2
            java.lang.Object r14 = a14.C53895h.m60469g(r3, r4, r13)
            if (r14 != r0) goto L_0x00b4
            return r0
        L_0x00b4:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12509li.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
