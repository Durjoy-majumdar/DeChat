package qy3;

import cz3.C24410d;
import gy3.C87412m;
import java.lang.reflect.Method;
import sx3.C110823p;

/* renamed from: qy3.t0 */
public final class C22177t0 {
    /* renamed from: a */
    public static final String m25645a(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        C87412m.m108593f(parameterTypes, "parameterTypes");
        sb.append(C110823p.m150987M(parameterTypes, "", "(", ")", 0, (CharSequence) null, C22176s0.f62704d, 24, (Object) null));
        Class<?> returnType = method.getReturnType();
        C87412m.m108593f(returnType, "returnType");
        sb.append(C24410d.m30456b(returnType));
        return sb.toString();
    }
}
