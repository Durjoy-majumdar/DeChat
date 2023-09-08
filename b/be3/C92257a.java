package be3;

import a14.C0000n0;
import a14.C53965x0;
import com.tencent.p014mm.pluginsdk.p133ui.seekbar.HeroSeekBarView;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView$prepare$1", mo125469f = "HeroSeekBarView.kt", mo125470l = {149}, mo125471m = "invokeSuspend")
/* renamed from: be3.a */
public final class C92257a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f264049d;

    /* renamed from: e */
    public final /* synthetic */ HeroSeekBarView f264050e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92257a(HeroSeekBarView heroSeekBarView, C15601d<? super C92257a> dVar) {
        super(2, dVar);
        this.f264050e = heroSeekBarView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C92257a(this.f264050e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92257a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        HeroSeekBarView.C96825d videoPlayDurationProvider;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f264049d;
        if (i == 0 || i == 1) {
            ResultKt.throwOnFailure(obj);
            do {
                HeroSeekBarView heroSeekBarView = this.f264050e;
                if (!heroSeekBarView.f283697u) {
                    return C13598b0.f38549a;
                }
                if (!heroSeekBarView.f283692p && (videoPlayDurationProvider = this.f264050e.getVideoPlayDurationProvider()) != null) {
                    long a = videoPlayDurationProvider.mo132393a();
                    HeroSeekBarView heroSeekBarView2 = this.f264050e;
                    int i2 = heroSeekBarView2.f283687h;
                    if (i2 <= 0) {
                        HeroSeekBarView.m124366e(heroSeekBarView2, a);
                    } else if (a >= (((long) i2) * heroSeekBarView2.f283686g) / ((long) 2500)) {
                        HeroSeekBarView.m124366e(heroSeekBarView2, a);
                        heroSeekBarView2.f283687h = -1;
                    }
                }
                this.f264049d = 1;
            } while (C53965x0.m60607b(16, this) != aVar);
            return aVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
