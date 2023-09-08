package hn2;

import android.app.Dialog;
import qo3.C101218e0;

/* renamed from: hn2.p */
public class C98493p implements C101218e0.C101230o {

    /* renamed from: a */
    public final /* synthetic */ C98492e f288872a;

    public C98493p(C98492e eVar) {
        this.f288872a = eVar;
    }

    /* renamed from: a */
    public void mo32720a(Dialog dialog, int i) {
        C98492e eVar = this.f288872a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        eVar.f288869S = z;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
