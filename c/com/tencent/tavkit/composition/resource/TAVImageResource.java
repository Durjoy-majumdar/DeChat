package com.tencent.tavkit.composition.resource;

import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.ciimage.CIImage;
import java.util.HashMap;

public class TAVImageResource extends TAVResource {
    private HashMap<Thread, CIImage> ciImageHashMap;
    private boolean emptyAudioTrack;
    private CIImage image;

    public TAVImageResource(CIImage cIImage, CMTime cMTime) {
        this(cIImage, cMTime, false);
    }

    public CIImage imageAtTime(CMTime cMTime, CGSize cGSize) {
        CMTime cMTime2 = this.scaledDuration;
        CMTime cMTime3 = CMTime.CMTimeZero;
        if (cMTime2.bigThan(cMTime3)) {
            if (cMTime.smallThan(cMTime3) || cMTime.bigThan(this.scaledDuration)) {
                return null;
            }
        } else if (!this.sourceTimeRange.containsTime(cMTime)) {
            return null;
        }
        if (this.image == null) {
            return null;
        }
        Thread currentThread = Thread.currentThread();
        CIImage cIImage = this.ciImageHashMap.get(currentThread);
        if (cIImage == null) {
            cIImage = this.image.simpleClone();
            this.ciImageHashMap.put(currentThread, cIImage);
        }
        cIImage.reset();
        return cIImage;
    }

    public TrackInfo trackInfoForType(int i, int i2) {
        if (i == 1) {
            return newEmptyTrackInfo(i, i2);
        }
        if (!this.emptyAudioTrack || i != 2) {
            return null;
        }
        return newEmptyTrackInfo(i, i2);
    }

    public TAVImageResource(CIImage cIImage, CMTime cMTime, boolean z) {
        this.ciImageHashMap = new HashMap<>();
        this.image = cIImage;
        this.duration = cMTime;
        this.sourceTimeRange = new CMTimeRange(CMTime.CMTimeZero, cMTime);
        this.emptyAudioTrack = z;
    }

    public TAVResource clone() {
        TAVImageResource tAVImageResource = new TAVImageResource(this.image, this.duration.clone(), this.emptyAudioTrack);
        tAVImageResource.sourceTimeRange = this.sourceTimeRange.clone();
        tAVImageResource.scaledDuration = this.scaledDuration.clone();
        tAVImageResource.ciImageHashMap = this.ciImageHashMap;
        return tAVImageResource;
    }
}
