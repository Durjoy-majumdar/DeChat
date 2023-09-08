package com.tencent.p014mm.plugin.ringtone.uic;

import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import java.util.List;
import pj2.C62318a;

/* renamed from: com.tencent.mm.plugin.ringtone.uic.b */
public final class C57305b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RingtoneExclusiveMainUIC f164105d;

    public C57305b(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
        this.f164105d = ringtoneExclusiveMainUIC;
    }

    public final void run() {
        List<C62318a> data;
        WxRecyclerAdapter<C62318a> wxRecyclerAdapter = this.f164105d.f164091j;
        if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
            RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC = this.f164105d;
            for (C62318a aVar : data) {
                aVar.f177145e = false;
                WxRecyclerAdapter<C62318a> wxRecyclerAdapter2 = ringtoneExclusiveMainUIC.f164091j;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.mo85799f6(aVar.getItemId(), Boolean.FALSE);
                }
            }
        }
    }
}
