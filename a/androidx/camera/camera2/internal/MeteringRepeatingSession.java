package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C16537h;
import androidx.camera.core.impl.C16539j;
import androidx.camera.core.impl.C16540k;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.C16559b;
import androidx.camera.core.internal.C16561d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

class MeteringRepeatingSession {
    private static final String TAG = "MeteringRepeating";
    private DeferrableSurface mDeferrableSurface;
    private final SessionConfig mSessionConfig;
    private final SupportedRepeatingSurfaceSize mSupportedRepeatingSurfaceSize = new SupportedRepeatingSurfaceSize();

    public static class MeteringRepeatingConfig implements UseCaseConfig<UseCase> {
        private final Config mConfig;

        public MeteringRepeatingConfig() {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, new Camera2SessionOptionUnpacker());
            this.mConfig = create;
        }

        public /* synthetic */ boolean containsOption(Config.Option option) {
            return C16539j.m15570a(this, option);
        }

        public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
            C16539j.m15571b(this, str, optionMatcher);
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

        public /* synthetic */ SessionConfig getDefaultSessionConfig() {
            return C16540k.m15584g(this);
        }

        public /* synthetic */ SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig) {
            return C16540k.m15585h(this, sessionConfig);
        }

        public /* synthetic */ int getInputFormat() {
            return C16537h.m15556a(this);
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

        public /* synthetic */ int getSurfaceOccupancyPriority() {
            return C16540k.m15588k(this);
        }

        public /* synthetic */ int getSurfaceOccupancyPriority(int i) {
            return C16540k.m15589l(this, i);
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

        public /* synthetic */ UseCase.EventCallback getUseCaseEventCallback() {
            return C16561d.m15605a(this);
        }

        public /* synthetic */ UseCase.EventCallback getUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            return C16561d.m15606b(this, eventCallback);
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
    }

    public MeteringRepeatingSession(CameraCharacteristicsCompat cameraCharacteristicsCompat, DisplayInfoManager displayInfoManager) {
        MeteringRepeatingConfig meteringRepeatingConfig = new MeteringRepeatingConfig();
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size properPreviewSize = getProperPreviewSize(cameraCharacteristicsCompat, displayInfoManager);
        Logger.m15471d(TAG, "MeteringSession SurfaceTexture size: " + properPreviewSize);
        surfaceTexture.setDefaultBufferSize(properPreviewSize.getWidth(), properPreviewSize.getHeight());
        final Surface surface = new Surface(surfaceTexture);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(meteringRepeatingConfig);
        createFrom.setTemplateType(1);
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.mDeferrableSurface = immediateSurface;
        Futures.addCallback(immediateSurface.getTerminationFuture(), new FutureCallback<Void>() {
            public void onFailure(Throwable th) {
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            }

            public void onSuccess(Void voidR) {
                surface.release();
                surfaceTexture.release();
            }
        }, CameraXExecutors.directExecutor());
        createFrom.addSurface(this.mDeferrableSurface);
        this.mSessionConfig = createFrom.build();
    }

    private Size getProperPreviewSize(CameraCharacteristicsCompat cameraCharacteristicsCompat, DisplayInfoManager displayInfoManager) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            Logger.m15473e(TAG, "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        Size[] outputSizes = Build.VERSION.SDK_INT < 23 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(34);
        if (outputSizes == null) {
            Logger.m15473e(TAG, "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] supportedSizes = this.mSupportedRepeatingSurfaceSize.getSupportedSizes(outputSizes);
        List asList = Arrays.asList(supportedSizes);
        Collections.sort(asList, new MeteringRepeatingSession$$a());
        Size previewSize = displayInfoManager.getPreviewSize();
        long min = Math.min(((long) previewSize.getWidth()) * ((long) previewSize.getHeight()), 307200);
        Size size = null;
        int length = supportedSizes.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Size size2 = supportedSizes[i];
            int i2 = ((((long) size2.getWidth()) * ((long) size2.getHeight())) > min ? 1 : ((((long) size2.getWidth()) * ((long) size2.getHeight())) == min ? 0 : -1));
            if (i2 == 0) {
                return size2;
            }
            if (i2 <= 0) {
                i++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) asList.get(0);
    }

    public void clear() {
        Logger.m15471d(TAG, "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        this.mDeferrableSurface = null;
    }

    public String getName() {
        return TAG;
    }

    public SessionConfig getSessionConfig() {
        return this.mSessionConfig;
    }
}
