package l13;

import a70.C112760b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import b12.C79645d;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.plugin.downloader.model.C40940o;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44563k0;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import ky2.C10432i;
import m13.C88689b;
import m13.C88690c;
import n13.C88880b;
import nd3.C47223a;
import ni3.C88946c;
import ni3.C88948d;
import ni3.C88951g;
import org.json.JSONObject;
import p1054vg.C90793a;
import qe3.C89625d;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import qo3.C89779i0;
import te3.C90430p93;
import te3.rg4;
import tw0.C90585h;
import v02.C90737d;
import y02.C91361e;
import y02.C91363f;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: l13.b */
public class C88357b extends C86301e implements C88689b {

    /* renamed from: d */
    public int f255346d = 16794113;

    /* renamed from: e */
    public final MMHandler[] f255347e = {null};

    /* renamed from: f */
    public boolean f255348f = false;

    /* renamed from: g */
    public LinkedList<C88690c> f255349g = new LinkedList<>();

    /* renamed from: h */
    public WeakReference<Context> f255350h = null;

    /* renamed from: i */
    public C77398g f255351i = null;

    /* renamed from: j */
    public C89779i0 f255352j = null;

    /* renamed from: n */
    public String f255353n = MMApplicationContext.getContext().getString(C0966R.string.f7928wi);

    /* renamed from: l13.b$a */
    public class C88358a implements C88948d {
        public C88358a(C88357b bVar) {
        }

        /* renamed from: d */
        public void mo122771d(String str, String str2) {
        }

        /* renamed from: e */
        public void mo122772e(String str, String str2) {
            Log.m105920e(str, str2);
        }

        /* renamed from: i */
        public void mo122773i(String str, String str2) {
            Log.m105924i(str, str2);
        }
    }

