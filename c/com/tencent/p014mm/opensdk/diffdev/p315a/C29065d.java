package com.tencent.p014mm.opensdk.diffdev.p315a;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.d */
public enum C29065d {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(404),
    UUID_CONFIRM(405),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);
    

    /* renamed from: a */
    private int f79618a;

    private C29065d(int i) {
        this.f79618a = i;
    }

    /* renamed from: a */
    public int mo56429a() {
        return this.f79618a;
    }

    public String toString() {
        return "UUIDStatusCode:" + this.f79618a;
    }
}
