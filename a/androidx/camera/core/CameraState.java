package androidx.camera.core;

public abstract class CameraState {
    public static final int ERROR_CAMERA_DISABLED = 5;
    public static final int ERROR_CAMERA_FATAL_ERROR = 6;
    public static final int ERROR_CAMERA_IN_USE = 2;
    public static final int ERROR_DO_NOT_DISTURB_MODE_ENABLED = 7;
    public static final int ERROR_MAX_CAMERAS_IN_USE = 1;
    public static final int ERROR_OTHER_RECOVERABLE_ERROR = 3;
    public static final int ERROR_STREAM_CONFIG = 4;

    public enum Type {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public enum ErrorType {
        RECOVERABLE,
        CRITICAL
    }

    public static abstract class StateError {
        public static StateError create(int i) {
            return create(i, (Throwable) null);
        }

        public abstract Throwable getCause();

        public abstract int getCode();

        public ErrorType getType() {
            int code = getCode();
            return (code == 2 || code == 1 || code == 3) ? ErrorType.RECOVERABLE : ErrorType.CRITICAL;
        }

        public static StateError create(int i, Throwable th) {
            return new AutoValue_CameraState_StateError(i, th);
        }
    }

    public static CameraState create(Type type) {
        return create(type, (StateError) null);
    }

    public abstract StateError getError();

    public abstract Type getType();

    public static CameraState create(Type type, StateError stateError) {
        return new AutoValue_CameraState(type, stateError);
    }
}
