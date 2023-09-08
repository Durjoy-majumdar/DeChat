package com.tencent.p014mm.booter;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import kj2.C117407d;

/* renamed from: com.tencent.mm.booter.q */
public class C28876q {

    /* renamed from: a */
    public static long f79274a = -1;

    /* renamed from: a */
    public static void m38410a() {
        if (f79274a < 0) {
            f79274a = MMApplicationContext.getContext().getSharedPreferences("c2c_migration_report", 0).getLong("last_report", -1);
        }
        if (f79274a < 0 || System.currentTimeMillis() - f79274a > 86400000) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new IDKey(1944, 0, 1));
            arrayList.add(new IDKey(1944, 1, 1));
            C117407d.INSTANCE.mo160124a(arrayList, true);
            f79274a = System.currentTimeMillis();
            MMApplicationContext.getContext().getSharedPreferences("c2c_migration_report", 0).edit().putLong("last_report", f79274a).commit();
        }
    }
}
