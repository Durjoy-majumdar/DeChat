package at3;

import android.content.Context;
import android.view.Display;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: at3.i */
public class C79631i {

    /* renamed from: a */
    public int f233505a = 0;

    /* renamed from: b */
    public int f233506b = 0;

    /* renamed from: c */
    public int f233507c = 0;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028 A[SYNTHETIC, Splitter:B:15:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo109770a(android.content.Context r8) {
        /*
            r7 = this;
            int r0 = r7.mo109771b(r8)     // Catch:{ all -> 0x0006 }
            r7.f233505a = r0     // Catch:{ all -> 0x0006 }
        L_0x0006:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/sys/class/android_usb/android0/state"
            r0.<init>(r1)
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0024 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0024 }
            r3.<init>(r0)     // Catch:{ all -> 0x0024 }
            r2.<init>(r3)     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0022 }
            r2.close()     // Catch:{ all -> 0x0020 }
            goto L_0x002d
        L_0x0020:
            goto L_0x002d
        L_0x0022:
            goto L_0x0026
        L_0x0024:
            r2 = r1
        L_0x0026:
            if (r2 == 0) goto L_0x002b
            r2.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            java.lang.String r0 = ""
        L_0x002d:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0037
            goto L_0x0057
        L_0x0037:
            java.lang.String r2 = "CONFIGURED"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0042
            r7.f233506b = r5
            goto L_0x0057
        L_0x0042:
            java.lang.String r2 = "DISCONNECTED"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x004d
            r7.f233506b = r4
            goto L_0x0057
        L_0x004d:
            java.lang.String r2 = "CONNECTED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0057
            r7.f233506b = r3
        L_0x0057:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r2)
            android.content.Intent r8 = r8.registerReceiver(r1, r0)
            if (r8 != 0) goto L_0x0065
            goto L_0x008f
        L_0x0065:
            r0 = -1
            java.lang.String r1 = "status"
            int r1 = r8.getIntExtra(r1, r0)
            r2 = 0
            if (r1 == r4) goto L_0x0076
            r6 = 5
            if (r1 != r6) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r1 = 0
            goto L_0x0077
        L_0x0076:
            r1 = 1
        L_0x0077:
            if (r1 != 0) goto L_0x007c
            r7.f233507c = r5
            goto L_0x008f
        L_0x007c:
            java.lang.String r1 = "plugged"
            int r8 = r8.getIntExtra(r1, r0)
            if (r8 != r4) goto L_0x0088
            r7.f233507c = r3
            goto L_0x008f
        L_0x0088:
            if (r8 != r5) goto L_0x008d
            r7.f233507c = r4
            goto L_0x008f
        L_0x008d:
            r7.f233507c = r2
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: at3.C79631i.mo109770a(android.content.Context):void");
    }

    /* renamed from: b */
    public final int mo109771b(Context context) {
        Method method;
        Class<?> cls = Class.forName("android.hardware.display.DisplayManager");
        Field field = context.getClass().getField("DISPLAY_SERVICE");
        int i = 1;
        field.setAccessible(true);
        Object systemService = context.getSystemService((String) field.get(context));
        if (systemService == null || (method = cls.getMethod("getDisplays", new Class[0])) == null) {
            return 0;
        }
        method.setAccessible(true);
        Display[] displayArr = (Display[]) method.invoke(systemService, new Object[0]);
        Method method2 = Display.class.getMethod("getState", new Class[0]);
        method2.setAccessible(true);
        Field field2 = Display.class.getField("STATE_OFF");
        field2.setAccessible(true);
        boolean z = false;
        for (Display display : displayArr) {
            if (((Integer) method2.invoke(display, new Object[0])).intValue() != field2.getInt(display)) {
                z = true;
            }
        }
        if (!z) {
            i = 2;
        }
        this.f233505a = i;
        return i;
    }
}
