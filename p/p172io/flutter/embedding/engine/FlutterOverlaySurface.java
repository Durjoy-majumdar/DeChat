package p172io.flutter.embedding.engine;

import android.view.Surface;

/* renamed from: io.flutter.embedding.engine.FlutterOverlaySurface */
public class FlutterOverlaySurface {

    /* renamed from: id */
    private final int f351094id;
    private final Surface surface;

    public FlutterOverlaySurface(int i, Surface surface2) {
        this.f351094id = i;
        this.surface = surface2;
    }

    public int getId() {
        return this.f351094id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
