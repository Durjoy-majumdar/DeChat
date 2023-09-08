package androidx.camera.core;

import android.os.Handler;
import androidx.camera.core.impl.C16539j;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.C16559b;
import androidx.camera.core.internal.TargetConfig;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class CameraXConfig implements TargetConfig<CameraX> {
    public static final Config.Option<CameraSelector> OPTION_AVAILABLE_CAMERAS_LIMITER = Config.Option.create("camerax.core.appConfig.availableCamerasLimiter", CameraSelector.class);
    public static final Config.Option<Executor> OPTION_CAMERA_EXECUTOR = Config.Option.create("camerax.core.appConfig.cameraExecutor", Executor.class);
    public static final Config.Option<CameraFactory.Provider> OPTION_CAMERA_FACTORY_PROVIDER = Config.Option.create("camerax.core.appConfig.cameraFactoryProvider", CameraFactory.Provider.class);
    public static final Config.Option<CameraDeviceSurfaceManager.Provider> OPTION_DEVICE_SURFACE_MANAGER_PROVIDER = Config.Option.create("camerax.core.appConfig.deviceSurfaceManagerProvider", CameraDeviceSurfaceManager.Provider.class);
    public static final Config.Option<Integer> OPTION_MIN_LOGGING_LEVEL = Config.Option.create("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);
    public static final Config.Option<Handler> OPTION_SCHEDULER_HANDLER = Config.Option.create("camerax.core.appConfig.schedulerHandler", Handler.class);
    public static final Config.Option<UseCaseConfigFactory.Provider> OPTION_USECASE_CONFIG_FACTORY_PROVIDER = Config.Option.create("camerax.core.appConfig.useCaseConfigFactoryProvider", UseCaseConfigFactory.Provider.class);
    private final OptionsBundle mConfig;

    public static final class Builder implements TargetConfig.Builder<CameraX, Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        public static Builder fromConfig(CameraXConfig cameraXConfig) {
            return new Builder(MutableOptionsBundle.from(cameraXConfig));
        }

        private MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public CameraXConfig build() {
            return new CameraXConfig(OptionsBundle.from(this.mMutableConfig));
        }

        public Builder setAvailableCamerasLimiter(CameraSelector cameraSelector) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_AVAILABLE_CAMERAS_LIMITER, cameraSelector);
            return this;
        }

        public Builder setCameraExecutor(Executor executor) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_CAMERA_EXECUTOR, executor);
            return this;
        }

        public Builder setCameraFactoryProvider(CameraFactory.Provider provider) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_CAMERA_FACTORY_PROVIDER, provider);
            return this;
        }

        public Builder setDeviceSurfaceManagerProvider(CameraDeviceSurfaceManager.Provider provider) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_DEVICE_SURFACE_MANAGER_PROVIDER, provider);
            return this;
        }

        public Builder setMinimumLoggingLevel(int i) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_MIN_LOGGING_LEVEL, Integer.valueOf(i));
            return this;
        }

        public Builder setSchedulerHandler(Handler handler) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_SCHEDULER_HANDLER, handler);
            return this;
        }

        public Builder setUseCaseConfigFactoryProvider(UseCaseConfigFactory.Provider provider) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_USECASE_CONFIG_FACTORY_PROVIDER, provider);
            return this;
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            Class<CameraX> cls = CameraX.class;
            this.mMutableConfig = mutableOptionsBundle;
            Class cls2 = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls2 == null || cls2.equals(cls)) {
                setTargetClass(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        public Builder setTargetClass(Class<CameraX> cls) {
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
    }

    public interface Provider {
        CameraXConfig getCameraXConfig();
    }

    public CameraXConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    public /* synthetic */ boolean containsOption(Config.Option option) {
        return C16539j.m15570a(this, option);
    }

    public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        C16539j.m15571b(this, str, optionMatcher);
    }

    public CameraSelector getAvailableCamerasLimiter(CameraSelector cameraSelector) {
        return (CameraSelector) this.mConfig.retrieveOption(OPTION_AVAILABLE_CAMERAS_LIMITER, cameraSelector);
    }

    public Executor getCameraExecutor(Executor executor) {
        return (Executor) this.mConfig.retrieveOption(OPTION_CAMERA_EXECUTOR, executor);
    }

    public CameraFactory.Provider getCameraFactoryProvider(CameraFactory.Provider provider) {
        return (CameraFactory.Provider) this.mConfig.retrieveOption(OPTION_CAMERA_FACTORY_PROVIDER, provider);
    }

    public Config getConfig() {
        return this.mConfig;
    }

    public CameraDeviceSurfaceManager.Provider getDeviceSurfaceManagerProvider(CameraDeviceSurfaceManager.Provider provider) {
        return (CameraDeviceSurfaceManager.Provider) this.mConfig.retrieveOption(OPTION_DEVICE_SURFACE_MANAGER_PROVIDER, provider);
    }

    public int getMinimumLoggingLevel() {
        return ((Integer) this.mConfig.retrieveOption(OPTION_MIN_LOGGING_LEVEL, 3)).intValue();
    }

    public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return C16539j.m15572c(this, option);
    }

    public /* synthetic */ Set getPriorities(Config.Option option) {
        return C16539j.m15573d(this, option);
    }

    public Handler getSchedulerHandler(Handler handler) {
        return (Handler) this.mConfig.retrieveOption(OPTION_SCHEDULER_HANDLER, handler);
    }

    public /* synthetic */ Class getTargetClass() {
        return C16559b.m15598a(this);
    }

    public /* synthetic */ Class getTargetClass(Class cls) {
        return C16559b.m15599b(this, cls);
    }

    public /* synthetic */ String getTargetName() {
        return C16559b.m15600c(this);
    }

    public /* synthetic */ String getTargetName(String str) {
        return C16559b.m15601d(this, str);
    }

    public UseCaseConfigFactory.Provider getUseCaseConfigFactoryProvider(UseCaseConfigFactory.Provider provider) {
        return (UseCaseConfigFactory.Provider) this.mConfig.retrieveOption(OPTION_USECASE_CONFIG_FACTORY_PROVIDER, provider);
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
