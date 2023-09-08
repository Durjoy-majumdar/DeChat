package qo3;

import android.content.DialogInterface;
import android.view.KeyEvent;

public final /* synthetic */ class w$$a implements DialogInterface.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f36945d;

    public /* synthetic */ w$$a(C12925w wVar) {
        this.f36945d = wVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C12925w wVar = this.f36945d;
        boolean z = false;
        if (i == 4) {
            if (!wVar.f36923D.isEmpty()) {
                wVar.mo12467g(wVar.f36923D.getLast());
                z = true;
            }
            if (!z) {
                dialogInterface.dismiss();
            }
            return true;
        }
        wVar.getClass();
        return false;
    }
}
