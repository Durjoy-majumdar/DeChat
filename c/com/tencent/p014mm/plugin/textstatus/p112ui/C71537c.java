package com.tencent.p014mm.plugin.textstatus.p112ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.autogen.events.StatusIconConfigUpdateEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.c */
public final class C71537c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ StatusIconConfigUpdateEvent f207291d;

    /* renamed from: e */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f207292e;

    public C71537c(StatusIconConfigUpdateEvent statusIconConfigUpdateEvent, TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f207291d = statusIconConfigUpdateEvent;
        this.f207292e = textStatusDoWhatActivityV2;
    }

    public final void run() {
        RecyclerView.C16613e adapter;
        Log.m105924i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "config update old" + this.f207291d.f107775d.f107776a + " new:" + this.f207291d.f107775d.f107777b);
        this.f207292e.f206823Y.clear();
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f207292e;
        textStatusDoWhatActivityV2.f206823Y.addAll(textStatusDoWhatActivityV2.mo98425N7().mo62296h());
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV22 = this.f207292e;
        textStatusDoWhatActivityV22.f206824Z = textStatusDoWhatActivityV22.mo98429R7(textStatusDoWhatActivityV22.mo98425N7().mo62295g());
        WxRecyclerView wxRecyclerView = this.f207292e.f206825d;
        if (wxRecyclerView != null && (adapter = wxRecyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
