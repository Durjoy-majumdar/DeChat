package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.ui.d4 */
public class C45024d4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SingleChatInfoUI f122120d;

    public C45024d4(SingleChatInfoUI singleChatInfoUI) {
        this.f122120d = singleChatInfoUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(14553, 6, 4, this.f122120d.f121200n);
        SingleChatInfoUI.f121192y = true;
        SingleChatInfoUI singleChatInfoUI = this.f122120d;
        if (!singleChatInfoUI.f121204r) {
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null) {
                instance.startChatting(this.f122120d.f121194e.getUsername(), (Bundle) null, true);
                return;
            }
            return;
        }
        singleChatInfoUI.finish();
    }
}
