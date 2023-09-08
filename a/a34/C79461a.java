package a34;

import android.content.Context;

/* renamed from: a34.a */
public class C79461a {

    /* renamed from: a */
    public static Context f233005a;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m96419a(java.lang.String r14) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x001c }
            java.lang.String r3 = "currentApplication"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x001c }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ Exception -> 0x001c }
            java.lang.Object r2 = r2.invoke(r0, r0)     // Catch:{ Exception -> 0x001c }
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ Exception -> 0x001c }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x001c }
            f233005a = r2     // Catch:{ Exception -> 0x001c }
        L_0x001c:
            android.content.Context r2 = f233005a
            boolean r3 = android.text.TextUtils.isEmpty(r14)
            r4 = 1
            if (r3 == 0) goto L_0x0026
            goto L_0x0068
        L_0x0026:
            k20.a r3 = new k20.a     // Catch:{ all -> 0x0064 }
            r3.<init>()     // Catch:{ all -> 0x0064 }
            r3.mo10233c(r14)     // Catch:{ all -> 0x0064 }
            java.lang.Object r13 = new java.lang.Object     // Catch:{ all -> 0x0064 }
            r13.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.Object[] r6 = r3.mo10232b()     // Catch:{ all -> 0x0064 }
            java.lang.String r7 = "org/extra/tools/LibraryLoadUtils"
            java.lang.String r8 = "load"
            java.lang.String r9 = "(Ljava/lang/String;)Z"
            java.lang.String r10 = "java/lang/System_EXEC_"
            java.lang.String r11 = "loadLibrary"
            java.lang.String r12 = "(Ljava/lang/String;)V"
            r5 = r13
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0064 }
            java.lang.Object r3 = r3.mo10231a(r1)     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0064 }
            java.lang.System.loadLibrary(r3)     // Catch:{ all -> 0x0064 }
            java.lang.String r6 = "org/extra/tools/LibraryLoadUtils"
            java.lang.String r7 = "load"
            java.lang.String r8 = "(Ljava/lang/String;)Z"
            java.lang.String r9 = "java/lang/System_EXEC_"
            java.lang.String r10 = "loadLibrary"
            java.lang.String r11 = "(Ljava/lang/String;)V"
            r5 = r13
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0064 }
            r3 = 1
            goto L_0x0069
        L_0x0064:
            r3 = move-exception
            r3.getMessage()
        L_0x0068:
            r3 = 0
        L_0x0069:
            if (r3 == 0) goto L_0x006c
            goto L_0x00c7
        L_0x006c:
            if (r2 == 0) goto L_0x00b3
            boolean r3 = android.text.TextUtils.isEmpty(r14)
            if (r3 == 0) goto L_0x0075
            goto L_0x00b3
        L_0x0075:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r3.<init>()     // Catch:{ all -> 0x00af }
            android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo()     // Catch:{ all -> 0x00af }
            java.lang.String r5 = r5.dataDir     // Catch:{ all -> 0x00af }
            r3.append(r5)     // Catch:{ all -> 0x00af }
            java.lang.String r5 = "/lib"
            r3.append(r5)     // Catch:{ all -> 0x00af }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00af }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r5.<init>()     // Catch:{ all -> 0x00af }
            r5.append(r3)     // Catch:{ all -> 0x00af }
            java.lang.String r3 = java.io.File.separator     // Catch:{ all -> 0x00af }
            r5.append(r3)     // Catch:{ all -> 0x00af }
            java.lang.String r3 = "lib"
            r5.append(r3)     // Catch:{ all -> 0x00af }
            r5.append(r14)     // Catch:{ all -> 0x00af }
            java.lang.String r3 = ".so"
            r5.append(r3)     // Catch:{ all -> 0x00af }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00af }
            java.lang.System.load(r3)     // Catch:{ all -> 0x00af }
            r1 = 1
            goto L_0x00b3
        L_0x00af:
            r3 = move-exception
            r3.getMessage()
        L_0x00b3:
            if (r1 == 0) goto L_0x00b6
            goto L_0x00c7
        L_0x00b6:
            if (r2 == 0) goto L_0x00c7
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 == 0) goto L_0x00bf
            goto L_0x00c7
        L_0x00bf:
            z24.f r1 = new z24.f     // Catch:{ all -> 0x00c7 }
            r1.<init>()     // Catch:{ all -> 0x00c7 }
            r1.mo125478b(r2, r14, r0, r0)     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a34.C79461a.m96419a(java.lang.String):void");
    }
}
