package p981ie;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import p723vf.C118672d;

/* renamed from: ie.u */
public class C87710u {

    /* renamed from: a */
    public final String f253984a;

    /* renamed from: b */
    public final String f253985b;

    /* renamed from: c */
    public final C87712b f253986c;

    /* renamed from: d */
    public IBinder f253987d;

    /* renamed from: e */
    public IBinder f253988e;

    /* renamed from: ie.u$a */
    public static final class C87711a implements InvocationHandler {

        /* renamed from: a */
        public final IBinder f253989a;

        /* renamed from: b */
        public final Object f253990b;

        public C87711a(String str, String str2, C87712b bVar) {
            IBinder b = m109129b(str);
            this.f253989a = b;
            Class<?> cls = Class.forName(str2);
            Class<?> cls2 = Class.forName(str2 + "$Stub");
            ClassLoader classLoader = cls2.getClassLoader();
            if (classLoader != null) {
                Object invoke = cls2.getDeclaredMethod("asInterface", new Class[]{IBinder.class}).invoke((Object) null, new Object[]{b});
                this.f253990b = Proxy.newProxyInstance(classLoader, new Class[]{IBinder.class, IInterface.class, cls}, new C87709t(bVar, invoke));
                return;
            }
            throw new IllegalStateException("get service manager ClassLoader fail!");
        }

        /* renamed from: b */
        public static IBinder m109129b(String str) {
            return (IBinder) Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
        }

        /* renamed from: a */
        public IBinder mo122134a() {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                return (IBinder) Proxy.newProxyInstance(classLoader, new Class[]{IBinder.class}, this);
            }
            throw new IllegalStateException("Can not get ClassLoader of " + cls.getName());
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            return "queryLocalInterface".equals(method.getName()) ? this.f253990b : method.invoke(this.f253989a, objArr);
        }
    }

    /* renamed from: ie.u$b */
    public interface C87712b {
        /* renamed from: a */
        Object mo122125a(Object obj, Method method, Object[] objArr);

        /* renamed from: b */
        void mo122126b(Method method, Object[] objArr);
    }

    public C87710u(String str, String str2, C87712b bVar) {
        this.f253984a = str;
        this.f253985b = str2;
        this.f253986c = bVar;
    }

    /* renamed from: a */
    public boolean mo122132a() {
        C118672d.m167353c("Matrix.battery.SystemServiceBinderHooker", "doHook: serviceName:%s, serviceClsName:%s", this.f253984a, this.f253985b);
        try {
            C87711a aVar = new C87711a(this.f253984a, this.f253985b, this.f253986c);
            IBinder a = aVar.mo122134a();
            Field declaredField = Class.forName("android.os.ServiceManager").getDeclaredField("sCache");
            declaredField.setAccessible(true);
            ((Map) declaredField.get((Object) null)).put(this.f253984a, a);
            this.f253988e = a;
            this.f253987d = aVar.f253989a;
            return true;
        } catch (Throwable th) {
            C118672d.m167352b("Matrix.battery.SystemServiceBinderHooker", "#doHook exp: " + th.getLocalizedMessage(), new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo122133b() {
        if (this.f253987d == null) {
            C118672d.m167356f("Matrix.battery.SystemServiceBinderHooker", "#doUnHook mOriginServiceBinder null", new Object[0]);
            return false;
        } else if (this.f253988e == null) {
            C118672d.m167356f("Matrix.battery.SystemServiceBinderHooker", "#doUnHook mDelegateServiceBinder null", new Object[0]);
            return false;
        } else {
            try {
                if (this.f253988e != C87711a.m109129b(this.f253984a)) {
                    C118672d.m167356f("Matrix.battery.SystemServiceBinderHooker", "#doUnHook mDelegateServiceBinder != currentBinder", new Object[0]);
                    return false;
                }
                Field declaredField = Class.forName("android.os.ServiceManager").getDeclaredField("sCache");
                declaredField.setAccessible(true);
                ((Map) declaredField.get((Object) null)).put(this.f253984a, this.f253987d);
                return true;
            } catch (Throwable th) {
                C118672d.m167352b("Matrix.battery.SystemServiceBinderHooker", "#doUnHook exp: " + th.getLocalizedMessage(), new Object[0]);
                return false;
            }
        }
    }
}
