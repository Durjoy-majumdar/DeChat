package p783zv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import bh3.C113177k;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.pluginsdk.permission.RequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import j20.C117292a;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import nd3.C11150b;
import nd3.C11152d;
import nd3.C88929c;
import nd3.C88930e;
import nd3.C88931f;
import p385u2.C111105a;
import p447aw.C103918d;
import p447aw.C54369c;
import p903ij.C76359b;
import p918s2.C90111a;
import qo3.C77429t;

@C86522b
/* renamed from: zv.b */
public class C91939b extends C86301e implements C103918d, C54369c {

    /* renamed from: zv.b$a */
    public class C91940a implements C88930e {

        /* renamed from: a */
        public final /* synthetic */ Activity f263209a;

        public C91940a(C91939b bVar, Activity activity) {
            this.f263209a = activity;
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            this.f263209a.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void A60(AbsRequestFloatWindowPermissionDialog.C85613a aVar) {
        RequestFloatWindowPermissionDialog.C85622e eVar = RequestFloatWindowPermissionDialog.f249559g;
        if (eVar != null && eVar.f249567a == aVar) {
            Log.m105924i("MicroMsg.RequestFloatWindowPermissionDialog", "removeCallback");
            RequestFloatWindowPermissionDialog.f249559g.mo119159d();
        }
    }

    public boolean Fh0(Activity activity, String[] strArr, int i, boolean z) {
        String[] strArr2 = strArr;
        int i2 = i;
        if (!C88929c.m111021e(activity, strArr) && z) {
            for (String str : strArr2) {
                long j = MultiProcessMMKV.getDefault().getLong("had_show_rationale_dlg_" + str + "_" + i2, 0);
                long d = C88929c.m111020d(str, i2);
                if (System.currentTimeMillis() - j < 172800000) {
                    return false;
                }
                if (d == 0) {
                    Activity activity2 = activity;
                } else if (!C90111a.m112742f(activity, str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean Gd0(Context context, String... strArr) {
        return C88929c.m111021e(context, strArr);
    }

    /* renamed from: Iw */
    public long mo125770Iw(String str, int i) {
        return C88929c.m111020d(str, i);
    }

    public void Jg0(Context context, int i, C88930e eVar, String[] strArr, String str, String str2) {
        C88929c.m111022f(context, i, eVar, strArr, str, str2);
    }

    /* renamed from: Jn */
    public boolean mo125772Jn(Context context) {
        HashMap<String, C88930e> hashMap = C88929c.f256473a;
        return C76359b.m91787d(context);
    }

    public boolean Lb0(Context context, String str) {
        return C88929c.m111019c(context, str, true);
    }

    public void M70(int i, C88930e eVar, String[] strArr) {
        HashMap<String, C88930e> hashMap = C88929c.f256473a;
        C88929c.m111022f(MMApplicationContext.getContext(), i, eVar, strArr, (String) null, (String) null);
    }

    /* renamed from: MJ */
    public boolean mo125775MJ(Context context, String str, int i, String str2, String str3, C88930e eVar) {
        HashMap<String, C88930e> hashMap = C88929c.f256473a;
        if (Build.VERSION.SDK_INT < 23 && !"MNC".equals(Build.VERSION.CODENAME)) {
            return true;
        }
        try {
            if (C111105a.m151499a(context, str) == 0) {
                return true;
            }
            C88929c.m111022f(context, i, eVar, new String[]{str}, str2, str3);
            return false;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", e);
            return true;
        }
    }

    public void Oa0(Context context, int i, String str, AbsRequestFloatWindowPermissionDialog.C85613a aVar, boolean z, boolean z2, String str2) {
        RequestFloatWindowPermissionDialog.m105696H7(context, i, str, aVar, z, z2, str2);
    }

    /* renamed from: TW */
    public boolean mo125776TW(Context context, int i) {
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_overlay_business_permission_ignore, 0) == 1) {
            HashMap<String, C88930e> hashMap = C88929c.f256473a;
            return C76359b.m91787d(context);
        }
        HashMap<String, C88930e> hashMap2 = C88929c.f256473a;
        return C76359b.m91787d(context) && ((C113177k) C86312j.m106911c(C113177k.class)).mo165706aQ(i);
    }

    /* renamed from: Uh */
    public void mo125777Uh(Context context, int i, C88930e eVar, String[] strArr, String str, String str2, String str3) {
        C88929c.m111023g(context, i, eVar, strArr, str, str2, str3);
    }

    public boolean Un0(Context context, String str, boolean z) {
        return C88929c.m111019c(context, str, z);
    }

    public boolean Uu0(Activity activity, String[] strArr, int i, String str, String str2) {
        HashMap<String, C88930e> hashMap = C88929c.f256473a;
        Log.m105924i("MicroMsg.MPermissionUtil", "[checkPermissions]");
        if ((Build.VERSION.SDK_INT < 23 && !"MNC".equals(Build.VERSION.CODENAME)) || strArr == null) {
            return true;
        }
        try {
            int i2 = 0;
            for (String a : strArr) {
                i2 = C111105a.m151499a(activity, a);
                if (i2 != 0) {
                    break;
                }
            }
            if (i2 == 0) {
                return true;
            }
            C88929c.m111022f(activity, i, new C11150b(activity), strArr, str, str2);
            return false;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", e);
            return true;
        }
    }

    public void b40(Activity activity, String[] strArr, int i) {
        HashMap<String, C88930e> hashMap = C88929c.f256473a;
        try {
            for (String h : strArr) {
                C88929c.m111024h(h, i);
            }
            C90111a.m112741e(activity, strArr, i);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MPermissionUtil", th, "requestPermissions err", new Object[0]);
        }
    }

    public void eu0(int i, C88930e eVar, String str) {
        String[] strArr = {str};
        HashMap<String, C88930e> hashMap = C88929c.f256473a;
        C88929c.m111022f(MMApplicationContext.getContext(), i, eVar, strArr, (String) null, (String) null);
    }

    public boolean fa0(Activity activity, String str, int i, String str2, String str3, String str4) {
        boolean z = C111105a.m151499a(activity, str) == 0;
        if (!z) {
            C88929c.m111023g(activity, i, new C91940a(this, activity), new String[]{str}, str2, str3, str4);
        }
        return z;
    }

    public void ff0(Context context, int i, String str, AbsRequestFloatWindowPermissionDialog.C85613a aVar, boolean z, String str2) {
        RequestFloatWindowPermissionDialog.m105696H7(context, i, str, aVar, z, false, str2);
    }

    /* renamed from: iA */
    public void mo75135iA(Context context, String str, AbsRequestFloatWindowPermissionDialog.C85613a aVar, String str2) {
        RequestFloatWindowPermissionDialog.m105696H7(context, -1, str, new RequestFloatWindowPermissionDialog.C85622e(new RequestFloatWindowPermissionDialog.C85622e(new RequestFloatWindowPermissionDialog.C85622e(aVar))), true, false, str2);
    }

    /* renamed from: j7 */
    public void mo125783j7(Context context) {
        HashMap<String, C88930e> hashMap = C88929c.f256473a;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(268435456);
        if (Util.isIntentAvailable(context, intent, true)) {
            try {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "gotoSystemAppMgrUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "gotoSystemAppMgrUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MPermissionUtil", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: kp */
    public boolean mo125784kp(Activity activity, String str, int i, String str2, String str3, C77429t tVar, Boolean bool) {
        return C88929c.m111018b(activity, str, i, str2, str3, tVar, bool);
    }

    /* renamed from: lI */
    public void mo125785lI(Activity activity, int i) {
        HashMap<String, C88930e> hashMap = C88929c.f256473a;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + activity.getPackageName()));
        intent.addFlags(268435456);
        if (Util.isIntentAvailable(activity, intent, true)) {
            try {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                aVar.mo10233c(intent);
                C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "gotoSystemAppMgrUI", "(Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MPermissionUtil", e, "", new Object[0]);
            }
        }
    }

    public boolean vp0(Activity activity, String str, int i, String str2, String str3, C77429t tVar) {
        return C88929c.m111018b(activity, str, i, str2, str3, tVar, Boolean.FALSE);
    }

    /* renamed from: w8 */
    public boolean mo125787w8(Context context) {
        return C88929c.m111017a(context);
    }

    /* renamed from: wJ */
    public void mo75136wJ(Context context, String str, AbsRequestFloatWindowPermissionDialog.C85613a aVar, boolean z, String str2) {
        RequestFloatWindowPermissionDialog.m105696H7(context, -1, str, new RequestFloatWindowPermissionDialog.C85622e(new RequestFloatWindowPermissionDialog.C85622e(aVar)), z, false, str2);
    }

    public void xh0(Context context, int i, String str, AbsRequestFloatWindowPermissionDialog.C85613a aVar, String str2) {
        RequestFloatWindowPermissionDialog.m105696H7(context, i, str, aVar, true, false, str2);
    }

    /* renamed from: z1 */
    public boolean mo125788z1(Activity activity, String str, int i, String str2, String str3) {
        return C88929c.m111018b(activity, str, i, str2, str3, (C77429t) null, Boolean.FALSE);
    }

    /* renamed from: zL */
    public void mo125789zL(Intent intent, C88931f fVar) {
        C88929c.m111025i(intent, "", "", fVar);
    }

    /* renamed from: zt */
    public void mo125790zt(Activity activity, String str, int i) {
        C88929c.m111024h(str, i);
        C88929c.m111022f(activity, i, new C11152d(activity), new String[]{str}, "", "");
    }
}
