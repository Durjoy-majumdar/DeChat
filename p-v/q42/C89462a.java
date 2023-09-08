package q42;

import d42.C86181h;
import f70.C86764b;
import f70.C86770d;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C24565l;
import gy3.C87412m;
import i70.C87667c;
import java.util.Map;
import k10.C88059h;
import k52.C88115a;
import ny3.C25237g;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: q42.a */
public final class C89462a extends C86770d<C88115a, C88115a> implements C86181h {

    /* renamed from: j */
    public final C88115a f257509j = new C88115a();

    /* renamed from: q42.a$a */
    public /* synthetic */ class C89463a extends C24565l implements C32228q<String, byte[], C32226l<? super C88059h.C88060a, ? extends C13598b0>, C13598b0> {
        public C89463a(Object obj) {
            super(3, obj, C89462a.class, "handleTestFailed", "handleTestFailed(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            byte[] bArr = (byte[]) obj2;
            C32226l lVar = (C32226l) obj3;
            C87412m.m108594g((String) obj, "p0");
            C87412m.m108594g(lVar, "p2");
            C89462a aVar = (C89462a) this.receiver;
            aVar.getClass();
            lVar.invoke(aVar.mo121194B(4097, (String) null));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q42.a$b */
    public /* synthetic */ class C89464b extends C24565l implements C32228q<String, byte[], C32226l<? super C88059h.C88060a, ? extends C13598b0>, C13598b0> {
        public C89464b(Object obj) {
            super(3, obj, C89462a.class, "handleTestOk", "handleTestOk(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            byte[] bArr = (byte[]) obj2;
            C32226l lVar = (C32226l) obj3;
            C87412m.m108594g((String) obj, "p0");
            C87412m.m108594g(lVar, "p2");
            lVar.invoke(((C89462a) this.receiver).mo121195C((byte[]) null));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89462a(C86764b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "mbPlugin");
    }

    /* renamed from: E */
    public C87667c mo110354E() {
        return this.f257509j;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        super.onAttachedToEngine(flutterPluginBinding);
        this.f257509j.mo121029B0();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        super.onDetachedFromEngine(flutterPluginBinding);
        this.f257509j.mo118861j0();
    }

    /* renamed from: y */
    public Map<String, C25237g<C13598b0>> mo110357y() {
        return C90364q0.m113149h(this.f251877i, C90364q0.m113147f(new C13604l("testFailed", new C89463a(this)), new C13604l("testOk", new C89464b(this))));
    }
}
