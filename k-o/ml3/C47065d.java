package ml3;

import android.content.DialogInterface;
import ml3.C47058a;

/* renamed from: ml3.d */
public class C47065d implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C47058a.C47060b f126485d;

    public C47065d(C47058a.C47060b bVar) {
        this.f126485d = bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f126485d.f126476f = true;
    }
}
