package p384tk;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.gif.MMGIFException;
import com.tencent.p014mm.plugin.gif.MMWXGFJNI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import gy3.C87412m;

/* renamed from: tk.h */
public final class C101902h implements C101900d {

    /* renamed from: a */
    public final String f300062a = "MicroMsg.GIF.MMWXGFDecoder";

    /* renamed from: b */
    public long f300063b;

    /* renamed from: c */
    public final int[] f300064c;

    /* renamed from: d */
    public final int[] f300065d;

    /* renamed from: e */
    public int f300066e;

    /* renamed from: f */
    public int f300067f;

    /* renamed from: g */
    public final C101899c f300068g;

    /* renamed from: h */
    public Bitmap f300069h;

    public C101902h(byte[] bArr) {
        byte[] bArr2 = bArr;
        C87412m.m108594g(bArr2, ByteRange.BYTES_UNIT);
        int[] iArr = new int[4];
        this.f300064c = iArr;
        this.f300065d = new int[4];
        this.f300066e = -1;
        long nativeInitWxAMDecoder = MMWXGFJNI.nativeInitWxAMDecoder();
        this.f300063b = nativeInitWxAMDecoder;
        if (nativeInitWxAMDecoder == 0 || nativeInitWxAMDecoder == -901) {
            Log.m105929w("MicroMsg.GIF.MMWXGFDecoder", "Cpan init wxam decoder failed. gifHandle:%d", Long.valueOf(nativeInitWxAMDecoder));
            if (this.f300063b == -901) {
                C115669n.INSTANCE.idkeyStat(711, 5, 1, false);
            }
            C115669n.INSTANCE.idkeyStat(711, 4, 1, false);
            throw new MMGIFException(201);
        }
        int nativeDecodeBufferHeader = MMWXGFJNI.nativeDecodeBufferHeader(nativeInitWxAMDecoder, bArr2, bArr2.length);
        if (nativeDecodeBufferHeader != 0) {
            Log.m105929w("MicroMsg.GIF.MMWXGFDecoder", "Cpan WXGF decode buffer header failed. result:%d", Integer.valueOf(nativeDecodeBufferHeader));
            if (nativeDecodeBufferHeader == -904) {
                C115669n.INSTANCE.idkeyStat(711, 8, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(711, 3, 1, false);
            }
            throw new MMGIFException(nativeDecodeBufferHeader);
        }
        int nativeGetOption = MMWXGFJNI.nativeGetOption(this.f300063b, bArr2, bArr2.length, iArr);
        if (nativeGetOption != 0) {
            Log.m105929w("MicroMsg.GIF.MMWXGFDecoder", "Cpan WXGF get option failed. result:%d", Integer.valueOf(nativeGetOption));
            if (nativeGetOption == -903) {
                C115669n.INSTANCE.idkeyStat(711, 7, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(711, 3, 1, false);
            }
            throw new MMGIFException(nativeGetOption);
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr[1], iArr[2], Bitmap.Config.ARGB_8888);
        C87412m.m108593f(createBitmap, "createBitmap(frameWidth(… Bitmap.Config.ARGB_8888)");
        this.f300069h = createBitmap;
        this.f300068g = new C101899c(iArr[0]);
    }

    /* renamed from: a */
    public int mo35630a() {
        return this.f300064c[2];
    }

    /* renamed from: b */
    public void mo35631b() {
        int nativeDecodeBufferFrame = MMWXGFJNI.nativeDecodeBufferFrame(this.f300063b, (byte[]) null, 0, this.f300069h, this.f300065d);
        if (nativeDecodeBufferFrame == -909) {
            Log.m105924i(this.f300062a, "nativeDecodeBufferFrame failed. frame is null.");
            C115669n.INSTANCE.idkeyStat(401, 11, 1, false);
        } else if (nativeDecodeBufferFrame == -904) {
            Log.m105924i(this.f300062a, "nativeDecodeBufferFrame failed. func is null.");
            C115669n.INSTANCE.idkeyStat(401, 8, 1, false);
        } else if (nativeDecodeBufferFrame == -1) {
            Log.m105924i(this.f300062a, "nativeDecodeBufferFrame failed.");
        }
        int i = this.f300066e + 1;
        this.f300066e = i;
        if ((i >= this.f300064c[0] - 1 || nativeDecodeBufferFrame == 1) && MMWXGFJNI.nativeRewindBuffer(this.f300063b) == -905) {
            C115669n.INSTANCE.idkeyStat(711, 9, 1, false);
            Log.m105928w(this.f300062a, "Cpan Rewind buffer failed.");
        }
        this.f300066e %= this.f300064c[0];
        int i2 = this.f300065d[0];
        if (i2 <= 0) {
            i2 = 100;
        }
        this.f300067f = i2;
        Log.m105918d(this.f300062a, "drawFrameBitmap: decode frame " + this.f300066e + ", " + this.f300067f);
    }

    /* renamed from: c */
    public int mo35632c() {
        return this.f300064c[1];
    }

    /* renamed from: d */
    public int mo35633d() {
        if (this.f300064c[0] == 1) {
            return Integer.MAX_VALUE;
        }
        return this.f300067f;
    }

    public void destroy() {
        long j = this.f300063b;
        this.f300063b = 0;
        int nativeUninit = MMWXGFJNI.nativeUninit(j);
        if (nativeUninit == -906) {
            C115669n.INSTANCE.idkeyStat(401, 10, 1, false);
        }
        Log.m105919d(this.f300062a, "nativeUninit result:%d gifHandle:%s", Integer.valueOf(nativeUninit), Long.valueOf(j));
    }

    /* renamed from: e */
    public int mo35635e() {
        return this.f300064c[0];
    }

    public Bitmap getFrame() {
        return this.f300069h;
    }

    public void seekTo(long j) {
        if (this.f300067f <= 0) {
            mo35631b();
        }
        int i = (int) j;
        int a = this.f300068g.mo141396a(i);
        int i2 = this.f300064c[0];
        for (int i3 = 0; i3 < i2 && a < 0; i3++) {
            mo35631b();
            this.f300068g.mo141397b(this.f300066e, this.f300067f);
            a = this.f300068g.mo141396a(i);
        }
        int i4 = a - this.f300066e;
        int i5 = this.f300064c[0];
        int i6 = (i4 + i5) % i5;
        String str = this.f300062a;
        Log.m105918d(str, "seekTo: " + j + ", " + this.f300066e + ", " + i6 + ", " + mo35633d() + ", " + this.f300064c[0] + 65292 + this.f300068g.f300059c);
        for (int i7 = 0; i7 < i6; i7++) {
            mo35631b();
        }
    }
}
