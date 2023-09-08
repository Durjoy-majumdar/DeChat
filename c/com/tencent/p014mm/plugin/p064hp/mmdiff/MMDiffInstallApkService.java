package com.tencent.p014mm.plugin.p064hp.mmdiff;

import android.app.IntentService;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService */
public class MMDiffInstallApkService extends IntentService {

    /* renamed from: q */
    public static final /* synthetic */ int f19390q = 0;

    /* renamed from: d */
    public C4607b f19391d;

    /* renamed from: e */
    public long f19392e;

    /* renamed from: f */
    public boolean f19393f;

    /* renamed from: g */
    public int f19394g;

    /* renamed from: h */
    public Context f19395h;

    /* renamed from: i */
    public int f19396i;

    /* renamed from: j */
    public int f19397j;

    /* renamed from: n */
    public int f19398n;

    /* renamed from: o */
    public String f19399o;

    /* renamed from: p */
    public C40952u f19400p = new C4606a();

    /* renamed from: com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService$a */
    public class C4606a implements C40952u {
        public C4606a() {
        }

        /* renamed from: B */
        public void mo1796B(long j, String str, long j2, long j3) {
        }

        /* renamed from: D */
        public void mo1797D(long j) {
            Log.m105925i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskRemoved id=%d", Long.valueOf(j));
            MMDiffInstallApkService.this.stopSelf();
        }

        /* renamed from: O */
        public void mo1798O(long j) {
        }

        /* renamed from: Q */
        public void mo1799Q(long j, String str) {
            Log.m105925i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskResumed id=%d, savedFilePath=%s", Long.valueOf(j), str);
        }

        /* renamed from: S */
        public void mo1800S(long j) {
            Log.m105925i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskPaused id=%d", Long.valueOf(j));
        }

        /* renamed from: d */
        public void mo1801d(long j, int i, boolean z) {
            Log.m105925i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskFailed id=%d, errCode=%d, hasChangeUrl=%b", Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z));
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMDiffInstallApkService.this.getString(C0966R.string.cuf), 1).show();
            MMDiffInstallApkService.this.stopSelf();
        }

        /* renamed from: f0 */
        public void mo1802f0(long j, String str) {
            Log.m105925i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskStarted id=%d, savedFilePath=%s", Long.valueOf(j), str);
        }

