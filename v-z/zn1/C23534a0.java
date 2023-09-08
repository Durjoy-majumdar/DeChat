package zn1;

import a14.C0000n0;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32227p;
import gy3.C87412m;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListPresenter$requestLoadMore$1", mo125469f = "FinderPlayListPresenter.kt", mo125470l = {164, 176, 184}, mo125471m = "invokeSuspend")
/* renamed from: zn1.a0 */
public final class C23534a0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f67487d;

    /* renamed from: e */
    public int f67488e;

    /* renamed from: f */
    public final /* synthetic */ C23541z f67489f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListPresenter$requestLoadMore$1$1$1", mo125469f = "FinderPlayListPresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: zn1.a0$a */
    public static final class C23535a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C23541z f67490d;

        /* renamed from: e */
        public final /* synthetic */ int f67491e;

        /* renamed from: f */
        public final /* synthetic */ List<C16313c> f67492f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23535a(C23541z zVar, int i, List<C16313c> list, C15601d<? super C23535a> dVar) {
            super(2, dVar);
            this.f67490d = zVar;
            this.f67491e = i;
            this.f67492f = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C23535a(this.f67490d, this.f67491e, this.f67492f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C23535a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            WxRecyclerAdapter<?> wxRecyclerAdapter = this.f67490d.f67510d;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemRangeInserted(this.f67491e, this.f67492f.size());
                C23541z zVar = this.f67490d;
                C23538d0 d0Var = zVar.f67509c;
                if (d0Var != null) {
                    d0Var.mo36998d().mo26580f(true);
                    if (!zVar.f67514h) {
                        C23538d0 d0Var2 = zVar.f67509c;
                        if (d0Var2 != null) {
                            d0Var2.mo36998d().mo26642z(true);
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    }
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListPresenter$requestLoadMore$1$2$1", mo125469f = "FinderPlayListPresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: zn1.a0$b */
    public static final class C23536b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C23541z f67493d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23536b(C23541z zVar, C15601d<? super C23536b> dVar) {
            super(2, dVar);
            this.f67493d = zVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C23536b(this.f67493d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C23536b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C23538d0 d0Var = this.f67493d.f67509c;
            if (d0Var != null) {
                d0Var.mo36998d().mo26580f(false);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23534a0(C23541z zVar, C15601d<? super C23534a0> dVar) {
        super(2, dVar);
        this.f67489f = zVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C23534a0(this.f67489f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C23534a0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r11.f67488e
            java.lang.String r2 = "Finder.FinderPlayListPresenter"
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r6) goto L_0x0026
            if (r1 == r5) goto L_0x001f
            if (r1 != r4) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0134
        L_0x0017:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001f:
            java.lang.Object r1 = r11.f67487d
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00e8
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.m168123unboximpl()
            goto L_0x003e
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r12)
            zn1.z r12 = r11.f67489f
            r11.f67488e = r6
            java.lang.Object r12 = zn1.C23541z.m28105a(r12, r11)
            if (r12 != r0) goto L_0x003e
            return r0
        L_0x003e:
            r1 = r12
            zn1.z r12 = r11.f67489f
            boolean r7 = kotlin.Result.m168121isSuccessimpl(r1)
            if (r7 == 0) goto L_0x00e8
            r7 = r1
            te3.hm0 r7 = (te3.C49723hm0) r7
            pe3.b r8 = r7.f134726g
            r12.f67513g = r8
            int r8 = r7.f134725f
            if (r8 != r6) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r6 = 0
        L_0x0054:
            r12.f67514h = r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "set continueFlag "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "request CgiFinderGetCollectionList success, data: "
            r6.append(r8)
            java.util.LinkedList<te3.rh0> r8 = r7.f134723d
            int r8 = r8.size()
            r6.append(r8)
            java.lang.String r8 = ", lastBuffer: "
            r6.append(r8)
            pe3.b r8 = r12.f67513g
            r6.append(r8)
            java.lang.String r8 = ", continueFlage: "
            r6.append(r8)
            boolean r8 = r12.f67514h
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            java.util.LinkedList<te3.rh0> r6 = r7.f134723d
            java.lang.String r7 = "resp.collection_info"
            gy3.C87412m.m108593f(r6, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x00af:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00c9
            java.lang.Object r8 = r6.next()
            te3.rh0 r8 = (te3.C51108rh0) r8
            zn1.c r9 = new zn1.c
            java.lang.String r10 = "info"
            gy3.C87412m.m108593f(r8, r10)
            r9.<init>(r8)
            r7.add(r9)
            goto L_0x00af
        L_0x00c9:
            java.util.ArrayList<zn1.c> r6 = r12.f67508b
            int r6 = r6.size()
            java.util.ArrayList<zn1.c> r8 = r12.f67508b
            r8.addAll(r7)
            a14.h0 r8 = a14.C53872d1.f151117a
            a14.k2 r8 = f14.C58901s.f168555a
            zn1.a0$a r9 = new zn1.a0$a
            r9.<init>(r12, r6, r7, r3)
            r11.f67487d = r1
            r11.f67488e = r5
            java.lang.Object r12 = a14.C53895h.m60469g(r8, r9, r11)
            if (r12 != r0) goto L_0x00e8
            return r0
        L_0x00e8:
            zn1.z r12 = r11.f67489f
            java.lang.Throwable r5 = kotlin.Result.m168117exceptionOrNullimpl(r1)
            if (r5 == 0) goto L_0x0134
            boolean r6 = r5 instanceof q40.C12040d
            if (r6 == 0) goto L_0x0120
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "request CgiFinderGetTopicFeed fail, errType="
            r6.append(r7)
            q40.d r5 = (q40.C12040d) r5
            int r7 = r5.f35057e
            r6.append(r7)
            java.lang.String r7 = " errCode="
            r6.append(r7)
            int r7 = r5.f35058f
            r6.append(r7)
            java.lang.String r7 = " fail:"
            r6.append(r7)
            java.lang.String r5 = r5.f35059g
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
        L_0x0120:
            a14.h0 r2 = a14.C53872d1.f151117a
            a14.k2 r2 = f14.C58901s.f168555a
            zn1.a0$b r5 = new zn1.a0$b
            r5.<init>(r12, r3)
            r11.f67487d = r1
            r11.f67488e = r4
            java.lang.Object r12 = a14.C53895h.m60469g(r2, r5, r11)
            if (r12 != r0) goto L_0x0134
            return r0
        L_0x0134:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.C23534a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
