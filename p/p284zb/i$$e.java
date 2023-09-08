package p284zb;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import java.util.Objects;
import p963fc.C86812g;

/* renamed from: zb.i$$e */
public final /* synthetic */ class i$$e implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C91640i f262604a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandRuntime f262605b;

    public /* synthetic */ i$$e(C91640i iVar, AppBrandRuntime appBrandRuntime) {
        this.f262604a = iVar;
        this.f262605b = appBrandRuntime;
    }

    public final void onReceiveValue(Object obj) {
        C91640i iVar = this.f262604a;
        AppBrandRuntime appBrandRuntime = this.f262605b;
        iVar.getClass();
        C91635f fVar = (C91635f) iVar.mo124764Z();
        Objects.requireNonNull(fVar);
        ((C91639h) obj).mo111455d((C86812g) appBrandRuntime, fVar);
    }
}
