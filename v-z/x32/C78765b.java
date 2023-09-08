package x32;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.luckymoney.sns.SnsLuckyMoneyFreePwdSetting;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr3.C75282g;
import cr3.C75296i;
import nj3.C76879j;
import ob0.C117747y;
import y32.C79027a;
import yq3.C79148e;

/* renamed from: x32.b */
public class C78765b extends C79148e {

    /* renamed from: x32.b$a */
    public class C78766a extends C75282g {
        public C78766a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            this.f221419b.mo105625d(new C79027a(1, objArr[0], ""), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (!(yVar instanceof C79027a)) {
                return false;
            }
            Log.m105924i("MicroMsg.ProcessManager", "OpenSnsPayProcess onSceneEnd, errType:" + i + " errCode:" + i2 + " errMsg:" + str);
            if (i == 0 && i2 == 0) {
                MMActivity mMActivity = this.f221418a;
                C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.f360993gi1));
                C78765b.this.getClass();
                SnsLuckyMoneyIDKeyReportEvent snsLuckyMoneyIDKeyReportEvent = new SnsLuckyMoneyIDKeyReportEvent();
                SnsLuckyMoneyIDKeyReportEvent.C28828a aVar = snsLuckyMoneyIDKeyReportEvent.f78993d;
                aVar.f78994a = 121;
                aVar.f78995b = 1;
                aVar.f78996c = true;
                snsLuckyMoneyIDKeyReportEvent.publish();
                C78765b.this.f232423c.putBoolean("is_open_sns_pay", true);
                C78765b bVar = C78765b.this;
                bVar.mo91259f(this.f221418a, bVar.f232423c);
            } else {
                MMActivity mMActivity2 = this.f221418a;
                C76879j.m92726T(mMActivity2, mMActivity2.getString(C0966R.string.f360992gi0));
                C78765b.this.getClass();
                SnsLuckyMoneyIDKeyReportEvent snsLuckyMoneyIDKeyReportEvent2 = new SnsLuckyMoneyIDKeyReportEvent();
                SnsLuckyMoneyIDKeyReportEvent.C28828a aVar2 = snsLuckyMoneyIDKeyReportEvent2.f78993d;
                aVar2.f78994a = 122;
                aVar2.f78995b = 1;
                aVar2.f78996c = true;
                snsLuckyMoneyIDKeyReportEvent2.publish();
                C78765b.this.mo91259f(this.f221418a, (Bundle) null);
            }
            return true;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        if (activity instanceof SnsLuckyMoneyFreePwdSetting) {
            mo109103B(activity, WalletCheckPwdUI.class, bundle);
        }
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo91259f(activity, (Bundle) null);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "LuckyFreePwdProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        mo109113k(activity, "luckymoney", ".sns.SnsLuckyMoneyFreePwdSetting", -1, intent, true);
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        mo91259f(activity, bundle);
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C78766a(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
