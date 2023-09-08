package com.tencent.p014mm.plugin.vlog.model;

import android.media.MediaFormat;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.extractor.IExtractorDelegate;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;
import gy3.C87412m;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H J\u0011\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u0011\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u0014\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u0017\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u0018\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u0019\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u001a\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u001b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0006H J\u0019\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H J\u0019\u0010!\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\fH J\u0011\u0010\"\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010#\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010$\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H J\u0019\u0010&\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H J\u0011\u0010'\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H J\u0013\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\b\u001a\u00020\u0006H J\u0019\u0010,\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H J\u0011\u0010-\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010.\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H J\u0013\u0010/\u001a\u0004\u0018\u00010(2\u0006\u0010\b\u001a\u00020\u0006H J\u0013\u00100\u001a\u0004\u0018\u00010(2\u0006\u0010\b\u001a\u00020\u0006H J\u0013\u00101\u001a\u0004\u0018\u00010(2\u0006\u0010\b\u001a\u00020\u0006H J\u0013\u00102\u001a\u0004\u0018\u00010(2\u0006\u0010\b\u001a\u00020\u0006H J\u0013\u00103\u001a\u0004\u0018\u00010(2\u0006\u0010\b\u001a\u00020\u0006H ¨\u00064"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/model/VLogAssetExtractor;", "Lcom/tencent/tav/extractor/IExtractorDelegate;", "", "path", "", "alignDtsToZero", "", "nCreate", "nPtr", "nDestroy", "nContainVideo", "nContainAudio", "", "nVideoTrackIndex", "nAudioTrackIndex", "nGetWidth", "nGetHeight", "nGetVideoBitrate", "", "nGetFps", "nGetVideoDuration", "nGetVideoPixelFormat", "nGetVideoMime", "nGetVideoRotate", "nGetAudioBitrate", "nGetAudioSampleRate", "nGetAudioDuration", "nGetAudioChannelCount", "nGetAudioMime", "isSoft", "Lrx3/b0;", "nSetIsSoft", "trackIndex", "nSelectTrack", "nUnSelectTrack", "nCurrentSelectTrackIndex", "nGetTrackCount", "timeUs", "nSeekTo", "nReadNextSample", "", "nGetSampleDataByteArray", "Ljava/nio/ByteBuffer;", "byteBuffer", "nGetSampleData", "nGetSampleDataPtsUs", "nGetSampleDataDtsUs", "nGetVideoSPS", "nGetVideoPPS", "nGetVideoExtraData", "nGetHevcHead", "nGetAudioCsdData", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.model.VLogAssetExtractor */
public final class VLogAssetExtractor implements IExtractorDelegate {

    /* renamed from: a */
    public long f316402a;

    /* renamed from: b */
    public String f316403b = ("MicroMsg.VLogAssetExtractor@" + this.f316402a);

    /* renamed from: c */
    public MediaFormat f316404c = new MediaFormat();

    /* renamed from: d */
    public MediaFormat f316405d = new MediaFormat();

    /* renamed from: e */
    public int f316406e = -1;

    /* renamed from: f */
    public int f316407f = -1;

    /* renamed from: g */
    public int f316408g;

    /* renamed from: h */
    public int f316409h = 1;

    public VLogAssetExtractor() {
        Log.m105924i(this.f316403b, "create VLogAssetExtractor");
        SightVideoJNI.registerALL();
    }

    private final native int nAudioTrackIndex(long j);

    private final native boolean nContainAudio(long j);

    private final native boolean nContainVideo(long j);

    private final native long nCreate(String str, boolean z);

    private final native int nCurrentSelectTrackIndex(long j);

    private final native boolean nDestroy(long j);

    private final native int nGetAudioBitrate(long j);

    private final native int nGetAudioChannelCount(long j);

    private final native byte[] nGetAudioCsdData(long j);

    private final native double nGetAudioDuration(long j);

    private final native String nGetAudioMime(long j);

    private final native int nGetAudioSampleRate(long j);

    private final native double nGetFps(long j);

    private final native int nGetHeight(long j);

    private final native byte[] nGetHevcHead(long j);

    private final native int nGetSampleData(long j, ByteBuffer byteBuffer);

    private final native byte[] nGetSampleDataByteArray(long j);

    private final native long nGetSampleDataDtsUs(long j);

    private final native long nGetSampleDataPtsUs(long j);

    private final native int nGetTrackCount(long j);

    private final native int nGetVideoBitrate(long j);

