package v43;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OfflineUpdateCardListEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardDetailUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import cr3.C75282g;
import cr3.C75296i;
import ob0.C117747y;
import v53.C78342e0;
import w43.C78516d;
import yq3.C79148e;

/* renamed from: v43.a */
public class C78334a extends C79148e {

    /* renamed from: d */
    public String f229540d = "";

    /* renamed from: v43.a$a */
    public class C78335a extends C75282g {

        /* renamed from: c */
        public String f229541c = null;

        public C78335a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            if (i != 1) {
                return null;
            }
            return this.f221418a.getString(C0966R.string.kui);
        }

        /* renamed from: c */
        public boolean mo91280c(Object... objArr) {
            Bankcard bankcard = (Bankcard) C78334a.this.f232423c.getParcelable("key_bankcard");
            boolean z = false;
            if (bankcard == null || bankcard.field_bankcardState != 1) {
                C78334a.this.f232423c.putInt("key_process_result_code", 1);
                return false;
            }
            C78334a.this.f229540d = bankcard.field_bindSerial;
            C75296i iVar = this.f221419b;
            String str = bankcard.field_bankcardType;
            String str2 = bankcard.field_bindSerial;
            if (C78334a.this.f232423c.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1) == 2) {
                z = true;
            }
            iVar.mo105625d(new C78516d(str, str2, z), true);
            C78334a.this.f232423c.putBoolean("key_is_expired_bankcard", true);
            return true;
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            Bankcard bankcard = (Bankcard) C78334a.this.f232423c.getParcelable("key_bankcard");
            boolean z = false;
            String str = objArr[0];
            this.f229541c = objArr[1];
            if (bankcard != null) {
                C78334a.this.f229540d = bankcard.field_bindSerial;
                C75296i iVar = this.f221419b;
                String str2 = bankcard.field_bankcardType;
                String str3 = bankcard.field_bindSerial;
                if (C78334a.this.f232423c.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1) == 2) {
                    z = true;
                }
                iVar.mo105625d(new C78516d(str2, str3, str, z), true);
                return true;
            }
            C78334a.this.f232423c.putInt("key_process_result_code", 1);
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (yVar instanceof C78516d) {
                if (i == 0 && i2 == 0) {
                    C78334a.this.f232423c.putInt("key_process_result_code", -1);
                    if (C78334a.this.mo91267t(this.f221418a, (Bundle) null)) {
                        this.f221419b.mo105625d(new C78342e0(this.f229541c, 14), true);
                    } else {
                        C78334a.this.mo91264o(this.f221418a, 0, (Bundle) null);
                        MMActivity mMActivity = this.f221418a;
                        if (mMActivity instanceof WalletBaseUI) {
                            ((WalletBaseUI) mMActivity).cleanUiData(0);
                        }
                        this.f221418a.finish();
                    }
                    return true;
                }
                C78334a.this.f232423c.putInt("key_process_result_code", 1);
            }
            return false;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.ProcessManager", "start Process : UnbindProcess");
        if (bundle.getBoolean("key_is_show_detail", true)) {
            mo107655F(activity, bundle);
        } else {
            mo109103B(activity, WalletCheckPwdUI.class, bundle);
        }
        return this;
    }

    /* renamed from: F */
    public void mo107655F(Activity activity, Bundle bundle) {
        mo109103B(activity, WalletBankcardDetailUI.class, bundle);
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo96262m(activity);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "UnbindProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        if (this.f232423c.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1) == 1) {
            int i = bundle.getInt("key_process_result_code", 0);
            mo109113k(activity, "wallet", ".bind.ui.WalletUnbindBankCardProxyUI", i, (Intent) null, false);
            if (i == -1) {
                OfflineUpdateCardListEvent offlineUpdateCardListEvent = new OfflineUpdateCardListEvent();
                offlineUpdateCardListEvent.f78882d.f78883a = 2;
                if (!Util.isNullOrNil(this.f229540d)) {
                    offlineUpdateCardListEvent.f78882d.f78884b = this.f229540d;
                }
                offlineUpdateCardListEvent.publish();
            }
        } else if (this.f232423c.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1) == 2) {
            mo109112j(activity, "wallet", ".balance.ui.WalletBalanceManagerUI");
        } else {
            Log.m105925i("MicroMsg.ProcessManager", " walletMallV2 switch is ：%s", Boolean.TRUE);
            mo109112j(activity, "mall", ".ui.MallIndexUIv2");
        }
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletBankcardDetailUI) {
            mo109103B(activity, WalletCheckPwdUI.class, bundle);
        } else if (activity instanceof WalletCheckPwdUI) {
            mo91259f(activity, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C78335a(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return activity instanceof WalletCheckPwdUI;
    }
}
