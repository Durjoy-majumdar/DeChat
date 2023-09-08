package com.tencent.p014mm.plugin.vlog.parallel;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.decoder.AssetWriterVideoEncoder;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.vlog.parallel.c */
public final class C106212c extends TAVKitMuxer.SightVideoJNIMediaMuxer {

    /* renamed from: a */
    public final String f316533a;

    /* renamed from: b */
    public final String f316534b = ("MicroMsg.ParallelSoftWriter[" + hashCode() + ']');

    /* renamed from: c */
    public volatile boolean f316535c;

    /* renamed from: d */
    public C106210a f316536d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106212c(String str, int i) {
        super(str, i);
        C87412m.m108594g(str, "path");
        this.f316533a = str;
    }

    public int addTrack(MediaFormat mediaFormat) {
        C87412m.m108594g(mediaFormat, "mediaFormat");
        boolean z = false;
        if (mediaFormat.containsKey("mime")) {
            String string = mediaFormat.getString("mime");
            C87412m.m108591d(string);
            if (C112550d0.m153801u(string, "video", false)) {
                z = true;
            }
        }
        if (z) {
            return super.addTrack(mediaFormat);
        }
        setAudioFormat(mediaFormat);
        this.f316536d = C106210a.f316510l.mo134640a(mediaFormat, String.valueOf(hashCode()));
        return audioTrackIndex();
    }

    public int audioTrackIndex() {
        C106210a aVar = this.f316536d;
        if (aVar != null) {
            return aVar.f316512b;
        }
        return -1;
    }

    public void clearResource() {
        Log.m105924i(this.f316534b, "clearResource");
        super.clearResource();
        super.release();
    }

    public void release() {
        Log.m105924i(this.f316534b, "release");
    }

    public boolean stop(boolean z) {
        if (this.f316535c) {
            return true;
        }
        this.f316535c = true;
        AssetWriterVideoEncoder encoder = getEncoder();
        if (encoder != null) {
            encoder.stop();
        }
        C106210a aVar = this.f316536d;
        if (aVar != null) {
            try {
                WritableByteChannel writableByteChannel = aVar.f316520j;
                if (writableByteChannel != null) {
                    writableByteChannel.close();
                }
            } catch (Exception unused) {
            }
        }
        if (getDuration() <= 0) {
            Log.m105920e(this.f316534b, "error duration is 0");
            setStarted(false);
            return false;
        }
        setStarted(false);
        return true;
    }

    public void writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        C87412m.m108594g(byteBuffer, "byteBuffer");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        if (i == audioTrackIndex()) {
            C106210a aVar = this.f316536d;
            if (aVar != null) {
                aVar.mo152165a(byteBuffer, bufferInfo);
                return;
            }
            return;
        }
        super.writeSampleData(i, byteBuffer, bufferInfo);
    }
}
