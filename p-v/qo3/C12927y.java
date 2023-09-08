package qo3;

import android.content.DialogInterface;
import android.view.ViewTreeObserver;

/* renamed from: qo3.y */
public class C12927y implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f36951d;

    public C12927y(C12925w wVar) {
        this.f36951d = wVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        ViewTreeObserver viewTreeObserver = this.f36951d.f36932n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                C12925w wVar = this.f36951d;
                wVar.f36932n = wVar.f36931j.getViewTreeObserver();
            }
            C12925w wVar2 = this.f36951d;
            wVar2.f36932n.removeGlobalOnLayoutListener(wVar2);
            this.f36951d.f36932n = null;
        }
        C12925w wVar3 = this.f36951d;
        if (!wVar3.f36933o) {
            wVar3.f36925d = null;
        }
        w$$d w__d = wVar3.f36937s;
        if (w__d != null) {
            w__d.onDismiss();
        }
        C12925w wVar4 = this.f36951d;
        w$$e w__e = wVar4.f36938t;
        if (w__e != null && !wVar4.f36939u) {
            w__e.onDismiss();
        }
        this.f36951d.f36921B.setTranslationX(0.0f);
        this.f36951d.f36921B.setVisibility(0);
        this.f36951d.f36922C.removeAllViews();
        this.f36951d.f36923D.clear();
    }
}
