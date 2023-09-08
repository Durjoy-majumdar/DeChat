package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.internal.C16559b;
import androidx.camera.core.internal.C16561d;
import androidx.camera.core.internal.IoConfig;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class ImageCaptureConfig implements UseCaseConfig<ImageCapture>, ImageOutputConfig, IoConfig {
    public static final Config.Option<Integer> OPTION_BUFFER_FORMAT;
    public static final Config.Option<CaptureBundle> OPTION_CAPTURE_BUNDLE = Config.Option.create("camerax.core.imageCapture.captureBundle", CaptureBundle.class);
    public static final Config.Option<CaptureProcessor> OPTION_CAPTURE_PROCESSOR = Config.Option.create("camerax.core.imageCapture.captureProcessor", CaptureProcessor.class);
    public static final Config.Option<Integer> OPTION_FLASH_MODE;
    public static final Config.Option<Integer> OPTION_FLASH_TYPE;
    public static final Config.Option<Integer> OPTION_IMAGE_CAPTURE_MODE;
    public static final Config.Option<ImageReaderProxyProvider> OPTION_IMAGE_READER_PROXY_PROVIDER = Config.Option.create("camerax.core.imageCapture.imageReaderProxyProvider", ImageReaderProxyProvider.class);
    public static final Config.Option<Integer> OPTION_JPEG_COMPRESSION_QUALITY;
    public static final Config.Option<Integer> OPTION_MAX_CAPTURE_STAGES;
    public static final Config.Option<Boolean> OPTION_SESSION_PROCESSOR_ENABLED;
    public static final Config.Option<Boolean> OPTION_USE_SOFTWARE_JPEG_ENCODER;
    private final OptionsBundle mConfig;

    static {
        Class<Integer> cls = Integer.class;
        Class cls2 = Integer.TYPE;
        OPTION_IMAGE_CAPTURE_MODE = Config.Option.create("camerax.core.imageCapture.captureMode", cls2);
        OPTION_FLASH_MODE = Config.Option.create("camerax.core.imageCapture.flashMode", cls2);
        OPTION_BUFFER_FORMAT = Config.Option.create("camerax.core.imageCapture.bufferFormat", cls);
        OPTION_MAX_CAPTURE_STAGES = Config.Option.create("camerax.core.imageCapture.maxCaptureStages", cls);
        Class cls3 = Boolean.TYPE;
        OPTION_USE_SOFTWARE_JPEG_ENCODER = Config.Option.create("camerax.core.imageCapture.useSoftwareJpegEncoder", cls3);
        OPTION_FLASH_TYPE = Config.Option.create("camerax.core.imageCapture.flashType", cls2);
        OPTION_JPEG_COMPRESSION_QUALITY = Config.Option.create("camerax.core.imageCapture.jpegCompressionQuality", cls2);
        OPTION_SESSION_PROCESSOR_ENABLED = Config.Option.create("camerax.core.imageCapture.sessionProcessorEnabled", cls3);
    }

    public ImageCaptureConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    public /* synthetic */ boolean containsOption(Config.Option option) {
        return C16539j.m15570a(this, option);
    }

    public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        C16539j.m15571b(this, str, optionMatcher);
    }

    public /* synthetic */ int getAppTargetRotation(int i) {
        return C16538i.m15557a(this, i);
    }

    public Integer getBufferFormat(Integer num) {
        return (Integer) C16539j.m15576g(this, OPTION_BUFFER_FORMAT, num);
    }

    public /* synthetic */ CameraSelector getCameraSelector() {
        return C16540k.m15578a(this);
    }

    public /* synthetic */ CameraSelector getCameraSelector(CameraSelector cameraSelector) {
        return C16540k.m15579b(this, cameraSelector);
    }

    public CaptureBundle getCaptureBundle(CaptureBundle captureBundle) {
        return (CaptureBundle) C16539j.m15576g(this, OPTION_CAPTURE_BUNDLE, captureBundle);
    }

    public int getCaptureMode() {
        return ((Integer) C16539j.m15575f(this, OPTION_IMAGE_CAPTURE_MODE)).intValue();
    }

    public /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
        return C16540k.m15580c(this);
    }

    public /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
        return C16540k.m15581d(this, optionUnpacker);
    }

    public CaptureProcessor getCaptureProcessor(CaptureProcessor captureProcessor) {
        return (CaptureProcessor) C16539j.m15576g(this, OPTION_CAPTURE_PROCESSOR, captureProcessor);
    }

    public Config getConfig() {
        return this.mConfig;
    }

    public /* synthetic */ CaptureConfig getDefaultCaptureConfig() {
        return C16540k.m15582e(this);
    }

    public /* synthetic */ CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig) {
        return C16540k.m15583f(this, captureConfig);
    }

    public /* synthetic */ Size getDefaultResolution() {
        return C16538i.m15558b(this);
    }

    public /* synthetic */ Size getDefaultResolution(Size size) {
        return C16538i.m15559c(this, size);
    }

    public /* synthetic */ SessionConfig getDefaultSessionConfig() {
        return C16540k.m15584g(this);
    }

    public /* synthetic */ SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig) {
        return C16540k.m15585h(this, sessionConfig);
    }

    public int getFlashMode(int i) {
        return ((Integer) C16539j.m15576g(this, OPTION_FLASH_MODE, Integer.valueOf(i))).intValue();
    }

    public int getFlashType(int i) {
        return ((Integer) C16539j.m15576g(this, OPTION_FLASH_TYPE, Integer.valueOf(i))).intValue();
    }

    public ImageReaderProxyProvider getImageReaderProxyProvider() {
        return (ImageReaderProxyProvider) C16539j.m15576g(this, OPTION_IMAGE_READER_PROXY_PROVIDER, (Object) null);
    }

    public int getInputFormat() {
        return ((Integer) C16539j.m15575f(this, ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
    }

    public Executor getIoExecutor(Executor executor) {
        return (Executor) C16539j.m15576g(this, IoConfig.OPTION_IO_EXECUTOR, executor);
    }

    public int getJpegQuality(int i) {
        return ((Integer) C16539j.m15576g(this, OPTION_JPEG_COMPRESSION_QUALITY, Integer.valueOf(i))).intValue();
    }

    public int getMaxCaptureStages(int i) {
        return ((Integer) C16539j.m15576g(this, OPTION_MAX_CAPTURE_STAGES, Integer.valueOf(i))).intValue();
    }

    public /* synthetic */ Size getMaxResolution() {
        return C16538i.m15560d(this);
    }

    public /* synthetic */ Size getMaxResolution(Size size) {
        return C16538i.m15561e(this, size);
    }

    public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return C16539j.m15572c(this, option);
    }

    public /* synthetic */ Set getPriorities(Config.Option option) {
        return C16539j.m15573d(this, option);
    }

    public /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
        return C16540k.m15586i(this);
    }

    public /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
        return C16540k.m15587j(this, optionUnpacker);
    }

    public /* synthetic */ List getSupportedResolutions() {
        return C16538i.m15562f(this);
    }

    public /* synthetic */ List getSupportedResolutions(List list) {
        return C16538i.m15563g(this, list);
    }

    public /* synthetic */ int getSurfaceOccupancyPriority() {
        return C16540k.m15588k(this);
    }

    public /* synthetic */ int getSurfaceOccupancyPriority(int i) {
        return C16540k.m15589l(this, i);
    }

    public /* synthetic */ int getTargetAspectRatio() {
        return C16538i.m15564h(this);
    }

    public /* synthetic */ Class getTargetClass() {
        return C16559b.m15598a(this);
    }

    public /* synthetic */ Class getTargetClass(Class cls) {
        return C16559b.m15599b(this, cls);
    }

    public /* synthetic */ Range getTargetFramerate() {
        return C16540k.m15590m(this);
    }

    public /* synthetic */ Range getTargetFramerate(Range range) {
        return C16540k.m15591n(this, range);
    }

    public /* synthetic */ String getTargetName() {
        return C16559b.m15600c(this);
    }

    public /* synthetic */ String getTargetName(String str) {
        return C16559b.m15601d(this, str);
    }

    public /* synthetic */ Size getTargetResolution() {
        return C16538i.m15565i(this);
    }

    public /* synthetic */ Size getTargetResolution(Size size) {
        return C16538i.m15566j(this, size);
    }

    public /* synthetic */ int getTargetRotation() {
        return C16538i.m15567k(this);
    }

    public /* synthetic */ int getTargetRotation(int i) {
        return C16538i.m15568l(this, i);
    }

    public /* synthetic */ UseCase.EventCallback getUseCaseEventCallback() {
        return C16561d.m15605a(this);
    }

    public /* synthetic */ UseCase.EventCallback getUseCaseEventCallback(UseCase.EventCallback eventCallback) {
        return C16561d.m15606b(this, eventCallback);
    }

    public boolean hasCaptureMode() {
        return C16539j.m15570a(this, OPTION_IMAGE_CAPTURE_MODE);
    }

    public /* synthetic */ boolean hasTargetAspectRatio() {
        return C16538i.m15569m(this);
    }

    public boolean isSessionProcessorEnabled() {
        return ((Boolean) C16539j.m15576g(this, OPTION_SESSION_PROCESSOR_ENABLED, Boolean.FALSE)).booleanValue();
    }

    public boolean isSoftwareJpegEncoderRequested() {
        return ((Boolean) C16539j.m15576g(this, OPTION_USE_SOFTWARE_JPEG_ENCODER, Boolean.FALSE)).booleanValue();
    }

    public /* synthetic */ Set listOptions() {
        return C16539j.m15574e(this);
    }

    public /* synthetic */ Object retrieveOption(Config.Option option) {
        return C16539j.m15575f(this, option);
    }

    public /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
        return C16539j.m15576g(this, option, obj);
    }

    public /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
        return C16539j.m15577h(this, option, optionPriority);
    }

    public Integer getBufferFormat() {
        return (Integer) C16539j.m15575f(this, OPTION_BUFFER_FORMAT);
    }

    public CaptureBundle getCaptureBundle() {
        return (CaptureBundle) C16539j.m15575f(this, OPTION_CAPTURE_BUNDLE);
    }

    public CaptureProcessor getCaptureProcessor() {
        return (CaptureProcessor) C16539j.m15575f(this, OPTION_CAPTURE_PROCESSOR);
    }

    public int getFlashMode() {
        return ((Integer) C16539j.m15575f(this, OPTION_FLASH_MODE)).intValue();
    }

    public int getFlashType() {
        return ((Integer) C16539j.m15575f(this, OPTION_FLASH_TYPE)).intValue();
    }

    public Executor getIoExecutor() {
        return (Executor) C16539j.m15575f(this, IoConfig.OPTION_IO_EXECUTOR);
    }

    public int getJpegQuality() {
        return ((Integer) C16539j.m15575f(this, OPTION_JPEG_COMPRESSION_QUALITY)).intValue();
    }

    public int getMaxCaptureStages() {
        return ((Integer) C16539j.m15575f(this, OPTION_MAX_CAPTURE_STAGES)).intValue();
    }
}
