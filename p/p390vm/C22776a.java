package p390vm;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.model.C19446g1;
import com.tencent.p014mm.pluginsdk.model.C19447h1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19556e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import p262wm.C22921c;
import te3.C51173ry;

@C86522b
/* renamed from: vm.a */
public class C22776a extends C86301e implements C22921c {
    public boolean Av0(String str, String str2) {
        Intent intent = C19556e.f55362a;
        Context context = MMApplicationContext.getContext();
        C86009m1 m1Var = new C86009m1(str == null ? "" : str);
        Log.m105925i("MicroMsg.AppChooserIntentUtil", "ifHasDefaultThirdAppAndCanOpenIt - path:%s, isExisted:%b, size:%d fileExt: %s", str, Boolean.valueOf(m1Var.mo119967g()), Long.valueOf(m1Var.mo119980r()), str2);
        if (!m1Var.mo119967g()) {
            Log.m105920e("MicroMsg.AppChooserIntentUtil", "ifHasDefaultThirdAppAndCanOpenIt - Cannot open file not existed!");
            return false;
        }
        String e = C19556e.m20958e(str2);
        String d = C19556e.m20957d(e, 0);
        if (d.equals("com.baidu.searchbox")) {
            C19556e.m20954a(e, 0);
            d = "";
        }
        if (d.equals("")) {
            return false;
        }
        Log.m105925i("MicroMsg.AppChooserIntentUtil", "ifHasDefaultThirdAppAndCanOpenIt - User exist always config, package is %s", d);
        if ("com.tencent.mtt".equals(d)) {
            Log.m105924i("MicroMsg.AppChooserIntentUtil", "ifHasDefaultThirdAppAndCanOpenIt - open file by qb(default)");
            return false;
        }
        Intent b = C19556e.m20955b(context, e, str);
        b.setPackage(d);
        if (Util.isIntentAvailable(context, b, false)) {
            Log.m105925i("MicroMsg.AppChooserIntentUtil", "ifHasDefaultThirdAppAndCanOpenIt - Always package support mimeType %s", e);
            return true;
        }
        Log.m105925i("MicroMsg.AppChooserIntentUtil", "ifHasDefaultThirdAppAndCanOpenIt - Always package do not support mimeType %s", e);
        return false;
    }

    /* renamed from: Az */
    public boolean mo35874Az(long j, String str, String str2, String str3, int i, C51173ry ryVar, boolean z) {
        return C19556e.m20963j(j, str, str2, str3, i, ryVar, z);
    }

