package wn2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k20.C9556a;
import p156gj.C107835h0;

/* renamed from: wn2.f */
public class C111818f extends C111813a {

    /* renamed from: a */
    public final Map<String, C111814b> f334799a;

    public C111818f() {
        HashMap hashMap = new HashMap();
        this.f334799a = hashMap;
        hashMap.put("xiaomi", new C111815c(this));
        hashMap.put("oppo", new C111816d(this));
        hashMap.put("vivo", new C111817e(this));
    }

    /* renamed from: a */
    public void mo163517a(Context context) {
        String lowerCase = C107835h0.m146104a(context).toLowerCase();
        Log.m105925i("MicroMsg.AppPermissionSettingAdapterFactory", "[jumpPermissionSettingPage] manufacturer = %s", lowerCase);
        C111814b bVar = (C111814b) ((HashMap) this.f334799a).get(lowerCase);
        if (bVar != null) {
            Intent a = bVar.mo163518a();
            if (!(context instanceof Activity)) {
                a.addFlags(268435456);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(a);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/shortcut/permission/AppPermissionSettingAdapterFactory$SettingPageJumper", "jump", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/shortcut/permission/AppPermissionSettingAdapterFactory$SettingPageJumper", "jump", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: b */
    public boolean mo163519b() {
        String lowerCase = C107835h0.m146104a(MMApplicationContext.getContext()).toLowerCase();
        Log.m105925i("MicroMsg.AppPermissionSettingAdapterFactory", "[canJumpSettingPage] manufacturer = %s", lowerCase);
        C111814b bVar = (C111814b) ((HashMap) this.f334799a).get(lowerCase);
        if (((HashMap) this.f334799a).containsKey(lowerCase)) {
            bVar.getClass();
            List<ResolveInfo> queryIntentActivities = MMApplicationContext.getContext().getPackageManager().queryIntentActivities(bVar.mo163518a(), 0);
            if (!(queryIntentActivities == null || queryIntentActivities.isEmpty()) && queryIntentActivities.get(0).activityInfo.exported) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo163520c() {
        /*
            r16 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = p156gj.C107835h0.m146104a(r1)
            java.lang.String r1 = r1.toLowerCase()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r5 = "MicroMsg.AppPermissionSettingAdapterFactory"
            java.lang.String r6 = "manufacturer = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r3)
            r1.getClass()
            java.lang.String r3 = "oppo"
            boolean r3 = r1.equals(r3)
            r6 = 0
            r7 = -1
            if (r3 != 0) goto L_0x00d2
            java.lang.String r3 = "vivo"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0036
            return r7
        L_0x0036:
            java.lang.String r1 = "content://com.bbk.launcher2.settings/favorites?notify=false"
            android.net.Uri r9 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r1 = "shortcutPermission"
            java.lang.String r3 = "intent"
            java.lang.String[] r10 = new java.lang.String[]{r3, r1}     // Catch:{ Exception -> 0x00ad }
            android.content.ContentResolver r8 = r0.getContentResolver()     // Catch:{ Exception -> 0x00ad }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ad }
            r0.<init>()     // Catch:{ Exception -> 0x00ad }
            r0.append(r3)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r3 = " LIKE '"
            r0.append(r3)     // Catch:{ Exception -> 0x00ad }
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ Exception -> 0x00ad }
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r12 = "com.tencent.mm.ui.LauncherUI"
            r3.<init>(r11, r12)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r3 = r3.flattenToString()     // Catch:{ Exception -> 0x00ad }
            r0.append(r3)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r3 = "%'"
            r0.append(r3)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r11 = r0.toString()     // Catch:{ Exception -> 0x00ad }
            r12 = 0
            r13 = 0
            android.database.Cursor r6 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00ad }
            if (r6 != 0) goto L_0x007f
            if (r6 == 0) goto L_0x007e
            r6.close()
        L_0x007e:
            return r7
        L_0x007f:
            int r0 = r6.getColumnIndex(r1)     // Catch:{ Exception -> 0x00ad }
            r6.moveToFirst()     // Catch:{ Exception -> 0x00ad }
            int r0 = r6.getInt(r0)     // Catch:{ Exception -> 0x00ad }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ad }
            r1.<init>()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r3 = "vivo statues on vivo = "
            r1.append(r3)     // Catch:{ Exception -> 0x00ad }
            r1.append(r0)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)     // Catch:{ Exception -> 0x00ad }
            r1 = 16
            if (r0 != r1) goto L_0x00a7
            r6.close()
            return r4
        L_0x00a7:
            r6.close()
            return r2
        L_0x00ab:
            r0 = move-exception
            goto L_0x00cc
        L_0x00ad:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "[checkPermissionStatus] vivooccur exception return unknown status : \n"
            r1.append(r2)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00ab }
            r1.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ab }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x00cb
            r6.close()
        L_0x00cb:
            return r7
        L_0x00cc:
            if (r6 == 0) goto L_0x00d1
            r6.close()
        L_0x00d1:
            throw r0
        L_0x00d2:
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ Exception -> 0x0141 }
            java.lang.String r3 = "launcher_shortcut_permission_settings"
            k20.a r5 = new k20.a     // Catch:{ Exception -> 0x0141 }
            r5.<init>()     // Catch:{ Exception -> 0x0141 }
            r5.mo10233c(r3)     // Catch:{ Exception -> 0x0141 }
            r5.mo10233c(r1)     // Catch:{ Exception -> 0x0141 }
            java.lang.Object r8 = new java.lang.Object     // Catch:{ Exception -> 0x0141 }
            r8.<init>()     // Catch:{ Exception -> 0x0141 }
            java.lang.Object[] r9 = r5.mo10232b()     // Catch:{ Exception -> 0x0141 }
            java.lang.String r10 = "com/tencent/mm/plugin/shortcut/permission/ShortcutInstallAdapter"
            java.lang.String r11 = "checkPermissionStatus"
            java.lang.String r12 = "()I"
            java.lang.String r13 = "android/provider/Settings$Secure"
            java.lang.String r14 = "getString"
            java.lang.String r15 = "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;"
            java.lang.Object r1 = j20.C117292a.m165364j(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0141 }
            int r3 = r1.length()     // Catch:{ Exception -> 0x0141 }
            int r3 = r3 - r2
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r3 = "/"
            java.lang.String[] r1 = r1.split(r3)     // Catch:{ Exception -> 0x0141 }
            int r3 = r1.length     // Catch:{ Exception -> 0x0141 }
            r5 = 0
        L_0x0114:
            if (r5 >= r3) goto L_0x012c
            r8 = r1[r5]     // Catch:{ Exception -> 0x0141 }
            java.lang.String r9 = r0.getPackageName()     // Catch:{ Exception -> 0x0141 }
            boolean r9 = r8.startsWith(r9)     // Catch:{ Exception -> 0x0141 }
            if (r9 == 0) goto L_0x0129
            java.lang.String r0 = ","
            java.lang.String[] r6 = r8.split(r0)     // Catch:{ Exception -> 0x0141 }
            goto L_0x012c
        L_0x0129:
            int r5 = r5 + 1
            goto L_0x0114
        L_0x012c:
            if (r6 != 0) goto L_0x012f
            return r7
        L_0x012f:
            r0 = r6[r2]     // Catch:{ Exception -> 0x0141 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0141 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0141 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0141 }
            if (r0 != r2) goto L_0x0140
            return r4
        L_0x0140:
            return r2
        L_0x0141:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wn2.C111818f.mo163520c():int");
    }
}
