package fh1;

import a14.C0000n0;
import a14.C53965x0;
import android.view.ViewPropertyAnimator;
import fh1.C8070p;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectPagController$renderForPag$3$1$3", mo125469f = "GestureEffectPagController.kt", mo125470l = {506, 509}, mo125471m = "invokeSuspend")
/* renamed from: fh1.v */
public final class C8088v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f26912d;

    /* renamed from: e */
    public final /* synthetic */ C8070p.C8071a f26913e;

    /* renamed from: f */
    public final /* synthetic */ String f26914f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8088v(C8070p.C8071a aVar, String str, C15601d<? super C8088v> dVar) {
        super(2, dVar);
        this.f26913e = aVar;
        this.f26914f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8088v(this.f26913e, this.f26914f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8088v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f26912d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f26913e.f26848d.setText(this.f26914f);
            this.f26912d = 1;
            if (C53965x0.m60607b(833, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            ViewPropertyAnimator animate = this.f26913e.f26848d.animate();
            if (!(animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(500)) == null)) {
                duration.start();
            }
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f26913e.f26848d.setVisibility(0);
        this.f26913e.f26848d.setAlpha(1.0f);
        this.f26912d = 2;
        if (C53965x0.m60607b(1292, this) == aVar) {
            return aVar;
        }
        ViewPropertyAnimator animate2 = this.f26913e.f26848d.animate();
        duration.start();
        return C13598b0.f38549a;
    }
}
