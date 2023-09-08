package com.google.android.gms.stats;

import com.google.android.gms.stats.WakeLock;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;

final class zza implements WakeLock.Configuration {
    public final long getMaximumTimeout(String str, String str2) {
        return MAlarmHandler.NEXT_FIRE_INTERVAL;
    }

    public final boolean isWorkChainsEnabled() {
        return false;
    }
}
