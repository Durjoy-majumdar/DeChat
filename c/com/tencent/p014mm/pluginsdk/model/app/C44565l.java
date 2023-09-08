package com.tencent.p014mm.pluginsdk.model.app;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gu3.C107916a;
import gu3.C107917d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import md2.C47000b;
import nj3.C76879j;
import org.json.JSONException;
import org.json.JSONObject;
import p166hy.C46134x;
import p823sg.C90193h;
import qo3.C47883u;
import qo3.C77426q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.model.app.l */
public final class C44565l {

    /* renamed from: com.tencent.mm.pluginsdk.model.app.l$a */
    public class C44566a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f120851d;

        public C44566a(Context context) {
            this.f120851d = context;
        }

        public void run() {
            Context context = this.f120851d;
            C76879j.m92726T(context, context.getString(C0966R.string.bbl));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.l$b */
    public class C44567b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ShowMessageFromWX.Req f120852d;

        /* renamed from: e */
        public final /* synthetic */ String f120853e;

        /* renamed from: f */
        public final /* synthetic */ Context f120854f;

        /* renamed from: g */
        public final /* synthetic */ C44580q1 f120855g;

        public C44567b(ShowMessageFromWX.Req req, String str, Context context, C44580q1 q1Var) {
            this.f120852d = req;
            this.f120853e = str;
            this.f120854f = context;
            this.f120855g = q1Var;
        }

        public void run() {
            Bundle bundle = new Bundle();
            this.f120852d.toBundle(bundle);
            C72688j0.m85021g(bundle);
            C72688j0.m85022h(bundle);
            MMessageActV2.Args args = new MMessageActV2.Args();
            args.targetPkgName = this.f120853e;
            args.bundle = bundle;
            C72688j0.m85024j(args);
            boolean send = MMessageActV2.send(this.f120854f, args);
            C44580q1 q1Var = this.f120855g;
            if (q1Var != null) {
                q1Var.mo1579a(send, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.l$c */
    public class C44568c implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ Bundle f120856a;

        /* renamed from: b */
        public final /* synthetic */ String f120857b;

        /* renamed from: c */
        public final /* synthetic */ String f120858c;

        /* renamed from: d */
        public final /* synthetic */ C44580q1 f120859d;

        public C44568c(Bundle bundle, String str, String str2, C44580q1 q1Var) {
            this.f120856a = bundle;
            this.f120857b = str;
            this.f120858c = str2;
            this.f120859d = q1Var;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C44565l.m48981a(this.f120856a, 0, 0, "", 0, this.f120857b);
            if ("wx073f4a4daff0abe8".equalsIgnoreCase(this.f120858c)) {
                C115669n.INSTANCE.mo160131h(15413, 3, "", "");
            }
            C44580q1 q1Var = this.f120859d;
            if (q1Var != null) {
                q1Var.mo1579a(false, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.l$d */
    public class C44569d implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ Bundle f120860a;

        /* renamed from: b */
        public final /* synthetic */ String f120861b;

        /* renamed from: c */
        public final /* synthetic */ String f120862c;

        /* renamed from: d */
        public final /* synthetic */ Runnable f120863d;

        public C44569d(Bundle bundle, String str, String str2, Runnable runnable) {
            this.f120860a = bundle;
            this.f120861b = str;
            this.f120862c = str2;
            this.f120863d = runnable;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C44565l.m48981a(this.f120860a, 0, 1, "", 1, this.f120861b);
            if ("wx073f4a4daff0abe8".equalsIgnoreCase(this.f120862c)) {
                C115669n.INSTANCE.mo160131h(15413, 2, "", "");
            }
            this.f120863d.run();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.l$e */
    public class C44570e implements C107916a<C107917d.C87398b, Object> {

        /* renamed from: a */
        public final /* synthetic */ C77426q f120864a;

        public C44570e(C77426q qVar) {
            this.f120864a = qVar;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C107917d.C87398b bVar = (C107917d.C87398b) obj;
            this.f120864a.mo107603o();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.l$f */
    public class C44571f implements C107916a<C107917d.C87398b, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ String f120865a;

        /* renamed from: b */
        public final /* synthetic */ Context f120866b;

        /* renamed from: c */
        public final /* synthetic */ Bundle f120867c;

        /* renamed from: d */
        public final /* synthetic */ Intent f120868d;

        /* renamed from: e */
        public final /* synthetic */ String f120869e;

        /* renamed from: f */
        public final /* synthetic */ C44580q1 f120870f;

        public C44571f(String str, Context context, Bundle bundle, Intent intent, String str2, C44580q1 q1Var) {
            this.f120865a = str;
            this.f120866b = context;
            this.f120867c = bundle;
            this.f120868d = intent;
            this.f120869e = str2;
            this.f120870f = q1Var;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            String str;
            C107917d.C87398b bVar = (C107917d.C87398b) obj;
            if (!TextUtils.isEmpty(this.f120865a)) {
                str = this.f120866b.getString(C0966R.string.f360936g34, new Object[]{this.f120865a});
            } else {
                str = this.f120866b.getString(C0966R.string.f360935g33);
            }
            String f = C44565l.m48986f(this.f120867c);
            if (f != null) {
                ((C46134x) C86312j.m106911c(C46134x.class)).mo71584PQ(f);
            }
            C77426q qVar = new C77426q(this.f120866b);
            qVar.mo107595g(str);
            qVar.mo107602n(this.f120866b.getString(C0966R.string.f360934g32));
            qVar.mo107598j(this.f120866b.getString(C0966R.string.f7926wf));
            qVar.mo107600l(new C44576n(this));
            qVar.mo107597i(new C44574m(this));
            qVar.mo107603o();
            return Boolean.TRUE;
        }
    }

    /* renamed from: a */
    public static void m48981a(Bundle bundle, int i, int i2, String str, int i3, String str2) {
        Bundle bundle2 = bundle;
        String str3 = str;
        String str4 = "";
        String string = bundle2 != null ? bundle2.getString("current_page_url", str4) : str4;
        String string2 = bundle2 != null ? bundle2.getString("current_page_appid", str4) : str4;
        String string3 = bundle2 != null ? bundle2.getString("current_page_biz_info", str4) : str4;
        String string4 = bundle2 != null ? bundle2.getString("current_page_source_info", str4) : str4;
        String replace = string != null ? string.replace(',', '.') : str4;
        String replace2 = str3 != null ? str3.replace(',', '.') : str4;
        int i4 = bundle2 != null ? bundle2.getInt("current_page_secCtrlMode") : 0;
        String string5 = bundle2 != null ? bundle2.getString("current_page_fromUsername", str4) : str4;
        String string6 = bundle2 != null ? bundle2.getString("current_page_msgUsername", str4) : str4;
        int i5 = bundle2 != null ? bundle2.getInt("current_page_requestId") : 0;
        int i6 = bundle2 != null ? bundle2.getInt("current_page_msgType") : 0;
        int i7 = bundle2 != null ? bundle2.getInt("current_page_appMsgType") : 0;
        int i8 = bundle2 != null ? bundle2.getInt("current_page_a8keyScene") : 0;
        if (bundle2 != null) {
            str4 = bundle2.getString("current_page_msgId", str4);
        }
        C115669n.INSTANCE.mo160131h(14102, Integer.valueOf(i), Integer.valueOf(i2), replace2, Integer.valueOf(i3), str2, replace, string2, string4, string3, Integer.valueOf(i4), string5, Integer.valueOf(i5), str4, string6, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    /* renamed from: b */
    public static ShowMessageFromWX.Req m48982b(Context context, WXMediaMessage wXMediaMessage, String str) {
        ShowMessageFromWX.Req req = new ShowMessageFromWX.Req();
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        req.message = wXMediaMessage;
        req.transaction = C90193h.m112878f(("" + Util.nowMilliSecond()).getBytes());
        req.openId = str;
        req.lang = LocaleUtil.loadApplicationLanguage(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
        req.country = (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
        return req;
    }

    /* renamed from: c */
    public static boolean m48983c(C44561j jVar) {
        if (jVar == null || Util.isNullOrNil(jVar.field_appId)) {
            return false;
        }
        boolean z = (jVar.field_appInfoFlag & 64) > 0;
        Log.m105927v("MicroMsg.AppInfoLogic", "canReadMMMsg, appid = %s, ret = %b", jVar.field_appId, Boolean.valueOf(z));
        return z;
    }

    /* renamed from: d */
    public static boolean m48984d(C44561j jVar) {
        if (jVar == null || Util.isNullOrNil(jVar.field_appId)) {
            return false;
        }
        if (true != ((jVar.field_appInfoFlag & 128) > 0)) {
            return false;
        }
        String str = jVar.field_appId;
        HashMap hashMap = new HashMap();
        C75592q0.m90766N(327682, hashMap);
        String str2 = hashMap.containsKey(str) ? (String) hashMap.get(str) : null;
        return str2 == null || str2.equals("0");
    }

    /* renamed from: e */
    public static boolean m48985e(String str) {
        boolean z;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (!str.startsWith("content")) {
            return Util.isFilePathSafeToBeCopySrc(str) && m48997q(str);
        }
        Uri parse = Uri.parse(str);
        String authority = parse.getAuthority();
        if (authority == null || (!authority.contains("com.tencent.mm") && !authority.contains("com.tencent.wmpf") && !authority.contains(MMApplicationContext.getApplicationId()))) {
            z = true;
        } else {
            Log.m105921e("MicroMsg.AppInfoLogic", "checkContentUri not valid: %s", parse.toString());
            z = false;
        }
        return z && m48997q(str);
    }

    /* renamed from: f */
    public static String m48986f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!bundle.getBoolean("current_page_ad_onlineReport", false)) {
            Log.m105924i("MicroMsg.AppInfoLogic", "getAdReportParams do not do onlineReport");
            return null;
        }
        String string = bundle.getString("current_page_biz_info", "");
        String string2 = bundle.getString("current_page_source_info", "");
        if (!Util.isNullOrNil(string) || !Util.isNullOrNil(string2)) {
            JSONObject jSONObject = new JSONObject();
            if (string != null) {
                try {
                    jSONObject.put("bizInfo", string);
                } catch (JSONException e) {
                    Log.m105929w("MicroMsg.AppInfoLogic", "getAdReportParams ex %s", e.getMessage());
                }
            }
            if (string2 != null) {
                jSONObject.put("sourceInfo", string2);
            }
            return jSONObject.toString();
        }
        Log.m105924i("MicroMsg.AppInfoLogic", "getAdReportParams null");
        return null;
    }

    /* renamed from: g */
    public static C44561j m48987g(String str) {
        return m48989i(str, true, false);
    }

    /* renamed from: h */
    public static C44561j m48988h(String str, int i) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
            return null;
        } else if (C47000b.C34548a.m40384a() == null) {
            Log.m105920e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
            return null;
        } else {
            C44561j appInfo = C47000b.C34548a.m40384a().getAppInfo(str);
            if (appInfo == null || appInfo.field_appVersion < i) {
                C47000b.C34548a.m40384a().mo72193D9(str);
            }
            return appInfo;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r1 = r0.field_appName;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.pluginsdk.model.app.C44561j m48989i(java.lang.String r3, boolean r4, boolean r5) {
        /*
            r0 = 0
            java.lang.String r1 = "MicroMsg.AppInfoLogic"
            if (r3 == 0) goto L_0x0048
            int r2 = r3.length()
            if (r2 != 0) goto L_0x000c
            goto L_0x0048
        L_0x000c:
            md2.b r2 = md2.C47000b.C34548a.m40384a()
            if (r2 != 0) goto L_0x0018
            java.lang.String r3 = "getISubCorePluginBase() == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)
            return r0
        L_0x0018:
            md2.b r0 = md2.C47000b.C34548a.m40384a()
            com.tencent.mm.pluginsdk.model.app.j r0 = r0.getAppInfo(r3)
            if (r4 == 0) goto L_0x0047
            r4 = 1
            if (r0 == 0) goto L_0x0032
            java.lang.String r1 = r0.field_appName
            if (r1 == 0) goto L_0x0032
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r1 = 0
            goto L_0x0033
        L_0x0032:
            r1 = 1
        L_0x0033:
            if (r1 != 0) goto L_0x0040
            if (r5 == 0) goto L_0x0047
            java.lang.String r5 = r0.field_packageName
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0047
        L_0x0040:
            md2.b r4 = md2.C47000b.C34548a.m40384a()
            r4.mo72193D9(r3)
        L_0x0047:
            return r0
        L_0x0048:
            java.lang.String r3 = "getAppInfo, appId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C44565l.m48989i(java.lang.String, boolean, boolean):com.tencent.mm.pluginsdk.model.app.j");
    }

    /* renamed from: j */
    public static C44561j m48990j(String str, boolean z) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
            return null;
        }
        C47000b a = C47000b.C34548a.m40384a();
        if (a == null) {
            Log.m105920e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
            return null;
        } else if (z) {
            return a.mo72200fl(str);
        } else {
            C44561j appInfo = a.getAppInfo(str);
            if (appInfo == null) {
                return a.mo72200fl(str);
            }
            a.mo72193D9(str);
            return appInfo;
        }
    }

    /* renamed from: k */
    public static List<C44561j> m48991k(Context context, boolean z, boolean z2, boolean z3, int i, int i2) {
        Cursor re02;
        ArrayList arrayList = new ArrayList();
        if (C47000b.C34548a.m40384a() == null) {
            Log.m105920e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
            return arrayList;
        }
        if (z3) {
            arrayList = new ArrayList();
            if (C47000b.C34548a.m40384a() == null) {
                Log.m105920e("MicroMsg.AppInfoLogic", "getServiceByAppInfoFlagAndShowFlag, getISubCorePluginBase() == null");
            } else {
                Cursor ir = C47000b.C34548a.m40384a().mo72202ir(i, i2);
                if (ir != null) {
                    while (ir.moveToNext()) {
                        C44561j jVar = new C44561j();
                        jVar.convertFrom(ir);
                        arrayList.add(jVar);
                    }
                    ir.close();
                    Log.m105925i("MicroMsg.AppInfoLogic", "getServiceByAppInfoFlagAndShowFlag: size is %s", Integer.valueOf(arrayList.size()));
                }
            }
        }
        int[] iArr = null;
        if (z && z2) {
            iArr = new int[]{1, 5};
        } else if (z) {
            iArr = new int[]{1};
        } else if (z2) {
            iArr = new int[]{5};
        }
        if (!(iArr == null || (re02 = C47000b.C34548a.m40384a().re0(iArr, true)) == null)) {
            while (re02.moveToNext()) {
                C44561j jVar2 = new C44561j();
                jVar2.convertFrom(re02);
                if (jVar2.field_status == 1) {
                    if (!m48996p(context, jVar2.field_appId)) {
                        jVar2.field_status = 4;
                        C47000b.C34548a.m40384a().mo72197Nz(jVar2);
                    } else if (!Util.isNullOrNil(jVar2.field_signature)) {
                        arrayList.add(jVar2);
                    }
                } else if (jVar2.field_signature != null) {
                    arrayList.add(jVar2);
                }
            }
            re02.close();
        }
        return arrayList;
    }

    /* renamed from: l */
    public static String m48992l(Context context) {
        String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
        return (loadApplicationLanguage == null || loadApplicationLanguage.length() == 0 || loadApplicationLanguage.equalsIgnoreCase("zh_CN")) ? "zh_CN" : loadApplicationLanguage;
    }

    /* renamed from: m */
    public static String m48993m(Context context, C44561j jVar, String str) {
        if (context == null || jVar == null) {
            return str;
        }
        String l = m48992l(context);
        String str2 = null;
        if (l.equalsIgnoreCase("zh_CN")) {
            str2 = jVar.field_appName;
        }
        if (l.equalsIgnoreCase("en")) {
            str2 = Util.isNullOrNil(jVar.field_appName_en) ? jVar.field_appName : jVar.field_appName_en;
        }
        if (l.equalsIgnoreCase("zh_TW") || l.equalsIgnoreCase("zh_HK")) {
            if (l.equalsIgnoreCase("zh_HK")) {
                str2 = Util.isNullOrNil(jVar.field_appName_hk) ? jVar.field_appName_tw : jVar.field_appName_hk;
            }
            if (Util.isNullOrNil(str2)) {
                str2 = Util.isNullOrNil(jVar.field_appName_tw) ? jVar.field_appName : jVar.field_appName_tw;
            }
        }
        if (Util.isNullOrNil(str2)) {
            str2 = Util.isNullOrNil(jVar.field_appName_en) ? jVar.field_appName : jVar.field_appName_en;
        }
        return Util.isNullOrNil(str2) ? str : str2;
    }

    /* renamed from: n */
    public static boolean m48994n(C44561j jVar, int i) {
        if (jVar == null || Util.isNullOrNil(jVar.field_appId)) {
            return false;
        }
        boolean z = (jVar.field_appInfoFlag & i) > 0;
        Log.m105925i("MicroMsg.AppInfoLogic", "isAppHasFlag, appid = %s, flag = %s, ret = %b", jVar.field_appId, Integer.valueOf(i), Boolean.valueOf(z));
        Log.m105924i("MicroMsg.AppInfoLogic", "appInfoFlag = " + jVar.field_appInfoFlag);
        return z;
    }

    /* renamed from: o */
    public static boolean m48995o(Context context, C44561j jVar) {
        if (jVar == null) {
            Log.m105928w("MicroMsg.AppInfoLogic", "app is null");
            return false;
        }
        String str = jVar.field_packageName;
        if (str != null && str.length() != 0) {
            return C72688j0.m85020f(context, jVar.field_packageName);
        }
        Log.m105928w("MicroMsg.AppInfoLogic", "field_packageName is null");
        return false;
    }

    /* renamed from: p */
    public static boolean m48996p(Context context, String str) {
        if (context != null && str != null && str.length() != 0) {
            return m48995o(context, m48987g(str));
        }
        Log.m105920e("MicroMsg.AppInfoLogic", "isAppInstalled, invalid arguments");
        return false;
    }

    /* renamed from: q */
    public static boolean m48997q(String str) {
        if (str != null) {
            try {
                C86009m1 m1Var = new C86009m1(str);
                return m1Var.mo119967g() && m1Var.mo119961a();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppInfoLogic", e, "isFileExistAndReadable exception", new Object[0]);
            }
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m48998r(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C44561j i = m48989i(str, false, false);
        if (i != null) {
            return i.mo69359k();
        }
        Log.m105928w("MicroMsg.AppInfoLogic", "app is null, appId = " + str);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r2 = r2.activityInfo;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m48999s(android.content.Context r15, android.content.Intent r16, java.lang.String r17, int r18, com.tencent.p014mm.pluginsdk.model.app.C44580q1 r19, android.os.Bundle r20) {
        /*
            r0 = r15
            r5 = r16
            r9 = r19
            java.lang.Class<hy.x> r10 = p166hy.C46134x.class
            r11 = 0
            java.lang.String r12 = "MicroMsg.AppInfoLogic"
            if (r0 == 0) goto L_0x015a
            if (r5 != 0) goto L_0x0010
            goto L_0x015a
        L_0x0010:
            java.util.List r1 = com.tencent.p014mm.sdk.platformtools.Util.queryIntentActivities(r15, r16)
            if (r1 == 0) goto L_0x001c
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0026
        L_0x001c:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isAffectedByPackageVisibility(r2)
            if (r2 == 0) goto L_0x014f
        L_0x0026:
            java.lang.String r2 = r16.getPackage()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r13 = 1
            if (r2 == 0) goto L_0x0054
            if (r1 == 0) goto L_0x0054
            int r2 = r1.size()
            if (r2 != r13) goto L_0x0054
            java.lang.Object r2 = r1.get(r11)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            if (r2 != 0) goto L_0x0043
            r2 = 0
            goto L_0x0058
        L_0x0043:
            java.lang.String r3 = r2.resolvePackageName
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0052
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 == 0) goto L_0x0052
            java.lang.String r2 = r2.packageName
            goto L_0x0058
        L_0x0052:
            r2 = r3
            goto L_0x0058
        L_0x0054:
            java.lang.String r2 = r16.getPackage()
        L_0x0058:
            r6 = r2
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r2[r11] = r3
            java.lang.String r3 = "launchApp, wxpkg : %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r3, r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007f
            java.lang.String r0 = "launchApp failed, can not launch wechat page."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            if (r9 == 0) goto L_0x007e
            r9.mo1579a(r11, r11)
        L_0x007e:
            return r11
        L_0x007f:
            if (r1 == 0) goto L_0x0098
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0098
            java.lang.String r2 = m48986f(r20)
            if (r2 != 0) goto L_0x008e
            goto L_0x00a8
        L_0x008e:
            di3.d r3 = di3.C86312j.m106911c(r10)
            hy.x r3 = (p166hy.C46134x) r3
            r3.mo71585fV(r2)
            goto L_0x00a8
        L_0x0098:
            java.lang.String r2 = m48986f(r20)
            if (r2 != 0) goto L_0x009f
            goto L_0x00a8
        L_0x009f:
            di3.d r3 = di3.C86312j.m106911c(r10)
            hy.x r3 = (p166hy.C46134x) r3
            r3.g70(r2)
        L_0x00a8:
            com.tencent.p014mm.pluginsdk.model.app.C6648d0.m6937a(r6, r13)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r11] = r6
            if (r1 == 0) goto L_0x00ba
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x00ba
            r4 = 1
            goto L_0x00bb
        L_0x00ba:
            r4 = 0
        L_0x00bb:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3[r13] = r4
            java.lang.String r4 = "launchApp(pkg : %s) by wechat with intent, activitys list is not empty: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r3)
            r3 = r18
            if (r3 != r2) goto L_0x0121
            k20.a r14 = new k20.a     // Catch:{ Exception -> 0x0112 }
            r14.<init>()     // Catch:{ Exception -> 0x0112 }
            r14.mo10233c(r5)     // Catch:{ Exception -> 0x0112 }
            java.lang.Object[] r2 = r14.mo10232b()     // Catch:{ Exception -> 0x0112 }
            java.lang.String r3 = "com/tencent/mm/pluginsdk/model/app/AppInfoLogic"
            java.lang.String r4 = "launchAppByWeChat"
            java.lang.String r5 = "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;ILcom/tencent/mm/pluginsdk/model/app/OnLaunchAppCallback;Landroid/os/Bundle;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r15
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0112 }
            java.lang.Object r1 = r14.mo10231a(r11)     // Catch:{ Exception -> 0x0112 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ Exception -> 0x0112 }
            r15.startActivity(r1)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r2 = "com/tencent/mm/pluginsdk/model/app/AppInfoLogic"
            java.lang.String r3 = "launchAppByWeChat"
            java.lang.String r4 = "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;ILcom/tencent/mm/pluginsdk/model/app/OnLaunchAppCallback;Landroid/os/Bundle;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r15
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r0 = m48986f(r20)     // Catch:{ Exception -> 0x0112 }
            if (r0 != 0) goto L_0x0108
            goto L_0x011b
        L_0x0108:
            di3.d r1 = di3.C86312j.m106911c(r10)     // Catch:{ Exception -> 0x0112 }
            hy.x r1 = (p166hy.C46134x) r1     // Catch:{ Exception -> 0x0112 }
            r1.mo71587pQ(r0)     // Catch:{ Exception -> 0x0112 }
            goto L_0x011b
        L_0x0112:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            r13 = 0
        L_0x011b:
            if (r9 == 0) goto L_0x0120
            r9.mo1579a(r13, r11)
        L_0x0120:
            return r13
        L_0x0121:
            if (r1 == 0) goto L_0x014f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x014f
            gu3.d r8 = gu3.C107917d.m146213b()
            gu3.g r1 = gu3.C107917d.f323121j
            r8.f323124b = r1
            com.tencent.mm.pluginsdk.model.app.l$f r10 = new com.tencent.mm.pluginsdk.model.app.l$f
            r1 = r10
            r2 = r17
            r3 = r15
            r4 = r20
            r5 = r16
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)
            gu3.d r0 = r8.mo158345f(r10)
            java.lang.Object r0 = r0.mo158346g()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x014f:
            java.lang.String r0 = "launchApp failed, not activity can resolve the intent."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
            if (r9 == 0) goto L_0x0159
            r9.mo1579a(r11, r11)
        L_0x0159:
            return r11
        L_0x015a:
            java.lang.String r0 = "launchApp failed, context or intent is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            if (r9 == 0) goto L_0x0164
            r9.mo1579a(r11, r11)
        L_0x0164:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C44565l.m48999s(android.content.Context, android.content.Intent, java.lang.String, int, com.tencent.mm.pluginsdk.model.app.q1, android.os.Bundle):boolean");
    }

    /* renamed from: t */
    public static boolean m49000t(Context context, String str, WXMediaMessage wXMediaMessage, String str2, String str3, int i, C44580q1 q1Var, Bundle bundle) {
        String str4 = str3;
        StringBuilder sb = new StringBuilder();
        sb.append("request pkg = ");
        String str5 = str;
        sb.append(str);
        sb.append(", openId = ");
        sb.append(str3);
        Log.m105918d("MicroMsg.AppInfoLogic", sb.toString());
        Context context2 = context;
        WXMediaMessage wXMediaMessage2 = wXMediaMessage;
        return m49001u(context, str, str2, m48982b(context, wXMediaMessage, str3), i, q1Var, bundle);
    }

    /* renamed from: u */
    public static boolean m49001u(Context context, String str, String str2, ShowMessageFromWX.Req req, int i, C44580q1 q1Var, Bundle bundle) {
        Context context2 = context;
        String str3 = str;
        ShowMessageFromWX.Req req2 = req;
        C44580q1 q1Var2 = q1Var;
        Bundle bundle2 = bundle;
        if (req2 == null) {
            Log.m105924i("MicroMsg.AppInfoLogic", "launchApp failed, req is null.");
            if (q1Var2 != null) {
                q1Var2.mo1579a(false, false);
            }
            return false;
        } else if (TextUtils.isEmpty(str) || !C72688j0.m85020f(context, str)) {
            Log.m105924i("MicroMsg.AppInfoLogic", "launchApp failed, pkg is null or application has not installed.");
            C6648d0.m6937a(str3, 1);
            ((C119157j) C119157j.f356862d).mo183895z(new C44566a(context2));
            if (q1Var2 != null) {
                q1Var2.mo1579a(false, false);
            }
            return false;
        } else {
            Log.m105925i("MicroMsg.AppInfoLogic", "launchApp(pkg : %s) with appId(%s)", str3, str2);
            if (Util.nullAsNil(MMApplicationContext.getPackageName()).equals(str3)) {
                Log.m105924i("MicroMsg.AppInfoLogic", "launchApp failed, can not launch wechat page.");
                if (q1Var2 != null) {
                    q1Var2.mo1579a(false, false);
                }
                return false;
            }
            C6648d0.m6937a(str3, 1);
            C44567b bVar = new C44567b(req2, str3, context2, q1Var2);
            if (i == 2) {
                Log.m105925i("MicroMsg.AppInfoLogic", "launchApp with show confirm dialog(%s).", str3);
                bVar.run();
                return true;
            }
            C44561j g = m48987g(str2);
            String string = (g == null || Util.isNullOrNil(m48993m(context2, g, (String) null))) ? context2.getString(C0966R.string.f360935g33) : context2.getString(C0966R.string.f360936g34, new Object[]{m48993m(context2, g, (String) null)});
            String str4 = str2 == null ? "" : str2;
            if ("wx073f4a4daff0abe8".equalsIgnoreCase(str4)) {
                C115669n.INSTANCE.mo160131h(15413, 1, "", "");
            }
            Log.m105925i("MicroMsg.AppInfoLogic", "launchApp with args(showType : %s, pkg : %s)", Integer.valueOf(i), str3);
            C77426q qVar = new C77426q(context2);
            qVar.mo107595g(string);
            qVar.mo107602n(context2.getString(C0966R.string.f360934g32));
            qVar.mo107598j(context2.getString(C0966R.string.f7926wf));
            qVar.mo107600l(new C44569d(bundle2, str3, str4, bVar));
            qVar.mo107597i(new C44568c(bundle2, str3, str4, q1Var2));
            if (Looper.myLooper() == Looper.getMainLooper()) {
                qVar.mo107603o();
            } else {
                C107917d<C107917d.C87398b> b = C107917d.m146213b();
                b.f323124b = C107917d.f323121j;
                b.mo158345f(new C44570e(qVar)).mo158346g();
            }
            return true;
        }
    }
}
