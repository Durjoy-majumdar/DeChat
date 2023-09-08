package py3;

import fy3.C32227p;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C87412m;
import j04.C24779w;
import ny3.C109824f;
import qz3.C26041i;
import wy3.C26520x0;

/* renamed from: py3.b */
public final /* synthetic */ class C25504b extends C24563k implements C32227p<C24779w, C26041i, C26520x0> {

    /* renamed from: d */
    public static final C25504b f72188d = new C25504b();

    public C25504b() {
        super(2);
    }

    public final String getName() {
        return "loadFunction";
    }

    public final C109824f getOwner() {
        return C24560g0.m30725a(C24779w.class);
    }

    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    public Object invoke(Object obj, Object obj2) {
        C24779w wVar = (C24779w) obj;
        C26041i iVar = (C26041i) obj2;
        C87412m.m108594g(wVar, "p0");
        C87412m.m108594g(iVar, "p1");
        return wVar.mo51760e(iVar);
    }
}
