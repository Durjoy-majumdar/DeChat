package j52;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: j52.f */
public final class C87880f {

    /* renamed from: a */
    public final String f254381a;

    /* renamed from: b */
    public final String f254382b;

    /* renamed from: c */
    public long f254383c;

    /* renamed from: d */
    public long f254384d;

    /* renamed from: e */
    public long f254385e;

    /* renamed from: f */
    public long f254386f;

    /* renamed from: g */
    public long f254387g;

    /* renamed from: h */
    public long f254388h;

    /* renamed from: i */
    public long f254389i;

    /* renamed from: j */
    public long f254390j;

    public C87880f(String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, C8480h hVar) {
        String str3 = str;
        int i2 = i;
        String valueOf = (i2 & 2) != 0 ? String.valueOf(System.currentTimeMillis()) : str2;
        long j9 = (i2 & 4) != 0 ? 0 : j;
        long j15 = (i2 & 8) != 0 ? 0 : j2;
        long j16 = (i2 & 16) != 0 ? 0 : j3;
        long j17 = (i2 & 32) != 0 ? 0 : j4;
        long j18 = (i2 & 64) != 0 ? 0 : j5;
        long j19 = (i2 & 128) != 0 ? 0 : j6;
        long j25 = (i2 & 256) != 0 ? 0 : j7;
        long j26 = (i2 & 512) != 0 ? 0 : j8;
        C87412m.m108594g(str3, "bizName");
        C87412m.m108594g(valueOf, "sessionID");
        this.f254381a = str3;
        this.f254382b = valueOf;
        this.f254383c = j9;
        this.f254384d = j15;
        this.f254385e = j16;
        this.f254386f = j17;
        this.f254387g = j18;
        this.f254388h = j19;
        this.f254389i = j25;
        this.f254390j = j26;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87880f)) {
            return false;
        }
        C87880f fVar = (C87880f) obj;
        return C87412m.m108589b(this.f254381a, fVar.f254381a) && C87412m.m108589b(this.f254382b, fVar.f254382b) && this.f254383c == fVar.f254383c && this.f254384d == fVar.f254384d && this.f254385e == fVar.f254385e && this.f254386f == fVar.f254386f && this.f254387g == fVar.f254387g && this.f254388h == fVar.f254388h && this.f254389i == fVar.f254389i && this.f254390j == fVar.f254390j;
    }

    public int hashCode() {
        long j = this.f254383c;
        long j2 = this.f254384d;
        long j3 = this.f254385e;
        long j4 = this.f254386f;
        long j5 = this.f254387g;
        long j6 = this.f254388h;
        long j7 = this.f254389i;
        long j8 = this.f254390j;
        return (((((((((((((((((this.f254381a.hashCode() * 31) + this.f254382b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "MagicBrushRuntimeInfo(bizName=" + this.f254381a + ", sessionID=" + this.f254382b + ", bindServiceStartTime=" + this.f254383c + ", bindServiceEndTime=" + this.f254384d + ", setupStartTime=" + this.f254385e + ", setupEndTime=" + this.f254386f + ", startStartTime=" + this.f254387g + ", startEndTime=" + this.f254388h + ", destroyStartTime=" + this.f254389i + ", destroyEndTime=" + this.f254390j + ')';
    }
}
