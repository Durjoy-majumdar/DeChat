package com.tencent.tav.core.audio;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.AssetTrack;

public class AudioExportSession {
    public static int SEGMENT_DURATION_US = 5000000;

    public static IAudioExportTask generateAudioAssetExportTask(Asset asset, String str) {
        return new AudioExportTask(new AudioSourceComposition(asset), str);
    }

    public static IAudioExportTask generateAudioTrackExportTask(AssetTrack assetTrack, String str) {
        return new AudioExportTask(new AudioSourceTrack(assetTrack), str);
    }
}
