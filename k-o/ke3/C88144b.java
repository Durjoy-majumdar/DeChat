package ke3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82613z;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.service.C116024c;
import com.tencent.p014mm.service.ProcessService$DexOptProcessService;
import com.tencent.p014mm.service.ProcessService$ExDeviceProcessService;
import com.tencent.p014mm.service.ProcessService$LiteProcessService;
import com.tencent.p014mm.service.ProcessService$MMProcessService;
import com.tencent.p014mm.service.ProcessService$PushProcessServicer;
import com.tencent.p014mm.service.ProcessService$SandBoxProcessService;
import com.tencent.p014mm.service.ProcessService$SupportProcessService;
import com.tencent.p014mm.service.ProcessService$ToolsProcessService;
import com.tencent.xweb.IXWebPreferences;
import com.tencent.xweb.XWebSdk;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import h81.C32735h;
import j20.C117292a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C88990b;
import org.xwalk.core.XWalkEnvironment;
import p206nj.C11171e;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;
import vn3.C118694m;

/* renamed from: ke3.b */
public class C88144b {

    /* renamed from: a */
    public static List<C9613e> f254911a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public static List<C9614f> f254912b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public static String[][] f254913c = {null};

    /* renamed from: d */
    public static final HashSet<String> f254914d = new C9612b();

    /* renamed from: ke3.b$a */
    public class C9611a implements C9613e {
        /* renamed from: d */
        public boolean mo2009d(Context context, String str, Intent intent) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C9615g.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                if (((C9615g) ((C38174i) bVar.next()).get()).mo2009d(context, str, intent)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: ke3.b$b */
    public class C9612b extends HashSet<String> {
        public C9612b() {
            add(".ui.transmit.SelectConversationUI");
        }
    }

    /* renamed from: ke3.b$e */
    public interface C9613e {
        /* renamed from: d */
        boolean mo2009d(Context context, String str, Intent intent);
    }

    /* renamed from: ke3.b$f */
    public interface C9614f {
        /* renamed from: a */
        boolean mo1258a(Context context, Activity activity, Intent intent, int i, Bundle bundle);
    }

    /* renamed from: ke3.b$g */
    public interface C9615g extends C9613e, C15510f {
    }

    /* renamed from: ke3.b$c */
    public interface C76564c {
        void onActivityResult(int i, int i2, Intent intent);
    }

    /* renamed from: ke3.b$d */
    public interface C88145d {
        /* renamed from: a */
        void mo102813a(Intent intent, int i, C76564c cVar);

        Context getContext();
    }

    static {
        f254911a.add(new C9611a());
    }

    /* renamed from: A */
    public static void m109779A(Context context, String str, String str2, Intent intent) {
        Iterator it = ((CopyOnWriteArrayList) f254911a).iterator();
        while (it.hasNext()) {
            if (((C9613e) it.next()).mo2009d(context, str + str2, intent)) {
                return;
            }
        }
        if (intent == null) {
            intent = new Intent();
        }
        String str3 = MMApplicationContext.getSourcePackageName() + ".plugin." + str;
        if (str2.startsWith(".")) {
            str2 = str3 + str2;
        }
        intent.setClassName(MMApplicationContext.getPackageName(), str2);
        MMWizardActivity.m7017L7(context, intent);
    }

    /* renamed from: B */
    public static void m109780B(Context context, String str, String str2, Intent intent, Intent intent2) {
        Iterator it = ((CopyOnWriteArrayList) f254911a).iterator();
        while (it.hasNext()) {
            if (((C9613e) it.next()).mo2009d(context, str + str2, intent)) {
                return;
            }
        }
        if (intent == null) {
            intent = new Intent();
        }
        String str3 = MMApplicationContext.getSourcePackageName() + ".plugin." + str;
        if (str2.startsWith(".")) {
            str2 = str3 + str2;
        }
        intent.setClassName(MMApplicationContext.getPackageName(), str2);
        MMWizardActivity.m7018M7(context, intent, intent2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r8.endsWith("." + r5) != false) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[LOOP:0: B:15:0x0041->B:28:0x0075, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074 A[SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m109781C(android.net.Uri r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0078
            java.lang.String r8 = r8.getHost()
            java.lang.String[][] r1 = f254913c
            r2 = r1[r0]
            r3 = 1
            if (r2 != 0) goto L_0x003b
            monitor-enter(r1)
            java.lang.String[][] r2 = f254913c     // Catch:{ all -> 0x0038 }
            r4 = r2[r0]     // Catch:{ all -> 0x0038 }
            if (r4 != 0) goto L_0x0036
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0038 }
            r5 = 2131831344(0x7f112a30, float:1.929571E38)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r5)     // Catch:{ all -> 0x0038 }
            r4[r0] = r5     // Catch:{ all -> 0x0038 }
            r5 = 2131831348(0x7f112a34, float:1.929572E38)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r5)     // Catch:{ all -> 0x0038 }
            r4[r3] = r5     // Catch:{ all -> 0x0038 }
            r5 = 2
            r6 = 2131831342(0x7f112a2e, float:1.9295707E38)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r6)     // Catch:{ all -> 0x0038 }
            r4[r5] = r6     // Catch:{ all -> 0x0038 }
            r2[r0] = r4     // Catch:{ all -> 0x0038 }
        L_0x0036:
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            goto L_0x003b
        L_0x0038:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            throw r8
        L_0x003b:
            java.lang.String[][] r1 = f254913c
            r1 = r1[r0]
            int r2 = r1.length
            r4 = 0
        L_0x0041:
            if (r4 >= r2) goto L_0x0078
            r5 = r1[r4]
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r6 != 0) goto L_0x0071
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x0052
            goto L_0x0071
        L_0x0052:
            boolean r6 = r8.equals(r5)
            if (r6 != 0) goto L_0x006f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "."
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            boolean r5 = r8.endsWith(r5)
            if (r5 == 0) goto L_0x0071
        L_0x006f:
            r5 = 1
            goto L_0x0072
        L_0x0071:
            r5 = 0
        L_0x0072:
            if (r5 == 0) goto L_0x0075
            return r3
        L_0x0075:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ke3.C88144b.m109781C(android.net.Uri):boolean");
    }

