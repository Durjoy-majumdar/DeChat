package dv1;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.HandlerThread;
import android.os.Looper;
import bv1.C28426b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.forcenotify.p058ui.ForceNotifyShowUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import ei3.C86522b;
import eu3.C58834h;
import eu3.C97749e;
import ev1.C31726h;
import ev1.C58838a;
import ev1.C58843i;
import ev1.C58847k;
import f40.C86709a0;
import f62.C75700k0;
import fv1.C32183a;
import fy3.C32224a;
import g62.C32330n;
import gv1.C59712c;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import k20.C9556a;
import o40.C61926c;
import ob0.C35136m;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C48374j0;
import te3.C49790i3;
import te3.C51482u20;
import te3.C77949j3;
import z04.C112551y;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: dv1.m */
public final class C58435m extends C86301e implements C28426b {

    /* renamed from: d */
    public boolean f167401d;

    /* renamed from: e */
    public C13604l<Long, String> f167402e = new C13604l<>(0L, "");

    /* renamed from: f */
    public final String f167403f = "MicroMsg.ForceNotifyService";

    /* renamed from: g */
    public long f167404g;

    /* renamed from: h */
    public final C13601g f167405h = C36568h.m40985a(C58437b.f167410d);

    /* renamed from: i */
    public final MMHandler f167406i = new MMHandler(Looper.getMainLooper());

    /* renamed from: j */
    public final ConcurrentLinkedQueue<String> f167407j = new ConcurrentLinkedQueue<>();

    /* renamed from: dv1.m$a */
    public static final class C58436a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58435m f167408d;

        /* renamed from: e */
        public final /* synthetic */ C77949j3 f167409e;

        public C58436a(C58435m mVar, C77949j3 j3Var) {
            this.f167408d = mVar;
            this.f167409e = j3Var;
        }

