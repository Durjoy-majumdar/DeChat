package nj3;

import android.content.DialogInterface;

/* renamed from: nj3.l */
public class C76890l implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ DialogInterface.OnClickListener f224741d;

    public C76890l(DialogInterface.OnClickListener onClickListener) {
        this.f224741d = onClickListener;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnClickListener onClickListener = this.f224741d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, 0);
        }
    }
}
