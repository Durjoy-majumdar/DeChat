package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.autogen.events.WepkgNotifyEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.game.model.i */
public class C42065i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f113334d;

    /* renamed from: e */
    public final /* synthetic */ int f113335e;

    /* renamed from: f */
    public final /* synthetic */ int f113336f;

    /* renamed from: g */
    public final /* synthetic */ boolean f113337g;

    public C42065i(String str, int i, int i2, boolean z) {
        this.f113334d = str;
        this.f113335e = i;
        this.f113336f = i2;
        this.f113337g = z;
    }

    public void run() {
        Log.m105925i("MicroMsg.GameControlCmdParser", "MicroMsg.Wepkg message pkgid:%s, downloadTriggerType:%d, downloadType:%d", this.f113334d, Integer.valueOf(this.f113335e), Integer.valueOf(this.f113336f));
        if (!Util.isNullOrNil(this.f113334d)) {
            WepkgNotifyEvent wepkgNotifyEvent = new WepkgNotifyEvent();
            WepkgNotifyEvent.C40188a aVar = wepkgNotifyEvent.f107837d;
            aVar.f107838a = 1;
            aVar.f107839b = this.f113334d;
            aVar.f107842e = this.f113335e;
            aVar.f107843f = this.f113336f;
            wepkgNotifyEvent.publish();
            if (this.f113337g) {
                C115669n.INSTANCE.idkeyStat(858, 15, 1, false);
            }
        }
    }
}
