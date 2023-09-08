package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzeq {
    public final String name;
    public final long zzafr;
    public final long zzafs;
    public final long zzaft;
    public final long zzafu;
    public final Long zzafv;
    public final Long zzafw;
    public final Boolean zzafx;
    public final String zzti;

    public zzeq(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Boolean bool) {
        long j5 = j;
        long j6 = j2;
        long j7 = j4;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        boolean z = true;
        Preconditions.checkArgument(j5 >= 0);
        Preconditions.checkArgument(j6 >= 0);
        Preconditions.checkArgument(j7 < 0 ? false : z);
        this.zzti = str;
        this.name = str2;
        this.zzafr = j5;
        this.zzafs = j6;
        this.zzaft = j3;
        this.zzafu = j7;
        this.zzafv = l;
        this.zzafw = l2;
        this.zzafx = bool;
    }

    public final zzeq zza(Long l, Long l2, Boolean bool) {
        return new zzeq(this.zzti, this.name, this.zzafr, this.zzafs, this.zzaft, this.zzafu, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final zzeq zzac(long j) {
        return new zzeq(this.zzti, this.name, this.zzafr, this.zzafs, j, this.zzafu, this.zzafv, this.zzafw, this.zzafx);
    }

    public final zzeq zzad(long j) {
        return new zzeq(this.zzti, this.name, this.zzafr, this.zzafs, this.zzaft, j, this.zzafv, this.zzafw, this.zzafx);
    }

    public final zzeq zzie() {
        return new zzeq(this.zzti, this.name, this.zzafr + 1, 1 + this.zzafs, this.zzaft, this.zzafu, this.zzafv, this.zzafw, this.zzafx);
    }
}
