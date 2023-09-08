package ip0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.appbrand.media.encode.M4aAudioFormatJni;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;

/* renamed from: ip0.a */
public class C108484a extends C87782b {

    /* renamed from: f */
    public C104619a f324803f;

    /* renamed from: g */
    public MediaCodec.BufferInfo f324804g;

    /* renamed from: a */
    public boolean mo122234a(boolean z, byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            Log.m105920e("MicroMsg.Record.AACAudioEncoder", "pcm is null");
            return false;
        } else if (this.f324803f != null) {
            Log.m105925i("MicroMsg.Record.AACAudioEncoder", "encodePCMToAAC endOfStream:%b", Boolean.valueOf(z));
            ByteBuffer[] j = this.f324803f.mo148208j();
            ByteBuffer[] m = this.f324803f.mo148211m();
            int f = this.f324803f.mo148204f(100);
            if (f >= 0) {
                ByteBuffer byteBuffer = j[f];
                byteBuffer.clear();
                byteBuffer.put(bArr2);
                byteBuffer.position(0);
                byteBuffer.limit(bArr2.length);
                Log.m105925i("MicroMsg.Record.AACAudioEncoder", "inputBufferIndex:%d, data length:%d", Integer.valueOf(f), Integer.valueOf(bArr2.length));
                if (z) {
                    this.f324803f.mo148213o(f, 0, bArr2.length, System.nanoTime(), 4);
                } else {
                    this.f324803f.mo148213o(f, 0, bArr2.length, System.nanoTime(), 0);
                }
            } else {
                Log.m105921e("MicroMsg.Record.AACAudioEncoder", "inputBufferIndex %d", Integer.valueOf(f));
            }
            while (true) {
                int g = this.f324803f.mo148205g(this.f324804g, 100);
                if (g == -1) {
                    Log.m105918d("MicroMsg.Record.AACAudioEncoder", "no output available, break");
                    break;
                } else if (g == -3) {
                    Log.m105920e("MicroMsg.Record.AACAudioEncoder", "output buff change");
                    m = this.f324803f.mo148211m();
                } else if (g == -2) {
                    MediaFormat n = this.f324803f.mo148212n();
                    Log.m105920e("MicroMsg.Record.AACAudioEncoder", "encoder output format changed: " + n);
                } else if (g < 0) {
                    Log.m105921e("MicroMsg.Record.AACAudioEncoder", "unexpected result from encoder.dequeueOutputBuffer: %s", Integer.valueOf(g));
                } else {
                    Log.m105925i("MicroMsg.Record.AACAudioEncoder", "outputBufferIndex %d", Integer.valueOf(g));
                    ByteBuffer byteBuffer2 = m[g];
                    if (byteBuffer2 != null) {
                        MediaCodec.BufferInfo bufferInfo = this.f324804g;
                        if ((bufferInfo.flags & 2) != 0) {
                            Log.m105920e("MicroMsg.Record.AACAudioEncoder", "flags is BUFFER_FLAG_CODEC_CONFIG, don't writ data into file");
                        } else {
                            int i2 = bufferInfo.size;
                            byte[] bArr3 = new byte[i2];
                            byteBuffer2.get(bArr3, 0, i2);
                            int writeAudioBuff = M4aAudioFormatJni.writeAudioBuff(bArr3, i2);
                            mo122233b(bArr3, i2, false);
                            if (writeAudioBuff == 0) {
                                Log.m105924i("MicroMsg.Record.AACAudioEncoder", "writeAudioBuff buff ok,");
                            } else {
                                Log.m105924i("MicroMsg.Record.AACAudioEncoder", "writeAudioBuff buff fail,");
                            }
                        }
                        this.f324803f.mo148216r(g, false);
                        if ((this.f324804g.flags & 4) != 0) {
                            if (!z) {
                                Log.m105928w("MicroMsg.Record.AACAudioEncoder", "reached end of stream unexpectedly");
                            } else {
                                Log.m105920e("MicroMsg.Record.AACAudioEncoder", "reach the end, and end to encode the data");
                            }
                        }
                    } else {
                        throw new RuntimeException("outputBuffer " + g + " was null");
                    }
                }
            }
            return true;
        } else {
            Log.m105920e("MicroMsg.Record.AACAudioEncoder", "mEncoder is null");
            return false;
        }
    }

    /* renamed from: c */
    public final void mo159353c(int i, int i2, int i3) {
        Log.m105924i("MicroMsg.Record.AACAudioEncoder", "initCodec");
        this.f324804g = new MediaCodec.BufferInfo();
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        createAudioFormat.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, i3);
        createAudioFormat.setInteger("aac-profile", 2);
        C104619a d = C104619a.m140212d("audio/mp4a-latm", false);
        this.f324803f = d;
        d.mo148202a(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f324803f.mo148222y();
        Log.m105924i("MicroMsg.Record.AACAudioEncoder", "encoder start to work");
    }

    public void close() {
        Log.m105924i("MicroMsg.Record.AACAudioEncoder", "close");
        C104619a aVar = this.f324803f;
        if (aVar != null) {
            aVar.mo148223z();
            this.f324803f.mo148214p();
            this.f324803f = null;
        }
        M4aAudioFormatJni.closeM4aFile();
    }

    public void flush() {
        Log.m105924i("MicroMsg.Record.AACAudioEncoder", "flush");
        mo122233b(new byte[0], 0, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean init(java.lang.String r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            java.lang.String r0 = "initCodec"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r4 = 1
            r1[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r5 = 2
            r1[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r6 = 3
            r1[r6] = r3
            java.lang.String r3 = "MicroMsg.Record.AACAudioEncoder"
            java.lang.String r6 = "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r1)
            r1 = -1
            r7.mo159353c(r9, r10, r11)     // Catch:{ IOException -> 0x0031, Exception -> 0x002a }
            r11 = 0
            goto L_0x0038
        L_0x002a:
            r11 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r11, r0, r6)
            goto L_0x0037
        L_0x0031:
            r11 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r11, r0, r6)
        L_0x0037:
            r11 = -1
        L_0x0038:
            if (r11 != r1) goto L_0x0045
            java.lang.String r8 = "initCodec  fail,"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            r8 = 21
            com.tencent.p014mm.plugin.appbrand.media.record.C83646t.m102682a(r8)
            return r2
        L_0x0045:
            java.lang.String r11 = "initCodec ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            int r8 = com.tencent.p014mm.plugin.appbrand.media.encode.M4aAudioFormatJni.createM4aFile(r8, r10, r9, r5)
            if (r8 != 0) goto L_0x0056
            java.lang.String r8 = "createM4aFile m4a jni api ok,"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            return r4
        L_0x0056:
            java.lang.String r8 = "createM4aFile m4a jni api fail,"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            r8 = 22
            com.tencent.p014mm.plugin.appbrand.media.record.C83646t.m102682a(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ip0.C108484a.init(java.lang.String, int, int, int):boolean");
    }
}
