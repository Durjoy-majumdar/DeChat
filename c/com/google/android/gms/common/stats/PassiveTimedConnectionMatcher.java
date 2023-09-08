package com.google.android.gms.common.stats;

import android.os.SystemClock;
import p1042u.C111059i;

public class PassiveTimedConnectionMatcher {
    private final long zzym;
    private final int zzyn;
    private final C111059i<String, Long> zzyo;

    public PassiveTimedConnectionMatcher() {
        this.zzym = 60000;
        this.zzyn = 10;
        this.zzyo = new C111059i<>(10);
    }

    public PassiveTimedConnectionMatcher(int i, long j) {
        this.zzym = j;
        this.zzyn = i;
        this.zzyo = new C111059i<>();
    }

    public Long get(String str) {
        Long orDefault;
        synchronized (this) {
            orDefault = this.zzyo.getOrDefault(str, null);
        }
        return orDefault;
    }

    public Long put(String str) {
        Long put;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zzym;
        synchronized (this) {
            while (true) {
                C111059i<String, Long> iVar = this.zzyo;
                int i = iVar.f332583f;
                if (i >= this.zzyn) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        if (elapsedRealtime - this.zzyo.mo162791l(i2).longValue() > j) {
                            this.zzyo.mo162790k(i2);
                        }
                    }
                    j /= 2;
                } else {
                    put = iVar.put(str, Long.valueOf(elapsedRealtime));
                }
            }
        }
        return put;
    }

    public boolean remove(String str) {
        boolean z;
        synchronized (this) {
            z = this.zzyo.remove(str) != null;
        }
        return z;
    }

    public boolean removeByPrefix(String str) {
        boolean z;
        synchronized (this) {
            z = false;
            for (int i = 0; i < size(); i++) {
                String j = this.zzyo.mo162789j(i);
                if (j != null && j.startsWith(str)) {
                    this.zzyo.remove(j);
                    z = true;
                }
            }
        }
        return z;
    }

    public int size() {
        int i;
        synchronized (this) {
            i = this.zzyo.f332583f;
        }
        return i;
    }
}
