package com.tencent.tav.core.parallel;

import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.CompositionTrackSegment;
import com.tencent.tav.core.AssetParallelExportSession;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.extractor.AssetExtractor;
import java.util.ArrayList;

public class PipelineParallelStrategy extends BaseParallelStrategy {
    public static final int SEGMENT_DURATION_MS = 5000;

    public void calculateSubsection(AssetParallelExportSession assetParallelExportSession, ArrayList<PipelineIndicatorInfo> arrayList) {
        int i;
        AssetParallelExportSession assetParallelExportSession2 = assetParallelExportSession;
        AssetExtractor assetExtractor = new AssetExtractor();
        assetExtractor.setDataSource(((CompositionTrackSegment) ((AssetTrack) assetParallelExportSession2.asset.getTracks().get(0)).getSegments().get(0)).getSourcePath());
        assetExtractor.selectTrack(DecoderUtils.getFirstTrackIndex(assetExtractor, "video/"));
        long startUs = assetParallelExportSession2.timeRange.getStartUs();
        int i2 = 0;
        while (true) {
            long j = 5000000 + startUs;
            if (j >= assetParallelExportSession2.timeRange.getEndUs()) {
                i = i2;
                break;
            }
            assetExtractor.seekTo(j, 1);
            long sampleTime = assetExtractor.getSampleTime();
            int i3 = i2 + 1;
            addPipelineIndicator(i2, startUs / 1000, sampleTime / 1000, arrayList);
            if (sampleTime <= startUs) {
                i = i3;
                break;
            } else {
                startUs = sampleTime;
                i2 = i3;
            }
        }
        if (startUs < assetParallelExportSession2.timeRange.getEndUs()) {
            addPipelineIndicator(i, startUs / 1000, assetParallelExportSession2.timeRange.getEndUs() / 1000, arrayList);
        }
        assetExtractor.release();
    }

    public int parallelSize() {
        return 2;
    }
}
