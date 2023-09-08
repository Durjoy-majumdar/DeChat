package zg1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import kotlin.ResultKt;
import nk1.C61788m;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C52013xs0;
import wx3.C15601d;
import wx3.C66212f;
import y04.C112354s;
import y04.C15925h;
import yg1.C16006g;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

/* renamed from: zg1.q */
public final class C16184q extends C16006g {

    /* renamed from: c */
    public final String f43374c = "LiveGiftMsgInterceptor";

    /* renamed from: zg1.q$a */
    public static final class C16185a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C55908a f43375d;

        /* renamed from: e */
        public final /* synthetic */ C15925h<C52013xs0> f43376e;

        /* renamed from: f */
        public final /* synthetic */ C16184q f43377f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.msginterceptor.appmsg.LiveGiftMsgInterceptor$dealWithMsgList$1$1", mo125469f = "LiveGiftMsgInterceptor.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: zg1.q$a$a */
        public static final class C16186a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C55908a f43378d;

            /* renamed from: e */
            public final /* synthetic */ C15925h<C52013xs0> f43379e;

            /* renamed from: f */
            public final /* synthetic */ C16184q f43380f;

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.msginterceptor.appmsg.LiveGiftMsgInterceptor$dealWithMsgList$1$1$1", mo125469f = "LiveGiftMsgInterceptor.kt", mo125470l = {57}, mo125471m = "invokeSuspend")
            /* renamed from: zg1.q$a$a$a */
            public static final class C16187a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public Object f43381d;

                /* renamed from: e */
                public int f43382e;

                /* renamed from: f */
                public /* synthetic */ Object f43383f;

                /* renamed from: g */
                public final /* synthetic */ C15925h<C52013xs0> f43384g;

                /* renamed from: h */
                public final /* synthetic */ C16184q f43385h;

                /* renamed from: zg1.q$a$a$a$a */
                public static final class C16188a extends C87413o implements C32226l<C52013xs0, C61788m.C11208b> {

