package androidx.camera.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TorchState {
    public static final int OFF = 0;

    /* renamed from: ON */
    public static final int f337885ON = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    private TorchState() {
    }
}
