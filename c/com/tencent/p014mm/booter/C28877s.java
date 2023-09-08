package com.tencent.p014mm.booter;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import kj2.C117407d;

/* renamed from: com.tencent.mm.booter.s */
public class C28877s {

    /* renamed from: a */
    public static long f79275a = -1;

    /* renamed from: a */
    public static void m38411a() {
        if (f79275a < 0) {
            f79275a = MMApplicationContext.getContext().getSharedPreferences("fix_wrong_mig_report", 0).getLong("last_report", -1);
        }
        if (f79275a < 0 || System.currentTimeMillis() - f79275a > 86400000) {
            int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC, 0);
            ArrayList arrayList = new ArrayList();
            if (j > 0) {
                arrayList.add(new IDKey(1912, 100, 1));
            }
            if (j == 1) {
                arrayList.add(new IDKey(1912, 101, 1));
            } else if (j == 2) {
                arrayList.add(new IDKey(1912, 102, 1));
            } else if (j == 3) {
                arrayList.add(new IDKey(1912, 103, 1));
            }
            arrayList.add(new IDKey(1912, 105, 1));
            C117407d dVar = C117407d.INSTANCE;
            dVar.mo160124a(arrayList, true);
            if (!(j == 0 || j == 2)) {
                dVar.mo160131h(21388, "@WrongMigration-scanAndRescue", 0, Integer.valueOf(j), "", 0, 0, 0, 0, 0, 0, 0, 0, BuildInfo.REV);
            }
            f79275a = System.currentTimeMillis();
            MMApplicationContext.getContext().getSharedPreferences("fix_wrong_mig_report", 0).edit().putLong("last_report", f79275a).commit();
        }
    }
}
