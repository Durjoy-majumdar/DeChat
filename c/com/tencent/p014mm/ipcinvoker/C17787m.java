package com.tencent.p014mm.ipcinvoker;

import junit.framework.Assert;

/* renamed from: com.tencent.mm.ipcinvoker.m */
public abstract class C17787m implements C1256g {

    /* renamed from: d */
    public String f48955d;

    public C17787m(String str) {
        this.f48955d = str;
        Assert.assertNotNull(str);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C17787m)) {
            return false;
        }
        return this.f48955d.equals(((C17787m) obj).f48955d);
    }
}
