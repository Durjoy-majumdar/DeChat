package com.tencent.mapsdk.internal;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.h */
public final class C113797h extends C114029p {

    /* renamed from: k */
    public static byte[] f340449k = null;

    /* renamed from: l */
    public static Map<String, String> f340450l = null;

    /* renamed from: m */
    public static final /* synthetic */ boolean f340451m = true;

    /* renamed from: a */
    public short f340452a;

    /* renamed from: b */
    public byte f340453b;

    /* renamed from: c */
    public int f340454c;

    /* renamed from: d */
    public int f340455d;

    /* renamed from: e */
    public String f340456e;

    /* renamed from: f */
    public String f340457f;

    /* renamed from: g */
    public byte[] f340458g;

    /* renamed from: h */
    public int f340459h;

    /* renamed from: i */
    public Map<String, String> f340460i;

    /* renamed from: j */
    public Map<String, String> f340461j;

    static {
        Class<C113797h> cls = C113797h.class;
    }

    public C113797h() {
        this.f340452a = 0;
        this.f340453b = 0;
        this.f340454c = 0;
        this.f340455d = 0;
        this.f340456e = null;
        this.f340457f = null;
        this.f340459h = 0;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f340451m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final void display(StringBuilder sb, int i) {
        C113864k kVar = new C113864k(sb, i);
        kVar.mo172264a(this.f340452a, "iVersion");
        kVar.mo172251a(this.f340453b, "cPacketType");
        kVar.mo172253a(this.f340454c, "iMessageType");
        kVar.mo172253a(this.f340455d, "iRequestId");
        kVar.mo172259a(this.f340456e, "sServantName");
        kVar.mo172259a(this.f340457f, "sFuncName");
        kVar.mo172266a(this.f340458g, "sBuffer");
        kVar.mo172253a(this.f340459h, "iTimeout");
        kVar.mo172263a(this.f340460i, "context");
        kVar.mo172263a(this.f340461j, "status");
    }

    public final boolean equals(Object obj) {
        C113797h hVar = (C113797h) obj;
        return C114095q.m158989a(1, (int) hVar.f340452a) && C114095q.m158989a(1, (int) hVar.f340453b) && C114095q.m158989a(1, hVar.f340454c) && C114095q.m158989a(1, hVar.f340455d) && C114095q.m158991a((Object) 1, (Object) hVar.f340456e) && C114095q.m158991a((Object) 1, (Object) hVar.f340457f) && C114095q.m158991a((Object) 1, (Object) hVar.f340458g) && C114095q.m158989a(1, hVar.f340459h) && C114095q.m158991a((Object) 1, (Object) hVar.f340460i) && C114095q.m158991a((Object) 1, (Object) hVar.f340461j);
    }

    public final void readFrom(C113953m mVar) {
        try {
            this.f340452a = mVar.mo172386a(this.f340452a, 1, true);
            this.f340453b = mVar.mo172376a(this.f340453b, 2, true);
            this.f340454c = mVar.mo172379a(this.f340454c, 3, true);
            this.f340455d = mVar.mo172379a(this.f340455d, 4, true);
            this.f340456e = mVar.mo172389b(5, true);
            this.f340457f = mVar.mo172389b(6, true);
            if (f340449k == null) {
                f340449k = new byte[]{0};
            }
            this.f340458g = mVar.mo172390c(7, true);
            this.f340459h = mVar.mo172379a(this.f340459h, 8, true);
            if (f340450l == null) {
                HashMap hashMap = new HashMap();
                f340450l = hashMap;
                hashMap.put("", "");
            }
            this.f340460i = (Map) mVar.mo172384a(f340450l, 9, true);
            if (f340450l == null) {
                HashMap hashMap2 = new HashMap();
                f340450l = hashMap2;
                hashMap2.put("", "");
            }
            this.f340461j = (Map) mVar.mo172384a(f340450l, 10, true);
        } catch (Exception e) {
            PrintStream printStream = System.out;
            printStream.println("RequestPacket decode error " + C80342i.m97830a(this.f340458g));
            throw new RuntimeException(e);
        }
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172520a(this.f340452a, 1);
        nVar.mo172510a(this.f340453b, 2);
        nVar.mo172513a(this.f340454c, 3);
        nVar.mo172513a(this.f340455d, 4);
        nVar.mo172517a(this.f340456e, 5);
        nVar.mo172517a(this.f340457f, 6);
        nVar.mo172522a(this.f340458g, 7);
        nVar.mo172513a(this.f340459h, 8);
        nVar.mo172519a(this.f340460i, 9);
        nVar.mo172519a(this.f340461j, 10);
    }

    private C113797h(short s, byte b, int i, int i2, String str, String str2, byte[] bArr, int i3, Map<String, String> map, Map<String, String> map2) {
        this.f340452a = s;
        this.f340453b = b;
        this.f340454c = i;
        this.f340455d = i2;
        this.f340456e = str;
        this.f340457f = str2;
        this.f340458g = bArr;
        this.f340459h = i3;
        this.f340460i = map;
        this.f340461j = map2;
    }
}
