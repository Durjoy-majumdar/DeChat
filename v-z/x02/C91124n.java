package x02;

import a12.C27734k;
import a12.C79450b;
import a70.C112760b;
import a70.C79471a;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import b12.C0242c;
import b12.C79644b;
import b12.C79645d;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80590e1;
import com.tencent.p014mm.modelmulti.C81003a;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.plugin.p064hp.mmdiff.MMDiffPatchResultService;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import cy3.C58003b;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import iv3.C87821a;
import iv3.C87825c;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m13.C88689b;
import p1054vg.C90793a;
import p206nj.C88955f;
import p206nj.C88956h;
import p918s2.C90116e;
import te3.C52049y03;
import te3.rg4;
import v02.C90734a;
import v02.C90735b;
import v02.C90737d;
import w02.C90879c;
import w02.C90882e;
import zt3.C119157j;

/* renamed from: x02.n */
public class C91124n implements C40952u {

    /* renamed from: d */
    public final TinkerSyncResponse f261324d;

    /* renamed from: e */
    public long f261325e;

    /* renamed from: f */
    public boolean f261326f = false;

    /* renamed from: g */
    public HashMap<Long, Long> f261327g = new HashMap<>();

    /* renamed from: h */
    public HashMap<String, Boolean> f261328h = new HashMap<>();

    /* renamed from: i */
    public HashMap<Long, String> f261329i = new HashMap<>();

    /* renamed from: j */
    public volatile boolean f261330j = false;

