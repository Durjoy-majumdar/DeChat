package com.google.android.gms.internal.measurement;

final class zzww extends zzws<Long> {
    public zzww(zzxc zzxc, String str, Long l) {
        super(zzxc, str, l, (zzww) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzez */
    public final Long zzey(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            new StringBuilder(String.valueOf(this.zzbnh).length() + 25 + String.valueOf(str).length());
            return null;
        }
    }
}
