package com.tencent.tavkit.composition.model;

import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.composition.audio.TAVAudioProcessorNode;
import java.util.ArrayList;
import java.util.List;

public class TAVAudioConfiguration {
    private VolumeEdge endVolumeEdge;
    private final List<TAVAudioProcessorNode> nodes;
    private VolumeEdge startVolumeEdge;
    private float volume;
    private List<VolumeEdge> volumeEdges;

    public static class VolumeEdge {
        private float endVolume;
        private float startVolume;
        private CMTimeRange timeRange;

        public VolumeEdge() {
        }

        public CMTime getDuration() {
            CMTimeRange cMTimeRange = this.timeRange;
            return cMTimeRange != null ? cMTimeRange.getDuration() : CMTime.CMTimeZero;
        }

        public float getEndVolume() {
            return this.endVolume;
        }

        public float getStartVolume() {
            return this.startVolume;
        }

        public CMTimeRange getTimeRange() {
            return this.timeRange;
        }

        public float getVolume(CMTime cMTime) {
            long timeUs = cMTime.getTimeUs();
            float f = this.startVolume;
            return f + ((this.endVolume - f) * ((((float) timeUs) * 1.0f) / ((float) getDuration().getTimeUs())));
        }

        public void setDuration(CMTime cMTime) {
            this.timeRange = new CMTimeRange(CMTime.CMTimeZero, cMTime);
        }

        public void setEndVolume(float f) {
            this.endVolume = f;
        }

        public void setStartVolume(float f) {
            this.startVolume = f;
        }

        public void setTimeRange(CMTimeRange cMTimeRange) {
            this.timeRange = cMTimeRange;
        }

        public VolumeEdge(CMTime cMTime, float f, float f2) {
            this.timeRange = new CMTimeRange(CMTime.CMTimeZero, cMTime);
            this.startVolume = f;
            this.endVolume = f2;
        }

        public VolumeEdge(CMTimeRange cMTimeRange, float f, float f2) {
            this.timeRange = cMTimeRange;
            this.startVolume = f;
            this.endVolume = f2;
        }
    }

    public TAVAudioConfiguration() {
        this(1.0f);
    }

    public void addAudioProcessorNode(TAVAudioProcessorNode tAVAudioProcessorNode) {
        this.nodes.add(tAVAudioProcessorNode);
    }

    public void addVolumeEdge(VolumeEdge volumeEdge) {
        if (volumeEdge != null) {
            if (this.volumeEdges == null) {
                this.volumeEdges = new ArrayList();
            }
            this.volumeEdges.add(0, volumeEdge);
        }
    }

    public VolumeEdge getEndVolumeEdge() {
        return this.endVolumeEdge;
    }

    public List<TAVAudioProcessorNode> getNodes() {
        return this.nodes;
    }

    public VolumeEdge getStartVolumeEdge() {
        return this.startVolumeEdge;
    }

    public float getVolume() {
        return this.volume;
    }

    public void setAudioProcessorNodes(List<TAVAudioProcessorNode> list) {
        this.nodes.clear();
        if (list != null) {
            this.nodes.addAll(list);
        }
    }

    public void setEndVolumeEdge(VolumeEdge volumeEdge) {
        this.endVolumeEdge = volumeEdge;
    }

    public void setStartVolumeEdge(VolumeEdge volumeEdge) {
        this.startVolumeEdge = volumeEdge;
    }

    public void setVolume(float f) {
        this.volume = f;
    }

    public String toString() {
        return "TAVAudioConfiguration{volume=" + this.volume + ", startVolumeEdge=" + this.startVolumeEdge + ", endVolumeEdge=" + this.endVolumeEdge + ", nodes=" + this.nodes + '}';
    }

    public TAVAudioConfiguration(float f) {
        this(f, (List<TAVAudioProcessorNode>) null, (List<VolumeEdge>) null);
    }

    public TAVAudioConfiguration clone() {
        return new TAVAudioConfiguration(this.volume, this.nodes);
    }

    public float getVolume(CMTime cMTime) {
        VolumeEdge volumeEdge = this.startVolumeEdge;
        if (volumeEdge == null || volumeEdge.getTimeRange() == null || !this.startVolumeEdge.getTimeRange().containsTime(cMTime)) {
            VolumeEdge volumeEdge2 = this.endVolumeEdge;
            if (volumeEdge2 == null || volumeEdge2.getTimeRange() == null || !this.endVolumeEdge.getTimeRange().containsTime(cMTime)) {
                List<VolumeEdge> list = this.volumeEdges;
                if (list != null && !list.isEmpty()) {
                    for (VolumeEdge next : this.volumeEdges) {
                        if (next != null && next.getTimeRange() != null && next.getTimeRange().containsTime(cMTime)) {
                            return next.getVolume(cMTime.sub(next.getTimeRange().getStart()));
                        }
                    }
                }
                return this.volume;
            }
            VolumeEdge volumeEdge3 = this.endVolumeEdge;
            return volumeEdge3.getVolume(cMTime.sub(volumeEdge3.getTimeRange().getStart()));
        }
        VolumeEdge volumeEdge4 = this.startVolumeEdge;
        return volumeEdge4.getVolume(cMTime.sub(volumeEdge4.getTimeRange().getStart()));
    }

    public TAVAudioConfiguration(List<VolumeEdge> list) {
        this(1.0f, (List<TAVAudioProcessorNode>) null, list);
    }

    public TAVAudioConfiguration(float f, List<TAVAudioProcessorNode> list) {
        this(f, list, (List<VolumeEdge>) null);
    }

    public TAVAudioConfiguration(float f, List<TAVAudioProcessorNode> list, List<VolumeEdge> list2) {
        this.volume = f;
        ArrayList arrayList = new ArrayList();
        this.nodes = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        ArrayList arrayList2 = new ArrayList();
        this.volumeEdges = arrayList2;
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
    }
}
