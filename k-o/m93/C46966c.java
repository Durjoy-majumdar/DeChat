package m93;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: m93.c */
public final class C46966c implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C46953a f126276d;

    public C46966c(C46953a aVar) {
        this.f126276d = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C46953a aVar = this.f126276d;
        aVar.mo72134b(0, (Intent) null);
        C34483g.m40371b(aVar.f126252b, 4, aVar.f126254d);
    }
}
