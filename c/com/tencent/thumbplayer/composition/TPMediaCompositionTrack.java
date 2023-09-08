package com.tencent.thumbplayer.composition;

import com.tencent.thumbplayer.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TPMediaCompositionTrack extends TPMediaCommonAsset implements ITPMediaTrack, Serializable {
    private static final String TAG = "TPMediaCompositionTrack";
    private List<ITPMediaTrackClip> mTrackClips;
    private int mTrackId;
    private int mTrackType;

    public TPMediaCompositionTrack(int i) {
        this.mTrackId = -1;
        this.mTrackType = i;
        this.mTrackClips = new ArrayList();
    }

    private synchronized void checkClipValid(ITPMediaTrackClip iTPMediaTrackClip) {
        if (iTPMediaTrackClip != null) {
            try {
                if (iTPMediaTrackClip.getMediaType() != this.mTrackType) {
                    throw new IllegalArgumentException("add track clip failed, media type is not same");
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new IllegalArgumentException("add track clip , clip can not be null");
        }
    }

    public synchronized int addTrackClip(ITPMediaTrackClip iTPMediaTrackClip) {
        checkClipValid(iTPMediaTrackClip);
        if (this.mTrackClips.contains(iTPMediaTrackClip)) {
            TPLogUtil.m21897i(TAG, "add track clip failed, clip already exists : " + iTPMediaTrackClip.getClipId());
            return iTPMediaTrackClip.getClipId();
        }
        this.mTrackClips.add(iTPMediaTrackClip);
        return iTPMediaTrackClip.getClipId();
    }

    public synchronized List<ITPMediaTrackClip> getAllTrackClips() {
        return this.mTrackClips;
    }

    public synchronized int getMediaType() {
        return this.mTrackType;
    }

    public synchronized long getTimelineDurationMs() {
        long j;
        j = 0;
        for (ITPMediaTrackClip originalDurationMs : this.mTrackClips) {
            j += originalDurationMs.getOriginalDurationMs();
        }
        return j;
    }

    public synchronized ITPMediaTrackClip getTrackClip(int i) {
        for (ITPMediaTrackClip next : this.mTrackClips) {
            if (next.getClipId() == i) {
                return next;
            }
        }
        return null;
    }

    public synchronized int getTrackId() {
        return this.mTrackId;
    }

    public synchronized String getUrl() {
        try {
        } catch (IOException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return null;
        }
        return TPMediaCompositionXmlGenerator.buildXmlPathFromTrackInfo(this.mTrackClips, this.mTrackType);
    }

    public synchronized int insertTrackClip(ITPMediaTrackClip iTPMediaTrackClip, int i) {
        checkClipValid(iTPMediaTrackClip);
        if (this.mTrackClips.contains(iTPMediaTrackClip)) {
            TPLogUtil.m21897i(TAG, "add track clip failed, clip already exists : " + iTPMediaTrackClip.getClipId());
            return iTPMediaTrackClip.getClipId();
        }
        if (i == -1) {
            this.mTrackClips.add(0, iTPMediaTrackClip);
            return iTPMediaTrackClip.getClipId();
        }
        int size = this.mTrackClips.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mTrackClips.get(i2).getClipId() == i) {
                this.mTrackClips.add(i2 + 1, iTPMediaTrackClip);
                return iTPMediaTrackClip.getClipId();
            }
        }
        this.mTrackClips.add(iTPMediaTrackClip);
        TPLogUtil.m21897i(TAG, "insert track clip into the end, coz after clip not found :" + i);
        return iTPMediaTrackClip.getClipId();
    }

    public synchronized void removeAllTrackClips() {
        this.mTrackClips.clear();
    }

    public synchronized boolean removeTrackClip(ITPMediaTrackClip iTPMediaTrackClip) {
        if (iTPMediaTrackClip != null) {
        } else {
            throw new IllegalArgumentException("remove track clip , clip can not be null");
        }
        return this.mTrackClips.remove(iTPMediaTrackClip);
    }

    public void setTrackId(int i) {
        this.mTrackId = i;
    }

    public synchronized boolean swapTrackClip(int i, int i2) {
        if (i >= 0) {
            if (i < this.mTrackClips.size()) {
                if (i2 >= 0) {
                    if (i2 < this.mTrackClips.size()) {
                        Collections.swap(this.mTrackClips, i, i2);
                        return true;
                    }
                }
                TPLogUtil.m21899w(TAG, "swap clip failed, to pos invalid , to pos :" + i2);
                return false;
            }
        }
        TPLogUtil.m21899w(TAG, "swap clip failed, from pos invalid , from pos : " + i);
        return false;
    }

    public TPMediaCompositionTrack(int i, int i2) {
        this.mTrackId = i;
        this.mTrackType = i2;
        this.mTrackClips = new ArrayList();
    }
}
