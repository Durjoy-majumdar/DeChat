package p981ie;

import android.bluetooth.le.ScanSettings;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import p723vf.C118672d;
import p981ie.C87710u;

/* renamed from: ie.e */
public final class C87699e {

    /* renamed from: a */
    public static List<C87701b> f253974a = new ArrayList();

    /* renamed from: b */
    public static boolean f253975b;

    /* renamed from: c */
    public static C87710u f253976c = new C87710u("bluetooth_manager", "android.bluetooth.IBluetoothManager", new C87700a());

    /* renamed from: ie.e$a */
    public class C87700a implements C87710u.C87712b {
        /* renamed from: a */
        public Object mo122125a(Object obj, Method method, Object[] objArr) {
            Object obj2 = null;
            if ("registerAdapter".equals(method.getName())) {
                Object invoke = method.invoke(obj, objArr);
                try {
                    obj2 = Proxy.newProxyInstance(invoke.getClass().getClassLoader(), new Class[]{IBinder.class, IInterface.class, Class.forName("android.bluetooth.IBluetooth")}, new C87702f(invoke));
                } catch (Throwable th) {
                    C118672d.m167354d("Matrix.battery.BluetoothHooker", th, "proxyBluetooth fail", new Object[0]);
                }
                return obj2 == null ? invoke : obj2;
            } else if (!"getBluetoothGatt".equals(method.getName())) {
                return null;
            } else {
                Object invoke2 = method.invoke(obj, objArr);
                try {
                    obj2 = Proxy.newProxyInstance(invoke2.getClass().getClassLoader(), new Class[]{IBinder.class, IInterface.class, Class.forName("android.bluetooth.IBluetoothGatt")}, new C87703g(invoke2));
                } catch (Throwable th4) {
                    C118672d.m167354d("Matrix.battery.BluetoothHooker", th4, "proxyBluetoothGatt fail", new Object[0]);
                }
                return obj2 == null ? invoke2 : obj2;
            }
        }

        /* renamed from: b */
        public void mo122126b(Method method, Object[] objArr) {
        }
    }

    /* renamed from: ie.e$b */
    public interface C87701b {
        /* renamed from: a */
        void mo111821a(ScanSettings scanSettings);

        /* renamed from: b */
        void mo111822b(int i, ScanSettings scanSettings);

        /* renamed from: c */
        void mo111823c();

        /* renamed from: d */
        void mo111824d();
    }

    /* renamed from: a */
    public static Object m109115a(Object obj, Method method, Object[] objArr) {
        Object obj2;
        try {
            obj2 = method.invoke(obj, objArr);
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.battery.BluetoothHooker", th, "reflect invocation fail", new Object[0]);
            obj2 = null;
        }
        if (obj2 != null) {
            return obj2;
        }
        Class<?> returnType = method.getReturnType();
        if (returnType == null || !returnType.isPrimitive()) {
            return null;
        }
        if (returnType == Byte.TYPE || returnType == Short.TYPE || returnType == Integer.TYPE) {
            return 0;
        }
        if (returnType == Long.TYPE) {
            return 0L;
        }
        if (returnType == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (returnType == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (returnType == Character.TYPE) {
            return 0;
        }
        if (returnType == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        return null;
    }
}
