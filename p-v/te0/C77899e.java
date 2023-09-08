package te0;

import android.content.DialogInterface;
import com.tencent.p014mm.openim.p018ui.dialog.OpenIMKefuConfirmDialogView;

/* renamed from: te0.e */
public final class C77899e implements DialogInterface.OnShowListener {

    /* renamed from: d */
    public final /* synthetic */ C77900f f226957d;

    public C77899e(C77900f fVar) {
        this.f226957d = fVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView = this.f226957d.f226959g;
        if (openIMKefuConfirmDialogView != null) {
            openIMKefuConfirmDialogView.mo93675h();
        }
    }
}
