package p1198ka;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ka.d */
public class C117398d {

    /* renamed from: a */
    public Map<String, Method> f351439a = new HashMap();

    /* renamed from: b */
    public Map<String, Method> f351440b = new HashMap();

    /* renamed from: c */
    public Class<? extends C117396b> f351441c;

    /* renamed from: a */
    public void mo182080a() {
        for (Method method : this.f351441c.getMethods()) {
            Annotation annotation = method.getAnnotation(C117395a.class);
            if (annotation != null) {
                if (((C117395a) annotation).uiThread()) {
                    ((HashMap) this.f351440b).put(method.getName(), method);
                } else {
                    ((HashMap) this.f351439a).put(method.getName(), method);
                }
            }
        }
    }
}
