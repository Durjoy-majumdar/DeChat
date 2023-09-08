package p172io.flutter.plugin.platform;

import android.view.View;

/* renamed from: io.flutter.plugin.platform.CustomPlatformViewsController$$b */
public final /* synthetic */ class CustomPlatformViewsController$$b implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ CustomPlatformViewsController f70237d;

    /* renamed from: e */
    public final /* synthetic */ int f70238e;

    public /* synthetic */ CustomPlatformViewsController$$b(CustomPlatformViewsController customPlatformViewsController, int i) {
        this.f70237d = customPlatformViewsController;
        this.f70238e = i;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f70237d.lambda$initializePlatformViewIfNeeded$0(this.f70238e, view, z);
    }
}
