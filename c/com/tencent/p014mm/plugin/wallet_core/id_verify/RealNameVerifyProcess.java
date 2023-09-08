package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankcardIdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardImportUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSetPasswordUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.xweb.IXWebBroadcastListener;
import cr3.C75282g;
import cr3.C75296i;
import di3.C86312j;
import ie3.C76324c;
import p281yz.C79173v;
import p910lj.C76701a;
import t53.C77866b;
import yq3.C79144b;
import yq3.C79148e;
import z53.C53751m;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess */
public class RealNameVerifyProcess extends C77866b {

    /* renamed from: e */
    public int f209020e;

    /* renamed from: f */
    public String f209021f = null;

    /* renamed from: g */
    public String f209022g = null;

    /* renamed from: h */
    public int f209023h = 0;

    /* renamed from: i */
    public int f209024i = -1;

    /* renamed from: j */
    public RealNameVerifyProcess$$g f209025j;

    /* renamed from: k */
    public IListener<KindaBindCardEvent> f209026k = new IListener<KindaBindCardEvent>(C40008f.f107254d) {
        {
            this.__eventId = 572563856;
        }

        public boolean callback(IEvent iEvent) {
            KindaBindCardEvent kindaBindCardEvent = (KindaBindCardEvent) iEvent;
            Class cls = C76324c.class;
            Log.m105924i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent callback");
            if (kindaBindCardEvent == null) {
                return false;
            }
            C75133p0.m90117a();
            KindaBindCardEvent.C67721a aVar = kindaBindCardEvent.f193698d;
            if (aVar != null) {
                if (aVar.f193699a) {
                    Log.m105924i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent bindCard Succ");
                    Activity crossActivity = ((C76324c) C86312j.m106911c(cls)).getCrossActivity();
                    if (crossActivity != null) {
                        Bundle bundle = RealNameVerifyProcess.this.f232423c;
                        bundle.putInt("realname_verify_process_ret", -1);
                        bundle.putString("realname_verify_process_finish_title", kindaBindCardEvent.f193698d.f193705g);
                        bundle.putString("realname_verify_process_finish_desc", kindaBindCardEvent.f193698d.f193706h);
                        bundle.putString("realname_verify_process_finish_page", kindaBindCardEvent.f193698d.f193707i);
                        bundle.putInt("realname_verify_process_finish_err_jump", Util.safeParseInt(kindaBindCardEvent.f193698d.f193708j));
                        RealNameVerifyProcess realNameVerifyProcess = RealNameVerifyProcess.this;
                        realNameVerifyProcess.mo109103B(crossActivity, WcPayRealnameVerifySuccessUI.class, realNameVerifyProcess.f232423c);
                    }
                } else {
                    Log.m105924i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent bindCard Cancel");
                    Activity crossActivity2 = ((C76324c) C86312j.m106911c(cls)).getCrossActivity();
                    if (crossActivity2 != null) {
                        RealNameVerifyProcess realNameVerifyProcess2 = RealNameVerifyProcess.this;
                        realNameVerifyProcess2.mo91259f(crossActivity2, realNameVerifyProcess2.f232423c);
                    } else {
                        Log.m105924i("MicroMsg.RealNameVerifyProcess", "activity is null");
                    }
                }
            }
            RealNameVerifyProcess.this.f209026k.dead();
            return true;
        }
    };

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        mo109107a(IXWebBroadcastListener.STAGE_START, activity, bundle);
        if (this.f232423c == null) {
            this.f232423c = new Bundle();
        }
        mo109103B(activity, WcPayRealnameProxyUI.class, bundle);
        return this;
    }

    /* renamed from: H */
    public final boolean mo99275H() {
        JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter = (JsApiRequestWCPayRealnameVerifyParameter) this.f232423c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
        if (jsApiRequestWCPayRealnameVerifyParameter != null) {
            Log.m105925i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", jsApiRequestWCPayRealnameVerifyParameter.toString());
            return jsApiRequestWCPayRealnameVerifyParameter.f21747d.equals("verifySMS");
        }
        Log.m105924i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
        return false;
    }

    /* renamed from: I */
    public final boolean mo99276I() {
        JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter = (JsApiRequestWCPayRealnameVerifyParameter) this.f232423c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
        if (jsApiRequestWCPayRealnameVerifyParameter != null) {
            Log.m105925i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", jsApiRequestWCPayRealnameVerifyParameter.toString());
            return jsApiRequestWCPayRealnameVerifyParameter.f21747d.equals("bindCardHomeUI");
        }
        Log.m105924i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
        return false;
    }

    /* renamed from: J */
    public final void mo99277J(Activity activity, Bundle bundle) {
        if (!mo99278K(activity, bundle)) {
            if (!((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w() || "rename".equals(this.f232423c.getString("key_realname_scene"))) {
                mo109103B(activity, WalletBankcardIdUI.class, bundle);
            } else {
                mo109103B(activity, WalletCheckPwdUI.class, bundle);
            }
        }
    }

    /* renamed from: K */
    public final boolean mo99278K(Context context, Bundle bundle) {
        if (C79144b.m95773a().mo109087b()) {
            this.f209026k.alive();
            Log.m105918d("MicroMsg.RealNameVerifyProcess", "startKindaBindCard:true");
            if (bundle != null) {
                C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
                C75133p0.m90118b(bundle.getInt("key_bind_scene"));
            } else {
                C75136r0.m90122d(6, 0);
                C75133p0.m90118b(0);
            }
            bundle.putInt("key_bind_scene", 10);
            if ("rename".equals(this.f232423c.getString("key_realname_scene"))) {
                bundle.putInt("reg_flag", 0);
            }
            ((C76324c) C86312j.m106911c(C76324c.class)).startBindCardUseCase(context, bundle);
            return true;
        }
        Log.m105918d("MicroMsg.RealNameVerifyProcess", "startKindaBindCard:false");
        return false;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo109107a("back", activity, Integer.valueOf(i));
        C75133p0.m90117a();
        if ((activity instanceof SwitchRealnameVerifyModeUI) || (activity instanceof WcPayRealnameVerifyMainUI)) {
            if (i == 0) {
                mo91259f(activity, this.f232423c);
            }
        } else if ((activity instanceof WalletRealNameVerifyUI) || (activity instanceof WalletBankcardIdUI)) {
            if (this.f209024i != 0) {
                mo91259f(activity, this.f232423c);
            }
        } else if (activity instanceof WalletCheckPwdUI) {
            mo91259f(activity, this.f232423c);
        } else if (activity instanceof WalletPwdConfirmUI) {
            mo109108d(activity, WalletSetPasswordUI.class, (Bundle) null, i);
        } else if (activity instanceof WcPayRealnameVerifySuccessUI) {
            mo109108d(activity, WcPayRealnameVerifyIdInputUI.class, (Bundle) null, i);
        } else if (activity instanceof WcPayRealnameVerifyCodeUI) {
            Log.m105924i("MicroMsg.RealNameVerifyProcess", "back from verifyCodeUI");
            if (mo99275H()) {
                mo91259f(activity, this.f232423c);
            } else {
                mo109108d(activity, WcPayRealnameVerifyBindcardEntranceUI.class, (Bundle) null, i);
            }
        } else if (activity instanceof WcPayRealnameVerifyBindcardEntranceUI) {
            Log.m105924i("MicroMsg.RealNameVerifyProcess", "back from WcPayRealnameVerifyBindcardEntranceUI");
            if (mo99276I()) {
                mo91259f(activity, this.f232423c);
            }
        }
    }

    /* renamed from: e */
    public String mo91258e() {
        return "realname_verify_process";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        mo109107a("end", activity, bundle);
        C75133p0.m90117a();
        if (bundle == null) {
            bundle = this.f232423c;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (this.f209020e == 1) {
            mo109115n();
            if (bundle2.getBoolean("intent_bind_end", false)) {
                this.f209023h = -1;
            } else {
                this.f209023h = 0;
            }
        } else if (bundle2.containsKey("realname_verify_process_ret")) {
            this.f209023h = bundle2.getInt("realname_verify_process_ret", -1);
        } else {
            this.f209023h = 0;
        }
        if (bundle2.containsKey("intent_bind_end")) {
            bundle2.remove("intent_bind_end");
        }
        if (bundle2.containsKey("key_is_bind_reg_process")) {
            bundle2.remove("key_is_bind_reg_process");
        }
        bundle2.putInt("realname_verify_process_ret", this.f209023h);
        Intent intent = new Intent();
        intent.putExtras(bundle2);
        if (this.f209023h == -1) {
            C76701a.makeText((Context) activity, (CharSequence) activity.getString(C0966R.string.hsj), 0).show();
        }
        WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
        int i = this.f209023h;
        if (i == -1) {
            walletGetUserInfoEvent.f194038d.f194040a = 17;
        } else if (i == 0) {
            walletGetUserInfoEvent.f194038d.f194040a = 18;
        } else {
            walletGetUserInfoEvent.f194038d.f194040a = 0;
        }
        RealNameVerifyProcess$$b realNameVerifyProcess$$b = new RealNameVerifyProcess$$b(this, walletGetUserInfoEvent, intent, activity, bundle2);
        walletGetUserInfoEvent.callback = realNameVerifyProcess$$b;
        realNameVerifyProcess$$b.run();
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        boolean z;
        boolean z2;
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        Class<WalletPwdConfirmUI> cls = WalletPwdConfirmUI.class;
        Class<WcPayRealnameVerifyBindcardEntranceUI> cls2 = WcPayRealnameVerifyBindcardEntranceUI.class;
        Class<WcPayRealnameVerifyCodeUI> cls3 = WcPayRealnameVerifyCodeUI.class;
        Class<WcPayRealnameVerifyIdInputUI> cls4 = WcPayRealnameVerifyIdInputUI.class;
        Class<WalletBankcardIdUI> cls5 = WalletBankcardIdUI.class;
        Class<WalletSetPasswordUI> cls6 = WalletSetPasswordUI.class;
        mo109107a("forward", activity2, "actionCode:" + i, bundle2);
        int i2 = this.f232423c.getInt("real_name_verify_mode", this.f209020e);
        if (this.f209020e != i2) {
            this.f209020e = i2;
        }
        if (activity2 instanceof WcPayRealnameProxyUI) {
            if (bundle2 == null) {
                bundle2 = this.f232423c;
            }
            if (bundle2 != null) {
                this.f209020e = bundle2.getInt("real_name_verify_mode", 0);
            } else {
                this.f209020e = 0;
            }
            this.f209024i = this.f209020e;
            bundle2.putBoolean("key_is_realname_verify_process", true);
            this.f209021f = bundle2.getString("realname_verify_process_jump_plugin", "");
            this.f209022g = bundle2.getString("realname_verify_process_jump_activity", "");
            Log.m105925i("MicroMsg.RealNameVerifyProcess", "mAllowIdVerify is  mAllowIdVerify: %s,mPluginName %s, mActivityName %s ", Boolean.valueOf(bundle2.getInt("realname_verify_process_allow_idverify", 0) == 1), this.f209021f, this.f209022g);
            int i3 = this.f209020e;
            if (i3 == 0) {
                C75133p0.m90118b(10);
                mo109103B(activity2, SwitchRealnameVerifyModeUI.class, bundle2);
            } else if (i3 == 1) {
                bundle2.putBoolean("key_need_bind_response", true);
                if (!mo99278K(activity2, bundle2)) {
                    C75133p0.m90118b(10);
                    super.mo91260A(activity2, bundle2);
                }
            } else if (i3 == 2) {
                mo109103B(activity2, WalletRealNameVerifyUI.class, bundle2);
            } else if (i3 == 4) {
                String string = this.f232423c.getString("key_realname_scene");
                Log.m105925i("MicroMsg.RealNameVerifyProcess", "realname scene: %s", string);
                if (mo99275H()) {
                    Log.m105924i("MicroMsg.RealNameVerifyProcess", "direct go to verifySMS");
                    JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter = (JsApiRequestWCPayRealnameVerifyParameter) this.f232423c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
                    this.f232423c.putString("key_real_name_token", jsApiRequestWCPayRealnameVerifyParameter.f21748e);
                    this.f232423c.putString("realname_verify_process_req_key", jsApiRequestWCPayRealnameVerifyParameter.f21748e);
                    mo109103B(activity2, cls3, bundle2);
                    return;
                }
                JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter2 = (JsApiRequestWCPayRealnameVerifyParameter) this.f232423c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
                if (jsApiRequestWCPayRealnameVerifyParameter2 != null) {
                    Log.m105925i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", jsApiRequestWCPayRealnameVerifyParameter2.toString());
                    z = jsApiRequestWCPayRealnameVerifyParameter2.f21747d.equals("home");
                } else {
                    Log.m105924i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
                    z = false;
                }
                if (z) {
                    Log.m105924i("MicroMsg.RealNameVerifyProcess", "direct go to realname home");
                    C53751m mVar = new C53751m();
                    mVar.f221056i = true;
                    mVar.f221058n = activity2;
                    mVar.f221057j = false;
                    mVar.mo9225i().mo123062e(new RealNameVerifyProcess$$a(this, activity2, bundle2));
                } else if (mo99276I()) {
                    JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter3 = (JsApiRequestWCPayRealnameVerifyParameter) this.f232423c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
                    bundle2.putString("usertoken", jsApiRequestWCPayRealnameVerifyParameter3.f21748e);
                    bundle2.putBoolean("realname_is_minor_bindcard", true);
                    bundle2.putString("key_real_name_token", jsApiRequestWCPayRealnameVerifyParameter3.f21748e);
                    bundle2.putString("realname_verify_process_req_key", jsApiRequestWCPayRealnameVerifyParameter3.f21748e);
                    mo109103B(activity2, cls2, bundle2);
                } else {
                    JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter4 = (JsApiRequestWCPayRealnameVerifyParameter) this.f232423c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
                    if (jsApiRequestWCPayRealnameVerifyParameter4 != null) {
                        Log.m105925i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", jsApiRequestWCPayRealnameVerifyParameter4.toString());
                        z2 = jsApiRequestWCPayRealnameVerifyParameter4.f21747d.equals("fillCardInfoUI");
                    } else {
                        Log.m105924i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
                        z2 = false;
                    }
                    if (z2) {
                        bundle2.putString("usertoken", ((JsApiRequestWCPayRealnameVerifyParameter) this.f232423c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter")).f21748e);
                        bundle2.putBoolean("realname_is_minor_bindcard", true);
                        mo99277J(activity2, bundle2);
                    } else if ("rename".equals(string)) {
                        mo109103B(activity2, cls4, bundle2);
                    } else if (bundle2.getBoolean("directGotoInputUI")) {
                        mo109103B(activity2, cls4, bundle2);
                    } else {
                        C53751m mVar2 = new C53751m();
                        mVar2.f221056i = true;
                        mVar2.f221058n = activity2;
                        mVar2.f221057j = false;
                        mVar2.mo9225i().mo123062e(new RealNameVerifyProcess$$a(this, activity2, bundle2));
                    }
                }
            }
        } else {
            int i4 = this.f209020e;
            if (i4 == 2) {
                if (activity2 instanceof WalletRealNameVerifyUI) {
                    mo109103B(activity2, cls6, bundle2);
                } else if (activity2 instanceof WalletSetPasswordUI) {
                    Log.m105924i("MicroMsg.RealNameVerifyProcess", "Abtest need Sm2Encrypt 1");
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    bundle2.putBoolean("isNeedSm2Encrypt", true);
                    bundle2.putInt("Sm2EncryptType", 5);
                    mo109103B(activity2, cls, bundle2);
                } else if (!(activity2 instanceof WalletPwdConfirmUI) && (activity2 instanceof SwitchRealnameVerifyModeUI)) {
                    mo109103B(activity2, WalletRealNameVerifyUI.class, bundle2);
                    this.f209020e = 2;
                }
            } else if (i4 == 1) {
                if (activity2 instanceof SwitchRealnameVerifyModeUI) {
                    if (((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w()) {
                        mo109103B(activity2, WalletCheckPwdUI.class, bundle2);
                    } else {
                        mo109103B(activity2, cls5, bundle2);
                    }
                } else if (activity2 instanceof WalletCheckPwdUI) {
                    mo109103B(activity2, cls5, bundle2);
                } else {
                    super.mo91264o(activity, i, bundle);
                }
            } else if (i4 == 4) {
                if (activity2 instanceof WcPayRealnameVerifyMainUI) {
                    mo109103B(activity2, cls4, bundle2);
                } else if (activity2 instanceof WcPayRealnameVerifyIdInputUI) {
                    if (bundle2.getBoolean("realname_verify_process_need_bind_card", false)) {
                        mo99277J(activity2, bundle2);
                        return;
                    }
                    boolean z3 = this.f232423c.getBoolean("realname_verify_process_show_bindcard_page", false);
                    Log.m105925i("MicroMsg.RealNameVerifyProcess", "show bind page: %s", Boolean.valueOf(z3));
                    if (z3) {
                        mo109103B(activity2, cls2, bundle2);
                    } else {
                        mo109103B(activity2, cls6, bundle2);
                    }
                } else if (activity2 instanceof WcPayRealnameVerifyBindcardEntranceUI) {
                    if (bundle2.getBoolean("realname_verify_process_do_bind", false)) {
                        mo99277J(activity2, bundle2);
                    } else if (this.f232423c.getBoolean("realname_verify_process_verify_sms_without_bindcard", false)) {
                        mo109103B(activity2, cls3, bundle2);
                    } else {
                        mo109103B(activity2, cls6, bundle2);
                    }
                } else if (activity2 instanceof WcPayRealnameVerifyCodeUI) {
                    mo109103B(activity2, cls6, bundle2);
                } else if (activity2 instanceof WalletSetPasswordUI) {
                    Log.m105924i("MicroMsg.RealNameVerifyProcess", "Abtest need Sm2Encrypt 2");
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    bundle2.putBoolean("isNeedSm2Encrypt", true);
                    bundle2.putInt("Sm2EncryptType", 5);
                    mo109103B(activity2, cls, bundle2);
                } else if (activity2 instanceof WalletPwdConfirmUI) {
                    mo109103B(activity2, WcPayRealnameVerifySuccessUI.class, bundle2);
                } else if (activity2 instanceof WalletVerifyCodeUI) {
                    String string2 = this.f232423c.getString("key_resetpwd");
                    Log.m105925i("MicroMsg.RealNameVerifyProcess", "resetpwd: %s", string2);
                    if ("resetpwd".equals(string2)) {
                        mo109103B(activity2, cls6, bundle2);
                    } else {
                        super.mo91264o(activity, i, bundle);
                    }
                } else {
                    super.mo91264o(activity, i, bundle);
                }
            } else if (activity2 instanceof WalletRealNameVerifyUI) {
                mo109103B(activity2, cls5, bundle2);
                this.f209020e = 1;
            } else {
                super.mo91264o(activity, i, bundle);
            }
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (!(mMActivity instanceof WalletPwdConfirmUI)) {
            return mMActivity instanceof WalletRealNameVerifyUI ? new RealNameVerifyProcess$$d(this, mMActivity, iVar) : ((mMActivity instanceof WalletCardElementUI) || (mMActivity instanceof WalletCardImportUI)) ? new RealNameVerifyProcess$$e(this, mMActivity, iVar) : mMActivity instanceof WalletVerifyCodeUI ? new RealNameVerifyProcess$$f(this, mMActivity, iVar) : mMActivity instanceof WcPayRealnameVerifyCodeUI ? new RealNameVerifyProcess$$h(this, mMActivity, iVar) : super.mo91265p(mMActivity, iVar);
        }
        int i = this.f209020e;
        return (i == 2 || i == 4) ? new RealNameVerifyProcess$$c(this, mMActivity, iVar) : super.mo91265p(mMActivity, iVar);
    }

    /* renamed from: q */
    public int mo91266q(MMActivity mMActivity, int i) {
        return C0966R.string.kux;
    }
}