    /* renamed from: a */
    public static void m109782a(Context context, String str, Intent intent) {
        if (intent != null) {
            if (f254914d.contains(str)) {
                intent.putExtra("animation_pop_in", true);
            }
            C88990b.m111192a(context, intent);
        }
    }

    /* renamed from: b */
    public static String m109783b(Intent intent, Uri uri, String str) {
        String queryParameter = uri.getQueryParameter("not_in_game_luggage");
        int intExtra = intent.getIntExtra("KHalfScreenHeight", 0);
        float floatExtra = intent.getFloatExtra("KHalfScreenHeightPercent", 0.0f);
        if (Util.nullAsNil(queryParameter).equals("1") || !((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.game_luggage, true)) {
            return ".ui.tools.game.GameWebViewUI";
        }
        return (intExtra > 0 || floatExtra > 0.0f) ? C44594n1.m49045a() ? "com.tencent.mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI" : "com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI" : C44594n1.m49045a() ? "com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI" : "com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI";
    }

    /* renamed from: c */
    public static boolean m109784c(Uri uri) {
        return uri != null && uri.getHost() != null && uri.getHost().equals(WeChatHosts.domainString(C0966R.string.flk)) && !Util.nullAsNil(uri.getQueryParameter("not_in_game_luggage")).equals("1") && ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.game_luggage, true);
    }

