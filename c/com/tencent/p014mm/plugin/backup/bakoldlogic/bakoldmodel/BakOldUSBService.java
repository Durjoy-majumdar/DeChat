package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldmodel;

import android.content.Intent;
import android.os.IBinder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.service.MMService;
import eb0.C97625j3;
import gv0.C20842c;
import j20.C117292a;
import k20.C9556a;
import mv0.C99980a;
import mv0.C99981d;
import mv0.C99990k;
import nv0.C117641f;
import ob0.C11385n;
import ob0.C117747y;
import te3.C118432fy1;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService */
public class BakOldUSBService extends MMService implements C11385n {

    /* renamed from: i */
    public boolean f345512i = false;

    /* renamed from: j */
    public int f345513j = -1;

    /* renamed from: b */
    public String mo63928b() {
        return "MicroMsg.BakOldUSBService";
    }

    /* renamed from: c */
    public IBinder mo93614c(Intent intent) {
        Log.m105924i("MicroMsg.BakOldUSBService", "onBind()");
        return null;
    }

    /* renamed from: d */
    public void mo112546d() {
        Log.m105924i("MicroMsg.BakOldUSBService", "onCreate()");
        super.mo112546d();
        C97625j3.m125815e().mo123455a(595, this);
        C20842c.m22879k1(1, this);
    }

    /* renamed from: e */
    public void mo112547e() {
        C97625j3.m125815e().mo123470p(595, this);
        C20842c.m22884u1(1, this);
        super.mo112547e();
        Log.m105924i("MicroMsg.BakOldUSBService", "onDestroy thread:" + Thread.currentThread().getName());
    }

    /* renamed from: g */
    public int mo93615g(Intent intent, int i, int i2) {
        int i3 = 1;
        Log.m105925i("MicroMsg.BakOldUSBService", "onStartCommand() scene：%d", Integer.valueOf(this.f345513j));
        if (intent == null) {
            Log.m105928w("MicroMsg.BakOldUSBService", "onStartCommand intent is null");
            return 2;
        }
        String stringExtra = intent.getStringExtra("url");
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.BakOldUSBService", "onStartCommand url is null");
            stopSelf();
            return 2;
        }
        boolean booleanExtra = intent.getBooleanExtra("isFromWifi", false);
        this.f345512i = booleanExtra;
        Log.m105925i("MicroMsg.BakOldUSBService", "Broadcast url:%s, isFromWifi:%b", stringExtra, Boolean.valueOf(booleanExtra));
        C99980a.m130643h().mo139321j().mo139323a();
        C99981d j = C99980a.m130643h().mo139321j();
        if (this.f345512i) {
            i3 = 2;
        }
        j.f292932a = i3;
        if (!C97625j3.m125820j()) {
            Log.m105920e("MicroMsg.BakOldUSBService", "onStartCommand not in Login state");
            Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
            className.addFlags(335544320);
            className.putExtra("nofification_type", "back_to_pcmgr_notification");
            C9556a aVar = new C9556a();
            aVar.mo10233c(className);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/backup/bakoldlogic/bakoldmodel/BakOldUSBService", "onStartCommand", "(Landroid/content/Intent;II)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo119620i((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldmodel/BakOldUSBService", "onStartCommand", "(Landroid/content/Intent;II)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return 2;
        }
        C97625j3.m125815e().mo123460f(new C117641f(stringExtra));
        return 2;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = str;
        objArr[3] = yVar == null ? "" : yVar.getClass().getSimpleName();
        objArr[4] = Integer.valueOf(this.f345513j);
        Log.m105925i("MicroMsg.BakOldUSBService", "summerbak onSceneEnd [%d, %d, %s] [%s] backupScene[%d]", objArr);
        if (yVar instanceof C20842c) {
            Log.m105919d("MicroMsg.BakOldUSBService", "summerback BackupBaseScene type[%d], backupScene[%d]", Integer.valueOf(yVar.getType()), Integer.valueOf(this.f345513j));
            if (yVar.getType() == 1 && i == 0 && i2 == 0) {
                Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
                className.addFlags(335544320);
                className.putExtra("nofification_type", "back_to_pcmgr_notification");
                int i3 = this.f345513j;
                className.putExtra("newPCBackup", !(i3 == 0 || i3 == 1));
                C9556a aVar = new C9556a();
                aVar.mo10233c(className);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/backup/bakoldlogic/bakoldmodel/BakOldUSBService", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo119620i((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldmodel/BakOldUSBService", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            stopSelf();
        } else if (!(yVar instanceof C117641f)) {
        } else {
            if (i == 0 && i2 == 0) {
                C118432fy1 fy12 = (C118432fy1) ((C117641f) yVar).f351895e.f127056b.f127083a;
                C99980a.m130643h().f303742b = fy12.f354007d;
                C99980a.m130643h().f303743c = fy12.f354009f;
                C99980a.m130643h().f303744d = fy12.f354010g;
                this.f345513j = fy12.f354018r;
                Log.m105919d("MicroMsg.BakOldUSBService", "summerbak getconnetinfo type: %d, scene: %d isFromWifi:%b", Integer.valueOf(fy12.f354011h), Integer.valueOf(fy12.f354018r), Boolean.valueOf(this.f345512i));
                if (this.f345512i || fy12.f354011h != 1) {
                    int i4 = this.f345513j;
                    if (i4 == 0 || i4 == 1) {
                        C99990k k = C99980a.m130643h().mo139322k();
                        String str2 = fy12.f354015o;
                        String str3 = fy12.f354016p;
                        k.f292967o = str2;
                        k.f292968p = str3;
                        C20842c.f58878i = C99980a.m130643h().mo139322k();
                        C20842c.f58879j = C99980a.m130643h().mo139320i();
                        C20842c.f58880n = 1;
                        C99980a.m130643h().mo139320i().mo123241g(fy12.f354011h, fy12.f354013j);
                        return;
                    }
                    Log.m105919d("MicroMsg.BakOldUSBService", "summerbak onSceneEnd need todo for new scene:% ", Integer.valueOf(i4));
                    return;
                }
                Log.m105920e("MicroMsg.BakOldUSBService", "broast from usb but type is wifi, url may be fake!!!!");
                stopSelf();
                return;
            }
            C99980a.m130643h().mo139321j().f292933b = 2;
            C99980a.m130643h().mo139321j().mo139323a();
            if (i == 4 && i2 == -2011) {
                Log.m105924i("MicroMsg.BakOldUSBService", "getConnect info: INVALID URL");
            } else {
                Log.m105924i("MicroMsg.BakOldUSBService", "getConnect info other error");
            }
            C99980a.m130643h().mo139322k().mo139337k();
            stopSelf();
        }
    }
}
