package dv3;

import android.os.Build;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import iv3.C87824b;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: dv3.a */
public class C86407a {

    /* renamed from: dv3.a$a */
    public static final class C86408a {
        /* renamed from: a */
        public static void m107076a(ClassLoader classLoader, File file) {
            Object obj = ShareReflectUtil.findField((Object) classLoader, "pathList").get(classLoader);
            Field findField = ShareReflectUtil.findField(obj, "nativeLibraryDirectories");
            File[] fileArr = (File[]) findField.get(obj);
            ArrayList arrayList = new ArrayList(fileArr.length + 1);
            arrayList.add(file);
            for (File file2 : fileArr) {
                if (!file.equals(file2)) {
                    arrayList.add(file2);
                }
            }
            findField.set(obj, arrayList.toArray(new File[0]));
        }
    }

    /* renamed from: dv3.a$b */
    public static final class C86409b {
        /* renamed from: a */
        public static void m107077a(ClassLoader classLoader, File file) {
            Object obj = ShareReflectUtil.findField((Object) classLoader, "pathList").get(classLoader);
            List list = (List) ShareReflectUtil.findField(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (file.equals((File) it.next())) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            list.add(0, file);
            List list2 = (List) ShareReflectUtil.findField(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            Field findField = ShareReflectUtil.findField(obj, "nativeLibraryPathElements");
            findField.set(obj, (Object[]) ShareReflectUtil.findMethod(obj, "makePathElements", (Class<?>[]) new Class[]{List.class, File.class, List.class}).invoke(obj, new Object[]{arrayList, null, new ArrayList()}));
        }
    }

    /* renamed from: dv3.a$c */
    public static final class C86410c {
        /* renamed from: a */
        public static void m107078a(ClassLoader classLoader, File file) {
            Object obj = ShareReflectUtil.findField((Object) classLoader, "pathList").get(classLoader);
            List list = (List) ShareReflectUtil.findField(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (file.equals((File) it.next())) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            list.add(0, file);
            List list2 = (List) ShareReflectUtil.findField(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            Field findField = ShareReflectUtil.findField(obj, "nativeLibraryPathElements");
            findField.set(obj, (Object[]) ShareReflectUtil.findMethod(obj, "makePathElements", (Class<?>[]) new Class[]{List.class}).invoke(obj, new Object[]{arrayList}));
        }
    }

    /* renamed from: a */
    public static boolean m107074a(ApplicationLike applicationLike, String str) {
        if (!C87824b.m109281c(applicationLike)) {
            ShareTinkerLog.m106531e("Tinker.LoadLibrary", "no loaded patch, skip installation.", new Object[0]);
            return false;
        }
        String b = C87824b.m109280b(applicationLike);
        if (ShareTinkerInternals.isNullOrNil(b)) {
            ShareTinkerLog.m106531e("Tinker.LoadLibrary", "failed to get current patch version.", new Object[0]);
            return false;
        }
        File patchDirectory = SharePatchFileUtil.getPatchDirectory(applicationLike.getApplication());
        if (patchDirectory == null) {
            ShareTinkerLog.m106531e("Tinker.LoadLibrary", "failed to get current patch directory.", new Object[0]);
            return false;
        }
        File file = new File(patchDirectory.getAbsolutePath() + "/" + SharePatchFileUtil.getPatchVersionDirectory(b));
        File file2 = new File(file.getAbsolutePath() + "/lib/lib/" + str);
        if (!file2.exists()) {
            ShareTinkerLog.m106531e("Tinker.LoadLibrary", "tinker lib path [%s] is not exists.", file2);
            return false;
        }
        ClassLoader classLoader = applicationLike.getApplication().getClassLoader();
        if (classLoader == null) {
            ShareTinkerLog.m106531e("Tinker.LoadLibrary", "classloader is null", new Object[0]);
            return false;
        }
        ShareTinkerLog.m106532i("Tinker.LoadLibrary", "before hack classloader:" + classLoader.toString(), new Object[0]);
        try {
            Method declaredMethod = C86407a.class.getDeclaredMethod("b", new Class[]{ClassLoader.class, File.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke((Object) null, new Object[]{classLoader, file2});
            return true;
        } catch (Throwable th) {
            ShareTinkerLog.m106531e("Tinker.LoadLibrary", "installNativeLibraryPath fail:" + file2 + ", thr: " + th, new Object[0]);
            return false;
        } finally {
            ShareTinkerLog.m106532i("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new Object[0]);
        }
    }

    /* renamed from: b */
    public static void m107075b(ClassLoader classLoader, File file) {
        if (file == null || !file.exists()) {
            ShareTinkerLog.m106531e("Tinker.LoadLibrary", "installNativeLibraryPath, folder %s is illegal", file);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if ((i == 25 && Build.VERSION.PREVIEW_SDK_INT != 0) || i > 25) {
            try {
                C86410c.m107078a(classLoader, file);
            } catch (Throwable th) {
                ShareTinkerLog.m106531e("Tinker.LoadLibrary", "installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23", Integer.valueOf(Build.VERSION.SDK_INT), th.getMessage());
                C86409b.m107077a(classLoader, file);
            }
        } else if (i >= 23) {
            try {
                C86409b.m107077a(classLoader, file);
            } catch (Throwable th4) {
                ShareTinkerLog.m106531e("Tinker.LoadLibrary", "installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14", Integer.valueOf(Build.VERSION.SDK_INT), th4.getMessage());
                C86408a.m107076a(classLoader, file);
            }
        } else {
            C86408a.m107076a(classLoader, file);
        }
    }
}
