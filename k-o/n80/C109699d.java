package n80;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: n80.d */
public final class C109699d extends C109696a {

    /* renamed from: i */
    public List<C109700a> f328354i = Collections.synchronizedList(new ArrayList());

    /* renamed from: j */
    public List<Integer> f328355j = Collections.synchronizedList(new ArrayList());

    /* renamed from: k */
    public boolean f328356k;

    /* renamed from: l */
    public C109701b f328357l;

    /* renamed from: m */
    public final C32224a<C13598b0> f328358m;

    /* renamed from: n80.d$a */
    public static final class C109700a {

        /* renamed from: a */
        public byte[] f328359a;

        /* renamed from: b */
        public long f328360b;

        /* renamed from: c */
        public boolean f328361c;

        public C109700a(byte[] bArr, long j, boolean z) {
            this.f328359a = bArr;
            this.f328360b = j;
            this.f328361c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C109700a)) {
                return false;
            }
            C109700a aVar = (C109700a) obj;
            return C87412m.m108589b(this.f328359a, aVar.f328359a) && this.f328360b == aVar.f328360b && this.f328361c == aVar.f328361c;
        }

        public int hashCode() {
            byte[] bArr = this.f328359a;
            int hashCode = bArr == null ? 0 : Arrays.hashCode(bArr);
            long j = this.f328360b;
            int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            boolean z = this.f328361c;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "EncoderData(pcmData=" + Arrays.toString(this.f328359a) + ", pts=" + this.f328360b + ", isLast=" + this.f328361c + ')';
        }
    }

    /* renamed from: n80.d$b */
    public static final class C109701b extends MediaCodec.Callback {

        /* renamed from: a */
        public final /* synthetic */ C109699d f328362a;

        public C109701b(C109699d dVar) {
            this.f328362a = dVar;
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(codecException, "e");
            Log.m105920e("MicroMsg.MediaCodecAACEncoderAsync", "onError, e:" + codecException.getMessage() + ", " + codecException);
        }

        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            boolean z;
            C87412m.m108594g(mediaCodec, "codec");
            try {
                Log.m105924i("MicroMsg.MediaCodecAACEncoderAsync", "has input buffer " + i);
                if (this.f328362a.f328354i.size() == 0) {
                    Log.m105924i("MicroMsg.MediaCodecAACEncoderAsync", "current data is null");
                    this.f328362a.f328355j.add(Integer.valueOf(i));
                    return;
                }
                Log.m105924i("MicroMsg.MediaCodecAACEncoderAsync", "has input buffer avaiable" + i);
                if (this.f328362a.f328340e) {
                    Log.m105924i("MicroMsg.MediaCodecAACEncoderAsync", "sendDataToEncoder end now");
                    return;
                }
                this.f328362a.f328341f = Util.currentTicks();
                if (i < 0) {
                    Log.m105918d("MicroMsg.MediaCodecAACEncoderAsync", "encoder no input buffer available, drain first");
                    return;
                }
                List<C109700a> list = this.f328362a.f328354i;
                C87412m.m108593f(list, "inputDataSource");
                C109700a aVar = (C109700a) C110818d0.m150914L(list);
                byte[] bArr = aVar.f328359a;
                long j = aVar.f328360b;
                boolean z2 = aVar.f328361c;
                StringBuilder sb = new StringBuilder();
                sb.append("encode data, pts:");
                sb.append(j);
                sb.append(", isLast:");
                sb.append(z2);
                sb.append(", pcmData:");
                sb.append(bArr != null ? Integer.valueOf(bArr.length) : null);
                sb.append(", inputDataSource.size:");
                sb.append(this.f328362a.f328354i.size());
                Log.m105924i("MicroMsg.MediaCodecAACEncoderAsync", sb.toString());
                if (bArr != null && i >= 0) {
                    ByteBuffer i2 = this.f328362a.f328338c.mo148207i(i);
                    if (i2 != null) {
                        i2.clear();
                    }
                    if (i2 != null) {
                        i2.position(0);
                    }
                    if (i2 != null) {
                        i2.put(bArr);
                    }
                    if (z2) {
                        Log.m105924i("MicroMsg.MediaCodecAACEncoderAsync", "last, send EOS and try delay stop encoder");
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        this.f328362a.getClass();
                        Log.m105924i("MicroMsg.MediaCodecAACEncoderAsync", "EOS received in sendAudioToEncoder");
                        this.f328362a.f328338c.mo148213o(i, 0, bArr.length, j, 4);
                        C109699d dVar = this.f328362a;
                        MMHandlerThread.removeRunnable(new C109702c(dVar.f328358m));
                        MMHandlerThread.postToMainThreadDelayed(new C109702c(dVar.f328358m), 2000);
                    } else {
                        this.f328362a.f328338c.mo148213o(i, 0, bArr.length, j, 0);
                    }
                    this.f328362a.f328354i.remove(aVar);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MediaCodecAACEncoderAsync", e, "onInputBufferAvailable error", new Object[0]);
            }
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(bufferInfo, "info");
            try {
                Log.m105919d("MicroMsg.MediaCodecAACEncoderAsync", "encoderOutputBufferIndex: %s", Integer.valueOf(i));
                if (i == -1) {
                    Log.m105918d("MicroMsg.MediaCodecAACEncoderAsync", "no output available, break");
                } else if (i == -2) {
                    C109699d dVar = this.f328362a;
                    MediaFormat n = dVar.f328338c.mo148212n();
                    C87412m.m108593f(n, "encoder.outputFormat");
                    dVar.getClass();
                    dVar.f328339d = n;
                    Log.m105925i("MicroMsg.MediaCodecAACEncoderAsync", "dstMediaFormat change: %s", this.f328362a.f328339d);
                } else if (i < 0) {
                    Log.m105921e("MicroMsg.MediaCodecAACEncoderAsync", "unexpected encoderOutputBufferIndex: %s", Integer.valueOf(i));
                } else {
                    if ((bufferInfo.flags & 2) != 0) {
                        this.f328362a.getClass();
                        Log.m105927v("MicroMsg.MediaCodecAACEncoderAsync", "ignoring BUFFER_FLAG_CODEC_CONFIG,size: %s, %s", Integer.valueOf(bufferInfo.size), Boolean.TRUE);
                        this.f328362a.getClass();
                        bufferInfo.size = 0;
                    }
                    Log.m105926v("MicroMsg.MediaCodecAACEncoderAsync", "perform encoding");
                    this.f328362a.mo160914a(this.f328362a.f328338c.mo148210l(i), bufferInfo);
                    this.f328362a.f328338c.mo148216r(i, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        Log.m105924i("MicroMsg.MediaCodecAACEncoderAsync", "receive EOS!");
                        this.f328362a.mo160915b();
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MediaCodecAACEncoderAsync", e, "drainEncoder error: %s", e.getMessage());
            }
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(mediaFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
            Log.m105924i("MicroMsg.MediaCodecAACEncoderAsync", "onOutputFormatChanged: " + mediaFormat);
        }
    }

    /* renamed from: n80.d$c */
    public static final class C109702c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f328363d;

        public C109702c(C32224a aVar) {
            this.f328363d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f328363d.invoke();
        }
    }

    /* renamed from: n80.d$d */
    public static final class C109703d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109699d f328364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109703d(C109699d dVar) {
            super(0);
            this.f328364d = dVar;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.MediaCodecAACEncoderAsync", "checkDelayFinishEncoder, isEnd:" + this.f328364d.f328340e);
            this.f328364d.mo160915b();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109699d(MediaFormat mediaFormat, C32228q<? super ByteBuffer, ? super MediaCodec.BufferInfo, ? super MediaFormat, C13598b0> qVar, C32224a<C13598b0> aVar) {
        super(mediaFormat, qVar, aVar);
        C87412m.m108594g(mediaFormat, "mediaFormat");
        C87412m.m108594g(qVar, "frameEncodeCallback");
        C87412m.m108594g(aVar, "frameEncodeEndCallback");
        C109701b bVar = new C109701b(this);
        this.f328357l = bVar;
        try {
            this.f328338c.f310657a.setCallback(bVar);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecAACEncoderAsync", e, "", new Object[0]);
        }
        this.f328358m = new C109703d(this);
    }

    /* renamed from: c */
    public void mo160916c(byte[] bArr, long j, boolean z) {
        C87412m.m108594g(bArr, "data");
        this.f328354i.add(new C109700a(bArr, j, z));
        if (this.f328355j.size() > 0) {
            List<Integer> list = this.f328355j;
            C87412m.m108593f(list, "availableIndex");
            Integer num = (Integer) C110818d0.m150914L(list);
            this.f328355j.remove(num);
            C109701b bVar = this.f328357l;
            MediaCodec mediaCodec = this.f328338c.f310657a;
            C87412m.m108593f(mediaCodec, "encoder.mediaCodecImpl");
            C87412m.m108593f(num, FirebaseAnalytics.C113379b.INDEX);
            bVar.onInputBufferAvailable(mediaCodec, num.intValue());
        }
        if (!this.f328356k) {
            this.f328338c.mo148222y();
            this.f328356k = true;
        }
    }
}
