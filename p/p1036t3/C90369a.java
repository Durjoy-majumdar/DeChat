package p1036t3;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: t3.a */
public final class C90369a {

    /* renamed from: a */
    public static final Set<File> f259377a = new HashSet();

    /* renamed from: b */
    public static final boolean f259378b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        f259378b = z;
    }

    /* renamed from: a */
    public static void m113159a(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : listFiles) {
                file2.getPath();
                file2.length();
                if (!file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (!file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0024 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0064 A[SYNTHETIC, Splitter:B:38:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0066 A[Catch:{ RuntimeException -> 0x006d }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m113160b(android.content.Context r4, java.io.File r5, java.io.File r6, java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            java.util.Set<java.io.File> r0 = f259377a
            monitor-enter(r0)
            r1 = r0
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            return
        L_0x000e:
            r1 = r0
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x0071 }
            r1.add(r5)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "java.vm.version"
            java.lang.System.getProperty(r1)     // Catch:{ all -> 0x0071 }
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch:{ RuntimeException -> 0x006d }
            if (r1 != 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            return
        L_0x0021:
            m113159a(r4)     // Catch:{ all -> 0x0024 }
        L_0x0024:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = "code_cache"
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0071 }
            m113163e(r2)     // Catch:{ IOException -> 0x002f }
            goto L_0x003b
        L_0x002f:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0071 }
            java.io.File r6 = r4.getFilesDir()     // Catch:{ all -> 0x0071 }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0071 }
            m113163e(r2)     // Catch:{ all -> 0x0071 }
        L_0x003b:
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0071 }
            r6.<init>(r2, r7)     // Catch:{ all -> 0x0071 }
            m113163e(r6)     // Catch:{ all -> 0x0071 }
            t3.c r7 = new t3.c     // Catch:{ all -> 0x0071 }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x0071 }
            r5 = 0
            r2 = 0
            java.util.List r2 = r7.mo124594c(r4, r8, r2)     // Catch:{ all -> 0x0068 }
            m113162d(r1, r6, r2)     // Catch:{ IOException -> 0x0052 }
            goto L_0x005d
        L_0x0052:
            r2 = move-exception
            if (r9 == 0) goto L_0x0067
            r9 = 1
            java.util.List r4 = r7.mo124594c(r4, r8, r9)     // Catch:{ all -> 0x0068 }
            m113162d(r1, r6, r4)     // Catch:{ all -> 0x0068 }
        L_0x005d:
            r7.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0062
        L_0x0061:
            r5 = move-exception
        L_0x0062:
            if (r5 != 0) goto L_0x0066
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            return
        L_0x0066:
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0067:
            throw r2     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r4 = move-exception
            r7.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x006d:
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            return
        L_0x006f:
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            throw r4
        L_0x0071:
            r4 = move-exception
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: p1036t3.C90369a.m113160b(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: c */
    public static Field m113161c(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* renamed from: d */
    public static void m113162d(ClassLoader classLoader, File file, List<? extends File> list) {
        IOException[] iOExceptionArr;
        if (!list.isEmpty()) {
            Object obj = m113161c(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Class[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            Class cls = obj.getClass();
            while (cls != null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr = (Object[]) declaredMethod.invoke(obj, new Object[]{arrayList2, file, arrayList});
                    Field c = m113161c(obj, "dexElements");
                    Object[] objArr2 = (Object[]) c.get(obj);
                    Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                    System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                    System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                    c.set(obj, objArr3);
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            IOException iOException = (IOException) it.next();
                        }
                        Field c2 = m113161c(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) c2.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                            arrayList.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        c2.set(obj, iOExceptionArr);
                        IOException iOException2 = new IOException("I/O exception during makeDexElement");
                        iOException2.initCause((Throwable) arrayList.get(0));
                        throw iOException2;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            }
            throw new NoSuchMethodException("Method " + "makeDexElements" + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
        }
    }

    /* renamed from: e */
    public static void m113163e(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                file.getPath();
            } else {
                file.getPath();
                parentFile.isDirectory();
                parentFile.isFile();
                parentFile.exists();
                parentFile.canRead();
                parentFile.canWrite();
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
