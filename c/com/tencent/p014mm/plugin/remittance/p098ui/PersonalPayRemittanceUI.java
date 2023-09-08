package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BusiF2fPaySuccEvent;
import com.tencent.p014mm.p136ui.C7063x;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.remittance.model.C42835a0;
import com.tencent.p014mm.plugin.remittance.model.C42836b0;
import com.tencent.p014mm.plugin.remittance.model.C57180y;
import com.tencent.p014mm.plugin.remittance.model.C57181z;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75121j;
import com.tencent.p014mm.wallet_core.model.JumpRemind;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import ie3.C76324c;
import java.math.RoundingMode;
import nj3.C88989a;
import ob0.C117747y;
import qo3.C101218e0;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import te3.C50449mt3;
import te3.C64776vl;
import te3.C77913cm;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI */
public class PersonalPayRemittanceUI extends WalletBaseUI {

    /* renamed from: t */
    public static final /* synthetic */ int f204301t = 0;

    /* renamed from: d */
    public String f204302d;

    /* renamed from: e */
    public String f204303e;

    /* renamed from: f */
    public long f204304f;

    /* renamed from: g */
    public String f204305g;

    /* renamed from: h */
    public String f204306h;

    /* renamed from: i */
    public String f204307i;

    /* renamed from: j */
    public String f204308j;

    /* renamed from: n */
    public String f204309n;

    /* renamed from: o */
    public String f204310o;

    /* renamed from: p */
    public C101218e0 f204311p;

    /* renamed from: q */
    public C77398g f204312q;

    /* renamed from: r */
    public boolean f204313r = true;

