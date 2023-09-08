package cm1;

import a14.C0000n0;
import a14.C53921m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import bl3.C39818r;
import cm1.C0777t2;
import fy3.C32227p;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import l60.C99344b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13598b0;
import up1.C27696y;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.model.SyncGetImageModel$loadImages$1", mo125469f = "SyncGetImageModel.kt", mo125470l = {153}, mo125471m = "invokeSuspend")
/* renamed from: cm1.z2 */
public final class C0801z2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f1862d;

    /* renamed from: e */
    public Object f1863e;

    /* renamed from: f */
    public Object f1864f;

    /* renamed from: g */
    public int f1865g;

    /* renamed from: h */
    public /* synthetic */ Object f1866h;

    /* renamed from: i */
    public final /* synthetic */ List<String> f1867i;

    /* renamed from: j */
    public final /* synthetic */ C0777t2 f1868j;

    /* renamed from: n */
    public final /* synthetic */ Context f1869n;

    /* renamed from: o */
    public final /* synthetic */ C0777t2.C0779b f1870o;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.model.SyncGetImageModel$loadImages$1$2", mo125469f = "SyncGetImageModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: cm1.z2$a */
    public static final class C0802a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0777t2.C0779b f1871d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<Drawable> f1872e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0802a(C0777t2.C0779b bVar, ArrayList<Drawable> arrayList, C15601d<? super C0802a> dVar) {
            super(2, dVar);
            this.f1871d = bVar;
            this.f1872e = arrayList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0802a(this.f1871d, this.f1872e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0802a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f1871d.mo723a(this.f1872e);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.model.SyncGetImageModel$loadImages$1$task$1", mo125469f = "SyncGetImageModel.kt", mo125470l = {151}, mo125471m = "invokeSuspend")
    /* renamed from: cm1.z2$b */
    public static final class C0803b extends C91594j implements C32227p<C0000n0, C15601d<? super Drawable>, Object> {

        /* renamed from: d */
        public int f1873d;

        /* renamed from: e */
        public final /* synthetic */ C0777t2 f1874e;

        /* renamed from: f */
        public final /* synthetic */ String f1875f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0803b(C0777t2 t2Var, String str, C15601d<? super C0803b> dVar) {
            super(2, dVar);
            this.f1874e = t2Var;
            this.f1875f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0803b(this.f1874e, this.f1875f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0803b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f1873d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0777t2 t2Var = this.f1874e;
                String str = this.f1875f;
                this.f1873d = 1;
                t2Var.getClass();
                Class cls = C11990s0.class;
                Class<C60200t1> cls2 = C60200t1.class;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                mVar.mo74599v(new C0786v2(mVar));
                C39818r rVar = C39818r.f106831a;
                C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.THUMB_IMAGE), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.LINK_THUMB));
                C0789w2 w2Var = new C0789w2(t2Var, mVar);
                b.getClass();
                b.f291320d = w2Var;
                b.f291324h = new C0792x2(mVar);
                b.f291323g = new C0796y2(mVar);
                b.mo85951a();
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0801z2(List<String> list, C0777t2 t2Var, Context context, C0777t2.C0779b bVar, C15601d<? super C0801z2> dVar) {
        super(2, dVar);
        this.f1867i = list;
        this.f1868j = t2Var;
        this.f1869n = context;
        this.f1870o = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C0801z2 z2Var = new C0801z2(this.f1867i, this.f1868j, this.f1869n, this.f1870o, dVar);
        z2Var.f1866h = obj;
        return z2Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0801z2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r14.f1865g
            r2 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            java.lang.Object r1 = r14.f1864f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r14.f1863e
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r14.f1862d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r5 = r14.f1866h
            a14.n0 r5 = (a14.C0000n0) r5
            kotlin.ResultKt.throwOnFailure(r15)
            r6 = r4
            r4 = r3
            r3 = r14
            goto L_0x0080
        L_0x0021:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.f1866h
            a14.n0 r15 = (a14.C0000n0) r15
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<java.lang.String> r3 = r14.f1867i
            java.util.Iterator r3 = r3.iterator()
            r4 = r1
            r1 = r14
        L_0x003d:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x00cb
            java.lang.Object r5 = r3.next()
            r11 = r5
            java.lang.String r11 = (java.lang.String) r11
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r5 != 0) goto L_0x003d
            r7 = 0
            r8 = 0
            cm1.z2$b r9 = new cm1.z2$b
            cm1.t2 r5 = r1.f1868j
            r9.<init>(r5, r11, r6)
            r10 = 3
            r12 = 0
            r5 = r15
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            a14.u0 r5 = a14.C53895h.m60464b(r5, r6, r7, r8, r9, r10)
            r1.f1866h = r15
            r1.f1862d = r4
            r1.f1863e = r3
            r1.f1864f = r11
            r1.f1865g = r2
            a14.v0 r5 = (a14.C53957v0) r5
            java.lang.Object r5 = r5.mo74549z(r1)
            if (r5 != r0) goto L_0x0079
            return r0
        L_0x0079:
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r11
            r13 = r5
            r5 = r15
            r15 = r13
        L_0x0080:
            android.graphics.drawable.Drawable r15 = (android.graphics.drawable.Drawable) r15
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "get drawable after wait url: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            java.lang.String r7 = "Finder.SyncGetImageModel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            cm1.t2 r1 = r3.f1868j
            int r1 = r1.f1822f
            r7 = -1
            if (r1 != r7) goto L_0x00a6
            er1.m3 r1 = er1.C7832m3.f26372a
            r1.getClass()
            int r1 = er1.C7832m3.f26378g
        L_0x00a6:
            if (r15 == 0) goto L_0x00c2
            cm1.t2 r7 = r3.f1868j
            android.content.Context r8 = r3.f1869n
            r9 = 0
            r15.setBounds(r9, r9, r1, r1)
            int r1 = r7.f1821e
            if (r1 != 0) goto L_0x00bf
            android.content.res.Resources r1 = r8.getResources()
            r7 = 2131099704(0x7f060038, float:1.7811769E38)
            int r1 = r1.getColor(r7)
        L_0x00bf:
            com.tencent.p014mm.p136ui.C74933u4.m89769f(r15, r1)
        L_0x00c2:
            r6.add(r15)
            r1 = r3
            r3 = r4
            r15 = r5
            r4 = r6
            goto L_0x003d
        L_0x00cb:
            cm1.t2 r7 = r1.f1868j
            r8 = 0
            r9 = 0
            cm1.z2$a r10 = new cm1.z2$a
            cm1.t2$b r15 = r1.f1870o
            r10.<init>(r15, r4, r6)
            r11 = 3
            r12 = 0
            cm1.C0777t2.m721i3(r7, r8, r9, r10, r11, r12)
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: cm1.C0801z2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
