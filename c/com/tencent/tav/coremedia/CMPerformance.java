package com.tencent.tav.coremedia;

import java.util.ArrayList;

public class CMPerformance {
    private long endMs = -1;
    private CMPerformance nextNode;
    public ArrayList<CMPerformance> preNodes = new ArrayList<>();
    public CMPerformanceStage stage = CMPerformanceStage.DEFAULT;
    private long startMs = -1;

    public enum CMPerformanceStage {
        DEFAULT,
        EXTRACTOR,
        DECODE_WAIT,
        DECODE_JUMP,
        DECODE_CACHE,
        DECODE,
        RENDER,
        ENCODE_RENDER_CLEAR,
        ENCODE_RENDER,
        ENCODE_SWAP_BUFFER,
        ENCODE,
        ENCODE_WAIT
    }

    public CMPerformance() {
    }

    public void addPreNode(CMPerformance cMPerformance) {
        this.preNodes.add(cMPerformance);
    }

    public long costMs() {
        return this.endMs - this.startMs;
    }

    public CMPerformance getNextNode() {
        return this.nextNode;
    }

    public void markEnd() {
        this.endMs = System.currentTimeMillis();
    }

    public void markStart() {
        this.startMs = System.currentTimeMillis();
    }

    public void setNextNode(CMPerformance cMPerformance) {
        this.nextNode = cMPerformance;
    }

    public boolean stageValid() {
        return this.stage != CMPerformanceStage.DEFAULT;
    }

    public String toString() {
        return "CMPerformance{stage=" + this.stage + ", startMs=" + this.startMs + ", endMs=" + this.endMs + '}';
    }

    public CMPerformance(CMPerformanceStage cMPerformanceStage) {
        this.stage = cMPerformanceStage;
    }
}
