package m80;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import iy3.C60641c;
import java.nio.ByteBuffer;
import o80.C109993a;
import rx3.C13598b0;

/* renamed from: m80.e */
public abstract class C109536e {

    /* renamed from: a */
    public C109993a f327846a;

    /* renamed from: b */
    public String f327847b;

    /* renamed from: c */
    public long f327848c;

    /* renamed from: d */
    public long f327849d;

    /* renamed from: e */
    public C32227p<? super byte[], ? super Long, C13598b0> f327850e;

    /* renamed from: f */
    public C32224a<C13598b0> f327851f;

    /* renamed from: g */
    public final String f327852g;

    /* renamed from: h */
    public C104619a f327853h;

    /* renamed from: i */
    public MediaFormat f327854i;

    /* renamed from: j */
    public volatile boolean f327855j;

    /* renamed from: k */
    public int f327856k;

    /* renamed from: l */
    public int f327857l;

    /* renamed from: m */
    public final Object f327858m = new Object();

    /* renamed from: n */
    public long f327859n;

    /* renamed from: o */
    public long f327860o;

    /* renamed from: p */
    public MediaCodec.BufferInfo f327861p = new MediaCodec.BufferInfo();

    /* renamed from: q */
    public String f327862q = "";

    /* renamed from: r */
    public int f327863r;

    /* renamed from: s */
    public long f327864s;

    /* renamed from: t */
    public final int f327865t = 1024;

    /* renamed from: u */
    public long f327866u;

    public C109536e(C109993a aVar, String str, long j, long j2, C32227p<? super byte[], ? super Long, C13598b0> pVar, C32224a<C13598b0> aVar2) {
        MediaFormat mediaFormat;
        MediaFormat mediaFormat2;
        C87412m.m108594g(str, "audioId");
        this.f327846a = aVar;
        this.f327847b = str;
        this.f327848c = j;
        this.f327849d = j2;
        this.f327850e = pVar;
        this.f327851f = aVar2;
        String str2 = "MicroMsg.IAudioDecoder@" + this.f327847b;
        this.f327852g = str2;
        C109993a aVar3 = this.f327846a;
        if (aVar3 != null) {
            this.f327854i = aVar3.f329159f;
            Log.m105924i(str2, "create MediaCodecAACDecoder, audioId:" + this.f327847b + ", startTimeMs:" + this.f327848c + ", endTimeMs:" + this.f327849d + ", mediaFormat:" + this.f327854i);
            MediaFormat mediaFormat3 = this.f327854i;
            if (mediaFormat3 != null) {
                C87412m.m108591d(mediaFormat3);
                int integer = mediaFormat3.getInteger("channel-count");
                this.f327856k = integer;
                MediaFormat mediaFormat4 = this.f327854i;
                if (mediaFormat4 != null) {
                    mediaFormat4.setInteger("max-input-size", integer * 16384);
                }
                MediaFormat mediaFormat5 = this.f327854i;
                C87412m.m108591d(mediaFormat5);
                this.f327857l = mediaFormat5.getInteger("sample-rate");
                MediaFormat mediaFormat6 = this.f327854i;
                C87412m.m108591d(mediaFormat6);
                String string = mediaFormat6.getString("mime");
                C87412m.m108591d(string);
                this.f327862q = string;
                MediaFormat mediaFormat7 = this.f327854i;
                boolean z = true;
                if ((mediaFormat7 != null && mediaFormat7.containsKey("encoder-delay")) && (mediaFormat2 = this.f327854i) != null) {
                    mediaFormat2.setInteger("encoder-delay", 0);
                }
                MediaFormat mediaFormat8 = this.f327854i;
                if (((mediaFormat8 == null || !mediaFormat8.containsKey("encoder-padding")) ? false : z) && (mediaFormat = this.f327854i) != null) {
                    mediaFormat.setInteger("encoder-padding", 0);
                }
                aVar3.mo161329g();
                long j3 = this.f327848c;
                if (j3 >= 0) {
                    aVar3.mo161328f(j3 * ((long) 1000));
                }
                C104619a c = C104619a.m140211c(this.f327862q);
                this.f327853h = c;
                c.mo148202a(this.f327854i, (Surface) null, (MediaCrypto) null, 0);
            }
        }
    }

    /* renamed from: a */
    public int mo158415a() {
        return this.f327856k;
    }

    /* renamed from: b */
    public int mo158416b() {
        return this.f327857l;
    }

