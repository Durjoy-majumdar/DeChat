package p172io.flutter.plugin.platform;

import android.view.View;
import p172io.flutter.plugin.platform.CustomPlatformViewsController;

/* renamed from: io.flutter.plugin.platform.CustomPlatformViewsController$1$$a */
public final /* synthetic */ class CustomPlatformViewsController$1$$a implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ CustomPlatformViewsController.C246241 f70239d;

    /* renamed from: e */
    public final /* synthetic */ int f70240e;

    public /* synthetic */ CustomPlatformViewsController$1$$a(CustomPlatformViewsController.C246241 r1, int i) {
        this.f70239d = r1;
        this.f70240e = i;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f70239d.lambda$createForTextureLayer$0(this.f70240e, view, z);
    }
}