                    /* renamed from: d */
                    public final /* synthetic */ C16184q f43386d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C16188a(C16184q qVar) {
                        super(1);
                        this.f43386d = qVar;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
                        r3 = r3.f134919d;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public java.lang.Object invoke(java.lang.Object r6) {
                        /*
                            r5 = this;
                            te3.xs0 r6 = (te3.C52013xs0) r6
                            java.lang.String r0 = "it"
                            gy3.C87412m.m108594g(r6, r0)
                            zg1.q r0 = r5.f43386d
                            fj1.b r0 = r0.f43066a
                            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                            androidx.lifecycle.i0 r2 = r0.mo71262a(r1)
                            cl1.o r2 = (cl1.C54991o) r2
                            boolean r2 = r2.f154212I2
                            if (r2 == 0) goto L_0x0018
                            goto L_0x0044
                        L_0x0018:
                            ok1.e r2 = ok1.C62042e.f176370a
                            te3.hx0 r3 = r6.f144902d
                            if (r3 == 0) goto L_0x0025
                            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d
                            if (r3 == 0) goto L_0x0025
                            java.lang.String r3 = r3.username
                            goto L_0x0026
                        L_0x0025:
                            r3 = 0
                        L_0x0026:
                            boolean r2 = r2.mo87084h1(r3)
                            if (r2 == 0) goto L_0x0044
                            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
                            cl1.o r0 = (cl1.C54991o) r0
                            r1 = 1
                            r0.f154212I2 = r1
                            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
                            di3.d r0 = di3.C86312j.m106911c(r0)
                            ht1.t1 r0 = (ht1.C60200t1) r0
                            ht1.b4 r0 = r0.Nt0()
                            r0.mo77231I5()
                        L_0x0044:
                            nk1.m$b r0 = new nk1.m$b
                            r0.<init>(r6)
                            zg1.q r1 = r5.f43386d
                            java.lang.String r1 = r1.f43374c
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "filterGiftMsg: giftShowInfo="
                            r2.append(r3)
                            r2.append(r0)
                            java.lang.String r3 = ", client_msg_id="
                            r2.append(r3)
                            java.lang.String r3 = r6.f144904f
                            r2.append(r3)
                            java.lang.String r3 = ", local_client_msg_id="
                            r2.append(r3)
                            java.lang.String r3 = r6.f144915t
                            r2.append(r3)
                            java.lang.String r3 = ", quoted_msg_seq="
                            r2.append(r3)
                            long r3 = r6.f144905g
                            r2.append(r3)
                            java.lang.String r3 = ", seq="
                            r2.append(r3)
                            long r3 = r6.f144913r
                            r2.append(r3)
                            java.lang.String r6 = r2.toString()
                            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: zg1.C16184q.C16185a.C16186a.C16187a.C16188a.invoke(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C16187a(C15925h<? extends C52013xs0> hVar, C16184q qVar, C15601d<? super C16187a> dVar) {
                    super(2, dVar);
                    this.f43384g = hVar;
                    this.f43385h = qVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    C16187a aVar = new C16187a(this.f43384g, this.f43385h, dVar);
                    aVar.f43383f = obj;
                    return aVar;
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C16187a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
                /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
                /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
                /* JADX WARNING: Removed duplicated region for block: B:40:0x009f A[SYNTHETIC] */
                /* JADX WARNING: Removed duplicated region for block: B:44:0x002c A[SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r1 = r9.f43382e
                        r2 = 1
                        if (r1 == 0) goto L_0x001d
                        if (r1 != r2) goto L_0x0015
                        java.lang.Object r1 = r9.f43381d
                        java.util.Iterator r1 = (java.util.Iterator) r1
                        java.lang.Object r3 = r9.f43383f
                        a14.n0 r3 = (a14.C0000n0) r3
                        kotlin.ResultKt.throwOnFailure(r10)
                        goto L_0x002b
                    L_0x0015:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L_0x001d:
                        kotlin.ResultKt.throwOnFailure(r10)
                        java.lang.Object r10 = r9.f43383f
                        a14.n0 r10 = (a14.C0000n0) r10
                        y04.h<te3.xs0> r1 = r9.f43384g
                        java.util.Iterator r1 = r1.iterator()
                        r3 = r10
                    L_0x002b:
                        r10 = r9
                    L_0x002c:
                        boolean r4 = r1.hasNext()
                        if (r4 == 0) goto L_0x00a0
                        java.lang.Object r4 = r1.next()
                        te3.xs0 r4 = (te3.C52013xs0) r4
                        te3.ju0 r5 = new te3.ju0
                        r5.<init>()
                        pe3.b r4 = r4.f144906h
                        r6 = 0
                        if (r4 == 0) goto L_0x0047
                        byte[] r4 = r4.mo123703f()
                        goto L_0x0048
                    L_0x0047:
                        r4 = r6
                    L_0x0048:
                        r7 = 0
                        if (r4 != 0) goto L_0x004d
                    L_0x004b:
                        r5 = r6
                        goto L_0x005f
                    L_0x004d:
                        r5.parseFrom(r4)     // Catch:{ Exception -> 0x0051 }
                        goto L_0x005f
                    L_0x0051:
                        r4 = move-exception
                        java.lang.Object[] r5 = new java.lang.Object[r2]
                        r5[r7] = r4
                        java.lang.String r4 = "safeParser"
                        java.lang.String r8 = ""
                        com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r8, r5)
                        goto L_0x004b
                    L_0x005f:
                        if (r5 == 0) goto L_0x0064
                        te3.p11 r4 = r5.f136332g
                        goto L_0x0065
                    L_0x0064:
                        r4 = r6
                    L_0x0065:
                        if (r4 == 0) goto L_0x002c
                        boolean r5 = a14.C53930o0.m60560g(r3)
                        if (r5 == 0) goto L_0x002c
                        cj1.y1 r5 = cj1.C0639y1.f1510a
                        r10.f43383f = r3
                        r10.f43381d = r1
                        r10.f43382e = r2
                        java.lang.String r5 = r4.f139507d
                        if (r5 == 0) goto L_0x007f
                        int r8 = r5.length()
                        if (r8 != 0) goto L_0x0080
                    L_0x007f:
                        r7 = 1
                    L_0x0080:
                        if (r7 == 0) goto L_0x008d
                        java.lang.String r4 = "Finder.FinderLiveGiftLoader"
                        java.lang.String r5 = "syncGiftResource id is empty"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                        rx3.b0 r4 = rx3.C13598b0.f38549a
                        goto L_0x009d
                    L_0x008d:
                        ig1.d$a r7 = ig1.C8916d.f28211b1
                        ig1.d r4 = r7.mo9727a(r4)
                        cj1.a2 r7 = new cj1.a2
                        r7.<init>(r4, r5, r6)
                        a14.C53895h.m60468f(r6, r7, r2, r6)
                        rx3.b0 r4 = rx3.C13598b0.f38549a
                    L_0x009d:
                        if (r4 != r0) goto L_0x002c
                        return r0
                    L_0x00a0:
                        y04.h<te3.xs0> r0 = r10.f43384g
                        zg1.q$a$a$a$a r1 = new zg1.q$a$a$a$a
                        zg1.q r2 = r10.f43385h
                        r1.<init>(r2)
                        y04.h r0 = y04.C112354s.m153290m(r0, r1)
                        java.util.List r0 = y04.C112354s.m153297t(r0)
                        zg1.q r10 = r10.f43385h
                        fj1.b r10 = r10.f43066a
                        java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                        androidx.lifecycle.i0 r10 = r10.mo71262a(r1)
                        cl1.o r10 = (cl1.C54991o) r10
                        nk1.m r10 = r10.f154316g
                        r10.addAll(r0)
                        rx3.b0 r10 = rx3.C13598b0.f38549a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: zg1.C16184q.C16185a.C16186a.C16187a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16186a(C55908a aVar, C15925h<? extends C52013xs0> hVar, C16184q qVar, C15601d<? super C16186a> dVar) {
                super(2, dVar);
                this.f43378d = aVar;
                this.f43379e = hVar;
                this.f43380f = qVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C16186a(this.f43378d, this.f43379e, this.f43380f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C16186a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C53895h.m60465c(this.f43378d, C53872d1.f151119c, C53934p0.UNDISPATCHED, new C16187a(this.f43379e, this.f43380f, (C15601d<? super C16187a>) null));
                return C13598b0.f38549a;
            }
        }

        public C16185a(C55908a aVar, C15925h<? extends C52013xs0> hVar, C16184q qVar) {
            this.f43375d = aVar;
            this.f43376e = hVar;
            this.f43377f = qVar;
        }

        public final void run() {
            C53895h.m60468f((C66212f) null, new C16186a(this.f43375d, this.f43376e, this.f43377f, (C15601d<? super C16186a>) null), 1, (Object) null);
        }
    }

    /* renamed from: zg1.q$b */
    public static final class C16189b extends C87413o implements C32226l<C52013xs0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C16184q f43387d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16189b(C16184q qVar) {
            super(1);
            this.f43387d = qVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
            r2 = r2.f134919d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                te3.xs0 r6 = (te3.C52013xs0) r6
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r6, r0)
                zg1.q r0 = r5.f43387d
                r0.getClass()
                ok1.e r1 = ok1.C62042e.f176370a
                te3.hx0 r2 = r6.f144914s
                r3 = 0
                if (r2 == 0) goto L_0x001a
                com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f134919d
                if (r2 == 0) goto L_0x001a
                java.lang.String r2 = r2.username
                goto L_0x001b
            L_0x001a:
                r2 = r3
            L_0x001b:
                boolean r1 = r1.mo87084h1(r2)
                java.lang.String r0 = r0.f43374c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "filterGiftMsg"
                r2.append(r4)
                java.lang.String r4 = " isMySelfMsg:"
                r2.append(r4)
                r2.append(r1)
                java.lang.String r4 = ", fromUserName:"
                r2.append(r4)
                te3.hx0 r4 = r6.f144914s
                if (r4 == 0) goto L_0x0043
                com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
                if (r4 == 0) goto L_0x0043
                java.lang.String r4 = r4.username
                goto L_0x0044
            L_0x0043:
                r4 = r3
            L_0x0044:
                r2.append(r4)
                java.lang.String r4 = ", client_msg_id:"
                r2.append(r4)
                java.lang.String r4 = r6.f144904f
                r2.append(r4)
                java.lang.String r4 = ", type:"
                r2.append(r4)
                int r4 = r6.f144903e
                r2.append(r4)
                java.lang.String r4 = ", fromNickName:"
                r2.append(r4)
                te3.hx0 r4 = r6.f144914s
                if (r4 == 0) goto L_0x006b
                com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
                if (r4 == 0) goto L_0x006b
                java.lang.String r4 = r4.nickname
                goto L_0x006c
            L_0x006b:
                r4 = r3
            L_0x006c:
                r2.append(r4)
                java.lang.String r4 = ",toNickName:"
                r2.append(r4)
                te3.hx0 r6 = r6.f144902d
                if (r6 == 0) goto L_0x007e
                com.tencent.mm.protocal.protobuf.FinderContact r6 = r6.f134919d
                if (r6 == 0) goto L_0x007e
                java.lang.String r3 = r6.nickname
            L_0x007e:
                r2.append(r3)
                java.lang.String r6 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
                r6 = r1 ^ 1
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: zg1.C16184q.C16189b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16184q(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        C87412m.m108594g(linkedList, "msgList");
        C15925h<T> h = C112354s.m153285h(C110818d0.m150897A(linkedList), new C16189b(this));
        C55908a aVar = this.f43066a.f123702i;
        ((C119157j) C119157j.f356862d).mo183876g(new C16185a(aVar, h, this), "LiveGiftMsgInterceptor");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20009};
    }
}
