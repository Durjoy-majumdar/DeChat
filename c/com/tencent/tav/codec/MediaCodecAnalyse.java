package com.tencent.tav.codec;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b1\u00102J.\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\bH\u0016J0\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0018\u0010&\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016J\n\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010(\u001a\u00020\nH\u0016J\b\u0010)\u001a\u00020\nH\u0016J\n\u0010*\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010,\u001a\u0004\u0018\u00010+J\b\u0010-\u001a\u00020$H\u0016R\u0014\u0010/\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, mo182094d2 = {"Lcom/tencent/tav/codec/MediaCodecAnalyse;", "Lcom/tencent/tav/codec/IMediaCodec;", "Landroid/media/MediaFormat;", "format", "Landroid/view/Surface;", "surface", "Landroid/media/MediaCrypto;", "crypto", "", "flags", "Lrx3/b0;", "configure", "start", "flush", "stop", "release", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "bindSurfaceTexture", "Landroid/media/MediaCodec$BufferInfo;", "info", "", "timeoutUs", "dequeueOutputBuffer", "dequeueInputBuffer", "index", "Ljava/nio/ByteBuffer;", "getOutputBuffer", "offset", "size", "presentationTimeUs", "queueInputBuffer", "", "path", "setDataSource", "getInputBuffer", "", "render", "releaseOutputBuffer", "createInputSurface", "signalEndOfInputStream", "reset", "getOutputFormat", "Landroid/media/MediaCodec;", "getCodec", "isSoft", "Lcom/tencent/tav/codec/MediaCodecAnalyse$Companion$MediaCodecData;", "data", "Lcom/tencent/tav/codec/MediaCodecAnalyse$Companion$MediaCodecData;", "<init>", "()V", "Companion", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
public final class MediaCodecAnalyse implements IMediaCodec {
    public static final Companion Companion = new Companion((C8480h) null);
    /* access modifiers changed from: private */
    public static int DEBUG_COUNT = 0;
    private static final String DEFAULT_SCENE = "default";
    private static final String STATE_CREATE = "create";
    private static final String STATE_RELEASE = "release";
    private static final String STATE_RESET = "reset";
    private static final String STATE_START = "start";
    private static final String STATE_STOP = "stop";
    private static final String TAG = "MediaCodecAnalyse";
    /* access modifiers changed from: private */
    public static final ArrayList<Companion.MediaCodecData> analyseList = new ArrayList<>();
    /* access modifiers changed from: private */
    public final Companion.MediaCodecData data = new Companion.MediaCodecData((String) null, (MediaCodec) null, false, (MediaFormat) null, (String) null, (String) null, 63, (C8480h) null);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007J\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007R\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00020 j\b\u0012\u0004\u0012\u00020\u0002`!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, mo182094d2 = {"Lcom/tencent/tav/codec/MediaCodecAnalyse$Companion;", "", "Lcom/tencent/tav/codec/MediaCodecAnalyse$Companion$MediaCodecData;", "data", "Lrx3/b0;", "addNewInstance", "removeInstance", "makeDebugCountIncrease", "Lorg/json/JSONArray;", "getCodecInfo", "", "instanceCount", "", "type", "scene", "Lcom/tencent/tav/codec/MediaCodecAnalyse;", "createDecoderByType", "createEncoderByType", "DEBUG_COUNT", "I", "getDEBUG_COUNT", "()I", "setDEBUG_COUNT", "(I)V", "DEFAULT_SCENE", "Ljava/lang/String;", "STATE_CREATE", "STATE_RELEASE", "STATE_RESET", "STATE_START", "STATE_STOP", "TAG", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "analyseList", "Ljava/util/ArrayList;", "<init>", "()V", "MediaCodecData", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
    public static final class Companion {

        @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003JK\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006-"}, mo182094d2 = {"Lcom/tencent/tav/codec/MediaCodecAnalyse$Companion$MediaCodecData;", "", "name", "", "codec", "Landroid/media/MediaCodec;", "encoder", "", "format", "Landroid/media/MediaFormat;", "scene", "state", "(Ljava/lang/String;Landroid/media/MediaCodec;ZLandroid/media/MediaFormat;Ljava/lang/String;Ljava/lang/String;)V", "getCodec", "()Landroid/media/MediaCodec;", "setCodec", "(Landroid/media/MediaCodec;)V", "getEncoder", "()Z", "setEncoder", "(Z)V", "getFormat", "()Landroid/media/MediaFormat;", "setFormat", "(Landroid/media/MediaFormat;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getScene", "setScene", "getState", "setState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
        public static final class MediaCodecData {
            private MediaCodec codec;
            private boolean encoder;
            private MediaFormat format;
            private String name;
            private String scene;
            private String state;

            public MediaCodecData() {
                this((String) null, (MediaCodec) null, false, (MediaFormat) null, (String) null, (String) null, 63, (C8480h) null);
            }

            public MediaCodecData(String str, MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, String str2, String str3) {
                C87412m.m108595h(str2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                C87412m.m108595h(str3, "state");
                this.name = str;
                this.codec = mediaCodec;
                this.encoder = z;
                this.format = mediaFormat;
                this.scene = str2;
                this.state = str3;
            }

            public static /* synthetic */ MediaCodecData copy$default(MediaCodecData mediaCodecData, String str, MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = mediaCodecData.name;
                }
                if ((i & 2) != 0) {
                    mediaCodec = mediaCodecData.codec;
                }
                MediaCodec mediaCodec2 = mediaCodec;
                if ((i & 4) != 0) {
                    z = mediaCodecData.encoder;
                }
                boolean z2 = z;
                if ((i & 8) != 0) {
                    mediaFormat = mediaCodecData.format;
                }
                MediaFormat mediaFormat2 = mediaFormat;
                if ((i & 16) != 0) {
                    str2 = mediaCodecData.scene;
                }
                String str4 = str2;
                if ((i & 32) != 0) {
                    str3 = mediaCodecData.state;
                }
                return mediaCodecData.copy(str, mediaCodec2, z2, mediaFormat2, str4, str3);
            }

            public final String component1() {
                return this.name;
            }

            public final MediaCodec component2() {
                return this.codec;
            }

            public final boolean component3() {
                return this.encoder;
            }

            public final MediaFormat component4() {
                return this.format;
            }

            public final String component5() {
                return this.scene;
            }

            public final String component6() {
                return this.state;
            }

            public final MediaCodecData copy(String str, MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, String str2, String str3) {
                C87412m.m108595h(str2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                C87412m.m108595h(str3, "state");
                return new MediaCodecData(str, mediaCodec, z, mediaFormat, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof MediaCodecData) {
                        MediaCodecData mediaCodecData = (MediaCodecData) obj;
                        if (C87412m.m108589b(this.name, mediaCodecData.name) && C87412m.m108589b(this.codec, mediaCodecData.codec)) {
                            if (!(this.encoder == mediaCodecData.encoder) || !C87412m.m108589b(this.format, mediaCodecData.format) || !C87412m.m108589b(this.scene, mediaCodecData.scene) || !C87412m.m108589b(this.state, mediaCodecData.state)) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final MediaCodec getCodec() {
                return this.codec;
            }

            public final boolean getEncoder() {
                return this.encoder;
            }

            public final MediaFormat getFormat() {
                return this.format;
            }

            public final String getName() {
                return this.name;
            }

            public final String getScene() {
                return this.scene;
            }

            public final String getState() {
                return this.state;
            }

            public int hashCode() {
                String str = this.name;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                MediaCodec mediaCodec = this.codec;
                int hashCode2 = (hashCode + (mediaCodec != null ? mediaCodec.hashCode() : 0)) * 31;
                boolean z = this.encoder;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
                MediaFormat mediaFormat = this.format;
                int hashCode3 = (i2 + (mediaFormat != null ? mediaFormat.hashCode() : 0)) * 31;
                String str2 = this.scene;
                int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.state;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return hashCode4 + i;
            }

            public final void setCodec(MediaCodec mediaCodec) {
                this.codec = mediaCodec;
            }

            public final void setEncoder(boolean z) {
                this.encoder = z;
            }

            public final void setFormat(MediaFormat mediaFormat) {
                this.format = mediaFormat;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public final void setScene(String str) {
                C87412m.m108595h(str, "<set-?>");
                this.scene = str;
            }

            public final void setState(String str) {
                C87412m.m108595h(str, "<set-?>");
                this.state = str;
            }

            public String toString() {
                return "MediaCodecData(name=" + this.name + ", codec=" + this.codec + ", encoder=" + this.encoder + ", format=" + this.format + ", scene=" + this.scene + ", state=" + this.state + ")";
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ MediaCodecData(java.lang.String r5, android.media.MediaCodec r6, boolean r7, android.media.MediaFormat r8, java.lang.String r9, java.lang.String r10, int r11, gy3.C8480h r12) {
                /*
                    r4 = this;
                    r12 = r11 & 1
                    r0 = 0
                    if (r12 == 0) goto L_0x0007
                    r12 = r0
                    goto L_0x0008
                L_0x0007:
                    r12 = r5
                L_0x0008:
                    r5 = r11 & 2
                    if (r5 == 0) goto L_0x000e
                    r1 = r0
                    goto L_0x000f
                L_0x000e:
                    r1 = r6
                L_0x000f:
                    r5 = r11 & 4
                    if (r5 == 0) goto L_0x0016
                    r7 = 0
                    r2 = 0
                    goto L_0x0017
                L_0x0016:
                    r2 = r7
                L_0x0017:
                    r5 = r11 & 8
                    if (r5 == 0) goto L_0x001c
                    goto L_0x001d
                L_0x001c:
                    r0 = r8
                L_0x001d:
                    r5 = r11 & 16
                    if (r5 == 0) goto L_0x0023
                    java.lang.String r9 = "default"
                L_0x0023:
                    r3 = r9
                    r5 = r11 & 32
                    if (r5 == 0) goto L_0x002a
                    java.lang.String r10 = "create"
                L_0x002a:
                    r11 = r10
                    r5 = r4
                    r6 = r12
                    r7 = r1
                    r8 = r2
                    r9 = r0
                    r10 = r3
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData.<init>(java.lang.String, android.media.MediaCodec, boolean, android.media.MediaFormat, java.lang.String, java.lang.String, int, gy3.h):void");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        private final void addNewInstance(MediaCodecData mediaCodecData) {
            MediaCodecAnalyse.analyseList.add(mediaCodecData);
        }

        public static /* synthetic */ MediaCodecAnalyse createDecoderByType$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = "default";
            }
            return companion.createDecoderByType(str, str2);
        }

        public static /* synthetic */ MediaCodecAnalyse createEncoderByType$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = "default";
            }
            return companion.createEncoderByType(str, str2);
        }

        /* access modifiers changed from: private */
        public final void removeInstance(MediaCodecData mediaCodecData) {
            MediaCodecAnalyse.analyseList.remove(mediaCodecData);
        }

        public final MediaCodecAnalyse createDecoderByType(String str, String str2) {
            C87412m.m108595h(str, "type");
            C87412m.m108595h(str2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            MediaCodecAnalyse mediaCodecAnalyse = new MediaCodecAnalyse();
            mediaCodecAnalyse.data.setScene(str2);
            mediaCodecAnalyse.data.setCodec(MediaCodec.createDecoderByType(str));
            MediaCodecData access$getData$p = mediaCodecAnalyse.data;
            MediaCodec codec = mediaCodecAnalyse.data.getCodec();
            access$getData$p.setName(codec != null ? codec.getName() : null);
            mediaCodecAnalyse.data.setEncoder(false);
            MediaCodecAnalyse.Companion.addNewInstance(mediaCodecAnalyse.data);
            return mediaCodecAnalyse;
        }

        public final MediaCodecAnalyse createEncoderByType(String str, String str2) {
            C87412m.m108595h(str, "type");
            C87412m.m108595h(str2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            MediaCodecAnalyse mediaCodecAnalyse = new MediaCodecAnalyse();
            mediaCodecAnalyse.data.setScene(str2);
            mediaCodecAnalyse.data.setCodec(MediaCodec.createEncoderByType(str));
            MediaCodecData access$getData$p = mediaCodecAnalyse.data;
            MediaCodec codec = mediaCodecAnalyse.data.getCodec();
            access$getData$p.setName(codec != null ? codec.getName() : null);
            mediaCodecAnalyse.data.setEncoder(true);
            MediaCodecAnalyse.Companion.addNewInstance(mediaCodecAnalyse.data);
            return mediaCodecAnalyse;
        }

        public final JSONArray getCodecInfo() {
            MediaFormat format;
            JSONArray jSONArray = new JSONArray();
            for (MediaCodecData mediaCodecData : MediaCodecAnalyse.analyseList) {
                JSONObject jSONObject = new JSONObject();
                String str = null;
                jSONObject.put("name", mediaCodecData != null ? mediaCodecData.getName() : null);
                jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_ENCODER, (mediaCodecData != null ? Boolean.valueOf(mediaCodecData.getEncoder()) : null).booleanValue());
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, mediaCodecData != null ? mediaCodecData.getScene() : null);
                jSONObject.put("state", mediaCodecData != null ? mediaCodecData.getState() : null);
                if (!(mediaCodecData == null || (format = mediaCodecData.getFormat()) == null)) {
                    str = format.toString();
                }
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_FORMAT, str);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        }

        public final int getDEBUG_COUNT() {
            return MediaCodecAnalyse.DEBUG_COUNT;
        }

        public final int instanceCount() {
            return MediaCodecAnalyse.analyseList.size();
        }

        public final void makeDebugCountIncrease() {
            setDEBUG_COUNT(getDEBUG_COUNT() + 1);
        }

        public final void setDEBUG_COUNT(int i) {
            MediaCodecAnalyse.DEBUG_COUNT = i;
        }
    }

    public static final MediaCodecAnalyse createDecoderByType(String str, String str2) {
        return Companion.createDecoderByType(str, str2);
    }

    public static final MediaCodecAnalyse createEncoderByType(String str, String str2) {
        return Companion.createEncoderByType(str, str2);
    }

    public void bindSurfaceTexture(SurfaceTexture surfaceTexture) {
        C87412m.m108595h(surfaceTexture, "surfaceTexture");
    }

    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.data.setFormat(mediaFormat);
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.configure(mediaFormat, surface, mediaCrypto, i);
        }
    }

    public Surface createInputSurface() {
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            return codec.createInputSurface();
        }
        return null;
    }

    public int dequeueInputBuffer(long j) {
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            return codec.dequeueInputBuffer(j);
        }
        return -1;
    }

    public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
        C87412m.m108595h(bufferInfo, "info");
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            return codec.dequeueOutputBuffer(bufferInfo, j);
        }
        return -1;
    }

    public void flush() {
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.flush();
        }
    }

    public final MediaCodec getCodec() {
        return this.data.getCodec();
    }

    public ByteBuffer getInputBuffer(int i) {
        return DecoderUtils.getInputBuffer(this, i);
    }

    public ByteBuffer getOutputBuffer(int i) {
        return DecoderUtils.getOutputBuffer(this, i);
    }

    public MediaFormat getOutputFormat() {
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            return codec.getOutputFormat();
        }
        return null;
    }

    public boolean isSoft() {
        return false;
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.queueInputBuffer(i, i2, i3, j, i4);
        }
    }

    public void release() {
        Companion.removeInstance(this.data);
        this.data.setState("release");
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.release();
        }
    }

    public void releaseOutputBuffer(int i, boolean z) {
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.releaseOutputBuffer(i, z);
        }
    }

    public void reset() {
        this.data.setState(STATE_RESET);
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.reset();
        }
    }

    public void setDataSource(String str) {
    }

    public void signalEndOfInputStream() {
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.signalEndOfInputStream();
        }
    }

    public void start() {
        this.data.setState("start");
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.start();
        }
    }

    public void stop() {
        this.data.setState(STATE_STOP);
        MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.stop();
        }
    }
}
