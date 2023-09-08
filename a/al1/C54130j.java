package al1;

import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import gy3.C8480h;
import gy3.C87412m;
import pe3.C89349b;
import te3.C49765hx0;
import te3.C64756up2;

/* renamed from: al1.j */
public final class C54130j {

    /* renamed from: a */
    public final String f151997a;

    /* renamed from: b */
    public final String f151998b;

    /* renamed from: c */
    public final String f151999c;

    /* renamed from: d */
    public final String f152000d;

    /* renamed from: e */
    public final int f152001e;

    /* renamed from: f */
    public final String f152002f;

    /* renamed from: g */
    public final C89349b f152003g;

    /* renamed from: h */
    public final boolean f152004h;

    /* renamed from: i */
    public final int f152005i;

    /* renamed from: j */
    public FinderAuthInfo f152006j;

    /* renamed from: k */
    public final String f152007k;

    /* renamed from: l */
    public int f152008l;

    /* renamed from: m */
    public final int f152009m;

    /* renamed from: n */
    public boolean f152010n;

    /* renamed from: o */
    public String f152011o;

    /* renamed from: p */
    public boolean f152012p;

    /* renamed from: q */
    public long f152013q;

    /* renamed from: r */
    public C49765hx0 f152014r;

    /* renamed from: s */
    public final boolean f152015s;

    /* renamed from: t */
    public Boolean f152016t;

    /* renamed from: u */
    public C64756up2 f152017u;

    /* renamed from: v */
    public int f152018v;

    /* renamed from: w */
    public int f152019w;

    /* renamed from: x */
    public boolean f152020x;

    public C54130j(String str, String str2, String str3, String str4, int i, String str5, C89349b bVar, boolean z, int i2, FinderAuthInfo finderAuthInfo, String str6, int i3, int i4, boolean z2, String str7, boolean z3, long j, C49765hx0 hx02, boolean z4, Boolean bool, C64756up2 up22, int i5, int i6, int i7, C8480h hVar) {
        int i8 = i7;
        C89349b bVar2 = (i8 & 64) != 0 ? null : bVar;
        boolean z5 = (i8 & 128) != 0 ? false : z;
        int i9 = (i8 & 256) != 0 ? 0 : i2;
        FinderAuthInfo finderAuthInfo2 = (i8 & 512) != 0 ? null : finderAuthInfo;
        String str8 = (i8 & 1024) != 0 ? null : str6;
        int i15 = (i8 & 2048) != 0 ? 0 : i3;
        int i16 = (i8 & 4096) != 0 ? 0 : i4;
        boolean z6 = (i8 & 8192) != 0 ? false : z2;
        String str9 = (i8 & 16384) != 0 ? null : str7;
        boolean z7 = (32768 & i8) != 0 ? false : z3;
        long j2 = (65536 & i8) != 0 ? 0 : j;
        C49765hx0 hx03 = (i8 & 131072) != 0 ? null : hx02;
        boolean z8 = (i8 & 262144) != 0 ? false : z4;
        Boolean bool2 = (i8 & 524288) != 0 ? null : bool;
        C64756up2 up23 = (i8 & 1048576) != 0 ? null : up22;
        int i17 = (i8 & 2097152) != 0 ? 0 : i5;
        int i18 = (i8 & 4194304) != 0 ? 0 : i6;
        this.f151997a = str;
        this.f151998b = str2;
        this.f151999c = str3;
        this.f152000d = str4;
        this.f152001e = i;
        this.f152002f = str5;
        this.f152003g = bVar2;
        this.f152004h = z5;
        this.f152005i = i9;
        this.f152006j = finderAuthInfo2;
        this.f152007k = str8;
        this.f152008l = i15;
        this.f152009m = i16;
        this.f152010n = z6;
        this.f152011o = str9;
        this.f152012p = z7;
        this.f152013q = j2;
        this.f152014r = hx03;
        this.f152015s = z8;
        this.f152016t = bool2;
        this.f152017u = up23;
        this.f152018v = i17;
        this.f152019w = i18;
    }

    /* renamed from: a */
    public final String mo74932a() {
        return this.f152011o;
    }

    /* renamed from: b */
    public final String mo74933b() {
        return this.f151998b;
    }

    /* renamed from: c */
    public final C64756up2 mo74934c() {
        return this.f152017u;
    }

    /* renamed from: d */
    public final int mo74935d() {
        return this.f152001e;
    }

