package sk1;

import gy3.C8480h;
import gy3.C87412m;
import i70.C87667c;
import jq3.C9493c;
import te3.C51613uy0;
import te3.C64247az0;
import te3.C64374fs1;

/* renamed from: sk1.g */
public final class C63953g implements C9493c {

    /* renamed from: d */
    public final int f181279d;

    /* renamed from: e */
    public final C64374fs1 f181280e;

    /* renamed from: f */
    public C87667c<?, ?>.a f181281f;

    /* renamed from: g */
    public final C51613uy0 f181282g;

    /* renamed from: h */
    public C64247az0 f181283h;

    /* renamed from: i */
    public final String f181284i;

    public C63953g(int i, C64374fs1 fs12, C87667c<?, ?>.a aVar, C51613uy0 uy02, C64247az0 az02, String str, int i2, C8480h hVar) {
        fs12 = (i2 & 2) != 0 ? null : fs12;
        aVar = (i2 & 4) != 0 ? null : aVar;
        uy02 = (i2 & 8) != 0 ? null : uy02;
        az02 = (i2 & 16) != 0 ? null : az02;
        str = (i2 & 32) != 0 ? null : str;
        this.f181279d = i;
        this.f181280e = fs12;
        this.f181281f = aVar;
        this.f181282g = uy02;
        this.f181283h = az02;
        this.f181284i = str;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f181279d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63953g)) {
            return false;
        }
        C63953g gVar = (C63953g) obj;
        return this.f181279d == gVar.f181279d && C87412m.m108589b(this.f181280e, gVar.f181280e) && C87412m.m108589b(this.f181281f, gVar.f181281f) && C87412m.m108589b(this.f181282g, gVar.f181282g) && C87412m.m108589b(this.f181283h, gVar.f181283h) && C87412m.m108589b(this.f181284i, gVar.f181284i);
    }

    public long getItemId() {
        return 0;
    }

    public int hashCode() {
        int i = this.f181279d * 31;
        C64374fs1 fs12 = this.f181280e;
        int i2 = 0;
        int hashCode = (i + (fs12 == null ? 0 : fs12.hashCode())) * 31;
        C87667c<?, ?>.a aVar = this.f181281f;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C51613uy0 uy02 = this.f181282g;
        int hashCode3 = (hashCode2 + (uy02 == null ? 0 : uy02.hashCode())) * 31;
        C64247az0 az02 = this.f181283h;
        int hashCode4 = (hashCode3 + (az02 == null ? 0 : az02.hashCode())) * 31;
        String str = this.f181284i;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "GameTogetherItem(type=" + this.f181279d + ", cardInfo=" + this.f181280e + ", cardRoot=" + this.f181281f + ", anchorTeamInfo=" + this.f181282g + ", visitorTeamInfo=" + this.f181283h + ", wording=" + this.f181284i + ')';
    }
}
