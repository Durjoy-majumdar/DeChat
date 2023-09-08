package by0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18366u2;
import com.tencent.p014mm.storage.C19623o0;
import java.lang.ref.WeakReference;

/* renamed from: by0.c */
public final class C16828c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f45469d;

    public C16828c(C19623o0 o0Var) {
        this.f45469d = o0Var;
    }

    public final void run() {
        C18366u2 u2Var;
        C18366u2 u2Var2;
        C16825a aVar = C16825a.f45444a;
        C19623o0 o0Var = this.f45469d;
        int i = o0Var.field_type;
        if (i == 637534257) {
            C16825a.m16471g(aVar, o0Var.field_msgId, false, 2, (Object) null);
            WeakReference weakReference = C16825a.f45450g.get(Long.valueOf(o0Var.field_msgId));
            if (weakReference != null && (u2Var2 = (C18366u2) weakReference.get()) != null) {
                u2Var2.mo22834f(1);
            }
        } else if ((i == 285212721 || i == 620757041 || o0Var.mo25759G2()) && o0Var.mo25774x2() != null && 104 == o0Var.mo25774x2().f64521j) {
            WeakReference weakReference2 = C16825a.f45450g.get(Long.valueOf(o0Var.field_msgId));
            if (!(weakReference2 == null || (u2Var = (C18366u2) weakReference2.get()) == null)) {
                u2Var.mo22834f(1);
            }
            C16825a.f45451h = o0Var.field_msgId;
        }
    }
}
