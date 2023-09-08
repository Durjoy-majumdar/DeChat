package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.p6 */
public final class C4149p6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ HorizontalVideoPreviewLayout f18373d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4149p6(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout) {
        super(0);
        this.f18373d = horizontalVideoPreviewLayout;
    }

    public Object invoke() {
        View seekTimeLayout = this.f18373d.getSeekTimeLayout();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(seekTimeLayout, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        seekTimeLayout.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(seekTimeLayout, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return C13598b0.f38549a;
    }
}
