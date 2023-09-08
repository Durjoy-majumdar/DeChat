package com.tencent.p014mm.plugin.vlog.model;

import android.media.MediaFormat;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.AssetWriterVideoEncoder;
import com.tencent.tav.decoder.muxer.IMediaMuxer;
import com.tencent.tav.decoder.muxer.MediaMuxerFactory;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.vlog.model.TAVKitMuxer */
public final class TAVKitMuxer {

    /* renamed from: a */
    public static final TAVKitMuxer f282480a = new TAVKitMuxer();

    /* renamed from: b */
    public static final C13601g f282481b = C36568h.m40985a(C5688a.f21671d);

    /* renamed from: com.tencent.mm.plugin.vlog.model.TAVKitMuxer$a */
    public static final class C5688a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C5688a f21671d = new C5688a();

        public C5688a() {
            super(0);
        }

        public Object invoke() {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_tav_mux_min_time, 800);
            Log.m105924i("MicroMsg.VideoCompositionExptConfig", "getMuxMiniDuration: " + Qe);
            return Integer.valueOf(Qe);
        }
    }

    @Metadata(mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/model/TAVKitMuxer$SightVideoJNIMediaMuxerFactory;", "Lcom/tencent/tav/decoder/muxer/MediaMuxerFactory$MediaMuxerCreator;", "()V", "createMediaMuxer", "Lcom/tencent/tav/decoder/muxer/IMediaMuxer;", "path", "", "format", "", "parallelMux", "muxers", "", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxerFactory */
    public static final class SightVideoJNIMediaMuxerFactory implements MediaMuxerFactory.MediaMuxerCreator {
        public IMediaMuxer createMediaMuxer(String str, int i) {
            C87412m.m108594g(str, "path");
            return new SightVideoJNIMediaMuxer(str, i);
        }

        public int parallelMux(List<IMediaMuxer> list) {
            return 0;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00108\u001a\u00020\u0006\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\bl\u0010mJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\n\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\bJ\b\u0010\u0017\u001a\u00020\u000bH\u0014J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0018\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J \u0010)\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016J\b\u0010*\u001a\u00020\u000bH\u0016J\b\u0010+\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020\bH\u0016J\u0010\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0004H\u0016J\b\u00100\u001a\u0004\u0018\u00010/J$\u00105\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u0001022\b\u00104\u001a\u0004\u0018\u000102H\u0016J\b\u00106\u001a\u00020\u000bH\u0016J\n\u00107\u001a\u0004\u0018\u00010\u001bH\u0016R\u0014\u00108\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010:R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010:R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010:R\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010:R\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010:R\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010:R\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010:R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010IR$\u0010J\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010P\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\"\u0010\u0015\u001a\u00020\b8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010:\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010W\u001a\u00020\b8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bW\u0010:\u001a\u0004\bX\u0010T\"\u0004\bY\u0010VR\"\u0010Z\u001a\u00020\u00028\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bZ\u0010>\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010>R\u0016\u0010_\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010>R&\u0010b\u001a\u0012\u0012\u0004\u0012\u00020\r0`j\b\u0012\u0004\u0012\u00020\r`a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010:R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u00101\u001a\u00020\b2\u0006\u0010j\u001a\u00020\b8\u0006@BX\u000e¢\u0006\f\n\u0004\b1\u0010:\u001a\u0004\bk\u0010T¨\u0006n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/model/TAVKitMuxer$SightVideoJNIMediaMuxer;", "Lcom/tencent/tav/decoder/muxer/IMediaMuxer;", "", "checkVideoFormatValid", "Landroid/media/MediaFormat;", "format", "", "key", "", "defVal", "getMediaFormatInt", "Lrx3/b0;", "flushPendingVideoDts", "", "dts", "doWriteVideoDts", "isSoftEncode", "configMuxerToSoftEncode", "Lcom/tencent/tav/decoder/AssetWriterVideoEncoder;", "encoder", "setSoftEncoder", "duration", "ensureMuxerVideoDuration", "checkInitBufId", "start", "ignoreHeader", "isMuxerStarted", "Lcom/tencent/tav/core/ExportConfig;", "exportConfig", "setExportConfig", "isCancel", "stop", "isVideo", "Lcom/tencent/tav/coremedia/CMTime;", "sampleTime", "writeSampleDataTime", "trackId", "Ljava/nio/ByteBuffer;", "byteBuffer", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "writeSampleData", "release", "audioTrackIndex", "videoTrackIndex", "mediaFormat", "addTrack", "Lcom/tencent/mm/plugin/sight/base/e;", "getSightEncode", "index", "Lcom/tencent/tav/coremedia/CMTimeRange;", "segmentRange", "allRange", "prepareParallelSegmentInfo", "clearResource", "getExportConfig", "path", "Ljava/lang/String;", "I", "sightEncode", "Lcom/tencent/mm/plugin/sight/base/e;", "isUseFFMpegMuxer", "Z", "videoId", "audioId", "videoBitrate", "", "videoFps", "F", "videoWidth", "videoHeight", "audioSampleRate", "audioChannelCount", "Lcom/tencent/tav/core/ExportConfig;", "audioFormat", "Landroid/media/MediaFormat;", "getAudioFormat", "()Landroid/media/MediaFormat;", "setAudioFormat", "(Landroid/media/MediaFormat;)V", "videoFormat", "getVideoFormat", "setVideoFormat", "getDuration", "()I", "setDuration", "(I)V", "videoFrameCount", "getVideoFrameCount", "setVideoFrameCount", "isStarted", "()Z", "setStarted", "(Z)V", "softEncode", "isHevc", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "pendingVideoDts", "Ljava/util/ArrayList;", "dtsCount", "Lcom/tencent/tav/decoder/AssetWriterVideoEncoder;", "getEncoder", "()Lcom/tencent/tav/decoder/AssetWriterVideoEncoder;", "setEncoder", "(Lcom/tencent/tav/decoder/AssetWriterVideoEncoder;)V", "<set-?>", "getIndex", "<init>", "(Ljava/lang/String;I)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer */
    public static class SightVideoJNIMediaMuxer implements IMediaMuxer {
        private int audioChannelCount;
        private MediaFormat audioFormat;
        private int audioId = -1;
        private int audioSampleRate;
        private int dtsCount;
        private int duration;
        private AssetWriterVideoEncoder encoder;
        private ExportConfig exportConfig;
        private final int format;
        private int index = -1;
        private boolean isHevc;
        private boolean isStarted;
        private boolean isUseFFMpegMuxer;
        private final String path;
        private ArrayList<Long> pendingVideoDts = new ArrayList<>();
        private volatile C106139e sightEncode;
        private boolean softEncode;
        private int videoBitrate;
        private MediaFormat videoFormat;
        private float videoFps;
        private int videoFrameCount;
        private int videoHeight;
        private int videoId = -1;
        private int videoWidth;

        public SightVideoJNIMediaMuxer(String str, int i) {
            C87412m.m108594g(str, "path");
            this.path = str;
            this.format = i;
        }

        private final boolean checkVideoFormatValid() {
            MediaFormat mediaFormat = this.videoFormat;
            if (mediaFormat != null && mediaFormat.containsKey("width")) {
                MediaFormat mediaFormat2 = this.videoFormat;
                if (mediaFormat2 != null && mediaFormat2.containsKey("height")) {
                    MediaFormat mediaFormat3 = this.videoFormat;
                    if (mediaFormat3 != null && mediaFormat3.containsKey(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                        MediaFormat mediaFormat4 = this.videoFormat;
                        if (mediaFormat4 != null && mediaFormat4.containsKey("frame-rate")) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        private final void doWriteVideoDts(long j) {
            if (this.dtsCount == 0) {
                C106139e eVar = this.sightEncode;
                if (eVar != null) {
                    eVar.mo151877f(((long) (C60641c.m70921b(1000.0f / this.videoFps) * -1)) * 1000);
                }
                this.dtsCount++;
            }
            C106139e eVar2 = this.sightEncode;
            if (eVar2 != null) {
                eVar2.mo151877f(j);
            }
            this.dtsCount++;
        }

        private final void flushPendingVideoDts() {
            TAVKitMuxer tAVKitMuxer = TAVKitMuxer.f282480a;
            Log.m105924i("MicroMsg.TAVKitMuxer", "flushPendingVideoDts size:" + this.pendingVideoDts.size());
            Iterator<Long> it = this.pendingVideoDts.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                C87412m.m108593f(next, "dts");
                doWriteVideoDts(next.longValue());
            }
            this.pendingVideoDts.clear();
        }

        private final int getMediaFormatInt(MediaFormat mediaFormat, String str, int i) {
            return (mediaFormat != null && mediaFormat.containsKey(str)) ? mediaFormat.getInteger(str) : i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c5, code lost:
            if ((r0.f316167a >= 0) == true) goto L_0x00c9;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x003c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int addTrack(android.media.MediaFormat r8) {
            /*
                r7 = this;
                java.lang.String r0 = "mediaFormat"
                gy3.C87412m.m108594g(r8, r0)
                com.tencent.mm.plugin.vlog.model.TAVKitMuxer r0 = com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer.f282480a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "addTrack, format:"
                r0.append(r1)
                r0.append(r8)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.TAVKitMuxer"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                java.lang.String r0 = "mime"
                boolean r2 = r8.containsKey(r0)
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0039
                java.lang.String r2 = r8.getString(r0)
                gy3.C87412m.m108591d(r2)
                java.lang.String r5 = "video"
                boolean r2 = z04.C112550d0.m153801u(r2, r5, r4)
                if (r2 == 0) goto L_0x0039
                r2 = 1
                goto L_0x003a
            L_0x0039:
                r2 = 0
            L_0x003a:
                if (r2 == 0) goto L_0x00f5
                r7.videoFormat = r8
                java.lang.String r0 = r8.getString(r0)
                gy3.C87412m.m108591d(r0)
                java.lang.String r2 = "hevc"
                boolean r2 = z04.C112550d0.m153801u(r0, r2, r4)
                r7.isHevc = r2
                int r2 = r7.videoId
                if (r2 > 0) goto L_0x0053
                r7.videoId = r3
            L_0x0053:
                android.media.MediaFormat r2 = r7.videoFormat
                java.lang.String r5 = "width"
                int r2 = r7.getMediaFormatInt(r2, r5, r4)
                r7.videoWidth = r2
                android.media.MediaFormat r2 = r7.videoFormat
                java.lang.String r5 = "height"
                int r2 = r7.getMediaFormatInt(r2, r5, r4)
                r7.videoHeight = r2
                android.media.MediaFormat r2 = r7.videoFormat
                java.lang.String r5 = "frame-rate"
                int r2 = r7.getMediaFormatInt(r2, r5, r4)
                float r2 = (float) r2
                r7.videoFps = r2
                android.media.MediaFormat r2 = r7.videoFormat
                java.lang.String r6 = "bitrate"
                int r2 = r7.getMediaFormatInt(r2, r6, r4)
                r7.videoBitrate = r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = "add video track mime:"
                r2.append(r6)
                r2.append(r0)
                java.lang.String r0 = ", isHevc:"
                r2.append(r0)
                boolean r0 = r7.isHevc
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                float r0 = r7.videoFps
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x00b3
                com.tencent.tav.core.ExportConfig r0 = r7.exportConfig
                if (r0 == 0) goto L_0x00ab
                android.media.MediaFormat r0 = r0.getVideoFormat()
                goto L_0x00ac
            L_0x00ab:
                r0 = 0
            L_0x00ac:
                int r0 = r7.getMediaFormatInt(r0, r5, r4)
                float r0 = (float) r0
                r7.videoFps = r0
            L_0x00b3:
                r7.checkInitBufId()
                com.tencent.mm.plugin.sight.base.e r0 = r7.sightEncode
                if (r0 == 0) goto L_0x00d2
                com.tencent.mm.plugin.sight.base.e r0 = r7.sightEncode
                if (r0 == 0) goto L_0x00c8
                int r0 = r0.f316167a
                if (r0 < 0) goto L_0x00c4
                r0 = 1
                goto L_0x00c5
            L_0x00c4:
                r0 = 0
            L_0x00c5:
                if (r0 != r3) goto L_0x00c8
                goto L_0x00c9
            L_0x00c8:
                r3 = 0
            L_0x00c9:
                if (r3 == 0) goto L_0x00d2
                boolean r0 = r7.softEncode
                if (r0 != 0) goto L_0x00d2
                r7.flushPendingVideoDts()
            L_0x00d2:
                java.lang.String r0 = "color-range"
                int r0 = w80.C111749g.m152381a(r8, r0, r4)
                java.lang.String r1 = "color-standard"
                int r1 = w80.C111749g.m152381a(r8, r1, r4)
                java.lang.String r2 = "color-transfer"
                int r8 = w80.C111749g.m152381a(r8, r2, r4)
                com.tencent.mm.plugin.sight.base.e r2 = r7.sightEncode
                if (r2 == 0) goto L_0x00f2
                w80.i r3 = w80.C111750i.f334661a
                w80.i$a r4 = new w80.i$a
                r4.<init>(r0, r1, r8)
                r3.mo163489b(r2, r4)
            L_0x00f2:
                int r8 = r7.videoId
                return r8
            L_0x00f5:
                r7.audioFormat = r8
                int r8 = r7.audioId
                if (r8 > 0) goto L_0x00fd
                r7.audioId = r4
            L_0x00fd:
                int r8 = r7.audioId
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer.SightVideoJNIMediaMuxer.addTrack(android.media.MediaFormat):int");
        }

        public int audioTrackIndex() {
            return this.audioId;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
            if ((r0.f316167a >= 0) == false) goto L_0x00ea;
         */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00db  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x016f  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0189  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void checkInitBufId() {
            /*
                r15 = this;
                com.tencent.mm.plugin.vlog.model.TAVKitMuxer r0 = com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer.f282480a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "checkInitBufId bufId:"
                r0.append(r1)
                com.tencent.mm.plugin.sight.base.e r1 = r15.sightEncode
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.TAVKitMuxer"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                boolean r0 = r15.softEncode
                boolean r2 = r15.isHevc
                java.lang.String r3 = "MicroMsg.WechatSight.PacketMuxerController"
                r4 = 0
                r5 = 1
                r6 = 2
                f40.a0 r7 = f40.C86709a0.m107528h()     // Catch:{ Error -> 0x006d }
                boolean r7 = r7.f251735l     // Catch:{ Error -> 0x006d }
                if (r7 == 0) goto L_0x0075
                f40.e r7 = f40.C86709a0.m107523b()     // Catch:{ Error -> 0x006d }
                boolean r7 = r7.mo121114l()     // Catch:{ Error -> 0x006d }
                if (r7 == 0) goto L_0x0075
                f40.o r7 = f40.C86709a0.m107535s()     // Catch:{ Error -> 0x006d }
                com.tencent.mm.storage.v1 r7 = r7.mo121142i()     // Catch:{ Error -> 0x006d }
                com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LOCAL_SIGHT_RECORD_USE_FFMPEG_INT_SYNC     // Catch:{ Error -> 0x006d }
                r9 = -1
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Error -> 0x006d }
                java.lang.Object r7 = r7.mo119685f(r8, r9)     // Catch:{ Error -> 0x006d }
                java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Error -> 0x006d }
                int r7 = r7.intValue()     // Catch:{ Error -> 0x006d }
                if (r7 <= 0) goto L_0x0075
                java.lang.String r8 = "WechatSight isIsUseFFmpeg localConfig: %d, isIsUseFFmpeg: %b"
                java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Error -> 0x006d }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ Error -> 0x006d }
                r9[r4] = r10     // Catch:{ Error -> 0x006d }
                if (r7 != r6) goto L_0x005e
                r10 = 1
                goto L_0x005f
            L_0x005e:
                r10 = 0
            L_0x005f:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ Error -> 0x006d }
                r9[r5] = r10     // Catch:{ Error -> 0x006d }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r9)     // Catch:{ Error -> 0x006d }
                if (r7 != r6) goto L_0x006b
                goto L_0x00d4
            L_0x006b:
                r7 = 0
                goto L_0x00d5
            L_0x006d:
                r7 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r4]
                java.lang.String r9 = "load isIsUseFFmpeg local config fail"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r7, r9, r8)
            L_0x0075:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r7 != 0) goto L_0x00c9
                boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r7 != 0) goto L_0x00c9
                boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r7 == 0) goto L_0x0082
                goto L_0x00c9
            L_0x0082:
                java.lang.Class<h81.h> r7 = h81.C32735h.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                h81.h r7 = (h81.C32735h) r7
                h81.h$c r8 = h81.C32735h.C32737c.clicfg_finder_is_use_ffmpeg_muxer
                int r7 = r7.mo58779Qe(r8, r4)
                if (r7 != r5) goto L_0x0094
                r7 = 1
                goto L_0x0095
            L_0x0094:
                r7 = 0
            L_0x0095:
                if (r7 != 0) goto L_0x00ae
                if (r2 == 0) goto L_0x00ae
                java.lang.Object[] r8 = new java.lang.Object[r6]
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                r8[r4] = r7
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
                r8[r5] = r7
                java.lang.String r7 = "xSwitch: %b, enableHevc: %b, H265 must use ffmpeg_muxer"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r8)
                r7 = 1
            L_0x00ae:
                r8 = 3
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
                r8[r4] = r9
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r8[r5] = r0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                r8[r6] = r0
                java.lang.String r0 = "WechatSight isIsUseFFmpeg xSwitch: %b, useSoftEncode:%s, enableHevc:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r8)
                goto L_0x00d5
            L_0x00c9:
                java.lang.Object[] r0 = new java.lang.Object[r5]
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION
                r0[r4] = r2
                java.lang.String r2 = "Special version, open by default: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            L_0x00d4:
                r7 = 1
            L_0x00d5:
                r15.isUseFFMpegMuxer = r7
                com.tencent.mm.plugin.sight.base.e r0 = r15.sightEncode
                if (r0 == 0) goto L_0x00ec
                com.tencent.mm.plugin.sight.base.e r0 = r15.sightEncode
                if (r0 == 0) goto L_0x00e9
                int r0 = r0.f316167a
                if (r0 < 0) goto L_0x00e5
                r0 = 1
                goto L_0x00e6
            L_0x00e5:
                r0 = 0
            L_0x00e6:
                if (r0 != 0) goto L_0x00e9
                goto L_0x00ea
            L_0x00e9:
                r5 = 0
            L_0x00ea:
                if (r5 == 0) goto L_0x01d5
            L_0x00ec:
                boolean r0 = r15.softEncode
                r2 = 0
                if (r0 == 0) goto L_0x016f
                boolean r0 = r15.checkVideoFormatValid()
                if (r0 == 0) goto L_0x016f
                com.tencent.tav.core.ExportConfig r0 = r15.exportConfig
                if (r0 == 0) goto L_0x0100
                android.media.MediaFormat r0 = r0.getVideoFormat()
                goto L_0x0101
            L_0x0100:
                r0 = r2
            L_0x0101:
                if (r0 == 0) goto L_0x0154
                int r3 = android.os.Build.VERSION.SDK_INT
                r5 = 24
                if (r3 < r5) goto L_0x0154
                java.lang.String r3 = "color-range"
                int r12 = w80.C111749g.m152381a(r0, r3, r4)
                java.lang.String r3 = "color-standard"
                int r13 = w80.C111749g.m152381a(r0, r3, r4)
                java.lang.String r3 = "color-transfer"
                int r14 = w80.C111749g.m152381a(r0, r3, r4)
                com.tencent.mm.plugin.vlog.model.TAVKitMuxer r0 = com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer.f282480a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "init bufId, colorRange:"
                r0.append(r3)
                r0.append(r12)
                java.lang.String r3 = ", colorStandard:"
                r0.append(r3)
                r0.append(r13)
                java.lang.String r3 = ", colorTransfer:"
                r0.append(r3)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                com.tencent.mm.plugin.sight.base.e$a r5 = com.tencent.p014mm.plugin.sight.base.C106139e.f316165b
                int r6 = r15.videoWidth
                int r7 = r15.videoHeight
                int r8 = r15.videoBitrate
                float r9 = r15.videoFps
                boolean r10 = r15.isHevc
                boolean r11 = r15.isUseFFMpegMuxer
                com.tencent.mm.plugin.sight.base.e r0 = r5.mo151880b(r6, r7, r8, r9, r10, r11, r12, r13, r14)
                goto L_0x016c
            L_0x0154:
                com.tencent.mm.plugin.sight.base.e$a r3 = com.tencent.p014mm.plugin.sight.base.C106139e.f316165b
                int r4 = r15.videoWidth
                int r5 = r15.videoHeight
                int r6 = r15.videoBitrate
                float r7 = r15.videoFps
                boolean r8 = r15.isHevc
                boolean r9 = r15.isUseFFMpegMuxer
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 448(0x1c0, float:6.28E-43)
                r14 = 0
                com.tencent.mm.plugin.sight.base.e r0 = com.tencent.p014mm.plugin.sight.base.C106139e.C106140a.m142779c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            L_0x016c:
                r15.sightEncode = r0
                goto L_0x0179
            L_0x016f:
                com.tencent.mm.plugin.sight.base.e$a r0 = com.tencent.p014mm.plugin.sight.base.C106139e.f316165b
                boolean r3 = r15.isHevc
                com.tencent.mm.plugin.sight.base.e r0 = r0.mo151879a(r3)
                r15.sightEncode = r0
            L_0x0179:
                com.tencent.mm.plugin.vlog.model.TAVKitMuxer r0 = com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer.f282480a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "init bufId:"
                r0.append(r3)
                com.tencent.mm.plugin.sight.base.e r3 = r15.sightEncode
                if (r3 == 0) goto L_0x018f
                int r2 = r3.f316167a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            L_0x018f:
                r0.append(r2)
                java.lang.String r2 = ", isHevc:"
                r0.append(r2)
                boolean r2 = r15.isHevc
                r0.append(r2)
                java.lang.String r2 = ", softEncode:"
                r0.append(r2)
                boolean r2 = r15.softEncode
                r0.append(r2)
                java.lang.String r2 = ", video size:["
                r0.append(r2)
                int r2 = r15.videoWidth
                r0.append(r2)
                r2 = 120(0x78, float:1.68E-43)
                r0.append(r2)
                int r2 = r15.videoHeight
                r0.append(r2)
                java.lang.String r2 = "], fps:"
                r0.append(r2)
                float r2 = r15.videoFps
                r0.append(r2)
                java.lang.String r2 = ", isUseFFMpegMuxer:"
                r0.append(r2)
                boolean r2 = r15.isUseFFMpegMuxer
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            L_0x01d5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer.SightVideoJNIMediaMuxer.checkInitBufId():void");
        }

        public void clearResource() {
        }

        public final void configMuxerToSoftEncode(boolean z) {
            this.softEncode = z;
            TAVKitMuxer tAVKitMuxer = TAVKitMuxer.f282480a;
            Log.m105924i("MicroMsg.TAVKitMuxer", "configMuxerToSoftEncode:" + z);
        }

        public final void ensureMuxerVideoDuration(int i) {
            if (this.duration <= 0) {
                this.duration = i;
            }
        }

        public final MediaFormat getAudioFormat() {
            return this.audioFormat;
        }

        public final int getDuration() {
            return this.duration;
        }

        public final AssetWriterVideoEncoder getEncoder() {
            return this.encoder;
        }

        public ExportConfig getExportConfig() {
            return this.exportConfig;
        }

        public final int getIndex() {
            return this.index;
        }

        public final C106139e getSightEncode() {
            return this.sightEncode;
        }

        public final MediaFormat getVideoFormat() {
            return this.videoFormat;
        }

        public final int getVideoFrameCount() {
            return this.videoFrameCount;
        }

        public boolean ignoreHeader() {
            return false;
        }

        public boolean isMuxerStarted() {
            return this.isStarted;
        }

        public final boolean isStarted() {
            return this.isStarted;
        }

        public void prepareParallelSegmentInfo(int i, CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
            this.index = i;
        }

        public void release() {
            C106139e eVar = this.sightEncode;
            if (eVar != null) {
                eVar.mo151875c();
            }
            this.isStarted = false;
        }

        public final void setAudioFormat(MediaFormat mediaFormat) {
            this.audioFormat = mediaFormat;
        }

        public final void setDuration(int i) {
            this.duration = i;
        }

        public final void setEncoder(AssetWriterVideoEncoder assetWriterVideoEncoder) {
            this.encoder = assetWriterVideoEncoder;
        }

        public void setExportConfig(ExportConfig exportConfig2) {
            C87412m.m108594g(exportConfig2, "exportConfig");
            TAVKitMuxer tAVKitMuxer = TAVKitMuxer.f282480a;
            Log.m105924i("MicroMsg.TAVKitMuxer", "setExportConfig:" + exportConfig2);
            this.exportConfig = exportConfig2;
        }

        public final void setSoftEncoder(AssetWriterVideoEncoder assetWriterVideoEncoder) {
            C87412m.m108594g(assetWriterVideoEncoder, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
            this.encoder = assetWriterVideoEncoder;
        }

        public final void setStarted(boolean z) {
            this.isStarted = z;
        }

        public final void setVideoFormat(MediaFormat mediaFormat) {
            this.videoFormat = mediaFormat;
        }

        public final void setVideoFrameCount(int i) {
            this.videoFrameCount = i;
        }

        public void start() {
            TAVKitMuxer tAVKitMuxer = TAVKitMuxer.f282480a;
            Log.m105924i("MicroMsg.TAVKitMuxer", IXWebBroadcastListener.STAGE_START);
            this.isStarted = true;
        }

        public boolean stop(boolean z) {
            TAVKitMuxer tAVKitMuxer = TAVKitMuxer.f282480a;
            Log.m105924i("MicroMsg.TAVKitMuxer", "stop, duration:" + this.duration + "，frameCount:" + this.videoFrameCount + ", dtsCount:" + this.dtsCount);
            StringBuilder sb = new StringBuilder();
            sb.append("stop videoFormat:");
            sb.append(this.videoFormat);
            Log.m105924i("MicroMsg.TAVKitMuxer", sb.toString());
            Log.m105924i("MicroMsg.TAVKitMuxer", "stop audioFormat:" + this.audioFormat);
            if (this.duration <= 0) {
                Log.m105920e("MicroMsg.TAVKitMuxer", "error duration is 0");
                this.isStarted = false;
                return false;
            }
            this.audioSampleRate = getMediaFormatInt(this.audioFormat, "sample-rate", 0);
            this.audioChannelCount = getMediaFormatInt(this.audioFormat, "channel-count", 0);
            int mediaFormatInt = getMediaFormatInt(this.videoFormat, "frame-rate", 0);
            this.videoBitrate = getMediaFormatInt(this.videoFormat, FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, 0);
            float f = (((float) this.videoFrameCount) * 1000.0f) / ((float) this.duration);
            Log.m105924i("MicroMsg.TAVKitMuxer", "audioSampleRate:" + this.audioSampleRate + ", audioChannelCount:" + this.audioChannelCount + ", mediaFormatFps:" + mediaFormatInt + ", videoBitrate:" + this.videoBitrate + ", duration:" + this.duration + ", countFps:" + f + ", configToSoftEncode:" + this.softEncode);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("exportConfig: audioSampleRate:");
            ExportConfig exportConfig2 = this.exportConfig;
            Integer num = null;
            sb4.append(exportConfig2 != null ? Integer.valueOf(exportConfig2.getAudioSampleRateHz()) : null);
            sb4.append(", audioChannelCount:");
            ExportConfig exportConfig3 = this.exportConfig;
            sb4.append(exportConfig3 != null ? Integer.valueOf(exportConfig3.getAudioChannelCount()) : null);
            sb4.append(", videoBitrate:");
            ExportConfig exportConfig4 = this.exportConfig;
            sb4.append(exportConfig4 != null ? Integer.valueOf(exportConfig4.getVideoBitRate()) : null);
            Log.m105924i("MicroMsg.TAVKitMuxer", sb4.toString());
            if (!this.softEncode) {
                this.videoFps = f;
            }
            if (this.audioSampleRate <= 0) {
                ExportConfig exportConfig5 = this.exportConfig;
                this.audioSampleRate = exportConfig5 != null ? exportConfig5.getAudioSampleRateHz() : 0;
            }
            if (this.audioChannelCount <= 0) {
                ExportConfig exportConfig6 = this.exportConfig;
                this.audioChannelCount = exportConfig6 != null ? exportConfig6.getAudioChannelCount() : 0;
            }
            if (this.videoBitrate <= 0) {
                ExportConfig exportConfig7 = this.exportConfig;
                this.videoBitrate = exportConfig7 != null ? exportConfig7.getVideoBitRate() : 0;
            }
            boolean z2 = (this.audioSampleRate <= 0 && this.audioChannelCount <= 0) || this.audioFormat == null;
            if (z) {
                Log.m105924i("MicroMsg.TAVKitMuxer", "stop by cancel, do not mux");
                this.isStarted = false;
                return true;
            }
            int i = this.duration;
            TAVKitMuxer tAVKitMuxer2 = TAVKitMuxer.f282480a;
            if (i < ((Number) ((C36570n) TAVKitMuxer.f282481b).getValue()).intValue() || this.videoFrameCount < 5) {
                Log.m105920e("MicroMsg.TAVKitMuxer", "stop remux error, duration:" + this.duration + ", frameCount:" + this.videoFrameCount);
            } else {
                ExportConfig exportConfig8 = this.exportConfig;
                if (!(exportConfig8 == null || (exportConfig8.getOutputWidth() == exportConfig8.getRenderWidth() && exportConfig8.getOutputHeight() == exportConfig8.getRenderHeight()))) {
                    int outputWidth = exportConfig8.getOutputWidth() - exportConfig8.getRenderWidth();
                    int outputHeight = exportConfig8.getOutputHeight() - exportConfig8.getRenderHeight();
                    Log.m105924i("MicroMsg.TAVKitMuxer", "setCropBorder cropRight:" + outputWidth + " cropBottom:" + outputHeight);
                    C106139e eVar = this.sightEncode;
                    if (eVar != null) {
                        SightVideoJNI.setCropBorder(eVar.f316167a, 0, 0, outputWidth, outputHeight);
                    }
                }
                C106139e eVar2 = this.sightEncode;
                if (eVar2 != null) {
                    num = Integer.valueOf(eVar2.mo151874b(this.path, this.duration, this.videoFps, z2, this.audioSampleRate, this.audioChannelCount));
                }
                Log.m105924i("MicroMsg.TAVKitMuxer", "stop ret:" + num);
            }
            this.isStarted = false;
            return true;
        }

        public int videoTrackIndex() {
            return this.videoId;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00cf  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void writeSampleData(int r14, java.nio.ByteBuffer r15, android.media.MediaCodec.BufferInfo r16) {
            /*
                r13 = this;
                r1 = r13
                r0 = r14
                r3 = r15
                r12 = r16
                java.lang.String r2 = "byteBuffer"
                gy3.C87412m.m108594g(r15, r2)
                java.lang.String r2 = "bufferInfo"
                gy3.C87412m.m108594g(r12, r2)
                int r2 = r1.videoId
                r4 = 0
                r5 = 1
                if (r0 != r2) goto L_0x0017
                r2 = 1
                goto L_0x0018
            L_0x0017:
                r2 = 0
            L_0x0018:
                com.tencent.mm.plugin.vlog.model.TAVKitMuxer r6 = com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer.f282480a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "writeSampleData, trackId:"
                r6.append(r7)
                r6.append(r14)
                java.lang.String r7 = ", isVideo:"
                r6.append(r7)
                r6.append(r2)
                java.lang.String r2 = ", pts:"
                r6.append(r2)
                long r7 = r12.presentationTimeUs
                r6.append(r7)
                java.lang.String r2 = r6.toString()
                java.lang.String r6 = "MicroMsg.TAVKitMuxer"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
                int r2 = r1.videoId
                if (r0 != r2) goto L_0x0068
                int r0 = r1.videoFrameCount
                int r0 = r0 + r5
                r1.videoFrameCount = r0
                boolean r0 = r1.softEncode
                if (r0 != 0) goto L_0x00ea
                com.tencent.mm.plugin.sight.base.e r0 = r1.sightEncode
                if (r0 == 0) goto L_0x00ea
                int r2 = r12.size
                long r4 = r12.presentationTimeUs
                java.lang.Object r6 = com.tencent.p014mm.plugin.sight.base.C106139e.f316166c
                monitor-enter(r6)
                int r0 = r0.f316167a     // Catch:{ all -> 0x0065 }
                com.tencent.p014mm.plugin.sight.base.SightVideoJNI.writeH264Data(r0, r15, r2, r4)     // Catch:{ all -> 0x0065 }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0065 }
                monitor-exit(r6)
                goto L_0x00ea
            L_0x0065:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            L_0x0068:
                int r2 = r1.audioId
                if (r0 != r2) goto L_0x00ea
                boolean r0 = r1.isUseFFMpegMuxer
                if (r0 == 0) goto L_0x00d8
                android.media.MediaFormat r0 = r1.audioFormat
                if (r0 == 0) goto L_0x008c
                java.lang.String r2 = "aac-profile"
                boolean r0 = r0.containsKey(r2)
                if (r0 != r5) goto L_0x007e
                r0 = 1
                goto L_0x007f
            L_0x007e:
                r0 = 0
            L_0x007f:
                if (r0 == 0) goto L_0x008c
                android.media.MediaFormat r0 = r1.audioFormat
                gy3.C87412m.m108591d(r0)
                int r0 = r0.getInteger(r2)
                r7 = r0
                goto L_0x008e
            L_0x008c:
                r0 = 2
                r7 = 2
            L_0x008e:
                android.media.MediaFormat r0 = r1.audioFormat
                if (r0 == 0) goto L_0x00ae
                java.lang.String r2 = "sample-rate"
                boolean r0 = r0.containsKey(r2)
                if (r0 != r5) goto L_0x009c
                r0 = 1
                goto L_0x009d
            L_0x009c:
                r0 = 0
            L_0x009d:
                if (r0 == 0) goto L_0x00ae
                android.media.MediaFormat r0 = r1.audioFormat
                gy3.C87412m.m108591d(r0)
                int r0 = r0.getInteger(r2)
                int r0 = i72.C98606a.m128205b(r0)
                r8 = r0
                goto L_0x00b0
            L_0x00ae:
                r0 = 4
                r8 = 4
            L_0x00b0:
                android.media.MediaFormat r0 = r1.audioFormat
                if (r0 == 0) goto L_0x00ca
                java.lang.String r2 = "channel-count"
                boolean r0 = r0.containsKey(r2)
                if (r0 != r5) goto L_0x00bd
                r4 = 1
            L_0x00bd:
                if (r4 == 0) goto L_0x00ca
                android.media.MediaFormat r0 = r1.audioFormat
                gy3.C87412m.m108591d(r0)
                int r0 = r0.getInteger(r2)
                r9 = r0
                goto L_0x00cb
            L_0x00ca:
                r9 = 1
            L_0x00cb:
                com.tencent.mm.plugin.sight.base.e r2 = r1.sightEncode
                if (r2 == 0) goto L_0x00ea
                int r4 = r12.size
                long r5 = r12.presentationTimeUs
                r3 = r15
                r2.mo151876d(r3, r4, r5, r7, r8, r9)
                goto L_0x00ea
            L_0x00d8:
                com.tencent.mm.plugin.sight.base.e r2 = r1.sightEncode
                if (r2 == 0) goto L_0x00ea
                int r4 = r12.size
                long r5 = r12.presentationTimeUs
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 56
                r11 = 0
                r3 = r15
                com.tencent.p014mm.plugin.sight.base.C106139e.m142774e(r2, r3, r4, r5, r7, r8, r9, r10, r11)
            L_0x00ea:
                long r2 = r12.presentationTimeUs
                float r0 = (float) r2
                r2 = 1148846080(0x447a0000, float:1000.0)
                float r0 = r0 / r2
                int r0 = iy3.C60641c.m70921b(r0)
                int r2 = r1.duration
                if (r0 <= r2) goto L_0x00fa
                r1.duration = r0
            L_0x00fa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer.SightVideoJNIMediaMuxer.writeSampleData(int, java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo):void");
        }

        public void writeSampleDataTime(boolean z, CMTime cMTime) {
            C87412m.m108594g(cMTime, "sampleTime");
            if (z && !this.softEncode) {
                TAVKitMuxer tAVKitMuxer = TAVKitMuxer.f282480a;
                Log.m105924i("MicroMsg.TAVKitMuxer", "write video dts:" + cMTime.getTimeUs());
                C106139e eVar = this.sightEncode;
                if ((eVar != null ? eVar.f316167a : -1) < 0) {
                    Log.m105924i("MicroMsg.TAVKitMuxer", "save pending dts:" + cMTime.getTimeUs());
                    this.pendingVideoDts.add(Long.valueOf(cMTime.getTimeUs()));
                    return;
                }
                doWriteVideoDts(cMTime.getTimeUs());
            }
        }
    }

    /* renamed from: a */
    public final void mo134554a() {
        MediaMuxerFactory.setMuxerCreator(new SightVideoJNIMediaMuxerFactory());
    }
}
