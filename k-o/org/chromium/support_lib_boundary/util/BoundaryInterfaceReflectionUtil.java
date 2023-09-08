package org.chromium.support_lib_boundary.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BoundaryInterfaceReflectionUtil {

    public static class InvocationHandlerWithDelegateGetter implements InvocationHandler {
        private final Object mDelegate;

        public InvocationHandlerWithDelegateGetter(Object obj) {
            this.mDelegate = obj;
        }

        public Object getDelegate() {
            return this.mDelegate;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return BoundaryInterfaceReflectionUtil.dupeMethod(method, this.mDelegate.getClass().getClassLoader()).invoke(this.mDelegate, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    public static <T> T castToSuppLibClass(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(BoundaryInterfaceReflectionUtil.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean containsFeature(String[] strArr, String str) {
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static InvocationHandler createInvocationHandlerFor(Object obj) {
        return new InvocationHandlerWithDelegateGetter(obj);
    }

    public static Method dupeMethod(Method method, ClassLoader classLoader) {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    public static Object getDelegateFromInvocationHandler(InvocationHandler invocationHandler) {
        return ((InvocationHandlerWithDelegateGetter) invocationHandler).getDelegate();
    }
}