    /* renamed from: BJ */
    public boolean mo35875BJ(String str, int i) {
        Intent intent = C19556e.f55362a;
        return str != null ? ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(i + 274576 + str.hashCode(), Boolean.FALSE)).booleanValue() : ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(i + 274576, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: EU */
    public void mo35876EU(Activity activity, String str, String str2, int i) {
        C19556e.m20962i(activity, 0, str, str2, "", i, (C51173ry) null);
    }

    /* renamed from: HU */
    public int mo35877HU(String str, int i) {
        Intent intent = C19556e.f55362a;
        return str != null ? i + 274528 + str.hashCode() : i + 274528;
    }

    public void M30(MMActivity mMActivity, String str, String str2, int i) {
        C19556e.m20966m(mMActivity, str, str2, i);
    }

    public boolean O80(Activity activity, String str, String str2, int i, int i2) {
        C19556e.m20965l(activity, str, str2, i, i2);
        return true;
    }

    public boolean Om0(Activity activity, String str, String str2, int i) {
        C19556e.m20965l(activity, str, str2, i, 0);
        return true;
    }

    /* renamed from: Q6 */
    public C19446g1 mo35881Q6(int i, Bundle bundle) {
        return C19447h1.m20801a().mo25208b(i, bundle);
    }

    /* renamed from: TI */
    public void mo35882TI(Activity activity, String str, String str2, String str3, int i, C51173ry ryVar) {
        C19556e.m20962i(activity, 0, str, str2, str3, i, ryVar);
    }

    public String Xa0(String str, int i) {
        return C19556e.m20957d(str, i);
    }

    /* renamed from: YU */
    public boolean mo35884YU(long j, String str, String str2, int i, C51173ry ryVar) {
        return C19556e.m20963j(j, str, str2, "", i, ryVar, true);
    }

    /* renamed from: Yc */
    public void mo35885Yc(Activity activity, int i, int i2, Intent intent, boolean z, int i3, int i4, int i5) {
        C19556e.m20959f(activity, i, i2, intent, z, i3, i4, i5);
    }

    public boolean ap0(String str, String str2, String str3, int i, C51173ry ryVar) {
        return C19556e.m20963j(0, str, str2, str3, i, ryVar, true);
    }

    /* renamed from: bZ */
    public boolean mo35887bZ(String str, String str2, int i) {
        return C19556e.m20963j(0, str, str2, "", i, (C51173ry) null, true);
    }

    /* renamed from: ct */
    public void mo35888ct(Intent intent) {
        WeakReference<Activity> weakReference;
        Intent intent2 = C19556e.f55362a;
        try {
            boolean booleanExtra = intent.getBooleanExtra("MINIQB_OPEN_RET_VAL", false);
            String stringExtra = intent.getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH);
            String stringExtra2 = intent.getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT);
            Log.m105925i("MicroMsg.AppChooserIntentUtil", "miniQB retVal:%b", Boolean.valueOf(booleanExtra));
            if (C86709a0.m107522a()) {
                C85801v1 i = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MINIQB_SUPPORT_FILE_TYPE_STRING_SYNC;
                String str = (String) i.mo119685f(aVar, "");
                if (!booleanExtra) {
                    MultiProcessMMKV.getMMKV("couldnotopen").putBoolean(stringExtra, false).apply();
                    str = str.replace(stringExtra2, "");
                } else if (!str.contains(stringExtra2)) {
                    str = str.concat(stringExtra2);
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, str);
                if (!(booleanExtra || C19556e.f55362a == null || (weakReference = C19556e.f55363b) == null || weakReference.get() == null)) {
                    C19556e.f55362a.setClass(C19556e.f55363b.get(), AppChooserUI.class);
                    Intent intent3 = C19556e.f55362a;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(2);
                    aVar2.mo10233c(intent3);
                    C117292a.m165364j(C19556e.f55363b.get(), aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil", "onCallbackByMiniQB", "(Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
                C19556e.f55362a = null;
            }
        } catch (Exception unused) {
        }
    }

    public void hr0(Activity activity, long j, String str, String str2, String str3, int i) {
        C19556e.m20962i(activity, j, str, str2, str3, i, (C51173ry) null);
    }

    /* renamed from: lJ */
    public boolean mo35890lJ(String str) {
        Intent intent = C19556e.f55362a;
        return MultiProcessMMKV.getMMKV("couldnotopen").containsKey(str);
    }

    /* renamed from: mQ */
    public void mo35891mQ(String str, int i) {
        C19556e.m20954a(str, i);
    }

    /* renamed from: nR */
    public String mo35892nR(String str) {
        return C19556e.m20958e(str);
    }

    /* renamed from: qw */
    public Intent mo35893qw(Context context, String str, String str2) {
        return C19556e.m20955b(context, str, str2);
    }

    /* renamed from: rw */
    public boolean mo35894rw(String str, String str2, String str3, int i) {
        return C19556e.m20963j(0, str, str2, str3, i, (C51173ry) null, true);
    }

    public boolean y90(Context context, Intent intent) {
        Intent intent2 = C19556e.f55362a;
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil", "startDefaultPkgSafely", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil", "startDefaultPkgSafely", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (ActivityNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.AppChooserIntentUtil", e, "", new Object[0]);
            return false;
        }
    }
}
