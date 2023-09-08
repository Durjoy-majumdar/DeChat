package com.tencent.thumbplayer.composition;

import com.tencent.thumbplayer.api.composition.ITPMediaComposition;
import com.tencent.thumbplayer.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.utils.TPCommonUtils;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TPMediaComposition extends TPMediaCommonAsset implements ITPMediaComposition {
    private static final String TAG = "TPMediaComposition";
    private int mAVTrackSequence = 0;
    private List<ITPMediaTrack> mAVTracks = new ArrayList(1);
    private int mAudioTrackSequence = 0;
    private List<ITPMediaTrack> mAudioTracks = new ArrayList(1);
    private int mVideoTrackSequence = 0;
    private List<ITPMediaTrack> mVideoTracks = new ArrayList(1);

    private synchronized int generateAVTrackSequence() {
        int i;
        i = this.mAVTrackSequence + 1;
        this.mAVTrackSequence = i;
        return i;
    }

    private synchronized int generateAudioTrackSequence() {
        int i;
        i = this.mAudioTrackSequence + 1;
        this.mAudioTrackSequence = i;
        return i;
    }

    private synchronized int generateVideoTrackSequence() {
        int i;
        i = this.mVideoTrackSequence + 1;
        this.mVideoTrackSequence = i;
        return i;
    }

    public synchronized ITPMediaTrack addAVTrack() {
        TPMediaCompositionTrack tPMediaCompositionTrack;
        tPMediaCompositionTrack = new TPMediaCompositionTrack(generateAVTrackSequence(), 1);
        this.mAVTracks.add(tPMediaCompositionTrack);
        return tPMediaCompositionTrack;
    }

    public synchronized ITPMediaTrack addAudioTrack() {
        TPMediaCompositionTrack tPMediaCompositionTrack;
        tPMediaCompositionTrack = new TPMediaCompositionTrack(generateAudioTrackSequence(), 3);
        this.mAudioTracks.add(tPMediaCompositionTrack);
        return tPMediaCompositionTrack;
    }

    public synchronized ITPMediaTrack addVideoTrack() {
        TPMediaCompositionTrack tPMediaCompositionTrack;
        tPMediaCompositionTrack = new TPMediaCompositionTrack(generateVideoTrackSequence(), 2);
        this.mVideoTracks.add(tPMediaCompositionTrack);
        return tPMediaCompositionTrack;
    }

    public long getAVDuration() {
        List<ITPMediaTrack> list = this.mAVTracks;
        long j = 0;
        if (list != null) {
            for (ITPMediaTrack next : list) {
                if (j < next.getTimelineDurationMs()) {
                    j = next.getTimelineDurationMs();
                }
            }
        }
        return j;
    }

    public List<ITPMediaTrack> getAllAVTracks() {
        return this.mAVTracks;
    }

    public synchronized List<ITPMediaTrack> getAllAudioTracks() {
        return this.mAudioTracks;
    }

    public synchronized List<ITPMediaTrack> getAllVideoTracks() {
        return this.mVideoTracks;
    }

    public long getAudioDuration() {
        List<ITPMediaTrack> list = this.mAudioTracks;
        long j = 0;
        if (list != null) {
            for (ITPMediaTrack next : list) {
                if (j < next.getTimelineDurationMs()) {
                    j = next.getTimelineDurationMs();
                }
            }
        }
        return j;
    }

    public synchronized ITPMediaTrack getAudioTrack(int i) {
        return this.mAudioTracks.get(i);
    }

    public long getDurationMs() {
        if (!TPCommonUtils.isEmpty((Collection<? extends Object>) this.mAVTracks)) {
            return getAVDuration();
        }
        long audioDuration = getAudioDuration();
        long videoDuration = getVideoDuration();
        int i = (videoDuration > audioDuration ? 1 : (videoDuration == audioDuration ? 0 : -1));
        long j = i > 0 ? videoDuration : audioDuration;
        String str = TPMediaCompositionHelper.composition_duration_strategy;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2046821033:
                if (str.equals("base_longer")) {
                    c = 0;
                    break;
                }
                break;
            case -491658008:
                if (str.equals("base_audio")) {
                    c = 1;
                    break;
                }
                break;
            case -472621683:
                if (str.equals("base_video")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (i <= 0) {
                    return audioDuration;
                }
                break;
            case 1:
                return audioDuration;
            case 2:
                break;
            default:
                return j;
        }
        return videoDuration;
    }

    public int getMediaType() {
        return 4;
    }

    public String getUrl() {
        try {
            return TPMediaCompositionXmlGenerator.buildAssetXmlFromComposition(this);
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return null;
        }
    }

    public long getVideoDuration() {
        List<ITPMediaTrack> list = this.mVideoTracks;
        long j = 0;
        if (list != null) {
            for (ITPMediaTrack next : list) {
                if (j < next.getTimelineDurationMs()) {
                    j = next.getTimelineDurationMs();
                }
            }
        }
        return j;
    }

    public synchronized ITPMediaTrack getVideoTrack(int i) {
        return this.mVideoTracks.get(i);
    }

    public void release() {
        List<ITPMediaTrack> list = this.mVideoTracks;
        if (list != null) {
            list.clear();
            this.mVideoTracks = null;
        }
        List<ITPMediaTrack> list2 = this.mAudioTracks;
        if (list2 != null) {
            list2.clear();
            this.mAudioTracks = null;
        }
        List<ITPMediaTrack> list3 = this.mAVTracks;
        if (list3 != null) {
            list3.clear();
            this.mAVTracks = null;
        }
    }

    public boolean removeAVTrack(ITPMediaTrack iTPMediaTrack) {
        if (iTPMediaTrack != null) {
            return this.mAVTracks.remove(iTPMediaTrack);
        }
        throw new IllegalArgumentException("remove audio track , track is null .");
    }

    public synchronized boolean removeAudioTrack(ITPMediaTrack iTPMediaTrack) {
        if (iTPMediaTrack != null) {
        } else {
            throw new IllegalArgumentException("remove audio track , track is null .");
        }
        return this.mAudioTracks.remove(iTPMediaTrack);
    }

    public synchronized boolean removeVideoTrack(ITPMediaTrack iTPMediaTrack) {
        if (iTPMediaTrack != null) {
        } else {
            throw new IllegalArgumentException("remove video track , track is null .");
        }
        return this.mVideoTracks.remove(iTPMediaTrack);
    }

    public void setAVTracks(List<ITPMediaTrack> list) {
        this.mAVTracks = list;
    }

    public void setAudioTracks(List<ITPMediaTrack> list) {
        this.mAudioTracks = list;
    }

    public void setVideoTracks(List<ITPMediaTrack> list) {
        this.mVideoTracks = list;
    }
}
