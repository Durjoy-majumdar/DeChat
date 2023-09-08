package p1004m9;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import ol0.C117815j0;
import org.json.JSONObject;
import p1009n9.C88905a;

/* renamed from: m9.a */
public class C88714a {

    /* renamed from: c */
    public static final Uri f256069c = Uri.parse("content://com.oplus.fantasywindow.fantasywindowprovider/").buildUpon().appendPath("t_server").build();

    /* renamed from: a */
    public Context f256070a = null;

    /* renamed from: b */
    public C88715b f256071b = null;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043 A[Catch:{ Exception -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88714a(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.f256070a = r0
            r7.f256071b = r0
            r7.f256070a = r8
            java.lang.String r4 = "provide_function = \"parallelwindow\""
            r8 = 1
            r0 = 0
            android.content.Context r1 = r7.f256070a     // Catch:{ Exception -> 0x0049 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x0049 }
            android.net.Uri r2 = f256069c     // Catch:{ Exception -> 0x0049 }
            r3 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0049 }
            if (r1 == 0) goto L_0x0040
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0040
            java.lang.String r2 = "service_name"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ all -> 0x0032 }
            r1.getString(r2)     // Catch:{ all -> 0x0032 }
            r3 = 1
            goto L_0x0041
        L_0x0032:
            r2 = move-exception
            r3 = 1
            goto L_0x0037
        L_0x0035:
            r2 = move-exception
            r3 = 0
        L_0x0037:
            r1.close()     // Catch:{ all -> 0x003b }
            goto L_0x003f
        L_0x003b:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ Exception -> 0x0047 }
        L_0x003f:
            throw r2     // Catch:{ Exception -> 0x0047 }
        L_0x0040:
            r3 = 0
        L_0x0041:
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x004e
        L_0x0047:
            r1 = move-exception
            goto L_0x004b
        L_0x0049:
            r1 = move-exception
            r3 = 0
        L_0x004b:
            r1.getMessage()
        L_0x004e:
            if (r3 == 0) goto L_0x00b8
            m9.b r1 = r7.f256071b
            if (r1 != 0) goto L_0x00b8
            m9.b r1 = new m9.b
            android.content.Context r2 = r7.f256070a
            r1.<init>(r2)
            r7.f256071b = r1
            java.lang.String r2 = "com.oplus.compactwindow.OplusCompactWindowManager"
            java.lang.Object r3 = r1.f256073b
            if (r3 != 0) goto L_0x007f
            java.lang.Class r3 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x007b }
            java.lang.String r4 = "getInstance"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x007b }
            java.lang.reflect.Method r4 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x007b }
            r4.setAccessible(r8)     // Catch:{ Exception -> 0x007b }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x007b }
            java.lang.Object r3 = r4.invoke(r3, r5)     // Catch:{ Exception -> 0x007b }
            r1.f256073b = r3     // Catch:{ Exception -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r3 = move-exception
            r3.toString()
        L_0x007f:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.reflect.Method r4 = r1.f256074c
            if (r4 != 0) goto L_0x00a8
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r4 = "invokeSync"
            r5 = 4
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x00a4 }
            r5[r0] = r3     // Catch:{ Exception -> 0x00a4 }
            r5[r8] = r3     // Catch:{ Exception -> 0x00a4 }
            r6 = 2
            r5[r6] = r3     // Catch:{ Exception -> 0x00a4 }
            r3 = 3
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r5[r3] = r6     // Catch:{ Exception -> 0x00a4 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x00a4 }
            r1.f256074c = r2     // Catch:{ Exception -> 0x00a4 }
            r2.setAccessible(r8)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r2 = move-exception
            r2.toString()
        L_0x00a8:
            java.lang.Object r2 = r1.f256073b
            if (r2 == 0) goto L_0x00b1
            java.lang.reflect.Method r2 = r1.f256074c
            if (r2 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            r1.f256075d = r8
            m9.b r8 = r7.f256071b
            boolean r8 = r8.f256075d
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1004m9.C88714a.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public C88905a mo123148a(String str, String str2, JSONObject jSONObject, Bundle bundle) {
        Exception e;
        if (str == null || str2 == null) {
            return new C88905a(522, new Bundle());
        }
        C88715b bVar = this.f256071b;
        String packageName = this.f256070a.getPackageName();
        bVar.getClass();
        String str3 = jSONObject == null ? new String() : jSONObject.toString();
        boolean z = bVar.f256075d;
        int i = C117815j0.CTRL_INDEX;
        if (!z) {
            C88905a aVar = new C88905a();
            aVar.f256401a = C117815j0.CTRL_INDEX;
            aVar.f256402b = new Bundle();
            return aVar;
        }
        Bundle bundle2 = new Bundle();
        try {
            Object invoke = bVar.f256074c.invoke(bVar.f256073b, new Object[]{packageName, str2, str3, bundle});
            if (invoke == null || !(invoke instanceof Bundle)) {
                i = 0;
                C88905a aVar2 = new C88905a();
                aVar2.f256401a = i;
                aVar2.f256402b = new Bundle(bundle2);
                return aVar2;
            }
            Bundle bundle3 = (Bundle) invoke;
            try {
                i = bundle3.getInt("result", 0);
                bundle2 = bundle3;
            } catch (Exception e2) {
                e = e2;
                bundle2 = bundle3;
                e.toString();
                C88905a aVar22 = new C88905a();
                aVar22.f256401a = i;
                aVar22.f256402b = new Bundle(bundle2);
                return aVar22;
            }
            C88905a aVar222 = new C88905a();
            aVar222.f256401a = i;
            aVar222.f256402b = new Bundle(bundle2);
            return aVar222;
        } catch (Exception e3) {
            e = e3;
            e.toString();
            C88905a aVar2222 = new C88905a();
            aVar2222.f256401a = i;
            aVar2222.f256402b = new Bundle(bundle2);
            return aVar2222;
        }
    }
}
