package com.tencent.p014mm.modelstat;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.TrafficStats;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;

/* renamed from: com.tencent.mm.modelstat.s */
public final class C114749s {
    /* renamed from: a */
    public static void m161432a(long j, long j2, int i) {
        C114747n nVar = new C114747n();
        nVar.f344035l = j;
        nVar.f344047x = j2;
        nVar.f344024a = 12585984;
        m161434c(nVar);
        m161435d(nVar, i);
        C29048w.wx0().mo174392jo(nVar);
    }

    /* renamed from: b */
    public static void m161433b(long j, long j2, int i) {
        C114747n nVar = new C114747n();
        nVar.f344036m = j;
        nVar.f344048y = j2;
        nVar.f344024a = 12585984;
        m161434c(nVar);
        m161435d(nVar, i);
        C29048w.wx0().mo174392jo(nVar);
    }

    /* renamed from: c */
    public static void m161434c(C114747n nVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            TrafficStats.updateNsm(MMApplicationContext.getContext());
        } else {
            TrafficStats.update();
        }
        nVar.f344037n = TrafficStats.getMobileRx(0);
        nVar.f344049z = TrafficStats.getMobileTx(0);
        nVar.f344038o = TrafficStats.getWifiRx(0);
        nVar.f344019A = TrafficStats.getWifiTx(0);
        nVar.f344020B = TrafficStats.getWxMobileRx(0);
        nVar.f344022D = TrafficStats.getWxMobileTx(0);
        nVar.f344021C = TrafficStats.getWxWifiRx(0);
        nVar.f344023E = TrafficStats.getWxWifiTx(0);
        nVar.f344024a = nVar.f344024a | 8192 | TPMediaCodecProfileLevel.HEVCHighTierLevel62 | 4096 | TPMediaCodecProfileLevel.HEVCMainTierLevel62 | 134217728 | 536870912 | 67108864 | 268435456;
    }

    /* renamed from: d */
    public static void m161435d(C114747n nVar, int i) {
        if (i != 109) {
            if (i == 110) {
                nVar.f344042s = nVar.f344047x + nVar.f344048y;
                nVar.f344024a |= 131072;
                return;
            } else if (i != 123) {
                if (i == 522) {
                    nVar.f344040q = nVar.f344047x + nVar.f344048y;
                    nVar.f344024a |= 32768;
                    return;
                } else if (i == 127) {
                    nVar.f344044u = nVar.f344047x + nVar.f344048y;
                    nVar.f344024a |= 524288;
                    return;
                } else if (i == 128) {
                    nVar.f344032i = nVar.f344035l + nVar.f344036m;
                    nVar.f344024a |= 128;
                    return;
                } else if (i == 138 || i == 139) {
                    nVar.f344028e = nVar.f344035l + nVar.f344036m;
                    nVar.f344024a |= 8;
                    return;
                } else if (i == 149) {
                    nVar.f344046w = nVar.f344047x + nVar.f344048y;
                    nVar.f344024a |= 2097152;
                    return;
                } else if (i == 150) {
                    nVar.f344034k = nVar.f344035l + nVar.f344036m;
                    nVar.f344024a |= 512;
                    return;
                } else {
                    return;
                }
            }
        }
        nVar.f344030g = nVar.f344035l + nVar.f344036m;
        nVar.f344024a |= 32;
    }
}
