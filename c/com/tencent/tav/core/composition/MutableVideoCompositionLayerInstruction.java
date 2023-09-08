package com.tencent.tav.core.composition;

import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.core.composition.VideoCompositionLayerInstruction;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.Transform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MutableVideoCompositionLayerInstruction implements VideoCompositionLayerInstruction {
    private AssetTrack assetTrack;
    private List<VideoCompositionLayerInstruction.CropRectangleRamp> cropRectangleRampList = new ArrayList();
    private CMTime duration = new CMTime(2147483647L);
    private boolean flipX = false;
    private boolean flipY = false;
    private List<VideoCompositionLayerInstruction.OpacityRamp> opacityRampList = new ArrayList();
    private int trackID;
    private List<VideoCompositionLayerInstruction.TransformRamp> transformRampList = new ArrayList();

    public MutableVideoCompositionLayerInstruction(AssetTrack assetTrack2) {
        this.trackID = assetTrack2.getTrackID();
        this.assetTrack = assetTrack2;
        this.duration = assetTrack2.getDuration();
    }

    public VideoCompositionLayerInstruction.CropRectangleRamp getCropRectangleRampForTime(CMTime cMTime) {
        for (VideoCompositionLayerInstruction.CropRectangleRamp next : this.cropRectangleRampList) {
            if (next.timeRange.containsTime(cMTime)) {
                return next;
            }
        }
        return new VideoCompositionLayerInstruction.CropRectangleRamp(new CMTimeRange(CMTime.CMTimeZero, this.duration));
    }

    public VideoCompositionLayerInstruction.OpacityRamp getOpacityRampForTime(CMTime cMTime) {
        for (VideoCompositionLayerInstruction.OpacityRamp next : this.opacityRampList) {
            if (next.timeRange.containsTime(cMTime)) {
                return next;
            }
        }
        return new VideoCompositionLayerInstruction.OpacityRamp(new CMTimeRange(CMTime.CMTimeZero, this.duration));
    }

    public int getTrackID() {
        return this.trackID;
    }

    public VideoCompositionLayerInstruction.TransformRamp getTransformRampForTime(CMTime cMTime) {
        for (VideoCompositionLayerInstruction.TransformRamp next : this.transformRampList) {
            if (next.timeRange.containsTime(cMTime)) {
                return next;
            }
        }
        return new VideoCompositionLayerInstruction.TransformRamp(new CMTimeRange(CMTime.CMTimeZero, this.duration));
    }

    public void setCropRectangle(CGRect cGRect, CMTime cMTime) {
        CMTime cMTime2 = this.duration;
        Iterator<VideoCompositionLayerInstruction.CropRectangleRamp> it = this.cropRectangleRampList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VideoCompositionLayerInstruction.CropRectangleRamp next = it.next();
            if (next.timeRange.containsTime(cMTime)) {
                cMTime2 = next.timeRange.getEnd();
                next.timeRange = new CMTimeRange(next.timeRange.getStart(), cMTime.sub(next.timeRange.getStart()));
                break;
            }
        }
        VideoCompositionLayerInstruction.CropRectangleRamp cropRectangleRamp = new VideoCompositionLayerInstruction.CropRectangleRamp(new CMTimeRange(cMTime, cMTime2.sub(cMTime)));
        cropRectangleRamp.startCropRectangle = cGRect;
        cropRectangleRamp.endCropRectangle = cGRect;
        this.cropRectangleRampList.add(cropRectangleRamp);
    }

    public void setCropRectangleRampFromStartCropRectangle(CGRect cGRect, CGRect cGRect2, CMTimeRange cMTimeRange) {
        VideoCompositionLayerInstruction.CropRectangleRamp cropRectangleRamp = new VideoCompositionLayerInstruction.CropRectangleRamp(cMTimeRange);
        cropRectangleRamp.startCropRectangle = cGRect;
        cropRectangleRamp.endCropRectangle = cGRect2;
        Iterator<VideoCompositionLayerInstruction.CropRectangleRamp> it = this.cropRectangleRampList.iterator();
        if (it.hasNext()) {
            VideoCompositionLayerInstruction.CropRectangleRamp next = it.next();
            CMTime start = next.timeRange.getStart();
            CMTime end = next.timeRange.getEnd();
            if (cMTimeRange.containsTime(start) && cMTimeRange.containsTime(end)) {
                next.timeRange = CMTimeRange.CMTimeRangeInvalid;
            } else if (cMTimeRange.containsTime(start) && !cMTimeRange.containsTime(end)) {
                next.timeRange = new CMTimeRange(cMTimeRange.getEnd(), next.timeRange.getEnd().sub(cMTimeRange.getEnd()));
            } else if (cMTimeRange.containsTime(end) && !cMTimeRange.containsTime(start)) {
                next.timeRange = new CMTimeRange(next.timeRange.getStart(), cMTimeRange.getStart().sub(next.timeRange.getStart()));
            }
        }
        int i = 0;
        while (i < this.cropRectangleRampList.size()) {
            VideoCompositionLayerInstruction.CropRectangleRamp cropRectangleRamp2 = this.cropRectangleRampList.get(i);
            if (cropRectangleRamp2.timeRange == CMTimeRange.CMTimeRangeInvalid) {
                this.cropRectangleRampList.remove(cropRectangleRamp2);
                i--;
            }
            i++;
        }
        this.cropRectangleRampList.add(cropRectangleRamp);
    }

    public void setFlipX(boolean z) {
        this.flipX = z;
    }

    public void setFlipY(boolean z) {
        this.flipY = z;
    }

    public void setOpacity(float f, CMTime cMTime) {
        CMTime cMTime2 = this.duration;
        Iterator<VideoCompositionLayerInstruction.OpacityRamp> it = this.opacityRampList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VideoCompositionLayerInstruction.OpacityRamp next = it.next();
            if (next.timeRange.containsTime(cMTime)) {
                cMTime2 = next.timeRange.getEnd();
                next.timeRange = new CMTimeRange(next.timeRange.getStart(), cMTime.sub(next.timeRange.getStart()));
                break;
            }
        }
        VideoCompositionLayerInstruction.OpacityRamp opacityRamp = new VideoCompositionLayerInstruction.OpacityRamp(new CMTimeRange(cMTime, cMTime2.sub(cMTime)));
        opacityRamp.startOpacity = f;
        opacityRamp.endOpacity = f;
        this.opacityRampList.add(opacityRamp);
    }

    public void setOpacityRampFromStartOpacity(float f, float f2, CMTimeRange cMTimeRange) {
        VideoCompositionLayerInstruction.OpacityRamp opacityRamp = new VideoCompositionLayerInstruction.OpacityRamp(cMTimeRange);
        opacityRamp.startOpacity = f;
        opacityRamp.endOpacity = f2;
        Iterator<VideoCompositionLayerInstruction.OpacityRamp> it = this.opacityRampList.iterator();
        if (it.hasNext()) {
            VideoCompositionLayerInstruction.OpacityRamp next = it.next();
            CMTime start = next.timeRange.getStart();
            CMTime end = next.timeRange.getEnd();
            if (cMTimeRange.containsTime(start) && cMTimeRange.containsTime(end)) {
                next.timeRange = CMTimeRange.CMTimeRangeInvalid;
            } else if (cMTimeRange.containsTime(start) && !cMTimeRange.containsTime(end)) {
                next.timeRange = new CMTimeRange(cMTimeRange.getEnd(), next.timeRange.getEnd().sub(cMTimeRange.getEnd()));
            } else if (cMTimeRange.containsTime(end) && !cMTimeRange.containsTime(start)) {
                next.timeRange = new CMTimeRange(next.timeRange.getStart(), cMTimeRange.getStart().sub(next.timeRange.getStart()));
            }
        }
        int i = 0;
        while (i < this.opacityRampList.size()) {
            VideoCompositionLayerInstruction.OpacityRamp opacityRamp2 = this.opacityRampList.get(i);
            if (opacityRamp2.timeRange == CMTimeRange.CMTimeRangeInvalid) {
                this.opacityRampList.remove(opacityRamp2);
                i--;
            }
            i++;
        }
        this.opacityRampList.add(opacityRamp);
    }

    public void setTrackID(int i) {
        this.trackID = i;
    }

    public void setTransform(Transform transform, CMTime cMTime) {
        CMTime cMTime2 = this.duration;
        Iterator<VideoCompositionLayerInstruction.TransformRamp> it = this.transformRampList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VideoCompositionLayerInstruction.TransformRamp next = it.next();
            if (next.timeRange.containsTime(cMTime)) {
                cMTime2 = next.timeRange.getEnd();
                next.timeRange = new CMTimeRange(next.timeRange.getStart(), cMTime.sub(next.timeRange.getStart()));
                break;
            }
        }
        VideoCompositionLayerInstruction.TransformRamp transformRamp = new VideoCompositionLayerInstruction.TransformRamp(new CMTimeRange(cMTime, cMTime2.sub(cMTime)));
        transformRamp.startTransform = transform;
        transformRamp.endTransform = transform;
        this.transformRampList.add(transformRamp);
    }

    public void setTransformRampFromStartTransform(Transform transform, Transform transform2, CMTimeRange cMTimeRange) {
        VideoCompositionLayerInstruction.TransformRamp transformRamp = new VideoCompositionLayerInstruction.TransformRamp(cMTimeRange);
        transformRamp.startTransform = transform;
        transformRamp.endTransform = transform2;
        Iterator<VideoCompositionLayerInstruction.TransformRamp> it = this.transformRampList.iterator();
        if (it.hasNext()) {
            VideoCompositionLayerInstruction.TransformRamp next = it.next();
            CMTime start = next.timeRange.getStart();
            CMTime end = next.timeRange.getEnd();
            if (cMTimeRange.containsTime(start) && cMTimeRange.containsTime(end)) {
                next.timeRange = CMTimeRange.CMTimeRangeInvalid;
            } else if (cMTimeRange.containsTime(start) && !cMTimeRange.containsTime(end)) {
                next.timeRange = new CMTimeRange(cMTimeRange.getEnd(), next.timeRange.getEnd().sub(cMTimeRange.getEnd()));
            } else if (cMTimeRange.containsTime(end) && !cMTimeRange.containsTime(start)) {
                next.timeRange = new CMTimeRange(next.timeRange.getStart(), cMTimeRange.getStart().sub(next.timeRange.getStart()));
            }
        }
        int i = 0;
        while (i < this.transformRampList.size()) {
            VideoCompositionLayerInstruction.TransformRamp transformRamp2 = this.transformRampList.get(i);
            if (transformRamp2.timeRange == CMTimeRange.CMTimeRangeInvalid) {
                this.transformRampList.remove(transformRamp2);
                i--;
            }
            i++;
        }
        this.transformRampList.add(transformRamp);
    }

    public MutableVideoCompositionLayerInstruction(int i) {
        this.trackID = i;
    }

    public MutableVideoCompositionLayerInstruction() {
    }
}
