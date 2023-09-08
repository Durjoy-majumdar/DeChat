package com.tencent.maas.utils;

import com.tencent.maas.base.Vec2;
import com.tencent.maas.composing.MJComposingDesc;
import com.tencent.maas.composing.MJComposingS12;
import com.tencent.maas.composing.MJCoordinatingDesc;
import com.tencent.maas.instamovie.base.asset.MJAssetIdentifierType;
import com.tencent.maas.model.MJColor;
import com.tencent.maas.model.MJEdgeInsets;
import com.tencent.maas.model.MJSpatialInfo;
import com.tencent.maas.model.composing.MJAudioClip;
import com.tencent.maas.model.composing.MJClip;
import com.tencent.maas.model.composing.MJComposingDefines;
import com.tencent.maas.model.composing.MJImageClip;
import com.tencent.maas.model.composing.MJStickerOverlayDesc;
import com.tencent.maas.model.composing.MJTextOverlayDesc;
import com.tencent.maas.model.composing.MJVideoClip;
import com.tencent.maas.model.composing.WXMusicLyricInfo;
import com.tencent.maas.model.time.MJTime;
import com.tencent.maas.model.time.MJTimeRange;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public class MJComposingUtils {

    /* renamed from: com.tencent.maas.utils.MJComposingUtils$1 */
    public static /* synthetic */ class C241991 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.maas.model.time.MJTime$MJTimeType[] r0 = com.tencent.maas.model.time.MJTime.MJTimeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType = r0
                com.tencent.maas.model.time.MJTime$MJTimeType r1 = com.tencent.maas.model.time.MJTime.MJTimeType.INVALID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.maas.model.time.MJTime$MJTimeType r1 = com.tencent.maas.model.time.MJTime.MJTimeType.NUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.maas.model.time.MJTime$MJTimeType r1 = com.tencent.maas.model.time.MJTime.MJTimeType.POSITIVEINFINITY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.maas.model.time.MJTime$MJTimeType r1 = com.tencent.maas.model.time.MJTime.MJTimeType.NEGATIVEINFINITY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.utils.MJComposingUtils.C241991.<clinit>():void");
        }
    }

    private static MJComposingS12.Color convertColor(MJColor mJColor) {
        MJComposingS12.Vec4.Builder newBuilder = MJComposingS12.Vec4.newBuilder();
        newBuilder.setX(mJColor.getR());
        newBuilder.setY(mJColor.getG());
        newBuilder.setZ(mJColor.getB());
        newBuilder.setW(mJColor.getA());
        return MJComposingS12.Color.newBuilder().setRgba(newBuilder).build();
    }

    private static MJComposingS12.LayerSpatialDesc convertLayerSpatialDesc(MJSpatialInfo mJSpatialInfo) {
        MJComposingS12.LayerSpatialDesc.Builder newBuilder = MJComposingS12.LayerSpatialDesc.newBuilder();
        newBuilder.setScale(mJSpatialInfo.getScale());
        newBuilder.setRotation(mJSpatialInfo.getRotation());
        newBuilder.setPosition(convertVec2(mJSpatialInfo.getPosition()));
        newBuilder.setAnchorPoint(convertVec2(mJSpatialInfo.getAnchorPoint()));
        return newBuilder.build();
    }

    private static MJComposingS12.LayerStyle convertLayerStyle(Map<String, Object> map) {
        MJComposingS12.LayerStyle.Builder newBuilder = MJComposingS12.LayerStyle.newBuilder();
        for (Map.Entry next : map.entrySet()) {
            if (((String) next.getKey()).equals(MJComposingDefines.MJLayerStyleNameCornerRadius)) {
                newBuilder.setCornerRadius(((Float) next.getValue()).floatValue());
            } else if (((String) next.getKey()).equals(MJComposingDefines.MJLayerStyleNameBorderWidth)) {
                newBuilder.setBorderWidth(((Float) next.getValue()).floatValue());
            } else if (((String) next.getKey()).equals(MJComposingDefines.MJLayerStyleNameBorderColor)) {
                newBuilder.setBorderColor(convertColor((MJColor) next.getValue()));
            } else if (((String) next.getKey()).equals(MJComposingDefines.MJLayerStyleNameBackgroundColor)) {
                newBuilder.setBackgroundColor(convertColor((MJColor) next.getValue()));
            } else if (((String) next.getKey()).equals(MJComposingDefines.MJLayerStyleNameEdgeInsets)) {
                newBuilder.setEdgeInsets(convertVec4((MJEdgeInsets) next.getValue()));
            }
        }
        return newBuilder.build();
    }

    private static MJComposingS12.TextStyle convertTextStyle(Map<String, Object> map) {
        boolean containsKey = map.containsKey(MJComposingDefines.MJTextStyleNameFontSize);
        boolean containsKey2 = map.containsKey(MJComposingDefines.MJTextStyleNameFontName);
        boolean containsKey3 = map.containsKey(MJComposingDefines.MJTextStyleNameFontFilePath);
        if (containsKey == containsKey2 && containsKey == containsKey3) {
            MJComposingS12.TextStyle.Builder newBuilder = MJComposingS12.TextStyle.newBuilder();
            for (Map.Entry next : map.entrySet()) {
                if (((String) next.getKey()).equals(MJComposingDefines.MJTextStyleNameFillColor)) {
                    newBuilder.setFillColor(convertColor((MJColor) next.getValue()));
                } else if (((String) next.getKey()).equals(MJComposingDefines.MJTextStyleNameStrokeColor)) {
                    newBuilder.setStrokeColor(convertColor((MJColor) next.getValue()));
                } else if (((String) next.getKey()).equals(MJComposingDefines.MJTextStyleNameShadowColor)) {
                    newBuilder.setShadowColor(convertColor((MJColor) next.getValue()));
                } else if (((String) next.getKey()).equals(MJComposingDefines.MJTextStyleNameStrokeWidth)) {
                    newBuilder.setStrokeWidth(((Float) next.getValue()).floatValue());
                } else if (((String) next.getKey()).equals(MJComposingDefines.MJTextStyleNameFontSize)) {
                    newBuilder.setFontSize(((Float) next.getValue()).floatValue());
                } else if (((String) next.getKey()).equals(MJComposingDefines.MJTextStyleNameFontName)) {
                    newBuilder.setFontName((String) next.getValue());
                } else if (((String) next.getKey()).equals(MJComposingDefines.MJTextStyleNameFontFilePath)) {
                    newBuilder.setFontFilePath((String) next.getValue());
                } else if (((String) next.getKey()).equals(MJComposingDefines.MJTextStyleNameShadowOffset)) {
                    newBuilder.setShadowOffset(convertVec2((Vec2) next.getValue()));
                } else if (((String) next.getKey()).equals(MJComposingDefines.MJTextStyleNameShadowRadius)) {
                    newBuilder.setShadowRadius(((Float) next.getValue()).floatValue());
                }
            }
            return newBuilder.build();
        }
        throw new IllegalArgumentException("FontSize/FontName/FontFilePath should all be set or not set.");
    }

    private static MJComposingS12.Time convertTime(MJTime mJTime) {
        MJComposingS12.Time.Builder newBuilder = MJComposingS12.Time.newBuilder();
        int i = C241991.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[mJTime.getType().ordinal()];
        if (i == 1) {
            newBuilder.setType(MJComposingS12.TimeType.TimeTypeInvalid);
        } else if (i == 2) {
            newBuilder.setType(MJComposingS12.TimeType.TimeTypeNumeric);
        } else if (i == 3) {
            newBuilder.setType(MJComposingS12.TimeType.TimeTypePositiveInfinity);
        } else if (i == 4) {
            newBuilder.setType(MJComposingS12.TimeType.TimeTypeNegativeInfinity);
        }
        newBuilder.setValue(mJTime.getFlicks());
        newBuilder.setScale(MJTime.FlicksPerSecond);
        return newBuilder.build();
    }

    private static MJComposingS12.TimeRange convertTimeRange(MJTimeRange mJTimeRange) {
        MJComposingS12.TimeRange.Builder newBuilder = MJComposingS12.TimeRange.newBuilder();
        newBuilder.setStartTime(convertTime(mJTimeRange.getStartTime()));
        newBuilder.setDuration(convertTime(mJTimeRange.getDuration()));
        return newBuilder.build();
    }

    private static MJComposingS12.Vec2 convertVec2(Vec2 vec2) {
        MJComposingS12.Vec2.Builder newBuilder = MJComposingS12.Vec2.newBuilder();
        newBuilder.setX(vec2.f309908x);
        newBuilder.setY(vec2.f309909y);
        return newBuilder.build();
    }

    private static MJComposingS12.Vec4 convertVec4(MJEdgeInsets mJEdgeInsets) {
        MJComposingS12.Vec4.Builder newBuilder = MJComposingS12.Vec4.newBuilder();
        newBuilder.setX((float) mJEdgeInsets.getTop());
        newBuilder.setY((float) mJEdgeInsets.getLeft());
        newBuilder.setZ((float) mJEdgeInsets.getBottom());
        newBuilder.setW((float) mJEdgeInsets.getRight());
        return newBuilder.build();
    }

    public static ByteBuffer toByteBuffer(MJComposingDesc mJComposingDesc) {
        MJComposingS12.ComposingDesc.Builder newBuilder = MJComposingS12.ComposingDesc.newBuilder();
        MJCoordinatingDesc coordinatingDesc = mJComposingDesc.getCoordinatingDesc();
        if (coordinatingDesc != null) {
            Vec2 canvasSize = coordinatingDesc.getCanvasSize();
            MJComposingS12.Vec2 build = MJComposingS12.Vec2.newBuilder().setX(canvasSize.f309908x).setY(canvasSize.f309909y).build();
            MJComposingS12.CoordinatingDesc.Builder newBuilder2 = MJComposingS12.CoordinatingDesc.newBuilder();
            newBuilder2.setCanvasSize(build);
            MJComposingDefines.MJCanvasOriginType canvasOriginType = coordinatingDesc.getCanvasOriginType();
            if (canvasOriginType == MJComposingDefines.MJCanvasOriginType.TopLeft) {
                newBuilder2.setCanvasOriginTypeValue(0);
            } else if (canvasOriginType == MJComposingDefines.MJCanvasOriginType.BottomLeft) {
                newBuilder2.setCanvasOriginTypeValue(1);
            }
            newBuilder.setCoordinatingDesc(newBuilder2.build());
        }
        for (MJClip next : mJComposingDesc.getMainClips()) {
            if (next instanceof MJVideoClip) {
                MJVideoClip mJVideoClip = (MJVideoClip) next;
                MJComposingS12.VideoClip.Builder newBuilder3 = MJComposingS12.VideoClip.newBuilder();
                MJComposingS12.Asset.Builder newBuilder4 = MJComposingS12.Asset.newBuilder();
                MJAssetIdentifierType identifierType = mJVideoClip.getAssetInfo().getIdentifierType();
                if (identifierType == MJAssetIdentifierType.Filepath) {
                    newBuilder4.setFilePath(mJVideoClip.getAssetInfo().getIdentifier());
                } else if (identifierType == MJAssetIdentifierType.FileIdentifier) {
                    newBuilder4.setPhLocalIdentifier(mJVideoClip.getAssetInfo().getIdentifier());
                }
                newBuilder3.setAsset(newBuilder4.build());
                newBuilder3.setTimeRange(convertTimeRange(mJVideoClip.getTimeRangeInAsset()));
                MJComposingS12.Clip.Builder newBuilder5 = MJComposingS12.Clip.newBuilder();
                newBuilder5.setVideoClip(newBuilder3.build());
                newBuilder.addMainClips(newBuilder5.build());
            } else if (next instanceof MJImageClip) {
                MJImageClip mJImageClip = (MJImageClip) next;
                MJComposingS12.ImageClip.Builder newBuilder6 = MJComposingS12.ImageClip.newBuilder();
                MJComposingS12.Asset.Builder newBuilder7 = MJComposingS12.Asset.newBuilder();
                MJAssetIdentifierType identifierType2 = mJImageClip.getAssetInfo().getIdentifierType();
                if (identifierType2 == MJAssetIdentifierType.Filepath) {
                    newBuilder7.setFilePath(mJImageClip.getAssetInfo().getIdentifier());
                } else if (identifierType2 == MJAssetIdentifierType.FileIdentifier) {
                    newBuilder7.setPhLocalIdentifier(mJImageClip.getAssetInfo().getIdentifier());
                }
                newBuilder6.setAsset(newBuilder7.build());
                newBuilder6.setDuration(MJComposingS12.Time.newBuilder().setValue(mJImageClip.getDuration().getFlicks()));
                MJComposingS12.Clip.Builder newBuilder8 = MJComposingS12.Clip.newBuilder();
                newBuilder8.setImageClip(newBuilder6.build());
                newBuilder.addMainClips(newBuilder8.build());
            }
        }
        if (mJComposingDesc.getAudioClip() != null) {
            MJAudioClip audioClip = mJComposingDesc.getAudioClip();
            MJComposingS12.AudioClip.Builder newBuilder9 = MJComposingS12.AudioClip.newBuilder();
            MJComposingS12.Asset.Builder newBuilder10 = MJComposingS12.Asset.newBuilder();
            newBuilder10.setFilePath(audioClip.getFilePath());
            newBuilder9.setAsset(newBuilder10.build());
            newBuilder9.setVolume(audioClip.getVolume());
            newBuilder9.setLooping(audioClip.isLooping());
            newBuilder9.setTimeRange(convertTimeRange(audioClip.getTimeRangeInAsset()));
            newBuilder.setBgmClip(newBuilder9.build());
            if (mJComposingDesc.getLyricsOverlayDesc() != null) {
                MJComposingS12.LyricOverlayDesc.Builder newBuilder11 = MJComposingS12.LyricOverlayDesc.newBuilder();
                MJTime endTime = mJComposingDesc.getAudioClip().getTimeRangeInAsset().getEndTime();
                List<WXMusicLyricInfo> lyricInfos = mJComposingDesc.getLyricsOverlayDesc().getLyricInfos();
                for (int i = 0; i < lyricInfos.size(); i++) {
                    MJComposingS12.LyricInfo.Builder newBuilder12 = MJComposingS12.LyricInfo.newBuilder();
                    newBuilder12.setContent(lyricInfos.get(i).getContent());
                    if (i == lyricInfos.size() - 1) {
                        newBuilder12.setTimeRange(convertTimeRange(new MJTimeRange(MJTime.fromMilliseconds((long) lyricInfos.get(i).getStartTimeInMilliseconds()), MJTime.fromMilliseconds((long) (endTime.toMilliseconds() - ((double) lyricInfos.get(i).getStartTimeInMilliseconds()))))));
                    } else {
                        newBuilder12.setTimeRange(convertTimeRange(new MJTimeRange(MJTime.fromMilliseconds((long) lyricInfos.get(i).getStartTimeInMilliseconds()), MJTime.fromMilliseconds((long) (lyricInfos.get(i + 1).getStartTimeInMilliseconds() - lyricInfos.get(i).getStartTimeInMilliseconds())))));
                    }
                    newBuilder11.addLyricInfos(newBuilder12);
                }
                newBuilder11.setMaximumWidth(mJComposingDesc.getLyricsOverlayDesc().getMaximunWidth());
                newBuilder11.setTextStyle(convertTextStyle(mJComposingDesc.getLyricsOverlayDesc().getTextStyles()));
                newBuilder11.setLayerStyle(convertLayerStyle(mJComposingDesc.getLyricsOverlayDesc().getLayerStyles()));
                newBuilder11.setLayerSpatialDesc(convertLayerSpatialDesc(mJComposingDesc.getLyricsOverlayDesc().getSpatialInfo()));
                newBuilder.setLyricOverlayDesc(newBuilder11);
            }
        }
        for (MJStickerOverlayDesc next2 : mJComposingDesc.getStickerOverlayDescs()) {
            MJComposingS12.StickerOverlayDesc.Builder newBuilder13 = MJComposingS12.StickerOverlayDesc.newBuilder();
            if (next2.getStickerDecoderType() == MJComposingDefines.MJStickerDecoderType.Platform) {
                newBuilder13.setDecoderType(MJComposingS12.StickerDecoderType.StickerDecoderTypePlatform);
            } else if (next2.getStickerDecoderType() == MJComposingDefines.MJStickerDecoderType.WxAM) {
                newBuilder13.setDecoderType(MJComposingS12.StickerDecoderType.StickerDecoderTypeWxAM);
            }
            if (next2.getFillMode() == MJComposingDefines.MJTimingFillMode.None) {
                newBuilder13.setTimingFillMode(MJComposingS12.TimingFillMode.TimingFillModeNone);
            } else if (next2.getFillMode() == MJComposingDefines.MJTimingFillMode.Looping) {
                newBuilder13.setTimingFillMode(MJComposingS12.TimingFillMode.TimingFillModeLooping);
            } else if (next2.getFillMode() == MJComposingDefines.MJTimingFillMode.LastFrame) {
                newBuilder13.setTimingFillMode(MJComposingS12.TimingFillMode.TimingFillModeLastFrame);
            }
            newBuilder13.setFilePath(next2.getFilePath());
            newBuilder13.setLayerSpatialDesc(convertLayerSpatialDesc(next2.getSpatialInfo()));
            newBuilder13.setLayerIndex(next2.getIndex());
            newBuilder.addStickerOverlayDescs(newBuilder13);
        }
        for (MJTextOverlayDesc next3 : mJComposingDesc.getTextOverlayDescs()) {
            MJComposingS12.TextOverlayDesc.Builder newBuilder14 = MJComposingS12.TextOverlayDesc.newBuilder();
            newBuilder14.setText(next3.getText());
            newBuilder14.setMaximumWidth(next3.getMaximumWidth());
            newBuilder14.setTextStyle(convertTextStyle(next3.getTextStyles()));
            newBuilder14.setLayerStyle(convertLayerStyle(next3.getLayerStyles()));
            newBuilder14.setLayerSpatialDesc(convertLayerSpatialDesc(next3.getSpatialInfo()));
            newBuilder.addTextOverlayDescs(newBuilder14);
        }
        byte[] byteArray = newBuilder.build().toByteArray();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArray.length);
        allocateDirect.put(byteArray);
        return allocateDirect;
    }
}
