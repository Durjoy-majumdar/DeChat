package com.tencent.kinda.framework.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import b63.C67199q0;
import b63.C67203r0;
import b63.C67205s0;
import b63.C67211x;
import b73.C28273c;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.FreezeBalanceMsg;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KWCPayService;
import com.tencent.kinda.gen.NoticeItem;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.kinda.gen.VoidITransmitKvDataCallback;
import com.tencent.kinda.gen.VoidITransmitKvDataNoticeItemCallback;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletEndResultEvent;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$g;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletPwdConfirmUI;
import com.tencent.p014mm.pluginsdk.wallet.WalletJsapiData;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import ie3.C76324c;
import ie3.C76331i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import junit.framework.Assert;
import ke3.C88144b;
import p281yz.C79173v;
import t02.C48527c;
import te3.C77933g43;
import te3.wx4;
import te3.xx4;
import yq3.C79143a;
import yq3.C79148e;

public class KWCPayServiceImpl implements KWCPayService {
    private static final int REQUEST_CODE_FOR_WALLET_LOCK = 1001;
    private final String TAG = "MicroMsg.KWCPayServiceImpl";
    /* access modifiers changed from: private */
    public VoidITransmitKvDataNoticeItemCallback mBannerCallback = null;
    /* access modifiers changed from: private */
    public int mEntryScene;
    private int mPayChannel;
    private int mPayReceiptScene;
    private int mPayScene;
    /* access modifiers changed from: private */
    public VoidITransmitKvDataCallback mQuitCallback = null;
    /* access modifiers changed from: private */
    public String mUseCaseUrl;
    /* access modifiers changed from: private */
    public IListener<WalletEndResultEvent> mWalletEndResultEventIListener = new IListener<WalletEndResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = -443741397;
        }

        public boolean callback(WalletEndResultEvent walletEndResultEvent) {
            KWCPayServiceImpl.this.mWalletEndResultEventIListener.dead();
            if (KWCPayServiceImpl.this.mQuitCallback == null) {
                return false;
            }
            ITransmitKvData create = ITransmitKvData.create();
            if (walletEndResultEvent.f194034d.f194035a == -1) {
                create.putBool("result", true);
            } else {
                create.putBool("result", false);
            }
            KWCPayServiceImpl.this.mQuitCallback.call(create);
            return false;
        }
    };

    private WalletJsapiData createJsapiData(ITransmitKvData iTransmitKvData) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = iTransmitKvData.allKeys().iterator();
        while (it.hasNext()) {
            String next = it.next();
            hashMap.put(next, iTransmitKvData.getString(next));
        }
        return new WalletJsapiData((Map<String, Object>) hashMap);
    }

    private void doRealnameSceneProgress(Context context) {
        Class<RealNameVerifyProcess> cls = RealNameVerifyProcess.class;
        MMActivity mMActivity = (MMActivity) context;
        mMActivity.getIntent().putExtra("process_id", cls.hashCode());
        Bundle bundle = new Bundle();
        bundle.putString("realname_verify_process_jump_activity", "kinda");
        bundle.putString("realname_verify_process_jump_plugin", "offline");
        bundle.putInt("real_name_verify_mode", 0);
        bundle.putInt("entry_scene", 8);
        bundle.putBoolean("process_finish_stay_orgpage", false);
        bundle.putBoolean("is_from_new_cashier", true);
        bundle.putString("start_activity_class", mMActivity.getClass().getName());
        C79143a.m95771j(mMActivity, cls, bundle, (C79148e.C79149a) null);
        C79148e g = C79143a.m95768g(mMActivity);
        if (!(g instanceof RealNameVerifyProcess)) {
            Log.m105921e("WCPayService", "Fail to get correct wallet process in KWCPayServiceImpl, expect RealNameVerifyProcess got %s", g.getClass().getName());
            return;
        }
        ((RealNameVerifyProcess) g).f209025j = new RealNameVerifyProcess$$g() {
            public void run(Activity activity) {
                if (!(activity instanceof WalletPwdConfirmUI)) {
                    return;
                }
                if (KWCPayServiceImpl.this.mUseCaseUrl.equalsIgnoreCase("receipt")) {
                    KWCPayServiceImpl kWCPayServiceImpl = KWCPayServiceImpl.this;
                    C76331i.m91765i(activity, kWCPayServiceImpl.getCollectReportScene(kWCPayServiceImpl.mEntryScene));
                } else if (KWCPayServiceImpl.this.mUseCaseUrl.equalsIgnoreCase("reward")) {
                    C88144b.m109789g(activity, "collect", ".reward.ui.QrRewardMainUI");
                }
            }
        };
    }

    /* access modifiers changed from: private */
    public int getCollectReportScene(int i) {
        if (i != 2) {
            if (i == 1) {
                return 2;
            }
            if (i == 8) {
                return 4;
            }
            if (i == 4) {
                return 6;
            }
        }
        return 1;
    }

    public void clearFreezeBalanceMsg() {
        Log.m105924i("WCPayService", "clearFreezeBalanceMsg");
        C67211x.m79543c("");
    }

    public void getBannerInfoImpl(int i, VoidITransmitKvDataNoticeItemCallback voidITransmitKvDataNoticeItemCallback) {
        this.mBannerCallback = voidITransmitKvDataNoticeItemCallback;
        final WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = Integer.toString(i);
        walletGetBulletinEvent.f79042d.f79045b = new Runnable() {
            public void run() {
                if (KWCPayServiceImpl.this.mBannerCallback != null && !Util.isNullOrNil(walletGetBulletinEvent.f79043e.f79046a)) {
                    ITransmitKvData create = ITransmitKvData.create();
                    NoticeItem noticeItem = new NoticeItem();
                    if (walletGetBulletinEvent.f79043e.f79050e != null) {
                        create.putInt("type", 2);
                        C77933g43 g432 = walletGetBulletinEvent.f79043e.f79050e;
                        noticeItem.mIsShowNotice = g432.f227431d;
                        noticeItem.mWording = g432.f227432e;
                        noticeItem.mJumpUrl = g432.f227434g;
                        noticeItem.mLeftIcon = g432.f227433f;
                        noticeItem.mNoticeId = g432.f227435h;
                    }
                    create.putString("content", walletGetBulletinEvent.f79043e.f79047b);
                    create.putString("url", walletGetBulletinEvent.f79043e.f79048c);
                    KWCPayServiceImpl.this.mBannerCallback.call(create, noticeItem);
                }
                VoidITransmitKvDataNoticeItemCallback unused = KWCPayServiceImpl.this.mBannerCallback = null;
            }
        };
        walletGetBulletinEvent.publish();
    }

    public void getCardListAndUsrVerifiedInfoImpl(VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        Class cls = C79173v.class;
        C67203r0 r0Var = ((C79173v) C86312j.m106911c(cls)).Ex0().f192953f;
        String str = r0Var != null ? r0Var.field_cre_name : "";
        if (Util.isNullOrNil(str)) {
            str = ((C79173v) C86312j.m106911c(cls)).f232472d.mo91346b(MMApplicationContext.getContext(), ((C79173v) C86312j.m106911c(cls)).Ex0().mo91333o());
        }
        String q = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91335q();
        xx4 xx4 = new xx4();
        xx4.f145014d = q;
        wx4 wx4 = new wx4();
        xx4.f145015e = wx4;
        wx4.f144344e = str;
        ITransmitKvData create = ITransmitKvData.create();
        create.putBinary("userInfo", xx4.getData());
        voidITransmitKvDataCallback.call(create);
    }

    public String getFiltedTruthName(String str) {
        return C75228t.m90229V(str);
    }

    public FreezeBalanceMsg getFreezeBalanceMsg() {
        C67211x a = C67211x.m79541a();
        if (a == null) {
            return new FreezeBalanceMsg();
        }
        return new FreezeBalanceMsg(a.f192999a, (long) Util.getHex(a.f193000b, -16777216), a.f193001c, (long) Util.getHex(a.f193002d, -1), a.f193003e, a.f193004f, a.f193005g);
    }

    public boolean isBalanceMasked() {
        return ((C79173v) C86312j.m106911c(C79173v.class)).Dx0().mo105873jo().field_wallet_entrance_balance_switch_state == 1;
    }

    public boolean isNeedWalletLock() {
        return false;
    }

    public boolean isSetWalletLock() {
        return ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91349c();
    }

    public boolean isWCPayRegUser() {
        return ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w();
    }

    public void setBalanceMasked(boolean z) {
        Class cls = C79173v.class;
        Log.m105925i("MicroMsg.KWCPayServiceImpl", "set balance masked:%b", Boolean.valueOf(z));
        C67203r0 jo = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo();
        jo.field_wallet_entrance_balance_switch_state = z ? 1 : 0;
        ((C79173v) C86312j.m106911c(cls)).Dx0().insert(jo);
        C67205s0 Ex0 = ((C79173v) C86312j.m106911c(cls)).Ex0();
        Ex0.getClass();
        Ex0.f192956i = new C67199q0(jo.field_switchConfig, jo.field_wallet_entrance_balance_switch_state);
    }

    public void startUseCaseImpl(String str, ITransmitKvData iTransmitKvData, VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        String str2 = str;
        ITransmitKvData iTransmitKvData2 = iTransmitKvData;
        Class cls = C76324c.class;
        Log.m105925i("MicroMsg.KWCPayServiceImpl", "startUseCaseImpl,url：%s", str2);
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            Log.m105920e("MicroMsg.KWCPayServiceImpl", "activity == null");
            return;
        }
        this.mUseCaseUrl = str2;
        this.mQuitCallback = voidITransmitKvDataCallback;
        this.mPayScene = iTransmitKvData2.getInt("payScene");
        this.mPayChannel = iTransmitKvData2.getInt("payChannel");
        this.mEntryScene = iTransmitKvData2.getInt("entry_scene");
        this.mPayReceiptScene = iTransmitKvData2.getInt("pay_receipt_scene");
        if (str2.equalsIgnoreCase("receipt")) {
            if (isWCPayRegUser()) {
                C76331i.m91765i(topOrUIPageFragmentActivity, getCollectReportScene(this.mEntryScene));
            } else {
                doRealnameSceneProgress(topOrUIPageFragmentActivity);
            }
        } else if (str2.equalsIgnoreCase("reward")) {
            if (isWCPayRegUser()) {
                C88144b.m109789g(topOrUIPageFragmentActivity, "collect", ".reward.ui.QrRewardMainUI");
            } else {
                doRealnameSceneProgress(topOrUIPageFragmentActivity);
            }
        } else if (str2.equalsIgnoreCase("groupaa")) {
            Intent intent = new Intent();
            int i = this.mPayReceiptScene;
            if (i == 1) {
                intent.putExtra("enter_scene", 2);
            } else if (i == 2) {
                intent.putExtra("enter_scene", 4);
            }
            C88144b.m109790h(topOrUIPageFragmentActivity, "aa", ".ui.AAEntranceUI", intent);
        } else if (str2.equalsIgnoreCase("faceHongBao")) {
            C88144b.m109789g(topOrUIPageFragmentActivity, "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
        } else if (str2.equalsIgnoreCase("transferBank")) {
            C88144b.m109789g(topOrUIPageFragmentActivity, "remittance", ".bankcard.ui.BankRemitBankcardInputUI");
        } else if (str2.equalsIgnoreCase("transferMobile") || str2.equalsIgnoreCase("transferMix")) {
            C88144b.m109789g(topOrUIPageFragmentActivity, "remittance", ".mobile.ui.BankMobileRemittanceChooseUI");
        } else if (str2.equalsIgnoreCase("walletLock")) {
            Intent intent2 = new Intent();
            int i2 = iTransmitKvData2.getInt("walletLock:entryScene");
            if (i2 != 0) {
                intent2.putExtra("wallet_lock_jsapi_scene", i2);
            }
            intent2.putExtra("key_wallet_lock_setting_scene", 2);
            if (topOrUIPageFragmentActivity instanceof MMActivity) {
                ((MMActivity) topOrUIPageFragmentActivity).mmSetOnActivityResultCallback(new MMActivity.C6739d() {
                    public void mmOnActivityResult(int i, int i2, Intent intent) {
                        if (i == 1001 && KWCPayServiceImpl.this.mQuitCallback != null) {
                            ITransmitKvData create = ITransmitKvData.create();
                            create.putBool("result", i2 == -1);
                            KWCPayServiceImpl.this.mQuitCallback.call(create);
                        }
                    }
                });
            }
            ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91347a(topOrUIPageFragmentActivity, intent2, 1001);
        } else if (str2.equalsIgnoreCase("paySecurity")) {
            Intent intent3 = new Intent();
            if (8 == this.mPayScene) {
                intent3.putExtra("wallet_lock_jsapi_scene", 2);
            }
            C88144b.m109790h(topOrUIPageFragmentActivity, "wallet", ".pwd.ui.WalletSecuritySettingUI", intent3);
        } else if (str2.equalsIgnoreCase("pureBindCard")) {
            WalletJsapiData createJsapiData = createJsapiData(iTransmitKvData2);
            Intent intent4 = new Intent();
            intent4.putExtra("appId", createJsapiData.f24075d);
            intent4.putExtra("timeStamp", createJsapiData.f24079h);
            intent4.putExtra("nonceStr", createJsapiData.f24078g);
            intent4.putExtra("packageExt", createJsapiData.f24080i);
            intent4.putExtra("signtype", createJsapiData.f24077f);
            intent4.putExtra("paySignature", createJsapiData.f24084p);
            intent4.putExtra("url", createJsapiData.f24086r);
            intent4.putExtra("key_req_bind_scene", 4);
            intent4.putExtra("pay_channel", createJsapiData.f24090v);
            intent4.putExtra("from_kinda", true);
            C88144b.m109796n(topOrUIPageFragmentActivity, "wallet", ".bind.ui.WalletBindUI", intent4, 0, false);
            this.mWalletEndResultEventIListener.alive();
        } else if (str2.equalsIgnoreCase("verifyPassword")) {
            WalletJsapiData createJsapiData2 = createJsapiData(iTransmitKvData2);
            Intent intent5 = new Intent();
            intent5.putExtra("appId", createJsapiData2.f24075d);
            intent5.putExtra("timeStamp", createJsapiData2.f24079h);
            intent5.putExtra("nonceStr", createJsapiData2.f24078g);
            intent5.putExtra("packageExt", createJsapiData2.f24080i);
            intent5.putExtra("signtype", createJsapiData2.f24077f);
            intent5.putExtra("paySignature", createJsapiData2.f24084p);
            intent5.putExtra("url", createJsapiData2.f24086r);
            intent5.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
            intent5.putExtra("from_kinda", true);
            C88144b.m109796n(topOrUIPageFragmentActivity, "wallet_core", ".ui.WalletCheckPwdUI", intent5, 0, false);
            this.mWalletEndResultEventIListener.alive();
        } else if (str2.equalsIgnoreCase("balanceEntryUseCase")) {
            if (!((C76324c) C86312j.m106911c(cls)).startWalletBalanceEntryUseCase(topOrUIPageFragmentActivity)) {
                C88144b.m109794l(topOrUIPageFragmentActivity, "wallet", ".balance.ui.WalletBalanceManagerUI", 65281);
            }
        } else if (str2.equalsIgnoreCase("lqt")) {
            if (!((C76324c) C86312j.m106911c(cls)).startLqtDetailUseCase(topOrUIPageFragmentActivity, (Intent) null)) {
                C88144b.m109795m(topOrUIPageFragmentActivity, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", (Intent) null, 65286);
            }
        } else if (str2.equalsIgnoreCase("bankCard")) {
            Intent intent6 = new Intent();
            intent6.putExtra("intent_finish_self", true);
            C88144b.m109795m(topOrUIPageFragmentActivity, "wallet", ".bind.ui.WalletBankcardManageUI", intent6, 65281);
        } else if (str2.equalsIgnoreCase("HoneyPayPayerUseCase")) {
            if (C48527c.m53911g()) {
                ((C76324c) C86312j.m106911c(cls)).startUseCase("HoneyPayPayerUseCase", ITransmitKvData.create(), new UseCaseCallback() {
                    public void call(ITransmitKvData iTransmitKvData) {
                    }
                });
                return;
            }
            C88144b.m109795m(topOrUIPageFragmentActivity, "honey_pay", ".ui.HoneyPayMainUI", new Intent(), 65283);
        } else if (str2.equalsIgnoreCase("paySettingsUseCase")) {
            iTransmitKvData2.putString("modifyPwd.sessionId", C86709a0.m107523b().mo121111i() + "_" + C75228t.m90271t());
            iTransmitKvData2.putBool("resetPwd.bResetPwdFromPayManage", true);
            iTransmitKvData2.putInt("resetPwd.realnameScene", 0);
            iTransmitKvData2.putInt("resetPwd.payScene", 0);
            ((C76324c) C86312j.m106911c(cls)).startUseCase("paySettingsUseCase", iTransmitKvData2, new UseCaseCallback() {
                public void call(ITransmitKvData iTransmitKvData) {
                }
            });
        } else if (str2.equalsIgnoreCase("realname")) {
            Bundle bundle = new Bundle();
            bundle.putInt("real_name_verify_mode", 0);
            bundle.putInt("entry_scene", 0);
            Assert.assertTrue("context must be activity", true);
            C79143a.m95771j(topOrUIPageFragmentActivity, RealNameVerifyProcess.class, bundle, new C79148e.C79149a() {
                public Intent onProcessEnd(int i, Bundle bundle) {
                    return null;
                }
            });
        }
    }
}
