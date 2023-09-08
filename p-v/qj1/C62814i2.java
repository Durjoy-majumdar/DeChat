package qj1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: qj1.i2 */
public final class C62814i2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C62799h2 f178290d;

    public C62814i2(C62799h2 h2Var) {
        this.f178290d = h2Var;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f178290d.f178267y;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        this.f178290d.getClass();
        e0Var.mo107140d(0, this.f178290d.f166287d.getContext().getResources().getColor(C0966R.color.f356948a24), this.f178290d.f166287d.getContext().getResources().getString(C0966R.string.dr8));
    }
}
