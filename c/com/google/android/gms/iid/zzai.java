package com.google.android.gms.iid;

abstract class zzai {
    private static zzai zzcy;

    public static synchronized zzai zzw() {
        zzai zzai;
        synchronized (zzai.class) {
            if (zzcy == null) {
                zzcy = new zzac();
            }
            zzai = zzcy;
        }
        return zzai;
    }

    public abstract zzaj<Boolean> zzd(String str, boolean z);
}
