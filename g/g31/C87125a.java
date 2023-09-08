package g31;

import a31.C67003a;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: g31.a */
public class C87125a implements InvocationHandler {

    /* renamed from: b */
    public static String f252715b = "mShow";

    /* renamed from: a */
    public Object f252716a;

    /* renamed from: g31.a$a */
    public class C87126a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f252717d;

        public C87126a(C87125a aVar, Runnable runnable) {
            this.f252717d = runnable;
        }

        public void run() {
            try {
                Log.m105924i("MicroMsg.INotificationManagerInvocationHandler", "run on my runnable");
                this.f252717d.run();
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.INotificationManagerInvocationHandler", "protect succ");
            }
        }
    }

    public C87125a(Object obj) {
        this.f252716a = obj;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (this.f252716a == null) {
            return null;
        }
        if (method.getName().equals("enqueueToast") && objArr[1].getClass().getName().equals("android.widget.Toast$TN")) {
            try {
                Field declaredField = objArr[1].getClass().getDeclaredField(f252715b);
                declaredField.setAccessible(true);
                C67003a.m79166a(declaredField);
                declaredField.set(objArr[1], new C87126a(this, (Runnable) declaredField.get(objArr[1])));
                Log.m105924i("MicroMsg.INotificationManagerInvocationHandler", "replace Toast.TN.mShow succ");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.INotificationManagerInvocationHandler", e.getMessage());
            }
        }
        return method.invoke(this.f252716a, objArr);
    }
}
