package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.jv */
public final class C28650jv extends C113849jm {

    /* renamed from: a */
    public String f78605a;

    public C28650jv() {
    }

    /* renamed from: a */
    public final int mo56234a() {
        return mo56236b().length;
    }

    /* renamed from: b */
    public final byte[] mo56236b() {
        String str = this.f78605a;
        return str != null ? str.getBytes() : new byte[0];
    }

    public final String toString() {
        return "StringData{strData='" + this.f78605a + '\'' + '}';
    }

    private C28650jv(String str) {
        this.f78605a = str;
    }

    /* renamed from: a */
    public final void mo56235a(byte[] bArr) {
        this.f78605a = new String(bArr);
    }
}
