package com.tencent.maas.composing;

import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.C16994k;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23813c;
import com.google.protobuf.C23821e2;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23844i2;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23872m0;
import com.google.protobuf.C23896m1;
import com.google.protobuf.C23897n;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C23922p0;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24062w1;
import com.google.protobuf.C24071y;
import com.tencent.maas.model.composing.MJComposingDefines;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82986r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class MJComposingS12 {
    private static C24025t.C24038h descriptor = C24025t.C24038h.m29872i(new String[]{"\n\u0014MJComposingS12.proto\u0012\u000eMJComposingS12\"\u001c\n\u0004Vec2\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002\"2\n\u0004Vec4\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002\u0012\t\n\u0001z\u0018\u0003 \u0001(\u0002\u0012\t\n\u0001w\u0018\u0004 \u0001(\u0002\"Q\n\u0005Rect2\u0012$\n\u0006origin\u0018\u0001 \u0001(\u000b2\u0014.MJComposingS12.Vec2\u0012\"\n\u0004size\u0018\u0002 \u0001(\u000b2\u0014.MJComposingS12.Vec2\"+\n\u0005Color\u0012\"\n\u0004rgba\u0018\u0001 \u0001(\u000b2\u0014.MJComposingS12.Vec4\"L\n\u0004Time\u0012&\n\u0004type\u0018\u0001 \u0001(\u000e2\u0018.MJComposingS12.TimeType\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0003\u0012\r\n\u0005scale\u0018\u0003 \u0001(\u0005\"]\n\tTimeRange\u0012(\n\nstart_time\u0018\u0001 \u0001(\u000b2\u0014.MJComposingS12.Time\u0012&\n\bduration\u0018\u0002 \u0001(\u000b2\u0014.MJComposingS12.Time\"I\n\u0005Asset\u0012\u0013\n\tfile_path\u0018\u0002 \u0001(\tH\u0000\u0012\u001d\n\u0013ph_local_identifier\u0018\u0003 \u0001(\tH\u0000B\f\n\nidentifier\"º\u0001\n\u0012ContentSpatialDesc\u00124\n\nscale_mode\u0018\u0001 \u0001(\u000e2 .MJComposingS12.ContentScaleMode\u0012:\n\rrotation_mode\u0018\u0002 \u0001(\u000e2#.MJComposingS12.ContentRotationMode\u00122\n\tflip_mode\u0018\u0003 \u0001(\u000e2\u001f.MJComposingS12.ContentFlipMode\"\u0001\n\u0010LayerSpatialDesc\u0012\r\n\u0005scale\u0018\u0001 \u0001(\u0002\u0012\u0010\n\brotation\u0018\u0002 \u0001(\u0002\u0012&\n\bposition\u0018\u0003 \u0001(\u000b2\u0014.MJComposingS12.Vec2\u0012*\n\fanchor_point\u0018\u0004 \u0001(\u000b2\u0014.MJComposingS12.Vec2\"Í\u0001\n\tImageClip\u0012$\n\u0005asset\u0018\u0001 \u0001(\u000b2\u0015.MJComposingS12.Asset\u0012&\n\bduration\u0018\u0002 \u0001(\u000b2\u0014.MJComposingS12.Time\u0012@\n\u0014content_spatial_desc\u0018\u0003 \u0001(\u000b2\".MJComposingS12.ContentSpatialDesc\u00120\n\u0011content_crop_rect\u0018\u0004 \u0001(\u000b2\u0015.MJComposingS12.Rect2\"Ô\u0001\n\tVideoClip\u0012$\n\u0005asset\u0018\u0001 \u0001(\u000b2\u0015.MJComposingS12.Asset\u0012-\n\ntime_range\u0018\u0002 \u0001(\u000b2\u0019.MJComposingS12.TimeRange\u0012@\n\u0014content_spatial_desc\u0018\u0003 \u0001(\u000b2\".MJComposingS12.ContentSpatialDesc\u00120\n\u0011content_crop_rect\u0018\u0004 \u0001(\u000b2\u0015.MJComposingS12.Rect2\"\u0001\n\tAudioClip\u0012$\n\u0005asset\u0018\u0001 \u0001(\u000b2\u0015.MJComposingS12.Asset\u0012-\n\ntime_range\u0018\u0002 \u0001(\u000b2\u0019.MJComposingS12.TimeRange\u0012\u000e\n\u0006volume\u0018\u0003 \u0001(\u0002\u0012\u000f\n\u0007looping\u0018\u0004 \u0001(\b\"¡\u0001\n\u0004Clip\u0012/\n\nimage_clip\u0018\u0001 \u0001(\u000b2\u0019.MJComposingS12.ImageClipH\u0000\u0012/\n\nvideo_clip\u0018\u0002 \u0001(\u000b2\u0019.MJComposingS12.VideoClipH\u0000\u0012/\n\naudio_clip\u0018\u0003 \u0001(\u000b2\u0019.MJComposingS12.AudioClipH\u0000B\u0006\n\u0004clip\"K\n\tLyricInfo\u0012-\n\ntime_range\u0018\u0001 \u0001(\u000b2\u0019.MJComposingS12.TimeRange\u0012\u000f\n\u0007content\u0018\u0002 \u0001(\t\"î\u0001\n\u0012StickerOverlayDesc\u00128\n\fdecoder_type\u0018\u0001 \u0001(\u000e2\".MJComposingS12.StickerDecoderType\u00128\n\u0010timing_fill_mode\u0018\u0002 \u0001(\u000e2\u001e.MJComposingS12.TimingFillMode\u0012\u0011\n\tfile_path\u0018\u0003 \u0001(\t\u0012<\n\u0012layer_spatial_desc\u0018\u0004 \u0001(\u000b2 .MJComposingS12.LayerSpatialDesc\u0012\u0013\n\u000blayer_index\u0018\u0005 \u0001(\u0005\"¨\u0002\n\tTextStyle\u0012)\n\nfill_color\u0018\u0001 \u0001(\u000b2\u0015.MJComposingS12.Color\u0012+\n\fstroke_color\u0018\u0002 \u0001(\u000b2\u0015.MJComposingS12.Color\u0012\u0014\n\fstroke_width\u0018\u0003 \u0001(\u0002\u0012\u0011\n\tfont_size\u0018\u0004 \u0001(\u0002\u0012\u0011\n\tfont_name\u0018\u0005 \u0001(\t\u0012\u0016\n\u000efont_file_path\u0018\t \u0001(\t\u0012+\n\rshadow_offset\u0018\u0006 \u0001(\u000b2\u0014.MJComposingS12.Vec2\u0012+\n\fshadow_color\u0018\u0007 \u0001(\u000b2\u0015.MJComposingS12.Color\u0012\u0015\n\rshadow_radius\u0018\b \u0001(\u0002\"Â\u0001\n\nLayerStyle\u0012\u0015\n\rcorner_radius\u0018\u0001 \u0001(\u0002\u0012+\n\fborder_color\u0018\u0002 \u0001(\u000b2\u0015.MJComposingS12.Color\u0012\u0014\n\fborder_width\u0018\u0003 \u0001(\u0002\u0012/\n\u0010background_color\u0018\u0004 \u0001(\u000b2\u0015.MJComposingS12.Color\u0012)\n\u000bedge_insets\u0018\u0005 \u0001(\u000b2\u0014.MJComposingS12.Vec4\"é\u0001\n\u000fTextOverlayDesc\u0012\f\n\u0004text\u0018\u0001 \u0001(\t\u0012-\n\ntext_style\u0018\u0002 \u0001(\u000b2\u0019.MJComposingS12.TextStyle\u0012/\n\u000blayer_style\u0018\u0003 \u0001(\u000b2\u001a.MJComposingS12.LayerStyle\u0012<\n\u0012layer_spatial_desc\u0018\u0004 \u0001(\u000b2 .MJComposingS12.LayerSpatialDesc\u0012\u0015\n\rmaximum_width\u0018\u0005 \u0001(\u0002\u0012\u0013\n\u000blayer_index\u0018\u0006 \u0001(\u0005\"\u0002\n\u0010LyricOverlayDesc\u0012.\n\u000blyric_infos\u0018\u0001 \u0003(\u000b2\u0019.MJComposingS12.LyricInfo\u0012<\n\u0012layer_spatial_desc\u0018\u0002 \u0001(\u000b2 .MJComposingS12.LayerSpatialDesc\u0012-\n\ntext_style\u0018\u0003 \u0001(\u000b2\u0019.MJComposingS12.TextStyle\u0012/\n\u000blayer_style\u0018\u0004 \u0001(\u000b2\u001a.MJComposingS12.LayerStyle\u0012\u0015\n\rmaximum_width\u0018\u0005 \u0001(\u0002\u0012\u0013\n\u000blayer_index\u0018\u0006 \u0001(\u0005\"{\n\u0010CoordinatingDesc\u0012)\n\u000bcanvas_size\u0018\u0001 \u0001(\u000b2\u0014.MJComposingS12.Vec2\u0012<\n\u0012canvas_origin_type\u0018\u0002 \u0001(\u000e2 .MJComposingS12.CanvasOriginType\"á\u0002\n\rComposingDesc\u0012;\n\u0011coordinating_desc\u0018\u0001 \u0001(\u000b2 .MJComposingS12.CoordinatingDesc\u0012(\n\nmain_clips\u0018\u0002 \u0003(\u000b2\u0014.MJComposingS12.Clip\u0012+\n\bbgm_clip\u0018\u0003 \u0001(\u000b2\u0019.MJComposingS12.AudioClip\u0012<\n\u0012lyric_overlay_desc\u0018\u0004 \u0001(\u000b2 .MJComposingS12.LyricOverlayDesc\u0012A\n\u0015sticker_overlay_descs\u0018\u0005 \u0003(\u000b2\".MJComposingS12.StickerOverlayDesc\u0012;\n\u0012text_overlay_descs\u0018\u0006 \u0003(\u000b2\u001f.MJComposingS12.TextOverlayDesc*p\n\bTimeType\u0012\u0013\n\u000fTimeTypeNumeric\u0010\u0000\u0012\u0013\n\u000fTimeTypeInvalid\u0010\u0001\u0012\u001c\n\u0018TimeTypePositiveInfinity\u0010\u0002\u0012\u001c\n\u0018TimeTypeNegativeInfinity\u0010\u0003*\u0001\n\u0010ContentScaleMode\u0012\u001a\n\u0016ContentScaleModeCenter\u0010\u0000\u0012\u0018\n\u0014ContentScaleModeFill\u0010\u0001\u0012\u001d\n\u0019ContentScaleModeAspectFit\u0010\u0002\u0012\u001e\n\u001aContentScaleModeAspectFill\u0010\u0003*\u0001\n\u0013ContentRotationMode\u0012\u001b\n\u0017ContentRotationModeNone\u0010\u0000\u0012\u001c\n\u0018ContentRotationModeCCW90\u0010\u0001\u0012\u001a\n\u0016ContentRotationMode180\u0010\u0002\u0012\u001b\n\u0017ContentRotationModeCW90\u0010\u0003*\u0001\n\u000fContentFlipMode\u0012\u0017\n\u0013ContentFlipModeNone\u0010\u0000\u0012\u001d\n\u0019ContentFlipModeHorizontal\u0010\u0001\u0012\u001b\n\u0017ContentFlipModeVertical\u0010\u0002\u0012(\n$ContentFlipModeHorizontalAndVertical\u0010\u0003*`\n\u000eTimingFillMode\u0012\u0016\n\u0012TimingFillModeNone\u0010\u0000\u0012\u0019\n\u0015TimingFillModeLooping\u0010\u0001\u0012\u001b\n\u0017TimingFillModeLastFrame\u0010\u0002*P\n\u0012StickerDecoderType\u0012\u001e\n\u001aStickerDecoderTypePlatform\u0010\u0000\u0012\u001a\n\u0016StickerDecoderTypeWxAM\u0010\u0001*O\n\u0010CanvasOriginType\u0012\u001b\n\u0017CanvasOriginTypeTopLeft\u0010\u0000\u0012\u001e\n\u001aCanvasOriginTypeBottomLeft\u0010\u0001B,\n\u001acom.tencent.maas.composingB\u000eMJComposingS12b\u0006proto3"}, new C24025t.C24038h[0]);
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_Asset_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_Asset_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_AudioClip_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_AudioClip_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_Clip_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_Clip_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_Color_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_Color_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_ComposingDesc_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_ComposingDesc_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_ContentSpatialDesc_descriptor;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_MJComposingS12_ContentSpatialDesc_fieldAccessorTable */
    public static final C23872m0.C23880f f69255x67ce3062;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_CoordinatingDesc_descriptor;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_MJComposingS12_CoordinatingDesc_fieldAccessorTable */
    public static final C23872m0.C23880f f69256x16fe97b8;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_ImageClip_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_ImageClip_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_LayerSpatialDesc_descriptor;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_MJComposingS12_LayerSpatialDesc_fieldAccessorTable */
    public static final C23872m0.C23880f f69257xfaf293ba;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_LayerStyle_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_LayerStyle_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_LyricInfo_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_LyricInfo_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_LyricOverlayDesc_descriptor;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_MJComposingS12_LyricOverlayDesc_fieldAccessorTable */
    public static final C23872m0.C23880f f69258x4392f97c;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_Rect2_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_Rect2_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_StickerOverlayDesc_descriptor;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_MJComposingS12_StickerOverlayDesc_fieldAccessorTable */
    public static final C23872m0.C23880f f69259xed29395a;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_TextOverlayDesc_descriptor;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_MJComposingS12_TextOverlayDesc_fieldAccessorTable */
    public static final C23872m0.C23880f f69260x7900ae6;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_TextStyle_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_TextStyle_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_TimeRange_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_TimeRange_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_Time_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_Time_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_Vec2_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_Vec2_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_Vec4_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_Vec4_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJComposingS12_VideoClip_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJComposingS12_VideoClip_fieldAccessorTable;

    /* renamed from: com.tencent.maas.composing.MJComposingS12$1 */
    public static /* synthetic */ class C241671 {

        /* renamed from: $SwitchMap$com$tencent$maas$composing$MJComposingS12$Asset$IdentifierCase */
        public static final /* synthetic */ int[] f69261x625d4f7e;

        /* renamed from: $SwitchMap$com$tencent$maas$composing$MJComposingS12$Clip$ClipCase */
        public static final /* synthetic */ int[] f69262x19093b03;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            /*
                com.tencent.maas.composing.MJComposingS12$Clip$ClipCase[] r0 = com.tencent.maas.composing.MJComposingS12.Clip.ClipCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f69262x19093b03 = r0
                r1 = 1
                com.tencent.maas.composing.MJComposingS12$Clip$ClipCase r2 = com.tencent.maas.composing.MJComposingS12.Clip.ClipCase.IMAGE_CLIP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f69262x19093b03     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.maas.composing.MJComposingS12$Clip$ClipCase r3 = com.tencent.maas.composing.MJComposingS12.Clip.ClipCase.VIDEO_CLIP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f69262x19093b03     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.maas.composing.MJComposingS12$Clip$ClipCase r4 = com.tencent.maas.composing.MJComposingS12.Clip.ClipCase.AUDIO_CLIP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f69262x19093b03     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.maas.composing.MJComposingS12$Clip$ClipCase r4 = com.tencent.maas.composing.MJComposingS12.Clip.ClipCase.CLIP_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.tencent.maas.composing.MJComposingS12$Asset$IdentifierCase[] r3 = com.tencent.maas.composing.MJComposingS12.Asset.IdentifierCase.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f69261x625d4f7e = r3
                com.tencent.maas.composing.MJComposingS12$Asset$IdentifierCase r4 = com.tencent.maas.composing.MJComposingS12.Asset.IdentifierCase.FILE_PATH     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f69261x625d4f7e     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tencent.maas.composing.MJComposingS12$Asset$IdentifierCase r3 = com.tencent.maas.composing.MJComposingS12.Asset.IdentifierCase.PH_LOCAL_IDENTIFIER     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f69261x625d4f7e     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.tencent.maas.composing.MJComposingS12$Asset$IdentifierCase r1 = com.tencent.maas.composing.MJComposingS12.Asset.IdentifierCase.IDENTIFIER_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.C241671.<clinit>():void");
        }
    }

    public static final class Asset extends C23872m0 implements AssetOrBuilder {
        private static final Asset DEFAULT_INSTANCE = new Asset();
        public static final int FILE_PATH_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final C24062w1<Asset> PARSER = new C23813c<Asset>() {
            public Asset parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new Asset(lVar, a0Var, (C241671) null);
            }
        };
        public static final int PH_LOCAL_IDENTIFIER_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int identifierCase_;
        /* access modifiers changed from: private */
        public Object identifier_;
        private byte memoizedIsInitialized;

        public static final class Builder extends C23872m0.C23874b<Builder> implements AssetOrBuilder {
            private int identifierCase_;
            private Object identifier_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_Asset_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearFilePath() {
                if (this.identifierCase_ == 2) {
                    this.identifierCase_ = 0;
                    this.identifier_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearIdentifier() {
                this.identifierCase_ = 0;
                this.identifier_ = null;
                onChanged();
                return this;
            }

            public Builder clearPhLocalIdentifier() {
                if (this.identifierCase_ == 3) {
                    this.identifierCase_ = 0;
                    this.identifier_ = null;
                    onChanged();
                }
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_Asset_descriptor;
            }

            public String getFilePath() {
                String str = this.identifierCase_ == 2 ? this.identifier_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                String u = ((C16994k) str).mo18752u();
                if (this.identifierCase_ == 2) {
                    this.identifier_ = u;
                }
                return u;
            }

            public C16994k getFilePathBytes() {
                String str = this.identifierCase_ == 2 ? this.identifier_ : "";
                if (!(str instanceof String)) {
                    return (C16994k) str;
                }
                C16994k k = C16994k.m16791k((String) str);
                if (this.identifierCase_ == 2) {
                    this.identifier_ = k;
                }
                return k;
            }

            public IdentifierCase getIdentifierCase() {
                return IdentifierCase.forNumber(this.identifierCase_);
            }

            public String getPhLocalIdentifier() {
                String str = this.identifierCase_ == 3 ? this.identifier_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                String u = ((C16994k) str).mo18752u();
                if (this.identifierCase_ == 3) {
                    this.identifier_ = u;
                }
                return u;
            }

            public C16994k getPhLocalIdentifierBytes() {
                String str = this.identifierCase_ == 3 ? this.identifier_ : "";
                if (!(str instanceof String)) {
                    return (C16994k) str;
                }
                C16994k k = C16994k.m16791k((String) str);
                if (this.identifierCase_ == 3) {
                    this.identifier_ = k;
                }
                return k;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$6900 = MJComposingS12.internal_static_MJComposingS12_Asset_fieldAccessorTable;
                access$6900.mo37875c(Asset.class, Builder.class);
                return access$6900;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setFilePath(String str) {
                str.getClass();
                this.identifierCase_ = 2;
                this.identifier_ = str;
                onChanged();
                return this;
            }

            public Builder setFilePathBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.identifierCase_ = 2;
                this.identifier_ = kVar;
                onChanged();
                return this;
            }

            public Builder setPhLocalIdentifier(String str) {
                str.getClass();
                this.identifierCase_ = 3;
                this.identifier_ = str;
                onChanged();
                return this;
            }

            public Builder setPhLocalIdentifierBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.identifierCase_ = 3;
                this.identifier_ = kVar;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                this.identifierCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public Asset build() {
                Asset buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public Asset buildPartial() {
                Asset asset = new Asset((C23872m0.C23874b) this, (C241671) null);
                if (this.identifierCase_ == 2) {
                    Object unused = asset.identifier_ = this.identifier_;
                }
                if (this.identifierCase_ == 3) {
                    Object unused2 = asset.identifier_ = this.identifier_;
                }
                int unused3 = asset.identifierCase_ = this.identifierCase_;
                onBuilt();
                return asset;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public Asset getDefaultInstanceForType() {
                return Asset.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.identifierCase_ = 0;
                this.identifier_ = null;
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.identifierCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof Asset) {
                    return mergeFrom((Asset) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(Asset asset) {
                if (asset == Asset.getDefaultInstance()) {
                    return this;
                }
                int i = C241671.f69261x625d4f7e[asset.getIdentifierCase().ordinal()];
                if (i == 1) {
                    this.identifierCase_ = 2;
                    this.identifier_ = asset.identifier_;
                    onChanged();
                } else if (i == 2) {
                    this.identifierCase_ = 3;
                    this.identifier_ = asset.identifier_;
                    onChanged();
                }
                mergeUnknownFields(asset.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.Asset.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.Asset.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$Asset r3 = (com.tencent.maas.composing.MJComposingS12.Asset) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Asset) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$Asset r4 = (com.tencent.maas.composing.MJComposingS12.Asset) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Asset) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.Asset.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$Asset$Builder");
            }
        }

        public enum IdentifierCase implements C23908o0.C23911c {
            FILE_PATH(2),
            PH_LOCAL_IDENTIFIER(3),
            IDENTIFIER_NOT_SET(0);
            
            private final int value;

            private IdentifierCase(int i) {
                this.value = i;
            }

            public static IdentifierCase forNumber(int i) {
                if (i == 0) {
                    return IDENTIFIER_NOT_SET;
                }
                if (i == 2) {
                    return FILE_PATH;
                }
                if (i != 3) {
                    return null;
                }
                return PH_LOCAL_IDENTIFIER;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static IdentifierCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public /* synthetic */ Asset(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static Asset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_Asset_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Asset parseDelimitedFrom(InputStream inputStream) {
            return (Asset) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Asset parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<Asset> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Asset)) {
                return super.equals(obj);
            }
            Asset asset = (Asset) obj;
            if (!getIdentifierCase().equals(asset.getIdentifierCase())) {
                return false;
            }
            int i = this.identifierCase_;
            if (i != 2) {
                if (i == 3 && !getPhLocalIdentifier().equals(asset.getPhLocalIdentifier())) {
                    return false;
                }
            } else if (!getFilePath().equals(asset.getFilePath())) {
                return false;
            }
            return this.unknownFields.equals(asset.unknownFields);
        }

        public String getFilePath() {
            String str = this.identifierCase_ == 2 ? this.identifier_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            String u = ((C16994k) str).mo18752u();
            if (this.identifierCase_ == 2) {
                this.identifier_ = u;
            }
            return u;
        }

        public C16994k getFilePathBytes() {
            String str = this.identifierCase_ == 2 ? this.identifier_ : "";
            if (!(str instanceof String)) {
                return (C16994k) str;
            }
            C16994k k = C16994k.m16791k((String) str);
            if (this.identifierCase_ == 2) {
                this.identifier_ = k;
            }
            return k;
        }

        public IdentifierCase getIdentifierCase() {
            return IdentifierCase.forNumber(this.identifierCase_);
        }

        public C24062w1<Asset> getParserForType() {
            return PARSER;
        }

        public String getPhLocalIdentifier() {
            String str = this.identifierCase_ == 3 ? this.identifier_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            String u = ((C16994k) str).mo18752u();
            if (this.identifierCase_ == 3) {
                this.identifier_ = u;
            }
            return u;
        }

        public C16994k getPhLocalIdentifierBytes() {
            String str = this.identifierCase_ == 3 ? this.identifier_ : "";
            if (!(str instanceof String)) {
                return (C16994k) str;
            }
            C16994k k = C16994k.m16791k((String) str);
            if (this.identifierCase_ == 3) {
                this.identifier_ = k;
            }
            return k;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.identifierCase_ == 2) {
                i2 = 0 + C23872m0.computeStringSize(2, this.identifier_);
            }
            if (this.identifierCase_ == 3) {
                i2 += C23872m0.computeStringSize(3, this.identifier_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = this.memoizedHashCode;
            if (i3 != 0) {
                return i3;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            int i4 = this.identifierCase_;
            if (i4 != 2) {
                if (i4 == 3) {
                    i2 = ((hashCode * 37) + 3) * 53;
                    i = getPhLocalIdentifier().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }
            i2 = ((hashCode * 37) + 2) * 53;
            i = getFilePath().hashCode();
            hashCode = i2 + i;
            int hashCode22 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode22;
            return hashCode22;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$6900 = MJComposingS12.internal_static_MJComposingS12_Asset_fieldAccessorTable;
            access$6900.mo37875c(Asset.class, Builder.class);
            return access$6900;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new Asset();
        }

        public void writeTo(C23897n nVar) {
            if (this.identifierCase_ == 2) {
                C23872m0.writeString(nVar, 2, this.identifier_);
            }
            if (this.identifierCase_ == 3) {
                C23872m0.writeString(nVar, 3, this.identifier_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ Asset(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(Asset asset) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(asset);
        }

        public static Asset parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private Asset(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.identifierCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        public static Asset parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Asset) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static Asset parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public Asset getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static Asset parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Asset parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        private Asset() {
            this.identifierCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        public static Asset parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static Asset parseFrom(InputStream inputStream) {
            return (Asset) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        private Asset(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 18) {
                            String E = lVar.mo37756E();
                            this.identifierCase_ = 2;
                            this.identifier_ = E;
                        } else if (F == 26) {
                            String E2 = lVar.mo37756E();
                            this.identifierCase_ = 3;
                            this.identifier_ = E2;
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static Asset parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Asset) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static Asset parseFrom(C23856l lVar) {
            return (Asset) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static Asset parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (Asset) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface AssetOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        String getFilePath();

        C16994k getFilePathBytes();

        Asset.IdentifierCase getIdentifierCase();

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        String getPhLocalIdentifier();

        C16994k getPhLocalIdentifierBytes();

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    public static final class AudioClip extends C23872m0 implements AudioClipOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 1;
        private static final AudioClip DEFAULT_INSTANCE = new AudioClip();
        public static final int LOOPING_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final C24062w1<AudioClip> PARSER = new C23813c<AudioClip>() {
            public AudioClip parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new AudioClip(lVar, a0Var, (C241671) null);
            }
        };
        public static final int TIME_RANGE_FIELD_NUMBER = 2;
        public static final int VOLUME_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public Asset asset_;
        /* access modifiers changed from: private */
        public boolean looping_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public TimeRange timeRange_;
        /* access modifiers changed from: private */
        public float volume_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements AudioClipOrBuilder {
            private C23844i2<Asset, Asset.Builder, AssetOrBuilder> assetBuilder_;
            private Asset asset_;
            private boolean looping_;
            private C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> timeRangeBuilder_;
            private TimeRange timeRange_;
            private float volume_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            private C23844i2<Asset, Asset.Builder, AssetOrBuilder> getAssetFieldBuilder() {
                if (this.assetBuilder_ == null) {
                    this.assetBuilder_ = new C23844i2<>(getAsset(), getParentForChildren(), isClean());
                    this.asset_ = null;
                }
                return this.assetBuilder_;
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_AudioClip_descriptor;
            }

            private C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> getTimeRangeFieldBuilder() {
                if (this.timeRangeBuilder_ == null) {
                    this.timeRangeBuilder_ = new C23844i2<>(getTimeRange(), getParentForChildren(), isClean());
                    this.timeRange_ = null;
                }
                return this.timeRangeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearAsset() {
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                    onChanged();
                } else {
                    this.asset_ = null;
                    this.assetBuilder_ = null;
                }
                return this;
            }

            public Builder clearLooping() {
                this.looping_ = false;
                onChanged();
                return this;
            }

            public Builder clearTimeRange() {
                if (this.timeRangeBuilder_ == null) {
                    this.timeRange_ = null;
                    onChanged();
                } else {
                    this.timeRange_ = null;
                    this.timeRangeBuilder_ = null;
                }
                return this;
            }

            public Builder clearVolume() {
                this.volume_ = 0.0f;
                onChanged();
                return this;
            }

            public Asset getAsset() {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Asset asset = this.asset_;
                return asset == null ? Asset.getDefaultInstance() : asset;
            }

            public Asset.Builder getAssetBuilder() {
                onChanged();
                return getAssetFieldBuilder().mo37705d();
            }

            public AssetOrBuilder getAssetOrBuilder() {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Asset asset = this.asset_;
                return asset == null ? Asset.getDefaultInstance() : asset;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_AudioClip_descriptor;
            }

            public boolean getLooping() {
                return this.looping_;
            }

            public TimeRange getTimeRange() {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                TimeRange timeRange = this.timeRange_;
                return timeRange == null ? TimeRange.getDefaultInstance() : timeRange;
            }

            public TimeRange.Builder getTimeRangeBuilder() {
                onChanged();
                return getTimeRangeFieldBuilder().mo37705d();
            }

            public TimeRangeOrBuilder getTimeRangeOrBuilder() {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                TimeRange timeRange = this.timeRange_;
                return timeRange == null ? TimeRange.getDefaultInstance() : timeRange;
            }

            public float getVolume() {
                return this.volume_;
            }

            public boolean hasAsset() {
                return (this.assetBuilder_ == null && this.asset_ == null) ? false : true;
            }

            public boolean hasTimeRange() {
                return (this.timeRangeBuilder_ == null && this.timeRange_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$13300 = MJComposingS12.internal_static_MJComposingS12_AudioClip_fieldAccessorTable;
                access$13300.mo37875c(AudioClip.class, Builder.class);
                return access$13300;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAsset(Asset asset) {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    Asset asset2 = this.asset_;
                    if (asset2 != null) {
                        this.asset_ = Asset.newBuilder(asset2).mergeFrom(asset).buildPartial();
                    } else {
                        this.asset_ = asset;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(asset);
                }
                return this;
            }

            public Builder mergeTimeRange(TimeRange timeRange) {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var == null) {
                    TimeRange timeRange2 = this.timeRange_;
                    if (timeRange2 != null) {
                        this.timeRange_ = TimeRange.newBuilder(timeRange2).mergeFrom(timeRange).buildPartial();
                    } else {
                        this.timeRange_ = timeRange;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(timeRange);
                }
                return this;
            }

            public Builder setAsset(Asset asset) {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    asset.getClass();
                    this.asset_ = asset;
                    onChanged();
                } else {
                    i2Var.mo37710i(asset);
                }
                return this;
            }

            public Builder setLooping(boolean z) {
                this.looping_ = z;
                onChanged();
                return this;
            }

            public Builder setTimeRange(TimeRange timeRange) {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var == null) {
                    timeRange.getClass();
                    this.timeRange_ = timeRange;
                    onChanged();
                } else {
                    i2Var.mo37710i(timeRange);
                }
                return this;
            }

            public Builder setVolume(float f) {
                this.volume_ = f;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public AudioClip build() {
                AudioClip buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public AudioClip buildPartial() {
                AudioClip audioClip = new AudioClip((C23872m0.C23874b) this, (C241671) null);
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    Asset unused = audioClip.asset_ = this.asset_;
                } else {
                    Asset unused2 = audioClip.asset_ = i2Var.mo37703b();
                }
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var2 = this.timeRangeBuilder_;
                if (i2Var2 == null) {
                    TimeRange unused3 = audioClip.timeRange_ = this.timeRange_;
                } else {
                    TimeRange unused4 = audioClip.timeRange_ = i2Var2.mo37703b();
                }
                float unused5 = audioClip.volume_ = this.volume_;
                boolean unused6 = audioClip.looping_ = this.looping_;
                onBuilt();
                return audioClip;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public AudioClip getDefaultInstanceForType() {
                return AudioClip.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            public Builder clear() {
                super.clear();
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                } else {
                    this.asset_ = null;
                    this.assetBuilder_ = null;
                }
                if (this.timeRangeBuilder_ == null) {
                    this.timeRange_ = null;
                } else {
                    this.timeRange_ = null;
                    this.timeRangeBuilder_ = null;
                }
                this.volume_ = 0.0f;
                this.looping_ = false;
                return this;
            }

            public Builder setAsset(Asset.Builder builder) {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    this.asset_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setTimeRange(TimeRange.Builder builder) {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var == null) {
                    this.timeRange_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof AudioClip) {
                    return mergeFrom((AudioClip) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(AudioClip audioClip) {
                if (audioClip == AudioClip.getDefaultInstance()) {
                    return this;
                }
                if (audioClip.hasAsset()) {
                    mergeAsset(audioClip.getAsset());
                }
                if (audioClip.hasTimeRange()) {
                    mergeTimeRange(audioClip.getTimeRange());
                }
                if (audioClip.getVolume() != 0.0f) {
                    setVolume(audioClip.getVolume());
                }
                if (audioClip.getLooping()) {
                    setLooping(audioClip.getLooping());
                }
                mergeUnknownFields(audioClip.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.AudioClip.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.AudioClip.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$AudioClip r3 = (com.tencent.maas.composing.MJComposingS12.AudioClip) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.AudioClip) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$AudioClip r4 = (com.tencent.maas.composing.MJComposingS12.AudioClip) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.AudioClip) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.AudioClip.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$AudioClip$Builder");
            }
        }

        public /* synthetic */ AudioClip(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static AudioClip getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_AudioClip_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AudioClip parseDelimitedFrom(InputStream inputStream) {
            return (AudioClip) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AudioClip parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<AudioClip> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AudioClip)) {
                return super.equals(obj);
            }
            AudioClip audioClip = (AudioClip) obj;
            if (hasAsset() != audioClip.hasAsset()) {
                return false;
            }
            if ((!hasAsset() || getAsset().equals(audioClip.getAsset())) && hasTimeRange() == audioClip.hasTimeRange()) {
                return (!hasTimeRange() || getTimeRange().equals(audioClip.getTimeRange())) && Float.floatToIntBits(getVolume()) == Float.floatToIntBits(audioClip.getVolume()) && getLooping() == audioClip.getLooping() && this.unknownFields.equals(audioClip.unknownFields);
            }
            return false;
        }

        public Asset getAsset() {
            Asset asset = this.asset_;
            return asset == null ? Asset.getDefaultInstance() : asset;
        }

        public AssetOrBuilder getAssetOrBuilder() {
            return getAsset();
        }

        public boolean getLooping() {
            return this.looping_;
        }

        public C24062w1<AudioClip> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.asset_ != null) {
                i2 = 0 + C23897n.m29270o(1, getAsset());
            }
            if (this.timeRange_ != null) {
                i2 += C23897n.m29270o(2, getTimeRange());
            }
            float f = this.volume_;
            if (f != 0.0f) {
                i2 += C23897n.m29264i(3, f);
            }
            boolean z = this.looping_;
            if (z) {
                i2 += C23897n.m29257b(4, z);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public TimeRange getTimeRange() {
            TimeRange timeRange = this.timeRange_;
            return timeRange == null ? TimeRange.getDefaultInstance() : timeRange;
        }

        public TimeRangeOrBuilder getTimeRangeOrBuilder() {
            return getTimeRange();
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public float getVolume() {
            return this.volume_;
        }

        public boolean hasAsset() {
            return this.asset_ != null;
        }

        public boolean hasTimeRange() {
            return this.timeRange_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasAsset()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getAsset().hashCode();
            }
            if (hasTimeRange()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getTimeRange().hashCode();
            }
            int floatToIntBits = (((((((((hashCode * 37) + 3) * 53) + Float.floatToIntBits(getVolume())) * 37) + 4) * 53) + C23908o0.m29423a(getLooping())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = floatToIntBits;
            return floatToIntBits;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$13300 = MJComposingS12.internal_static_MJComposingS12_AudioClip_fieldAccessorTable;
            access$13300.mo37875c(AudioClip.class, Builder.class);
            return access$13300;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new AudioClip();
        }

        public void writeTo(C23897n nVar) {
            if (this.asset_ != null) {
                nVar.mo37909P(1, getAsset());
            }
            if (this.timeRange_ != null) {
                nVar.mo37909P(2, getTimeRange());
            }
            float f = this.volume_;
            if (f != 0.0f) {
                nVar.mo37906M(3, f);
            }
            boolean z = this.looping_;
            if (z) {
                nVar.mo37897D(4, z);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ AudioClip(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(AudioClip audioClip) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioClip);
        }

        public static AudioClip parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private AudioClip(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static AudioClip parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AudioClip) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static AudioClip parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public AudioClip getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static AudioClip parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AudioClip() {
            this.memoizedIsInitialized = -1;
        }

        public static AudioClip parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static AudioClip parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.maas.composing.MJComposingS12$Asset$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.tencent.maas.composing.MJComposingS12$TimeRange$Builder} */
        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: type inference failed for: r5v6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private AudioClip(com.google.protobuf.C23856l r7, com.google.protobuf.C23806a0 r8) {
            /*
                r6 = this;
                r6.<init>()
                r8.getClass()
                com.google.protobuf.s2$a r0 = com.google.protobuf.C24020s2.m29807b()
                r1 = 0
            L_0x000b:
                if (r1 != 0) goto L_0x0095
                int r2 = r7.mo37757F()     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                r3 = 1
                if (r2 == 0) goto L_0x007a
                r4 = 10
                r5 = 0
                if (r2 == r4) goto L_0x005a
                r4 = 18
                if (r2 == r4) goto L_0x003a
                r4 = 29
                if (r2 == r4) goto L_0x0033
                r4 = 32
                if (r2 == r4) goto L_0x002c
                boolean r2 = r6.parseUnknownField(r7, r0, r8, r2)     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                if (r2 != 0) goto L_0x000b
                goto L_0x007a
            L_0x002c:
                boolean r2 = r7.mo37767l()     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                r6.looping_ = r2     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                goto L_0x000b
            L_0x0033:
                float r2 = r7.mo37773r()     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                r6.volume_ = r2     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                goto L_0x000b
            L_0x003a:
                com.tencent.maas.composing.MJComposingS12$TimeRange r2 = r6.timeRange_     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                if (r2 == 0) goto L_0x0042
                com.tencent.maas.composing.MJComposingS12$TimeRange$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
            L_0x0042:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.TimeRange.parser()     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                com.tencent.maas.composing.MJComposingS12$TimeRange r2 = (com.tencent.maas.composing.MJComposingS12.TimeRange) r2     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                r6.timeRange_ = r2     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.TimeRange) r2)     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                com.tencent.maas.composing.MJComposingS12$TimeRange r2 = r5.buildPartial()     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                r6.timeRange_ = r2     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                goto L_0x000b
            L_0x005a:
                com.tencent.maas.composing.MJComposingS12$Asset r2 = r6.asset_     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                if (r2 == 0) goto L_0x0062
                com.tencent.maas.composing.MJComposingS12$Asset$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
            L_0x0062:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Asset.parser()     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                com.tencent.maas.composing.MJComposingS12$Asset r2 = (com.tencent.maas.composing.MJComposingS12.Asset) r2     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                r6.asset_ = r2     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Asset) r2)     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                com.tencent.maas.composing.MJComposingS12$Asset r2 = r5.buildPartial()     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                r6.asset_ = r2     // Catch:{ p0 -> 0x0087, IOException -> 0x007e }
                goto L_0x000b
            L_0x007a:
                r1 = 1
                goto L_0x000b
            L_0x007c:
                r7 = move-exception
                goto L_0x008b
            L_0x007e:
                r7 = move-exception
                com.google.protobuf.p0 r8 = new com.google.protobuf.p0     // Catch:{ all -> 0x007c }
                r8.<init>((java.io.IOException) r7)     // Catch:{ all -> 0x007c }
                r8.f68530d = r6     // Catch:{ all -> 0x007c }
                throw r8     // Catch:{ all -> 0x007c }
            L_0x0087:
                r7 = move-exception
                r7.f68530d = r6     // Catch:{ all -> 0x007c }
                throw r7     // Catch:{ all -> 0x007c }
            L_0x008b:
                com.google.protobuf.s2 r8 = r0.build()
                r6.unknownFields = r8
                r6.makeExtensionsImmutable()
                throw r7
            L_0x0095:
                com.google.protobuf.s2 r7 = r0.build()
                r6.unknownFields = r7
                r6.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.AudioClip.<init>(com.google.protobuf.l, com.google.protobuf.a0):void");
        }

        public static AudioClip parseFrom(InputStream inputStream) {
            return (AudioClip) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static AudioClip parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AudioClip) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static AudioClip parseFrom(C23856l lVar) {
            return (AudioClip) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static AudioClip parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (AudioClip) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface AudioClipOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        Asset getAsset();

        AssetOrBuilder getAssetOrBuilder();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        boolean getLooping();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        TimeRange getTimeRange();

        TimeRangeOrBuilder getTimeRangeOrBuilder();

        /* synthetic */ C24020s2 getUnknownFields();

        float getVolume();

        boolean hasAsset();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasTimeRange();

        /* synthetic */ boolean isInitialized();
    }

    public enum CanvasOriginType implements C23908o0.C23911c {
        CanvasOriginTypeTopLeft(0),
        CanvasOriginTypeBottomLeft(1),
        UNRECOGNIZED(-1);
        
        public static final int CanvasOriginTypeBottomLeft_VALUE = 1;
        public static final int CanvasOriginTypeTopLeft_VALUE = 0;
        private static final CanvasOriginType[] VALUES = null;
        private static final C23908o0.C23912d<CanvasOriginType> internalValueMap = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<CanvasOriginType>() {
                public CanvasOriginType findValueByNumber(int i) {
                    return CanvasOriginType.forNumber(i);
                }
            };
            VALUES = values();
        }

        private CanvasOriginType(int i) {
            this.value = i;
        }

        public static CanvasOriginType forNumber(int i) {
            if (i == 0) {
                return CanvasOriginTypeTopLeft;
            }
            if (i != 1) {
                return null;
            }
            return CanvasOriginTypeBottomLeft;
        }

        public static final C24025t.C24033e getDescriptor() {
            return MJComposingS12.getDescriptor().mo38346f().get(6);
        }

        public static C23908o0.C23912d<CanvasOriginType> internalGetValueMap() {
            return internalValueMap;
        }

        public final C24025t.C24033e getDescriptorForType() {
            return getDescriptor();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final C24025t.C24034f getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().mo38334h().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static CanvasOriginType valueOf(int i) {
            return forNumber(i);
        }

        public static CanvasOriginType valueOf(C24025t.C24034f fVar) {
            if (fVar.f69101h == getDescriptor()) {
                int i = fVar.f69097d;
                if (i == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[i];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class Clip extends C23872m0 implements ClipOrBuilder {
        public static final int AUDIO_CLIP_FIELD_NUMBER = 3;
        private static final Clip DEFAULT_INSTANCE = new Clip();
        public static final int IMAGE_CLIP_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final C24062w1<Clip> PARSER = new C23813c<Clip>() {
            public Clip parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new Clip(lVar, a0Var, (C241671) null);
            }
        };
        public static final int VIDEO_CLIP_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int clipCase_;
        /* access modifiers changed from: private */
        public Object clip_;
        private byte memoizedIsInitialized;

        public static final class Builder extends C23872m0.C23874b<Builder> implements ClipOrBuilder {
            private C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> audioClipBuilder_;
            private int clipCase_;
            private Object clip_;
            private C23844i2<ImageClip, ImageClip.Builder, ImageClipOrBuilder> imageClipBuilder_;
            private C23844i2<VideoClip, VideoClip.Builder, VideoClipOrBuilder> videoClipBuilder_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            private C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> getAudioClipFieldBuilder() {
                if (this.audioClipBuilder_ == null) {
                    if (this.clipCase_ != 3) {
                        this.clip_ = AudioClip.getDefaultInstance();
                    }
                    this.audioClipBuilder_ = new C23844i2<>((AudioClip) this.clip_, getParentForChildren(), isClean());
                    this.clip_ = null;
                }
                this.clipCase_ = 3;
                onChanged();
                return this.audioClipBuilder_;
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_Clip_descriptor;
            }

            private C23844i2<ImageClip, ImageClip.Builder, ImageClipOrBuilder> getImageClipFieldBuilder() {
                if (this.imageClipBuilder_ == null) {
                    if (this.clipCase_ != 1) {
                        this.clip_ = ImageClip.getDefaultInstance();
                    }
                    this.imageClipBuilder_ = new C23844i2<>((ImageClip) this.clip_, getParentForChildren(), isClean());
                    this.clip_ = null;
                }
                this.clipCase_ = 1;
                onChanged();
                return this.imageClipBuilder_;
            }

            private C23844i2<VideoClip, VideoClip.Builder, VideoClipOrBuilder> getVideoClipFieldBuilder() {
                if (this.videoClipBuilder_ == null) {
                    if (this.clipCase_ != 2) {
                        this.clip_ = VideoClip.getDefaultInstance();
                    }
                    this.videoClipBuilder_ = new C23844i2<>((VideoClip) this.clip_, getParentForChildren(), isClean());
                    this.clip_ = null;
                }
                this.clipCase_ = 2;
                onChanged();
                return this.videoClipBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearAudioClip() {
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var = this.audioClipBuilder_;
                if (i2Var != null) {
                    if (this.clipCase_ == 3) {
                        this.clipCase_ = 0;
                        this.clip_ = null;
                    }
                    i2Var.mo37704c();
                } else if (this.clipCase_ == 3) {
                    this.clipCase_ = 0;
                    this.clip_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearClip() {
                this.clipCase_ = 0;
                this.clip_ = null;
                onChanged();
                return this;
            }

            public Builder clearImageClip() {
                C23844i2<ImageClip, ImageClip.Builder, ImageClipOrBuilder> i2Var = this.imageClipBuilder_;
                if (i2Var != null) {
                    if (this.clipCase_ == 1) {
                        this.clipCase_ = 0;
                        this.clip_ = null;
                    }
                    i2Var.mo37704c();
                } else if (this.clipCase_ == 1) {
                    this.clipCase_ = 0;
                    this.clip_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearVideoClip() {
                C23844i2<VideoClip, VideoClip.Builder, VideoClipOrBuilder> i2Var = this.videoClipBuilder_;
                if (i2Var != null) {
                    if (this.clipCase_ == 2) {
                        this.clipCase_ = 0;
                        this.clip_ = null;
                    }
                    i2Var.mo37704c();
                } else if (this.clipCase_ == 2) {
                    this.clipCase_ = 0;
                    this.clip_ = null;
                    onChanged();
                }
                return this;
            }

            public AudioClip getAudioClip() {
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var = this.audioClipBuilder_;
                return i2Var == null ? this.clipCase_ == 3 ? (AudioClip) this.clip_ : AudioClip.getDefaultInstance() : this.clipCase_ == 3 ? i2Var.mo37706e() : AudioClip.getDefaultInstance();
            }

            public AudioClip.Builder getAudioClipBuilder() {
                return getAudioClipFieldBuilder().mo37705d();
            }

            public AudioClipOrBuilder getAudioClipOrBuilder() {
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var;
                int i = this.clipCase_;
                return (i != 3 || (i2Var = this.audioClipBuilder_) == null) ? i == 3 ? (AudioClip) this.clip_ : AudioClip.getDefaultInstance() : i2Var.mo37707f();
            }

            public ClipCase getClipCase() {
                return ClipCase.forNumber(this.clipCase_);
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_Clip_descriptor;
            }

            public ImageClip getImageClip() {
                C23844i2<ImageClip, ImageClip.Builder, ImageClipOrBuilder> i2Var = this.imageClipBuilder_;
                return i2Var == null ? this.clipCase_ == 1 ? (ImageClip) this.clip_ : ImageClip.getDefaultInstance() : this.clipCase_ == 1 ? i2Var.mo37706e() : ImageClip.getDefaultInstance();
            }

            public ImageClip.Builder getImageClipBuilder() {
                return getImageClipFieldBuilder().mo37705d();
            }

            public ImageClipOrBuilder getImageClipOrBuilder() {
                C23844i2<ImageClip, ImageClip.Builder, ImageClipOrBuilder> i2Var;
                int i = this.clipCase_;
                return (i != 1 || (i2Var = this.imageClipBuilder_) == null) ? i == 1 ? (ImageClip) this.clip_ : ImageClip.getDefaultInstance() : i2Var.mo37707f();
            }

            public VideoClip getVideoClip() {
                C23844i2<VideoClip, VideoClip.Builder, VideoClipOrBuilder> i2Var = this.videoClipBuilder_;
                return i2Var == null ? this.clipCase_ == 2 ? (VideoClip) this.clip_ : VideoClip.getDefaultInstance() : this.clipCase_ == 2 ? i2Var.mo37706e() : VideoClip.getDefaultInstance();
            }

            public VideoClip.Builder getVideoClipBuilder() {
                return getVideoClipFieldBuilder().mo37705d();
            }

            public VideoClipOrBuilder getVideoClipOrBuilder() {
                C23844i2<VideoClip, VideoClip.Builder, VideoClipOrBuilder> i2Var;
                int i = this.clipCase_;
                return (i != 2 || (i2Var = this.videoClipBuilder_) == null) ? i == 2 ? (VideoClip) this.clip_ : VideoClip.getDefaultInstance() : i2Var.mo37707f();
            }

            public boolean hasAudioClip() {
                return this.clipCase_ == 3;
            }

            public boolean hasImageClip() {
                return this.clipCase_ == 1;
            }

            public boolean hasVideoClip() {
                return this.clipCase_ == 2;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$14600 = MJComposingS12.internal_static_MJComposingS12_Clip_fieldAccessorTable;
                access$14600.mo37875c(Clip.class, Builder.class);
                return access$14600;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAudioClip(AudioClip audioClip) {
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var = this.audioClipBuilder_;
                if (i2Var == null) {
                    if (this.clipCase_ != 3 || this.clip_ == AudioClip.getDefaultInstance()) {
                        this.clip_ = audioClip;
                    } else {
                        this.clip_ = AudioClip.newBuilder((AudioClip) this.clip_).mergeFrom(audioClip).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.clipCase_ == 3) {
                        i2Var.mo37708g(audioClip);
                    }
                    this.audioClipBuilder_.mo37710i(audioClip);
                }
                this.clipCase_ = 3;
                return this;
            }

            public Builder mergeImageClip(ImageClip imageClip) {
                C23844i2<ImageClip, ImageClip.Builder, ImageClipOrBuilder> i2Var = this.imageClipBuilder_;
                if (i2Var == null) {
                    if (this.clipCase_ != 1 || this.clip_ == ImageClip.getDefaultInstance()) {
                        this.clip_ = imageClip;
                    } else {
                        this.clip_ = ImageClip.newBuilder((ImageClip) this.clip_).mergeFrom(imageClip).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.clipCase_ == 1) {
                        i2Var.mo37708g(imageClip);
                    }
                    this.imageClipBuilder_.mo37710i(imageClip);
                }
                this.clipCase_ = 1;
                return this;
            }

            public Builder mergeVideoClip(VideoClip videoClip) {
                C23844i2<VideoClip, VideoClip.Builder, VideoClipOrBuilder> i2Var = this.videoClipBuilder_;
                if (i2Var == null) {
                    if (this.clipCase_ != 2 || this.clip_ == VideoClip.getDefaultInstance()) {
                        this.clip_ = videoClip;
                    } else {
                        this.clip_ = VideoClip.newBuilder((VideoClip) this.clip_).mergeFrom(videoClip).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.clipCase_ == 2) {
                        i2Var.mo37708g(videoClip);
                    }
                    this.videoClipBuilder_.mo37710i(videoClip);
                }
                this.clipCase_ = 2;
                return this;
            }

            public Builder setAudioClip(AudioClip audioClip) {
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var = this.audioClipBuilder_;
                if (i2Var == null) {
                    audioClip.getClass();
                    this.clip_ = audioClip;
                    onChanged();
                } else {
                    i2Var.mo37710i(audioClip);
                }
                this.clipCase_ = 3;
                return this;
            }

            public Builder setImageClip(ImageClip imageClip) {
                C23844i2<ImageClip, ImageClip.Builder, ImageClipOrBuilder> i2Var = this.imageClipBuilder_;
                if (i2Var == null) {
                    imageClip.getClass();
                    this.clip_ = imageClip;
                    onChanged();
                } else {
                    i2Var.mo37710i(imageClip);
                }
                this.clipCase_ = 1;
                return this;
            }

            public Builder setVideoClip(VideoClip videoClip) {
                C23844i2<VideoClip, VideoClip.Builder, VideoClipOrBuilder> i2Var = this.videoClipBuilder_;
                if (i2Var == null) {
                    videoClip.getClass();
                    this.clip_ = videoClip;
                    onChanged();
                } else {
                    i2Var.mo37710i(videoClip);
                }
                this.clipCase_ = 2;
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                this.clipCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public Clip build() {
                Clip buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public Clip buildPartial() {
                Clip clip = new Clip((C23872m0.C23874b) this, (C241671) null);
                if (this.clipCase_ == 1) {
                    C23844i2<ImageClip, ImageClip.Builder, ImageClipOrBuilder> i2Var = this.imageClipBuilder_;
                    if (i2Var == null) {
                        Object unused = clip.clip_ = this.clip_;
                    } else {
                        Object unused2 = clip.clip_ = i2Var.mo37703b();
                    }
                }
                if (this.clipCase_ == 2) {
                    C23844i2<VideoClip, VideoClip.Builder, VideoClipOrBuilder> i2Var2 = this.videoClipBuilder_;
                    if (i2Var2 == null) {
                        Object unused3 = clip.clip_ = this.clip_;
                    } else {
                        Object unused4 = clip.clip_ = i2Var2.mo37703b();
                    }
                }
                if (this.clipCase_ == 3) {
                    C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var3 = this.audioClipBuilder_;
                    if (i2Var3 == null) {
                        Object unused5 = clip.clip_ = this.clip_;
                    } else {
                        Object unused6 = clip.clip_ = i2Var3.mo37703b();
                    }
                }
                int unused7 = clip.clipCase_ = this.clipCase_;
                onBuilt();
                return clip;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public Clip getDefaultInstanceForType() {
                return Clip.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.clipCase_ = 0;
                this.clip_ = null;
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.clipCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof Clip) {
                    return mergeFrom((Clip) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder setAudioClip(AudioClip.Builder builder) {
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var = this.audioClipBuilder_;
                if (i2Var == null) {
                    this.clip_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                this.clipCase_ = 3;
                return this;
            }

            public Builder setImageClip(ImageClip.Builder builder) {
                C23844i2<ImageClip, ImageClip.Builder, ImageClipOrBuilder> i2Var = this.imageClipBuilder_;
                if (i2Var == null) {
                    this.clip_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                this.clipCase_ = 1;
                return this;
            }

            public Builder setVideoClip(VideoClip.Builder builder) {
                C23844i2<VideoClip, VideoClip.Builder, VideoClipOrBuilder> i2Var = this.videoClipBuilder_;
                if (i2Var == null) {
                    this.clip_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                this.clipCase_ = 2;
                return this;
            }

            public Builder mergeFrom(Clip clip) {
                if (clip == Clip.getDefaultInstance()) {
                    return this;
                }
                int i = C241671.f69262x19093b03[clip.getClipCase().ordinal()];
                if (i == 1) {
                    mergeImageClip(clip.getImageClip());
                } else if (i == 2) {
                    mergeVideoClip(clip.getVideoClip());
                } else if (i == 3) {
                    mergeAudioClip(clip.getAudioClip());
                }
                mergeUnknownFields(clip.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.Clip.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.Clip.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$Clip r3 = (com.tencent.maas.composing.MJComposingS12.Clip) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Clip) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$Clip r4 = (com.tencent.maas.composing.MJComposingS12.Clip) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Clip) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.Clip.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$Clip$Builder");
            }
        }

        public enum ClipCase implements C23908o0.C23911c {
            IMAGE_CLIP(1),
            VIDEO_CLIP(2),
            AUDIO_CLIP(3),
            CLIP_NOT_SET(0);
            
            private final int value;

            private ClipCase(int i) {
                this.value = i;
            }

            public static ClipCase forNumber(int i) {
                if (i == 0) {
                    return CLIP_NOT_SET;
                }
                if (i == 1) {
                    return IMAGE_CLIP;
                }
                if (i == 2) {
                    return VIDEO_CLIP;
                }
                if (i != 3) {
                    return null;
                }
                return AUDIO_CLIP;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ClipCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public /* synthetic */ Clip(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static Clip getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_Clip_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Clip parseDelimitedFrom(InputStream inputStream) {
            return (Clip) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Clip parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<Clip> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Clip)) {
                return super.equals(obj);
            }
            Clip clip = (Clip) obj;
            if (!getClipCase().equals(clip.getClipCase())) {
                return false;
            }
            int i = this.clipCase_;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && !getAudioClip().equals(clip.getAudioClip())) {
                        return false;
                    }
                } else if (!getVideoClip().equals(clip.getVideoClip())) {
                    return false;
                }
            } else if (!getImageClip().equals(clip.getImageClip())) {
                return false;
            }
            return this.unknownFields.equals(clip.unknownFields);
        }

        public AudioClip getAudioClip() {
            return this.clipCase_ == 3 ? (AudioClip) this.clip_ : AudioClip.getDefaultInstance();
        }

        public AudioClipOrBuilder getAudioClipOrBuilder() {
            return this.clipCase_ == 3 ? (AudioClip) this.clip_ : AudioClip.getDefaultInstance();
        }

        public ClipCase getClipCase() {
            return ClipCase.forNumber(this.clipCase_);
        }

        public ImageClip getImageClip() {
            return this.clipCase_ == 1 ? (ImageClip) this.clip_ : ImageClip.getDefaultInstance();
        }

        public ImageClipOrBuilder getImageClipOrBuilder() {
            return this.clipCase_ == 1 ? (ImageClip) this.clip_ : ImageClip.getDefaultInstance();
        }

        public C24062w1<Clip> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.clipCase_ == 1) {
                i2 = 0 + C23897n.m29270o(1, (ImageClip) this.clip_);
            }
            if (this.clipCase_ == 2) {
                i2 += C23897n.m29270o(2, (VideoClip) this.clip_);
            }
            if (this.clipCase_ == 3) {
                i2 += C23897n.m29270o(3, (AudioClip) this.clip_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public VideoClip getVideoClip() {
            return this.clipCase_ == 2 ? (VideoClip) this.clip_ : VideoClip.getDefaultInstance();
        }

        public VideoClipOrBuilder getVideoClipOrBuilder() {
            return this.clipCase_ == 2 ? (VideoClip) this.clip_ : VideoClip.getDefaultInstance();
        }

        public boolean hasAudioClip() {
            return this.clipCase_ == 3;
        }

        public boolean hasImageClip() {
            return this.clipCase_ == 1;
        }

        public boolean hasVideoClip() {
            return this.clipCase_ == 2;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = this.memoizedHashCode;
            if (i3 != 0) {
                return i3;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            int i4 = this.clipCase_;
            if (i4 == 1) {
                i2 = ((hashCode * 37) + 1) * 53;
                i = getImageClip().hashCode();
            } else if (i4 != 2) {
                if (i4 == 3) {
                    i2 = ((hashCode * 37) + 3) * 53;
                    i = getAudioClip().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            } else {
                i2 = ((hashCode * 37) + 2) * 53;
                i = getVideoClip().hashCode();
            }
            hashCode = i2 + i;
            int hashCode22 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode22;
            return hashCode22;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$14600 = MJComposingS12.internal_static_MJComposingS12_Clip_fieldAccessorTable;
            access$14600.mo37875c(Clip.class, Builder.class);
            return access$14600;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new Clip();
        }

        public void writeTo(C23897n nVar) {
            if (this.clipCase_ == 1) {
                nVar.mo37909P(1, (ImageClip) this.clip_);
            }
            if (this.clipCase_ == 2) {
                nVar.mo37909P(2, (VideoClip) this.clip_);
            }
            if (this.clipCase_ == 3) {
                nVar.mo37909P(3, (AudioClip) this.clip_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ Clip(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(Clip clip) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(clip);
        }

        public static Clip parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private Clip(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.clipCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        public static Clip parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Clip) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static Clip parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public Clip getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static Clip parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Clip parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        private Clip() {
            this.clipCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        public static Clip parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static Clip parseFrom(InputStream inputStream) {
            return (Clip) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.maas.composing.MJComposingS12$ImageClip$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.tencent.maas.composing.MJComposingS12$VideoClip$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.tencent.maas.composing.MJComposingS12$AudioClip$Builder} */
        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v7 */
        /* JADX WARNING: type inference failed for: r5v8 */
        /* JADX WARNING: type inference failed for: r5v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private Clip(com.google.protobuf.C23856l r7, com.google.protobuf.C23806a0 r8) {
            /*
                r6 = this;
                r6.<init>()
                r8.getClass()
                com.google.protobuf.s2$a r0 = com.google.protobuf.C24020s2.m29807b()
                r1 = 0
            L_0x000b:
                if (r1 != 0) goto L_0x00ba
                int r2 = r7.mo37757F()     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r3 = 1
                if (r2 == 0) goto L_0x009e
                r4 = 10
                r5 = 0
                if (r2 == r4) goto L_0x0077
                r4 = 18
                if (r2 == r4) goto L_0x0050
                r4 = 26
                if (r2 == r4) goto L_0x0029
                boolean r2 = r6.parseUnknownField(r7, r0, r8, r2)     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                if (r2 != 0) goto L_0x000b
                goto L_0x009e
            L_0x0029:
                int r2 = r6.clipCase_     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r3 = 3
                if (r2 != r3) goto L_0x0036
                java.lang.Object r2 = r6.clip_     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.tencent.maas.composing.MJComposingS12$AudioClip r2 = (com.tencent.maas.composing.MJComposingS12.AudioClip) r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.tencent.maas.composing.MJComposingS12$AudioClip$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
            L_0x0036:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.AudioClip.parser()     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r6.clip_ = r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                if (r5 == 0) goto L_0x004d
                com.tencent.maas.composing.MJComposingS12$AudioClip r2 = (com.tencent.maas.composing.MJComposingS12.AudioClip) r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.AudioClip) r2)     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.tencent.maas.composing.MJComposingS12$AudioClip r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r6.clip_ = r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
            L_0x004d:
                r6.clipCase_ = r3     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                goto L_0x000b
            L_0x0050:
                int r2 = r6.clipCase_     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r3 = 2
                if (r2 != r3) goto L_0x005d
                java.lang.Object r2 = r6.clip_     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.tencent.maas.composing.MJComposingS12$VideoClip r2 = (com.tencent.maas.composing.MJComposingS12.VideoClip) r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.tencent.maas.composing.MJComposingS12$VideoClip$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
            L_0x005d:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.VideoClip.parser()     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r6.clip_ = r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                if (r5 == 0) goto L_0x0074
                com.tencent.maas.composing.MJComposingS12$VideoClip r2 = (com.tencent.maas.composing.MJComposingS12.VideoClip) r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.VideoClip) r2)     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.tencent.maas.composing.MJComposingS12$VideoClip r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r6.clip_ = r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
            L_0x0074:
                r6.clipCase_ = r3     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                goto L_0x000b
            L_0x0077:
                int r2 = r6.clipCase_     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                if (r2 != r3) goto L_0x0083
                java.lang.Object r2 = r6.clip_     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.tencent.maas.composing.MJComposingS12$ImageClip r2 = (com.tencent.maas.composing.MJComposingS12.ImageClip) r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.tencent.maas.composing.MJComposingS12$ImageClip$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
            L_0x0083:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.ImageClip.parser()     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r6.clip_ = r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                if (r5 == 0) goto L_0x009a
                com.tencent.maas.composing.MJComposingS12$ImageClip r2 = (com.tencent.maas.composing.MJComposingS12.ImageClip) r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.ImageClip) r2)     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                com.tencent.maas.composing.MJComposingS12$ImageClip r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                r6.clip_ = r2     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
            L_0x009a:
                r6.clipCase_ = r3     // Catch:{ p0 -> 0x00ac, IOException -> 0x00a3 }
                goto L_0x000b
            L_0x009e:
                r1 = 1
                goto L_0x000b
            L_0x00a1:
                r7 = move-exception
                goto L_0x00b0
            L_0x00a3:
                r7 = move-exception
                com.google.protobuf.p0 r8 = new com.google.protobuf.p0     // Catch:{ all -> 0x00a1 }
                r8.<init>((java.io.IOException) r7)     // Catch:{ all -> 0x00a1 }
                r8.f68530d = r6     // Catch:{ all -> 0x00a1 }
                throw r8     // Catch:{ all -> 0x00a1 }
            L_0x00ac:
                r7 = move-exception
                r7.f68530d = r6     // Catch:{ all -> 0x00a1 }
                throw r7     // Catch:{ all -> 0x00a1 }
            L_0x00b0:
                com.google.protobuf.s2 r8 = r0.build()
                r6.unknownFields = r8
                r6.makeExtensionsImmutable()
                throw r7
            L_0x00ba:
                com.google.protobuf.s2 r7 = r0.build()
                r6.unknownFields = r7
                r6.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.Clip.<init>(com.google.protobuf.l, com.google.protobuf.a0):void");
        }

        public static Clip parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Clip) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static Clip parseFrom(C23856l lVar) {
            return (Clip) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static Clip parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (Clip) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface ClipOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        AudioClip getAudioClip();

        AudioClipOrBuilder getAudioClipOrBuilder();

        Clip.ClipCase getClipCase();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        ImageClip getImageClip();

        ImageClipOrBuilder getImageClipOrBuilder();

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        /* synthetic */ C24020s2 getUnknownFields();

        VideoClip getVideoClip();

        VideoClipOrBuilder getVideoClipOrBuilder();

        boolean hasAudioClip();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        boolean hasImageClip();

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasVideoClip();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Color extends C23872m0 implements ColorOrBuilder {
        private static final Color DEFAULT_INSTANCE = new Color();
        /* access modifiers changed from: private */
        public static final C24062w1<Color> PARSER = new C23813c<Color>() {
            public Color parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new Color(lVar, a0Var, (C241671) null);
            }
        };
        public static final int RGBA_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public Vec4 rgba_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements ColorOrBuilder {
            private C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> rgbaBuilder_;
            private Vec4 rgba_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_Color_descriptor;
            }

            private C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> getRgbaFieldBuilder() {
                if (this.rgbaBuilder_ == null) {
                    this.rgbaBuilder_ = new C23844i2<>(getRgba(), getParentForChildren(), isClean());
                    this.rgba_ = null;
                }
                return this.rgbaBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearRgba() {
                if (this.rgbaBuilder_ == null) {
                    this.rgba_ = null;
                    onChanged();
                } else {
                    this.rgba_ = null;
                    this.rgbaBuilder_ = null;
                }
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_Color_descriptor;
            }

            public Vec4 getRgba() {
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var = this.rgbaBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Vec4 vec4 = this.rgba_;
                return vec4 == null ? Vec4.getDefaultInstance() : vec4;
            }

            public Vec4.Builder getRgbaBuilder() {
                onChanged();
                return getRgbaFieldBuilder().mo37705d();
            }

            public Vec4OrBuilder getRgbaOrBuilder() {
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var = this.rgbaBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Vec4 vec4 = this.rgba_;
                return vec4 == null ? Vec4.getDefaultInstance() : vec4;
            }

            public boolean hasRgba() {
                return (this.rgbaBuilder_ == null && this.rgba_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$3600 = MJComposingS12.internal_static_MJComposingS12_Color_fieldAccessorTable;
                access$3600.mo37875c(Color.class, Builder.class);
                return access$3600;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeRgba(Vec4 vec4) {
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var = this.rgbaBuilder_;
                if (i2Var == null) {
                    Vec4 vec42 = this.rgba_;
                    if (vec42 != null) {
                        this.rgba_ = Vec4.newBuilder(vec42).mergeFrom(vec4).buildPartial();
                    } else {
                        this.rgba_ = vec4;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(vec4);
                }
                return this;
            }

            public Builder setRgba(Vec4 vec4) {
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var = this.rgbaBuilder_;
                if (i2Var == null) {
                    vec4.getClass();
                    this.rgba_ = vec4;
                    onChanged();
                } else {
                    i2Var.mo37710i(vec4);
                }
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public Color build() {
                Color buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public Color buildPartial() {
                Color color = new Color((C23872m0.C23874b) this, (C241671) null);
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var = this.rgbaBuilder_;
                if (i2Var == null) {
                    Vec4 unused = color.rgba_ = this.rgba_;
                } else {
                    Vec4 unused2 = color.rgba_ = i2Var.mo37703b();
                }
                onBuilt();
                return color;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public Color getDefaultInstanceForType() {
                return Color.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            public Builder clear() {
                super.clear();
                if (this.rgbaBuilder_ == null) {
                    this.rgba_ = null;
                } else {
                    this.rgba_ = null;
                    this.rgbaBuilder_ = null;
                }
                return this;
            }

            public Builder setRgba(Vec4.Builder builder) {
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var = this.rgbaBuilder_;
                if (i2Var == null) {
                    this.rgba_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof Color) {
                    return mergeFrom((Color) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(Color color) {
                if (color == Color.getDefaultInstance()) {
                    return this;
                }
                if (color.hasRgba()) {
                    mergeRgba(color.getRgba());
                }
                mergeUnknownFields(color.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.Color.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.Color.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$Color r3 = (com.tencent.maas.composing.MJComposingS12.Color) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Color) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$Color r4 = (com.tencent.maas.composing.MJComposingS12.Color) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Color) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.Color.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$Color$Builder");
            }
        }

        public /* synthetic */ Color(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static Color getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_Color_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Color parseDelimitedFrom(InputStream inputStream) {
            return (Color) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Color parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<Color> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Color)) {
                return super.equals(obj);
            }
            Color color = (Color) obj;
            if (hasRgba() != color.hasRgba()) {
                return false;
            }
            return (!hasRgba() || getRgba().equals(color.getRgba())) && this.unknownFields.equals(color.unknownFields);
        }

        public C24062w1<Color> getParserForType() {
            return PARSER;
        }

        public Vec4 getRgba() {
            Vec4 vec4 = this.rgba_;
            return vec4 == null ? Vec4.getDefaultInstance() : vec4;
        }

        public Vec4OrBuilder getRgbaOrBuilder() {
            return getRgba();
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.rgba_ != null) {
                i2 = 0 + C23897n.m29270o(1, getRgba());
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasRgba() {
            return this.rgba_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasRgba()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getRgba().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$3600 = MJComposingS12.internal_static_MJComposingS12_Color_fieldAccessorTable;
            access$3600.mo37875c(Color.class, Builder.class);
            return access$3600;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new Color();
        }

        public void writeTo(C23897n nVar) {
            if (this.rgba_ != null) {
                nVar.mo37909P(1, getRgba());
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ Color(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(Color color) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(color);
        }

        public static Color parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private Color(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static Color parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Color) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static Color parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public Color getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static Color parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Color() {
            this.memoizedIsInitialized = -1;
        }

        public static Color parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static Color parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        private Color(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 10) {
                            Vec4.Builder builder = null;
                            Vec4 vec4 = this.rgba_;
                            builder = vec4 != null ? vec4.toBuilder() : builder;
                            Vec4 vec42 = (Vec4) lVar.mo37777v(Vec4.parser(), a0Var);
                            this.rgba_ = vec42;
                            if (builder != null) {
                                builder.mergeFrom(vec42);
                                this.rgba_ = builder.buildPartial();
                            }
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static Color parseFrom(InputStream inputStream) {
            return (Color) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static Color parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Color) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static Color parseFrom(C23856l lVar) {
            return (Color) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static Color parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (Color) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface ColorOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        Vec4 getRgba();

        Vec4OrBuilder getRgbaOrBuilder();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasRgba();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ComposingDesc extends C23872m0 implements ComposingDescOrBuilder {
        public static final int BGM_CLIP_FIELD_NUMBER = 3;
        public static final int COORDINATING_DESC_FIELD_NUMBER = 1;
        private static final ComposingDesc DEFAULT_INSTANCE = new ComposingDesc();
        public static final int LYRIC_OVERLAY_DESC_FIELD_NUMBER = 4;
        public static final int MAIN_CLIPS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final C24062w1<ComposingDesc> PARSER = new C23813c<ComposingDesc>() {
            public ComposingDesc parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new ComposingDesc(lVar, a0Var, (C241671) null);
            }
        };
        public static final int STICKER_OVERLAY_DESCS_FIELD_NUMBER = 5;
        public static final int TEXT_OVERLAY_DESCS_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public AudioClip bgmClip_;
        /* access modifiers changed from: private */
        public CoordinatingDesc coordinatingDesc_;
        /* access modifiers changed from: private */
        public LyricOverlayDesc lyricOverlayDesc_;
        /* access modifiers changed from: private */
        public List<Clip> mainClips_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public List<StickerOverlayDesc> stickerOverlayDescs_;
        /* access modifiers changed from: private */
        public List<TextOverlayDesc> textOverlayDescs_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements ComposingDescOrBuilder {
            private C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> bgmClipBuilder_;
            private AudioClip bgmClip_;
            private int bitField0_;
            private C23844i2<CoordinatingDesc, CoordinatingDesc.Builder, CoordinatingDescOrBuilder> coordinatingDescBuilder_;
            private CoordinatingDesc coordinatingDesc_;
            private C23844i2<LyricOverlayDesc, LyricOverlayDesc.Builder, LyricOverlayDescOrBuilder> lyricOverlayDescBuilder_;
            private LyricOverlayDesc lyricOverlayDesc_;
            private C23821e2<Clip, Clip.Builder, ClipOrBuilder> mainClipsBuilder_;
            private List<Clip> mainClips_;
            private C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> stickerOverlayDescsBuilder_;
            private List<StickerOverlayDesc> stickerOverlayDescs_;
            private C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> textOverlayDescsBuilder_;
            private List<TextOverlayDesc> textOverlayDescs_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            private void ensureMainClipsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mainClips_ = new ArrayList(this.mainClips_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureStickerOverlayDescsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.stickerOverlayDescs_ = new ArrayList(this.stickerOverlayDescs_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureTextOverlayDescsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.textOverlayDescs_ = new ArrayList(this.textOverlayDescs_);
                    this.bitField0_ |= 4;
                }
            }

            private C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> getBgmClipFieldBuilder() {
                if (this.bgmClipBuilder_ == null) {
                    this.bgmClipBuilder_ = new C23844i2<>(getBgmClip(), getParentForChildren(), isClean());
                    this.bgmClip_ = null;
                }
                return this.bgmClipBuilder_;
            }

            private C23844i2<CoordinatingDesc, CoordinatingDesc.Builder, CoordinatingDescOrBuilder> getCoordinatingDescFieldBuilder() {
                if (this.coordinatingDescBuilder_ == null) {
                    this.coordinatingDescBuilder_ = new C23844i2<>(getCoordinatingDesc(), getParentForChildren(), isClean());
                    this.coordinatingDesc_ = null;
                }
                return this.coordinatingDescBuilder_;
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_ComposingDesc_descriptor;
            }

            private C23844i2<LyricOverlayDesc, LyricOverlayDesc.Builder, LyricOverlayDescOrBuilder> getLyricOverlayDescFieldBuilder() {
                if (this.lyricOverlayDescBuilder_ == null) {
                    this.lyricOverlayDescBuilder_ = new C23844i2<>(getLyricOverlayDesc(), getParentForChildren(), isClean());
                    this.lyricOverlayDesc_ = null;
                }
                return this.lyricOverlayDescBuilder_;
            }

            private C23821e2<Clip, Clip.Builder, ClipOrBuilder> getMainClipsFieldBuilder() {
                if (this.mainClipsBuilder_ == null) {
                    List<Clip> list = this.mainClips_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.mainClipsBuilder_ = new C23821e2<>(list, z, getParentForChildren(), isClean());
                    this.mainClips_ = null;
                }
                return this.mainClipsBuilder_;
            }

            private C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> getStickerOverlayDescsFieldBuilder() {
                if (this.stickerOverlayDescsBuilder_ == null) {
                    this.stickerOverlayDescsBuilder_ = new C23821e2<>(this.stickerOverlayDescs_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.stickerOverlayDescs_ = null;
                }
                return this.stickerOverlayDescsBuilder_;
            }

            private C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> getTextOverlayDescsFieldBuilder() {
                if (this.textOverlayDescsBuilder_ == null) {
                    this.textOverlayDescsBuilder_ = new C23821e2<>(this.textOverlayDescs_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.textOverlayDescs_ = null;
                }
                return this.textOverlayDescsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (C23872m0.alwaysUseFieldBuilders) {
                    getMainClipsFieldBuilder();
                    getStickerOverlayDescsFieldBuilder();
                    getTextOverlayDescsFieldBuilder();
                }
            }

            public Builder addAllMainClips(Iterable<? extends Clip> iterable) {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                if (e2Var == null) {
                    ensureMainClipsIsMutable();
                    C23810b.C23811a.addAll(iterable, this.mainClips_);
                    onChanged();
                } else {
                    e2Var.mo37578b(iterable);
                }
                return this;
            }

            public Builder addAllStickerOverlayDescs(Iterable<? extends StickerOverlayDesc> iterable) {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                if (e2Var == null) {
                    ensureStickerOverlayDescsIsMutable();
                    C23810b.C23811a.addAll(iterable, this.stickerOverlayDescs_);
                    onChanged();
                } else {
                    e2Var.mo37578b(iterable);
                }
                return this;
            }

            public Builder addAllTextOverlayDescs(Iterable<? extends TextOverlayDesc> iterable) {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                if (e2Var == null) {
                    ensureTextOverlayDescsIsMutable();
                    C23810b.C23811a.addAll(iterable, this.textOverlayDescs_);
                    onChanged();
                } else {
                    e2Var.mo37578b(iterable);
                }
                return this;
            }

            public Builder addMainClips(Clip clip) {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                if (e2Var == null) {
                    clip.getClass();
                    ensureMainClipsIsMutable();
                    this.mainClips_.add(clip);
                    onChanged();
                } else {
                    e2Var.mo37582f(clip);
                }
                return this;
            }

            public Clip.Builder addMainClipsBuilder() {
                return getMainClipsFieldBuilder().mo37580d(Clip.getDefaultInstance());
            }

            public Builder addStickerOverlayDescs(StickerOverlayDesc stickerOverlayDesc) {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                if (e2Var == null) {
                    stickerOverlayDesc.getClass();
                    ensureStickerOverlayDescsIsMutable();
                    this.stickerOverlayDescs_.add(stickerOverlayDesc);
                    onChanged();
                } else {
                    e2Var.mo37582f(stickerOverlayDesc);
                }
                return this;
            }

            public StickerOverlayDesc.Builder addStickerOverlayDescsBuilder() {
                return getStickerOverlayDescsFieldBuilder().mo37580d(StickerOverlayDesc.getDefaultInstance());
            }

            public Builder addTextOverlayDescs(TextOverlayDesc textOverlayDesc) {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                if (e2Var == null) {
                    textOverlayDesc.getClass();
                    ensureTextOverlayDescsIsMutable();
                    this.textOverlayDescs_.add(textOverlayDesc);
                    onChanged();
                } else {
                    e2Var.mo37582f(textOverlayDesc);
                }
                return this;
            }

            public TextOverlayDesc.Builder addTextOverlayDescsBuilder() {
                return getTextOverlayDescsFieldBuilder().mo37580d(TextOverlayDesc.getDefaultInstance());
            }

            public Builder clearBgmClip() {
                if (this.bgmClipBuilder_ == null) {
                    this.bgmClip_ = null;
                    onChanged();
                } else {
                    this.bgmClip_ = null;
                    this.bgmClipBuilder_ = null;
                }
                return this;
            }

            public Builder clearCoordinatingDesc() {
                if (this.coordinatingDescBuilder_ == null) {
                    this.coordinatingDesc_ = null;
                    onChanged();
                } else {
                    this.coordinatingDesc_ = null;
                    this.coordinatingDescBuilder_ = null;
                }
                return this;
            }

            public Builder clearLyricOverlayDesc() {
                if (this.lyricOverlayDescBuilder_ == null) {
                    this.lyricOverlayDesc_ = null;
                    onChanged();
                } else {
                    this.lyricOverlayDesc_ = null;
                    this.lyricOverlayDescBuilder_ = null;
                }
                return this;
            }

            public Builder clearMainClips() {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                if (e2Var == null) {
                    this.mainClips_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    e2Var.mo37584h();
                }
                return this;
            }

            public Builder clearStickerOverlayDescs() {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                if (e2Var == null) {
                    this.stickerOverlayDescs_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    e2Var.mo37584h();
                }
                return this;
            }

            public Builder clearTextOverlayDescs() {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                if (e2Var == null) {
                    this.textOverlayDescs_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    e2Var.mo37584h();
                }
                return this;
            }

            public AudioClip getBgmClip() {
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var = this.bgmClipBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                AudioClip audioClip = this.bgmClip_;
                return audioClip == null ? AudioClip.getDefaultInstance() : audioClip;
            }

            public AudioClip.Builder getBgmClipBuilder() {
                onChanged();
                return getBgmClipFieldBuilder().mo37705d();
            }

            public AudioClipOrBuilder getBgmClipOrBuilder() {
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var = this.bgmClipBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                AudioClip audioClip = this.bgmClip_;
                return audioClip == null ? AudioClip.getDefaultInstance() : audioClip;
            }

            public CoordinatingDesc getCoordinatingDesc() {
                C23844i2<CoordinatingDesc, CoordinatingDesc.Builder, CoordinatingDescOrBuilder> i2Var = this.coordinatingDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                CoordinatingDesc coordinatingDesc = this.coordinatingDesc_;
                return coordinatingDesc == null ? CoordinatingDesc.getDefaultInstance() : coordinatingDesc;
            }

            public CoordinatingDesc.Builder getCoordinatingDescBuilder() {
                onChanged();
                return getCoordinatingDescFieldBuilder().mo37705d();
            }

            public CoordinatingDescOrBuilder getCoordinatingDescOrBuilder() {
                C23844i2<CoordinatingDesc, CoordinatingDesc.Builder, CoordinatingDescOrBuilder> i2Var = this.coordinatingDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                CoordinatingDesc coordinatingDesc = this.coordinatingDesc_;
                return coordinatingDesc == null ? CoordinatingDesc.getDefaultInstance() : coordinatingDesc;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_ComposingDesc_descriptor;
            }

            public LyricOverlayDesc getLyricOverlayDesc() {
                C23844i2<LyricOverlayDesc, LyricOverlayDesc.Builder, LyricOverlayDescOrBuilder> i2Var = this.lyricOverlayDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                LyricOverlayDesc lyricOverlayDesc = this.lyricOverlayDesc_;
                return lyricOverlayDesc == null ? LyricOverlayDesc.getDefaultInstance() : lyricOverlayDesc;
            }

            public LyricOverlayDesc.Builder getLyricOverlayDescBuilder() {
                onChanged();
                return getLyricOverlayDescFieldBuilder().mo37705d();
            }

            public LyricOverlayDescOrBuilder getLyricOverlayDescOrBuilder() {
                C23844i2<LyricOverlayDesc, LyricOverlayDesc.Builder, LyricOverlayDescOrBuilder> i2Var = this.lyricOverlayDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                LyricOverlayDesc lyricOverlayDesc = this.lyricOverlayDesc_;
                return lyricOverlayDesc == null ? LyricOverlayDesc.getDefaultInstance() : lyricOverlayDesc;
            }

            public Clip getMainClips(int i) {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                return e2Var == null ? this.mainClips_.get(i) : e2Var.mo37590n(i, false);
            }

            public Clip.Builder getMainClipsBuilder(int i) {
                return getMainClipsFieldBuilder().mo37587k(i);
            }

            public List<Clip.Builder> getMainClipsBuilderList() {
                return getMainClipsFieldBuilder().mo37588l();
            }

            public int getMainClipsCount() {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                return e2Var == null ? this.mainClips_.size() : e2Var.mo37589m();
            }

            public List<Clip> getMainClipsList() {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                return e2Var == null ? Collections.unmodifiableList(this.mainClips_) : e2Var.mo37591o();
            }

            public ClipOrBuilder getMainClipsOrBuilder(int i) {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                return e2Var == null ? this.mainClips_.get(i) : e2Var.mo37592p(i);
            }

            public List<? extends ClipOrBuilder> getMainClipsOrBuilderList() {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                return e2Var != null ? e2Var.mo37593q() : Collections.unmodifiableList(this.mainClips_);
            }

            public StickerOverlayDesc getStickerOverlayDescs(int i) {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                return e2Var == null ? this.stickerOverlayDescs_.get(i) : e2Var.mo37590n(i, false);
            }

            public StickerOverlayDesc.Builder getStickerOverlayDescsBuilder(int i) {
                return getStickerOverlayDescsFieldBuilder().mo37587k(i);
            }

            public List<StickerOverlayDesc.Builder> getStickerOverlayDescsBuilderList() {
                return getStickerOverlayDescsFieldBuilder().mo37588l();
            }

            public int getStickerOverlayDescsCount() {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                return e2Var == null ? this.stickerOverlayDescs_.size() : e2Var.mo37589m();
            }

            public List<StickerOverlayDesc> getStickerOverlayDescsList() {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                return e2Var == null ? Collections.unmodifiableList(this.stickerOverlayDescs_) : e2Var.mo37591o();
            }

            public StickerOverlayDescOrBuilder getStickerOverlayDescsOrBuilder(int i) {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                return e2Var == null ? this.stickerOverlayDescs_.get(i) : e2Var.mo37592p(i);
            }

            public List<? extends StickerOverlayDescOrBuilder> getStickerOverlayDescsOrBuilderList() {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                return e2Var != null ? e2Var.mo37593q() : Collections.unmodifiableList(this.stickerOverlayDescs_);
            }

            public TextOverlayDesc getTextOverlayDescs(int i) {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                return e2Var == null ? this.textOverlayDescs_.get(i) : e2Var.mo37590n(i, false);
            }

            public TextOverlayDesc.Builder getTextOverlayDescsBuilder(int i) {
                return getTextOverlayDescsFieldBuilder().mo37587k(i);
            }

            public List<TextOverlayDesc.Builder> getTextOverlayDescsBuilderList() {
                return getTextOverlayDescsFieldBuilder().mo37588l();
            }

            public int getTextOverlayDescsCount() {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                return e2Var == null ? this.textOverlayDescs_.size() : e2Var.mo37589m();
            }

            public List<TextOverlayDesc> getTextOverlayDescsList() {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                return e2Var == null ? Collections.unmodifiableList(this.textOverlayDescs_) : e2Var.mo37591o();
            }

            public TextOverlayDescOrBuilder getTextOverlayDescsOrBuilder(int i) {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                return e2Var == null ? this.textOverlayDescs_.get(i) : e2Var.mo37592p(i);
            }

            public List<? extends TextOverlayDescOrBuilder> getTextOverlayDescsOrBuilderList() {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                return e2Var != null ? e2Var.mo37593q() : Collections.unmodifiableList(this.textOverlayDescs_);
            }

            public boolean hasBgmClip() {
                return (this.bgmClipBuilder_ == null && this.bgmClip_ == null) ? false : true;
            }

            public boolean hasCoordinatingDesc() {
                return (this.coordinatingDescBuilder_ == null && this.coordinatingDesc_ == null) ? false : true;
            }

            public boolean hasLyricOverlayDesc() {
                return (this.lyricOverlayDescBuilder_ == null && this.lyricOverlayDesc_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$26100 = MJComposingS12.internal_static_MJComposingS12_ComposingDesc_fieldAccessorTable;
                access$26100.mo37875c(ComposingDesc.class, Builder.class);
                return access$26100;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBgmClip(AudioClip audioClip) {
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var = this.bgmClipBuilder_;
                if (i2Var == null) {
                    AudioClip audioClip2 = this.bgmClip_;
                    if (audioClip2 != null) {
                        this.bgmClip_ = AudioClip.newBuilder(audioClip2).mergeFrom(audioClip).buildPartial();
                    } else {
                        this.bgmClip_ = audioClip;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(audioClip);
                }
                return this;
            }

            public Builder mergeCoordinatingDesc(CoordinatingDesc coordinatingDesc) {
                C23844i2<CoordinatingDesc, CoordinatingDesc.Builder, CoordinatingDescOrBuilder> i2Var = this.coordinatingDescBuilder_;
                if (i2Var == null) {
                    CoordinatingDesc coordinatingDesc2 = this.coordinatingDesc_;
                    if (coordinatingDesc2 != null) {
                        this.coordinatingDesc_ = CoordinatingDesc.newBuilder(coordinatingDesc2).mergeFrom(coordinatingDesc).buildPartial();
                    } else {
                        this.coordinatingDesc_ = coordinatingDesc;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(coordinatingDesc);
                }
                return this;
            }

            public Builder mergeLyricOverlayDesc(LyricOverlayDesc lyricOverlayDesc) {
                C23844i2<LyricOverlayDesc, LyricOverlayDesc.Builder, LyricOverlayDescOrBuilder> i2Var = this.lyricOverlayDescBuilder_;
                if (i2Var == null) {
                    LyricOverlayDesc lyricOverlayDesc2 = this.lyricOverlayDesc_;
                    if (lyricOverlayDesc2 != null) {
                        this.lyricOverlayDesc_ = LyricOverlayDesc.newBuilder(lyricOverlayDesc2).mergeFrom(lyricOverlayDesc).buildPartial();
                    } else {
                        this.lyricOverlayDesc_ = lyricOverlayDesc;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(lyricOverlayDesc);
                }
                return this;
            }

            public Builder removeMainClips(int i) {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                if (e2Var == null) {
                    ensureMainClipsIsMutable();
                    this.mainClips_.remove(i);
                    onChanged();
                } else {
                    e2Var.mo37597u(i);
                }
                return this;
            }

            public Builder removeStickerOverlayDescs(int i) {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                if (e2Var == null) {
                    ensureStickerOverlayDescsIsMutable();
                    this.stickerOverlayDescs_.remove(i);
                    onChanged();
                } else {
                    e2Var.mo37597u(i);
                }
                return this;
            }

            public Builder removeTextOverlayDescs(int i) {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                if (e2Var == null) {
                    ensureTextOverlayDescsIsMutable();
                    this.textOverlayDescs_.remove(i);
                    onChanged();
                } else {
                    e2Var.mo37597u(i);
                }
                return this;
            }

            public Builder setBgmClip(AudioClip audioClip) {
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var = this.bgmClipBuilder_;
                if (i2Var == null) {
                    audioClip.getClass();
                    this.bgmClip_ = audioClip;
                    onChanged();
                } else {
                    i2Var.mo37710i(audioClip);
                }
                return this;
            }

            public Builder setCoordinatingDesc(CoordinatingDesc coordinatingDesc) {
                C23844i2<CoordinatingDesc, CoordinatingDesc.Builder, CoordinatingDescOrBuilder> i2Var = this.coordinatingDescBuilder_;
                if (i2Var == null) {
                    coordinatingDesc.getClass();
                    this.coordinatingDesc_ = coordinatingDesc;
                    onChanged();
                } else {
                    i2Var.mo37710i(coordinatingDesc);
                }
                return this;
            }

            public Builder setLyricOverlayDesc(LyricOverlayDesc lyricOverlayDesc) {
                C23844i2<LyricOverlayDesc, LyricOverlayDesc.Builder, LyricOverlayDescOrBuilder> i2Var = this.lyricOverlayDescBuilder_;
                if (i2Var == null) {
                    lyricOverlayDesc.getClass();
                    this.lyricOverlayDesc_ = lyricOverlayDesc;
                    onChanged();
                } else {
                    i2Var.mo37710i(lyricOverlayDesc);
                }
                return this;
            }

            public Builder setMainClips(int i, Clip clip) {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                if (e2Var == null) {
                    clip.getClass();
                    ensureMainClipsIsMutable();
                    this.mainClips_.set(i, clip);
                    onChanged();
                } else {
                    e2Var.mo37598v(i, clip);
                }
                return this;
            }

            public Builder setStickerOverlayDescs(int i, StickerOverlayDesc stickerOverlayDesc) {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                if (e2Var == null) {
                    stickerOverlayDesc.getClass();
                    ensureStickerOverlayDescsIsMutable();
                    this.stickerOverlayDescs_.set(i, stickerOverlayDesc);
                    onChanged();
                } else {
                    e2Var.mo37598v(i, stickerOverlayDesc);
                }
                return this;
            }

            public Builder setTextOverlayDescs(int i, TextOverlayDesc textOverlayDesc) {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                if (e2Var == null) {
                    textOverlayDesc.getClass();
                    ensureTextOverlayDescsIsMutable();
                    this.textOverlayDescs_.set(i, textOverlayDesc);
                    onChanged();
                } else {
                    e2Var.mo37598v(i, textOverlayDesc);
                }
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                this.mainClips_ = Collections.emptyList();
                this.stickerOverlayDescs_ = Collections.emptyList();
                this.textOverlayDescs_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public ComposingDesc build() {
                ComposingDesc buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public ComposingDesc buildPartial() {
                ComposingDesc composingDesc = new ComposingDesc((C23872m0.C23874b) this, (C241671) null);
                C23844i2<CoordinatingDesc, CoordinatingDesc.Builder, CoordinatingDescOrBuilder> i2Var = this.coordinatingDescBuilder_;
                if (i2Var == null) {
                    CoordinatingDesc unused = composingDesc.coordinatingDesc_ = this.coordinatingDesc_;
                } else {
                    CoordinatingDesc unused2 = composingDesc.coordinatingDesc_ = i2Var.mo37703b();
                }
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                if (e2Var == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.mainClips_ = Collections.unmodifiableList(this.mainClips_);
                        this.bitField0_ &= -2;
                    }
                    List unused3 = composingDesc.mainClips_ = this.mainClips_;
                } else {
                    List unused4 = composingDesc.mainClips_ = e2Var.mo37583g();
                }
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var2 = this.bgmClipBuilder_;
                if (i2Var2 == null) {
                    AudioClip unused5 = composingDesc.bgmClip_ = this.bgmClip_;
                } else {
                    AudioClip unused6 = composingDesc.bgmClip_ = i2Var2.mo37703b();
                }
                C23844i2<LyricOverlayDesc, LyricOverlayDesc.Builder, LyricOverlayDescOrBuilder> i2Var3 = this.lyricOverlayDescBuilder_;
                if (i2Var3 == null) {
                    LyricOverlayDesc unused7 = composingDesc.lyricOverlayDesc_ = this.lyricOverlayDesc_;
                } else {
                    LyricOverlayDesc unused8 = composingDesc.lyricOverlayDesc_ = i2Var3.mo37703b();
                }
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var2 = this.stickerOverlayDescsBuilder_;
                if (e2Var2 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.stickerOverlayDescs_ = Collections.unmodifiableList(this.stickerOverlayDescs_);
                        this.bitField0_ &= -3;
                    }
                    List unused9 = composingDesc.stickerOverlayDescs_ = this.stickerOverlayDescs_;
                } else {
                    List unused10 = composingDesc.stickerOverlayDescs_ = e2Var2.mo37583g();
                }
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var3 = this.textOverlayDescsBuilder_;
                if (e2Var3 == null) {
                    if ((this.bitField0_ & 4) != 0) {
                        this.textOverlayDescs_ = Collections.unmodifiableList(this.textOverlayDescs_);
                        this.bitField0_ &= -5;
                    }
                    List unused11 = composingDesc.textOverlayDescs_ = this.textOverlayDescs_;
                } else {
                    List unused12 = composingDesc.textOverlayDescs_ = e2Var3.mo37583g();
                }
                onBuilt();
                return composingDesc;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public ComposingDesc getDefaultInstanceForType() {
                return ComposingDesc.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Clip.Builder addMainClipsBuilder(int i) {
                return getMainClipsFieldBuilder().mo37579c(i, Clip.getDefaultInstance());
            }

            public StickerOverlayDesc.Builder addStickerOverlayDescsBuilder(int i) {
                return getStickerOverlayDescsFieldBuilder().mo37579c(i, StickerOverlayDesc.getDefaultInstance());
            }

            public TextOverlayDesc.Builder addTextOverlayDescsBuilder(int i) {
                return getTextOverlayDescsFieldBuilder().mo37579c(i, TextOverlayDesc.getDefaultInstance());
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                if (this.coordinatingDescBuilder_ == null) {
                    this.coordinatingDesc_ = null;
                } else {
                    this.coordinatingDesc_ = null;
                    this.coordinatingDescBuilder_ = null;
                }
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                if (e2Var == null) {
                    this.mainClips_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    e2Var.mo37584h();
                }
                if (this.bgmClipBuilder_ == null) {
                    this.bgmClip_ = null;
                } else {
                    this.bgmClip_ = null;
                    this.bgmClipBuilder_ = null;
                }
                if (this.lyricOverlayDescBuilder_ == null) {
                    this.lyricOverlayDesc_ = null;
                } else {
                    this.lyricOverlayDesc_ = null;
                    this.lyricOverlayDescBuilder_ = null;
                }
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var2 = this.stickerOverlayDescsBuilder_;
                if (e2Var2 == null) {
                    this.stickerOverlayDescs_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    e2Var2.mo37584h();
                }
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var3 = this.textOverlayDescsBuilder_;
                if (e2Var3 == null) {
                    this.textOverlayDescs_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    e2Var3.mo37584h();
                }
                return this;
            }

            public Builder setBgmClip(AudioClip.Builder builder) {
                C23844i2<AudioClip, AudioClip.Builder, AudioClipOrBuilder> i2Var = this.bgmClipBuilder_;
                if (i2Var == null) {
                    this.bgmClip_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setCoordinatingDesc(CoordinatingDesc.Builder builder) {
                C23844i2<CoordinatingDesc, CoordinatingDesc.Builder, CoordinatingDescOrBuilder> i2Var = this.coordinatingDescBuilder_;
                if (i2Var == null) {
                    this.coordinatingDesc_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setLyricOverlayDesc(LyricOverlayDesc.Builder builder) {
                C23844i2<LyricOverlayDesc, LyricOverlayDesc.Builder, LyricOverlayDescOrBuilder> i2Var = this.lyricOverlayDescBuilder_;
                if (i2Var == null) {
                    this.lyricOverlayDesc_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder addMainClips(int i, Clip clip) {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                if (e2Var == null) {
                    clip.getClass();
                    ensureMainClipsIsMutable();
                    this.mainClips_.add(i, clip);
                    onChanged();
                } else {
                    e2Var.mo37581e(i, clip);
                }
                return this;
            }

            public Builder addStickerOverlayDescs(int i, StickerOverlayDesc stickerOverlayDesc) {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                if (e2Var == null) {
                    stickerOverlayDesc.getClass();
                    ensureStickerOverlayDescsIsMutable();
                    this.stickerOverlayDescs_.add(i, stickerOverlayDesc);
                    onChanged();
                } else {
                    e2Var.mo37581e(i, stickerOverlayDesc);
                }
                return this;
            }

            public Builder addTextOverlayDescs(int i, TextOverlayDesc textOverlayDesc) {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                if (e2Var == null) {
                    textOverlayDesc.getClass();
                    ensureTextOverlayDescsIsMutable();
                    this.textOverlayDescs_.add(i, textOverlayDesc);
                    onChanged();
                } else {
                    e2Var.mo37581e(i, textOverlayDesc);
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof ComposingDesc) {
                    return mergeFrom((ComposingDesc) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder setMainClips(int i, Clip.Builder builder) {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                if (e2Var == null) {
                    ensureMainClipsIsMutable();
                    this.mainClips_.set(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37598v(i, builder.build());
                }
                return this;
            }

            public Builder setStickerOverlayDescs(int i, StickerOverlayDesc.Builder builder) {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                if (e2Var == null) {
                    ensureStickerOverlayDescsIsMutable();
                    this.stickerOverlayDescs_.set(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37598v(i, builder.build());
                }
                return this;
            }

            public Builder setTextOverlayDescs(int i, TextOverlayDesc.Builder builder) {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                if (e2Var == null) {
                    ensureTextOverlayDescsIsMutable();
                    this.textOverlayDescs_.set(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37598v(i, builder.build());
                }
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.mainClips_ = Collections.emptyList();
                this.stickerOverlayDescs_ = Collections.emptyList();
                this.textOverlayDescs_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(ComposingDesc composingDesc) {
                if (composingDesc == ComposingDesc.getDefaultInstance()) {
                    return this;
                }
                if (composingDesc.hasCoordinatingDesc()) {
                    mergeCoordinatingDesc(composingDesc.getCoordinatingDesc());
                }
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = null;
                if (this.mainClipsBuilder_ == null) {
                    if (!composingDesc.mainClips_.isEmpty()) {
                        if (this.mainClips_.isEmpty()) {
                            this.mainClips_ = composingDesc.mainClips_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMainClipsIsMutable();
                            this.mainClips_.addAll(composingDesc.mainClips_);
                        }
                        onChanged();
                    }
                } else if (!composingDesc.mainClips_.isEmpty()) {
                    if (this.mainClipsBuilder_.mo37595s()) {
                        this.mainClipsBuilder_.f68224a = null;
                        this.mainClipsBuilder_ = null;
                        this.mainClips_ = composingDesc.mainClips_;
                        this.bitField0_ &= -2;
                        this.mainClipsBuilder_ = C23872m0.alwaysUseFieldBuilders ? getMainClipsFieldBuilder() : null;
                    } else {
                        this.mainClipsBuilder_.mo37578b(composingDesc.mainClips_);
                    }
                }
                if (composingDesc.hasBgmClip()) {
                    mergeBgmClip(composingDesc.getBgmClip());
                }
                if (composingDesc.hasLyricOverlayDesc()) {
                    mergeLyricOverlayDesc(composingDesc.getLyricOverlayDesc());
                }
                if (this.stickerOverlayDescsBuilder_ == null) {
                    if (!composingDesc.stickerOverlayDescs_.isEmpty()) {
                        if (this.stickerOverlayDescs_.isEmpty()) {
                            this.stickerOverlayDescs_ = composingDesc.stickerOverlayDescs_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureStickerOverlayDescsIsMutable();
                            this.stickerOverlayDescs_.addAll(composingDesc.stickerOverlayDescs_);
                        }
                        onChanged();
                    }
                } else if (!composingDesc.stickerOverlayDescs_.isEmpty()) {
                    if (this.stickerOverlayDescsBuilder_.mo37595s()) {
                        this.stickerOverlayDescsBuilder_.f68224a = null;
                        this.stickerOverlayDescsBuilder_ = null;
                        this.stickerOverlayDescs_ = composingDesc.stickerOverlayDescs_;
                        this.bitField0_ &= -3;
                        this.stickerOverlayDescsBuilder_ = C23872m0.alwaysUseFieldBuilders ? getStickerOverlayDescsFieldBuilder() : null;
                    } else {
                        this.stickerOverlayDescsBuilder_.mo37578b(composingDesc.stickerOverlayDescs_);
                    }
                }
                if (this.textOverlayDescsBuilder_ == null) {
                    if (!composingDesc.textOverlayDescs_.isEmpty()) {
                        if (this.textOverlayDescs_.isEmpty()) {
                            this.textOverlayDescs_ = composingDesc.textOverlayDescs_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureTextOverlayDescsIsMutable();
                            this.textOverlayDescs_.addAll(composingDesc.textOverlayDescs_);
                        }
                        onChanged();
                    }
                } else if (!composingDesc.textOverlayDescs_.isEmpty()) {
                    if (this.textOverlayDescsBuilder_.mo37595s()) {
                        this.textOverlayDescsBuilder_.f68224a = null;
                        this.textOverlayDescsBuilder_ = null;
                        this.textOverlayDescs_ = composingDesc.textOverlayDescs_;
                        this.bitField0_ &= -5;
                        if (C23872m0.alwaysUseFieldBuilders) {
                            e2Var = getTextOverlayDescsFieldBuilder();
                        }
                        this.textOverlayDescsBuilder_ = e2Var;
                    } else {
                        this.textOverlayDescsBuilder_.mo37578b(composingDesc.textOverlayDescs_);
                    }
                }
                mergeUnknownFields(composingDesc.unknownFields);
                onChanged();
                return this;
            }

            public Builder addMainClips(Clip.Builder builder) {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                if (e2Var == null) {
                    ensureMainClipsIsMutable();
                    this.mainClips_.add(builder.build());
                    onChanged();
                } else {
                    e2Var.mo37582f(builder.build());
                }
                return this;
            }

            public Builder addStickerOverlayDescs(StickerOverlayDesc.Builder builder) {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                if (e2Var == null) {
                    ensureStickerOverlayDescsIsMutable();
                    this.stickerOverlayDescs_.add(builder.build());
                    onChanged();
                } else {
                    e2Var.mo37582f(builder.build());
                }
                return this;
            }

            public Builder addTextOverlayDescs(TextOverlayDesc.Builder builder) {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                if (e2Var == null) {
                    ensureTextOverlayDescsIsMutable();
                    this.textOverlayDescs_.add(builder.build());
                    onChanged();
                } else {
                    e2Var.mo37582f(builder.build());
                }
                return this;
            }

            public Builder addMainClips(int i, Clip.Builder builder) {
                C23821e2<Clip, Clip.Builder, ClipOrBuilder> e2Var = this.mainClipsBuilder_;
                if (e2Var == null) {
                    ensureMainClipsIsMutable();
                    this.mainClips_.add(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37581e(i, builder.build());
                }
                return this;
            }

            public Builder addStickerOverlayDescs(int i, StickerOverlayDesc.Builder builder) {
                C23821e2<StickerOverlayDesc, StickerOverlayDesc.Builder, StickerOverlayDescOrBuilder> e2Var = this.stickerOverlayDescsBuilder_;
                if (e2Var == null) {
                    ensureStickerOverlayDescsIsMutable();
                    this.stickerOverlayDescs_.add(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37581e(i, builder.build());
                }
                return this;
            }

            public Builder addTextOverlayDescs(int i, TextOverlayDesc.Builder builder) {
                C23821e2<TextOverlayDesc, TextOverlayDesc.Builder, TextOverlayDescOrBuilder> e2Var = this.textOverlayDescsBuilder_;
                if (e2Var == null) {
                    ensureTextOverlayDescsIsMutable();
                    this.textOverlayDescs_.add(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37581e(i, builder.build());
                }
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.ComposingDesc.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.ComposingDesc.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$ComposingDesc r3 = (com.tencent.maas.composing.MJComposingS12.ComposingDesc) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.ComposingDesc) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$ComposingDesc r4 = (com.tencent.maas.composing.MJComposingS12.ComposingDesc) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.ComposingDesc) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.ComposingDesc.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$ComposingDesc$Builder");
            }
        }

        public /* synthetic */ ComposingDesc(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static ComposingDesc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_ComposingDesc_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ComposingDesc parseDelimitedFrom(InputStream inputStream) {
            return (ComposingDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ComposingDesc parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<ComposingDesc> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ComposingDesc)) {
                return super.equals(obj);
            }
            ComposingDesc composingDesc = (ComposingDesc) obj;
            if (hasCoordinatingDesc() != composingDesc.hasCoordinatingDesc()) {
                return false;
            }
            if ((hasCoordinatingDesc() && !getCoordinatingDesc().equals(composingDesc.getCoordinatingDesc())) || !getMainClipsList().equals(composingDesc.getMainClipsList()) || hasBgmClip() != composingDesc.hasBgmClip()) {
                return false;
            }
            if ((!hasBgmClip() || getBgmClip().equals(composingDesc.getBgmClip())) && hasLyricOverlayDesc() == composingDesc.hasLyricOverlayDesc()) {
                return (!hasLyricOverlayDesc() || getLyricOverlayDesc().equals(composingDesc.getLyricOverlayDesc())) && getStickerOverlayDescsList().equals(composingDesc.getStickerOverlayDescsList()) && getTextOverlayDescsList().equals(composingDesc.getTextOverlayDescsList()) && this.unknownFields.equals(composingDesc.unknownFields);
            }
            return false;
        }

        public AudioClip getBgmClip() {
            AudioClip audioClip = this.bgmClip_;
            return audioClip == null ? AudioClip.getDefaultInstance() : audioClip;
        }

        public AudioClipOrBuilder getBgmClipOrBuilder() {
            return getBgmClip();
        }

        public CoordinatingDesc getCoordinatingDesc() {
            CoordinatingDesc coordinatingDesc = this.coordinatingDesc_;
            return coordinatingDesc == null ? CoordinatingDesc.getDefaultInstance() : coordinatingDesc;
        }

        public CoordinatingDescOrBuilder getCoordinatingDescOrBuilder() {
            return getCoordinatingDesc();
        }

        public LyricOverlayDesc getLyricOverlayDesc() {
            LyricOverlayDesc lyricOverlayDesc = this.lyricOverlayDesc_;
            return lyricOverlayDesc == null ? LyricOverlayDesc.getDefaultInstance() : lyricOverlayDesc;
        }

        public LyricOverlayDescOrBuilder getLyricOverlayDescOrBuilder() {
            return getLyricOverlayDesc();
        }

        public Clip getMainClips(int i) {
            return this.mainClips_.get(i);
        }

        public int getMainClipsCount() {
            return this.mainClips_.size();
        }

        public List<Clip> getMainClipsList() {
            return this.mainClips_;
        }

        public ClipOrBuilder getMainClipsOrBuilder(int i) {
            return this.mainClips_.get(i);
        }

        public List<? extends ClipOrBuilder> getMainClipsOrBuilderList() {
            return this.mainClips_;
        }

        public C24062w1<ComposingDesc> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int o = this.coordinatingDesc_ != null ? C23897n.m29270o(1, getCoordinatingDesc()) + 0 : 0;
            for (int i2 = 0; i2 < this.mainClips_.size(); i2++) {
                o += C23897n.m29270o(2, this.mainClips_.get(i2));
            }
            if (this.bgmClip_ != null) {
                o += C23897n.m29270o(3, getBgmClip());
            }
            if (this.lyricOverlayDesc_ != null) {
                o += C23897n.m29270o(4, getLyricOverlayDesc());
            }
            for (int i3 = 0; i3 < this.stickerOverlayDescs_.size(); i3++) {
                o += C23897n.m29270o(5, this.stickerOverlayDescs_.get(i3));
            }
            for (int i4 = 0; i4 < this.textOverlayDescs_.size(); i4++) {
                o += C23897n.m29270o(6, this.textOverlayDescs_.get(i4));
            }
            int serializedSize = o + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public StickerOverlayDesc getStickerOverlayDescs(int i) {
            return this.stickerOverlayDescs_.get(i);
        }

        public int getStickerOverlayDescsCount() {
            return this.stickerOverlayDescs_.size();
        }

        public List<StickerOverlayDesc> getStickerOverlayDescsList() {
            return this.stickerOverlayDescs_;
        }

        public StickerOverlayDescOrBuilder getStickerOverlayDescsOrBuilder(int i) {
            return this.stickerOverlayDescs_.get(i);
        }

        public List<? extends StickerOverlayDescOrBuilder> getStickerOverlayDescsOrBuilderList() {
            return this.stickerOverlayDescs_;
        }

        public TextOverlayDesc getTextOverlayDescs(int i) {
            return this.textOverlayDescs_.get(i);
        }

        public int getTextOverlayDescsCount() {
            return this.textOverlayDescs_.size();
        }

        public List<TextOverlayDesc> getTextOverlayDescsList() {
            return this.textOverlayDescs_;
        }

        public TextOverlayDescOrBuilder getTextOverlayDescsOrBuilder(int i) {
            return this.textOverlayDescs_.get(i);
        }

        public List<? extends TextOverlayDescOrBuilder> getTextOverlayDescsOrBuilderList() {
            return this.textOverlayDescs_;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasBgmClip() {
            return this.bgmClip_ != null;
        }

        public boolean hasCoordinatingDesc() {
            return this.coordinatingDesc_ != null;
        }

        public boolean hasLyricOverlayDesc() {
            return this.lyricOverlayDesc_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasCoordinatingDesc()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getCoordinatingDesc().hashCode();
            }
            if (getMainClipsCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getMainClipsList().hashCode();
            }
            if (hasBgmClip()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getBgmClip().hashCode();
            }
            if (hasLyricOverlayDesc()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getLyricOverlayDesc().hashCode();
            }
            if (getStickerOverlayDescsCount() > 0) {
                hashCode = (((hashCode * 37) + 5) * 53) + getStickerOverlayDescsList().hashCode();
            }
            if (getTextOverlayDescsCount() > 0) {
                hashCode = (((hashCode * 37) + 6) * 53) + getTextOverlayDescsList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$26100 = MJComposingS12.internal_static_MJComposingS12_ComposingDesc_fieldAccessorTable;
            access$26100.mo37875c(ComposingDesc.class, Builder.class);
            return access$26100;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new ComposingDesc();
        }

        public void writeTo(C23897n nVar) {
            if (this.coordinatingDesc_ != null) {
                nVar.mo37909P(1, getCoordinatingDesc());
            }
            for (int i = 0; i < this.mainClips_.size(); i++) {
                nVar.mo37909P(2, this.mainClips_.get(i));
            }
            if (this.bgmClip_ != null) {
                nVar.mo37909P(3, getBgmClip());
            }
            if (this.lyricOverlayDesc_ != null) {
                nVar.mo37909P(4, getLyricOverlayDesc());
            }
            for (int i2 = 0; i2 < this.stickerOverlayDescs_.size(); i2++) {
                nVar.mo37909P(5, this.stickerOverlayDescs_.get(i2));
            }
            for (int i3 = 0; i3 < this.textOverlayDescs_.size(); i3++) {
                nVar.mo37909P(6, this.textOverlayDescs_.get(i3));
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ ComposingDesc(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(ComposingDesc composingDesc) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(composingDesc);
        }

        public static ComposingDesc parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private ComposingDesc(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static ComposingDesc parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ComposingDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static ComposingDesc parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public ComposingDesc getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static ComposingDesc parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ComposingDesc() {
            this.memoizedIsInitialized = -1;
            this.mainClips_ = Collections.emptyList();
            this.stickerOverlayDescs_ = Collections.emptyList();
            this.textOverlayDescs_ = Collections.emptyList();
        }

        public static ComposingDesc parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static ComposingDesc parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static ComposingDesc parseFrom(InputStream inputStream) {
            return (ComposingDesc) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static ComposingDesc parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ComposingDesc) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.tencent.maas.composing.MJComposingS12$CoordinatingDesc$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.tencent.maas.composing.MJComposingS12$AudioClip$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.tencent.maas.composing.MJComposingS12$LyricOverlayDesc$Builder} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v7 */
        /* JADX WARNING: type inference failed for: r6v8 */
        /* JADX WARNING: type inference failed for: r6v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private ComposingDesc(com.google.protobuf.C23856l r8, com.google.protobuf.C23806a0 r9) {
            /*
                r7 = this;
                r7.<init>()
                r9.getClass()
                com.google.protobuf.s2$a r0 = com.google.protobuf.C24020s2.m29807b()
                r1 = 0
                r2 = 0
            L_0x000c:
                if (r1 != 0) goto L_0x0131
                int r3 = r8.mo37757F()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r4 = 1
                if (r3 == 0) goto L_0x00f1
                r5 = 10
                r6 = 0
                if (r3 == r5) goto L_0x00d0
                r5 = 18
                if (r3 == r5) goto L_0x00b2
                r5 = 26
                if (r3 == r5) goto L_0x0091
                r5 = 34
                if (r3 == r5) goto L_0x0070
                r5 = 42
                if (r3 == r5) goto L_0x0053
                r5 = 50
                if (r3 == r5) goto L_0x0036
                boolean r3 = r7.parseUnknownField(r8, r0, r9, r3)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                if (r3 != 0) goto L_0x000c
                goto L_0x00f1
            L_0x0036:
                r3 = r2 & 4
                if (r3 != 0) goto L_0x0043
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r3.<init>()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r7.textOverlayDescs_ = r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r2 = r2 | 4
            L_0x0043:
                java.util.List<com.tencent.maas.composing.MJComposingS12$TextOverlayDesc> r3 = r7.textOverlayDescs_     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.google.protobuf.w1 r4 = com.tencent.maas.composing.MJComposingS12.TextOverlayDesc.parser()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.google.protobuf.j1 r4 = r8.mo37777v(r4, r9)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.tencent.maas.composing.MJComposingS12$TextOverlayDesc r4 = (com.tencent.maas.composing.MJComposingS12.TextOverlayDesc) r4     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r3.add(r4)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                goto L_0x000c
            L_0x0053:
                r3 = r2 & 2
                if (r3 != 0) goto L_0x0060
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r3.<init>()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r7.stickerOverlayDescs_ = r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r2 = r2 | 2
            L_0x0060:
                java.util.List<com.tencent.maas.composing.MJComposingS12$StickerOverlayDesc> r3 = r7.stickerOverlayDescs_     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.google.protobuf.w1 r4 = com.tencent.maas.composing.MJComposingS12.StickerOverlayDesc.parser()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.google.protobuf.j1 r4 = r8.mo37777v(r4, r9)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.tencent.maas.composing.MJComposingS12$StickerOverlayDesc r4 = (com.tencent.maas.composing.MJComposingS12.StickerOverlayDesc) r4     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r3.add(r4)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                goto L_0x000c
            L_0x0070:
                com.tencent.maas.composing.MJComposingS12$LyricOverlayDesc r3 = r7.lyricOverlayDesc_     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                if (r3 == 0) goto L_0x0078
                com.tencent.maas.composing.MJComposingS12$LyricOverlayDesc$Builder r6 = r3.toBuilder()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
            L_0x0078:
                com.google.protobuf.w1 r3 = com.tencent.maas.composing.MJComposingS12.LyricOverlayDesc.parser()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.google.protobuf.j1 r3 = r8.mo37777v(r3, r9)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.tencent.maas.composing.MJComposingS12$LyricOverlayDesc r3 = (com.tencent.maas.composing.MJComposingS12.LyricOverlayDesc) r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r7.lyricOverlayDesc_ = r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                if (r6 == 0) goto L_0x000c
                r6.mergeFrom((com.tencent.maas.composing.MJComposingS12.LyricOverlayDesc) r3)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.tencent.maas.composing.MJComposingS12$LyricOverlayDesc r3 = r6.buildPartial()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r7.lyricOverlayDesc_ = r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                goto L_0x000c
            L_0x0091:
                com.tencent.maas.composing.MJComposingS12$AudioClip r3 = r7.bgmClip_     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                if (r3 == 0) goto L_0x0099
                com.tencent.maas.composing.MJComposingS12$AudioClip$Builder r6 = r3.toBuilder()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
            L_0x0099:
                com.google.protobuf.w1 r3 = com.tencent.maas.composing.MJComposingS12.AudioClip.parser()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.google.protobuf.j1 r3 = r8.mo37777v(r3, r9)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.tencent.maas.composing.MJComposingS12$AudioClip r3 = (com.tencent.maas.composing.MJComposingS12.AudioClip) r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r7.bgmClip_ = r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                if (r6 == 0) goto L_0x000c
                r6.mergeFrom((com.tencent.maas.composing.MJComposingS12.AudioClip) r3)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.tencent.maas.composing.MJComposingS12$AudioClip r3 = r6.buildPartial()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r7.bgmClip_ = r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                goto L_0x000c
            L_0x00b2:
                r3 = r2 & 1
                if (r3 != 0) goto L_0x00bf
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r3.<init>()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r7.mainClips_ = r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r2 = r2 | 1
            L_0x00bf:
                java.util.List<com.tencent.maas.composing.MJComposingS12$Clip> r3 = r7.mainClips_     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.google.protobuf.w1 r4 = com.tencent.maas.composing.MJComposingS12.Clip.parser()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.google.protobuf.j1 r4 = r8.mo37777v(r4, r9)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.tencent.maas.composing.MJComposingS12$Clip r4 = (com.tencent.maas.composing.MJComposingS12.Clip) r4     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r3.add(r4)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                goto L_0x000c
            L_0x00d0:
                com.tencent.maas.composing.MJComposingS12$CoordinatingDesc r3 = r7.coordinatingDesc_     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                if (r3 == 0) goto L_0x00d8
                com.tencent.maas.composing.MJComposingS12$CoordinatingDesc$Builder r6 = r3.toBuilder()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
            L_0x00d8:
                com.google.protobuf.w1 r3 = com.tencent.maas.composing.MJComposingS12.CoordinatingDesc.parser()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.google.protobuf.j1 r3 = r8.mo37777v(r3, r9)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.tencent.maas.composing.MJComposingS12$CoordinatingDesc r3 = (com.tencent.maas.composing.MJComposingS12.CoordinatingDesc) r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r7.coordinatingDesc_ = r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                if (r6 == 0) goto L_0x000c
                r6.mergeFrom((com.tencent.maas.composing.MJComposingS12.CoordinatingDesc) r3)     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                com.tencent.maas.composing.MJComposingS12$CoordinatingDesc r3 = r6.buildPartial()     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                r7.coordinatingDesc_ = r3     // Catch:{ p0 -> 0x00ff, IOException -> 0x00f6 }
                goto L_0x000c
            L_0x00f1:
                r1 = 1
                goto L_0x000c
            L_0x00f4:
                r8 = move-exception
                goto L_0x0103
            L_0x00f6:
                r8 = move-exception
                com.google.protobuf.p0 r9 = new com.google.protobuf.p0     // Catch:{ all -> 0x00f4 }
                r9.<init>((java.io.IOException) r8)     // Catch:{ all -> 0x00f4 }
                r9.f68530d = r7     // Catch:{ all -> 0x00f4 }
                throw r9     // Catch:{ all -> 0x00f4 }
            L_0x00ff:
                r8 = move-exception
                r8.f68530d = r7     // Catch:{ all -> 0x00f4 }
                throw r8     // Catch:{ all -> 0x00f4 }
            L_0x0103:
                r9 = r2 & 1
                if (r9 == 0) goto L_0x010f
                java.util.List<com.tencent.maas.composing.MJComposingS12$Clip> r9 = r7.mainClips_
                java.util.List r9 = java.util.Collections.unmodifiableList(r9)
                r7.mainClips_ = r9
            L_0x010f:
                r9 = r2 & 2
                if (r9 == 0) goto L_0x011b
                java.util.List<com.tencent.maas.composing.MJComposingS12$StickerOverlayDesc> r9 = r7.stickerOverlayDescs_
                java.util.List r9 = java.util.Collections.unmodifiableList(r9)
                r7.stickerOverlayDescs_ = r9
            L_0x011b:
                r9 = r2 & 4
                if (r9 == 0) goto L_0x0127
                java.util.List<com.tencent.maas.composing.MJComposingS12$TextOverlayDesc> r9 = r7.textOverlayDescs_
                java.util.List r9 = java.util.Collections.unmodifiableList(r9)
                r7.textOverlayDescs_ = r9
            L_0x0127:
                com.google.protobuf.s2 r9 = r0.build()
                r7.unknownFields = r9
                r7.makeExtensionsImmutable()
                throw r8
            L_0x0131:
                r8 = r2 & 1
                if (r8 == 0) goto L_0x013d
                java.util.List<com.tencent.maas.composing.MJComposingS12$Clip> r8 = r7.mainClips_
                java.util.List r8 = java.util.Collections.unmodifiableList(r8)
                r7.mainClips_ = r8
            L_0x013d:
                r8 = r2 & 2
                if (r8 == 0) goto L_0x0149
                java.util.List<com.tencent.maas.composing.MJComposingS12$StickerOverlayDesc> r8 = r7.stickerOverlayDescs_
                java.util.List r8 = java.util.Collections.unmodifiableList(r8)
                r7.stickerOverlayDescs_ = r8
            L_0x0149:
                r8 = r2 & 4
                if (r8 == 0) goto L_0x0155
                java.util.List<com.tencent.maas.composing.MJComposingS12$TextOverlayDesc> r8 = r7.textOverlayDescs_
                java.util.List r8 = java.util.Collections.unmodifiableList(r8)
                r7.textOverlayDescs_ = r8
            L_0x0155:
                com.google.protobuf.s2 r8 = r0.build()
                r7.unknownFields = r8
                r7.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.ComposingDesc.<init>(com.google.protobuf.l, com.google.protobuf.a0):void");
        }

        public static ComposingDesc parseFrom(C23856l lVar) {
            return (ComposingDesc) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static ComposingDesc parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (ComposingDesc) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface ComposingDescOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        AudioClip getBgmClip();

        AudioClipOrBuilder getBgmClipOrBuilder();

        CoordinatingDesc getCoordinatingDesc();

        CoordinatingDescOrBuilder getCoordinatingDescOrBuilder();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        LyricOverlayDesc getLyricOverlayDesc();

        LyricOverlayDescOrBuilder getLyricOverlayDescOrBuilder();

        Clip getMainClips(int i);

        int getMainClipsCount();

        List<Clip> getMainClipsList();

        ClipOrBuilder getMainClipsOrBuilder(int i);

        List<? extends ClipOrBuilder> getMainClipsOrBuilderList();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        StickerOverlayDesc getStickerOverlayDescs(int i);

        int getStickerOverlayDescsCount();

        List<StickerOverlayDesc> getStickerOverlayDescsList();

        StickerOverlayDescOrBuilder getStickerOverlayDescsOrBuilder(int i);

        List<? extends StickerOverlayDescOrBuilder> getStickerOverlayDescsOrBuilderList();

        TextOverlayDesc getTextOverlayDescs(int i);

        int getTextOverlayDescsCount();

        List<TextOverlayDesc> getTextOverlayDescsList();

        TextOverlayDescOrBuilder getTextOverlayDescsOrBuilder(int i);

        List<? extends TextOverlayDescOrBuilder> getTextOverlayDescsOrBuilderList();

        /* synthetic */ C24020s2 getUnknownFields();

        boolean hasBgmClip();

        boolean hasCoordinatingDesc();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        boolean hasLyricOverlayDesc();

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    public enum ContentFlipMode implements C23908o0.C23911c {
        ContentFlipModeNone(0),
        ContentFlipModeHorizontal(1),
        ContentFlipModeVertical(2),
        ContentFlipModeHorizontalAndVertical(3),
        UNRECOGNIZED(-1);
        
        public static final int ContentFlipModeHorizontalAndVertical_VALUE = 3;
        public static final int ContentFlipModeHorizontal_VALUE = 1;
        public static final int ContentFlipModeNone_VALUE = 0;
        public static final int ContentFlipModeVertical_VALUE = 2;
        private static final ContentFlipMode[] VALUES = null;
        private static final C23908o0.C23912d<ContentFlipMode> internalValueMap = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<ContentFlipMode>() {
                public ContentFlipMode findValueByNumber(int i) {
                    return ContentFlipMode.forNumber(i);
                }
            };
            VALUES = values();
        }

        private ContentFlipMode(int i) {
            this.value = i;
        }

        public static ContentFlipMode forNumber(int i) {
            if (i == 0) {
                return ContentFlipModeNone;
            }
            if (i == 1) {
                return ContentFlipModeHorizontal;
            }
            if (i == 2) {
                return ContentFlipModeVertical;
            }
            if (i != 3) {
                return null;
            }
            return ContentFlipModeHorizontalAndVertical;
        }

        public static final C24025t.C24033e getDescriptor() {
            return MJComposingS12.getDescriptor().mo38346f().get(3);
        }

        public static C23908o0.C23912d<ContentFlipMode> internalGetValueMap() {
            return internalValueMap;
        }

        public final C24025t.C24033e getDescriptorForType() {
            return getDescriptor();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final C24025t.C24034f getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().mo38334h().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static ContentFlipMode valueOf(int i) {
            return forNumber(i);
        }

        public static ContentFlipMode valueOf(C24025t.C24034f fVar) {
            if (fVar.f69101h == getDescriptor()) {
                int i = fVar.f69097d;
                if (i == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[i];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum ContentRotationMode implements C23908o0.C23911c {
        ContentRotationModeNone(0),
        ContentRotationModeCCW90(1),
        ContentRotationMode180(2),
        ContentRotationModeCW90(3),
        UNRECOGNIZED(-1);
        
        public static final int ContentRotationMode180_VALUE = 2;
        public static final int ContentRotationModeCCW90_VALUE = 1;
        public static final int ContentRotationModeCW90_VALUE = 3;
        public static final int ContentRotationModeNone_VALUE = 0;
        private static final ContentRotationMode[] VALUES = null;
        private static final C23908o0.C23912d<ContentRotationMode> internalValueMap = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<ContentRotationMode>() {
                public ContentRotationMode findValueByNumber(int i) {
                    return ContentRotationMode.forNumber(i);
                }
            };
            VALUES = values();
        }

        private ContentRotationMode(int i) {
            this.value = i;
        }

        public static ContentRotationMode forNumber(int i) {
            if (i == 0) {
                return ContentRotationModeNone;
            }
            if (i == 1) {
                return ContentRotationModeCCW90;
            }
            if (i == 2) {
                return ContentRotationMode180;
            }
            if (i != 3) {
                return null;
            }
            return ContentRotationModeCW90;
        }

        public static final C24025t.C24033e getDescriptor() {
            return MJComposingS12.getDescriptor().mo38346f().get(2);
        }

        public static C23908o0.C23912d<ContentRotationMode> internalGetValueMap() {
            return internalValueMap;
        }

        public final C24025t.C24033e getDescriptorForType() {
            return getDescriptor();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final C24025t.C24034f getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().mo38334h().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static ContentRotationMode valueOf(int i) {
            return forNumber(i);
        }

        public static ContentRotationMode valueOf(C24025t.C24034f fVar) {
            if (fVar.f69101h == getDescriptor()) {
                int i = fVar.f69097d;
                if (i == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[i];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum ContentScaleMode implements C23908o0.C23911c {
        ContentScaleModeCenter(0),
        ContentScaleModeFill(1),
        ContentScaleModeAspectFit(2),
        ContentScaleModeAspectFill(3),
        UNRECOGNIZED(-1);
        
        public static final int ContentScaleModeAspectFill_VALUE = 3;
        public static final int ContentScaleModeAspectFit_VALUE = 2;
        public static final int ContentScaleModeCenter_VALUE = 0;
        public static final int ContentScaleModeFill_VALUE = 1;
        private static final ContentScaleMode[] VALUES = null;
        private static final C23908o0.C23912d<ContentScaleMode> internalValueMap = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<ContentScaleMode>() {
                public ContentScaleMode findValueByNumber(int i) {
                    return ContentScaleMode.forNumber(i);
                }
            };
            VALUES = values();
        }

        private ContentScaleMode(int i) {
            this.value = i;
        }

        public static ContentScaleMode forNumber(int i) {
            if (i == 0) {
                return ContentScaleModeCenter;
            }
            if (i == 1) {
                return ContentScaleModeFill;
            }
            if (i == 2) {
                return ContentScaleModeAspectFit;
            }
            if (i != 3) {
                return null;
            }
            return ContentScaleModeAspectFill;
        }

        public static final C24025t.C24033e getDescriptor() {
            return MJComposingS12.getDescriptor().mo38346f().get(1);
        }

        public static C23908o0.C23912d<ContentScaleMode> internalGetValueMap() {
            return internalValueMap;
        }

        public final C24025t.C24033e getDescriptorForType() {
            return getDescriptor();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final C24025t.C24034f getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().mo38334h().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static ContentScaleMode valueOf(int i) {
            return forNumber(i);
        }

        public static ContentScaleMode valueOf(C24025t.C24034f fVar) {
            if (fVar.f69101h == getDescriptor()) {
                int i = fVar.f69097d;
                if (i == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[i];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class ContentSpatialDesc extends C23872m0 implements ContentSpatialDescOrBuilder {
        private static final ContentSpatialDesc DEFAULT_INSTANCE = new ContentSpatialDesc();
        public static final int FLIP_MODE_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final C24062w1<ContentSpatialDesc> PARSER = new C23813c<ContentSpatialDesc>() {
            public ContentSpatialDesc parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new ContentSpatialDesc(lVar, a0Var, (C241671) null);
            }
        };
        public static final int ROTATION_MODE_FIELD_NUMBER = 2;
        public static final int SCALE_MODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int flipMode_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public int rotationMode_;
        /* access modifiers changed from: private */
        public int scaleMode_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements ContentSpatialDescOrBuilder {
            private int flipMode_;
            private int rotationMode_;
            private int scaleMode_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_ContentSpatialDesc_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearFlipMode() {
                this.flipMode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRotationMode() {
                this.rotationMode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScaleMode() {
                this.scaleMode_ = 0;
                onChanged();
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_ContentSpatialDesc_descriptor;
            }

            public ContentFlipMode getFlipMode() {
                ContentFlipMode valueOf = ContentFlipMode.valueOf(this.flipMode_);
                return valueOf == null ? ContentFlipMode.UNRECOGNIZED : valueOf;
            }

            public int getFlipModeValue() {
                return this.flipMode_;
            }

            public ContentRotationMode getRotationMode() {
                ContentRotationMode valueOf = ContentRotationMode.valueOf(this.rotationMode_);
                return valueOf == null ? ContentRotationMode.UNRECOGNIZED : valueOf;
            }

            public int getRotationModeValue() {
                return this.rotationMode_;
            }

            public ContentScaleMode getScaleMode() {
                ContentScaleMode valueOf = ContentScaleMode.valueOf(this.scaleMode_);
                return valueOf == null ? ContentScaleMode.UNRECOGNIZED : valueOf;
            }

            public int getScaleModeValue() {
                return this.scaleMode_;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$8200 = MJComposingS12.f69255x67ce3062;
                access$8200.mo37875c(ContentSpatialDesc.class, Builder.class);
                return access$8200;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setFlipMode(ContentFlipMode contentFlipMode) {
                contentFlipMode.getClass();
                this.flipMode_ = contentFlipMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setFlipModeValue(int i) {
                this.flipMode_ = i;
                onChanged();
                return this;
            }

            public Builder setRotationMode(ContentRotationMode contentRotationMode) {
                contentRotationMode.getClass();
                this.rotationMode_ = contentRotationMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setRotationModeValue(int i) {
                this.rotationMode_ = i;
                onChanged();
                return this;
            }

            public Builder setScaleMode(ContentScaleMode contentScaleMode) {
                contentScaleMode.getClass();
                this.scaleMode_ = contentScaleMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setScaleModeValue(int i) {
                this.scaleMode_ = i;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                this.scaleMode_ = 0;
                this.rotationMode_ = 0;
                this.flipMode_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public ContentSpatialDesc build() {
                ContentSpatialDesc buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public ContentSpatialDesc buildPartial() {
                ContentSpatialDesc contentSpatialDesc = new ContentSpatialDesc((C23872m0.C23874b) this, (C241671) null);
                int unused = contentSpatialDesc.scaleMode_ = this.scaleMode_;
                int unused2 = contentSpatialDesc.rotationMode_ = this.rotationMode_;
                int unused3 = contentSpatialDesc.flipMode_ = this.flipMode_;
                onBuilt();
                return contentSpatialDesc;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public ContentSpatialDesc getDefaultInstanceForType() {
                return ContentSpatialDesc.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.scaleMode_ = 0;
                this.rotationMode_ = 0;
                this.flipMode_ = 0;
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof ContentSpatialDesc) {
                    return mergeFrom((ContentSpatialDesc) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.scaleMode_ = 0;
                this.rotationMode_ = 0;
                this.flipMode_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(ContentSpatialDesc contentSpatialDesc) {
                if (contentSpatialDesc == ContentSpatialDesc.getDefaultInstance()) {
                    return this;
                }
                if (contentSpatialDesc.scaleMode_ != 0) {
                    setScaleModeValue(contentSpatialDesc.getScaleModeValue());
                }
                if (contentSpatialDesc.rotationMode_ != 0) {
                    setRotationModeValue(contentSpatialDesc.getRotationModeValue());
                }
                if (contentSpatialDesc.flipMode_ != 0) {
                    setFlipModeValue(contentSpatialDesc.getFlipModeValue());
                }
                mergeUnknownFields(contentSpatialDesc.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc r3 = (com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc r4 = (com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc$Builder");
            }
        }

        public /* synthetic */ ContentSpatialDesc(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static ContentSpatialDesc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_ContentSpatialDesc_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ContentSpatialDesc parseDelimitedFrom(InputStream inputStream) {
            return (ContentSpatialDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ContentSpatialDesc parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<ContentSpatialDesc> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ContentSpatialDesc)) {
                return super.equals(obj);
            }
            ContentSpatialDesc contentSpatialDesc = (ContentSpatialDesc) obj;
            return this.scaleMode_ == contentSpatialDesc.scaleMode_ && this.rotationMode_ == contentSpatialDesc.rotationMode_ && this.flipMode_ == contentSpatialDesc.flipMode_ && this.unknownFields.equals(contentSpatialDesc.unknownFields);
        }

        public ContentFlipMode getFlipMode() {
            ContentFlipMode valueOf = ContentFlipMode.valueOf(this.flipMode_);
            return valueOf == null ? ContentFlipMode.UNRECOGNIZED : valueOf;
        }

        public int getFlipModeValue() {
            return this.flipMode_;
        }

        public C24062w1<ContentSpatialDesc> getParserForType() {
            return PARSER;
        }

        public ContentRotationMode getRotationMode() {
            ContentRotationMode valueOf = ContentRotationMode.valueOf(this.rotationMode_);
            return valueOf == null ? ContentRotationMode.UNRECOGNIZED : valueOf;
        }

        public int getRotationModeValue() {
            return this.rotationMode_;
        }

        public ContentScaleMode getScaleMode() {
            ContentScaleMode valueOf = ContentScaleMode.valueOf(this.scaleMode_);
            return valueOf == null ? ContentScaleMode.UNRECOGNIZED : valueOf;
        }

        public int getScaleModeValue() {
            return this.scaleMode_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.scaleMode_ != ContentScaleMode.ContentScaleModeCenter.getNumber()) {
                i2 = 0 + C23897n.m29261f(1, this.scaleMode_);
            }
            if (this.rotationMode_ != ContentRotationMode.ContentRotationModeNone.getNumber()) {
                i2 += C23897n.m29261f(2, this.rotationMode_);
            }
            if (this.flipMode_ != ContentFlipMode.ContentFlipModeNone.getNumber()) {
                i2 += C23897n.m29261f(3, this.flipMode_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((((C82986r.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + this.scaleMode_) * 37) + 2) * 53) + this.rotationMode_) * 37) + 3) * 53) + this.flipMode_) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$8200 = MJComposingS12.f69255x67ce3062;
            access$8200.mo37875c(ContentSpatialDesc.class, Builder.class);
            return access$8200;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new ContentSpatialDesc();
        }

        public void writeTo(C23897n nVar) {
            if (this.scaleMode_ != ContentScaleMode.ContentScaleModeCenter.getNumber()) {
                nVar.mo37907N(1, this.scaleMode_);
            }
            if (this.rotationMode_ != ContentRotationMode.ContentRotationModeNone.getNumber()) {
                nVar.mo37907N(2, this.rotationMode_);
            }
            if (this.flipMode_ != ContentFlipMode.ContentFlipModeNone.getNumber()) {
                nVar.mo37907N(3, this.flipMode_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ ContentSpatialDesc(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(ContentSpatialDesc contentSpatialDesc) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(contentSpatialDesc);
        }

        public static ContentSpatialDesc parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private ContentSpatialDesc(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static ContentSpatialDesc parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ContentSpatialDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static ContentSpatialDesc parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public ContentSpatialDesc getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static ContentSpatialDesc parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ContentSpatialDesc() {
            this.memoizedIsInitialized = -1;
            this.scaleMode_ = 0;
            this.rotationMode_ = 0;
            this.flipMode_ = 0;
        }

        public static ContentSpatialDesc parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static ContentSpatialDesc parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static ContentSpatialDesc parseFrom(InputStream inputStream) {
            return (ContentSpatialDesc) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static ContentSpatialDesc parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ContentSpatialDesc) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        private ContentSpatialDesc(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 8) {
                            this.scaleMode_ = lVar.mo37770o();
                        } else if (F == 16) {
                            this.rotationMode_ = lVar.mo37770o();
                        } else if (F == 24) {
                            this.flipMode_ = lVar.mo37770o();
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static ContentSpatialDesc parseFrom(C23856l lVar) {
            return (ContentSpatialDesc) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static ContentSpatialDesc parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (ContentSpatialDesc) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface ContentSpatialDescOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        ContentFlipMode getFlipMode();

        int getFlipModeValue();

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        ContentRotationMode getRotationMode();

        int getRotationModeValue();

        ContentScaleMode getScaleMode();

        int getScaleModeValue();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    public static final class CoordinatingDesc extends C23872m0 implements CoordinatingDescOrBuilder {
        public static final int CANVAS_ORIGIN_TYPE_FIELD_NUMBER = 2;
        public static final int CANVAS_SIZE_FIELD_NUMBER = 1;
        private static final CoordinatingDesc DEFAULT_INSTANCE = new CoordinatingDesc();
        /* access modifiers changed from: private */
        public static final C24062w1<CoordinatingDesc> PARSER = new C23813c<CoordinatingDesc>() {
            public CoordinatingDesc parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new CoordinatingDesc(lVar, a0Var, (C241671) null);
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int canvasOriginType_;
        /* access modifiers changed from: private */
        public Vec2 canvasSize_;
        private byte memoizedIsInitialized;

        public static final class Builder extends C23872m0.C23874b<Builder> implements CoordinatingDescOrBuilder {
            private int canvasOriginType_;
            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> canvasSizeBuilder_;
            private Vec2 canvasSize_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> getCanvasSizeFieldBuilder() {
                if (this.canvasSizeBuilder_ == null) {
                    this.canvasSizeBuilder_ = new C23844i2<>(getCanvasSize(), getParentForChildren(), isClean());
                    this.canvasSize_ = null;
                }
                return this.canvasSizeBuilder_;
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_CoordinatingDesc_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearCanvasOriginType() {
                this.canvasOriginType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCanvasSize() {
                if (this.canvasSizeBuilder_ == null) {
                    this.canvasSize_ = null;
                    onChanged();
                } else {
                    this.canvasSize_ = null;
                    this.canvasSizeBuilder_ = null;
                }
                return this;
            }

            public CanvasOriginType getCanvasOriginType() {
                CanvasOriginType valueOf = CanvasOriginType.valueOf(this.canvasOriginType_);
                return valueOf == null ? CanvasOriginType.UNRECOGNIZED : valueOf;
            }

            public int getCanvasOriginTypeValue() {
                return this.canvasOriginType_;
            }

            public Vec2 getCanvasSize() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.canvasSizeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Vec2 vec2 = this.canvasSize_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public Vec2.Builder getCanvasSizeBuilder() {
                onChanged();
                return getCanvasSizeFieldBuilder().mo37705d();
            }

            public Vec2OrBuilder getCanvasSizeOrBuilder() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.canvasSizeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Vec2 vec2 = this.canvasSize_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_CoordinatingDesc_descriptor;
            }

            public boolean hasCanvasSize() {
                return (this.canvasSizeBuilder_ == null && this.canvasSize_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$25000 = MJComposingS12.f69256x16fe97b8;
                access$25000.mo37875c(CoordinatingDesc.class, Builder.class);
                return access$25000;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCanvasSize(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.canvasSizeBuilder_;
                if (i2Var == null) {
                    Vec2 vec22 = this.canvasSize_;
                    if (vec22 != null) {
                        this.canvasSize_ = Vec2.newBuilder(vec22).mergeFrom(vec2).buildPartial();
                    } else {
                        this.canvasSize_ = vec2;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(vec2);
                }
                return this;
            }

            public Builder setCanvasOriginType(CanvasOriginType canvasOriginType) {
                canvasOriginType.getClass();
                this.canvasOriginType_ = canvasOriginType.getNumber();
                onChanged();
                return this;
            }

            public Builder setCanvasOriginTypeValue(int i) {
                this.canvasOriginType_ = i;
                onChanged();
                return this;
            }

            public Builder setCanvasSize(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.canvasSizeBuilder_;
                if (i2Var == null) {
                    vec2.getClass();
                    this.canvasSize_ = vec2;
                    onChanged();
                } else {
                    i2Var.mo37710i(vec2);
                }
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                this.canvasOriginType_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public CoordinatingDesc build() {
                CoordinatingDesc buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public CoordinatingDesc buildPartial() {
                CoordinatingDesc coordinatingDesc = new CoordinatingDesc((C23872m0.C23874b) this, (C241671) null);
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.canvasSizeBuilder_;
                if (i2Var == null) {
                    Vec2 unused = coordinatingDesc.canvasSize_ = this.canvasSize_;
                } else {
                    Vec2 unused2 = coordinatingDesc.canvasSize_ = i2Var.mo37703b();
                }
                int unused3 = coordinatingDesc.canvasOriginType_ = this.canvasOriginType_;
                onBuilt();
                return coordinatingDesc;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public CoordinatingDesc getDefaultInstanceForType() {
                return CoordinatingDesc.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                if (this.canvasSizeBuilder_ == null) {
                    this.canvasSize_ = null;
                } else {
                    this.canvasSize_ = null;
                    this.canvasSizeBuilder_ = null;
                }
                this.canvasOriginType_ = 0;
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.canvasOriginType_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setCanvasSize(Vec2.Builder builder) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.canvasSizeBuilder_;
                if (i2Var == null) {
                    this.canvasSize_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof CoordinatingDesc) {
                    return mergeFrom((CoordinatingDesc) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(CoordinatingDesc coordinatingDesc) {
                if (coordinatingDesc == CoordinatingDesc.getDefaultInstance()) {
                    return this;
                }
                if (coordinatingDesc.hasCanvasSize()) {
                    mergeCanvasSize(coordinatingDesc.getCanvasSize());
                }
                if (coordinatingDesc.canvasOriginType_ != 0) {
                    setCanvasOriginTypeValue(coordinatingDesc.getCanvasOriginTypeValue());
                }
                mergeUnknownFields(coordinatingDesc.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.CoordinatingDesc.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.CoordinatingDesc.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$CoordinatingDesc r3 = (com.tencent.maas.composing.MJComposingS12.CoordinatingDesc) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.CoordinatingDesc) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$CoordinatingDesc r4 = (com.tencent.maas.composing.MJComposingS12.CoordinatingDesc) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.CoordinatingDesc) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.CoordinatingDesc.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$CoordinatingDesc$Builder");
            }
        }

        public /* synthetic */ CoordinatingDesc(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static CoordinatingDesc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_CoordinatingDesc_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CoordinatingDesc parseDelimitedFrom(InputStream inputStream) {
            return (CoordinatingDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CoordinatingDesc parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<CoordinatingDesc> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CoordinatingDesc)) {
                return super.equals(obj);
            }
            CoordinatingDesc coordinatingDesc = (CoordinatingDesc) obj;
            if (hasCanvasSize() != coordinatingDesc.hasCanvasSize()) {
                return false;
            }
            return (!hasCanvasSize() || getCanvasSize().equals(coordinatingDesc.getCanvasSize())) && this.canvasOriginType_ == coordinatingDesc.canvasOriginType_ && this.unknownFields.equals(coordinatingDesc.unknownFields);
        }

        public CanvasOriginType getCanvasOriginType() {
            CanvasOriginType valueOf = CanvasOriginType.valueOf(this.canvasOriginType_);
            return valueOf == null ? CanvasOriginType.UNRECOGNIZED : valueOf;
        }

        public int getCanvasOriginTypeValue() {
            return this.canvasOriginType_;
        }

        public Vec2 getCanvasSize() {
            Vec2 vec2 = this.canvasSize_;
            return vec2 == null ? Vec2.getDefaultInstance() : vec2;
        }

        public Vec2OrBuilder getCanvasSizeOrBuilder() {
            return getCanvasSize();
        }

        public C24062w1<CoordinatingDesc> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.canvasSize_ != null) {
                i2 = 0 + C23897n.m29270o(1, getCanvasSize());
            }
            if (this.canvasOriginType_ != CanvasOriginType.CanvasOriginTypeTopLeft.getNumber()) {
                i2 += C23897n.m29261f(2, this.canvasOriginType_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasCanvasSize() {
            return this.canvasSize_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasCanvasSize()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getCanvasSize().hashCode();
            }
            int hashCode2 = (((((hashCode * 37) + 2) * 53) + this.canvasOriginType_) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$25000 = MJComposingS12.f69256x16fe97b8;
            access$25000.mo37875c(CoordinatingDesc.class, Builder.class);
            return access$25000;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new CoordinatingDesc();
        }

        public void writeTo(C23897n nVar) {
            if (this.canvasSize_ != null) {
                nVar.mo37909P(1, getCanvasSize());
            }
            if (this.canvasOriginType_ != CanvasOriginType.CanvasOriginTypeTopLeft.getNumber()) {
                nVar.mo37907N(2, this.canvasOriginType_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ CoordinatingDesc(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(CoordinatingDesc coordinatingDesc) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(coordinatingDesc);
        }

        public static CoordinatingDesc parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private CoordinatingDesc(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static CoordinatingDesc parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CoordinatingDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static CoordinatingDesc parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public CoordinatingDesc getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static CoordinatingDesc parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private CoordinatingDesc() {
            this.memoizedIsInitialized = -1;
            this.canvasOriginType_ = 0;
        }

        public static CoordinatingDesc parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static CoordinatingDesc parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static CoordinatingDesc parseFrom(InputStream inputStream) {
            return (CoordinatingDesc) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        private CoordinatingDesc(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 10) {
                            Vec2.Builder builder = null;
                            Vec2 vec2 = this.canvasSize_;
                            builder = vec2 != null ? vec2.toBuilder() : builder;
                            Vec2 vec22 = (Vec2) lVar.mo37777v(Vec2.parser(), a0Var);
                            this.canvasSize_ = vec22;
                            if (builder != null) {
                                builder.mergeFrom(vec22);
                                this.canvasSize_ = builder.buildPartial();
                            }
                        } else if (F == 16) {
                            this.canvasOriginType_ = lVar.mo37770o();
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static CoordinatingDesc parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CoordinatingDesc) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static CoordinatingDesc parseFrom(C23856l lVar) {
            return (CoordinatingDesc) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static CoordinatingDesc parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (CoordinatingDesc) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface CoordinatingDescOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        CanvasOriginType getCanvasOriginType();

        int getCanvasOriginTypeValue();

        Vec2 getCanvasSize();

        Vec2OrBuilder getCanvasSizeOrBuilder();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        /* synthetic */ C24020s2 getUnknownFields();

        boolean hasCanvasSize();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    public static final class ImageClip extends C23872m0 implements ImageClipOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 1;
        public static final int CONTENT_CROP_RECT_FIELD_NUMBER = 4;
        public static final int CONTENT_SPATIAL_DESC_FIELD_NUMBER = 3;
        private static final ImageClip DEFAULT_INSTANCE = new ImageClip();
        public static final int DURATION_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final C24062w1<ImageClip> PARSER = new C23813c<ImageClip>() {
            public ImageClip parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new ImageClip(lVar, a0Var, (C241671) null);
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public Asset asset_;
        /* access modifiers changed from: private */
        public Rect2 contentCropRect_;
        /* access modifiers changed from: private */
        public ContentSpatialDesc contentSpatialDesc_;
        /* access modifiers changed from: private */
        public Time duration_;
        private byte memoizedIsInitialized;

        public static final class Builder extends C23872m0.C23874b<Builder> implements ImageClipOrBuilder {
            private C23844i2<Asset, Asset.Builder, AssetOrBuilder> assetBuilder_;
            private Asset asset_;
            private C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> contentCropRectBuilder_;
            private Rect2 contentCropRect_;
            private C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> contentSpatialDescBuilder_;
            private ContentSpatialDesc contentSpatialDesc_;
            private C23844i2<Time, Time.Builder, TimeOrBuilder> durationBuilder_;
            private Time duration_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            private C23844i2<Asset, Asset.Builder, AssetOrBuilder> getAssetFieldBuilder() {
                if (this.assetBuilder_ == null) {
                    this.assetBuilder_ = new C23844i2<>(getAsset(), getParentForChildren(), isClean());
                    this.asset_ = null;
                }
                return this.assetBuilder_;
            }

            private C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> getContentCropRectFieldBuilder() {
                if (this.contentCropRectBuilder_ == null) {
                    this.contentCropRectBuilder_ = new C23844i2<>(getContentCropRect(), getParentForChildren(), isClean());
                    this.contentCropRect_ = null;
                }
                return this.contentCropRectBuilder_;
            }

            private C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> getContentSpatialDescFieldBuilder() {
                if (this.contentSpatialDescBuilder_ == null) {
                    this.contentSpatialDescBuilder_ = new C23844i2<>(getContentSpatialDesc(), getParentForChildren(), isClean());
                    this.contentSpatialDesc_ = null;
                }
                return this.contentSpatialDescBuilder_;
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_ImageClip_descriptor;
            }

            private C23844i2<Time, Time.Builder, TimeOrBuilder> getDurationFieldBuilder() {
                if (this.durationBuilder_ == null) {
                    this.durationBuilder_ = new C23844i2<>(getDuration(), getParentForChildren(), isClean());
                    this.duration_ = null;
                }
                return this.durationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearAsset() {
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                    onChanged();
                } else {
                    this.asset_ = null;
                    this.assetBuilder_ = null;
                }
                return this;
            }

            public Builder clearContentCropRect() {
                if (this.contentCropRectBuilder_ == null) {
                    this.contentCropRect_ = null;
                    onChanged();
                } else {
                    this.contentCropRect_ = null;
                    this.contentCropRectBuilder_ = null;
                }
                return this;
            }

            public Builder clearContentSpatialDesc() {
                if (this.contentSpatialDescBuilder_ == null) {
                    this.contentSpatialDesc_ = null;
                    onChanged();
                } else {
                    this.contentSpatialDesc_ = null;
                    this.contentSpatialDescBuilder_ = null;
                }
                return this;
            }

            public Builder clearDuration() {
                if (this.durationBuilder_ == null) {
                    this.duration_ = null;
                    onChanged();
                } else {
                    this.duration_ = null;
                    this.durationBuilder_ = null;
                }
                return this;
            }

            public Asset getAsset() {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Asset asset = this.asset_;
                return asset == null ? Asset.getDefaultInstance() : asset;
            }

            public Asset.Builder getAssetBuilder() {
                onChanged();
                return getAssetFieldBuilder().mo37705d();
            }

            public AssetOrBuilder getAssetOrBuilder() {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Asset asset = this.asset_;
                return asset == null ? Asset.getDefaultInstance() : asset;
            }

            public Rect2 getContentCropRect() {
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var = this.contentCropRectBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Rect2 rect2 = this.contentCropRect_;
                return rect2 == null ? Rect2.getDefaultInstance() : rect2;
            }

            public Rect2.Builder getContentCropRectBuilder() {
                onChanged();
                return getContentCropRectFieldBuilder().mo37705d();
            }

            public Rect2OrBuilder getContentCropRectOrBuilder() {
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var = this.contentCropRectBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Rect2 rect2 = this.contentCropRect_;
                return rect2 == null ? Rect2.getDefaultInstance() : rect2;
            }

            public ContentSpatialDesc getContentSpatialDesc() {
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var = this.contentSpatialDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                ContentSpatialDesc contentSpatialDesc = this.contentSpatialDesc_;
                return contentSpatialDesc == null ? ContentSpatialDesc.getDefaultInstance() : contentSpatialDesc;
            }

            public ContentSpatialDesc.Builder getContentSpatialDescBuilder() {
                onChanged();
                return getContentSpatialDescFieldBuilder().mo37705d();
            }

            public ContentSpatialDescOrBuilder getContentSpatialDescOrBuilder() {
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var = this.contentSpatialDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                ContentSpatialDesc contentSpatialDesc = this.contentSpatialDesc_;
                return contentSpatialDesc == null ? ContentSpatialDesc.getDefaultInstance() : contentSpatialDesc;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_ImageClip_descriptor;
            }

            public Time getDuration() {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.durationBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Time time = this.duration_;
                return time == null ? Time.getDefaultInstance() : time;
            }

            public Time.Builder getDurationBuilder() {
                onChanged();
                return getDurationFieldBuilder().mo37705d();
            }

            public TimeOrBuilder getDurationOrBuilder() {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.durationBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Time time = this.duration_;
                return time == null ? Time.getDefaultInstance() : time;
            }

            public boolean hasAsset() {
                return (this.assetBuilder_ == null && this.asset_ == null) ? false : true;
            }

            public boolean hasContentCropRect() {
                return (this.contentCropRectBuilder_ == null && this.contentCropRect_ == null) ? false : true;
            }

            public boolean hasContentSpatialDesc() {
                return (this.contentSpatialDescBuilder_ == null && this.contentSpatialDesc_ == null) ? false : true;
            }

            public boolean hasDuration() {
                return (this.durationBuilder_ == null && this.duration_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$10700 = MJComposingS12.internal_static_MJComposingS12_ImageClip_fieldAccessorTable;
                access$10700.mo37875c(ImageClip.class, Builder.class);
                return access$10700;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAsset(Asset asset) {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    Asset asset2 = this.asset_;
                    if (asset2 != null) {
                        this.asset_ = Asset.newBuilder(asset2).mergeFrom(asset).buildPartial();
                    } else {
                        this.asset_ = asset;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(asset);
                }
                return this;
            }

            public Builder mergeContentCropRect(Rect2 rect2) {
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var = this.contentCropRectBuilder_;
                if (i2Var == null) {
                    Rect2 rect22 = this.contentCropRect_;
                    if (rect22 != null) {
                        this.contentCropRect_ = Rect2.newBuilder(rect22).mergeFrom(rect2).buildPartial();
                    } else {
                        this.contentCropRect_ = rect2;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(rect2);
                }
                return this;
            }

            public Builder mergeContentSpatialDesc(ContentSpatialDesc contentSpatialDesc) {
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var = this.contentSpatialDescBuilder_;
                if (i2Var == null) {
                    ContentSpatialDesc contentSpatialDesc2 = this.contentSpatialDesc_;
                    if (contentSpatialDesc2 != null) {
                        this.contentSpatialDesc_ = ContentSpatialDesc.newBuilder(contentSpatialDesc2).mergeFrom(contentSpatialDesc).buildPartial();
                    } else {
                        this.contentSpatialDesc_ = contentSpatialDesc;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(contentSpatialDesc);
                }
                return this;
            }

            public Builder mergeDuration(Time time) {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.durationBuilder_;
                if (i2Var == null) {
                    Time time2 = this.duration_;
                    if (time2 != null) {
                        this.duration_ = Time.newBuilder(time2).mergeFrom(time).buildPartial();
                    } else {
                        this.duration_ = time;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(time);
                }
                return this;
            }

            public Builder setAsset(Asset asset) {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    asset.getClass();
                    this.asset_ = asset;
                    onChanged();
                } else {
                    i2Var.mo37710i(asset);
                }
                return this;
            }

            public Builder setContentCropRect(Rect2 rect2) {
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var = this.contentCropRectBuilder_;
                if (i2Var == null) {
                    rect2.getClass();
                    this.contentCropRect_ = rect2;
                    onChanged();
                } else {
                    i2Var.mo37710i(rect2);
                }
                return this;
            }

            public Builder setContentSpatialDesc(ContentSpatialDesc contentSpatialDesc) {
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var = this.contentSpatialDescBuilder_;
                if (i2Var == null) {
                    contentSpatialDesc.getClass();
                    this.contentSpatialDesc_ = contentSpatialDesc;
                    onChanged();
                } else {
                    i2Var.mo37710i(contentSpatialDesc);
                }
                return this;
            }

            public Builder setDuration(Time time) {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.durationBuilder_;
                if (i2Var == null) {
                    time.getClass();
                    this.duration_ = time;
                    onChanged();
                } else {
                    i2Var.mo37710i(time);
                }
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public ImageClip build() {
                ImageClip buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public ImageClip buildPartial() {
                ImageClip imageClip = new ImageClip((C23872m0.C23874b) this, (C241671) null);
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    Asset unused = imageClip.asset_ = this.asset_;
                } else {
                    Asset unused2 = imageClip.asset_ = i2Var.mo37703b();
                }
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var2 = this.durationBuilder_;
                if (i2Var2 == null) {
                    Time unused3 = imageClip.duration_ = this.duration_;
                } else {
                    Time unused4 = imageClip.duration_ = i2Var2.mo37703b();
                }
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var3 = this.contentSpatialDescBuilder_;
                if (i2Var3 == null) {
                    ContentSpatialDesc unused5 = imageClip.contentSpatialDesc_ = this.contentSpatialDesc_;
                } else {
                    ContentSpatialDesc unused6 = imageClip.contentSpatialDesc_ = i2Var3.mo37703b();
                }
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var4 = this.contentCropRectBuilder_;
                if (i2Var4 == null) {
                    Rect2 unused7 = imageClip.contentCropRect_ = this.contentCropRect_;
                } else {
                    Rect2 unused8 = imageClip.contentCropRect_ = i2Var4.mo37703b();
                }
                onBuilt();
                return imageClip;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public ImageClip getDefaultInstanceForType() {
                return ImageClip.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            public Builder clear() {
                super.clear();
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                } else {
                    this.asset_ = null;
                    this.assetBuilder_ = null;
                }
                if (this.durationBuilder_ == null) {
                    this.duration_ = null;
                } else {
                    this.duration_ = null;
                    this.durationBuilder_ = null;
                }
                if (this.contentSpatialDescBuilder_ == null) {
                    this.contentSpatialDesc_ = null;
                } else {
                    this.contentSpatialDesc_ = null;
                    this.contentSpatialDescBuilder_ = null;
                }
                if (this.contentCropRectBuilder_ == null) {
                    this.contentCropRect_ = null;
                } else {
                    this.contentCropRect_ = null;
                    this.contentCropRectBuilder_ = null;
                }
                return this;
            }

            public Builder setAsset(Asset.Builder builder) {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    this.asset_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setContentCropRect(Rect2.Builder builder) {
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var = this.contentCropRectBuilder_;
                if (i2Var == null) {
                    this.contentCropRect_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setContentSpatialDesc(ContentSpatialDesc.Builder builder) {
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var = this.contentSpatialDescBuilder_;
                if (i2Var == null) {
                    this.contentSpatialDesc_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setDuration(Time.Builder builder) {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.durationBuilder_;
                if (i2Var == null) {
                    this.duration_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof ImageClip) {
                    return mergeFrom((ImageClip) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(ImageClip imageClip) {
                if (imageClip == ImageClip.getDefaultInstance()) {
                    return this;
                }
                if (imageClip.hasAsset()) {
                    mergeAsset(imageClip.getAsset());
                }
                if (imageClip.hasDuration()) {
                    mergeDuration(imageClip.getDuration());
                }
                if (imageClip.hasContentSpatialDesc()) {
                    mergeContentSpatialDesc(imageClip.getContentSpatialDesc());
                }
                if (imageClip.hasContentCropRect()) {
                    mergeContentCropRect(imageClip.getContentCropRect());
                }
                mergeUnknownFields(imageClip.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.ImageClip.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.ImageClip.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$ImageClip r3 = (com.tencent.maas.composing.MJComposingS12.ImageClip) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.ImageClip) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$ImageClip r4 = (com.tencent.maas.composing.MJComposingS12.ImageClip) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.ImageClip) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.ImageClip.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$ImageClip$Builder");
            }
        }

        public /* synthetic */ ImageClip(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static ImageClip getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_ImageClip_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ImageClip parseDelimitedFrom(InputStream inputStream) {
            return (ImageClip) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ImageClip parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<ImageClip> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ImageClip)) {
                return super.equals(obj);
            }
            ImageClip imageClip = (ImageClip) obj;
            if (hasAsset() != imageClip.hasAsset()) {
                return false;
            }
            if ((hasAsset() && !getAsset().equals(imageClip.getAsset())) || hasDuration() != imageClip.hasDuration()) {
                return false;
            }
            if ((hasDuration() && !getDuration().equals(imageClip.getDuration())) || hasContentSpatialDesc() != imageClip.hasContentSpatialDesc()) {
                return false;
            }
            if ((!hasContentSpatialDesc() || getContentSpatialDesc().equals(imageClip.getContentSpatialDesc())) && hasContentCropRect() == imageClip.hasContentCropRect()) {
                return (!hasContentCropRect() || getContentCropRect().equals(imageClip.getContentCropRect())) && this.unknownFields.equals(imageClip.unknownFields);
            }
            return false;
        }

        public Asset getAsset() {
            Asset asset = this.asset_;
            return asset == null ? Asset.getDefaultInstance() : asset;
        }

        public AssetOrBuilder getAssetOrBuilder() {
            return getAsset();
        }

        public Rect2 getContentCropRect() {
            Rect2 rect2 = this.contentCropRect_;
            return rect2 == null ? Rect2.getDefaultInstance() : rect2;
        }

        public Rect2OrBuilder getContentCropRectOrBuilder() {
            return getContentCropRect();
        }

        public ContentSpatialDesc getContentSpatialDesc() {
            ContentSpatialDesc contentSpatialDesc = this.contentSpatialDesc_;
            return contentSpatialDesc == null ? ContentSpatialDesc.getDefaultInstance() : contentSpatialDesc;
        }

        public ContentSpatialDescOrBuilder getContentSpatialDescOrBuilder() {
            return getContentSpatialDesc();
        }

        public Time getDuration() {
            Time time = this.duration_;
            return time == null ? Time.getDefaultInstance() : time;
        }

        public TimeOrBuilder getDurationOrBuilder() {
            return getDuration();
        }

        public C24062w1<ImageClip> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.asset_ != null) {
                i2 = 0 + C23897n.m29270o(1, getAsset());
            }
            if (this.duration_ != null) {
                i2 += C23897n.m29270o(2, getDuration());
            }
            if (this.contentSpatialDesc_ != null) {
                i2 += C23897n.m29270o(3, getContentSpatialDesc());
            }
            if (this.contentCropRect_ != null) {
                i2 += C23897n.m29270o(4, getContentCropRect());
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasAsset() {
            return this.asset_ != null;
        }

        public boolean hasContentCropRect() {
            return this.contentCropRect_ != null;
        }

        public boolean hasContentSpatialDesc() {
            return this.contentSpatialDesc_ != null;
        }

        public boolean hasDuration() {
            return this.duration_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasAsset()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getAsset().hashCode();
            }
            if (hasDuration()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getDuration().hashCode();
            }
            if (hasContentSpatialDesc()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getContentSpatialDesc().hashCode();
            }
            if (hasContentCropRect()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getContentCropRect().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$10700 = MJComposingS12.internal_static_MJComposingS12_ImageClip_fieldAccessorTable;
            access$10700.mo37875c(ImageClip.class, Builder.class);
            return access$10700;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new ImageClip();
        }

        public void writeTo(C23897n nVar) {
            if (this.asset_ != null) {
                nVar.mo37909P(1, getAsset());
            }
            if (this.duration_ != null) {
                nVar.mo37909P(2, getDuration());
            }
            if (this.contentSpatialDesc_ != null) {
                nVar.mo37909P(3, getContentSpatialDesc());
            }
            if (this.contentCropRect_ != null) {
                nVar.mo37909P(4, getContentCropRect());
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ ImageClip(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(ImageClip imageClip) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageClip);
        }

        public static ImageClip parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private ImageClip(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static ImageClip parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ImageClip) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static ImageClip parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public ImageClip getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static ImageClip parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ImageClip() {
            this.memoizedIsInitialized = -1;
        }

        public static ImageClip parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static ImageClip parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.maas.composing.MJComposingS12$Asset$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.tencent.maas.composing.MJComposingS12$Time$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.tencent.maas.composing.MJComposingS12$Rect2$Builder} */
        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v9 */
        /* JADX WARNING: type inference failed for: r5v10 */
        /* JADX WARNING: type inference failed for: r5v11 */
        /* JADX WARNING: type inference failed for: r5v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private ImageClip(com.google.protobuf.C23856l r7, com.google.protobuf.C23806a0 r8) {
            /*
                r6 = this;
                r6.<init>()
                r8.getClass()
                com.google.protobuf.s2$a r0 = com.google.protobuf.C24020s2.m29807b()
                r1 = 0
            L_0x000b:
                if (r1 != 0) goto L_0x00cb
                int r2 = r7.mo37757F()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r3 = 1
                if (r2 == 0) goto L_0x00af
                r4 = 10
                r5 = 0
                if (r2 == r4) goto L_0x008e
                r4 = 18
                if (r2 == r4) goto L_0x006d
                r4 = 26
                if (r2 == r4) goto L_0x004d
                r4 = 34
                if (r2 == r4) goto L_0x002d
                boolean r2 = r6.parseUnknownField(r7, r0, r8, r2)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r2 != 0) goto L_0x000b
                goto L_0x00af
            L_0x002d:
                com.tencent.maas.composing.MJComposingS12$Rect2 r2 = r6.contentCropRect_     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r2 == 0) goto L_0x0035
                com.tencent.maas.composing.MJComposingS12$Rect2$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
            L_0x0035:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Rect2.parser()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$Rect2 r2 = (com.tencent.maas.composing.MJComposingS12.Rect2) r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.contentCropRect_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Rect2) r2)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$Rect2 r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.contentCropRect_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                goto L_0x000b
            L_0x004d:
                com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc r2 = r6.contentSpatialDesc_     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r2 == 0) goto L_0x0055
                com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
            L_0x0055:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc.parser()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc r2 = (com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc) r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.contentSpatialDesc_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc) r2)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.contentSpatialDesc_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                goto L_0x000b
            L_0x006d:
                com.tencent.maas.composing.MJComposingS12$Time r2 = r6.duration_     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r2 == 0) goto L_0x0075
                com.tencent.maas.composing.MJComposingS12$Time$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
            L_0x0075:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Time.parser()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$Time r2 = (com.tencent.maas.composing.MJComposingS12.Time) r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.duration_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Time) r2)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$Time r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.duration_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                goto L_0x000b
            L_0x008e:
                com.tencent.maas.composing.MJComposingS12$Asset r2 = r6.asset_     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r2 == 0) goto L_0x0096
                com.tencent.maas.composing.MJComposingS12$Asset$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
            L_0x0096:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Asset.parser()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$Asset r2 = (com.tencent.maas.composing.MJComposingS12.Asset) r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.asset_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Asset) r2)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$Asset r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.asset_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                goto L_0x000b
            L_0x00af:
                r1 = 1
                goto L_0x000b
            L_0x00b2:
                r7 = move-exception
                goto L_0x00c1
            L_0x00b4:
                r7 = move-exception
                com.google.protobuf.p0 r8 = new com.google.protobuf.p0     // Catch:{ all -> 0x00b2 }
                r8.<init>((java.io.IOException) r7)     // Catch:{ all -> 0x00b2 }
                r8.f68530d = r6     // Catch:{ all -> 0x00b2 }
                throw r8     // Catch:{ all -> 0x00b2 }
            L_0x00bd:
                r7 = move-exception
                r7.f68530d = r6     // Catch:{ all -> 0x00b2 }
                throw r7     // Catch:{ all -> 0x00b2 }
            L_0x00c1:
                com.google.protobuf.s2 r8 = r0.build()
                r6.unknownFields = r8
                r6.makeExtensionsImmutable()
                throw r7
            L_0x00cb:
                com.google.protobuf.s2 r7 = r0.build()
                r6.unknownFields = r7
                r6.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.ImageClip.<init>(com.google.protobuf.l, com.google.protobuf.a0):void");
        }

        public static ImageClip parseFrom(InputStream inputStream) {
            return (ImageClip) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static ImageClip parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ImageClip) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static ImageClip parseFrom(C23856l lVar) {
            return (ImageClip) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static ImageClip parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (ImageClip) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface ImageClipOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        Asset getAsset();

        AssetOrBuilder getAssetOrBuilder();

        Rect2 getContentCropRect();

        Rect2OrBuilder getContentCropRectOrBuilder();

        ContentSpatialDesc getContentSpatialDesc();

        ContentSpatialDescOrBuilder getContentSpatialDescOrBuilder();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        Time getDuration();

        TimeOrBuilder getDurationOrBuilder();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        /* synthetic */ C24020s2 getUnknownFields();

        boolean hasAsset();

        boolean hasContentCropRect();

        boolean hasContentSpatialDesc();

        boolean hasDuration();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    public static final class LayerSpatialDesc extends C23872m0 implements LayerSpatialDescOrBuilder {
        public static final int ANCHOR_POINT_FIELD_NUMBER = 4;
        private static final LayerSpatialDesc DEFAULT_INSTANCE = new LayerSpatialDesc();
        /* access modifiers changed from: private */
        public static final C24062w1<LayerSpatialDesc> PARSER = new C23813c<LayerSpatialDesc>() {
            public LayerSpatialDesc parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new LayerSpatialDesc(lVar, a0Var, (C241671) null);
            }
        };
        public static final int POSITION_FIELD_NUMBER = 3;
        public static final int ROTATION_FIELD_NUMBER = 2;
        public static final int SCALE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public Vec2 anchorPoint_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public Vec2 position_;
        /* access modifiers changed from: private */
        public float rotation_;
        /* access modifiers changed from: private */
        public float scale_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements LayerSpatialDescOrBuilder {
            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> anchorPointBuilder_;
            private Vec2 anchorPoint_;
            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> positionBuilder_;
            private Vec2 position_;
            private float rotation_;
            private float scale_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> getAnchorPointFieldBuilder() {
                if (this.anchorPointBuilder_ == null) {
                    this.anchorPointBuilder_ = new C23844i2<>(getAnchorPoint(), getParentForChildren(), isClean());
                    this.anchorPoint_ = null;
                }
                return this.anchorPointBuilder_;
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_LayerSpatialDesc_descriptor;
            }

            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> getPositionFieldBuilder() {
                if (this.positionBuilder_ == null) {
                    this.positionBuilder_ = new C23844i2<>(getPosition(), getParentForChildren(), isClean());
                    this.position_ = null;
                }
                return this.positionBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearAnchorPoint() {
                if (this.anchorPointBuilder_ == null) {
                    this.anchorPoint_ = null;
                    onChanged();
                } else {
                    this.anchorPoint_ = null;
                    this.anchorPointBuilder_ = null;
                }
                return this;
            }

            public Builder clearPosition() {
                if (this.positionBuilder_ == null) {
                    this.position_ = null;
                    onChanged();
                } else {
                    this.position_ = null;
                    this.positionBuilder_ = null;
                }
                return this;
            }

            public Builder clearRotation() {
                this.rotation_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearScale() {
                this.scale_ = 0.0f;
                onChanged();
                return this;
            }

            public Vec2 getAnchorPoint() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.anchorPointBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Vec2 vec2 = this.anchorPoint_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public Vec2.Builder getAnchorPointBuilder() {
                onChanged();
                return getAnchorPointFieldBuilder().mo37705d();
            }

            public Vec2OrBuilder getAnchorPointOrBuilder() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.anchorPointBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Vec2 vec2 = this.anchorPoint_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_LayerSpatialDesc_descriptor;
            }

            public Vec2 getPosition() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.positionBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Vec2 vec2 = this.position_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public Vec2.Builder getPositionBuilder() {
                onChanged();
                return getPositionFieldBuilder().mo37705d();
            }

            public Vec2OrBuilder getPositionOrBuilder() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.positionBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Vec2 vec2 = this.position_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public float getRotation() {
                return this.rotation_;
            }

            public float getScale() {
                return this.scale_;
            }

            public boolean hasAnchorPoint() {
                return (this.anchorPointBuilder_ == null && this.anchorPoint_ == null) ? false : true;
            }

            public boolean hasPosition() {
                return (this.positionBuilder_ == null && this.position_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$9400 = MJComposingS12.f69257xfaf293ba;
                access$9400.mo37875c(LayerSpatialDesc.class, Builder.class);
                return access$9400;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAnchorPoint(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.anchorPointBuilder_;
                if (i2Var == null) {
                    Vec2 vec22 = this.anchorPoint_;
                    if (vec22 != null) {
                        this.anchorPoint_ = Vec2.newBuilder(vec22).mergeFrom(vec2).buildPartial();
                    } else {
                        this.anchorPoint_ = vec2;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(vec2);
                }
                return this;
            }

            public Builder mergePosition(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.positionBuilder_;
                if (i2Var == null) {
                    Vec2 vec22 = this.position_;
                    if (vec22 != null) {
                        this.position_ = Vec2.newBuilder(vec22).mergeFrom(vec2).buildPartial();
                    } else {
                        this.position_ = vec2;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(vec2);
                }
                return this;
            }

            public Builder setAnchorPoint(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.anchorPointBuilder_;
                if (i2Var == null) {
                    vec2.getClass();
                    this.anchorPoint_ = vec2;
                    onChanged();
                } else {
                    i2Var.mo37710i(vec2);
                }
                return this;
            }

            public Builder setPosition(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.positionBuilder_;
                if (i2Var == null) {
                    vec2.getClass();
                    this.position_ = vec2;
                    onChanged();
                } else {
                    i2Var.mo37710i(vec2);
                }
                return this;
            }

            public Builder setRotation(float f) {
                this.rotation_ = f;
                onChanged();
                return this;
            }

            public Builder setScale(float f) {
                this.scale_ = f;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public LayerSpatialDesc build() {
                LayerSpatialDesc buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public LayerSpatialDesc buildPartial() {
                LayerSpatialDesc layerSpatialDesc = new LayerSpatialDesc((C23872m0.C23874b) this, (C241671) null);
                float unused = layerSpatialDesc.scale_ = this.scale_;
                float unused2 = layerSpatialDesc.rotation_ = this.rotation_;
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.positionBuilder_;
                if (i2Var == null) {
                    Vec2 unused3 = layerSpatialDesc.position_ = this.position_;
                } else {
                    Vec2 unused4 = layerSpatialDesc.position_ = i2Var.mo37703b();
                }
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var2 = this.anchorPointBuilder_;
                if (i2Var2 == null) {
                    Vec2 unused5 = layerSpatialDesc.anchorPoint_ = this.anchorPoint_;
                } else {
                    Vec2 unused6 = layerSpatialDesc.anchorPoint_ = i2Var2.mo37703b();
                }
                onBuilt();
                return layerSpatialDesc;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public LayerSpatialDesc getDefaultInstanceForType() {
                return LayerSpatialDesc.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            public Builder clear() {
                super.clear();
                this.scale_ = 0.0f;
                this.rotation_ = 0.0f;
                if (this.positionBuilder_ == null) {
                    this.position_ = null;
                } else {
                    this.position_ = null;
                    this.positionBuilder_ = null;
                }
                if (this.anchorPointBuilder_ == null) {
                    this.anchorPoint_ = null;
                } else {
                    this.anchorPoint_ = null;
                    this.anchorPointBuilder_ = null;
                }
                return this;
            }

            public Builder setAnchorPoint(Vec2.Builder builder) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.anchorPointBuilder_;
                if (i2Var == null) {
                    this.anchorPoint_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setPosition(Vec2.Builder builder) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.positionBuilder_;
                if (i2Var == null) {
                    this.position_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof LayerSpatialDesc) {
                    return mergeFrom((LayerSpatialDesc) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(LayerSpatialDesc layerSpatialDesc) {
                if (layerSpatialDesc == LayerSpatialDesc.getDefaultInstance()) {
                    return this;
                }
                if (layerSpatialDesc.getScale() != 0.0f) {
                    setScale(layerSpatialDesc.getScale());
                }
                if (layerSpatialDesc.getRotation() != 0.0f) {
                    setRotation(layerSpatialDesc.getRotation());
                }
                if (layerSpatialDesc.hasPosition()) {
                    mergePosition(layerSpatialDesc.getPosition());
                }
                if (layerSpatialDesc.hasAnchorPoint()) {
                    mergeAnchorPoint(layerSpatialDesc.getAnchorPoint());
                }
                mergeUnknownFields(layerSpatialDesc.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc r3 = (com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc r4 = (com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc$Builder");
            }
        }

        public /* synthetic */ LayerSpatialDesc(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static LayerSpatialDesc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_LayerSpatialDesc_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LayerSpatialDesc parseDelimitedFrom(InputStream inputStream) {
            return (LayerSpatialDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LayerSpatialDesc parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<LayerSpatialDesc> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LayerSpatialDesc)) {
                return super.equals(obj);
            }
            LayerSpatialDesc layerSpatialDesc = (LayerSpatialDesc) obj;
            if (Float.floatToIntBits(getScale()) != Float.floatToIntBits(layerSpatialDesc.getScale()) || Float.floatToIntBits(getRotation()) != Float.floatToIntBits(layerSpatialDesc.getRotation()) || hasPosition() != layerSpatialDesc.hasPosition()) {
                return false;
            }
            if ((!hasPosition() || getPosition().equals(layerSpatialDesc.getPosition())) && hasAnchorPoint() == layerSpatialDesc.hasAnchorPoint()) {
                return (!hasAnchorPoint() || getAnchorPoint().equals(layerSpatialDesc.getAnchorPoint())) && this.unknownFields.equals(layerSpatialDesc.unknownFields);
            }
            return false;
        }

        public Vec2 getAnchorPoint() {
            Vec2 vec2 = this.anchorPoint_;
            return vec2 == null ? Vec2.getDefaultInstance() : vec2;
        }

        public Vec2OrBuilder getAnchorPointOrBuilder() {
            return getAnchorPoint();
        }

        public C24062w1<LayerSpatialDesc> getParserForType() {
            return PARSER;
        }

        public Vec2 getPosition() {
            Vec2 vec2 = this.position_;
            return vec2 == null ? Vec2.getDefaultInstance() : vec2;
        }

        public Vec2OrBuilder getPositionOrBuilder() {
            return getPosition();
        }

        public float getRotation() {
            return this.rotation_;
        }

        public float getScale() {
            return this.scale_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            float f = this.scale_;
            if (f != 0.0f) {
                i2 = 0 + C23897n.m29264i(1, f);
            }
            float f2 = this.rotation_;
            if (f2 != 0.0f) {
                i2 += C23897n.m29264i(2, f2);
            }
            if (this.position_ != null) {
                i2 += C23897n.m29270o(3, getPosition());
            }
            if (this.anchorPoint_ != null) {
                i2 += C23897n.m29270o(4, getAnchorPoint());
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasAnchorPoint() {
            return this.anchorPoint_ != null;
        }

        public boolean hasPosition() {
            return this.position_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((C82986r.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getScale())) * 37) + 2) * 53) + Float.floatToIntBits(getRotation());
            if (hasPosition()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getPosition().hashCode();
            }
            if (hasAnchorPoint()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getAnchorPoint().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$9400 = MJComposingS12.f69257xfaf293ba;
            access$9400.mo37875c(LayerSpatialDesc.class, Builder.class);
            return access$9400;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new LayerSpatialDesc();
        }

        public void writeTo(C23897n nVar) {
            float f = this.scale_;
            if (f != 0.0f) {
                nVar.mo37906M(1, f);
            }
            float f2 = this.rotation_;
            if (f2 != 0.0f) {
                nVar.mo37906M(2, f2);
            }
            if (this.position_ != null) {
                nVar.mo37909P(3, getPosition());
            }
            if (this.anchorPoint_ != null) {
                nVar.mo37909P(4, getAnchorPoint());
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ LayerSpatialDesc(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(LayerSpatialDesc layerSpatialDesc) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(layerSpatialDesc);
        }

        public static LayerSpatialDesc parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private LayerSpatialDesc(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static LayerSpatialDesc parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (LayerSpatialDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static LayerSpatialDesc parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public LayerSpatialDesc getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static LayerSpatialDesc parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LayerSpatialDesc() {
            this.memoizedIsInitialized = -1;
        }

        public static LayerSpatialDesc parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static LayerSpatialDesc parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        private LayerSpatialDesc(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 13) {
                            this.scale_ = lVar.mo37773r();
                        } else if (F != 21) {
                            Vec2.Builder builder = null;
                            if (F == 26) {
                                Vec2 vec2 = this.position_;
                                builder = vec2 != null ? vec2.toBuilder() : builder;
                                Vec2 vec22 = (Vec2) lVar.mo37777v(Vec2.parser(), a0Var);
                                this.position_ = vec22;
                                if (builder != null) {
                                    builder.mergeFrom(vec22);
                                    this.position_ = builder.buildPartial();
                                }
                            } else if (F == 34) {
                                Vec2 vec23 = this.anchorPoint_;
                                builder = vec23 != null ? vec23.toBuilder() : builder;
                                Vec2 vec24 = (Vec2) lVar.mo37777v(Vec2.parser(), a0Var);
                                this.anchorPoint_ = vec24;
                                if (builder != null) {
                                    builder.mergeFrom(vec24);
                                    this.anchorPoint_ = builder.buildPartial();
                                }
                            } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                            }
                        } else {
                            this.rotation_ = lVar.mo37773r();
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static LayerSpatialDesc parseFrom(InputStream inputStream) {
            return (LayerSpatialDesc) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static LayerSpatialDesc parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (LayerSpatialDesc) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static LayerSpatialDesc parseFrom(C23856l lVar) {
            return (LayerSpatialDesc) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static LayerSpatialDesc parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (LayerSpatialDesc) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface LayerSpatialDescOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        Vec2 getAnchorPoint();

        Vec2OrBuilder getAnchorPointOrBuilder();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        Vec2 getPosition();

        Vec2OrBuilder getPositionOrBuilder();

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        float getRotation();

        float getScale();

        /* synthetic */ C24020s2 getUnknownFields();

        boolean hasAnchorPoint();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasPosition();

        /* synthetic */ boolean isInitialized();
    }

    public static final class LayerStyle extends C23872m0 implements LayerStyleOrBuilder {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 4;
        public static final int BORDER_COLOR_FIELD_NUMBER = 2;
        public static final int BORDER_WIDTH_FIELD_NUMBER = 3;
        public static final int CORNER_RADIUS_FIELD_NUMBER = 1;
        private static final LayerStyle DEFAULT_INSTANCE = new LayerStyle();
        public static final int EDGE_INSETS_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final C24062w1<LayerStyle> PARSER = new C23813c<LayerStyle>() {
            public LayerStyle parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new LayerStyle(lVar, a0Var, (C241671) null);
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public Color backgroundColor_;
        /* access modifiers changed from: private */
        public Color borderColor_;
        /* access modifiers changed from: private */
        public float borderWidth_;
        /* access modifiers changed from: private */
        public float cornerRadius_;
        /* access modifiers changed from: private */
        public Vec4 edgeInsets_;
        private byte memoizedIsInitialized;

        public static final class Builder extends C23872m0.C23874b<Builder> implements LayerStyleOrBuilder {
            private C23844i2<Color, Color.Builder, ColorOrBuilder> backgroundColorBuilder_;
            private Color backgroundColor_;
            private C23844i2<Color, Color.Builder, ColorOrBuilder> borderColorBuilder_;
            private Color borderColor_;
            private float borderWidth_;
            private float cornerRadius_;
            private C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> edgeInsetsBuilder_;
            private Vec4 edgeInsets_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            private C23844i2<Color, Color.Builder, ColorOrBuilder> getBackgroundColorFieldBuilder() {
                if (this.backgroundColorBuilder_ == null) {
                    this.backgroundColorBuilder_ = new C23844i2<>(getBackgroundColor(), getParentForChildren(), isClean());
                    this.backgroundColor_ = null;
                }
                return this.backgroundColorBuilder_;
            }

            private C23844i2<Color, Color.Builder, ColorOrBuilder> getBorderColorFieldBuilder() {
                if (this.borderColorBuilder_ == null) {
                    this.borderColorBuilder_ = new C23844i2<>(getBorderColor(), getParentForChildren(), isClean());
                    this.borderColor_ = null;
                }
                return this.borderColorBuilder_;
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_LayerStyle_descriptor;
            }

            private C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> getEdgeInsetsFieldBuilder() {
                if (this.edgeInsetsBuilder_ == null) {
                    this.edgeInsetsBuilder_ = new C23844i2<>(getEdgeInsets(), getParentForChildren(), isClean());
                    this.edgeInsets_ = null;
                }
                return this.edgeInsetsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearBackgroundColor() {
                if (this.backgroundColorBuilder_ == null) {
                    this.backgroundColor_ = null;
                    onChanged();
                } else {
                    this.backgroundColor_ = null;
                    this.backgroundColorBuilder_ = null;
                }
                return this;
            }

            public Builder clearBorderColor() {
                if (this.borderColorBuilder_ == null) {
                    this.borderColor_ = null;
                    onChanged();
                } else {
                    this.borderColor_ = null;
                    this.borderColorBuilder_ = null;
                }
                return this;
            }

            public Builder clearBorderWidth() {
                this.borderWidth_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearCornerRadius() {
                this.cornerRadius_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearEdgeInsets() {
                if (this.edgeInsetsBuilder_ == null) {
                    this.edgeInsets_ = null;
                    onChanged();
                } else {
                    this.edgeInsets_ = null;
                    this.edgeInsetsBuilder_ = null;
                }
                return this;
            }

            public Color getBackgroundColor() {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.backgroundColorBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Color color = this.backgroundColor_;
                return color == null ? Color.getDefaultInstance() : color;
            }

            public Color.Builder getBackgroundColorBuilder() {
                onChanged();
                return getBackgroundColorFieldBuilder().mo37705d();
            }

            public ColorOrBuilder getBackgroundColorOrBuilder() {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.backgroundColorBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Color color = this.backgroundColor_;
                return color == null ? Color.getDefaultInstance() : color;
            }

            public Color getBorderColor() {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.borderColorBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Color color = this.borderColor_;
                return color == null ? Color.getDefaultInstance() : color;
            }

            public Color.Builder getBorderColorBuilder() {
                onChanged();
                return getBorderColorFieldBuilder().mo37705d();
            }

            public ColorOrBuilder getBorderColorOrBuilder() {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.borderColorBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Color color = this.borderColor_;
                return color == null ? Color.getDefaultInstance() : color;
            }

            public float getBorderWidth() {
                return this.borderWidth_;
            }

            public float getCornerRadius() {
                return this.cornerRadius_;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_LayerStyle_descriptor;
            }

            public Vec4 getEdgeInsets() {
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var = this.edgeInsetsBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Vec4 vec4 = this.edgeInsets_;
                return vec4 == null ? Vec4.getDefaultInstance() : vec4;
            }

            public Vec4.Builder getEdgeInsetsBuilder() {
                onChanged();
                return getEdgeInsetsFieldBuilder().mo37705d();
            }

            public Vec4OrBuilder getEdgeInsetsOrBuilder() {
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var = this.edgeInsetsBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Vec4 vec4 = this.edgeInsets_;
                return vec4 == null ? Vec4.getDefaultInstance() : vec4;
            }

            public boolean hasBackgroundColor() {
                return (this.backgroundColorBuilder_ == null && this.backgroundColor_ == null) ? false : true;
            }

            public boolean hasBorderColor() {
                return (this.borderColorBuilder_ == null && this.borderColor_ == null) ? false : true;
            }

            public boolean hasEdgeInsets() {
                return (this.edgeInsetsBuilder_ == null && this.edgeInsets_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$20400 = MJComposingS12.internal_static_MJComposingS12_LayerStyle_fieldAccessorTable;
                access$20400.mo37875c(LayerStyle.class, Builder.class);
                return access$20400;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBackgroundColor(Color color) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.backgroundColorBuilder_;
                if (i2Var == null) {
                    Color color2 = this.backgroundColor_;
                    if (color2 != null) {
                        this.backgroundColor_ = Color.newBuilder(color2).mergeFrom(color).buildPartial();
                    } else {
                        this.backgroundColor_ = color;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(color);
                }
                return this;
            }

            public Builder mergeBorderColor(Color color) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.borderColorBuilder_;
                if (i2Var == null) {
                    Color color2 = this.borderColor_;
                    if (color2 != null) {
                        this.borderColor_ = Color.newBuilder(color2).mergeFrom(color).buildPartial();
                    } else {
                        this.borderColor_ = color;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(color);
                }
                return this;
            }

            public Builder mergeEdgeInsets(Vec4 vec4) {
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var = this.edgeInsetsBuilder_;
                if (i2Var == null) {
                    Vec4 vec42 = this.edgeInsets_;
                    if (vec42 != null) {
                        this.edgeInsets_ = Vec4.newBuilder(vec42).mergeFrom(vec4).buildPartial();
                    } else {
                        this.edgeInsets_ = vec4;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(vec4);
                }
                return this;
            }

            public Builder setBackgroundColor(Color color) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.backgroundColorBuilder_;
                if (i2Var == null) {
                    color.getClass();
                    this.backgroundColor_ = color;
                    onChanged();
                } else {
                    i2Var.mo37710i(color);
                }
                return this;
            }

            public Builder setBorderColor(Color color) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.borderColorBuilder_;
                if (i2Var == null) {
                    color.getClass();
                    this.borderColor_ = color;
                    onChanged();
                } else {
                    i2Var.mo37710i(color);
                }
                return this;
            }

            public Builder setBorderWidth(float f) {
                this.borderWidth_ = f;
                onChanged();
                return this;
            }

            public Builder setCornerRadius(float f) {
                this.cornerRadius_ = f;
                onChanged();
                return this;
            }

            public Builder setEdgeInsets(Vec4 vec4) {
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var = this.edgeInsetsBuilder_;
                if (i2Var == null) {
                    vec4.getClass();
                    this.edgeInsets_ = vec4;
                    onChanged();
                } else {
                    i2Var.mo37710i(vec4);
                }
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public LayerStyle build() {
                LayerStyle buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public LayerStyle buildPartial() {
                LayerStyle layerStyle = new LayerStyle((C23872m0.C23874b) this, (C241671) null);
                float unused = layerStyle.cornerRadius_ = this.cornerRadius_;
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.borderColorBuilder_;
                if (i2Var == null) {
                    Color unused2 = layerStyle.borderColor_ = this.borderColor_;
                } else {
                    Color unused3 = layerStyle.borderColor_ = i2Var.mo37703b();
                }
                float unused4 = layerStyle.borderWidth_ = this.borderWidth_;
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var2 = this.backgroundColorBuilder_;
                if (i2Var2 == null) {
                    Color unused5 = layerStyle.backgroundColor_ = this.backgroundColor_;
                } else {
                    Color unused6 = layerStyle.backgroundColor_ = i2Var2.mo37703b();
                }
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var3 = this.edgeInsetsBuilder_;
                if (i2Var3 == null) {
                    Vec4 unused7 = layerStyle.edgeInsets_ = this.edgeInsets_;
                } else {
                    Vec4 unused8 = layerStyle.edgeInsets_ = i2Var3.mo37703b();
                }
                onBuilt();
                return layerStyle;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public LayerStyle getDefaultInstanceForType() {
                return LayerStyle.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            public Builder clear() {
                super.clear();
                this.cornerRadius_ = 0.0f;
                if (this.borderColorBuilder_ == null) {
                    this.borderColor_ = null;
                } else {
                    this.borderColor_ = null;
                    this.borderColorBuilder_ = null;
                }
                this.borderWidth_ = 0.0f;
                if (this.backgroundColorBuilder_ == null) {
                    this.backgroundColor_ = null;
                } else {
                    this.backgroundColor_ = null;
                    this.backgroundColorBuilder_ = null;
                }
                if (this.edgeInsetsBuilder_ == null) {
                    this.edgeInsets_ = null;
                } else {
                    this.edgeInsets_ = null;
                    this.edgeInsetsBuilder_ = null;
                }
                return this;
            }

            public Builder setBackgroundColor(Color.Builder builder) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.backgroundColorBuilder_;
                if (i2Var == null) {
                    this.backgroundColor_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setBorderColor(Color.Builder builder) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.borderColorBuilder_;
                if (i2Var == null) {
                    this.borderColor_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setEdgeInsets(Vec4.Builder builder) {
                C23844i2<Vec4, Vec4.Builder, Vec4OrBuilder> i2Var = this.edgeInsetsBuilder_;
                if (i2Var == null) {
                    this.edgeInsets_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof LayerStyle) {
                    return mergeFrom((LayerStyle) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(LayerStyle layerStyle) {
                if (layerStyle == LayerStyle.getDefaultInstance()) {
                    return this;
                }
                if (layerStyle.getCornerRadius() != 0.0f) {
                    setCornerRadius(layerStyle.getCornerRadius());
                }
                if (layerStyle.hasBorderColor()) {
                    mergeBorderColor(layerStyle.getBorderColor());
                }
                if (layerStyle.getBorderWidth() != 0.0f) {
                    setBorderWidth(layerStyle.getBorderWidth());
                }
                if (layerStyle.hasBackgroundColor()) {
                    mergeBackgroundColor(layerStyle.getBackgroundColor());
                }
                if (layerStyle.hasEdgeInsets()) {
                    mergeEdgeInsets(layerStyle.getEdgeInsets());
                }
                mergeUnknownFields(layerStyle.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.LayerStyle.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.LayerStyle.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$LayerStyle r3 = (com.tencent.maas.composing.MJComposingS12.LayerStyle) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.LayerStyle) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$LayerStyle r4 = (com.tencent.maas.composing.MJComposingS12.LayerStyle) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.LayerStyle) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.LayerStyle.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$LayerStyle$Builder");
            }
        }

        public /* synthetic */ LayerStyle(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static LayerStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_LayerStyle_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LayerStyle parseDelimitedFrom(InputStream inputStream) {
            return (LayerStyle) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LayerStyle parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<LayerStyle> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LayerStyle)) {
                return super.equals(obj);
            }
            LayerStyle layerStyle = (LayerStyle) obj;
            if (Float.floatToIntBits(getCornerRadius()) != Float.floatToIntBits(layerStyle.getCornerRadius()) || hasBorderColor() != layerStyle.hasBorderColor()) {
                return false;
            }
            if ((hasBorderColor() && !getBorderColor().equals(layerStyle.getBorderColor())) || Float.floatToIntBits(getBorderWidth()) != Float.floatToIntBits(layerStyle.getBorderWidth()) || hasBackgroundColor() != layerStyle.hasBackgroundColor()) {
                return false;
            }
            if ((!hasBackgroundColor() || getBackgroundColor().equals(layerStyle.getBackgroundColor())) && hasEdgeInsets() == layerStyle.hasEdgeInsets()) {
                return (!hasEdgeInsets() || getEdgeInsets().equals(layerStyle.getEdgeInsets())) && this.unknownFields.equals(layerStyle.unknownFields);
            }
            return false;
        }

        public Color getBackgroundColor() {
            Color color = this.backgroundColor_;
            return color == null ? Color.getDefaultInstance() : color;
        }

        public ColorOrBuilder getBackgroundColorOrBuilder() {
            return getBackgroundColor();
        }

        public Color getBorderColor() {
            Color color = this.borderColor_;
            return color == null ? Color.getDefaultInstance() : color;
        }

        public ColorOrBuilder getBorderColorOrBuilder() {
            return getBorderColor();
        }

        public float getBorderWidth() {
            return this.borderWidth_;
        }

        public float getCornerRadius() {
            return this.cornerRadius_;
        }

        public Vec4 getEdgeInsets() {
            Vec4 vec4 = this.edgeInsets_;
            return vec4 == null ? Vec4.getDefaultInstance() : vec4;
        }

        public Vec4OrBuilder getEdgeInsetsOrBuilder() {
            return getEdgeInsets();
        }

        public C24062w1<LayerStyle> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            float f = this.cornerRadius_;
            if (f != 0.0f) {
                i2 = 0 + C23897n.m29264i(1, f);
            }
            if (this.borderColor_ != null) {
                i2 += C23897n.m29270o(2, getBorderColor());
            }
            float f2 = this.borderWidth_;
            if (f2 != 0.0f) {
                i2 += C23897n.m29264i(3, f2);
            }
            if (this.backgroundColor_ != null) {
                i2 += C23897n.m29270o(4, getBackgroundColor());
            }
            if (this.edgeInsets_ != null) {
                i2 += C23897n.m29270o(5, getEdgeInsets());
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasBackgroundColor() {
            return this.backgroundColor_ != null;
        }

        public boolean hasBorderColor() {
            return this.borderColor_ != null;
        }

        public boolean hasEdgeInsets() {
            return this.edgeInsets_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((C82986r.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getCornerRadius());
            if (hasBorderColor()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getBorderColor().hashCode();
            }
            int floatToIntBits = (((hashCode * 37) + 3) * 53) + Float.floatToIntBits(getBorderWidth());
            if (hasBackgroundColor()) {
                floatToIntBits = (((floatToIntBits * 37) + 4) * 53) + getBackgroundColor().hashCode();
            }
            if (hasEdgeInsets()) {
                floatToIntBits = (((floatToIntBits * 37) + 5) * 53) + getEdgeInsets().hashCode();
            }
            int hashCode2 = (floatToIntBits * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$20400 = MJComposingS12.internal_static_MJComposingS12_LayerStyle_fieldAccessorTable;
            access$20400.mo37875c(LayerStyle.class, Builder.class);
            return access$20400;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new LayerStyle();
        }

        public void writeTo(C23897n nVar) {
            float f = this.cornerRadius_;
            if (f != 0.0f) {
                nVar.mo37906M(1, f);
            }
            if (this.borderColor_ != null) {
                nVar.mo37909P(2, getBorderColor());
            }
            float f2 = this.borderWidth_;
            if (f2 != 0.0f) {
                nVar.mo37906M(3, f2);
            }
            if (this.backgroundColor_ != null) {
                nVar.mo37909P(4, getBackgroundColor());
            }
            if (this.edgeInsets_ != null) {
                nVar.mo37909P(5, getEdgeInsets());
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ LayerStyle(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(LayerStyle layerStyle) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(layerStyle);
        }

        public static LayerStyle parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private LayerStyle(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static LayerStyle parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (LayerStyle) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static LayerStyle parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public LayerStyle getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static LayerStyle parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LayerStyle() {
            this.memoizedIsInitialized = -1;
        }

        public static LayerStyle parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static LayerStyle parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.maas.composing.MJComposingS12$Color$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.tencent.maas.composing.MJComposingS12$Color$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.tencent.maas.composing.MJComposingS12$Vec4$Builder} */
        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v7 */
        /* JADX WARNING: type inference failed for: r5v8 */
        /* JADX WARNING: type inference failed for: r5v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private LayerStyle(com.google.protobuf.C23856l r7, com.google.protobuf.C23806a0 r8) {
            /*
                r6 = this;
                r6.<init>()
                r8.getClass()
                com.google.protobuf.s2$a r0 = com.google.protobuf.C24020s2.m29807b()
                r1 = 0
            L_0x000b:
                if (r1 != 0) goto L_0x00bd
                int r2 = r7.mo37757F()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                r3 = 1
                if (r2 == 0) goto L_0x00a1
                r4 = 13
                if (r2 == r4) goto L_0x0099
                r4 = 18
                r5 = 0
                if (r2 == r4) goto L_0x0078
                r4 = 29
                if (r2 == r4) goto L_0x0071
                r4 = 34
                if (r2 == r4) goto L_0x0051
                r4 = 42
                if (r2 == r4) goto L_0x0031
                boolean r2 = r6.parseUnknownField(r7, r0, r8, r2)     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                if (r2 != 0) goto L_0x000b
                goto L_0x00a1
            L_0x0031:
                com.tencent.maas.composing.MJComposingS12$Vec4 r2 = r6.edgeInsets_     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                if (r2 == 0) goto L_0x0039
                com.tencent.maas.composing.MJComposingS12$Vec4$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
            L_0x0039:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Vec4.parser()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                com.tencent.maas.composing.MJComposingS12$Vec4 r2 = (com.tencent.maas.composing.MJComposingS12.Vec4) r2     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                r6.edgeInsets_ = r2     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Vec4) r2)     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                com.tencent.maas.composing.MJComposingS12$Vec4 r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                r6.edgeInsets_ = r2     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                goto L_0x000b
            L_0x0051:
                com.tencent.maas.composing.MJComposingS12$Color r2 = r6.backgroundColor_     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                if (r2 == 0) goto L_0x0059
                com.tencent.maas.composing.MJComposingS12$Color$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
            L_0x0059:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Color.parser()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                com.tencent.maas.composing.MJComposingS12$Color r2 = (com.tencent.maas.composing.MJComposingS12.Color) r2     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                r6.backgroundColor_ = r2     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Color) r2)     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                com.tencent.maas.composing.MJComposingS12$Color r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                r6.backgroundColor_ = r2     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                goto L_0x000b
            L_0x0071:
                float r2 = r7.mo37773r()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                r6.borderWidth_ = r2     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                goto L_0x000b
            L_0x0078:
                com.tencent.maas.composing.MJComposingS12$Color r2 = r6.borderColor_     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                if (r2 == 0) goto L_0x0080
                com.tencent.maas.composing.MJComposingS12$Color$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
            L_0x0080:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Color.parser()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                com.tencent.maas.composing.MJComposingS12$Color r2 = (com.tencent.maas.composing.MJComposingS12.Color) r2     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                r6.borderColor_ = r2     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Color) r2)     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                com.tencent.maas.composing.MJComposingS12$Color r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                r6.borderColor_ = r2     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                goto L_0x000b
            L_0x0099:
                float r2 = r7.mo37773r()     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                r6.cornerRadius_ = r2     // Catch:{ p0 -> 0x00af, IOException -> 0x00a6 }
                goto L_0x000b
            L_0x00a1:
                r1 = 1
                goto L_0x000b
            L_0x00a4:
                r7 = move-exception
                goto L_0x00b3
            L_0x00a6:
                r7 = move-exception
                com.google.protobuf.p0 r8 = new com.google.protobuf.p0     // Catch:{ all -> 0x00a4 }
                r8.<init>((java.io.IOException) r7)     // Catch:{ all -> 0x00a4 }
                r8.f68530d = r6     // Catch:{ all -> 0x00a4 }
                throw r8     // Catch:{ all -> 0x00a4 }
            L_0x00af:
                r7 = move-exception
                r7.f68530d = r6     // Catch:{ all -> 0x00a4 }
                throw r7     // Catch:{ all -> 0x00a4 }
            L_0x00b3:
                com.google.protobuf.s2 r8 = r0.build()
                r6.unknownFields = r8
                r6.makeExtensionsImmutable()
                throw r7
            L_0x00bd:
                com.google.protobuf.s2 r7 = r0.build()
                r6.unknownFields = r7
                r6.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.LayerStyle.<init>(com.google.protobuf.l, com.google.protobuf.a0):void");
        }

        public static LayerStyle parseFrom(InputStream inputStream) {
            return (LayerStyle) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static LayerStyle parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (LayerStyle) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static LayerStyle parseFrom(C23856l lVar) {
            return (LayerStyle) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static LayerStyle parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (LayerStyle) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface LayerStyleOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        Color getBackgroundColor();

        ColorOrBuilder getBackgroundColorOrBuilder();

        Color getBorderColor();

        ColorOrBuilder getBorderColorOrBuilder();

        float getBorderWidth();

        float getCornerRadius();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        Vec4 getEdgeInsets();

        Vec4OrBuilder getEdgeInsetsOrBuilder();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        /* synthetic */ C24020s2 getUnknownFields();

        boolean hasBackgroundColor();

        boolean hasBorderColor();

        boolean hasEdgeInsets();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    public static final class LyricInfo extends C23872m0 implements LyricInfoOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final LyricInfo DEFAULT_INSTANCE = new LyricInfo();
        /* access modifiers changed from: private */
        public static final C24062w1<LyricInfo> PARSER = new C23813c<LyricInfo>() {
            public LyricInfo parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new LyricInfo(lVar, a0Var, (C241671) null);
            }
        };
        public static final int TIME_RANGE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object content_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public TimeRange timeRange_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements LyricInfoOrBuilder {
            private Object content_;
            private C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> timeRangeBuilder_;
            private TimeRange timeRange_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_LyricInfo_descriptor;
            }

            private C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> getTimeRangeFieldBuilder() {
                if (this.timeRangeBuilder_ == null) {
                    this.timeRangeBuilder_ = new C23844i2<>(getTimeRange(), getParentForChildren(), isClean());
                    this.timeRange_ = null;
                }
                return this.timeRangeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearContent() {
                this.content_ = LyricInfo.getDefaultInstance().getContent();
                onChanged();
                return this;
            }

            public Builder clearTimeRange() {
                if (this.timeRangeBuilder_ == null) {
                    this.timeRange_ = null;
                    onChanged();
                } else {
                    this.timeRange_ = null;
                    this.timeRangeBuilder_ = null;
                }
                return this;
            }

            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String u = ((C16994k) obj).mo18752u();
                this.content_ = u;
                return u;
            }

            public C16994k getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.content_ = k;
                return k;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_LyricInfo_descriptor;
            }

            public TimeRange getTimeRange() {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                TimeRange timeRange = this.timeRange_;
                return timeRange == null ? TimeRange.getDefaultInstance() : timeRange;
            }

            public TimeRange.Builder getTimeRangeBuilder() {
                onChanged();
                return getTimeRangeFieldBuilder().mo37705d();
            }

            public TimeRangeOrBuilder getTimeRangeOrBuilder() {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                TimeRange timeRange = this.timeRange_;
                return timeRange == null ? TimeRange.getDefaultInstance() : timeRange;
            }

            public boolean hasTimeRange() {
                return (this.timeRangeBuilder_ == null && this.timeRange_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$15700 = MJComposingS12.internal_static_MJComposingS12_LyricInfo_fieldAccessorTable;
                access$15700.mo37875c(LyricInfo.class, Builder.class);
                return access$15700;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeTimeRange(TimeRange timeRange) {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var == null) {
                    TimeRange timeRange2 = this.timeRange_;
                    if (timeRange2 != null) {
                        this.timeRange_ = TimeRange.newBuilder(timeRange2).mergeFrom(timeRange).buildPartial();
                    } else {
                        this.timeRange_ = timeRange;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(timeRange);
                }
                return this;
            }

            public Builder setContent(String str) {
                str.getClass();
                this.content_ = str;
                onChanged();
                return this;
            }

            public Builder setContentBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.content_ = kVar;
                onChanged();
                return this;
            }

            public Builder setTimeRange(TimeRange timeRange) {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var == null) {
                    timeRange.getClass();
                    this.timeRange_ = timeRange;
                    onChanged();
                } else {
                    i2Var.mo37710i(timeRange);
                }
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                this.content_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public LyricInfo build() {
                LyricInfo buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public LyricInfo buildPartial() {
                LyricInfo lyricInfo = new LyricInfo((C23872m0.C23874b) this, (C241671) null);
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var == null) {
                    TimeRange unused = lyricInfo.timeRange_ = this.timeRange_;
                } else {
                    TimeRange unused2 = lyricInfo.timeRange_ = i2Var.mo37703b();
                }
                Object unused3 = lyricInfo.content_ = this.content_;
                onBuilt();
                return lyricInfo;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public LyricInfo getDefaultInstanceForType() {
                return LyricInfo.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                if (this.timeRangeBuilder_ == null) {
                    this.timeRange_ = null;
                } else {
                    this.timeRange_ = null;
                    this.timeRangeBuilder_ = null;
                }
                this.content_ = "";
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.content_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setTimeRange(TimeRange.Builder builder) {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var == null) {
                    this.timeRange_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof LyricInfo) {
                    return mergeFrom((LyricInfo) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(LyricInfo lyricInfo) {
                if (lyricInfo == LyricInfo.getDefaultInstance()) {
                    return this;
                }
                if (lyricInfo.hasTimeRange()) {
                    mergeTimeRange(lyricInfo.getTimeRange());
                }
                if (!lyricInfo.getContent().isEmpty()) {
                    this.content_ = lyricInfo.content_;
                    onChanged();
                }
                mergeUnknownFields(lyricInfo.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.LyricInfo.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.LyricInfo.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$LyricInfo r3 = (com.tencent.maas.composing.MJComposingS12.LyricInfo) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.LyricInfo) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$LyricInfo r4 = (com.tencent.maas.composing.MJComposingS12.LyricInfo) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.LyricInfo) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.LyricInfo.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$LyricInfo$Builder");
            }
        }

        public /* synthetic */ LyricInfo(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static LyricInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_LyricInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LyricInfo parseDelimitedFrom(InputStream inputStream) {
            return (LyricInfo) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LyricInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<LyricInfo> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LyricInfo)) {
                return super.equals(obj);
            }
            LyricInfo lyricInfo = (LyricInfo) obj;
            if (hasTimeRange() != lyricInfo.hasTimeRange()) {
                return false;
            }
            return (!hasTimeRange() || getTimeRange().equals(lyricInfo.getTimeRange())) && getContent().equals(lyricInfo.getContent()) && this.unknownFields.equals(lyricInfo.unknownFields);
        }

        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String u = ((C16994k) obj).mo18752u();
            this.content_ = u;
            return u;
        }

        public C16994k getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.content_ = k;
            return k;
        }

        public C24062w1<LyricInfo> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.timeRange_ != null) {
                i2 = 0 + C23897n.m29270o(1, getTimeRange());
            }
            if (!getContentBytes().isEmpty()) {
                i2 += C23872m0.computeStringSize(2, this.content_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public TimeRange getTimeRange() {
            TimeRange timeRange = this.timeRange_;
            return timeRange == null ? TimeRange.getDefaultInstance() : timeRange;
        }

        public TimeRangeOrBuilder getTimeRangeOrBuilder() {
            return getTimeRange();
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasTimeRange() {
            return this.timeRange_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasTimeRange()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getTimeRange().hashCode();
            }
            int hashCode2 = (((((hashCode * 37) + 2) * 53) + getContent().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$15700 = MJComposingS12.internal_static_MJComposingS12_LyricInfo_fieldAccessorTable;
            access$15700.mo37875c(LyricInfo.class, Builder.class);
            return access$15700;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new LyricInfo();
        }

        public void writeTo(C23897n nVar) {
            if (this.timeRange_ != null) {
                nVar.mo37909P(1, getTimeRange());
            }
            if (!getContentBytes().isEmpty()) {
                C23872m0.writeString(nVar, 2, this.content_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ LyricInfo(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(LyricInfo lyricInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lyricInfo);
        }

        public static LyricInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private LyricInfo(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static LyricInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (LyricInfo) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static LyricInfo parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public LyricInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static LyricInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LyricInfo() {
            this.memoizedIsInitialized = -1;
            this.content_ = "";
        }

        public static LyricInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static LyricInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static LyricInfo parseFrom(InputStream inputStream) {
            return (LyricInfo) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        private LyricInfo(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 10) {
                            TimeRange.Builder builder = null;
                            TimeRange timeRange = this.timeRange_;
                            builder = timeRange != null ? timeRange.toBuilder() : builder;
                            TimeRange timeRange2 = (TimeRange) lVar.mo37777v(TimeRange.parser(), a0Var);
                            this.timeRange_ = timeRange2;
                            if (builder != null) {
                                builder.mergeFrom(timeRange2);
                                this.timeRange_ = builder.buildPartial();
                            }
                        } else if (F == 18) {
                            this.content_ = lVar.mo37756E();
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static LyricInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (LyricInfo) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static LyricInfo parseFrom(C23856l lVar) {
            return (LyricInfo) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static LyricInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (LyricInfo) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface LyricInfoOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        String getContent();

        C16994k getContentBytes();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        TimeRange getTimeRange();

        TimeRangeOrBuilder getTimeRangeOrBuilder();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasTimeRange();

        /* synthetic */ boolean isInitialized();
    }

    public static final class LyricOverlayDesc extends C23872m0 implements LyricOverlayDescOrBuilder {
        private static final LyricOverlayDesc DEFAULT_INSTANCE = new LyricOverlayDesc();
        public static final int LAYER_INDEX_FIELD_NUMBER = 6;
        public static final int LAYER_SPATIAL_DESC_FIELD_NUMBER = 2;
        public static final int LAYER_STYLE_FIELD_NUMBER = 4;
        public static final int LYRIC_INFOS_FIELD_NUMBER = 1;
        public static final int MAXIMUM_WIDTH_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final C24062w1<LyricOverlayDesc> PARSER = new C23813c<LyricOverlayDesc>() {
            public LyricOverlayDesc parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new LyricOverlayDesc(lVar, a0Var, (C241671) null);
            }
        };
        public static final int TEXT_STYLE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int layerIndex_;
        /* access modifiers changed from: private */
        public LayerSpatialDesc layerSpatialDesc_;
        /* access modifiers changed from: private */
        public LayerStyle layerStyle_;
        /* access modifiers changed from: private */
        public List<LyricInfo> lyricInfos_;
        /* access modifiers changed from: private */
        public float maximumWidth_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public TextStyle textStyle_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements LyricOverlayDescOrBuilder {
            private int bitField0_;
            private int layerIndex_;
            private C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> layerSpatialDescBuilder_;
            private LayerSpatialDesc layerSpatialDesc_;
            private C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> layerStyleBuilder_;
            private LayerStyle layerStyle_;
            private C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> lyricInfosBuilder_;
            private List<LyricInfo> lyricInfos_;
            private float maximumWidth_;
            private C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> textStyleBuilder_;
            private TextStyle textStyle_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            private void ensureLyricInfosIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.lyricInfos_ = new ArrayList(this.lyricInfos_);
                    this.bitField0_ |= 1;
                }
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_LyricOverlayDesc_descriptor;
            }

            private C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> getLayerSpatialDescFieldBuilder() {
                if (this.layerSpatialDescBuilder_ == null) {
                    this.layerSpatialDescBuilder_ = new C23844i2<>(getLayerSpatialDesc(), getParentForChildren(), isClean());
                    this.layerSpatialDesc_ = null;
                }
                return this.layerSpatialDescBuilder_;
            }

            private C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> getLayerStyleFieldBuilder() {
                if (this.layerStyleBuilder_ == null) {
                    this.layerStyleBuilder_ = new C23844i2<>(getLayerStyle(), getParentForChildren(), isClean());
                    this.layerStyle_ = null;
                }
                return this.layerStyleBuilder_;
            }

            private C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> getLyricInfosFieldBuilder() {
                if (this.lyricInfosBuilder_ == null) {
                    List<LyricInfo> list = this.lyricInfos_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.lyricInfosBuilder_ = new C23821e2<>(list, z, getParentForChildren(), isClean());
                    this.lyricInfos_ = null;
                }
                return this.lyricInfosBuilder_;
            }

            private C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> getTextStyleFieldBuilder() {
                if (this.textStyleBuilder_ == null) {
                    this.textStyleBuilder_ = new C23844i2<>(getTextStyle(), getParentForChildren(), isClean());
                    this.textStyle_ = null;
                }
                return this.textStyleBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (C23872m0.alwaysUseFieldBuilders) {
                    getLyricInfosFieldBuilder();
                }
            }

            public Builder addAllLyricInfos(Iterable<? extends LyricInfo> iterable) {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                if (e2Var == null) {
                    ensureLyricInfosIsMutable();
                    C23810b.C23811a.addAll(iterable, this.lyricInfos_);
                    onChanged();
                } else {
                    e2Var.mo37578b(iterable);
                }
                return this;
            }

            public Builder addLyricInfos(LyricInfo lyricInfo) {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                if (e2Var == null) {
                    lyricInfo.getClass();
                    ensureLyricInfosIsMutable();
                    this.lyricInfos_.add(lyricInfo);
                    onChanged();
                } else {
                    e2Var.mo37582f(lyricInfo);
                }
                return this;
            }

            public LyricInfo.Builder addLyricInfosBuilder() {
                return getLyricInfosFieldBuilder().mo37580d(LyricInfo.getDefaultInstance());
            }

            public Builder clearLayerIndex() {
                this.layerIndex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLayerSpatialDesc() {
                if (this.layerSpatialDescBuilder_ == null) {
                    this.layerSpatialDesc_ = null;
                    onChanged();
                } else {
                    this.layerSpatialDesc_ = null;
                    this.layerSpatialDescBuilder_ = null;
                }
                return this;
            }

            public Builder clearLayerStyle() {
                if (this.layerStyleBuilder_ == null) {
                    this.layerStyle_ = null;
                    onChanged();
                } else {
                    this.layerStyle_ = null;
                    this.layerStyleBuilder_ = null;
                }
                return this;
            }

            public Builder clearLyricInfos() {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                if (e2Var == null) {
                    this.lyricInfos_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    e2Var.mo37584h();
                }
                return this;
            }

            public Builder clearMaximumWidth() {
                this.maximumWidth_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearTextStyle() {
                if (this.textStyleBuilder_ == null) {
                    this.textStyle_ = null;
                    onChanged();
                } else {
                    this.textStyle_ = null;
                    this.textStyleBuilder_ = null;
                }
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_LyricOverlayDesc_descriptor;
            }

            public int getLayerIndex() {
                return this.layerIndex_;
            }

            public LayerSpatialDesc getLayerSpatialDesc() {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                LayerSpatialDesc layerSpatialDesc = this.layerSpatialDesc_;
                return layerSpatialDesc == null ? LayerSpatialDesc.getDefaultInstance() : layerSpatialDesc;
            }

            public LayerSpatialDesc.Builder getLayerSpatialDescBuilder() {
                onChanged();
                return getLayerSpatialDescFieldBuilder().mo37705d();
            }

            public LayerSpatialDescOrBuilder getLayerSpatialDescOrBuilder() {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                LayerSpatialDesc layerSpatialDesc = this.layerSpatialDesc_;
                return layerSpatialDesc == null ? LayerSpatialDesc.getDefaultInstance() : layerSpatialDesc;
            }

            public LayerStyle getLayerStyle() {
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var = this.layerStyleBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                LayerStyle layerStyle = this.layerStyle_;
                return layerStyle == null ? LayerStyle.getDefaultInstance() : layerStyle;
            }

            public LayerStyle.Builder getLayerStyleBuilder() {
                onChanged();
                return getLayerStyleFieldBuilder().mo37705d();
            }

            public LayerStyleOrBuilder getLayerStyleOrBuilder() {
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var = this.layerStyleBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                LayerStyle layerStyle = this.layerStyle_;
                return layerStyle == null ? LayerStyle.getDefaultInstance() : layerStyle;
            }

            public LyricInfo getLyricInfos(int i) {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                return e2Var == null ? this.lyricInfos_.get(i) : e2Var.mo37590n(i, false);
            }

            public LyricInfo.Builder getLyricInfosBuilder(int i) {
                return getLyricInfosFieldBuilder().mo37587k(i);
            }

            public List<LyricInfo.Builder> getLyricInfosBuilderList() {
                return getLyricInfosFieldBuilder().mo37588l();
            }

            public int getLyricInfosCount() {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                return e2Var == null ? this.lyricInfos_.size() : e2Var.mo37589m();
            }

            public List<LyricInfo> getLyricInfosList() {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                return e2Var == null ? Collections.unmodifiableList(this.lyricInfos_) : e2Var.mo37591o();
            }

            public LyricInfoOrBuilder getLyricInfosOrBuilder(int i) {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                return e2Var == null ? this.lyricInfos_.get(i) : e2Var.mo37592p(i);
            }

            public List<? extends LyricInfoOrBuilder> getLyricInfosOrBuilderList() {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                return e2Var != null ? e2Var.mo37593q() : Collections.unmodifiableList(this.lyricInfos_);
            }

            public float getMaximumWidth() {
                return this.maximumWidth_;
            }

            public TextStyle getTextStyle() {
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var = this.textStyleBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                TextStyle textStyle = this.textStyle_;
                return textStyle == null ? TextStyle.getDefaultInstance() : textStyle;
            }

            public TextStyle.Builder getTextStyleBuilder() {
                onChanged();
                return getTextStyleFieldBuilder().mo37705d();
            }

            public TextStyleOrBuilder getTextStyleOrBuilder() {
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var = this.textStyleBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                TextStyle textStyle = this.textStyle_;
                return textStyle == null ? TextStyle.getDefaultInstance() : textStyle;
            }

            public boolean hasLayerSpatialDesc() {
                return (this.layerSpatialDescBuilder_ == null && this.layerSpatialDesc_ == null) ? false : true;
            }

            public boolean hasLayerStyle() {
                return (this.layerStyleBuilder_ == null && this.layerStyle_ == null) ? false : true;
            }

            public boolean hasTextStyle() {
                return (this.textStyleBuilder_ == null && this.textStyle_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$23400 = MJComposingS12.f69258x4392f97c;
                access$23400.mo37875c(LyricOverlayDesc.class, Builder.class);
                return access$23400;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeLayerSpatialDesc(LayerSpatialDesc layerSpatialDesc) {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var == null) {
                    LayerSpatialDesc layerSpatialDesc2 = this.layerSpatialDesc_;
                    if (layerSpatialDesc2 != null) {
                        this.layerSpatialDesc_ = LayerSpatialDesc.newBuilder(layerSpatialDesc2).mergeFrom(layerSpatialDesc).buildPartial();
                    } else {
                        this.layerSpatialDesc_ = layerSpatialDesc;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(layerSpatialDesc);
                }
                return this;
            }

            public Builder mergeLayerStyle(LayerStyle layerStyle) {
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var = this.layerStyleBuilder_;
                if (i2Var == null) {
                    LayerStyle layerStyle2 = this.layerStyle_;
                    if (layerStyle2 != null) {
                        this.layerStyle_ = LayerStyle.newBuilder(layerStyle2).mergeFrom(layerStyle).buildPartial();
                    } else {
                        this.layerStyle_ = layerStyle;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(layerStyle);
                }
                return this;
            }

            public Builder mergeTextStyle(TextStyle textStyle) {
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var = this.textStyleBuilder_;
                if (i2Var == null) {
                    TextStyle textStyle2 = this.textStyle_;
                    if (textStyle2 != null) {
                        this.textStyle_ = TextStyle.newBuilder(textStyle2).mergeFrom(textStyle).buildPartial();
                    } else {
                        this.textStyle_ = textStyle;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(textStyle);
                }
                return this;
            }

            public Builder removeLyricInfos(int i) {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                if (e2Var == null) {
                    ensureLyricInfosIsMutable();
                    this.lyricInfos_.remove(i);
                    onChanged();
                } else {
                    e2Var.mo37597u(i);
                }
                return this;
            }

            public Builder setLayerIndex(int i) {
                this.layerIndex_ = i;
                onChanged();
                return this;
            }

            public Builder setLayerSpatialDesc(LayerSpatialDesc layerSpatialDesc) {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var == null) {
                    layerSpatialDesc.getClass();
                    this.layerSpatialDesc_ = layerSpatialDesc;
                    onChanged();
                } else {
                    i2Var.mo37710i(layerSpatialDesc);
                }
                return this;
            }

            public Builder setLayerStyle(LayerStyle layerStyle) {
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var = this.layerStyleBuilder_;
                if (i2Var == null) {
                    layerStyle.getClass();
                    this.layerStyle_ = layerStyle;
                    onChanged();
                } else {
                    i2Var.mo37710i(layerStyle);
                }
                return this;
            }

            public Builder setLyricInfos(int i, LyricInfo lyricInfo) {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                if (e2Var == null) {
                    lyricInfo.getClass();
                    ensureLyricInfosIsMutable();
                    this.lyricInfos_.set(i, lyricInfo);
                    onChanged();
                } else {
                    e2Var.mo37598v(i, lyricInfo);
                }
                return this;
            }

            public Builder setMaximumWidth(float f) {
                this.maximumWidth_ = f;
                onChanged();
                return this;
            }

            public Builder setTextStyle(TextStyle textStyle) {
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var = this.textStyleBuilder_;
                if (i2Var == null) {
                    textStyle.getClass();
                    this.textStyle_ = textStyle;
                    onChanged();
                } else {
                    i2Var.mo37710i(textStyle);
                }
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                this.lyricInfos_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public LyricOverlayDesc build() {
                LyricOverlayDesc buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public LyricOverlayDesc buildPartial() {
                LyricOverlayDesc lyricOverlayDesc = new LyricOverlayDesc((C23872m0.C23874b) this, (C241671) null);
                int i = this.bitField0_;
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                if (e2Var == null) {
                    if ((i & 1) != 0) {
                        this.lyricInfos_ = Collections.unmodifiableList(this.lyricInfos_);
                        this.bitField0_ &= -2;
                    }
                    List unused = lyricOverlayDesc.lyricInfos_ = this.lyricInfos_;
                } else {
                    List unused2 = lyricOverlayDesc.lyricInfos_ = e2Var.mo37583g();
                }
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var == null) {
                    LayerSpatialDesc unused3 = lyricOverlayDesc.layerSpatialDesc_ = this.layerSpatialDesc_;
                } else {
                    LayerSpatialDesc unused4 = lyricOverlayDesc.layerSpatialDesc_ = i2Var.mo37703b();
                }
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var2 = this.textStyleBuilder_;
                if (i2Var2 == null) {
                    TextStyle unused5 = lyricOverlayDesc.textStyle_ = this.textStyle_;
                } else {
                    TextStyle unused6 = lyricOverlayDesc.textStyle_ = i2Var2.mo37703b();
                }
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var3 = this.layerStyleBuilder_;
                if (i2Var3 == null) {
                    LayerStyle unused7 = lyricOverlayDesc.layerStyle_ = this.layerStyle_;
                } else {
                    LayerStyle unused8 = lyricOverlayDesc.layerStyle_ = i2Var3.mo37703b();
                }
                float unused9 = lyricOverlayDesc.maximumWidth_ = this.maximumWidth_;
                int unused10 = lyricOverlayDesc.layerIndex_ = this.layerIndex_;
                onBuilt();
                return lyricOverlayDesc;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public LyricOverlayDesc getDefaultInstanceForType() {
                return LyricOverlayDesc.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public LyricInfo.Builder addLyricInfosBuilder(int i) {
                return getLyricInfosFieldBuilder().mo37579c(i, LyricInfo.getDefaultInstance());
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                if (e2Var == null) {
                    this.lyricInfos_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    e2Var.mo37584h();
                }
                if (this.layerSpatialDescBuilder_ == null) {
                    this.layerSpatialDesc_ = null;
                } else {
                    this.layerSpatialDesc_ = null;
                    this.layerSpatialDescBuilder_ = null;
                }
                if (this.textStyleBuilder_ == null) {
                    this.textStyle_ = null;
                } else {
                    this.textStyle_ = null;
                    this.textStyleBuilder_ = null;
                }
                if (this.layerStyleBuilder_ == null) {
                    this.layerStyle_ = null;
                } else {
                    this.layerStyle_ = null;
                    this.layerStyleBuilder_ = null;
                }
                this.maximumWidth_ = 0.0f;
                this.layerIndex_ = 0;
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.lyricInfos_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder setLayerSpatialDesc(LayerSpatialDesc.Builder builder) {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var == null) {
                    this.layerSpatialDesc_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setLayerStyle(LayerStyle.Builder builder) {
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var = this.layerStyleBuilder_;
                if (i2Var == null) {
                    this.layerStyle_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setTextStyle(TextStyle.Builder builder) {
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var = this.textStyleBuilder_;
                if (i2Var == null) {
                    this.textStyle_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder addLyricInfos(int i, LyricInfo lyricInfo) {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                if (e2Var == null) {
                    lyricInfo.getClass();
                    ensureLyricInfosIsMutable();
                    this.lyricInfos_.add(i, lyricInfo);
                    onChanged();
                } else {
                    e2Var.mo37581e(i, lyricInfo);
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof LyricOverlayDesc) {
                    return mergeFrom((LyricOverlayDesc) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder setLyricInfos(int i, LyricInfo.Builder builder) {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                if (e2Var == null) {
                    ensureLyricInfosIsMutable();
                    this.lyricInfos_.set(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37598v(i, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(LyricOverlayDesc lyricOverlayDesc) {
                if (lyricOverlayDesc == LyricOverlayDesc.getDefaultInstance()) {
                    return this;
                }
                if (this.lyricInfosBuilder_ == null) {
                    if (!lyricOverlayDesc.lyricInfos_.isEmpty()) {
                        if (this.lyricInfos_.isEmpty()) {
                            this.lyricInfos_ = lyricOverlayDesc.lyricInfos_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureLyricInfosIsMutable();
                            this.lyricInfos_.addAll(lyricOverlayDesc.lyricInfos_);
                        }
                        onChanged();
                    }
                } else if (!lyricOverlayDesc.lyricInfos_.isEmpty()) {
                    if (this.lyricInfosBuilder_.mo37595s()) {
                        C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = null;
                        this.lyricInfosBuilder_.f68224a = null;
                        this.lyricInfosBuilder_ = null;
                        this.lyricInfos_ = lyricOverlayDesc.lyricInfos_;
                        this.bitField0_ &= -2;
                        if (C23872m0.alwaysUseFieldBuilders) {
                            e2Var = getLyricInfosFieldBuilder();
                        }
                        this.lyricInfosBuilder_ = e2Var;
                    } else {
                        this.lyricInfosBuilder_.mo37578b(lyricOverlayDesc.lyricInfos_);
                    }
                }
                if (lyricOverlayDesc.hasLayerSpatialDesc()) {
                    mergeLayerSpatialDesc(lyricOverlayDesc.getLayerSpatialDesc());
                }
                if (lyricOverlayDesc.hasTextStyle()) {
                    mergeTextStyle(lyricOverlayDesc.getTextStyle());
                }
                if (lyricOverlayDesc.hasLayerStyle()) {
                    mergeLayerStyle(lyricOverlayDesc.getLayerStyle());
                }
                if (lyricOverlayDesc.getMaximumWidth() != 0.0f) {
                    setMaximumWidth(lyricOverlayDesc.getMaximumWidth());
                }
                if (lyricOverlayDesc.getLayerIndex() != 0) {
                    setLayerIndex(lyricOverlayDesc.getLayerIndex());
                }
                mergeUnknownFields(lyricOverlayDesc.unknownFields);
                onChanged();
                return this;
            }

            public Builder addLyricInfos(LyricInfo.Builder builder) {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                if (e2Var == null) {
                    ensureLyricInfosIsMutable();
                    this.lyricInfos_.add(builder.build());
                    onChanged();
                } else {
                    e2Var.mo37582f(builder.build());
                }
                return this;
            }

            public Builder addLyricInfos(int i, LyricInfo.Builder builder) {
                C23821e2<LyricInfo, LyricInfo.Builder, LyricInfoOrBuilder> e2Var = this.lyricInfosBuilder_;
                if (e2Var == null) {
                    ensureLyricInfosIsMutable();
                    this.lyricInfos_.add(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37581e(i, builder.build());
                }
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.LyricOverlayDesc.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.LyricOverlayDesc.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$LyricOverlayDesc r3 = (com.tencent.maas.composing.MJComposingS12.LyricOverlayDesc) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.LyricOverlayDesc) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$LyricOverlayDesc r4 = (com.tencent.maas.composing.MJComposingS12.LyricOverlayDesc) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.LyricOverlayDesc) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.LyricOverlayDesc.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$LyricOverlayDesc$Builder");
            }
        }

        public /* synthetic */ LyricOverlayDesc(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static LyricOverlayDesc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_LyricOverlayDesc_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LyricOverlayDesc parseDelimitedFrom(InputStream inputStream) {
            return (LyricOverlayDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LyricOverlayDesc parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<LyricOverlayDesc> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LyricOverlayDesc)) {
                return super.equals(obj);
            }
            LyricOverlayDesc lyricOverlayDesc = (LyricOverlayDesc) obj;
            if (!getLyricInfosList().equals(lyricOverlayDesc.getLyricInfosList()) || hasLayerSpatialDesc() != lyricOverlayDesc.hasLayerSpatialDesc()) {
                return false;
            }
            if ((hasLayerSpatialDesc() && !getLayerSpatialDesc().equals(lyricOverlayDesc.getLayerSpatialDesc())) || hasTextStyle() != lyricOverlayDesc.hasTextStyle()) {
                return false;
            }
            if ((!hasTextStyle() || getTextStyle().equals(lyricOverlayDesc.getTextStyle())) && hasLayerStyle() == lyricOverlayDesc.hasLayerStyle()) {
                return (!hasLayerStyle() || getLayerStyle().equals(lyricOverlayDesc.getLayerStyle())) && Float.floatToIntBits(getMaximumWidth()) == Float.floatToIntBits(lyricOverlayDesc.getMaximumWidth()) && getLayerIndex() == lyricOverlayDesc.getLayerIndex() && this.unknownFields.equals(lyricOverlayDesc.unknownFields);
            }
            return false;
        }

        public int getLayerIndex() {
            return this.layerIndex_;
        }

        public LayerSpatialDesc getLayerSpatialDesc() {
            LayerSpatialDesc layerSpatialDesc = this.layerSpatialDesc_;
            return layerSpatialDesc == null ? LayerSpatialDesc.getDefaultInstance() : layerSpatialDesc;
        }

        public LayerSpatialDescOrBuilder getLayerSpatialDescOrBuilder() {
            return getLayerSpatialDesc();
        }

        public LayerStyle getLayerStyle() {
            LayerStyle layerStyle = this.layerStyle_;
            return layerStyle == null ? LayerStyle.getDefaultInstance() : layerStyle;
        }

        public LayerStyleOrBuilder getLayerStyleOrBuilder() {
            return getLayerStyle();
        }

        public LyricInfo getLyricInfos(int i) {
            return this.lyricInfos_.get(i);
        }

        public int getLyricInfosCount() {
            return this.lyricInfos_.size();
        }

        public List<LyricInfo> getLyricInfosList() {
            return this.lyricInfos_;
        }

        public LyricInfoOrBuilder getLyricInfosOrBuilder(int i) {
            return this.lyricInfos_.get(i);
        }

        public List<? extends LyricInfoOrBuilder> getLyricInfosOrBuilderList() {
            return this.lyricInfos_;
        }

        public float getMaximumWidth() {
            return this.maximumWidth_;
        }

        public C24062w1<LyricOverlayDesc> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.lyricInfos_.size(); i3++) {
                i2 += C23897n.m29270o(1, this.lyricInfos_.get(i3));
            }
            if (this.layerSpatialDesc_ != null) {
                i2 += C23897n.m29270o(2, getLayerSpatialDesc());
            }
            if (this.textStyle_ != null) {
                i2 += C23897n.m29270o(3, getTextStyle());
            }
            if (this.layerStyle_ != null) {
                i2 += C23897n.m29270o(4, getLayerStyle());
            }
            float f = this.maximumWidth_;
            if (f != 0.0f) {
                i2 += C23897n.m29264i(5, f);
            }
            int i4 = this.layerIndex_;
            if (i4 != 0) {
                i2 += C23897n.m29266k(6, i4);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public TextStyle getTextStyle() {
            TextStyle textStyle = this.textStyle_;
            return textStyle == null ? TextStyle.getDefaultInstance() : textStyle;
        }

        public TextStyleOrBuilder getTextStyleOrBuilder() {
            return getTextStyle();
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasLayerSpatialDesc() {
            return this.layerSpatialDesc_ != null;
        }

        public boolean hasLayerStyle() {
            return this.layerStyle_ != null;
        }

        public boolean hasTextStyle() {
            return this.textStyle_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (getLyricInfosCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getLyricInfosList().hashCode();
            }
            if (hasLayerSpatialDesc()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getLayerSpatialDesc().hashCode();
            }
            if (hasTextStyle()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getTextStyle().hashCode();
            }
            if (hasLayerStyle()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getLayerStyle().hashCode();
            }
            int floatToIntBits = (((((((((hashCode * 37) + 5) * 53) + Float.floatToIntBits(getMaximumWidth())) * 37) + 6) * 53) + getLayerIndex()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = floatToIntBits;
            return floatToIntBits;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$23400 = MJComposingS12.f69258x4392f97c;
            access$23400.mo37875c(LyricOverlayDesc.class, Builder.class);
            return access$23400;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new LyricOverlayDesc();
        }

        public void writeTo(C23897n nVar) {
            for (int i = 0; i < this.lyricInfos_.size(); i++) {
                nVar.mo37909P(1, this.lyricInfos_.get(i));
            }
            if (this.layerSpatialDesc_ != null) {
                nVar.mo37909P(2, getLayerSpatialDesc());
            }
            if (this.textStyle_ != null) {
                nVar.mo37909P(3, getTextStyle());
            }
            if (this.layerStyle_ != null) {
                nVar.mo37909P(4, getLayerStyle());
            }
            float f = this.maximumWidth_;
            if (f != 0.0f) {
                nVar.mo37906M(5, f);
            }
            int i2 = this.layerIndex_;
            if (i2 != 0) {
                nVar.mo37907N(6, i2);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ LyricOverlayDesc(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(LyricOverlayDesc lyricOverlayDesc) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lyricOverlayDesc);
        }

        public static LyricOverlayDesc parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private LyricOverlayDesc(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static LyricOverlayDesc parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (LyricOverlayDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static LyricOverlayDesc parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public LyricOverlayDesc getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static LyricOverlayDesc parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LyricOverlayDesc() {
            this.memoizedIsInitialized = -1;
            this.lyricInfos_ = Collections.emptyList();
        }

        public static LyricOverlayDesc parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static LyricOverlayDesc parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static LyricOverlayDesc parseFrom(InputStream inputStream) {
            return (LyricOverlayDesc) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.tencent.maas.composing.MJComposingS12$TextStyle$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.tencent.maas.composing.MJComposingS12$LayerStyle$Builder} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v7 */
        /* JADX WARNING: type inference failed for: r6v8 */
        /* JADX WARNING: type inference failed for: r6v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private LyricOverlayDesc(com.google.protobuf.C23856l r8, com.google.protobuf.C23806a0 r9) {
            /*
                r7 = this;
                r7.<init>()
                r9.getClass()
                com.google.protobuf.s2$a r0 = com.google.protobuf.C24020s2.m29807b()
                r1 = 0
                r2 = 0
            L_0x000c:
                r3 = 1
                if (r1 != 0) goto L_0x00eb
                int r4 = r8.mo37757F()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                if (r4 == 0) goto L_0x00c3
                r5 = 10
                if (r4 == r5) goto L_0x00a5
                r5 = 18
                r6 = 0
                if (r4 == r5) goto L_0x0084
                r5 = 26
                if (r4 == r5) goto L_0x0064
                r5 = 34
                if (r4 == r5) goto L_0x0044
                r5 = 45
                if (r4 == r5) goto L_0x003d
                r5 = 48
                if (r4 == r5) goto L_0x0036
                boolean r4 = r7.parseUnknownField(r8, r0, r9, r4)     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                if (r4 != 0) goto L_0x000c
                goto L_0x00c3
            L_0x0036:
                int r4 = r8.mo37775t()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r7.layerIndex_ = r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                goto L_0x000c
            L_0x003d:
                float r4 = r8.mo37773r()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r7.maximumWidth_ = r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                goto L_0x000c
            L_0x0044:
                com.tencent.maas.composing.MJComposingS12$LayerStyle r4 = r7.layerStyle_     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                if (r4 == 0) goto L_0x004c
                com.tencent.maas.composing.MJComposingS12$LayerStyle$Builder r6 = r4.toBuilder()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
            L_0x004c:
                com.google.protobuf.w1 r4 = com.tencent.maas.composing.MJComposingS12.LayerStyle.parser()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.google.protobuf.j1 r4 = r8.mo37777v(r4, r9)     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.tencent.maas.composing.MJComposingS12$LayerStyle r4 = (com.tencent.maas.composing.MJComposingS12.LayerStyle) r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r7.layerStyle_ = r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                if (r6 == 0) goto L_0x000c
                r6.mergeFrom((com.tencent.maas.composing.MJComposingS12.LayerStyle) r4)     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.tencent.maas.composing.MJComposingS12$LayerStyle r4 = r6.buildPartial()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r7.layerStyle_ = r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                goto L_0x000c
            L_0x0064:
                com.tencent.maas.composing.MJComposingS12$TextStyle r4 = r7.textStyle_     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                if (r4 == 0) goto L_0x006c
                com.tencent.maas.composing.MJComposingS12$TextStyle$Builder r6 = r4.toBuilder()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
            L_0x006c:
                com.google.protobuf.w1 r4 = com.tencent.maas.composing.MJComposingS12.TextStyle.parser()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.google.protobuf.j1 r4 = r8.mo37777v(r4, r9)     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.tencent.maas.composing.MJComposingS12$TextStyle r4 = (com.tencent.maas.composing.MJComposingS12.TextStyle) r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r7.textStyle_ = r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                if (r6 == 0) goto L_0x000c
                r6.mergeFrom((com.tencent.maas.composing.MJComposingS12.TextStyle) r4)     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.tencent.maas.composing.MJComposingS12$TextStyle r4 = r6.buildPartial()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r7.textStyle_ = r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                goto L_0x000c
            L_0x0084:
                com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc r4 = r7.layerSpatialDesc_     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                if (r4 == 0) goto L_0x008c
                com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc$Builder r6 = r4.toBuilder()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
            L_0x008c:
                com.google.protobuf.w1 r4 = com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc.parser()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.google.protobuf.j1 r4 = r8.mo37777v(r4, r9)     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc r4 = (com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc) r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r7.layerSpatialDesc_ = r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                if (r6 == 0) goto L_0x000c
                r6.mergeFrom((com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc) r4)     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc r4 = r6.buildPartial()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r7.layerSpatialDesc_ = r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                goto L_0x000c
            L_0x00a5:
                r4 = r2 & 1
                if (r4 != 0) goto L_0x00b2
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r4.<init>()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r7.lyricInfos_ = r4     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r2 = r2 | 1
            L_0x00b2:
                java.util.List<com.tencent.maas.composing.MJComposingS12$LyricInfo> r4 = r7.lyricInfos_     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.google.protobuf.w1 r5 = com.tencent.maas.composing.MJComposingS12.LyricInfo.parser()     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.google.protobuf.j1 r5 = r8.mo37777v(r5, r9)     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                com.tencent.maas.composing.MJComposingS12$LyricInfo r5 = (com.tencent.maas.composing.MJComposingS12.LyricInfo) r5     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                r4.add(r5)     // Catch:{ p0 -> 0x00d1, IOException -> 0x00c8 }
                goto L_0x000c
            L_0x00c3:
                r1 = 1
                goto L_0x000c
            L_0x00c6:
                r8 = move-exception
                goto L_0x00d5
            L_0x00c8:
                r8 = move-exception
                com.google.protobuf.p0 r9 = new com.google.protobuf.p0     // Catch:{ all -> 0x00c6 }
                r9.<init>((java.io.IOException) r8)     // Catch:{ all -> 0x00c6 }
                r9.f68530d = r7     // Catch:{ all -> 0x00c6 }
                throw r9     // Catch:{ all -> 0x00c6 }
            L_0x00d1:
                r8 = move-exception
                r8.f68530d = r7     // Catch:{ all -> 0x00c6 }
                throw r8     // Catch:{ all -> 0x00c6 }
            L_0x00d5:
                r9 = r2 & 1
                if (r9 == 0) goto L_0x00e1
                java.util.List<com.tencent.maas.composing.MJComposingS12$LyricInfo> r9 = r7.lyricInfos_
                java.util.List r9 = java.util.Collections.unmodifiableList(r9)
                r7.lyricInfos_ = r9
            L_0x00e1:
                com.google.protobuf.s2 r9 = r0.build()
                r7.unknownFields = r9
                r7.makeExtensionsImmutable()
                throw r8
            L_0x00eb:
                r8 = r2 & 1
                if (r8 == 0) goto L_0x00f7
                java.util.List<com.tencent.maas.composing.MJComposingS12$LyricInfo> r8 = r7.lyricInfos_
                java.util.List r8 = java.util.Collections.unmodifiableList(r8)
                r7.lyricInfos_ = r8
            L_0x00f7:
                com.google.protobuf.s2 r8 = r0.build()
                r7.unknownFields = r8
                r7.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.LyricOverlayDesc.<init>(com.google.protobuf.l, com.google.protobuf.a0):void");
        }

        public static LyricOverlayDesc parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (LyricOverlayDesc) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static LyricOverlayDesc parseFrom(C23856l lVar) {
            return (LyricOverlayDesc) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static LyricOverlayDesc parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (LyricOverlayDesc) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface LyricOverlayDescOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        int getLayerIndex();

        LayerSpatialDesc getLayerSpatialDesc();

        LayerSpatialDescOrBuilder getLayerSpatialDescOrBuilder();

        LayerStyle getLayerStyle();

        LayerStyleOrBuilder getLayerStyleOrBuilder();

        LyricInfo getLyricInfos(int i);

        int getLyricInfosCount();

        List<LyricInfo> getLyricInfosList();

        LyricInfoOrBuilder getLyricInfosOrBuilder(int i);

        List<? extends LyricInfoOrBuilder> getLyricInfosOrBuilderList();

        float getMaximumWidth();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        TextStyle getTextStyle();

        TextStyleOrBuilder getTextStyleOrBuilder();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        boolean hasLayerSpatialDesc();

        boolean hasLayerStyle();

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasTextStyle();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Rect2 extends C23872m0 implements Rect2OrBuilder {
        private static final Rect2 DEFAULT_INSTANCE = new Rect2();
        public static final int ORIGIN_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final C24062w1<Rect2> PARSER = new C23813c<Rect2>() {
            public Rect2 parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new Rect2(lVar, a0Var, (C241671) null);
            }
        };
        public static final int SIZE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public Vec2 origin_;
        /* access modifiers changed from: private */
        public Vec2 size_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements Rect2OrBuilder {
            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> originBuilder_;
            private Vec2 origin_;
            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> sizeBuilder_;
            private Vec2 size_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_Rect2_descriptor;
            }

            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> getOriginFieldBuilder() {
                if (this.originBuilder_ == null) {
                    this.originBuilder_ = new C23844i2<>(getOrigin(), getParentForChildren(), isClean());
                    this.origin_ = null;
                }
                return this.originBuilder_;
            }

            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> getSizeFieldBuilder() {
                if (this.sizeBuilder_ == null) {
                    this.sizeBuilder_ = new C23844i2<>(getSize(), getParentForChildren(), isClean());
                    this.size_ = null;
                }
                return this.sizeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearOrigin() {
                if (this.originBuilder_ == null) {
                    this.origin_ = null;
                    onChanged();
                } else {
                    this.origin_ = null;
                    this.originBuilder_ = null;
                }
                return this;
            }

            public Builder clearSize() {
                if (this.sizeBuilder_ == null) {
                    this.size_ = null;
                    onChanged();
                } else {
                    this.size_ = null;
                    this.sizeBuilder_ = null;
                }
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_Rect2_descriptor;
            }

            public Vec2 getOrigin() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.originBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Vec2 vec2 = this.origin_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public Vec2.Builder getOriginBuilder() {
                onChanged();
                return getOriginFieldBuilder().mo37705d();
            }

            public Vec2OrBuilder getOriginOrBuilder() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.originBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Vec2 vec2 = this.origin_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public Vec2 getSize() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.sizeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Vec2 vec2 = this.size_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public Vec2.Builder getSizeBuilder() {
                onChanged();
                return getSizeFieldBuilder().mo37705d();
            }

            public Vec2OrBuilder getSizeOrBuilder() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.sizeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Vec2 vec2 = this.size_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public boolean hasOrigin() {
                return (this.originBuilder_ == null && this.origin_ == null) ? false : true;
            }

            public boolean hasSize() {
                return (this.sizeBuilder_ == null && this.size_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$2500 = MJComposingS12.internal_static_MJComposingS12_Rect2_fieldAccessorTable;
                access$2500.mo37875c(Rect2.class, Builder.class);
                return access$2500;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeOrigin(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.originBuilder_;
                if (i2Var == null) {
                    Vec2 vec22 = this.origin_;
                    if (vec22 != null) {
                        this.origin_ = Vec2.newBuilder(vec22).mergeFrom(vec2).buildPartial();
                    } else {
                        this.origin_ = vec2;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(vec2);
                }
                return this;
            }

            public Builder mergeSize(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.sizeBuilder_;
                if (i2Var == null) {
                    Vec2 vec22 = this.size_;
                    if (vec22 != null) {
                        this.size_ = Vec2.newBuilder(vec22).mergeFrom(vec2).buildPartial();
                    } else {
                        this.size_ = vec2;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(vec2);
                }
                return this;
            }

            public Builder setOrigin(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.originBuilder_;
                if (i2Var == null) {
                    vec2.getClass();
                    this.origin_ = vec2;
                    onChanged();
                } else {
                    i2Var.mo37710i(vec2);
                }
                return this;
            }

            public Builder setSize(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.sizeBuilder_;
                if (i2Var == null) {
                    vec2.getClass();
                    this.size_ = vec2;
                    onChanged();
                } else {
                    i2Var.mo37710i(vec2);
                }
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public Rect2 build() {
                Rect2 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public Rect2 buildPartial() {
                Rect2 rect2 = new Rect2((C23872m0.C23874b) this, (C241671) null);
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.originBuilder_;
                if (i2Var == null) {
                    Vec2 unused = rect2.origin_ = this.origin_;
                } else {
                    Vec2 unused2 = rect2.origin_ = i2Var.mo37703b();
                }
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var2 = this.sizeBuilder_;
                if (i2Var2 == null) {
                    Vec2 unused3 = rect2.size_ = this.size_;
                } else {
                    Vec2 unused4 = rect2.size_ = i2Var2.mo37703b();
                }
                onBuilt();
                return rect2;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public Rect2 getDefaultInstanceForType() {
                return Rect2.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            public Builder clear() {
                super.clear();
                if (this.originBuilder_ == null) {
                    this.origin_ = null;
                } else {
                    this.origin_ = null;
                    this.originBuilder_ = null;
                }
                if (this.sizeBuilder_ == null) {
                    this.size_ = null;
                } else {
                    this.size_ = null;
                    this.sizeBuilder_ = null;
                }
                return this;
            }

            public Builder setOrigin(Vec2.Builder builder) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.originBuilder_;
                if (i2Var == null) {
                    this.origin_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setSize(Vec2.Builder builder) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.sizeBuilder_;
                if (i2Var == null) {
                    this.size_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof Rect2) {
                    return mergeFrom((Rect2) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(Rect2 rect2) {
                if (rect2 == Rect2.getDefaultInstance()) {
                    return this;
                }
                if (rect2.hasOrigin()) {
                    mergeOrigin(rect2.getOrigin());
                }
                if (rect2.hasSize()) {
                    mergeSize(rect2.getSize());
                }
                mergeUnknownFields(rect2.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.Rect2.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.Rect2.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$Rect2 r3 = (com.tencent.maas.composing.MJComposingS12.Rect2) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Rect2) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$Rect2 r4 = (com.tencent.maas.composing.MJComposingS12.Rect2) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Rect2) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.Rect2.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$Rect2$Builder");
            }
        }

        public /* synthetic */ Rect2(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static Rect2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_Rect2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Rect2 parseDelimitedFrom(InputStream inputStream) {
            return (Rect2) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Rect2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<Rect2> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Rect2)) {
                return super.equals(obj);
            }
            Rect2 rect2 = (Rect2) obj;
            if (hasOrigin() != rect2.hasOrigin()) {
                return false;
            }
            if ((!hasOrigin() || getOrigin().equals(rect2.getOrigin())) && hasSize() == rect2.hasSize()) {
                return (!hasSize() || getSize().equals(rect2.getSize())) && this.unknownFields.equals(rect2.unknownFields);
            }
            return false;
        }

        public Vec2 getOrigin() {
            Vec2 vec2 = this.origin_;
            return vec2 == null ? Vec2.getDefaultInstance() : vec2;
        }

        public Vec2OrBuilder getOriginOrBuilder() {
            return getOrigin();
        }

        public C24062w1<Rect2> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.origin_ != null) {
                i2 = 0 + C23897n.m29270o(1, getOrigin());
            }
            if (this.size_ != null) {
                i2 += C23897n.m29270o(2, getSize());
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public Vec2 getSize() {
            Vec2 vec2 = this.size_;
            return vec2 == null ? Vec2.getDefaultInstance() : vec2;
        }

        public Vec2OrBuilder getSizeOrBuilder() {
            return getSize();
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasOrigin() {
            return this.origin_ != null;
        }

        public boolean hasSize() {
            return this.size_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasOrigin()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getOrigin().hashCode();
            }
            if (hasSize()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getSize().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$2500 = MJComposingS12.internal_static_MJComposingS12_Rect2_fieldAccessorTable;
            access$2500.mo37875c(Rect2.class, Builder.class);
            return access$2500;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new Rect2();
        }

        public void writeTo(C23897n nVar) {
            if (this.origin_ != null) {
                nVar.mo37909P(1, getOrigin());
            }
            if (this.size_ != null) {
                nVar.mo37909P(2, getSize());
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ Rect2(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(Rect2 rect2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rect2);
        }

        public static Rect2 parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private Rect2(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static Rect2 parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Rect2) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static Rect2 parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public Rect2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static Rect2 parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Rect2() {
            this.memoizedIsInitialized = -1;
        }

        public static Rect2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static Rect2 parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        private Rect2(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        Vec2.Builder builder = null;
                        if (F == 10) {
                            Vec2 vec2 = this.origin_;
                            builder = vec2 != null ? vec2.toBuilder() : builder;
                            Vec2 vec22 = (Vec2) lVar.mo37777v(Vec2.parser(), a0Var);
                            this.origin_ = vec22;
                            if (builder != null) {
                                builder.mergeFrom(vec22);
                                this.origin_ = builder.buildPartial();
                            }
                        } else if (F == 18) {
                            Vec2 vec23 = this.size_;
                            builder = vec23 != null ? vec23.toBuilder() : builder;
                            Vec2 vec24 = (Vec2) lVar.mo37777v(Vec2.parser(), a0Var);
                            this.size_ = vec24;
                            if (builder != null) {
                                builder.mergeFrom(vec24);
                                this.size_ = builder.buildPartial();
                            }
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static Rect2 parseFrom(InputStream inputStream) {
            return (Rect2) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static Rect2 parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Rect2) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static Rect2 parseFrom(C23856l lVar) {
            return (Rect2) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static Rect2 parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (Rect2) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface Rect2OrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        Vec2 getOrigin();

        Vec2OrBuilder getOriginOrBuilder();

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        Vec2 getSize();

        Vec2OrBuilder getSizeOrBuilder();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasOrigin();

        boolean hasSize();

        /* synthetic */ boolean isInitialized();
    }

    public enum StickerDecoderType implements C23908o0.C23911c {
        StickerDecoderTypePlatform(0),
        StickerDecoderTypeWxAM(1),
        UNRECOGNIZED(-1);
        
        public static final int StickerDecoderTypePlatform_VALUE = 0;
        public static final int StickerDecoderTypeWxAM_VALUE = 1;
        private static final StickerDecoderType[] VALUES = null;
        private static final C23908o0.C23912d<StickerDecoderType> internalValueMap = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<StickerDecoderType>() {
                public StickerDecoderType findValueByNumber(int i) {
                    return StickerDecoderType.forNumber(i);
                }
            };
            VALUES = values();
        }

        private StickerDecoderType(int i) {
            this.value = i;
        }

        public static StickerDecoderType forNumber(int i) {
            if (i == 0) {
                return StickerDecoderTypePlatform;
            }
            if (i != 1) {
                return null;
            }
            return StickerDecoderTypeWxAM;
        }

        public static final C24025t.C24033e getDescriptor() {
            return MJComposingS12.getDescriptor().mo38346f().get(5);
        }

        public static C23908o0.C23912d<StickerDecoderType> internalGetValueMap() {
            return internalValueMap;
        }

        public final C24025t.C24033e getDescriptorForType() {
            return getDescriptor();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final C24025t.C24034f getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().mo38334h().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static StickerDecoderType valueOf(int i) {
            return forNumber(i);
        }

        public static StickerDecoderType valueOf(C24025t.C24034f fVar) {
            if (fVar.f69101h == getDescriptor()) {
                int i = fVar.f69097d;
                if (i == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[i];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class StickerOverlayDesc extends C23872m0 implements StickerOverlayDescOrBuilder {
        public static final int DECODER_TYPE_FIELD_NUMBER = 1;
        private static final StickerOverlayDesc DEFAULT_INSTANCE = new StickerOverlayDesc();
        public static final int FILE_PATH_FIELD_NUMBER = 3;
        public static final int LAYER_INDEX_FIELD_NUMBER = 5;
        public static final int LAYER_SPATIAL_DESC_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final C24062w1<StickerOverlayDesc> PARSER = new C23813c<StickerOverlayDesc>() {
            public StickerOverlayDesc parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new StickerOverlayDesc(lVar, a0Var, (C241671) null);
            }
        };
        public static final int TIMING_FILL_MODE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int decoderType_;
        /* access modifiers changed from: private */
        public volatile Object filePath_;
        /* access modifiers changed from: private */
        public int layerIndex_;
        /* access modifiers changed from: private */
        public LayerSpatialDesc layerSpatialDesc_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public int timingFillMode_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements StickerOverlayDescOrBuilder {
            private int decoderType_;
            private Object filePath_;
            private int layerIndex_;
            private C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> layerSpatialDescBuilder_;
            private LayerSpatialDesc layerSpatialDesc_;
            private int timingFillMode_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_StickerOverlayDesc_descriptor;
            }

            private C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> getLayerSpatialDescFieldBuilder() {
                if (this.layerSpatialDescBuilder_ == null) {
                    this.layerSpatialDescBuilder_ = new C23844i2<>(getLayerSpatialDesc(), getParentForChildren(), isClean());
                    this.layerSpatialDesc_ = null;
                }
                return this.layerSpatialDescBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearDecoderType() {
                this.decoderType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFilePath() {
                this.filePath_ = StickerOverlayDesc.getDefaultInstance().getFilePath();
                onChanged();
                return this;
            }

            public Builder clearLayerIndex() {
                this.layerIndex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLayerSpatialDesc() {
                if (this.layerSpatialDescBuilder_ == null) {
                    this.layerSpatialDesc_ = null;
                    onChanged();
                } else {
                    this.layerSpatialDesc_ = null;
                    this.layerSpatialDescBuilder_ = null;
                }
                return this;
            }

            public Builder clearTimingFillMode() {
                this.timingFillMode_ = 0;
                onChanged();
                return this;
            }

            public StickerDecoderType getDecoderType() {
                StickerDecoderType valueOf = StickerDecoderType.valueOf(this.decoderType_);
                return valueOf == null ? StickerDecoderType.UNRECOGNIZED : valueOf;
            }

            public int getDecoderTypeValue() {
                return this.decoderType_;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_StickerOverlayDesc_descriptor;
            }

            public String getFilePath() {
                Object obj = this.filePath_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String u = ((C16994k) obj).mo18752u();
                this.filePath_ = u;
                return u;
            }

            public C16994k getFilePathBytes() {
                Object obj = this.filePath_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.filePath_ = k;
                return k;
            }

            public int getLayerIndex() {
                return this.layerIndex_;
            }

            public LayerSpatialDesc getLayerSpatialDesc() {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                LayerSpatialDesc layerSpatialDesc = this.layerSpatialDesc_;
                return layerSpatialDesc == null ? LayerSpatialDesc.getDefaultInstance() : layerSpatialDesc;
            }

            public LayerSpatialDesc.Builder getLayerSpatialDescBuilder() {
                onChanged();
                return getLayerSpatialDescFieldBuilder().mo37705d();
            }

            public LayerSpatialDescOrBuilder getLayerSpatialDescOrBuilder() {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                LayerSpatialDesc layerSpatialDesc = this.layerSpatialDesc_;
                return layerSpatialDesc == null ? LayerSpatialDesc.getDefaultInstance() : layerSpatialDesc;
            }

            public TimingFillMode getTimingFillMode() {
                TimingFillMode valueOf = TimingFillMode.valueOf(this.timingFillMode_);
                return valueOf == null ? TimingFillMode.UNRECOGNIZED : valueOf;
            }

            public int getTimingFillModeValue() {
                return this.timingFillMode_;
            }

            public boolean hasLayerSpatialDesc() {
                return (this.layerSpatialDescBuilder_ == null && this.layerSpatialDesc_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$16900 = MJComposingS12.f69259xed29395a;
                access$16900.mo37875c(StickerOverlayDesc.class, Builder.class);
                return access$16900;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeLayerSpatialDesc(LayerSpatialDesc layerSpatialDesc) {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var == null) {
                    LayerSpatialDesc layerSpatialDesc2 = this.layerSpatialDesc_;
                    if (layerSpatialDesc2 != null) {
                        this.layerSpatialDesc_ = LayerSpatialDesc.newBuilder(layerSpatialDesc2).mergeFrom(layerSpatialDesc).buildPartial();
                    } else {
                        this.layerSpatialDesc_ = layerSpatialDesc;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(layerSpatialDesc);
                }
                return this;
            }

            public Builder setDecoderType(StickerDecoderType stickerDecoderType) {
                stickerDecoderType.getClass();
                this.decoderType_ = stickerDecoderType.getNumber();
                onChanged();
                return this;
            }

            public Builder setDecoderTypeValue(int i) {
                this.decoderType_ = i;
                onChanged();
                return this;
            }

            public Builder setFilePath(String str) {
                str.getClass();
                this.filePath_ = str;
                onChanged();
                return this;
            }

            public Builder setFilePathBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.filePath_ = kVar;
                onChanged();
                return this;
            }

            public Builder setLayerIndex(int i) {
                this.layerIndex_ = i;
                onChanged();
                return this;
            }

            public Builder setLayerSpatialDesc(LayerSpatialDesc layerSpatialDesc) {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var == null) {
                    layerSpatialDesc.getClass();
                    this.layerSpatialDesc_ = layerSpatialDesc;
                    onChanged();
                } else {
                    i2Var.mo37710i(layerSpatialDesc);
                }
                return this;
            }

            public Builder setTimingFillMode(TimingFillMode timingFillMode) {
                timingFillMode.getClass();
                this.timingFillMode_ = timingFillMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setTimingFillModeValue(int i) {
                this.timingFillMode_ = i;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                this.decoderType_ = 0;
                this.timingFillMode_ = 0;
                this.filePath_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public StickerOverlayDesc build() {
                StickerOverlayDesc buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public StickerOverlayDesc buildPartial() {
                StickerOverlayDesc stickerOverlayDesc = new StickerOverlayDesc((C23872m0.C23874b) this, (C241671) null);
                int unused = stickerOverlayDesc.decoderType_ = this.decoderType_;
                int unused2 = stickerOverlayDesc.timingFillMode_ = this.timingFillMode_;
                Object unused3 = stickerOverlayDesc.filePath_ = this.filePath_;
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var == null) {
                    LayerSpatialDesc unused4 = stickerOverlayDesc.layerSpatialDesc_ = this.layerSpatialDesc_;
                } else {
                    LayerSpatialDesc unused5 = stickerOverlayDesc.layerSpatialDesc_ = i2Var.mo37703b();
                }
                int unused6 = stickerOverlayDesc.layerIndex_ = this.layerIndex_;
                onBuilt();
                return stickerOverlayDesc;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public StickerOverlayDesc getDefaultInstanceForType() {
                return StickerOverlayDesc.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.decoderType_ = 0;
                this.timingFillMode_ = 0;
                this.filePath_ = "";
                if (this.layerSpatialDescBuilder_ == null) {
                    this.layerSpatialDesc_ = null;
                } else {
                    this.layerSpatialDesc_ = null;
                    this.layerSpatialDescBuilder_ = null;
                }
                this.layerIndex_ = 0;
                return this;
            }

            public Builder setLayerSpatialDesc(LayerSpatialDesc.Builder builder) {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var == null) {
                    this.layerSpatialDesc_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof StickerOverlayDesc) {
                    return mergeFrom((StickerOverlayDesc) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.decoderType_ = 0;
                this.timingFillMode_ = 0;
                this.filePath_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(StickerOverlayDesc stickerOverlayDesc) {
                if (stickerOverlayDesc == StickerOverlayDesc.getDefaultInstance()) {
                    return this;
                }
                if (stickerOverlayDesc.decoderType_ != 0) {
                    setDecoderTypeValue(stickerOverlayDesc.getDecoderTypeValue());
                }
                if (stickerOverlayDesc.timingFillMode_ != 0) {
                    setTimingFillModeValue(stickerOverlayDesc.getTimingFillModeValue());
                }
                if (!stickerOverlayDesc.getFilePath().isEmpty()) {
                    this.filePath_ = stickerOverlayDesc.filePath_;
                    onChanged();
                }
                if (stickerOverlayDesc.hasLayerSpatialDesc()) {
                    mergeLayerSpatialDesc(stickerOverlayDesc.getLayerSpatialDesc());
                }
                if (stickerOverlayDesc.getLayerIndex() != 0) {
                    setLayerIndex(stickerOverlayDesc.getLayerIndex());
                }
                mergeUnknownFields(stickerOverlayDesc.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.StickerOverlayDesc.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.StickerOverlayDesc.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$StickerOverlayDesc r3 = (com.tencent.maas.composing.MJComposingS12.StickerOverlayDesc) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.StickerOverlayDesc) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$StickerOverlayDesc r4 = (com.tencent.maas.composing.MJComposingS12.StickerOverlayDesc) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.StickerOverlayDesc) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.StickerOverlayDesc.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$StickerOverlayDesc$Builder");
            }
        }

        public /* synthetic */ StickerOverlayDesc(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static StickerOverlayDesc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_StickerOverlayDesc_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StickerOverlayDesc parseDelimitedFrom(InputStream inputStream) {
            return (StickerOverlayDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StickerOverlayDesc parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<StickerOverlayDesc> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StickerOverlayDesc)) {
                return super.equals(obj);
            }
            StickerOverlayDesc stickerOverlayDesc = (StickerOverlayDesc) obj;
            if (this.decoderType_ == stickerOverlayDesc.decoderType_ && this.timingFillMode_ == stickerOverlayDesc.timingFillMode_ && getFilePath().equals(stickerOverlayDesc.getFilePath()) && hasLayerSpatialDesc() == stickerOverlayDesc.hasLayerSpatialDesc()) {
                return (!hasLayerSpatialDesc() || getLayerSpatialDesc().equals(stickerOverlayDesc.getLayerSpatialDesc())) && getLayerIndex() == stickerOverlayDesc.getLayerIndex() && this.unknownFields.equals(stickerOverlayDesc.unknownFields);
            }
            return false;
        }

        public StickerDecoderType getDecoderType() {
            StickerDecoderType valueOf = StickerDecoderType.valueOf(this.decoderType_);
            return valueOf == null ? StickerDecoderType.UNRECOGNIZED : valueOf;
        }

        public int getDecoderTypeValue() {
            return this.decoderType_;
        }

        public String getFilePath() {
            Object obj = this.filePath_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String u = ((C16994k) obj).mo18752u();
            this.filePath_ = u;
            return u;
        }

        public C16994k getFilePathBytes() {
            Object obj = this.filePath_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.filePath_ = k;
            return k;
        }

        public int getLayerIndex() {
            return this.layerIndex_;
        }

        public LayerSpatialDesc getLayerSpatialDesc() {
            LayerSpatialDesc layerSpatialDesc = this.layerSpatialDesc_;
            return layerSpatialDesc == null ? LayerSpatialDesc.getDefaultInstance() : layerSpatialDesc;
        }

        public LayerSpatialDescOrBuilder getLayerSpatialDescOrBuilder() {
            return getLayerSpatialDesc();
        }

        public C24062w1<StickerOverlayDesc> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.decoderType_ != StickerDecoderType.StickerDecoderTypePlatform.getNumber()) {
                i2 = 0 + C23897n.m29261f(1, this.decoderType_);
            }
            if (this.timingFillMode_ != TimingFillMode.TimingFillModeNone.getNumber()) {
                i2 += C23897n.m29261f(2, this.timingFillMode_);
            }
            if (!getFilePathBytes().isEmpty()) {
                i2 += C23872m0.computeStringSize(3, this.filePath_);
            }
            if (this.layerSpatialDesc_ != null) {
                i2 += C23897n.m29270o(4, getLayerSpatialDesc());
            }
            int i3 = this.layerIndex_;
            if (i3 != 0) {
                i2 += C23897n.m29266k(5, i3);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public TimingFillMode getTimingFillMode() {
            TimingFillMode valueOf = TimingFillMode.valueOf(this.timingFillMode_);
            return valueOf == null ? TimingFillMode.UNRECOGNIZED : valueOf;
        }

        public int getTimingFillModeValue() {
            return this.timingFillMode_;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasLayerSpatialDesc() {
            return this.layerSpatialDesc_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((C82986r.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + this.decoderType_) * 37) + 2) * 53) + this.timingFillMode_) * 37) + 3) * 53) + getFilePath().hashCode();
            if (hasLayerSpatialDesc()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getLayerSpatialDesc().hashCode();
            }
            int layerIndex = (((((hashCode * 37) + 5) * 53) + getLayerIndex()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = layerIndex;
            return layerIndex;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$16900 = MJComposingS12.f69259xed29395a;
            access$16900.mo37875c(StickerOverlayDesc.class, Builder.class);
            return access$16900;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new StickerOverlayDesc();
        }

        public void writeTo(C23897n nVar) {
            if (this.decoderType_ != StickerDecoderType.StickerDecoderTypePlatform.getNumber()) {
                nVar.mo37907N(1, this.decoderType_);
            }
            if (this.timingFillMode_ != TimingFillMode.TimingFillModeNone.getNumber()) {
                nVar.mo37907N(2, this.timingFillMode_);
            }
            if (!getFilePathBytes().isEmpty()) {
                C23872m0.writeString(nVar, 3, this.filePath_);
            }
            if (this.layerSpatialDesc_ != null) {
                nVar.mo37909P(4, getLayerSpatialDesc());
            }
            int i = this.layerIndex_;
            if (i != 0) {
                nVar.mo37907N(5, i);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ StickerOverlayDesc(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(StickerOverlayDesc stickerOverlayDesc) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stickerOverlayDesc);
        }

        public static StickerOverlayDesc parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private StickerOverlayDesc(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static StickerOverlayDesc parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (StickerOverlayDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static StickerOverlayDesc parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public StickerOverlayDesc getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static StickerOverlayDesc parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private StickerOverlayDesc() {
            this.memoizedIsInitialized = -1;
            this.decoderType_ = 0;
            this.timingFillMode_ = 0;
            this.filePath_ = "";
        }

        public static StickerOverlayDesc parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static StickerOverlayDesc parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static StickerOverlayDesc parseFrom(InputStream inputStream) {
            return (StickerOverlayDesc) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static StickerOverlayDesc parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (StickerOverlayDesc) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        private StickerOverlayDesc(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 8) {
                            this.decoderType_ = lVar.mo37770o();
                        } else if (F == 16) {
                            this.timingFillMode_ = lVar.mo37770o();
                        } else if (F == 26) {
                            this.filePath_ = lVar.mo37756E();
                        } else if (F == 34) {
                            LayerSpatialDesc.Builder builder = null;
                            LayerSpatialDesc layerSpatialDesc = this.layerSpatialDesc_;
                            builder = layerSpatialDesc != null ? layerSpatialDesc.toBuilder() : builder;
                            LayerSpatialDesc layerSpatialDesc2 = (LayerSpatialDesc) lVar.mo37777v(LayerSpatialDesc.parser(), a0Var);
                            this.layerSpatialDesc_ = layerSpatialDesc2;
                            if (builder != null) {
                                builder.mergeFrom(layerSpatialDesc2);
                                this.layerSpatialDesc_ = builder.buildPartial();
                            }
                        } else if (F == 40) {
                            this.layerIndex_ = lVar.mo37775t();
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static StickerOverlayDesc parseFrom(C23856l lVar) {
            return (StickerOverlayDesc) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static StickerOverlayDesc parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (StickerOverlayDesc) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface StickerOverlayDescOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        StickerDecoderType getDecoderType();

        int getDecoderTypeValue();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        String getFilePath();

        C16994k getFilePathBytes();

        /* synthetic */ String getInitializationErrorString();

        int getLayerIndex();

        LayerSpatialDesc getLayerSpatialDesc();

        LayerSpatialDescOrBuilder getLayerSpatialDescOrBuilder();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        TimingFillMode getTimingFillMode();

        int getTimingFillModeValue();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        boolean hasLayerSpatialDesc();

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    public static final class TextOverlayDesc extends C23872m0 implements TextOverlayDescOrBuilder {
        private static final TextOverlayDesc DEFAULT_INSTANCE = new TextOverlayDesc();
        public static final int LAYER_INDEX_FIELD_NUMBER = 6;
        public static final int LAYER_SPATIAL_DESC_FIELD_NUMBER = 4;
        public static final int LAYER_STYLE_FIELD_NUMBER = 3;
        public static final int MAXIMUM_WIDTH_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final C24062w1<TextOverlayDesc> PARSER = new C23813c<TextOverlayDesc>() {
            public TextOverlayDesc parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new TextOverlayDesc(lVar, a0Var, (C241671) null);
            }
        };
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int TEXT_STYLE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int layerIndex_;
        /* access modifiers changed from: private */
        public LayerSpatialDesc layerSpatialDesc_;
        /* access modifiers changed from: private */
        public LayerStyle layerStyle_;
        /* access modifiers changed from: private */
        public float maximumWidth_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public TextStyle textStyle_;
        /* access modifiers changed from: private */
        public volatile Object text_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements TextOverlayDescOrBuilder {
            private int layerIndex_;
            private C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> layerSpatialDescBuilder_;
            private LayerSpatialDesc layerSpatialDesc_;
            private C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> layerStyleBuilder_;
            private LayerStyle layerStyle_;
            private float maximumWidth_;
            private C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> textStyleBuilder_;
            private TextStyle textStyle_;
            private Object text_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_TextOverlayDesc_descriptor;
            }

            private C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> getLayerSpatialDescFieldBuilder() {
                if (this.layerSpatialDescBuilder_ == null) {
                    this.layerSpatialDescBuilder_ = new C23844i2<>(getLayerSpatialDesc(), getParentForChildren(), isClean());
                    this.layerSpatialDesc_ = null;
                }
                return this.layerSpatialDescBuilder_;
            }

            private C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> getLayerStyleFieldBuilder() {
                if (this.layerStyleBuilder_ == null) {
                    this.layerStyleBuilder_ = new C23844i2<>(getLayerStyle(), getParentForChildren(), isClean());
                    this.layerStyle_ = null;
                }
                return this.layerStyleBuilder_;
            }

            private C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> getTextStyleFieldBuilder() {
                if (this.textStyleBuilder_ == null) {
                    this.textStyleBuilder_ = new C23844i2<>(getTextStyle(), getParentForChildren(), isClean());
                    this.textStyle_ = null;
                }
                return this.textStyleBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearLayerIndex() {
                this.layerIndex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLayerSpatialDesc() {
                if (this.layerSpatialDescBuilder_ == null) {
                    this.layerSpatialDesc_ = null;
                    onChanged();
                } else {
                    this.layerSpatialDesc_ = null;
                    this.layerSpatialDescBuilder_ = null;
                }
                return this;
            }

            public Builder clearLayerStyle() {
                if (this.layerStyleBuilder_ == null) {
                    this.layerStyle_ = null;
                    onChanged();
                } else {
                    this.layerStyle_ = null;
                    this.layerStyleBuilder_ = null;
                }
                return this;
            }

            public Builder clearMaximumWidth() {
                this.maximumWidth_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearText() {
                this.text_ = TextOverlayDesc.getDefaultInstance().getText();
                onChanged();
                return this;
            }

            public Builder clearTextStyle() {
                if (this.textStyleBuilder_ == null) {
                    this.textStyle_ = null;
                    onChanged();
                } else {
                    this.textStyle_ = null;
                    this.textStyleBuilder_ = null;
                }
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_TextOverlayDesc_descriptor;
            }

            public int getLayerIndex() {
                return this.layerIndex_;
            }

            public LayerSpatialDesc getLayerSpatialDesc() {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                LayerSpatialDesc layerSpatialDesc = this.layerSpatialDesc_;
                return layerSpatialDesc == null ? LayerSpatialDesc.getDefaultInstance() : layerSpatialDesc;
            }

            public LayerSpatialDesc.Builder getLayerSpatialDescBuilder() {
                onChanged();
                return getLayerSpatialDescFieldBuilder().mo37705d();
            }

            public LayerSpatialDescOrBuilder getLayerSpatialDescOrBuilder() {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                LayerSpatialDesc layerSpatialDesc = this.layerSpatialDesc_;
                return layerSpatialDesc == null ? LayerSpatialDesc.getDefaultInstance() : layerSpatialDesc;
            }

            public LayerStyle getLayerStyle() {
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var = this.layerStyleBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                LayerStyle layerStyle = this.layerStyle_;
                return layerStyle == null ? LayerStyle.getDefaultInstance() : layerStyle;
            }

            public LayerStyle.Builder getLayerStyleBuilder() {
                onChanged();
                return getLayerStyleFieldBuilder().mo37705d();
            }

            public LayerStyleOrBuilder getLayerStyleOrBuilder() {
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var = this.layerStyleBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                LayerStyle layerStyle = this.layerStyle_;
                return layerStyle == null ? LayerStyle.getDefaultInstance() : layerStyle;
            }

            public float getMaximumWidth() {
                return this.maximumWidth_;
            }

            public String getText() {
                Object obj = this.text_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String u = ((C16994k) obj).mo18752u();
                this.text_ = u;
                return u;
            }

            public C16994k getTextBytes() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.text_ = k;
                return k;
            }

            public TextStyle getTextStyle() {
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var = this.textStyleBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                TextStyle textStyle = this.textStyle_;
                return textStyle == null ? TextStyle.getDefaultInstance() : textStyle;
            }

            public TextStyle.Builder getTextStyleBuilder() {
                onChanged();
                return getTextStyleFieldBuilder().mo37705d();
            }

            public TextStyleOrBuilder getTextStyleOrBuilder() {
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var = this.textStyleBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                TextStyle textStyle = this.textStyle_;
                return textStyle == null ? TextStyle.getDefaultInstance() : textStyle;
            }

            public boolean hasLayerSpatialDesc() {
                return (this.layerSpatialDescBuilder_ == null && this.layerSpatialDesc_ == null) ? false : true;
            }

            public boolean hasLayerStyle() {
                return (this.layerStyleBuilder_ == null && this.layerStyle_ == null) ? false : true;
            }

            public boolean hasTextStyle() {
                return (this.textStyleBuilder_ == null && this.textStyle_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$21800 = MJComposingS12.f69260x7900ae6;
                access$21800.mo37875c(TextOverlayDesc.class, Builder.class);
                return access$21800;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeLayerSpatialDesc(LayerSpatialDesc layerSpatialDesc) {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var == null) {
                    LayerSpatialDesc layerSpatialDesc2 = this.layerSpatialDesc_;
                    if (layerSpatialDesc2 != null) {
                        this.layerSpatialDesc_ = LayerSpatialDesc.newBuilder(layerSpatialDesc2).mergeFrom(layerSpatialDesc).buildPartial();
                    } else {
                        this.layerSpatialDesc_ = layerSpatialDesc;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(layerSpatialDesc);
                }
                return this;
            }

            public Builder mergeLayerStyle(LayerStyle layerStyle) {
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var = this.layerStyleBuilder_;
                if (i2Var == null) {
                    LayerStyle layerStyle2 = this.layerStyle_;
                    if (layerStyle2 != null) {
                        this.layerStyle_ = LayerStyle.newBuilder(layerStyle2).mergeFrom(layerStyle).buildPartial();
                    } else {
                        this.layerStyle_ = layerStyle;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(layerStyle);
                }
                return this;
            }

            public Builder mergeTextStyle(TextStyle textStyle) {
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var = this.textStyleBuilder_;
                if (i2Var == null) {
                    TextStyle textStyle2 = this.textStyle_;
                    if (textStyle2 != null) {
                        this.textStyle_ = TextStyle.newBuilder(textStyle2).mergeFrom(textStyle).buildPartial();
                    } else {
                        this.textStyle_ = textStyle;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(textStyle);
                }
                return this;
            }

            public Builder setLayerIndex(int i) {
                this.layerIndex_ = i;
                onChanged();
                return this;
            }

            public Builder setLayerSpatialDesc(LayerSpatialDesc layerSpatialDesc) {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var == null) {
                    layerSpatialDesc.getClass();
                    this.layerSpatialDesc_ = layerSpatialDesc;
                    onChanged();
                } else {
                    i2Var.mo37710i(layerSpatialDesc);
                }
                return this;
            }

            public Builder setLayerStyle(LayerStyle layerStyle) {
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var = this.layerStyleBuilder_;
                if (i2Var == null) {
                    layerStyle.getClass();
                    this.layerStyle_ = layerStyle;
                    onChanged();
                } else {
                    i2Var.mo37710i(layerStyle);
                }
                return this;
            }

            public Builder setMaximumWidth(float f) {
                this.maximumWidth_ = f;
                onChanged();
                return this;
            }

            public Builder setText(String str) {
                str.getClass();
                this.text_ = str;
                onChanged();
                return this;
            }

            public Builder setTextBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.text_ = kVar;
                onChanged();
                return this;
            }

            public Builder setTextStyle(TextStyle textStyle) {
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var = this.textStyleBuilder_;
                if (i2Var == null) {
                    textStyle.getClass();
                    this.textStyle_ = textStyle;
                    onChanged();
                } else {
                    i2Var.mo37710i(textStyle);
                }
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                this.text_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public TextOverlayDesc build() {
                TextOverlayDesc buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public TextOverlayDesc buildPartial() {
                TextOverlayDesc textOverlayDesc = new TextOverlayDesc((C23872m0.C23874b) this, (C241671) null);
                Object unused = textOverlayDesc.text_ = this.text_;
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var = this.textStyleBuilder_;
                if (i2Var == null) {
                    TextStyle unused2 = textOverlayDesc.textStyle_ = this.textStyle_;
                } else {
                    TextStyle unused3 = textOverlayDesc.textStyle_ = i2Var.mo37703b();
                }
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var2 = this.layerStyleBuilder_;
                if (i2Var2 == null) {
                    LayerStyle unused4 = textOverlayDesc.layerStyle_ = this.layerStyle_;
                } else {
                    LayerStyle unused5 = textOverlayDesc.layerStyle_ = i2Var2.mo37703b();
                }
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var3 = this.layerSpatialDescBuilder_;
                if (i2Var3 == null) {
                    LayerSpatialDesc unused6 = textOverlayDesc.layerSpatialDesc_ = this.layerSpatialDesc_;
                } else {
                    LayerSpatialDesc unused7 = textOverlayDesc.layerSpatialDesc_ = i2Var3.mo37703b();
                }
                float unused8 = textOverlayDesc.maximumWidth_ = this.maximumWidth_;
                int unused9 = textOverlayDesc.layerIndex_ = this.layerIndex_;
                onBuilt();
                return textOverlayDesc;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public TextOverlayDesc getDefaultInstanceForType() {
                return TextOverlayDesc.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.text_ = "";
                if (this.textStyleBuilder_ == null) {
                    this.textStyle_ = null;
                } else {
                    this.textStyle_ = null;
                    this.textStyleBuilder_ = null;
                }
                if (this.layerStyleBuilder_ == null) {
                    this.layerStyle_ = null;
                } else {
                    this.layerStyle_ = null;
                    this.layerStyleBuilder_ = null;
                }
                if (this.layerSpatialDescBuilder_ == null) {
                    this.layerSpatialDesc_ = null;
                } else {
                    this.layerSpatialDesc_ = null;
                    this.layerSpatialDescBuilder_ = null;
                }
                this.maximumWidth_ = 0.0f;
                this.layerIndex_ = 0;
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.text_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setLayerSpatialDesc(LayerSpatialDesc.Builder builder) {
                C23844i2<LayerSpatialDesc, LayerSpatialDesc.Builder, LayerSpatialDescOrBuilder> i2Var = this.layerSpatialDescBuilder_;
                if (i2Var == null) {
                    this.layerSpatialDesc_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setLayerStyle(LayerStyle.Builder builder) {
                C23844i2<LayerStyle, LayerStyle.Builder, LayerStyleOrBuilder> i2Var = this.layerStyleBuilder_;
                if (i2Var == null) {
                    this.layerStyle_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setTextStyle(TextStyle.Builder builder) {
                C23844i2<TextStyle, TextStyle.Builder, TextStyleOrBuilder> i2Var = this.textStyleBuilder_;
                if (i2Var == null) {
                    this.textStyle_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof TextOverlayDesc) {
                    return mergeFrom((TextOverlayDesc) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(TextOverlayDesc textOverlayDesc) {
                if (textOverlayDesc == TextOverlayDesc.getDefaultInstance()) {
                    return this;
                }
                if (!textOverlayDesc.getText().isEmpty()) {
                    this.text_ = textOverlayDesc.text_;
                    onChanged();
                }
                if (textOverlayDesc.hasTextStyle()) {
                    mergeTextStyle(textOverlayDesc.getTextStyle());
                }
                if (textOverlayDesc.hasLayerStyle()) {
                    mergeLayerStyle(textOverlayDesc.getLayerStyle());
                }
                if (textOverlayDesc.hasLayerSpatialDesc()) {
                    mergeLayerSpatialDesc(textOverlayDesc.getLayerSpatialDesc());
                }
                if (textOverlayDesc.getMaximumWidth() != 0.0f) {
                    setMaximumWidth(textOverlayDesc.getMaximumWidth());
                }
                if (textOverlayDesc.getLayerIndex() != 0) {
                    setLayerIndex(textOverlayDesc.getLayerIndex());
                }
                mergeUnknownFields(textOverlayDesc.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.TextOverlayDesc.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.TextOverlayDesc.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$TextOverlayDesc r3 = (com.tencent.maas.composing.MJComposingS12.TextOverlayDesc) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.TextOverlayDesc) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$TextOverlayDesc r4 = (com.tencent.maas.composing.MJComposingS12.TextOverlayDesc) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.TextOverlayDesc) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.TextOverlayDesc.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$TextOverlayDesc$Builder");
            }
        }

        public /* synthetic */ TextOverlayDesc(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static TextOverlayDesc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_TextOverlayDesc_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TextOverlayDesc parseDelimitedFrom(InputStream inputStream) {
            return (TextOverlayDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TextOverlayDesc parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<TextOverlayDesc> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextOverlayDesc)) {
                return super.equals(obj);
            }
            TextOverlayDesc textOverlayDesc = (TextOverlayDesc) obj;
            if (!getText().equals(textOverlayDesc.getText()) || hasTextStyle() != textOverlayDesc.hasTextStyle()) {
                return false;
            }
            if ((hasTextStyle() && !getTextStyle().equals(textOverlayDesc.getTextStyle())) || hasLayerStyle() != textOverlayDesc.hasLayerStyle()) {
                return false;
            }
            if ((!hasLayerStyle() || getLayerStyle().equals(textOverlayDesc.getLayerStyle())) && hasLayerSpatialDesc() == textOverlayDesc.hasLayerSpatialDesc()) {
                return (!hasLayerSpatialDesc() || getLayerSpatialDesc().equals(textOverlayDesc.getLayerSpatialDesc())) && Float.floatToIntBits(getMaximumWidth()) == Float.floatToIntBits(textOverlayDesc.getMaximumWidth()) && getLayerIndex() == textOverlayDesc.getLayerIndex() && this.unknownFields.equals(textOverlayDesc.unknownFields);
            }
            return false;
        }

        public int getLayerIndex() {
            return this.layerIndex_;
        }

        public LayerSpatialDesc getLayerSpatialDesc() {
            LayerSpatialDesc layerSpatialDesc = this.layerSpatialDesc_;
            return layerSpatialDesc == null ? LayerSpatialDesc.getDefaultInstance() : layerSpatialDesc;
        }

        public LayerSpatialDescOrBuilder getLayerSpatialDescOrBuilder() {
            return getLayerSpatialDesc();
        }

        public LayerStyle getLayerStyle() {
            LayerStyle layerStyle = this.layerStyle_;
            return layerStyle == null ? LayerStyle.getDefaultInstance() : layerStyle;
        }

        public LayerStyleOrBuilder getLayerStyleOrBuilder() {
            return getLayerStyle();
        }

        public float getMaximumWidth() {
            return this.maximumWidth_;
        }

        public C24062w1<TextOverlayDesc> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getTextBytes().isEmpty()) {
                i2 = 0 + C23872m0.computeStringSize(1, this.text_);
            }
            if (this.textStyle_ != null) {
                i2 += C23897n.m29270o(2, getTextStyle());
            }
            if (this.layerStyle_ != null) {
                i2 += C23897n.m29270o(3, getLayerStyle());
            }
            if (this.layerSpatialDesc_ != null) {
                i2 += C23897n.m29270o(4, getLayerSpatialDesc());
            }
            float f = this.maximumWidth_;
            if (f != 0.0f) {
                i2 += C23897n.m29264i(5, f);
            }
            int i3 = this.layerIndex_;
            if (i3 != 0) {
                i2 += C23897n.m29266k(6, i3);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public String getText() {
            Object obj = this.text_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String u = ((C16994k) obj).mo18752u();
            this.text_ = u;
            return u;
        }

        public C16994k getTextBytes() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.text_ = k;
            return k;
        }

        public TextStyle getTextStyle() {
            TextStyle textStyle = this.textStyle_;
            return textStyle == null ? TextStyle.getDefaultInstance() : textStyle;
        }

        public TextStyleOrBuilder getTextStyleOrBuilder() {
            return getTextStyle();
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasLayerSpatialDesc() {
            return this.layerSpatialDesc_ != null;
        }

        public boolean hasLayerStyle() {
            return this.layerStyle_ != null;
        }

        public boolean hasTextStyle() {
            return this.textStyle_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((C82986r.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + getText().hashCode();
            if (hasTextStyle()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getTextStyle().hashCode();
            }
            if (hasLayerStyle()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getLayerStyle().hashCode();
            }
            if (hasLayerSpatialDesc()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getLayerSpatialDesc().hashCode();
            }
            int floatToIntBits = (((((((((hashCode * 37) + 5) * 53) + Float.floatToIntBits(getMaximumWidth())) * 37) + 6) * 53) + getLayerIndex()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = floatToIntBits;
            return floatToIntBits;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$21800 = MJComposingS12.f69260x7900ae6;
            access$21800.mo37875c(TextOverlayDesc.class, Builder.class);
            return access$21800;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new TextOverlayDesc();
        }

        public void writeTo(C23897n nVar) {
            if (!getTextBytes().isEmpty()) {
                C23872m0.writeString(nVar, 1, this.text_);
            }
            if (this.textStyle_ != null) {
                nVar.mo37909P(2, getTextStyle());
            }
            if (this.layerStyle_ != null) {
                nVar.mo37909P(3, getLayerStyle());
            }
            if (this.layerSpatialDesc_ != null) {
                nVar.mo37909P(4, getLayerSpatialDesc());
            }
            float f = this.maximumWidth_;
            if (f != 0.0f) {
                nVar.mo37906M(5, f);
            }
            int i = this.layerIndex_;
            if (i != 0) {
                nVar.mo37907N(6, i);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ TextOverlayDesc(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(TextOverlayDesc textOverlayDesc) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(textOverlayDesc);
        }

        public static TextOverlayDesc parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private TextOverlayDesc(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static TextOverlayDesc parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TextOverlayDesc) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static TextOverlayDesc parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public TextOverlayDesc getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static TextOverlayDesc parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private TextOverlayDesc() {
            this.memoizedIsInitialized = -1;
            this.text_ = "";
        }

        public static TextOverlayDesc parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static TextOverlayDesc parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static TextOverlayDesc parseFrom(InputStream inputStream) {
            return (TextOverlayDesc) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.maas.composing.MJComposingS12$TextStyle$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.tencent.maas.composing.MJComposingS12$LayerStyle$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc$Builder} */
        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v7 */
        /* JADX WARNING: type inference failed for: r5v8 */
        /* JADX WARNING: type inference failed for: r5v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private TextOverlayDesc(com.google.protobuf.C23856l r7, com.google.protobuf.C23806a0 r8) {
            /*
                r6 = this;
                r6.<init>()
                r8.getClass()
                com.google.protobuf.s2$a r0 = com.google.protobuf.C24020s2.m29807b()
                r1 = 0
            L_0x000b:
                if (r1 != 0) goto L_0x00c8
                int r2 = r7.mo37757F()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                r3 = 1
                if (r2 == 0) goto L_0x00ac
                r4 = 10
                if (r2 == r4) goto L_0x00a4
                r4 = 18
                r5 = 0
                if (r2 == r4) goto L_0x0083
                r4 = 26
                if (r2 == r4) goto L_0x0063
                r4 = 34
                if (r2 == r4) goto L_0x0043
                r4 = 45
                if (r2 == r4) goto L_0x003c
                r4 = 48
                if (r2 == r4) goto L_0x0035
                boolean r2 = r6.parseUnknownField(r7, r0, r8, r2)     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                if (r2 != 0) goto L_0x000b
                goto L_0x00ac
            L_0x0035:
                int r2 = r7.mo37775t()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                r6.layerIndex_ = r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                goto L_0x000b
            L_0x003c:
                float r2 = r7.mo37773r()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                r6.maximumWidth_ = r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                goto L_0x000b
            L_0x0043:
                com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc r2 = r6.layerSpatialDesc_     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                if (r2 == 0) goto L_0x004b
                com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
            L_0x004b:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc.parser()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc r2 = (com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc) r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                r6.layerSpatialDesc_ = r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.LayerSpatialDesc) r2)     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                com.tencent.maas.composing.MJComposingS12$LayerSpatialDesc r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                r6.layerSpatialDesc_ = r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                goto L_0x000b
            L_0x0063:
                com.tencent.maas.composing.MJComposingS12$LayerStyle r2 = r6.layerStyle_     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                if (r2 == 0) goto L_0x006b
                com.tencent.maas.composing.MJComposingS12$LayerStyle$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
            L_0x006b:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.LayerStyle.parser()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                com.tencent.maas.composing.MJComposingS12$LayerStyle r2 = (com.tencent.maas.composing.MJComposingS12.LayerStyle) r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                r6.layerStyle_ = r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.LayerStyle) r2)     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                com.tencent.maas.composing.MJComposingS12$LayerStyle r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                r6.layerStyle_ = r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                goto L_0x000b
            L_0x0083:
                com.tencent.maas.composing.MJComposingS12$TextStyle r2 = r6.textStyle_     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                if (r2 == 0) goto L_0x008b
                com.tencent.maas.composing.MJComposingS12$TextStyle$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
            L_0x008b:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.TextStyle.parser()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                com.tencent.maas.composing.MJComposingS12$TextStyle r2 = (com.tencent.maas.composing.MJComposingS12.TextStyle) r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                r6.textStyle_ = r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.TextStyle) r2)     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                com.tencent.maas.composing.MJComposingS12$TextStyle r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                r6.textStyle_ = r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                goto L_0x000b
            L_0x00a4:
                java.lang.String r2 = r7.mo37756E()     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                r6.text_ = r2     // Catch:{ p0 -> 0x00ba, IOException -> 0x00b1 }
                goto L_0x000b
            L_0x00ac:
                r1 = 1
                goto L_0x000b
            L_0x00af:
                r7 = move-exception
                goto L_0x00be
            L_0x00b1:
                r7 = move-exception
                com.google.protobuf.p0 r8 = new com.google.protobuf.p0     // Catch:{ all -> 0x00af }
                r8.<init>((java.io.IOException) r7)     // Catch:{ all -> 0x00af }
                r8.f68530d = r6     // Catch:{ all -> 0x00af }
                throw r8     // Catch:{ all -> 0x00af }
            L_0x00ba:
                r7 = move-exception
                r7.f68530d = r6     // Catch:{ all -> 0x00af }
                throw r7     // Catch:{ all -> 0x00af }
            L_0x00be:
                com.google.protobuf.s2 r8 = r0.build()
                r6.unknownFields = r8
                r6.makeExtensionsImmutable()
                throw r7
            L_0x00c8:
                com.google.protobuf.s2 r7 = r0.build()
                r6.unknownFields = r7
                r6.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.TextOverlayDesc.<init>(com.google.protobuf.l, com.google.protobuf.a0):void");
        }

        public static TextOverlayDesc parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TextOverlayDesc) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static TextOverlayDesc parseFrom(C23856l lVar) {
            return (TextOverlayDesc) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static TextOverlayDesc parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TextOverlayDesc) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface TextOverlayDescOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        int getLayerIndex();

        LayerSpatialDesc getLayerSpatialDesc();

        LayerSpatialDescOrBuilder getLayerSpatialDescOrBuilder();

        LayerStyle getLayerStyle();

        LayerStyleOrBuilder getLayerStyleOrBuilder();

        float getMaximumWidth();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        String getText();

        C16994k getTextBytes();

        TextStyle getTextStyle();

        TextStyleOrBuilder getTextStyleOrBuilder();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        boolean hasLayerSpatialDesc();

        boolean hasLayerStyle();

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasTextStyle();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TextStyle extends C23872m0 implements TextStyleOrBuilder {
        private static final TextStyle DEFAULT_INSTANCE = new TextStyle();
        public static final int FILL_COLOR_FIELD_NUMBER = 1;
        public static final int FONT_FILE_PATH_FIELD_NUMBER = 9;
        public static final int FONT_NAME_FIELD_NUMBER = 5;
        public static final int FONT_SIZE_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final C24062w1<TextStyle> PARSER = new C23813c<TextStyle>() {
            public TextStyle parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new TextStyle(lVar, a0Var, (C241671) null);
            }
        };
        public static final int SHADOW_COLOR_FIELD_NUMBER = 7;
        public static final int SHADOW_OFFSET_FIELD_NUMBER = 6;
        public static final int SHADOW_RADIUS_FIELD_NUMBER = 8;
        public static final int STROKE_COLOR_FIELD_NUMBER = 2;
        public static final int STROKE_WIDTH_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public Color fillColor_;
        /* access modifiers changed from: private */
        public volatile Object fontFilePath_;
        /* access modifiers changed from: private */
        public volatile Object fontName_;
        /* access modifiers changed from: private */
        public float fontSize_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public Color shadowColor_;
        /* access modifiers changed from: private */
        public Vec2 shadowOffset_;
        /* access modifiers changed from: private */
        public float shadowRadius_;
        /* access modifiers changed from: private */
        public Color strokeColor_;
        /* access modifiers changed from: private */
        public float strokeWidth_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements TextStyleOrBuilder {
            private C23844i2<Color, Color.Builder, ColorOrBuilder> fillColorBuilder_;
            private Color fillColor_;
            private Object fontFilePath_;
            private Object fontName_;
            private float fontSize_;
            private C23844i2<Color, Color.Builder, ColorOrBuilder> shadowColorBuilder_;
            private Color shadowColor_;
            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> shadowOffsetBuilder_;
            private Vec2 shadowOffset_;
            private float shadowRadius_;
            private C23844i2<Color, Color.Builder, ColorOrBuilder> strokeColorBuilder_;
            private Color strokeColor_;
            private float strokeWidth_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_TextStyle_descriptor;
            }

            private C23844i2<Color, Color.Builder, ColorOrBuilder> getFillColorFieldBuilder() {
                if (this.fillColorBuilder_ == null) {
                    this.fillColorBuilder_ = new C23844i2<>(getFillColor(), getParentForChildren(), isClean());
                    this.fillColor_ = null;
                }
                return this.fillColorBuilder_;
            }

            private C23844i2<Color, Color.Builder, ColorOrBuilder> getShadowColorFieldBuilder() {
                if (this.shadowColorBuilder_ == null) {
                    this.shadowColorBuilder_ = new C23844i2<>(getShadowColor(), getParentForChildren(), isClean());
                    this.shadowColor_ = null;
                }
                return this.shadowColorBuilder_;
            }

            private C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> getShadowOffsetFieldBuilder() {
                if (this.shadowOffsetBuilder_ == null) {
                    this.shadowOffsetBuilder_ = new C23844i2<>(getShadowOffset(), getParentForChildren(), isClean());
                    this.shadowOffset_ = null;
                }
                return this.shadowOffsetBuilder_;
            }

            private C23844i2<Color, Color.Builder, ColorOrBuilder> getStrokeColorFieldBuilder() {
                if (this.strokeColorBuilder_ == null) {
                    this.strokeColorBuilder_ = new C23844i2<>(getStrokeColor(), getParentForChildren(), isClean());
                    this.strokeColor_ = null;
                }
                return this.strokeColorBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearFillColor() {
                if (this.fillColorBuilder_ == null) {
                    this.fillColor_ = null;
                    onChanged();
                } else {
                    this.fillColor_ = null;
                    this.fillColorBuilder_ = null;
                }
                return this;
            }

            public Builder clearFontFilePath() {
                this.fontFilePath_ = TextStyle.getDefaultInstance().getFontFilePath();
                onChanged();
                return this;
            }

            public Builder clearFontName() {
                this.fontName_ = TextStyle.getDefaultInstance().getFontName();
                onChanged();
                return this;
            }

            public Builder clearFontSize() {
                this.fontSize_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearShadowColor() {
                if (this.shadowColorBuilder_ == null) {
                    this.shadowColor_ = null;
                    onChanged();
                } else {
                    this.shadowColor_ = null;
                    this.shadowColorBuilder_ = null;
                }
                return this;
            }

            public Builder clearShadowOffset() {
                if (this.shadowOffsetBuilder_ == null) {
                    this.shadowOffset_ = null;
                    onChanged();
                } else {
                    this.shadowOffset_ = null;
                    this.shadowOffsetBuilder_ = null;
                }
                return this;
            }

            public Builder clearShadowRadius() {
                this.shadowRadius_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearStrokeColor() {
                if (this.strokeColorBuilder_ == null) {
                    this.strokeColor_ = null;
                    onChanged();
                } else {
                    this.strokeColor_ = null;
                    this.strokeColorBuilder_ = null;
                }
                return this;
            }

            public Builder clearStrokeWidth() {
                this.strokeWidth_ = 0.0f;
                onChanged();
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_TextStyle_descriptor;
            }

            public Color getFillColor() {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.fillColorBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Color color = this.fillColor_;
                return color == null ? Color.getDefaultInstance() : color;
            }

            public Color.Builder getFillColorBuilder() {
                onChanged();
                return getFillColorFieldBuilder().mo37705d();
            }

            public ColorOrBuilder getFillColorOrBuilder() {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.fillColorBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Color color = this.fillColor_;
                return color == null ? Color.getDefaultInstance() : color;
            }

            public String getFontFilePath() {
                Object obj = this.fontFilePath_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String u = ((C16994k) obj).mo18752u();
                this.fontFilePath_ = u;
                return u;
            }

            public C16994k getFontFilePathBytes() {
                Object obj = this.fontFilePath_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.fontFilePath_ = k;
                return k;
            }

            public String getFontName() {
                Object obj = this.fontName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String u = ((C16994k) obj).mo18752u();
                this.fontName_ = u;
                return u;
            }

            public C16994k getFontNameBytes() {
                Object obj = this.fontName_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.fontName_ = k;
                return k;
            }

            public float getFontSize() {
                return this.fontSize_;
            }

            public Color getShadowColor() {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.shadowColorBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Color color = this.shadowColor_;
                return color == null ? Color.getDefaultInstance() : color;
            }

            public Color.Builder getShadowColorBuilder() {
                onChanged();
                return getShadowColorFieldBuilder().mo37705d();
            }

            public ColorOrBuilder getShadowColorOrBuilder() {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.shadowColorBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Color color = this.shadowColor_;
                return color == null ? Color.getDefaultInstance() : color;
            }

            public Vec2 getShadowOffset() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.shadowOffsetBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Vec2 vec2 = this.shadowOffset_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public Vec2.Builder getShadowOffsetBuilder() {
                onChanged();
                return getShadowOffsetFieldBuilder().mo37705d();
            }

            public Vec2OrBuilder getShadowOffsetOrBuilder() {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.shadowOffsetBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Vec2 vec2 = this.shadowOffset_;
                return vec2 == null ? Vec2.getDefaultInstance() : vec2;
            }

            public float getShadowRadius() {
                return this.shadowRadius_;
            }

            public Color getStrokeColor() {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.strokeColorBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Color color = this.strokeColor_;
                return color == null ? Color.getDefaultInstance() : color;
            }

            public Color.Builder getStrokeColorBuilder() {
                onChanged();
                return getStrokeColorFieldBuilder().mo37705d();
            }

            public ColorOrBuilder getStrokeColorOrBuilder() {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.strokeColorBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Color color = this.strokeColor_;
                return color == null ? Color.getDefaultInstance() : color;
            }

            public float getStrokeWidth() {
                return this.strokeWidth_;
            }

            public boolean hasFillColor() {
                return (this.fillColorBuilder_ == null && this.fillColor_ == null) ? false : true;
            }

            public boolean hasShadowColor() {
                return (this.shadowColorBuilder_ == null && this.shadowColor_ == null) ? false : true;
            }

            public boolean hasShadowOffset() {
                return (this.shadowOffsetBuilder_ == null && this.shadowOffset_ == null) ? false : true;
            }

            public boolean hasStrokeColor() {
                return (this.strokeColorBuilder_ == null && this.strokeColor_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$18400 = MJComposingS12.internal_static_MJComposingS12_TextStyle_fieldAccessorTable;
                access$18400.mo37875c(TextStyle.class, Builder.class);
                return access$18400;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFillColor(Color color) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.fillColorBuilder_;
                if (i2Var == null) {
                    Color color2 = this.fillColor_;
                    if (color2 != null) {
                        this.fillColor_ = Color.newBuilder(color2).mergeFrom(color).buildPartial();
                    } else {
                        this.fillColor_ = color;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(color);
                }
                return this;
            }

            public Builder mergeShadowColor(Color color) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.shadowColorBuilder_;
                if (i2Var == null) {
                    Color color2 = this.shadowColor_;
                    if (color2 != null) {
                        this.shadowColor_ = Color.newBuilder(color2).mergeFrom(color).buildPartial();
                    } else {
                        this.shadowColor_ = color;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(color);
                }
                return this;
            }

            public Builder mergeShadowOffset(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.shadowOffsetBuilder_;
                if (i2Var == null) {
                    Vec2 vec22 = this.shadowOffset_;
                    if (vec22 != null) {
                        this.shadowOffset_ = Vec2.newBuilder(vec22).mergeFrom(vec2).buildPartial();
                    } else {
                        this.shadowOffset_ = vec2;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(vec2);
                }
                return this;
            }

            public Builder mergeStrokeColor(Color color) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.strokeColorBuilder_;
                if (i2Var == null) {
                    Color color2 = this.strokeColor_;
                    if (color2 != null) {
                        this.strokeColor_ = Color.newBuilder(color2).mergeFrom(color).buildPartial();
                    } else {
                        this.strokeColor_ = color;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(color);
                }
                return this;
            }

            public Builder setFillColor(Color color) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.fillColorBuilder_;
                if (i2Var == null) {
                    color.getClass();
                    this.fillColor_ = color;
                    onChanged();
                } else {
                    i2Var.mo37710i(color);
                }
                return this;
            }

            public Builder setFontFilePath(String str) {
                str.getClass();
                this.fontFilePath_ = str;
                onChanged();
                return this;
            }

            public Builder setFontFilePathBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.fontFilePath_ = kVar;
                onChanged();
                return this;
            }

            public Builder setFontName(String str) {
                str.getClass();
                this.fontName_ = str;
                onChanged();
                return this;
            }

            public Builder setFontNameBytes(C16994k kVar) {
                kVar.getClass();
                C23810b.checkByteStringIsUtf8(kVar);
                this.fontName_ = kVar;
                onChanged();
                return this;
            }

            public Builder setFontSize(float f) {
                this.fontSize_ = f;
                onChanged();
                return this;
            }

            public Builder setShadowColor(Color color) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.shadowColorBuilder_;
                if (i2Var == null) {
                    color.getClass();
                    this.shadowColor_ = color;
                    onChanged();
                } else {
                    i2Var.mo37710i(color);
                }
                return this;
            }

            public Builder setShadowOffset(Vec2 vec2) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.shadowOffsetBuilder_;
                if (i2Var == null) {
                    vec2.getClass();
                    this.shadowOffset_ = vec2;
                    onChanged();
                } else {
                    i2Var.mo37710i(vec2);
                }
                return this;
            }

            public Builder setShadowRadius(float f) {
                this.shadowRadius_ = f;
                onChanged();
                return this;
            }

            public Builder setStrokeColor(Color color) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.strokeColorBuilder_;
                if (i2Var == null) {
                    color.getClass();
                    this.strokeColor_ = color;
                    onChanged();
                } else {
                    i2Var.mo37710i(color);
                }
                return this;
            }

            public Builder setStrokeWidth(float f) {
                this.strokeWidth_ = f;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                this.fontName_ = "";
                this.fontFilePath_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public TextStyle build() {
                TextStyle buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public TextStyle buildPartial() {
                TextStyle textStyle = new TextStyle((C23872m0.C23874b) this, (C241671) null);
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.fillColorBuilder_;
                if (i2Var == null) {
                    Color unused = textStyle.fillColor_ = this.fillColor_;
                } else {
                    Color unused2 = textStyle.fillColor_ = i2Var.mo37703b();
                }
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var2 = this.strokeColorBuilder_;
                if (i2Var2 == null) {
                    Color unused3 = textStyle.strokeColor_ = this.strokeColor_;
                } else {
                    Color unused4 = textStyle.strokeColor_ = i2Var2.mo37703b();
                }
                float unused5 = textStyle.strokeWidth_ = this.strokeWidth_;
                float unused6 = textStyle.fontSize_ = this.fontSize_;
                Object unused7 = textStyle.fontName_ = this.fontName_;
                Object unused8 = textStyle.fontFilePath_ = this.fontFilePath_;
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var3 = this.shadowOffsetBuilder_;
                if (i2Var3 == null) {
                    Vec2 unused9 = textStyle.shadowOffset_ = this.shadowOffset_;
                } else {
                    Vec2 unused10 = textStyle.shadowOffset_ = i2Var3.mo37703b();
                }
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var4 = this.shadowColorBuilder_;
                if (i2Var4 == null) {
                    Color unused11 = textStyle.shadowColor_ = this.shadowColor_;
                } else {
                    Color unused12 = textStyle.shadowColor_ = i2Var4.mo37703b();
                }
                float unused13 = textStyle.shadowRadius_ = this.shadowRadius_;
                onBuilt();
                return textStyle;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public TextStyle getDefaultInstanceForType() {
                return TextStyle.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                if (this.fillColorBuilder_ == null) {
                    this.fillColor_ = null;
                } else {
                    this.fillColor_ = null;
                    this.fillColorBuilder_ = null;
                }
                if (this.strokeColorBuilder_ == null) {
                    this.strokeColor_ = null;
                } else {
                    this.strokeColor_ = null;
                    this.strokeColorBuilder_ = null;
                }
                this.strokeWidth_ = 0.0f;
                this.fontSize_ = 0.0f;
                this.fontName_ = "";
                this.fontFilePath_ = "";
                if (this.shadowOffsetBuilder_ == null) {
                    this.shadowOffset_ = null;
                } else {
                    this.shadowOffset_ = null;
                    this.shadowOffsetBuilder_ = null;
                }
                if (this.shadowColorBuilder_ == null) {
                    this.shadowColor_ = null;
                } else {
                    this.shadowColor_ = null;
                    this.shadowColorBuilder_ = null;
                }
                this.shadowRadius_ = 0.0f;
                return this;
            }

            public Builder setFillColor(Color.Builder builder) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.fillColorBuilder_;
                if (i2Var == null) {
                    this.fillColor_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setShadowColor(Color.Builder builder) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.shadowColorBuilder_;
                if (i2Var == null) {
                    this.shadowColor_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setShadowOffset(Vec2.Builder builder) {
                C23844i2<Vec2, Vec2.Builder, Vec2OrBuilder> i2Var = this.shadowOffsetBuilder_;
                if (i2Var == null) {
                    this.shadowOffset_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setStrokeColor(Color.Builder builder) {
                C23844i2<Color, Color.Builder, ColorOrBuilder> i2Var = this.strokeColorBuilder_;
                if (i2Var == null) {
                    this.strokeColor_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.fontName_ = "";
                this.fontFilePath_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof TextStyle) {
                    return mergeFrom((TextStyle) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(TextStyle textStyle) {
                if (textStyle == TextStyle.getDefaultInstance()) {
                    return this;
                }
                if (textStyle.hasFillColor()) {
                    mergeFillColor(textStyle.getFillColor());
                }
                if (textStyle.hasStrokeColor()) {
                    mergeStrokeColor(textStyle.getStrokeColor());
                }
                if (textStyle.getStrokeWidth() != 0.0f) {
                    setStrokeWidth(textStyle.getStrokeWidth());
                }
                if (textStyle.getFontSize() != 0.0f) {
                    setFontSize(textStyle.getFontSize());
                }
                if (!textStyle.getFontName().isEmpty()) {
                    this.fontName_ = textStyle.fontName_;
                    onChanged();
                }
                if (!textStyle.getFontFilePath().isEmpty()) {
                    this.fontFilePath_ = textStyle.fontFilePath_;
                    onChanged();
                }
                if (textStyle.hasShadowOffset()) {
                    mergeShadowOffset(textStyle.getShadowOffset());
                }
                if (textStyle.hasShadowColor()) {
                    mergeShadowColor(textStyle.getShadowColor());
                }
                if (textStyle.getShadowRadius() != 0.0f) {
                    setShadowRadius(textStyle.getShadowRadius());
                }
                mergeUnknownFields(textStyle.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.TextStyle.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.TextStyle.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$TextStyle r3 = (com.tencent.maas.composing.MJComposingS12.TextStyle) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.TextStyle) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$TextStyle r4 = (com.tencent.maas.composing.MJComposingS12.TextStyle) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.TextStyle) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.TextStyle.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$TextStyle$Builder");
            }
        }

        public /* synthetic */ TextStyle(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static TextStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_TextStyle_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TextStyle parseDelimitedFrom(InputStream inputStream) {
            return (TextStyle) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TextStyle parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<TextStyle> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextStyle)) {
                return super.equals(obj);
            }
            TextStyle textStyle = (TextStyle) obj;
            if (hasFillColor() != textStyle.hasFillColor()) {
                return false;
            }
            if ((hasFillColor() && !getFillColor().equals(textStyle.getFillColor())) || hasStrokeColor() != textStyle.hasStrokeColor()) {
                return false;
            }
            if ((hasStrokeColor() && !getStrokeColor().equals(textStyle.getStrokeColor())) || Float.floatToIntBits(getStrokeWidth()) != Float.floatToIntBits(textStyle.getStrokeWidth()) || Float.floatToIntBits(getFontSize()) != Float.floatToIntBits(textStyle.getFontSize()) || !getFontName().equals(textStyle.getFontName()) || !getFontFilePath().equals(textStyle.getFontFilePath()) || hasShadowOffset() != textStyle.hasShadowOffset()) {
                return false;
            }
            if ((!hasShadowOffset() || getShadowOffset().equals(textStyle.getShadowOffset())) && hasShadowColor() == textStyle.hasShadowColor()) {
                return (!hasShadowColor() || getShadowColor().equals(textStyle.getShadowColor())) && Float.floatToIntBits(getShadowRadius()) == Float.floatToIntBits(textStyle.getShadowRadius()) && this.unknownFields.equals(textStyle.unknownFields);
            }
            return false;
        }

        public Color getFillColor() {
            Color color = this.fillColor_;
            return color == null ? Color.getDefaultInstance() : color;
        }

        public ColorOrBuilder getFillColorOrBuilder() {
            return getFillColor();
        }

        public String getFontFilePath() {
            Object obj = this.fontFilePath_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String u = ((C16994k) obj).mo18752u();
            this.fontFilePath_ = u;
            return u;
        }

        public C16994k getFontFilePathBytes() {
            Object obj = this.fontFilePath_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.fontFilePath_ = k;
            return k;
        }

        public String getFontName() {
            Object obj = this.fontName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String u = ((C16994k) obj).mo18752u();
            this.fontName_ = u;
            return u;
        }

        public C16994k getFontNameBytes() {
            Object obj = this.fontName_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.fontName_ = k;
            return k;
        }

        public float getFontSize() {
            return this.fontSize_;
        }

        public C24062w1<TextStyle> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.fillColor_ != null) {
                i2 = 0 + C23897n.m29270o(1, getFillColor());
            }
            if (this.strokeColor_ != null) {
                i2 += C23897n.m29270o(2, getStrokeColor());
            }
            float f = this.strokeWidth_;
            if (f != 0.0f) {
                i2 += C23897n.m29264i(3, f);
            }
            float f2 = this.fontSize_;
            if (f2 != 0.0f) {
                i2 += C23897n.m29264i(4, f2);
            }
            if (!getFontNameBytes().isEmpty()) {
                i2 += C23872m0.computeStringSize(5, this.fontName_);
            }
            if (this.shadowOffset_ != null) {
                i2 += C23897n.m29270o(6, getShadowOffset());
            }
            if (this.shadowColor_ != null) {
                i2 += C23897n.m29270o(7, getShadowColor());
            }
            float f3 = this.shadowRadius_;
            if (f3 != 0.0f) {
                i2 += C23897n.m29264i(8, f3);
            }
            if (!getFontFilePathBytes().isEmpty()) {
                i2 += C23872m0.computeStringSize(9, this.fontFilePath_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public Color getShadowColor() {
            Color color = this.shadowColor_;
            return color == null ? Color.getDefaultInstance() : color;
        }

        public ColorOrBuilder getShadowColorOrBuilder() {
            return getShadowColor();
        }

        public Vec2 getShadowOffset() {
            Vec2 vec2 = this.shadowOffset_;
            return vec2 == null ? Vec2.getDefaultInstance() : vec2;
        }

        public Vec2OrBuilder getShadowOffsetOrBuilder() {
            return getShadowOffset();
        }

        public float getShadowRadius() {
            return this.shadowRadius_;
        }

        public Color getStrokeColor() {
            Color color = this.strokeColor_;
            return color == null ? Color.getDefaultInstance() : color;
        }

        public ColorOrBuilder getStrokeColorOrBuilder() {
            return getStrokeColor();
        }

        public float getStrokeWidth() {
            return this.strokeWidth_;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasFillColor() {
            return this.fillColor_ != null;
        }

        public boolean hasShadowColor() {
            return this.shadowColor_ != null;
        }

        public boolean hasShadowOffset() {
            return this.shadowOffset_ != null;
        }

        public boolean hasStrokeColor() {
            return this.strokeColor_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasFillColor()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getFillColor().hashCode();
            }
            if (hasStrokeColor()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getStrokeColor().hashCode();
            }
            int floatToIntBits = (((((((((((((((hashCode * 37) + 3) * 53) + Float.floatToIntBits(getStrokeWidth())) * 37) + 4) * 53) + Float.floatToIntBits(getFontSize())) * 37) + 5) * 53) + getFontName().hashCode()) * 37) + 9) * 53) + getFontFilePath().hashCode();
            if (hasShadowOffset()) {
                floatToIntBits = (((floatToIntBits * 37) + 6) * 53) + getShadowOffset().hashCode();
            }
            if (hasShadowColor()) {
                floatToIntBits = (((floatToIntBits * 37) + 7) * 53) + getShadowColor().hashCode();
            }
            int floatToIntBits2 = (((((floatToIntBits * 37) + 8) * 53) + Float.floatToIntBits(getShadowRadius())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = floatToIntBits2;
            return floatToIntBits2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$18400 = MJComposingS12.internal_static_MJComposingS12_TextStyle_fieldAccessorTable;
            access$18400.mo37875c(TextStyle.class, Builder.class);
            return access$18400;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new TextStyle();
        }

        public void writeTo(C23897n nVar) {
            if (this.fillColor_ != null) {
                nVar.mo37909P(1, getFillColor());
            }
            if (this.strokeColor_ != null) {
                nVar.mo37909P(2, getStrokeColor());
            }
            float f = this.strokeWidth_;
            if (f != 0.0f) {
                nVar.mo37906M(3, f);
            }
            float f2 = this.fontSize_;
            if (f2 != 0.0f) {
                nVar.mo37906M(4, f2);
            }
            if (!getFontNameBytes().isEmpty()) {
                C23872m0.writeString(nVar, 5, this.fontName_);
            }
            if (this.shadowOffset_ != null) {
                nVar.mo37909P(6, getShadowOffset());
            }
            if (this.shadowColor_ != null) {
                nVar.mo37909P(7, getShadowColor());
            }
            float f3 = this.shadowRadius_;
            if (f3 != 0.0f) {
                nVar.mo37906M(8, f3);
            }
            if (!getFontFilePathBytes().isEmpty()) {
                C23872m0.writeString(nVar, 9, this.fontFilePath_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ TextStyle(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(TextStyle textStyle) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(textStyle);
        }

        public static TextStyle parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private TextStyle(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static TextStyle parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TextStyle) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static TextStyle parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public TextStyle getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static TextStyle parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private TextStyle() {
            this.memoizedIsInitialized = -1;
            this.fontName_ = "";
            this.fontFilePath_ = "";
        }

        public static TextStyle parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static TextStyle parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static TextStyle parseFrom(InputStream inputStream) {
            return (TextStyle) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.maas.composing.MJComposingS12$Color$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.tencent.maas.composing.MJComposingS12$Color$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.tencent.maas.composing.MJComposingS12$Vec2$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.tencent.maas.composing.MJComposingS12$Color$Builder} */
        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v9 */
        /* JADX WARNING: type inference failed for: r5v10 */
        /* JADX WARNING: type inference failed for: r5v11 */
        /* JADX WARNING: type inference failed for: r5v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private TextStyle(com.google.protobuf.C23856l r7, com.google.protobuf.C23806a0 r8) {
            /*
                r6 = this;
                r6.<init>()
                r8.getClass()
                com.google.protobuf.s2$a r0 = com.google.protobuf.C24020s2.m29807b()
                r1 = 0
            L_0x000b:
                if (r1 != 0) goto L_0x0106
                int r2 = r7.mo37757F()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r3 = 1
                if (r2 == 0) goto L_0x00ea
                r4 = 10
                r5 = 0
                if (r2 == r4) goto L_0x00c9
                r4 = 18
                if (r2 == r4) goto L_0x00a8
                r4 = 29
                if (r2 == r4) goto L_0x00a0
                r4 = 37
                if (r2 == r4) goto L_0x0098
                r4 = 42
                if (r2 == r4) goto L_0x0090
                r4 = 50
                if (r2 == r4) goto L_0x006f
                r4 = 58
                if (r2 == r4) goto L_0x004f
                r4 = 69
                if (r2 == r4) goto L_0x0048
                r4 = 74
                if (r2 == r4) goto L_0x0041
                boolean r2 = r6.parseUnknownField(r7, r0, r8, r2)     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                if (r2 != 0) goto L_0x000b
                goto L_0x00ea
            L_0x0041:
                java.lang.String r2 = r7.mo37756E()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.fontFilePath_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                goto L_0x000b
            L_0x0048:
                float r2 = r7.mo37773r()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.shadowRadius_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                goto L_0x000b
            L_0x004f:
                com.tencent.maas.composing.MJComposingS12$Color r2 = r6.shadowColor_     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                if (r2 == 0) goto L_0x0057
                com.tencent.maas.composing.MJComposingS12$Color$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
            L_0x0057:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Color.parser()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.tencent.maas.composing.MJComposingS12$Color r2 = (com.tencent.maas.composing.MJComposingS12.Color) r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.shadowColor_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Color) r2)     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.tencent.maas.composing.MJComposingS12$Color r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.shadowColor_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                goto L_0x000b
            L_0x006f:
                com.tencent.maas.composing.MJComposingS12$Vec2 r2 = r6.shadowOffset_     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                if (r2 == 0) goto L_0x0077
                com.tencent.maas.composing.MJComposingS12$Vec2$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
            L_0x0077:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Vec2.parser()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.tencent.maas.composing.MJComposingS12$Vec2 r2 = (com.tencent.maas.composing.MJComposingS12.Vec2) r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.shadowOffset_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Vec2) r2)     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.tencent.maas.composing.MJComposingS12$Vec2 r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.shadowOffset_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                goto L_0x000b
            L_0x0090:
                java.lang.String r2 = r7.mo37756E()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.fontName_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                goto L_0x000b
            L_0x0098:
                float r2 = r7.mo37773r()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.fontSize_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                goto L_0x000b
            L_0x00a0:
                float r2 = r7.mo37773r()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.strokeWidth_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                goto L_0x000b
            L_0x00a8:
                com.tencent.maas.composing.MJComposingS12$Color r2 = r6.strokeColor_     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                if (r2 == 0) goto L_0x00b0
                com.tencent.maas.composing.MJComposingS12$Color$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
            L_0x00b0:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Color.parser()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.tencent.maas.composing.MJComposingS12$Color r2 = (com.tencent.maas.composing.MJComposingS12.Color) r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.strokeColor_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Color) r2)     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.tencent.maas.composing.MJComposingS12$Color r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.strokeColor_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                goto L_0x000b
            L_0x00c9:
                com.tencent.maas.composing.MJComposingS12$Color r2 = r6.fillColor_     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                if (r2 == 0) goto L_0x00d1
                com.tencent.maas.composing.MJComposingS12$Color$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
            L_0x00d1:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Color.parser()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.tencent.maas.composing.MJComposingS12$Color r2 = (com.tencent.maas.composing.MJComposingS12.Color) r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.fillColor_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Color) r2)     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                com.tencent.maas.composing.MJComposingS12$Color r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                r6.fillColor_ = r2     // Catch:{ p0 -> 0x00f8, IOException -> 0x00ef }
                goto L_0x000b
            L_0x00ea:
                r1 = 1
                goto L_0x000b
            L_0x00ed:
                r7 = move-exception
                goto L_0x00fc
            L_0x00ef:
                r7 = move-exception
                com.google.protobuf.p0 r8 = new com.google.protobuf.p0     // Catch:{ all -> 0x00ed }
                r8.<init>((java.io.IOException) r7)     // Catch:{ all -> 0x00ed }
                r8.f68530d = r6     // Catch:{ all -> 0x00ed }
                throw r8     // Catch:{ all -> 0x00ed }
            L_0x00f8:
                r7 = move-exception
                r7.f68530d = r6     // Catch:{ all -> 0x00ed }
                throw r7     // Catch:{ all -> 0x00ed }
            L_0x00fc:
                com.google.protobuf.s2 r8 = r0.build()
                r6.unknownFields = r8
                r6.makeExtensionsImmutable()
                throw r7
            L_0x0106:
                com.google.protobuf.s2 r7 = r0.build()
                r6.unknownFields = r7
                r6.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.TextStyle.<init>(com.google.protobuf.l, com.google.protobuf.a0):void");
        }

        public static TextStyle parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TextStyle) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static TextStyle parseFrom(C23856l lVar) {
            return (TextStyle) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static TextStyle parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TextStyle) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface TextStyleOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        Color getFillColor();

        ColorOrBuilder getFillColorOrBuilder();

        String getFontFilePath();

        C16994k getFontFilePathBytes();

        String getFontName();

        C16994k getFontNameBytes();

        float getFontSize();

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        Color getShadowColor();

        ColorOrBuilder getShadowColorOrBuilder();

        Vec2 getShadowOffset();

        Vec2OrBuilder getShadowOffsetOrBuilder();

        float getShadowRadius();

        Color getStrokeColor();

        ColorOrBuilder getStrokeColorOrBuilder();

        float getStrokeWidth();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        boolean hasFillColor();

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasShadowColor();

        boolean hasShadowOffset();

        boolean hasStrokeColor();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Time extends C23872m0 implements TimeOrBuilder {
        private static final Time DEFAULT_INSTANCE = new Time();
        /* access modifiers changed from: private */
        public static final C24062w1<Time> PARSER = new C23813c<Time>() {
            public Time parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new Time(lVar, a0Var, (C241671) null);
            }
        };
        public static final int SCALE_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public int scale_;
        /* access modifiers changed from: private */
        public int type_;
        /* access modifiers changed from: private */
        public long value_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements TimeOrBuilder {
            private int scale_;
            private int type_;
            private long value_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_Time_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearScale() {
                this.scale_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.value_ = 0;
                onChanged();
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_Time_descriptor;
            }

            public int getScale() {
                return this.scale_;
            }

            public TimeType getType() {
                TimeType valueOf = TimeType.valueOf(this.type_);
                return valueOf == null ? TimeType.UNRECOGNIZED : valueOf;
            }

            public int getTypeValue() {
                return this.type_;
            }

            public long getValue() {
                return this.value_;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$4600 = MJComposingS12.internal_static_MJComposingS12_Time_fieldAccessorTable;
                access$4600.mo37875c(Time.class, Builder.class);
                return access$4600;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setScale(int i) {
                this.scale_ = i;
                onChanged();
                return this;
            }

            public Builder setType(TimeType timeType) {
                timeType.getClass();
                this.type_ = timeType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i) {
                this.type_ = i;
                onChanged();
                return this;
            }

            public Builder setValue(long j) {
                this.value_ = j;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public Time build() {
                Time buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public Time buildPartial() {
                Time time = new Time((C23872m0.C23874b) this, (C241671) null);
                int unused = time.type_ = this.type_;
                long unused2 = time.value_ = this.value_;
                int unused3 = time.scale_ = this.scale_;
                onBuilt();
                return time;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public Time getDefaultInstanceForType() {
                return Time.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.type_ = 0;
                this.value_ = 0;
                this.scale_ = 0;
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof Time) {
                    return mergeFrom((Time) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(Time time) {
                if (time == Time.getDefaultInstance()) {
                    return this;
                }
                if (time.type_ != 0) {
                    setTypeValue(time.getTypeValue());
                }
                if (time.getValue() != 0) {
                    setValue(time.getValue());
                }
                if (time.getScale() != 0) {
                    setScale(time.getScale());
                }
                mergeUnknownFields(time.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.Time.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.Time.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$Time r3 = (com.tencent.maas.composing.MJComposingS12.Time) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Time) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$Time r4 = (com.tencent.maas.composing.MJComposingS12.Time) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Time) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.Time.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$Time$Builder");
            }
        }

        public /* synthetic */ Time(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static Time getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_Time_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Time parseDelimitedFrom(InputStream inputStream) {
            return (Time) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Time parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<Time> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Time)) {
                return super.equals(obj);
            }
            Time time = (Time) obj;
            return this.type_ == time.type_ && getValue() == time.getValue() && getScale() == time.getScale() && this.unknownFields.equals(time.unknownFields);
        }

        public C24062w1<Time> getParserForType() {
            return PARSER;
        }

        public int getScale() {
            return this.scale_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.type_ != TimeType.TimeTypeNumeric.getNumber()) {
                i2 = 0 + C23897n.m29261f(1, this.type_);
            }
            long j = this.value_;
            if (j != 0) {
                i2 += C23897n.m29268m(2, j);
            }
            int i3 = this.scale_;
            if (i3 != 0) {
                i2 += C23897n.m29266k(3, i3);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public TimeType getType() {
            TimeType valueOf = TimeType.valueOf(this.type_);
            return valueOf == null ? TimeType.UNRECOGNIZED : valueOf;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public long getValue() {
            return this.value_;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((((C82986r.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + C23908o0.m29424b(getValue())) * 37) + 3) * 53) + getScale()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$4600 = MJComposingS12.internal_static_MJComposingS12_Time_fieldAccessorTable;
            access$4600.mo37875c(Time.class, Builder.class);
            return access$4600;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new Time();
        }

        public void writeTo(C23897n nVar) {
            if (this.type_ != TimeType.TimeTypeNumeric.getNumber()) {
                nVar.mo37907N(1, this.type_);
            }
            long j = this.value_;
            if (j != 0) {
                nVar.mo37919Z(2, j);
            }
            int i = this.scale_;
            if (i != 0) {
                nVar.mo37907N(3, i);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ Time(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(Time time) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(time);
        }

        public static Time parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private Time(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static Time parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Time) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static Time parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public Time getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static Time parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Time() {
            this.memoizedIsInitialized = -1;
            this.type_ = 0;
        }

        public static Time parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static Time parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static Time parseFrom(InputStream inputStream) {
            return (Time) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        private Time(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 8) {
                            this.type_ = lVar.mo37770o();
                        } else if (F == 16) {
                            this.value_ = lVar.mo37776u();
                        } else if (F == 24) {
                            this.scale_ = lVar.mo37775t();
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static Time parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Time) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static Time parseFrom(C23856l lVar) {
            return (Time) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static Time parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (Time) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface TimeOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        int getScale();

        TimeType getType();

        int getTypeValue();

        /* synthetic */ C24020s2 getUnknownFields();

        long getValue();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    public static final class TimeRange extends C23872m0 implements TimeRangeOrBuilder {
        private static final TimeRange DEFAULT_INSTANCE = new TimeRange();
        public static final int DURATION_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final C24062w1<TimeRange> PARSER = new C23813c<TimeRange>() {
            public TimeRange parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new TimeRange(lVar, a0Var, (C241671) null);
            }
        };
        public static final int START_TIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public Time duration_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public Time startTime_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements TimeRangeOrBuilder {
            private C23844i2<Time, Time.Builder, TimeOrBuilder> durationBuilder_;
            private Time duration_;
            private C23844i2<Time, Time.Builder, TimeOrBuilder> startTimeBuilder_;
            private Time startTime_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_TimeRange_descriptor;
            }

            private C23844i2<Time, Time.Builder, TimeOrBuilder> getDurationFieldBuilder() {
                if (this.durationBuilder_ == null) {
                    this.durationBuilder_ = new C23844i2<>(getDuration(), getParentForChildren(), isClean());
                    this.duration_ = null;
                }
                return this.durationBuilder_;
            }

            private C23844i2<Time, Time.Builder, TimeOrBuilder> getStartTimeFieldBuilder() {
                if (this.startTimeBuilder_ == null) {
                    this.startTimeBuilder_ = new C23844i2<>(getStartTime(), getParentForChildren(), isClean());
                    this.startTime_ = null;
                }
                return this.startTimeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearDuration() {
                if (this.durationBuilder_ == null) {
                    this.duration_ = null;
                    onChanged();
                } else {
                    this.duration_ = null;
                    this.durationBuilder_ = null;
                }
                return this;
            }

            public Builder clearStartTime() {
                if (this.startTimeBuilder_ == null) {
                    this.startTime_ = null;
                    onChanged();
                } else {
                    this.startTime_ = null;
                    this.startTimeBuilder_ = null;
                }
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_TimeRange_descriptor;
            }

            public Time getDuration() {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.durationBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Time time = this.duration_;
                return time == null ? Time.getDefaultInstance() : time;
            }

            public Time.Builder getDurationBuilder() {
                onChanged();
                return getDurationFieldBuilder().mo37705d();
            }

            public TimeOrBuilder getDurationOrBuilder() {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.durationBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Time time = this.duration_;
                return time == null ? Time.getDefaultInstance() : time;
            }

            public Time getStartTime() {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.startTimeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Time time = this.startTime_;
                return time == null ? Time.getDefaultInstance() : time;
            }

            public Time.Builder getStartTimeBuilder() {
                onChanged();
                return getStartTimeFieldBuilder().mo37705d();
            }

            public TimeOrBuilder getStartTimeOrBuilder() {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.startTimeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Time time = this.startTime_;
                return time == null ? Time.getDefaultInstance() : time;
            }

            public boolean hasDuration() {
                return (this.durationBuilder_ == null && this.duration_ == null) ? false : true;
            }

            public boolean hasStartTime() {
                return (this.startTimeBuilder_ == null && this.startTime_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$5800 = MJComposingS12.internal_static_MJComposingS12_TimeRange_fieldAccessorTable;
                access$5800.mo37875c(TimeRange.class, Builder.class);
                return access$5800;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDuration(Time time) {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.durationBuilder_;
                if (i2Var == null) {
                    Time time2 = this.duration_;
                    if (time2 != null) {
                        this.duration_ = Time.newBuilder(time2).mergeFrom(time).buildPartial();
                    } else {
                        this.duration_ = time;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(time);
                }
                return this;
            }

            public Builder mergeStartTime(Time time) {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.startTimeBuilder_;
                if (i2Var == null) {
                    Time time2 = this.startTime_;
                    if (time2 != null) {
                        this.startTime_ = Time.newBuilder(time2).mergeFrom(time).buildPartial();
                    } else {
                        this.startTime_ = time;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(time);
                }
                return this;
            }

            public Builder setDuration(Time time) {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.durationBuilder_;
                if (i2Var == null) {
                    time.getClass();
                    this.duration_ = time;
                    onChanged();
                } else {
                    i2Var.mo37710i(time);
                }
                return this;
            }

            public Builder setStartTime(Time time) {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.startTimeBuilder_;
                if (i2Var == null) {
                    time.getClass();
                    this.startTime_ = time;
                    onChanged();
                } else {
                    i2Var.mo37710i(time);
                }
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public TimeRange build() {
                TimeRange buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public TimeRange buildPartial() {
                TimeRange timeRange = new TimeRange((C23872m0.C23874b) this, (C241671) null);
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.startTimeBuilder_;
                if (i2Var == null) {
                    Time unused = timeRange.startTime_ = this.startTime_;
                } else {
                    Time unused2 = timeRange.startTime_ = i2Var.mo37703b();
                }
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var2 = this.durationBuilder_;
                if (i2Var2 == null) {
                    Time unused3 = timeRange.duration_ = this.duration_;
                } else {
                    Time unused4 = timeRange.duration_ = i2Var2.mo37703b();
                }
                onBuilt();
                return timeRange;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public TimeRange getDefaultInstanceForType() {
                return TimeRange.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            public Builder clear() {
                super.clear();
                if (this.startTimeBuilder_ == null) {
                    this.startTime_ = null;
                } else {
                    this.startTime_ = null;
                    this.startTimeBuilder_ = null;
                }
                if (this.durationBuilder_ == null) {
                    this.duration_ = null;
                } else {
                    this.duration_ = null;
                    this.durationBuilder_ = null;
                }
                return this;
            }

            public Builder setDuration(Time.Builder builder) {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.durationBuilder_;
                if (i2Var == null) {
                    this.duration_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setStartTime(Time.Builder builder) {
                C23844i2<Time, Time.Builder, TimeOrBuilder> i2Var = this.startTimeBuilder_;
                if (i2Var == null) {
                    this.startTime_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof TimeRange) {
                    return mergeFrom((TimeRange) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(TimeRange timeRange) {
                if (timeRange == TimeRange.getDefaultInstance()) {
                    return this;
                }
                if (timeRange.hasStartTime()) {
                    mergeStartTime(timeRange.getStartTime());
                }
                if (timeRange.hasDuration()) {
                    mergeDuration(timeRange.getDuration());
                }
                mergeUnknownFields(timeRange.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.TimeRange.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.TimeRange.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$TimeRange r3 = (com.tencent.maas.composing.MJComposingS12.TimeRange) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.TimeRange) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$TimeRange r4 = (com.tencent.maas.composing.MJComposingS12.TimeRange) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.TimeRange) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.TimeRange.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$TimeRange$Builder");
            }
        }

        public /* synthetic */ TimeRange(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static TimeRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_TimeRange_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TimeRange parseDelimitedFrom(InputStream inputStream) {
            return (TimeRange) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TimeRange parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<TimeRange> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TimeRange)) {
                return super.equals(obj);
            }
            TimeRange timeRange = (TimeRange) obj;
            if (hasStartTime() != timeRange.hasStartTime()) {
                return false;
            }
            if ((!hasStartTime() || getStartTime().equals(timeRange.getStartTime())) && hasDuration() == timeRange.hasDuration()) {
                return (!hasDuration() || getDuration().equals(timeRange.getDuration())) && this.unknownFields.equals(timeRange.unknownFields);
            }
            return false;
        }

        public Time getDuration() {
            Time time = this.duration_;
            return time == null ? Time.getDefaultInstance() : time;
        }

        public TimeOrBuilder getDurationOrBuilder() {
            return getDuration();
        }

        public C24062w1<TimeRange> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.startTime_ != null) {
                i2 = 0 + C23897n.m29270o(1, getStartTime());
            }
            if (this.duration_ != null) {
                i2 += C23897n.m29270o(2, getDuration());
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public Time getStartTime() {
            Time time = this.startTime_;
            return time == null ? Time.getDefaultInstance() : time;
        }

        public TimeOrBuilder getStartTimeOrBuilder() {
            return getStartTime();
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasDuration() {
            return this.duration_ != null;
        }

        public boolean hasStartTime() {
            return this.startTime_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasStartTime()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getStartTime().hashCode();
            }
            if (hasDuration()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getDuration().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$5800 = MJComposingS12.internal_static_MJComposingS12_TimeRange_fieldAccessorTable;
            access$5800.mo37875c(TimeRange.class, Builder.class);
            return access$5800;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new TimeRange();
        }

        public void writeTo(C23897n nVar) {
            if (this.startTime_ != null) {
                nVar.mo37909P(1, getStartTime());
            }
            if (this.duration_ != null) {
                nVar.mo37909P(2, getDuration());
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ TimeRange(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(TimeRange timeRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(timeRange);
        }

        public static TimeRange parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private TimeRange(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static TimeRange parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TimeRange) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static TimeRange parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public TimeRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static TimeRange parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private TimeRange() {
            this.memoizedIsInitialized = -1;
        }

        public static TimeRange parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static TimeRange parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        private TimeRange(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        Time.Builder builder = null;
                        if (F == 10) {
                            Time time = this.startTime_;
                            builder = time != null ? time.toBuilder() : builder;
                            Time time2 = (Time) lVar.mo37777v(Time.parser(), a0Var);
                            this.startTime_ = time2;
                            if (builder != null) {
                                builder.mergeFrom(time2);
                                this.startTime_ = builder.buildPartial();
                            }
                        } else if (F == 18) {
                            Time time3 = this.duration_;
                            builder = time3 != null ? time3.toBuilder() : builder;
                            Time time4 = (Time) lVar.mo37777v(Time.parser(), a0Var);
                            this.duration_ = time4;
                            if (builder != null) {
                                builder.mergeFrom(time4);
                                this.duration_ = builder.buildPartial();
                            }
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static TimeRange parseFrom(InputStream inputStream) {
            return (TimeRange) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static TimeRange parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TimeRange) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static TimeRange parseFrom(C23856l lVar) {
            return (TimeRange) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static TimeRange parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TimeRange) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface TimeRangeOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        Time getDuration();

        TimeOrBuilder getDurationOrBuilder();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        Time getStartTime();

        TimeOrBuilder getStartTimeOrBuilder();

        /* synthetic */ C24020s2 getUnknownFields();

        boolean hasDuration();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasStartTime();

        /* synthetic */ boolean isInitialized();
    }

    public enum TimeType implements C23908o0.C23911c {
        TimeTypeNumeric(0),
        TimeTypeInvalid(1),
        TimeTypePositiveInfinity(2),
        TimeTypeNegativeInfinity(3),
        UNRECOGNIZED(-1);
        
        public static final int TimeTypeInvalid_VALUE = 1;
        public static final int TimeTypeNegativeInfinity_VALUE = 3;
        public static final int TimeTypeNumeric_VALUE = 0;
        public static final int TimeTypePositiveInfinity_VALUE = 2;
        private static final TimeType[] VALUES = null;
        private static final C23908o0.C23912d<TimeType> internalValueMap = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<TimeType>() {
                public TimeType findValueByNumber(int i) {
                    return TimeType.forNumber(i);
                }
            };
            VALUES = values();
        }

        private TimeType(int i) {
            this.value = i;
        }

        public static TimeType forNumber(int i) {
            if (i == 0) {
                return TimeTypeNumeric;
            }
            if (i == 1) {
                return TimeTypeInvalid;
            }
            if (i == 2) {
                return TimeTypePositiveInfinity;
            }
            if (i != 3) {
                return null;
            }
            return TimeTypeNegativeInfinity;
        }

        public static final C24025t.C24033e getDescriptor() {
            return MJComposingS12.getDescriptor().mo38346f().get(0);
        }

        public static C23908o0.C23912d<TimeType> internalGetValueMap() {
            return internalValueMap;
        }

        public final C24025t.C24033e getDescriptorForType() {
            return getDescriptor();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final C24025t.C24034f getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().mo38334h().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static TimeType valueOf(int i) {
            return forNumber(i);
        }

        public static TimeType valueOf(C24025t.C24034f fVar) {
            if (fVar.f69101h == getDescriptor()) {
                int i = fVar.f69097d;
                if (i == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[i];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum TimingFillMode implements C23908o0.C23911c {
        TimingFillModeNone(0),
        TimingFillModeLooping(1),
        TimingFillModeLastFrame(2),
        UNRECOGNIZED(-1);
        
        public static final int TimingFillModeLastFrame_VALUE = 2;
        public static final int TimingFillModeLooping_VALUE = 1;
        public static final int TimingFillModeNone_VALUE = 0;
        private static final TimingFillMode[] VALUES = null;
        private static final C23908o0.C23912d<TimingFillMode> internalValueMap = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<TimingFillMode>() {
                public TimingFillMode findValueByNumber(int i) {
                    return TimingFillMode.forNumber(i);
                }
            };
            VALUES = values();
        }

        private TimingFillMode(int i) {
            this.value = i;
        }

        public static TimingFillMode forNumber(int i) {
            if (i == 0) {
                return TimingFillModeNone;
            }
            if (i == 1) {
                return TimingFillModeLooping;
            }
            if (i != 2) {
                return null;
            }
            return TimingFillModeLastFrame;
        }

        public static final C24025t.C24033e getDescriptor() {
            return MJComposingS12.getDescriptor().mo38346f().get(4);
        }

        public static C23908o0.C23912d<TimingFillMode> internalGetValueMap() {
            return internalValueMap;
        }

        public final C24025t.C24033e getDescriptorForType() {
            return getDescriptor();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final C24025t.C24034f getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().mo38334h().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static TimingFillMode valueOf(int i) {
            return forNumber(i);
        }

        public static TimingFillMode valueOf(C24025t.C24034f fVar) {
            if (fVar.f69101h == getDescriptor()) {
                int i = fVar.f69097d;
                if (i == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[i];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class Vec2 extends C23872m0 implements Vec2OrBuilder {
        private static final Vec2 DEFAULT_INSTANCE = new Vec2();
        /* access modifiers changed from: private */
        public static final C24062w1<Vec2> PARSER = new C23813c<Vec2>() {
            public Vec2 parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new Vec2(lVar, a0Var, (C241671) null);
            }
        };
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */

        /* renamed from: x_ */
        public float f69263x_;
        /* access modifiers changed from: private */

        /* renamed from: y_ */
        public float f69264y_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements Vec2OrBuilder {

            /* renamed from: x_ */
            private float f69265x_;

            /* renamed from: y_ */
            private float f69266y_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_Vec2_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearX() {
                this.f69265x_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.f69266y_ = 0.0f;
                onChanged();
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_Vec2_descriptor;
            }

            public float getX() {
                return this.f69265x_;
            }

            public float getY() {
                return this.f69266y_;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$100 = MJComposingS12.internal_static_MJComposingS12_Vec2_fieldAccessorTable;
                access$100.mo37875c(Vec2.class, Builder.class);
                return access$100;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setX(float f) {
                this.f69265x_ = f;
                onChanged();
                return this;
            }

            public Builder setY(float f) {
                this.f69266y_ = f;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public Vec2 build() {
                Vec2 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public Vec2 buildPartial() {
                Vec2 vec2 = new Vec2((C23872m0.C23874b) this, (C241671) null);
                float unused = vec2.f69263x_ = this.f69265x_;
                float unused2 = vec2.f69264y_ = this.f69266y_;
                onBuilt();
                return vec2;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public Vec2 getDefaultInstanceForType() {
                return Vec2.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            public Builder clear() {
                super.clear();
                this.f69265x_ = 0.0f;
                this.f69266y_ = 0.0f;
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof Vec2) {
                    return mergeFrom((Vec2) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(Vec2 vec2) {
                if (vec2 == Vec2.getDefaultInstance()) {
                    return this;
                }
                if (vec2.getX() != 0.0f) {
                    setX(vec2.getX());
                }
                if (vec2.getY() != 0.0f) {
                    setY(vec2.getY());
                }
                mergeUnknownFields(vec2.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.Vec2.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.Vec2.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$Vec2 r3 = (com.tencent.maas.composing.MJComposingS12.Vec2) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Vec2) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$Vec2 r4 = (com.tencent.maas.composing.MJComposingS12.Vec2) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Vec2) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.Vec2.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$Vec2$Builder");
            }
        }

        public /* synthetic */ Vec2(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static Vec2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_Vec2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Vec2 parseDelimitedFrom(InputStream inputStream) {
            return (Vec2) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Vec2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<Vec2> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Vec2)) {
                return super.equals(obj);
            }
            Vec2 vec2 = (Vec2) obj;
            return Float.floatToIntBits(getX()) == Float.floatToIntBits(vec2.getX()) && Float.floatToIntBits(getY()) == Float.floatToIntBits(vec2.getY()) && this.unknownFields.equals(vec2.unknownFields);
        }

        public C24062w1<Vec2> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            float f = this.f69263x_;
            if (f != 0.0f) {
                i2 = 0 + C23897n.m29264i(1, f);
            }
            float f2 = this.f69264y_;
            if (f2 != 0.0f) {
                i2 += C23897n.m29264i(2, f2);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public float getX() {
            return this.f69263x_;
        }

        public float getY() {
            return this.f69264y_;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((C82986r.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getX())) * 37) + 2) * 53) + Float.floatToIntBits(getY())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$100 = MJComposingS12.internal_static_MJComposingS12_Vec2_fieldAccessorTable;
            access$100.mo37875c(Vec2.class, Builder.class);
            return access$100;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new Vec2();
        }

        public void writeTo(C23897n nVar) {
            float f = this.f69263x_;
            if (f != 0.0f) {
                nVar.mo37906M(1, f);
            }
            float f2 = this.f69264y_;
            if (f2 != 0.0f) {
                nVar.mo37906M(2, f2);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ Vec2(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(Vec2 vec2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(vec2);
        }

        public static Vec2 parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private Vec2(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static Vec2 parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Vec2) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static Vec2 parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public Vec2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static Vec2 parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Vec2() {
            this.memoizedIsInitialized = -1;
        }

        public static Vec2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static Vec2 parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        private Vec2(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 13) {
                            this.f69263x_ = lVar.mo37773r();
                        } else if (F == 21) {
                            this.f69264y_ = lVar.mo37773r();
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static Vec2 parseFrom(InputStream inputStream) {
            return (Vec2) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static Vec2 parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Vec2) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static Vec2 parseFrom(C23856l lVar) {
            return (Vec2) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static Vec2 parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (Vec2) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface Vec2OrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        /* synthetic */ C24020s2 getUnknownFields();

        float getX();

        float getY();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    public static final class Vec4 extends C23872m0 implements Vec4OrBuilder {
        private static final Vec4 DEFAULT_INSTANCE = new Vec4();
        /* access modifiers changed from: private */
        public static final C24062w1<Vec4> PARSER = new C23813c<Vec4>() {
            public Vec4 parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new Vec4(lVar, a0Var, (C241671) null);
            }
        };
        public static final int W_FIELD_NUMBER = 4;
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;
        public static final int Z_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */

        /* renamed from: w_ */
        public float f69267w_;
        /* access modifiers changed from: private */

        /* renamed from: x_ */
        public float f69268x_;
        /* access modifiers changed from: private */

        /* renamed from: y_ */
        public float f69269y_;
        /* access modifiers changed from: private */

        /* renamed from: z_ */
        public float f69270z_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements Vec4OrBuilder {

            /* renamed from: w_ */
            private float f69271w_;

            /* renamed from: x_ */
            private float f69272x_;

            /* renamed from: y_ */
            private float f69273y_;

            /* renamed from: z_ */
            private float f69274z_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_Vec4_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearW() {
                this.f69271w_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearX() {
                this.f69272x_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.f69273y_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearZ() {
                this.f69274z_ = 0.0f;
                onChanged();
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_Vec4_descriptor;
            }

            public float getW() {
                return this.f69271w_;
            }

            public float getX() {
                return this.f69272x_;
            }

            public float getY() {
                return this.f69273y_;
            }

            public float getZ() {
                return this.f69274z_;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$1200 = MJComposingS12.internal_static_MJComposingS12_Vec4_fieldAccessorTable;
                access$1200.mo37875c(Vec4.class, Builder.class);
                return access$1200;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setW(float f) {
                this.f69271w_ = f;
                onChanged();
                return this;
            }

            public Builder setX(float f) {
                this.f69272x_ = f;
                onChanged();
                return this;
            }

            public Builder setY(float f) {
                this.f69273y_ = f;
                onChanged();
                return this;
            }

            public Builder setZ(float f) {
                this.f69274z_ = f;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public Vec4 build() {
                Vec4 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public Vec4 buildPartial() {
                Vec4 vec4 = new Vec4((C23872m0.C23874b) this, (C241671) null);
                float unused = vec4.f69268x_ = this.f69272x_;
                float unused2 = vec4.f69269y_ = this.f69273y_;
                float unused3 = vec4.f69270z_ = this.f69274z_;
                float unused4 = vec4.f69267w_ = this.f69271w_;
                onBuilt();
                return vec4;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public Vec4 getDefaultInstanceForType() {
                return Vec4.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            public Builder clear() {
                super.clear();
                this.f69272x_ = 0.0f;
                this.f69273y_ = 0.0f;
                this.f69274z_ = 0.0f;
                this.f69271w_ = 0.0f;
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof Vec4) {
                    return mergeFrom((Vec4) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(Vec4 vec4) {
                if (vec4 == Vec4.getDefaultInstance()) {
                    return this;
                }
                if (vec4.getX() != 0.0f) {
                    setX(vec4.getX());
                }
                if (vec4.getY() != 0.0f) {
                    setY(vec4.getY());
                }
                if (vec4.getZ() != 0.0f) {
                    setZ(vec4.getZ());
                }
                if (vec4.getW() != 0.0f) {
                    setW(vec4.getW());
                }
                mergeUnknownFields(vec4.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.Vec4.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.Vec4.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$Vec4 r3 = (com.tencent.maas.composing.MJComposingS12.Vec4) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Vec4) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$Vec4 r4 = (com.tencent.maas.composing.MJComposingS12.Vec4) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.Vec4) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.Vec4.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$Vec4$Builder");
            }
        }

        public /* synthetic */ Vec4(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static Vec4 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_Vec4_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Vec4 parseDelimitedFrom(InputStream inputStream) {
            return (Vec4) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Vec4 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<Vec4> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Vec4)) {
                return super.equals(obj);
            }
            Vec4 vec4 = (Vec4) obj;
            return Float.floatToIntBits(getX()) == Float.floatToIntBits(vec4.getX()) && Float.floatToIntBits(getY()) == Float.floatToIntBits(vec4.getY()) && Float.floatToIntBits(getZ()) == Float.floatToIntBits(vec4.getZ()) && Float.floatToIntBits(getW()) == Float.floatToIntBits(vec4.getW()) && this.unknownFields.equals(vec4.unknownFields);
        }

        public C24062w1<Vec4> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            float f = this.f69268x_;
            if (f != 0.0f) {
                i2 = 0 + C23897n.m29264i(1, f);
            }
            float f2 = this.f69269y_;
            if (f2 != 0.0f) {
                i2 += C23897n.m29264i(2, f2);
            }
            float f3 = this.f69270z_;
            if (f3 != 0.0f) {
                i2 += C23897n.m29264i(3, f3);
            }
            float f4 = this.f69267w_;
            if (f4 != 0.0f) {
                i2 += C23897n.m29264i(4, f4);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public float getW() {
            return this.f69267w_;
        }

        public float getX() {
            return this.f69268x_;
        }

        public float getY() {
            return this.f69269y_;
        }

        public float getZ() {
            return this.f69270z_;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((((((((C82986r.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getX())) * 37) + 2) * 53) + Float.floatToIntBits(getY())) * 37) + 3) * 53) + Float.floatToIntBits(getZ())) * 37) + 4) * 53) + Float.floatToIntBits(getW())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$1200 = MJComposingS12.internal_static_MJComposingS12_Vec4_fieldAccessorTable;
            access$1200.mo37875c(Vec4.class, Builder.class);
            return access$1200;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new Vec4();
        }

        public void writeTo(C23897n nVar) {
            float f = this.f69268x_;
            if (f != 0.0f) {
                nVar.mo37906M(1, f);
            }
            float f2 = this.f69269y_;
            if (f2 != 0.0f) {
                nVar.mo37906M(2, f2);
            }
            float f3 = this.f69270z_;
            if (f3 != 0.0f) {
                nVar.mo37906M(3, f3);
            }
            float f4 = this.f69267w_;
            if (f4 != 0.0f) {
                nVar.mo37906M(4, f4);
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ Vec4(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(Vec4 vec4) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(vec4);
        }

        public static Vec4 parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private Vec4(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static Vec4 parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Vec4) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static Vec4 parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public Vec4 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static Vec4 parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Vec4() {
            this.memoizedIsInitialized = -1;
        }

        public static Vec4 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static Vec4 parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        private Vec4(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 13) {
                            this.f69268x_ = lVar.mo37773r();
                        } else if (F == 21) {
                            this.f69269y_ = lVar.mo37773r();
                        } else if (F == 29) {
                            this.f69270z_ = lVar.mo37773r();
                        } else if (F == 37) {
                            this.f69267w_ = lVar.mo37773r();
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static Vec4 parseFrom(InputStream inputStream) {
            return (Vec4) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static Vec4 parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (Vec4) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static Vec4 parseFrom(C23856l lVar) {
            return (Vec4) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static Vec4 parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (Vec4) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface Vec4OrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        /* synthetic */ C24020s2 getUnknownFields();

        float getW();

        float getX();

        float getY();

        float getZ();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        /* synthetic */ boolean isInitialized();
    }

    public static final class VideoClip extends C23872m0 implements VideoClipOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 1;
        public static final int CONTENT_CROP_RECT_FIELD_NUMBER = 4;
        public static final int CONTENT_SPATIAL_DESC_FIELD_NUMBER = 3;
        private static final VideoClip DEFAULT_INSTANCE = new VideoClip();
        /* access modifiers changed from: private */
        public static final C24062w1<VideoClip> PARSER = new C23813c<VideoClip>() {
            public VideoClip parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new VideoClip(lVar, a0Var, (C241671) null);
            }
        };
        public static final int TIME_RANGE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public Asset asset_;
        /* access modifiers changed from: private */
        public Rect2 contentCropRect_;
        /* access modifiers changed from: private */
        public ContentSpatialDesc contentSpatialDesc_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public TimeRange timeRange_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements VideoClipOrBuilder {
            private C23844i2<Asset, Asset.Builder, AssetOrBuilder> assetBuilder_;
            private Asset asset_;
            private C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> contentCropRectBuilder_;
            private Rect2 contentCropRect_;
            private C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> contentSpatialDescBuilder_;
            private ContentSpatialDesc contentSpatialDesc_;
            private C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> timeRangeBuilder_;
            private TimeRange timeRange_;

            public /* synthetic */ Builder(C23872m0.C23876c cVar, C241671 r2) {
                this(cVar);
            }

            private C23844i2<Asset, Asset.Builder, AssetOrBuilder> getAssetFieldBuilder() {
                if (this.assetBuilder_ == null) {
                    this.assetBuilder_ = new C23844i2<>(getAsset(), getParentForChildren(), isClean());
                    this.asset_ = null;
                }
                return this.assetBuilder_;
            }

            private C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> getContentCropRectFieldBuilder() {
                if (this.contentCropRectBuilder_ == null) {
                    this.contentCropRectBuilder_ = new C23844i2<>(getContentCropRect(), getParentForChildren(), isClean());
                    this.contentCropRect_ = null;
                }
                return this.contentCropRectBuilder_;
            }

            private C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> getContentSpatialDescFieldBuilder() {
                if (this.contentSpatialDescBuilder_ == null) {
                    this.contentSpatialDescBuilder_ = new C23844i2<>(getContentSpatialDesc(), getParentForChildren(), isClean());
                    this.contentSpatialDesc_ = null;
                }
                return this.contentSpatialDescBuilder_;
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJComposingS12.internal_static_MJComposingS12_VideoClip_descriptor;
            }

            private C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> getTimeRangeFieldBuilder() {
                if (this.timeRangeBuilder_ == null) {
                    this.timeRangeBuilder_ = new C23844i2<>(getTimeRange(), getParentForChildren(), isClean());
                    this.timeRange_ = null;
                }
                return this.timeRangeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearAsset() {
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                    onChanged();
                } else {
                    this.asset_ = null;
                    this.assetBuilder_ = null;
                }
                return this;
            }

            public Builder clearContentCropRect() {
                if (this.contentCropRectBuilder_ == null) {
                    this.contentCropRect_ = null;
                    onChanged();
                } else {
                    this.contentCropRect_ = null;
                    this.contentCropRectBuilder_ = null;
                }
                return this;
            }

            public Builder clearContentSpatialDesc() {
                if (this.contentSpatialDescBuilder_ == null) {
                    this.contentSpatialDesc_ = null;
                    onChanged();
                } else {
                    this.contentSpatialDesc_ = null;
                    this.contentSpatialDescBuilder_ = null;
                }
                return this;
            }

            public Builder clearTimeRange() {
                if (this.timeRangeBuilder_ == null) {
                    this.timeRange_ = null;
                    onChanged();
                } else {
                    this.timeRange_ = null;
                    this.timeRangeBuilder_ = null;
                }
                return this;
            }

            public Asset getAsset() {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Asset asset = this.asset_;
                return asset == null ? Asset.getDefaultInstance() : asset;
            }

            public Asset.Builder getAssetBuilder() {
                onChanged();
                return getAssetFieldBuilder().mo37705d();
            }

            public AssetOrBuilder getAssetOrBuilder() {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Asset asset = this.asset_;
                return asset == null ? Asset.getDefaultInstance() : asset;
            }

            public Rect2 getContentCropRect() {
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var = this.contentCropRectBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                Rect2 rect2 = this.contentCropRect_;
                return rect2 == null ? Rect2.getDefaultInstance() : rect2;
            }

            public Rect2.Builder getContentCropRectBuilder() {
                onChanged();
                return getContentCropRectFieldBuilder().mo37705d();
            }

            public Rect2OrBuilder getContentCropRectOrBuilder() {
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var = this.contentCropRectBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                Rect2 rect2 = this.contentCropRect_;
                return rect2 == null ? Rect2.getDefaultInstance() : rect2;
            }

            public ContentSpatialDesc getContentSpatialDesc() {
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var = this.contentSpatialDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                ContentSpatialDesc contentSpatialDesc = this.contentSpatialDesc_;
                return contentSpatialDesc == null ? ContentSpatialDesc.getDefaultInstance() : contentSpatialDesc;
            }

            public ContentSpatialDesc.Builder getContentSpatialDescBuilder() {
                onChanged();
                return getContentSpatialDescFieldBuilder().mo37705d();
            }

            public ContentSpatialDescOrBuilder getContentSpatialDescOrBuilder() {
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var = this.contentSpatialDescBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                ContentSpatialDesc contentSpatialDesc = this.contentSpatialDesc_;
                return contentSpatialDesc == null ? ContentSpatialDesc.getDefaultInstance() : contentSpatialDesc;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJComposingS12.internal_static_MJComposingS12_VideoClip_descriptor;
            }

            public TimeRange getTimeRange() {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                TimeRange timeRange = this.timeRange_;
                return timeRange == null ? TimeRange.getDefaultInstance() : timeRange;
            }

            public TimeRange.Builder getTimeRangeBuilder() {
                onChanged();
                return getTimeRangeFieldBuilder().mo37705d();
            }

            public TimeRangeOrBuilder getTimeRangeOrBuilder() {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                TimeRange timeRange = this.timeRange_;
                return timeRange == null ? TimeRange.getDefaultInstance() : timeRange;
            }

            public boolean hasAsset() {
                return (this.assetBuilder_ == null && this.asset_ == null) ? false : true;
            }

            public boolean hasContentCropRect() {
                return (this.contentCropRectBuilder_ == null && this.contentCropRect_ == null) ? false : true;
            }

            public boolean hasContentSpatialDesc() {
                return (this.contentSpatialDescBuilder_ == null && this.contentSpatialDesc_ == null) ? false : true;
            }

            public boolean hasTimeRange() {
                return (this.timeRangeBuilder_ == null && this.timeRange_ == null) ? false : true;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$12000 = MJComposingS12.internal_static_MJComposingS12_VideoClip_fieldAccessorTable;
                access$12000.mo37875c(VideoClip.class, Builder.class);
                return access$12000;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAsset(Asset asset) {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    Asset asset2 = this.asset_;
                    if (asset2 != null) {
                        this.asset_ = Asset.newBuilder(asset2).mergeFrom(asset).buildPartial();
                    } else {
                        this.asset_ = asset;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(asset);
                }
                return this;
            }

            public Builder mergeContentCropRect(Rect2 rect2) {
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var = this.contentCropRectBuilder_;
                if (i2Var == null) {
                    Rect2 rect22 = this.contentCropRect_;
                    if (rect22 != null) {
                        this.contentCropRect_ = Rect2.newBuilder(rect22).mergeFrom(rect2).buildPartial();
                    } else {
                        this.contentCropRect_ = rect2;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(rect2);
                }
                return this;
            }

            public Builder mergeContentSpatialDesc(ContentSpatialDesc contentSpatialDesc) {
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var = this.contentSpatialDescBuilder_;
                if (i2Var == null) {
                    ContentSpatialDesc contentSpatialDesc2 = this.contentSpatialDesc_;
                    if (contentSpatialDesc2 != null) {
                        this.contentSpatialDesc_ = ContentSpatialDesc.newBuilder(contentSpatialDesc2).mergeFrom(contentSpatialDesc).buildPartial();
                    } else {
                        this.contentSpatialDesc_ = contentSpatialDesc;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(contentSpatialDesc);
                }
                return this;
            }

            public Builder mergeTimeRange(TimeRange timeRange) {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var == null) {
                    TimeRange timeRange2 = this.timeRange_;
                    if (timeRange2 != null) {
                        this.timeRange_ = TimeRange.newBuilder(timeRange2).mergeFrom(timeRange).buildPartial();
                    } else {
                        this.timeRange_ = timeRange;
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(timeRange);
                }
                return this;
            }

            public Builder setAsset(Asset asset) {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    asset.getClass();
                    this.asset_ = asset;
                    onChanged();
                } else {
                    i2Var.mo37710i(asset);
                }
                return this;
            }

            public Builder setContentCropRect(Rect2 rect2) {
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var = this.contentCropRectBuilder_;
                if (i2Var == null) {
                    rect2.getClass();
                    this.contentCropRect_ = rect2;
                    onChanged();
                } else {
                    i2Var.mo37710i(rect2);
                }
                return this;
            }

            public Builder setContentSpatialDesc(ContentSpatialDesc contentSpatialDesc) {
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var = this.contentSpatialDescBuilder_;
                if (i2Var == null) {
                    contentSpatialDesc.getClass();
                    this.contentSpatialDesc_ = contentSpatialDesc;
                    onChanged();
                } else {
                    i2Var.mo37710i(contentSpatialDesc);
                }
                return this;
            }

            public Builder setTimeRange(TimeRange timeRange) {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var == null) {
                    timeRange.getClass();
                    this.timeRange_ = timeRange;
                    onChanged();
                } else {
                    i2Var.mo37710i(timeRange);
                }
                return this;
            }

            public /* synthetic */ Builder(C241671 r1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public VideoClip build() {
                VideoClip buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public VideoClip buildPartial() {
                VideoClip videoClip = new VideoClip((C23872m0.C23874b) this, (C241671) null);
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    Asset unused = videoClip.asset_ = this.asset_;
                } else {
                    Asset unused2 = videoClip.asset_ = i2Var.mo37703b();
                }
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var2 = this.timeRangeBuilder_;
                if (i2Var2 == null) {
                    TimeRange unused3 = videoClip.timeRange_ = this.timeRange_;
                } else {
                    TimeRange unused4 = videoClip.timeRange_ = i2Var2.mo37703b();
                }
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var3 = this.contentSpatialDescBuilder_;
                if (i2Var3 == null) {
                    ContentSpatialDesc unused5 = videoClip.contentSpatialDesc_ = this.contentSpatialDesc_;
                } else {
                    ContentSpatialDesc unused6 = videoClip.contentSpatialDesc_ = i2Var3.mo37703b();
                }
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var4 = this.contentCropRectBuilder_;
                if (i2Var4 == null) {
                    Rect2 unused7 = videoClip.contentCropRect_ = this.contentCropRect_;
                } else {
                    Rect2 unused8 = videoClip.contentCropRect_ = i2Var4.mo37703b();
                }
                onBuilt();
                return videoClip;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public VideoClip getDefaultInstanceForType() {
                return VideoClip.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            public Builder clear() {
                super.clear();
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                } else {
                    this.asset_ = null;
                    this.assetBuilder_ = null;
                }
                if (this.timeRangeBuilder_ == null) {
                    this.timeRange_ = null;
                } else {
                    this.timeRange_ = null;
                    this.timeRangeBuilder_ = null;
                }
                if (this.contentSpatialDescBuilder_ == null) {
                    this.contentSpatialDesc_ = null;
                } else {
                    this.contentSpatialDesc_ = null;
                    this.contentSpatialDescBuilder_ = null;
                }
                if (this.contentCropRectBuilder_ == null) {
                    this.contentCropRect_ = null;
                } else {
                    this.contentCropRect_ = null;
                    this.contentCropRectBuilder_ = null;
                }
                return this;
            }

            public Builder setAsset(Asset.Builder builder) {
                C23844i2<Asset, Asset.Builder, AssetOrBuilder> i2Var = this.assetBuilder_;
                if (i2Var == null) {
                    this.asset_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setContentCropRect(Rect2.Builder builder) {
                C23844i2<Rect2, Rect2.Builder, Rect2OrBuilder> i2Var = this.contentCropRectBuilder_;
                if (i2Var == null) {
                    this.contentCropRect_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setContentSpatialDesc(ContentSpatialDesc.Builder builder) {
                C23844i2<ContentSpatialDesc, ContentSpatialDesc.Builder, ContentSpatialDescOrBuilder> i2Var = this.contentSpatialDescBuilder_;
                if (i2Var == null) {
                    this.contentSpatialDesc_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder setTimeRange(TimeRange.Builder builder) {
                C23844i2<TimeRange, TimeRange.Builder, TimeRangeOrBuilder> i2Var = this.timeRangeBuilder_;
                if (i2Var == null) {
                    this.timeRange_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof VideoClip) {
                    return mergeFrom((VideoClip) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(VideoClip videoClip) {
                if (videoClip == VideoClip.getDefaultInstance()) {
                    return this;
                }
                if (videoClip.hasAsset()) {
                    mergeAsset(videoClip.getAsset());
                }
                if (videoClip.hasTimeRange()) {
                    mergeTimeRange(videoClip.getTimeRange());
                }
                if (videoClip.hasContentSpatialDesc()) {
                    mergeContentSpatialDesc(videoClip.getContentSpatialDesc());
                }
                if (videoClip.hasContentCropRect()) {
                    mergeContentCropRect(videoClip.getContentCropRect());
                }
                mergeUnknownFields(videoClip.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.composing.MJComposingS12.VideoClip.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1 r1 = com.tencent.maas.composing.MJComposingS12.VideoClip.PARSER     // Catch:{ p0 -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0013 }
                    com.tencent.maas.composing.MJComposingS12$VideoClip r3 = (com.tencent.maas.composing.MJComposingS12.VideoClip) r3     // Catch:{ p0 -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.VideoClip) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x0011 }
                    com.tencent.maas.composing.MJComposingS12$VideoClip r4 = (com.tencent.maas.composing.MJComposingS12.VideoClip) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.tencent.maas.composing.MJComposingS12.VideoClip) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.VideoClip.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.composing.MJComposingS12$VideoClip$Builder");
            }
        }

        public /* synthetic */ VideoClip(C23856l lVar, C23806a0 a0Var, C241671 r3) {
            this(lVar, a0Var);
        }

        public static VideoClip getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJComposingS12.internal_static_MJComposingS12_VideoClip_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoClip parseDelimitedFrom(InputStream inputStream) {
            return (VideoClip) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VideoClip parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<VideoClip> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VideoClip)) {
                return super.equals(obj);
            }
            VideoClip videoClip = (VideoClip) obj;
            if (hasAsset() != videoClip.hasAsset()) {
                return false;
            }
            if ((hasAsset() && !getAsset().equals(videoClip.getAsset())) || hasTimeRange() != videoClip.hasTimeRange()) {
                return false;
            }
            if ((hasTimeRange() && !getTimeRange().equals(videoClip.getTimeRange())) || hasContentSpatialDesc() != videoClip.hasContentSpatialDesc()) {
                return false;
            }
            if ((!hasContentSpatialDesc() || getContentSpatialDesc().equals(videoClip.getContentSpatialDesc())) && hasContentCropRect() == videoClip.hasContentCropRect()) {
                return (!hasContentCropRect() || getContentCropRect().equals(videoClip.getContentCropRect())) && this.unknownFields.equals(videoClip.unknownFields);
            }
            return false;
        }

        public Asset getAsset() {
            Asset asset = this.asset_;
            return asset == null ? Asset.getDefaultInstance() : asset;
        }

        public AssetOrBuilder getAssetOrBuilder() {
            return getAsset();
        }

        public Rect2 getContentCropRect() {
            Rect2 rect2 = this.contentCropRect_;
            return rect2 == null ? Rect2.getDefaultInstance() : rect2;
        }

        public Rect2OrBuilder getContentCropRectOrBuilder() {
            return getContentCropRect();
        }

        public ContentSpatialDesc getContentSpatialDesc() {
            ContentSpatialDesc contentSpatialDesc = this.contentSpatialDesc_;
            return contentSpatialDesc == null ? ContentSpatialDesc.getDefaultInstance() : contentSpatialDesc;
        }

        public ContentSpatialDescOrBuilder getContentSpatialDescOrBuilder() {
            return getContentSpatialDesc();
        }

        public C24062w1<VideoClip> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.asset_ != null) {
                i2 = 0 + C23897n.m29270o(1, getAsset());
            }
            if (this.timeRange_ != null) {
                i2 += C23897n.m29270o(2, getTimeRange());
            }
            if (this.contentSpatialDesc_ != null) {
                i2 += C23897n.m29270o(3, getContentSpatialDesc());
            }
            if (this.contentCropRect_ != null) {
                i2 += C23897n.m29270o(4, getContentCropRect());
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public TimeRange getTimeRange() {
            TimeRange timeRange = this.timeRange_;
            return timeRange == null ? TimeRange.getDefaultInstance() : timeRange;
        }

        public TimeRangeOrBuilder getTimeRangeOrBuilder() {
            return getTimeRange();
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasAsset() {
            return this.asset_ != null;
        }

        public boolean hasContentCropRect() {
            return this.contentCropRect_ != null;
        }

        public boolean hasContentSpatialDesc() {
            return this.contentSpatialDesc_ != null;
        }

        public boolean hasTimeRange() {
            return this.timeRange_ != null;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasAsset()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getAsset().hashCode();
            }
            if (hasTimeRange()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getTimeRange().hashCode();
            }
            if (hasContentSpatialDesc()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getContentSpatialDesc().hashCode();
            }
            if (hasContentCropRect()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getContentCropRect().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$12000 = MJComposingS12.internal_static_MJComposingS12_VideoClip_fieldAccessorTable;
            access$12000.mo37875c(VideoClip.class, Builder.class);
            return access$12000;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new VideoClip();
        }

        public void writeTo(C23897n nVar) {
            if (this.asset_ != null) {
                nVar.mo37909P(1, getAsset());
            }
            if (this.timeRange_ != null) {
                nVar.mo37909P(2, getTimeRange());
            }
            if (this.contentSpatialDesc_ != null) {
                nVar.mo37909P(3, getContentSpatialDesc());
            }
            if (this.contentCropRect_ != null) {
                nVar.mo37909P(4, getContentCropRect());
            }
            this.unknownFields.writeTo(nVar);
        }

        public /* synthetic */ VideoClip(C23872m0.C23874b bVar, C241671 r2) {
            this(bVar);
        }

        public static Builder newBuilder(VideoClip videoClip) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoClip);
        }

        public static VideoClip parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private VideoClip(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static VideoClip parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (VideoClip) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static VideoClip parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public VideoClip getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((C241671) null) : new Builder((C241671) null).mergeFrom(this);
        }

        public static VideoClip parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private VideoClip() {
            this.memoizedIsInitialized = -1;
        }

        public static VideoClip parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar, (C241671) null);
        }

        public static VideoClip parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.maas.composing.MJComposingS12$Asset$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.tencent.maas.composing.MJComposingS12$TimeRange$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.tencent.maas.composing.MJComposingS12$Rect2$Builder} */
        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v9 */
        /* JADX WARNING: type inference failed for: r5v10 */
        /* JADX WARNING: type inference failed for: r5v11 */
        /* JADX WARNING: type inference failed for: r5v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private VideoClip(com.google.protobuf.C23856l r7, com.google.protobuf.C23806a0 r8) {
            /*
                r6 = this;
                r6.<init>()
                r8.getClass()
                com.google.protobuf.s2$a r0 = com.google.protobuf.C24020s2.m29807b()
                r1 = 0
            L_0x000b:
                if (r1 != 0) goto L_0x00cb
                int r2 = r7.mo37757F()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r3 = 1
                if (r2 == 0) goto L_0x00af
                r4 = 10
                r5 = 0
                if (r2 == r4) goto L_0x008e
                r4 = 18
                if (r2 == r4) goto L_0x006d
                r4 = 26
                if (r2 == r4) goto L_0x004d
                r4 = 34
                if (r2 == r4) goto L_0x002d
                boolean r2 = r6.parseUnknownField(r7, r0, r8, r2)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r2 != 0) goto L_0x000b
                goto L_0x00af
            L_0x002d:
                com.tencent.maas.composing.MJComposingS12$Rect2 r2 = r6.contentCropRect_     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r2 == 0) goto L_0x0035
                com.tencent.maas.composing.MJComposingS12$Rect2$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
            L_0x0035:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Rect2.parser()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$Rect2 r2 = (com.tencent.maas.composing.MJComposingS12.Rect2) r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.contentCropRect_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Rect2) r2)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$Rect2 r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.contentCropRect_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                goto L_0x000b
            L_0x004d:
                com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc r2 = r6.contentSpatialDesc_     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r2 == 0) goto L_0x0055
                com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
            L_0x0055:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc.parser()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc r2 = (com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc) r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.contentSpatialDesc_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.ContentSpatialDesc) r2)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$ContentSpatialDesc r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.contentSpatialDesc_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                goto L_0x000b
            L_0x006d:
                com.tencent.maas.composing.MJComposingS12$TimeRange r2 = r6.timeRange_     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r2 == 0) goto L_0x0075
                com.tencent.maas.composing.MJComposingS12$TimeRange$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
            L_0x0075:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.TimeRange.parser()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$TimeRange r2 = (com.tencent.maas.composing.MJComposingS12.TimeRange) r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.timeRange_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.TimeRange) r2)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$TimeRange r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.timeRange_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                goto L_0x000b
            L_0x008e:
                com.tencent.maas.composing.MJComposingS12$Asset r2 = r6.asset_     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r2 == 0) goto L_0x0096
                com.tencent.maas.composing.MJComposingS12$Asset$Builder r5 = r2.toBuilder()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
            L_0x0096:
                com.google.protobuf.w1 r2 = com.tencent.maas.composing.MJComposingS12.Asset.parser()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.google.protobuf.j1 r2 = r7.mo37777v(r2, r8)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$Asset r2 = (com.tencent.maas.composing.MJComposingS12.Asset) r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.asset_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                if (r5 == 0) goto L_0x000b
                r5.mergeFrom((com.tencent.maas.composing.MJComposingS12.Asset) r2)     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                com.tencent.maas.composing.MJComposingS12$Asset r2 = r5.buildPartial()     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                r6.asset_ = r2     // Catch:{ p0 -> 0x00bd, IOException -> 0x00b4 }
                goto L_0x000b
            L_0x00af:
                r1 = 1
                goto L_0x000b
            L_0x00b2:
                r7 = move-exception
                goto L_0x00c1
            L_0x00b4:
                r7 = move-exception
                com.google.protobuf.p0 r8 = new com.google.protobuf.p0     // Catch:{ all -> 0x00b2 }
                r8.<init>((java.io.IOException) r7)     // Catch:{ all -> 0x00b2 }
                r8.f68530d = r6     // Catch:{ all -> 0x00b2 }
                throw r8     // Catch:{ all -> 0x00b2 }
            L_0x00bd:
                r7 = move-exception
                r7.f68530d = r6     // Catch:{ all -> 0x00b2 }
                throw r7     // Catch:{ all -> 0x00b2 }
            L_0x00c1:
                com.google.protobuf.s2 r8 = r0.build()
                r6.unknownFields = r8
                r6.makeExtensionsImmutable()
                throw r7
            L_0x00cb:
                com.google.protobuf.s2 r7 = r0.build()
                r6.unknownFields = r7
                r6.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.composing.MJComposingS12.VideoClip.<init>(com.google.protobuf.l, com.google.protobuf.a0):void");
        }

        public static VideoClip parseFrom(InputStream inputStream) {
            return (VideoClip) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static VideoClip parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (VideoClip) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static VideoClip parseFrom(C23856l lVar) {
            return (VideoClip) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static VideoClip parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (VideoClip) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface VideoClipOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        Asset getAsset();

        AssetOrBuilder getAssetOrBuilder();

        Rect2 getContentCropRect();

        Rect2OrBuilder getContentCropRectOrBuilder();

        ContentSpatialDesc getContentSpatialDesc();

        ContentSpatialDescOrBuilder getContentSpatialDescOrBuilder();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        TimeRange getTimeRange();

        TimeRangeOrBuilder getTimeRangeOrBuilder();

        /* synthetic */ C24020s2 getUnknownFields();

        boolean hasAsset();

        boolean hasContentCropRect();

        boolean hasContentSpatialDesc();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasTimeRange();

        /* synthetic */ boolean isInitialized();
    }

    static {
        C24025t.C24027b bVar = getDescriptor().mo38347g().get(0);
        internal_static_MJComposingS12_Vec2_descriptor = bVar;
        internal_static_MJComposingS12_Vec2_fieldAccessorTable = new C23872m0.C23880f(bVar, new String[]{"X", "Y"});
        C24025t.C24027b bVar2 = getDescriptor().mo38347g().get(1);
        internal_static_MJComposingS12_Vec4_descriptor = bVar2;
        internal_static_MJComposingS12_Vec4_fieldAccessorTable = new C23872m0.C23880f(bVar2, new String[]{"X", "Y", "Z", ExifInterface.LONGITUDE_WEST});
        C24025t.C24027b bVar3 = getDescriptor().mo38347g().get(2);
        internal_static_MJComposingS12_Rect2_descriptor = bVar3;
        internal_static_MJComposingS12_Rect2_fieldAccessorTable = new C23872m0.C23880f(bVar3, new String[]{"Origin", "Size"});
        C24025t.C24027b bVar4 = getDescriptor().mo38347g().get(3);
        internal_static_MJComposingS12_Color_descriptor = bVar4;
        internal_static_MJComposingS12_Color_fieldAccessorTable = new C23872m0.C23880f(bVar4, new String[]{"Rgba"});
        C24025t.C24027b bVar5 = getDescriptor().mo38347g().get(4);
        internal_static_MJComposingS12_Time_descriptor = bVar5;
        internal_static_MJComposingS12_Time_fieldAccessorTable = new C23872m0.C23880f(bVar5, new String[]{"Type", "Value", "Scale"});
        C24025t.C24027b bVar6 = getDescriptor().mo38347g().get(5);
        internal_static_MJComposingS12_TimeRange_descriptor = bVar6;
        internal_static_MJComposingS12_TimeRange_fieldAccessorTable = new C23872m0.C23880f(bVar6, new String[]{"StartTime", "Duration"});
        C24025t.C24027b bVar7 = getDescriptor().mo38347g().get(6);
        internal_static_MJComposingS12_Asset_descriptor = bVar7;
        internal_static_MJComposingS12_Asset_fieldAccessorTable = new C23872m0.C23880f(bVar7, new String[]{"FilePath", "PhLocalIdentifier", "Identifier"});
        C24025t.C24027b bVar8 = getDescriptor().mo38347g().get(7);
        internal_static_MJComposingS12_ContentSpatialDesc_descriptor = bVar8;
        f69255x67ce3062 = new C23872m0.C23880f(bVar8, new String[]{"ScaleMode", "RotationMode", "FlipMode"});
        C24025t.C24027b bVar9 = getDescriptor().mo38347g().get(8);
        internal_static_MJComposingS12_LayerSpatialDesc_descriptor = bVar9;
        f69257xfaf293ba = new C23872m0.C23880f(bVar9, new String[]{"Scale", "Rotation", "Position", "AnchorPoint"});
        C24025t.C24027b bVar10 = getDescriptor().mo38347g().get(9);
        internal_static_MJComposingS12_ImageClip_descriptor = bVar10;
        internal_static_MJComposingS12_ImageClip_fieldAccessorTable = new C23872m0.C23880f(bVar10, new String[]{com.tencent.tav.asset.Asset.TAG, "Duration", "ContentSpatialDesc", "ContentCropRect"});
        C24025t.C24027b bVar11 = getDescriptor().mo38347g().get(10);
        internal_static_MJComposingS12_VideoClip_descriptor = bVar11;
        internal_static_MJComposingS12_VideoClip_fieldAccessorTable = new C23872m0.C23880f(bVar11, new String[]{com.tencent.tav.asset.Asset.TAG, "TimeRange", "ContentSpatialDesc", "ContentCropRect"});
        C24025t.C24027b bVar12 = getDescriptor().mo38347g().get(11);
        internal_static_MJComposingS12_AudioClip_descriptor = bVar12;
        internal_static_MJComposingS12_AudioClip_fieldAccessorTable = new C23872m0.C23880f(bVar12, new String[]{com.tencent.tav.asset.Asset.TAG, "TimeRange", "Volume", "Looping"});
        C24025t.C24027b bVar13 = getDescriptor().mo38347g().get(12);
        internal_static_MJComposingS12_Clip_descriptor = bVar13;
        internal_static_MJComposingS12_Clip_fieldAccessorTable = new C23872m0.C23880f(bVar13, new String[]{"ImageClip", "VideoClip", "AudioClip", "Clip"});
        C24025t.C24027b bVar14 = getDescriptor().mo38347g().get(13);
        internal_static_MJComposingS12_LyricInfo_descriptor = bVar14;
        internal_static_MJComposingS12_LyricInfo_fieldAccessorTable = new C23872m0.C23880f(bVar14, new String[]{"TimeRange", "Content"});
        C24025t.C24027b bVar15 = getDescriptor().mo38347g().get(14);
        internal_static_MJComposingS12_StickerOverlayDesc_descriptor = bVar15;
        f69259xed29395a = new C23872m0.C23880f(bVar15, new String[]{"DecoderType", "TimingFillMode", "FilePath", "LayerSpatialDesc", "LayerIndex"});
        C24025t.C24027b bVar16 = getDescriptor().mo38347g().get(15);
        internal_static_MJComposingS12_TextStyle_descriptor = bVar16;
        internal_static_MJComposingS12_TextStyle_fieldAccessorTable = new C23872m0.C23880f(bVar16, new String[]{"FillColor", "StrokeColor", "StrokeWidth", MJComposingDefines.MJTextStyleNameFontSize, MJComposingDefines.MJTextStyleNameFontName, MJComposingDefines.MJTextStyleNameFontFilePath, "ShadowOffset", "ShadowColor", "ShadowRadius"});
        C24025t.C24027b bVar17 = getDescriptor().mo38347g().get(16);
        internal_static_MJComposingS12_LayerStyle_descriptor = bVar17;
        internal_static_MJComposingS12_LayerStyle_fieldAccessorTable = new C23872m0.C23880f(bVar17, new String[]{"CornerRadius", "BorderColor", "BorderWidth", "BackgroundColor", "EdgeInsets"});
        C24025t.C24027b bVar18 = getDescriptor().mo38347g().get(17);
        internal_static_MJComposingS12_TextOverlayDesc_descriptor = bVar18;
        f69260x7900ae6 = new C23872m0.C23880f(bVar18, new String[]{"Text", "TextStyle", "LayerStyle", "LayerSpatialDesc", "MaximumWidth", "LayerIndex"});
        C24025t.C24027b bVar19 = getDescriptor().mo38347g().get(18);
        internal_static_MJComposingS12_LyricOverlayDesc_descriptor = bVar19;
        f69258x4392f97c = new C23872m0.C23880f(bVar19, new String[]{"LyricInfos", "LayerSpatialDesc", "TextStyle", "LayerStyle", "MaximumWidth", "LayerIndex"});
        C24025t.C24027b bVar20 = getDescriptor().mo38347g().get(19);
        internal_static_MJComposingS12_CoordinatingDesc_descriptor = bVar20;
        f69256x16fe97b8 = new C23872m0.C23880f(bVar20, new String[]{"CanvasSize", "CanvasOriginType"});
        C24025t.C24027b bVar21 = getDescriptor().mo38347g().get(20);
        internal_static_MJComposingS12_ComposingDesc_descriptor = bVar21;
        internal_static_MJComposingS12_ComposingDesc_fieldAccessorTable = new C23872m0.C23880f(bVar21, new String[]{"CoordinatingDesc", "MainClips", "BgmClip", "LyricOverlayDesc", "StickerOverlayDescs", "TextOverlayDescs"});
    }

    private MJComposingS12() {
    }

    public static C24025t.C24038h getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }

    public static void registerAllExtensions(C24071y yVar) {
        registerAllExtensions((C23806a0) yVar);
    }
}