    /* renamed from: e */
    public final String mo74936e() {
        return this.f152000d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54130j)) {
            return false;
        }
        C54130j jVar = (C54130j) obj;
        return C87412m.m108589b(this.f151997a, jVar.f151997a) && C87412m.m108589b(this.f151998b, jVar.f151998b) && C87412m.m108589b(this.f151999c, jVar.f151999c) && C87412m.m108589b(this.f152000d, jVar.f152000d) && this.f152001e == jVar.f152001e && C87412m.m108589b(this.f152002f, jVar.f152002f) && C87412m.m108589b(this.f152003g, jVar.f152003g) && this.f152004h == jVar.f152004h && this.f152005i == jVar.f152005i && C87412m.m108589b(this.f152006j, jVar.f152006j) && C87412m.m108589b(this.f152007k, jVar.f152007k) && this.f152008l == jVar.f152008l && this.f152009m == jVar.f152009m && this.f152010n == jVar.f152010n && C87412m.m108589b(this.f152011o, jVar.f152011o) && this.f152012p == jVar.f152012p && this.f152013q == jVar.f152013q && C87412m.m108589b(this.f152014r, jVar.f152014r) && this.f152015s == jVar.f152015s && C87412m.m108589b(this.f152016t, jVar.f152016t) && C87412m.m108589b(this.f152017u, jVar.f152017u) && this.f152018v == jVar.f152018v && this.f152019w == jVar.f152019w;
    }

    /* renamed from: f */
    public final int mo74938f() {
        return this.f152005i;
    }

    /* renamed from: g */
    public final String mo74939g() {
        return this.f151997a;
    }

    /* renamed from: h */
    public final int mo74940h() {
        return this.f152019w;
    }

    public int hashCode() {
        String str = this.f151997a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f151998b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f151999c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f152000d;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f152001e) * 31;
        String str5 = this.f152002f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C89349b bVar = this.f152003g;
        int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        boolean z = this.f152004h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (((hashCode6 + (z ? 1 : 0)) * 31) + this.f152005i) * 31;
        FinderAuthInfo finderAuthInfo = this.f152006j;
        int hashCode7 = (i2 + (finderAuthInfo == null ? 0 : finderAuthInfo.hashCode())) * 31;
        String str6 = this.f152007k;
        int hashCode8 = (((((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f152008l) * 31) + this.f152009m) * 31;
        boolean z3 = this.f152010n;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode8 + (z3 ? 1 : 0)) * 31;
        String str7 = this.f152011o;
        int hashCode9 = (i3 + (str7 == null ? 0 : str7.hashCode())) * 31;
        boolean z4 = this.f152012p;
        if (z4) {
            z4 = true;
        }
        long j = this.f152013q;
        int i4 = (((hashCode9 + (z4 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C49765hx0 hx02 = this.f152014r;
        int hashCode10 = (i4 + (hx02 == null ? 0 : hx02.hashCode())) * 31;
        boolean z5 = this.f152015s;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (hashCode10 + (z2 ? 1 : 0)) * 31;
        Boolean bool = this.f152016t;
        int hashCode11 = (i5 + (bool == null ? 0 : bool.hashCode())) * 31;
        C64756up2 up22 = this.f152017u;
        if (up22 != null) {
            i = up22.hashCode();
        }
        return ((((hashCode11 + i) * 31) + this.f152018v) * 31) + this.f152019w;
    }

    /* renamed from: i */
    public final String mo74942i() {
        return this.f152002f;
    }

    /* renamed from: j */
    public final String mo74943j() {
        return this.f151999c;
    }

    /* renamed from: k */
    public final boolean mo74944k() {
        return this.f152004h;
    }

    /* renamed from: l */
    public final void mo74945l(boolean z) {
        this.f152010n = z;
    }

    /* renamed from: m */
    public final void mo74946m(Boolean bool) {
        this.f152016t = bool;
    }

    /* renamed from: n */
    public final void mo74947n(int i) {
        this.f152018v = i;
    }

    /* renamed from: o */
    public final void mo74948o() {
        int i = this.f152001e;
        this.f152008l = i == 2 ? 4 : i == 1 ? 3 : 0;
    }

    /* renamed from: p */
    public final void mo74949p() {
        int i = this.f152001e;
        int i2 = 1;
        if (i == 2) {
            i2 = 2;
        } else if (i != 1) {
            i2 = 0;
        }
        this.f152008l = i2;
    }

    public String toString() {
        return "FinderLiveLinkMicUser(sdkUserId=" + this.f151997a + ", headUrl=" + this.f151998b + ", username=" + this.f151999c + ", nickname=" + this.f152000d + ", micType=" + this.f152001e + ", sessionId=" + this.f152002f + ", pkSign=" + this.f152003g + ", isPkWithAnchor=" + this.f152004h + ", sdkLiveId=" + this.f152005i + ", authInfo=" + this.f152006j + ", signature=" + this.f152007k + ", micStatus=" + this.f152008l + ", liveContactFlag=" + this.f152009m + ", notTalking=" + this.f152010n + ", bgUrl=" + this.f152011o + ", audioMode=" + this.f152012p + ", userAttrFlag=" + this.f152013q + ", finderLiveContact=" + this.f152014r + ", isRandomMatch=" + this.f152015s + ", isOtherRoomUser=" + this.f152016t + ", liveRoomImg=" + this.f152017u + ", userState=" + this.f152018v + ", seatPosition=" + this.f152019w + ')';
    }
}
