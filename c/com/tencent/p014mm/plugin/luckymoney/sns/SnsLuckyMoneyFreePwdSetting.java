package com.tencent.p014mm.plugin.luckymoney.sns;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletPreferenceUI;
import ob0.C117747y;
import pj3.C47511g;
import x32.C78765b;
import y32.C79027a;
import yq3.C79143a;
import yq3.C79148e;
import z32.C79304a;

/* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyFreePwdSetting */
public class SnsLuckyMoneyFreePwdSetting extends WalletPreferenceUI {

    /* renamed from: g */
    public C47511g f199407g;

    /* renamed from: h */
    public CheckBoxPreference f199408h;

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyFreePwdSetting$a */
    public class C69279a implements MenuItem.OnMenuItemClickListener {
        public C69279a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsLuckyMoneyFreePwdSetting.this.finish();
            return false;
        }
    }

    /* renamed from: I7 */
    public boolean mo94696I7(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C79027a) {
            Log.m105924i(MMPreference.TAG, "free pwd setting onWalletSceneEnd, errType:" + i + " errCode:" + i2 + " errMsg:" + str);
            if (i != 0 || i2 != 0) {
                mo95418J7(119);
                Log.m105924i(MMPreference.TAG, "onWalletSceneEnd() NetSceneSnsPayManage is failed, do nothing");
                mo95419K7();
            } else if (((C79027a) yVar).f232033d == 1) {
                Log.m105924i(MMPreference.TAG, "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 1");
                mo95418J7(119);
                getDefaultSharedPreferences().edit().putBoolean("open_sns_pay_pref", true).commit();
                this.f199408h.mo6805K(true);
                this.f199407g.notifyDataSetChanged();
            } else {
                getDefaultSharedPreferences().edit().putBoolean("open_sns_pay_pref", false).commit();
                this.f199408h.mo6805K(false);
                this.f199407g.notifyDataSetChanged();
                mo95418J7(118);
                Log.m105924i(MMPreference.TAG, "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 0");
            }
        }
        return false;
    }

    /* renamed from: J7 */
    public final void mo95418J7(int i) {
        SnsLuckyMoneyIDKeyReportEvent snsLuckyMoneyIDKeyReportEvent = new SnsLuckyMoneyIDKeyReportEvent();
        SnsLuckyMoneyIDKeyReportEvent.C28828a aVar = snsLuckyMoneyIDKeyReportEvent.f78993d;
        aVar.f78994a = i;
        aVar.f78995b = 1;
        aVar.f78996c = true;
        snsLuckyMoneyIDKeyReportEvent.publish();
    }

    /* renamed from: K7 */
    public final void mo95419K7() {
        boolean z = true;
        if (C79304a.m96005a() != 1) {
            z = false;
        }
        this.f199408h.mo6805K(z);
        getDefaultSharedPreferences().edit().putBoolean("open_sns_pay_pref", z).commit();
        if (!TextUtils.isEmpty(C79304a.m96006b())) {
            Log.m105924i(MMPreference.TAG, "SetSnsPayTitle:" + C79304a.m96006b());
            this.f199408h.mo69924H(C79304a.m96006b());
        } else {
            Log.m105924i(MMPreference.TAG, "SetSnsPayTitle is empty");
            this.f199408h.mo69923G(C0966R.string.ggl);
        }
        if (!TextUtils.isEmpty(C79304a.m96007c())) {
            Log.m105924i(MMPreference.TAG, "SetSnsPayWording:" + C79304a.m96007c());
            this.f199408h.mo7741E(C79304a.m96007c());
        } else {
            Log.m105924i(MMPreference.TAG, "getSetSnsPayWording is empty");
            this.f199408h.mo7740D(C0966R.string.ggk);
        }
        this.f199407g.notifyDataSetChanged();
    }

    public int getResourceId() {
        return C0966R.xml.f8975cv;
    }

    public void initView() {
        this.f199407g = getPreferenceScreen();
        setBackBtn(new C69279a());
        setMMTitle((int) C0966R.string.ggo);
        this.f199408h = (CheckBoxPreference) this.f199407g.mo72519a("open_sns_pay_pref");
        mo95419K7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        mo95418J7(116);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if ("open_sns_pay_pref".equals(preference.f121285r)) {
            if (this.f199408h.mo6804J() || C79304a.m96005a() != 1) {
                mo95418J7(120);
                C79143a.m95771j(this, C78765b.class, (Bundle) null, (C79148e.C79149a) null);
            } else {
                mo105011H7().mo105625d(new C79027a(0, "", ""), true);
                mo95418J7(117);
            }
        }
        return false;
    }

    public void onResume() {
        mo95419K7();
        super.onResume();
    }
}
