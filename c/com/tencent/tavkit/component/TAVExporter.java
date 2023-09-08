package com.tencent.tavkit.component;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.core.AssetExportSession;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.EncoderWriter;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tavkit.composition.TAVComposition;
import com.tencent.tavkit.composition.TAVSource;
import com.tencent.tavkit.composition.builder.TAVCompositionBuilder;
import java.io.File;
import java.io.IOException;

public class TAVExporter {
    public static final int VIDEO_EXPORT_HEIGHT = 1280;
    public static final int VIDEO_EXPORT_WIDTH = 720;
    /* access modifiers changed from: private */
    public final String TAG = ("GameTemplateExporter@" + Integer.toHexString(hashCode()));
    private EncoderWriter.OutputConfig defaultOutputConfig;
    /* access modifiers changed from: private */
    public ExportListener exportListener;
    private AssetExportSession exportSession;
    /* access modifiers changed from: private */
    public volatile boolean isCanceled;
    /* access modifiers changed from: private */
    public volatile boolean isExporting;

    /* renamed from: com.tencent.tavkit.component.TAVExporter$2 */
    public static /* synthetic */ class C1069242 {

        /* renamed from: $SwitchMap$com$tencent$tav$core$AssetExportSession$AssetExportSessionStatus */
        public static final /* synthetic */ int[] f320112xaf4f82e;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.tav.core.AssetExportSession$AssetExportSessionStatus[] r0 = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f320112xaf4f82e = r0
                com.tencent.tav.core.AssetExportSession$AssetExportSessionStatus r1 = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusExporting     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f320112xaf4f82e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.tav.core.AssetExportSession$AssetExportSessionStatus r1 = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f320112xaf4f82e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.tav.core.AssetExportSession$AssetExportSessionStatus r1 = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusFailed     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f320112xaf4f82e     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.tav.core.AssetExportSession$AssetExportSessionStatus r1 = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusUnknown     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f320112xaf4f82e     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.tav.core.AssetExportSession$AssetExportSessionStatus r1 = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCancelled     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.tavkit.component.TAVExporter.C1069242.<clinit>():void");
        }
    }

    public interface ExportListener {
        void onExportCancel();

        void onExportCompleted(String str);

        void onExportError(int i, Throwable th);

        void onExportStart();

        void onExporting(float f);
    }

    public TAVExporter() {
        EncoderWriter.OutputConfig outputConfig = new EncoderWriter.OutputConfig();
        this.defaultOutputConfig = outputConfig;
        outputConfig.VIDEO_TARGET_WIDTH = VIDEO_EXPORT_WIDTH;
        outputConfig.VIDEO_TARGET_HEIGHT = 1280;
        outputConfig.VIDEO_FRAME_RATE = 25;
    }

    private File newOutputFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        try {
            if (file.createNewFile()) {
                return file;
            }
            throw new RuntimeException("创建输出文件失败");
        } catch (IOException e) {
            Logger.m144644e(this.TAG, "export: ", (Throwable) e);
            throw new RuntimeException("创建输出文件失败", e);
        }
    }

    public void cancelExport() {
        if (this.exportSession != null) {
            this.isCanceled = true;
            this.exportSession.cancelExport();
        }
        this.isExporting = false;
    }

    public void export(TAVComposition tAVComposition, final String str, EncoderWriter.OutputConfig outputConfig) {
        if (tAVComposition != null) {
            AssetExportSession assetExportSession = this.exportSession;
            if (assetExportSession != null) {
                assetExportSession.cancelExport();
                this.exportSession = null;
            }
            if (outputConfig == null) {
                outputConfig = this.defaultOutputConfig;
            }
            TAVCompositionBuilder tAVCompositionBuilder = new TAVCompositionBuilder(tAVComposition);
            tAVCompositionBuilder.setVideoTracksMerge(false);
            TAVSource buildSource = tAVCompositionBuilder.buildSource();
            Asset asset = buildSource.getAsset();
            AssetExportSession assetExportSession2 = new AssetExportSession(asset, outputConfig);
            this.exportSession = assetExportSession2;
            assetExportSession2.setTimeRange(new CMTimeRange(CMTime.CMTimeZero, asset.getDuration()));
            this.exportSession.setAudioMix(buildSource.getAudioMix());
            String str2 = this.TAG;
            Logger.m144646i(str2, "export composition duration: " + asset.getDuration());
            this.exportSession.setOutputFilePath(newOutputFile(str).getAbsolutePath());
            this.exportSession.setOutputFileType("mp4");
            this.exportSession.setVideoComposition(buildSource.getVideoComposition());
            this.exportSession.exportAsynchronouslyWithCompletionHandler(new AssetExportSession.ExportCallbackHandler() {
                public void handlerCallback(AssetExportSession assetExportSession) {
                    int i = C1069242.f320112xaf4f82e[assetExportSession.getStatus().ordinal()];
                    if (i == 1) {
                        if (TAVExporter.this.exportListener != null) {
                            String access$100 = TAVExporter.this.TAG;
                            Logger.m144646i(access$100, "export progress: " + assetExportSession.getProgress());
                            if (!TAVExporter.this.isExporting) {
                                TAVExporter.this.exportListener.onExportStart();
                            }
                            TAVExporter.this.exportListener.onExporting(assetExportSession.getProgress());
                        }
                        boolean unused = TAVExporter.this.isExporting = true;
                    } else if (i == 2) {
                        Logger.m144646i(TAVExporter.this.TAG, "export progress finished");
                        if (TAVExporter.this.exportListener != null) {
                            TAVExporter.this.exportListener.onExportCompleted(str);
                        }
                        boolean unused2 = TAVExporter.this.isExporting = false;
                    } else if (i == 3 || i == 4) {
                        Logger.m144646i(TAVExporter.this.TAG, "export error");
                        if (TAVExporter.this.exportListener != null) {
                            TAVExporter.this.exportListener.onExportError(assetExportSession.getErrCode(), assetExportSession.getThrowable());
                        }
                        boolean unused3 = TAVExporter.this.isExporting = false;
                    } else if (i == 5) {
                        Logger.m144646i(TAVExporter.this.TAG, "export cancel");
                        if (TAVExporter.this.exportListener != null && TAVExporter.this.isCanceled) {
                            boolean unused4 = TAVExporter.this.isCanceled = false;
                            TAVExporter.this.exportListener.onExportCancel();
                        }
                        boolean unused5 = TAVExporter.this.isExporting = false;
                    }
                }
            });
        }
    }

    public AssetExportSession getExportSession() {
        return this.exportSession;
    }

    public boolean isExporting() {
        return this.isExporting;
    }

    public void setExportListener(ExportListener exportListener2) {
        this.exportListener = exportListener2;
    }

    public void setOutputConfig(EncoderWriter.OutputConfig outputConfig) {
        this.defaultOutputConfig = outputConfig;
    }

    public void export(TAVComposition tAVComposition, String str) {
        export(tAVComposition, str, this.defaultOutputConfig);
    }
}
