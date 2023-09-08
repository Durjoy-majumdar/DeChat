package com.tencent.p014mm.booter;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C97625j3;
import f40.C86718e;
import java.util.ArrayList;
import kj2.C117407d;
import p156gj.C32461x;

/* renamed from: com.tencent.mm.booter.t */
public class C28878t {
    /* renamed from: a */
    public static void m38412a() {
        try {
            if (!C97625j3.m125811a()) {
                return;
            }
            if (!C86718e.m107551r()) {
                C85801v1 u = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_OS_INFO_REPORT_LONG_SYNC;
                if (Util.secondsToNow(Util.nullAs((Long) u.mo119685f(aVar, (Object) null), 0)) >= 86400) {
                    boolean a = C32461x.m39732a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new IDKey(1776, 100, 1));
                    if (a) {
                        arrayList.add(new IDKey(1776, 101, 1));
                    } else {
                        arrayList.add(new IDKey(1776, 102, 1));
                    }
                    C117407d.INSTANCE.mo160124a(arrayList, false);
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, Long.valueOf(Util.nowSecond()));
                    Log.m105924i("MicroMsg.PostTaskReportOSInfo", "report PostTaskReportOSInfo done ");
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.PostTaskReportOSInfo", th, "", new Object[0]);
        }
    }
}
