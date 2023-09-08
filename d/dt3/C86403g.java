package dt3;

import ct3.C86134a;
import java.lang.reflect.Method;

/* renamed from: dt3.g */
public class C86403g implements C86134a {

    /* renamed from: a */
    public int f251182a = -1;

    /* renamed from: b */
    public String f251183b = "";

    /* JADX WARNING: Can't wrap try/catch for region: R(5:29|30|31|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0055 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized ct3.C86139c mo120551a(android.content.Context r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo120818b()     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0011
            r8 = -205(0xffffffffffffff33, float:NaN)
            r7.f251182a = r8     // Catch:{ all -> 0x0072 }
            ct3.c r8 = ct3.C86139c.m106651a(r8)     // Catch:{ all -> 0x0072 }
            monitor-exit(r7)
            return r8
        L_0x0011:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0072 }
            r0 = 0
            r7.f251182a = r0     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x0072 }
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x0068 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0068 }
            if (r8 != 0) goto L_0x0035
            r8 = -201(0xffffffffffffff37, float:NaN)
            r7.f251182a = r8     // Catch:{ all -> 0x0072 }
            ct3.c r8 = ct3.C86139c.m106651a(r8)     // Catch:{ all -> 0x0072 }
            monitor-exit(r7)
            return r8
        L_0x0035:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "value"
            int r0 = r8.getColumnIndex(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x004c }
            r7.f251183b = r0     // Catch:{ all -> 0x004c }
        L_0x0048:
            r8.close()     // Catch:{ all -> 0x005a }
            goto L_0x005a
        L_0x004c:
            r0 = -203(0xffffffffffffff35, float:NaN)
            r7.f251182a = r0     // Catch:{ all -> 0x0051 }
            goto L_0x0048
        L_0x0051:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0056:
            r8 = -202(0xffffffffffffff36, float:NaN)
            r7.f251182a = r8     // Catch:{ all -> 0x0072 }
        L_0x005a:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0072 }
            ct3.c r8 = new ct3.c     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r7.f251183b     // Catch:{ all -> 0x0072 }
            int r1 = r7.f251182a     // Catch:{ all -> 0x0072 }
            r8.<init>(r0, r1)     // Catch:{ all -> 0x0072 }
            monitor-exit(r7)
            return r8
        L_0x0068:
            r8 = -200(0xffffffffffffff38, float:NaN)
            r7.f251182a = r8     // Catch:{ all -> 0x0072 }
            ct3.c r8 = ct3.C86139c.m106651a(r8)     // Catch:{ all -> 0x0072 }
            monitor-exit(r7)
            return r8
        L_0x0072:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dt3.C86403g.mo120551a(android.content.Context):ct3.c");
    }

    /* renamed from: b */
    public final boolean mo120818b() {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            Method method = cls2.getMethod("get", new Class[]{cls, cls});
            method.setAccessible(true);
            return "1".equals((String) method.invoke(cls2, new Object[]{"persist.sys.identifierid.supported", "0"}));
        } catch (Throwable unused) {
            return false;
        }
    }
}
