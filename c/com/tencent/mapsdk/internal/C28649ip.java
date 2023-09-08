package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.ip */
public final class C28649ip implements C24236ix<Integer> {
    /* renamed from: a */
    public final /* synthetic */ Object mo41013a(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        return Integer.valueOf((int) (((float) intValue) + (f * ((float) (((Integer) obj2).intValue() - intValue)))));
    }

    /* renamed from: a */
    private static Integer m38314a(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        return Integer.valueOf((int) (((float) intValue) + (f * ((float) (num2.intValue() - intValue)))));
    }
}
