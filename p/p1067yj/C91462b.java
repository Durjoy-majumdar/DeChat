package p1067yj;

import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: yj.b */
public class C91462b implements InvocationHandler {

    /* renamed from: a */
    public Object f262196a;

    public C91462b(WindowManager windowManager) {
        this.f262196a = windowManager;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z = false;
        if (method.getName().equals("removeViewImmediate")) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 0) {
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (stackTrace[i].getMethodName().equals("handleDestroyActivity")) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        if (!z) {
            return method.invoke(this.f262196a, objArr);
        }
        try {
            Log.m105924i("MicroMsg.WindowManagerInvocationHandler", "removeViewImmediate");
            return method.invoke(this.f262196a, objArr);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.WindowManagerInvocationHandler", "catch it");
            return null;
        }
    }
}
