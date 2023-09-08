package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;

/* renamed from: com.tencent.mm.ui.s1 */
public class C6990s1 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ DialogInterface.OnClickListener f24720d;

    public C6990s1(DialogInterface.OnClickListener onClickListener) {
        this.f24720d = onClickListener;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        MMEntryLock.unlock("show_wap_adviser");
        DialogInterface.OnClickListener onClickListener = this.f24720d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, 0);
        }
    }
}
