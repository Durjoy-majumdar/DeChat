package fz3;

import fy3.C32226l;
import fz3.C24505h0;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import m04.C24959e;
import ny3.C109824f;
import rx3.C36567f;
import vz3.C22826c;

/* renamed from: fz3.a0 */
public final class C24494a0 {

    /* renamed from: d */
    public static final C24494a0 f70001d;

    /* renamed from: a */
    public final C24501d0 f70002a;

    /* renamed from: b */
    public final C32226l<C22826c, C24507k0> f70003b;

    /* renamed from: c */
    public final boolean f70004c;

    /* renamed from: fz3.a0$a */
    public /* synthetic */ class C24495a extends C24563k implements C32226l<C22826c, C24507k0> {

        /* renamed from: d */
        public static final C24495a f70005d = new C24495a();

        public C24495a() {
            super(1);
        }

        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        public final C109824f getOwner() {
            return C24560g0.f70158a.mo51269c(C24524y.class, "compiler.common.jvm");
        }

        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        public Object invoke(Object obj) {
            C22826c cVar = (C22826c) obj;
            C87412m.m108594g(cVar, "p0");
            C22826c cVar2 = C24524y.f70081a;
            C24505h0.f70062a.getClass();
            C24505h0 h0Var = C24505h0.C24506a.f70064b;
            C36567f fVar = new C36567f(1, 7, 0);
            C87412m.m108594g(h0Var, "configuredReportLevels");
            C24507k0 k0Var = (C24507k0) ((C24959e.C24971l) ((C20748i0) h0Var).f58638c).invoke(cVar);
            if (k0Var != null) {
                return k0Var;
            }
            C20748i0 i0Var = (C20748i0) C24524y.f70082b;
            i0Var.getClass();
            C24525z zVar = (C24525z) ((C24959e.C24971l) i0Var.f58638c).invoke(cVar);
            if (zVar == null) {
                return C24507k0.IGNORE;
            }
            C36567f fVar2 = zVar.f70086b;
            return (fVar2 == null || fVar2.f97255g - fVar.f97255g > 0) ? zVar.f70085a : zVar.f70087c;
        }
    }

    static {
        C22826c cVar = C24524y.f70081a;
        C36567f fVar = C36567f.f97251h;
        C87412m.m108594g(fVar, "configuredKotlinVersion");
        C24525z zVar = C24524y.f70083c;
        C36567f fVar2 = zVar.f70086b;
        C24507k0 k0Var = (fVar2 == null || fVar2.f97255g - fVar.f97255g > 0) ? zVar.f70085a : zVar.f70087c;
        C87412m.m108594g(k0Var, "globalReportLevel");
        f70001d = new C24494a0(new C24501d0(k0Var, k0Var == C24507k0.WARN ? null : k0Var, (Map) null, 4, (C8480h) null), C24495a.f70005d);
    }

    public C24494a0(C24501d0 d0Var, C32226l<? super C22826c, ? extends C24507k0> lVar) {
        C87412m.m108594g(d0Var, "jsr305");
        C87412m.m108594g(lVar, "getReportLevelForAnnotation");
        this.f70002a = d0Var;
        this.f70003b = lVar;
        this.f70004c = d0Var.f70029d || lVar.invoke(C24524y.f70081a) == C24507k0.IGNORE;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f70002a + ", getReportLevelForAnnotation=" + this.f70003b + ')';
    }
}
