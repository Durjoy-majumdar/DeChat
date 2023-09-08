package com.tencent.tavkit.composition.builder;

import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction;
import com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

class VideoInstructionsBuilder {
    private final BuilderModel builderModel;
    private final List<TAVVideoCompositionInstruction> outputInstructions = new ArrayList();

    public static class Slice {
        /* access modifiers changed from: private */
        public List<TAVVideoCompositionLayerInstruction> layerInstructions;
        /* access modifiers changed from: private */
        public CMTimeRange timeRange;

        public Slice(CMTimeRange cMTimeRange, List<TAVVideoCompositionLayerInstruction> list) {
            this.timeRange = cMTimeRange;
            this.layerInstructions = list;
        }
    }

    public VideoInstructionsBuilder(BuilderModel builderModel2) {
        this.builderModel = builderModel2;
    }

    private TAVVideoCompositionInstruction buildInstruction(Slice slice, List<TAVVideoCompositionLayerInstruction> list, List<List<TAVVideoCompositionLayerInstruction>> list2) {
        TAVVideoCompositionInstruction tAVVideoCompositionInstruction = new TAVVideoCompositionInstruction(trackIDsByLayers(slice.layerInstructions), slice.timeRange);
        tAVVideoCompositionInstruction.setChannelLayers(selectChannels(list2, slice.layerInstructions));
        tAVVideoCompositionInstruction.setOverlayLayers(selectLayers(list, slice.layerInstructions));
        tAVVideoCompositionInstruction.setBackgroundColor(this.builderModel.getBackgroundColor());
        tAVVideoCompositionInstruction.setGlobalVideoEffect(this.builderModel.getTavComposition().getGlobalVideoEffect());
        tAVVideoCompositionInstruction.setVideoMixEffect(this.builderModel.getTavComposition().getVideoMixEffect());
        tAVVideoCompositionInstruction.setSourceVideoEffect(this.builderModel.getTavComposition().getSourceVideoEffect());
        return tAVVideoCompositionInstruction;
    }

    private void buildInstructions(List<List<TAVVideoCompositionLayerInstruction>> list, List<TAVVideoCompositionLayerInstruction> list2, List<Slice> list3) {
        for (Slice buildInstruction : list3) {
            this.outputInstructions.add(buildInstruction(buildInstruction, list2, list));
        }
    }

