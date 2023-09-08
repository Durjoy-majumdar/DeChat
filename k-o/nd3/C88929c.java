package nd3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.pluginsdk.permission.PermissionActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import p385u2.C111105a;
import p447aw.C79634e;
import qo3.C77429t;

/* renamed from: nd3.c */
public class C88929c extends C79634e {

    /* renamed from: a */
    public static HashMap<String, C88930e> f256473a = new HashMap<>();

    /* renamed from: b */
    public static HashMap<String, C88931f> f256474b = new HashMap<>();

    /* renamed from: nd3.c$a */
    public class C11151a implements C88930e {

        /* renamed from: a */
        public final /* synthetic */ Activity f32930a;

        public C11151a(Activity activity) {
            this.f32930a = activity;
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            this.f32930a.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* renamed from: a */
    public static boolean m111017a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m111018b(Activity activity, String str, int i, String str2, String str3, C77429t tVar, Boolean bool) {
        if (Build.VERSION.SDK_INT < 23 && !"MNC".equals(Build.VERSION.CODENAME)) {
            return true;
        }
        try {
            if (C111105a.m151499a(activity, str) == 0) {
                return true;
            }
            m111022f(activity, i, new C11151a(activity), new String[]{str}, str2, str3);
            return false;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", e);
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m111019c(Context context, String str, boolean z) {
        try {
            int a = C111105a.m151499a(context, str);
            if (a != 0) {
                return false;
            }
            if (!z) {
                return true;
            }
            if (Util.isNullOrNil((String) null)) {
                return a == 0;
            }
            try {
                C111105a.m151499a(context, (String) null);
                throw null;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MPermissionUtil", "check mpermission otherPermisson exception:%s.", e);
                return false;
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", e2);
            return false;
        }
    }

    /* renamed from: d */
    public static long m111020d(String str, int i) {
        return MultiProcessMMKV.getDefault().getLong("had_request_permission_" + str + "_" + i, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (p385u2.C111105a.m151499a(r6, r7[r2]) != 0) goto L_0x001f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m111021e(android.content.Context r6, java.lang.String... r7) {
        /*
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto L_0x0005
            return r1
        L_0x0005:
            int r0 = r7.length
            r2 = 0
        L_0x0007:
            r3 = 1
            if (r2 >= r0) goto L_0x0026
            r4 = r7[r2]
            int r4 = p385u2.C111105a.m151499a(r6, r4)     // Catch:{ Exception -> 0x0013 }
            if (r4 == 0) goto L_0x0020
            goto L_0x001f
        L_0x0013:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r4
            java.lang.String r4 = "MicroMsg.MPermissionUtil"
            java.lang.String r5 = "check mpermission exception:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r3)
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r3 != 0) goto L_0x0023
            return r1
        L_0x0023:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nd3.C88929c.m111021e(android.content.Context, java.lang.String[]):boolean");
    }

    /* renamed from: f */
    public static void m111022f(Context context, int i, C88930e eVar, String[] strArr, String str, String str2) {
        m111023g(context, i, eVar, strArr, str, str2, (String) null);
    }

    /* renamed from: g */
    public static void m111023g(Context context, int i, C88930e eVar, String[] strArr, String str, String str2, String str3) {
        Context context2 = context;
        int i2 = i;
        String[] strArr2 = strArr;
        if (eVar == null) {
            Log.m105924i("MicroMsg.MPermissionUtil", "listener is null");
            return;
        }
        Log.m105925i("MicroMsg.MPermissionUtil", "requestPermission requestCode:%s", Integer.valueOf(i));
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = 0;
        }
        if (Build.VERSION.SDK_INT < 23 || m111021e(context, strArr2)) {
            eVar.onRequestPermissionsResult(i, strArr2, iArr);
            return;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        f256473a.put(valueOf, eVar);
        Intent intent = new Intent(context, PermissionActivity.class);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        intent.putExtra("requestCode", i);
        intent.putExtra("permission", strArr2);
        intent.putExtra("key", valueOf);
        intent.putExtra("reasonTitle", str);
        intent.putExtra("reasonMsg", str2);
        intent.putExtra("forceReasonMsg", str3);
        if (!(context2 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "requestPermission", "(Landroid/content/Context;ILcom/tencent/mm/pluginsdk/permission/PermissionListener;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "requestPermission", "(Landroid/content/Context;ILcom/tencent/mm/pluginsdk/permission/PermissionListener;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        for (String h : strArr2) {
            m111024h(h, i);
        }
    }

    /* renamed from: h */
    public static void m111024h(String str, int i) {
        MultiProcessMMKV.getDefault().putLong("had_request_permission_" + str + "_" + i, System.currentTimeMillis());
    }

    /* renamed from: i */
    public static void m111025i(Intent intent, String str, String str2, C88931f fVar) {
        Log.m105925i("MicroMsg.MPermissionUtil", "startSettings reasonTitle:%s, reasonMsg:%s", str, str2);
        String valueOf = String.valueOf(System.currentTimeMillis());
        f256474b.put(valueOf, fVar);
        Context context = MMApplicationContext.getContext();
        AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
        if (!(appForegroundDelegate.mo174211e() == null || appForegroundDelegate.mo174211e().get() == null)) {
            context = appForegroundDelegate.mo174211e().get();
        }
        Intent intent2 = new Intent(context, PermissionActivity.class);
        intent2.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        intent2.setSelector(intent);
        intent2.putExtra("key", valueOf);
        intent2.putExtra("reasonTitle", str);
        intent2.putExtra("reasonMsg", str2);
        try {
            if (!context.getPackageManager().getActivityInfo(new ComponentName(context, context.getClass()), 128).taskAffinity.contains("com.tencent.mm.finder")) {
                intent2.addFlags(268435456);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.m105920e("MicroMsg.MPermissionUtil", "processNameOfComponent: catch e: " + e.getMessage());
            intent2.addFlags(268435456);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "startSettings", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/permission/SettingsListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "startSettings", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/permission/SettingsListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
