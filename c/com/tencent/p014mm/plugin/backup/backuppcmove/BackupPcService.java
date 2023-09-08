package com.tencent.p014mm.plugin.backup.backuppcmove;

import android.content.Intent;
import android.os.IBinder;
import com.eclipsesource.mmv8.Platform;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.service.MMService;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import eb0.C97625j3;
import ev0.C20612a;
import ev0.C20615b;
import gv0.C116994i;
import gv0.C20842c;
import gv0.C20859o;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import qv0.C22134c;
import yu0.C102910f;

/* renamed from: com.tencent.mm.plugin.backup.backuppcmove.BackupPcService */
public class BackupPcService extends MMService {

    /* renamed from: i */
    public boolean f345510i = false;

    /* renamed from: j */
    public boolean f345511j = false;

    /* renamed from: com.tencent.mm.plugin.backup.backuppcmove.BackupPcService$a */
    public class C18115a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f50077d;

        /* renamed from: e */
        public final /* synthetic */ String f50078e;

        public C18115a(BackupPcService backupPcService, String str, String str2) {
            this.f50077d = str;
            this.f50078e = str2;
        }

        public void run() {
            C20615b j = C20612a.m22480i().mo32274j();
            String str = this.f50077d;
            String str2 = this.f50078e;
            j.f58039p = true;
            Log.m105929w("MicroMsg.BackupPcProcessMgr", "~~~~~~~~~~~~  start by url:%s, deviceName:%s", str, str2);
            if (!Util.isNullOrNil(str2)) {
                String lowerCase = str2.toLowerCase();
                if (lowerCase.contains("window")) {
                    C22134c.m25609a("PairDevice", 1);
                } else if (lowerCase.contains(TPDownloadProxyEnum.USER_MAC)) {
                    C22134c.m25609a("PairDevice", 2);
                } else if (lowerCase.contains(Platform.ANDROID)) {
                    C22134c.m25609a("PairDevice", 3);
                } else if (lowerCase.contains("ios")) {
                    C22134c.m25609a("PairDevice", 4);
                }
            }
            C102910f.f303738g = 1;
            C20842c.m22887x1();
            j.f58038o = ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_LOGIN_EXT_DEVICE_INFO_INT, 0)).intValue();
            C97625j3.m125815e().mo123455a(595, j.f58040q);
            C97625j3.m125815e().mo123460f(new C116994i(str));
            if (j.f58029f != 2) {
                C20842c.f58882p = new C20859o(j.f58043t);
            }
            j.f58029f = 1;
        }
    }

    /* renamed from: b */
    public String mo63928b() {
        return "MicroMsg.BackupPcService";
    }

    /* renamed from: c */
    public IBinder mo93614c(Intent intent) {
        return null;
    }

    /* renamed from: d */
    public void mo112546d() {
        Log.m105924i("MicroMsg.BackupPcService", "onCreate.");
        super.mo112546d();
    }

    /* renamed from: e */
    public void mo112547e() {
        super.mo112547e();
        Log.m105924i("MicroMsg.BackupPcService", "onDestroy thread:" + Thread.currentThread().getName());
    }

    /* renamed from: g */
    public int mo93615g(Intent intent, int i, int i2) {
        Class<BackupMigratePCUI> cls = BackupMigratePCUI.class;
        Log.m105924i("MicroMsg.BackupPcService", "onStartCommand.");
        if (intent == null) {
            Log.m105928w("MicroMsg.BackupPcService", "onStartCommand intent is null");
            return 2;
        }
        String stringExtra = intent.getStringExtra("url");
        String stringExtra2 = intent.getStringExtra(MJTextResolver.KEY_DEVICE_NAME);
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.BackupPcService", "onStartCommand url is null");
            stopSelf();
            return 2;
        } else if (stringExtra.contains("mm.gj.qq.com")) {
            Log.m105924i("MicroMsg.BackupPcService", "onStartCommand url from gj stop and start BakOldUSBService");
            C88144b.m109807y(new Intent(MMApplicationContext.getContext(), BakOldUSBService.class).putExtra("url", intent.getStringExtra("url")).putExtra("isFromWifi", true));
            stopSelf();
            return 2;
        } else {
            this.f345510i = intent.getBooleanExtra("isFromWifi", false);
            this.f345511j = intent.getBooleanExtra("isMove", false);
            Log.m105925i("MicroMsg.BackupPcService", "onStartCommand Broadcast url:%s, isFromWifi:%b, isMove:%b", stringExtra, Boolean.valueOf(this.f345510i), Boolean.valueOf(this.f345511j));
            if (this.f345511j || C97625j3.m125820j()) {
                MMHandlerThread.postToMainThread(new C18115a(this, stringExtra, stringExtra2));
                return 2;
            }
            Log.m105920e("MicroMsg.BackupPcService", "onStartCommand onStartCommand not in Login state");
            if (!C20612a.m22480i().mo32274j().mo32285i()) {
                Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
                className.addFlags(335544320);
                className.putExtra("nofification_type", "back_to_pcmgr_notification");
                C9556a aVar = new C9556a();
                aVar.mo10233c(className);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backuppcmove/BackupPcService", "onStartCommand", "(Landroid/content/Intent;II)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo119620i((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcService", "onStartCommand", "(Landroid/content/Intent;II)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (!Util.getTopActivityName(MMApplicationContext.getContext()).equals(cls.getName())) {
                Intent intent2 = new Intent(MMApplicationContext.getContext(), cls);
                intent2.addFlags(335544320);
                intent2.putExtra("nofification_type", "back_to_pcmgr_notification");
                MMWizardActivity.m7017L7(MMApplicationContext.getContext(), intent2);
            }
            return 2;
        }
    }
}
