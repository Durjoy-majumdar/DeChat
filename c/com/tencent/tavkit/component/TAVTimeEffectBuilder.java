package com.tencent.tavkit.component;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.composition.TAVClip;
import com.tencent.tavkit.composition.resource.TAVAssetTrackResource;
import com.tencent.tavkit.composition.resource.TAVResource;
import com.tencent.tavkit.utils.TAVTimeUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TAVTimeEffectBuilder {
    private TAVClip clip;
    private TAVTimeEffect[] timeEffects;

    public static class TAVClipSegment {
        /* access modifiers changed from: private */
        public TAVTimeEffect timeEffect;
        /* access modifiers changed from: private */
        public CMTimeRange timeRange;

        private TAVClipSegment() {
        }
    }

    public TAVTimeEffectBuilder() {
    }

    private void addSegmentToChannel(TAVClip tAVClip, TAVClipSegment tAVClipSegment, List<TAVClip> list) {
        TAVClip clone = tAVClip.clone();
        clone.getResource().setSourceTimeRange(tAVClipSegment.timeRange);
        clone.getResource().setScaledDuration(tAVClipSegment.timeRange.getDuration());
        list.add(clone);
    }

    private void addSegmentToChannelWithTimeEffect(TAVClip tAVClip, TAVClipSegment tAVClipSegment, List<TAVClip> list) {
        TAVResource tAVResource;
        for (int i = 0; i < tAVClipSegment.timeEffect.getLoopCount(); i++) {
            if (tAVClip.getResource() instanceof TAVAssetTrackResource) {
                Asset asset = ((TAVAssetTrackResource) tAVClip.getResource()).getAsset();
                if (tAVClipSegment.timeEffect.isFreeze()) {
                    tAVResource = new TAVAssetTrackResource(asset);
                    CMTime cMTime = new CMTime(1, 30);
                    if (tAVClipSegment.timeEffect.isReverse()) {
                        tAVResource.setSourceTimeRange(new CMTimeRange(tAVClipSegment.timeRange.getEnd().sub(cMTime), cMTime));
                    } else {
                        tAVResource.setSourceTimeRange(new CMTimeRange(tAVClipSegment.timeRange.getStart(), cMTime));
                    }
                } else {
                    tAVResource = tAVClipSegment.timeEffect.isReverse() ? new TAVAssetTrackResource(asset) : new TAVAssetTrackResource(asset);
                    tAVResource.setSourceTimeRange(new CMTimeRange(tAVClipSegment.timeRange.getStart(), tAVClipSegment.timeEffect.getTimeRange().getDuration().divide((float) tAVClipSegment.timeEffect.getLoopCount())));
                }
            } else {
                tAVResource = tAVClip.getResource().clone();
            }
            if (tAVClipSegment.timeEffect.getLoopCount() == 0) {
                tAVResource.setScaledDuration(tAVClipSegment.timeRange.getDuration());
            } else {
                tAVResource.setScaledDuration(tAVClipSegment.timeRange.getDuration().divide((float) tAVClipSegment.timeEffect.getLoopCount()));
            }
            if (tAVClipSegment.timeEffect.getScaledDuration().value > 0) {
                if (tAVClipSegment.timeEffect.getLoopCount() == 0) {
                    tAVResource.setScaledDuration(tAVClipSegment.timeEffect.getScaledDuration());
                } else {
                    tAVResource.setScaledDuration(tAVClipSegment.timeEffect.getScaledDuration().divide((float) tAVClipSegment.timeEffect.getLoopCount()));
                }
            }
            TAVClip clone = tAVClip.clone();
            clone.setResource(tAVResource);
            list.add(clone);
        }
    }

    private List<TAVTimeEffect> availableTimeEffectsFromClip(TAVClip tAVClip) {
        boolean z;
        if (this.timeEffects == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        TAVResource resource = tAVClip.getResource();
        for (TAVTimeEffect tAVTimeEffect : this.timeEffects) {
            CMTimeRange intersection = TAVTimeUtil.getIntersection(resource.getSourceTimeRange(), tAVTimeEffect.getTimeRange());
            if (intersection != null && intersection.getDuration().value > 0) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    CMTimeRange intersection2 = TAVTimeUtil.getIntersection(((TAVTimeEffect) it.next()).getTimeRange(), intersection);
                    if (intersection2 != null && intersection2.getDuration().value > 0) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    arrayList.add(tAVTimeEffect);
                }
            }
        }
        Collections.sort(arrayList, new Comparator<TAVTimeEffect>() {
            public int compare(TAVTimeEffect tAVTimeEffect, TAVTimeEffect tAVTimeEffect2) {
                CMTime start = tAVTimeEffect.getTimeRange().getStart();
                CMTime start2 = tAVTimeEffect2.getTimeRange().getStart();
                if (start.equalsTo(start2)) {
                    return 0;
                }
                return start.bigThan(start2) ? 1 : -1;
            }
        });
        return arrayList;
    }

    private void initChannelWithClip(TAVClip tAVClip, List<TAVClip> list) {
        for (TAVClipSegment next : segmentsWithClip(tAVClip)) {
            if (next.timeEffect == null) {
                addSegmentToChannel(tAVClip, next, list);
            } else {
                addSegmentToChannelWithTimeEffect(tAVClip, next, list);
            }
        }
    }

    private List<TAVClipSegment> segmentsWithClip(TAVClip tAVClip) {
        TAVResource resource = tAVClip.getResource();
        CMTime start = resource.getSourceTimeRange().getStart();
        ArrayList arrayList = new ArrayList();
        CMTime traverseTimeEffect = traverseTimeEffect(tAVClip, resource, arrayList, start);
        CMTime sub = resource.getSourceTimeRange().getEnd().sub(traverseTimeEffect);
        if (sub.value > 0) {
            TAVClipSegment tAVClipSegment = new TAVClipSegment();
            CMTimeRange unused = tAVClipSegment.timeRange = new CMTimeRange(traverseTimeEffect, sub);
            arrayList.add(tAVClipSegment);
        }
        return arrayList;
    }

    private CMTime traverseTimeEffect(TAVClip tAVClip, TAVResource tAVResource, List<TAVClipSegment> list, CMTime cMTime) {
        List<TAVTimeEffect> availableTimeEffectsFromClip = availableTimeEffectsFromClip(tAVClip);
        if (availableTimeEffectsFromClip == null) {
            return cMTime;
        }
        for (TAVTimeEffect next : availableTimeEffectsFromClip) {
            CMTime sub = next.getTimeRange().getStart().sub(cMTime);
            if (sub.value > 0) {
                TAVClipSegment tAVClipSegment = new TAVClipSegment();
                CMTimeRange unused = tAVClipSegment.timeRange = new CMTimeRange(cMTime, sub);
                list.add(tAVClipSegment);
            }
            TAVClipSegment tAVClipSegment2 = new TAVClipSegment();
            CMTimeRange unused2 = tAVClipSegment2.timeRange = new CMTimeRange(next.getTimeRange().getStart().add(tAVResource.getSourceTimeRange().getStart()), next.getTimeRange().getDuration());
            TAVTimeEffect unused3 = tAVClipSegment2.timeEffect = next;
            list.add(tAVClipSegment2);
            cMTime = tAVClipSegment2.timeRange.getEnd();
        }
        return cMTime;
    }

    public List<TAVClip> build() {
        ArrayList arrayList = new ArrayList();
        CMTimeRange sourceTimeRange = this.clip.getResource().getSourceTimeRange();
        if (sourceTimeRange == null || sourceTimeRange.getDuration().value == 0) {
            return null;
        }
        initChannelWithClip(this.clip, arrayList);
        return arrayList;
    }

    public void setClip(TAVClip tAVClip) {
        this.clip = tAVClip;
    }

    public void setTimeEffects(TAVTimeEffect[] tAVTimeEffectArr) {
        this.timeEffects = tAVTimeEffectArr;
    }

    public TAVTimeEffectBuilder(TAVClip tAVClip, List<TAVTimeEffect> list) {
        this.clip = tAVClip;
        this.timeEffects = (TAVTimeEffect[]) list.toArray();
    }

    public TAVTimeEffectBuilder(TAVClip tAVClip, TAVTimeEffect... tAVTimeEffectArr) {
        this.clip = tAVClip;
        this.timeEffects = tAVTimeEffectArr;
    }
}
