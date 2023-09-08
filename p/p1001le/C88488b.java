package p1001le;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;
import p269xe.C91185g;
import p269xe.C91186h;
import p361me.C88727a;
import p723vf.C118672d;

/* renamed from: le.b */
public class C88488b extends C91186h implements InvocationHandler {

    /* renamed from: c */
    public final Object f255593c;

    public C88488b(C91186h.C91187a aVar, Object obj) {
        super(aVar);
        this.f255593c = obj;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        C118672d.m167353c("Matrix.CloseGuardInvocationHandler", "invoke method: %s", method.getName());
        if (!method.getName().equals("report")) {
            return method.invoke(this.f255593c, objArr);
        }
        if (objArr.length != 2) {
            C118672d.m167352b("Matrix.CloseGuardInvocationHandler", "closeGuard report should has 2 params, current: %d", Integer.valueOf(objArr.length));
            return null;
        }
        Throwable th = objArr[1];
        if (!(th instanceof Throwable)) {
            C118672d.m167352b("Matrix.CloseGuardInvocationHandler", "closeGuard report args 1 should be throwable, current: %s", th);
            return null;
        }
        String a = C88727a.m110690a(th);
        if (a == null ? false : this.f261449b.contains(a)) {
            C118672d.m167351a("Matrix.CloseGuardInvocationHandler", "close leak issue already published; key:%s", a);
        } else {
            C91185g gVar = new C91185g(4);
            gVar.f261445c = a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("stack", a);
            } catch (JSONException e) {
                C118672d.m167352b("Matrix.CloseGuardInvocationHandler", "json content error: %s", e);
            }
            gVar.f261446d = jSONObject;
            C91186h.C91187a aVar = this.f261448a;
            if (aVar != null) {
                aVar.onDetectIssue(gVar);
                C118672d.m167353c("Matrix.CloseGuardInvocationHandler", "close leak issue publish, key:%s", a);
                if (a != null) {
                    this.f261449b.add(a);
                }
            } else {
                throw new RuntimeException("publish issue, but issue listener is null");
            }
        }
        return null;
    }
}
