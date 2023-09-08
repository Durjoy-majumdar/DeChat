package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzjz {
    public final String name;
    public final String origin;
    public final Object value;
    public final long zzaqz;
    public final String zzti;

    public zzjz(String str, String str2, String str3, long j, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(obj);
        this.zzti = str;
        this.origin = str2;
        this.name = str3;
        this.zzaqz = j;
        this.value = obj;
    }
}
