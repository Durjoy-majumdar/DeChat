package kh1;

import a14.C0000n0;
import a14.C53916l;
import a14.C53965x0;
import android.graphics.Bitmap;
import fy3.C32227p;
import gy3.C8477a0;
import kotlin.Result;
import kotlin.ResultKt;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import wx3.C15601d;
import x60.C102564a;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.ShareEntranceController$showEntrance$1", mo125469f = "ShareEntranceController.kt", mo125470l = {272, 273, 288}, mo125471m = "invokeSuspend")
/* renamed from: kh1.g */
public final class C10089g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f30874d;

    /* renamed from: e */
    public /* synthetic */ Object f30875e;

    /* renamed from: f */
    public final /* synthetic */ C10086f f30876f;

    /* renamed from: g */
    public final /* synthetic */ Bitmap f30877g;

    /* renamed from: h */
    public final /* synthetic */ Bitmap f30878h;

    /* renamed from: i */
    public final /* synthetic */ Bitmap f30879i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.ShareEntranceController$showEntrance$1$finallyBitmap$1", mo125469f = "ShareEntranceController.kt", mo125470l = {307}, mo125471m = "invokeSuspend")
    /* renamed from: kh1.g$a */
    public static final class C10090a extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public Object f30880d;

        /* renamed from: e */
        public int f30881e;

        /* renamed from: f */
        public final /* synthetic */ C10086f f30882f;

        /* renamed from: g */
        public final /* synthetic */ Bitmap f30883g;

        /* renamed from: kh1.g$a$a */
        public static final class C10091a<T, R> implements C64207e {

            /* renamed from: a */
            public final /* synthetic */ C8477a0 f30884a;

            /* renamed from: b */
            public final /* synthetic */ C53916l<Bitmap> f30885b;

            public C10091a(C8477a0 a0Var, C53916l<? super Bitmap> lVar) {
                this.f30884a = a0Var;
                this.f30885b = lVar;
            }

            /* renamed from: a */
            public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                C8477a0 a0Var = this.f30884a;
                if (!a0Var.f27482d) {
                    a0Var.f27482d = true;
                    this.f30885b.resumeWith(Result.m168114constructorimpl(bitmap));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10090a(C10086f fVar, Bitmap bitmap, C15601d<? super C10090a> dVar) {
            super(2, dVar);
            this.f30882f = fVar;
            this.f30883g = bitmap;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10090a(this.f30882f, this.f30883g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10090a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
            r2 = (r2 = r2.objectDesc).liveDesc;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r8.f30881e
                r3 = 1
                if (r2 == 0) goto L_0x001c
                if (r2 != r3) goto L_0x0014
                java.lang.Object r0 = r8.f30880d
                java.lang.String r0 = (java.lang.String) r0
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x00d9
            L_0x0014:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001c:
                kotlin.ResultKt.throwOnFailure(r9)
                kh1.f r9 = r8.f30882f
                androidx.lifecycle.i0 r2 = r9.business(r0)
                cl1.o r2 = (cl1.C54991o) r2
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f154341n
                r4 = 0
                if (r2 == 0) goto L_0x0037
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x0037
                te3.px0 r2 = r2.liveDesc
                if (r2 == 0) goto L_0x0037
                java.lang.String r2 = r2.f184911d
                goto L_0x0038
            L_0x0037:
                r2 = r4
            L_0x0038:
                r5 = 0
                if (r2 == 0) goto L_0x0044
                int r6 = r2.length()
                if (r6 != 0) goto L_0x0042
                goto L_0x0044
            L_0x0042:
                r6 = 0
                goto L_0x0045
            L_0x0044:
                r6 = 1
            L_0x0045:
                java.lang.String r7 = ""
                if (r6 == 0) goto L_0x0068
                androidx.lifecycle.i0 r2 = r9.business(r0)
                cl1.o r2 = (cl1.C54991o) r2
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f154341n
                if (r2 == 0) goto L_0x0067
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x0067
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r2 = r2.media
                if (r2 == 0) goto L_0x0067
                java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
                com.tencent.mm.protocal.protobuf.FinderMedia r2 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r2
                if (r2 == 0) goto L_0x0067
                java.lang.String r2 = r2.url
                if (r2 != 0) goto L_0x0068
            L_0x0067:
                r2 = r7
            L_0x0068:
                androidx.lifecycle.i0 r9 = r9.business(r0)
                cl1.o r9 = (cl1.C54991o) r9
                java.lang.String r9 = r9.mo76010l3(r2)
                if (r9 != 0) goto L_0x0075
                goto L_0x0076
            L_0x0075:
                r7 = r9
            L_0x0076:
                kh1.f r9 = r8.f30882f
                androidx.lifecycle.i0 r9 = r9.business(r0)
                cl1.o r9 = (cl1.C54991o) r9
                boolean r9 = r9.mo75960G3()
                if (r9 != 0) goto L_0x0087
                android.graphics.Bitmap r9 = r8.f30883g
                return r9
            L_0x0087:
                int r9 = r7.length()
                if (r9 != 0) goto L_0x008e
                r5 = 1
            L_0x008e:
                if (r5 == 0) goto L_0x0091
                return r4
            L_0x0091:
                r8.f30880d = r7
                r8.f30881e = r3
                a14.m r9 = new a14.m
                wx3.d r0 = xx3.C66447b.m78392b(r8)
                r9.<init>(r0, r3)
                r9.mo74609p()
                gy3.a0 r0 = new gy3.a0
                r0.<init>()
                bl3.r r2 = bl3.C39818r.f106831a
                java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
                bl3.r$a r2 = r2.mo62446e(r3)
                java.lang.Class<pl1.s0> r3 = pl1.C11990s0.class
                bl3.c r2 = r2.mo62447c(r3)
                pl1.s0 r2 = (pl1.C11990s0) r2
                k60.d r2 = r2.mo11871f2()
                pl1.n0 r3 = new pl1.n0
                up1.y r4 = up1.C27696y.THUMB_IMAGE
                r3.<init>(r7, r4)
                l60.b r2 = r2.mo85955a(r3)
                kh1.g$a$a r3 = new kh1.g$a$a
                r3.<init>(r0, r9)
                r2.getClass()
                r2.f291320d = r3
                r2.mo85951a()
                java.lang.Object r9 = r9.mo74608o()
                if (r9 != r1) goto L_0x00d9
                return r1
            L_0x00d9:
                android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kh1.C10089g.C10090a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.ShareEntranceController$showEntrance$1$justWait$1", mo125469f = "ShareEntranceController.kt", mo125470l = {271}, mo125471m = "invokeSuspend")
    /* renamed from: kh1.g$b */
    public static final class C10092b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f30886d;

        public C10092b(C15601d<? super C10092b> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10092b(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C10092b((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f30886d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f30886d = 1;
                if (C53965x0.m60607b(350, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10089g(C10086f fVar, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, C15601d<? super C10089g> dVar) {
        super(2, dVar);
        this.f30876f = fVar;
        this.f30877g = bitmap;
        this.f30878h = bitmap2;
        this.f30879i = bitmap3;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C10089g gVar = new C10089g(this.f30876f, this.f30877g, this.f30878h, this.f30879i, dVar);
        gVar.f30875e = obj;
        return gVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10089g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f30874d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x002e
            if (r1 == r4) goto L_0x0026
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0110
        L_0x0015:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001d:
            java.lang.Object r1 = r13.f30875e
            kh1.f r1 = (kh1.C10086f) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00a0
        L_0x0026:
            java.lang.Object r1 = r13.f30875e
            a14.u0 r1 = (a14.C53953u0) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0090
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f30875e
            a14.n0 r14 = (a14.C0000n0) r14
            kh1.f r1 = r13.f30876f
            boolean r1 = r1.mo9310g3()
            if (r1 != 0) goto L_0x0068
            kh1.f r1 = r13.f30876f
            android.widget.RelativeLayout r1 = r1.f30866j
            if (r1 == 0) goto L_0x0068
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L_0x0068
            kh1.f r6 = r13.f30876f
            android.widget.RelativeLayout r6 = r6.f30866j
            if (r6 == 0) goto L_0x0068
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            if (r6 == 0) goto L_0x0068
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x0068
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r1)
            r8 = 70
            int r1 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r1, r8)
            int r7 = r7 + r1
            r6.bottomMargin = r7
        L_0x0068:
            r7 = 0
            r8 = 0
            kh1.g$a r9 = new kh1.g$a
            kh1.f r1 = r13.f30876f
            android.graphics.Bitmap r6 = r13.f30879i
            r9.<init>(r1, r6, r5)
            r10 = 3
            r11 = 0
            r6 = r14
            a14.u0 r1 = a14.C53895h.m60464b(r6, r7, r8, r9, r10, r11)
            kh1.g$b r9 = new kh1.g$b
            r9.<init>(r5)
            a14.u0 r14 = a14.C53895h.m60464b(r6, r7, r8, r9, r10, r11)
            r13.f30875e = r1
            r13.f30874d = r4
            a14.v0 r14 = (a14.C53957v0) r14
            java.lang.Object r14 = r14.mo74549z(r13)
            if (r14 != r0) goto L_0x0090
            return r0
        L_0x0090:
            kh1.f r14 = r13.f30876f
            r13.f30875e = r14
            r13.f30874d = r3
            java.lang.Object r1 = r1.mo74634A(r13)
            if (r1 != r0) goto L_0x009d
            return r0
        L_0x009d:
            r12 = r1
            r1 = r14
            r14 = r12
        L_0x00a0:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            r1.f30867n = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "#showEntrance frameBitmap.width="
            r14.append(r1)
            kh1.f r1 = r13.f30876f
            android.graphics.Bitmap r1 = r1.f30867n
            if (r1 == 0) goto L_0x00be
            int r1 = r1.getWidth()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            goto L_0x00bf
        L_0x00be:
            r3 = r5
        L_0x00bf:
            r14.append(r3)
            java.lang.String r1 = " height="
            r14.append(r1)
            kh1.f r1 = r13.f30876f
            android.graphics.Bitmap r1 = r1.f30867n
            if (r1 == 0) goto L_0x00d7
            int r1 = r1.getHeight()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            goto L_0x00d8
        L_0x00d7:
            r3 = r5
        L_0x00d8:
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            java.lang.String r1 = "FinderLiveScreenShotShareEntranceController"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
            kh1.f r14 = r13.f30876f
            android.graphics.Bitmap r3 = r14.f30867n
            if (r3 != 0) goto L_0x00f2
            java.lang.String r14 = "#showEntrance return because frameBitmap is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        L_0x00f2:
            android.graphics.Bitmap r1 = r13.f30877g
            r14.f30868o = r1
            android.graphics.Bitmap r1 = r13.f30878h
            r14.f30869p = r1
            android.widget.RelativeLayout r14 = r14.f30866j
            if (r14 != 0) goto L_0x00ff
            goto L_0x0103
        L_0x00ff:
            r1 = 0
            r14.setVisibility(r1)
        L_0x0103:
            r3 = 5000(0x1388, double:2.4703E-320)
            r13.f30875e = r5
            r13.f30874d = r2
            java.lang.Object r14 = a14.C53965x0.m60607b(r3, r13)
            if (r14 != r0) goto L_0x0110
            return r0
        L_0x0110:
            kh1.f r14 = r13.f30876f
            android.widget.RelativeLayout r14 = r14.f30866j
            if (r14 != 0) goto L_0x0117
            goto L_0x011c
        L_0x0117:
            r0 = 8
            r14.setVisibility(r0)
        L_0x011c:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kh1.C10089g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
