package com.tencent.p014mm.pluginsdk.model.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72691t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import h81.C32735h;
import js0.C9512b;
import p156gj.C87200o;
import p823sg.C90193h;
import p977hj.C87527b;
import qe3.C89625d;

/* renamed from: com.tencent.mm.pluginsdk.model.app.j0 */
public final class C72688j0 {
    /* renamed from: a */
    public static void m85015a(int i, String str, String str2, int i2, C72691t1.C72692a aVar, int i3) {
        if (Build.VERSION.SDK_INT >= 30) {
            int i4 = i2 == 2 ? 1 : (i2 == 5 || i2 == 27) ? 2 : 0;
            if (str2 == null) {
                str2 = "";
            }
            if (str == null) {
                str = "";
            }
            if (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
                Log.m105918d("MicroMsg.AppUtilities", "OpenSDKAuthenticationReport  openSDKVersion:" + i + " pkg:" + str + " token:" + str2 + " scene:" + i4 + " authenticationResult:" + aVar + " action:" + i3);
            }
            C115669n.INSTANCE.mo160131h(24194, Integer.valueOf(i), str, str2, Integer.valueOf(i4), Integer.valueOf(aVar.f211519d), Integer.valueOf(i3));
        }
    }

    /* renamed from: b */
    public static String m85016b(Context context, String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            Log.m105920e("MicroMsg.AppUtilities", "buildSourceUrl fail, invalid arguments");
            return null;
        }
        String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
        if (loadApplicationLanguage == null || loadApplicationLanguage.length() == 0) {
            loadApplicationLanguage = "zh_CN";
        } else if (loadApplicationLanguage.equals("en")) {
            loadApplicationLanguage = "en_US";
        }
        return context.getString(C0966R.string.hfp, new Object[]{str, Integer.valueOf(C89625d.f257841g), loadApplicationLanguage, C87200o.f252868a, str2});
    }

    /* renamed from: c */
    public static String m85017c(Activity activity) {
        String str;
        Uri referrer;
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            str = callingActivity.getPackageName();
            Log.m105925i("MicroMsg.AppUtilities", "get calling activity, %s", str);
        } else {
            str = "";
        }
        if (Util.isNullOrNil(str) && Build.VERSION.SDK_INT >= 22) {
            try {
                Object a = new C87527b(activity, "mReferrer", (String) null).mo121998a();
                if (a != null) {
                    str = (String) a;
                }
                Log.m105925i("MicroMsg.AppUtilities", "get referrer, %s", str);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppUtilities", e, "get mReferrer error", new Object[0]);
            }
        }
        if (!Util.isNullOrNil(str) || Build.VERSION.SDK_INT < 22 || (referrer = activity.getReferrer()) == null) {
            return str;
        }
        String authority = referrer.getAuthority();
        Log.m105925i("MicroMsg.AppUtilities", "get referrer, %s", authority);
        return authority;
    }

    /* renamed from: d */
    public static String m85018d(Context context, String str) {
        Signature[] a = C6647c.m6936a(context, str);
        if (a != null && a.length != 0) {
            return C90193h.m112878f(a[0].toByteArray());
        }
        Log.m105920e("MicroMsg.AppUtilities", "signs is null");
        return null;
    }

    /* renamed from: e */
    public static String m85019e(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str.toLowerCase());
        stringBuffer.append("mMHc ItnStR");
        return C90193h.m112878f(stringBuffer.toString().getBytes());
    }

    /* renamed from: f */
    public static boolean m85020f(Context context, String str) {
        return C9512b.m9207a(context, str) != null;
    }

    /* renamed from: g */
    public static void m85021g(Bundle bundle) {
        if (bundle != null) {
            bundle.putString(ConstantsAPI.Token.WX_TOKEN_KEY, ConstantsAPI.Token.WX_TOKEN_VALUE_MSG);
        }
    }

    /* renamed from: h */
    public static void m85022h(Bundle bundle) {
        if (bundle != null) {
            bundle.putString(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY, "wechat");
        }
    }

    /* renamed from: i */
    public static void m85023i(Bundle bundle, String str) {
        if (bundle != null) {
            bundle.putString(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY, "wechat");
            if (!Util.isNullOrNil(str)) {
                bundle.putString(ConstantsAPI.Token.WX_LAUNCH_PARAM_KEY, str);
            }
        }
    }

    /* renamed from: j */
    public static void m85024j(MMessageActV2.Args args) {
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_opensdk_launch_app_with_new_task_flag, true)) {
            args.flags = 268435456;
        }
    }
}
