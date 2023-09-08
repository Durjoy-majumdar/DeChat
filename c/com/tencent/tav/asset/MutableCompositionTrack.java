package com.tencent.tav.asset;

import android.graphics.Matrix;
import android.text.TextUtils;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.tav.decoder.ImageDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MutableCompositionTrack extends CompositionTrack {
    private String extendedLanguageTag;
    private String languageCode;

    public MutableCompositionTrack(int i, int i2) {
        this.mediaType = i;
        this.trackID = i2;
    }

    private int findSegmentIndexAt(CMTime cMTime, boolean z) {
        boolean z2;
        CMTime cMTime2 = CMTime.CMTimeZero;
        Iterator<CompositionTrackSegment> it = this.segments.iterator();
        boolean z3 = false;
        int i = 0;
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                break;
            }
            CompositionTrackSegment next = it.next();
            if (next.timeRange.containsTime(cMTime)) {
                z3 = true;
                break;
            }
            cMTime2 = next.timeRange.getEnd();
            i++;
        }
        if (z3 || !cMTime.equalsTo(cMTime2) || i <= 0 || !z) {
            z2 = z3;
        } else {
            i--;
        }
        if (z2) {
            return i;
        }
        return -1;
    }

    private CMTime getSegmentStartCMTime(int i) {
        CMTime cMTime = CMTime.CMTimeZero;
        int i2 = 0;
        while (i2 < i && i2 < this.segments.size()) {
            cMTime = cMTime.add(this.segments.get(i2).getScaleDuration());
            i2++;
        }
        return cMTime;
    }

    private long getSegmentStartTime(int i) {
        CMTime cMTime = CMTime.CMTimeZero;
        int i2 = 0;
        while (i2 < i && i2 < this.segments.size()) {
            cMTime = cMTime.add(this.segments.get(i2).getScaleDuration());
            i2++;
        }
        return cMTime.getTimeUs();
    }

    private void insertSegment(CompositionTrackSegment compositionTrackSegment, int i) {
        if (i >= 0) {
            this.segments.add(i, compositionTrackSegment);
        } else {
            this.segments.add(compositionTrackSegment);
        }
        updateTimeRange();
    }

    private CompositionTrackSegment[] split(CompositionTrackSegment compositionTrackSegment, CMTime cMTime) {
        CompositionTrackSegment compositionTrackSegment2 = compositionTrackSegment;
        CMTime cMTime2 = cMTime;
        if (compositionTrackSegment2 == null || compositionTrackSegment2.timeRange.getDuration().smallThan(cMTime2)) {
            return null;
        }
        float timeUs = (((float) cMTime.getTimeUs()) * 1.0f) / ((float) compositionTrackSegment2.timeRange.getDurationUs());
        CMTimeRange[] split = compositionTrackSegment.getTimeMapping().getTarget().split(timeUs);
        CMTimeRange[] split2 = compositionTrackSegment.getTimeMapping().getSource().split(timeUs);
        if (split == null || split2 == null) {
            return null;
        }
        CompositionTrackSegment compositionTrackSegment3 = new CompositionTrackSegment(compositionTrackSegment.getSourcePath(), compositionTrackSegment.getSourceTrackID(), split2[0], split[0], compositionTrackSegment.getSourceType());
        CompositionTrackSegment compositionTrackSegment4 = new CompositionTrackSegment(compositionTrackSegment.getSourcePath(), compositionTrackSegment.getSourceTrackID(), split2[1], split[1], compositionTrackSegment.getSourceType());
        compositionTrackSegment3.scaleDuration = cMTime2;
        compositionTrackSegment4.scaleDuration = compositionTrackSegment2.scaleDuration.sub(cMTime2);
        return new CompositionTrackSegment[]{compositionTrackSegment3, compositionTrackSegment4};
    }

    private void updateSegmentStartTimeAfterInserted(CMTime cMTime, CMTimeRange cMTimeRange) {
        int findSegmentIndexAt = findSegmentIndexAt(cMTime, false);
        if (findSegmentIndexAt >= 0 && findSegmentIndexAt < this.segments.size()) {
            while (true) {
                findSegmentIndexAt++;
                if (findSegmentIndexAt < this.segments.size()) {
                    CompositionTrackSegment compositionTrackSegment = this.segments.get(findSegmentIndexAt);
                    CMTimeRange target = compositionTrackSegment.getTimeMapping().getTarget();
                    compositionTrackSegment.updateTargetTimeRange(new CMTimeRange(target.getStart().add(cMTimeRange.getDuration()), target.getDuration().clone()));
                } else {
                    return;
                }
            }
        }
    }

    private void updateSegmentsStartTimeAfterRemoved(CMTimeRange cMTimeRange) {
        int findSegmentIndexAt = findSegmentIndexAt(cMTimeRange.getStart(), false);
        if (findSegmentIndexAt >= 0 && findSegmentIndexAt < this.segments.size()) {
            while (findSegmentIndexAt < this.segments.size()) {
                CompositionTrackSegment compositionTrackSegment = this.segments.get(findSegmentIndexAt);
                CMTimeRange target = compositionTrackSegment.getTimeMapping().getTarget();
                CMTime start = target.getStart();
                CMTime duration = cMTimeRange.getDuration();
                CMTime cMTime = CMTime.CMTimeOne;
                compositionTrackSegment.updateTargetTimeRange(new CMTimeRange(start.sub(duration.add(cMTime).add(cMTime)), target.getDuration().clone()));
                findSegmentIndexAt++;
            }
        }
    }

    private void updateTimeRange() {
        List<CompositionTrackSegment> list = this.segments;
        if (list == null || list.size() <= 0) {
            CMTime cMTime = CMTime.CMTimeZero;
            this.timeRange = new CMTimeRange(cMTime, cMTime);
            return;
        }
        this.timeRange = new CMTimeRange(this.segments.get(0).timeRange.getStart(), getDuration());
    }

    public void clipRangeAndRemoveOutRange(CMTimeRange cMTimeRange) {
        List<CompositionTrackSegment> list;
        if (cMTimeRange != null && cMTimeRange.getDuration().getTimeUs() > 0 && (list = this.segments) != null && list.size() != 0) {
            CMTime start = cMTimeRange.getStart();
            CMTime end = cMTimeRange.getEnd();
            int findSegmentIndexAt = findSegmentIndexAt(start, false);
            if (findSegmentIndexAt != -1) {
                int findSegmentIndexAt2 = findSegmentIndexAt(end, false);
                if (findSegmentIndexAt2 == -1) {
                    findSegmentIndexAt2 = this.segments.size() - 1;
                } else if (getSegmentStartTime(findSegmentIndexAt2) == end.getTimeUs()) {
                    findSegmentIndexAt2--;
                }
                long segmentStartTime = getSegmentStartTime(findSegmentIndexAt);
                long segmentStartTime2 = getSegmentStartTime(findSegmentIndexAt2);
                CompositionTrackSegment compositionTrackSegment = this.segments.get(findSegmentIndexAt);
                CompositionTrackSegment compositionTrackSegment2 = this.segments.get(findSegmentIndexAt2);
                long timeUs = cMTimeRange.getEnd().getTimeUs() - segmentStartTime2;
                compositionTrackSegment2.timeRange = new CMTimeRange(compositionTrackSegment2.timeRange.getStart(), TimeUtil.us2CMTime((long) (((float) timeUs) * ((float) (compositionTrackSegment2.scaleDuration.getTimeUs() / compositionTrackSegment2.timeRange.getDuration().getTimeUs())))));
                compositionTrackSegment2.scaleDuration = TimeUtil.us2CMTime(timeUs);
                long timeUs2 = cMTimeRange.getStart().getTimeUs() - segmentStartTime;
                long timeUs3 = (long) (((float) timeUs2) * ((float) (compositionTrackSegment.scaleDuration.getTimeUs() / compositionTrackSegment.timeRange.getDuration().getTimeUs())));
                compositionTrackSegment.timeRange = new CMTimeRange(TimeUtil.us2CMTime(compositionTrackSegment.timeRange.getStart().getTimeUs() + timeUs3), TimeUtil.us2CMTime(compositionTrackSegment.timeRange.getDuration().getTimeUs() - timeUs3));
                compositionTrackSegment.scaleDuration = TimeUtil.us2CMTime(compositionTrackSegment.scaleDuration.getTimeUs() - timeUs2);
                for (int size = this.segments.size() - 1; size >= 0; size--) {
                    if (size > findSegmentIndexAt2 || size < findSegmentIndexAt) {
                        this.segments.remove(size);
                    }
                }
            }
        }
    }

    public CMTime getDuration() {
        CMTime cMTime = CMTime.CMTimeZero;
        for (int i = 0; i < this.segments.size(); i++) {
            cMTime = cMTime.add(this.segments.get(i).getScaleDuration());
        }
        return cMTime;
    }

    public String getExtendedLanguageTag() {
        return this.extendedLanguageTag;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public void insertCompositionTrackSegment(CompositionTrackSegment compositionTrackSegment) {
        CGSize cGSize = this.naturalSize;
        if ((cGSize == null || cGSize.equals(CGSize.CGSizeZero)) && compositionTrackSegment.getSourceType() == 3 && !TextUtils.isEmpty(compositionTrackSegment.getSourcePath())) {
            this.naturalSize = ImageDecoder.getDefaultOutputImageSize(compositionTrackSegment.getSourcePath());
        }
        CMTimeRange target = compositionTrackSegment.timeMapping.getTarget();
        CMTime start = target.getStart();
        if (this.segments.size() == 0) {
            if (target.getStart().value > 0) {
                this.segments.add(new CompositionTrackSegment(new CMTimeRange(CMTime.CMTimeZero, target.getStart())));
            }
            insertSegment(compositionTrackSegment, -1);
            return;
        }
        int findSegmentIndexAt = findSegmentIndexAt(start, false);
        if (findSegmentIndexAt != -1) {
            CMTime segmentStartCMTime = getSegmentStartCMTime(findSegmentIndexAt);
            if (start.equalsTo(segmentStartCMTime)) {
                insertSegment(compositionTrackSegment, findSegmentIndexAt);
            } else {
                CompositionTrackSegment[] split = split(this.segments.remove(findSegmentIndexAt), start.sub(segmentStartCMTime));
                if (split[1].scaleDuration.getTimeUs() > 0) {
                    this.segments.add(findSegmentIndexAt, split[1]);
                }
                insertSegment(compositionTrackSegment, findSegmentIndexAt);
                if (split[0].scaleDuration.getTimeUs() > 0) {
                    this.segments.add(findSegmentIndexAt, split[0]);
                }
            }
        } else {
            CMTime segmentStartCMTime2 = getSegmentStartCMTime(this.segments.size());
            if (start.bigThan(segmentStartCMTime2)) {
                this.segments.add(new CompositionTrackSegment(new CMTimeRange(segmentStartCMTime2, start.sub(segmentStartCMTime2))));
            }
            insertSegment(compositionTrackSegment, -1);
        }
        CMTime cMTime = CMTime.CMTimeZero;
        for (CompositionTrackSegment next : this.segments) {
            next.updateTargetTimeRange(new CMTimeRange(cMTime, next.scaleDuration));
            cMTime = cMTime.add(next.scaleDuration);
        }
        updateTimeRange();
    }

    public void insertEmptyTimeRange(CMTimeRange cMTimeRange) {
        insertTimeRange(cMTimeRange, (AssetTrack) null, cMTimeRange.getStart());
    }

    public boolean insertTimeRange(CMTimeRange cMTimeRange, AssetTrack assetTrack, CMTime cMTime) {
        if (this.timeRange == null) {
            CMTime cMTime2 = CMTime.CMTimeZero;
            this.timeRange = new CMTimeRange(cMTime2, cMTime2);
        }
        CGSize cGSize = this.naturalSize;
        if ((cGSize == null || cGSize.equals(CGSize.CGSizeZero)) && assetTrack != null) {
            this.naturalSize = assetTrack.naturalSize;
        }
        if (this.preferredRotation == 0 && assetTrack != null) {
            this.preferredRotation = assetTrack.preferredRotation;
        }
        if (cMTime == CMTime.CMTimeInvalid || cMTime.getValue() < 0) {
            insertTimeRange(cMTimeRange, new CMTimeRange(this.timeRange.getDuration(), cMTimeRange.getDuration()), assetTrack, -1);
            return true;
        } else if (cMTimeRange.getDuration().value <= 0) {
            return false;
        } else {
            CMTimeRange cMTimeRange2 = new CMTimeRange(cMTime, cMTimeRange.getDuration());
            if (this.segments.size() == 0) {
                if (cMTime.value > 0) {
                    this.segments.add(new CompositionTrackSegment(new CMTimeRange(CMTime.CMTimeZero, cMTime)));
                }
                insertTimeRange(cMTimeRange, cMTimeRange2, assetTrack, -1);
                return true;
            }
            int findSegmentIndexAt = findSegmentIndexAt(cMTime, false);
            if (findSegmentIndexAt != -1) {
                CMTime segmentStartCMTime = getSegmentStartCMTime(findSegmentIndexAt);
                if (cMTime.equalsTo(segmentStartCMTime)) {
                    insertTimeRange(cMTimeRange, cMTimeRange2, assetTrack, findSegmentIndexAt);
                } else {
                    CompositionTrackSegment[] split = split(this.segments.remove(findSegmentIndexAt), cMTime.sub(segmentStartCMTime));
                    if (split[1].scaleDuration.getTimeUs() > 0) {
                        this.segments.add(findSegmentIndexAt, split[1]);
                    }
                    insertTimeRange(cMTimeRange, cMTimeRange, assetTrack, findSegmentIndexAt);
                    if (split[0].scaleDuration.getTimeUs() > 0) {
                        this.segments.add(findSegmentIndexAt, split[0]);
                    }
                }
            } else {
                CMTime segmentStartCMTime2 = getSegmentStartCMTime(this.segments.size());
                if (cMTime.bigThan(segmentStartCMTime2)) {
                    this.segments.add(new CompositionTrackSegment(new CMTimeRange(segmentStartCMTime2, cMTime.sub(segmentStartCMTime2))));
                }
                insertTimeRange(cMTimeRange, cMTimeRange2, assetTrack, -1);
            }
            updateTimeRange();
            return true;
        }
    }

    public void removeTimeRange(CMTimeRange cMTimeRange) {
        if (cMTimeRange != null && cMTimeRange.isLegal()) {
            CMTime start = cMTimeRange.getStart();
            CMTime cMTime = CMTime.CMTimeOne;
            insertEmptyTimeRange(new CMTimeRange(start, cMTime));
            insertEmptyTimeRange(new CMTimeRange(cMTimeRange.getEnd().add(cMTime), cMTime));
            int findSegmentIndexAt = findSegmentIndexAt(cMTimeRange.getStart(), false);
            int findSegmentIndexAt2 = findSegmentIndexAt(cMTimeRange.getEnd().add(cMTime), false);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.segments.size(); i++) {
                if (i < findSegmentIndexAt || i > findSegmentIndexAt2) {
                    arrayList.add(this.segments.get(i));
                }
            }
            this.segments = arrayList;
            updateTimeRange();
            updateSegmentsStartTimeAfterRemoved(cMTimeRange);
        }
    }

    public void scaleTimeRange(CMTimeRange cMTimeRange, CMTime cMTime) {
        List<CompositionTrackSegment> list;
        int findSegmentIndexAt;
        CMTime cMTime2;
        CMTime start = cMTimeRange.getStart();
        CMTime end = cMTimeRange.getEnd();
        if (cMTimeRange.getDuration().getTimeUs() > 0 && (list = this.segments) != null && list.size() != 0 && (findSegmentIndexAt = findSegmentIndexAt(cMTimeRange.getStart(), false)) != -1) {
            int findSegmentIndexAt2 = findSegmentIndexAt(cMTimeRange.getEnd(), false);
            if (findSegmentIndexAt2 == -1) {
                findSegmentIndexAt2 = this.segments.size() - 1;
            } else if (getSegmentStartCMTime(findSegmentIndexAt2).equalsTo(cMTimeRange.getEnd())) {
                findSegmentIndexAt2--;
            }
            if (findSegmentIndexAt == findSegmentIndexAt2) {
                CMTime segmentStartCMTime = getSegmentStartCMTime(findSegmentIndexAt);
                CompositionTrackSegment remove = this.segments.remove(findSegmentIndexAt);
                if (end.smallThan(segmentStartCMTime.add(remove.scaleDuration))) {
                    CompositionTrackSegment[] split = split(remove, start.sub(segmentStartCMTime));
                    remove = split[0];
                    if (split[1].scaleDuration.getTimeUs() > 0) {
                        this.segments.add(findSegmentIndexAt, split[1]);
                    }
                }
                if (start.bigThan(segmentStartCMTime)) {
                    CompositionTrackSegment[] split2 = split(remove, start.sub(segmentStartCMTime));
                    split2[1].scaleDuration = cMTime;
                    if (cMTime.getTimeUs() > 0) {
                        this.segments.add(findSegmentIndexAt, split2[1]);
                    }
                    if (split2[0].scaleDuration.getTimeUs() > 0) {
                        this.segments.add(findSegmentIndexAt, split2[0]);
                    }
                } else {
                    remove.scaleDuration = cMTime;
                    this.segments.add(findSegmentIndexAt, remove);
                }
            } else {
                CMTime segmentStartCMTime2 = getSegmentStartCMTime(findSegmentIndexAt);
                CMTime segmentStartCMTime3 = getSegmentStartCMTime(findSegmentIndexAt2);
                if (start.bigThan(segmentStartCMTime2)) {
                    CompositionTrackSegment[] split3 = split(this.segments.remove(findSegmentIndexAt), start.sub(segmentStartCMTime2));
                    CompositionTrackSegment compositionTrackSegment = split3[1];
                    compositionTrackSegment.scaleDuration = cMTime.multi(compositionTrackSegment.scaleDuration).divide(cMTimeRange.getDuration());
                    cMTime2 = cMTime.sub(split3[1].scaleDuration);
                    if (split3[1].scaleDuration.getTimeUs() > 0) {
                        this.segments.add(findSegmentIndexAt, split3[1]);
                    }
                    if (split3[0].scaleDuration.getTimeUs() > 0) {
                        this.segments.add(findSegmentIndexAt, split3[0]);
                    }
                } else {
                    CompositionTrackSegment compositionTrackSegment2 = this.segments.get(findSegmentIndexAt);
                    CMTime divide = cMTime.multi(compositionTrackSegment2.scaleDuration).divide(cMTimeRange.getDuration());
                    compositionTrackSegment2.scaleDuration = divide;
                    cMTime2 = cMTime.sub(divide);
                }
                for (int i = findSegmentIndexAt + 1; i < findSegmentIndexAt2; i++) {
                    CompositionTrackSegment compositionTrackSegment3 = this.segments.get(i);
                    CMTime divide2 = cMTime2.multi(compositionTrackSegment3.scaleDuration).divide(cMTimeRange.getDuration());
                    compositionTrackSegment3.scaleDuration = divide2;
                    cMTime2 = cMTime2.sub(divide2);
                }
                CompositionTrackSegment compositionTrackSegment4 = this.segments.get(findSegmentIndexAt2);
                if (end.smallThan(segmentStartCMTime3.add(compositionTrackSegment4.scaleDuration))) {
                    CompositionTrackSegment[] split4 = split(this.segments.remove(findSegmentIndexAt2), end.sub(segmentStartCMTime3));
                    split4[0].scaleDuration = cMTime2;
                    if (split4[1].scaleDuration.getTimeUs() > 0) {
                        this.segments.add(findSegmentIndexAt2, split4[1]);
                    }
                    if (split4[0].scaleDuration.getTimeUs() > 0) {
                        this.segments.add(findSegmentIndexAt2, split4[0]);
                    }
                } else {
                    compositionTrackSegment4.scaleDuration = cMTime2;
                }
            }
            CMTime cMTime3 = CMTime.CMTimeZero;
            for (CompositionTrackSegment next : this.segments) {
                next.updateTargetTimeRange(new CMTimeRange(cMTime3, next.scaleDuration));
                cMTime3 = cMTime3.add(next.scaleDuration);
            }
            updateTimeRange();
        }
    }

    public void setExtendedLanguageTag(String str) {
        this.extendedLanguageTag = str;
    }

    public void setLanguageCode(String str) {
        this.languageCode = str;
    }

    public void setNaturalSize(CGSize cGSize) {
        this.naturalSize = cGSize;
    }

    public void setNaturalTimeScale(int i) {
        this.naturalTimeScale = i;
    }

    public void setPreferredTransform(Matrix matrix) {
        this.preferredTransform = matrix;
    }

    public void setPreferredVolume(float f) {
        this.preferredVolume = f;
    }

    public void setSegments(List<CompositionTrackSegment> list) {
        this.segments = list;
    }

    public boolean validateTrackSegments(List<CompositionTrackSegment> list) {
        return false;
    }

    private void insertTimeRange(CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2, AssetTrack assetTrack, int i) {
        CompositionTrackSegment compositionTrackSegment;
        if (assetTrack instanceof CompositionTrack) {
            insertTimeRange(cMTimeRange, cMTimeRange2, (CompositionTrack) assetTrack, i);
            return;
        }
        if (assetTrack != null) {
            compositionTrackSegment = new CompositionTrackSegment(assetTrack.getSourcePath(), assetTrack.getTrackID(), cMTimeRange, cMTimeRange2, assetTrack.getMediaType());
        } else {
            compositionTrackSegment = new CompositionTrackSegment(cMTimeRange2);
        }
        if (i >= 0) {
            this.segments.add(i, compositionTrackSegment);
        } else {
            this.segments.add(compositionTrackSegment);
        }
        updateTimeRange();
    }

    private void insertTimeRange(CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2, CompositionTrack compositionTrack, int i) {
        CMTime cMTime;
        CMTime start = cMTimeRange.getStart();
        CMTime end = cMTimeRange.getEnd();
        CMTime start2 = cMTimeRange2.getStart();
        float durationUs = (((float) cMTimeRange2.getDurationUs()) * 1.0f) / ((float) cMTimeRange.getDurationUs());
        CMTime cMTime2 = start2;
        int i2 = i;
        for (CompositionTrackSegment next : compositionTrack.getSegments()) {
            CMTimeRange target = next.getTimeMapping().getTarget();
            CMTime start3 = target.getStart();
            CMTime end2 = target.getEnd();
            CMTime clone = start3.clone();
            CMTime clone2 = end2.clone();
            if (start3.smallThan(start)) {
                clone = cMTimeRange.getStart();
            } else if (start3.bigThan(end)) {
                clone = CMTime.CMTimeInvalid;
            }
            if (end2.smallThan(start)) {
                clone2 = CMTime.CMTimeInvalid;
            } else if (end2.bigThan(end)) {
                clone2 = end;
            }
            if (!(clone.equalsTo(clone2) || clone == (cMTime = CMTime.CMTimeInvalid) || clone2 == cMTime)) {
                CMTime sub = clone.sub(start3);
                CMTime sub2 = clone2.sub(clone);
                CMTime multi = sub2.multi(durationUs);
                CMTimeRange cMTimeRange3 = new CMTimeRange(next.timeMapping.getSource().getStart().add(sub.divide((((float) next.timeMapping.getTarget().getDurationUs()) * 1.0f) / ((float) next.timeMapping.getSource().getDurationUs()))), sub2);
                CMTimeRange cMTimeRange4 = new CMTimeRange(cMTime2, multi);
                cMTime2 = cMTime2.add(multi);
                CompositionTrackSegment compositionTrackSegment = new CompositionTrackSegment(next.getSourcePath(), this.trackID, cMTimeRange3, cMTimeRange4, next.getSourceType());
                if (i2 >= 0) {
                    this.segments.add(i2, compositionTrackSegment);
                    i2++;
                } else {
                    this.segments.add(compositionTrackSegment);
                }
            }
        }
        updateTimeRange();
    }
}
