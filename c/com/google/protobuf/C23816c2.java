package com.google.protobuf;

/* renamed from: com.google.protobuf.c2 */
public final class C23816c2 implements C23841h1 {

    /* renamed from: a */
    public final C23845j1 f68217a;

    /* renamed from: b */
    public final String f68218b;

    /* renamed from: c */
    public final Object[] f68219c;

    /* renamed from: d */
    public final int f68220d;

    public C23816c2(C23845j1 j1Var, String str, Object[] objArr) {
        this.f68217a = j1Var;
        this.f68218b = str;
        this.f68219c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f68220d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f68220d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo37517a() {
        return (this.f68220d & 2) == 2;
    }

    /* renamed from: b */
    public C23845j1 mo37518b() {
        return this.f68217a;
    }

    /* renamed from: c */
    public C24078y1 mo37519c() {
        return (this.f68220d & 1) == 1 ? C24078y1.PROTO2 : C24078y1.PROTO3;
    }

    /* renamed from: d */
    public Object[] mo37520d() {
        return this.f68219c;
    }

    /* renamed from: e */
    public String mo37521e() {
        return this.f68218b;
    }
}
