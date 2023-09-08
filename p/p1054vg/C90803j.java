package p1054vg;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;

/* renamed from: vg.j */
public final class C90803j implements Cloneable {

    /* renamed from: d */
    public long f260747d;

    public C90803j(byte[] bArr) {
        this.f260747d = (((long) (bArr[3] << 24)) & 4278190080L) + ((long) ((bArr[2] << v2encoder.enumCODEC_vcodec2) & 16711680)) + ((long) ((bArr[1] << 8) & 65280)) + ((long) (bArr[0] & ExifInterface.MARKER));
    }

    /* renamed from: a */
    public byte[] mo124918a() {
        long j = this.f260747d;
        return new byte[]{(byte) ((int) (255 & j)), (byte) ((int) ((65280 & j) >> 8)), (byte) ((int) ((16711680 & j) >> 16)), (byte) ((int) ((j & 4278190080L) >> 24))};
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C90803j) && this.f260747d == ((C90803j) obj).f260747d;
    }

    public int hashCode() {
        return (int) this.f260747d;
    }

    public C90803j(long j) {
        this.f260747d = j;
    }
}
