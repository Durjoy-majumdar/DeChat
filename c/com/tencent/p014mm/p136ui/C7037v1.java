package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;

/* renamed from: com.tencent.mm.ui.v1 */
public class C7037v1 implements DialogInterface.OnDismissListener {
    public void onDismiss(DialogInterface dialogInterface) {
        MMEntryLock.unlock("show_wap_adviser");
    }
}
