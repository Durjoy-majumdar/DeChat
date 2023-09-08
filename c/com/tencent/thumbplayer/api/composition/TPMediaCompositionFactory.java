package com.tencent.thumbplayer.api.composition;

import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.composition.TPEmptyTrackClip;
import com.tencent.thumbplayer.composition.TPMediaAssetExtraParam;
import com.tencent.thumbplayer.composition.TPMediaAssetOrderedMap;
import com.tencent.thumbplayer.composition.TPMediaComposition;
import com.tencent.thumbplayer.composition.TPMediaCompositionTrack;
import com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip;
import com.tencent.thumbplayer.composition.TPMediaDRMAsset;
import com.tencent.thumbplayer.composition.TPMediaRtcAsset;
import com.tencent.thumbplayer.composition.TPMediaUrlAsset;
import java.util.List;

public class TPMediaCompositionFactory {
    public static ITPMediaTrackClip createEmptyTrackClip(int i, long j, long j2) {
        TPEmptyTrackClip tPEmptyTrackClip = new TPEmptyTrackClip(i);
        tPEmptyTrackClip.setCutTimeRange(j, j2);
        return tPEmptyTrackClip;
    }

    public static ITPMediaAssetExtraParam createMediaAssetExtraParam() {
        return new TPMediaAssetExtraParam();
    }

    public static ITPMediaAssetOrderedMap createMediaAssetOrderedMap() {
        return new TPMediaAssetOrderedMap();
    }

    public static ITPMediaComposition createMediaComposition() {
        return new TPMediaComposition();
    }

    public static ITPMediaDRMAsset createMediaDRMAsset(@TPCommonEnum.TP_DRM_TYPE int i, String str) {
        return new TPMediaDRMAsset(i, str);
    }

    public static ITPMediaAsset createMediaRTCAsset(String str, String str2) {
        return new TPMediaRtcAsset(str, str2);
    }

    public static ITPMediaTrack createMediaTrack(int i) {
        return new TPMediaCompositionTrack(i);
    }

    public static ITPMediaTrackClip createMediaTrackClip(String str, int i) {
        return new TPMediaCompositionTrackClip(str, i);
    }

    public static ITPMediaUrlAsset createMediaUrlAsset(String str) {
        return new TPMediaUrlAsset(str);
    }

    public static ITPMediaAsset createMediaRTCAsset(String str, String str2, int i) {
        return new TPMediaRtcAsset(str, str2, i);
    }

    public static ITPMediaTrack createMediaTrack(int i, ITPMediaTrackClip... iTPMediaTrackClipArr) {
        TPMediaCompositionTrack tPMediaCompositionTrack = new TPMediaCompositionTrack(i);
        for (ITPMediaTrackClip addTrackClip : iTPMediaTrackClipArr) {
            tPMediaCompositionTrack.addTrackClip(addTrackClip);
        }
        return tPMediaCompositionTrack;
    }

    public static ITPMediaTrackClip createMediaTrackClip(String str, int i, long j, long j2) {
        return new TPMediaCompositionTrackClip(str, i, j, j2);
    }

    public static ITPMediaTrack createMediaTrack(int i, List<ITPMediaTrackClip> list) {
        TPMediaCompositionTrack tPMediaCompositionTrack = new TPMediaCompositionTrack(i);
        for (ITPMediaTrackClip addTrackClip : list) {
            tPMediaCompositionTrack.addTrackClip(addTrackClip);
        }
        return tPMediaCompositionTrack;
    }
}
