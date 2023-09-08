package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import u24.C90595a;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.t0 */
public class C84785t0 implements InvocationHandler {

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.t0$a */
    public class C84786a extends C84785t0 {

        /* renamed from: a */
        public final /* synthetic */ String f247214a;

        public C84786a(String str) {
            this.f247214a = str;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Log.m105925i(this.f247214a, "dummy invoke method(%s) args(%s)", method.getName(), C90595a.m113499c(objArr, "NULL"));
            return C84785t0.super.invoke(obj, method, objArr);
        }
    }

    /* renamed from: a */
    public static <I> I m104465a(String str, Class<I> cls) {
        C84786a aVar = new C84786a(str);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, aVar));
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        Class<?> returnType = method.getReturnType();
        if (returnType.equals(Integer.TYPE)) {
            return 0;
        }
        if (returnType.equals(Long.TYPE)) {
            return 0L;
        }
        if (returnType.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (returnType.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (returnType.equals(Short.TYPE) || returnType.equals(Byte.TYPE) || returnType.equals(Character.TYPE)) {
            return 0;
        }
        if (returnType.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (returnType.equals(Boolean.class)) {
            return Boolean.FALSE;
        }
        returnType.isInterface();
        return null;
    }
}
