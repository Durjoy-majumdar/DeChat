package p981ie;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p723vf.C118672d;
import p981ie.C87699e;

/* renamed from: ie.f */
public class C87702f implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ Object f253977a;

    public C87702f(Object obj) {
        this.f253977a = obj;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        if ("startDiscovery".equals(method.getName())) {
            Iterator it = ((ArrayList) C87699e.f253974a).iterator();
            while (it.hasNext()) {
                ((C87699e.C87701b) it.next()).mo111824d();
            }
        }
        try {
            return C87699e.m109115a(this.f253977a, method, objArr);
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.battery.BluetoothHooker", th, "invokeBluetooth fail", new Object[0]);
            return null;
        }
    }
}
