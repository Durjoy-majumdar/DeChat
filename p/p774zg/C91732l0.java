package p774zg;

import com.eclipsesource.mmv8.JavaCallback;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;
import com.tencent.p014mm.appbrand.p942v8.C80681o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: zg.l0 */
public class C91732l0 implements JavaCallback {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f262758a;

    /* renamed from: b */
    public final /* synthetic */ List f262759b;

    /* renamed from: c */
    public final /* synthetic */ C40482o f262760c;

    public C91732l0(C80681o oVar, WeakReference weakReference, List list, C40482o oVar2) {
        this.f262758a = weakReference;
        this.f262759b = list;
        this.f262760c = oVar2;
    }

    public Object invoke(V8Object v8Object, V8Array v8Array) {
        String string = v8Array.getString(0);
        String string2 = v8Array.getString(1);
        int integer = v8Array.getInteger(2);
        String string3 = (v8Array.length() < 4 || v8Array.getType(3) != 4) ? "" : v8Array.getString(3);
        if (this.f262758a.get() != null) {
            C82510g gVar = (C82510g) this.f262758a.get();
            List list = this.f262759b;
            if (list == null || !list.contains(string)) {
                Log.m105921e("MicroMsg.V8EngineWorkerManager", "hy: calling not permitted api: %s", string);
                gVar.mo114838E(integer, gVar.mo114847S(string, "fail:not supported"), this.f262760c);
                return "fail:not supported";
            }
            return gVar.mo114845P(string, string2, string3, integer, false, this.f262760c);
        }
        Log.m105928w("MicroMsg.V8EngineWorkerManager", "hy: component lost. stop dispatch");
        return "";
    }
}