    /* renamed from: d */
    public static String m109785d(Context context, Intent intent, String str) {
        boolean z;
        Intent intent2 = intent;
        String str2 = str;
        boolean z2 = true;
        if (!Util.isNullOrNil(str) && (".ui.tools.WebViewUI".equals(str2) || "com.tencent.mm.plugin.webview.ui.tools.WebViewUI".equals(str2))) {
            int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcBizEnable(), C40318k.m43492a().getHcBizDelay(), C40318k.m43492a().getHcBizCPU(), C40318k.m43492a().getHcBizIO(), C40318k.m43492a().getHcBizThr() ? Process.myTid() : 0, C40318k.m43492a().getHcBizTimeout(), C82613z.CTRL_INDEX, C40318k.m43492a().getHcBizAction(), "MicroMsg.PluginHelper");
            try {
                String stringExtra = intent2.getStringExtra("rawUrl");
                Log.m105925i("MicroMsg.PluginHelper", "summer hardcoder biz startPerformance [%s][%s], url: %s", Integer.valueOf(C82613z.CTRL_INDEX), Integer.valueOf(startPerformance), stringExtra);
                if (Util.isNullOrNil(stringExtra)) {
                    return str2;
                }
                Uri parse = Uri.parse(stringExtra);
                if (intent2.getLongExtra("start_activity_time", 0) == 0) {
                    intent2.putExtra("start_activity_time", System.currentTimeMillis());
                }
                if (intent2.getLongExtra("startTime", 0) == 0) {
                    intent2.putExtra("startTime", System.currentTimeMillis());
                }
                if (parse.getHost() == null || !parse.getHost().equals("mp.weixin.qq.com") || WeChatBrands.Business.Entries.SessionOa.checkAvailable(context)) {
                    if (parse.getHost() == null || !parse.getHost().equals(WeChatHosts.domainString(C0966R.string.flk))) {
                        str2 = ".ui.tools.WebViewUI";
                        z = false;
                    } else {
                        str2 = m109783b(intent2, parse, str2);
                        z = true;
                    }
                    String str3 = ".ui.tools.MMWebViewUI";
                    if (!z) {
                        if (C44594n1.m49046b()) {
                            if (!m109781C(parse)) {
                                if (XWebSdk.needSwitchToTools(stringExtra)) {
                                    str3 = ".ui.tools.WebViewUI";
                                }
                            }
                            String uuid = UUID.randomUUID().toString();
                            intent2.putExtra("key_jsapi_pay_uuid", uuid);
                            Log.m105925i("MicroMsg.PluginHelper", "open WebViewUI set uuid:%s ret:%s", uuid, Boolean.valueOf(MultiProcessMMKV.getSingleDefault().encode("key_jsapi_pay_uuid", uuid)));
                            return str3;
                        }
                    }
                    str3 = str2;
                    try {
                        String uuid2 = UUID.randomUUID().toString();
                        intent2.putExtra("key_jsapi_pay_uuid", uuid2);
                        Log.m105925i("MicroMsg.PluginHelper", "open WebViewUI set uuid:%s ret:%s", uuid2, Boolean.valueOf(MultiProcessMMKV.getSingleDefault().encode("key_jsapi_pay_uuid", uuid2)));
                        return str3;
                    } catch (Exception e) {
                        e = e;
                        str2 = str3;
                        Log.m105920e("MicroMsg.PluginHelper", "parse url failed :" + e.getMessage());
                        return str2;
                    }
                } else {
                    Log.m105925i("MicroMsg.PluginHelper", "Block mp url %s", stringExtra);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                Log.m105920e("MicroMsg.PluginHelper", "parse url failed :" + e.getMessage());
                return str2;
            }
        } else if (!C44594n1.m49046b()) {
            return str2;
        } else {
            if (Util.isNullOrNil(str) || !str2.endsWith(".ui.TmplWebViewToolUI")) {
                z2 = false;
            }
            return z2 ? ".ui.timeline.preload.ui.TmplWebViewMMUI" : str2;
        }
    }

    /* renamed from: e */
    public static Intent m109786e(String str) {
        Class cls;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1854767153:
                if (str.equals("support")) {
                    c = 0;
                    break;
                }
                break;
            case -1335091396:
                if (str.equals("dexopt")) {
                    c = 1;
                    break;
                }
                break;
            case 3488:
                if (str.equals(XWalkEnvironment.MODULE_MM)) {
                    c = 2;
                    break;
                }
                break;
            case 3322030:
                if (str.equals("lite")) {
                    c = 3;
                    break;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = 4;
                    break;
                }
                break;
            case 110545371:
                if (str.equals(XWalkEnvironment.MODULE_TOOLS)) {
                    c = 5;
                    break;
                }
                break;
            case 1865400007:
                if (str.equals(IXWebPreferences.XWEB_RENDERER_SANDBOX)) {
                    c = 6;
                    break;
                }
                break;
            case 2016254153:
                if (str.equals("exdevice")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                cls = ProcessService$SupportProcessService.class;
                break;
            case 1:
                cls = ProcessService$DexOptProcessService.class;
                break;
            case 2:
                cls = ProcessService$MMProcessService.class;
                break;
            case 3:
                cls = ProcessService$LiteProcessService.class;
                break;
            case 4:
                cls = ProcessService$PushProcessServicer.class;
                break;
            case 5:
                cls = ProcessService$ToolsProcessService.class;
                break;
            case 6:
                cls = ProcessService$SandBoxProcessService.class;
                break;
            case 7:
                cls = ProcessService$ExDeviceProcessService.class;
                break;
            default:
                cls = null;
                break;
        }
        return new Intent(MMApplicationContext.getContext(), cls);
    }

