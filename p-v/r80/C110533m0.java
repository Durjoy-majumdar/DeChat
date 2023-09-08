package r80;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.C85456b;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.FileUtils;
import gy3.C8480h;
import gy3.C87412m;
import i72.C98606a;
import java.nio.ByteBuffer;
import o80.C109993a;
import rx3.C13598b0;
import w80.C111750i;

/* renamed from: r80.m0 */
public final class C110533m0 {

    /* renamed from: a */
    public final long f330529a;

    /* renamed from: b */
    public final long f330530b;

    /* renamed from: c */
    public final int f330531c;

    /* renamed from: d */
    public final boolean f330532d;

    /* renamed from: e */
    public C106139e f330533e;

    /* renamed from: f */
    public int f330534f;

    /* renamed from: g */
    public int f330535g;

    /* renamed from: h */
    public boolean f330536h;

    /* renamed from: i */
    public boolean f330537i;

    public C110533m0(long j, long j2, int i, boolean z, boolean z2, C111750i.C102362a aVar) {
        C106139e eVar;
        this.f330529a = j;
        this.f330530b = j2;
        this.f330531c = i;
        this.f330532d = z;
        int i2 = (int) (j2 - j);
        this.f330535g = i2;
        if (i2 != 0 && !z) {
            this.f330533e = C106139e.f316165b.mo151879a(z2);
        }
        this.f330536h = false;
        this.f330537i = C85456b.m105450c(z, z2);
        StringBuilder sb = new StringBuilder();
        sb.append("init endTime:");
        sb.append(j2);
        sb.append(", startTime:");
        sb.append(j);
        sb.append(", duration:");
        sb.append(this.f330535g);
        sb.append(", bufId:");
        C106139e eVar2 = this.f330533e;
        sb.append(eVar2 != null ? Integer.valueOf(eVar2.f316167a) : null);
        sb.append(", enableHevc:");
        sb.append(z2);
        Log.m105924i("MicroMsg.MixMuxerController", sb.toString());
        if (aVar != null && Build.VERSION.SDK_INT >= 24 && (eVar = this.f330533e) != null) {
            C111750i.f334661a.mo163489b(eVar, aVar);
        }
    }