    /* renamed from: s */
    public IListener<BusiF2fPaySuccEvent> f204314s = new IListener<BusiF2fPaySuccEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1359897903;
        }

        public boolean callback(IEvent iEvent) {
            BusiF2fPaySuccEvent busiF2fPaySuccEvent = (BusiF2fPaySuccEvent) iEvent;
            C7063x xVar = C7063x.FAIL;
            if (busiF2fPaySuccEvent == null) {
                return false;
            }
            BusiF2fPaySuccEvent.C67663a aVar = busiF2fPaySuccEvent.f193493d;
            if (!aVar.f193496c) {
                return false;
            }
            Log.m105925i("MicroMsg.PersonalPayRemittanceUI", "kinda callback data.pay_fail_reason :%s,local req_key:%s, pay key :%s", Integer.valueOf(aVar.f193499f), PersonalPayRemittanceUI.this.f204307i, busiF2fPaySuccEvent.f193493d.f193494a);
            if (!PersonalPayRemittanceUI.this.f204307i.equals(busiF2fPaySuccEvent.f193493d.f193494a)) {
                return false;
            }
            PersonalPayRemittanceUI.this.hideProgress();
            PersonalPayRemittanceUI.this.hideLoading();
            int i = busiF2fPaySuccEvent.f193493d.f193499f;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            PersonalPayRemittanceUI personalPayRemittanceUI = PersonalPayRemittanceUI.this;
                            personalPayRemittanceUI.addSceneEndListener(5047);
                            personalPayRemittanceUI.doSceneProgress(new C57181z(personalPayRemittanceUI.f204305g, personalPayRemittanceUI.f204306h, personalPayRemittanceUI.f204304f, personalPayRemittanceUI.f204308j), false);
                            PersonalPayRemittanceUI personalPayRemittanceUI2 = PersonalPayRemittanceUI.this;
                            personalPayRemittanceUI2.getClass();
                            Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "goto busi result");
                            Intent intent = new Intent(personalPayRemittanceUI2, RemittanceBusiResultUI.class);
                            intent.putExtra("app_id", personalPayRemittanceUI2.f204302d);
                            intent.putExtra("key_trans_id", personalPayRemittanceUI2.f204306h);
                            intent.putExtra("pay_scene", 65);
                            intent.putExtra("key_money", C75228t.m90250i("" + personalPayRemittanceUI2.f204304f, "100", 2, RoundingMode.HALF_UP));
                            intent.putExtra("key_succ_show_avatar_url", personalPayRemittanceUI2.f204310o);
                            intent.putExtra("key_rcver_name", personalPayRemittanceUI2.f204309n);
                            intent.putExtra("key_open_result_receiver", new ResultReceiver(new Handler(Looper.getMainLooper())) {
                                public void onReceiveResult(int i, Bundle bundle) {
                                    if (i == -1) {
                                        Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "pay success");
                                        PersonalPayRemittanceUI personalPayRemittanceUI = PersonalPayRemittanceUI.this;
                                        C7063x xVar = C7063x.SUCCESS;
                                        int i2 = PersonalPayRemittanceUI.f204301t;
                                        personalPayRemittanceUI.mo97264I7(xVar, "");
                                    }
                                }
                            });
                            C64776vl vlVar = new C64776vl();
                            vlVar.f185917d = personalPayRemittanceUI2.f204305g;
                            vlVar.f185918e = personalPayRemittanceUI2.f204306h;
                            vlVar.f185919f = personalPayRemittanceUI2.f204304f;
                            vlVar.f185920g = personalPayRemittanceUI2.f204308j;
                            try {
                                intent.putExtra("AfterPlaceOrderCommReqC2C", vlVar.toByteArray());
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.PersonalPayRemittanceUI", e, "", new Object[0]);
                            }
                            personalPayRemittanceUI2.startActivityForResult(intent, 1);
                        } else if (i != 4) {
                            Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "unknown pay failreason");
                            PersonalPayRemittanceUI.m83139H7(PersonalPayRemittanceUI.this);
                            PersonalPayRemittanceUI.this.mo97264I7(xVar, "pay fail");
                        }
                        return true;
                    }
                }
                PersonalPayRemittanceUI.m83139H7(PersonalPayRemittanceUI.this);
                PersonalPayRemittanceUI.this.mo97264I7(C7063x.CANCEL, "");
                return true;
            }
            PersonalPayRemittanceUI.m83139H7(PersonalPayRemittanceUI.this);
            PersonalPayRemittanceUI.this.mo97264I7(xVar, "pay fail");
            return true;
        }
    };

    /* renamed from: com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI$a */
    public class C70617a implements C75121j {
        public C70617a() {
        }

        /* renamed from: a */
        public void mo95711a() {
            PersonalPayRemittanceUI personalPayRemittanceUI = PersonalPayRemittanceUI.this;
            C7063x xVar = C7063x.FAIL;
            int i = PersonalPayRemittanceUI.f204301t;
            personalPayRemittanceUI.mo97264I7(xVar, "intercept by jump remind");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI$b */
    public class C70618b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ String f204318a;

        public C70618b(String str) {
            this.f204318a = str;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "click error dialog");
            PersonalPayRemittanceUI personalPayRemittanceUI = PersonalPayRemittanceUI.this;
            C7063x xVar = C7063x.FAIL;
            String str2 = this.f204318a;
            int i = PersonalPayRemittanceUI.f204301t;
            personalPayRemittanceUI.mo97264I7(xVar, str2);
        }
    }

    /* renamed from: H7 */
    public static void m83139H7(PersonalPayRemittanceUI personalPayRemittanceUI) {
        personalPayRemittanceUI.addSceneEndListener(5003);
        personalPayRemittanceUI.doSceneProgress(new C57180y(personalPayRemittanceUI.f204305g, personalPayRemittanceUI.f204306h, personalPayRemittanceUI.f204304f, personalPayRemittanceUI.f204308j), false);
    }

    /* renamed from: I7 */
    public final void mo97264I7(Enum enumR, String str) {
        Log.m105925i("MicroMsg.PersonalPayRemittanceUI", "setActivityResultData result :%s , errmsg : %s", enumR, str);
        Intent intent = new Intent();
        intent.putExtra("key_result_pay_result", enumR);
        intent.putExtra("key_result_error_msg", str);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: J7 */
    public final void mo97265J7(String str, String str2) {
        Log.m105925i("MicroMsg.PersonalPayRemittanceUI", "showErrorDialog,errMsg:%s", str);
        C77426q qVar = new C77426q(getContext());
        qVar.mo107606r("");
        qVar.mo107595g(str);
        qVar.mo107589a(false);
        qVar.mo107601m(C0966R.string.kke);
        qVar.mo107600l(new C70618b(str2));
        qVar.mo107603o();
        C77398g gVar = qVar.f225839c;
        if (gVar != null) {
            this.f204312q = gVar;
        }
        C101218e0 e0Var = this.f204311p;
        if (e0Var != null) {
            e0Var.mo140680z();
            this.f204311p = null;
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onBackPressed() {
        mo97264I7(C7063x.CANCEL, "");
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "onCreate（）");
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
        this.f204302d = getIntent().getStringExtra("key_app_id");
        String stringExtra = getIntent().getStringExtra("out_prepay_id");
        this.f204303e = stringExtra;
        Log.m105925i("MicroMsg.PersonalPayRemittanceUI", "app_id:%s，out_prepay_id：%s", this.f204302d, stringExtra);
        if (Util.isNullOrNil(this.f204303e)) {
            mo97264I7(C7063x.FAIL, "out_prepay_id is empty");
        }
        addSceneEndListener(4912);
        doSceneProgress(new C42836b0(this.f204302d, this.f204303e), true);
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "onDestroy()");
        super.onDestroy();
        this.f204314s.dead();
        removeSceneEndListener(4912);
        removeSceneEndListener(4304);
        removeSceneEndListener(5003);
        removeSceneEndListener(5047);
        removeSceneEndListener(4587);
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "onPause()");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "onResume()");
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.PersonalPayRemittanceUI", "on Scene End：errType %s , errCode：%s，errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar instanceof C42836b0) {
            hideProgress();
            hideLoading();
            Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "scene instanceof NetSceneC2CRequestPayment");
            if (i == 0 && i2 == 0) {
                C50449mt3 mt32 = ((C42836b0) yVar).f116010f;
                if (mt32 == null) {
                    mt32 = new C50449mt3();
                }
                Log.m105925i("MicroMsg.PersonalPayRemittanceUI", "NetSceneC2CRequestPayment on SceneEnd ok，retcode:%s, retMsg：%s", Integer.valueOf(mt32.f138201d), mt32.f138202e);
                if (mt32.f138201d == 0) {
                    Log.m105925i("MicroMsg.PersonalPayRemittanceUI", "showHalfDialog：res.title：%s,res.head_img：%s，res.rcvr_info：%s，res.total_amount：%s，res.ok_button_wording：%s", mt32.f138203f, mt32.f138204g, mt32.f138205h, Long.valueOf(mt32.f138206i), mt32.f138207j);
                    this.f204311p = new C101218e0(getContext(), 2, 3);
                    View inflate = View.inflate(getContext(), C0966R.C0971layout.bmr, (ViewGroup) null);
                    ((ImageView) inflate.findViewById(C0966R.C0970id.f357486a34)).setOnClickListener(new C70890g(this));
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.apb);
                    textView.setText(mt32.f138203f);
                    View inflate2 = View.inflate(getContext(), C0966R.C0971layout.bmq, (ViewGroup) null);
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    this.f204311p.mo140672r(inflate);
                    CdnImageView cdnImageView = (CdnImageView) inflate2.findViewById(C0966R.C0970id.ap9);
                    if (!Util.isNullOrNil(mt32.f138204g)) {
                        cdnImageView.setRoundCorner(true);
                        cdnImageView.setRoundCornerRate(0.1f);
                        cdnImageView.setUrl(mt32.f138204g);
                        this.f204310o = mt32.f138204g;
                    } else {
                        Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "res.head_img == null");
                    }
                    ((TextView) inflate2.findViewById(C0966R.C0970id.apa)).setText(mt32.f138205h);
                    this.f204309n = mt32.f138205h;
                    this.f204304f = mt32.f138206i;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getString(C0966R.string.i2e));
                    sb.append(C75228t.m90250i("" + mt32.f138206i, "100", 2, RoundingMode.HALF_UP));
                    ((TextView) inflate2.findViewById(C0966R.C0970id.ap_)).setText(sb.toString());
                    this.f204311p.mo140663j(inflate2);
                    this.f204311p.mo140677w(mt32.f138207j);
                    this.f204311p.mo140676v(0);
                    C101218e0 e0Var = this.f204311p;
                    e0Var.f296375F = new C70892h(this);
                    e0Var.mo140655A();
                } else {
                    mo97265J7(mt32.f138202e, "request payment fail.");
                }
            } else {
                Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "NetSceneF2FMinniProgramConfirm on SceneEnd faile show error dialog ");
                mo97265J7(str, "request payment fail.");
            }
            return true;
        } else if (yVar instanceof C42835a0) {
            Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "scene instanceof NetSceneC2CPlaceOrder");
            if (i == 0 && i2 == 0) {
                C77913cm cmVar = ((C42835a0) yVar).f116007f;
                if (cmVar == null) {
                    cmVar = new C77913cm();
                }
                Log.m105925i("MicroMsg.PersonalPayRemittanceUI", "NetSceneC2CPlaceOrder on SceneEnd ok，retcode:%s, retMsg：%s", Integer.valueOf(cmVar.f227132d), cmVar.f227133e);
                if (cmVar.f227132d != 0) {
                    hideProgress();
                    hideLoading();
                    mo97265J7(cmVar.f227133e, "place order fail.");
                } else if (cmVar.f227134f != null) {
                    hideProgress();
                    hideLoading();
                    Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "response.jump_remind != null");
                    C101218e0 e0Var2 = this.f204311p;
                    if (e0Var2 != null) {
                        e0Var2.mo140680z();
                        this.f204311p = null;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("key_result_pay_result", C7063x.FAIL);
                    intent.putExtra("key_result_error_msg", "intercept by jump remind");
                    setResult(-1, intent);
                    JumpRemind d = JumpRemind.m90059d(cmVar.f227134f);
                    d.f220981j = false;
                    d.mo104782f(this, new C70617a());
                    return true;
                } else {
                    Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "startPay");
                    this.f204305g = cmVar.f227135g;
                    this.f204306h = cmVar.f227137i;
                    this.f204308j = cmVar.f227139n;
                    this.f204307i = cmVar.f227136h;
                    PayInfo payInfo = new PayInfo();
                    payInfo.f212592j = cmVar.f227136h;
                    payInfo.f212581L = 1;
                    payInfo.f212587e = 65;
                    Bundle bundle = new Bundle();
                    payInfo.f212600u = bundle;
                    bundle.putString("cashier_desc", cmVar.f227138j);
                    payInfo.f212600u.putString("personalpay_order_id", cmVar.f227135g);
                    payInfo.f212600u.putString("trans_id", cmVar.f227137i);
                    payInfo.f212600u.putString("placeorder_ext", cmVar.f227139n);
                    ((C76324c) C86312j.m106911c(C76324c.class)).startSNSPay(this, payInfo);
                }
            } else {
                hideProgress();
                hideLoading();
                Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "NetSceneC2CPlaceOrder on SceneEnd faile show error dialog ");
                mo97265J7(str, "place order fail.");
            }
            return true;
        } else {
            if (yVar instanceof C57180y) {
                Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "scene instanceof NetScenePersonalPayCancelPay");
            }
            return false;
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C101218e0 e0Var;
        Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "onWindowFocusChanged");
        if (this.f204313r && (e0Var = this.f204311p) != null && !e0Var.mo140661h()) {
            Log.m105925i("MicroMsg.PersonalPayRemittanceUI", "onWindowFocusChanged：mHalfBottomDialog isShowHalfDialog %s, finish Activity", Boolean.valueOf(this.f204311p.mo140661h()));
            this.f204311p = null;
            mo97264I7(C7063x.CANCEL, "");
            C115669n.INSTANCE.mo160131h(19821, 3, this.f204302d, 0);
        }
        C77398g gVar = this.f204312q;
        if (gVar != null && !gVar.isShowing()) {
            Log.m105925i("MicroMsg.PersonalPayRemittanceUI", "onWindowFocusChanged isShowing:%s,finish Activity", Boolean.valueOf(this.f204312q.isShowing()));
            this.f204312q = null;
            mo97264I7(C7063x.FAIL, "dialog fail");
        }
        super.onWindowFocusChanged(z);
    }
}
