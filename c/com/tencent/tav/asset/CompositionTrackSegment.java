package com.tencent.tav.asset;

import com.tencent.tav.coremedia.CMTimeRange;
import java.net.URL;

public class CompositionTrackSegment extends AssetTrackSegment {
    private String sourcePath;
    private int sourceTrackID;
    private int sourceType;
    private URL url;

    public CompositionTrackSegment(String str, int i, CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2, int i2) {
        super(cMTimeRange, cMTimeRange2);
        this.sourcePath = str;
        this.sourceType = i2;
        this.sourceTrackID = i;
        this.empty = false;
    }

    public String getSourcePath() {
        return this.sourcePath;
    }

    public int getSourceTrackID() {
        return this.sourceTrackID;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public URL getUrl() {
        return this.url;
    }

    public String toString() {
        return "CompositionTrackSegment{sourcePath='" + this.sourcePath + '\'' + ", sourceTrackID=" + this.sourceTrackID + ", timeMapping=" + this.timeMapping + '}';
    }

    public void updateTargetTimeRange(CMTimeRange cMTimeRange) {
        this.scaleDuration = cMTimeRange.getDuration().clone();
        this.timeRange = cMTimeRange.clone();
        this.timeMapping.setTarget(cMTimeRange);
    }

    public CompositionTrackSegment(CMTimeRange cMTimeRange) {
        super(cMTimeRange, cMTimeRange);
        this.empty = true;
    }
}