        public final void run() {
            C58435m mVar = this.f167408d;
            mVar.getClass();
            boolean z = C31543z5.m39453c() - mVar.f167404g > 1800000;
            if (z) {
                mVar.f167404g = C31543z5.m39453c();
            }
            if (z) {
                C32183a.f85554d.mo58523jo();
            }
            C58435m mVar2 = this.f167408d;
            C77949j3 j3Var = this.f167409e;
            mVar2.getClass();
            String str = null;
            Map<String, String> parseXml = XmlParser.parseXml(j3Var.f227636p, "ForcePushId", (String) null);
            if (parseXml != null) {
                str = parseXml.get(".ForcePushId");
            }
            if (str != null) {
                Log.m105925i(mVar2.f167403f, "received msg! MsgSource:%s FromUserName:%s source:%s", j3Var.f227636p, j3Var.f227628e, str);
                String g = C48374j0.m53718g(j3Var.f227628e);
                if (C87412m.m108589b(C75592q0.m90789s(), g) || mVar2.f167407j.contains(g)) {
                    String str2 = mVar2.f167403f;
                    Log.m105928w(str2, "ERROR! no show! notifyList=" + mVar2.f167407j);
                } else if (mVar2.xx0(str)) {
                    String str3 = mVar2.f167403f;
                    Log.m105924i(str3, "fromUser=" + g + " isNeedNotify=true");
                    C31726h Lo = C32183a.f85554d.mo58521Lo(str);
                    if (Lo != null) {
                        mVar2.f167406i.post(new C58441o(mVar2, Lo));
                    }
                } else {
                    Log.m105928w(mVar2.f167403f, "ERROR! no show!");
                }
            }
            C58435m mVar3 = this.f167408d;
            C77949j3 j3Var2 = this.f167409e;
            mVar3.getClass();
            C58847k Dx0 = mVar3.Dx0(C48374j0.m53718g(j3Var2.f227631h));
            if (Dx0 != null) {
                String str4 = Dx0.f168434d;
                Log.m105925i(mVar3.f167403f, "receive msg! livePushId:%s", str4);
                if (mVar3.xx0(str4)) {
                    mVar3.f167406i.post(new C58440n(mVar3, Dx0));
                } else {
                    Log.m105928w(mVar3.f167403f, "ERROR! no show!");
                }
            } else {
                Log.m105928w(mVar3.f167403f, "ERROR! no show!");
            }
        }
    }

    /* renamed from: dv1.m$b */
    public static final class C58437b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C58437b f167410d = new C58437b();

        public C58437b() {
            super(0);
        }

        public Object invoke() {
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("ForceNotifyService", 5);
            a.start();
            return new MMHandler(a.getLooper());
        }
    }

    /* renamed from: dv1.m$c */
    public static final class C58438c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58435m f167411d;

        /* renamed from: e */
        public final /* synthetic */ C31726h f167412e;

        public C58438c(C58435m mVar, C31726h hVar) {
            this.f167411d = mVar;
            this.f167412e = hVar;
        }

        public final void run() {
            this.f167411d.Bx0(this.f167412e, false);
        }
    }

    /* renamed from: dv1.m$d */
    public static final class C58439d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58435m f167413d;

        /* renamed from: e */
        public final /* synthetic */ C31726h f167414e;

        public C58439d(C58435m mVar, C31726h hVar) {
            this.f167413d = mVar;
            this.f167414e = hVar;
        }

        public final void run() {
            this.f167413d.Bx0(this.f167414e, true);
        }
    }

    public static boolean Ax0(C58435m mVar, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
        }
        mVar.getClass();
        C87412m.m108594g(context, "context");
        Object systemService = context.getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        String str = mVar.f167403f;
        Log.m105924i(str, "isVibrateMode ringMode=" + audioManager.getRingerMode() + " RINGER_MODE_SILENT=0");
        return audioManager.getRingerMode() > 0;
    }

    public static boolean zx0(C58435m mVar, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
        }
        mVar.getClass();
        C87412m.m108594g(context, "context");
        Object systemService = context.getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        String str = mVar.f167403f;
        Log.m105924i(str, "isSilentMode ringMode=" + audioManager.getRingerMode() + " RING_MODE_NORMAL=2");
        return audioManager.getRingerMode() != 2;
    }

    public final void Bx0(C31726h hVar, boolean z) {
        boolean z2;
        C87412m.m108594g(hVar, "info");
        if (z) {
            C32183a aVar = C32183a.f85554d;
            aVar.getClass();
            Log.m105924i("MicroMsg.ForceNotifyStorage", "set(" + hVar.field_ForcePushId + ')');
            if (C32183a.f85555e.replace("ForceNotifyData", "UserName", hVar.convertTo()) >= 0) {
                ConcurrentHashMap<String, C31726h> concurrentHashMap = C32183a.f85556f;
                String str = hVar.field_ForcePushId;
                C87412m.m108593f(str, "info.field_ForcePushId");
                concurrentHashMap.put(str, hVar);
                aVar.doNotify();
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            Long valueOf = Long.valueOf(C31543z5.m39453c());
            String str2 = hVar.field_ForcePushId;
            this.f167402e = new C13604l<>(valueOf, str2);
            C32183a aVar2 = C32183a.f85554d;
            C87412m.m108593f(str2, "info.field_ForcePushId");
            z2 = aVar2.mo58522c(str2);
        }
        Log.m105925i(this.f167403f, "[onNewXmlReceived] ret:%s isAdd:%s info:%s", Boolean.valueOf(z2), Boolean.valueOf(z), hVar);
    }

    public final void Cx0(C58847k kVar) {
        C87412m.m108594g(kVar, "item");
        C58843i.f168452c.mo84050a().mo84049a(kVar);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76890w4(C61926c.m72671P(kVar.f168459i), kVar.f168461n, 0);
        if (yx0()) {
            Ex0(false);
        } else {
            Fx0();
        }
    }

    public C58847k Dx0(String str) {
        String str2;
        String str3 = "";
        Map<String, String> parseXml = XmlParser.parseXml(str, "general_string", (String) null);
        if (parseXml == null || (str2 = parseXml.get(".general_string")) == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("feed_id");
            String optString2 = jSONObject.optString("nonce_id");
            String optString3 = jSONObject.optString("live_id");
            String optString4 = jSONObject.optString("force_push_info");
            C87412m.m108593f(optString4, "json");
            boolean z = true;
            if (optString4.length() == 0) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject(optString4);
            String optString5 = jSONObject2.optString("forcePushId");
            String optString6 = jSONObject2.optString("userIcon");
            String optString7 = jSONObject2.optString("extinfo");
            C87412m.m108593f(optString7, "extInfo");
            if (optString7.length() != 0) {
                z = false;
            }
            if (z) {
                return null;
            }
            JSONObject jSONObject3 = new JSONObject(optString7);
            String optString8 = jSONObject3.optString("auth_icon_url", str3);
            String optString9 = jSONObject3.optString("nickname", str3);
            String optString10 = jSONObject3.optString("notify_wording", str3);
            String optString11 = jSONObject2.optString("subject");
            String str4 = optString11 == null ? str3 : optString11;
            String optString12 = jSONObject2.optString("noticeId");
            if (optString12 != null) {
                str3 = optString12;
            }
            try {
                String str5 = this.f167403f;
                Log.m105924i(str5, "parseLiveForcePushItem forcePushId:" + optString5 + ", noticeId:" + str3);
                C87412m.m108593f(optString5, "forcePushId");
                C87412m.m108593f(optString6, "userIcon");
                C87412m.m108593f(optString9, "nickname");
                String string = MMApplicationContext.getContext().getString(C0966R.string.f1o);
                C87412m.m108593f(string, "getContext().getString(R…notify_start_finder_live)");
                C87412m.m108593f(optString, "feedId");
                C87412m.m108593f(optString3, "liveId");
                C87412m.m108593f(optString2, "nonceId");
                return new C58847k(optString5, optString6, optString9, string, optString, optString3, optString2, optString10, optString8, str4, (String) null, str3);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: Dy */
    public void mo55959Dy(String str) {
        boolean z;
        if (str != null) {
            if (!NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext())) {
                C32183a.f85554d.doNotify();
                return;
            }
            C49790i3 i3Var = new C49790i3();
            i3Var.f135070d = str + "@wxcontact";
            i3Var.f135071e = 10800;
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).x90().mo71315mc(new C32330n(213, i3Var));
            C32183a aVar = C32183a.f85554d;
            String str2 = i3Var.f135070d;
            C87412m.m108593f(str2, "opLog.ForcePushId");
            aVar.getClass();
            Log.m105924i("MicroMsg.ForceNotifyStorage", "set(" + str + ", " + str2 + ')');
            C31726h hVar = new C31726h();
            hVar.field_UserName = str;
            hVar.field_ForcePushId = str2;
            long c = C31543z5.m39453c();
            hVar.field_CreateTime = c;
            hVar.field_ExpiredTime = c + 10800000;
            hVar.field_Status = 1;
            if (C32183a.f85555e.replace("ForceNotifyData", "UserName", hVar.convertTo()) >= 0) {
                ConcurrentHashMap<String, C31726h> concurrentHashMap = C32183a.f85556f;
                String str3 = hVar.field_ForcePushId;
                C87412m.m108593f(str3, "info.field_ForcePushId");
                concurrentHashMap.put(str3, hVar);
                aVar.doNotify();
                z = true;
            } else {
                z = false;
            }
            String str4 = this.f167403f;
            Log.m105925i(str4, "[setting] " + str + " ret:%s", Boolean.valueOf(z));
        }
    }

    public final void Ex0(boolean z) {
        String topActivityName2 = Util.getTopActivityName2(MMApplicationContext.getContext());
        String str = this.f167403f;
        Log.m105924i(str, "clazzName:" + "ForceNotifyShowUI" + " topActivityName:" + topActivityName2);
        if (z || !C87412m.m108589b("ForceNotifyShowUI", topActivityName2)) {
            Log.m105924i(this.f167403f, "showNotifyActivity first show");
            Intent intent = new Intent(MMApplicationContext.getContext(), ForceNotifyShowUI.class);
            intent.addFlags(268435456);
            Log.m105924i(this.f167403f, "[notifyShow]");
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/forcenotify/core/ForceNotifyService", "showNotifyActivity", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/forcenotify/core/ForceNotifyService", "showNotifyActivity", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        Log.m105924i(this.f167403f, "showNotifyActivity add to pendingQueue");
    }

    public final void Fx0() {
        C58838a poll = C58843i.f168452c.mo84050a().f168454a.poll();
        if (poll != null) {
            C59712c.C59715c cVar = C59712c.f170575I;
            cVar.mo84705a().mo84689e(poll);
            cVar.mo84705a().show();
        }
    }

    /* renamed from: Hq */
    public MAutoStorage<?> mo55960Hq() {
        return C32183a.f85554d;
    }

    /* renamed from: Pr */
    public void mo55961Pr(boolean z) {
        this.f167401d = z;
    }

    /* renamed from: W0 */
    public void mo55962W0(String str, int i) {
        if (str != null) {
            if (!NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext())) {
                C32183a.f85554d.doNotify();
                return;
            }
            C51482u20 u202 = new C51482u20();
            u202.f142561d = str;
            u202.f142562e = i;
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).x90().mo71315mc(new C32330n(JsApiCheckIsSupportFaceDetect.CTRL_INDEX, u202));
            String str2 = this.f167403f;
            Log.m105924i(str2, "[delete] " + str);
        }
    }

    /* renamed from: YB */
    public void mo55963YB(C77949j3 j3Var) {
    }

    /* renamed from: Zp */
    public void mo55964Zp(C77949j3 j3Var) {
        C87412m.m108594g(j3Var, "addMsg");
        ((MMHandler) ((C36570n) this.f167405h).getValue()).post(new C58436a(this, j3Var));
    }

    /* renamed from: ia */
    public boolean mo55965ia(String str) {
        C87412m.m108594g(str, "username");
        try {
            return xx0(str + "@wxcontact");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: o */
    public void mo55966o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C87412m.m108594g(map, "map");
        int i = 0;
        Log.m105925i(this.f167403f, "[onNewXmlReceived] type:%s map:%s", str, aVar);
        if (C87412m.m108589b(str, "NewXmlDelForcePush") || C87412m.m108589b(str, "NewXmlAddForcePush")) {
            C31726h hVar = new C31726h();
            String str2 = map.get(wx0(".forcePushId"));
            hVar.field_ForcePushId = str2;
            Log.m105925i(this.f167403f, "[onNewXmlReceived] forcePushId:%s", str2);
            hVar.field_CreateTime = Util.safeParseLong(map.get(wx0(".createTime"))) * 1000;
            hVar.field_ExpiredTime = Util.safeParseLong(map.get(wx0(".expiredTime"))) * 1000;
            hVar.field_UserIcon = map.get(wx0(".userIcon"));
            hVar.field_UserName = map.get(wx0(".userName"));
            hVar.field_Description = map.get(wx0(".description"));
            hVar.field_ExtInfo = map.get(wx0(".extInfo"));
            hVar.field_Status = (C31543z5.m39453c() > hVar.field_ExpiredTime ? 1 : (C31543z5.m39453c() == hVar.field_ExpiredTime ? 0 : -1)) >= 0 ? 0 : 1;
            String str3 = hVar.field_ForcePushId;
            C87412m.m108593f(str3, "info.field_ForcePushId");
            if (!C112551y.m153808h(str3, "@wxcontact", false, 2, (Object) null)) {
                String str4 = hVar.field_ForcePushId;
                C87412m.m108593f(str4, "info.field_ForcePushId");
                if (!C112551y.m153808h(str4, "@miniapp", false, 2, (Object) null)) {
                    String str5 = hVar.field_ForcePushId;
                    C87412m.m108593f(str5, "info.field_ForcePushId");
                    if (C112551y.m153808h(str5, "@finderlive", false, 2, (Object) null)) {
                        i = 1;
                    }
                }
            }
            hVar.field_Type = i;
            if (C87412m.m108589b("NewXmlDelForcePush", str)) {
                ((MMHandler) ((C36570n) this.f167405h).getValue()).post(new C58438c(this, hVar));
            } else if (C87412m.m108589b("NewXmlAddForcePush", str)) {
                ((MMHandler) ((C36570n) this.f167405h).getValue()).post(new C58439d(this, hVar));
            }
        }
    }

    public long u20(String str) {
        C87412m.m108594g(str, "username");
        C32183a aVar = C32183a.f85554d;
        String str2 = str + "@wxcontact";
        aVar.getClass();
        C87412m.m108594g(str2, "forcePushId");
        Log.m105924i("MicroMsg.ForceNotifyStorage", "getExpiredTime(" + str2 + ')');
        C31726h hVar = new C31726h();
        hVar.field_ForcePushId = str2;
        if (aVar.get(hVar, new String[0])) {
            return hVar.field_ExpiredTime;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.f168434d;
     */
    /* renamed from: uJ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo55968uJ(java.lang.String r1) {
        /*
            r0 = this;
            ev1.k r1 = r0.Dx0(r1)
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = r1.f168434d
            if (r1 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r1 = ""
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dv1.C58435m.mo55968uJ(java.lang.String):java.lang.String");
    }

    public boolean ua0(String str) {
        C87412m.m108594g(str, "username");
        String str2 = str + "@wxcontact";
        boolean z = xx0(str2) || (C87412m.m108589b(this.f167402e.f38556e, str2) && ((Number) this.f167402e.f38555d).longValue() > 0 && C31543z5.m39453c() - ((Number) this.f167402e.f38555d).longValue() <= 3000);
        this.f167402e = new C13604l<>(0L, "");
        return !z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        cy3.C58003b.m67160a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<ev1.C31726h> vx0() {
        /*
            r14 = this;
            fv1.a r0 = fv1.C32183a.f85554d
            r0.getClass()
            java.lang.String r0 = "MicroMsg.ForceNotifyStorage"
            java.lang.String r1 = "getList()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            zh3.f r3 = fv1.C32183a.f85555e
            java.lang.String r4 = "*"
            java.lang.String[] r5 = new java.lang.String[]{r4}
            r12 = 1
            java.lang.String[] r7 = new java.lang.String[r12]
            long r8 = eb0.C31543z5.m39453c()
            java.lang.String r4 = java.lang.String.valueOf(r8)
            r13 = 0
            r7[r13] = r4
            r8 = 0
            r9 = 0
            r11 = 2
            java.lang.String r4 = "ForceNotifyData"
            java.lang.String r6 = "ExpiredTime>?"
            java.lang.String r10 = "ExpiredTime Desc"
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)
            r4 = 0
            r3.moveToFirst()     // Catch:{ all -> 0x007d }
        L_0x0044:
            boolean r5 = r3.isAfterLast()     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x0077
            ev1.h r5 = new ev1.h     // Catch:{ all -> 0x007d }
            r5.<init>()     // Catch:{ all -> 0x007d }
            r5.convertFrom(r3)     // Catch:{ all -> 0x007d }
            java.lang.String r6 = r5.field_ForcePushId     // Catch:{ all -> 0x007d }
            if (r6 == 0) goto L_0x0073
            java.lang.String r6 = r5.field_UserName     // Catch:{ all -> 0x007d }
            r2.get(r6)     // Catch:{ all -> 0x007d }
            r1.add(r5)     // Catch:{ all -> 0x007d }
            java.lang.String r6 = "add List:%s"
            java.lang.Object[] r7 = new java.lang.Object[r12]     // Catch:{ all -> 0x007d }
            r7[r13] = r5     // Catch:{ all -> 0x007d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r7)     // Catch:{ all -> 0x007d }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, ev1.h> r6 = fv1.C32183a.f85556f     // Catch:{ all -> 0x007d }
            java.lang.String r7 = r5.field_ForcePushId     // Catch:{ all -> 0x007d }
            java.lang.String r8 = "result.field_ForcePushId"
            gy3.C87412m.m108593f(r7, r8)     // Catch:{ all -> 0x007d }
            r6.put(r7, r5)     // Catch:{ all -> 0x007d }
        L_0x0073:
            r3.moveToNext()     // Catch:{ all -> 0x007d }
            goto L_0x0044
        L_0x0077:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x007d }
            cy3.C58003b.m67160a(r3, r4)
            return r1
        L_0x007d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007f:
            r1 = move-exception
            cy3.C58003b.m67160a(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dv1.C58435m.vx0():java.util.ArrayList");
    }

    public final String wx0(String str) {
        return ".sysmsg" + str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if ((r2.field_Status == 1) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        if ((r6.field_Status == 1) != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        cy3.C58003b.m67160a(r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean xx0(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "forcePushId"
            gy3.C87412m.m108594g(r15, r0)
            fv1.a r0 = fv1.C32183a.f85554d
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isNeedNotify("
            r0.append(r1)
            r0.append(r15)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.ForceNotifyStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, ev1.h> r0 = fv1.C32183a.f85556f
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0052
            java.lang.Object r2 = r0.get(r15)
            ev1.h r2 = (ev1.C31726h) r2
            if (r2 == 0) goto L_0x0052
            long r0 = eb0.C31543z5.m39451a()
            long r5 = r2.field_ExpiredTime
            int r15 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r15 < 0) goto L_0x0043
            r15 = 1
            goto L_0x0044
        L_0x0043:
            r15 = 0
        L_0x0044:
            if (r15 != 0) goto L_0x0050
            int r15 = r2.field_Status
            if (r15 != r3) goto L_0x004c
            r15 = 1
            goto L_0x004d
        L_0x004c:
            r15 = 0
        L_0x004d:
            if (r15 == 0) goto L_0x0050
            goto L_0x00a7
        L_0x0050:
            r3 = 0
            goto L_0x00a7
        L_0x0052:
            zh3.f r5 = fv1.C32183a.f85555e
            java.lang.String r2 = "*"
            java.lang.String[] r7 = new java.lang.String[]{r2}
            java.lang.String[] r9 = new java.lang.String[r3]
            r9[r4] = r15
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2
            java.lang.String r6 = "ForceNotifyData"
            java.lang.String r8 = "ForcePushId=?"
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)
            r5 = 0
            boolean r6 = r2.moveToFirst()     // Catch:{ all -> 0x00a1 }
            if (r6 == 0) goto L_0x00a9
            ev1.h r6 = new ev1.h     // Catch:{ all -> 0x00a1 }
            r6.<init>()     // Catch:{ all -> 0x00a1 }
            r6.convertFrom(r2)     // Catch:{ all -> 0x00a1 }
            r0.put(r15, r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "[isNeedNotify] forcePushId:%s %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00a1 }
            r7[r4] = r15     // Catch:{ all -> 0x00a1 }
            r7[r3] = r6     // Catch:{ all -> 0x00a1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r7)     // Catch:{ all -> 0x00a1 }
            long r0 = eb0.C31543z5.m39451a()     // Catch:{ all -> 0x00a1 }
            long r7 = r6.field_ExpiredTime     // Catch:{ all -> 0x00a1 }
            int r15 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r15 < 0) goto L_0x0094
            r15 = 1
            goto L_0x0095
        L_0x0094:
            r15 = 0
        L_0x0095:
            if (r15 != 0) goto L_0x00a3
            int r15 = r6.field_Status     // Catch:{ all -> 0x00a1 }
            if (r15 != r3) goto L_0x009d
            r15 = 1
            goto L_0x009e
        L_0x009d:
            r15 = 0
        L_0x009e:
            if (r15 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a1:
            r15 = move-exception
            goto L_0x00af
        L_0x00a3:
            r3 = 0
        L_0x00a4:
            cy3.C58003b.m67160a(r2, r5)
        L_0x00a7:
            r4 = r3
            goto L_0x00ae
        L_0x00a9:
            rx3.b0 r15 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00a1 }
            cy3.C58003b.m67160a(r2, r5)
        L_0x00ae:
            return r4
        L_0x00af:
            throw r15     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            cy3.C58003b.m67160a(r2, r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dv1.C58435m.xx0(java.lang.String):boolean");
    }

    public final boolean yx0() {
        Object systemService = MMApplicationContext.getContext().getSystemService("keyguard");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return ((KeyguardManager) systemService).inKeyguardRestrictedInputMode();
    }
}
