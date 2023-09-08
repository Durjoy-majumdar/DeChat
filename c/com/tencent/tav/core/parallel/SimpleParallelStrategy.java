package com.tencent.tav.core.parallel;

import android.media.MediaFormat;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.CompositionTrackSegment;
import com.tencent.tav.core.AssetParallelExportSession;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.decoder.CodecHelper;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.extractor.AssetExtractor;
import java.util.ArrayList;

public class SimpleParallelStrategy extends BaseParallelStrategy {
    public AssetExtractor extractor = new AssetExtractor();
    private int parallelSize = 1;

    public SimpleParallelStrategy(AssetParallelExportSession assetParallelExportSession) {
        this.extractor.setDataSource(((CompositionTrackSegment) ((AssetTrack) assetParallelExportSession.asset.getTracks().get(0)).getSegments().get(0)).getSourcePath());
        int firstTrackIndex = DecoderUtils.getFirstTrackIndex(this.extractor, "video/");
        this.extractor.selectTrack(firstTrackIndex);
        MediaFormat trackFormat = this.extractor.getTrackFormat(firstTrackIndex);
        try {
            int supportMaxParallelCount = CodecHelper.getSupportMaxParallelCount(trackFormat.containsKey("width") ? trackFormat.getInteger("width") : 0, trackFormat.containsKey("height") ? trackFormat.getInteger("height") : 0, trackFormat.containsKey("frame-rate") ? trackFormat.getInteger("frame-rate") : 30, trackFormat.containsKey(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) ? (long) trackFormat.getInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) : 0, trackFormat.getString("mime"));
            this.parallelSize = supportMaxParallelCount;
            Logger.m144647i(BaseParallelStrategy.TAG, "parallelSize %d", Integer.valueOf(supportMaxParallelCount));
        } catch (Exception unused) {
        }
    }

    public void calculateSubsection(AssetParallelExportSession assetParallelExportSession, ArrayList<PipelineIndicatorInfo> arrayList) {
        AssetParallelExportSession assetParallelExportSession2 = assetParallelExportSession;
        long durationUs = assetParallelExportSession.getTimeRange().getDurationUs() / ((long) this.parallelSize);
        long startUs = assetParallelExportSession2.timeRange.getStartUs();
        if (this.parallelSize == 1) {
            addPipelineIndicator(0, startUs / 1000, assetParallelExportSession2.timeRange.getEndUs() / 1000, arrayList);
        } else {
            long j = startUs;
            int i = 0;
            while (true) {
                long j2 = j + durationUs;
                if (j2 >= assetParallelExportSession.getTimeRange().getEndUs() || i >= this.parallelSize - 1) {
                    break;
                }
                this.extractor.seekTo(j2, 1);
                long sampleTime = this.extractor.getSampleTime();
                int i2 = i + 1;
                addPipelineIndicator(i, j / 1000, sampleTime / 1000, arrayList);
                if (sampleTime <= j) {
                    i = i2;
                    break;
                } else {
                    j = sampleTime;
                    i = i2;
                }
            }
            if (j < assetParallelExportSession2.timeRange.getEndUs()) {
                addPipelineIndicator(i, j / 1000, assetParallelExportSession2.timeRange.getEndUs() / 1000, arrayList);
            }
            this.extractor.release();
        }
        int size = arrayList.size();
        this.parallelSize = size;
        Logger.m144647i(BaseParallelStrategy.TAG, "calculateSubsection final parallelSize:%d", Integer.valueOf(size));
    }

    public int parallelSize() {
        return this.parallelSize;
    }
}