    /* renamed from: n */
    public volatile boolean f261331n = false;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger() == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91124n(com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse r4) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f261326f = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.f261327g = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.f261328h = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.f261329i = r1
            r3.f261330j = r0
            r3.f261331n = r0
            r3.f261324d = r4
            com.tencent.mm.plugin.downloader.model.l r4 = com.tencent.p014mm.plugin.downloader.model.C40935l.m44326g()
            r4.mo63955a(r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r1 = 1
            if (r4 != 0) goto L_0x0048
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r4 != 0) goto L_0x003f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r4 != 0) goto L_0x003f
            int r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r2 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r4 != r2) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r4 = 0
            goto L_0x0040
        L_0x003f:
            r4 = 1
        L_0x0040:
            if (r4 != 0) goto L_0x0048
            boolean r4 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r4 == 0) goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            if (r0 == 0) goto L_0x005d
            bp3.p r4 = bp3.C79758p.f233760a
            bp3.f r0 = bp3.C104160f.RepairerConfig_Updater_MMdiffCgi_String
            java.lang.String r2 = ""
            java.lang.String r4 = r4.mo109884g(r0, r2)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x005d
            r3.f261326f = r1
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x02.C91124n.<init>(com.tencent.mm.plugin.hp.util.TinkerSyncResponse):void");
    }

    /* renamed from: B */
    public void mo1796B(long j, String str, long j2, long j3) {
        long j4 = j3;
        Log.m105919d("Tinker.SyncResponseProcessor", "onTaskProgressChanged taskId:%d", Long.valueOf(j));
        if (this.f261324d.mo118353j() == 4) {
            this.f261327g.put(Long.valueOf(j), Long.valueOf(j2));
            String str2 = this.f261329i.get(Long.valueOf(j));
            try {
                File file = new File(C86013q1.m106448i(str2, false));
                Log.m105924i("Tinker.SyncResponseProcessor", "onTaskProgressChanged = filePath = " + str2 + "， is file exist = " + file.exists() + "， 长度 " + file.length() + ", recvLen = " + ((j2 / 1024) / 1024) + "MB, totalLen = " + j4);
                if (j4 > C90734a.f260610a * 2) {
                    C90734a.f260610a = j4 / 2;
                }
                if (!this.f261330j && j2 > C90734a.f260610a && file.exists()) {
                    if (this.f261326f) {
                        Toast.makeText(MMApplicationContext.getContext(), "read OldDeltaFriendFile and download 50%", 0).show();
                    }
                    this.f261330j = true;
                    this.f261328h.put(str2, Boolean.FALSE);
                    C90734a.m113784a(file.getAbsolutePath(), new n$$f(this, str2, file, j));
                }
            } catch (Exception e) {
                Log.m105924i("Tinker.SyncResponseProcessor", "onTaskProgressChanged = filePath = " + str2 + "， is file exist = " + e);
            }
        }
    }

    /* renamed from: D */
    public void mo1797D(long j) {
        Log.m105925i("Tinker.SyncResponseProcessor", "onTaskRemoved taskId:%d", Long.valueOf(j));
        C40935l.m44326g().mo63969q(this);
        TinkerSyncResponse tinkerSyncResponse = this.f261324d;
        if (tinkerSyncResponse != null && tinkerSyncResponse.mo118353j() == 4) {
            Log.m105925i("Tinker.SyncResponseProcessor", "HdiffApk, onTaskRemoved taskId:%d", Long.valueOf(j));
            C90737d.m113803k(127);
            C115669n.INSTANCE.idkeyStat(614, 127, 1, false);
        }
    }

    /* renamed from: O */
    public void mo1798O(long j) {
    }

    /* renamed from: Q */
    public void mo1799Q(long j, String str) {
        Log.m105919d("Tinker.SyncResponseProcessor", "onTaskResumed taskId:%d filePath:%s", Long.valueOf(j), str);
    }

    /* renamed from: S */
    public void mo1800S(long j) {
        Log.m105919d("Tinker.SyncResponseProcessor", "onTaskPaused taskId:%d", Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo125183a(TinkerSyncResponse tinkerSyncResponse, boolean z) {
        String str;
        Context context = MMApplicationContext.getContext();
        String string = Util.isNullOrNil(tinkerSyncResponse.f248350s) ? context.getString(C0966R.string.a2_) : tinkerSyncResponse.f248350s;
        String str2 = Util.isNullOrNil(tinkerSyncResponse.f248351t) ? "" : tinkerSyncResponse.f248351t;
        if (Util.isNullOrNil(tinkerSyncResponse.f248352u)) {
            str = HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
        } else {
            str = tinkerSyncResponse.f248352u;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClassName(MMApplicationContext.getPackageName(), MMApplicationContext.getSourcePackageName() + "." + "plugin." + "webview" + ".ui.tools.WebViewUI");
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.setFlags(872415232);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 268435456);
        C90116e.C90121c cVar = new C90116e.C90121c(context, "reminder_channel_id");
        cVar.mo124390o((CharSequence) null);
        cVar.f258814z.when = System.currentTimeMillis();
        cVar.mo124383h(string);
        cVar.mo124382g(str2);
        cVar.f258795g = activity;
        cVar.f258814z.icon = C0966R.C0969drawable.c9k;
        Notification b = cVar.mo124378b();
        b.flags |= 16;
        if (z) {
            ((NotificationManager) context.getSystemService("notification")).notify(19841110, b);
        } else {
            Log.m105924i("Tinker.SyncResponseProcessor", "ignore action when load from cache,when response is alpha version");
        }
    }

    /* renamed from: b */
    public final void mo125184b(File file) {
        ShareSecurityCheck shareSecurityCheck = new ShareSecurityCheck(MMApplicationContext.getContext());
        boolean z = false;
        try {
            z = shareSecurityCheck.verifyPatchMetaSignature(file);
        } catch (Exception e) {
            Log.printErrStackTrace("Tinker.SyncResponseProcessor", e, "verify patch signature failed.", new Object[0]);
            C115669n.INSTANCE.idkeyStat(614, 39, 1, false);
        }
        if (!z) {
            Log.m105924i("Tinker.SyncResponseProcessor", "verify patch signature failed, tinker.");
            C38431f.m41871b(2);
            C115669n.INSTANCE.idkeyStat(614, 31, 1, false);
            return;
        }
        Log.m105924i("Tinker.SyncResponseProcessor", "onReceiveUpgradePatch. try to start apply");
        if (MMApplicationContext.isToolsIsolatedProcess()) {
            return;
        }
        if (CrashReportFactory.isOnlinePatchBlocked()) {
            Log.m105928w("Tinker.SyncResponseProcessor", "[tomys] patch applying is blocked by assist.");
        } else if (!C80590e1.C28678b.f78659a.mo112297a()) {
            Log.m105928w("Tinker.SyncResponseProcessor", "patch applying is blocked by TinkerEnsuranceOnFault, update basepack with different clientver to recover.");
        } else {
            HashMap<String, String> packagePropertiesIfPresent = shareSecurityCheck.getPackagePropertiesIfPresent();
            if (packagePropertiesIfPresent != null) {
                String str = packagePropertiesIfPresent.get("patch.client.ver");
                if (!TextUtils.isEmpty(str)) {
                    C79450b bVar = new C79450b(C79471a.f233015c, str);
                    bVar.mo109428f(bVar.mo109423a(2));
                } else {
                    Log.m105920e("Tinker.SyncResponseProcessor", "[-] Fail to get patch clientversion.");
                }
            }
            C87825c.m109282a(MMApplicationContext.getContext(), file.getAbsolutePath());
        }
    }

    /* renamed from: c */
    public final void mo125185c(File file, long j) {
        String str = this.f261329i.get(Long.valueOf(j));
        if (str == null || this.f261328h.get(str) == null || this.f261328h.get(str).booleanValue()) {
            this.f261328h.remove(str);
            TinkerSyncResponse tinkerSyncResponse = this.f261324d;
            tinkerSyncResponse.f248353v = true;
            if (tinkerSyncResponse.f248355x) {
                C90734a.m113788e("mmdiff_apk_has_update_notify", tinkerSyncResponse.mo118354m(), 4);
            }
            Map<String, String> map = C79645d.f233530a;
            boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_upgrade_force_stop_auto_update, 0) == 1;
            Log.m105925i("Tinker.SyncResponseProcessor", "isForceStopAutoMerge = %s, syncResponse = %s.", Boolean.valueOf(z), this.f261324d);
            if (!z) {
                if (this.f261326f) {
                    Toast.makeText(MMApplicationContext.getContext(), "finish download, and start merge patch", 1).show();
                }
                C79645d.m96726b(this.f261324d);
                ((C90882e) C90879c.m113993a(MMApplicationContext.getContext()).f260860b).mo124981a(file.getAbsolutePath(), this.f261324d, false);
                MMDiffPatchResultService.f248324f = new n$$e(this);
            }
        }
    }

    /* renamed from: d */
    public void mo1801d(long j, int i, boolean z) {
        Log.m105928w("Tinker.SyncResponseProcessor", "onTaskFailed");
        long j2 = this.f261325e;
        if (j2 != j) {
            Log.m105925i("Tinker.SyncResponseProcessor", "onTaskFailed ignore. id is no equal. download id :%s callback id:%s", Long.valueOf(j2), Long.valueOf(j));
            return;
        }
        C38431f.m41871b(2);
        if (this.f261324d.mo118353j() == 3) {
            C115669n.INSTANCE.idkeyStat(614, 51, 1, false);
        } else if (this.f261324d.mo118353j() == 4) {
            Log.m105925i("Tinker.SyncResponseProcessor", "HdiffApk, onTaskFailed taskId:%d", Long.valueOf(j));
            C90737d.m113803k(126);
            C115669n.INSTANCE.idkeyStat(614, 126, 1, false);
        }
        C40935l.m44326g().mo63969q(this);
    }

    /* renamed from: e */
    public final void mo125186e() {
        if (!C88956h.m111062c().equals("mounted")) {
            Log.m105920e("Tinker.SyncResponseProcessor", "no sdcard.");
            C115669n.INSTANCE.idkeyStat(614, 50, 1, false);
            C90737d.m113801i(10, this.f261324d.mo118353j(), 103);
            return;
        }
        if (!(this.f261324d.f248340f.intValue() == 4 ? C88955f.m111059c((long) (((int) new File(C79645d.m96733i(MMApplicationContext.getContext())).length()) * 4)) : C88955f.m111059c((long) this.f261324d.f248345n))) {
            Log.m105920e("Tinker.SyncResponseProcessor", "sdcard is full.");
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(614, 51, 1, false);
            if (this.f261324d.mo118353j() == 3 || this.f261324d.mo118353j() == 4) {
                nVar.idkeyStat(614, 55, 1, false);
                C90737d.m113801i(10, this.f261324d.mo118353j(), 104);
                return;
            }
            return;
        }
        if (this.f261326f) {
            Toast.makeText(MMApplicationContext.getContext(), "start download patch.", 0).show();
        }
        C79645d.m96727c(this.f261324d.f248340f.intValue(), 1);
        C90737d.m113800h(1, this.f261324d.f248340f.intValue());
        if (this.f261324d.mo118353j() == 4) {
            Log.m105924i("Tinker.SyncResponseProcessor", "hdiffApk syncResponse, newApkMd5 = " + this.f261324d.f248346o + ", oldApkMd5 = " + this.f261324d.f248347p);
        }
        if (this.f261324d.mo118353j() == 3 || this.f261324d.mo118353j() == 4) {
            String l = C79645d.m96736l(this.f261324d.f248346o);
            if (!Util.isNullOrNil(this.f261324d.f248346o) && C79645d.m96738n(l) && C90793a.m113860a(l)) {
                Context context = MMApplicationContext.getContext();
                if (this.f261326f) {
                    Toast.makeText(MMApplicationContext.getContext(), "apk hase merge success can not megre, Switch wechat from background to foreground..", 0).show();
                }
                String string = Util.isNullOrNil(this.f261324d.mo118352i()) ? context.getString(C0966R.string.k7d) : this.f261324d.mo118352i();
                rg4 rg4 = new rg4();
                rg4.f259796d = this.f261324d.f248344j;
                rg4.f259801i = context.getString(C0966R.string.f0j);
                rg4.f259803n = context.getString(C0966R.string.frd);
                rg4.f259804o = context.getString(C0966R.string.k6v);
                TinkerSyncResponse tinkerSyncResponse = this.f261324d;
                rg4.f259799g = tinkerSyncResponse.f248346o;
                rg4.f259800h = tinkerSyncResponse.f248347p;
                rg4.f259798f = tinkerSyncResponse.f248345n;
                rg4.f259805p = tinkerSyncResponse.f248342h;
                rg4.f259806q = tinkerSyncResponse.f248343i;
                rg4.f259809t = tinkerSyncResponse.f248340f.intValue();
                TinkerSyncResponse tinkerSyncResponse2 = this.f261324d;
                rg4.f259807r = tinkerSyncResponse2.f248348q;
                rg4.f259797e = l;
                try {
                    rg4.f259808s = C79645d.m96741q(tinkerSyncResponse2.f248349r);
                } catch (Exception unused) {
                }
                rg4.f259802j = string;
                C79645d.m96725a(rg4, this.f261324d);
                C79645d.m96744t(rg4);
                Log.m105925i("Tinker.SyncResponseProcessor", "HdiffApk, file is exist. need no to download. newApkMd5:%s", this.f261324d.f248346o);
                C90737d.m113800h(13, this.f261324d.mo118353j());
                return;
            }
        }
        C79645d.m96730f(MMApplicationContext.getContext());
        ((C119157j) C119157j.f356862d).mo183875f(new C0242c());
        C40939n nVar2 = new C40939n((C40939n.C2206a) null);
        TinkerSyncResponse tinkerSyncResponse3 = this.f261324d;
        nVar2.f110176a = tinkerSyncResponse3.f248342h;
        nVar2.f110179d = tinkerSyncResponse3.f248344j;
        nVar2.f110180e = tinkerSyncResponse3.f248343i;
        nVar2.f110184i = false;
        nVar2.f110186k = true;
        nVar2.f110181f = 2;
        nVar2.f110185j = false;
        long b = C40935l.m44326g().mo63956b(nVar2);
        this.f261325e = b;
        Log.m105925i("Tinker.SyncResponseProcessor", "Download task id is :%d", Long.valueOf(b));
        C115669n nVar3 = C115669n.INSTANCE;
        nVar3.idkeyStat(614, 2, 1, false);
        if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            nVar3.idkeyStat(614, 7, 1, false);
        } else {
            nVar3.idkeyStat(614, 8, 1, false);
        }
        if (this.f261324d.f248340f.intValue() == 2 && !Util.isNullOrNil(this.f261324d.f248349r)) {
            C79450b bVar = new C79450b(C79471a.f233015c, this.f261324d.f248349r);
            bVar.mo109428f(bVar.mo109423a(1));
            bVar.mo109425c(6, 0);
        }
        if (this.f261324d.f248340f.intValue() == 3) {
            nVar3.idkeyStat(614, 56, 1, false);
            Log.m105918d("Tinker.SyncResponseProcessor", "boots bsdiff download start silent.");
        }
        if (this.f261324d.f248340f.intValue() == 4) {
            C90737d.m113803k(124);
            nVar3.idkeyStat(614, 124, 1, false);
            Log.m105918d("Tinker.SyncResponseProcessor", "boots hdiff download start silent.");
            ((C90882e) C90879c.m113993a(MMApplicationContext.getContext()).f260860b).mo124981a("", this.f261324d, true);
        }
    }

    /* renamed from: f */
    public boolean mo125187f(boolean z) {
        boolean z2 = z;
        Log.m105925i("Tinker.SyncResponseProcessor", "process tinker response: %s", this.f261324d.toString());
        if (C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Updater_CloseAutoPatch_Int, 0) == 1) {
            return false;
        }
        if (!this.f261324d.mo118342a()) {
            Log.m105924i("Tinker.SyncResponseProcessor", "process check response fail, just return");
            return false;
        } else if (this.f261324d.mo118343b()) {
            Context context = MMApplicationContext.getContext();
            C87821a c = C87821a.m109275c(context);
            if (!c.f254239l) {
                Log.m105928w("Tinker.SyncResponseProcessor", "SyncResponseProcessor: onPatchRollback, tinker is not loaded, just return");
            } else {
                Log.m105924i("Tinker.SyncResponseProcessor", "tinker wait screen to clean patch and kill all process");
                new C81003a(MMApplicationContext.getContext(), new C91125o(this, context, c), false);
            }
            return true;
        } else if (!this.f261324d.mo118345d()) {
            return true;
        } else {
            if (this.f261324d.mo118348f()) {
                Log.m105928w("Tinker.SyncResponseProcessor", "is lower version skip.");
                C115669n.INSTANCE.idkeyStat(614, 78, 1, false);
                return true;
            }
            if (MMApplicationContext.isMainProcess()) {
                try {
                    int intValue = Integer.decode(C79471a.f233015c).intValue();
                    if (intValue >= 654316032 && intValue <= 654316287 && "vivo".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT == 29 && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_vivo_q_patch, 0) == 0) {
                        Log.m105928w("Tinker.SyncResponseProcessor", "[!] [tomys] Patch was blocked due to some compatibility issues.");
                        return true;
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("Tinker.SyncResponseProcessor", th, "[-] [tomys] Error happened in tmp ctrl code.", new Object[0]);
                }
            }
            if (CrashReportFactory.isOnlinePatchBlocked()) {
                Log.m105928w("Tinker.SyncResponseProcessor", "[tomys] patch downloading is blocked by assist.");
                return true;
            } else if (this.f261324d.f248340f.intValue() != 3 || Util.isNullOrNil(this.f261324d.f248349r) || Util.isNullOrNil(this.f261324d.f248352u) || !C79644b.m96724b(this.f261324d.f248349r)) {
                if (this.f261324d.f248340f.intValue() == 4) {
                    C91117e.m114298c(this.f261324d);
                }
                if ((C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Updater_DISABLEALPHA_Int, 0) == 1) || this.f261324d.f248340f.intValue() != 4 || Util.isNullOrNil(this.f261324d.f248349r) || !C79644b.m96724b(this.f261324d.f248349r) || Util.isNullOrNil(this.f261324d.f248352u)) {
                    TinkerSyncResponse tinkerSyncResponse = this.f261324d;
                    Log.m105925i("Tinker.SyncResponseProcessor", "check need show before download. network type:%d msg:%s clientversion:%s", tinkerSyncResponse.f248341g, tinkerSyncResponse.mo118352i(), this.f261324d.f248349r);
                    Context context2 = MMApplicationContext.getContext();
                    if (this.f261324d.f248341g.intValue() == 2 && NetStatusUtil.isMobile(MMApplicationContext.getContext())) {
                        TinkerSyncResponse tinkerSyncResponse2 = this.f261324d;
                        HashMap<Integer, LinkedList<C52049y03>> hashMap = tinkerSyncResponse2.f248339e;
                        if (hashMap != null && !hashMap.isEmpty() && tinkerSyncResponse2.f248339e.containsKey(4)) {
                            if (!C27734k.m37982a(context2, this.f261324d.f248344j)) {
                                if (this.f261324d.f248340f.intValue() == 2) {
                                    C78762x.m95149a(MMApplicationContext.getContext().getString(C0966R.string.f0j), MMApplicationContext.getContext().getString(C0966R.string.f0l, new Object[]{this.f261324d.mo118352i(), MMApplicationContext.getContext().getString(C0966R.string.f361481k73), Util.getSizeKB((long) this.f261324d.f248345n)}), MMApplicationContext.getContext().getString(C0966R.string.k77), new n$$c(this), MMApplicationContext.getContext().getString(C0966R.string.k6v), new n$$d(this, context2));
                                } else if (this.f261324d.f248340f.intValue() == 3 || this.f261324d.f248340f.intValue() == 4) {
                                    Log.m105925i("Tinker.SyncResponseProcessor", "showUpdateDialog syncResponse.packageType: %s.", this.f261324d.f248340f);
                                    String string = Util.isNullOrNil(this.f261324d.mo118352i()) ? context2.getString(C0966R.string.k7d) : this.f261324d.mo118352i();
                                    rg4 rg4 = new rg4();
                                    rg4.f259796d = this.f261324d.f248344j;
                                    rg4.f259801i = context2.getString(C0966R.string.f0j);
                                    rg4.f259803n = context2.getString(C0966R.string.k77);
                                    rg4.f259804o = context2.getString(C0966R.string.k6v);
                                    TinkerSyncResponse tinkerSyncResponse3 = this.f261324d;
                                    rg4.f259799g = tinkerSyncResponse3.f248346o;
                                    rg4.f259800h = tinkerSyncResponse3.f248347p;
                                    rg4.f259798f = tinkerSyncResponse3.f248345n;
                                    rg4.f259805p = tinkerSyncResponse3.f248342h;
                                    rg4.f259806q = tinkerSyncResponse3.f248343i;
                                    rg4.f259809t = tinkerSyncResponse3.f248340f.intValue();
                                    TinkerSyncResponse tinkerSyncResponse4 = this.f261324d;
                                    rg4.f259807r = tinkerSyncResponse4.f248348q;
                                    rg4.f259797e = C79645d.m96736l(tinkerSyncResponse4.f248346o);
                                    C79645d.m96725a(rg4, this.f261324d);
                                    try {
                                        rg4.f259808s = C79645d.m96741q(this.f261324d.f248349r);
                                    } catch (Exception unused) {
                                    }
                                    rg4.f259802j = string;
                                    C79645d.m96744t(rg4);
                                }
                                C38427a.m41869b(4);
                            } else {
                                C115669n.INSTANCE.idkeyStat(614, 44, 1, false);
                                Log.m105925i("Tinker.SyncResponseProcessor", "this patch id :%s show cancel before user, need show again.", this.f261324d.f248344j);
                            }
                            return true;
                        }
                    }
                    if (this.f261324d.mo118356p() && !C27734k.m37982a(context2, this.f261324d.f248344j)) {
                        mo125186e();
                    }
                    return true;
                }
                if (this.f261326f) {
                    Toast.makeText(MMApplicationContext.getContext(), "to open alpha switch.", 0).show();
                }
                Log.m105924i("Tinker.SyncResponseProcessor", "HdiffApk,auto,hdiff alpha package");
                C115669n.INSTANCE.idkeyStat(614, 79, 1, false);
                mo125183a(this.f261324d, z2);
                return true;
            } else {
                Log.m105924i("Tinker.SyncResponseProcessor", "auto,hdiff alpha package");
                C115669n.INSTANCE.idkeyStat(614, 77, 1, false);
                mo125183a(this.f261324d, z2);
                return true;
            }
        }
    }

    /* renamed from: f0 */
    public void mo1802f0(long j, String str) {
        Log.m105919d("Tinker.SyncResponseProcessor", "onTaskStarted taskId %d", Long.valueOf(j));
        Log.m105924i("Tinker.SyncResponseProcessor", "HdiffApk, onTaskStarted taskId: savedFilePath = " + str);
        if (this.f261324d.mo118353j() == 4) {
            this.f261329i.put(Long.valueOf(j), str);
            this.f261327g.put(Long.valueOf(j), Long.valueOf(Long.parseLong("0")));
        }
    }

    /* renamed from: q */
    public void mo1803q(long j, String str, boolean z) {
        File file;
        Throwable th;
        File[] listFiles;
        long j2 = j;
        String str2 = str;
        boolean z2 = false;
        Log.m105925i("Tinker.SyncResponseProcessor", "onTaskFinished id:%d path:%s hasChangeUrl:%s", Long.valueOf(j), str2, Boolean.valueOf(z));
        long j3 = this.f261325e;
        if (j3 != j2) {
            Log.m105925i("Tinker.SyncResponseProcessor", "onTaskFinished ignore. id is no equal. download id :%s callback id:%s", Long.valueOf(j3), Long.valueOf(j));
            return;
        }
        C38431f.m41872c(2);
        Context context = MMApplicationContext.getContext();
        File file2 = new File(C86013q1.m106448i(str2, false));
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            file = null;
        } else {
            file = new File(applicationInfo.dataDir, "tinker_server");
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        if (!(file == null || (listFiles = file.listFiles()) == null)) {
            String name = file2.getName();
            for (File file3 : listFiles) {
                if (!file3.getName().equals(name)) {
                    SharePatchFileUtil.safeDeleteFile(file3);
                }
            }
        }
        int j4 = this.f261324d.mo118353j();
        if (j4 == 1) {
            Log.m105924i("Tinker.SyncResponseProcessor", "coming soon! now can not support full apk update.");
        } else if (j4 == 2) {
            C79450b bVar = new C79450b(C79471a.f233015c, this.f261324d.f248349r);
            SharedPreferences b = bVar.mo109424b();
            String a = bVar.mo109423a(1);
            if (b.contains(a)) {
                bVar.mo109425c(1, System.currentTimeMillis() - b.getLong(a, 0));
                b.edit().remove(a).commit();
            }
            String absolutePath = file2.getAbsolutePath();
            C87412m.m108594g(absolutePath, "file");
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File(absolutePath)));
            try {
                long readLong = dataInputStream.readLong();
                C58003b.m67160a(dataInputStream, (Throwable) null);
                if (readLong == 96093072812398L) {
                    z2 = true;
                }
                if (z2) {
                    ((C88689b) C86312j.m106911c(C88689b.class)).mo122763ta();
                    Log.m105924i("Tinker.SyncResponseProcessor", "hotpatch hit tpc file");
                    long currentTimeMillis = System.currentTimeMillis();
                    String i = C79645d.m96733i(MMApplicationContext.getContext());
                    VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
                    C86009m1 m1Var = new C86009m1(C112760b.m154236i0("TPCFile"), file2.getName());
                    ((C119157j) C119157j.f356862d).mo183884o(new C91126p(this, i, file2.getAbsolutePath(), m1Var.mo119971i(), new n$$a(this, currentTimeMillis, m1Var)));
                } else {
                    Log.m105924i("Tinker.SyncResponseProcessor", "hotpatch not tpc file");
                    mo125184b(file2);
                }
            } catch (Throwable th4) {
                Throwable th5 = th4;
                C58003b.m67160a(dataInputStream, th);
                throw th5;
            }
        } else if (j4 == 3) {
            String absolutePath2 = file2.getAbsolutePath();
            TinkerSyncResponse tinkerSyncResponse = this.f261324d;
            AtomicBoolean atomicBoolean = C90734a.f260611b;
            Log.m105925i("MicroMsg.Tinker.CTinkerInstaller", "onReceiveUpgradeDiff HdiffApk， patchPath:%s , new apk md5：%s, TinkerSyncResponse = %s.", absolutePath2, tinkerSyncResponse.f248346o, tinkerSyncResponse.toString());
            C86709a0.m107525e().postToWorker(new C90735b(context, absolutePath2, tinkerSyncResponse));
        } else if (j4 == 4) {
            this.f261331n = true;
            mo125185c(file2, j2);
        }
        context.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_version_key", this.f261324d.f248349r).apply();
        TinkerSyncResponse tinkerSyncResponse2 = this.f261324d;
        context.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_msg_key", tinkerSyncResponse2.mo118355o(tinkerSyncResponse2.f248339e, 2)).apply();
        C40935l.m44326g().mo63969q(this);
    }
}
