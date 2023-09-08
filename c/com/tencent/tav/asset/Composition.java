package com.tencent.tav.asset;

import com.tencent.tav.asset.AsynchronousKeyValueLoading;
import com.tencent.tav.asset.CompositionTrack;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.logger.Logger;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Composition<CTrack extends CompositionTrack> extends Asset {
    public List<CTrack> tracks = new ArrayList();

    public Composition() {
    }

    public void createTracks() {
        int trackCount = this.extractor.getTrackCount();
        if (this.tracks == null) {
            this.tracks = new ArrayList();
        }
        for (int i = 0; i < trackCount; i++) {
            String string = this.extractor.getTrackFormat(i).getString("mime");
            if (string.startsWith("video/")) {
                int i2 = this.trackIndex;
                this.trackIndex = i2 + 1;
                this.tracks.add(new CompositionTrack(this, i2, 1, new CMTimeRange(CMTime.CMTimeZero, getVideoDuration())));
            } else if (string.startsWith("audio/")) {
                int i3 = this.trackIndex;
                this.trackIndex = i3 + 1;
                this.tracks.add(new CompositionTrack(this, i3, 2, new CMTimeRange(CMTime.CMTimeZero, getAudioDuration())));
            }
        }
        Logger.m144643e(Asset.TAG, " Composition createTracks finish, has track count: " + this.tracks);
    }

    public CMTime getAudioDuration() {
        CMTime cMTime = CMTime.CMTimeZero;
        for (CTrack ctrack : this.tracks) {
            if (ctrack.getMediaType() == 2) {
                CMTime duration = ctrack.getDuration();
                if (duration.bigThan(cMTime)) {
                    cMTime = duration;
                }
            }
        }
        return cMTime;
    }

    public List<CTrack> getTracks() {
        Objects.toString(this.tracks);
        return this.tracks;
    }

    public CMTime getVideoDuration() {
        CMTime cMTime = CMTime.CMTimeZero;
        for (CTrack ctrack : this.tracks) {
            if (ctrack.getMediaType() == 1) {
                CMTime duration = ctrack.getDuration();
                if (duration.bigThan(cMTime)) {
                    cMTime = duration;
                }
            }
        }
        return cMTime;
    }

    public void loadValuesAsynchronouslyForKeys(List<String> list, AsynchronousKeyValueLoading.loadCallback loadcallback) {
    }

    public int statusOfValueForKey(String str) {
        return 1;
    }

    public String toString() {
        return "Composition{\ntracks=" + this.tracks + "\ntrackCount=" + this.trackCount + '}';
    }

    public Composition(URL url) {
        super(url);
    }

    public Composition(String str) {
        super(str);
    }
}
