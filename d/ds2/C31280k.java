package ds2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;

/* renamed from: ds2.k */
public final class C31280k {

    /* renamed from: a */
    public static final C31280k f83760a = new C31280k();

    /* renamed from: b */
    public static int f83761b = 1;

    /* renamed from: c */
    public static long f83762c;

    /* renamed from: a */
    public final boolean mo58046a() {
        SnsMethodCalculate.markStartTimeMs("getOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        boolean b = mo58047b();
        int c = mo58048c();
        Log.m105924i("MicroMsg.SnsVideoOptionConfig", "getOptionEnable >> " + f83761b + ", " + c);
        boolean z = b && c != 0;
        SnsMethodCalculate.markEndTimeMs("getOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return z;
    }

    /* renamed from: b */
    public final boolean mo58047b() {
        SnsMethodCalculate.markStartTimeMs("getServerOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = true;
        if (currentTimeMillis - f83762c >= 60000) {
            Log.m105924i("MicroMsg.SnsVideoOptionConfig", "getOptionEnable is time to update");
            f83762c = currentTimeMillis;
            f83761b = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_BIT_RATE_MODE_INT, 1);
        }
        Log.m105924i("MicroMsg.SnsVideoOptionConfig", "getServerOptionEnable >> " + f83761b);
        if (f83761b != 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("getServerOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return z;
    }

    /* renamed from: c */
    public final int mo58048c() {
        SnsMethodCalculate.markStartTimeMs("getVideoOptionConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        SnsMethodCalculate.markStartTimeMs("getVideoOptionLocalConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_VDIEO_DOWNLOAD_INT_SYNC, 0);
        Log.m105924i("MicroMsg.SnsVideoOptionConfig", "getVideoOptionLocalConfig >> " + j);
        SnsMethodCalculate.markEndTimeMs("getVideoOptionLocalConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        if (j != 0) {
            SnsMethodCalculate.markEndTimeMs("getVideoOptionConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            return j;
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_switch_video_enable, 0);
        Log.m105924i("MicroMsg.SnsVideoOptionConfig", "getVideoOptionConfig >> " + Qe);
        SnsMethodCalculate.markEndTimeMs("getVideoOptionConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return Qe;
    }

    /* renamed from: d */
    public final boolean mo58049d() {
        SnsMethodCalculate.markStartTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_ws_small_win_video_enable, false);
        Log.m105924i("MicroMsg.SnsVideoOptionConfig", "getWsExptConfig >> " + wf);
        SnsMethodCalculate.markEndTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return wf;
    }
}
