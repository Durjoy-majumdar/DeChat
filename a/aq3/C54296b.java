package aq3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53965x0;
import android.view.animation.AlphaAnimation;
import f14.C58901s;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.view.activity.ImageGalleryFloatLayerUIC$launchLayerVisibleJob$1", mo125469f = "ImageGalleryFloatLayerUIC.kt", mo125470l = {85, 86}, mo125471m = "invokeSuspend")
/* renamed from: aq3.b */
public final class C54296b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f152404d;

    /* renamed from: e */
    public final /* synthetic */ C54290a f152405e;

    @C91590f(mo125468c = "com.tencent.mm.view.activity.ImageGalleryFloatLayerUIC$launchLayerVisibleJob$1$1", mo125469f = "ImageGalleryFloatLayerUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: aq3.b$a */
    public static final class C54297a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C54290a f152406d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54297a(C54290a aVar, C15601d<? super C54297a> dVar) {
            super(2, dVar);
            this.f152406d = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54297a(this.f152406d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54297a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C54290a aVar = this.f152406d;
            aVar.getClass();
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(150);
            aVar.mo75093c3().startAnimation(alphaAnimation);
            aVar.mo75093c3().setVisibility(8);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54296b(C54290a aVar, C15601d<? super C54296b> dVar) {
        super(2, dVar);
        this.f152405e = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54296b(this.f152405e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54296b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f152404d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f152404d = 1;
            if (C53965x0.m60607b(1200, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        C54297a aVar2 = new C54297a(this.f152405e, (C15601d<? super C54297a>) null);
        this.f152404d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