    /* renamed from: d */
    public static void m150457d(C110533m0 m0Var, C109993a aVar, long j, long j2, int i, Object obj) {
        C110533m0 m0Var2 = m0Var;
        C109993a aVar2 = aVar;
        long j3 = (i & 2) != 0 ? m0Var2.f330529a : j;
        long j4 = (i & 4) != 0 ? m0Var2.f330530b : j2;
        if (aVar2 == null) {
            m0Var.getClass();
        } else if (m0Var2.f330536h) {
            Log.m105920e("MicroMsg.MixMuxerController", "writeAudioData, already release");
        } else if (aVar2.f329165l) {
            Log.m105920e("MicroMsg.MixMuxerController", "writeAudioData, mediaExtractor already release");
        } else {
            int i2 = aVar2.f329157d;
            String a = aVar.mo161324a();
            MediaFormat mediaFormat = aVar2.f329159f;
            if (i2 >= 0 && mediaFormat != null && !Util.isNullOrNil(a)) {
                Log.m105924i("MicroMsg.MixMuxerController", "writeAudioData, startTime: " + j3);
                aVar.mo161329g();
                int i3 = 1000;
                if (j3 > 0) {
                    Log.m105924i("MicroMsg.MixMuxerController", "writeAudioData, seek to startTime:" + m0Var2.f330529a);
                    aVar2.mo161328f(((long) 1000) * j3);
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaFormat.containsKey("max-input-size") ? mediaFormat.getInteger("max-input-size") : 1024);
                while (true) {
                    try {
                        allocateDirect.clear();
                        C109993a.m149513d(aVar2, allocateDirect, 0, 2, (Object) null);
                        int i4 = aVar2.f329162i;
                        Log.m105919d("MicroMsg.MixMuxerController", "sampleSize: %d", Integer.valueOf(i4));
                        if (i4 <= 0) {
                            Log.m105925i("MicroMsg.MixMuxerController", "muxAudio size = %d. Saw eos.", Integer.valueOf(i4));
                            return;
                        }
                        long b = aVar.mo161325b();
                        Log.m105924i("MicroMsg.MixMuxerController", "aac pts:" + b);
                        int i5 = i4;
                        long j5 = (long) i3;
                        if (b >= j4 * j5) {
                            Log.m105924i("MicroMsg.MixMuxerController", "pts exceed endTime");
                            return;
                        } else if (aVar2.f329155b.mo161384c() != i2) {
                            Log.m105920e("MicroMsg.MixMuxerController", "track index not match! break");
                            return;
                        } else {
                            if (b < j5 * j3) {
                                Log.m105924i("MicroMsg.MixMuxerController", "not reach start");
                            } else {
                                allocateDirect.position(0);
                                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                bufferInfo.set(0, i5, b, 0);
                                m0Var2.mo161989c(allocateDirect, bufferInfo, mediaFormat);
                            }
                            i3 = 1000;
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.MixMuxerController", e, "writeAudioData error", new Object[0]);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo161987a(C109993a aVar, String str, int i, int i2, boolean z) {
        int i3;
        int i4;
        C109993a aVar2 = aVar;
        String str2 = str;
        int i5 = i;
        int i6 = i2;
        C87412m.m108594g(str2, "muxOuputFilePath");
        int i7 = -1;
        if (this.f330536h) {
            Log.m105920e("MicroMsg.MixMuxerController", "output, already release");
            return -1;
        } else if (this.f330534f > 0 || this.f330532d) {
            Log.m105924i("MicroMsg.MixMuxerController", "sampelRate:" + i5 + ", channelCount:" + i6);
            boolean z2 = false;
            boolean z3 = true;
            if (i5 == 0 || i6 == 0) {
                if (aVar2 != null) {
                    int i8 = aVar2.f329157d;
                    String a = aVar.mo161324a();
                    MediaFormat mediaFormat = aVar2.f329159f;
                    if (i8 >= 0 && mediaFormat != null && !Util.isNullOrNil(a)) {
                        i3 = mediaFormat.getInteger("channel-count");
                        i4 = mediaFormat.getInteger("sample-rate");
                    }
                }
                i4 = i5;
                i3 = i6;
                z2 = true;
            } else {
                i4 = i5;
                i3 = i6;
            }
            float f = (((float) this.f330534f) * 1000.0f) / ((float) this.f330535g);
            if (i3 > 0 || i4 > 0) {
                z3 = z2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("output, fps:");
            sb.append(f);
            sb.append(", frameCount:");
            sb.append(this.f330534f);
            sb.append(", outputBitrate:");
            sb.append(this.f330531c);
            sb.append(", finalChannelCount:");
            sb.append(i3);
            sb.append(", finalSampleRate:");
            sb.append(i4);
            sb.append(", outputPath:");
            sb.append(str2);
            sb.append(", bufId:");
            C106139e eVar = this.f330533e;
            sb.append(eVar != null ? Integer.valueOf(eVar.f316167a) : null);
            sb.append(", mute:");
            sb.append(z);
            sb.append(", videoMute:");
            sb.append(z3);
            sb.append(", mediaExtractor:");
            sb.append(aVar2);
            Log.m105924i("MicroMsg.MixMuxerController", sb.toString());
            C106139e eVar2 = this.f330533e;
            if (eVar2 != null) {
                i7 = eVar2.mo151874b(str, Math.max(1000, this.f330535g), f, z, i4, i3);
            }
            mo161988b();
            if (i7 < 0) {
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMuxVideoError");
                C115669n.INSTANCE.mo175913w(986, 84, 1);
            }
            return i7;
        } else {
            Log.m105920e("MicroMsg.MixMuxerController", "output, no write h264 frame!!");
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxResultVideoFrameCountError");
            C115669n.INSTANCE.mo175913w(986, 83, 1);
            return -1;
        }
    }

    /* renamed from: b */
    public final void mo161988b() {
        Log.m105924i("MicroMsg.MixMuxerController", "release");
        C106139e eVar = this.f330533e;
        if (eVar != null) {
            eVar.mo151875c();
        }
        this.f330533e = null;
        this.f330536h = true;
    }

    /* renamed from: c */
    public final void mo161989c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, MediaFormat mediaFormat) {
        C87412m.m108594g(byteBuffer, "encodeData");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        if (this.f330536h) {
            Log.m105920e("MicroMsg.MixMuxerController", "writeAACData, already release");
        } else if (this.f330537i) {
            C106139e eVar = this.f330533e;
            if (eVar != null) {
                int i = bufferInfo.size;
                long j = bufferInfo.presentationTimeUs;
                boolean z = false;
                int integer = mediaFormat != null && mediaFormat.containsKey("aac-profile") ? mediaFormat.getInteger("aac-profile") : 2;
                int b = mediaFormat != null && mediaFormat.containsKey("sample-rate") ? C98606a.m128205b(mediaFormat.getInteger("sample-rate")) : 4;
                if (mediaFormat != null && mediaFormat.containsKey("channel-count")) {
                    z = true;
                }
                eVar.mo151876d(byteBuffer, i, j, integer, b, z ? mediaFormat.getInteger("channel-count") : 1);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("writeAACData: ");
            sb.append(byteBuffer.capacity());
            sb.append(", ");
            sb.append(bufferInfo.size);
            sb.append(", bufId:");
            C106139e eVar2 = this.f330533e;
            sb.append(eVar2 != null ? Integer.valueOf(eVar2.f316167a) : null);
            Log.m105924i("MicroMsg.MixMuxerController", sb.toString());
            C106139e eVar3 = this.f330533e;
            if (eVar3 != null) {
                C106139e.m142774e(eVar3, byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs, 0, 0, 0, 56, (Object) null);
            }
        }
    }

    /* renamed from: e */
    public final void mo161990e(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        C87412m.m108594g(byteBuffer, "encodeData");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        if (this.f330536h) {
            Log.m105920e("MicroMsg.MixMuxerController", "writeVideoData, already release");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("writeH264Data: ");
        sb.append(byteBuffer.capacity());
        sb.append(", ");
        sb.append(bufferInfo.size);
        sb.append(", bufId:");
        C106139e eVar = this.f330533e;
        sb.append(eVar != null ? Integer.valueOf(eVar.f316167a) : null);
        sb.append(", pts:");
        sb.append(bufferInfo.presentationTimeUs);
        Log.m105924i("MicroMsg.MixMuxerController", sb.toString());
        C106139e eVar2 = this.f330533e;
        if (eVar2 != null) {
            int i = bufferInfo.size;
            long j = bufferInfo.presentationTimeUs;
            synchronized (C106139e.f316166c) {
                SightVideoJNI.writeH264Data(eVar2.f316167a, byteBuffer, i, j);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        this.f330534f++;
        Log.m105924i("MicroMsg.MixMuxerController", "frameCount: " + this.f330534f);
    }

    /* renamed from: f */
    public final void mo161991f(long j) {
        if (this.f330536h) {
            Log.m105920e("MicroMsg.MixMuxerController", "writeVideoDts, already release");
            return;
        }
        Log.m105924i("MicroMsg.MixMuxerController", "writeVideoDts: " + j);
        C106139e eVar = this.f330533e;
        if (eVar != null) {
            eVar.mo151877f(j);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C110533m0(long j, long j2, int i, boolean z, boolean z2, C111750i.C102362a aVar, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? 0 : j, (i2 & 2) != 0 ? 0 : j2, i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C110533m0(long j, long j2, int i, int i2, int i3, boolean z, float f, boolean z2, C111750i.C102362a aVar) {
        this(j, j2, i, z, z2, aVar);
        C106139e eVar;
        long j3 = j;
        long j4 = j2;
        boolean z3 = z;
        boolean z4 = z2;
        Log.m105924i("MicroMsg.MixMuxerController", "secondary create MixMuxerController, outputFps:" + f + ", outputVideoWidth:" + i2 + ", outputVideoHeight:" + i3 + ", enableHevc:" + z4);
        boolean c = C85456b.m105450c(z3, z4);
        this.f330537i = c;
        int i4 = (int) (j4 - j3);
        this.f330535g = i4;
        if (i4 != 0) {
            if (z3) {
                C111750i.C102362a aVar2 = aVar;
                if (aVar2 != null) {
                    boolean z5 = z4;
                    eVar = C106139e.f316165b.mo151880b(i2, i3, i, f, z2, c, aVar2.f301461a, aVar2.f301462b, aVar2.f301463c);
                } else {
                    boolean z6 = z4;
                    eVar = C106139e.C106140a.m142779c(C106139e.f316165b, i2, i3, i, f, z2, c, 0, 0, 0, FileUtils.S_IRWXU, (Object) null);
                }
                this.f330533e = eVar;
            } else {
                this.f330533e = C106139e.f316165b.mo151879a(z4);
            }
        }
        this.f330536h = false;
        StringBuilder sb = new StringBuilder();
        sb.append("secondary init endTime:");
        sb.append(j4);
        sb.append(", startTime:");
        sb.append(j3);
        sb.append(", duration:");
        sb.append(this.f330535g);
        sb.append(", bufId:");
        C106139e eVar2 = this.f330533e;
        sb.append(eVar2 != null ? Integer.valueOf(eVar2.f316167a) : null);
        Log.m105924i("MicroMsg.MixMuxerController", sb.toString());
    }
}
