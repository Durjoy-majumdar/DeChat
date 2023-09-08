package com.tencent.p014mm.plugin.finder.view;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.view.v7 */
public final class C41598v7 {

    /* renamed from: a */
    public final String f111966a;

    /* renamed from: b */
    public final String f111967b;

    /* renamed from: c */
    public long f111968c;

    /* renamed from: d */
    public final long f111969d;

    /* renamed from: e */
    public boolean f111970e;

    public C41598v7(String str, String str2, long j, long j2) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "nickname");
        this.f111966a = str;
        this.f111967b = str2;
        this.f111968c = j;
        this.f111969d = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41598v7)) {
            return false;
        }
        C41598v7 v7Var = (C41598v7) obj;
        return C87412m.m108589b(this.f111966a, v7Var.f111966a) && C87412m.m108589b(this.f111967b, v7Var.f111967b) && this.f111968c == v7Var.f111968c && this.f111969d == v7Var.f111969d;
    }

    public int hashCode() {
        long j = this.f111968c;
        long j2 = this.f111969d;
        return (((((this.f111966a.hashCode() * 31) + this.f111967b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "MentionContact(username='" + this.f111966a + "', nickname='" + this.f111967b + "', start=" + this.f111968c + ", length=" + this.f111969d + ')';
    }
}
