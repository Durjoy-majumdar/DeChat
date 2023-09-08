package ua0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import k60.C60978b;
import kotlin.Result;
import kotlin.ResultKt;
import p1104d1.C106967a;
import p1104d1.C106969c;
import p1166z0.C112545k;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C24725u1;
import p175j0.C60690y0;
import p436a1.C103230e;
import p436a1.C103274x;
import p835c1.C104231f;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import wx3.C15601d;
import wx3.C66218h;
import x60.C102564a;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ua0.d */
public final class C65253d extends C106969c implements C24725u1 {

    /* renamed from: i */
    public final String f187858i;

    /* renamed from: j */
    public final C60690y0 f187859j = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);

    /* renamed from: n */
    public final C60690y0<Boolean> f187860n;

    /* renamed from: o */
    public final C60690y0 f187861o;

    /* renamed from: p */
    public final C60690y0 f187862p;

    /* renamed from: q */
    public final C60690y0 f187863q;

    /* renamed from: r */
    public final C0000n0 f187864r;

    /* renamed from: s */
    public C53973z1 f187865s;

    @C91590f(mo125468c = "com.tencent.mm.mm_compose.painter.ImageLoaderPainter$onRemembered$3$1", mo125469f = "ImageLoaderPainter.kt", mo125470l = {85}, mo125471m = "invokeSuspend")
    /* renamed from: ua0.d$a */
    public static final class C65254a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f187866d;

        /* renamed from: e */
        public int f187867e;

        /* renamed from: f */
        public final /* synthetic */ C60978b<String, Bitmap> f187868f;

        /* renamed from: g */
        public final /* synthetic */ C65253d f187869g;

        /* renamed from: ua0.d$a$a */
        public static final class C65255a<T, R> implements C64207e {

            /* renamed from: a */
            public final /* synthetic */ C15601d<Bitmap> f187870a;

            public C65255a(C15601d<? super Bitmap> dVar) {
                this.f187870a = dVar;
            }

            /* renamed from: a */
            public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
                this.f187870a.resumeWith(Result.m168114constructorimpl((Bitmap) obj));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65254a(C60978b<String, Bitmap> bVar, C65253d dVar, C15601d<? super C65254a> dVar2) {
            super(2, dVar2);
            this.f187868f = bVar;
            this.f187869g = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65254a(this.f187868f, this.f187869g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65254a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C13598b0 b0Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f187867e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C60978b<String, Bitmap> bVar = this.f187868f;
                this.f187866d = bVar;
                this.f187867e = 1;
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                bVar.mo85952b(new C65255a(hVar));
                bVar.mo85953c();
                obj = hVar.mo90314b();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C65253d dVar = this.f187869g;
                ((C108494d2) dVar.f187859j).setValue(new C106967a(C103230e.m136642b(bitmap), 0, 0, 6, (C8480h) null));
                ((C108494d2) dVar.f187860n).setValue(Boolean.TRUE);
                Log.m105924i("MicroMsg.ImageLoaderPainter", "get img from network " + dVar.f187858i);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105928w("MicroMsg.ImageLoaderPainter", "get from network error");
            }
            return C13598b0.f38549a;
        }
    }

    public C65253d(String str) {
        C87412m.m108594g(str, "url");
        this.f187858i = str;
        C60690y0<Boolean> c = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
        this.f187860n = c;
        this.f187861o = c;
        this.f187862p = C108500f2.m146996c(Float.valueOf(1.0f), (C108497e2) null, 2, (Object) null);
        this.f187863q = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
        this.f187864r = C53930o0.m60554a(C53872d1.f151119c.plus(C53959v2.m60598a((C53973z1) null, 1, (Object) null)));
    }

    /* renamed from: a */
    public boolean mo84456a(float f) {
        ((C108494d2) this.f187862p).setValue(Float.valueOf(f));
        return true;
    }

    /* renamed from: b */
    public void mo51625b() {
        mo51627d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo51626c() {
        /*
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onRemembered: "
            r0.append(r1)
            java.lang.String r1 = r13.f187858i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.ImageLoaderPainter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            a14.z1 r0 = r13.f187865s
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            a14.C53973z1.C53974a.m60623a(r0, r3, r2, r3)
        L_0x0021:
            k60.a r0 = k60.C99101e.f290571b
            java.lang.String r4 = r13.f187858i
            l60.b r0 = r0.mo85955a(r4)
            n60.f$a r4 = new n60.f$a
            r4.<init>()
            r4.f293176b = r2
            n60.f r4 = r4.mo139398a()
            r0.f291319c = r4
            java.lang.Object r4 = r0.mo138757e()
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            if (r4 == 0) goto L_0x0082
            boolean r5 = r4.isRecycled()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r4 = r3
        L_0x0047:
            if (r4 == 0) goto L_0x0082
            d1.a r2 = new d1.a
            a1.d0 r6 = p436a1.C103230e.m136642b(r4)
            r7 = 0
            r9 = 0
            r11 = 6
            r12 = 0
            r5 = r2
            r5.<init>(r6, r7, r9, r11, r12)
            j0.y0 r4 = r13.f187859j
            j0.d2 r4 = (p175j0.C108494d2) r4
            r4.setValue(r2)
            j0.y0<java.lang.Boolean> r2 = r13.f187860n
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            j0.d2 r2 = (p175j0.C108494d2) r2
            r2.setValue(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "get img from cache "
            r2.append(r4)
            java.lang.String r4 = r13.f187858i
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0083
        L_0x0082:
            r1 = r3
        L_0x0083:
            if (r1 != 0) goto L_0x0096
            a14.n0 r4 = r13.f187864r
            r5 = 0
            r6 = 0
            ua0.d$a r7 = new ua0.d$a
            r7.<init>(r0, r13, r3)
            r8 = 3
            r9 = 0
            a14.z1 r0 = a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            r13.f187865s = r0
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ua0.C65253d.mo51626c():void");
    }

    /* renamed from: d */
    public void mo51627d() {
        Log.m105924i("MicroMsg.ImageLoaderPainter", "onForgotten: " + this.f187858i);
        C53973z1 z1Var = this.f187865s;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f187865s = null;
        C53930o0.m60558e(this.f187864r, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: e */
    public boolean mo84457e(C103274x xVar) {
        ((C108494d2) this.f187863q).setValue(xVar);
        return true;
    }

    /* renamed from: h */
    public long mo84458h() {
        C106969c cVar = (C106969c) ((C108494d2) this.f187859j).getValue();
        return cVar != null ? cVar.mo84458h() : C112545k.f336974c;
    }

    /* renamed from: i */
    public void mo84459i(C104231f fVar) {
        C87412m.m108594g(fVar, "<this>");
        C106969c cVar = (C106969c) ((C108494d2) this.f187859j).getValue();
        if (cVar != null) {
            cVar.mo157379g(fVar, fVar.mo145819e(), ((Number) ((C108494d2) this.f187862p).getValue()).floatValue(), (C103274x) ((C108494d2) this.f187863q).getValue());
        }
    }
}