    private static List<Slice> calculateSlicesForLayerInstructions(List<TAVVideoCompositionLayerInstruction> list) {
        TreeSet treeSet = new TreeSet(new Comparator<CMTime>() {
            public int compare(CMTime cMTime, CMTime cMTime2) {
                return (int) cMTime.sub(cMTime2).getValue();
            }
        });
        for (TAVVideoCompositionLayerInstruction next : list) {
            treeSet.add(next.getTimeRange().getStart());
            treeSet.add(next.getTimeRange().getEnd());
        }
        ArrayList arrayList = new ArrayList();
        CMTime cMTime = (CMTime) treeSet.pollFirst();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            CMTime cMTime2 = (CMTime) it.next();
            CMTimeRange cMTimeRange = new CMTimeRange(cMTime, cMTime2.sub(cMTime));
            ArrayList arrayList2 = new ArrayList();
            for (TAVVideoCompositionLayerInstruction next2 : list) {
                if (next2.getTimeRange().getEnd().getTimeUs() >= cMTime.getTimeUs() && next2.getTimeRange().getStart().getTimeUs() <= cMTime2.getTimeUs()) {
                    arrayList2.add(next2);
                }
            }
            arrayList.add(new Slice(cMTimeRange, arrayList2));
            cMTime = cMTime2;
        }
        return arrayList;
    }

    private List<TAVVideoCompositionLayerInstruction> concatAndSortLayers(List<List<TAVVideoCompositionLayerInstruction>> list, List<TAVVideoCompositionLayerInstruction> list2) {
        ArrayList arrayList = new ArrayList();
        for (List<TAVVideoCompositionLayerInstruction> addAll : list) {
            arrayList.addAll(addAll);
        }
        arrayList.addAll(list2);
        Collections.sort(arrayList, new Comparator<TAVVideoCompositionLayerInstruction>() {
            public int compare(TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction, TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction2) {
                CMTime start = tAVVideoCompositionLayerInstruction.getTimeRange().getStart();
                CMTime start2 = tAVVideoCompositionLayerInstruction2.getTimeRange().getStart();
                if (start.equalsTo(start2)) {
                    return 0;
                }
                return start.smallThan(start2) ? -1 : 1;
            }
        });
        return arrayList;
    }

    private void fixLastLayerDuration(List<List<TAVVideoCompositionLayerInstruction>> list) {
        List list2;
        if (list != null && list.size() == 1 && (list2 = list.get(0)) != null && !list2.isEmpty()) {
            TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction = (TAVVideoCompositionLayerInstruction) list2.get(list2.size() - 1);
            CMTime frameDuration = this.builderModel.getTavComposition().getFrameDuration();
            if (frameDuration == null) {
                frameDuration = new CMTime(1, 30);
            }
            tAVVideoCompositionLayerInstruction.setTimeRange(new CMTimeRange(tAVVideoCompositionLayerInstruction.getTimeRange().getStart(), tAVVideoCompositionLayerInstruction.getTimeRange().getDuration().add(frameDuration)));
        }
    }

    private List<List<TAVVideoCompositionLayerInstruction>> selectChannels(List<List<TAVVideoCompositionLayerInstruction>> list, List<TAVVideoCompositionLayerInstruction> list2) {
        ArrayList arrayList = new ArrayList();
        for (List<TAVVideoCompositionLayerInstruction> selectLayers : list) {
            List<TAVVideoCompositionLayerInstruction> selectLayers2 = selectLayers(list2, selectLayers);
            if (selectLayers2.size() > 0) {
                arrayList.add(selectLayers2);
            }
        }
        return arrayList;
    }

    private List<TAVVideoCompositionLayerInstruction> selectLayers(List<TAVVideoCompositionLayerInstruction> list, List<TAVVideoCompositionLayerInstruction> list2) {
        ArrayList arrayList = new ArrayList();
        for (TAVVideoCompositionLayerInstruction next : list) {
            if (list2.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private List<Integer> trackIDsByLayers(List<TAVVideoCompositionLayerInstruction> list) {
        ArrayList arrayList = new ArrayList();
        for (TAVVideoCompositionLayerInstruction trackID : list) {
            arrayList.add(Integer.valueOf(trackID.getTrackID()));
        }
        return arrayList;
    }

    public List<TAVVideoCompositionInstruction> build() {
        List<List<TAVVideoCompositionLayerInstruction>> buildMainLayerInstructions = buildMainLayerInstructions();
        List<TAVVideoCompositionLayerInstruction> buildOverlayLayerInstructions = buildOverlayLayerInstructions();
        buildInstructions(buildMainLayerInstructions, buildOverlayLayerInstructions, calculateSlicesForLayerInstructions(concatAndSortLayers(buildMainLayerInstructions, buildOverlayLayerInstructions)));
        return this.outputInstructions;
    }

    public List<List<TAVVideoCompositionLayerInstruction>> buildMainLayerInstructions() {
        ArrayList arrayList = new ArrayList();
        for (List<VideoInfo> it : this.builderModel.getMainVideoTrackInfo()) {
            ArrayList arrayList2 = new ArrayList();
            for (VideoInfo videoInfo : it) {
                arrayList2.add(new TAVVideoCompositionLayerInstruction(videoInfo.compositionTrack.getTrackID(), videoInfo.clip));
            }
            arrayList.add(arrayList2);
        }
        fixLastLayerDuration(arrayList);
        return arrayList;
    }

    public List<TAVVideoCompositionLayerInstruction> buildOverlayLayerInstructions() {
        ArrayList arrayList = new ArrayList();
        for (VideoOverlayInfo convertToLayerInstruction : this.builderModel.getOverlayTrackInfo()) {
            arrayList.add(convertToLayerInstruction.convertToLayerInstruction());
        }
        return arrayList;
    }
}
