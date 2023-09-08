package com.tencent.mapsdk.internal;

import java.io.Serializable;

/* renamed from: com.tencent.mapsdk.internal.cq */
public final class C80339cq implements Serializable {

    /* renamed from: b */
    public static final int f235167b = 0;

    /* renamed from: c */
    public static final C80339cq f235168c = new C80339cq(0, 0, "DT_NORMAL");

    /* renamed from: d */
    public static final int f235169d = 1;

    /* renamed from: e */
    public static final C80339cq f235170e = new C80339cq(1, 1, "DT_ONLY_LINK");

    /* renamed from: f */
    public static final int f235171f = 2;

    /* renamed from: g */
    public static final C80339cq f235172g = new C80339cq(2, 2, "DT_ONLY_STATUS");

    /* renamed from: h */
    public static final int f235173h = 3;

    /* renamed from: i */
    public static final C80339cq f235174i = new C80339cq(3, 3, "DT_LINK_AND_STATUS");

    /* renamed from: j */
    public static final /* synthetic */ boolean f235175j = true;

    /* renamed from: k */
    private static C80339cq[] f235176k = new C80339cq[4];

    /* renamed from: a */
    public int f235177a;

    /* renamed from: l */
    private String f235178l;

    static {
        Class<C80339cq> cls = C80339cq.class;
    }

    private C80339cq(int i, int i2, String str) {
        new String();
        this.f235178l = str;
        this.f235177a = i2;
        f235176k[i] = this;
    }

    /* renamed from: a */
    private static C80339cq m97818a(int i) {
        int i2 = 0;
        while (true) {
            C80339cq[] cqVarArr = f235176k;
            if (i2 < cqVarArr.length) {
                C80339cq cqVar = cqVarArr[i2];
                if (cqVar.f235177a == i) {
                    return cqVar;
                }
                i2++;
            } else if (f235175j) {
                return null;
            } else {
                throw new AssertionError();
            }
        }
    }

    public final String toString() {
        return this.f235178l;
    }

    /* renamed from: a */
    private static C80339cq m97819a(String str) {
        int i = 0;
        while (true) {
            C80339cq[] cqVarArr = f235176k;
            if (i < cqVarArr.length) {
                if (cqVarArr[i].toString().equals(str)) {
                    return f235176k[i];
                }
                i++;
            } else if (f235175j) {
                return null;
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    private int m97817a() {
        return this.f235177a;
    }
}
