package p774zg;

import com.eclipsesource.mmv8.V8Object;
import com.eclipsesource.mmv8.V8Value;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: zg.q */
public class C91741q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Object f262778d;

    /* renamed from: e */
    public final /* synthetic */ String f262779e;

    /* renamed from: f */
    public final /* synthetic */ Class f262780f;

    /* renamed from: g */
    public final /* synthetic */ C80669j f262781g;

    public C91741q(C80669j jVar, Object obj, String str, Class cls) {
        this.f262781g = jVar;
        this.f262778d = obj;
        this.f262779e = str;
        this.f262780f = cls;
    }

    public void run() {
        C80669j jVar = this.f262781g;
        Object obj = this.f262778d;
        String str = this.f262779e;
        Class cls = this.f262780f;
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Class cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            Iterator it = new ArrayList(Arrays.asList(cls2.getDeclaredMethods())).iterator();
            while (it.hasNext()) {
                Method method = (Method) it.next();
                if (cls == null || method.isAnnotationPresent(cls)) {
                    arrayList.add(method);
                }
            }
        }
        V8Object newV8Object = jVar.mo112501e().newV8Object();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Method method2 = (Method) it4.next();
            newV8Object.registerJavaMethod(obj, method2.getName(), method2.getName(), method2.getParameterTypes());
        }
        jVar.mo112501e().add(str, (V8Value) newV8Object);
        newV8Object.release();
    }
}
