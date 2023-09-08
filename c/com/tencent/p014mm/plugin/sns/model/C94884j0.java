package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eb0.C97624e3;
import java.util.List;
import te3.m64;

/* renamed from: com.tencent.mm.plugin.sns.model.j0 */
public class C94884j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f274955d;

    /* renamed from: e */
    public final /* synthetic */ m64 f274956e;

    /* renamed from: f */
    public final /* synthetic */ MMHandler f274957f;

    public C94884j0(C94886k0 k0Var, boolean z, m64 m64, MMHandler mMHandler) {
        this.f274955d = z;
        this.f274956e = m64;
        this.f274957f = mMHandler;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$2");
        if (this.f274955d) {
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            List<C97624e3> list = C94886k0.f274960h;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            for (C97624e3 N0 : list) {
                Log.m105924i("MicroMsg.NetSceneNewSyncAlbum", "notify list ");
                N0.mo25887N0(this.f274956e);
            }
        }
        this.f274957f.sendEmptyMessage(0);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$2");
    }
}
