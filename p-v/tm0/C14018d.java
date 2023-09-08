package tm0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import sx3.C90364q0;

/* renamed from: tm0.d */
public class C14018d<Component extends C81879g> extends C14017c<Component> {

    /* renamed from: a */
    public static final C13601g<List<C14038s0>> f39371a = C36568h.m40985a(C14019a.f39373d);

    /* renamed from: b */
    public static final C13601g<Map<String, C14037r0<C81879g>>> f39372b = C36568h.m40985a(C14020b.f39374d);

    /* renamed from: tm0.d$a */
    public static final class C14019a extends C87413o implements C32224a<List<? extends C14038s0>> {

        /* renamed from: d */
        public static final C14019a f39373d = new C14019a();

        public C14019a() {
            super(0);
        }

        public Object invoke() {
            return C64197v.m75537f(new C14035q0(), new C14028j0());
        }
    }

    /* renamed from: tm0.d$b */
    public static final class C14020b extends C87413o implements C32224a<Map<String, ? extends C14037r0<C81879g>>> {

        /* renamed from: d */
        public static final C14020b f39374d = new C14020b();

        public C14020b() {
            super(0);
        }

        public Object invoke() {
            return C90364q0.m113147f(new C13604l("deviceInfo", new C90545l0()), new C13604l("windowInfo", new C90555t0()), new C13604l("appBaseInfo", new C90544k0()));
        }
    }

    /* renamed from: b */
    public Map<String, Object> mo13448a(String str, Component component) {
        HashMap hashMap;
        Map<String, Object> a;
        C87412m.m108594g(str, "type");
        C87412m.m108594g(component, "component");
        Iterator it = ((List) ((C36570n) f39371a).getValue()).iterator();
        do {
            hashMap = null;
            if (it.hasNext()) {
                C14038s0 s0Var = (C14038s0) it.next();
                s0Var.getClass();
                Log.m105924i("MicroMsg.AppBrand.GetSystemInfoNewLU", "get#PartOfGetSystemInfo_TypeSpecificInfo, type: " + str);
                C32227p pVar = s0Var.mo13451b().get(str);
                if (pVar != null) {
                    Context context = component.getContext();
                    HashMap hashMap2 = new HashMap();
                    pVar.invoke(context, hashMap2);
                    hashMap = hashMap2;
                    continue;
                }
            } else {
                C14037r0 r0Var = (C14037r0) ((Map) ((C36570n) f39372b).getValue()).get(str);
                if (r0Var == null || (a = r0Var.mo13450a(str, component)) == null) {
                    return null;
                }
                return a;
            }
        } while (hashMap == null);
        return hashMap;
    }
}
