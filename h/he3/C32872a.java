package he3;

import a14.C0000n0;
import android.graphics.Bitmap;
import fy3.C32227p;
import gy3.C8479f0;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.pluginsdk.ui.uic.LoadHdHeadUIC$loadHdBitmap$1", mo125469f = "LoadHdHeadUIC.kt", mo125470l = {41, 50}, mo125471m = "invokeSuspend")
/* renamed from: he3.a */
public final class C32872a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f89377d;

    /* renamed from: e */
    public Object f89378e;

    /* renamed from: f */
    public Object f89379f;

    /* renamed from: g */
    public int f89380g;

    /* renamed from: h */
    public final /* synthetic */ String f89381h;

    /* renamed from: i */
    public final /* synthetic */ C76163b f89382i;

    /* renamed from: j */
    public final /* synthetic */ C32227p<Bitmap, String, C13598b0> f89383j;

    @C91590f(mo125468c = "com.tencent.mm.pluginsdk.ui.uic.LoadHdHeadUIC$loadHdBitmap$1$1", mo125469f = "LoadHdHeadUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: he3.a$a */
    public static final class C32873a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<Bitmap, String, C13598b0> f89384d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<Bitmap> f89385e;

        /* renamed from: f */
        public final /* synthetic */ String f89386f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32873a(C32227p<? super Bitmap, ? super String, C13598b0> pVar, C8479f0<Bitmap> f0Var, String str, C15601d<? super C32873a> dVar) {
            super(2, dVar);
            this.f89384d = pVar;
            this.f89385e = f0Var;
            this.f89386f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C32873a(this.f89384d, this.f89385e, this.f89386f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C32873a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f89384d.invoke(this.f89385e.f27484d, this.f89386f);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32872a(String str, C76163b bVar, C32227p<? super Bitmap, ? super String, C13598b0> pVar, C15601d<? super C32872a> dVar) {
        super(2, dVar);
        this.f89381h = str;
        this.f89382i = bVar;
        this.f89383j = pVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C32872a(this.f89381h, this.f89382i, this.f89383j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C32872a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(T r9) {
        /*
            r8 = this;
            java.lang.Class<ln.h> r0 = p196ln.C76707h.class
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r8.f89380g
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x002b
            if (r2 == r3) goto L_0x0027
            if (r2 != r4) goto L_0x001f
            java.lang.Object r1 = r8.f89379f
            gy3.f0 r1 = (gy3.C8479f0) r1
            java.lang.Object r2 = r8.f89378e
            gy3.f0 r2 = (gy3.C8479f0) r2
            java.lang.Object r4 = r8.f89377d
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00a0
        L_0x001f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x003f
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r9)
            di3.d r9 = di3.C86312j.m106911c(r0)
            ln.h r9 = (p196ln.C76707h) r9
            java.lang.String r2 = r8.f89381h
            r8.f89380g = r3
            java.lang.Object r9 = r9.mo106996zb(r2, r8)
            if (r9 != r1) goto L_0x003f
            return r1
        L_0x003f:
            java.lang.String r9 = (java.lang.String) r9
            gy3.f0 r2 = new gy3.f0
            r2.<init>()
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r5 == 0) goto L_0x0054
            r5 = 1080(0x438, float:1.513E-42)
            android.graphics.Bitmap r5 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r9, (int) r5, (int) r5)
            r2.f27484d = r5
        L_0x0054:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "loadHdBitmap "
            r5.append(r6)
            T r6 = r2.f27484d
            if (r6 == 0) goto L_0x0064
            r6 = 1
            goto L_0x0065
        L_0x0064:
            r6 = 0
        L_0x0065:
            r5.append(r6)
            java.lang.String r6 = " && "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.LoadHdHeadUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            T r5 = r2.f27484d
            if (r5 != 0) goto L_0x00a3
            di3.d r5 = di3.C86312j.m106911c(r0)
            java.lang.String r6 = "getService(IAvatarImageL…atureService::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            ln.h r5 = (p196ln.C76707h) r5
            java.lang.String r6 = r8.f89381h
            r8.f89377d = r9
            r8.f89378e = r2
            r8.f89379f = r2
            r8.f89380g = r4
            r4 = 1036831949(0x3dcccccd, float:0.1)
            java.lang.Object r4 = r5.mo106994vb(r6, r4, r8)
            if (r4 != r1) goto L_0x009c
            return r1
        L_0x009c:
            r1 = r2
            r7 = r4
            r4 = r9
            r9 = r7
        L_0x00a0:
            r1.f27484d = r9
            r9 = r4
        L_0x00a3:
            T r1 = r2.f27484d
            if (r1 != 0) goto L_0x00b3
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.h r0 = (p196ln.C76707h) r0
            android.graphics.Bitmap r0 = r0.Vw0()
            r2.f27484d = r0
        L_0x00b3:
            he3.b r0 = r8.f89382i
            rx3.g r0 = r0.f223096d
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.sdk.coroutines.LifecycleScope r0 = (com.tencent.p014mm.sdk.coroutines.LifecycleScope) r0
            he3.a$a r1 = new he3.a$a
            fy3.p<android.graphics.Bitmap, java.lang.String, rx3.b0> r4 = r8.f89383j
            r5 = 0
            r1.<init>(r4, r2, r9, r5)
            com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchMain$default(r0, r5, r1, r3, r5)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: he3.C32872a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
