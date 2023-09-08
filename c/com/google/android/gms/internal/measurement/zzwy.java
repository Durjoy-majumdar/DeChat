package com.google.android.gms.internal.measurement;

final class zzwy extends zzws<Boolean> {
    public zzwy(zzxc zzxc, String str, Boolean bool) {
        super(zzxc, str, bool, (zzww) null);
    }

    public final /* synthetic */ Object zzey(String str) {
        if (zzwn.zzbmi.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (zzwn.zzbmj.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        new StringBuilder(String.valueOf(this.zzbnh).length() + 28 + String.valueOf(str).length());
        return null;
    }
}
