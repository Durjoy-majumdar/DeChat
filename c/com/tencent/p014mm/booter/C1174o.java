package com.tencent.p014mm.booter;

import android.bluetooth.BluetoothAdapter;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C97625j3;
import f40.C86718e;

/* renamed from: com.tencent.mm.booter.o */
public class C1174o {
    /* renamed from: a */
    public static void m1324a() {
        if (C97625j3.m125811a() && !C86718e.m107551r()) {
            long nowSecond = Util.nowSecond();
            C85801v1 u = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SHAKE_KV_STAT_BLUETOOTH_POWER_STATE_TIME_LONG;
            if (Util.nullAs((Long) u.mo119685f(aVar, (Object) null), 0) < nowSecond) {
                C97625j3.m125812b().mo105906u().mo119677K(aVar, Long.valueOf((Util.getBeginTimeOfToday() / 1000) + 86400));
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter == null) {
                    return;
                }
                if (defaultAdapter.getState() == 12) {
                    C115669n.INSTANCE.mo160131h(11921, 1);
                } else if (defaultAdapter.getState() == 10) {
                    C115669n.INSTANCE.mo160131h(11921, 0);
                }
            }
        }
    }
}
