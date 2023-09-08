package p238st;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.liteapp.report.WxaLiteAppStartReport;
import com.tencent.liteapp.storage.WxaLiteAppBaselibInfo;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.lite.C115472a;
import com.tencent.p014mm.plugin.lite.C115478f;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.LiteAppTaskPreloadReceiver;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.logic.C115485l;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f81.C7998c;
import i22.C8846b;
import j20.C117292a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k00.C46630b;
import k20.C9556a;
import ke3.C88144b;
import oa1.C117731d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p158gt.C76057w;
import p172io.flutter.embedding.engine.FlutterEngine;
import p225rc.C89925n;
import p244tt.C14088e;
import q22.C12035a;
import q22.C12037c;
import sw1.C48478n;
import tw3.C118550b;
import tw3.C118552d;
import ww3.C118789a;
import zt3.C119157j;

@C86522b(dependencies = {C7998c.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: st.c */
public class C118302c extends C86301e implements C14088e {

    /* renamed from: f */
    public static long f353565f;

    /* renamed from: g */
    public static final String[] f353566g = {"wxalite5a62b2376a074f2284dd9b4224043936", "wxalitea95723728764364c6f996b4bdab3af52", "wxalitefb18d43d7467f7b81eeb8ab3ac3718ca", "wxalite842f9e8076010458697522e7db33761b", "wxaliteffd0d77bb439c46980fd2877978576d6", "wxaliteb984a6d0a709290f7f2cd6cab0db8fbe"};

    /* renamed from: d */
    public boolean f353567d = false;

    /* renamed from: e */
    public final Set<C14088e.C14089a> f353568e;

    /* renamed from: st.c$a */
    public class C48461a implements C48478n.C13791d {

        /* renamed from: a */
        public final /* synthetic */ String f129666a;

        /* renamed from: b */
        public final /* synthetic */ Context f129667b;

        /* renamed from: c */
        public final /* synthetic */ C14088e.C14090b f129668c;

        /* renamed from: d */
        public final /* synthetic */ String f129669d;

        public C48461a(String str, Context context, C14088e.C14090b bVar, String str2) {
            this.f129666a = str;
            this.f129667b = context;
            this.f129668c = bVar;
            this.f129669d = str2;
        }

        /* renamed from: a */
        public void mo5391a(C48478n.C13790c cVar) {
            boolean z;
            if (cVar == null || Util.isNullOrNil(cVar.f38905a) || C118302c.this.mo13509NR(cVar.f38905a) == null) {
                z = false;
            } else {
                Log.m105924i("MicroMsg.LiteAppFeatureService", "openGameLiteApp WxaLiteAppInfo is null");
                z = true;
            }
            if (z) {
                Bundle bundle = new Bundle();
                bundle.putString("appId", cVar.f38905a);
                bundle.putString("path", cVar.f38906b);
                bundle.putString(SearchIntents.EXTRA_QUERY, this.f129666a);
                C118302c.this.mo13510OP(this.f129667b, bundle, true, false, this.f129668c);
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("rawUrl", this.f129669d);
            Intent intent = new Intent();
            intent.putExtras(bundle2);
            C88144b.m109791i(this.f129667b, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            Log.m105924i("MicroMsg.LiteAppFeatureService", "openGameLiteApp open GameWebView");
        }
    }

    /* renamed from: st.c$c */
    public class C64168c implements C56832d.C56833a {

        /* renamed from: a */
        public final /* synthetic */ JSONArray f181887a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f181888b;

        public C64168c(C118302c cVar, JSONArray jSONArray, JSONObject jSONObject) {
            this.f181887a = jSONArray;
            this.f181888b = jSONObject;
        }

        /* renamed from: a */
        public String mo80258a(String str, String str2) {
            if (str2.equals("preloadImages")) {
                return this.f181887a.toString();
            }
            if (!this.f181888b.has(str2)) {
                return "";
            }
            Object opt = this.f181888b.opt(str2);
            String obj = opt.toString();
            if (!(opt instanceof String)) {
                return obj;
            }
            return FastJsonResponse.QUOTE + obj.replace(FastJsonResponse.QUOTE, "\\\"") + FastJsonResponse.QUOTE;
        }

        /* renamed from: b */
        public boolean mo80259b(long j, String str, String str2, int i) {
            return false;
        }
    }

    /* renamed from: st.c$b */
    public class C118303b implements MMUncaughtExceptionHandler.IOnUncaughtExceptionListener {
        public C118303b() {
        }

        public void uncaughtException(MMUncaughtExceptionHandler mMUncaughtExceptionHandler, String str, Throwable th) {
            if (C118302c.this.f353567d) {
                Log.m105924i("MicroMsg.LiteAppFeatureService", "LiteApp uncaughtException");
                C118302c.this.mo13514aF(Boolean.FALSE);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(1293, 3, 1);
                nVar.kvStat(23380, "1");
            }
        }
    }

    /* renamed from: st.c$d */
    public class C118304d implements C46630b.C46631a {

        /* renamed from: a */
        public final /* synthetic */ C14088e.C14090b f353570a;

        /* renamed from: b */
        public final /* synthetic */ WxaLiteAppStartReport f353571b;

        /* renamed from: c */
        public final /* synthetic */ String f353572c;

        /* renamed from: d */
        public final /* synthetic */ Context f353573d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f353574e;

        /* renamed from: f */
        public final /* synthetic */ C56832d f353575f;

        public C118304d(C14088e.C14090b bVar, WxaLiteAppStartReport wxaLiteAppStartReport, String str, Context context, Bundle bundle, C56832d dVar) {
            this.f353570a = bVar;
            this.f353571b = wxaLiteAppStartReport;
            this.f353572c = str;
            this.f353573d = context;
            this.f353574e = bundle;
            this.f353575f = dVar;
        }

        /* renamed from: a */
        public void mo71899a(String str) {
            C118302c.vx0(C118302c.this, this.f353570a, false);
            WxaLiteAppStartReport wxaLiteAppStartReport = this.f353571b;
            wxaLiteAppStartReport.f339270p = false;
            wxaLiteAppStartReport.f339269o = System.currentTimeMillis() - this.f353571b.f339268n;
            C115492q.m162360g().mo175478p(this.f353572c, false, false, 23, this.f353571b.f339269o);
        }

        public void onSuccess(String str) {
            WxaLiteAppInfo j = C115492q.m162360g().mo175472j(str);
            this.f353571b.f339269o = System.currentTimeMillis() - this.f353571b.f339268n;
            if (j != null) {
                C118302c.vx0(C118302c.this, this.f353570a, true);
                WxaLiteAppStartReport wxaLiteAppStartReport = this.f353571b;
                wxaLiteAppStartReport.f339270p = true;
                C118302c.this.yx0(this.f353573d, this.f353574e, wxaLiteAppStartReport, j, this.f353575f);
                C115492q.m162360g().mo175478p(str, false, true, 1, 0);
                return;
            }
            C118302c.vx0(C118302c.this, this.f353570a, false);
            this.f353571b.f339270p = false;
            C115492q.m162360g().mo175478p(str, false, false, 23, this.f353571b.f339269o);
        }
    }

    /* renamed from: st.c$e */
    public class C118305e implements C46630b.C46631a {
        public C118305e(C118302c cVar) {
        }

        /* renamed from: a */
        public void mo71899a(String str) {
        }

        public void onSuccess(String str) {
        }
    }

    /* renamed from: st.c$f */
    public class C118306f implements C115477b {

        /* renamed from: a */
        public final /* synthetic */ C14088e.C14090b f353577a;

        /* renamed from: b */
        public final /* synthetic */ WxaLiteAppStartReport f353578b;

        /* renamed from: c */
        public final /* synthetic */ Context f353579c;

        /* renamed from: d */
        public final /* synthetic */ Bundle f353580d;

        /* renamed from: e */
        public final /* synthetic */ C56832d f353581e;

        /* renamed from: f */
        public final /* synthetic */ String f353582f;

        public C118306f(C14088e.C14090b bVar, WxaLiteAppStartReport wxaLiteAppStartReport, Context context, Bundle bundle, C56832d dVar, String str) {
            this.f353577a = bVar;
            this.f353578b = wxaLiteAppStartReport;
            this.f353579c = context;
            this.f353580d = bundle;
            this.f353581e = dVar;
            this.f353582f = str;
        }

        /* renamed from: a */
        public void mo5700a(String str, int i) {
            C14088e.C14090b bVar = this.f353577a;
            if (!(bVar == null || i == 9)) {
                bVar.mo1718b();
            }
            Log.m105928w("MicroMsg.LiteAppFeatureService", "checkLiteApp fail:" + str);
            WxaLiteAppStartReport wxaLiteAppStartReport = this.f353578b;
            wxaLiteAppStartReport.f339270p = false;
            wxaLiteAppStartReport.f339269o = System.currentTimeMillis() - this.f353578b.f339268n;
            C115492q.m162360g().mo175478p(str, false, false, i == 8 ? 24 : i == 9 ? 20 : i == 10 ? 25 : 23, this.f353578b.f339269o);
        }

        /* renamed from: b */
        public void mo5701b(WxaLiteAppInfo wxaLiteAppInfo, int i) {
            C14088e.C14090b bVar = this.f353577a;
            if (!(bVar == null || i == 9)) {
                bVar.mo1717a();
            }
            WxaLiteAppStartReport wxaLiteAppStartReport = this.f353578b;
            wxaLiteAppStartReport.f339270p = true;
            long currentTimeMillis = System.currentTimeMillis();
            WxaLiteAppStartReport wxaLiteAppStartReport2 = this.f353578b;
            wxaLiteAppStartReport.f339269o = currentTimeMillis - wxaLiteAppStartReport2.f339268n;
            C118302c.this.yx0(this.f353579c, this.f353580d, wxaLiteAppStartReport2, wxaLiteAppInfo, this.f353581e);
            C115492q.m162360g().mo175478p(this.f353582f, false, true, i == 1 ? 2 : i == 8 ? 4 : i == 10 ? 5 : 3, this.f353578b.f339269o);
        }
    }

    public C118302c() {
        new ConcurrentHashMap();
        this.f353568e = new HashSet();
    }

    public static void vx0(C118302c cVar, C14088e.C14090b bVar, boolean z) {
        cVar.getClass();
        if (bVar != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                ((C119157j) C119157j.f356862d).mo183895z(new C118307e(cVar, bVar, z));
            } else if (z) {
                bVar.mo1717a();
            } else {
                bVar.mo1718b();
            }
        }
    }

    public void Ei0(String str, String str2) {
        C115492q g = C115492q.m162360g();
        g.getClass();
        Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "cpan offline registerOfflineResourceCallback clazzName:%s processName:%s", str2, str);
        if (Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.LiteApp.LiteAppLogic", "get clazzName null.");
            return;
        }
        C80916r rVar = null;
        try {
            rVar = (C80916r) Class.forName(str2).newInstance();
        } catch (ClassNotFoundException e) {
            Log.m105921e("MicroMsg.LiteApp.LiteAppLogic", "registerOfflineResourceCallback fail. %s", e.toString());
        } catch (IllegalAccessException e2) {
            Log.m105921e("MicroMsg.LiteApp.LiteAppLogic", "registerOfflineResourceCallback fail. %s", e2.toString());
        } catch (InstantiationException e3) {
            Log.m105921e("MicroMsg.LiteApp.LiteAppLogic", "registerOfflineResourceCallback fail. %s", e3.toString());
        }
        if (rVar != null) {
            Log.m105924i("MicroMsg.LiteApp.LiteAppLogic", "cpan offline registerOfflineResourceCallback success.");
            g.f346249c.put(str, rVar);
        }
    }

    public void Ff0(int i, long j, Intent intent) {
        LiteAppCenter.closeWindow(i, j, intent);
    }

    /* renamed from: Jb */
    public Class<? extends C80916r<IPCString, IPCString>> mo13503Jb() {
        return C12035a.class;
    }

    /* renamed from: K8 */
    public String mo13504K8(String str, String str2, String str3) {
        C115478f.initLib();
        return LiteAppCenter.getLiteAppVersion(str, str2, str3);
    }

    /* renamed from: KY */
    public void mo13505KY() {
        C115472a.C115473a aVar = C115472a.f346202a;
        if (!C115472a.f346203b) {
            mo13513Wx(7, new WxaLiteAppStartReport());
        }
        C118552d.m167207g().mo183269i();
    }

    public void Mk0() {
        C115492q.m162360g().mo175465b();
    }

    /* renamed from: Mu */
    public int mo13507Mu(String str, String str2, String str3) {
        return LiteAppCenter.dispatchStore(str, str2, str3);
    }

    /* renamed from: Mv */
    public void mo13508Mv() {
        C118552d g = C118552d.m167207g();
        if (g.f354799c != null && !g.f354805i.booleanValue()) {
            if (g.mo183267f(g.f354800d) != g.f354799c) {
                C118789a.m167471b("WxaRouter.WxaRouter", "WxaRouter destroyPreloadFlutterEngine error", new Object[0]);
                return;
            }
            int i = g.f354800d;
            FlutterEngine f = g.mo183267f(i);
            if (f == null) {
                C118789a.m167471b("WxaRouter.WxaRouter", "WxaRouter releaseEngine engine is nil", new Object[0]);
                return;
            }
            if (f == g.f354799c) {
                g.f354805i = Boolean.FALSE;
                g.f354799c = null;
            }
            g.f354803g.remove(i);
            g.f354806j.post(new C118550b(g, i, f));
        }
    }

    /* renamed from: NR */
    public WxaLiteAppInfo mo13509NR(String str) {
        WxaLiteAppInfo j = C115492q.m162360g().mo175472j(str);
        if (j == null) {
            C115492q.m162360g().mo175478p(str, false, false, 22, 0);
        }
        return j;
    }

    /* renamed from: OP */
    public void mo13510OP(Context context, Bundle bundle, boolean z, boolean z2, C14088e.C14090b bVar) {
        gc0(context, bundle, z, z2, (C56832d) null, bVar);
    }

    public void Od0(C14088e.C14089a aVar) {
        ((HashSet) this.f353568e).add(aVar);
    }

    /* renamed from: Tg */
    public WxaLiteAppBaselibInfo mo13512Tg() {
        return C115492q.m162360g().mo175469f();
    }

    /* renamed from: Wx */
    public WxaLiteAppStartReport mo13513Wx(int i, WxaLiteAppStartReport wxaLiteAppStartReport) {
        if (wxaLiteAppStartReport == null) {
            wxaLiteAppStartReport = new WxaLiteAppStartReport();
        }
        C115472a.f346202a.mo175446b(i, wxaLiteAppStartReport);
        return wxaLiteAppStartReport;
    }

    /* renamed from: aF */
    public void mo13514aF(Boolean bool) {
        Log.m105925i("MicroMsg.LiteAppFeatureService", "setLiteRunStatus :%b", bool);
        this.f353567d = bool.booleanValue();
    }

    /* renamed from: b7 */
    public boolean mo13515b7() {
        C115492q.m162360g().getClass();
        return true;
    }

    /* renamed from: bG */
    public void mo13516bG(Context context) {
        C115478f.initLib();
        Intent intent = new Intent(context, WxaLiteAppListUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/feature/lite/LiteAppFeatureService", "startLiteAppListUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/feature/lite/LiteAppFeatureService", "startLiteAppListUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean e00(String str) {
        C115492q g = C115492q.m162360g();
        g.getClass();
        if (!MMApplicationContext.isMainProcess()) {
            return false;
        }
        boolean equalsIgnoreCase = C117731d.m166007c().mo182444f("clicfg_liteapp_share_android", "1", false, true).equalsIgnoreCase("1");
        Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "isSharedLiteAppOpen appId%s enable:%b", str, Boolean.valueOf(equalsIgnoreCase));
        return equalsIgnoreCase && g.mo175474l(str, false);
    }

    public void f20(C14088e.C14089a aVar) {
        ((HashSet) this.f353568e).remove(aVar);
    }

    /* renamed from: f6 */
    public int mo13519f6(JSONObject jSONObject) {
        return C12037c.m11740b(jSONObject);
    }

    public void fh0(String str, String str2, String str3) {
        C115478f.initLib();
        Log.m105925i("MicroMsg.LiteAppFeatureService", "preloadLiteApp appId:%s path:%s task:%s", str, str2, str3);
        Intent intent = new Intent();
        intent.setClass(MMApplicationContext.getContext(), LiteAppTaskPreloadReceiver.class);
        intent.addFlags(268435456);
        intent.putExtra("task", str3);
        intent.putExtra("appId", str);
        intent.putExtra("path", str2);
        MMApplicationContext.getContext().sendBroadcast(intent);
    }

    public int g00(JSONObject jSONObject) {
        return C12037c.m11739a(jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void gc0(android.content.Context r25, android.os.Bundle r26, boolean r27, boolean r28, com.tencent.p014mm.plugin.lite.C56832d r29, p244tt.C14088e.C14090b r30) {
        /*
            r24 = this;
            r2 = r26
            com.tencent.p014mm.plugin.lite.C115478f.initLib()
            java.lang.String r0 = "appId"
            boolean r1 = r2.containsKey(r0)
            java.lang.String r3 = "MicroMsg.LiteAppFeatureService"
            if (r1 != 0) goto L_0x0018
            java.lang.String r0 = "appId is required"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            r30.mo1718b()
            return
        L_0x0018:
            java.lang.String r1 = r2.getString(r0)
            com.tencent.liteapp.report.WxaLiteAppStartReport r4 = new com.tencent.liteapp.report.WxaLiteAppStartReport
            r4.<init>()
            r4.f339261d = r1
            long r5 = java.lang.System.currentTimeMillis()
            r4.f339266i = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "startLiteApp:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = f353565f
            r1 = 0
            r9 = 1
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0098
            long r10 = r5 - r7
            r12 = 500(0x1f4, double:2.47E-321)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x0098
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r10[r1] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            r10[r9] = r7
            java.lang.String r7 = "reduplicate request, lasttime:%d, now:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r7, r10)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1293(0x50d, double:6.39E-321)
            r14 = 105(0x69, double:5.2E-322)
            r16 = 1
            r11 = r7
            r11.mo175913w(r12, r14, r16)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = r2.getString(r0)
            r8.append(r10)
            java.lang.String r10 = ","
            r8.append(r10)
            long r11 = f353565f
            r8.append(r11)
            r8.append(r10)
            r8.append(r5)
            r5 = 21018(0x521a, float:2.9452E-41)
            java.lang.String r6 = r8.toString()
            r7.kvStat(r5, r6)
            r5 = 1
            goto L_0x009b
        L_0x0098:
            f353565f = r5
            r5 = 0
        L_0x009b:
            if (r5 == 0) goto L_0x009e
            return
        L_0x009e:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1293(0x50d, double:6.39E-321)
            r13 = 90
            r15 = 1
            r10 = r5
            r10.mo175913w(r11, r13, r15)
            java.lang.String r6 = r2.getString(r0)
            com.tencent.mm.plugin.lite.logic.q r0 = com.tencent.p014mm.plugin.lite.logic.C115492q.m162360g()
            com.tencent.liteapp.storage.WxaLiteAppInfo r7 = r0.mo175472j(r6)
            r13 = 0
            java.lang.String r0 = "timeout"
            long r17 = r2.getLong(r0, r13)
            java.lang.String r0 = "minVersion"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00dd
            java.lang.String r8 = r7.f339295i
            java.lang.String r10 = r7.f339290d
            java.lang.String r11 = r7.f339294h
            r15 = r24
            java.lang.String r8 = r15.mo13504K8(r8, r10, r11)
            boolean r0 = com.tencent.p014mm.plugin.lite.LiteAppCenter.versionGreater(r0, r8)
            if (r0 == 0) goto L_0x00df
            r0 = 1
            r8 = 1
            goto L_0x00e3
        L_0x00dd:
            r15 = r24
        L_0x00df:
            r0 = r27
            r8 = r28
        L_0x00e3:
            if (r0 == 0) goto L_0x00ef
            java.lang.String[] r10 = f353566g
            boolean r10 = p977hj.C87526a.m108857b(r10, r6)
            r10 = r10 ^ r9
            if (r10 != 0) goto L_0x00ef
            r0 = 0
        L_0x00ef:
            r19 = 6000(0x1770, double:2.9644E-320)
            if (r0 == 0) goto L_0x011f
            if (r8 == 0) goto L_0x011f
            r11 = 1293(0x50d, double:6.39E-321)
            r0 = 91
            r7 = 1
            r10 = r5
            r21 = r13
            r13 = r0
            r15 = r7
            r10.mo175913w(r11, r13, r15)
            r4.f339267j = r9
            r5 = 1
            int r0 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x010d
            r7 = r19
            goto L_0x010f
        L_0x010d:
            r7 = r17
        L_0x010f:
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r6
            r6 = r29
            r9 = r30
            r0.wx0(r1, r2, r3, r4, r5, r6, r7, r9)
            goto L_0x01a3
        L_0x011f:
            r21 = r13
            if (r7 == 0) goto L_0x0166
            if (r30 == 0) goto L_0x0128
            r30.mo1717a()
        L_0x0128:
            r4.f339267j = r1
            if (r0 == 0) goto L_0x0147
            r19 = 0
            r20 = 2
            int r0 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x013a
            r0 = 60000(0xea60, double:2.9644E-319)
            r21 = r0
            goto L_0x013c
        L_0x013a:
            r21 = r17
        L_0x013c:
            r23 = 0
            com.tencent.mm.plugin.lite.logic.q r17 = com.tencent.p014mm.plugin.lite.logic.C115492q.m162360g()
            r18 = r6
            r17.mo175466c(r18, r19, r20, r21, r23)
        L_0x0147:
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r4
            r4 = r7
            r5 = r29
            r0.yx0(r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.lite.logic.q r17 = com.tencent.p014mm.plugin.lite.logic.C115492q.m162360g()
            r19 = 0
            r20 = 1
            r21 = 1
            r22 = 0
            r18 = r6
            r17.mo175478p(r18, r19, r20, r21, r22)
            goto L_0x01a3
        L_0x0166:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "get info return null, appid:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            r11 = 1293(0x50d, double:6.39E-321)
            r13 = 92
            r15 = 1
            r10 = r5
            r10.mo175913w(r11, r13, r15)
            r0 = 20979(0x51f3, float:2.9398E-41)
            r5.kvStat(r0, r6)
            r4.f339267j = r9
            r5 = 0
            int r0 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x0193
            r7 = r19
            goto L_0x0195
        L_0x0193:
            r7 = r17
        L_0x0195:
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r6
            r6 = r29
            r9 = r30
            r0.wx0(r1, r2, r3, r4, r5, r6, r7, r9)
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p238st.C118302c.gc0(android.content.Context, android.os.Bundle, boolean, boolean, com.tencent.mm.plugin.lite.d, tt.e$b):void");
    }

    public boolean isInitialized() {
        List<String> list = C115478f.f346206a;
        return LiteAppCenter.isInitialized;
    }

    public void j00(String str, String str2) {
        C115485l lVar = C115485l.INSTANCE;
        C86013q1.m106436R(str, str2);
    }

    /* renamed from: ke */
    public void mo13525ke(Context context, Bundle bundle, boolean z, JSONObject jSONObject, JSONArray jSONArray, C14088e.C14090b bVar) {
        C56832d dVar;
        JSONArray jSONArray2;
        Bundle bundle2 = bundle;
        JSONObject jSONObject2 = jSONObject;
        JSONArray jSONArray3 = jSONArray;
        String string = bundle2.getString("pkgId");
        String string2 = bundle2.getString("appId");
        if (!Util.isNullOrNil(string) && !Util.isNullOrNil(string2)) {
            JSONArray jSONArray4 = new JSONArray();
            C56832d dVar2 = (jSONObject2 == null && jSONArray3 == null) ? null : new C56832d();
            if (dVar2 != null) {
                dVar2.f162866c = new C64168c(this, jSONArray4, jSONObject2);
            }
            WxaLiteAppStartReport wxaLiteAppStartReport = new WxaLiteAppStartReport();
            wxaLiteAppStartReport.f339261d = string2;
            wxaLiteAppStartReport.f339266i = System.currentTimeMillis();
            WxaLiteAppInfo j = z ? null : C115492q.m162360g().mo175472j(string2);
            if (j != null) {
                if (bVar != null) {
                    bVar.mo1717a();
                }
                wxaLiteAppStartReport.f339267j = false;
                yx0(context, bundle, wxaLiteAppStartReport, j, dVar2);
                xx0(string, string2, true, (C46630b.C46631a) null);
                C115492q.m162360g().mo175478p(string2, false, true, 1, 0);
                Log.m105924i("MicroMsg.LiteAppFeatureService", "checkLiteApp fail:" + string2);
                jSONArray2 = jSONArray4;
                dVar = dVar2;
            } else {
                wxaLiteAppStartReport.f339267j = true;
                wxaLiteAppStartReport.f339268n = System.currentTimeMillis();
                jSONArray2 = jSONArray4;
                dVar = dVar2;
                xx0(string, string2, false, new C118304d(bVar, wxaLiteAppStartReport, string2, context, bundle, dVar));
            }
            if (jSONArray3 != null && jSONArray.length() != 0 && dVar != null) {
                C64169d dVar3 = new C64169d(this, jSONArray3, jSONArray2, dVar);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = jSONArray3.optString(i);
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("url", optString);
                        jSONObject3.put("state", Util.isNullOrNil(optString) ? "fail" : "downloading");
                        jSONArray2.put(jSONObject3);
                    } catch (JSONException unused) {
                    }
                    if (!Util.isNullOrNil(optString)) {
                        ((C76057w) C86312j.m106911c(C76057w.class)).h60(optString, dVar3);
                    }
                }
            }
        } else if (bVar != null) {
            bVar.mo1718b();
        }
    }

    public void onCreate(Context context) {
        MMUncaughtExceptionHandler.addOnUncaughtExceptionListener(new C118303b());
        if (MMApplicationContext.isMainProcess()) {
            C115472a.f346202a.mo175448d(new WxaLiteAppStartReport());
        }
    }

    public void onStoreSendResult(String str, int i, String str2, String str3) {
        Iterator it = ((HashSet) this.f353568e).iterator();
        while (it.hasNext()) {
            ((C14088e.C14089a) it.next()).onStoreSendResult(str, i, str2, str3);
        }
    }

    public void sd0(C4770c cVar, Intent intent, int i) {
        if (i == 0) {
            intent.addFlags(268435456);
            intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
            intent.putExtra("proxyui_action_code_key", 0);
            int i2 = C8846b.f28073a + 1;
            C8846b.f28073a = i2;
            C8846b.f28074b.put(Integer.valueOf(i2), cVar);
            intent.putExtra("callback_id", C8846b.f28073a);
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/feature/lite/LiteAppFeatureService", "startProxyUI", "(Lcom/tencent/mm/plugin/lite/api/LiteAppJsApi;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/feature/lite/LiteAppFeatureService", "startProxyUI", "(Lcom/tencent/mm/plugin/lite/api/LiteAppJsApi;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void t70(WxaLiteAppInfo wxaLiteAppInfo) {
        C115492q.m162360g().mo175482t(wxaLiteAppInfo);
    }

    public void u50(String str, C115477b bVar) {
        C115492q.m162360g().mo175466c(str, false, 2, 60000, bVar);
    }

    /* renamed from: uu */
    public boolean mo13530uu(String str) {
        boolean l = C115492q.m162360g().mo175474l(str, true);
        if (!l) {
            C115492q.m162360g().mo175478p(str, true, false, 21, 0);
        }
        return l;
    }

    /* renamed from: v3 */
    public void mo13531v3(String str, List<C56832d.C56834b> list) {
        Iterator it = ((HashSet) this.f353568e).iterator();
        while (it.hasNext()) {
            ((C14088e.C14089a) it.next()).mo7500v3(str, list);
        }
    }

    public final void wx0(Context context, Bundle bundle, String str, WxaLiteAppStartReport wxaLiteAppStartReport, boolean z, C56832d dVar, long j, C14088e.C14090b bVar) {
        WxaLiteAppStartReport wxaLiteAppStartReport2 = wxaLiteAppStartReport;
        wxaLiteAppStartReport2.f339268n = System.currentTimeMillis();
        C115492q.m162360g().mo175466c(str, z, 1, j, new C118306f(bVar, wxaLiteAppStartReport2, context, bundle, dVar, str));
    }

    public final void xx0(String str, String str2, boolean z, C46630b.C46631a aVar) {
        C46630b bVar = (C46630b) C86312j.m106911c(C46630b.class);
        long j = z ? 60 : 15;
        boolean z2 = !z;
        if (aVar == null) {
            aVar = new C118305e(this);
        }
        bVar.mo71799FW(str, str2, j, z2, aVar);
    }

    /* renamed from: yV */
    public void mo13532yV(Context context, String str, C14088e.C14090b bVar) {
        ((C48478n) C86312j.m106911c(C48478n.class)).mo65690pN(str, new C48461a(new JSONObject(C89925n.m112489b(str)).toString(), context, bVar, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void yx0(android.content.Context r17, android.os.Bundle r18, com.tencent.liteapp.report.WxaLiteAppStartReport r19, com.tencent.liteapp.storage.WxaLiteAppInfo r20, com.tencent.p014mm.plugin.lite.C56832d r21) {
        /*
            r16 = this;
            r8 = r17
            r0 = r18
            r1 = r20
            r2 = r21
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "startLiteApp appid:"
            r3.append(r4)
            java.lang.String r4 = r1.f339290d
            r3.append(r4)
            java.lang.String r4 = ", patchid:"
            r3.append(r4)
            java.lang.String r4 = r1.f339297n
            r3.append(r4)
            java.lang.String r4 = ", updatetime:"
            r3.append(r4)
            long r4 = r1.f339301r
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.LiteAppFeatureService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1293(0x50d, double:6.39E-321)
            r12 = 0
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo r3 = new com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo
            r3.<init>()
            java.lang.String r4 = r1.f339290d
            java.lang.String r5 = "<set-?>"
            gy3.C87412m.m108594g(r4, r5)
            r3.f346214d = r4
            java.lang.String r4 = r1.f339295i
            r3.f346215e = r4
            java.lang.String r1 = r1.f339294h
            r3.f346216f = r1
            long r4 = java.lang.System.currentTimeMillis()
            r3.f346220j = r4
            java.lang.String r1 = "path"
            boolean r4 = r0.containsKey(r1)
            if (r4 == 0) goto L_0x0069
            java.lang.String r1 = r0.getString(r1)
            r3.f346217g = r1
        L_0x0069:
            java.lang.String r1 = "query"
            boolean r4 = r0.containsKey(r1)
            if (r4 == 0) goto L_0x0077
            java.lang.String r1 = r0.getString(r1)
            r3.f346218h = r1
        L_0x0077:
            java.lang.String r1 = "qr_url_query_string"
            boolean r4 = r0.containsKey(r1)
            if (r4 == 0) goto L_0x0085
            java.lang.String r1 = r0.getString(r1)
            r3.f346219i = r1
        L_0x0085:
            java.lang.String r1 = "requestCode"
            boolean r4 = r0.containsKey(r1)
            r9 = 0
            if (r4 == 0) goto L_0x009b
            int r4 = r0.getInt(r1)
            if (r4 <= 0) goto L_0x0098
            boolean r5 = r8 instanceof androidx.fragment.app.FragmentActivity
            if (r5 != 0) goto L_0x009c
        L_0x0098:
            r0.remove(r1)
        L_0x009b:
            r4 = 0
        L_0x009c:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            if (r4 != 0) goto L_0x00b4
            boolean r5 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r5 != 0) goto L_0x00b4
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 != 0) goto L_0x00b4
            boolean r5 = r8 instanceof androidx.fragment.app.FragmentActivity
            if (r5 != 0) goto L_0x00b4
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r5)
        L_0x00b4:
            java.lang.Class<com.tencent.mm.plugin.lite.ui.WxaLiteAppProxyUI> r5 = com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppProxyUI.class
            r1.setClass(r8, r5)
            java.lang.String r5 = "WxaLiteAppLaunchInfo"
            r1.putExtra(r5, r3)
            java.lang.String r3 = "report"
            r5 = r19
            r1.putExtra(r3, r5)
            if (r2 == 0) goto L_0x00d3
            int r3 = com.tencent.p014mm.plugin.lite.LiteAppCenter.genDataUuid()
            com.tencent.p014mm.plugin.lite.LiteAppCenter.setDelayData(r3, r2)
            java.lang.String r2 = "dataUuid"
            r1.putExtra(r2, r3)
        L_0x00d3:
            java.lang.String r2 = "extraData"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x00e3
            android.os.Bundle r3 = r0.getBundle(r2)
            r1.putExtra(r2, r3)
            goto L_0x00eb
        L_0x00e3:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r1.putExtra(r2, r3)
        L_0x00eb:
            java.lang.String r2 = "bundle"
            r1.putExtra(r2, r0)
            if (r4 <= 0) goto L_0x00f9
            r0 = r8
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            r0.startActivityForResult(r1, r4)
            goto L_0x0130
        L_0x00f9:
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r1)
            java.lang.Object[] r1 = r10.mo10232b()
            java.lang.String r2 = "com/tencent/mm/feature/lite/LiteAppFeatureService"
            java.lang.String r3 = "openLiteApp"
            java.lang.String r4 = "(Landroid/content/Context;Landroid/os/Bundle;Lcom/tencent/liteapp/report/WxaLiteAppStartReport;Lcom/tencent/liteapp/storage/WxaLiteAppInfo;Lcom/tencent/mm/plugin/lite/LiteAppStore;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r10.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/feature/lite/LiteAppFeatureService"
            java.lang.String r2 = "openLiteApp"
            java.lang.String r3 = "(Landroid/content/Context;Landroid/os/Bundle;Lcom/tencent/liteapp/report/WxaLiteAppStartReport;Lcom/tencent/liteapp/storage/WxaLiteAppInfo;Lcom/tencent/mm/plugin/lite/LiteAppStore;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p238st.C118302c.yx0(android.content.Context, android.os.Bundle, com.tencent.liteapp.report.WxaLiteAppStartReport, com.tencent.liteapp.storage.WxaLiteAppInfo, com.tencent.mm.plugin.lite.d):void");
    }
}
