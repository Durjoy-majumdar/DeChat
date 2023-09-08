package g31;

import a31.C67003a;
import android.os.Handler;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: g31.b */
public class C87127b extends C87125a {

    /* renamed from: g31.b$a */
    public class C87128a extends Handler {

        /* renamed from: a */
        public final /* synthetic */ Handler f252718a;

        public C87128a(C87127b bVar, Handler handler) {
            this.f252718a = handler;
        }

        public void handleMessage(Message message) {
            try {
                Log.m105924i("MicroMsg.INotificationManagerInvocationHandler", "run on my handler");
                this.f252718a.handleMessage(message);
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.INotificationManagerInvocationHandler", "protect succ");
            }
        }
    }

    public C87127b(Object obj) {
        super(obj);
        C87125a.f252715b = "mHandler";
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (this.f252716a == null) {
            return null;
        }
        if (method.getName().equals("enqueueToast") && objArr[1].getClass().getName().equals("android.widget.Toast$TN")) {
            try {
                Field declaredField = objArr[1].getClass().getDeclaredField(C87125a.f252715b);
                declaredField.setAccessible(true);
                C67003a.m79166a(declaredField);
                declaredField.set(objArr[1], new C87128a(this, (Handler) declaredField.get(objArr[1])));
                Log.m105924i("MicroMsg.INotificationManagerInvocationHandler", "replace Toast.TN.mShow succ");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.INotificationManagerInvocationHandler", e.getMessage());
            }
        }
        return method.invoke(this.f252716a, objArr);
    }
}
