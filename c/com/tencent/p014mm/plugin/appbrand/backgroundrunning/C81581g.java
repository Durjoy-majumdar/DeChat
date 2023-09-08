package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import co0.C80123a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81590r;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82581d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82587e0;
import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.C83127a;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import li0.C88514d;
import p1066yc.C91424t;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.g */
public class C81581g implements C81590r.C29457a {
    /* renamed from: a */
    public void mo56714a(MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel) {
        Class cls = C81590r.class;
        Log.m105925i("MicroMsg.AppBrandBackgroundRunningMonitor", "onBackgroundRunningOperationReceived, operation:%s", mMBackgroundRunningOperationParcel);
        AppBrandRuntimeWC b = C81682d.m100222b(mMBackgroundRunningOperationParcel.f239244d);
        if (b == null) {
            Log.m105928w("MicroMsg.AppBrandBackgroundRunningMonitor", "onBackgroundRunningOperationReceived, runtime is null");
        } else if (mMBackgroundRunningOperationParcel.f239246f == 2) {
            if (C81583j.m100070b(mMBackgroundRunningOperationParcel.f239245e, 2)) {
                C82581d0 d0Var = (C82581d0) b.mo113032U(C82581d0.class);
                if (!(d0Var instanceof C82587e0)) {
                    Log.m105928w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundLocationIfNeed, invalid location state manager");
                } else {
                    C82587e0 e0Var = (C82587e0) d0Var;
                    if (e0Var.f241702n) {
                        e0Var.f241700i = true;
                        e0Var.sendMessage(2);
                        e0Var.mo114900e(b);
                        AppBrandBackgroundRunningMonitor.m100057b(b);
                    } else {
                        Log.m105928w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundLocationIfNeed, location state manager not in background mode");
                    }
                }
            }
            if (C81583j.m100070b(mMBackgroundRunningOperationParcel.f239245e, 4)) {
                C83127a aVar = (C83127a) b.mo113032U(C83127a.class);
                if (aVar == null || !aVar.mo113872c()) {
                    Log.m105928w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundVOIPIfNeed, voip state manager not running");
                } else {
                    synchronized (aVar) {
                        if (aVar.f242929i != null) {
                            Log.m105925i(aVar.f242924d, "stopVOIP, LivePusher:%s", aVar.f242929i.mo109508b());
                            aVar.f242929i.mo109510e();
                        }
                        for (C91424t next : aVar.f242930j) {
                            if (next != null) {
                                Log.m105925i(aVar.f242924d, "stopVOIP, LivePlayer:%s", next.mo109508b());
                                next.mo109510e();
                            }
                        }
                    }
                    Log.m105925i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveVOIPUsageOperation, runtime:%s", b.f238147j);
                    if (C86312j.m106911c(cls) != null) {
                        AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = new AppBrandBackgroundRunningOperationParcel();
                        appBrandBackgroundRunningOperationParcel.f239222d = b.f238147j;
                        appBrandBackgroundRunningOperationParcel.f239223e = b.f238149o.f239365g;
                        appBrandBackgroundRunningOperationParcel.f239224f = 4;
                        appBrandBackgroundRunningOperationParcel.f239225g = 2;
                        appBrandBackgroundRunningOperationParcel.f239231p = b.mo113210l1().f234811P;
                        if (b.mo113026R() != null) {
                            appBrandBackgroundRunningOperationParcel.f239226h = b.mo113026R().getClass().getName();
                        }
                        ((C81590r) C86312j.m106911c(cls)).mo56711qO(appBrandBackgroundRunningOperationParcel);
                    }
                    b.f238113K.f255667a.mo122987s(C88514d.C88522g.ON_STOP_BACKGROUND_LIVE_VOIP, (Object) null);
                }
            }
            if (C81583j.m100070b(mMBackgroundRunningOperationParcel.f239245e, 8)) {
                C80123a aVar2 = (C80123a) b.mo113032U(C80123a.class);
                if (aVar2 != null) {
                    Log.m105918d("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "isBackgroundAudioPlayPaused: " + aVar2.f234613i);
                    if (!aVar2.f234613i) {
                        aVar2.mo110364Q();
                        Log.m105925i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveAudioOfVideoBackgroundPlayUsageOperation, runtime:%s", b.f238147j);
                        if (C86312j.m106911c(cls) != null) {
                            AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel2 = new AppBrandBackgroundRunningOperationParcel();
                            appBrandBackgroundRunningOperationParcel2.f239222d = b.f238147j;
                            appBrandBackgroundRunningOperationParcel2.f239223e = b.f238149o.f239365g;
                            appBrandBackgroundRunningOperationParcel2.f239224f = 8;
                            appBrandBackgroundRunningOperationParcel2.f239225g = 2;
                            appBrandBackgroundRunningOperationParcel2.f239231p = b.mo113210l1().f234811P;
                            if (b.mo113026R() != null) {
                                appBrandBackgroundRunningOperationParcel2.f239226h = b.mo113026R().getClass().getName();
                            }
                            ((C81590r) C86312j.m106911c(cls)).mo56711qO(appBrandBackgroundRunningOperationParcel2);
                        }
                        b.f238113K.f255667a.mo122987s(C88514d.C88522g.ON_STOP_AUDIO_BACKGROUND_PLAY, (Object) null);
                    } else {
                        Log.m105924i("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundAudioPlayIfNeed, audioOfVideoBackgroundPlayManager isBackgroundAudioPlayPaused");
                    }
                } else {
                    Log.m105928w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundAudioPlayIfNeed, audioOfVideoBackgroundPlayManager not running");
                }
            }
            if (C81583j.m100070b(mMBackgroundRunningOperationParcel.f239245e, 16)) {
                C81595w wVar = (C81595w) b.mo113032U(C81595w.class);
                if (wVar == null || !wVar.mo113873c()) {
                    Log.m105928w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundVoIP1v1IfNeed, voip 1v1 state manager not running");
                    return;
                }
                wVar.mo113874d();
                Log.m105925i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveVoIP1v1UsageOperation, runtime:%s", b.f238147j);
                if (C86312j.m106911c(cls) != null) {
                    AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel3 = new AppBrandBackgroundRunningOperationParcel();
                    appBrandBackgroundRunningOperationParcel3.f239222d = b.f238147j;
                    appBrandBackgroundRunningOperationParcel3.f239223e = b.f238149o.f239365g;
                    appBrandBackgroundRunningOperationParcel3.f239224f = 16;
                    appBrandBackgroundRunningOperationParcel3.f239225g = 2;
                    appBrandBackgroundRunningOperationParcel3.f239231p = b.mo113210l1().f234811P;
                    if (b.mo113026R() != null) {
                        appBrandBackgroundRunningOperationParcel3.f239226h = b.mo113026R().getClass().getName();
                    }
                    ((C81590r) C86312j.m106911c(cls)).mo56711qO(appBrandBackgroundRunningOperationParcel3);
                }
                b.f238113K.f255667a.mo122987s(C88514d.C88522g.ON_STOP_BACKGROUND_VOIP_1v1, (Object) null);
            }
        }
    }
}
