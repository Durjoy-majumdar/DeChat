package com.tencent.maas.instamovie;

import com.tencent.maas.base.Rect2;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.instamovie.base.asset.MJAssetInfo;
import com.tencent.maas.internal.MJClipSegmentInfo;
import com.tencent.maas.model.time.MJTime;
import com.tencent.maas.model.time.MJTimeRange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MJClipSegment extends MJSegment {
    public static final int CLIP_TYPE_AUDIO = 2;
    public static final int CLIP_TYPE_IMAGE = 4;
    public static final int CLIP_TYPE_MOVIE = 3;
    public static final int CLIP_TYPE_SYNTH_AUDIO = 6;
    public static final int CLIP_TYPE_SYNTH_MOVIE = 7;
    public static final int CLIP_TYPE_SYNTH_VIDEO = 5;
    public static final int CLIP_TYPE_VIDEO = 1;
    private final String clipFilePath;
    private final int clipType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClipType {
    }

    public MJClipSegment(MJClipSegmentInfo mJClipSegmentInfo, MJMovieSession mJMovieSession) {
        super(mJClipSegmentInfo.getSegmentID(), 3, mJMovieSession);
        this.clipFilePath = mJClipSegmentInfo.getClipFilePath();
        this.clipType = mJClipSegmentInfo.getClipType();
    }

    public MJAssetInfo getAssetInfo() {
        MJMovieSession mJMovieSession = this.movieSession.get();
        if (mJMovieSession == null) {
            return null;
        }
        return mJMovieSession.getAssetInfo(this.segmentID);
    }

    public MJTime getClipDuration() {
        MJMovieSession mJMovieSession = this.movieSession.get();
        if (mJMovieSession == null) {
            return null;
        }
        return mJMovieSession.getSegmentClipDuration(this.segmentID);
    }

    public String getClipFilePath() {
        return this.clipFilePath;
    }

    public int getClipType() {
        return this.clipType;
    }

    public Rect2 getNormalizedCropRect() {
        MJMovieSession mJMovieSession = this.movieSession.get();
        if (mJMovieSession == null) {
            return null;
        }
        return mJMovieSession.getSegmentNormalizedCropRect(this.segmentID);
    }

    public int getRotationMode() {
        MJMovieSession mJMovieSession = this.movieSession.get();
        if (mJMovieSession == null) {
            return 0;
        }
        return mJMovieSession.getSegmentRotationMode(this.segmentID);
    }

    public MJTimeRange getTimeRangeInClip() {
        MJMovieSession mJMovieSession = this.movieSession.get();
        return mJMovieSession == null ? MJTimeRange.InvalidTimeRange : mJMovieSession.getSegmentTimeRangeInClip(this.segmentID);
    }

    public MJTimeRange getTimeRangeInTimeline() {
        MJMovieSession mJMovieSession = this.movieSession.get();
        return mJMovieSession == null ? MJTimeRange.InvalidTimeRange : mJMovieSession.getSegmentTimeRangeInTimeline(this.segmentID);
    }

    public MJError setNormalizedCropRect(Rect2 rect2, boolean z) {
        MJMovieSession mJMovieSession = this.movieSession.get();
        return mJMovieSession == null ? new MJError(MJError.MaasEC.InvalidState.getErrorCode(), "Session is null") : mJMovieSession.setSegmentNormalizedCropRect(this.segmentID, rect2, z);
    }

    public MJError setRotationMode(int i, boolean z) {
        MJMovieSession mJMovieSession = this.movieSession.get();
        return mJMovieSession == null ? new MJError(MJError.MaasEC.InvalidState.getErrorCode(), "Session is null") : mJMovieSession.setSegmentRotationMode(this.segmentID, i, z);
    }

    public MJError setTimeRangeInClip(MJTimeRange mJTimeRange) {
        MJMovieSession mJMovieSession = this.movieSession.get();
        if (mJMovieSession == null) {
            return null;
        }
        return mJMovieSession.setSegmentTimeRangeInClip(this.segmentID, mJTimeRange);
    }
}
