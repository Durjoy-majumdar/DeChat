package gh3;

import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: gh3.e */
public final class C87188e extends C116965a {
    /* renamed from: a */
    public String mo58628a() {
        return "android.content.pm.IPackageManager";
    }

    /* renamed from: b */
    public String mo58629b() {
        return "package";
    }

    /* renamed from: d */
    public void mo58630d(Object obj) {
        Class<?> cls;
        C87412m.m108594g(obj, "serviceBinderProxy");
        PackageManager packageManager = MMApplicationContext.getContext().getPackageManager();
        if (packageManager != null) {
            try {
                Field declaredField = packageManager.getClass().getDeclaredField("mPM");
                Log.m105924i("HookPackageManagerProcessor", "applicationPkgManager-mPM = " + declaredField);
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    declaredField.set(packageManager, obj);
                }
            } catch (Throwable th) {
                Log.m105924i("HookPackageManagerProcessor", String.valueOf(th.getMessage()));
                if (MMApplicationContext.isMMProcess()) {
                    Field[] declaredFields = packageManager.getClass().getDeclaredFields();
                    C87412m.m108593f(declaredFields, "applicationPkgManager.javaClass.declaredFields");
                    mo121629e(packageManager, declaredFields, obj);
                }
            }
        }
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                Field declaredField2 = cls.getDeclaredField("sPackageManager");
                Log.m105924i("HookPackageManagerProcessor", "activityThread-sPackageManager = " + declaredField2);
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                    declaredField2.set(cls, obj);
                }
            } catch (Throwable th4) {
                Log.m105924i("HookPackageManagerProcessor", String.valueOf(th4.getMessage()));
                if (MMApplicationContext.isMMProcess()) {
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                    method.setAccessible(true);
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    if (invoke == null) {
                        Field field = context.getClass().getField("mLoadedApk");
                        field.setAccessible(true);
                        Object obj2 = field.get(context);
                        Field declaredField3 = obj2.getClass().getDeclaredField("mActivityThread");
                        declaredField3.setAccessible(true);
                        invoke = declaredField3.get(obj2);
                    }
                    Field[] declaredFields2 = cls.getDeclaredFields();
                    C87412m.m108593f(declaredFields2, "activityThread.declaredFields");
                    mo121629e(invoke, declaredFields2, obj);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo121629e(Object obj, Field[] fieldArr, Object obj2) {
        ArrayList arrayList;
        Class[] interfaces;
        Field field = null;
        if (!(!(fieldArr.length == 0))) {
            fieldArr = null;
        }
        if (fieldArr != null) {
            int length = fieldArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Field field2 = fieldArr[i];
                Object obj3 = obj != null ? field2.get(obj) : null;
                if (obj3 == null || (interfaces = obj3.getClass().getInterfaces()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(interfaces.length);
                    for (Class simpleName : interfaces) {
                        arrayList.add(simpleName.getSimpleName());
                    }
                }
                if (!(arrayList == null || arrayList.isEmpty()) && arrayList.contains("IPackageManager")) {
                    Log.m105924i("HookPackageManagerProcessor", "found IPackageManager in " + obj);
                    field = field2;
                    break;
                }
                i++;
            }
        }
        if (obj != null && field != null) {
            field.setAccessible(true);
            field.set(obj, obj2);
        }
    }
}
