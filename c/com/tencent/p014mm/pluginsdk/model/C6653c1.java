package com.tencent.p014mm.pluginsdk.model;

/* renamed from: com.tencent.mm.pluginsdk.model.c1 */
public class C6653c1 {

    /* renamed from: a */
    public int f23969a;

    /* renamed from: b */
    public String f23970b;

    /* renamed from: c */
    public String f23971c;

    /* renamed from: d */
    public String f23972d;

    /* renamed from: e */
    public String f23973e;

    /* renamed from: f */
    public int f23974f;

    public C6653c1(int i, String str, String str2, String str3, String str4, int i2) {
        this.f23969a = i;
        this.f23970b = str;
        this.f23971c = str2;
        this.f23974f = i2;
        this.f23972d = str3;
        this.f23973e = str4;
    }

    public String toString() {
        return "id:" + this.f23969a + ";productId:" + this.f23970b + ";full:" + this.f23971c + ";productState:" + this.f23974f + ";priceCurrencyCode:" + this.f23972d + ";priceAmountMicros:" + this.f23973e;
    }
}
