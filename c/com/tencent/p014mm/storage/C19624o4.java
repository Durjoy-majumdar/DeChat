package com.tencent.p014mm.storage;

import gy3.C87412m;

/* renamed from: com.tencent.mm.storage.o4 */
public final class C19624o4 {

    /* renamed from: a */
    public final long f55540a;

    /* renamed from: b */
    public final int f55541b;

    /* renamed from: c */
    public final int f55542c;

    /* renamed from: d */
    public final String f55543d;

    /* renamed from: e */
    public final String f55544e;

    /* renamed from: f */
    public final String f55545f;

    public C19624o4(long j, int i, int i2, String str, String str2, String str3) {
        this.f55540a = j;
        this.f55541b = i;
        this.f55542c = i2;
        this.f55543d = str;
        this.f55544e = str2;
        this.f55545f = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19624o4)) {
            return false;
        }
        C19624o4 o4Var = (C19624o4) obj;
        return this.f55540a == o4Var.f55540a && this.f55541b == o4Var.f55541b && this.f55542c == o4Var.f55542c && C87412m.m108589b(this.f55543d, o4Var.f55543d) && C87412m.m108589b(this.f55544e, o4Var.f55544e) && C87412m.m108589b(this.f55545f, o4Var.f55545f);
    }

    public int hashCode() {
        long j = this.f55540a;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.f55541b) * 31) + this.f55542c) * 31;
        String str = this.f55543d;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f55544e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f55545f;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "RecMsgReportInfo(mid=" + this.f55540a + ", idx=" + this.f55541b + ", style=" + this.f55542c + ", recInfo=" + this.f55543d + ", extData=" + this.f55544e + ", bizUsername=" + this.f55545f + ')';
    }
}
