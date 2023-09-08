package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import androidx.window.layout.ExtensionInterfaceCompat;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo182094d2 = {"androidx/window/layout/SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "newConfig", "Lrx3/b0;", "onConfigurationChanged", "onLowMemory", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
/* renamed from: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1 */
public final class C113026xe5f1d4c7 implements ComponentCallbacks {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ SidecarCompat this$0;

    public C113026xe5f1d4c7(SidecarCompat sidecarCompat, Activity activity) {
        this.this$0 = sidecarCompat;
        this.$activity = activity;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        ExtensionInterfaceCompat.ExtensionCallbackInterface access$getExtensionCallback$p = this.this$0.extensionCallback;
        if (access$getExtensionCallback$p != null) {
            Activity activity = this.$activity;
            access$getExtensionCallback$p.onWindowLayoutChanged(activity, this.this$0.getWindowLayoutInfo(activity));
        }
    }

    public void onLowMemory() {
    }
}
