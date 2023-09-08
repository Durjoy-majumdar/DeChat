package cw0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Process;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68081f;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.plugin.base.model.ShortcutBroadCastReceiver;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.List;
import nj3.C76879j;
import qo3.C77426q;
import qo3.C77429t;

/* renamed from: cw0.b */
public class C116541b {

    /* renamed from: a */
    public static final String f349509a = MMApplicationContext.getPackageName();

    /* renamed from: b */
    public static char[] f349510b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: cw0.b$a */
    public class C7139a implements C77429t {

        /* renamed from: a */
        public final /* synthetic */ C77426q f25108a;

        /* renamed from: b */
        public final /* synthetic */ Activity f25109b;

        public C7139a(C77426q qVar, Activity activity) {
            this.f25108a = qVar;
            this.f25109b = activity;
        }

        /* renamed from: a */
        public void mo8330a(boolean z, String str, boolean z2) {
            this.f25108a.f225839c.dismiss();
            if (z2) {
                this.f25109b.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putBoolean("no_more_show_add_short_cut_dialog", true).apply();
            }
        }
    }

    /* renamed from: a */
    public static void m164351a(Context context, Intent intent, String str, String str2, boolean z) {
        boolean z2;
        String str3;
        String str4;
        boolean z3;
        int i;
        boolean z4;
        IntentSender intentSender;
        Context context2 = context;
        Intent intent2 = intent;
        boolean z5 = z;
        if (context2 == null) {
            Log.m105920e("MicroMsg.ShortcutManager", "context is null");
        } else if (intent2 == null) {
            Log.m105920e("MicroMsg.ShortcutManager", "intent is null");
        } else {
            boolean z6 = true;
            if (Build.VERSION.SDK_INT < 26) {
                context.sendBroadcast(intent);
                m164361k(context2, true, z5);
            } else {
                ShortcutManager shortcutManager = (ShortcutManager) context2.getSystemService(ShortcutManager.class);
                if (shortcutManager == null) {
                    Log.m105920e("MicroMsg.ShortcutManager", "shortcut manager is null");
                } else if (!shortcutManager.isRequestPinShortcutSupported()) {
                    Log.m105920e("MicroMsg.ShortcutManager", "alvinluo not support pin shortcuts");
                } else if (intent2.getBooleanExtra("is_main_shortcut", false)) {
                    Log.m105924i("MicroMsg.ShortcutManager", "alvinluo main icon, do not create shortcut");
                } else {
                    Intent intent3 = (Intent) intent2.getParcelableExtra("android.intent.extra.shortcut.INTENT");
                    if (intent3 == null) {
                        Log.m105920e("MicroMsg.ShortcutManager", "alvinluo shortcut intent is null");
                    } else {
                        String stringExtra = Util.isNullOrNil(str) ? intent3.getStringExtra("app_shortcut_custom_id") : str;
                        if (Util.isNullOrNil(stringExtra)) {
                            Log.m105924i("MicroMsg.ShortcutManager", "alvinluo shortcutId is null, then use short name as shortcutId");
                            str3 = intent2.getStringExtra("android.intent.extra.shortcut.NAME");
                            z2 = true;
                        } else {
                            str3 = stringExtra;
                            z2 = false;
                        }
                        Log.m105925i("MicroMsg.ShortcutManager", "alvinluo shortcutId: %s", str3);
                        String stringExtra2 = intent2.getStringExtra("android.intent.extra.shortcut.NAME");
                        Intent.ShortcutIconResource shortcutIconResource = (Intent.ShortcutIconResource) intent2.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
                        if (shortcutIconResource != null) {
                            Log.m105925i("MicroMsg.ShortcutManager", "alvinluo icon resource name: %s, %s", shortcutIconResource.resourceName, shortcutIconResource.packageName);
                        }
                        Bitmap bitmap = (Bitmap) intent2.getParcelableExtra("android.intent.extra.shortcut.ICON");
                        if (bitmap == null) {
                            Log.m105924i("MicroMsg.ShortcutManager", "extra_shortcut_icon is null, use icon resource id");
                            int intExtra = intent2.getIntExtra("shortcut_icon_resource_id", -1);
                            if (intExtra == -1) {
                                Log.m105920e("MicroMsg.ShortcutManager", "icon resource id is null");
                            } else {
                                bitmap = BitmapFactory.decodeResource(context.getResources(), intExtra);
                            }
                        }
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 == null) {
                            Log.m105920e("MicroMsg.ShortcutManager", "icon bitmap is null");
                        } else {
                            boolean booleanExtra = intent2.getBooleanExtra("shortcut_is_adaptive_icon", false);
                            String str5 = stringExtra2;
                            ShortcutInfo c = m164353c(context, str3, intent, intent3, booleanExtra, bitmap2);
                            boolean booleanExtra2 = intent2.getBooleanExtra("duplicate", false);
                            Log.m105925i("MicroMsg.ShortcutManager", "alvinluo add shortcut above android o, duplicate: %b", Boolean.valueOf(booleanExtra2));
                            if (booleanExtra2) {
                                shortcutManager.requestPinShortcut(c, (IntentSender) null);
                                m164361k(context2, true, z5);
                            } else {
                                List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
                                int i2 = 0;
                                while (i2 < pinnedShortcuts.size()) {
                                    ShortcutInfo shortcutInfo = pinnedShortcuts.get(i2);
                                    if (z2) {
                                        if (shortcutInfo == null || shortcutInfo.getShortLabel() == null) {
                                            str4 = str5;
                                        } else {
                                            str4 = str5;
                                            if (shortcutInfo.getShortLabel().equals(str4)) {
                                                String str6 = str2;
                                            }
                                        }
                                        String str7 = str2;
                                        i2++;
                                        str5 = str4;
                                    } else {
                                        str4 = str5;
                                        if (shortcutInfo != null) {
                                            if (shortcutInfo.getId().equals(str2)) {
                                                z3 = true;
                                                i = 2;
                                                z4 = true;
                                                break;
                                            }
                                        } else {
                                            String str8 = str2;
                                        }
                                        if (shortcutInfo != null && shortcutInfo.getId().equals(str3)) {
                                        }
                                        i2++;
                                        str5 = str4;
                                    }
                                    z3 = false;
                                    i = 2;
                                    z4 = true;
                                }
                                String str9 = str2;
                                str4 = str5;
                                z3 = false;
                                i = 2;
                                z4 = false;
                                Object[] objArr = new Object[i];
                                objArr[0] = Boolean.valueOf(z4);
                                objArr[1] = str4;
                                Log.m105925i("MicroMsg.ShortcutManager", "alvinluo shortcut exist: %b, shortcutName: %s", objArr);
                                if (z3) {
                                    intentSender = null;
                                    c = m164353c(context, str2, intent, intent3, booleanExtra, bitmap2);
                                } else {
                                    intentSender = null;
                                }
                                if (z4) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(c);
                                    Log.m105925i("MicroMsg.ShortcutManager", "alvinluo update shortcuts result: %b", Boolean.valueOf(shortcutManager.updateShortcuts(arrayList)));
                                    m164361k(context2, true, z5);
                                } else if (z5) {
                                    Intent createShortcutResultIntent = shortcutManager.createShortcutResultIntent(c);
                                    createShortcutResultIntent.setClass(context2, ShortcutBroadCastReceiver.class);
                                    shortcutManager.requestPinShortcut(c, PendingIntent.getBroadcast(context2, 0, createShortcutResultIntent, 134217728).getIntentSender());
                                } else {
                                    shortcutManager.requestPinShortcut(c, intentSender);
                                }
                            }
                            z6 = true;
                        }
                    }
                }
                z6 = false;
            }
            if (!z6 && z5) {
                m164361k(context2, false, z5);
            }
        }
    }

    /* renamed from: b */
    public static boolean m164352b(Context context, String str, boolean z) {
        Intent e = m164355e(context, str, true, C75592q0.m90789s());
        Intent intent = (Intent) e.getParcelableExtra("android.intent.extra.shortcut.INTENT");
        if (intent == null) {
            return false;
        }
        m164351a(context, e, intent.getStringExtra("app_shortcut_custom_id"), (String) null, z);
        return true;
    }

    /* renamed from: c */
    public static ShortcutInfo m164353c(Context context, String str, Intent intent, Intent intent2, boolean z, Bitmap bitmap) {
        ShortcutInfo.Builder intent3 = new ShortcutInfo.Builder(context, str).setShortLabel(intent.getStringExtra("android.intent.extra.shortcut.NAME")).setLongLabel(intent.getStringExtra("android.intent.extra.shortcut.NAME")).setIntent(intent2);
        if (z) {
            intent3.setIcon(Icon.createWithBitmap(bitmap));
        } else {
            intent3.setIcon(Icon.createWithAdaptiveBitmap(bitmap));
        }
        return intent3.build();
    }

    /* renamed from: d */
    public static String m164354d(String str) {
        String str2;
        if (str != null && str.length() > 0) {
            String processNameByPid = Util.getProcessNameByPid(MMApplicationContext.getContext(), Process.myPid());
            String packageName = MMApplicationContext.getPackageName();
            if (packageName.equals(processNameByPid) && !C86709a0.m107523b().mo121114l()) {
                return null;
            }
            Log.m105925i("MicroMsg.ShortcutManager", "process name: %s", processNameByPid);
            try {
                if (packageName.equals(processNameByPid)) {
                    str2 = m164357g(str, "" + C86709a0.m107523b().mo121110g());
                } else {
                    str2 = m164357g(str, "" + C114781l0.m161554a().f344208n.f344122j);
                }
                if (Util.isNullOrNil(str2)) {
                    return null;
                }
                return "shortcut_" + m164363m(str2.getBytes());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ShortcutManager", (Throwable) null, "exception: %s", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: e */
    public static Intent m164355e(Context context, String str, boolean z, String str2) {
        Bitmap bitmap;
        if (str == null || context == null) {
            Log.m105920e("MicroMsg.ShortcutManager", "getIntent, wrong parameters");
            return null;
        }
        int i = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        Bitmap a = C68081f.m80466a(str);
        if (a == null) {
            Log.m105920e("MicroMsg.ShortcutManager", "getScaledBitmap fail, bmp is null");
            a = BitmapUtil.getBitmapNative((int) C0966R.C0969drawable.bfa);
        }
        if (a == null) {
            Log.m105920e("MicroMsg.ShortcutManager", "use default avatar, bmp is null");
            bitmap = null;
        } else {
            bitmap = Bitmap.createScaledBitmap(a, i, i, false);
        }
        if (bitmap == null) {
            Log.m105920e("MicroMsg.ShortcutManager", "no bmp");
            return null;
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
            Log.m105920e("MicroMsg.ShortcutManager", "no such user");
            return null;
        }
        String d = m164354d(str);
        int i2 = 1;
        Log.m105925i("MicroMsg.ShortcutManager", "alvinluo encryptShortcutUser: %s", d);
        if (Util.isNullOrNil(d)) {
            return null;
        }
        Intent intent = new Intent("com.tencent.mm.action.BIZSHORTCUT");
        intent.putExtra("LauncherUI.Shortcut.Username", d);
        intent.putExtra("LauncherUI.From.Biz.Shortcut", true);
        intent.putExtra("app_shortcut_custom_id", d);
        intent.setPackage(context.getPackageName());
        intent.addFlags(67108864);
        Intent intent2 = new Intent(z ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
        intent2.putExtra("android.intent.extra.shortcut.NAME", ((C75339i) C86312j.m106911c(C75339i.class)).pv0(z1Var, str));
        intent2.putExtra("duplicate", false);
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        intent2.putExtra("shortcut_is_adaptive_icon", true);
        intent2.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_SOURCE_KEY", f349509a);
        intent2.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_OWNER_ID", m164354d(str2));
        intent2.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_UNIQUE_ID", d);
        if (z1Var.mo62916m3()) {
            i2 = 2;
        } else if (C45628s0.m50751P(z1Var.getUsername())) {
            i2 = 0;
        }
        intent2.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_TYPE", i2);
        intent2.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_CONTAINER", 0);
        return intent2;
    }

    /* renamed from: f */
    public static String m164356f(String str) {
        int i;
        if (str != null && str.length() > 0) {
            String processNameByPid = Util.getProcessNameByPid(MMApplicationContext.getContext(), Process.myPid());
            String packageName = MMApplicationContext.getPackageName();
            Log.m105925i("MicroMsg.ShortcutManager", "process name: %s", processNameByPid);
            try {
                if (!packageName.equals(processNameByPid)) {
                    i = C114781l0.m161554a().f344208n.f344122j;
                } else if (!C86709a0.m107523b().mo121114l()) {
                    return null;
                } else {
                    i = C86709a0.m107523b().mo121110g();
                }
                if (!str.startsWith("shortcut_")) {
                    return str;
                }
                String str2 = new String(m164362l(str.substring(9)));
                return m164357g(str2, "" + i);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ShortcutManager", (Throwable) null, "exception: %s", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: g */
    public static String m164357g(String str, String str2) {
        try {
            int[] iArr = new int[256];
            byte[] bArr = new byte[256];
            for (int i = 0; i < 256; i++) {
                iArr[i] = i;
            }
            for (short s = 0; s < 256; s = (short) (s + 1)) {
                bArr[s] = (byte) str2.charAt(s % str2.length());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < 255; i3++) {
                int i4 = iArr[i3];
                i2 = ((i2 + i4) + bArr[i3]) % 256;
                iArr[i3] = iArr[i2];
                iArr[i2] = i4;
            }
            char[] charArray = str.toCharArray();
            char[] cArr = new char[charArray.length];
            int i5 = 0;
            int i6 = 0;
            for (short s2 = 0; s2 < charArray.length; s2 = (short) (s2 + 1)) {
                i5 = (i5 + 1) % 256;
                int i7 = iArr[i5];
                i6 = (i6 + i7) % 256;
                iArr[i5] = iArr[i6];
                iArr[i6] = i7;
                cArr[s2] = (char) (((char) iArr[(iArr[i5] + (i7 % 256)) % 256]) ^ charArray[s2]);
            }
            return new String(cArr);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ShortcutManager", "Exception in rc4, %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.ShortcutManager", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m164358h(Context context, Intent intent) {
        if (context == null) {
            Log.m105920e("MicroMsg.ShortcutManager", "context is null");
            return false;
        } else if (intent == null) {
            Log.m105920e("MicroMsg.ShortcutManager", "intent is null");
            return false;
        } else {
            if (Build.VERSION.SDK_INT < 26) {
                context.sendBroadcast(intent);
            }
            return true;
        }
    }

    /* renamed from: i */
    public static boolean m164359i(Context context, String str) {
        m164358h(context, m164355e(context, str, false, C75592q0.m90789s()));
        return true;
    }

    /* renamed from: j */
    public static void m164360j(Activity activity) {
        if (!MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("no_more_show_add_short_cut_dialog", false)) {
            C77426q qVar = new C77426q(activity);
            qVar.f225837a.f225714b.f225648e = activity.getString(C0966R.string.j7i);
            String string = activity.getString(C0966R.string.j7k);
            String string2 = activity.getString(C0966R.string.j7h);
            qVar.mo107606r(string);
            qVar.mo107595g(string2);
            qVar.mo107601m(C0966R.string.f8029zr);
            qVar.mo107607s(new C7139a(qVar, activity));
            qVar.mo107603o();
        }
    }

    /* renamed from: k */
    public static void m164361k(Context context, boolean z, boolean z2) {
        if (z2) {
            C76879j.m92726T(context, context.getString(z ? C0966R.string.f7568jx : C0966R.string.f7567jv));
        }
    }

    /* renamed from: l */
    public static final byte[] m164362l(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    /* renamed from: m */
    public static String m164363m(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f349510b[(bArr[i] & 240) >>> 4]);
            sb.append(f349510b[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
