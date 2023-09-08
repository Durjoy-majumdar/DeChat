package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C16536g;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.C16560c;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.UseCaseEventConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class ImageAnalysis extends UseCase {
    public static final int COORDINATE_SYSTEM_ORIGINAL = 0;
    private static final int DEFAULT_BACKPRESSURE_STRATEGY = 0;
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final int DEFAULT_IMAGE_QUEUE_DEPTH = 6;
    private static final Boolean DEFAULT_ONE_PIXEL_SHIFT_ENABLED = null;
    private static final int DEFAULT_OUTPUT_IMAGE_FORMAT = 1;
    private static final boolean DEFAULT_OUTPUT_IMAGE_ROTATION_ENABLED = false;
    private static final int NON_BLOCKING_IMAGE_DEPTH = 4;
    public static final int OUTPUT_IMAGE_FORMAT_RGBA_8888 = 2;
    public static final int OUTPUT_IMAGE_FORMAT_YUV_420_888 = 1;
    public static final int STRATEGY_BLOCK_PRODUCER = 1;
    public static final int STRATEGY_KEEP_ONLY_LATEST = 0;
    private static final String TAG = "ImageAnalysis";
    private final Object mAnalysisLock = new Object();
    private DeferrableSurface mDeferrableSurface;
    public final ImageAnalysisAbstractAnalyzer mImageAnalysisAbstractAnalyzer;
    private Analyzer mSubscribedAnalyzer;

    public interface Analyzer {
        void analyze(ImageProxy imageProxy);

        int getTargetCoordinateSystem();

        Size getTargetResolutionOverride();

        void updateTransform(Matrix matrix);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BackpressureStrategy {
    }

    public static final class Builder implements ImageOutputConfig.Builder<Builder>, ThreadConfig.Builder<Builder>, UseCaseConfig.Builder<ImageAnalysis, ImageAnalysisConfig, Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        public static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public Builder setBackpressureStrategy(int i) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY, Integer.valueOf(i));
            return this;
        }

        public Builder setImageQueueDepth(int i) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH, Integer.valueOf(i));
            return this;
        }

        public Builder setImageReaderProxyProvider(ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        public Builder setOnePixelShiftEnabled(boolean z) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_ONE_PIXEL_SHIFT_ENABLED, Boolean.valueOf(z));
            return this;
        }

        public Builder setOutputImageFormat(int i) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_FORMAT, Integer.valueOf(i));
            return this;
        }

        public Builder setOutputImageRotationEnabled(boolean z) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, Boolean.valueOf(z));
            return this;
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            Class<ImageAnalysis> cls = ImageAnalysis.class;
            this.mMutableConfig = mutableOptionsBundle;
            Class cls2 = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls2 == null || cls2.equals(cls)) {
                setTargetClass(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        public static Builder fromConfig(ImageAnalysisConfig imageAnalysisConfig) {
            return new Builder(MutableOptionsBundle.from(imageAnalysisConfig));
        }

        public ImageAnalysis build() {
            if (getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, null) == null || getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null) == null) {
                return new ImageAnalysis(getUseCaseConfig());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        public ImageAnalysisConfig getUseCaseConfig() {
            return new ImageAnalysisConfig(OptionsBundle.from(this.mMutableConfig));
        }

        public Builder setBackgroundExecutor(Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        public Builder setCameraSelector(CameraSelector cameraSelector) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
            return this;
        }

        public Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        public Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        public Builder setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        public Builder setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        public Builder setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        public Builder setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        public Builder setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetAspectRatio(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetClass(Class<ImageAnalysis> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        public Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        public Builder setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            getMutableConfig().insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }
    }

    public static final class Defaults implements ConfigProvider<ImageAnalysisConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final ImageAnalysisConfig DEFAULT_CONFIG;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 1;
        private static final Size DEFAULT_TARGET_RESOLUTION;

        static {
            Size size = new Size(640, 480);
            DEFAULT_TARGET_RESOLUTION = size;
            DEFAULT_CONFIG = new Builder().setDefaultResolution(size).setSurfaceOccupancyPriority(1).setTargetAspectRatio(0).getUseCaseConfig();
        }

        public ImageAnalysisConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputImageFormat {
    }

    public ImageAnalysis(ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        if (((ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0) == 1) {
            this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisBlockingAnalyzer();
        } else {
            Executor highPriorityExecutor = CameraXExecutors.highPriorityExecutor();
            imageAnalysisConfig.getClass();
            this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisNonBlockingAnalyzer(C16560c.m15603b(imageAnalysisConfig, highPriorityExecutor));
        }
        this.mImageAnalysisAbstractAnalyzer.setOutputImageFormat(getOutputImageFormat());
        this.mImageAnalysisAbstractAnalyzer.setOutputImageRotationEnabled(isOutputImageRotationEnabled());
    }

    private boolean isFlipWH(CameraInternal cameraInternal) {
        return isOutputImageRotationEnabled() && getRelativeRotation(cameraInternal) % 180 != 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$createPipeline$0(SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        safeCloseImageReaderProxy.safeClose();
        if (safeCloseImageReaderProxy2 != null) {
            safeCloseImageReaderProxy2.safeClose();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createPipeline$1(String str, ImageAnalysisConfig imageAnalysisConfig, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        clearPipeline();
        this.mImageAnalysisAbstractAnalyzer.clearCache();
        if (isCurrentCamera(str)) {
            updateSessionConfig(createPipeline(str, imageAnalysisConfig, size).build());
            notifyReset();
        }
    }

    private void tryUpdateRelativeRotation() {
        CameraInternal camera = getCamera();
        if (camera != null) {
            this.mImageAnalysisAbstractAnalyzer.setRelativeRotation(getRelativeRotation(camera));
        }
    }

    public void clearAnalyzer() {
        synchronized (this.mAnalysisLock) {
            this.mImageAnalysisAbstractAnalyzer.setAnalyzer((Executor) null, (Analyzer) null);
            if (this.mSubscribedAnalyzer != null) {
                notifyInactive();
            }
            this.mSubscribedAnalyzer = null;
        }
    }

    public void clearPipeline() {
        Threads.checkMainThread();
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
        }
    }

    public SessionConfig.Builder createPipeline(String str, ImageAnalysisConfig imageAnalysisConfig, Size size) {
        Threads.checkMainThread();
        Executor highPriorityExecutor = CameraXExecutors.highPriorityExecutor();
        imageAnalysisConfig.getClass();
        Executor b = C16560c.m15603b(imageAnalysisConfig, highPriorityExecutor);
        b.getClass();
        boolean z = true;
        int imageQueueDepth = getBackpressureStrategy() == 1 ? getImageQueueDepth() : 4;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = imageAnalysisConfig.getImageReaderProxyProvider() != null ? new SafeCloseImageReaderProxy(imageAnalysisConfig.getImageReaderProxyProvider().newInstance(size.getWidth(), size.getHeight(), getImageFormat(), imageQueueDepth, 0)) : new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(size.getWidth(), size.getHeight(), getImageFormat(), imageQueueDepth));
        boolean isFlipWH = getCamera() != null ? isFlipWH(getCamera()) : false;
        int height = isFlipWH ? size.getHeight() : size.getWidth();
        int width = isFlipWH ? size.getWidth() : size.getHeight();
        int i = getOutputImageFormat() == 2 ? 1 : 35;
        boolean z2 = getImageFormat() == 35 && getOutputImageFormat() == 2;
        if (getImageFormat() != 35 || ((getCamera() == null || getRelativeRotation(getCamera()) == 0) && !Boolean.TRUE.equals(getOnePixelShiftEnabled()))) {
            z = false;
        }
        SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = (z2 || z) ? new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(height, width, i, safeCloseImageReaderProxy.getMaxImages())) : null;
        if (safeCloseImageReaderProxy2 != null) {
            this.mImageAnalysisAbstractAnalyzer.setProcessedImageReaderProxy(safeCloseImageReaderProxy2);
        }
        tryUpdateRelativeRotation();
        safeCloseImageReaderProxy.setOnImageAvailableListener(this.mImageAnalysisAbstractAnalyzer, b);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(imageAnalysisConfig);
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        ImmediateSurface immediateSurface = new ImmediateSurface(safeCloseImageReaderProxy.getSurface(), size, getImageFormat());
        this.mDeferrableSurface = immediateSurface;
        immediateSurface.getTerminationFuture().addListener(new ImageAnalysis$$a(safeCloseImageReaderProxy, safeCloseImageReaderProxy2), CameraXExecutors.mainThreadExecutor());
        createFrom.addSurface(this.mDeferrableSurface);
        createFrom.addErrorListener(new ImageAnalysis$$b(this, str, imageAnalysisConfig, size));
        return createFrom;
    }

    public int getBackpressureStrategy() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0);
    }

    public UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS, 1);
        if (z) {
            config = C16536g.m15555b(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getImageQueueDepth() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getImageQueueDepth(6);
    }

    public Boolean getOnePixelShiftEnabled() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getOnePixelShiftEnabled(DEFAULT_ONE_PIXEL_SHIFT_ENABLED);
    }

    public int getOutputImageFormat() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getOutputImageFormat(1);
    }

    public ResolutionInfo getResolutionInfo() {
        return super.getResolutionInfo();
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    public boolean isOutputImageRotationEnabled() {
        return ((ImageAnalysisConfig) getCurrentConfig()).isOutputImageRotationEnabled(Boolean.FALSE).booleanValue();
    }

    public void onAttached() {
        this.mImageAnalysisAbstractAnalyzer.attach();
    }

    public void onDetached() {
        clearPipeline();
        this.mImageAnalysisAbstractAnalyzer.detach();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.camera.core.impl.UseCaseConfig$Builder, androidx.camera.core.ExtendableBuilder, androidx.camera.core.impl.UseCaseConfig$Builder<?, ?, ?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal r3, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r4) {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.getOnePixelShiftEnabled()
            androidx.camera.core.impl.Quirks r3 = r3.getCameraQuirks()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk> r1 = androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk.class
            boolean r3 = r3.contains(r1)
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r1 = r2.mImageAnalysisAbstractAnalyzer
            if (r0 != 0) goto L_0x0013
            goto L_0x0017
        L_0x0013:
            boolean r3 = r0.booleanValue()
        L_0x0017:
            r1.setOnePixelShiftEnabled(r3)
            java.lang.Object r3 = r2.mAnalysisLock
            monitor-enter(r3)
            androidx.camera.core.ImageAnalysis$Analyzer r0 = r2.mSubscribedAnalyzer     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0026
            android.util.Size r0 = r0.getTargetResolutionOverride()     // Catch:{ all -> 0x0038 }
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0033
            androidx.camera.core.impl.MutableConfig r3 = r4.getMutableConfig()
            androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION
            r3.insertOption(r1, r0)
        L_0x0033:
            androidx.camera.core.impl.UseCaseConfig r3 = r4.getUseCaseConfig()
            return r3
        L_0x0038:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageAnalysis.onMergeConfig(androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.impl.UseCaseConfig$Builder):androidx.camera.core.impl.UseCaseConfig");
    }

    public Size onSuggestedResolutionUpdated(Size size) {
        updateSessionConfig(createPipeline(getCameraId(), (ImageAnalysisConfig) getCurrentConfig(), size).build());
        return size;
    }

    public void setAnalyzer(Executor executor, Analyzer analyzer) {
        synchronized (this.mAnalysisLock) {
            this.mImageAnalysisAbstractAnalyzer.setAnalyzer(executor, new ImageAnalysis$$c(analyzer));
            if (this.mSubscribedAnalyzer == null) {
                notifyActive();
            }
            this.mSubscribedAnalyzer = analyzer;
        }
    }

    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        this.mImageAnalysisAbstractAnalyzer.setSensorToBufferTransformMatrix(matrix);
    }

    public void setTargetRotation(int i) {
        if (setTargetRotationInternal(i)) {
            tryUpdateRelativeRotation();
        }
    }

    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        this.mImageAnalysisAbstractAnalyzer.setViewPortCropRect(rect);
    }

    public String toString() {
        return "ImageAnalysis:" + getName();
    }
}
