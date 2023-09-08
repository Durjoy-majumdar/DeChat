package com.tencent.p014mm.plugin.crashfix.jni;

import android.graphics.Bitmap;
import b31.C54403a;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.crashfix.jni.BitmapReleaseImmediately */
public class BitmapReleaseImmediately {
    private static final int MAX_FIND_CNT = 1000;
    private static final String TAG = "BitmapReleaseImmediately";
    private static Field bitmapmNativePtr;
    private static Method cleanerClean;
    private static Field cleanerFirst;
    private static Field cleanerNext;
    private static Field cleanerPrev;
    private static Method getNativeInstanceMethod = null;
    private static boolean isHookSucc = false;
    private static Map<Long, WeakReference<Bitmap>> map = new ConcurrentHashMap();
    private static Method referenceGetReferent;
    private byte _hellAccFlag_;

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("systemcrashprotect");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/crashfix/jni/BitmapReleaseImmediately", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/plugin/crashfix/jni/BitmapReleaseImmediately", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static void fastRelease(long j) {
        WeakReference remove;
        Bitmap bitmap;
        if (isHookSucc && (remove = map.remove(Long.valueOf(j))) != null && (bitmap = (Bitmap) remove.get()) != null) {
            try {
                Object obj = cleanerFirst.get((Object) null);
                Object obj2 = obj;
                int i = 0;
                do {
                    Object invoke = referenceGetReferent.invoke(obj2, new Object[0]);
                    if (!(invoke instanceof Bitmap) || invoke != bitmap) {
                        obj2 = cleanerNext.get(obj2);
                        if (obj2 != obj) {
                            i++;
                        } else {
                            return;
                        }
                    } else {
                        C54403a.m61093a(TAG, "find it %d! clean!", Integer.valueOf(invoke.hashCode()));
                        cleanerClean.invoke(obj2, new Object[0]);
                        bitmapmNativePtr.setLong(bitmap, 0);
                        return;
                    }
                } while (i < 1000);
                Object[] objArr = new Object[0];
                if (C54403a.f152605a != null) {
                    Log.m105921e(TAG, "what???", objArr);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static native void hook(int i, Method method, Method method2, Method method3, Method method4);

    public static native void hook11(int i, Method method, Method method2, Method method3, long j);

    private static boolean init() {
        Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8).recycle();
        try {
            Field reflectField = reflectField(Bitmap.class, "mNativePtr");
            bitmapmNativePtr = reflectField;
            reflectField.setAccessible(true);
            Class<?> cls = Class.forName("sun.misc.Cleaner");
            Field reflectField2 = reflectField(cls, "first");
            cleanerFirst = reflectField2;
            reflectField2.setAccessible(true);
            Field reflectField3 = reflectField(cls, "next");
            cleanerNext = reflectField3;
            reflectField3.setAccessible(true);
            Field reflectField4 = reflectField(cls, "prev");
            cleanerPrev = reflectField4;
            reflectField4.setAccessible(true);
            Method reflectMethod = reflectMethod(cls, "clean", new Class[0]);
            cleanerClean = reflectMethod;
            reflectMethod.setAccessible(true);
            Method reflectMethod2 = reflectMethod(Reference.class, "getReferent", new Class[0]);
            referenceGetReferent = reflectMethod2;
            reflectMethod2.setAccessible(true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void recordBitmapPtr(Object obj) {
        if (isHookSucc) {
            try {
                if (getNativeInstanceMethod == null) {
                    getNativeInstanceMethod = reflectMethod(Bitmap.class, "getNativeInstance", new Class[0]);
                }
                if (obj instanceof Bitmap) {
                    long longValue = ((Long) getNativeInstanceMethod.invoke(obj, new Object[0])).longValue();
                    if (longValue != 0) {
                        map.put(Long.valueOf(longValue), new WeakReference((Bitmap) obj));
                    }
                }
            } catch (Exception e) {
                if (C54403a.f152605a != null) {
                    Log.m105920e(TAG, e.getStackTrace().toString());
                }
            }
        }
    }

    private static Field reflectField(Class cls, String str) {
        Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", new Class[]{String.class});
        declaredMethod.setAccessible(true);
        return (Field) declaredMethod.invoke(cls, new Object[]{str});
    }

    private static Method reflectMethod(Class cls, Object... objArr) {
        Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, Class[].class});
        declaredMethod.setAccessible(true);
        return (Method) declaredMethod.invoke(cls, objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void work() {
        /*
            java.lang.Class<com.tencent.mm.plugin.crashfix.jni.BitmapReleaseImmediately> r0 = com.tencent.p014mm.plugin.crashfix.jni.BitmapReleaseImmediately.class
            java.lang.Class<int[]> r1 = int[].class
            java.lang.String r2 = "BitmapReleaseImmediately"
            r3 = 0
            boolean r4 = init()     // Catch:{ Exception -> 0x0128 }
            if (r4 != 0) goto L_0x0010
            isHookSucc = r3     // Catch:{ Exception -> 0x0128 }
            return
        L_0x0010:
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0128 }
            java.lang.String r7 = "nativeRecycle"
            r6[r3] = r7     // Catch:{ Exception -> 0x0128 }
            r7 = 1
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0128 }
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0128 }
            r8[r3] = r9     // Catch:{ Exception -> 0x0128 }
            r6[r7] = r8     // Catch:{ Exception -> 0x0128 }
            java.lang.reflect.Method r12 = reflectMethod(r4, r6)     // Catch:{ Exception -> 0x0128 }
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0128 }
            java.lang.String r8 = "nativeHasAlpha"
            r6[r3] = r8     // Catch:{ Exception -> 0x0128 }
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0128 }
            r8[r3] = r9     // Catch:{ Exception -> 0x0128 }
            r6[r7] = r8     // Catch:{ Exception -> 0x0128 }
            java.lang.reflect.Method r13 = reflectMethod(r4, r6)     // Catch:{ Exception -> 0x0128 }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0128 }
            r4 = 26
            java.lang.String r8 = "nativeCreate"
            r11 = 4
            r14 = 3
            r16 = 7
            r6 = 29
            if (r10 < r4) goto L_0x0079
            if (r10 >= r6) goto L_0x0079
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0128 }
            r6[r3] = r8     // Catch:{ Exception -> 0x0128 }
            r15 = 9
            java.lang.Class[] r15 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0128 }
            r15[r3] = r1     // Catch:{ Exception -> 0x0128 }
            java.lang.Class r20 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0128 }
            r15[r7] = r20     // Catch:{ Exception -> 0x0128 }
            r15[r5] = r20     // Catch:{ Exception -> 0x0128 }
            r15[r14] = r20     // Catch:{ Exception -> 0x0128 }
            r15[r11] = r20     // Catch:{ Exception -> 0x0128 }
            r19 = 5
            r15[r19] = r20     // Catch:{ Exception -> 0x0128 }
            java.lang.Class r20 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0128 }
            r17 = 6
            r15[r17] = r20     // Catch:{ Exception -> 0x0128 }
            java.lang.Class<float[]> r20 = float[].class
            r15[r16] = r20     // Catch:{ Exception -> 0x0128 }
            java.lang.Class<android.graphics.ColorSpace$Rgb$TransferParameters> r20 = android.graphics.ColorSpace.Rgb.TransferParameters.class
            r18 = 8
            r15[r18] = r20     // Catch:{ Exception -> 0x0128 }
            r6[r7] = r15     // Catch:{ Exception -> 0x0128 }
            java.lang.reflect.Method r4 = reflectMethod(r4, r6)     // Catch:{ Exception -> 0x0128 }
            goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            r6 = 30
            r15 = 29
            if (r10 < r15) goto L_0x00ab
            if (r10 > r6) goto L_0x00ab
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0128 }
            r15[r3] = r8     // Catch:{ Exception -> 0x0128 }
            r8 = 8
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0128 }
            r8[r3] = r1     // Catch:{ Exception -> 0x0128 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0128 }
            r8[r7] = r1     // Catch:{ Exception -> 0x0128 }
            r8[r5] = r1     // Catch:{ Exception -> 0x0128 }
            r8[r14] = r1     // Catch:{ Exception -> 0x0128 }
            r8[r11] = r1     // Catch:{ Exception -> 0x0128 }
            r18 = 5
            r8[r18] = r1     // Catch:{ Exception -> 0x0128 }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0128 }
            r17 = 6
            r8[r17] = r1     // Catch:{ Exception -> 0x0128 }
            r8[r16] = r9     // Catch:{ Exception -> 0x0128 }
            r15[r7] = r8     // Catch:{ Exception -> 0x0128 }
            java.lang.reflect.Method r1 = reflectMethod(r4, r15)     // Catch:{ Exception -> 0x0128 }
            goto L_0x00ac
        L_0x00ab:
            r1 = r4
        L_0x00ac:
            if (r10 < r6) goto L_0x00f0
            java.lang.String r4 = ">= 30"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0128 }
            b31.C54403a.m61093a(r2, r4, r6)     // Catch:{ Exception -> 0x0128 }
            java.lang.Class<java.lang.reflect.Executable> r4 = java.lang.reflect.Executable.class
            java.lang.String r6 = "artMethod"
            java.lang.reflect.Field r4 = reflectField(r4, r6)     // Catch:{ Exception -> 0x0128 }
            r4.setAccessible(r7)     // Catch:{ Exception -> 0x0128 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0128 }
            java.lang.String r8 = "hook11"
            r6[r3] = r8     // Catch:{ Exception -> 0x0128 }
            r8 = 5
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0128 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0128 }
            r8[r3] = r15     // Catch:{ Exception -> 0x0128 }
            java.lang.Class<java.lang.reflect.Method> r15 = java.lang.reflect.Method.class
            r8[r7] = r15     // Catch:{ Exception -> 0x0128 }
            java.lang.Class<java.lang.reflect.Method> r15 = java.lang.reflect.Method.class
            r8[r5] = r15     // Catch:{ Exception -> 0x0128 }
            java.lang.Class<java.lang.reflect.Method> r5 = java.lang.reflect.Method.class
            r8[r14] = r5     // Catch:{ Exception -> 0x0128 }
            r8[r11] = r9     // Catch:{ Exception -> 0x0128 }
            r6[r7] = r8     // Catch:{ Exception -> 0x0128 }
            java.lang.reflect.Method r0 = reflectMethod(r0, r6)     // Catch:{ Exception -> 0x0128 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x0128 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0128 }
            long r14 = r0.longValue()     // Catch:{ Exception -> 0x0128 }
            r11 = r1
            hook11(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0128 }
            goto L_0x011d
        L_0x00f0:
            java.lang.String r4 = "< 30"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0128 }
            b31.C54403a.m61093a(r2, r4, r6)     // Catch:{ Exception -> 0x0128 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0128 }
            java.lang.String r6 = "hook"
            r4[r3] = r6     // Catch:{ Exception -> 0x0128 }
            r6 = 5
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0128 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0128 }
            r6[r3] = r8     // Catch:{ Exception -> 0x0128 }
            java.lang.Class<java.lang.reflect.Method> r8 = java.lang.reflect.Method.class
            r6[r7] = r8     // Catch:{ Exception -> 0x0128 }
            java.lang.Class<java.lang.reflect.Method> r8 = java.lang.reflect.Method.class
            r6[r5] = r8     // Catch:{ Exception -> 0x0128 }
            java.lang.Class<java.lang.reflect.Method> r5 = java.lang.reflect.Method.class
            r6[r14] = r5     // Catch:{ Exception -> 0x0128 }
            java.lang.Class<java.lang.reflect.Method> r5 = java.lang.reflect.Method.class
            r6[r11] = r5     // Catch:{ Exception -> 0x0128 }
            r4[r7] = r6     // Catch:{ Exception -> 0x0128 }
            java.lang.reflect.Method r0 = reflectMethod(r0, r4)     // Catch:{ Exception -> 0x0128 }
            hook(r10, r1, r12, r13, r0)     // Catch:{ Exception -> 0x0128 }
        L_0x011d:
            isHookSucc = r7     // Catch:{ Exception -> 0x0128 }
            java.lang.String r0 = "succ"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0128 }
            b31.C54403a.m61093a(r2, r0, r1)     // Catch:{ Exception -> 0x0128 }
            goto L_0x013a
        L_0x0128:
            r0 = move-exception
            b31.a$a r1 = b31.C54403a.f152605a
            if (r1 == 0) goto L_0x0138
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0138:
            isHookSucc = r3
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.crashfix.jni.BitmapReleaseImmediately.work():void");
    }
}