    /* renamed from: c */
    public final void mo160759c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaCodec.BufferInfo bufferInfo2;
        ByteBuffer byteBuffer2 = byteBuffer;
        MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
        C87412m.m108594g(bufferInfo3, "bufferInfo");
        if (this.f327864s <= 0) {
            this.f327864s = C60641c.m70922c(((((double) this.f327865t) * 1.0d) / ((double) this.f327857l)) * ((double) 1000000));
            Log.m105924i(this.f327852g, "checkFrameDuration, frameDuration:" + this.f327864s);
        }
        if (byteBuffer2 != null) {
            byteBuffer2.position(bufferInfo3.offset);
            byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            int i = 0;
            byteBuffer2.position(0);
            byteBuffer2.get(bArr);
            int i2 = 1;
            if (!(remaining == 0)) {
                Log.m105924i(this.f327852g, "decoder pcmData size:" + remaining + ", pts:" + bufferInfo3.presentationTimeUs + ", diff:" + (bufferInfo3.presentationTimeUs - this.f327866u) + ", audioId:" + this.f327847b + ", frameCount:" + this.f327863r);
                long ticksToNow = Util.ticksToNow(this.f327859n);
                this.f327860o = this.f327860o + ticksToNow;
                String str = this.f327852g;
                StringBuilder sb = new StringBuilder();
                sb.append(hashCode());
                sb.append(" decode frame cost ");
                sb.append(ticksToNow);
                Log.m105924i(str, sb.toString());
                int i3 = this.f327856k == 1 ? 2048 : 4096;
                if (remaining > i3) {
                    int i4 = remaining / i3;
                    int i5 = 0;
                    int i6 = 0;
                    while (remaining > 0) {
                        int i7 = remaining > i3 ? i3 : remaining;
                        byte[] bArr2 = new byte[i7];
                        System.arraycopy(bArr, i5, bArr2, i, i7);
                        remaining -= i7;
                        i5 += i7;
                        i6 += i2;
                        long j = this.f327864s * ((long) this.f327863r);
                        String str2 = this.f327852g;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("split ret pcmData, leftSize:");
                        sb4.append(remaining);
                        sb4.append(", sizeOffset:");
                        sb4.append(i5);
                        sb4.append(", maxBufferSize:");
                        sb4.append(i3);
                        sb4.append(", copySize:");
                        sb4.append(i7);
                        sb4.append(", data.size:");
                        sb4.append(i7);
                        sb4.append(", splitCount:");
                        sb4.append(i4);
                        sb4.append(", bufferInfo.pts:");
                        MediaCodec.BufferInfo bufferInfo4 = bufferInfo;
                        int i8 = i3;
                        sb4.append(bufferInfo4.presentationTimeUs);
                        sb4.append(", pts:");
                        sb4.append(j);
                        sb4.append(", count:");
                        sb4.append(i6);
                        Log.m105924i(str2, sb4.toString());
                        C32227p<? super byte[], ? super Long, C13598b0> pVar = this.f327850e;
                        if (pVar != null) {
                            C13598b0 invoke = pVar.invoke(bArr2, Long.valueOf(j));
                        }
                        this.f327863r++;
                        bufferInfo3 = bufferInfo4;
                        i3 = i8;
                        i2 = 1;
                        i = 0;
                    }
                } else {
                    bufferInfo2 = bufferInfo3;
                    C32227p<? super byte[], ? super Long, C13598b0> pVar2 = this.f327850e;
                    if (pVar2 != null) {
                        C13598b0 invoke2 = pVar2.invoke(bArr, Long.valueOf(bufferInfo2.presentationTimeUs));
                    }
                    this.f327863r++;
                    this.f327866u = bufferInfo2.presentationTimeUs;
                }
            }
            bufferInfo2 = bufferInfo3;
            this.f327866u = bufferInfo2.presentationTimeUs;
        }
    }

    /* renamed from: d */
    public abstract void mo158417d();

    /* renamed from: e */
    public void mo158418e() {
        Log.printDebugStack(this.f327852g, "stop decoder", new Object[0]);
        synchronized (this.f327858m) {
            Log.m105924i(this.f327852g, "stopDecoder in lock");
            try {
                if (!this.f327855j) {
                    this.f327855j = true;
                    C104619a aVar = this.f327853h;
                    if (aVar != null) {
                        aVar.mo148223z();
                    }
                    C104619a aVar2 = this.f327853h;
                    if (aVar2 != null) {
                        aVar2.mo148214p();
                    }
                    C32224a<C13598b0> aVar3 = this.f327851f;
                    if (aVar3 != null) {
                        C13598b0 invoke = aVar3.invoke();
                    }
                    String str = this.f327852g;
                    Log.m105924i(str, hashCode() + " total decode used " + this.f327860o);
                }
            } catch (Exception e) {
                Log.printErrStackTrace(this.f327852g, e, "stopDecoder error", new Object[0]);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
