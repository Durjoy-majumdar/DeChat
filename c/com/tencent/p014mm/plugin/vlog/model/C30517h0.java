package com.tencent.p014mm.plugin.vlog.model;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import fh2.C32051e;
import gy3.C87412m;
import h81.C32735h;
import java.util.Iterator;
import java.util.List;
import p663qo.C101211h;
import w80.C111744e;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.vlog.model.h0 */
public final class C30517h0 {
    /* renamed from: a */
    public static final boolean m39112a() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_edit_enable_add_finder_audio, 0) == 1;
    }

    /* renamed from: b */
    public static final boolean m39113b() {
        return MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY").getInt("FINDER_FOLLOW_PAT_ENTRANCE", 0) == 1 || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_follow_pat_entrance, 0) == 1;
    }

    /* renamed from: c */
    public static final boolean m39114c() {
        if (!BuildInfo.IS_FLAVOR_PURPLE) {
            boolean z = BuildInfo.DEBUG;
        }
        return MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_EDITOR_MAGIC_INT_SYNC", 0) == 1;
    }

    /* renamed from: d */
    public static final boolean m39115d() {
        MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_EDITOR_VIDEO_TEMPLATE_INT_SYNC", 0);
        return false;
    }

    /* renamed from: e */
    public static final boolean m39116e() {
        boolean z;
        boolean z2;
        boolean z3;
        if (FinderVideoShell.f82198a.mo57453a()) {
            return FinderVideoShell.f82215r == 2;
        }
        int i = MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_HEVC_ENCODE_OPTION_INT_SYNC", 0);
        C32051e eVar = C32051e.f85290a;
        Class cls = C32735h.class;
        if (!((C101211h) C86312j.m106911c(C101211h.class)).mo140276It()) {
            Log.m105924i("MicroMsg.HevcEncodeChecker", "canEncodeHevcHard: hevc not support");
        } else {
            boolean z4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_enable_hevc_hard_encode, 0) == 1;
            Log.m105924i("MicroMsg.HevcEncodeChecker", "canEncodeHevcHard, svr isEnable:" + z4 + ", cpuName:" + C32051e.f85291b);
            if (z4) {
                if (!(C32051e.f85291b.length() == 0)) {
                    String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_enable_hevc_hard_cpu_list, "");
                    Log.m105924i("MicroMsg.HevcEncodeChecker", "canEncodeHevcHard, hardCpuList:" + Y60);
                    C87412m.m108593f(Y60, "hardCpuList");
                    List U = C112550d0.m153785U(Y60, new String[]{";"}, false, 0, 6, (Object) null);
                    if (!U.isEmpty()) {
                        Iterator it = U.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String str = (String) it.next();
                            if (!(str.length() > 0) || !C112550d0.m153803w(C32051e.f85291b, str, false, 2, (Object) null)) {
                                z3 = false;
                                continue;
                            } else {
                                z3 = true;
                                continue;
                            }
                            if (z3) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        z = true;
                        return i == 2 || z;
                    }
                }
            }
        }
        z = false;
        if (i == 2) {
            return true;
        }
    }

    /* renamed from: f */
    public static final boolean m39117f(boolean z, long j) {
        boolean z2 = z;
        long j2 = j;
        boolean z3 = false;
        if (FinderVideoShell.f82198a.mo57453a()) {
            return FinderVideoShell.f82215r == 1;
        }
        int i = MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_HEVC_ENCODE_OPTION_INT_SYNC", -1);
        C32051e eVar = C32051e.f85290a;
        Class cls = C32735h.class;
        if (BuildInfo.IS_ARM64) {
            if (!((C101211h) C86312j.m106911c(C101211h.class)).mo140276It()) {
                Log.m105924i("MicroMsg.HevcEncodeChecker", "finderEnableHevcSoft: hevc not support");
            } else {
                boolean z4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_enable_hevc_soft_encode, 0) == 1;
                boolean z5 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_enable_hevc_soft_encode_long_video, 0) == 1;
                long He = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_enable_hevc_soft_encode_long_video_max_duration, MAlarmHandler.NEXT_FIRE_INTERVAL);
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_enable_hevc_min_gpu_rating, -1);
                int f = C111744e.f334654d.mo163483f();
                boolean z6 = !z2 ? z4 : z5 && j2 <= He;
                Log.m105924i("MicroMsg.HevcEncodeChecker", "canEncodeHevcSoft, svr isEnable:" + z6 + ", cpuName:" + C32051e.f85291b + ", longVideo:" + z2 + ", duration:" + j2 + ", enableShortSoft:" + z4 + ", enableLongSoft:" + z5 + ", longSoftDurationLimit:" + He + ", enableSoftMinGpuRating:" + Qe + ", gpuRating:" + f);
                z3 = z6 && f > 0 && Qe > 0 && f >= Qe;
            }
        }
        return i != -1 ? i == 1 : z3;
    }
}
