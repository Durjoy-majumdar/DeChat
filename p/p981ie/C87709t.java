package p981ie;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p981ie.C87710u;

/* renamed from: ie.t */
public class C87709t implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ C87710u.C87712b f253982a;

    /* renamed from: b */
    public final /* synthetic */ Object f253983b;

    public C87709t(C87710u.C87712b bVar, Object obj) {
        this.f253982a = bVar;
        this.f253983b = obj;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        C87710u.C87712b bVar = this.f253982a;
        if (bVar != null) {
            bVar.mo122126b(method, objArr);
            Object a = this.f253982a.mo122125a(this.f253983b, method, objArr);
            if (a != null) {
                return a;
            }
        }
        return method.invoke(this.f253983b, objArr);
    }
}
