package com.tencent.tav.core.parallel.info;

import android.os.HandlerThread;
import com.tencent.tav.core.AssetParallelSegmentStatus;
import com.tencent.tav.core.AssetReaderOutput;
import com.tencent.tav.core.AssetWriter;
import com.tencent.tav.core.AssetWriterInput;
import java.util.Locale;

public class PipelineWorkInfo {
    public static final int PIPELINE_TYPE_AUDIO = 2;
    public static final int PIPELINE_TYPE_VIDEO = 1;
    public AssetWriter assetWriter;
    private PipelineIndicatorInfo indicator;
    public AssetReaderOutput readerOutput;
    public HandlerThread thread;
    public int type;
    public AssetWriterInput writerInput;

    public PipelineWorkInfo(int i, AssetReaderOutput assetReaderOutput, AssetWriterInput assetWriterInput, HandlerThread handlerThread, PipelineIndicatorInfo pipelineIndicatorInfo) {
        this.type = i;
        this.readerOutput = assetReaderOutput;
        this.writerInput = assetWriterInput;
        this.thread = handlerThread;
        setIndicator(pipelineIndicatorInfo);
    }

    public PipelineIndicatorInfo getIndicator() {
        return this.indicator;
    }

    public void reuseWork(PipelineWorkInfo pipelineWorkInfo) {
        PipelineIndicatorInfo pipelineIndicatorInfo = pipelineWorkInfo.indicator;
        pipelineWorkInfo.indicator = this.indicator;
        this.indicator = pipelineIndicatorInfo;
        pipelineIndicatorInfo.setSegmentStatus(AssetParallelSegmentStatus.AssetParallelStatusStarted);
    }

    public void setIndicator(PipelineIndicatorInfo pipelineIndicatorInfo) {
        this.indicator = pipelineIndicatorInfo;
        pipelineIndicatorInfo.setSegmentStatus(AssetParallelSegmentStatus.AssetParallelStatusPrepared);
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(hashCode());
        objArr[1] = this.type == 1 ? "video" : "audio";
        objArr[2] = Integer.valueOf(this.indicator.getIndex());
        objArr[3] = Long.valueOf(this.indicator.timeRange.getStartUs() / 1000);
        objArr[4] = Long.valueOf(this.indicator.timeRange.getEndUs() / 1000);
        return String.format(locale, "[hash:%d]type:%s  segment index:%d  time[%d,%d]", objArr);
    }
}
