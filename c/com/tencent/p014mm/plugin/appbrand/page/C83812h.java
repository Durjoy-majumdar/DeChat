package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82549j;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.h */
public abstract class C83812h extends C81879g implements C82531i {

    /* renamed from: w */
    public final /* synthetic */ C82549j f244657w = new C82549j();

    /* renamed from: g0 */
    public void mo116272g0(C82531i.C82538g gVar) {
        C82549j jVar = this.f244657w;
        if (gVar == null) {
            jVar.getClass();
        } else if (jVar.f241654p.get()) {
            gVar.onReady();
        } else {
            jVar.f241645d.add(gVar);
        }
    }

    public abstract View getContentView();

    /* renamed from: h0 */
    public void mo116273h0() {
        View contentView = getContentView();
        if (contentView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/page/AppBrandComponentViewWxa", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(contentView, "com/tencent/mm/plugin/appbrand/page/AppBrandComponentViewWxa", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: i */
    public void mo114863i(C82531i.C82533b bVar) {
        this.f244657w.mo114863i(bVar);
    }

    /* renamed from: i0 */
    public void mo116274i0(Runnable runnable) {
        View contentView;
        if (runnable != null && (contentView = getContentView()) != null) {
            contentView.post(runnable);
        }
    }

    /* renamed from: j */
    public void mo114864j(C82531i.C82533b bVar) {
        this.f244657w.mo114864j(bVar);
    }

    /* renamed from: j0 */
    public final void mo116275j0(Runnable runnable) {
        if (runnable != null) {
            if (MMHandlerThread.isMainThread()) {
                runnable.run();
            } else {
                mo116274i0(runnable);
            }
        }
    }

    /* renamed from: k0 */
    public void mo116276k0() {
        View contentView = getContentView();
        if (contentView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/page/AppBrandComponentViewWxa", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(contentView, "com/tencent/mm/plugin/appbrand/page/AppBrandComponentViewWxa", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: m */
    public void mo114865m(C82531i.C82534c cVar) {
        this.f244657w.mo114865m(cVar);
    }

    /* renamed from: q */
    public void mo114866q(C82531i.C82535d dVar) {
        this.f244657w.mo114866q(dVar);
    }

    /* renamed from: r */
    public void mo114867r(C82531i.C82534c cVar) {
        this.f244657w.mo114867r(cVar);
    }

    /* renamed from: y */
    public void mo114868y(C82531i.C82535d dVar) {
        this.f244657w.mo114868y(dVar);
    }
}
