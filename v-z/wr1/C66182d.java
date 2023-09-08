package wr1;

import android.content.DialogInterface;
import android.widget.EditText;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import qo3.C77398g;
import wd3.C65953v0;

/* renamed from: wr1.d */
public class C66182d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77398g f190200d;

    /* renamed from: e */
    public final /* synthetic */ C65953v0 f190201e;

    public C66182d(C77398g gVar, C65953v0 v0Var) {
        this.f190200d = gVar;
        this.f190201e = v0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f190200d.dismiss();
        C65953v0 v0Var = this.f190201e;
        if (v0Var != null) {
            String g = this.f190200d.mo107527g();
            EditText editText = this.f190200d.f225701r;
            v0Var.mo23a(true, g, editText instanceof PasterEditText ? ((PasterEditText) editText).getPasterLen() : 0);
        }
    }
}
