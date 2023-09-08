package com.tencent.tav.decoder;

import android.graphics.Matrix;
import android.text.TextUtils;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.AssetTrackSegment;
import com.tencent.tav.asset.CompositionTrackSegment;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.extractor.AssetExtractor;
import com.tencent.tav.extractor.ExtractorUtils;

public class DecoderAssetTrack {
    public String assetPath;
    public int frameRate;
    public int mediaType;
    public int preferRotation;
    public Matrix preferredTransform;
    public float preferredVolume;
    public CGSize size;
    public int sourceType;
    public int trackId;

    public static DecoderAssetTrack create(AssetTrack assetTrack, AssetTrackSegment assetTrackSegment) {
        return assetTrackSegment instanceof CompositionTrackSegment ? createFromCompositionTrackSegment(assetTrack, (CompositionTrackSegment) assetTrackSegment) : createFromTrackSegment(assetTrack, assetTrackSegment);
    }

    private static DecoderAssetTrack createFromCompositionTrackSegment(AssetTrack assetTrack, CompositionTrackSegment compositionTrackSegment) {
        if (compositionTrackSegment.isEmpty()) {
            return null;
        }
        DecoderAssetTrack decoderAssetTrack = new DecoderAssetTrack();
        decoderAssetTrack.assetPath = compositionTrackSegment.getSourcePath();
        decoderAssetTrack.trackId = compositionTrackSegment.getSourceTrackID();
        decoderAssetTrack.mediaType = assetTrack.getMediaType();
        if (!TextUtils.isEmpty(compositionTrackSegment.getSourcePath())) {
            AssetExtractor assetExtractor = new AssetExtractor();
            assetExtractor.setDataSource(compositionTrackSegment.getSourcePath());
            decoderAssetTrack.size = ExtractorUtils.getVideoSize(assetExtractor);
            decoderAssetTrack.preferRotation = assetExtractor.getPreferRotation();
            decoderAssetTrack.preferredTransform = assetTrack.getPreferredTransform();
            decoderAssetTrack.sourceType = compositionTrackSegment.getSourceType();
            assetExtractor.dispose();
        }
        decoderAssetTrack.preferredVolume = 1.0f;
        decoderAssetTrack.frameRate = 30;
        return decoderAssetTrack;
    }

    private static DecoderAssetTrack createFromTrackSegment(AssetTrack assetTrack, AssetTrackSegment assetTrackSegment) {
        if (assetTrackSegment.isEmpty()) {
            return null;
        }
        DecoderAssetTrack decoderAssetTrack = new DecoderAssetTrack();
        decoderAssetTrack.assetPath = assetTrack.getSourcePath();
        decoderAssetTrack.trackId = assetTrack.getTrackID();
        decoderAssetTrack.mediaType = assetTrack.getMediaType();
        if (assetTrackSegment instanceof CompositionTrackSegment) {
            decoderAssetTrack.sourceType = ((CompositionTrackSegment) assetTrackSegment).getSourceType();
        }
        decoderAssetTrack.size = assetTrack.getNaturalSize();
        decoderAssetTrack.preferredTransform = assetTrack.getPreferredTransform();
        decoderAssetTrack.preferredVolume = assetTrack.getPreferredVolume();
        decoderAssetTrack.preferRotation = assetTrack.getPreferredRotation();
        decoderAssetTrack.frameRate = (int) assetTrack.getNominalFrameRate();
        return decoderAssetTrack;
    }
}
