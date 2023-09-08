package com.tencent.p014mm.model.gdpr;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.model.gdpr.a */
public enum C1289a {
    BIZ("officialAccount", 0),
    OPENSDK("OPENSDK", 2);
    

    /* renamed from: d */
    public final String f10391d;

    /* renamed from: e */
    public final int f10392e;

    /* access modifiers changed from: public */
    C1289a(String str, int i) {
        this.f10391d = str;
        this.f10392e = i;
    }

    /* renamed from: a */
    public static C1289a m1379a(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        for (C1289a aVar : values()) {
            if (str.equals(aVar.f10391d)) {
                return aVar;
            }
        }
        return null;
    }
}
