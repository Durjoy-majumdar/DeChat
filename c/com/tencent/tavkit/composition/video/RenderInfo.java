package com.tencent.tavkit.composition.video;

import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.decoder.RenderContextParams;
import com.tencent.tavkit.ciimage.CIContext;
import com.tencent.tavkit.composition.model.TAVVideoCompositionTrack;
import java.util.ArrayList;
import java.util.List;

public class RenderInfo {
    private final CIContext ciContext;
    private final CGSize renderSize;
    private final CMTime time;
    private final List<TAVVideoCompositionTrack> tracks = new ArrayList();

    public RenderInfo(CMTime cMTime, CGSize cGSize, CIContext cIContext) {
        this.time = cMTime;
        this.renderSize = cGSize;
        this.ciContext = cIContext;
    }

    public void addTrack(TAVVideoCompositionTrack tAVVideoCompositionTrack) {
        if (!this.tracks.contains(tAVVideoCompositionTrack)) {
            this.tracks.add(tAVVideoCompositionTrack);
        }
    }

    public CIContext getCiContext() {
        return this.ciContext;
    }

    public Object getParam(String str) {
        RenderContextParams params = this.ciContext.getRenderContext().getParams();
        if (params != null) {
            return params.getParam(str);
        }
        return null;
    }

    public int getRenderHeight() {
        return (int) this.renderSize.height;
    }

    public CGSize getRenderSize() {
        return this.renderSize;
    }

    public int getRenderWidth() {
        return (int) this.renderSize.width;
    }

    public CMTime getTime() {
        return this.time;
    }

    public Object getTrackExtraInfo(String str) {
        for (TAVVideoCompositionTrack extraTrackInfo : this.tracks) {
            Object extraTrackInfo2 = extraTrackInfo.getExtraTrackInfo(str);
            if (extraTrackInfo2 != null) {
                return extraTrackInfo2;
            }
        }
        return null;
    }

    public List<TAVVideoCompositionTrack> getTracks() {
        return this.tracks;
    }

    public void putParam(String str, Object obj) {
        RenderContextParams params = this.ciContext.getRenderContext().getParams();
        if (params != null) {
            params.putParam(str, obj);
        }
    }
}
