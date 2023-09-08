package cz1;

import gy3.C87412m;

/* renamed from: cz1.d */
public final class C45227d {

    /* renamed from: a */
    public String f122563a;

    /* renamed from: b */
    public long f122564b;

    /* renamed from: c */
    public String f122565c;

    /* renamed from: d */
    public int f122566d;

    /* renamed from: e */
    public long f122567e;

    public C45227d() {
        this("", 0, "", 0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45227d)) {
            return false;
        }
        C45227d dVar = (C45227d) obj;
        return C87412m.m108589b(this.f122563a, dVar.f122563a) && this.f122564b == dVar.f122564b && C87412m.m108589b(this.f122565c, dVar.f122565c) && this.f122566d == dVar.f122566d && this.f122567e == dVar.f122567e;
    }

    public int hashCode() {
        String str = this.f122563a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f122564b;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f122565c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j2 = this.f122567e;
        return ((((i2 + i) * 31) + this.f122566d) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "GameLifeConversationInfo(talker=" + this.f122563a + ", msgId=" + this.f122564b + ", externInfo=" + this.f122565c + ", msgType=" + this.f122566d + ", updateTime=" + this.f122567e + ')';
    }

    public C45227d(String str, long j, String str2, int i, long j2) {
        this.f122563a = str;
        this.f122564b = j;
        this.f122565c = str2;
        this.f122566d = i;
        this.f122567e = j2;
    }
}
