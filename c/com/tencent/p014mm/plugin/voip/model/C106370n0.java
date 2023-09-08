package com.tencent.p014mm.plugin.voip.model;

import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthNr;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z33.C112597j;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.model.n0 */
public class C106370n0 extends PhoneStateListener {

    /* renamed from: a */
    public final /* synthetic */ TelephonyManager f317440a;

    /* renamed from: b */
    public final /* synthetic */ C106359m0 f317441b;

    /* renamed from: com.tencent.mm.plugin.voip.model.n0$a */
    public class C106371a implements Runnable {
        public C106371a() {
        }

        public void run() {
            ArrayList arrayList = new ArrayList();
            try {
                List<CellInfo> list = (List) C117292a.m165363i(C106370n0.this.f317440a, "com/tencent/mm/plugin/voip/model/VoipServiceEx$6$1", "run", "()V", "android/telephony/TelephonyManager", "getAllCellInfo", "()Ljava/util/List;");
                Log.m105919d("MicroMsg.Voip.VoipServiceEx", "cellInfoList size:%d", Integer.valueOf(list.size()));
                for (CellInfo cellInfo : list) {
                    Log.m105919d("MicroMsg.Voip.VoipServiceEx", "cellinfo: %s", cellInfo.toString());
                    if (cellInfo.isRegistered()) {
                        arrayList.add(Integer.valueOf(cellInfo instanceof CellInfoGsm ? ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm() : cellInfo instanceof CellInfoCdma ? ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm() : cellInfo instanceof CellInfoWcdma ? ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm() : cellInfo instanceof CellInfoLte ? ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm() : (Build.VERSION.SDK_INT < 29 || !(cellInfo instanceof CellInfoNr)) ? 1 : ((CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength()).getDbm()));
                    }
                }
            } catch (Exception unused) {
                C112597j.m153938c("MicroMsg.Voip.VoipServiceEx", "get cell dbm info exception");
            }
            Log.m105919d("MicroMsg.Voip.VoipServiceEx", "dbms size: %d", Integer.valueOf(arrayList.size()));
            Collections.sort(arrayList);
            if (arrayList.size() > 0) {
                C106359m0.f317390A = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
            } else {
                C106359m0.f317390A = 1;
            }
        }
    }

    public C106370n0(C106359m0 m0Var, TelephonyManager telephonyManager) {
        this.f317441b = m0Var;
        this.f317440a = telephonyManager;
    }

    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
        ((C119157j) C119157j.f356862d).mo183876g(new C106371a(), "getAllCellInfo-thread");
    }
}
