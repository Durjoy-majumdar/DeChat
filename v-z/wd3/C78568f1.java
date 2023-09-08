package wd3;

import android.content.DialogInterface;
import com.tencent.p014mm.pluginsdk.model.C44590b1;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: wd3.f1 */
public class C78568f1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78553c1 f230169d;

    public C78568f1(C78553c1 c1Var) {
        this.f230169d = c1Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C78553c1 c1Var = this.f230169d;
        c1Var.f230118w = false;
        c1Var.f230119x = false;
        c1Var.mo108529e();
        c1Var.f230120y = new C44590b1(1, c1Var.f230109n, c1Var.f230110o, c1Var.f230111p, c1Var.f230112q, "", c1Var.f230113r, c1Var.f230116u, "");
        if (!Util.isNullOrNil(c1Var.f230114s)) {
            c1Var.f230120y.mo69384k1(c1Var.f230114s, c1Var.f230115t);
        }
        c1Var.f230120y.mo69385q("");
        c1Var.f230120y.mo69382J(0);
        c1Var.f230120y.mo69383j1(c1Var.f230118w);
        C86709a0.m107529k().f251779b.mo123460f(c1Var.f230120y);
    }
}
