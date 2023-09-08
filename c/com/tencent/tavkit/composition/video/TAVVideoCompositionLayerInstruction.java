package com.tencent.tavkit.composition.video;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.tav.core.composition.VideoCompositionLayerInstruction;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.composition.model.TAVTransitionableVideo;
import com.tencent.tavkit.composition.model.TAVVideoCompositionTrack;
import com.tencent.tavkit.composition.model.TAVVideoConfiguration;

public class TAVVideoCompositionLayerInstruction implements VideoCompositionLayerInstruction {
    private final TAVVideoCompositionTrack imageSource;
    private Matrix preferredTransform;
    private CMTimeRange timeRange;
    private int trackID;
    private TAVVideoTransition transition;
    private final TAVVideoConfiguration videoConfiguration;

    public TAVVideoCompositionLayerInstruction(int i, TAVVideoConfiguration tAVVideoConfiguration, TAVVideoCompositionTrack tAVVideoCompositionTrack) {
        this.trackID = i;
        this.videoConfiguration = tAVVideoConfiguration;
        this.imageSource = tAVVideoCompositionTrack;
        this.preferredTransform = new Matrix();
    }

    public Bitmap applySourceImage(Bitmap bitmap, CMTime cMTime, CGSize cGSize) {
        return null;
    }

    public VideoCompositionLayerInstruction.CropRectangleRamp getCropRectangleRampForTime(CMTime cMTime) {
        return null;
    }

    public TAVVideoCompositionTrack getImageSource() {
        return this.imageSource;
    }

    public VideoCompositionLayerInstruction.OpacityRamp getOpacityRampForTime(CMTime cMTime) {
        return null;
    }

    public Matrix getPreferredTransform() {
        return this.preferredTransform;
    }

    public CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public int getTrackID() {
        return this.trackID;
    }

    public VideoCompositionLayerInstruction.TransformRamp getTransformRampForTime(CMTime cMTime) {
        return null;
    }

    public TAVVideoTransition getTransition() {
        return this.transition;
    }

    public TAVVideoConfiguration getVideoConfiguration() {
        return this.videoConfiguration;
    }

    public void setPreferredTransform(Matrix matrix) {
        this.preferredTransform = matrix;
    }

    public void setTimeRange(CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }

    public void setTrackID(int i) {
        this.trackID = i;
    }

    public void setTransition(TAVVideoTransition tAVVideoTransition) {
        this.transition = tAVVideoTransition;
    }

    public String toString() {
        return "TAVVideoCompositionLayerInstruction{trackID=" + this.trackID + ", timeRange=" + this.timeRange.toSimpleString() + ", preferredTransform=" + this.preferredTransform + ", imageSource=" + this.imageSource + ", transition=" + this.transition + ", videoConfiguration=" + this.videoConfiguration + '}';
    }

    public TAVVideoCompositionLayerInstruction(int i, TAVTransitionableVideo tAVTransitionableVideo) {
        this(i, tAVTransitionableVideo.getVideoConfiguration(), tAVTransitionableVideo);
        setTimeRange(tAVTransitionableVideo.getTimeRange());
        setTransition(tAVTransitionableVideo.getVideoTransition());
    }
}
