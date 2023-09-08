package p172io.flutter.plugin.platform;

import android.view.View;

/* renamed from: io.flutter.plugin.platform.PlatformViewsController$$a */
public final /* synthetic */ class PlatformViewsController$$a implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ PlatformViewsController f70244d;

    /* renamed from: e */
    public final /* synthetic */ int f70245e;

    public /* synthetic */ PlatformViewsController$$a(PlatformViewsController platformViewsController, int i) {
        this.f70244d = platformViewsController;
        this.f70245e = i;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f70244d.lambda$initializePlatformViewIfNeeded$0(this.f70245e, view, z);
    }
}
