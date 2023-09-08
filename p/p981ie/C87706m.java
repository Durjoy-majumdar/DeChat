package p981ie;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p723vf.C118672d;
import p981ie.C87710u;

/* renamed from: ie.m */
public final class C87706m {

    /* renamed from: a */
    public static List<C87708b> f253979a = new ArrayList();

    /* renamed from: b */
    public static boolean f253980b;

    /* renamed from: c */
    public static C87710u f253981c = new C87710u(FirebaseAnalytics.C113379b.LOCATION, "android.location.ILocationManager", new C87707a());

    /* renamed from: ie.m$a */
    public class C87707a implements C87710u.C87712b {
        /* renamed from: a */
        public Object mo122125a(Object obj, Method method, Object[] objArr) {
            return null;
        }

        /* renamed from: b */
        public void mo122126b(Method method, Object[] objArr) {
            if ("requestLocationUpdates".equals(method.getName())) {
                long j = -1;
                float f = -1.0f;
                if (objArr != null) {
                    for (Object obj : objArr) {
                        if (obj != null && "android.location.LocationRequest".equals(obj.getClass().getName())) {
                            try {
                                Method declaredMethod = obj.getClass().getDeclaredMethod("getFastestInterval", new Class[0]);
                                declaredMethod.setAccessible(true);
                                j = ((Long) declaredMethod.invoke(obj, new Object[0])).longValue();
                                Method declaredMethod2 = obj.getClass().getDeclaredMethod("getSmallestDisplacement", new Class[0]);
                                declaredMethod2.setAccessible(true);
                                f = ((Float) declaredMethod2.invoke(obj, new Object[0])).floatValue();
                            } catch (Throwable th) {
                                C118672d.m167354d("Matrix.battery.LocationHooker", th, "", new Object[0]);
                            }
                        }
                    }
                }
                Iterator it = ((ArrayList) C87706m.f253979a).iterator();
                while (it.hasNext()) {
                    ((C87708b) it.next()).mo111826a(j, f);
                }
            }
        }
    }

    /* renamed from: ie.m$b */
    public interface C87708b {
        /* renamed from: a */
        void mo111826a(long j, float f);
    }
}
