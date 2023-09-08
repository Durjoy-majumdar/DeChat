package rv3;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import android.view.Display;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k20.C9556a;

/* renamed from: rv3.c */
public final class C90101c {

    /* renamed from: a */
    public static String f258755a;

    /* renamed from: b */
    public static String f258756b;

    /* renamed from: a */
    public static String m112728a(Context context) {
        try {
            if (f258756b == null) {
                ContentResolver contentResolver = MMApplicationContext.getContext().getContentResolver();
                C9556a aVar = new C9556a();
                aVar.mo10233c("android_id");
                aVar.mo10233c(contentResolver);
                f258756b = (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/turingshield/utils/DeviceUtil", "getAndoidId", "(Landroid/content/Context;)Ljava/lang/String;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
            }
            return MD5Util.getMD5String("[TuringSMI]" + f258756b);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m112729b(boolean r5) {
        /*
            java.lang.String r0 = ""
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = "/proc/version"
            r1.<init>(r2)     // Catch:{ all -> 0x0056 }
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r1)
            r4 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
        L_0x001a:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0028 }
            if (r4 == 0) goto L_0x0024
            r3.append(r4)     // Catch:{ all -> 0x0028 }
            goto L_0x001a
        L_0x0024:
            r2.close()     // Catch:{ all -> 0x002b }
            goto L_0x002b
        L_0x0028:
            r2.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            r1.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            java.lang.String r1 = r3.toString()
            if (r5 != 0) goto L_0x0036
            r0 = r1
            goto L_0x0056
        L_0x0036:
            if (r1 == 0) goto L_0x0056
            boolean r5 = r1.equals(r0)
            if (r5 != 0) goto L_0x0056
            java.lang.String r5 = "version "
            int r5 = r1.indexOf(r5)     // Catch:{ all -> 0x0056 }
            int r5 = r5 + 8
            java.lang.String r5 = r1.substring(r5)     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = " "
            int r1 = r5.indexOf(r1)     // Catch:{ all -> 0x0056 }
            r2 = 0
            java.lang.String r0 = r5.substring(r2, r1)     // Catch:{ all -> 0x0056 }
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv3.C90101c.m112729b(boolean):java.lang.String");
    }

    /* renamed from: c */
    public static int m112730c(Context context) {
        Method method;
        Class<?> cls = Class.forName("android.hardware.display.DisplayManager");
        Field field = context.getClass().getField("DISPLAY_SERVICE");
        field.setAccessible(true);
        Object systemService = context.getSystemService((String) field.get(context));
        if (systemService == null || (method = cls.getMethod("getDisplays", new Class[0])) == null) {
            return -1;
        }
        method.setAccessible(true);
        Display[] displayArr = (Display[]) method.invoke(systemService, new Object[0]);
        Method method2 = Display.class.getMethod("getState", new Class[0]);
        method2.setAccessible(true);
        Field field2 = Display.class.getField("STATE_OFF");
        field2.setAccessible(true);
        int i = 0;
        for (Display display : displayArr) {
            if (((Integer) method2.invoke(display, new Object[0])).intValue() != field2.getInt(display)) {
                i = 1;
            }
        }
        return i;
    }

    /* renamed from: d */
    public static String m112731d() {
        String[] strArr = {C90102d.m112732a(C90102d.f258758b), C90102d.m112732a(C90102d.f258759c)};
        String str = "";
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str = (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str2});
            } catch (Exception unused) {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                return MD5Util.getMD5String("[TuringSMI]" + str);
            }
        }
        return str;
    }
}
