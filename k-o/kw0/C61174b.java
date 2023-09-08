package kw0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import qo3.C77398g;
import wd3.C65953v0;

/* renamed from: kw0.b */
public class C61174b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77398g f174152d;

    /* renamed from: e */
    public final /* synthetic */ C65953v0 f174153e;

    public C61174b(C77398g gVar, C65953v0 v0Var) {
        this.f174152d = gVar;
        this.f174153e = v0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f174152d.dismiss();
        C65953v0 v0Var = this.f174153e;
        if (v0Var != null) {
            String g = this.f174152d.mo107527g();
            EditText editText = this.f174152d.f225701r;
            v0Var.mo23a(true, g, editText instanceof PasterEditText ? ((PasterEditText) editText).getPasterLen() : 0);
        }
    }
}
