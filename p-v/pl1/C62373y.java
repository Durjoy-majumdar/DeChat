package pl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.graphics.Bitmap;
import c14.C54602a;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import k60.C99102f;
import kotlin.ResultKt;
import r60.C101350i;
import rx3.C13598b0;
import vp3.C111580c;
import w60.C65941g;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import y60.C102802a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: pl1.y */
public final class C62373y extends C100813k {

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.loader.FinderGradientBlurEffectProducer$asResource$1", mo125469f = "FinderGradientBlurEffectProducer.kt", mo125470l = {52}, mo125471m = "invokeSuspend")
    /* renamed from: pl1.y$a */
    public static final class C62374a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f177264d;

        /* renamed from: e */
        public /* synthetic */ Object f177265e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<Bitmap> f177266f;

        /* renamed from: g */
        public final /* synthetic */ Bitmap f177267g;

        /* renamed from: h */
        public final /* synthetic */ C101350i<?> f177268h;

        /* renamed from: pl1.y$a$a */
        public static final class C62375a extends C87413o implements C32226l<Long, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C111580c f177269d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62375a(C111580c cVar) {
                super(1);
                this.f177269d = cVar;
            }

            public Object invoke(Object obj) {
                ((Number) obj).longValue();
                this.f177269d.mo163259b();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: pl1.y$a$b */
        public static final class C62376b extends C87413o implements C32226l<Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C0000n0 f177270d;

            /* renamed from: e */
            public final /* synthetic */ C54625h<Bitmap> f177271e;

            /* renamed from: f */
            public final /* synthetic */ Bitmap f177272f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62376b(C0000n0 n0Var, C54625h<Bitmap> hVar, Bitmap bitmap) {
                super(1);
                this.f177270d = n0Var;
                this.f177271e = hVar;
                this.f177272f = bitmap;
            }

            public Object invoke(Object obj) {
                C0000n0 n0Var = this.f177270d;
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(n0Var, C58901s.f168555a, (C53934p0) null, new C62377z(this.f177271e, (Bitmap) obj, this.f177272f, (C15601d<? super C62377z>) null), 2, (Object) null);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62374a(C8479f0<Bitmap> f0Var, Bitmap bitmap, C101350i<?> iVar, C15601d<? super C62374a> dVar) {
            super(2, dVar);
            this.f177266f = f0Var;
            this.f177267g = bitmap;
            this.f177268h = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C62374a aVar = new C62374a(this.f177266f, this.f177267g, this.f177268h, dVar);
            aVar.f177265e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62374a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(T t) {
            C8479f0<Bitmap> f0Var;
            T t2 = C15911a.COROUTINE_SUSPENDED;
            int i = this.f177264d;
            if (i == 0) {
                ResultKt.throwOnFailure(t);
                C54625h a = C54629k.m61479a(0, (C54624g) null, (C32226l) null, 7, (Object) null);
                C111580c cVar = new C111580c();
                Bitmap bitmap = this.f177267g;
                C101350i<?> iVar = this.f177268h;
                C87412m.m108593f(bitmap, "originBitmap");
                cVar.mo163263k(bitmap);
                iVar.getClass();
                int width = bitmap.getWidth();
                cVar.mo163272i(width, C60641c.m70921b(((((float) width) * 1.0f) * ((float) bitmap.getHeight())) / ((float) bitmap.getWidth())));
                cVar.mo163261d();
                cVar.f334048q = new C62375a(cVar);
                cVar.f334033b.mo154924d();
                cVar.mo163271h(new C62376b((C0000n0) this.f177265e, a, this.f177267g));
                C8479f0<Bitmap> f0Var2 = this.f177266f;
                this.f177265e = f0Var2;
                this.f177264d = 1;
                T g = ((C54602a) a).mo75514g(this);
                if (g == t2) {
                    return t2;
                }
                f0Var = f0Var2;
                t = g;
            } else if (i == 1) {
                f0Var = (C8479f0) this.f177265e;
                ResultKt.throwOnFailure(t);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var.f27484d = t;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public C65941g<Bitmap> mo87424a(C101350i<?> iVar, C99102f<?, Bitmap> fVar, C102802a aVar) {
        C87412m.m108594g(iVar, "targetView");
        C87412m.m108594g(fVar, "reaper");
        C87412m.m108594g(aVar, "input");
        C65941g<Bitmap> a = super.mo87424a(iVar, fVar, aVar);
        Bitmap bitmap = (Bitmap) a.f189590a;
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return a;
        }
        C8479f0 f0Var = new C8479f0();
        C53895h.m60468f((C66212f) null, new C62374a(f0Var, bitmap, iVar, (C15601d<? super C62374a>) null), 1, (Object) null);
        return new C65941g<>(f0Var.f27484d);
    }
}
