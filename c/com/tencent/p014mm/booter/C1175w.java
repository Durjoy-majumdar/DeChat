package com.tencent.p014mm.booter;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;

/* renamed from: com.tencent.mm.booter.w */
public class C1175w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f10135d;

    public C1175w(int i) {
        this.f10135d = i;
    }

    public void run() {
        C115669n nVar = C115669n.INSTANCE;
        nVar.kvStat(10675, this.f10135d + "," + ChannelUtil.channelId);
    }
}
