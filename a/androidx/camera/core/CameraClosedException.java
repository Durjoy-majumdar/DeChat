package androidx.camera.core;

final class CameraClosedException extends RuntimeException {
    public CameraClosedException(String str, Throwable th) {
        super(str, th);
    }

    public CameraClosedException(String str) {
        super(str);
    }
}
