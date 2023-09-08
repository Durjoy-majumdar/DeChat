package com.tencent.p014mm.plugin.sight.decode.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.sight.decode.model.d */
public class C30398d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ double f81995d;

    /* renamed from: e */
    public final /* synthetic */ SightPlayController f81996e;

    public C30398d(SightPlayController sightPlayController, double d) {
        this.f81996e = sightPlayController;
        this.f81995d = d;
    }

    public void run() {
        Log.m105925i("MicroMsg.SightPlayController", "SeekToFrame   %f  %s", Double.valueOf(this.f81995d), Util.getStack().toString());
        this.f81996e.f273462C = this.f81995d;
    }
}
