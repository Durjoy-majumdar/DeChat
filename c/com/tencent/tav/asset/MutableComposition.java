package com.tencent.tav.asset;

import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class MutableComposition extends Composition<MutableCompositionTrack> {
    public MutableComposition() {
        setNaturalSize(new CGSize(0.0f, 0.0f));
    }

    private int getCorrectTrackID(int i) {
        boolean z;
        Iterator<CTrack> it = this.tracks.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((MutableCompositionTrack) it.next()).getTrackID() == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z && i > 0) {
            return i;
        }
        if (i == -1) {
            int i2 = this.trackIndex;
            this.trackIndex = i2 + 1;
            return i2;
        }
        int i3 = this.trackIndex;
        if (i3 >= i) {
            this.trackIndex = i3 + 1;
            return i3;
        }
        this.trackIndex = i;
        return i;
    }

    public MutableCompositionTrack addMutableTrackWithMediaType(int i, int i2) {
        MutableCompositionTrack mutableCompositionTrack = new MutableCompositionTrack(i, getCorrectTrackID(i2));
        mutableCompositionTrack.setNaturalSize(getNaturalSize());
        this.tracks.add(mutableCompositionTrack);
        this.trackCount++;
        return mutableCompositionTrack;
    }

    public CGSize getNaturalSize() {
        if (this.naturalSize.equals(CGSize.CGSizeZero)) {
            for (CTrack ctrack : this.tracks) {
                if (ctrack.enabled) {
                    return ctrack.getNaturalSize();
                }
            }
        }
        return this.naturalSize;
    }

    public int getPreferRotation() {
        if (this.preferRotation == 0) {
            for (CTrack ctrack : this.tracks) {
                if (ctrack.enabled) {
                    return ctrack.getPreferredRotation();
                }
            }
        }
        return this.preferRotation;
    }

    public List<MutableCompositionTrack> getTracks() {
        Objects.toString(this.tracks);
        return this.tracks;
    }

    public void insertEmptyTimeRange(CMTimeRange cMTimeRange) {
        for (CTrack insertEmptyTimeRange : this.tracks) {
            insertEmptyTimeRange.insertEmptyTimeRange(cMTimeRange);
        }
    }

    public boolean insertTimeRange(CMTimeRange cMTimeRange, Asset asset, CMTime cMTime) {
        if (cMTimeRange.getDuration().value <= 0 || asset == null || asset.getTrackCount() == 0) {
            return false;
        }
        List tracks = asset.getTracks();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < tracks.size()) {
                AssetTrack assetTrack = (AssetTrack) tracks.get(i);
                int i2 = i;
                while (true) {
                    if (i2 >= this.tracks.size()) {
                        z = false;
                        break;
                    }
                    MutableCompositionTrack mutableCompositionTrack = (MutableCompositionTrack) this.tracks.get(i2);
                    if (mutableCompositionTrack.getMediaType() != assetTrack.getMediaType()) {
                        i2++;
                    } else if (!mutableCompositionTrack.insertTimeRange(cMTimeRange, assetTrack, cMTime)) {
                        return false;
                    } else {
                        arrayList.add(Integer.valueOf(mutableCompositionTrack.getTrackID()));
                    }
                }
                if (!z) {
                    int mediaType = assetTrack.getMediaType();
                    int i3 = this.trackIndex;
                    this.trackIndex = i3 + 1;
                    MutableCompositionTrack addMutableTrackWithMediaType = addMutableTrackWithMediaType(mediaType, i3);
                    if (!addMutableTrackWithMediaType.insertTimeRange(cMTimeRange, assetTrack, cMTime)) {
                        return false;
                    }
                    arrayList.add(Integer.valueOf(addMutableTrackWithMediaType.getTrackID()));
                }
                i++;
            } else {
                for (CTrack ctrack : this.tracks) {
                    if (!arrayList.contains(Integer.valueOf(ctrack.getTrackID()))) {
                        ctrack.insertEmptyTimeRange(cMTimeRange);
                    }
                }
                return true;
            }
        }
    }

    public MutableCompositionTrack mutableTrackCompatibleWithTrack(AssetTrack assetTrack) {
        if (assetTrack == null || assetTrack.getAsset() == null) {
            return null;
        }
        MutableCompositionTrack mutableCompositionTrack = new MutableCompositionTrack(assetTrack.getMediaType(), getCorrectTrackID(-1));
        mutableCompositionTrack.insertTimeRange(assetTrack.getTimeRange(), assetTrack, CMTime.CMTimeZero);
        mutableCompositionTrack.setPreferredTransform(assetTrack.getPreferredTransform());
        mutableCompositionTrack.setPreferredRotation(assetTrack.getPreferredRotation());
        mutableCompositionTrack.setPreferredVolume(assetTrack.getPreferredVolume());
        return mutableCompositionTrack;
    }

    public void removeTimeRange(CMTimeRange cMTimeRange) {
        for (CTrack removeTimeRange : this.tracks) {
            removeTimeRange.removeTimeRange(cMTimeRange);
        }
    }

    public void removeTrack(CompositionTrack compositionTrack) {
        int i = 0;
        while (i < this.tracks.size()) {
            if (((MutableCompositionTrack) this.tracks.get(i)) == compositionTrack) {
                this.tracks.remove(i);
                i--;
            }
            i++;
        }
    }

    public void scaleTimeRange(CMTimeRange cMTimeRange, CMTime cMTime) {
        for (CTrack scaleTimeRange : this.tracks) {
            scaleTimeRange.scaleTimeRange(cMTimeRange, cMTime);
        }
    }

    public void setNaturalSize(CGSize cGSize) {
        this.naturalSize = cGSize;
        for (CTrack ctrack : this.tracks) {
            if (ctrack != null && ctrack.getMediaType() == 1 && ctrack.getNaturalSize() == null) {
                ctrack.setNaturalSize(cGSize);
            }
        }
    }

    public void setPreferRotation(int i) {
        this.preferRotation = i;
    }

    public void setPreferredVolume(float f) {
        this.preferredVolume = f;
    }

    public List<MutableCompositionTrack> tracksWithMediaType(int i) {
        ArrayList arrayList = new ArrayList();
        for (CTrack ctrack : this.tracks) {
            if (ctrack != null && ctrack.getMediaType() == i) {
                arrayList.add(ctrack);
            }
        }
        return arrayList;
    }

    public MutableCompositionTrack trackWithTrackID(int i) {
        for (CTrack ctrack : this.tracks) {
            if (ctrack != null && ctrack.getTrackID() == i) {
                return ctrack;
            }
        }
        return null;
    }
}
