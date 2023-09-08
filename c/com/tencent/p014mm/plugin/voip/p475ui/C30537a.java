package com.tencent.p014mm.plugin.voip.p475ui;

import gy3.C87412m;
import jq3.C9493c;

/* renamed from: com.tencent.mm.plugin.voip.ui.a */
public final class C30537a implements C9493c {

    /* renamed from: d */
    public String f82269d;

    /* renamed from: e */
    public int f82270e;

    public C30537a(String str, int i) {
        C87412m.m108594g(str, "key");
        this.f82269d = str;
        this.f82270e = i;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30537a)) {
            return false;
        }
        C30537a aVar = (C30537a) obj;
        return C87412m.m108589b(this.f82269d, aVar.f82269d) && this.f82270e == aVar.f82270e;
    }

    public long getItemId() {
        return 0;
    }

    public int hashCode() {
        return (this.f82269d.hashCode() * 31) + this.f82270e;
    }

    public String toString() {
        return "BeautyParams(key=" + this.f82269d + ", value=" + this.f82270e + ')';
    }
}