    private final native double nGetVideoDuration(long j);

    private final native byte[] nGetVideoExtraData(long j);

    private final native String nGetVideoMime(long j);

    private final native byte[] nGetVideoPPS(long j);

    private final native int nGetVideoPixelFormat(long j);

    private final native int nGetVideoRotate(long j);

    private final native byte[] nGetVideoSPS(long j);

    private final native int nGetWidth(long j);

    private final native boolean nReadNextSample(long j);

    private final native boolean nSeekTo(long j, long j2);

    private final native boolean nSelectTrack(long j, int i);

    private final native void nSetIsSoft(long j, boolean z);

    private final native boolean nUnSelectTrack(long j);

    private final native int nVideoTrackIndex(long j);

    public boolean advance() {
        long j = this.f316402a;
        if (j != 0) {
            return nReadNextSample(j);
        }
        return false;
    }

    public final void finalize() {
        String str = this.f316403b;
        Log.m105924i(str, "finalize >> " + this.f316402a);
        release();
    }

    public long getSampleTime() {
        long j = this.f316402a;
        if (j != 0) {
            return nGetSampleDataPtsUs(j);
        }
        return -1;
    }

    public int getSampleTrackIndex() {
        long j = this.f316402a;
        if (j == 0) {
            return -1;
        }
        if (nCurrentSelectTrackIndex(j) == this.f316406e) {
            return this.f316408g;
        }
        if (nCurrentSelectTrackIndex(this.f316402a) == this.f316407f) {
            return this.f316409h;
        }
        return -1;
    }

    public int getTrackCount() {
        long j = this.f316402a;
        if (j != 0) {
            return nGetTrackCount(j);
        }
        return 0;
    }

    public MediaFormat getTrackFormat(int i) {
        return i == this.f316408g ? this.f316404c : i == this.f316409h ? this.f316405d : new MediaFormat();
    }

    public boolean needMirror() {
        return true;
    }

    public int readSampleData(ByteBuffer byteBuffer, int i) {
        C87412m.m108594g(byteBuffer, "byteBuf");
        if (this.f316402a == 0) {
            return -1;
        }
        byteBuffer.clear();
        int nGetSampleData = nGetSampleData(this.f316402a, byteBuffer);
        if (nGetSampleData > 0) {
            byteBuffer.position(0);
            byteBuffer.limit(nGetSampleData);
        }
        return nGetSampleData;
    }

    public void release() {
        Log.m105924i(this.f316403b, "release");
        long j = this.f316402a;
        if (j != 0) {
            nDestroy(j);
            this.f316402a = 0;
        }
    }

    public void seekTo(long j, int i) {
        if (this.f316402a != 0) {
            long currentTicks = Util.currentTicks();
            boolean nSeekTo = nSeekTo(this.f316402a, j);
            String str = this.f316403b;
            Log.m105918d(str, "seekTo " + j + ", ret:" + nSeekTo + ", cost:" + Util.ticksToNow(currentTicks));
        }
    }

    public void selectTrack(int i) {
        String str = this.f316403b;
        Log.m105924i(str, "selectTrack:" + i);
        if (this.f316402a == 0) {
            return;
        }
        if (i == this.f316408g) {
            Log.m105924i(this.f316403b, "select video track");
            nSelectTrack(this.f316402a, this.f316406e);
        } else if (i == this.f316409h) {
            Log.m105924i(this.f316403b, "select audio track");
            nSelectTrack(this.f316402a, this.f316407f);
        }
    }

