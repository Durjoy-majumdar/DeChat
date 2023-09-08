package m93;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.p128ui.tools.browser.BrowserChooseUI;
import com.tencent.p014mm.pluginsdk.model.C19446g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import hi3.C87520e;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import lg3.C88496e;
import sx3.C110818d0;

/* renamed from: m93.f */
public final class C46969f {

    /* renamed from: a */
    public static final C46969f f126279a = new C46969f();

    /* renamed from: b */
    public static C19446g1 f126280b;

    /* renamed from: m93.f$a */
    public static final class C46970a implements PendingIntent.OnFinished {

        /* renamed from: a */
        public static final C46970a f126281a = new C46970a();

        public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
            Log.m105925i("MicroMsg.BrowserChooseDialogHelper", "onSendFinished resultCode: %d, , resultData: %s", Integer.valueOf(i), str);
        }
    }

    /* renamed from: a */
    public static final Intent m52276a(Context context, Intent intent, String str, boolean z) {
        C87412m.m108594g(context, "context");
        Log.m105927v("MicroMsg.BrowserChooseDialogHelper", "alvinluo createBrowserChooser activity: %s, showBrowserSettingEntry: %s, url: %s", context, Boolean.valueOf(z), str);
        Bundle bundle = new Bundle();
        bundle.putString("target_url", str);
        bundle.putParcelable("target_intent", intent);
        if (intent != null) {
            intent.putExtra("targeturl", str);
        }
        if (intent != null) {
            intent.putExtra("show_browser_setting_entry", z);
        }
        Intent intent2 = new Intent();
        intent2.setClass(context, BrowserChooseUI.class);
        intent2.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
        intent2.putExtra("targetintent", intent);
        intent2.putExtra("transferback", bundle);
        return intent2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r2 = z04.C112550d0.m153799i0(r2).toString();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m52277b(android.content.Context r2, android.content.pm.ResolveInfo r3) {
        /*
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = ""
            if (r3 != 0) goto L_0x000a
            return r0
        L_0x000a:
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.CharSequence r2 = r3.loadLabel(r2)
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            r3 = 2
            java.lang.String r1 = "\\(.*推荐.*\\)"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r1, r3)
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r1 = r3.find()
            if (r1 == 0) goto L_0x0041
            java.lang.String r2 = r3.replaceAll(r0)
            if (r2 == 0) goto L_0x0040
            java.lang.CharSequence r2 = z04.C112550d0.m153799i0(r2)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            return r0
        L_0x0041:
            java.lang.CharSequence r2 = z04.C112550d0.m153799i0(r2)
            java.lang.String r2 = r2.toString()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m93.C46969f.m52277b(android.content.Context, android.content.pm.ResolveInfo):java.lang.String");
    }

    /* renamed from: c */
    public static final ResolveInfo m52278c(Context context, String str, String str2) {
        List<ResolveInfo> queryIntentActivities;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "packageName");
        if (str.length() == 0) {
            return null;
        }
        HashSet<String> hashSet = C34484h.f92807a;
        if (C34484h.f92808b) {
            HashSet<String> hashSet2 = C34484h.f92809c;
            String lowerCase = str.toLowerCase();
            C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
            if (C110818d0.m150903D(hashSet2, lowerCase)) {
                return null;
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
        intent.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (queryIntentActivities = packageManager.queryIntentActivities(intent, 65536)) == null) {
            return null;
        }
        return (ResolveInfo) C110818d0.m150917O(queryIntentActivities, 0);
    }

    /* renamed from: d */
    public static final Drawable m52279d(Context context, ResolveInfo resolveInfo) {
        PackageManager packageManager;
        Drawable drawable;
        Drawable drawable2;
        C87412m.m108594g(context, "context");
        String str = null;
        if (resolveInfo == null || (packageManager = context.getPackageManager()) == null) {
            return null;
        }
        try {
            String str2 = resolveInfo.resolvePackageName;
            if (!(str2 == null || resolveInfo.icon == 0)) {
                C46969f fVar = f126279a;
                Resources resourcesForApplication = packageManager.getResourcesForApplication(str2);
                C87412m.m108593f(resourcesForApplication, "packageManager.getResour…eInfo.resolvePackageName)");
                int i = resolveInfo.icon;
                fVar.getClass();
                try {
                    Method method = C88496e.f255626f;
                    C87520e.f253558n.set(Boolean.TRUE);
                    drawable2 = resourcesForApplication.getDrawable(i);
                    C87520e.f253558n.set(Boolean.FALSE);
                } catch (Resources.NotFoundException unused) {
                    drawable2 = null;
                }
                if (drawable2 != null) {
                    return drawable2;
                }
            }
            int iconResource = resolveInfo.getIconResource();
            if (iconResource != 0) {
                C46969f fVar2 = f126279a;
                Resources resourcesForApplication2 = packageManager.getResourcesForApplication(resolveInfo.activityInfo.packageName);
                C87412m.m108593f(resourcesForApplication2, "packageManager.getResour…activityInfo.packageName)");
                fVar2.getClass();
                try {
                    Method method2 = C88496e.f255626f;
                    C87520e.f253558n.set(Boolean.TRUE);
                    drawable = resourcesForApplication2.getDrawable(iconResource);
                    C87520e.f253558n.set(Boolean.FALSE);
                } catch (Resources.NotFoundException unused2) {
                    drawable = null;
                }
                if (drawable != null) {
                    Object[] objArr = new Object[2];
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null) {
                        str = activityInfo.packageName;
                    }
                    objArr[0] = str;
                    objArr[1] = Integer.valueOf(iconResource);
                    Log.m105919d("MicroMsg.BrowserChooseDialogHelper", "loadIconForResolveInfo %s, iconRes %d done", objArr);
                    return drawable;
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BrowserChooseDialogHelper", "Couldn't find resources for package", e);
        }
        return resolveInfo.loadIcon(packageManager);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r6 = r12.activityInfo;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m52280e(android.content.Context r10, android.content.Intent r11, android.content.pm.ResolveInfo r12) {
        /*
            java.lang.String r0 = "MicroMsg.BrowserChooseDialogHelper"
            r1 = 0
            r2 = 0
            if (r11 == 0) goto L_0x0010
            java.lang.String r3 = "targeturl"
            java.lang.String r3 = r11.getStringExtra(r3)     // Catch:{ Exception -> 0x000d }
            goto L_0x0011
        L_0x000d:
            r10 = move-exception
            goto L_0x00c6
        L_0x0010:
            r3 = r2
        L_0x0011:
            java.lang.String r4 = "alvinluo openInBrowser package: %s, uri: %s, url: %s"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x000d }
            if (r12 == 0) goto L_0x001f
            android.content.pm.ActivityInfo r6 = r12.activityInfo     // Catch:{ Exception -> 0x000d }
            if (r6 == 0) goto L_0x001f
            java.lang.String r6 = r6.packageName     // Catch:{ Exception -> 0x000d }
            goto L_0x0020
        L_0x001f:
            r6 = r2
        L_0x0020:
            r5[r1] = r6     // Catch:{ Exception -> 0x000d }
            r6 = 1
            if (r11 == 0) goto L_0x0030
            android.net.Uri r7 = r11.getData()     // Catch:{ Exception -> 0x000d }
            if (r7 == 0) goto L_0x0030
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x000d }
            goto L_0x0031
        L_0x0030:
            r7 = r2
        L_0x0031:
            r5[r6] = r7     // Catch:{ Exception -> 0x000d }
            r6 = 2
            r5[r6] = r3     // Catch:{ Exception -> 0x000d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r5)     // Catch:{ Exception -> 0x000d }
            java.lang.Class<wm.c> r4 = p262wm.C22921c.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x000d }
            wm.c r4 = (p262wm.C22921c) r4     // Catch:{ Exception -> 0x000d }
            com.tencent.mm.pluginsdk.model.g1 r4 = r4.mo35881Q6(r1, r2)     // Catch:{ Exception -> 0x000d }
            if (r12 == 0) goto L_0x004e
            android.content.pm.ActivityInfo r5 = r12.activityInfo     // Catch:{ Exception -> 0x000d }
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = r5.packageName     // Catch:{ Exception -> 0x000d }
            goto L_0x004f
        L_0x004e:
            r5 = r2
        L_0x004f:
            boolean r5 = r4.mo25203i(r5)     // Catch:{ Exception -> 0x000d }
            if (r5 == 0) goto L_0x005c
            wm.e r4 = (p262wm.C53187e) r4     // Catch:{ Exception -> 0x000d }
            r4.mo25195a(r10, r3)     // Catch:{ Exception -> 0x000d }
            goto L_0x00cd
        L_0x005c:
            if (r11 == 0) goto L_0x0073
            r3 = 524288(0x80000, float:7.34684E-40)
            r11.addFlags(r3)     // Catch:{ Exception -> 0x000d }
            if (r12 == 0) goto L_0x006b
            android.content.pm.ActivityInfo r12 = r12.activityInfo     // Catch:{ Exception -> 0x000d }
            if (r12 == 0) goto L_0x006b
            java.lang.String r2 = r12.packageName     // Catch:{ Exception -> 0x000d }
        L_0x006b:
            if (r2 != 0) goto L_0x006f
            java.lang.String r2 = ""
        L_0x006f:
            r11.setPackage(r2)     // Catch:{ Exception -> 0x000d }
            goto L_0x0074
        L_0x0073:
            r11 = r2
        L_0x0074:
            r12 = 29
            boolean r12 = p206nj.C11171e.m11046c(r12)     // Catch:{ Exception -> 0x000d }
            if (r12 == 0) goto L_0x008e
            r12 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r10, r1, r11, r12)     // Catch:{ Exception -> 0x000d }
            if (r2 == 0) goto L_0x00cd
            r4 = 1
            r5 = 0
            m93.f$a r6 = m93.C46969f.C46970a.f126281a     // Catch:{ Exception -> 0x000d }
            r7 = 0
            r3 = r10
            r2.send(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x000d }
            goto L_0x00cd
        L_0x008e:
            if (r10 == 0) goto L_0x00cd
            k20.a r12 = new k20.a     // Catch:{ Exception -> 0x000d }
            r12.<init>()     // Catch:{ Exception -> 0x000d }
            r12.mo10233c(r11)     // Catch:{ Exception -> 0x000d }
            java.lang.Object[] r3 = r12.mo10232b()     // Catch:{ Exception -> 0x000d }
            java.lang.String r4 = "com/tencent/mm/plugin/webview/ui/tools/browser/BrowserChooseDialogHelper"
            java.lang.String r5 = "openInBrowser"
            java.lang.String r6 = "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/pm/ResolveInfo;)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r2 = r10
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x000d }
            java.lang.Object r11 = r12.mo10231a(r1)     // Catch:{ Exception -> 0x000d }
            android.content.Intent r11 = (android.content.Intent) r11     // Catch:{ Exception -> 0x000d }
            r10.startActivity(r11)     // Catch:{ Exception -> 0x000d }
            java.lang.String r3 = "com/tencent/mm/plugin/webview/ui/tools/browser/BrowserChooseDialogHelper"
            java.lang.String r4 = "openInBrowser"
            java.lang.String r5 = "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/pm/ResolveInfo;)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r2 = r10
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x000d }
            goto L_0x00cd
        L_0x00c6:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.String r12 = "onBrowserItemClick exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r10, r12, r11)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m93.C46969f.m52280e(android.content.Context, android.content.Intent, android.content.pm.ResolveInfo):void");
    }
}