    /* renamed from: l13.b$b */
    public class C88359b extends MMHandler {
        public C88359b() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == C88357b.this.f255346d) {
                Log.m105924i("MicroMsg.Updater.PluginUpdater", "do checkRealDoMMdiffUpdatePatchVersion");
                C88357b bVar = C88357b.this;
                boolean z = false;
                boolean z2 = message.arg1 == 1;
                if (message.arg2 == 1) {
                    z = true;
                }
                bVar.getClass();
                ((C119157j) C119157j.f356862d).mo183875f(new C88366d(bVar, z, z2));
            }
        }
    }

    /* renamed from: l13.b$c */
    public class C88360c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TinkerSyncResponse f255355d;

        public C88360c(TinkerSyncResponse tinkerSyncResponse) {
            this.f255355d = tinkerSyncResponse;
        }

        public void run() {
            C88357b.this.wx0(this.f255355d);
        }
    }

    /* renamed from: l13.b$d */
    public class C88361d implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ TinkerSyncResponse f255357a;

        /* renamed from: b */
        public final /* synthetic */ boolean f255358b;

        public C88361d(C88357b bVar, TinkerSyncResponse tinkerSyncResponse, boolean z) {
            this.f255357a = tinkerSyncResponse;
            this.f255358b = z;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            Log.m105925i("MicroMsg.Updater.PluginUpdater", "onDialogClick HdiffApk %s", Boolean.valueOf(z));
            if (z) {
                C88880b.f256362a.mo123267h(this.f255357a);
                C90737d.m113803k(this.f255358b ? 110 : 310);
                C115669n.INSTANCE.idkeyStat(614, this.f255358b ? 110 : 310, 1, false);
                return;
            }
            C90737d.m113803k(this.f255358b ? 109 : ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL);
            C115669n.INSTANCE.idkeyStat(614, this.f255358b ? 109 : 309, 1, false);
        }
    }

    /* renamed from: l13.b$e */
    public class C88362e implements DialogInterface.OnDismissListener {
        public C88362e(C88357b bVar) {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "onDismiss.HdiffApk");
        }
    }

    /* renamed from: l13.b$f */
    public class C88363f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ rg4 f255359d;

        /* renamed from: e */
        public final /* synthetic */ Context f255360e;

        /* renamed from: l13.b$f$a */
        public class C88364a implements Runnable {
            public C88364a() {
            }

            public void run() {
                Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkMMDiffBoostInstall, have tinker update.");
                C88363f fVar = C88363f.this;
                C44563k0.m48979d(fVar.f255360e, fVar.f255359d.f259797e, (C47223a) null, false);
                int i = 129;
                C90737d.m113803k(C88363f.this.f255359d.f259809t == 4 ? 129 : 130);
                C115669n nVar = C115669n.INSTANCE;
                if (C88363f.this.f255359d.f259809t != 4) {
                    i = 130;
                }
                nVar.idkeyStat(614, (long) i, 1, false);
            }
        }

        public C88363f(C88357b bVar, rg4 rg4, Context context) {
            this.f255359d = rg4;
            this.f255360e = context;
        }

        public void run() {
            rg4 rg4 = this.f255359d;
            if (rg4 != null) {
                int i = rg4.f259809t;
                if ((i == 4 || i == 3) && C86013q1.m106450k(rg4.f259797e) && C90793a.m113860a(this.f255359d.f259797e) && C79645d.m96738n(this.f255359d.f259797e)) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C88364a());
                }
            }
        }
    }

    public boolean C10(C90585h hVar) {
        if (hVar == null || !hVar.mo118342a() || !hVar.mo118345d() || hVar.mo118343b() || hVar.mo118348f()) {
            Log.m105925i("MicroMsg.Updater.PluginUpdater", "checkTinkerSyncResponseVaild, no, response = %s", hVar);
            return false;
        }
        Log.m105925i("MicroMsg.Updater.PluginUpdater", "checkTinkerSyncResponseVaild, yes, response = %s", hVar);
        return true;
    }

    /* renamed from: CT */
    public boolean mo122732CT() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        return sharedPreferences.getInt("RedDotSettingTab", 0) == 1;
    }

    /* renamed from: EN */
    public String mo122733EN() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        return sharedPreferences.getString("KeyXUpdateVersion", "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String El0() {
        /*
            r6 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0024
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 != 0) goto L_0x0018
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x0018
            int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r3 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r0 != r3) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 != 0) goto L_0x0024
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r0 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            java.lang.String r3 = "MicroMsg.Updater.PluginUpdater"
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x0043
            bp3.p r0 = bp3.C79758p.f233760a
            bp3.f r5 = bp3.C104160f.RepairerConfig_Updater_TinkerBaseId_String
            java.lang.String r0 = r0.mo109884g(r5, r4)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 != 0) goto L_0x0043
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r1 = "getBasePatchId, repairerBaseId = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r2)
            return r0
        L_0x0043:
            java.lang.String r0 = a70.C79471a.f233023k
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r1 = "getBasePatchId, baseTinkerId = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l13.C88357b.El0():java.lang.String");
    }

    public void Hk0(C88690c cVar) {
        this.f255349g.add(cVar);
    }

    /* renamed from: JN */
    public boolean mo122736JN() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        return sharedPreferences.getInt("RedDotAboutWechatTab", 0) == 1;
    }

    /* renamed from: LP */
    public boolean mo122737LP() {
        rg4 m = C79645d.m96737m();
        Log.m105925i("MicroMsg.Updater.PluginUpdater", "isHasApkForMMDiffBoostInstall, dialogInfo = %s.", m);
        if (m != null && m.f259809t == 4 && C86013q1.m106450k(m.f259797e) && C90793a.m113860a(m.f259797e) && C79645d.m96738n(m.f259797e)) {
            boolean Xq0 = ((C88689b) C86312j.m106911c(C88689b.class)).Xq0(m);
            Log.m105925i("MicroMsg.Updater.PluginUpdater", "isApkHasUpdateIndialogInfo, isApkHasUpdateIndialogInfo = %s.", Boolean.valueOf(Xq0));
            if (!Xq0) {
                return true;
            }
        }
        return false;
    }

    public boolean Lv0() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        return sharedPreferences.getInt("RedDotCheckUpdateTab", 0) == 1;
    }

    /* renamed from: OZ */
    public void mo122739OZ() {
        Log.m105924i("MicroMsg.Updater.PluginUpdater", "clickSettingTabRedDot");
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        sharedPreferences.edit().putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
    }

    public int Qo0() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        return sharedPreferences.getInt("KeyCurrentUpdateVersion", 0);
    }

    public boolean Xq0(rg4 rg4) {
        Class cls = C88689b.class;
        if (rg4 == null) {
            Log.m105920e("MicroMsg.Updater.PluginUpdater", "isApkHasUpdateIndialogInfo, dialoginfo = null.");
            return false;
        } else if (Util.isNullOrNil(rg4.f259800h)) {
            Log.m105920e("MicroMsg.Updater.PluginUpdater", "isApkHasUpdateIndialogInfo, dialoginfo.oldApkMd5 = null.");
            C90737d.m113800h(1001, rg4.f259809t);
            return true;
        } else {
            if (rg4.f259809t == 4) {
                String g = C79645d.m96731g(C79645d.m96733i(MMApplicationContext.getContext()));
                Log.m105925i("MicroMsg.Updater.PluginUpdater", "checkTinkerBoostInstall, HdiffApk, oldApkMd5 is equal?: %s， dialogInfo.newApkPath = %s, oldApkMd5  = %s, dialogInfo.oldApkMd5 = %s.", Boolean.valueOf(rg4.f259800h.equalsIgnoreCase(g)), rg4.f259797e, g, rg4.f259800h);
                if (!rg4.f259800h.equalsIgnoreCase(g)) {
                    C79645d.m96730f(MMApplicationContext.getContext());
                    if (((C88689b) C86312j.m106911c(cls)).mo122746bQ()) {
                        ((C88689b) C86312j.m106911c(cls)).mo122745Zt(true);
                    }
                    C88880b.m110960b();
                    C90737d.m113797e();
                    return true;
                }
            } else {
                String g2 = C79645d.m96731g(C79645d.m96733i(MMApplicationContext.getContext()));
                Log.m105925i("MicroMsg.Updater.PluginUpdater", "isApkHasUpdateIndialogInfo, oldApkMd5 = %s.", g2);
                if (!rg4.f259800h.equalsIgnoreCase(g2)) {
                    C79645d.m96730f(MMApplicationContext.getContext());
                    if (((C88689b) C86312j.m106911c(cls)).mo122746bQ()) {
                        ((C88689b) C86312j.m106911c(cls)).mo122745Zt(true);
                    }
                    C88880b.m110960b();
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x010f A[LOOP:0: B:48:0x0109->B:50:0x010f, LOOP_END] */
    /* renamed from: Xu */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo122742Xu(tw0.C90585h r10, int r11, boolean r12) {
        /*
            r9 = this;
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r10 = (com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse) r10
            java.lang.String r0 = "not handle response"
            java.lang.String r1 = "MicroMsg.Updater.PluginUpdater"
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L_0x002b
            boolean r4 = r10.mo118342a()
            if (r4 == 0) goto L_0x002b
            boolean r4 = r10.mo118345d()
            if (r4 == 0) goto L_0x002b
            boolean r4 = r10.mo118343b()
            if (r4 != 0) goto L_0x002b
            boolean r4 = r10.mo118348f()
            if (r4 != 0) goto L_0x002b
            r10.f248353v = r3
            java.lang.String r4 = "handle response"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r4 = 1
            goto L_0x002f
        L_0x002b:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r4 = 0
        L_0x002f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onSceneEnd, hasUpdatePatch = "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            if (r4 == 0) goto L_0x00e5
            if (r10 == 0) goto L_0x00e5
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r5 = r10.f248340f
            r0[r3] = r5
            java.lang.String r5 = "TinkerSyncResponse packageType:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r0)
            x02.C91117e.m114298c(r10)
            r10.f248353v = r3
            r0 = 2
            if (r11 != 0) goto L_0x00bf
            java.lang.Integer r11 = r10.f248340f
            int r11 = r11.intValue()
            r5 = 4
            r6 = 3
            if (r11 == r6) goto L_0x006c
            java.lang.Integer r11 = r10.f248340f
            int r11 = r11.intValue()
            if (r11 != r5) goto L_0x0098
        L_0x006c:
            java.lang.String r11 = r10.f248349r     // Catch:{ Exception -> 0x0077 }
            java.lang.Integer r11 = java.lang.Integer.decode(r11)     // Catch:{ Exception -> 0x0077 }
            int r11 = r11.intValue()     // Catch:{ Exception -> 0x0077 }
            goto L_0x0079
        L_0x0077:
            r11 = 0
        L_0x0079:
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r8 = r10.f248349r
            r7[r3] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r7[r2] = r8
            java.lang.String r8 = "save update client version %s %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r8, r7)
            if (r11 == 0) goto L_0x0098
            java.lang.Class<m13.b> r1 = m13.C88689b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            m13.b r1 = (m13.C88689b) r1
            r1.mo122747cD(r11)
        L_0x0098:
            java.lang.Integer r11 = r10.f248340f
            int r11 = r11.intValue()
            if (r11 != r6) goto L_0x00a5
            r9.vx0(r10)
        L_0x00a3:
            r11 = 1
            goto L_0x00e9
        L_0x00a5:
            java.lang.Integer r11 = r10.f248340f
            int r11 = r11.intValue()
            if (r11 != r5) goto L_0x00b1
            r9.vx0(r10)
            goto L_0x00a3
        L_0x00b1:
            java.lang.Integer r11 = r10.f248340f
            int r11 = r11.intValue()
            if (r11 != r0) goto L_0x00e8
            n13.b r11 = n13.C88880b.f256362a
            r11.mo123267h(r10)
            goto L_0x00e8
        L_0x00bf:
            if (r11 == r2) goto L_0x00d2
            if (r11 != r0) goto L_0x00c4
            goto L_0x00d2
        L_0x00c4:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0[r3] = r11
            java.lang.String r11 = "not handle response unknown source=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r11, r0)
            goto L_0x00e8
        L_0x00d2:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0[r3] = r11
            java.lang.String r11 = "handle response source=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r11, r0)
            n13.b r11 = n13.C88880b.f256362a
            r11.mo123267h(r10)
            goto L_0x00e8
        L_0x00e5:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x00e8:
            r11 = 0
        L_0x00e9:
            if (r12 != 0) goto L_0x0103
            if (r10 != 0) goto L_0x0103
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131838222(0x7f11450e, float:1.9309661E38)
            java.lang.String r1 = r1.getString(r5)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r3)
            r0.show()
        L_0x0103:
            java.util.LinkedList<m13.c> r0 = r9.f255349g
            java.util.Iterator r0 = r0.iterator()
        L_0x0109:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0119
            java.lang.Object r1 = r0.next()
            m13.c r1 = (m13.C88690c) r1
            r1.mo118779a(r11, r10)
            goto L_0x0109
        L_0x0119:
            if (r12 == 0) goto L_0x011e
            if (r4 == 0) goto L_0x011e
            return r2
        L_0x011e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l13.C88357b.mo122742Xu(tw0.h, int, boolean):boolean");
    }

    /* renamed from: Yo */
    public void mo122743Yo() {
        Log.m105924i("MicroMsg.Updater.PluginUpdater", "clickBottomTabRedDot");
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        sharedPreferences.edit().putInt("RedDotBottomTab", 0).apply();
    }

    public void Z80() {
        Log.m105924i("MicroMsg.Updater.PluginUpdater", "clickCheckUpdateRedDot");
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        sharedPreferences.edit().putInt("RedDotCheckUpdateTab", 0).putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
    }

    /* renamed from: Zt */
    public void mo122745Zt(boolean z) {
        Log.m105924i("MicroMsg.Updater.PluginUpdater", "clickManualUpdaterTabRedDot");
        if (z) {
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
            sharedPreferences.edit().putInt("RedCheckManualUpdaterTab", 0).putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
            return;
        }
        SharedPreferences sharedPreferences2 = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences2, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        sharedPreferences2.edit().putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
    }

    /* renamed from: bQ */
    public boolean mo122746bQ() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        return sharedPreferences.getInt("RedCheckManualUpdaterTab", 0) == 1;
    }

    /* renamed from: cD */
    public void mo122747cD(int i) {
        Log.m105925i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDotWhenMMDiff %s", Integer.valueOf(i));
        if (i != 0) {
            C115669n.INSTANCE.idkeyStat(1429, 25, 1, false);
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
            sharedPreferences.edit().putInt("KeyTinkerPatchVersion", i).putInt("RedCheckManualUpdaterTab", 1).putInt("RedDotAboutWechatTab", 1).apply();
            return;
        }
        C115669n.INSTANCE.idkeyStat(1429, 26, 1, false);
    }

    /* renamed from: eJ */
    public boolean mo122748eJ() {
        return true;
    }

    /* renamed from: eN */
    public void mo122749eN(C88690c cVar) {
        this.f255349g.remove(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String ef0() {
        /*
            r5 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0024
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 != 0) goto L_0x0018
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x0018
            int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r3 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r0 != r3) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 != 0) goto L_0x0024
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r0 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0043
            bp3.p r0 = bp3.C79758p.f233760a
            bp3.f r4 = bp3.C104160f.RepairerConfig_Updater_TinkerPatchId_String
            java.lang.String r0 = r0.mo109884g(r4, r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x0043
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r1 = "MicroMsg.Updater.PluginUpdater"
            java.lang.String r3 = "getBasePatchId, repairerPatchId = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
            return r0
        L_0x0043:
            java.lang.String r0 = a70.C79471a.m96436a()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l13.C88357b.ef0():java.lang.String");
    }

    /* renamed from: en */
    public LinkedList<C90430p93> mo122751en() {
        return C91363f.m114614b();
    }

    /* renamed from: er */
    public boolean mo122752er(Context context) {
        if (ChannelUtil.isGPVersion()) {
            Log.m105920e("MicroMsg.Updater.PluginUpdater", "doAddDownloadTask fail, GP Version not allowed to download");
            return false;
        } else if (!NetStatusUtil.isNetworkConnected(context)) {
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "doAddDownloadTask fail, network not ready");
            return false;
        } else if (!C86709a0.m107535s().mo121147n()) {
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "doAddDownloadTask fail, sdcard not ready");
            return false;
        } else if (C40940o.m44348a(262144000) || C40940o.m44350c(262144000)) {
            return true;
        } else {
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "doAddDownloadTask fail, not enough space, require size = 262144000");
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e7  */
    /* renamed from: gD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122753gD(int r24, android.content.Context r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r24)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "MicroMsg.Updater.PluginUpdater"
            java.lang.String r6 = "manualCheckUpdate %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r6 = r25
            r3.<init>(r6)
            r0.f255350h = r3
            qo3.g r3 = r0.f255351i
            if (r3 == 0) goto L_0x002f
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = "checkHdiffInstall.HdiffApk update dialog is showing."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r3 = 1
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            r6 = 2
            if (r3 == 0) goto L_0x0035
            goto L_0x00e1
        L_0x0035:
            te3.xf2 r3 = b12.C79645d.m96735k()
            if (r3 != 0) goto L_0x003c
            goto L_0x0082
        L_0x003c:
            te3.xf2 r3 = b12.C79645d.m96735k()
            if (r3 != 0) goto L_0x0043
            goto L_0x006a
        L_0x0043:
            long r7 = r3.f186298h
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Long r11 = java.lang.Long.valueOf(r9)
            r3[r5] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r7)
            r3[r2] = r11
            java.lang.String r11 = "MicroMsg.UpdateUtil"
            java.lang.String r12 = "Hdiffapk, isNeedShowTinkerDialog now:%d last:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r3)
            long r9 = r9 - r7
            r7 = 30000(0x7530, double:1.4822E-319)
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            r3 = 1
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r3 == 0) goto L_0x006c
        L_0x006a:
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            if (r3 == 0) goto L_0x0073
            b12.C79645d.m96729e()
            goto L_0x0082
        L_0x0073:
            boolean r3 = b12.C79645d.m96739o()
            if (r3 == 0) goto L_0x007a
            goto L_0x0080
        L_0x007a:
            boolean r3 = b12.C79645d.m96740p()
            if (r3 == 0) goto L_0x0082
        L_0x0080:
            r3 = 0
            goto L_0x0083
        L_0x0082:
            r3 = 1
        L_0x0083:
            if (r3 != 0) goto L_0x00e3
            java.lang.String r3 = "Hdiffapk, isCanUpdateDialogShow false."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)
            boolean r3 = b12.C79645d.m96739o()
            r4 = 2131838217(0x7f114509, float:1.9309651E38)
            r7 = 2131821556(0x7f1103f4, float:1.9275859E38)
            if (r3 == 0) goto L_0x00b9
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = r8.getString(r4)
            qo3.q r8 = new qo3.q
            r8.<init>(r3)
            r8.mo107595g(r4)
            r8.mo107601m(r7)
            l13.c r3 = new l13.c
            r3.<init>(r0)
            r8.mo107600l(r3)
            r8.mo107603o()
            goto L_0x00e1
        L_0x00b9:
            boolean r3 = b12.C79645d.m96740p()
            if (r3 == 0) goto L_0x00e1
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = r8.getString(r4)
            qo3.q r8 = new qo3.q
            r8.<init>(r3)
            r8.mo107595g(r4)
            r8.mo107601m(r7)
            l13.c r3 = new l13.c
            r3.<init>(r0)
            r8.mo107600l(r3)
            r8.mo107603o()
        L_0x00e1:
            r3 = 0
            goto L_0x00e4
        L_0x00e3:
            r3 = 1
        L_0x00e4:
            if (r3 != 0) goto L_0x00e7
            return
        L_0x00e7:
            qo3.i0 r3 = r0.f255352j
            r4 = 0
            if (r3 == 0) goto L_0x00f1
            r3.dismiss()
            r0.f255352j = r4
        L_0x00f1:
            java.lang.ref.WeakReference<android.content.Context> r3 = r0.f255350h
            if (r3 == 0) goto L_0x010b
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L_0x010b
            java.lang.ref.WeakReference<android.content.Context> r3 = r0.f255350h
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r7 = r0.f255353n
            qo3.i0 r3 = qo3.C89779i0.m112248e(r3, r7, r5, r5, r4)
            r0.f255352j = r3
        L_0x010b:
            n13.h r3 = new n13.h
            java.lang.String r4 = r23.El0()
            java.lang.String r5 = r23.ef0()
            java.util.LinkedList r7 = y02.C91363f.m114614b()
            r3.<init>(r4, r5, r7, r1)
            ob0.b0 r4 = f40.C86709a0.m107524d()
            r4.mo123460f(r3)
            if (r1 != r6) goto L_0x0132
            kj2.d r7 = kj2.C117407d.INSTANCE
            r8 = 1429(0x595, double:7.06E-321)
            r10 = 14
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
            goto L_0x0150
        L_0x0132:
            if (r1 != r2) goto L_0x0142
            kj2.d r15 = kj2.C117407d.INSTANCE
            r16 = 1429(0x595, double:7.06E-321)
            r18 = 15
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            goto L_0x0150
        L_0x0142:
            if (r1 != 0) goto L_0x0150
            kj2.d r1 = kj2.C117407d.INSTANCE
            r2 = 1429(0x595, double:7.06E-321)
            r4 = 16
            r6 = 1
            r8 = 0
            r1.idkeyStat(r2, r4, r6, r8)
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l13.C88357b.mo122753gD(int, android.content.Context):void");
    }

    public HashMap<String, Object> gd0() {
        String str;
        String str2;
        int i;
        if (C89625d.f257843i) {
            Log.m105925i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, is GP version: %s", Integer.valueOf(C89625d.f257841g));
            return null;
        } else if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, isTeenMode()");
            return null;
        } else if (!((C88689b) C86312j.m106911c(C88689b.class)).mo122748eJ()) {
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, openUpdater = false.");
            return null;
        } else {
            HashMap<String, Object> hashMap = new HashMap<>();
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_full_pkg_update_default_params, "");
            if (Util.isNullOrNil(Y60)) {
                Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, tabConfig = null.");
                return null;
            }
            JSONObject jSONObject = new JSONObject(Y60);
            int parseInt = Integer.parseInt(jSONObject.getString("minBaseApk").substring(2), 16);
            int i2 = C89625d.f257841g;
            String string = jSONObject.getString("updateWebviewUrl");
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, minBaseApk = " + parseInt + "updateWebviewUrl = " + string);
            if (parseInt <= i2 || Util.isNullOrNil(string)) {
                return null;
            }
            try {
                str = jSONObject.getString("dialogTipsContent");
            } catch (Exception unused) {
                str = "";
            }
            try {
                if (Util.isNullOrNil(str)) {
                    Log.m105924i("MicroMsg.Updater.PluginUpdater", "without dialog content, no show dialog.");
                    return hashMap;
                }
                try {
                    str2 = jSONObject.getString("downloadUrl");
                } catch (Exception unused2) {
                    str2 = "";
                }
                if (Util.isNullOrNil(str2)) {
                    Log.m105924i("MicroMsg.Updater.PluginUpdater", "without downloadUrl, no show dialog.");
                    return hashMap;
                }
                hashMap.put("task_url", str2);
                hashMap.put("page_url", string);
                hashMap.put("dialog_tips_content", str);
                Bundle e = C116102h.m163385e(string.toLowerCase());
                hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, e.get(ProviderConstants.API_COLNAME_FEATURE_VERSION));
                try {
                    i = Integer.parseInt("" + e.get(ProviderConstants.API_COLNAME_FEATURE_VERSION));
                } catch (Exception unused3) {
                    i = 0;
                }
                if (i > 0) {
                    hashMap.put("task_name", MMApplicationContext.getContext().getResources().getString(C0966R.string.btk, new Object[]{ChannelUtil.formatVersion(MMApplicationContext.getContext(), i)}));
                } else {
                    hashMap.put("task_name", MMApplicationContext.getContext().getResources().getString(C0966R.string.btj));
                }
                Log.m105925i("MicroMsg.Updater.PluginUpdater", "results = %s.", hashMap);
                return hashMap;
            } catch (Exception e2) {
                Log.m105929w("MicroMsg.Updater.PluginUpdater", "parse tabconfig failed: %s", e2.getMessage());
            }
        }
    }

    /* renamed from: gw */
    public void mo122755gw(int i) {
        Log.m105925i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDot %s", Integer.valueOf(i));
        if (i != 0) {
            C115669n.INSTANCE.idkeyStat(1429, 25, 1, false);
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
            sharedPreferences.edit().putString("KeyXUpdateVersion", "").putInt("KeyCurrentUpdateVersion", i).putInt("RedDotCheckUpdateTab", 1).putInt("RedDotAboutWechatTab", 1).putInt("RedDotSettingTab", 1).putInt("RedDotBottomTab", 1).apply();
            return;
        }
        C115669n.INSTANCE.idkeyStat(1429, 26, 1, false);
    }

    /* renamed from: h7 */
    public void mo122756h7(int i) {
        Log.m105925i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDot %s", Integer.valueOf(i));
        if (i != 0) {
            C115669n.INSTANCE.idkeyStat(1429, 25, 1, false);
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
            sharedPreferences.edit().putInt("KeyCurrentUpdateVersion", i).putInt("RedDotCheckUpdateTab", 1).apply();
            return;
        }
        C115669n.INSTANCE.idkeyStat(1429, 26, 1, false);
    }

    /* renamed from: jc */
    public boolean mo122757jc() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        return sharedPreferences.getInt("RedDotBottomTab", 0) == 1;
    }

    public int k70() {
        if (C89625d.f257843i) {
            Log.m105925i("MicroMsg.Updater.PluginUpdater", "is GP version: %s", Integer.valueOf(C89625d.f257841g));
            return -1;
        } else if (!((C88689b) C86312j.m106911c(C88689b.class)).mo122748eJ()) {
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "openUpdater = false.");
            return -1;
        } else {
            try {
                String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_full_pkg_update_default_params, "");
                if (!Util.isNullOrNil(Y60)) {
                    return Integer.parseInt(new JSONObject(Y60).getString("minBaseApk").substring(2), 16);
                }
                Log.m105924i("MicroMsg.Updater.PluginUpdater", "tabConfig = null.");
                return -1;
            } catch (Exception e) {
                Log.m105929w("MicroMsg.Updater.PluginUpdater", "parse tabconfig failed: %s", e.getMessage());
                return -1;
            }
        }
    }

    /* renamed from: nd */
    public boolean mo122759nd() {
        Context context = MMApplicationContext.getContext();
        rg4 m = C79645d.m96737m();
        Log.m105925i("MicroMsg.Updater.PluginUpdater", "checkMMDiffBoostInstall, dialogInfo = %s.", m);
        if (m == null) {
            return false;
        }
        Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkMMDiffBoostInstall, have tinker update.");
        ((C119157j) C119157j.f356862d).mo183875f(new C88363f(this, m, context));
        return false;
    }

    /* renamed from: nl */
    public boolean mo122760nl(String str) {
        Log.m105925i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDotWhenXUpdate %s", str);
        if (!Util.isNullOrNil(str)) {
            boolean z = !mo122757jc();
            if (!mo122732CT()) {
                z = true;
            }
            if (!mo122736JN()) {
                z = true;
            }
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
            sharedPreferences.edit().putString("KeyXUpdateVersion", str).putInt("RedCheckManualUpdaterTab", 1).putInt("RedDotAboutWechatTab", 1).putInt("RedDotSettingTab", 1).putInt("RedDotBottomTab", 1).apply();
            return z;
        }
        C115669n.INSTANCE.idkeyStat(1429, 26, 1, false);
        return false;
    }

    public void onAccountInitialized(Context context) {
        C88880b.m110961c();
    }

    public void onAccountReleased(Context context) {
    }

    public void onCreate(Context context) {
        synchronized (this.f255347e) {
            this.f255347e[0] = new C88359b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r1.hasMessages(r3.f255346d) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkMMdiffUpdatePatchPkgVersion hasMessages.");
        r3.f255347e[0].removeMessages(r3.f255346d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r0 = android.os.Message.obtain();
        r0.what = r3.f255346d;
        r0.arg1 = r4 ? 1 : 0;
        r0.arg2 = r5 ? 1 : 0;
        r4 = r3.f255347e[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r6 == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r5 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        r4.sendMessageDelayed(r0, r5);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkMMdiffUpdatePatchPkgVersion send.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        return;
     */
    /* renamed from: qt */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122761qt(boolean r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            java.lang.Class<m13.b> r0 = m13.C88689b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            m13.b r0 = (m13.C88689b) r0
            boolean r0 = r0.mo122748eJ()
            if (r0 != 0) goto L_0x0016
            java.lang.String r4 = "MicroMsg.Updater.PluginUpdater"
            java.lang.String r5 = "checkMMdiffUpdatePatchPkgVersion， openUpdater = false."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            return
        L_0x0016:
            com.tencent.mm.sdk.platformtools.MMHandler[] r0 = r3.f255347e
            monitor-enter(r0)
            com.tencent.mm.sdk.platformtools.MMHandler[] r1 = r3.f255347e     // Catch:{ all -> 0x0064 }
            r2 = 0
            r1 = r1[r2]     // Catch:{ all -> 0x0064 }
            if (r1 != 0) goto L_0x0029
            java.lang.String r4 = "MicroMsg.Updater.PluginUpdater"
            java.lang.String r5 = "[-] Unexpected that mmHandler is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            int r0 = r3.f255346d
            boolean r0 = r1.hasMessages(r0)
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "MicroMsg.Updater.PluginUpdater"
            java.lang.String r1 = "checkMMdiffUpdatePatchPkgVersion hasMessages."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.sdk.platformtools.MMHandler[] r0 = r3.f255347e
            r0 = r0[r2]
            int r1 = r3.f255346d
            r0.removeMessages(r1)
        L_0x0042:
            android.os.Message r0 = android.os.Message.obtain()
            int r1 = r3.f255346d
            r0.what = r1
            r0.arg1 = r4
            r0.arg2 = r5
            com.tencent.mm.sdk.platformtools.MMHandler[] r4 = r3.f255347e
            r4 = r4[r2]
            if (r6 == 0) goto L_0x0057
            r5 = 0
            goto L_0x0059
        L_0x0057:
            r5 = 3000(0xbb8, double:1.482E-320)
        L_0x0059:
            r4.sendMessageDelayed(r0, r5)
            java.lang.String r4 = "MicroMsg.Updater.PluginUpdater"
            java.lang.String r5 = "checkMMdiffUpdatePatchPkgVersion send."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            return
        L_0x0064:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l13.C88357b.mo122761qt(boolean, boolean, boolean):void");
    }

    /* renamed from: sH */
    public void mo122762sH() {
        Log.m105924i("MicroMsg.Updater.PluginUpdater", "clickAboutWechatRedDot");
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        sharedPreferences.edit().putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
    }

    /* renamed from: ta */
    public void mo122763ta() {
        if (this.f255348f) {
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkInitTpcConfig but has init");
        }
        VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
        String i = C112760b.m154236i0("TPCFileTemp").mo119971i();
        C87412m.m108594g(i, SharePatchInfo.OAT_DIR);
        C88951g.f256529b = i;
        C88946c.f256524a = new C88358a(this);
        this.f255348f = true;
        Log.m105924i("MicroMsg.Updater.PluginUpdater", "initTpcConfig success");
    }

    public final boolean vx0(TinkerSyncResponse tinkerSyncResponse) {
        boolean z;
        if (!((C88689b) C86312j.m106911c(C88689b.class)).mo122748eJ()) {
            return false;
        }
        C77398g gVar = this.f255351i;
        if (gVar == null || !gVar.isShowing()) {
            z = false;
        } else {
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk update dialog is showing.");
            z = true;
        }
        if (z) {
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk update dialog is showing.");
            return false;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            wx0(tinkerSyncResponse);
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(new C88360c(tinkerSyncResponse));
        }
        return false;
    }

    public void ws0() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
        sharedPreferences.edit().putString("KeyXUpdateVersion", "").apply();
    }

    public final void wx0(TinkerSyncResponse tinkerSyncResponse) {
        C77398g gVar = this.f255351i;
        if (gVar == null || !gVar.isShowing()) {
            boolean z = tinkerSyncResponse.mo118353j() == 4;
            MMApplicationContext.getContext();
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk show update dialog");
            C77426q qVar = new C77426q(MMApplicationContext.getContext());
            qVar.mo107595g(Util.isNullOrNil(tinkerSyncResponse.mo118352i()) ? MMApplicationContext.getContext().getString(C0966R.string.k7q) : tinkerSyncResponse.mo118352i());
            qVar.mo107601m(C0966R.string.f0j);
            qVar.mo107589a(true);
            qVar.mo107590b(new C88361d(this, tinkerSyncResponse, z));
            qVar.mo107593e(new C88362e(this));
            qVar.mo107603o();
            C89779i0 i0Var = this.f255352j;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f255352j = null;
            }
            this.f255351i = qVar.f225839c;
            C90737d.m113803k(z ? 108 : ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR);
            C115669n.INSTANCE.idkeyStat(614, z ? 108 : 308, 1, false);
            return;
        }
        Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk update dialog is showing.");
    }

    /* renamed from: x9 */
    public String mo122767x9(boolean z) {
        Class cls = C88689b.class;
        String str = "";
        if (C89625d.f257843i) {
            Log.m105925i("MicroMsg.Updater.PluginUpdater", "is GP version: %s", Integer.valueOf(C89625d.f257841g));
            return str;
        } else if (!((C88689b) C86312j.m106911c(cls)).mo122748eJ()) {
            Log.m105924i("MicroMsg.Updater.PluginUpdater", "openUpdater = false.");
            return str;
        } else {
            try {
                String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_full_pkg_update_default_params, str);
                if (Util.isNullOrNil(Y60)) {
                    Log.m105924i("MicroMsg.Updater.PluginUpdater", "tabConfig = null.");
                    return str;
                }
                JSONObject jSONObject = new JSONObject(Y60);
                int parseInt = Integer.parseInt(jSONObject.getString("minBaseApk").substring(2), 16);
                int i = C89625d.f257841g;
                String string = jSONObject.getString("updateWebviewUrl");
                try {
                    Log.m105925i("MicroMsg.Updater.PluginUpdater", "minBaseApk = %s, updateWebviewUrl = %s.", Integer.valueOf(parseInt), string);
                    if (parseInt > i) {
                        if (!Util.isNullOrNil(string)) {
                            if (z) {
                                ((C88689b) C86312j.m106911c(cls)).mo122756h7(parseInt);
                                return string;
                            }
                            ((C88689b) C86312j.m106911c(cls)).mo122755gw(parseInt);
                            return string;
                        }
                    }
                    return str;
                } catch (Exception e) {
                    e = e;
                    str = string;
                    Log.m105929w("MicroMsg.Updater.PluginUpdater", "parse tabconfig failed: %s", e.getMessage());
                    return str;
                }
            } catch (Exception e2) {
                e = e2;
                Log.m105929w("MicroMsg.Updater.PluginUpdater", "parse tabconfig failed: %s", e.getMessage());
                return str;
            }
        }
    }

    /* renamed from: xa */
    public void mo122768xa(int i) {
        Log.m105925i("MicroMsg.Updater.PluginUpdater", "autoCheckUpdate %s", Integer.valueOf(i));
        C86709a0.m107524d().mo123460f(new C91361e(El0(), ef0(), C91363f.m114614b(), true));
    }

    /* renamed from: xu */
    public void mo122769xu(int i) {
        Log.m105925i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDotWhenMMDiff %s", Integer.valueOf(i));
        if (i != 0) {
            C115669n.INSTANCE.idkeyStat(1429, 25, 1, false);
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
            sharedPreferences.edit().putString("KeyXUpdateVersion", "").putInt("KeyTinkerPatchVersion", i).putInt("RedCheckManualUpdaterTab", 1).putInt("RedDotAboutWechatTab", 1).putInt("RedDotSettingTab", 1).putInt("RedDotBottomTab", 1).apply();
            return;
        }
        C115669n.INSTANCE.idkeyStat(1429, 26, 1, false);
    }

    /* renamed from: ya */
    public boolean mo122770ya(Context context, String str) {
        Log.m105924i("MicroMsg.Updater.PluginUpdater", "HdiffApk checkAndShowInstallPatchDialog, newApkMd5 = " + str);
        String l = C79645d.m96736l(str);
        if (!C86013q1.m106450k(l) || !C90793a.m113860a(l) || !C79645d.m96738n(l)) {
            return false;
        }
        Log.m105924i("MicroMsg.Updater.PluginUpdater", "checkAndShowInstallPatchDialog apk ready %s." + l);
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(context.getString(C0966R.string.f8201ad));
        qVar.mo107602n(context.getString(C0966R.string.f8200ac));
        qVar.mo107598j(context.getString(C0966R.string.f8199f));
        qVar.mo107600l(new C88367e(this, l));
        qVar.mo107603o();
        return true;
    }
}
