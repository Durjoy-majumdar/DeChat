package com.tencent.p014mm.plugin.multitalk.model;

import a70.C112760b;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import nw3.C109779e;

/* renamed from: com.tencent.mm.plugin.multitalk.model.m */
public class C105815m extends Thread {

    /* renamed from: A */
    public static byte[] f314653A = null;

    /* renamed from: B */
    public static int f314654B = 640;

    /* renamed from: C */
    public static int f314655C = 480;

    /* renamed from: y */
    public static byte[] f314656y = null;

    /* renamed from: z */
    public static byte[] f314657z = null;

    /* renamed from: d */
    public C104619a f314658d = null;

    /* renamed from: e */
    public Surface f314659e;

    /* renamed from: f */
    public byte[] f314660f = null;

    /* renamed from: g */
    public boolean f314661g = false;

    /* renamed from: h */
    public boolean f314662h = false;

    /* renamed from: i */
    public boolean f314663i = true;

    /* renamed from: j */
    public boolean f314664j = true;

    /* renamed from: n */
    public boolean f314665n = false;

    /* renamed from: o */
    public int f314666o = 0;

    /* renamed from: p */
    public byte[] f314667p = {0, 0, 0, 1};

    /* renamed from: q */
    public int f314668q = 0;

    /* renamed from: r */
    public int f314669r = 0;

    /* renamed from: s */
    public int f314670s = 0;

    /* renamed from: t */
    public int f314671t = 0;

    /* renamed from: u */
    public int f314672u = 0;

    /* renamed from: v */
    public int f314673v = 0;

    /* renamed from: w */
    public C105816a f314674w;

    /* renamed from: x */
    public int f314675x = 39;

    /* renamed from: com.tencent.mm.plugin.multitalk.model.m$a */
    public interface C105816a {
        /* renamed from: b */
        void mo150732b(int i, int i2);
    }

    static {
        C112760b.m154195C();
    }

    public C105815m(Surface surface) {
        if (surface != null) {
            this.f314659e = surface;
        }
    }

    /* renamed from: a */
    public int mo150782a() {
        this.f314666o++;
        Log.m105924i("MeidaCodec[HWDec]", "[HW]:DecFrmError: I Req mIReqFlag = " + this.f314665n + ", mIsHWDecEnable = " + this.f314663i + ", mHWErrorDecFrmCount = " + this.f314666o);
        if (!this.f314663i || this.f314666o > 10) {
            int i = this.f314661g ? 16 : 8;
            ByteBuffer allocate = ByteBuffer.allocate(6);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putShort(0);
            allocate.putShort((short) i);
            allocate.putShort(0);
            ((C109779e) C105851w0.xx0().f314798d).mo161038i(this.f314675x, allocate.array(), 6);
            this.f314663i = false;
            this.f314664j = false;
            this.f314666o = 0;
            Log.m105918d("MeidaCodec[HWDec]", "steve: Stop Decode Thread!");
            Log.m105924i("MeidaCodec[HWDec]", "[HW]: ErrFrm > threshold, end HWDec!!");
            return 0;
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(1);
        allocate2.order(ByteOrder.LITTLE_ENDIAN);
        allocate2.put((byte) 1);
        ((C109779e) C105851w0.xx0().f314798d).mo161038i(28, allocate2.array(), 1);
        this.f314665n = true;
        return 1;
    }

    /* renamed from: b */
    public final long mo150783b(byte[] bArr) {
        long c = mo150784c(bArr);
        long j = (1 + c) >> 1;
        return c % 2 == 0 ? -j : j;
    }

    /* renamed from: c */
    public final long mo150784c(byte[] bArr) {
        int i;
        long j = 0;
        long j2 = 0;
        while (true) {
            i = this.f314671t;
            if (i >= (this.f314670s << 3) || (bArr[i >> 3] & (128 >> (i & 7))) != 0) {
                this.f314671t = i + 1;
            } else {
                j2++;
                this.f314671t = i + 1;
            }
        }
        this.f314671t = i + 1;
        for (int i2 = 0; ((long) i2) < j2; i2++) {
            j <<= 1;
            int i3 = this.f314671t;
            if ((bArr[i3 >> 3] & (128 >> (i3 & 7))) != 0) {
                j++;
            }
            this.f314671t = i3 + 1;
        }
        return ((long) ((1 << ((int) j2)) - 1)) + j;
    }

    /* renamed from: d */
    public String mo150785d(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            str = str + hexString;
        }
        return str;
    }

    /* renamed from: e */
    public boolean mo150786e(byte[] bArr, int i) {
        String d = mo150785d(bArr);
        String d2 = mo150785d(new byte[]{0, 0, 3});
        Log.m105918d("MeidaCodec[HWDec]", "parent: " + d + ", child:" + d2);
        int indexOf = d.indexOf(d2, i);
        if (indexOf == -1) {
            return false;
        }
        Log.m105918d("MeidaCodec[HWDec]", "hack code detected!!pos: " + indexOf);
        return true;
    }

