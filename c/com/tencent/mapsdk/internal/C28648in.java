package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.in */
public final class C28648in implements C24236ix<Number> {
    /* renamed from: a */
    public final /* synthetic */ Object mo41013a(float f, Object obj, Object obj2) {
        double doubleValue = ((Number) obj).doubleValue();
        return Double.valueOf(doubleValue + (((double) f) * (((Number) obj2).doubleValue() - doubleValue)));
    }

    /* renamed from: a */
    private static Number m38312a(float f, Number number, Number number2) {
        double doubleValue = number.doubleValue();
        return Double.valueOf(doubleValue + (((double) f) * (number2.doubleValue() - doubleValue)));
    }
}
