package ya2;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewTreeObserver;
import gy3.C87412m;

/* renamed from: ya2.d */
public final class C66600d implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C66601e f191511d;

    public C66600d(C66601e eVar) {
        this.f191511d = eVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ViewTreeObserver viewTreeObserver = this.f191511d.f191518j;
        if (viewTreeObserver != null) {
            C87412m.m108591d(viewTreeObserver);
            if (!viewTreeObserver.isAlive()) {
                C66601e eVar = this.f191511d;
                View view = eVar.f191517i;
                C87412m.m108591d(view);
                eVar.f191518j = view.getViewTreeObserver();
            }
            ViewTreeObserver viewTreeObserver2 = this.f191511d.f191518j;
            C87412m.m108591d(viewTreeObserver2);
            viewTreeObserver2.removeGlobalOnLayoutListener(this.f191511d);
            this.f191511d.f191518j = null;
        }
        this.f191511d.getClass();
        this.f191511d.getClass();
    }
}
