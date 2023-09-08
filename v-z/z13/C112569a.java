package z13;

import android.media.MediaFormat;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.sight.base.AudioSoftEncoder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.tav.core.ExportRuntimeException;
import com.tencent.tav.decoder.AssetWriterAudioEncoder;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.decoder.muxer.IMediaMuxer;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: z13.a */
public final class C112569a implements AssetWriterAudioEncoder {

    /* renamed from: a */
    public MediaFormat f337032a;

    /* renamed from: b */
    public int f337033b;

    /* renamed from: c */
    public long f337034c;

    /* renamed from: d */
    public ExportConfig f337035d;

    /* renamed from: e */
    public int f337036e;

    /* renamed from: f */
    public ByteBuffer f337037f;

    /* renamed from: g */
    public IMediaMuxer f337038g;

    /* renamed from: h */
    public boolean f337039h;

    public boolean endWriteAudioSample() {
        Log.m105924i("MicroMsg.CompositionAudioSoftEncoder", "endWriteAudioSample: ");
        ByteBuffer byteBuffer = this.f337037f;
        if (byteBuffer != null) {
            int position = byteBuffer.position();
            if (position > 0) {
                ByteBuffer byteBuffer2 = this.f337037f;
                if (byteBuffer2 != null) {
                    byteBuffer2.position(0);
                    int i = this.f337033b;
                    ByteBuffer byteBuffer3 = this.f337037f;
                    if (byteBuffer3 != null) {
                        AudioSoftEncoder.nWriteAudioSample(i, byteBuffer3, position, this.f337034c);
                    } else {
                        C87412m.m108603p("dataBuffer");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("dataBuffer");
                    throw null;
                }
            }
            AudioSoftEncoder.nEndWriteAudioSample(this.f337033b);
            return true;
        }
        C87412m.m108603p("dataBuffer");
        throw null;
    }

    public MediaFormat getEncodeFormat() {
        MediaFormat mediaFormat = this.f337032a;
        C87412m.m108591d(mediaFormat);
        return mediaFormat;
    }

    public long getEncodePresentationTimeUs() {
        return this.f337034c;
    }

    public boolean isEncodeToEndOfStream() {
        return this.f337039h;
    }

    public boolean prepare(ExportConfig exportConfig, MediaFormat mediaFormat) {
        C87412m.m108594g(exportConfig, "outputConfig");
        C87412m.m108594g(mediaFormat, "mediaFormat");
        this.f337035d = exportConfig;
        this.f337032a = mediaFormat;
        int audioChannelCount = exportConfig.getAudioChannelCount();
        int nInit = AudioSoftEncoder.nInit((long) mediaFormat.getInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE), exportConfig.getAudioSampleRateHz(), audioChannelCount, mediaFormat.getInteger("aac-profile"));
        this.f337033b = nInit;
        int nGetErrCode = AudioSoftEncoder.nGetErrCode(nInit);
        int nGetBufferSize = AudioSoftEncoder.nGetBufferSize(this.f337033b);
        this.f337036e = nGetBufferSize;
        ByteBuffer order = ByteBuffer.allocateDirect(nGetBufferSize).order(ByteOrder.nativeOrder());
        C87412m.m108593f(order, "allocateDirect(bufferSiz…(ByteOrder.nativeOrder())");
        this.f337037f = order;
        Log.m105924i("MicroMsg.CompositionAudioSoftEncoder", "prepare: " + this.f337033b + ' ' + this.f337036e + ", " + nGetErrCode);
        if (nGetErrCode == 0) {
            return true;
        }
        throw new ExportRuntimeException(new ExportErrorStatus(-104, (Throwable) null, mediaFormat.toString()));
    }

    public void release() {
        Log.m105924i("MicroMsg.CompositionAudioSoftEncoder", "release: " + this.f337033b);
        AudioSoftEncoder.nDestroy(this.f337033b);
        this.f337033b = 0;
    }

    public void setMediaMuxer(IMediaMuxer iMediaMuxer) {
        this.f337038g = iMediaMuxer;
    }

    public boolean start() {
        return true;
    }

