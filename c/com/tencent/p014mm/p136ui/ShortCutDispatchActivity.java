package com.tencent.p014mm.p136ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import n63.C76831b;
import p182kk.C61104a;
import p287zz.C79441d;
import p287zz.C79442f;
import p640ox.C77049b;
import te3.C51567um2;
import uk2.C14201c;

/* renamed from: com.tencent.mm.ui.ShortCutDispatchActivity */
public class ShortCutDispatchActivity extends AutoLoginActivity {

    /* renamed from: d */
    public String f214656d;

    /* renamed from: e */
    public boolean f214657e = false;

    /* renamed from: f */
    public C79441d f214658f;

    /* renamed from: H7 */
    public boolean mo100186H7() {
        if (C86709a0.m107523b().mo121115m() && !C86718e.m107551r()) {
            return false;
        }
        Log.m105928w("MicroMsg.ControlLauncherActivity", "not login");
        Intent intent = new Intent(this, getClass());
        intent.putExtras(getIntent());
        intent.addFlags(268468224);
        intent.setDataAndType(getIntent().getData(), getIntent().getType());
        intent.setAction(getIntent().getAction());
        Intent intent2 = new Intent();
        intent2.putExtras(getIntent());
        C88144b.m109780B(this, "account", "com.tencent.mm.plugin.account.ui.LoginPasswordUI", intent2, intent);
        return true;
    }

