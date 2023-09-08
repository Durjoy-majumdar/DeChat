package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.conversation.l2 */
public class C74709l2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RefreshHelper$3 f219661d;

    public C74709l2(RefreshHelper$3 refreshHelper$3) {
        this.f219661d = refreshHelper$3;
    }

    public void run() {
        Log.m105918d("MicroMsg.RefreshHelper", "refresh main ui multitalk icon.");
        C74720p pVar = this.f219661d.f219510d.f219774e;
        if (pVar != null) {
            pVar.notifyDataSetChanged();
        }
    }
}
