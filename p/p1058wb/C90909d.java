package p1058wb;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.game.liblockstep.LockStepNative;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import hr0.C87583a;
import hr0.C87584b;
import java.util.ArrayList;
import p224ra.C89909e;
import tm0.C90538k;

/* renamed from: wb.d */
public class C90909d implements LockStepNative.ILockStepReportListener {
    public C90909d(C90912g gVar) {
    }

    public int getNetworkType() {
        try {
            C90538k.C90543e x = C90538k.m113361x(MMApplicationContext.getContext());
            Log.m105925i("Luggage.LockStepNativeInstallHelper", "networkType = %s", x.f260172d);
            Log.m105925i("Luggage.LockStepNativeInstallHelper", "getStatisticsNetType ret:%d", Integer.valueOf(NetStatusUtil.getNetType(MMApplicationContext.getContext())));
            if (x == C90538k.C90543e.None) {
                return -1;
            }
            if (x == C90538k.C90543e.Mobile_2g) {
                return 2;
            }
            if (x == C90538k.C90543e.Mobile_3g) {
                return 3;
            }
            if (x == C90538k.C90543e.Mobile_4g) {
                return 4;
            }
            if (x == C90538k.C90543e.Mobile_5g) {
                return 5;
            }
            return x == C90538k.C90543e.Wifi ? 1 : 0;
        } catch (Exception e) {
            Log.printErrStackTrace("Luggage.LockStepNativeInstallHelper", e, "getStatisticsNetType_", new Object[0]);
            return -1;
        }
    }

    public void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3) {
        Log.m105918d("Luggage.LockStepNativeInstallHelper", "mmudp onIdKeyStat");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            arrayList.add(new IDKey(iArr[i], iArr2[i], iArr3[i]));
        }
        ((C87583a) C89909e.m112439d(C87583a.class, true)).mo121687a(arrayList, false);
    }

    public void onKvStat(int i, String str) {
        Log.m105919d("Luggage.LockStepNativeInstallHelper", "mmudp onKvStat logId:%d", Integer.valueOf(i));
        ((C87584b) C89909e.m112439d(C87584b.class, true)).kvStat(i, str);
    }
}
