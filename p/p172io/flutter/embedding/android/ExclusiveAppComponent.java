package p172io.flutter.embedding.android;

/* renamed from: io.flutter.embedding.android.ExclusiveAppComponent */
public interface ExclusiveAppComponent<T> {
    void detachFromFlutterEngine();

    T getAppComponent();
}
