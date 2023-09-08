package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C5438v;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97624e3;
import f40.C86709a0;
import java.util.List;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.i0 */
public class C94882i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsObject f274951d;

    /* renamed from: e */
    public final /* synthetic */ MMHandler f274952e;

    /* renamed from: f */
    public final /* synthetic */ C94886k0 f274953f;

    public C94882i0(C94886k0 k0Var, SnsObject snsObject, MMHandler mMHandler) {
        this.f274953f = k0Var;
        this.f274951d = snsObject;
        this.f274952e = mMHandler;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$1");
        String str = this.f274951d.Username;
        C94886k0 k0Var = this.f274953f;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        String str2 = k0Var.f274963d;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        if (!str.equals(str2)) {
            C86709a0.m107528h();
            if (!C86709a0.m107523b().mo121114l()) {
                Log.m105920e("MicroMsg.NetSceneNewSyncAlbum", "mmcore has not set uin!!");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$1");
                return;
            }
            C86709a0.m107528h();
            String str3 = (String) C86709a0.m107535s().mo121142i().mo119684e(68377, (Object) null);
            C86709a0.m107528h();
            if (Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(68400, (Object) null), 0) != this.f274951d.CreateTime || (!Util.isNullOrNil(str3) && !str3.equals(this.f274951d.Username))) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(68377, this.f274951d.Username);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(68400, Integer.valueOf(this.f274951d.CreateTime));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(68418, C102236a0.m134765q0(this.f274951d.f283891Id));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(68419, 0);
                C5438v.m5358a(1, C102236a0.m134765q0(this.f274951d.f283891Id), 0);
            }
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            List<C97624e3> list = C94886k0.f274960h;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            for (C97624e3 t1 : list) {
                t1.mo25924t1(this.f274951d);
            }
        }
        this.f274952e.sendEmptyMessage(0);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$1");
    }
}
