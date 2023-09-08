package y52;

import android.content.DialogInterface;
import eb0.C97625j3;
import qo3.C89779i0;
import w52.C78519i;

/* renamed from: y52.c */
public class C79050c implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C78519i f232145d;

    /* renamed from: e */
    public final /* synthetic */ C79043b f232146e;

    public C79050c(C79043b bVar, C78519i iVar) {
        this.f232146e = bVar;
        this.f232145d = iVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C97625j3.m125815e().mo123458d(this.f232145d);
        C89779i0 i0Var = this.f232146e.f232130g;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f232146e.f232130g = null;
        }
    }
}
