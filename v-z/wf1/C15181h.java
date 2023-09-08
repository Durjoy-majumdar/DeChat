package wf1;

import android.content.DialogInterface;
import qo3.C101218e0;

/* renamed from: wf1.h */
public final class C15181h implements C101218e0.C77394n {

    /* renamed from: a */
    public final /* synthetic */ DialogInterface.OnDismissListener f41340a;

    public C15181h(DialogInterface.OnDismissListener onDismissListener) {
        this.f41340a = onDismissListener;
    }

    public final void dismiss() {
        C15191k.f41360a.mo14129d("154");
        DialogInterface.OnDismissListener onDismissListener = this.f41340a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss((DialogInterface) null);
        }
    }
}
