package be3;

import a14.C0000n0;
import com.tencent.p014mm.pluginsdk.p133ui.seekbar.HeroSeekBarView;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView$reset$1", mo125469f = "HeroSeekBarView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: be3.b */
public final class C92258b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ HeroSeekBarView f264051d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92258b(HeroSeekBarView heroSeekBarView, C15601d<? super C92258b> dVar) {
        super(2, dVar);
        this.f264051d = heroSeekBarView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C92258b(this.f264051d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92258b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f264051d.f283687h = -1;
        return C13598b0.f38549a;
    }
}