    /* renamed from: J7 */
    public void mo94557J7(AutoLoginActivity.C72717a aVar, Intent intent) {
        Class<C14201c> cls = C14201c.class;
        Log.m105918d("MicroMsg.ControlLauncherActivity", "login code" + aVar);
        if (aVar.ordinal() == 0) {
            Class cls2 = C51567um2.class;
            Class cls3 = C77049b.class;
            Log.m105918d("MicroMsg.ControlLauncherActivity", "switchLaunchType");
            Class<C14201c> cls4 = cls;
            String str = "key_scan_entry_scene";
            String str2 = "key_enable_scan_code_product_merge";
            String str3 = "key_scan_report_enter_scene";
            if (this.f214657e) {
                Log.m105918d("MicroMsg.ControlLauncherActivity", "in ControlLaunchActivity ScanQR");
                if (WeChatBrands.Business.Entries.GlobalScan.checkAvailable(this)) {
                    Log.m105918d("MicroMsg.ControlLauncherActivity", "in LaunchTypeScanQRCode");
                    getIntent().putExtra("LauncherUI.Shortcut.LaunchType", "");
                    C51567um2 um22 = (C51567um2) ((C77049b) C86312j.m106911c(cls3)).mo72357nb(this, "BaseScanUI", 3, cls2);
                    if (um22 != null) {
                        um22.f142940d = "launch_type_scan_qrcode";
                    }
                    Intent className = new Intent().setClassName(this, "com.tencent.mm.plugin.scanner.ui.BaseScanUI");
                    className.putExtra("key_enable_multi_code", true);
                    className.putExtra("key_scan_goods_enable_dynamic_wording", true);
                    className.putExtra(str2, true);
                    className.putExtra(str, 5);
                    className.putExtra("key_check_camera_using", true);
                    className.putExtra(str3, 14);
                    className.addFlags(67108864);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(className);
                    C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    ((C14201c) C86312j.m106911c(cls4)).mo12578gN().mo6118a(14, C61104a.m71654j());
                }
            } else {
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                String str7 = this.f214656d;
                String str8 = "key_check_camera_using";
                if (str7 == null) {
                    Log.m105920e("MicroMsg.ControlLauncherActivity", "error: launchType == null! ");
                    Intent intent2 = new Intent();
                    intent2.setClassName(this, "com.tencent.mm.ui.LauncherUI").addFlags(67108864);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent2);
                    C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (str7.equals("launch_type_scan_qrcode")) {
                    Log.m105918d("MicroMsg.ControlLauncherActivity", "in ControlLaunchActivity ScanQR");
                    if (WeChatBrands.Business.Entries.GlobalScan.checkAvailable(this)) {
                        Log.m105918d("MicroMsg.ControlLauncherActivity", "in LaunchTypeScanQRCode");
                        getIntent().putExtra("LauncherUI.Shortcut.LaunchType", "");
                        C51567um2 um23 = (C51567um2) ((C77049b) C86312j.m106911c(cls3)).mo72357nb(this, "BaseScanUI", 3, cls2);
                        if (um23 != null) {
                            um23.f142940d = "launch_type_scan_qrcode";
                        }
                        Intent className2 = new Intent().setClassName(this, "com.tencent.mm.plugin.scanner.ui.BaseScanUI");
                        className2.putExtra("key_enable_multi_code", true);
                        className2.putExtra("key_scan_goods_enable_dynamic_wording", true);
                        className2.putExtra(str5, true);
                        className2.putExtra(str4, 5);
                        className2.putExtra(str8, true);
                        className2.putExtra(str6, 13);
                        className2.addFlags(67108864);
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(className2);
                        C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar4.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        ((C14201c) C86312j.m106911c(cls4)).mo12578gN().mo6118a(13, C61104a.m71654j());
                    }
                } else if (this.f214656d.equals("launch_type_my_qrcode")) {
                    getIntent().putExtra("LauncherUI.Shortcut.LaunchType", "");
                    Log.m105918d("MicroMsg.ControlLauncherActivity", "in LaunchTypeSMycanQRCode");
                    C51567um2 um24 = (C51567um2) ((C77049b) C86312j.m106911c(cls3)).mo72357nb(this, "SelfQRCodeUI", 3, cls2);
                    if (um24 != null) {
                        um24.f142940d = "launch_type_my_qrcode";
                    }
                    Intent className3 = new Intent().setClassName(this, "com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI");
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(className3);
                    C117292a.m165358d(this, aVar5.mo10232b(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar5.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (this.f214656d.equals("launch_type_voip")) {
                    Log.m105918d("MicroMsg.ControlLauncherActivity", "launch, LaunchTypeVOIP");
                    Intent putExtra = new Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip");
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(putExtra);
                    C117292a.m165358d(this, aVar6.mo10232b(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar6.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C115669n.INSTANCE.mo160131h(11034, 2, null);
                } else if (this.f214656d.equals("launch_type_voip_audio")) {
                    Log.m105918d("MicroMsg.ControlLauncherActivity", "launch, LaunchTypeVOIPAudio");
                    Intent putExtra2 = new Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip_audio");
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(putExtra2);
                    C117292a.m165358d(this, aVar7.mo10232b(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar7.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C115669n.INSTANCE.mo160131h(11034, 2, 1);
                } else if (this.f214656d.equals("launch_type_offline_wallet")) {
                    getIntent().putExtra("LauncherUI.Shortcut.LaunchType", "");
                    Log.m105918d("MicroMsg.ControlLauncherActivity", "in LaunchTypeOfflineWallet");
                    C51567um2 um25 = (C51567um2) ((C77049b) C86312j.m106911c(cls3)).mo72357nb(this, "WalletOfflineEntranceUI", 3, cls2);
                    if (um25 != null) {
                        um25.f142940d = "launch_type_offline_wallet";
                    }
                    int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, (Object) null)).intValue();
                    if (intValue == 0 || intValue == 1) {
                        Log.m105924i("MicroMsg.ControlLauncherActivity", "start offlinepay from shortcut");
                        Intent className4 = new Intent().setClassName(this, "com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI");
                        C9556a aVar8 = new C9556a();
                        aVar8.mo10233c(className4);
                        C117292a.m165358d(this, aVar8.mo10232b(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar8.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else if (intValue == 8) {
                        if (this.f214658f == null) {
                            this.f214658f = ((C79442f) C86312j.m106911c(C79442f.class)).J70();
                        }
                        ((C76831b) this.f214658f).mo107100c(this);
                    }
                } else {
                    Log.m105921e("MicroMsg.ControlLauncherActivity", "error: launchType:%s doesn`t match all types! ", this.f214656d);
                    Intent intent3 = new Intent();
                    intent3.setClassName(this, "com.tencent.mm.ui.LauncherUI").addFlags(67108864);
                    C9556a aVar9 = new C9556a();
                    aVar9.mo10233c(intent3);
                    C117292a.m165358d(this, aVar9.mo10232b(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar9.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            finish();
        }
    }

    /* renamed from: K7 */
    public boolean mo94558K7(Intent intent) {
        return true;
    }

    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (getIntent() == null) {
            finish();
        } else if (!IntentUtil.checkIntentSafe(intent)) {
            Log.m105924i("MicroMsg.ControlLauncherActivity", "checkIntentSafe error");
            finish();
        } else {
            this.f214656d = intent.getStringExtra("LauncherUI.Shortcut.LaunchType");
            this.f214657e = intent.getBooleanExtra("LauncherUI.From.Scaner.Shortcut", false);
            if (this.f214656d != null) {
                Log.m105924i("MicroMsg.ControlLauncherActivity", "launchType: " + this.f214656d + "  isFromHomeScan " + this.f214657e);
            }
            super.onCreate(bundle);
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
