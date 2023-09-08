package com.tencent.p014mm.plugin.textstatus.p112ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.autogen.events.StatusIconConfigUpdateEvent;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.b */
public final class C71536b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ StatusIconConfigUpdateEvent f207289d;

    /* renamed from: e */
    public final /* synthetic */ TextStatusDoWhatActivity f207290e;

    public C71536b(StatusIconConfigUpdateEvent statusIconConfigUpdateEvent, TextStatusDoWhatActivity textStatusDoWhatActivity) {
        this.f207289d = statusIconConfigUpdateEvent;
        this.f207290e = textStatusDoWhatActivity;
    }

    public final void run() {
        RecyclerView.C16613e adapter;
        Log.m105924i("MicroMsg.TextStatus.TextStatusDoWhatActivity", "config update old" + this.f207289d.f107775d.f107776a + " new:" + this.f207289d.f107775d.f107777b);
        this.f207290e.f206777r.clear();
        this.f207290e.f206777r.addAll(IStatusIconHelperKt.m39109a().mo62295g());
        TextStatusDoWhatActivity textStatusDoWhatActivity = this.f207290e;
        textStatusDoWhatActivity.f206778s = textStatusDoWhatActivity.mo98417L7(textStatusDoWhatActivity.f206777r);
        WxRecyclerView wxRecyclerView = this.f207290e.f206766d;
        if (wxRecyclerView != null && (adapter = wxRecyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
