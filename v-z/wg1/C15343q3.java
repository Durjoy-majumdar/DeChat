package wg1;

import android.content.DialogInterface;

/* renamed from: wg1.q3 */
public final class C15343q3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C15278g3 f41680d;

    public C15343q3(C15278g3 g3Var) {
        this.f41680d = g3Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f41680d.getActivity().finish();
    }
}
