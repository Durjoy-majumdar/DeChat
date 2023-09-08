package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Set;
import kb0.C9576e;
import kj2.C117407d;
import p003ay.C0235b;
import p910lj.C76701a;
import vn2.C14913a;

/* renamed from: com.tencent.mm.plugin.appbrand.w4 */
public abstract class C2054w4 extends C14913a {
    /* renamed from: D */
    public boolean mo1872D(Intent intent, boolean z) {
        String str;
        String str2;
        Intent intent2 = intent;
        Class cls = C0235b.class;
        if (z) {
            str = ((C0235b) C86312j.m106911c(cls)).mo265iH(IntentUtil.getStringExtra(intent2, "id"));
            str2 = ((C0235b) C86312j.m106911c(cls)).mo265iH(IntentUtil.getStringExtra(intent2, "ext_info"));
        } else {
            str = ((C0235b) C86312j.m106911c(cls)).mo262Me(IntentUtil.getStringExtra(intent2, "id"));
            str2 = ((C0235b) C86312j.m106911c(cls)).mo262Me(IntentUtil.getStringExtra(intent2, "ext_info"));
        }
        String stringExtra = IntentUtil.getStringExtra(intent2, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        int intExtra = IntentUtil.getIntExtra(intent2, "ext_info_1", 0);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(stringExtra)) {
            Log.m105920e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username or appId or token is null or nil.");
            return false;
        } else if (!C9576e.m9260a(str)) {
            Log.m105921e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username %s invalid ", str);
            C117407d.INSTANCE.idkeyStat(647, 1, 1, false);
            return false;
        } else {
            if (!stringExtra.equals(((C0235b) C86312j.m106911c(cls)).mo260E7(str2, "" + C86709a0.m107523b().mo121110g()))) {
                SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("app_brand_global_sp", 0);
                if (sharedPreferences == null) {
                    Log.m105928w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, sp is null.");
                    return false;
                }
                Set<String> stringSet = sharedPreferences.getStringSet("uin_set", new HashSet());
                if (stringSet == null || stringSet.isEmpty()) {
                    Log.m105928w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, uin set is null or nil.");
                    return false;
                }
                HashSet hashSet = new HashSet();
                for (String E7 : stringSet) {
                    hashSet.add(((C0235b) C86312j.m106911c(cls)).mo260E7(str2, E7));
                }
                if (!hashSet.contains(stringExtra)) {
                    Log.m105921e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, illegal token(%s).", stringExtra);
                    return false;
                }
            }
            if (CrashReportFactory.hasDebuger() || intExtra != 1) {
                return true;
            }
            Log.m105924i("MiroMsg.WxaShortcutEntry", "can not open testing WeApp in released WeChat.");
            return false;
        }
    }

    /* renamed from: O */
    public abstract int mo1873O(Intent intent);

    /* renamed from: Q */
    public void mo1971Q(Context context, Intent intent, boolean z) {
        String str;
        String str2;
        Class cls = C0235b.class;
        if (z) {
            str = ((C0235b) C86312j.m106911c(cls)).mo265iH(IntentUtil.getStringExtra(intent, "id"));
            str2 = ((C0235b) C86312j.m106911c(cls)).mo265iH(IntentUtil.getStringExtra(intent, "ext_info"));
        } else {
            str = ((C0235b) C86312j.m106911c(cls)).mo262Me(IntentUtil.getStringExtra(intent, "id"));
            str2 = ((C0235b) C86312j.m106911c(cls)).mo262Me(IntentUtil.getStringExtra(intent, "ext_info"));
        }
        int intExtra = IntentUtil.getIntExtra(intent, "ext_info_1", 0);
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        aVar.f9533h = str2;
        aVar.f9526a = str;
        aVar.f9528c = intExtra;
        aVar.f9529d = mo1873O(intent);
        StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
        aVar2.f9538m = true;
        aVar2.f9531f = context;
        aVar2.f9539n = false;
        startAppBrandUIFromOuterEvent.publish();
        if (startAppBrandUIFromOuterEvent.f9523e.f9552a) {
            Log.m105925i("MiroMsg.WxaShortcutEntry", "open wxa with id : %s", str);
        } else if (intExtra == 1) {
            C76701a.makeText(context, (int) C0966R.string.f7646mk, 0).show();
        } else if (intExtra == 2) {
            C76701a.makeText(context, (int) C0966R.string.f7764qx, 0).show();
        }
    }

    /* renamed from: S */
    public abstract void mo1874S(Context context, Intent intent, boolean z);

    /* renamed from: q */
    public void mo1972q(Context context, Intent intent) {
        boolean z = Build.VERSION.SDK_INT >= 26;
        if (!mo1872D(intent, z)) {
            mo1874S(context, intent, false);
            return;
        }
        mo1874S(context, intent, true);
        mo1971Q(context, intent, z);
    }
}
