package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import h81.C32735h;
import kp0.C33964a;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.s */
public class C29680s {
    /* renamed from: a */
    public static int m38856a() {
        Class cls = C32735h.class;
        if (C86312j.m106911c(cls) == null) {
            return 2500;
        }
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_xweb_video_loadcontrol_bufferforplaybackms, 2500);
        Log.m105925i("MicroMsg.SameLayer.AppBrandAVABTests", "getXWebVideoBufferForPlaybackMS, expt is %s", Integer.valueOf(Qe));
        return Qe;
    }

    /* renamed from: b */
    public static int m38857b() {
        Class cls = C32735h.class;
        if (C86312j.m106911c(cls) == null) {
            return 30000;
        }
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_xweb_video_loadcontrol_maxbufferms, 30000);
        Log.m105925i("MicroMsg.SameLayer.AppBrandAVABTests", "getXWebVideoMaxBufferMS, expt is %s", Integer.valueOf(Qe));
        return Qe;
    }

    /* renamed from: c */
    public static int m38858c() {
        Class cls = C32735h.class;
        if (C86312j.m106911c(cls) == null) {
            return 15000;
        }
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_xweb_video_loadcontrol_minbufferms, 15000);
        Log.m105925i("MicroMsg.SameLayer.AppBrandAVABTests", "getXWebVideoMinBufferDuration, expt is %s", Integer.valueOf(Qe));
        return Qe;
    }

    /* renamed from: d */
    public static int m38859d() {
        Class cls = C32735h.class;
        int decodeInt = MultiProcessMMKV.getMMKV("xweb_abtest_command").decodeInt("xweb_video_player_command_value", -1);
        if (-1 != decodeInt) {
            return decodeInt;
        }
        C13601g gVar = C33964a.f91707a;
        boolean z = true;
        if (((Boolean) ((C36570n) C33964a.f91707a).getValue()).booleanValue()) {
            C32735h hVar = (C32735h) C86312j.m106911c(cls);
            boolean wf = hVar != null ? hVar.mo58784wf(C32735h.C32737c.clicfg_android_wxa_video_sys_in_3g, true) : true;
            Log.m105924i("MicroMsg.SameLayer.AppBrandAVABTests", "useSysPlayerIn3GUserSpace, " + wf);
            if (wf) {
                return 3;
            }
        }
        C32735h hVar2 = (C32735h) C86312j.m106911c(cls);
        if (hVar2 != null) {
            z = hVar2.mo58784wf(C32735h.C32737c.clicfg_android_xweb_video_tp, true);
            Log.m105924i("MicroMsg.SameLayer.AppBrandAVABTests", "useThumbPlayer, expt is " + z);
        }
        return z ? 5 : 4;
    }
}
