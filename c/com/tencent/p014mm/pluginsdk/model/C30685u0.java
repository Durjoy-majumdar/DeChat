package com.tencent.p014mm.pluginsdk.model;

import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import h81.C32735h;
import p663qo.C101211h;

/* renamed from: com.tencent.mm.pluginsdk.model.u0 */
public final class C30685u0 {

    /* renamed from: a */
    public static final C30685u0 f82571a = new C30685u0();

    /* renamed from: a */
    public final boolean mo57539a() {
        Class cls = C32735h.class;
        boolean z = false;
        if (!BuildInfo.IS_ARM64) {
            return false;
        }
        if (!((C101211h) C86312j.m106911c(C101211h.class)).mo140276It()) {
            Log.m105924i("MicroMsg.ImportVideoHevcChecker", "importVideoEnableHevc: hevc not support");
            return false;
        }
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Media_ImportVideoRemuxHevc_Int, 0);
        boolean z2 = true;
        boolean z3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_import_video_enable_hevc_soft, 0) == 1;
        Log.m105924i("MicroMsg.ImportVideoHevcChecker", "importVideoEnableHevc software encode enable:" + z3);
        int i = MultiProcessMMKV.getMMKV("mmkv_gpu_info").getInt("gpu_info_rating", -1);
        if (z3) {
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_import_video_enable_hevc_soft_gpu_rating_limit, -1);
            Log.m105924i("MicroMsg.ImportVideoHevcChecker", "importVideoEnableHevc software encode gpu rating limit:" + Qe + ", gpuRating:" + i);
            if (Qe > 0 && i >= Qe) {
                z = true;
            }
        } else {
            z = z3;
        }
        if (e != 1) {
            z2 = z;
        }
        Log.m105924i("MicroMsg.ImportVideoHevcChecker", "importVideoEnableHevc software encode enable:" + z2 + ", repairerConfig:" + e + ", gpuRating:" + i);
        return z2;
    }
}
