package qo0;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewTreeObserver;
import gy3.C87412m;

/* renamed from: qo0.o */
public final class C89749o implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C89741g f258089d;

    public C89749o(C89741g gVar) {
        this.f258089d = gVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ViewTreeObserver viewTreeObserver = this.f258089d.f258063s;
        if (viewTreeObserver != null) {
            C87412m.m108591d(viewTreeObserver);
            if (!viewTreeObserver.isAlive()) {
                C89741g gVar = this.f258089d;
                View view = gVar.f258062r;
                C87412m.m108591d(view);
                gVar.f258063s = view.getViewTreeObserver();
            }
            ViewTreeObserver viewTreeObserver2 = this.f258089d.f258063s;
            C87412m.m108591d(viewTreeObserver2);
            viewTreeObserver2.removeGlobalOnLayoutListener(this.f258089d);
            this.f258089d.f258063s = null;
        }
        C89741g gVar2 = this.f258089d;
        gVar2.f258067w.invoke(Integer.valueOf(gVar2.f258052e.f258034e.size() + this.f258089d.f258052e.f258033d.size()));
    }
}
