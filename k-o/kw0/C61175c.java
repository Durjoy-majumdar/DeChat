package kw0;

import android.content.DialogInterface;
import qo3.C77398g;
import wd3.C65953v0;

/* renamed from: kw0.c */
public class C61175c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77398g f174154d;

    /* renamed from: e */
    public final /* synthetic */ C65953v0 f174155e;

    public C61175c(C77398g gVar, C65953v0 v0Var) {
        this.f174154d = gVar;
        this.f174155e = v0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f174154d.dismiss();
        C65953v0 v0Var = this.f174155e;
        if (v0Var != null) {
            v0Var.mo23a(false, (String) null, 0);
        }
    }
}