        /* renamed from: q */
        public void mo1803q(long j, String str, boolean z) {
            Log.m105925i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskFinished id=%d, savedFilePath=%s, hasChangeUrl=%b", Long.valueOf(j), str, Boolean.valueOf(z));
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMDiffInstallApkService.this.getString(C0966R.string.cuh), 1).show();
            MMDiffInstallApkService.this.stopSelf();
        }
    }

    /* renamed from: com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService$b */
    public enum C4607b {
        TO_DOWNLOAD,
        DOWNLOADING
    }

    public MMDiffInstallApkService() {
        super("MMDiffInstallApkService");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105925i("Tinker.MMDiffInstallApkService.HdiffApk", "onDestroy hasCallback=%b", Boolean.valueOf(this.f19393f));
        if (!this.f19393f) {
            this.f19393f = true;
        }
        C40935l.m44326g().mo63969q(this.f19400p);
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x032c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            java.lang.String r2 = "Tinker.MMDiffInstallApkService.HdiffApk"
            r3 = 0
            if (r1 != 0) goto L_0x0014
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r3 = "AbstractResultService received a null intent, ignoring."
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r2, r3, r1)
            r27.stopSelf()
            return
        L_0x0014:
            java.lang.String r4 = "notify_type_extra"
            java.lang.String r4 = r1.getStringExtra(r4)
            java.lang.String r5 = "mmdiff_apk_has_ready"
            boolean r5 = r5.equals(r4)
            r6 = 4
            if (r5 == 0) goto L_0x004b
            java.util.Map<java.lang.String, java.lang.String> r1 = b12.C79645d.f233530a
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "tinker_patch_share_config"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r6)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = b12.C79645d.f233532c
            long r4 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = r1.putLong(r2, r4)
            r1.apply()
            java.lang.String r1 = "mmdiff_goto_apk_install"
            v02.C90734a.m113788e(r1, r3, r3)
            r27.stopSelf()
            goto L_0x041b
        L_0x004b:
            java.lang.String r5 = "mmdiff_apk_has_update_notify"
            boolean r5 = r5.equals(r4)
            r7 = 1
            if (r5 == 0) goto L_0x00b1
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "mmdiff_udpate_maunal_cgi"
            r1.putExtra(r2, r7)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI"
            android.content.Intent r2 = r1.setClassName(r2, r4)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r4)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r1)
            java.lang.Object[] r8 = r4.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/hp/mmdiff/MMDiffInstallApkService"
            java.lang.String r10 = "onHandleIntent"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r7 = r2
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r4.mo10231a(r3)
            android.content.Intent r1 = (android.content.Intent) r1
            r2.startActivity(r1)
            java.lang.String r8 = "com/tencent/mm/plugin/hp/mmdiff/MMDiffInstallApkService"
            java.lang.String r9 = "onHandleIntent"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            r1 = 103(0x67, float:1.44E-43)
            v02.C90737d.m113800h(r1, r6)
            r27.stopSelf()
            goto L_0x041b
        L_0x00b1:
            java.lang.String r5 = "mmdiff_download_full_apk_notify"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x041b
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.f19395h = r4
            com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService$b r4 = com.tencent.p014mm.plugin.p064hp.mmdiff.MMDiffInstallApkService.C4607b.TO_DOWNLOAD
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService$b r9 = r0.f19391d
            r8[r3] = r9
            r8[r7] = r4
            java.lang.String r9 = "setDownloadState old=%s new=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r8)
            r0.f19391d = r4
            java.lang.String r4 = "task_name"
            java.lang.String r4 = r1.getStringExtra(r4)
            java.lang.String r8 = "task_url"
            java.lang.String r8 = r1.getStringExtra(r8)
            java.lang.String r10 = "alternative_url"
            java.lang.String r10 = r1.getStringExtra(r10)
            java.lang.String r11 = "task_size"
            r12 = 0
            long r14 = r1.getLongExtra(r11, r12)
            java.lang.String r11 = "file_md5"
            java.lang.String r11 = r1.getStringExtra(r11)
            java.lang.String r12 = "extInfo"
            java.lang.String r12 = r1.getStringExtra(r12)
            java.lang.String r13 = "fileType"
            java.lang.String r13 = r1.getStringExtra(r13)
            java.lang.String r6 = "appid"
            java.lang.String r6 = r1.getStringExtra(r6)
            java.lang.String r5 = "package_name"
            java.lang.String r5 = r1.getStringExtra(r5)
            r0.f19399o = r5
            java.lang.String r5 = "thumb_url"
            java.lang.String r5 = r1.getStringExtra(r5)
            java.lang.String r7 = "title"
            java.lang.String r7 = r1.getStringExtra(r7)
            java.lang.String r3 = "page_url"
            java.lang.String r3 = r1.getStringExtra(r3)
            r19 = r9
            java.lang.String r9 = "task_scene"
            r20 = r10
            r10 = 0
            int r9 = r1.getIntExtra(r9, r10)
            r21 = r9
            java.lang.String r9 = "page_scene"
            int r9 = r1.getIntExtra(r9, r10)
            r0.f19396i = r9
            java.lang.String r9 = "from_scene"
            int r9 = r1.getIntExtra(r9, r10)
            r0.f19398n = r9
            java.lang.String r9 = "task_download_type"
            int r9 = r1.getIntExtra(r9, r10)
            r0.f19397j = r9
            r9 = 9
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r10] = r11
            r10 = 1
            r9[r10] = r8
            r10 = 2
            r9[r10] = r12
            r10 = 3
            r9[r10] = r13
            r16 = 4
            r9[r16] = r6
            java.lang.String r10 = r0.f19399o
            r22 = r12
            r12 = 5
            r9[r12] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r14 = 6
            r9[r14] = r10
            r10 = 7
            r9[r10] = r5
            int r5 = r0.f19396i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15 = 8
            r9[r15] = r5
            java.lang.String r5 = "onCreate: md5=%s, url=%s, extInfo=%s, fileType=%s, appId=%s, packageName=%s, taskSize=%d, thumbUrl=%s, pageScene=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r9)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r15 = 0
            r9[r15] = r6
            r15 = 1
            java.lang.Integer r18 = java.lang.Integer.valueOf(r15)
            r9[r15] = r18
            r17 = 2
            r9[r17] = r3
            r18 = 3
            r9[r18] = r8
            int r14 = r0.f19398n
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r16 = 4
            r9[r16] = r14
            r14 = 14217(0x3789, float:1.9922E-41)
            r5.mo160131h(r14, r9)
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r15)
            r0.f19394g = r5
            java.lang.String r5 = "app_developer"
            java.lang.String r5 = r1.getStringExtra(r5)
            java.lang.String r9 = "app_version"
            java.lang.String r9 = r1.getStringExtra(r9)
            java.lang.String r13 = "app_privacy_url"
            java.lang.String r13 = r1.getStringExtra(r13)
            java.lang.String r15 = "app_permission_url"
            java.lang.String r1 = r1.getStringExtra(r15)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r14 = 0
            if (r15 != 0) goto L_0x01de
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r15 != 0) goto L_0x01de
            java.lang.String r15 = r0.f19399o
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 == 0) goto L_0x01d6
            goto L_0x01de
        L_0x01d6:
            r26 = r3
            r25 = r8
            r24 = r11
            goto L_0x02eb
        L_0x01de:
            android.content.res.AssetManager r15 = r27.getAssets()     // Catch:{ IOException -> 0x02e4 }
            java.lang.String r12 = "app_info_arrays.xml"
            java.io.InputStream r12 = r15.open(r12)     // Catch:{ IOException -> 0x02e4 }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.convertStreamToString(r12)     // Catch:{ IOException -> 0x02e4 }
            java.lang.String r15 = "apps"
            java.util.Map r12 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r12, r15, r14)     // Catch:{ IOException -> 0x02e4 }
            java.lang.String r15 = ".apps.$count"
            java.lang.Object r15 = r12.get(r15)     // Catch:{ IOException -> 0x02e4 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x02e4 }
            r14 = 0
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r14)     // Catch:{ IOException -> 0x02e4 }
            r14 = 0
        L_0x0200:
            if (r14 >= r15) goto L_0x01d6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02e4 }
            r10.<init>()     // Catch:{ IOException -> 0x02e4 }
            r23 = r15
            java.lang.String r15 = ".apps.app"
            r10.append(r15)     // Catch:{ IOException -> 0x02e4 }
            if (r14 <= 0) goto L_0x0217
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ IOException -> 0x0215 }
            goto L_0x0219
        L_0x0215:
            goto L_0x01d6
        L_0x0217:
            java.lang.String r15 = ""
        L_0x0219:
            r10.append(r15)     // Catch:{ IOException -> 0x02e4 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x02e4 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02e4 }
            r15.<init>()     // Catch:{ IOException -> 0x02e4 }
            r15.append(r10)     // Catch:{ IOException -> 0x02e4 }
            r24 = r11
            java.lang.String r11 = ".$name"
            r15.append(r11)     // Catch:{ IOException -> 0x02df }
            java.lang.String r11 = r15.toString()     // Catch:{ IOException -> 0x02df }
            java.lang.Object r11 = r12.get(r11)     // Catch:{ IOException -> 0x02df }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x02df }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02df }
            r15.<init>()     // Catch:{ IOException -> 0x02df }
            r15.append(r10)     // Catch:{ IOException -> 0x02df }
            r25 = r8
            java.lang.String r8 = ".$package"
            r15.append(r8)     // Catch:{ IOException -> 0x02dc }
            java.lang.String r8 = r15.toString()     // Catch:{ IOException -> 0x02dc }
            java.lang.Object r8 = r12.get(r8)     // Catch:{ IOException -> 0x02dc }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x02dc }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02dc }
            r15.<init>()     // Catch:{ IOException -> 0x02dc }
            r15.append(r10)     // Catch:{ IOException -> 0x02dc }
            r26 = r3
            java.lang.String r3 = ".$task"
            r15.append(r3)     // Catch:{ IOException -> 0x02da }
            java.lang.String r3 = r15.toString()     // Catch:{ IOException -> 0x02da }
            java.lang.Object r3 = r12.get(r3)     // Catch:{ IOException -> 0x02da }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x02da }
            boolean r15 = r11.equalsIgnoreCase(r7)     // Catch:{ IOException -> 0x02da }
            if (r15 != 0) goto L_0x0293
            boolean r11 = r11.equalsIgnoreCase(r4)     // Catch:{ IOException -> 0x02da }
            if (r11 != 0) goto L_0x0293
            java.lang.String r11 = r0.f19399o     // Catch:{ IOException -> 0x02da }
            boolean r11 = r8.equalsIgnoreCase(r11)     // Catch:{ IOException -> 0x02da }
            if (r11 != 0) goto L_0x0293
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch:{ IOException -> 0x02da }
            if (r3 == 0) goto L_0x0286
            goto L_0x0293
        L_0x0286:
            int r14 = r14 + 1
            r15 = r23
            r11 = r24
            r8 = r25
            r3 = r26
            r10 = 7
            goto L_0x0200
        L_0x0293:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ IOException -> 0x02da }
            if (r3 == 0) goto L_0x02b1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02da }
            r3.<init>()     // Catch:{ IOException -> 0x02da }
            r3.append(r10)     // Catch:{ IOException -> 0x02da }
            java.lang.String r11 = ".$version"
            r3.append(r11)     // Catch:{ IOException -> 0x02da }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x02da }
            java.lang.Object r3 = r12.get(r3)     // Catch:{ IOException -> 0x02da }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x02da }
            r9 = r3
        L_0x02b1:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ IOException -> 0x02da }
            if (r3 == 0) goto L_0x02cf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02da }
            r3.<init>()     // Catch:{ IOException -> 0x02da }
            r3.append(r10)     // Catch:{ IOException -> 0x02da }
            java.lang.String r10 = ".$developer"
            r3.append(r10)     // Catch:{ IOException -> 0x02da }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x02da }
            java.lang.Object r3 = r12.get(r3)     // Catch:{ IOException -> 0x02da }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x02da }
            r5 = r3
        L_0x02cf:
            java.lang.String r3 = r0.f19399o     // Catch:{ IOException -> 0x02da }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ IOException -> 0x02da }
            if (r3 == 0) goto L_0x02eb
            r0.f19399o = r8     // Catch:{ IOException -> 0x02da }
            goto L_0x02eb
        L_0x02da:
            goto L_0x02eb
        L_0x02dc:
            r26 = r3
            goto L_0x02da
        L_0x02df:
            r26 = r3
            r25 = r8
            goto L_0x02da
        L_0x02e4:
            r26 = r3
            r25 = r8
            r24 = r11
            goto L_0x02da
        L_0x02eb:
            r3 = 7
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r8 = 0
            r3[r8] = r7
            r7 = 1
            r3[r7] = r4
            java.lang.String r7 = r0.f19399o
            r8 = 2
            r3[r8] = r7
            r7 = 3
            r3[r7] = r9
            r7 = 4
            r3[r7] = r5
            r5 = 5
            r3[r5] = r1
            r1 = 6
            r3[r1] = r13
            java.lang.String r1 = "title:%s taskName:%s, package:%s, version:%s, developer:%s, permissionUrl:%s, privacyAgreementUrl:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r3)
            android.content.Context r1 = r0.f19395h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isNetworkConnected(r1)
            if (r1 != 0) goto L_0x032c
            android.content.Context r1 = r0.f19395h
            r3 = 2131830754(0x7f1127e2, float:1.9294514E38)
            java.lang.String r3 = r0.getString(r3)
            r5 = 0
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r3, (int) r5)
            r1.show()
            java.lang.String r1 = "startDownload fail, network not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x041b
        L_0x032c:
            r5 = 0
            android.content.Context r1 = r0.f19395h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r1)
            if (r1 == 0) goto L_0x0412
            java.lang.String r1 = r0.f19399o
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r5] = r6
            r5 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r9 = 1
            r7[r9] = r8
            r7[r5] = r26
            r5 = 3
            r7[r5] = r25
            int r5 = r0.f19398n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 4
            r7[r8] = r5
            r5 = 14217(0x3789, float:1.9922E-41)
            r3.mo160131h(r5, r7)
            com.tencent.mm.plugin.downloader.model.n r3 = new com.tencent.mm.plugin.downloader.model.n
            r5 = 0
            r3.<init>(r5)
            r5 = r25
            r3.f110176a = r5
            r5 = r20
            r3.f110177b = r5
            r3.f110179d = r4
            r4 = r24
            r3.f110180e = r4
            r3.f110182g = r6
            r3.f110183h = r1
            r1 = 1
            r3.f110184i = r1
            int r4 = r0.f19394g
            r3.f110181f = r4
            r4 = r22
            r3.f110192q = r4
            r4 = r21
            r3.f110187l = r4
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_webview_download_use_mars
            int r4 = r4.mo58779Qe(r5, r1)
            if (r4 != r1) goto L_0x0392
            r10 = 1
            goto L_0x0393
        L_0x0392:
            r10 = 0
        L_0x0393:
            int r4 = r0.f19397j
            if (r4 != r1) goto L_0x03a4
            if (r10 == 0) goto L_0x03a4
            r3.f110197v = r4
            com.tencent.mm.plugin.downloader.model.l r1 = com.tencent.p014mm.plugin.downloader.model.C40935l.m44326g()
            long r3 = r1.mo63957c(r3)
            goto L_0x03ac
        L_0x03a4:
            com.tencent.mm.plugin.downloader.model.l r1 = com.tencent.p014mm.plugin.downloader.model.C40935l.m44326g()
            long r3 = r1.mo63956b(r3)
        L_0x03ac:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r5 = r0.f19392e
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r1[r6] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r6 = 1
            r1[r6] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)
            r7 = 2
            r1[r7] = r5
            int r5 = r0.f19397j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 3
            r1[r7] = r5
            java.lang.String r5 = "downloadOpBtn.onClick, lastDownloadId = %d, downloadId=%d, useMars=%b, downloadType=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            r0.f19392e = r3
            r0.f19393f = r6
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x03f4
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131825896(0x7f1114e8, float:1.9284661E38)
            java.lang.String r2 = r0.getString(r2)
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r6)
            r1.show()
            r27.stopSelf()
            goto L_0x0412
        L_0x03f4:
            com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService$b r1 = com.tencent.p014mm.plugin.p064hp.mmdiff.MMDiffInstallApkService.C4607b.DOWNLOADING
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService$b r4 = r0.f19391d
            r5 = 0
            r3[r5] = r4
            r3[r6] = r1
            r4 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
            r0.f19391d = r1
            r1 = 10
            int r2 = r27.hashCode()
            java.lang.String r3 = "WebViewDownloadUI_startDownload"
            com.tencent.p014mm.modelstat.C81027f.m98942b(r1, r3, r2)
        L_0x0412:
            com.tencent.mm.plugin.downloader.model.l r1 = com.tencent.p014mm.plugin.downloader.model.C40935l.m44326g()
            com.tencent.mm.plugin.downloader.model.u r2 = r0.f19400p
            r1.mo63955a(r2)
        L_0x041b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p064hp.mmdiff.MMDiffInstallApkService.onHandleIntent(android.content.Intent):void");
    }
}
