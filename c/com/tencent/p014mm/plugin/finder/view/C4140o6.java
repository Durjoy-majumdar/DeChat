package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.o6 */
public final class C4140o6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ HorizontalVideoPreviewLayout f18362d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4140o6(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout) {
        super(0);
        this.f18362d = horizontalVideoPreviewLayout;
    }

    public Object invoke() {
        this.f18362d.mo4802h(true);
        View seekTimeLayout = this.f18362d.getSeekTimeLayout();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(seekTimeLayout, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        seekTimeLayout.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(seekTimeLayout, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return C13598b0.f38549a;
    }
}
