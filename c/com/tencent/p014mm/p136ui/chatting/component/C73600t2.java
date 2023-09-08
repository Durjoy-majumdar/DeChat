package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.component.t2 */
public class C73600t2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ GroupToolsComponet f216117d;

    public C73600t2(GroupToolsComponet groupToolsComponet) {
        this.f216117d = groupToolsComponet;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.roomtools.GroupToolsComponet", "dialog onCancel");
        Thread thread = this.f216117d.f215613x;
        if (thread != null && thread.isAlive()) {
            this.f216117d.f215613x.interrupt();
        }
    }
}
