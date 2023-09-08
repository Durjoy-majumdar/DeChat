package qy3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import cz3.C24410d;
import fz3.C20742e0;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import l04.C24874d;
import l04.C24893h;
import l04.C24918l;
import oz3.C25383k;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import qy3.C22152c;
import qz3.C26019c;
import qz3.C26052n;
import sz3.C26243c;
import sz3.C26245e;
import sz3.C26247g;
import tz3.C26349a;
import uz3.C22710d;
import uz3.C26380h;
import vz3.C118710g;
import vz3.C22830f;
import wy3.C26465i0;
import wy3.C26469k;
import wy3.C26491r;
import wy3.C26504r0;
import xz3.C26593h;
import z04.C112550d0;
import z04.C66723k;

/* renamed from: qy3.d */
public abstract class C22161d {

    /* renamed from: qy3.d$a */
    public static final class C22162a extends C22161d {

        /* renamed from: a */
        public final Field f62680a;

        public C22162a(Field field) {
            C87412m.m108594g(field, "field");
            this.f62680a = field;
        }

        /* renamed from: a */
        public String mo35267a() {
            StringBuilder sb = new StringBuilder();
            String name = this.f62680a.getName();
            C87412m.m108593f(name, "field.name");
            sb.append(C20742e0.m22697a(name));
            sb.append("()");
            Class<?> type = this.f62680a.getType();
            C87412m.m108593f(type, "field.type");
            sb.append(C24410d.m30456b(type));
            return sb.toString();
        }
    }

    /* renamed from: qy3.d$b */
    public static final class C22163b extends C22161d {

        /* renamed from: a */
        public final Method f62681a;

        /* renamed from: b */
        public final Method f62682b;

        public C22163b(Method method, Method method2) {
            C87412m.m108594g(method, "getterMethod");
            this.f62681a = method;
            this.f62682b = method2;
        }

        /* renamed from: a */
        public String mo35267a() {
            return C22177t0.m25645a(this.f62681a);
        }
    }

    /* renamed from: qy3.d$d */
    public static final class C22164d extends C22161d {

        /* renamed from: a */
        public final C22152c.C22160e f62683a;

        /* renamed from: b */
        public final C22152c.C22160e f62684b;

        public C22164d(C22152c.C22160e eVar, C22152c.C22160e eVar2) {
            C87412m.m108594g(eVar, "getterSignature");
            this.f62683a = eVar;
            this.f62684b = eVar2;
        }

        /* renamed from: a */
        public String mo35267a() {
            return this.f62683a.f62679b;
        }
    }

    /* renamed from: qy3.d$c */
    public static final class C22165c extends C22161d {

        /* renamed from: a */
        public final C26504r0 f62685a;

        /* renamed from: b */
        public final C26052n f62686b;

        /* renamed from: c */
        public final C26349a.C26357d f62687c;

        /* renamed from: d */
        public final C26243c f62688d;

        /* renamed from: e */
        public final C26247g f62689e;

        /* renamed from: f */
        public final String f62690f;

        public C22165c(C26504r0 r0Var, C26052n nVar, C26349a.C26357d dVar, C26243c cVar, C26247g gVar) {
            String str;
            String str2;
            C87412m.m108594g(r0Var, "descriptor");
            C87412m.m108594g(nVar, TPReportKeys.Common.COMMON_PROTO);
            C87412m.m108594g(dVar, "signature");
            C87412m.m108594g(cVar, "nameResolver");
            C87412m.m108594g(gVar, "typeTable");
            this.f62685a = r0Var;
            this.f62686b = nVar;
            this.f62687c = dVar;
            this.f62688d = cVar;
            this.f62689e = gVar;
            if ((dVar.f73492e & 4) == 4) {
                str = cVar.getString(dVar.f73495h.f73482f) + cVar.getString(dVar.f73495h.f73483g);
            } else {
                C22710d.C22711a b = C26380h.f73581a.mo53364b(nVar, cVar, gVar, true);
                if (b != null) {
                    String str3 = b.f65290a;
                    String str4 = b.f65291b;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C20742e0.m22697a(str3));
                    C26469k b2 = r0Var.mo51892b();
                    C87412m.m108593f(b2, "descriptor.containingDeclaration");
                    if (!C87412m.m108589b(r0Var.getVisibility(), C26491r.f73781d) || !(b2 instanceof C24874d)) {
                        if (C87412m.m108589b(r0Var.getVisibility(), C26491r.f73778a) && (b2 instanceof C26465i0)) {
                            C24893h hVar = ((C24918l) r0Var).f70992L;
                            if (hVar instanceof C25383k) {
                                C25383k kVar = (C25383k) hVar;
                                if (kVar.f71925c != null) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append('$');
                                    String e = kVar.f71924b.mo51171e();
                                    C87412m.m108593f(e, "className.internalName");
                                    sb4.append(C22830f.m26794f(C112550d0.m153793c0(e, XVFSFile.SEPARATOR_CHAR, e)).mo35995b());
                                    str2 = sb4.toString();
                                }
                            }
                        }
                        str2 = "";
                    } else {
                        C26019c cVar2 = ((C24874d) b2).f70889h;
                        C26593h.C26600f<C26019c, Integer> fVar = C26349a.f73461i;
                        C87412m.m108593f(fVar, "classModuleName");
                        Integer num = (Integer) C26245e.m33733a(cVar2, fVar);
                        String str5 = (num == null || (str5 = cVar.getString(num.intValue())) == null) ? FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT : str5;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append('$');
                        C66723k kVar2 = C118710g.f355218a;
                        kVar2.getClass();
                        String replaceAll = kVar2.f191762d.matcher(str5).replaceAll("_");
                        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                        sb5.append(replaceAll);
                        str2 = sb5.toString();
                    }
                    sb.append(str2);
                    sb.append("()");
                    sb.append(str4);
                    str = sb.toString();
                } else {
                    throw new C118215l0("No field signature for property: " + r0Var);
                }
            }
            this.f62690f = str;
        }

        /* renamed from: a */
        public String mo35267a() {
            return this.f62690f;
        }
    }

    /* renamed from: a */
    public abstract String mo35267a();
}
