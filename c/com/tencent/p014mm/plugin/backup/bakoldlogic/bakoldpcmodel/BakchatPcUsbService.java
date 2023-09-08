package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcmodel;

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

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.BakchatPcUsbService */
public class BakchatPcUsbService extends MMService implements C11385n {

    /* renamed from: i */
    public boolean f345514i = false;

    /* renamed from: b */
    public String mo63928b() {
        return "MicroMsg.BakchatPcUsbService";
    }

    /* renamed from: c */
    public IBinder mo93614c(Intent intent) {
        return null;
    }

    /* renamed from: d */
    public void mo112546d() {
        Log.m105924i("MicroMsg.BakchatPcUsbService", "onCreate()");
        super.mo112546d();
        C97625j3.m125815e().mo123455a(595, this);
        C20842c.m22879k1(1, this);
    }

    /* renamed from: e */
    public void mo112547e() {
        C97625j3.m125815e().mo123470p(595, this);
        C20842c.m22884u1(1, this);
        super.mo112547e();
        Log.m105924i("MicroMsg.BakchatPcUsbService", "onDestroy" + Thread.currentThread().getName());
    }

    /* renamed from: g */
    public int mo93615g(Intent intent, int i, int i2) {
        Log.m105924i("MicroMsg.BakchatPcUsbService", "onStartCommand()");
        if (intent == null) {
            Log.m105928w("MicroMsg.BakchatPcUsbService", "onStartCommand intent is null");
            return 2;
        }
        String stringExtra = intent.getStringExtra("url");
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.BakchatPcUsbService", "onStartCommand url is null");
            stopSelf();
            return 2;
        }
        boolean booleanExtra = intent.getBooleanExtra("isFromWifi", false);
        this.f345514i = booleanExtra;
        int i3 = 1;
        Log.m105925i("MicroMsg.BakchatPcUsbService", "Broadcast url:%s, isFromWifi:%b", stringExtra, Boolean.valueOf(booleanExtra));
        C99980a.m130643h().mo139321j().mo139323a();
        C99981d j = C99980a.m130643h().mo139321j();
        if (this.f345514i) {
            i3 = 2;
        }
        j.f292932a = i3;
        if (!C97625j3.m125820j()) {
            Log.m105920e("MicroMsg.BakchatPcUsbService", "onStartCommand not in Login state");
            Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
            className.addFlags(335544320);
            className.putExtra("nofification_type", "back_to_pcmgr_notification");
            C9556a aVar = new C9556a();
            aVar.mo10233c(className);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/BakchatPcUsbService", "onStartCommand", "(Landroid/content/Intent;II)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo119620i((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/BakchatPcUsbService", "onStartCommand", "(Landroid/content/Intent;II)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return 2;
        }
        C97625j3.m125815e().mo123460f(new C117641f(stringExtra));
        return 2;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C20842c) {
            if (yVar.getType() == 1 && i == 0 && i2 == 0) {
                Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
                className.addFlags(335544320);
                className.putExtra("nofification_type", "back_to_pcmgr_notification");
                C9556a aVar = new C9556a();
                aVar.mo10233c(className);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/BakchatPcUsbService", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo119620i((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/BakchatPcUsbService", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            stopSelf();
        } else if (!(yVar instanceof C117641f)) {
        } else {
            if (i == 0 && i2 == 0) {
                C118432fy1 fy12 = (C118432fy1) ((C117641f) yVar).f351895e.f127056b.f127083a;
                if (this.f345514i) {
                    Log.m105924i("MicroMsg.BakchatPcUsbService", "from wifi, reconnect");
                    C99980a.m130643h().mo139320i().mo123242h();
                }
                if (this.f345514i || fy12.f354011h != 1) {
                    C99980a.m130643h().f303742b = fy12.f354007d;
                    C99980a.m130643h().f303743c = fy12.f354009f;
                    C99980a.m130643h().f303744d = fy12.f354010g;
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
                Log.m105920e("MicroMsg.BakchatPcUsbService", "broast from usb but type is wifi, url may be fake!!!!");
                stopSelf();
                return;
            }
            C99980a.m130643h().mo139321j().f292933b = 2;
            C99980a.m130643h().mo139321j().mo139323a();
            if (i == 4 && i2 == -2011) {
                Log.m105924i("MicroMsg.BakchatPcUsbService", "getConnect info: INVALID URL");
            } else {
                Log.m105924i("MicroMsg.BakchatPcUsbService", "getConnect info other error");
            }
            C99980a.m130643h().mo139322k().mo139337k();
            stopSelf();
        }
    }
}
