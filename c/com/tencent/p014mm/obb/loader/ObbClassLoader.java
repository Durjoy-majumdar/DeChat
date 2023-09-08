package com.tencent.p014mm.obb.loader;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.tencent.mm.obb.loader.ObbClassLoader */
public class ObbClassLoader extends PathClassLoader {
    private static final String TAG = "MicroMsg.ObbClassLoader";
    private final ClassLoader mAppClassLoader;
    private final String mAppClassName;

    /* renamed from: com.tencent.mm.obb.loader.ObbClassLoader$CompoundEnumeration */
    public class CompoundEnumeration<E> implements Enumeration<E> {
        private Enumeration<E>[] enums;
        private int index = 0;

        public CompoundEnumeration(Enumeration<E>[] enumerationArr) {
            this.enums = enumerationArr;
        }

        public boolean hasMoreElements() {
            while (true) {
                int i = this.index;
                Enumeration<E>[] enumerationArr = this.enums;
                if (i >= enumerationArr.length) {
                    return false;
                }
                Enumeration<E> enumeration = enumerationArr[i];
                if (enumeration != null && enumeration.hasMoreElements()) {
                    return true;
                }
                this.index++;
            }
        }

        public E nextElement() {
            if (hasMoreElements()) {
                return this.enums[this.index].nextElement();
            }
            throw new NoSuchElementException();
        }
    }

    private ObbClassLoader(String str, String str2, String str3, ClassLoader classLoader) {
        super(str2, str3, classLoader.getParent());
        this.mAppClassName = str;
        this.mAppClassLoader = classLoader;
    }

    private static final Field findField(Class<?> cls, String str) {
        Class<?> cls2 = cls;
        do {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Throwable unused) {
                if (cls2 == Object.class || (cls2 = cls2.getSuperclass()) != null) {
                    throw new NoSuchFieldException("Cannot find field '" + str + "' in class " + cls.getName() + " or its super classes.");
                }
                do {
                    Field declaredField2 = cls2.getDeclaredField(str);
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } while ((cls2 = cls2.getSuperclass()) != null);
                throw new NoSuchFieldException("Cannot find field '" + str + "' in class " + cls.getName() + " or its super classes.");
            }
        } while ((cls2 = cls2.getSuperclass()) != null);
        throw new NoSuchFieldException("Cannot find field '" + str + "' in class " + cls.getName() + " or its super classes.");
    }

    public static ClassLoader injectOnDemand(Application application) {
        return application.getClass().getClassLoader();
    }

    private static ObbClassLoader newInstance(Application application) {
        ClassLoader classLoader = application.getClass().getClassLoader();
        Object obj = findField(BaseDexClassLoader.class, "pathList").get(classLoader);
        ApplicationInfo applicationInfo = application.getApplicationInfo();
        String str = "/" + applicationInfo.packageName + "/";
        Object[] objArr = (Object[]) findField(obj.getClass(), "dexElements").get(obj);
        Field findField = findField(objArr.getClass().getComponentType(), "dexFile");
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        boolean z2 = true;
        for (Object obj2 : objArr) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(File.pathSeparator);
            }
            String name = ((DexFile) findField.get(obj2)).getName();
            if (name.equals(applicationInfo.sourceDir) || name.contains(str)) {
                sb.append(name);
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (File file : (List) ShareReflectUtil.findField(obj, "nativeLibraryDirectories").get(obj)) {
            if (z) {
                z = false;
            } else {
                sb4.append(File.pathSeparator);
            }
            sb4.append(file.getAbsolutePath());
        }
        return new ObbClassLoader(application.getClass().getName(), sb.toString(), sb4.toString(), classLoader);
    }

    public Class<?> findClass(String str) {
        Class<?> cls;
        if (str.equals(this.mAppClassName)) {
            return this.mAppClassLoader.loadClass(str);
        }
        if (str.startsWith("com.tencent.tinker.loader.") && !str.startsWith("com.tencent.tinker.loader.shareutil.")) {
            return this.mAppClassLoader.loadClass(str);
        }
        try {
            cls = super.findClass(str);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        return cls != null ? cls : this.mAppClassLoader.loadClass(str);
    }

    public URL getResource(String str) {
        URL resource = Object.class.getClassLoader().getResource(str);
        if (resource != null) {
            return resource;
        }
        URL findResource = findResource(str);
        return findResource != null ? findResource : this.mAppClassLoader.getResource(str);
    }

    public Enumeration<URL> getResources(String str) {
        return new CompoundEnumeration(new Enumeration[]{Object.class.getClassLoader().getResources(str), findResources(str), this.mAppClassLoader.getResources(str)});
    }
}
