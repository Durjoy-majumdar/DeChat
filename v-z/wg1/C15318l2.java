package wg1;

import android.content.DialogInterface;

/* renamed from: wg1.l2 */
public final class C15318l2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C15370z1 f41636d;

    public C15318l2(C15370z1 z1Var) {
        this.f41636d = z1Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f41636d.getActivity().finish();
    }
}
