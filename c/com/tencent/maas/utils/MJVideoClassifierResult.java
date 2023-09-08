package com.tencent.maas.utils;

import java.util.Arrays;

public class MJVideoClassifierResult {
    private final int[] AudioTaskOutLabels;
    private final float[] AudioTaskOutScores;
    private final float[] LastVersionOutScores;
    private final int[] VisionTaskExceedsThreshold;
    private final int[] VisionTaskOutLabels;
    private final float[] VisionTaskOutScores;

    public MJVideoClassifierResult(int[] iArr, int[] iArr2, float[] fArr, int[] iArr3, float[] fArr2, float[] fArr3) {
        this.VisionTaskOutLabels = iArr;
        this.VisionTaskExceedsThreshold = iArr2;
        this.VisionTaskOutScores = fArr;
        this.AudioTaskOutLabels = iArr3;
        this.AudioTaskOutScores = fArr2;
        this.LastVersionOutScores = fArr3;
    }

    public int[] getAudioTaskOutLabels() {
        return this.AudioTaskOutLabels;
    }

    public float[] getAudioTaskOutScores() {
        return this.AudioTaskOutScores;
    }

    public float[] getLastVersionOutScores() {
        return this.LastVersionOutScores;
    }

    public int[] getVisionTaskExceedsThreshold() {
        return this.VisionTaskExceedsThreshold;
    }

    public int[] getVisionTaskOutLabels() {
        return this.VisionTaskOutLabels;
    }

    public float[] getVisionTaskOutScores() {
        return this.VisionTaskOutScores;
    }

    public String toString() {
        return "MJVideoClassifierResult{VisionTaskOutLabels=" + Arrays.toString(this.VisionTaskOutLabels) + ", VisionTaskExceedsThreshold=" + Arrays.toString(this.VisionTaskExceedsThreshold) + ", VisionTaskOutScores=" + Arrays.toString(this.VisionTaskOutScores) + ", AudioTaskOutLabels=" + Arrays.toString(this.AudioTaskOutLabels) + ", AudioTaskOutScores=" + Arrays.toString(this.AudioTaskOutScores) + ", LastVersionOutScores=" + Arrays.toString(this.LastVersionOutScores) + '}';
    }
}
