package vt0;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17926h;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;

/* renamed from: vt0.b */
public abstract class C22780b {

    /* renamed from: d */
    public C22778a f65507d;

    /* renamed from: a */
    public final C22778a mo35916a(boolean z) {
        ViewGroup viewGroup;
        C85004y d;
        C82520h hVar;
        C22778a aVar = this.f65507d;
        if (aVar != null) {
            return aVar;
        }
        C17926h hVar2 = (C17926h) this;
        try {
            viewGroup = ((C83873p2) hVar2.f49441f.get().getCustomViewContainer()).f244867a;
        } catch (NullPointerException unused) {
            Log.m105928w("MicroMsg.AppBrand.JsApiPickerHandler", "getInvokerView: return a null invoker view");
            viewGroup = null;
        }
        if (viewGroup == null || (d = C85004y.m104825d(viewGroup)) == null) {
            return null;
        }
        int i = C22778a.f65505x;
        C22778a aVar2 = (C22778a) d.getRootView().findViewById(C0966R.C0970id.f5965tj);
        if (aVar2 == null && z) {
            aVar2 = new C22778a(viewGroup.getContext());
            Log.m105918d("MicroMsg.AppBrand.JsApiPickerHandler", "createPanel, hook for setOrientationGetter");
            WeakReference<C82520h> weakReference = hVar2.f49441f;
            if (!(weakReference == null || (hVar = weakReference.get()) == null)) {
                aVar2.setOrientationGetter(C17926h.f49439j.mo109928a(hVar));
            }
            d.mo117919a(aVar2, true);
        }
        return aVar2;
    }

    /* renamed from: b */
    public final <T extends C17925e> T mo35917b(Class<T> cls) {
        Log.m105918d("MicroMsg.AppBrandBottomPickerInvokeHandler", "" + cls.getSimpleName());
        C22778a a = mo35916a(true);
        this.f65507d = a;
        if (a == null) {
            return null;
        }
        try {
            a.setPickerImpl((C17925e) cls.getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{a.getContext()}));
            return a.getPicker();
        } catch (Exception unused) {
            return null;
        }
    }
}
