package d50;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import sx3.C64197v;
import te3.C64890zp2;
import w50.C65928b;

/* renamed from: d50.g */
public final class C58113g {

    /* renamed from: a */
    public String f166231a;

    /* renamed from: b */
    public long f166232b;

    /* renamed from: c */
    public int f166233c;

    /* renamed from: d */
    public String f166234d;

    /* renamed from: e */
    public long f166235e;

    /* renamed from: f */
    public long f166236f;

    /* renamed from: g */
    public C58107a f166237g;

    /* renamed from: h */
    public int f166238h;

    /* renamed from: i */
    public int f166239i;

    /* renamed from: j */
    public int f166240j;

    /* renamed from: k */
    public HashMap<Integer, C7170j> f166241k;

    /* renamed from: l */
    public long f166242l;

    /* renamed from: m */
    public int f166243m;

    /* renamed from: n */
    public C64890zp2 f166244n;

    /* renamed from: o */
    public String f166245o;

    /* renamed from: p */
    public long f166246p;

    /* renamed from: q */
    public long f166247q;

    public C58113g() {
        this((String) null, 0, 0, (String) null, 0, 0, (C58107a) null, 0, 0, 0, (HashMap) null, 0, 0, (C64890zp2) null, (String) null, 0, 0, 131071, (C8480h) null);
    }

    public C58113g(String str, long j, int i, String str2, long j2, long j3, C58107a aVar, int i2, int i3, int i4, HashMap hashMap, long j4, int i5, C64890zp2 zp22, String str3, long j5, long j6, int i6, C8480h hVar) {
        int i7 = i6;
        String str4 = (i7 & 1) != 0 ? "" : str;
        long j7 = -1;
        long j8 = (i7 & 2) != 0 ? -1 : j;
        int i8 = (i7 & 4) != 0 ? 0 : i;
        String str5 = (i7 & 8) != 0 ? "" : str2;
        long j9 = (i7 & 16) != 0 ? -1 : j2;
        j7 = (i7 & 32) == 0 ? j3 : j7;
        C58107a aVar2 = (i7 & 64) != 0 ? C58107a.MMLiveStreamSwitchMode_Auto : aVar;
        int i9 = (i7 & 128) != 0 ? 0 : i2;
        int i15 = (i7 & 256) != 0 ? 0 : i3;
        int i16 = (i7 & 512) != 0 ? -1 : i4;
        String str6 = "";
        HashMap hashMap2 = (i7 & 1024) != 0 ? new HashMap() : hashMap;
        int i17 = i16;
        long currentTimeMillis = (i7 & 2048) != 0 ? System.currentTimeMillis() : j4;
        int i18 = (i7 & 4096) != 0 ? 0 : i5;
        C64890zp2 zp23 = (i7 & 8192) != 0 ? new C64890zp2() : zp22;
        int i19 = i15;
        String str7 = (i7 & 16384) != 0 ? str6 : str3;
        long j15 = (i7 & 32768) != 0 ? 0 : j5;
        long j16 = (i7 & 65536) != 0 ? 0 : j6;
        C87412m.m108594g(str4, "liveName");
        C87412m.m108594g(aVar2, "cdnSwitchMode");
        C87412m.m108594g(hashMap2, "cdnUrlMap");
        C87412m.m108594g(zp23, "channelParams");
        C87412m.m108594g(str7, "nickName");
        this.f166231a = str4;
        this.f166232b = j8;
        this.f166233c = i8;
        this.f166234d = str5;
        this.f166235e = j9;
        this.f166236f = j7;
        this.f166237g = aVar2;
        this.f166238h = i9;
        this.f166239i = i19;
        this.f166240j = i17;
        this.f166241k = hashMap2;
        this.f166242l = currentTimeMillis;
        this.f166243m = i18;
        this.f166244n = zp23;
        this.f166245o = str7;
        this.f166246p = j15;
        this.f166247q = j16;
    }

