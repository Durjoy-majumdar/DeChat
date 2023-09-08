package te0;

import android.content.DialogInterface;
import com.tencent.p014mm.openim.p018ui.dialog.OpenIMConfirmDialogView;

/* renamed from: te0.b */
public final class C77896b implements DialogInterface.OnShowListener {

    /* renamed from: d */
    public final /* synthetic */ C77894a f226954d;

    public C77896b(C77894a aVar) {
        this.f226954d = aVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        OpenIMConfirmDialogView openIMConfirmDialogView = this.f226954d.f226947g;
        if (openIMConfirmDialogView != null) {
            openIMConfirmDialogView.mo93675h();
        }
    }
}
