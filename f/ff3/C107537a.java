package ff3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.decoder.AudioInfo;
import com.tencent.tavkit.composition.audio.TAVAudioProcessorNode;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p346hh.C117086h;
import sp3.C110801c;
import tp3.C111050c;

/* renamed from: ff3.a */
public final class C107537a implements C111050c {

    /* renamed from: a */
    public final int f321740a;

    /* renamed from: b */
    public final int f321741b;

    /* renamed from: ff3.a$a */
    public static final class C107538a implements TAVAudioProcessorNode.TAVAudioProcessorEffect {

        /* renamed from: a */
        public C117086h f321742a;

        /* renamed from: b */
        public ByteBuffer f321743b;

        /* renamed from: c */
        public byte[] f321744c = new byte[0];

        /* renamed from: d */
        public final AudioInfo f321745d;

        /* renamed from: e */
        public final /* synthetic */ C107537a f321746e;

        /* renamed from: f */
        public final /* synthetic */ C110801c f321747f;

        public C107538a(C107537a aVar, C110801c cVar) {
            this.f321746e = aVar;
            this.f321747f = cVar;
            AudioInfo audioInfo = new AudioInfo();
            this.f321745d = audioInfo;
            audioInfo.sampleRate = aVar.f321740a;
            audioInfo.channelCount = aVar.f321741b;
            audioInfo.pcmEncoding = 2;
        }

        public AudioInfo getDestAudioInfo() {
            return this.f321745d;
        }

        public ByteBuffer processAudioPCM(CMTime cMTime, ByteBuffer byteBuffer, AudioInfo audioInfo) {
            C87412m.m108594g(cMTime, "time");
            C87412m.m108594g(byteBuffer, "pcmBuffer");
            C87412m.m108594g(audioInfo, "audioInfo");
            if (this.f321742a == null) {
                String str = this.f321747f.f331482t;
                int i = audioInfo.sampleRate;
                int i2 = audioInfo.channelCount;
                int i3 = audioInfo.pcmEncoding;
                AudioInfo audioInfo2 = this.f321745d;
                this.f321742a = new C117086h(str, i, i2, i3, audioInfo2.sampleRate, audioInfo2.channelCount, audioInfo2.pcmEncoding);
                this.f321746e.getClass();
                Log.m105924i("MicroMsg.AudioResampler", "processAudioPCM, create convert processor, src:" + audioInfo + ", dst:" + this.f321745d);
            }
            if (this.f321744c.length != byteBuffer.limit()) {
                this.f321744c = new byte[byteBuffer.limit()];
            }
            byteBuffer.position(0);
            byteBuffer.get(this.f321744c);
            byteBuffer.position(0);
            C117086h hVar = this.f321742a;
            byte[] a = hVar != null ? hVar.mo32679a(this.f321744c) : null;
            if (a == null) {
                return byteBuffer;
            }
            ByteBuffer byteBuffer2 = this.f321743b;
            if (!(byteBuffer2 != null && byteBuffer2.capacity() == a.length)) {
                ByteBuffer order = ByteBuffer.allocateDirect(a.length).order(ByteOrder.LITTLE_ENDIAN);
                order.put(a);
                this.f321743b = order;
                order.position(0);
                return order;
            }
            ByteBuffer byteBuffer3 = this.f321743b;
            if (byteBuffer3 != null) {
                byteBuffer3.position(0);
            }
            ByteBuffer byteBuffer4 = this.f321743b;
            if (byteBuffer4 != null) {
                byteBuffer4.put(a);
            }
            ByteBuffer byteBuffer5 = this.f321743b;
            if (byteBuffer5 != null) {
                byteBuffer5.position(0);
            }
            ByteBuffer byteBuffer6 = this.f321743b;
            C87412m.m108591d(byteBuffer6);
            return byteBuffer6;
        }

        public void release() {
            C117086h hVar = this.f321742a;
            if (hVar != null) {
                hVar.release();
            }
        }
    }

    public C107537a(int i, int i2) {
        this.f321740a = i;
        this.f321741b = i2;
    }

    /* renamed from: a */
    public TAVAudioProcessorNode.TAVAudioProcessorEffect mo157974a(C110801c cVar) {
        C87412m.m108594g(cVar, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        return new C107538a(this, cVar);
    }
}