    /* renamed from: a */
    public final int mo82868a() {
        if (mo82869b()) {
            return this.f166240j;
        }
        C7170j d = mo82871d(this.f166238h);
        if (d != null) {
            return d.f25143b;
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo82869b() {
        T t;
        boolean z;
        int i = this.f166240j;
        if (i >= 0) {
            Collection<C7170j> values = this.f166241k.values();
            C87412m.m108593f(values, "cdnUrlMap.values");
            Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C7170j) t).f25143b == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (((C7170j) t) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final String mo82870c(int i) {
        String str;
        Log.m105924i("LiveRoomInfo", "getCdnUrl cdnQualityTag:" + i + ", liveInfo:" + this.f166241k.get(Integer.valueOf(i)) + ", cdnQualitySvrcfg:" + this.f166238h + ",cdnCustomerSwitchCfg:" + this.f166240j);
        C7170j jVar = this.f166241k.get(Integer.valueOf(i));
        if (jVar != null && (str = jVar.f25142a) != null) {
            return str;
        }
        C7170j jVar2 = this.f166241k.get(0);
        if (jVar2 != null) {
            return jVar2.f25142a;
        }
        return null;
    }

    /* renamed from: d */
    public final C7170j mo82871d(int i) {
        Log.m105924i("LiveRoomInfo", "getLiveVideoInfo cdnQualityTag:" + i + ", liveInfo:" + this.f166241k.get(Integer.valueOf(i)) + ", cdnQualitySvrcfg:" + this.f166238h + ",cdnCustomerSwitchCfg:" + this.f166240j);
        return this.f166241k.get(Integer.valueOf(i));
    }

    /* renamed from: e */
    public final int mo82872e(int i) {
        Collection<C7170j> values = this.f166241k.values();
        C87412m.m108593f(values, "cdnUrlMap.values");
        Iterator<T> it = values.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            T next = it.next();
            if (i2 >= 0) {
                if (((C7170j) next).f25143b == i) {
                    break;
                }
                i2++;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (C65928b.f189533a.mo89967f()) {
            Log.m105924i("LiveRoomInfo", "indexOfUrl " + i + ", index:" + i2);
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58113g)) {
            return false;
        }
        C58113g gVar = (C58113g) obj;
        return C87412m.m108589b(this.f166231a, gVar.f166231a) && this.f166232b == gVar.f166232b && this.f166233c == gVar.f166233c && C87412m.m108589b(this.f166234d, gVar.f166234d) && this.f166235e == gVar.f166235e && this.f166236f == gVar.f166236f && this.f166237g == gVar.f166237g && this.f166238h == gVar.f166238h && this.f166239i == gVar.f166239i && this.f166240j == gVar.f166240j && C87412m.m108589b(this.f166241k, gVar.f166241k) && this.f166242l == gVar.f166242l && this.f166243m == gVar.f166243m && C87412m.m108589b(this.f166244n, gVar.f166244n) && C87412m.m108589b(this.f166245o, gVar.f166245o) && this.f166246p == gVar.f166246p && this.f166247q == gVar.f166247q;
    }

    public int hashCode() {
        long j = this.f166232b;
        int hashCode = ((((this.f166231a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f166233c) * 31;
        String str = this.f166234d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f166235e;
        long j3 = this.f166236f;
        long j4 = this.f166242l;
        long j5 = this.f166246p;
        long j6 = this.f166247q;
        return ((((((((((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f166237g.hashCode()) * 31) + this.f166238h) * 31) + this.f166239i) * 31) + this.f166240j) * 31) + this.f166241k.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f166243m) * 31) + this.f166244n.hashCode()) * 31) + this.f166245o.hashCode()) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return "LiveRoomInfo(liveName=" + this.f166231a + ", liveId=" + this.f166232b + ", audienceMode=" + this.f166233c + ", anchorUserId=" + this.f166234d + ", appId=" + this.f166235e + ", bizId=" + this.f166236f + ", cdnSwitchMode=" + this.f166237g + ", cdnQualitySvrcfg=" + this.f166238h + ", cdnH265BackCfg=" + this.f166239i + ", cdnCustomerSwitchLevel=" + this.f166240j + ", cdnUrlMap=" + this.f166241k + ", startTime=" + this.f166242l + ", seiMode=" + this.f166243m + ", channelParams=" + this.f166244n + ", nickName=" + this.f166245o + ", useTXLivePlayerCustomRender=" + this.f166246p + ", customRenderInfo=" + this.f166247q + ')';
    }
}
