package com.tencent.p014mm.plugin.finder.view;

import android.content.DialogInterface;
import kotlin.Metadata;
import qo3.C77407n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "onDismiss", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showConfirmDialog$3 */
public final class FinderBottomCustomDialogHelper$Companion$showConfirmDialog$3 implements C77407n.C47880p {
    public final /* synthetic */ DialogInterface.OnDismissListener $ldismiss;

    public FinderBottomCustomDialogHelper$Companion$showConfirmDialog$3(DialogInterface.OnDismissListener onDismissListener) {
        this.$ldismiss = onDismissListener;
    }

    public final void onDismiss() {
        DialogInterface.OnDismissListener onDismissListener = this.$ldismiss;
        if (onDismissListener != null) {
            onDismissListener.onDismiss((DialogInterface) null);
        }
    }
}
