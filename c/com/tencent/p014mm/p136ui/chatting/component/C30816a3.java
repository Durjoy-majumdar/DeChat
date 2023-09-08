package com.tencent.p014mm.p136ui.chatting.component;

import gy3.C8480h;
import jq3.C9493c;

/* renamed from: com.tencent.mm.ui.chatting.component.a3 */
public final class C30816a3 implements C9493c {

    /* renamed from: d */
    public final int f82821d;

    /* renamed from: e */
    public final int f82822e;

    /* renamed from: f */
    public boolean f82823f;

    public C30816a3(int i, int i2, boolean z, int i3, C8480h hVar) {
        z = (i3 & 4) != 0 ? false : z;
        this.f82821d = i;
        this.f82822e = i2;
        this.f82823f = z;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30816a3)) {
            return false;
        }
        C30816a3 a3Var = (C30816a3) obj;
        return this.f82821d == a3Var.f82821d && this.f82822e == a3Var.f82822e && this.f82823f == a3Var.f82823f;
    }

    public long getItemId() {
        return (long) this.f82821d;
    }

    public int hashCode() {
        int i = ((this.f82821d * 31) + this.f82822e) * 31;
        boolean z = this.f82823f;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public String toString() {
        return "LangItemData(lanId=" + this.f82821d + ", lanStringRes=" + this.f82822e + ", isSelect=" + this.f82823f + ')';
    }
}
