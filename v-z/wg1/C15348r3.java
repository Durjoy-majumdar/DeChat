package wg1;

import a14.C0000n0;
import a14.C53965x0;
import android.graphics.Rect;
import android.view.View;
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

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveVisitorNoticeQRCodeUIC$fixContentLayoutSize$1", mo125469f = "FinderLiveVisitorNoticeQRCodeUIC.kt", mo125470l = {521}, mo125471m = "invokeSuspend")
/* renamed from: wg1.r3 */
public final class C15348r3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f41688d;

    /* renamed from: e */
    public final /* synthetic */ C15278g3 f41689e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15348r3(C15278g3 g3Var, C15601d<? super C15348r3> dVar) {
        super(2, dVar);
        this.f41689e = g3Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15348r3(this.f41689e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15348r3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41688d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f41688d = 1;
            if (C53965x0.m60607b(10, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((View) ((C36570n) this.f41689e.f41563s).getValue()).getGlobalVisibleRect(new Rect());
        ((View) ((C36570n) this.f41689e.f41568x).getValue()).getGlobalVisibleRect(new Rect());
        int height = ((ScrollView) ((C36570n) this.f41689e.f41551d).getValue()).getHeight();
        Log.m105924i("FinderLiveNoticeQRCodeUIC", "#fixContentLayoutSize realSpace=" + height + " mQrCodeRootView.height=" + this.f41689e.mo14161e3().getHeight());
        if (height > 0 && this.f41689e.mo14161e3().getHeight() > 0) {
            if (height < this.f41689e.mo14161e3().getHeight()) {
                float height2 = ((float) height) / ((float) this.f41689e.mo14161e3().getHeight());
                this.f41689e.mo14161e3().setScaleX(height2);
                this.f41689e.mo14161e3().setScaleY(height2);
            } else {
                this.f41689e.mo14161e3().setScaleX(1.0f);
                this.f41689e.mo14161e3().setScaleY(1.0f);
            }
        }
        this.f41689e.mo14160d3().setVisibility(0);
        return C13598b0.f38549a;
    }
}
