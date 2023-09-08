package com.google.android.gms.internal.measurement;

final class zzwx extends zzws<Integer> {
    public zzwx(zzxc zzxc, String str, Integer num) {
        super(zzxc, str, num, (zzww) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzfa */
    public final Integer zzey(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            new StringBuilder(String.valueOf(this.zzbnh).length() + 28 + String.valueOf(str).length());
            return null;
        }
    }
}
