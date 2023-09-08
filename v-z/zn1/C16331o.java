package zn1;

import a14.C0000n0;
import cm1.C0720c3;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32227p;
import gy3.C87412m;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawerPresenter$requestLoadMore$1", mo125469f = "FinderPlayListDrawerPresenter.kt", mo125470l = {281, 300, 315}, mo125471m = "invokeSuspend")
/* renamed from: zn1.o */
public final class C16331o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f43667d;

    /* renamed from: e */
    public int f43668e;

    /* renamed from: f */
    public final /* synthetic */ boolean f43669f;

    /* renamed from: g */
    public final /* synthetic */ C16323l f43670g;

    /* renamed from: h */
    public final /* synthetic */ C0720c3 f43671h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawerPresenter$requestLoadMore$1$1$1", mo125469f = "FinderPlayListDrawerPresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: zn1.o$a */
    public static final class C16332a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ boolean f43672d;

        /* renamed from: e */
        public final /* synthetic */ C16323l f43673e;

        /* renamed from: f */
        public final /* synthetic */ List<C16340u> f43674f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16332a(boolean z, C16323l lVar, List<C16340u> list, C15601d<? super C16332a> dVar) {
            super(2, dVar);
            this.f43672d = z;
            this.f43673e = lVar;
            this.f43674f = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C16332a(this.f43672d, this.f43673e, this.f43674f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C16332a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (this.f43672d) {
                int size = this.f43673e.f43643b.f43693a.size();
                this.f43673e.f43643b.f43693a.addAll(this.f43674f);
                WxRecyclerAdapter<?> wxRecyclerAdapter = this.f43673e.f43647f;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyItemRangeInserted(size, this.f43674f.size());
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            } else {
                this.f43673e.f43643b.f43693a.addAll(0, this.f43674f);
                WxRecyclerAdapter<?> wxRecyclerAdapter2 = this.f43673e.f43647f;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyDataSetChanged();
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
            this.f43673e.mo14812d(this.f43672d, this.f43674f.size());
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawerPresenter$requestLoadMore$1$2$1", mo125469f = "FinderPlayListDrawerPresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: zn1.o$b */
    public static final class C16333b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C16323l f43675d;

        /* renamed from: e */
        public final /* synthetic */ boolean f43676e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16333b(C16323l lVar, boolean z, C15601d<? super C16333b> dVar) {
            super(2, dVar);
            this.f43675d = lVar;
            this.f43676e = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C16333b(this.f43675d, this.f43676e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C16333b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f43675d.mo14812d(this.f43676e, 0);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16331o(boolean z, C16323l lVar, C0720c3 c3Var, C15601d<? super C16331o> dVar) {
        super(2, dVar);
        this.f43669f = z;
        this.f43670g = lVar;
        this.f43671h = c3Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C16331o(this.f43669f, this.f43670g, this.f43671h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C16331o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f43668e
            r2 = 0
            r3 = 3
            r4 = 2
            java.lang.String r5 = "Finder.FinderPlayListDrawerPresenter"
            r6 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r6) goto L_0x0026
            if (r1 == r4) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0161
        L_0x0017:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001f:
            java.lang.Object r1 = r13.f43667d
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0113
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.m168123unboximpl()
            goto L_0x0056
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "request CgiFinderGetTopicFeed isFooter: "
            r14.append(r1)
            boolean r1 = r13.f43669f
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r14)
            zn1.l r14 = r13.f43670g
            cm1.c3 r1 = r13.f43671h
            r13.f43668e = r6
            java.lang.Object r14 = zn1.C16323l.m15171a(r14, r1, r13)
            if (r14 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r1 = r14
            zn1.l r14 = r13.f43670g
            boolean r7 = r13.f43669f
            boolean r8 = kotlin.Result.m168121isSuccessimpl(r1)
            if (r8 == 0) goto L_0x0113
            r8 = r1
            te3.xp0 r8 = (te3.C52002xp0) r8
            pe3.b r9 = r8.f144786e
            r14.f43649h = r9
            r9 = 0
            if (r7 == 0) goto L_0x0075
            int r10 = r8.f144795q
            if (r10 != r6) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r6 = 0
        L_0x0071:
            r14.mo14816h(r6)
            goto L_0x007e
        L_0x0075:
            int r10 = r8.f144794p
            if (r10 != r6) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r6 = 0
        L_0x007b:
            r14.mo14817i(r6)
        L_0x007e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "request CgiFinderGetTopicFeed success, isFooter: "
            r6.append(r10)
            r6.append(r7)
            java.lang.String r10 = ", data: "
            r6.append(r10)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r10 = r8.f144785d
            int r10 = r10.size()
            r6.append(r10)
            java.lang.String r10 = "lastBuffer: "
            r6.append(r10)
            pe3.b r10 = r14.f43649h
            r6.append(r10)
            java.lang.String r10 = ", downContinue: "
            r6.append(r10)
            boolean r10 = r14.f43652k
            r6.append(r10)
            java.lang.String r10 = ", upContinue: "
            r6.append(r10)
            boolean r10 = r14.f43651j
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r8.f144785d
            java.lang.String r8 = "resp.`object`"
            gy3.C87412m.m108593f(r6, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r10 = 10
            int r10 = sx3.C36907w.m41090l(r6, r10)
            r8.<init>(r10)
            java.util.Iterator r6 = r6.iterator()
        L_0x00d4:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x00ff
            java.lang.Object r10 = r6.next()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r10
            com.tencent.mm.plugin.finder.storage.FinderItem$a r11 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            java.lang.String r12 = "feed"
            gy3.C87412m.m108593f(r10, r12)
            r12 = 64
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r11.mo79056a(r10, r12)
            zn1.u r11 = new zn1.u
            r11.<init>(r10)
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r14.mo14813e()
            r10.getId()
            r11.f43691d = r9
            r8.add(r11)
            goto L_0x00d4
        L_0x00ff:
            a14.h0 r6 = a14.C53872d1.f151117a
            a14.k2 r6 = f14.C58901s.f168555a
            zn1.o$a r9 = new zn1.o$a
            r9.<init>(r7, r14, r8, r2)
            r13.f43667d = r1
            r13.f43668e = r4
            java.lang.Object r14 = a14.C53895h.m60469g(r6, r9, r13)
            if (r14 != r0) goto L_0x0113
            return r0
        L_0x0113:
            zn1.l r14 = r13.f43670g
            boolean r4 = r13.f43669f
            java.lang.Throwable r6 = kotlin.Result.m168117exceptionOrNullimpl(r1)
            if (r6 == 0) goto L_0x0161
            boolean r7 = r6 instanceof q40.C12040d
            if (r7 == 0) goto L_0x014d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "request CgiFinderGetTopicFeed fail, errType="
            r7.append(r8)
            q40.d r6 = (q40.C12040d) r6
            int r8 = r6.f35057e
            r7.append(r8)
            java.lang.String r8 = " errCode="
            r7.append(r8)
            int r8 = r6.f35058f
            r7.append(r8)
            java.lang.String r8 = " fail:"
            r7.append(r8)
            java.lang.String r6 = r6.f35059g
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
        L_0x014d:
            a14.h0 r5 = a14.C53872d1.f151117a
            a14.k2 r5 = f14.C58901s.f168555a
            zn1.o$b r6 = new zn1.o$b
            r6.<init>(r14, r4, r2)
            r13.f43667d = r1
            r13.f43668e = r3
            java.lang.Object r14 = a14.C53895h.m60469g(r5, r6, r13)
            if (r14 != r0) goto L_0x0161
            return r0
        L_0x0161:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.C16331o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
