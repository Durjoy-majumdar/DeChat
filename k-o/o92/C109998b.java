package o92;

import android.content.DialogInterface;
import android.view.ViewTreeObserver;
import o92.C109999c;

/* renamed from: o92.b */
public class C109998b implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C109999c f329174d;

    public C109998b(C109999c cVar) {
        this.f329174d = cVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        ViewTreeObserver viewTreeObserver = this.f329174d.f329181j;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                C109999c cVar = this.f329174d;
                cVar.f329181j = cVar.f329180i.getViewTreeObserver();
            }
            C109999c cVar2 = this.f329174d;
            cVar2.f329181j.removeGlobalOnLayoutListener(cVar2);
            this.f329174d.f329181j = null;
        }
        this.f329174d.getClass();
        C109999c cVar3 = this.f329174d;
        cVar3.f329175d = null;
        C109999c.C110000a aVar = cVar3.f329183o;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }
}
