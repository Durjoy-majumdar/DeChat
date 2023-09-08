package androidx.camera.extensions;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ExtensionMode {
    public static final int AUTO = 5;
    public static final int BOKEH = 1;
    public static final int FACE_RETOUCH = 4;
    public static final int HDR = 2;
    public static final int NIGHT = 3;
    public static final int NONE = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    private ExtensionMode() {
    }
}
