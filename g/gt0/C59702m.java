package gt0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;
import te3.C64280c93;
import te3.c85;

/* renamed from: gt0.m */
public class C59702m implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f170554d;

    /* renamed from: e */
    public final /* synthetic */ c85 f170555e;

    /* renamed from: f */
    public final /* synthetic */ Runnable f170556f;

    /* renamed from: g */
    public final /* synthetic */ C84926a f170557g;

    public C59702m(C84926a aVar, AppBrandRuntimeWC appBrandRuntimeWC, c85 c85, Runnable runnable) {
        this.f170557g = aVar;
        this.f170554d = appBrandRuntimeWC;
        this.f170555e = c85;
        this.f170556f = runnable;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f170557g.mo117760g(this.f170554d, true, (C64280c93) null, this.f170555e);
        this.f170556f.run();
    }
}
