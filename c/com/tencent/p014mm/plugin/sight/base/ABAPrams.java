package com.tencent.p014mm.plugin.sight.base;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sight.base.ABAPrams */
public class ABAPrams {
    public int SkipReadQP;
    public int addStickers;
    public int averageMV;
    public int averageQP;
    public int bitrateAdaptiveDown;
    public int bitrateAdaptiveUP;
    public int codecID;
    public int compAudioBitrate;
    public int compAudioChannel;
    public int consumingtime;
    public int duration;
    public int enableABA;
    public int enableSWHEVCTrans;
    public int inputFps;
    public int inputHeight;
    public int inputKbps;
    public int inputWidth;
    public int interMode;
    public int intraMode;
    public int isEnableHEVC;
    public int oriAudioBitrate;
    public int oriAudioChannel;
    public int outputHeight;
    public int outputKbps;
    public int outputWidth;
    public int platform;
    public int qualityLevel;
    public int ratiosBitrateQP;
    public int resolutionAdjust;
    public int sceneCase;
    public int skipMode;
    public int skipVideoCompress;
    public int startTime;
    public int textureComplexity;
    public int transcosingKbps;
    public int use1080pC2CSNS;

    public List<Integer> transToList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(Integer.valueOf(this.outputKbps));
        linkedList.add(Integer.valueOf(this.outputWidth));
        linkedList.add(Integer.valueOf(this.outputHeight));
        linkedList.add(Integer.valueOf(this.bitrateAdaptiveUP));
        linkedList.add(Integer.valueOf(this.bitrateAdaptiveDown));
        linkedList.add(Integer.valueOf(this.resolutionAdjust));
        linkedList.add(Integer.valueOf(this.sceneCase));
        linkedList.add(Integer.valueOf(this.inputKbps));
        linkedList.add(Integer.valueOf(this.inputWidth));
        linkedList.add(Integer.valueOf(this.inputHeight));
        linkedList.add(Integer.valueOf(this.inputFps));
        linkedList.add(Integer.valueOf(this.averageQP));
        linkedList.add(Integer.valueOf(this.averageMV));
        linkedList.add(Integer.valueOf(this.skipMode));
        linkedList.add(Integer.valueOf(this.intraMode));
        linkedList.add(Integer.valueOf(this.interMode));
        linkedList.add(Integer.valueOf(this.SkipReadQP));
        linkedList.add(Integer.valueOf(this.consumingtime));
        linkedList.add(Integer.valueOf(this.codecID));
        linkedList.add(Integer.valueOf(this.transcosingKbps));
        linkedList.add(Integer.valueOf(this.isEnableHEVC));
        linkedList.add(Integer.valueOf(this.enableABA));
        linkedList.add(Integer.valueOf(this.use1080pC2CSNS));
        linkedList.add(Integer.valueOf(this.startTime));
        linkedList.add(Integer.valueOf(this.duration));
        linkedList.add(Integer.valueOf(this.ratiosBitrateQP));
        linkedList.add(Integer.valueOf(this.textureComplexity));
        linkedList.add(Integer.valueOf(this.qualityLevel));
        linkedList.add(Integer.valueOf(this.platform));
        linkedList.add(Integer.valueOf(this.oriAudioBitrate));
        linkedList.add(Integer.valueOf(this.oriAudioChannel));
        linkedList.add(Integer.valueOf(this.compAudioBitrate));
        linkedList.add(Integer.valueOf(this.compAudioChannel));
        linkedList.add(Integer.valueOf(this.addStickers));
        linkedList.add(Integer.valueOf(this.enableSWHEVCTrans));
        linkedList.add(Integer.valueOf(this.skipVideoCompress));
        return linkedList;
    }
}
