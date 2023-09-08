package com.tencent.maas.instamovie;

import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.model.MJLayerStyle;
import com.tencent.maas.model.MJSpatialInfo;
import com.tencent.maas.model.MJTextStyle;

public class MJTextSegment extends MJSegment {
    public MJTextSegment(String str, MJMovieSession mJMovieSession) {
        super(str, 1, mJMovieSession);
    }

    public MJLayerStyle getLayerStyle() {
        MJMovieSession mJMovieSession = this.movieSession.get();
        if (mJMovieSession == null) {
            return null;
        }
        return mJMovieSession.getTextSegmentLayerStyle(this.segmentID);
    }

    public MJSpatialInfo getSpatialInfo() {
        MJMovieSession mJMovieSession = this.movieSession.get();
        if (mJMovieSession == null) {
            return null;
        }
        return mJMovieSession.getSegmentSpatialInfo(this.segmentID);
    }

    public String getText() {
        MJMovieSession mJMovieSession = this.movieSession.get();
        if (mJMovieSession == null) {
            return null;
        }
        return mJMovieSession.getTextSegmentText(this.segmentID);
    }

    public MJTextStyle getTextStyle() {
        MJMovieSession mJMovieSession = this.movieSession.get();
        if (mJMovieSession == null) {
            return null;
        }
        return mJMovieSession.getTextSegmentTextStyle(this.segmentID);
    }

    public MJError updateSpatialInfo(MJSpatialInfo mJSpatialInfo, boolean z) {
        MJMovieSession mJMovieSession = this.movieSession.get();
        return mJMovieSession == null ? new MJError(MJError.MaasEC.InvalidState.getErrorCode(), "Session is null") : mJMovieSession.updateSegmentSpatialInfo(this.segmentID, mJSpatialInfo, z);
    }

    public MJError updateText(String str, boolean z) {
        MJMovieSession mJMovieSession = this.movieSession.get();
        return mJMovieSession == null ? new MJError(MJError.MaasEC.InvalidState.getErrorCode(), "Session is null") : mJMovieSession.updateTextSegmentText(this.segmentID, str, z);
    }

    public MJError updateTextStyle(MJTextStyle mJTextStyle, MJLayerStyle mJLayerStyle, boolean z) {
        MJMovieSession mJMovieSession = this.movieSession.get();
        return mJMovieSession == null ? new MJError(MJError.MaasEC.InvalidState.getErrorCode(), "Session is null") : mJMovieSession.updateTextSegmentStyle(this.segmentID, mJTextStyle, mJLayerStyle, z);
    }
}
