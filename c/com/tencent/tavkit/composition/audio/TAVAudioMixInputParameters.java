package com.tencent.tavkit.composition.audio;

import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.core.MutableAudioMixInputParameters;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tavkit.composition.model.TAVAudioConfiguration;
import java.util.ArrayList;
import java.util.List;

public class TAVAudioMixInputParameters extends MutableAudioMixInputParameters {
    private static final String TAG = "TAVAudioMixInputParameters";
    private List<TAVAudioConfigurationSegment> audioConfigurationSegmentList = new ArrayList();

    public TAVAudioMixInputParameters(AssetTrack assetTrack) {
        super(assetTrack);
    }

    public void addAudioConfiguration(CMTimeRange cMTimeRange, TAVAudioConfiguration tAVAudioConfiguration) {
        this.audioConfigurationSegmentList.add(new TAVAudioConfigurationSegment(cMTimeRange, tAVAudioConfiguration));
    }

    public List<TAVAudioConfigurationSegment> getAudioConfigurationSegmentList() {
        return this.audioConfigurationSegmentList;
    }

    public float getVolumeAtTime(CMTime cMTime) {
        for (TAVAudioConfigurationSegment next : this.audioConfigurationSegmentList) {
            if (next != null && next.compositionTimeRange.containsTime(cMTime)) {
                return (next.audioConfiguration.getStartVolumeEdge() == null || !next.compositionTimeRange.getStart().add(next.audioConfiguration.getStartVolumeEdge().getDuration()).bigThan(cMTime)) ? (next.audioConfiguration.getEndVolumeEdge() == null || !next.compositionTimeRange.getEnd().sub(next.audioConfiguration.getEndVolumeEdge().getDuration()).smallThan(cMTime)) ? next.audioConfiguration.getVolume(cMTime) : next.audioConfiguration.getEndVolumeEdge().getVolume(cMTime.sub(next.compositionTimeRange.getEnd().sub(next.audioConfiguration.getEndVolumeEdge().getDuration()))) : next.audioConfiguration.getStartVolumeEdge().getVolume(cMTime.sub(next.compositionTimeRange.getStart()));
            }
        }
        Logger.m144643e(TAG, "没有设置正确audioConfiguration，走到了非预想的分支");
        return super.getVolumeAtTime(cMTime);
    }

    public void setAudioConfigurationSegments(List<TAVAudioConfigurationSegment> list) {
        this.audioConfigurationSegmentList.clear();
        this.audioConfigurationSegmentList.addAll(list);
    }
}
