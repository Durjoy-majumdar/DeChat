package com.tencent.tinker.loader.hotplug.interceptor;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.hotplug.interceptor.Interceptor;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class ServiceBinderInterceptor extends Interceptor<IBinder> {
    private static final String TAG = "Tinker.SvcBndrIntrcptr";
    private static Method sGetServiceMethod;
    private static Field sSCacheField;
    private static Class<?> sServiceManagerClazz;
    private final Context mBaseContext;
    private final BinderInvocationHandler mBinderInvocationHandler;
    private final String mServiceName;

    public interface BinderInvocationHandler {
        Object invoke(Object obj, Method method, Object[] objArr);
    }

    public static class FakeClientBinderHandler implements InvocationHandler {
        private final BinderInvocationHandler mBinderInvocationHandler;
        private final IBinder mOriginalClientBinder;

        public FakeClientBinderHandler(IBinder iBinder, BinderInvocationHandler binderInvocationHandler) {
            this.mOriginalClientBinder = iBinder;
            this.mBinderInvocationHandler = binderInvocationHandler;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String str;
            if (!"queryLocalInterface".equals(method.getName())) {
                return method.invoke(this.mOriginalClientBinder, objArr);
            }
            String interfaceDescriptor = this.mOriginalClientBinder.getInterfaceDescriptor();
            if (interfaceDescriptor.equals("android.app.IActivityManager")) {
                str = "android.app.ActivityManagerNative";
            } else {
                str = interfaceDescriptor + "$Stub";
            }
            IInterface iInterface = (IInterface) ShareReflectUtil.findMethod(Class.forName(str), "asInterface", (Class<?>[]) new Class[]{IBinder.class}).invoke((Object) null, new Object[]{this.mOriginalClientBinder});
            return ServiceBinderInterceptor.createProxy(ServiceBinderInterceptor.getAllInterfacesThroughDeriveChain(iInterface.getClass()), new FakeInterfaceHandler(iInterface, (IBinder) obj, this.mBinderInvocationHandler));
        }
    }

    public static class FakeInterfaceHandler implements InvocationHandler {
        private final BinderInvocationHandler mBinderInvocationHandler;
        private final IBinder mOriginalClientBinder;
        private final IInterface mOriginalInterface;

        public FakeInterfaceHandler(IInterface iInterface, IBinder iBinder, BinderInvocationHandler binderInvocationHandler) {
            this.mOriginalInterface = iInterface;
            this.mOriginalClientBinder = iBinder;
            this.mBinderInvocationHandler = binderInvocationHandler;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            return "asBinder".equals(method.getName()) ? this.mOriginalClientBinder : this.mBinderInvocationHandler.invoke(this.mOriginalInterface, method, objArr);
        }
    }

    static {
        synchronized (ServiceBinderInterceptor.class) {
            if (sServiceManagerClazz == null) {
                try {
                    Class<?> cls = Class.forName("android.os.ServiceManager");
                    sServiceManagerClazz = cls;
                    sSCacheField = ShareReflectUtil.findField(cls, "sCache");
                    sGetServiceMethod = ShareReflectUtil.findMethod(sServiceManagerClazz, "getService", (Class<?>[]) new Class[]{String.class});
                } catch (Throwable th) {
                    ShareTinkerLog.m106531e(TAG, "unexpected exception.", th);
                }
            }
        }
    }

    public ServiceBinderInterceptor(Context context, String str, BinderInvocationHandler binderInvocationHandler) {
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        this.mBaseContext = context;
        this.mServiceName = str;
        this.mBinderInvocationHandler = binderInvocationHandler;
    }

    /* access modifiers changed from: private */
    public static <T> T createProxy(Class<?>[] clsArr, InvocationHandler invocationHandler) {
        ClassLoader r0;
        int length = clsArr.length + 1;
        Class[] clsArr2 = new Class[length];
        System.arraycopy(clsArr, 0, clsArr2, 0, clsArr.length);
        clsArr2[clsArr.length] = Interceptor.ITinkerHotplugProxy.class;
        try {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), clsArr2, invocationHandler);
        } catch (Throwable unused) {
            throw new RuntimeException("cl: " + r0, th);
        }
    }

    private static void fixAMSBinderCache(IBinder iBinder) {
        Object obj;
        Class<Interceptor.ITinkerHotplugProxy> cls = Interceptor.ITinkerHotplugProxy.class;
        try {
            obj = ShareReflectUtil.findField(Class.forName("android.app.ActivityManagerNative"), "gDefault").get((Object) null);
        } catch (Throwable unused) {
            obj = ShareReflectUtil.findField(Class.forName("android.app.ActivityManager"), "IActivityManagerSingleton").get((Object) null);
        }
        Field findField = ShareReflectUtil.findField(obj, "mInstance");
        IInterface iInterface = (IInterface) findField.get(obj);
        if (iInterface != null && !cls.isAssignableFrom(iInterface.getClass())) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor());
            if (queryLocalInterface == null || !cls.isAssignableFrom(queryLocalInterface.getClass())) {
                throw new IllegalStateException("fakeBinder does not return fakeInterface, binder: " + iBinder + ", itf: " + queryLocalInterface);
            }
            findField.set(obj, queryLocalInterface);
        }
    }

    private static void fixPMSBinderCache(Context context, IBinder iBinder) {
        Class<Interceptor.ITinkerHotplugProxy> cls = Interceptor.ITinkerHotplugProxy.class;
        Field findField = ShareReflectUtil.findField(Class.forName("android.app.ActivityThread"), "sPackageManager");
        IInterface iInterface = (IInterface) findField.get((Object) null);
        if (iInterface != null && !cls.isAssignableFrom(iInterface.getClass())) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor());
            if (queryLocalInterface == null || !cls.isAssignableFrom(queryLocalInterface.getClass())) {
                throw new IllegalStateException("fakeBinder does not return fakeInterface, binder: " + iBinder + ", itf: " + queryLocalInterface);
            }
            findField.set((Object) null, queryLocalInterface);
        }
        Field findField2 = ShareReflectUtil.findField(Class.forName("android.app.ApplicationPackageManager"), "mPM");
        PackageManager packageManager = context.getPackageManager();
        IInterface iInterface2 = (IInterface) findField2.get(packageManager);
        if (iInterface2 != null && !cls.isAssignableFrom(iInterface2.getClass())) {
            IInterface queryLocalInterface2 = iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor());
            if (queryLocalInterface2 == null || !cls.isAssignableFrom(queryLocalInterface2.getClass())) {
                throw new IllegalStateException("fakeBinder does not return fakeInterface, binder: " + iBinder + ", itf: " + queryLocalInterface2);
            }
            findField2.set(packageManager, queryLocalInterface2);
        }
    }

    /* access modifiers changed from: private */
    public static Class<?>[] getAllInterfacesThroughDeriveChain(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        HashSet hashSet = new HashSet(10);
        for (Class<? super Object> cls2 = cls; !Object.class.equals(cls2); cls2 = cls2.getSuperclass()) {
            hashSet.addAll(Arrays.asList(cls2.getInterfaces()));
        }
        return (Class[]) hashSet.toArray(new Class[hashSet.size()]);
    }

    public IBinder decorate(IBinder iBinder) {
        if (iBinder == null) {
            throw new IllegalStateException("target is null.");
        } else if (Interceptor.ITinkerHotplugProxy.class.isAssignableFrom(iBinder.getClass())) {
            return iBinder;
        } else {
            return (IBinder) createProxy(getAllInterfacesThroughDeriveChain(iBinder.getClass()), new FakeClientBinderHandler(iBinder, this.mBinderInvocationHandler));
        }
    }

    public IBinder fetchTarget() {
        return (IBinder) sGetServiceMethod.invoke((Object) null, new Object[]{this.mServiceName});
    }

    public void inject(IBinder iBinder) {
        ((Map) sSCacheField.get((Object) null)).put(this.mServiceName, iBinder);
        if (EnvConsts.ACTIVITY_MANAGER_SRVNAME.equals(this.mServiceName)) {
            fixAMSBinderCache(iBinder);
        } else if ("package".equals(this.mServiceName)) {
            fixPMSBinderCache(this.mBaseContext, iBinder);
        }
    }
}
