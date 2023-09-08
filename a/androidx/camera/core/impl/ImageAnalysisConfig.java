package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.internal.C16559b;
import androidx.camera.core.internal.C16560c;
import androidx.camera.core.internal.C16561d;
import androidx.camera.core.internal.ThreadConfig;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class ImageAnalysisConfig implements UseCaseConfig<ImageAnalysis>, ImageOutputConfig, ThreadConfig {
    public static final Config.Option<Integer> OPTION_BACKPRESSURE_STRATEGY = Config.Option.create("camerax.core.imageAnalysis.backpressureStrategy", ImageAnalysis.BackpressureStrategy.class);
    public static final Config.Option<Integer> OPTION_IMAGE_QUEUE_DEPTH = Config.Option.create("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final Config.Option<ImageReaderProxyProvider> OPTION_IMAGE_READER_PROXY_PROVIDER = Config.Option.create("camerax.core.imageAnalysis.imageReaderProxyProvider", ImageReaderProxyProvider.class);
    public static final Config.Option<Boolean> OPTION_ONE_PIXEL_SHIFT_ENABLED;
    public static final Config.Option<Integer> OPTION_OUTPUT_IMAGE_FORMAT = Config.Option.create("camerax.core.imageAnalysis.outputImageFormat", ImageAnalysis.OutputImageFormat.class);
    public static final Config.Option<Boolean> OPTION_OUTPUT_IMAGE_ROTATION_ENABLED;
    private final OptionsBundle mConfig;

    static {
        Class<Boolean> cls = Boolean.class;
        OPTION_ONE_PIXEL_SHIFT_ENABLED = Config.Option.create("camerax.core.imageAnalysis.onePixelShiftEnabled", cls);
        OPTION_OUTPUT_IMAGE_ROTATION_ENABLED = Config.Option.create("camerax.core.imageAnalysis.outputImageRotationEnabled", cls);
    }

    public ImageAnalysisConfig(OptionsBundle optionsBundle) {
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

    public /* synthetic */ Executor getBackgroundExecutor() {
        return C16560c.m15602a(this);
    }

    public /* synthetic */ Executor getBackgroundExecutor(Executor executor) {
        return C16560c.m15603b(this, executor);
    }

    public int getBackpressureStrategy(int i) {
        return ((Integer) C16539j.m15576g(this, OPTION_BACKPRESSURE_STRATEGY, Integer.valueOf(i))).intValue();
    }

    public /* synthetic */ CameraSelector getCameraSelector() {
        return C16540k.m15578a(this);
    }

    public /* synthetic */ CameraSelector getCameraSelector(CameraSelector cameraSelector) {
        return C16540k.m15579b(this, cameraSelector);
    }

    public /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
        return C16540k.m15580c(this);
    }

    public /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
        return C16540k.m15581d(this, optionUnpacker);
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

    public int getImageQueueDepth(int i) {
        return ((Integer) C16539j.m15576g(this, OPTION_IMAGE_QUEUE_DEPTH, Integer.valueOf(i))).intValue();
    }

    public ImageReaderProxyProvider getImageReaderProxyProvider() {
        return (ImageReaderProxyProvider) C16539j.m15576g(this, OPTION_IMAGE_READER_PROXY_PROVIDER, (Object) null);
    }

    public int getInputFormat() {
        return 35;
    }

    public /* synthetic */ Size getMaxResolution() {
        return C16538i.m15560d(this);
    }

    public /* synthetic */ Size getMaxResolution(Size size) {
        return C16538i.m15561e(this, size);
    }

    public Boolean getOnePixelShiftEnabled(Boolean bool) {
        return (Boolean) C16539j.m15576g(this, OPTION_ONE_PIXEL_SHIFT_ENABLED, bool);
    }

    public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return C16539j.m15572c(this, option);
    }

    public int getOutputImageFormat(int i) {
        return ((Integer) C16539j.m15576g(this, OPTION_OUTPUT_IMAGE_FORMAT, Integer.valueOf(i))).intValue();
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

    public /* synthetic */ boolean hasTargetAspectRatio() {
        return C16538i.m15569m(this);
    }

    public Boolean isOutputImageRotationEnabled(Boolean bool) {
        return (Boolean) C16539j.m15576g(this, OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, bool);
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

    public int getBackpressureStrategy() {
        return ((Integer) C16539j.m15575f(this, OPTION_BACKPRESSURE_STRATEGY)).intValue();
    }

    public int getImageQueueDepth() {
        return ((Integer) C16539j.m15575f(this, OPTION_IMAGE_QUEUE_DEPTH)).intValue();
    }
}
