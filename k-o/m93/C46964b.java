package m93;

import android.content.DialogInterface;
import android.view.KeyEvent;
import p93.C47440e;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: m93.b */
public final class C46964b implements DialogInterface.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ C47440e f126273d;

    /* renamed from: e */
    public final /* synthetic */ C46953a f126274e;

    /* renamed from: m93.b$a */
    public static final class C46965a implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C46953a f126275d;

        public C46965a(C46953a aVar) {
            this.f126275d = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C46953a aVar = this.f126275d;
            aVar.getClass();
            C119179t tVar = C119157j.f356862d;
            C46968e eVar = new C46968e(aVar);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(eVar, 100, false);
            C46953a aVar2 = this.f126275d;
            C34483g.m40371b(aVar2.f126252b, 5, aVar2.f126254d);
        }
    }

    public C46964b(C47440e eVar, C46953a aVar) {
        this.f126273d = eVar;
        this.f126274e = aVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        this.f126273d.setOnDismissListener(new C46965a(this.f126274e));
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return true;
    }
}
