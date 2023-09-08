package al1;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: al1.e */
public final class C54125e {

    /* renamed from: a */
    public String f151970a;

    /* renamed from: b */
    public String f151971b;

    /* renamed from: c */
    public String f151972c;

    public C54125e() {
        this((String) null, (String) null, (String) null, 7, (C8480h) null);
    }

    public C54125e(String str, String str2, String str3, int i, C8480h hVar) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        this.f151970a = str;
        this.f151971b = str2;
        this.f151972c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54125e)) {
            return false;
        }
        C54125e eVar = (C54125e) obj;
        return C87412m.m108589b(this.f151970a, eVar.f151970a) && C87412m.m108589b(this.f151971b, eVar.f151971b) && C87412m.m108589b(this.f151972c, eVar.f151972c);
    }

    public int hashCode() {
        String str = this.f151970a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f151971b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f151972c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "FinderLiveAudioModeCoverInfo(coverUrl=" + this.f151970a + ", avatarUrl=" + this.f151971b + ", choosePath=" + this.f151972c + ')';
    }
}
