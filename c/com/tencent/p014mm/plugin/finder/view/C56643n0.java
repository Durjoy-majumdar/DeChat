package com.tencent.p014mm.plugin.finder.view;

import android.content.DialogInterface;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.finder.view.n0 */
public final class C56643n0 implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ DialogInterface.OnDismissListener f162369a;

    public C56643n0(DialogInterface.OnDismissListener onDismissListener) {
        this.f162369a = onDismissListener;
    }

    public final void onDismiss() {
        DialogInterface.OnDismissListener onDismissListener = this.f162369a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss((DialogInterface) null);
        }
    }
}
