package p172io.flutter.embedding.android;

/* renamed from: io.flutter.embedding.android.FlutterViewUtils */
public final class FlutterViewUtils {
    private FlutterViewUtils() {
    }

    public static void toggleHideCurrentRenderSurface(FlutterView flutterView, boolean z, boolean z2) {
        flutterView.toggleHideCurrentRenderSurface(z);
        if (z2 && (flutterView.renderSurface instanceof FlutterTextureView) && flutterView.getAttachedRenderer() != null) {
            ((FlutterTextureView) flutterView.renderSurface).setAlpha(1.0f);
        }
    }
}
