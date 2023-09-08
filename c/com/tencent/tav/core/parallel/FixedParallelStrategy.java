package com.tencent.tav.core.parallel;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.CompositionTrackSegment;
import com.tencent.tav.core.AssetParallelExportSession;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.CodecHelper;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.extractor.AssetExtractor;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import rx3.C110660q;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/FixedParallelStrategy;", "Lcom/tencent/tav/core/parallel/BaseParallelStrategy;", "", "parallelSize", "Lcom/tencent/tav/core/AssetParallelExportSession;", "exportSession", "Ljava/util/ArrayList;", "Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "list", "Lrx3/b0;", "calculateSubsection", "I", "Lcom/tencent/tav/core/AssetParallelExportSession;", "getExportSession", "()Lcom/tencent/tav/core/AssetParallelExportSession;", "setExportSession", "(Lcom/tencent/tav/core/AssetParallelExportSession;)V", "<init>", "Companion", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
public final class FixedParallelStrategy extends BaseParallelStrategy {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "MicroMsg.FixedParallelStrategy";
    private AssetParallelExportSession exportSession;
    private int parallelSize = 5;

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/FixedParallelStrategy$Companion;", "", "()V", "TAG", "", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public FixedParallelStrategy(AssetParallelExportSession assetParallelExportSession) {
        C87412m.m108595h(assetParallelExportSession, "exportSession");
        this.exportSession = assetParallelExportSession;
        int i = CodecHelper.HARD_CODE_PARALLEL_COUNT;
        if (i > 0) {
            this.parallelSize = i;
            Logger.m144646i(TAG, "CodecHelper set debug suggestParallelCount:" + this.parallelSize);
            return;
        }
        ExportConfig exportConfig = assetParallelExportSession.getExportConfig();
        C87412m.m108590c(exportConfig, "exportSession.exportConfig");
        if (exportConfig.getSuggestParallelCount() > 0) {
            ExportConfig exportConfig2 = this.exportSession.getExportConfig();
            C87412m.m108590c(exportConfig2, "exportSession.exportConfig");
            this.parallelSize = exportConfig2.getSuggestParallelCount();
            Logger.m144646i(TAG, "exportSession set suggestParallelCount:" + this.parallelSize);
        }
    }

    public void calculateSubsection(AssetParallelExportSession assetParallelExportSession, ArrayList<PipelineIndicatorInfo> arrayList) {
        char c;
        AssetParallelExportSession assetParallelExportSession2 = assetParallelExportSession;
        if (assetParallelExportSession2 != null) {
            CMTimeRange timeRange = assetParallelExportSession.getTimeRange();
            C87412m.m108590c(timeRange, "exportSession!!.getTimeRange()");
            int durationUs = (int) (timeRange.getDurationUs() / 10000000);
            int i = this.parallelSize;
            if (durationUs > i) {
                durationUs = i;
            }
            this.parallelSize = durationUs;
            CMTimeRange cMTimeRange = assetParallelExportSession2.timeRange;
            C87412m.m108590c(cMTimeRange, "exportSession.timeRange");
            long startUs = cMTimeRange.getStartUs();
            int i2 = 1;
            if (this.parallelSize <= 1) {
                long j = (long) 1000;
                long j2 = startUs / j;
                CMTimeRange cMTimeRange2 = assetParallelExportSession2.timeRange;
                C87412m.m108590c(cMTimeRange2, "exportSession.timeRange");
                addPipelineIndicator(0, j2, cMTimeRange2.getEndUs() / j, arrayList);
                Logger.m144646i(TAG, "parallel size is 1");
                return;
            }
            CMTimeRange timeRange2 = assetParallelExportSession.getTimeRange();
            String str = "exportSession.getTimeRange()";
            C87412m.m108590c(timeRange2, str);
            long durationUs2 = timeRange2.getDurationUs() / ((long) this.parallelSize);
            char c2 = 0;
            Logger.m144647i(TAG, "calculateSubsection offset:%d currentPts:%d", Long.valueOf(durationUs2), Long.valueOf(startUs));
            if (this.parallelSize == 1) {
                long j3 = (long) 1000;
                long j4 = startUs / j3;
                CMTimeRange cMTimeRange3 = assetParallelExportSession2.timeRange;
                C87412m.m108590c(cMTimeRange3, "exportSession.timeRange");
                addPipelineIndicator(0, j4, cMTimeRange3.getEndUs() / j3, arrayList);
                c = 0;
            } else {
                AssetExtractor assetExtractor = new AssetExtractor();
                Asset asset = assetParallelExportSession2.asset;
                C87412m.m108590c(asset, "exportSession.asset");
                Object obj = asset.getTracks().get(0);
                if (obj != null) {
                    Object obj2 = ((AssetTrack) obj).getSegments().get(0);
                    if (obj2 != null) {
                        assetExtractor.setDataSource(((CompositionTrackSegment) obj2).getSourcePath());
                        assetExtractor.selectTrack(DecoderUtils.getFirstTrackIndex(assetExtractor, "video/"));
                        long j5 = durationUs2;
                        int i3 = 0;
                        while (true) {
                            long j6 = startUs + j5;
                            CMTimeRange timeRange3 = assetParallelExportSession.getTimeRange();
                            C87412m.m108590c(timeRange3, str);
                            if (j6 >= timeRange3.getEndUs() || i3 >= this.parallelSize - i2) {
                                break;
                            }
                            assetExtractor.seekTo(j6, i2);
                            long sampleTime = assetExtractor.getSampleTime();
                            Object[] objArr = new Object[2];
                            objArr[c2] = Long.valueOf(startUs);
                            objArr[i2] = Long.valueOf(sampleTime);
                            Logger.m144647i(TAG, "currentPts:%d sampleTime:%d", objArr);
                            if (sampleTime > 0 || startUs != 0) {
                                String str2 = str;
                                if (sampleTime <= startUs) {
                                    break;
                                }
                                int i4 = i3 + 1;
                                long j7 = (long) 1000;
                                addPipelineIndicator(i3, startUs / j7, sampleTime / j7, arrayList);
                                i3 = i4;
                                assetExtractor = assetExtractor;
                                startUs = sampleTime;
                                str = str2;
                                c2 = 0;
                            } else {
                                int i5 = this.parallelSize;
                                if (i5 <= i2) {
                                    break;
                                }
                                this.parallelSize = i5 - 1;
                                CMTimeRange timeRange4 = assetParallelExportSession.getTimeRange();
                                C87412m.m108590c(timeRange4, str);
                                long durationUs3 = timeRange4.getDurationUs() / ((long) this.parallelSize);
                                Logger.m144646i(TAG, "update parallel size:" + this.parallelSize + " offset:" + durationUs3);
                                j5 = durationUs3;
                                str = str;
                            }
                            i2 = 1;
                        }
                        AssetExtractor assetExtractor2 = assetExtractor;
                        c = 0;
                        CMTimeRange cMTimeRange4 = assetParallelExportSession2.timeRange;
                        C87412m.m108590c(cMTimeRange4, "exportSession.timeRange");
                        if (startUs < cMTimeRange4.getEndUs()) {
                            long j8 = (long) 1000;
                            long j9 = startUs / j8;
                            CMTimeRange cMTimeRange5 = assetParallelExportSession2.timeRange;
                            C87412m.m108590c(cMTimeRange5, "exportSession.timeRange");
                            Logger.m144647i(TAG, "add last currentPts:%d sampleTime:%d", Long.valueOf(startUs), Long.valueOf(cMTimeRange5.getEndUs()));
                            CMTimeRange cMTimeRange6 = assetParallelExportSession2.timeRange;
                            C87412m.m108590c(cMTimeRange6, "exportSession.timeRange");
                            addPipelineIndicator(i3, j9, cMTimeRange6.getEndUs() / j8, arrayList);
                        }
                        assetExtractor2.release();
                    } else {
                        throw new C110660q("null cannot be cast to non-null type com.tencent.tav.asset.CompositionTrackSegment");
                    }
                } else {
                    throw new C110660q("null cannot be cast to non-null type com.tencent.tav.asset.AssetTrack<*>");
                }
            }
            if (arrayList != null) {
                int size = arrayList.size();
                this.parallelSize = size;
                Object[] objArr2 = new Object[1];
                objArr2[c] = Integer.valueOf(size);
                Logger.m144647i(TAG, "calculateSubsection final parallelSize:%d", objArr2);
                return;
            }
            C87412m.m108601n();
            throw null;
        }
        C87412m.m108601n();
        throw null;
    }

    public final AssetParallelExportSession getExportSession() {
        return this.exportSession;
    }

    public int parallelSize() {
        return this.parallelSize;
    }

    public final void setExportSession(AssetParallelExportSession assetParallelExportSession) {
        C87412m.m108595h(assetParallelExportSession, "<set-?>");
        this.exportSession = assetParallelExportSession;
    }
}
