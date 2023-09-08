package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import lu3.C88654b;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.b */
public class C72767b extends C88654b {
    public C72767b(AppPanel appPanel) {
    }

    public String getKey() {
        return "initAppGrid";
    }

    public void run() {
        Log.m105920e("MicroMsg.AppPanel", "initAppGrid ANR!");
        C115669n.INSTANCE.mo175913w(999, 2, 1);
    }
}
