package wg1;

import a14.C0000n0;
import a14.C53965x0;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
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
import zp3.C79406f;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAllowanceGiftPagViewCallback$onPagAnimationStart$1$1", mo125469f = "FinderLiveAllowanceGiftPagViewCallback.kt", mo125470l = {171, 172}, mo125471m = "invokeSuspend")
/* renamed from: wg1.q */
public final class C15337q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f41668d;

    /* renamed from: e */
    public final /* synthetic */ C15349s f41669e;

    /* renamed from: f */
    public final /* synthetic */ FrameLayout f41670f;

    /* renamed from: g */
    public final /* synthetic */ String f41671g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15337q(C15349s sVar, FrameLayout frameLayout, String str, C15601d<? super C15337q> dVar) {
        super(2, dVar);
        this.f41669e = sVar;
        this.f41670f = frameLayout;
        this.f41671g = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15337q(this.f41669e, this.f41670f, this.f41671g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15337q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41668d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("FinderLiveAllowanceGiftPagViewCallback", "#onPagAnimationStart scope launch");
            float a = (((float) C75044y4.m89990b(MMApplicationContext.getContext()).x) / ((float) 2)) - ((float) C79406f.m96347a(this.f41669e.f41690d.getContext(), 36.0f));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f41670f, "translationX", new float[]{a, 0.0f});
            ofFloat.setDuration(250);
            ofFloat.start();
            View view = this.f41669e.f41690d;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$onPagAnimationStart$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$onPagAnimationStart$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f41668d = 1;
            if (C53965x0.m60607b(1250, this) == aVar) {
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
        String str = this.f41671g;
        C15349s sVar = this.f41669e;
        this.f41668d = 2;
        if (C15349s.m14336p(str, sVar, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
