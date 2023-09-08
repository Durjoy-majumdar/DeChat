package uy1;

import android.app.Dialog;
import android.content.DialogInterface;

public class c$$b implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ Dialog f146988d;

    public c$$b(Dialog dialog) {
        this.f146988d = dialog;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f146988d.setOnCancelListener((DialogInterface.OnCancelListener) null);
    }
}
