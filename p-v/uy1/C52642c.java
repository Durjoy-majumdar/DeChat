package uy1;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import c30.C104289g;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.NotifyGameWebviewOperationEvent;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.game.autogen.chatroom.HalfScreen;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.plugin.game.commlib.util.C41874g;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44550e0;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C9556a;
import kr0.C76630x0;
import mp3.C88824h;
import org.json.JSONArray;
import p244tt.C14088e;
import p763ym.C53543s;
import p763ym.C79138l;
import py1.C47563d1;
import py1.C47687v0;
import qo3.C77390c0;
import sw1.C48478n;
import sw1.C48484q;
import ug3.C90661f;
import v10.C52735e;

/* renamed from: uy1.c */
public class C52642c {

    /* renamed from: a */
    public static volatile MMHandler f146980a;

    /* renamed from: b */
    public static final Object f146981b = new Object();

    /* renamed from: c */
    public static DisplayMetrics f146982c;

    static {
        new Rect();
        C41872f.m45392b(C41872f.C41873a.ONE_MONTH);
    }

    /* renamed from: A */
    public static void m58980A(Intent intent, Context context) {
        NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent = new NotifyGameWebviewOperationEvent();
        NotifyGameWebviewOperationEvent.C1100a aVar = notifyGameWebviewOperationEvent.f9355d;
        aVar.f9356a = 2;
        aVar.f9357b = context;
        aVar.f9358c = intent;
        notifyGameWebviewOperationEvent.publish();
    }

    /* renamed from: B */
    public static LinkedList<String> m58981B(String str) {
        String[] split = str.substring(1, str.length() - 1).split(",");
        LinkedList<String> linkedList = new LinkedList<>();
        for (String trim : split) {
            linkedList.add(trim.trim());
        }
        return linkedList;
    }

    /* renamed from: C */
    public static boolean m58982C(View view, Context context) {
        if (view.getTag() == null || !(view.getTag() instanceof String)) {
            Log.m105920e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
            return false;
        }
        String str = (String) view.getTag();
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("show_bottom", false);
        m59008z(intent, context);
        return true;
    }

    /* renamed from: a */
    public static String m58983a(String str, Map<String, String> map) {
        if (Util.isNullOrNil(str) || map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String next : map.keySet()) {
            buildUpon.appendQueryParameter(next, map.get(next));
        }
        return buildUpon.build().toString();
    }

