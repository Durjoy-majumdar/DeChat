package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C103412e;
import androidx.appcompat.view.menu.C103445c;
import androidx.appcompat.view.menu.C103456i;

/* renamed from: androidx.appcompat.view.menu.f */
public class C103451f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C103456i.C103457a {

    /* renamed from: d */
    public C103448e f305255d;

    /* renamed from: e */
    public C103412e f305256e;

    /* renamed from: f */
    public C103445c f305257f;

    public C103451f(C103448e eVar) {
        this.f305255d = eVar;
    }

    /* renamed from: a */
    public void mo143414a(C103448e eVar, boolean z) {
        C103412e eVar2;
        if ((z || eVar == this.f305255d) && (eVar2 = this.f305256e) != null) {
            eVar2.dismiss();
        }
    }

    /* renamed from: d */
    public boolean mo143415d(C103448e eVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C103448e eVar = this.f305255d;
        C103445c cVar = this.f305257f;
        if (cVar.f305221i == null) {
            cVar.f305221i = new C103445c.C103446a();
        }
        eVar.mo143614q(cVar.f305221i.getItem(i), (C103456i) null, 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f305257f.mo143537a(this.f305255d, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f305256e.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f305256e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f305255d.mo143591c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f305255d.performShortcut(i, keyEvent, 0);
    }
}
