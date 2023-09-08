package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.y$$b */
public class y$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C85004y f12003d;

    public y$$b(C85004y yVar) {
        this.f12003d = yVar;
    }

    public void run() {
        View view = this.f12003d.f247716d;
        if (view != null) {
            Log.m105925i("MicroMsg.AppBrandUIdRootFrameLayout", "hideInactivePanelView, mPanel %s", view.getClass().getSimpleName());
            for (int i = 0; i < this.f12003d.getChildCount(); i++) {
                View childAt = this.f12003d.getChildAt(i);
                if (childAt != null) {
                    C85004y yVar = this.f12003d;
                    if (!(childAt == yVar.f247717e || childAt == yVar.f247716d)) {
                        yVar.getClass();
                        if (!(childAt == null || childAt.getVisibility() == 8)) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "fast_setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(childAt, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "fast_setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
            }
        }
    }
}
