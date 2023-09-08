package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.AspectRatio;
import androidx.camera.core.impl.Config;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface ImageOutputConfig extends ReadableConfig {
    public static final int INVALID_ROTATION = -1;
    public static final Config.Option<Integer> OPTION_APP_TARGET_ROTATION;
    public static final Config.Option<Size> OPTION_DEFAULT_RESOLUTION = Config.Option.create("camerax.core.imageOutput.defaultResolution", Size.class);
    public static final Config.Option<Size> OPTION_MAX_RESOLUTION = Config.Option.create("camerax.core.imageOutput.maxResolution", Size.class);
    public static final Config.Option<List<Pair<Integer, Size[]>>> OPTION_SUPPORTED_RESOLUTIONS = Config.Option.create("camerax.core.imageOutput.supportedResolutions", List.class);
    public static final Config.Option<Integer> OPTION_TARGET_ASPECT_RATIO = Config.Option.create("camerax.core.imageOutput.targetAspectRatio", AspectRatio.class);
    public static final Config.Option<Size> OPTION_TARGET_RESOLUTION = Config.Option.create("camerax.core.imageOutput.targetResolution", Size.class);
    public static final Config.Option<Integer> OPTION_TARGET_ROTATION;
    public static final int ROTATION_NOT_SPECIFIED = -1;

    public interface Builder<B> {
        B setDefaultResolution(Size size);

        B setMaxResolution(Size size);

        B setSupportedResolutions(List<Pair<Integer, Size[]>> list);

        B setTargetAspectRatio(int i);

        B setTargetResolution(Size size);

        B setTargetRotation(int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OptionalRotationValue {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationDegreesValue {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationValue {
    }

    static {
        Class cls = Integer.TYPE;
        OPTION_TARGET_ROTATION = Config.Option.create("camerax.core.imageOutput.targetRotation", cls);
        OPTION_APP_TARGET_ROTATION = Config.Option.create("camerax.core.imageOutput.appTargetRotation", cls);
    }

    int getAppTargetRotation(int i);

    Size getDefaultResolution();

    Size getDefaultResolution(Size size);

    Size getMaxResolution();

    Size getMaxResolution(Size size);

    List<Pair<Integer, Size[]>> getSupportedResolutions();

    List<Pair<Integer, Size[]>> getSupportedResolutions(List<Pair<Integer, Size[]>> list);

    int getTargetAspectRatio();

    Size getTargetResolution();

    Size getTargetResolution(Size size);

    int getTargetRotation();

    int getTargetRotation(int i);

    boolean hasTargetAspectRatio();
}
