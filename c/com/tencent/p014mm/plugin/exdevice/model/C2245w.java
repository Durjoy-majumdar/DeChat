package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75597w2;
import p196ln.C76708i;

/* renamed from: com.tencent.mm.plugin.exdevice.model.w */
public class C2245w implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ long f12313a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f12314b;

    public C2245w(long j, Runnable runnable) {
        this.f12313a = j;
        this.f12314b = runnable;
    }

    /* renamed from: a */
    public void mo1109a(String str, boolean z) {
        if (z) {
            Log.m105926v("MicroMsg.exdevice.ExdeviceLogic", "getContact suc; cost=" + (Util.nowMilliSecond() - this.f12313a) + " ms");
            ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
            Runnable runnable = this.f12314b;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Log.m105928w("MicroMsg.exdevice.ExdeviceLogic", "getContact failed");
    }
}
