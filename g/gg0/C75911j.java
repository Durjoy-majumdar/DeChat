package gg0;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.UpdateLocalVerifySwitchEvent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactStatusUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactVerifyUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75593t5;
import eb0.C7624i3;
import f40.C86709a0;
import hg0.C76170j0;
import ig0.C76343k;
import ke3.C88144b;
import nj3.C76879j;
import oa1.C117731d;
import p214om.C11502f;
import wc3.C15141z;

/* renamed from: gg0.j */
public class C75911j implements C76343k.C76347d {

    /* renamed from: a */
    public final /* synthetic */ BindMContactVerifyUI f222584a;

    /* renamed from: gg0.j$a */
    public class C75912a implements DialogInterface.OnClickListener {
        public C75912a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.addFlags(67108864);
            intent.putExtra("exit_and_restart", true);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent, C75911j.this.f222584a);
        }
    }

    /* renamed from: gg0.j$b */
    public class C75913b implements DialogInterface.OnClickListener {
        public C75913b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.addFlags(67108864);
            intent.putExtra("exit_and_restart", true);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent, C75911j.this.f222584a);
        }
    }

    public C75911j(BindMContactVerifyUI bindMContactVerifyUI) {
        this.f222584a = bindMContactVerifyUI;
    }

    /* renamed from: a */
    public void mo93913a(int i, Bundle bundle) {
        int i2 = i;
        Bundle bundle2 = bundle;
        Class<BindMContactStatusUI> cls = BindMContactStatusUI.class;
        if (i2 == 2) {
            BindMContactVerifyUI bindMContactVerifyUI = this.f222584a;
            int i3 = bindMContactVerifyUI.f196430n;
            boolean z = false;
            if (i3 == 1) {
                Log.m105924i("MicroMsg.BindMContactVerifyUI", "to startMySafedeviceListUI");
                if ((C75592q0.m90786p() & 16384) != 0) {
                    z = true;
                }
                if (!z) {
                    UpdateLocalVerifySwitchEvent updateLocalVerifySwitchEvent = new UpdateLocalVerifySwitchEvent();
                    UpdateLocalVerifySwitchEvent.C67808a aVar = updateLocalVerifySwitchEvent.f193987d;
                    aVar.f193988a = true;
                    aVar.f193989b = true;
                    updateLocalVerifySwitchEvent.publish();
                }
                this.f222584a.mo7681K7(1);
                Intent intent = new Intent();
                intent.addFlags(67108864);
                C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
                BindMContactVerifyUI bindMContactVerifyUI2 = this.f222584a;
                ((C67654r1) yM).getClass();
                if (bindMContactVerifyUI2 != null) {
                    C88144b.m109791i(bindMContactVerifyUI2, "account", ".security.ui.MySafeDeviceListUI", intent, (Bundle) null);
                }
            } else if (i3 == 3) {
                Log.m105924i("MicroMsg.BindMContactVerifyUI", "to BindMContactStatusUI for change mobile");
                BindMContactVerifyUI bindMContactVerifyUI3 = this.f222584a;
                bindMContactVerifyUI3.getClass();
                if (C117731d.m166007c().mo182443e("clicfg_update_login_mobile_number_flag", 1, true, true) == 1 && C86709a0.m107523b().mo121115m()) {
                    String str = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
                    String a = C7624i3.f25910c.mo19a("login_user_name", "");
                    String a2 = C7624i3.f25910c.mo19a("last_login_bind_mobile", "");
                    Log.m105925i("MicroMsg.BindMContactVerifyUI", "updateMobile userId:%s lastLoginUserName:%s lastLoginBindMobile:%s", str, a, a2);
                    boolean startsWith = a.startsWith("+");
                    boolean z2 = !Util.isNullOrNil(a2);
                    boolean z3 = startsWith && z2 && a.contains(a2);
                    if (z3) {
                        String str2 = bindMContactVerifyUI3.f196425f;
                        PhoneFormater phoneFormater = new PhoneFormater();
                        String replace = str2.replace("+", "");
                        String extractCountryCode = PhoneFormater.extractCountryCode(replace);
                        if (extractCountryCode != null) {
                            replace = replace.substring(extractCountryCode.length());
                        }
                        String formatNumber = phoneFormater.formatNumber(extractCountryCode, replace);
                        Log.m105925i("MicroMsg.BindMContactVerifyUI", "try to update last login mobile mobile:%s formatMobile:%s", bindMContactVerifyUI3.f196425f, formatNumber);
                        C7624i3.f25910c.mo8756d("last_login_bind_mobile", formatNumber);
                        C7624i3.f25910c.mo8756d("login_user_name", bindMContactVerifyUI3.f196425f);
                        if (C75593t5.f222075c.f222077a.contains(str)) {
                            C75593t5.f222075c.mo105946i(str, "last_login_bind_mobile", formatNumber);
                            C75593t5.f222075c.mo105946i(str, "login_user_name", bindMContactVerifyUI3.f196425f);
                        }
                        C86709a0.m107535s().mo121142i().mo119676J(6, formatNumber);
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LAST_LOGIN_USERNAME_STRING, bindMContactVerifyUI3.f196425f);
                    } else {
                        Log.m105925i("MicroMsg.BindMContactVerifyUI", "login not by mobile isUseMobileLogin:%s isBindMobile:%s isLoginWithBindMobile:%s", Boolean.valueOf(startsWith), Boolean.valueOf(z2), Boolean.valueOf(z3));
                    }
                }
                if (bundle2.getBoolean("restart_wechat", false)) {
                    Log.m105924i("MicroMsg.BindMContactVerifyUI", "restart after change mobile!");
                    BindMContactVerifyUI bindMContactVerifyUI4 = this.f222584a;
                    C76879j.m92713G(bindMContactVerifyUI4, bindMContactVerifyUI4.getString(C0966R.string.f360238b33), this.f222584a.getString(C0966R.string.a3h), false, new C75912a());
                    return;
                }
                BindMContactVerifyUI bindMContactVerifyUI5 = this.f222584a;
                C76879j.m92728V(bindMContactVerifyUI5, bindMContactVerifyUI5.getString(C0966R.string.f8014z_), C0966R.string.ajn, (DialogInterface.OnDismissListener) null);
                MMWizardActivity.m7017L7(this.f222584a, new Intent(this.f222584a, cls));
            } else if (i3 == 4) {
                Log.m105924i("MicroMsg.BindMContactVerifyUI", "to RegByMobileSetPwdUI for reset pwd");
                this.f222584a.finish();
                Intent intent2 = new Intent();
                intent2.addFlags(TPMediaCodecProfileLevel.HEVCHighTierLevel62);
                intent2.addFlags(603979776);
                intent2.putExtra("setpwd_ticket_type", 4);
                intent2.putExtra("setpwd_ticket", bundle2.getString("setpwd_ticket", ""));
                C88144b.m109791i(this.f222584a, "account", ".ui.RegByMobileSetPwdUI", intent2, (Bundle) null);
            } else if (i3 != 5) {
                if (bindMContactVerifyUI.f196428i) {
                    if (i3 == 2) {
                        C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 3, 3);
                    } else {
                        C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 1, 2);
                    }
                }
                if (this.f222584a.f196430n != 0 || !bundle2.getBoolean("restart_wechat", false)) {
                    Intent intent3 = new Intent(this.f222584a, cls);
                    if (C76170j0.f223160i == 1) {
                        int i4 = BindMContactStatusUI.f10535i;
                        intent3.putExtra("intent_back_launcherui", true);
                    }
                    intent3.putExtra("WizardRootClass", BindMContactIntroUI.class.getCanonicalName());
                    MMWizardActivity.m7017L7(this.f222584a, intent3);
                    return;
                }
                Log.m105924i("MicroMsg.BindMContactVerifyUI", "restart after bind mobile!");
                BindMContactVerifyUI bindMContactVerifyUI6 = this.f222584a;
                C76879j.m92713G(bindMContactVerifyUI6, bindMContactVerifyUI6.getString(C0966R.string.f360238b33), this.f222584a.getString(C0966R.string.a3h), false, new C75913b());
            } else {
                Log.m105924i("MicroMsg.BindMContactVerifyUI", "to finish  finishWizard for get phone number");
                this.f222584a.mo7681K7(-1);
            }
        } else if (i2 == 3) {
            this.f222584a.f196432p = bundle2.getString("setpwd_ticket");
        }
    }
}
