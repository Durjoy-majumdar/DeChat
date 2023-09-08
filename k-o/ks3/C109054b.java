package ks3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ks3.b */
public final class C109054b {

    /* renamed from: a */
    public final int f326602a;

    /* renamed from: b */
    public final String f326603b;

    /* renamed from: c */
    public final boolean f326604c;

    public C109054b(int i, String str, boolean z, int i2, C8480h hVar) {
        z = (i2 & 4) != 0 ? false : z;
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f326602a = i;
        this.f326603b = str;
        this.f326604c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109054b)) {
            return false;
        }
        C109054b bVar = (C109054b) obj;
        return this.f326602a == bVar.f326602a && C87412m.m108589b(this.f326603b, bVar.f326603b) && this.f326604c == bVar.f326604c;
    }

    public int hashCode() {
        int hashCode = ((this.f326602a * 31) + this.f326603b.hashCode()) * 31;
        boolean z = this.f326604c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "EffectInfo(beautyId=" + this.f326602a + ", title=" + this.f326603b + ", isBothSides=" + this.f326604c + ')';
    }
}
