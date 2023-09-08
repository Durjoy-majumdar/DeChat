package com.tencent.tinker.loader;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import dalvik.system.DelegateLastClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

final class NewClassLoaderInjector {
    private NewClassLoaderInjector() {
        throw new UnsupportedOperationException();
    }

    private static ClassLoader createNewClassLoader(ClassLoader classLoader, File file, boolean z, boolean z2, String... strArr) {
        ClassLoader classLoader2;
        Object obj = findField(Class.forName("dalvik.system.BaseDexClassLoader", false, classLoader), "pathList").get(classLoader);
        StringBuilder sb = new StringBuilder();
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                if (i > 0) {
                    sb.append(File.pathSeparator);
                }
                sb.append(strArr[i]);
            }
        }
        String sb4 = sb.toString();
        Field findField = findField(obj.getClass(), "nativeLibraryDirectories");
        List<File> asList = findField.getType().isArray() ? Arrays.asList((File[]) findField.get(obj)) : (List) findField.get(obj);
        StringBuilder sb5 = new StringBuilder();
        boolean z3 = true;
        for (File file2 : asList) {
            if (file2 != null) {
                if (z3) {
                    z3 = false;
                } else {
                    sb5.append(File.pathSeparator);
                }
                sb5.append(file2.getAbsolutePath());
            }
        }
        String sb6 = sb5.toString();
        if (!z || !ShareTinkerInternals.isNewerOrEqualThanVersion(27, true)) {
            classLoader2 = new TinkerClassLoader(sb4, file, sb6, classLoader);
        } else if (ShareTinkerInternals.isNewerOrEqualThanVersion(31, true)) {
            classLoader2 = new DelegateLastClassLoader(sb4, sb6, classLoader);
        } else {
            classLoader2 = new DelegateLastClassLoader(sb4, sb6, ClassLoader.getSystemClassLoader());
            Field declaredField = ClassLoader.class.getDeclaredField("parent");
            declaredField.setAccessible(true);
            declaredField.set(classLoader2, classLoader);
        }
        if (z2 && !ShareTinkerInternals.isNewerOrEqualThanVersion(26, true)) {
            findField(obj.getClass(), "definingContext").set(obj, classLoader2);
        }
        return classLoader2;
    }

    private static void doInject(Application application, ClassLoader classLoader) {
        Thread.currentThread().setContextClassLoader(classLoader);
        Context context = (Context) findField(application.getClass(), "mBase").get(application);
        try {
            findField(context.getClass(), "mClassLoader").set(context, classLoader);
        } catch (Throwable unused) {
        }
        Object obj = findField(context.getClass(), "mPackageInfo").get(context);
        findField(obj.getClass(), "mClassLoader").set(obj, classLoader);
        if (Build.VERSION.SDK_INT < 27) {
            Resources resources = application.getResources();
            try {
                findField(resources.getClass(), "mClassLoader").set(resources, classLoader);
                Object obj2 = findField(resources.getClass(), "mDrawableInflater").get(resources);
                if (obj2 != null) {
                    findField(obj2.getClass(), "mClassLoader").set(obj2, classLoader);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private static Field findField(Class<?> cls, String str) {
        Class<?> cls2 = cls;
        while (true) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Throwable unused) {
                if (cls2 != Object.class) {
                    cls2 = cls2.getSuperclass();
                } else {
                    throw new NoSuchFieldException("Cannot find field " + str + " in class " + cls.getName() + " and its super classes.");
                }
            }
        }
    }

    public static ClassLoader inject(Application application, ClassLoader classLoader, File file, boolean z, List<File> list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i).getAbsolutePath();
        }
        ClassLoader createNewClassLoader = createNewClassLoader(classLoader, file, z, true, strArr);
        doInject(application, createNewClassLoader);
        return createNewClassLoader;
    }

    public static ClassLoader triggerDex2Oat(Context context, File file, boolean z, String... strArr) {
        return createNewClassLoader(context.getClassLoader(), file, z, false, strArr);
    }
}