    /* renamed from: f */
    public static boolean m109787f() {
        if ((!MMApplicationContext.isMainProcess() || !C86709a0.m107522a()) && C86718e.m107549h() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static void m109789g(Context context, String str, String str2) {
        m109792j(context, str, str2, (Intent) null, true);
    }

    /* renamed from: h */
    public static void m109790h(Context context, String str, String str2, Intent intent) {
        m109791i(context, str, str2, intent, (Bundle) null);
    }

    /* renamed from: i */
    public static void m109791i(Context context, String str, String str2, Intent intent, Bundle bundle) {
        if (!C11171e.m11044a(21)) {
            try {
                if (context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("settings_multi_webview", false) && ".ui.tools.WebViewUI".endsWith(str2)) {
                    Log.m105924i("MicroMsg.PluginHelper", "start multi webview!!!!!!!!!");
                    intent.addFlags(134217728);
                    intent.addFlags(524288);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.PluginHelper", "%s", e.getMessage());
            }
        }
        m109793k(context, str, str2, intent, true, bundle);
    }

    /* renamed from: j */
    public static void m109792j(Context context, String str, String str2, Intent intent, boolean z) {
        m109793k(context, str, str2, intent, true, (Bundle) null);
    }

    /* renamed from: k */
    public static void m109793k(Context context, String str, String str2, Intent intent, boolean z, Bundle bundle) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        Intent intent2 = intent;
        Bundle bundle2 = bundle;
        Log.m105919d("MicroMsg.PluginHelper", "start activity, need try load plugin[%B]", Boolean.valueOf(z));
        if (context2 == null) {
            Log.m105920e("MicroMsg.PluginHelper", "start activity error, context is null");
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) f254911a).iterator();
        while (it.hasNext()) {
            if (((C9613e) it.next()).mo2009d(context, str + str2, intent2)) {
                return;
            }
        }
        if (intent2 != null && !Util.isNullOrNil(intent2.getStringExtra("rawUrl"))) {
            intent2.putExtra("startTime", System.currentTimeMillis());
        }
        String d = m109785d(context, intent2, str2);
        if (d != null) {
            Log.m105919d("MicroMsg.PluginHelper", "[DEBUG] onDone Load %s:%s", str3, d);
            if (intent2 == null) {
                try {
                    intent2 = new Intent();
                } catch (ClassNotFoundException e) {
                    Log.m105921e("MicroMsg.PluginHelper", "Class Not Found when startActivity %s", e);
                    return;
                }
            }
            String str5 = MMApplicationContext.getSourcePackageName() + ".plugin." + str;
            if (d.startsWith(".")) {
                d = str5 + d;
            }
            intent2.setClassName(MMApplicationContext.getPackageName(), d);
            Class.forName(d, false, context.getClassLoader());
            if (context2 instanceof Activity) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(bundle2);
                aVar.mo10233c(intent2);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginstub/PluginHelper", "startActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ZLandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                context.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
                C117292a.m165359e(context, "com/tencent/mm/pluginstub/PluginHelper", "startActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ZLandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                return;
            }
            intent2.addFlags(268435456);
            if (MMFragmentActivity.isVASActivity(intent2)) {
                try {
                    C118694m.m167386d(context, intent2, bundle2);
                } catch (Throwable unused) {
                }
            } else {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(bundle2);
                aVar2.mo10233c(intent2);
                C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/pluginstub/PluginHelper", "startActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ZLandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                context.startActivity((Intent) aVar2.mo10231a(0), (Bundle) aVar2.mo10231a(1));
                C117292a.m165359e(context, "com/tencent/mm/pluginstub/PluginHelper", "startActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ZLandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            }
        }
    }

    /* renamed from: l */
    public static void m109794l(Context context, String str, String str2, int i) {
        m109796n(context, str, str2, (Intent) null, i, true);
    }

    /* renamed from: m */
    public static void m109795m(Context context, String str, String str2, Intent intent, int i) {
        m109796n(context, str, str2, intent, i, true);
    }

    /* renamed from: n */
    public static void m109796n(Context context, String str, String str2, Intent intent, int i, boolean z) {
        String str3;
        Log.m105919d("MicroMsg.PluginHelper", "start activity for result, need try load plugin[%B]", Boolean.valueOf(z));
        if (context == null) {
            Log.m105920e("MicroMsg.PluginHelper", "start activity error, context is null");
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) f254911a).iterator();
        while (it.hasNext()) {
            if (((C9613e) it.next()).mo2009d(context, str + str2, intent)) {
                return;
            }
        }
        String d = m109785d(context, intent, str2);
        if (d != null) {
            if (intent == null) {
                intent = new Intent();
            }
            String str4 = MMApplicationContext.getSourcePackageName() + ".plugin." + str;
            if (d.startsWith(".")) {
                str3 = str4 + d;
            } else {
                str3 = d;
            }
            intent.setClassName(MMApplicationContext.getPackageName(), str3);
            if (context instanceof Activity) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                aVar.mo10233c(intent);
                C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/pluginstub/PluginHelper", "startActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;IZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                m109782a(context, d, intent);
                return;
            }
            Log.m105922f("MicroMsg.PluginHelper", "context not activity, skipped");
        }
    }

    /* renamed from: o */
    public static void m109797o(Fragment fragment, String str, String str2, Intent intent, int i) {
        String str3;
        Log.m105919d("MicroMsg.PluginHelper", "start activity for result, need try load plugin[%B]", Boolean.TRUE);
        Iterator it = ((CopyOnWriteArrayList) f254911a).iterator();
        while (it.hasNext()) {
            if (((C9613e) it.next()).mo2009d(fragment.getContext(), str + str2, intent)) {
                return;
            }
        }
        Intent intent2 = intent == null ? new Intent() : intent;
        String str4 = MMApplicationContext.getSourcePackageName() + ".plugin." + str;
        if (str2.startsWith(".")) {
            str3 = str4 + str2;
        } else {
            str3 = str2;
        }
        intent2.setClassName(MMApplicationContext.getPackageName(), str3);
        fragment.startActivityForResult(intent2, i);
        m109782a(fragment.getActivity(), str2, intent);
    }

    /* renamed from: p */
    public static void m109798p(C88145d dVar, String str, String str2, Intent intent, int i, C76564c cVar) {
        m109799q(dVar, str, str2, intent, i, true, cVar);
    }

    /* renamed from: q */
    public static void m109799q(C88145d dVar, String str, String str2, Intent intent, int i, boolean z, C76564c cVar) {
        String str3;
        Log.m105919d("MicroMsg.PluginHelper", "start activity for result, need try load plugin[%B]", Boolean.valueOf(z));
        Iterator it = ((CopyOnWriteArrayList) f254911a).iterator();
        while (it.hasNext()) {
            if (((C9613e) it.next()).mo2009d(dVar.getContext(), str + str2, intent)) {
                return;
            }
        }
        Intent intent2 = intent == null ? new Intent() : intent;
        if (!Util.isNullOrNil(str2) && !Util.isNullOrNil(str)) {
            String str4 = MMApplicationContext.getSourcePackageName() + ".plugin." + str;
            if (str2.startsWith(".")) {
                str3 = str4 + str2;
            } else {
                str3 = str2;
            }
            intent2.setClassName(MMApplicationContext.getPackageName(), str3);
        }
        dVar.mo102813a(intent2, i, cVar);
        m109782a(dVar.getContext(), str2, intent);
    }

    /* renamed from: r */
    public static void m109800r(Context context, String str, Intent intent) {
        m109801s(context, str, intent, (Bundle) null);
    }

    /* renamed from: s */
    public static void m109801s(Context context, String str, Intent intent, Bundle bundle) {
        Intent intent2 = intent == null ? new Intent() : intent;
        String sourcePackageName = MMApplicationContext.getSourcePackageName();
        if (str.startsWith(".")) {
            str = sourcePackageName + str;
        }
        intent2.setClassName(MMApplicationContext.getPackageName(), str);
        Iterator it = ((CopyOnWriteArrayList) f254911a).iterator();
        while (it.hasNext()) {
            if (((C9613e) it.next()).mo2009d(context, str, intent)) {
                return;
            }
        }
        if (context instanceof Activity) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(bundle);
            aVar.mo10233c(intent2);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginstub/PluginHelper", "startAppActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            context.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
            C117292a.m165359e(context, "com/tencent/mm/pluginstub/PluginHelper", "startAppActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            return;
        }
        intent2.addFlags(268435456);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(bundle);
        aVar2.mo10233c(intent2);
        C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/pluginstub/PluginHelper", "startAppActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        context.startActivity((Intent) aVar2.mo10231a(0), (Bundle) aVar2.mo10231a(1));
        C117292a.m165359e(context, "com/tencent/mm/pluginstub/PluginHelper", "startAppActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    /* renamed from: t */
    public static void m109802t(Context context, String str, Intent intent, int i) {
        String str2;
        Intent intent2 = intent == null ? new Intent() : intent;
        String sourcePackageName = MMApplicationContext.getSourcePackageName();
        if (str.startsWith(".")) {
            str2 = sourcePackageName + str;
        } else {
            str2 = str;
        }
        intent2.setClassName(MMApplicationContext.getPackageName(), str2);
        Iterator it = ((CopyOnWriteArrayList) f254911a).iterator();
        while (it.hasNext()) {
            if (((C9613e) it.next()).mo2009d(context, str2, intent)) {
                return;
            }
        }
        if (context instanceof Activity) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(intent2);
            C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/pluginstub/PluginHelper", "startAppActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            m109782a(context, str, intent);
            return;
        }
        Log.m105922f("MicroMsg.PluginHelper", "context not activity, skipped");
    }

    /* renamed from: u */
    public static void m109803u(MMActivity mMActivity, String str, Intent intent, int i, MMActivity.C6739d dVar) {
        String str2;
        Intent intent2 = intent == null ? new Intent() : intent;
        String sourcePackageName = MMApplicationContext.getSourcePackageName();
        if (str.startsWith(".")) {
            str2 = sourcePackageName + str;
        } else {
            str2 = str;
        }
        Iterator it = ((CopyOnWriteArrayList) f254911a).iterator();
        while (it.hasNext()) {
            if (((C9613e) it.next()).mo2009d(mMActivity, str2, intent)) {
                return;
            }
        }
        intent2.setClassName(MMApplicationContext.getPackageName(), str2);
        mMActivity.mmStartActivityForResult(dVar, intent, i);
        m109782a(mMActivity, str, intent);
    }

    /* renamed from: v */
    public static void m109804v(MMFragmentActivity mMFragmentActivity, String str, Intent intent, int i, MMFragmentActivity$$f mMFragmentActivity$$f) {
        String str2;
        Intent intent2 = intent == null ? new Intent() : intent;
        String sourcePackageName = MMApplicationContext.getSourcePackageName();
        if (str.startsWith(".")) {
            str2 = sourcePackageName + str;
        } else {
            str2 = str;
        }
        Iterator it = ((CopyOnWriteArrayList) f254911a).iterator();
        while (it.hasNext()) {
            if (((C9613e) it.next()).mo2009d(mMFragmentActivity, str2, intent)) {
                return;
            }
        }
        intent2.setClassName(MMApplicationContext.getPackageName(), str2);
        mMFragmentActivity.mmStartActivityForResult(mMFragmentActivity$$f, intent, i);
        m109782a(mMFragmentActivity, str, intent);
    }

    /* renamed from: w */
    public static void m109805w(Context context, Intent intent) {
        if (C44594n1.m49046b()) {
            m109791i(context, "webview", ".ui.tools.fts.MMFTSSOSHomeWebViewUI", intent, (Bundle) null);
        } else {
            m109791i(context, "webview", ".ui.tools.fts.FTSSOSHomeWebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: x */
    public static void m109806x(Context context, Intent intent, Bundle bundle) {
        if (C44594n1.m49046b()) {
            m109791i(context, "webview", ".ui.tools.fts.MMFTSSearchTabWebViewUI", intent, bundle);
        } else {
            m109791i(context, "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", intent, bundle);
        }
    }

    /* renamed from: y */
    public static void m109807y(Intent intent) {
        C116024c.m163164d(intent, XWalkEnvironment.MODULE_MM, true, m109786e(XWalkEnvironment.MODULE_MM));
    }

    /* renamed from: z */
    public static void m109808z(Context context, Intent intent) {
        if (C44594n1.m49046b()) {
            m109791i(context, "webview", ".ui.tools.fts.MMSosWebViewUI", intent, (Bundle) null);
        } else {
            m109791i(context, "webview", ".ui.tools.fts.SosWebViewUI", intent, (Bundle) null);
        }
    }

    @Deprecated
    /* renamed from: f */
    public static synchronized boolean m109788f(String str) {
        synchronized (C88144b.class) {
        }
        return true;
    }
}
