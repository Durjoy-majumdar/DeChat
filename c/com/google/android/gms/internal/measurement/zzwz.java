package com.google.android.gms.internal.measurement;

final class zzwz extends zzws<Double> {
    public zzwz(zzxc zzxc, String str, Double d) {
        super(zzxc, str, d, (zzww) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzfb */
    public final Double zzey(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            new StringBuilder(String.valueOf(this.zzbnh).length() + 27 + String.valueOf(str).length());
            return null;
        }
    }
}
