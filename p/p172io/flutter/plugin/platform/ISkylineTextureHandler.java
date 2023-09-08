package p172io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J<\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J2\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J\"\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J*\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0012"}, mo182094d2 = {"Lio/flutter/plugin/platform/ISkylineTextureHandler;", "", "", "engineId", "", "type", "id", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "width", "height", "Lrx3/b0;", "onTextureReady", "onTextureUpdate", "onTextureDestroy", "Landroid/view/MotionEvent;", "motionEvent", "onTextureTouch", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: io.flutter.plugin.platform.ISkylineTextureHandler */
public interface ISkylineTextureHandler {
    void onTextureDestroy(int i, String str, int i2);

    void onTextureReady(int i, String str, int i2, SurfaceTexture surfaceTexture, int i3, int i4);

    void onTextureTouch(int i, String str, int i2, MotionEvent motionEvent);

    void onTextureUpdate(int i, String str, int i2, int i3, int i4);
}
