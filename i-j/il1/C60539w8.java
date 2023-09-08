package il1;

import android.content.DialogInterface;
import di3.C86312j;
import p447aw.C103918d;

/* renamed from: il1.w8 */
public final class C60539w8 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60532u8 f172557d;

    public C60539w8(C60532u8 u8Var) {
        this.f172557d = u8Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f172557d.f172536d.getContext());
    }
}
