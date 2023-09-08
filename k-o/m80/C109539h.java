package m80;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import o80.C109993a;
import rx3.C13598b0;

/* renamed from: m80.h */
public final class C109539h extends C109536e {

    /* renamed from: v */
    public final String f327891v;

    /* renamed from: w */
    public int f327892w;

    /* renamed from: x */
    public long f327893x;

    /* renamed from: y */
    public boolean f327894y;

    /* renamed from: z */
    public final C32224a<C13598b0> f327895z;

    /* renamed from: m80.h$a */
    public static final class C109540a extends MediaCodec.Callback {

        /* renamed from: a */
        public final /* synthetic */ C109539h f327896a;

        /* renamed from: b */
        public final /* synthetic */ String f327897b;

        /* renamed from: c */
        public final /* synthetic */ long f327898c;

        /* renamed from: d */
        public final /* synthetic */ C109993a f327899d;

        public C109540a(C109539h hVar, String str, long j, C109993a aVar) {
            this.f327896a = hVar;
            this.f327897b = str;
            this.f327898c = j;
            this.f327899d = aVar;
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(codecException, "e");
        }

        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            int i2;
            C87412m.m108594g(mediaCodec, "codec");
            try {
                String str = this.f327896a.f327891v;
                Log.m105924i(str, "onInputBufferAvailable, index:" + i + ", audioId:" + this.f327897b);
                this.f327896a.f327859n = Util.currentTicks();
                if (i >= 0) {
                    C104619a aVar = this.f327896a.f327853h;
                    ByteBuffer i3 = aVar != null ? aVar.mo148207i(i) : null;
                    if (i3 != null) {
                        i3.clear();
                    }
                    if (i3 != null) {
                        this.f327896a.f327894y = false;
                        if (!C109993a.m149513d(this.f327899d, i3, 0, 2, (Object) null)) {
                            Log.m105924i(this.f327896a.f327891v, "read sample end");
                            this.f327896a.f327894y = true;
                        }
                        long j = 0;
                        if (!this.f327896a.f327894y) {
                            int i4 = this.f327899d.f329162i;
                            i3.position(0);
                            j = this.f327899d.mo161325b();
                            String str2 = this.f327896a.f327891v;
                            Log.m105924i(str2, "sampleTime : " + j + ", sampleSize:" + i4 + ", audioId:" + this.f327897b);
                            if (i4 < 0 || j >= this.f327896a.f327893x * ((long) 1000)) {
                                C109539h hVar = this.f327896a;
                                hVar.f327894y = true;
                                String str3 = hVar.f327891v;
                                Log.m105924i(str3, "sawInputEOS, audioId:" + this.f327897b);
                            }
                            i2 = i4;
                        } else {
                            i2 = 0;
                        }
                        C109539h hVar2 = this.f327896a;
                        C104619a aVar2 = hVar2.f327853h;
                        if (aVar2 != null) {
                            aVar2.mo148213o(i, 0, i2, j, hVar2.f327894y ? 4 : 0);
                        }
                        C109539h hVar3 = this.f327896a;
                        if (hVar3.f327894y) {
                            MMHandlerThread.removeRunnable(new C109541b(hVar3.f327895z));
                            MMHandlerThread.postToMainThreadDelayed(new C109541b(hVar3.f327895z), 3000);
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace(this.f327896a.f327891v, e, "", new Object[0]);
            }
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(bufferInfo, "bufferInfo");
            try {
                String str = this.f327896a.f327891v;
                Log.m105924i(str, "onOutputBufferAvailable, index:" + i + ", bufferInfo:" + bufferInfo + " size:" + bufferInfo.size + ", audioId:" + this.f327897b);
                if (i >= 0) {
                    long j = bufferInfo.presentationTimeUs;
                    String str2 = this.f327896a.f327891v;
                    Log.m105924i(str2, "presentationTimeUs : " + j);
                    long j2 = (long) 1000;
                    if (j < this.f327898c * j2 && (bufferInfo.flags & 4) == 0) {
                        C104619a aVar = this.f327896a.f327853h;
                        if (aVar != null) {
                            aVar.mo148216r(i, false);
                        }
                        String str3 = this.f327896a.f327891v;
                        Log.m105924i(str3, "decoder pts: " + j + ", not reach start: " + (this.f327898c * j2) + ", audioId:" + this.f327897b);
                    } else if (bufferInfo.size == 0) {
                        String str4 = this.f327896a.f327891v;
                        Log.m105924i(str4, "decode zero size:" + this.f327897b + ", zeroCount:" + this.f327896a.f327892w);
                        C109539h hVar = this.f327896a;
                        hVar.f327892w = hVar.f327892w + 1;
                        C104619a aVar2 = hVar.f327853h;
                        if (aVar2 != null) {
                            aVar2.mo148216r(i, false);
                        }
                    } else {
                        C104619a aVar3 = this.f327896a.f327853h;
                        this.f327896a.mo160759c(aVar3 != null ? aVar3.mo148210l(i) : null, bufferInfo);
                        C104619a aVar4 = this.f327896a.f327853h;
                        if (aVar4 != null) {
                            aVar4.mo148216r(i, false);
                        }
                        C109539h hVar2 = this.f327896a;
                        long j3 = hVar2.f327893x;
                        if (j3 * j2 != 1 && j >= j3 * j2) {
                            String str5 = hVar2.f327891v;
                            Log.m105920e(str5, "exceed endTimeMs, audioId:" + this.f327897b);
                            this.f327896a.mo158418e();
                        } else if ((bufferInfo.flags & 4) != 0) {
                            String str6 = hVar2.f327891v;
                            Log.m105924i(str6, "receive eos! audioId:" + this.f327897b);
                            this.f327896a.mo158418e();
                        }
                    }
                } else {
                    C104619a aVar5 = this.f327896a.f327853h;
                    if (aVar5 != null) {
                        aVar5.mo148216r(i, false);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace(this.f327896a.f327891v, e, "", new Object[0]);
            }
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(mediaFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
            this.f327896a.f327854i = mediaFormat;
            int i = 0;
            boolean z = true;
            if (!mediaFormat.containsKey("sample-rate")) {
                z = false;
            }
            if (z) {
                MediaFormat mediaFormat2 = this.f327896a.f327854i;
                if (mediaFormat2 != null) {
                    i = mediaFormat2.getInteger("sample-rate");
                }
                if (i > 0) {
                    this.f327896a.f327857l = i;
                }
            }
            String str = this.f327896a.f327891v;
            Log.m105924i(str, "onOutputFormatChanged:" + this.f327896a.f327854i + ", aacSampleRate:" + this.f327896a.f327857l + ", audioId:" + this.f327897b);
        }
    }

    /* renamed from: m80.h$b */
    public static final class C109541b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f327900d;

        public C109541b(C32224a aVar) {
            this.f327900d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f327900d.invoke();
        }
    }

    /* renamed from: m80.h$c */
    public static final class C109542c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109539h f327901d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109542c(C109539h hVar) {
            super(0);
            this.f327901d = hVar;
        }

        public Object invoke() {
            String str = this.f327901d.f327891v;
            Log.m105924i(str, "delayStopDecoder, decoderStop:" + this.f327901d.f327855j);
            this.f327901d.mo158418e();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109539h(C109993a aVar, String str, long j, long j2, C32227p<? super byte[], ? super Long, C13598b0> pVar, C32224a<C13598b0> aVar2) {
        super(aVar, str, j, j2, pVar, aVar2);
        C87412m.m108594g(aVar, "mediaExtractorWrapper");
        C87412m.m108594g(str, "audioId");
        this.f327891v = "MicroMsg.MediaCodecAACDecoderAsync@" + str;
        this.f327893x = j2;
        C109540a aVar3 = new C109540a(this, str, j, aVar);
        C104619a aVar4 = this.f327853h;
        if (aVar4 != null) {
            aVar4.f310657a.setCallback(aVar3);
        }
        this.f327895z = new C109542c(this);
    }

    /* renamed from: d */
    public void mo158417d() {
        try {
            C104619a aVar = this.f327853h;
            if (aVar != null) {
                aVar.mo148222y();
            }
            String str = this.f327891v;
            Log.m105924i(str, "startDecoder " + this.f327847b);
        } catch (Exception e) {
            Log.printErrStackTrace(this.f327891v, e, "startDecoder error", new Object[0]);
        }
    }
}
