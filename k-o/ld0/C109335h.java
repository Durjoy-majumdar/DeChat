package ld0;

import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import java.nio.ByteBuffer;

/* renamed from: ld0.h */
public final class C109335h {

    /* renamed from: a */
    public final String f327314a;

    /* renamed from: b */
    public final int f327315b;

    /* renamed from: c */
    public final ByteBuffer f327316c;

    /* renamed from: d */
    public final int f327317d;

    /* renamed from: e */
    public final long f327318e;

    /* renamed from: f */
    public final float f327319f;

    /* renamed from: g */
    public final boolean f327320g;

    public C109335h(String str, int i, ByteBuffer byteBuffer, int i2, long j, float f, boolean z) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(byteBuffer, "bufferData");
        this.f327314a = str;
        this.f327315b = i;
        this.f327316c = byteBuffer;
        this.f327317d = i2;
        this.f327318e = j;
        this.f327319f = f;
        this.f327320g = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109335h)) {
            return false;
        }
        C109335h hVar = (C109335h) obj;
        return C87412m.m108589b(this.f327314a, hVar.f327314a) && this.f327315b == hVar.f327315b && C87412m.m108589b(this.f327316c, hVar.f327316c) && this.f327317d == hVar.f327317d && this.f327318e == hVar.f327318e && C87412m.m108589b(Float.valueOf(this.f327319f), Float.valueOf(hVar.f327319f)) && this.f327320g == hVar.f327320g;
    }

    public int hashCode() {
        long j = this.f327318e;
        int hashCode = ((((((((((this.f327314a.hashCode() * 31) + this.f327315b) * 31) + this.f327316c.hashCode()) * 31) + this.f327317d) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f327319f)) * 31;
        boolean z = this.f327320g;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "RawAudioInfo(filePath=" + this.f327314a + ", indexPos=" + this.f327315b + ", bufferData=" + this.f327316c + ", sampleRate=" + this.f327317d + ", pts=" + this.f327318e + ", progress=" + this.f327319f + ", comp=" + this.f327320g + ')';
    }
}
