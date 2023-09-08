package gy3;

import ny3.C109824f;
import ny3.C25235d;
import ny3.C25237g;
import ny3.C25238h;
import ny3.C25241k;
import ny3.C25243l;
import ny3.C89102i;

/* renamed from: gy3.h0 */
public class C24561h0 {
    /* renamed from: a */
    public C25237g mo51267a(C24563k kVar) {
        return kVar;
    }

    /* renamed from: b */
    public C25235d mo51268b(Class cls) {
        return new C24559f(cls);
    }

    /* renamed from: c */
    public C109824f mo51269c(Class cls, String str) {
        return new C117007u(cls, str);
    }

    /* renamed from: d */
    public C25238h mo51270d(C24567p pVar) {
        return pVar;
    }

    /* renamed from: e */
    public C89102i mo51271e(C24569r rVar) {
        return rVar;
    }

    /* renamed from: f */
    public C25241k mo51272f(C24572v vVar) {
        return vVar;
    }

    /* renamed from: g */
    public C25243l mo51273g(C24574x xVar) {
        return xVar;
    }

    /* renamed from: h */
    public String mo51274h(C24562j jVar) {
        String obj = jVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: i */
    public String mo51275i(C87413o oVar) {
        return mo51274h(oVar);
    }
}
