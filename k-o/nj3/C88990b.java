package nj3;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import p206nj.C11171e;

/* renamed from: nj3.b */
public class C88990b {

    /* renamed from: nj3.b$c */
    public interface C61771c {
        void onComplete(boolean z);
    }

    /* renamed from: nj3.b$b */
    public interface C88992b {
        /* renamed from: A6 */
        void mo117102A6();

        /* renamed from: F1 */
        void mo117103F1();
    }

    /* renamed from: nj3.b$d */
    public static class C88993d implements InvocationHandler {

        /* renamed from: a */
        public WeakReference<C61771c> f256582a;

        public C88993d(C88991a aVar) {
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            WeakReference<C61771c> weakReference = this.f256582a;
            if (weakReference == null) {
                Log.m105924i("MicroMsg.ActivityUtil", "swipe invoke fail, callbackRef NULL!");
                return null;
            }
            C61771c cVar = weakReference.get();
            if (cVar == null) {
                Log.m105924i("MicroMsg.ActivityUtil", "swipe invoke fail, callback NULL!");
                return null;
            }
            boolean z = false;
            if (objArr != null && objArr.length > 0) {
                Boolean bool = objArr[0];
                if (bool instanceof Boolean) {
                    z = bool.booleanValue();
                }
            }
            cVar.onComplete(z);
            return null;
        }
    }

    /* renamed from: a */
    public static void m111192a(Context context, Intent intent) {
        if (intent != null && context != null && (context instanceof Activity)) {
            if (intent.getBooleanExtra("animation_pop_in", false)) {
                ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2456di, C0966R.C0968anim.f2333y);
            }
            if (intent.getBooleanExtra("animation_push_up_in", false)) {
                ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
            }
        }
    }

    /* renamed from: b */
    public static void m111193b(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[0]);
            if (activity instanceof C88992b) {
                ((C88992b) activity).mo117102A6();
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ActivityUtil", th, "call convertActivityFromTranslucent Fail: %s", th.getMessage());
        }
    }

    /* renamed from: c */
    public static void m111194c(Activity activity, C61771c cVar) {
        Object obj;
        Class<Activity> cls = Activity.class;
        if (C11171e.m11044a(16)) {
            Log.m105929w("MicroMsg.ActivityUtil", "convertActivityToTranslucent::Android Version Error %d", Integer.valueOf(Build.VERSION.SDK_INT));
            return;
        }
        try {
            Class cls2 = null;
            for (Class cls3 : cls.getDeclaredClasses()) {
                if (cls3.getSimpleName().contains("TranslucentConversionListener")) {
                    cls2 = cls3;
                }
            }
            if (cVar != null) {
                C88993d dVar = new C88993d((C88991a) null);
                dVar.f256582a = new WeakReference<>(cVar);
                obj = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, dVar);
            } else {
                obj = null;
            }
            if (C11171e.m11044a(21)) {
                Method declaredMethod = cls.getDeclaredMethod("convertToTranslucent", new Class[]{cls2});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(activity, new Object[]{obj});
            } else {
                Method declaredMethod2 = cls.getDeclaredMethod("convertToTranslucent", new Class[]{cls2, ActivityOptions.class});
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(activity, new Object[]{obj, null});
            }
            if (activity instanceof C88992b) {
                ((C88992b) activity).mo117103F1();
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ActivityUtil", th, "call convertActivityToTranslucent Fail: %s", th.getMessage());
        }
    }

    /* renamed from: d */
    public static int m111195d(Class<?> cls) {
        C88989a aVar = (C88989a) cls.getAnnotation(C88989a.class);
        if (aVar != null) {
            return aVar.value();
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            return m111195d(superclass);
        }
        return 0;
    }

    /* renamed from: e */
    public static boolean m111196e() {
        return C11171e.m11046c(19);
    }

    /* renamed from: f */
    public static void m111197f(Context context) {
        if (context != null && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        }
    }

    /* renamed from: g */
    public static void m111198g(Context context) {
        if (context != null && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2456di, C0966R.C0968anim.f2333y);
        }
    }

    /* renamed from: h */
    public static void m111199h(Context context) {
        if (context != null && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2456di, C0966R.C0968anim.f2461dn);
        }
    }

    /* renamed from: i */
    public static void m111200i(Context context) {
        if (context != null && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2461dn);
        }
    }
}
