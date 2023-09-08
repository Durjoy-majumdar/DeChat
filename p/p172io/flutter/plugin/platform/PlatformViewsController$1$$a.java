package p172io.flutter.plugin.platform;

import android.view.View;
import p172io.flutter.plugin.platform.PlatformViewsController;

/* renamed from: io.flutter.plugin.platform.PlatformViewsController$1$$a */
public final /* synthetic */ class PlatformViewsController$1$$a implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ PlatformViewsController.C246281 f70247d;

    /* renamed from: e */
    public final /* synthetic */ int f70248e;

    public /* synthetic */ PlatformViewsController$1$$a(PlatformViewsController.C246281 r1, int i) {
        this.f70247d = r1;
        this.f70248e = i;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f70247d.lambda$createForTextureLayer$0(this.f70248e, view, z);
    }
}
