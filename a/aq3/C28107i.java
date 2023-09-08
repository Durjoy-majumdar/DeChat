package aq3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53965x0;
import android.view.View;
import f14.C58901s;
import fy3.C32227p;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.view.activity.ImageQueryGalleryBottomFunUIC$launchVisibleJob$1", mo125469f = "ImageQueryGalleryBottomFunUIC.kt", mo125470l = {81, 82}, mo125471m = "invokeSuspend")
/* renamed from: aq3.i */
public final class C28107i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f77501d;

    /* renamed from: e */
    public final /* synthetic */ C92069h f77502e;

    @C91590f(mo125468c = "com.tencent.mm.view.activity.ImageQueryGalleryBottomFunUIC$launchVisibleJob$1$1", mo125469f = "ImageQueryGalleryBottomFunUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: aq3.i$a */
    public static final class C28108a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C92069h f77503d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28108a(C92069h hVar, C15601d<? super C28108a> dVar) {
            super(2, dVar);
            this.f77503d = hVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C28108a(this.f77503d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C28108a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            View c3 = this.f77503d.mo126058c3();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(c3, aVar.mo10232b(), "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC$launchVisibleJob$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(c3, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC$launchVisibleJob$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28107i(C92069h hVar, C15601d<? super C28107i> dVar) {
        super(2, dVar);
        this.f77502e = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C28107i(this.f77502e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C28107i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f77501d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f77501d = 1;
            if (C53965x0.m60607b(6000, this) == aVar) {
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
        C28108a aVar2 = new C28108a(this.f77502e, (C15601d<? super C28108a>) null);
        this.f77501d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
