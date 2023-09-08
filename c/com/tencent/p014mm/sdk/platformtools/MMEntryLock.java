package com.tencent.p014mm.sdk.platformtools;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.mm.sdk.platformtools.MMEntryLock */
public final class MMEntryLock {
    private static final String TAG = "MicroMsg.MMEntryLock";
    private static Set<String> locks = new HashSet();

    private MMEntryLock() {
    }

    public static boolean isLocked(String str) {
        return locks.contains(str);
    }

    public static boolean lock(String str) {
        if (isLocked(str)) {
            Log.m105918d(TAG, "locked-" + str);
            return false;
        }
        Log.m105918d(TAG, "lock-" + str);
        return locks.add(str);
    }

    public static void unlock(String str) {
        locks.remove(str);
        Log.m105918d(TAG, "unlock-" + str);
    }
}
