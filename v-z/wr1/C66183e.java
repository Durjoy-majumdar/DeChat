package wr1;

import android.content.DialogInterface;
import qo3.C77398g;
import wd3.C65953v0;

/* renamed from: wr1.e */
public class C66183e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77398g f190202d;

    /* renamed from: e */
    public final /* synthetic */ C65953v0 f190203e;

    public C66183e(C77398g gVar, C65953v0 v0Var) {
        this.f190202d = gVar;
        this.f190203e = v0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f190202d.dismiss();
        C65953v0 v0Var = this.f190203e;
        if (v0Var != null) {
            v0Var.mo23a(false, (String) null, 0);
        }
    }
}