    public void setDataSource(String str) {
        String str2 = str;
        C87412m.m108594g(str2, "path");
        long currentTicks = Util.currentTicks();
        long j = this.f316402a;
        if (j != 0) {
            nDestroy(j);
            this.f316402a = 0;
        }
        this.f316402a = nCreate(str2, false);
        String str3 = this.f316403b;
        Log.m105924i(str3, "setDataSource, path:" + str2 + ", nPtr:" + this.f316402a + ", cost:" + Util.ticksToNow(currentTicks));
        StringBuilder sb = new StringBuilder();
        sb.append("MicroMsg.VLogAssetExtractor@");
        sb.append(this.f316402a);
        this.f316403b = sb.toString();
        long j2 = this.f316402a;
        if (j2 != 0) {
            boolean nContainVideo = nContainVideo(j2);
            boolean nContainAudio = nContainAudio(this.f316402a);
            if (nContainVideo) {
                this.f316406e = nVideoTrackIndex(this.f316402a);
                String nGetVideoMime = nGetVideoMime(this.f316402a);
                this.f316404c.setString("mime", nGetVideoMime);
                this.f316404c.setInteger("width", nGetWidth(this.f316402a));
                this.f316404c.setInteger("height", nGetHeight(this.f316402a));
                this.f316404c.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, nGetVideoBitrate(this.f316402a));
                String str4 = nGetVideoMime;
                this.f316404c.setLong("durationUs", ((long) nGetVideoDuration(this.f316402a)) * ((long) 1000));
                int nGetFps = (int) nGetFps(this.f316402a);
                if (nGetFps <= 0) {
                    nGetFps = 1;
                }
                this.f316404c.setInteger("frame-rate", nGetFps);
                this.f316404c.setInteger("max-input-size", nGetWidth(this.f316402a) * nGetHeight(this.f316402a));
                this.f316404c.setInteger("rotation-degrees", nGetVideoRotate(this.f316402a));
                String str5 = str4;
                if (C112551y.m153810j(str5, "video/avc", false, 2, (Object) null)) {
                    byte[] nGetVideoSPS = nGetVideoSPS(this.f316402a);
                    if (nGetVideoSPS != null) {
                        this.f316404c.setByteBuffer(TUtils.CSD_0, ByteBuffer.wrap(nGetVideoSPS));
                    }
                    byte[] nGetVideoPPS = nGetVideoPPS(this.f316402a);
                    if (nGetVideoPPS != null) {
                        this.f316404c.setByteBuffer(TUtils.CSD_1, ByteBuffer.wrap(nGetVideoPPS));
                    }
                } else if (C112551y.m153810j(str5, "video/hevc", false, 2, (Object) null)) {
                    byte[] nGetHevcHead = nGetHevcHead(this.f316402a);
                    if (nGetHevcHead != null) {
                        this.f316404c.setByteBuffer(TUtils.CSD_0, ByteBuffer.wrap(nGetHevcHead));
                    }
                } else {
                    byte[] nGetVideoExtraData = nGetVideoExtraData(this.f316402a);
                    if (nGetVideoExtraData != null) {
                        this.f316404c.setByteBuffer(TUtils.CSD_0, ByteBuffer.wrap(nGetVideoExtraData));
                    }
                }
            }
            if (nContainAudio) {
                this.f316407f = nAudioTrackIndex(this.f316402a);
                this.f316405d.setString("mime", nGetAudioMime(this.f316402a));
                this.f316405d.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, nGetAudioBitrate(this.f316402a));
                this.f316405d.setInteger("sample-rate", nGetAudioSampleRate(this.f316402a));
                this.f316405d.setLong("durationUs", ((long) nGetAudioDuration(this.f316402a)) * ((long) 1000));
                this.f316405d.setInteger("channel-count", nGetAudioChannelCount(this.f316402a));
                byte[] nGetAudioCsdData = nGetAudioCsdData(this.f316402a);
                if (nGetAudioCsdData != null) {
                    this.f316405d.setByteBuffer(TUtils.CSD_0, ByteBuffer.wrap(nGetAudioCsdData));
                    this.f316405d.setInteger("is-adts", 1);
                }
                this.f316405d.setInteger("max-input-size", 16384);
            }
            String str6 = this.f316403b;
            Log.m105924i(str6, "init track data finished, hasVideo:" + nContainVideo + ", hasAudio:" + nContainAudio + ", videoFormat:" + this.f316404c + ", audioFormat:" + this.f316405d + ", videoTrackIndex:" + this.f316406e + ", audioTrackIndex:" + this.f316407f);
            if (nContainVideo && nContainAudio) {
                this.f316408g = 0;
                this.f316409h = 1;
            } else if (nContainVideo && !nContainAudio) {
                this.f316408g = 0;
                this.f316409h = -1;
            } else if (!nContainAudio || nContainVideo) {
                this.f316409h = -1;
                this.f316408g = -1;
            } else {
                this.f316409h = 0;
                this.f316408g = -1;
            }
            String str7 = this.f316403b;
            Log.m105924i(str7, "videoRetTrackIndex:" + this.f316408g + ", audioRetTrackIndex:" + this.f316409h);
        }
    }

    public void setIsSoft(boolean z) {
        long j = this.f316402a;
        if (j != 0) {
            nSetIsSoft(j, z);
        }
    }

    public void unselectTrack(int i) {
        long j = this.f316402a;
        if (j != 0) {
            nUnSelectTrack(j);
        }
    }
}
