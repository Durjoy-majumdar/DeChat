package com.tencent.p014mm.ext.p313ui;

import android.app.Activity;
import android.app.ActivityOptions;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import p1005ma.C88718b;

/* renamed from: com.tencent.mm.ext.ui.a */
public class C80847a {

    /* renamed from: com.tencent.mm.ext.ui.a$b */
    public interface C80849b {
        void onComplete(boolean z);
    }

    /* renamed from: com.tencent.mm.ext.ui.a$c */
    public static class C80850c implements InvocationHandler {

        /* renamed from: a */
        public WeakReference<C80849b> f237637a;

        public C80850c(C80848a aVar) {
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            WeakReference<C80849b> weakReference = this.f237637a;
            boolean z = false;
            if (weakReference == null) {
                C88718b.m110681c("MicroMsg.ActivityUtil", "swipe invoke fail, callbackRef NULL!", new Object[0]);
                return null;
            }
            C80849b bVar = weakReference.get();
            if (bVar == null) {
                C88718b.m110681c("MicroMsg.ActivityUtil", "swipe invoke fail, callback NULL!", new Object[0]);
                return null;
            }
            if (objArr != null && objArr.length > 0) {
                Boolean bool = objArr[0];
                if (bool instanceof Boolean) {
                    z = bool.booleanValue();
                }
            }
            bVar.onComplete(z);
            return null;
        }
    }

    /* renamed from: a */
    public static void m98692a(Activity activity, C80849b bVar) {
        Object obj;
        Class<Activity> cls = Activity.class;
        try {
            Class cls2 = null;
            for (Class cls3 : cls.getDeclaredClasses()) {
                if (cls3.getSimpleName().contains("TranslucentConversionListener")) {
                    cls2 = cls3;
                }
            }
            if (bVar != null) {
                C80850c cVar = new C80850c((C80848a) null);
                cVar.f237637a = new WeakReference<>(bVar);
                obj = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, cVar);
            } else {
                obj = null;
            }
            Method declaredMethod = cls.getDeclaredMethod("convertToTranslucent", new Class[]{cls2, ActivityOptions.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[]{obj, null});
        } catch (Throwable th) {
            C88718b.m110680b("MicroMsg.ActivityUtil", "call convertActivityToTranslucent Fail: %s", th.getMessage());
        }
    }
}
