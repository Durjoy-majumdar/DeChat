package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.SplitController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.HashSet;
import java.util.Set;
import k20.C9556a;
import oa1.C117731d;
import p206nj.C11171e;
import p206nj.C76866m;

/* renamed from: com.tencent.mm.ui.e4 */
public class C85861e4 {

    /* renamed from: a */
    public static SplitController f250077a;

    /* renamed from: b */
    public static Set<ActivityFilter> f250078b;

    /* renamed from: c */
    public static Boolean f250079c;

    /* renamed from: com.tencent.mm.ui.e4$a */
    public interface C85862a {
        /* renamed from: a */
        void mo4165a();

        /* renamed from: b */
        void mo4166b();
    }

    /* renamed from: a */
    public static void m106114a(Activity activity, boolean z, boolean z2) {
        if (C85875k4.m106199o0() && !C11171e.m11044a(31)) {
            if (f250077a == null) {
                m106116c();
            }
            Log.m105924i("MicroMsg.SplitUtil", "exitSplit!!");
            Intent intent = activity.getIntent();
            if (z2) {
                activity.finish();
            }
            intent.removeFlags(4096);
            if (z) {
                intent.removeFlags(268435456);
                intent.removeFlags(32768);
                if (C76866m.m92676e()) {
                    intent.removeFlags(142606336);
                }
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Activity activity2 = activity;
            C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/ui/SplitUtil", "exitSplit", "(Landroid/app/Activity;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity2, "com/tencent/mm/ui/SplitUtil", "exitSplit", "(Landroid/app/Activity;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (z) {
                m106117d(activity.getClass(), 0);
            }
        }
    }

    /* renamed from: b */
    public static boolean m106115b(Activity activity) {
        if (!C85875k4.m106199o0() || Build.VERSION.SDK_INT < 30) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(activity.isInMultiWindowMode());
        Boolean valueOf2 = Boolean.valueOf(((WindowManager) activity.getSystemService("window")).getCurrentWindowMetrics().getBounds().left > 0);
        Log.m105925i("MicroMsg.SplitUtil", "inSplit isRight:%s, inMultiWindowMode:%s", valueOf2, valueOf);
        return valueOf.booleanValue() && valueOf2.booleanValue();
    }

    /* renamed from: c */
    public static void m106116c() {
        if (f250077a == null) {
            f250077a = SplitController.Companion.getInstance();
        }
    }

    /* renamed from: d */
    public static void m106117d(Class<? extends Activity> cls, int i) {
        if (C85875k4.m106199o0() && C85875k4.m106208w()) {
            if (f250077a == null) {
                m106116c();
            }
            if (f250077a != null) {
                HashSet hashSet = new HashSet();
                f250078b = hashSet;
                hashSet.add(new ActivityFilter(new ComponentName(MMApplicationContext.getApplicationId(), cls != null ? cls.getName() : "*"), (String) null));
                f250077a.registerRule(new ActivityRule(f250078b, i == 0));
            }
        }
    }

    /* renamed from: e */
    public static void m106118e(String str, int i) {
        if (f250077a == null) {
            m106116c();
        }
        if (f250077a != null) {
            HashSet hashSet = new HashSet();
            f250078b = hashSet;
            hashSet.add(new ActivityFilter(new ComponentName(MMApplicationContext.getApplicationId(), str), (String) null));
            f250077a.registerRule(new ActivityRule(f250078b, i == 0));
        }
    }

    /* renamed from: f */
    public static void m106119f(Activity activity, boolean z, boolean z2, C85862a aVar) {
        if (!C85875k4.m106199o0() || Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (m106115b(activity)) {
            m106114a(activity, z, z2);
            if (aVar != null) {
                aVar.mo4165a();
                return;
            }
            return;
        }
        m106121h(activity, z, z2);
        if (aVar != null) {
            aVar.mo4166b();
        }
    }

    /* renamed from: g */
    public static boolean m106120g() {
        if (f250079c == null) {
            String str = null;
            f250079c = new Boolean(false);
            try {
                str = C117731d.m166007c().mo182444f("clicfg_12l_support_device", "xiaomi, redmi, samsung", false, true);
                Log.m105925i("MicroMsg.SplitUtil", "supportDevice:%s", str);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SplitUtil", e, "split supportDevice", new Object[0]);
            }
            if (!Util.isNullOrNil(str)) {
                String lowerCase = Build.BRAND.toLowerCase();
                for (String contains : str.split(",")) {
                    if (contains.contains(lowerCase)) {
                        if (!lowerCase.equals("samsung")) {
                            f250079c = new Boolean(true);
                            Log.m105924i("MicroMsg.SplitUtil", "isSupportBrand!!");
                        } else if (Build.TIME > 1663862400000L) {
                            f250079c = new Boolean(true);
                            Log.m105924i("MicroMsg.SplitUtil", "isSupportBrand!! samsung");
                        }
                    }
                }
            }
        }
        return f250079c.booleanValue();
    }

    /* renamed from: h */
    public static void m106121h(Activity activity, boolean z, boolean z2) {
        if (C85875k4.m106199o0()) {
            Log.m105925i("MicroMsg.SplitUtil", "toSplit!! newTask:%s", Boolean.valueOf(z));
            if (f250077a == null) {
                m106116c();
            }
            Intent intent = new Intent(activity.getIntent());
            if (z2) {
                activity.finish();
            }
            intent.addFlags(4096);
            if (z) {
                m106122i(activity.getClass(), 0);
                intent.addFlags(268435456);
                intent.addFlags(32768);
                if (C76866m.m92676e()) {
                    intent.addFlags(142606336);
                }
            }
            Bundle bundle = new Bundle();
            bundle.putInt("android:activity.enterSplitSideWithAdjacentFlag", 4);
            C9556a aVar = new C9556a();
            aVar.mo10233c(bundle);
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/SplitUtil", "toSplit", "(Landroid/app/Activity;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            activity.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
            C117292a.m165359e(activity, "com/tencent/mm/ui/SplitUtil", "toSplit", "(Landroid/app/Activity;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        }
    }

    /* renamed from: i */
    public static void m106122i(Class<? extends Activity> cls, int i) {
        if (f250077a == null) {
            m106116c();
        }
        if (f250077a != null) {
            HashSet hashSet = new HashSet();
            f250078b = hashSet;
            hashSet.add(new ActivityFilter(new ComponentName(MMApplicationContext.getApplicationId(), cls != null ? cls.getName() : "*"), (String) null));
            f250077a.unregisterRule(new ActivityRule(f250078b, i == 0));
        }
    }

    /* renamed from: j */
    public static void m106123j(String str, int i) {
        if (f250077a == null) {
            m106116c();
        }
        if (f250077a != null) {
            HashSet hashSet = new HashSet();
            f250078b = hashSet;
            hashSet.add(new ActivityFilter(new ComponentName(MMApplicationContext.getApplicationId(), str), (String) null));
            f250077a.unregisterRule(new ActivityRule(f250078b, i == 0));
        }
    }
}
