package m80;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import java.nio.ByteBuffer;
import o80.C109993a;
import p206nj.C11171e;
import rx3.C13598b0;
import s62.C101554f;
import z04.C112551y;

/* renamed from: m80.j */
public final class C109544j extends C109537f {

    /* renamed from: A */
    public volatile boolean f327905A;

    /* renamed from: x */
    public final String f327906x = "MicroMsg.MediaCodecTransDecoderAsync";

    /* renamed from: y */
    public HandlerThread f327907y;

    /* renamed from: z */
    public boolean f327908z;

    /* renamed from: m80.j$a */
    public static final class C109545a extends MediaCodec.Callback {

        /* renamed from: a */
        public final /* synthetic */ C109544j f327909a;

        /* renamed from: b */
        public final /* synthetic */ C109993a f327910b;

        public C109545a(C109544j jVar, C109993a aVar) {
            this.f327909a = jVar;
            this.f327910b = aVar;
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(codecException, "e");
            String str = this.f327909a.f327906x;
            Log.m105920e(str, "onError, codec:" + mediaCodec + ", " + codecException.isRecoverable() + ' ' + codecException.isTransient() + ' ' + codecException.getDiagnosticInfo());
            if (this.f327909a.f327885s) {
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailedAsyncOnError");
                C115669n.INSTANCE.mo175913w(986, 80, 1);
            }
            if (!codecException.isRecoverable() && !codecException.isTransient()) {
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailedAsyncOnErrorStop");
                C115669n.INSTANCE.mo175913w(986, 80, 1);
                this.f327909a.mo145767c();
                C32224a<C13598b0> aVar = this.f327909a.f327877k;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            C87412m.m108594g(mediaCodec, "codec");
            String str = this.f327909a.f327906x;
            Log.m105924i(str, "onInputBufferAvailable, index:" + i);
            if (i >= 0) {
                try {
                    ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i);
                    C87412m.m108592e(inputBuffer, "null cannot be cast to non-null type java.nio.ByteBuffer");
                    inputBuffer.clear();
                    if (C109993a.m149513d(this.f327910b, inputBuffer, 0, 2, (Object) null)) {
                        long b = this.f327910b.mo161325b();
                        int i2 = this.f327910b.f329162i;
                        String str2 = this.f327909a.f327906x;
                        Log.m105924i(str2, "input sampleTime:" + b + ", sampleSize:" + i2);
                        inputBuffer.position(0);
                        C104619a aVar = this.f327909a.f327872f;
                        C87412m.m108591d(aVar);
                        aVar.mo148213o(i, 0, i2, b, 0);
                        return;
                    }
                    Log.m105924i(this.f327909a.f327906x, "read sample end");
                    this.f327909a.f327905A = true;
                    C104619a aVar2 = this.f327909a.f327872f;
                    C87412m.m108591d(aVar2);
                    aVar2.mo148213o(i, 0, 0, 0, 4);
                } catch (Exception e) {
                    Log.printErrStackTrace(this.f327909a.f327906x, e, "onInputBufferAvailable error", new Object[0]);
                    if (this.f327909a.f327885s) {
                        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
                        C115669n.INSTANCE.mo175913w(986, 76, 1);
                    }
                }
            }
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(bufferInfo, "bufferInfo");
            String str = this.f327909a.f327906x;
            Log.m105924i(str, "onOutputBufferAvailable, index:" + i + ", bufferInfo:" + bufferInfo + " size:" + bufferInfo.size + ", isFinished:" + this.f327909a.f327881o);
            if (i >= 0) {
                try {
                    long j = bufferInfo.presentationTimeUs;
                    String str2 = this.f327909a.f327906x;
                    Log.m105924i(str2, "presentationTimeUs : " + j);
                    C109544j jVar = this.f327909a;
                    long j2 = (long) 1000;
                    if (j >= jVar.f327867a * j2 || (bufferInfo.flags & 4) != 0) {
                        jVar.mo160761b(i, bufferInfo);
                        C109544j jVar2 = this.f327909a;
                        long j3 = jVar2.f327868b * j2;
                        if (j3 != 1 && j >= j3) {
                            Log.m105920e(jVar2.f327906x, "exceed endTimeMs");
                            C109544j jVar3 = this.f327909a;
                            Log.m105924i(jVar3.f327906x, "onDecodeEnd ");
                            if (!jVar3.f327908z) {
                                C32224a<C13598b0> aVar = jVar3.f327875i;
                                if (aVar != null) {
                                    aVar.invoke();
                                }
                                jVar3.f327908z = true;
                            }
                            this.f327909a.mo145767c();
                        } else if ((bufferInfo.flags & 4) != 0 || jVar2.f327905A) {
                            Log.m105924i(this.f327909a.f327906x, "receive eos!");
                            C109544j jVar4 = this.f327909a;
                            Log.m105924i(jVar4.f327906x, "onDecodeEnd ");
                            if (!jVar4.f327908z) {
                                C32224a<C13598b0> aVar2 = jVar4.f327875i;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                                jVar4.f327908z = true;
                            }
                            this.f327909a.mo145767c();
                        }
                    } else {
                        C104619a aVar3 = jVar.f327872f;
                        C87412m.m108591d(aVar3);
                        aVar3.mo148216r(i, false);
                        String str3 = this.f327909a.f327906x;
                        Log.m105924i(str3, "decoder pts: " + j + ", not reach start: " + (this.f327909a.f327867a * j2));
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace(this.f327909a.f327906x, e, "onOutputBufferAvailable error", new Object[0]);
                    if (this.f327909a.f327885s) {
                        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
                        C115669n.INSTANCE.mo175913w(986, 76, 1);
                    }
                }
            } else {
                C104619a aVar4 = this.f327909a.f327872f;
                C87412m.m108591d(aVar4);
                aVar4.mo148216r(i, false);
            }
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            C32226l<? super MediaFormat, C13598b0> lVar;
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(mediaFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
            C109544j jVar = this.f327909a;
            jVar.f327873g = mediaFormat;
            String str = jVar.f327906x;
            Log.m105924i(str, "decoder output format changed: " + this.f327909a.f327873g);
            C109544j jVar2 = this.f327909a;
            MediaFormat mediaFormat2 = jVar2.f327873g;
            if (mediaFormat2 != null && (lVar = jVar2.f327876j) != null) {
                lVar.invoke(mediaFormat2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109544j(long j, long j2, C109993a aVar, Surface surface, int i, boolean z, C32226l<? super C109537f, C13598b0> lVar) {
        super(j, j2, aVar, surface, i, z);
        C87412m.m108594g(aVar, "mediaExtractorWrapper");
        int i2 = C58834h.f168432b;
        this.f327907y = C97749e.m126093a("MediaCodecTransDecoderAsync_decodeThread", 5);
        C109545a aVar2 = new C109545a(this, aVar);
        try {
            this.f327873g = aVar.f329158e;
            String c = aVar.mo161326c();
            if (C112551y.m153809i("video/dolby-vision", c, true) && !C101554f.m133321f()) {
                c = "video/hevc";
            }
            this.f327872f = C104619a.m140211c(c);
            Log.m105924i("MicroMsg.MediaCodecTransDecoderAsync", "mediaExtractorWrapper.getVideoMIME() :" + aVar.mo161326c());
            if (C11171e.m11046c(23)) {
                this.f327907y.start();
                Handler handler = new Handler(this.f327907y.getLooper());
                C104619a aVar3 = this.f327872f;
                C87412m.m108591d(aVar3);
                aVar3.mo148218u(aVar2, handler);
            } else {
                C104619a aVar4 = this.f327872f;
                C87412m.m108591d(aVar4);
                aVar4.f310657a.setCallback(aVar2);
            }
            C104619a aVar5 = this.f327872f;
            C87412m.m108591d(aVar5);
            aVar5.mo148202a(this.f327873g, surface, (MediaCrypto) null, 0);
            if (lVar != null) {
                lVar.invoke(this);
            }
        } catch (Exception e) {
            String str = this.f327906x;
            Log.printErrStackTrace(str, e, "create decoder error:" + e.getMessage(), new Object[0]);
            throw new IllegalStateException("init decoder error");
        }
    }

    /* renamed from: c */
    public void mo145767c() {
        super.mo145767c();
        try {
            this.f327907y.quit();
        } catch (Exception e) {
            String str = this.f327906x;
            Log.printErrStackTrace(str, e, "releaseDecoder error:" + e.getMessage(), new Object[0]);
        }
    }

    /* renamed from: e */
    public void mo145769e() {
        try {
            C104619a aVar = this.f327872f;
            C87412m.m108591d(aVar);
            aVar.mo148222y();
        } catch (Exception e) {
            Log.printErrStackTrace(this.f327906x, e, "startDecode error", new Object[0]);
        }
    }
}
