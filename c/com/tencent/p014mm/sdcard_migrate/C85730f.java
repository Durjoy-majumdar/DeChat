package com.tencent.p014mm.sdcard_migrate;

import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.io.File;

/* renamed from: com.tencent.mm.sdcard_migrate.f */
public final class C85730f {
    /* renamed from: a */
    public static boolean m105911a(String str) {
        return MultiProcessMMKV.getMMKV("extmig_status_memo_storage").getBoolean("key_is_migrated_" + m105913c(str), false);
    }

    /* renamed from: b */
    public static void m105912b(String str, boolean z) {
        MultiProcessMMKV.getMMKV("extmig_status_memo_storage").encode("key_is_migrated_" + m105913c(str), z);
    }

    /* renamed from: c */
    public static String m105913c(String str) {
        File file = new File(str);
        try {
            return file.getCanonicalPath();
        } catch (Throwable th) {
            Object[] objArr = {str};
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.ExtStorageMigrateStatus", th, "[-] Fail to get canonical path for: %s", objArr);
            return file.getAbsolutePath();
        }
    }
}
