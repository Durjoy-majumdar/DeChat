package com.tencent.tavkit.utils;

import com.tencent.tav.asset.MutableCompositionTrack;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tavkit.composition.audio.TAVAudioTransition;
import com.tencent.tavkit.composition.model.TAVCompositionTimeRange;
import com.tencent.tavkit.composition.model.TAVTransitionableAudio;
import com.tencent.tavkit.composition.model.TAVTransitionableVideo;
import com.tencent.tavkit.composition.resource.TAVEmptyResource;
import com.tencent.tavkit.composition.resource.TrackInfo;
import com.tencent.tavkit.composition.video.TAVVideoTransition;
import java.util.List;

public class CompositionUtils {
    private static final String TAG = "CompositionUtils";

    public interface TransitionTimeCalculator {
        CMTime transition(int i);
    }

    private static void checkScaleTimeRange(MutableCompositionTrack mutableCompositionTrack, CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
        if (!CMTime.CMTimeInvalid.equalsTo(cMTimeRange.getDuration()) && !cMTimeRange2.getDuration().equalsTo(cMTimeRange.getDuration())) {
            mutableCompositionTrack.scaleTimeRange(new CMTimeRange(cMTimeRange.getStart(), cMTimeRange2.getDuration()), cMTimeRange.getDuration());
        }
    }

    public static TAVEmptyResource createEmptyResource(CMTime cMTime) {
        TAVEmptyResource tAVEmptyResource = new TAVEmptyResource(cMTime);
        tAVEmptyResource.setDuration(cMTime);
        tAVEmptyResource.setScaledDuration(cMTime);
        return tAVEmptyResource;
    }

    public static void insertTimeRangeToTrack(TrackInfo trackInfo, MutableCompositionTrack mutableCompositionTrack, CMTimeRange cMTimeRange) {
        try {
            CMTimeRange selectedTimeRange = trackInfo.getSelectedTimeRange();
            if (trackInfo.getTrack() != null) {
                mutableCompositionTrack.insertTimeRange(selectedTimeRange, trackInfo.getTrack(), cMTimeRange.getStart());
                checkScaleTimeRange(mutableCompositionTrack, cMTimeRange, selectedTimeRange);
            } else if (trackInfo.getCompositionTrackSegment(cMTimeRange) != null) {
                mutableCompositionTrack.insertCompositionTrackSegment(trackInfo.getCompositionTrackSegment(cMTimeRange));
            } else {
                Logger.m144643e(TAG, "insertTimeRangeToTrack: TrackInfo track and segment are null !!!");
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.tav.asset.MutableCompositionTrack mutableTrackCompatibleWithTimeRange(com.tencent.tav.asset.MutableComposition r2, com.tencent.tav.coremedia.CMTimeRange r3, int r4) {
        /*
            java.util.List r2 = r2.tracksWithMediaType(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0008:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x002c
            java.lang.Object r4 = r2.next()
            com.tencent.tav.asset.MutableCompositionTrack r4 = (com.tencent.tav.asset.MutableCompositionTrack) r4
            com.tencent.tav.coremedia.CMTimeRange r0 = r4.getTimeRange()
            com.tencent.tav.coremedia.CMTimeRange r0 = com.tencent.tavkit.utils.TAVTimeUtil.getIntersection(r0, r3)
            if (r0 == 0) goto L_0x002b
            com.tencent.tav.coremedia.CMTime r0 = r0.getDuration()
            float r0 = r0.getTimeSeconds()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0008
        L_0x002b:
            return r4
        L_0x002c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tavkit.utils.CompositionUtils.mutableTrackCompatibleWithTimeRange(com.tencent.tav.asset.MutableComposition, com.tencent.tav.coremedia.CMTimeRange, int):com.tencent.tav.asset.MutableCompositionTrack");
    }

    public static void reloadAudioStartTimeWithTransitionableAudio(final List<? extends TAVTransitionableAudio> list) {
        reloadStartTimeWithTransitionable(list, new TransitionTimeCalculator() {
            public CMTime transition(int i) {
                TAVAudioTransition audioTransition = ((TAVTransitionableAudio) list.get(i)).getAudioTransition();
                return audioTransition != null ? audioTransition.getDuration() : CMTime.CMTimeZero;
            }
        });
    }

    private static void reloadStartTimeWithTransitionable(List<? extends TAVCompositionTimeRange> list, TransitionTimeCalculator transitionTimeCalculator) {
        CMTime cMTime = CMTime.CMTimeZero;
        CMTime cMTime2 = cMTime;
        int i = 0;
        while (i < list.size()) {
            TAVCompositionTimeRange tAVCompositionTimeRange = (TAVCompositionTimeRange) list.get(i);
            CMTime cMTime3 = CMTime.CMTimeZero;
            CMTime transition = transitionTimeCalculator != null ? transitionTimeCalculator.transition(i) : cMTime3;
            CMTime duration = tAVCompositionTimeRange.getTimeRange().getDuration();
            if (!duration.smallThan(transition) && i < list.size() - 1 && !((TAVCompositionTimeRange) list.get(i + 1)).getTimeRange().getDuration().smallThan(transition)) {
                cMTime3 = transition;
            }
            CMTime sub = cMTime.sub(cMTime2);
            tAVCompositionTimeRange.setStartTime(sub);
            cMTime = sub.add(duration);
            i++;
            cMTime2 = cMTime3;
        }
    }

    public static void reloadVideoStartTimeWithTransitionableVideo(final List<? extends TAVTransitionableVideo> list) {
        reloadStartTimeWithTransitionable(list, new TransitionTimeCalculator() {
            public CMTime transition(int i) {
                TAVVideoTransition videoTransition = ((TAVTransitionableVideo) list.get(i)).getVideoTransition();
                return videoTransition != null ? videoTransition.getDuration() : CMTime.CMTimeZero;
            }
        });
    }
}
