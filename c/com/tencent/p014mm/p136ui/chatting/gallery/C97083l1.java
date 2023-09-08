package com.tencent.p014mm.p136ui.chatting.gallery;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import hd0.C98408n0;
import hd0.C98410o0;
import kotlin.ResultKt;
import m03.C99783d;
import mk3.C99910f;
import p206nj.C11171e;
import p682rz.C101488s;
import p910lj.C76701a;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;
import zt3.C119179t;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$tryPlayOriginVideo$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {368}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.ui.chatting.gallery.l1 */
public final class C97083l1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f284799d;

    /* renamed from: e */
    public Object f284800e;

    /* renamed from: f */
    public int f284801f;

    /* renamed from: g */
    public final /* synthetic */ C72963f4 f284802g;

    /* renamed from: h */
    public final /* synthetic */ C97136u0 f284803h;

    /* renamed from: i */
    public final /* synthetic */ int f284804i;

    /* renamed from: j */
    public final /* synthetic */ C99783d f284805j;

    /* renamed from: n */
    public final /* synthetic */ C97087m1 f284806n;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$tryPlayOriginVideo$1$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {388}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.ui.chatting.gallery.l1$a */
    public static final class C97084a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f284807d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f284808e;

        /* renamed from: f */
        public final /* synthetic */ C97136u0 f284809f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C98408n0> f284810g;

        /* renamed from: h */
        public final /* synthetic */ C8477a0 f284811h;

        /* renamed from: i */
        public final /* synthetic */ C99783d f284812i;

        @C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$tryPlayOriginVideo$1$1$1$1$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.ui.chatting.gallery.l1$a$a */
        public static final class C97085a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C8477a0 f284813d;

            /* renamed from: e */
            public final /* synthetic */ ThumbPlayerViewContainer f284814e;

            /* renamed from: f */
            public final /* synthetic */ C99783d f284815f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97085a(C8477a0 a0Var, ThumbPlayerViewContainer thumbPlayerViewContainer, C99783d dVar, C15601d<? super C97085a> dVar2) {
                super(2, dVar2);
                this.f284813d = a0Var;
                this.f284814e = thumbPlayerViewContainer;
                this.f284815f = dVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97085a(this.f284813d, this.f284814e, this.f284815f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97085a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                if (this.f284813d.f27482d) {
                    this.f284814e.mo134547b();
                } else {
                    this.f284814e.mo134548f();
                }
                if (C11171e.m11044a(23)) {
                    this.f284815f.setAutoFixRotation(true);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97084a(C72963f4 f4Var, C97136u0 u0Var, C8479f0<C98408n0> f0Var, C8477a0 a0Var, C99783d dVar, C15601d<? super C97084a> dVar2) {
            super(2, dVar2);
            this.f284808e = f4Var;
            this.f284809f = u0Var;
            this.f284810g = f0Var;
            this.f284811h = a0Var;
            this.f284812i = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C97084a(this.f284808e, this.f284809f, this.f284810g, this.f284811h, this.f284812i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C97084a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00da, code lost:
            if ((r10 != null && r10.f301463c == 7) != false) goto L_0x00dc;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r9.f284807d
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ Exception -> 0x000f }
                goto L_0x0104
            L_0x000f:
                r10 = move-exception
                goto L_0x00fb
            L_0x0012:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x001a:
                kotlin.ResultKt.throwOnFailure(r10)
                com.tencent.mm.storage.f4 r10 = r9.f284808e
                hd0.n0 r10 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r10)
                if (r10 == 0) goto L_0x0104
                com.tencent.mm.ui.chatting.gallery.u0 r1 = r9.f284809f
                gy3.f0<hd0.n0> r4 = r9.f284810g
                gy3.a0 r5 = r9.f284811h
                m03.d r6 = r9.f284812i
                java.lang.String r7 = r10.f288546N
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 == 0) goto L_0x0038
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            L_0x0038:
                java.lang.String r7 = r10.mo137700d()
                r1.f285034r = r7
                java.lang.Class<rz.u> r1 = p682rz.C101491u.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                rz.u r1 = (p682rz.C101491u) r1
                java.lang.String r10 = r10.f288546N
                hd0.n0 r10 = r1.mo140806Zd(r10)
                r4.f27484d = r10
                if (r10 != 0) goto L_0x0053
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            L_0x0053:
                java.lang.Class<rz.s> r10 = p682rz.C101488s.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                rz.s r10 = (p682rz.C101488s) r10
                rz.t r10 = r10.Kj0()
                T r1 = r4.f27484d
                hd0.n0 r1 = (hd0.C98408n0) r1
                r7 = 0
                if (r1 == 0) goto L_0x006b
                java.lang.String r1 = r1.mo137700d()
                goto L_0x006c
            L_0x006b:
                r1 = r7
            L_0x006c:
                hd0.o0 r10 = (hd0.C98410o0) r10
                java.lang.String r10 = r10.mo137728q(r1)
                T r1 = r4.f27484d
                hd0.n0 r1 = (hd0.C98408n0) r1
                if (r1 == 0) goto L_0x0080
                int r1 = r1.f288562i
                r4 = 199(0xc7, float:2.79E-43)
                if (r1 != r4) goto L_0x0080
                r1 = 1
                goto L_0x0081
            L_0x0080:
                r1 = 0
            L_0x0081:
                if (r1 == 0) goto L_0x008b
                boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
                if (r1 == 0) goto L_0x008b
                r1 = 1
                goto L_0x008c
            L_0x008b:
                r1 = 0
            L_0x008c:
                r5.f27482d = r1
                boolean r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.f285023E
                r1 = 24
                boolean r1 = p206nj.C11171e.m11046c(r1)
                if (r1 == 0) goto L_0x00ac
                java.lang.Class<h81.h> r1 = h81.C32735h.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                h81.h r1 = (h81.C32735h) r1
                h81.h$c r4 = h81.C32735h.C32737c.clicfg_c2c_video_play_use_surfaceview_enable
                bp3.f r8 = bp3.C104160f.RepairerConfig_Media_PlayUseSurfaceView_Int
                int r1 = r1.dl0(r4, r8, r3)
                if (r1 != r2) goto L_0x00ac
                r1 = 1
                goto L_0x00ad
            L_0x00ac:
                r1 = 0
            L_0x00ad:
                if (r1 == 0) goto L_0x0104
                boolean r1 = r5.f27482d
                if (r1 == 0) goto L_0x0104
                gy3.a0 r1 = new gy3.a0
                r1.<init>()
                w80.i r4 = w80.C111750i.f334661a     // Catch:{ Exception -> 0x000f }
                java.lang.String r5 = "videoFullPath"
                gy3.C87412m.m108593f(r10, r5)     // Catch:{ Exception -> 0x000f }
                w80.i$a r10 = r4.mo163488a(r10)     // Catch:{ Exception -> 0x000f }
                if (r10 == 0) goto L_0x00cd
                int r4 = r10.f301463c     // Catch:{ Exception -> 0x000f }
                r5 = 6
                if (r4 != r5) goto L_0x00cd
                r4 = 1
                goto L_0x00ce
            L_0x00cd:
                r4 = 0
            L_0x00ce:
                if (r4 != 0) goto L_0x00dc
                if (r10 == 0) goto L_0x00d9
                int r10 = r10.f301463c     // Catch:{ Exception -> 0x000f }
                r4 = 7
                if (r10 != r4) goto L_0x00d9
                r10 = 1
                goto L_0x00da
            L_0x00d9:
                r10 = 0
            L_0x00da:
                if (r10 == 0) goto L_0x00de
            L_0x00dc:
                r1.f27482d = r2     // Catch:{ Exception -> 0x000f }
            L_0x00de:
                boolean r10 = r6 instanceof com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerViewContainer     // Catch:{ Exception -> 0x000f }
                if (r10 == 0) goto L_0x00e6
                r10 = r6
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer r10 = (com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerViewContainer) r10     // Catch:{ Exception -> 0x000f }
                goto L_0x00e7
            L_0x00e6:
                r10 = r7
            L_0x00e7:
                if (r10 == 0) goto L_0x0104
                a14.h0 r4 = a14.C53872d1.f151117a     // Catch:{ Exception -> 0x000f }
                a14.k2 r4 = f14.C58901s.f168555a     // Catch:{ Exception -> 0x000f }
                com.tencent.mm.ui.chatting.gallery.l1$a$a r5 = new com.tencent.mm.ui.chatting.gallery.l1$a$a     // Catch:{ Exception -> 0x000f }
                r5.<init>(r1, r10, r6, r7)     // Catch:{ Exception -> 0x000f }
                r9.f284807d = r2     // Catch:{ Exception -> 0x000f }
                java.lang.Object r10 = a14.C53895h.m60469g(r4, r5, r9)     // Catch:{ Exception -> 0x000f }
                if (r10 != r0) goto L_0x0104
                return r0
            L_0x00fb:
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r1 = "MicroMsg.Imagegallery.handler.video.tp"
                java.lang.String r2 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r2, r0)
            L_0x0104:
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97083l1.C97084a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97083l1(C72963f4 f4Var, C97136u0 u0Var, int i, C99783d dVar, C97087m1 m1Var, C15601d<? super C97083l1> dVar2) {
        super(2, dVar2);
        this.f284802g = f4Var;
        this.f284803h = u0Var;
        this.f284804i = i;
        this.f284805j = dVar;
        this.f284806n = m1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C97083l1(this.f284802g, this.f284803h, this.f284804i, this.f284805j, this.f284806n, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C97083l1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C8479f0 f0Var;
        C8477a0 a0Var;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f284801f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            f0Var = new C8479f0();
            C8477a0 a0Var2 = new C8477a0();
            C53896h0 h0Var = C53872d1.f151119c;
            C97084a aVar2 = new C97084a(this.f284802g, this.f284803h, f0Var, a0Var2, this.f284805j, (C15601d<? super C97084a>) null);
            this.f284799d = f0Var;
            this.f284800e = a0Var2;
            this.f284801f = 1;
            if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
                return aVar;
            }
            a0Var = a0Var2;
        } else if (i == 1) {
            a0Var = (C8477a0) this.f284800e;
            f0Var = (C8479f0) this.f284799d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.f284802g.mo100983V3() || !this.f284802g.mo100972K3()) {
            T t = f0Var.f27484d;
            if (t == null || !a0Var.f27482d) {
                C97136u0 u0Var = this.f284803h;
                C72963f4 f4Var = this.f284802g;
                int i2 = this.f284804i;
                boolean z = C97136u0.f285023E;
                u0Var.mo136047J(f4Var, i2);
                return C13598b0.f38549a;
            }
            C98408n0 n0Var = (C98408n0) t;
            C97136u0 u0Var2 = this.f284803h;
            C72963f4 f4Var2 = this.f284802g;
            int i3 = this.f284804i;
            C99783d dVar = this.f284805j;
            C97087m1 m1Var = this.f284806n;
            if (n0Var.f288562i == 143) {
                boolean z2 = C97136u0.f285023E;
                u0Var2.mo136047J(f4Var2, i3);
                return C13598b0.f38549a;
            }
            u0Var2.f284697e = new C99910f(f4Var2, f4Var2.mo108765s2(), true, 3);
            String s2 = f4Var2.mo108765s2();
            C87412m.m108593f(s2, "msg.imgPath");
            if (!u0Var2.f285040x && !u0Var2.mo136045G(u0Var2.f285035s.get(s2))) {
                Log.m105928w("MicroMsg.Imagegallery.handler.video.tp", "show tool bar error.");
            }
            String q = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137728q(n0Var.mo137700d());
            if (C86013q1.m106451l(q) < ((long) n0Var.f288559f)) {
                u0Var2.mo136047J(f4Var2, i3);
                return C13598b0.f38549a;
            }
            dVar.setMute(u0Var2.f284638d.f284714g.mo135773i8(f4Var2.getMsgId()) == 3);
            if (!u0Var2.f285039w || Util.isNullOrNil(q) || !q.equals(dVar.getVideoPath()) || !dVar.mo24843h()) {
                dVar.stop();
                dVar.setVideoPath(q);
            } else {
                dVar.start();
                C97136u0.m125066F(u0Var2, m1Var);
            }
            ImageGalleryUI imageGalleryUI = u0Var2.f284638d.f284714g;
            imageGalleryUI.f284368K.setVisibility(0);
            imageGalleryUI.f284368K.setTextColor(-1);
            C119179t tVar = C119157j.f356862d;
            ImageGalleryUI$$c imageGalleryUI$$c = new ImageGalleryUI$$c(imageGalleryUI);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(imageGalleryUI$$c, 2000, false);
            C99910f fVar = u0Var2.f284697e;
            if (fVar != null) {
                fVar.f292759e = System.currentTimeMillis();
            }
            u0Var2.f285039w = true;
            return C13598b0.f38549a;
        }
        C76701a.makeText((Context) this.f284803h.f284638d.f284714g, (int) C0966R.string.kab, 0).show();
        return C13598b0.f38549a;
    }
}