    public void stop() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean writeAudioFrame(boolean r9) {
        /*
            r8 = this;
            com.tencent.tav.decoder.muxer.IMediaMuxer r0 = r8.f337038g
            r1 = -1
            if (r0 == 0) goto L_0x000a
            int r0 = r0.audioTrackIndex()
            goto L_0x000b
        L_0x000a:
            r0 = -1
        L_0x000b:
            r2 = 1
            if (r0 != r1) goto L_0x000f
            return r2
        L_0x000f:
            long[] r1 = new long[r2]
            r3 = 0
            r5 = 0
            r1[r5] = r3
            int r3 = r8.f337033b
            byte[] r3 = com.tencent.p014mm.plugin.sight.base.AudioSoftEncoder.nGetOutputBuffer(r3, r1)
            if (r3 == 0) goto L_0x004e
            int r4 = r3.length
            if (r4 != 0) goto L_0x0023
            r4 = 1
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x004e
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo
            r4.<init>()
            r6 = r1[r5]
            r4.presentationTimeUs = r6
            int r1 = r3.length
            r4.size = r1
            int r1 = r3.length
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r6 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r1 = r1.order(r6)
            r1.put(r3)
            r1.position(r5)
            com.tencent.tav.decoder.muxer.IMediaMuxer r3 = r8.f337038g
            if (r3 == 0) goto L_0x004f
            r3.writeSampleData(r0, r1, r4)
            goto L_0x004f
        L_0x004e:
            r5 = 1
        L_0x004f:
            if (r9 == 0) goto L_0x0053
            r8.f337039h = r2
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z13.C112569a.writeAudioFrame(boolean):boolean");
    }

    public long writeAudioSample(long j, ByteBuffer byteBuffer) {
        C87412m.m108594g(byteBuffer, "audioBuffer");
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.f337037f;
        if (byteBuffer2 != null) {
            int position2 = byteBuffer2.position();
            ByteBuffer byteBuffer3 = this.f337037f;
            if (byteBuffer3 != null) {
                int min = Math.min(byteBuffer3.capacity() - position2, limit - position);
                int i = position + min;
                byteBuffer.limit(i);
                ByteBuffer byteBuffer4 = this.f337037f;
                if (byteBuffer4 != null) {
                    byteBuffer4.put(byteBuffer);
                    int i2 = position2 + min;
                    ByteBuffer byteBuffer5 = this.f337037f;
                    if (byteBuffer5 != null) {
                        if (i2 >= byteBuffer5.capacity()) {
                            ByteBuffer byteBuffer6 = this.f337037f;
                            if (byteBuffer6 != null) {
                                byteBuffer6.position(0);
                                int i3 = this.f337033b;
                                ByteBuffer byteBuffer7 = this.f337037f;
                                if (byteBuffer7 != null) {
                                    AudioSoftEncoder.nWriteAudioSample(i3, byteBuffer7, this.f337036e, j);
                                    this.f337034c = j;
                                } else {
                                    C87412m.m108603p("dataBuffer");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("dataBuffer");
                                throw null;
                            }
                        } else {
                            ByteBuffer byteBuffer8 = this.f337037f;
                            if (byteBuffer8 != null) {
                                byteBuffer8.position(min);
                            } else {
                                C87412m.m108603p("dataBuffer");
                                throw null;
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("writeAudioSample: write size is ");
                        sb.append(position);
                        sb.append(", ");
                        ByteBuffer byteBuffer9 = this.f337037f;
                        if (byteBuffer9 != null) {
                            sb.append(byteBuffer9.position());
                            sb.append(", ");
                            sb.append(min);
                            sb.append('}');
                            Log.m105924i("MicroMsg.CompositionAudioSoftEncoder", sb.toString());
                            if (min > 0) {
                                byteBuffer.position(i);
                                ExportConfig exportConfig = this.f337035d;
                                C87412m.m108591d(exportConfig);
                                int audioChannelCount = exportConfig.getAudioChannelCount();
                                ExportConfig exportConfig2 = this.f337035d;
                                C87412m.m108591d(exportConfig2);
                                return DecoderUtils.getAudioDuration((long) min, audioChannelCount, exportConfig2.getAudioSampleRateHz());
                            }
                            Log.m105928w("MicroMsg.CompositionAudioSoftEncoder", "writeAudioSample: error");
                            return 0;
                        }
                        C87412m.m108603p("dataBuffer");
                        throw null;
                    }
                    C87412m.m108603p("dataBuffer");
                    throw null;
                }
                C87412m.m108603p("dataBuffer");
                throw null;
            }
            C87412m.m108603p("dataBuffer");
            throw null;
        }
        C87412m.m108603p("dataBuffer");
        throw null;
    }
}
