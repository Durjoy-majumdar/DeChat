package qj1;

import android.view.View;
import f50.C58924d;
import g50.C107744b;
import g50.C59363a;
import g50.C59364c;
import h50.C108144a;
import h50.C108147c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: qj1.ai */
public final class C62637ai implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f177890d;

    /* renamed from: e */
    public final /* synthetic */ C12786zh f177891e;

    public C62637ai(View view, C12786zh zhVar) {
        this.f177890d = view;
        this.f177891e = zhVar;
    }

    public final void run() {
        C59363a d;
        View view = this.f177890d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$hideVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$hideVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C63170ze zeVar = (C63170ze) this.f177891e.mo87687E0(C63170ze.class);
        C59364c cVar = null;
        C58924d c1 = zeVar != null ? zeVar.mo88091c1() : null;
        if (c1 instanceof C59364c) {
            cVar = (C59364c) c1;
        }
        if (cVar != null && (d = cVar.mo84474d()) != null) {
            C107744b bVar = (C107744b) d;
            C108144a aVar2 = bVar.f322448x;
            if (aVar2 != null) {
                aVar2.f323829g = false;
                return;
            }
            C108147c cVar2 = bVar.f322449y;
            if (cVar2 != null) {
                cVar2.f323845a = false;
            }
        }
    }
}
