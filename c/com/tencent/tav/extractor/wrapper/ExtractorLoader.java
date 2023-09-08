package com.tencent.tav.extractor.wrapper;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.tav.extractor.AssetExtractor;

public class ExtractorLoader {
    private static Handler loadHandler;
    private static HandlerThread loadThread;

    public static class ExtractorLoaderRunnable implements Runnable {
        private AssetExtractor extractor;

        public ExtractorLoaderRunnable(AssetExtractor assetExtractor) {
            this.extractor = assetExtractor;
        }

        public void run() {
            if (!ExtractorWrapperPool.contains(this.extractor.getSourcePath())) {
                ExtractorWrapper extractorWrapper = new ExtractorWrapper(this.extractor.getSourcePath());
                extractorWrapper.checkAndLoad(this.extractor);
                ExtractorWrapperPool.put(extractorWrapper);
                this.extractor.dispose();
                this.extractor = null;
            }
        }
    }

    public static class VideoPathLoaderRunnable implements Runnable {
        private String videoPath;

        public VideoPathLoaderRunnable(String str) {
            this.videoPath = str;
        }

        public void run() {
            if (!ExtractorWrapperPool.contains(this.videoPath) && this.videoPath != null) {
                AssetExtractor assetExtractor = new AssetExtractor();
                assetExtractor.setDataSource(this.videoPath);
                ExtractorWrapper extractorWrapper = new ExtractorWrapper(this.videoPath);
                extractorWrapper.checkAndLoad(assetExtractor);
                ExtractorWrapperPool.put(extractorWrapper);
                assetExtractor.dispose();
            }
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("ExtractorLoader");
        loadThread = handlerThread;
        handlerThread.start();
    }

    public static void cacheExtractor(String str) {
        checkAndStart();
        loadHandler.post(new VideoPathLoaderRunnable(str));
    }

    private static void checkAndStart() {
        if (loadHandler == null && loadThread.getLooper() != null) {
            loadHandler = new Handler(loadThread.getLooper());
        }
    }

    public static void cacheExtractor(AssetExtractor assetExtractor) {
        checkAndStart();
        loadHandler.post(new ExtractorLoaderRunnable(assetExtractor));
    }
}
