package p341g7;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p333e8.C20541m;
import p333e8.C20551y;
import p341g7.C20800h;

/* renamed from: g7.g */
public final class C20799g extends C20800h {

    /* renamed from: o */
    public static final int f58773o = C20551y.m22316f("Opus");

    /* renamed from: p */
    public static final byte[] f58774p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f58775n;

    /* renamed from: b */
    public long mo32494b(C20541m mVar) {
        byte[] bArr = mVar.f57809a;
        byte b = bArr[0] & ExifInterface.MARKER;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return (((long) this.f58784i) * ((long) (b3 * (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL : 10000 << i2)))) / TimeUtil.SECOND_TO_US;
    }

    /* renamed from: c */
    public boolean mo32495c(C20541m mVar, long j, C20800h.C20802b bVar) {
        boolean z = true;
        if (!this.f58775n) {
            byte[] copyOf = Arrays.copyOf(mVar.f57809a, mVar.f57811c);
            byte b = copyOf[9] & ExifInterface.MARKER;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            mo32500e(arrayList, ((copyOf[11] & ExifInterface.MARKER) << 8) | (copyOf[10] & ExifInterface.MARKER));
            mo32500e(arrayList, 3840);
            bVar.f58789a = Format.m16642c((String) null, MimeTypes.AUDIO_OPUS, (String) null, -1, -1, b, 48000, arrayList, (DrmInitData) null, 0, (String) null);
            this.f58775n = true;
            return true;
        }
        if (mVar.mo32092c() != f58773o) {
            z = false;
        }
        mVar.mo32113x(0);
        return z;
    }

    /* renamed from: d */
    public void mo32496d(boolean z) {
        super.mo32496d(z);
        if (z) {
            this.f58775n = false;
        }
    }

    /* renamed from: e */
    public final void mo32500e(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }
}
