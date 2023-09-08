package nu0;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import p156gj.C107835h0;
import qu0.C110472b;

/* renamed from: nu0.a */
public final class C109758a {

    /* renamed from: a */
    public static String f328509a;

    /* renamed from: b */
    public static boolean f328510b;

    /* renamed from: c */
    public static int f328511c;

    /* renamed from: d */
    public static String f328512d;

    /* renamed from: e */
    public static long f328513e;

    /* renamed from: a */
    public static final void m149086a(String str) {
        C87412m.m108594g(str, "type");
        Log.m105924i("MicroMsg.BluetoothMgr", "refreshForbiddenCauseVoipRequest，" + str);
        C110472b.f330368d = true;
        f328511c = 0;
    }

    /* renamed from: b */
    public static final void m149087b() {
        int i;
        Class cls = C32735h.class;
        long ticksToNow = Util.ticksToNow(f328513e);
        int i2 = 50;
        if (!BuildInfo.IS_FLAVOR_RED) {
            int i3 = C107835h0.f322846c.f322773v;
            if (i3 == -1) {
                i3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_audio_bluetooth_forbid_use_sco_refresh_time, 50);
            }
            i2 = i3;
        }
        if (ticksToNow > ((long) (i2 * 1000))) {
            if (BuildInfo.IS_FLAVOR_RED) {
                i = 1;
            } else {
                i = C107835h0.f322846c.f322771u;
                if (i == -1) {
                    i = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_audio_bluetooth_forbid_use_sco_strategy, 1);
                }
            }
            if (i == 1) {
                Log.m105924i("MicroMsg.BluetoothMgr", "refresh forbidden time");
                C110472b.f330368d = true;
            }
        }
        f328511c = 0;
    }
}
