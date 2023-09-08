package wd3;

import android.content.DialogInterface;
import p011cm.C39989b;

/* renamed from: wd3.d1 */
public class C78562d1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C78553c1 f230128d;

    public C78562d1(C78553c1 c1Var) {
        this.f230128d = c1Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f230128d.mo108530f();
        C39989b.C39992e eVar = this.f230128d.f230104f;
        if (eVar != null) {
            eVar.mo62595a(false);
        }
    }
}