    /* renamed from: f */
    public boolean mo150787f(byte[] bArr, int i) {
        this.f314671t = 0;
        mo150788g(1, bArr);
        mo150788g(2, bArr);
        if (mo150788g(5, bArr) != 7) {
            return false;
        }
        long g = mo150788g(8, bArr);
        mo150788g(1, bArr);
        mo150788g(1, bArr);
        mo150788g(1, bArr);
        mo150788g(1, bArr);
        mo150788g(4, bArr);
        mo150788g(8, bArr);
        mo150784c(bArr);
        if (g == 100 || g == 110 || g == 122 || g == 144) {
            if (mo150784c(bArr) == 3) {
                mo150788g(1, bArr);
            }
            mo150784c(bArr);
            mo150784c(bArr);
            mo150788g(1, bArr);
            long[] jArr = new long[8];
            if (mo150788g(1, bArr) != 0) {
                for (int i2 = 0; i2 < 8; i2++) {
                    jArr[i2] = mo150788g(1, bArr);
                }
            }
        }
        mo150784c(bArr);
        long c = mo150784c(bArr);
        if (c == 0) {
            mo150784c(bArr);
        } else if (c == 1) {
            mo150788g(1, bArr);
            mo150783b(bArr);
            mo150783b(bArr);
            int c2 = (int) mo150784c(bArr);
            long[] jArr2 = new long[c2];
            for (int i3 = 0; i3 < c2; i3++) {
                jArr2[i3] = mo150783b(bArr);
            }
        }
        mo150784c(bArr);
        mo150788g(1, bArr);
        long c3 = mo150784c(bArr);
        long c4 = mo150784c(bArr);
        int i4 = ((int) (c3 + 1)) * 16;
        int i5 = ((int) (c4 + 1)) * 16;
        Log.m105925i("MeidaCodec[HWDec]", "newWidth[%d], newHeight[%d]", Integer.valueOf(i4), Integer.valueOf(i5));
        if (!(i4 == this.f314672u && i5 == this.f314673v)) {
            this.f314672u = i4;
            this.f314673v = i5;
            C105816a aVar = this.f314674w;
            if (aVar != null) {
                aVar.mo150732b(i4, i5);
            }
        }
        return true;
    }

    /* renamed from: g */
    public final long mo150788g(long j, byte[] bArr) {
        long j2 = 0;
        int i = 0;
        while (true) {
            boolean z = ((long) i) < j;
            int i2 = this.f314671t;
            if (!z || !(i2 < (this.f314670s << 3))) {
                return j2;
            }
            j2 <<= 1;
            if ((bArr[i2 >> 3] & (128 >> (i2 & 7))) != 0) {
                j2++;
            }
            this.f314671t = i2 + 1;
            i++;
        }
    }

    public void run() {
        C104619a aVar;
        while (!Thread.interrupted() && this.f314663i) {
            if (this.f314658d == null || !this.f314662h || !this.f314664j) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    Log.m105920e("MeidaCodec[HWDec]", " error:" + e.toString());
                }
            } else {
                try {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    int g = this.f314658d.mo148205g(bufferInfo, 10000);
                    Log.m105918d("MeidaCodec[HWDec]", "steve:  outIndex=" + g);
                    if (g == -3) {
                        Log.m105918d("MeidaCodec[HWDec]", "INFO_OUTPUT_BUFFERS_CHANGED");
                    } else if (g == -2) {
                        MediaFormat n = this.f314658d.mo148212n();
                        Log.m105924i("MeidaCodec[HWDec]", "DECODER_THREAD:: New format : " + n);
                        n.getInteger("width");
                        n.getInteger("height");
                    } else if (g == -1) {
                        Log.m105918d("MeidaCodec[HWDec]", "DECODER_THREAD:: dequeueOutputBuffer timed out!");
                    } else if (bufferInfo.size > 0) {
                        long j = bufferInfo.presentationTimeUs;
                        Log.m105918d("MeidaCodec[HWDec]", "DECODER_THREAD:: decoded SUCCESSFULLY!!! cnt : " + this.f314668q + ", size:" + bufferInfo.size + ", pts:" + bufferInfo.presentationTimeUs + ", latency:" + (System.currentTimeMillis() - j));
                        this.f314668q = this.f314668q + 1;
                        this.f314658d.mo148216r(g, true);
                        long currentTimeMillis = System.currentTimeMillis();
                        Log.m105918d("MeidaCodec[HWDec]", "steve: Avcdecoder frame processTime = " + (currentTimeMillis - j) + ", decFrameCnt=" + this.f314668q + ", endTime=" + currentTimeMillis);
                    } else {
                        Log.m105918d("MeidaCodec[HWDec]", "steve: drop frame: " + this.f314668q + ", size:" + bufferInfo.size + ", pts:" + bufferInfo.presentationTimeUs);
                        this.f314658d.mo148216r(g, false);
                    }
                } catch (Exception e2) {
                    this.f314663i = false;
                    mo150782a();
                    Log.m105920e("MeidaCodec[HWDec]", " dequeueOutputBuffer/releaseOutputBuffer error:" + e2.toString());
                }
            }
        }
        if (!this.f314663i && (aVar = this.f314658d) != null) {
            try {
                aVar.mo148223z();
                this.f314658d.mo148214p();
                this.f314658d = null;
            } catch (Exception e3) {
                Log.m105920e("MeidaCodec[HWDec]", " decoder stop  error:" + e3.toString());
            }
        }
    }
}