    /* renamed from: b */
    public static LinkedList<String> m58984b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            String trim = jSONArray.optString(i).trim();
            if (!Util.isNullOrNil(trim)) {
                linkedList.add(trim);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    public static boolean m58985c(Context context, String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("weapp");
        if (!Util.isNullOrNil(queryParameter)) {
            try {
                Uri parse = Uri.parse(queryParameter);
                String authority = parse.getAuthority();
                if (Util.isNullOrNil(authority)) {
                    Log.m105928w("MicroMsg.GameCenterUtil", "targetAppId is null");
                    return false;
                }
                String queryParameter2 = parse.getQueryParameter("env_version");
                String queryParameter3 = parse.getQueryParameter("path");
                String nullAsNil = Util.nullAsNil(queryParameter2);
                char c = 65535;
                int hashCode = nullAsNil.hashCode();
                if (hashCode != 110628630) {
                    if (hashCode == 1559690845) {
                        if (nullAsNil.equals("develop")) {
                            c = 0;
                        }
                    }
                } else if (nullAsNil.equals("trial")) {
                    c = 1;
                }
                int i = c != 0 ? c != 1 ? 0 : 2 : 1;
                Log.m105925i("MicroMsg.GameCenterUtil", "jumpWeApp, appId: %s, versionType: %d, path: %s", authority, Integer.valueOf(i), queryParameter3);
                AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                appBrandStatObject.f245533f = 1079;
                ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(context, (String) null, authority, i, 0, queryParameter3, appBrandStatObject);
                return true;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.GameCenterUtil", "checkJumpWeApp: " + e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: d */
    public static Dialog m58986d(Context context) {
        View inflate = View.inflate(context, C0966R.C0971layout.axk, (ViewGroup) null);
        C77390c0 c0Var = new C77390c0(context, C0966R.style.f8488ke);
        c0Var.setContentView(inflate);
        c0Var.setCancelable(true);
        c0Var.setCanceledOnTouchOutside(false);
        c0Var.setOnCancelListener(new c$$b(c0Var));
        return c0Var;
    }

    /* renamed from: e */
    public static String m58987e(LinkedList<String> linkedList) {
        Iterator<String> it = linkedList.iterator();
        if (!it.hasNext()) {
            return "()";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        while (true) {
            String trim = it.next().trim();
            sb.append(FastJsonResponse.QUOTE + trim + FastJsonResponse.QUOTE);
            if (!it.hasNext()) {
                sb.append(')');
                return sb.toString();
            }
            sb.append(',');
        }
    }

    /* renamed from: f */
    public static void m58988f(LinkedList<String> linkedList) {
        if (!Util.isNullOrNil((List) linkedList)) {
            LinkedList linkedList2 = new LinkedList();
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(next);
                if (appInfo != null && Util.isNullOrNil(appInfo.field_openId)) {
                    linkedList2.add(next);
                }
            }
            if (!Util.isNullOrNil((List) linkedList2)) {
                ((C44550e0) ((C53543s) C86312j.m106911c(C53543s.class)).mo74025px()).mo69341b(linkedList2);
            }
        }
    }

    /* renamed from: g */
    public static String m58989g() {
        C47563d1 d1Var;
        C47563d1 d1Var2;
        String C50 = ((C52735e) C86312j.m106911c(C52735e.class)).C50(C32735h.C32737c.clicfg_game_center_home_url_android, "");
        if (C50 == null || Util.isNullOrNil(C50.trim())) {
            C41853c.m45371e();
            GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = C41853c.f112797a;
            if (getGameCenterGlobalSettingResponse != null && (d1Var2 = getGameCenterGlobalSettingResponse.GameIndexSetting) != null && d1Var2.f127635f == 1) {
                return d1Var2.f127636g;
            }
            C41853c.m45381o();
            GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse2 = C41853c.f112797a;
            if (getGameCenterGlobalSettingResponse2 == null || (d1Var = getGameCenterGlobalSettingResponse2.GameIndexSetting) == null || d1Var.f127635f != 1) {
                return null;
            }
            return d1Var.f127636g;
        } else if (C50.equals("native")) {
            C115669n.INSTANCE.idkeyStat(848, 11, 1, false);
            return null;
        } else {
            C115669n.INSTANCE.idkeyStat(848, 10, 1, false);
            return C50;
        }
    }

    /* renamed from: h */
    public static int m58990h(Context context) {
        if (context == null) {
            return 0;
        }
        if (f146982c == null) {
            f146982c = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(f146982c);
        }
        return f146982c.widthPixels;
    }

    /* renamed from: i */
    public static int m58991i(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.GameCenterUtil", "Null or Nil path");
            return 0;
        }
        PackageInfo packageArchiveInfo = MMApplicationContext.getContext().getPackageManager().getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo == null) {
            return 0;
        }
        return packageArchiveInfo.versionCode;
    }

    /* renamed from: j */
    public static int m58992j(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.GameCenterUtil", "Null or Nil packageName");
            return 0;
        }
        PackageInfo packageInfo = null;
        try {
            packageInfo = MMApplicationContext.getContext().getPackageManager().getPackageInfo(str, 0);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.GameCenterUtil", "Exception: %s", e.toString());
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    /* renamed from: k */
    public static String m58993k(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.GameCenterUtil", "Null or Nil packageName");
            return "";
        }
        PackageInfo packageInfo = null;
        try {
            packageInfo = MMApplicationContext.getContext().getPackageManager().getPackageInfo(str, 0);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.GameCenterUtil", "Exception: %s", e.toString());
        }
        return packageInfo == null ? "" : packageInfo.versionName;
    }

    /* renamed from: l */
    public static MMHandler m58994l() {
        if (f146980a == null) {
            synchronized (f146981b) {
                if (f146980a == null) {
                    f146980a = new MMHandler("SubCoreGameCenter#WorkThread");
                    C88824h.m110908b("SubCoreGameCenter#WorkThread", new C90661f("SubCoreGameCenter#WorkThread"));
                }
            }
        }
        return f146980a;
    }

    /* renamed from: m */
    public static boolean m58995m(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NotDisturb_");
        sb.append(MD5Util.getMD5String(str));
        return ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57116Rz(sb.toString()) != null;
    }

    /* renamed from: n */
    public static int m58996n(Context context, String str, String str2, Bundle bundle, int i) {
        if (!Util.isNullOrNil(str) && bundle == null) {
            bundle = new Bundle();
        }
        if (!Util.isNullOrNil(str2)) {
            return m59002t(context, str2, "game_center_detail");
        }
        C47687v0 f = C41853c.m45372f();
        int i2 = f != null ? f.f128069d : 0;
        if (i2 == 2) {
            return m58997o(context, str, i);
        }
        if (i2 == 1) {
            m58998p(context, bundle);
            return 6;
        }
        String simCountryCode = Util.getSimCountryCode(context);
        if (Util.isNullOrNil(simCountryCode) || simCountryCode.toLowerCase().equals("cn")) {
            return m58997o(context, str, i);
        }
        m58998p(context, bundle);
        return 6;
    }

    /* renamed from: o */
    public static int m58997o(Context context, String str, int i) {
        String str2;
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        C47687v0 f = C41853c.m45372f();
        String str3 = f != null ? f.f128070e : "";
        if (!Util.isNullOrNil(str3)) {
            HashMap hashMap = new HashMap();
            hashMap.put("appid", str);
            if (i > 0) {
                hashMap.put(TPDownloadProxyEnum.USER_SSID, String.valueOf(i));
            }
            str2 = m58983a(str3, hashMap);
        } else {
            str2 = WeChatHosts.domainString(C0966R.string.flk) + "/cgi-bin/h5/static/gamecenter/detail.html?appid=" + str;
        }
        return m59002t(context, str2, "game_center_detail");
    }

    /* renamed from: p */
    public static void m58998p(Context context, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.game.ui.GameDetailUI2");
        intent.putExtras(bundle);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/game/utils/GameCenterUtil", "jumpGameDetailNative", "(Landroid/content/Context;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/game/utils/GameCenterUtil", "jumpGameDetailNative", "(Landroid/content/Context;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: q */
    public static void m58999q(Context context, C42119w wVar, String str) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", wVar.f113442C1.f113503a);
        intent.putExtra("finishviewifloadfailed", true);
        intent.putExtra("show_full_screen", wVar.f113442C1.f113504b);
        intent.putExtra("disable_progress_bar", wVar.f113442C1.f113504b);
        int i = wVar.f113442C1.f113505c;
        intent.putExtra("screen_orientation", i != 1 ? i != 2 ? i != 3 ? i != 4 ? -1 : 1002 : 1001 : 1 : 0);
        intent.putExtra("geta8key_scene", 32);
        intent.putExtra("KPublisherId", str);
        intent.putExtra("open_game_float", true);
        NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent = new NotifyGameWebviewOperationEvent();
        NotifyGameWebviewOperationEvent.C1100a aVar = notifyGameWebviewOperationEvent.f9355d;
        aVar.f9356a = 1;
        aVar.f9357b = context;
        aVar.f9358c = intent;
        notifyGameWebviewOperationEvent.publish();
    }

    /* renamed from: r */
    public static void m59000r(Context context, C42119w.C42131l lVar) {
        C42119w.C42131l lVar2 = lVar;
        Class cls = C14088e.class;
        String str = lVar2.f113536e;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.GameCenterUtil", "gamelog.util, jumpToPage, url is empty");
            return;
        }
        try {
            String decode = URLDecoder.decode(str, "utf-8");
            Uri parse = Uri.parse(decode);
            Log.m105925i("MicroMsg.GameCenterUtil", "gamelog.util, open url %s", decode);
            String[] split = decode.split("\\?", 2);
            Bundle bundle = new Bundle();
            HashMap hashMap = new HashMap();
            if (split.length > 1) {
                for (String split2 : split[1].replace("#wechat_redirect", "").split("&")) {
                    String[] split3 = split2.split("=", 2);
                    if (split3.length > 1) {
                        hashMap.put(split3[0], split3[1]);
                    }
                }
                String queryParameter = parse.getQueryParameter("liteapp");
                if (Util.isNullOrNil(queryParameter)) {
                    Log.m105924i("MicroMsg.GameCenterUtil", "gamelog.util, jumpToPage, liteapp params are empty");
                } else {
                    Uri parse2 = Uri.parse(queryParameter);
                    String queryParameter2 = parse2.getQueryParameter("path");
                    if (!"liteapp".equals(parse2.getScheme())) {
                        Log.m105920e("MicroMsg.GameCenterUtil", "gamelog.util, jumpToPage, liteapp params error");
                    } else if (Util.isNullOrNil(queryParameter2)) {
                        Log.m105920e("MicroMsg.GameCenterUtil", "gamelog.util, jumpToPage, liteapp params are incomplete");
                    } else {
                        String[] split4 = queryParameter.split("\\?");
                        String gVar = new C104289g((Map) hashMap).toString();
                        String replace = split4[0].replace("liteapp://", "");
                        bundle.putString("appId", replace);
                        bundle.putString("path", queryParameter2);
                        bundle.putString(SearchIntents.EXTRA_QUERY, gVar);
                        if (((C14088e) C86312j.m106911c(cls)).mo13509NR(replace) == null) {
                            ((C14088e) C86312j.m106911c(cls)).u50(replace, new c$$e());
                            Log.m105920e("MicroMsg.GameCenterUtil", "gamelog.util, jumpToPage, liteapp miss configuration");
                        } else {
                            HalfScreen halfScreen = lVar2.half_screen;
                            if (halfScreen != null && halfScreen.type == 2) {
                                bundle.putBoolean("isHalfScreen", true);
                                bundle.putBoolean("transparent", true);
                                bundle.putDouble("heightPercent", (double) lVar2.half_screen.screen_height_percent);
                            }
                            m59004v(context, lVar2, 0, (String) null, bundle);
                            return;
                        }
                    }
                }
            }
            Context context2 = context;
            ((C48478n) C86312j.m106911c(C48478n.class)).mo65690pN(lVar2.jump_url, new c$$a(context, lVar, 0, (String) null, bundle));
        } catch (UnsupportedEncodingException e) {
            Log.printErrStackTrace("MicroMsg.GameCenterUtil", e, "gamelog.util, jumpToPage, UnsupportedEncodingException", new Object[0]);
        }
    }

    /* renamed from: s */
    public static int m59001s(Context context, String str) {
        return m59002t(context, str, (String) null);
    }

    /* renamed from: t */
    public static int m59002t(Context context, String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        if (m58985c(context, str)) {
            return 30;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("show_bottom", false);
        intent.putExtra("geta8key_scene", 32);
        intent.putExtra("KPublisherId", str2);
        m59008z(intent, context);
        return 7;
    }

    /* renamed from: u */
    public static int m59003u(Context context, JumpInfo jumpInfo, int i, String str) {
        JumpInfo jumpInfo2 = jumpInfo;
        HalfScreen halfScreen = jumpInfo2.half_screen;
        if (halfScreen != null) {
            int i2 = halfScreen.type;
            if (i2 == 1) {
                C41874g.m45397a(context, jumpInfo2.jump_url, i, true, halfScreen.screen_height_dp, -1.0f, str);
                return 2;
            } else if (i2 == 2) {
                C41874g.m45397a(context, jumpInfo2.jump_url, i, true, 0, halfScreen.screen_height_percent, str);
                return 2;
            }
        }
        return m59002t(context, jumpInfo2.jump_url, (String) null);
    }

    /* renamed from: v */
    public static void m59004v(Context context, JumpInfo jumpInfo, int i, String str, Bundle bundle) {
        Class cls = C14088e.class;
        if (((C14088e) C86312j.m106911c(cls)).mo13530uu(bundle.getString("appId"))) {
            ((C14088e) C86312j.m106911c(cls)).mo13510OP(context, bundle, true, false, new c$$f(context, jumpInfo, i, str));
            return;
        }
        Log.m105920e("MicroMsg.GameCenterUtil", "gamelog.chatroom, jumpToPage, openLiteApp  is forbidden");
        m59003u(context, jumpInfo, i, str);
    }

    /* renamed from: w */
    public static int m59005w(String str) {
        if (!Util.isNullOrNil(str)) {
            try {
                return Color.parseColor(str);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.GameCenterUtil", "parseColor: " + e.getMessage());
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        return;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m59006x(java.lang.String r11, float r12) {
        /*
            java.lang.Class<uy1.c> r0 = uy1.C52642c.class
            monitor-enter(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)
            return
        L_0x000b:
            java.lang.String r1 = "MicroMsg.GameCenterUtil"
            java.lang.String r2 = "pre download entrance image : %s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0069 }
            r5 = 0
            r4[r5] = r11     // Catch:{ all -> 0x0069 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r4)     // Catch:{ all -> 0x0069 }
            com.tencent.mm.autogen.events.GameMsgDownloadImgEvent r1 = new com.tencent.mm.autogen.events.GameMsgDownloadImgEvent     // Catch:{ all -> 0x0069 }
            r1.<init>()     // Catch:{ all -> 0x0069 }
            com.tencent.mm.autogen.events.GameMsgDownloadImgEvent$a r2 = r1.f107555d     // Catch:{ all -> 0x0069 }
            r2.f107557a = r3     // Catch:{ all -> 0x0069 }
            r2.f107558b = r11     // Catch:{ all -> 0x0069 }
            r1.publish()     // Catch:{ all -> 0x0069 }
            com.tencent.mm.autogen.events.GameMsgDownloadImgEvent$b r2 = r1.f107556e     // Catch:{ all -> 0x0069 }
            boolean r2 = r2.f107560b     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x0067
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r2.<init>()     // Catch:{ all -> 0x0069 }
            com.tencent.mm.autogen.events.GameMsgDownloadImgEvent$b r4 = r1.f107556e     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = r4.f107559a     // Catch:{ all -> 0x0069 }
            r2.append(r4)     // Catch:{ all -> 0x0069 }
            byte[] r4 = r11.getBytes()     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = p823sg.C90193h.m112878f(r4)     // Catch:{ all -> 0x0069 }
            r2.append(r4)     // Catch:{ all -> 0x0069 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0069 }
            hc0.c$b r4 = new hc0.c$b     // Catch:{ all -> 0x0069 }
            r4.<init>()     // Catch:{ all -> 0x0069 }
            r4.f59346b = r3     // Catch:{ all -> 0x0069 }
            r4.f59350f = r2     // Catch:{ all -> 0x0069 }
            hc0.c r8 = r4.mo32666a()     // Catch:{ all -> 0x0069 }
            gc0.a r5 = gc0.C20828a.m22825b()     // Catch:{ all -> 0x0069 }
            r7 = 0
            uy1.c$$c r9 = new uy1.c$$c     // Catch:{ all -> 0x0069 }
            r9.<init>(r1)     // Catch:{ all -> 0x0069 }
            uy1.c$$d r10 = new uy1.c$$d     // Catch:{ all -> 0x0069 }
            r10.<init>(r12, r1)     // Catch:{ all -> 0x0069 }
            r6 = r11
            r5.mo32522k(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0069 }
        L_0x0067:
            monitor-exit(r0)
            return
        L_0x0069:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uy1.C52642c.m59006x(java.lang.String, float):void");
    }

    /* renamed from: y */
    public static void m59007y(String str, boolean z) {
        Class cls = C48484q.class;
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.GameCenterUtil", "setNotDisturbMsg, msgRelatedId:%s, flag:%b", str, Boolean.valueOf(z));
            String str2 = "NotDisturb_" + MD5Util.getMD5String(str);
            if (z) {
                ((C48484q) C86312j.m106911c(cls)).mo66106SL().mo57117Yt(str2, "1".getBytes());
            } else {
                ((C48484q) C86312j.m106911c(cls)).mo66106SL().mo57115Lo(str2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r0.getHost().equals(com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(com.tencent.p014mm.C0966R.string.flk)) != false) goto L_0x003c;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m59008z(android.content.Intent r4, android.content.Context r5) {
        /*
            java.lang.String r0 = "rawUrl"
            java.lang.String r0 = r4.getStringExtra(r0)
            java.lang.Class<v10.e> r1 = v10.C52735e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            v10.e r1 = (v10.C52735e) r1
            h81.h$c r2 = h81.C32735h.C32737c.game_luggage
            r3 = 1
            boolean r1 = r1.mo61269fe(r2, r3)
            r2 = 0
            if (r1 != 0) goto L_0x001a
        L_0x0018:
            r3 = 0
            goto L_0x003c
        L_0x001a:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x0021
            goto L_0x0018
        L_0x0021:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getHost()
            if (r1 == 0) goto L_0x0018
            java.lang.String r0 = r0.getHost()
            r1 = 2131831302(0x7f112a06, float:1.9295626E38)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0018
        L_0x003c:
            if (r3 == 0) goto L_0x0042
            m58980A(r4, r5)
            goto L_0x0052
        L_0x0042:
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent r0 = new com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent
            r0.<init>()
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent$a r1 = r0.f9355d
            r1.f9356a = r2
            r1.f9357b = r5
            r1.f9358c = r4
            r0.publish()
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uy1.C52642c.m59008z(android.content.Intent, android.content.Context):void");
    }
}
