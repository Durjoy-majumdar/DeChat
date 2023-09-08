package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.qc */
public final class C114096qc {

    /* renamed from: a */
    public final String f341455a;

    /* renamed from: b */
    public final String f341456b;

    /* renamed from: c */
    public final int f341457c;

    /* renamed from: d */
    public final String[] f341458d;

    public C114096qc(String str, String str2, String[] strArr, int i) {
        String[] strArr2;
        this.f341455a = str;
        this.f341456b = str2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            int length = strArr.length;
            String[] strArr3 = new String[length];
            System.arraycopy(strArr, 0, strArr3, 0, length);
            strArr2 = strArr3;
        }
        this.f341458d = strArr2;
        this.f341457c = i;
    }

    /* renamed from: a */
    private static String[] m159005a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        return strArr2;
    }
}
