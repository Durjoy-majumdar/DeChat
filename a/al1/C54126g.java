package al1;

import gy3.C87412m;

/* renamed from: al1.g */
public final class C54126g {

    /* renamed from: a */
    public String f151973a;

    /* renamed from: b */
    public long f151974b;

    /* renamed from: c */
    public int f151975c;

    public C54126g(String str, long j, int i) {
        this.f151973a = str;
        this.f151974b = j;
        this.f151975c = i;
    }

    /* renamed from: a */
    public final String mo74913a() {
        return this.f151973a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54126g)) {
            return false;
        }
        C54126g gVar = (C54126g) obj;
        return C87412m.m108589b(this.f151973a, gVar.f151973a) && this.f151974b == gVar.f151974b && this.f151975c == gVar.f151975c;
    }

    public int hashCode() {
        String str = this.f151973a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f151974b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f151975c;
    }

    public String toString() {
        return "FinderLiveBattlePlayerInfo(username=" + this.f151973a + ", wecoinHot=" + this.f151974b + ", winningStreakCount=" + this.f151975c + ')';
    }
}
