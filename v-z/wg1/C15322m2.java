package wg1;

import a14.C0000n0;
import a14.C53965x0;
import android.widget.ScrollView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C36570n;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveNoticeQRCodeUIC$fixContentLayoutSize$1", mo125469f = "FinderLiveNoticeQRCodeUIC.kt", mo125470l = {536}, mo125471m = "invokeSuspend")
/* renamed from: wg1.m2 */
public final class C15322m2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f41645d;

    /* renamed from: e */
    public final /* synthetic */ C15370z1 f41646e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15322m2(C15370z1 z1Var, C15601d<? super C15322m2> dVar) {
        super(2, dVar);
        this.f41646e = z1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15322m2(this.f41646e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15322m2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41645d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f41645d = 1;
            if (C53965x0.m60607b(10, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int height = ((ScrollView) ((C36570n) this.f41646e.f41743d).getValue()).getHeight();
        Log.m105924i("FinderLiveNoticeQRCodeUIC", "#fixContentLayoutSize realSpace=" + height + " mQrCodeRootView.height=" + this.f41646e.mo14194i3().getHeight());
        if (height > 0 && this.f41646e.mo14194i3().getHeight() > 0) {
            if (height < this.f41646e.mo14194i3().getHeight()) {
                float height2 = ((float) height) / ((float) this.f41646e.mo14194i3().getHeight());
                this.f41646e.mo14194i3().setScaleX(height2);
                this.f41646e.mo14194i3().setScaleY(height2);
            } else {
                this.f41646e.mo14194i3().setScaleX(1.0f);
                this.f41646e.mo14194i3().setScaleY(1.0f);
            }
        }
        this.f41646e.mo14192f3().setVisibility(0);
        return C13598b0.f38549a;
    }
}
