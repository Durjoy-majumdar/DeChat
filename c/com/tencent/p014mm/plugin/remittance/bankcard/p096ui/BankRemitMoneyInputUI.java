package com.tencent.p014mm.plugin.remittance.bankcard.p096ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.util.GmsVersion;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceRemarkInputHalfPage;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import de3.C75355a0;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import ie3.C76324c;
import ie3.C76331i;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashSet;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C117747y;
import p629ny.C76979h;
import p910lj.C76701a;
import pe3.C89349b;
import si2.C48383c;
import si2.C48391l;
import si2.C77715m;
import te3.C77971o4;
import te3.C77980pt3;
import te3.dz4;
import te3.ez4;
import ti2.C78028a;
import ui2.C52583g;
import ui2.C78171e;
import ui2.C78172f;
import ui2.C78173h;
import ui2.C78175i;
import ui2.C78176j;
import xi2.C78843b;
import yq3.C79144b;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI */
public class BankRemitMoneyInputUI extends BankRemitBaseUI {

    /* renamed from: R */
    public static final /* synthetic */ int f203789R = 0;

    /* renamed from: A */
    public String f203790A;

    /* renamed from: B */
    public String f203791B;

    /* renamed from: C */
    public String f203792C;

    /* renamed from: D */
    public String f203793D;

    /* renamed from: E */
    public int f203794E;

    /* renamed from: F */
    public int f203795F;

    /* renamed from: G */
    public String f203796G = "";

    /* renamed from: H */
    public C72476y0 f203797H;

    /* renamed from: I */
    public long f203798I;

    /* renamed from: J */
    public String f203799J;

    /* renamed from: K */
    public String f203800K;

    /* renamed from: L */
    public int f203801L = 0;

    /* renamed from: M */
    public int f203802M;

    /* renamed from: N */
    public int f203803N;

    /* renamed from: P */
    public RemittanceRemarkInputHalfPage f203804P;

    /* renamed from: Q */
    public dz4 f203805Q;

    /* renamed from: e */
    public final int f203806e = C76577a.m92151b(MMApplicationContext.getContext(), 270);

    /* renamed from: f */
    public CdnImageView f203807f;

    /* renamed from: g */
    public TextView f203808g;

    /* renamed from: h */
    public TextView f203809h;

    /* renamed from: i */
    public ScrollView f203810i;

    /* renamed from: j */
    public WalletFormView f203811j;

    /* renamed from: n */
    public LinearLayout f203812n;

    /* renamed from: o */
    public TextView f203813o;

    /* renamed from: p */
    public TextView f203814p;

    /* renamed from: q */
    public TextView f203815q;

    /* renamed from: r */
    public TextView f203816r;

    /* renamed from: s */
    public Button f203817s;

    /* renamed from: t */
    public ViewGroup f203818t;

    /* renamed from: u */
    public ViewGroup f203819u;

    /* renamed from: v */
    public TextView f203820v;

    /* renamed from: w */
    public CdnImageView f203821w;

    /* renamed from: x */
    public CdnImageView f203822x;

    /* renamed from: y */
    public BankcardElemParcel f203823y;

    /* renamed from: z */
    public String f203824z;

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI$a */
    public class C70513a implements TextWatcher {
        public C70513a() {
        }

        public void afterTextChanged(Editable editable) {
            long j;
            String str = "0";
            if (editable.toString().startsWith(".")) {
                editable.insert(0, str);
            } else {
                Editable editable2 = editable;
            }
            String obj = editable.toString();
            int indexOf = obj.indexOf(".");
            int length = obj.length();
            if (indexOf >= 0 && length - indexOf > 2) {
                WalletFormView.m90177f(BankRemitMoneyInputUI.this.f203811j.getContentEt(), obj, indexOf + 3, length);
            }
            String obj2 = editable.toString();
            if (Util.isNullOrNil(obj2) || Util.getDouble(obj2, 0.0d) <= 0.0d) {
                BankRemitMoneyInputUI.this.f203812n.setVisibility(8);
            } else {
                BankRemitMoneyInputUI.this.f203812n.setVisibility(0);
            }
            BankRemitMoneyInputUI bankRemitMoneyInputUI = BankRemitMoneyInputUI.this;
            int i = BankRemitMoneyInputUI.f203789R;
            bankRemitMoneyInputUI.getClass();
            double d = Util.getDouble(obj2, 0.0d);
            long round = Math.round(Util.getDouble(obj2, 0.0d) * 100.0d);
            if (bankRemitMoneyInputUI.f203823y.f115898g >= 0 && round > 0) {
                double c = C78028a.m94175c(round + "", bankRemitMoneyInputUI.f203823y.f115898g + "");
                String str2 = "" + c;
                try {
                    if (Util.getDouble(str2.trim(), 0.0d) != 0.0d) {
                        str = str2.trim();
                    }
                    j = new BigDecimal(str).divide(new BigDecimal("10000"), 0, 4).longValue();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.BankRemitUtil", e, "", new Object[0]);
                    j = 0;
                }
                bankRemitMoneyInputUI.f203798I = j;
                bankRemitMoneyInputUI.f203802M = (int) bankRemitMoneyInputUI.f203823y.f115905q;
                Log.m105919d("MicroMsg.BankRemitMoneyInputUI", "moneyYuan: %s, money: %s, a: %s, fee: %s, min: %s", Double.valueOf(d), Long.valueOf(round), Double.valueOf(c), Long.valueOf(bankRemitMoneyInputUI.f203798I), Long.valueOf(bankRemitMoneyInputUI.f203823y.f115905q));
                long j2 = bankRemitMoneyInputUI.f203798I;
                long j3 = (long) bankRemitMoneyInputUI.f203802M;
                if (j2 < j3 && bankRemitMoneyInputUI.f203823y.f115898g > 0) {
                    bankRemitMoneyInputUI.f203798I = j3;
                }
                double a = C78028a.m94173a(bankRemitMoneyInputUI.f203798I + "", "100", 2, 4);
                bankRemitMoneyInputUI.f203814p.setText(C75228t.m90256l(a));
                bankRemitMoneyInputUI.f203815q.setText(C75228t.m90256l(d + a));
            }
            BankRemitMoneyInputUI.this.mo97188M7();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI$b */
    public class C70514b extends C30870z1 {
        public C70514b() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            Log.m105918d("MicroMsg.BankRemitMoneyInputUI", "on click next");
            double c = C78028a.m94175c(BankRemitMoneyInputUI.this.f203811j.getText(), "100");
            if (c <= 0.0d) {
                Log.m105929w("MicroMsg.BankRemitMoneyInputUI", "illegal money: %s", Double.valueOf(c));
                C76701a.makeText((Context) BankRemitMoneyInputUI.this, (int) C0966R.string.ahk, 1).show();
                return;
            }
            BankRemitMoneyInputUI bankRemitMoneyInputUI = BankRemitMoneyInputUI.this;
            int round = (int) Math.round(Util.getDouble(bankRemitMoneyInputUI.f203811j.getText(), 0.0d) * 100.0d);
            Log.m105925i("MicroMsg.BankRemitMoneyInputUI", "do request order, money: %s, fee: %s, desc: %s, input: %s, timeScene: %s", Integer.valueOf(round), Long.valueOf(bankRemitMoneyInputUI.f203798I), bankRemitMoneyInputUI.f203796G, Integer.valueOf(bankRemitMoneyInputUI.f203795F), Integer.valueOf(bankRemitMoneyInputUI.f203794E));
            String str = bankRemitMoneyInputUI.f203790A;
            String str2 = bankRemitMoneyInputUI.f203791B;
            String str3 = bankRemitMoneyInputUI.f203793D;
            int i = bankRemitMoneyInputUI.f203794E;
            String str4 = bankRemitMoneyInputUI.f203796G;
            int i2 = (int) bankRemitMoneyInputUI.f203798I;
            int i3 = bankRemitMoneyInputUI.f203795F;
            String str5 = bankRemitMoneyInputUI.f203792C;
            String nullAsNil = Util.nullAsNil(bankRemitMoneyInputUI.f203800K);
            C77715m mVar = new C77715m(str, str2, str3, i, round, str4, i2, i3, str5, nullAsNil, new C89349b(("" + bankRemitMoneyInputUI.f203799J).getBytes()), bankRemitMoneyInputUI.f203801L);
            mVar.mo104821m1(bankRemitMoneyInputUI);
            if (bankRemitMoneyInputUI.mKindaEnable) {
                bankRemitMoneyInputUI.showLoading();
                bankRemitMoneyInputUI.doSceneProgress(mVar, false);
                return;
            }
            bankRemitMoneyInputUI.doSceneProgress(mVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI$c */
    public class C70515c implements C75217h {
        public C70515c() {
        }

        public void onVisibleStateChange(boolean z) {
            int i;
            if (z) {
                BankRemitMoneyInputUI bankRemitMoneyInputUI = BankRemitMoneyInputUI.this;
                if (bankRemitMoneyInputUI.f203810i != null) {
                    int[] iArr = new int[2];
                    bankRemitMoneyInputUI.f203817s.getLocationInWindow(iArr);
                    int height = iArr[1] + bankRemitMoneyInputUI.f203817s.getHeight();
                    int j = C76577a.m92159j(bankRemitMoneyInputUI);
                    int b = (j - height) - C76577a.m92151b(bankRemitMoneyInputUI, 30);
                    Log.m105919d("MicroMsg.BankRemitMoneyInputUI", "scrollToFormEditPosAfterShowTenPay, editText locationY: %s, height: %s, diff: %s, hardcodeKeyboardHeight: %s", Integer.valueOf(height), Integer.valueOf(j), Integer.valueOf(b), Integer.valueOf(bankRemitMoneyInputUI.f203806e));
                    if (b > 0 && b < (i = bankRemitMoneyInputUI.f203806e)) {
                        int i2 = i - b;
                        Log.m105919d("MicroMsg.BankRemitMoneyInputUI", "scrollToFormEditPosAfterShowTenPay, scrollDistance: %s", Integer.valueOf(i2));
                        bankRemitMoneyInputUI.f203810i.post(new C78171e(bankRemitMoneyInputUI, i2));
                        return;
                    }
                    return;
                }
                return;
            }
            BankRemitMoneyInputUI.this.f203810i.scrollTo(0, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI$d */
    public class C70516d implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C77715m f203828a;

        public C70516d(C77715m mVar) {
            this.f203828a = mVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            C77980pt3 pt32 = this.f203828a.f226502s;
            Log.m105925i("MicroMsg.BankRemitMoneyInputUI", "reqKey: %s, billId: %s", pt32.f228040f, pt32.f228041g);
            C77980pt3 pt33 = this.f203828a.f226502s;
            Log.m105919d("MicroMsg.BankRemitMoneyInputUI", "name: %s, bank: %s", pt33.f228043i, pt33.f228044j);
            BankRemitMoneyInputUI bankRemitMoneyInputUI = BankRemitMoneyInputUI.this;
            C77715m mVar = this.f203828a;
            bankRemitMoneyInputUI.f203799J = mVar.f226502s.f228041g;
            if (!BankRemitMoneyInputUI.m83043K7(bankRemitMoneyInputUI, mVar)) {
                BankRemitMoneyInputUI bankRemitMoneyInputUI2 = BankRemitMoneyInputUI.this;
                C77980pt3 pt34 = this.f203828a.f226502s;
                BankRemitMoneyInputUI.m83042J7(bankRemitMoneyInputUI2, pt34.f228040f, pt34.f228043i, pt34.f228044j, pt34.f228042h);
                return;
            }
            BankRemitMoneyInputUI bankRemitMoneyInputUI3 = BankRemitMoneyInputUI.this;
            if (bankRemitMoneyInputUI3.mKindaEnable) {
                bankRemitMoneyInputUI3.hideLoading();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI$e */
    public static class C70517e extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI$e$a */
        public class C70518a implements C32226l<View, String> {

            /* renamed from: d */
            public final /* synthetic */ TenpaySecureEditText f203830d;

            public C70518a(TenpaySecureEditText tenpaySecureEditText) {
                this.f203830d = tenpaySecureEditText;
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                TenpaySecureEditText tenpaySecureEditText = this.f203830d;
                if (tenpaySecureEditText == null || tenpaySecureEditText.getText().length() == 0) {
                    return C70517e.this.getString(C0966R.string.aho);
                }
                return String.format(C70517e.this.getString(C0966R.string.ahm), new Object[]{this.f203830d.getText()});
            }
        }

        public C70517e(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f6554i6);
            root.disable(C0966R.C0970id.iwq);
            root.disable(C0966R.C0970id.iwr);
            root.disable(C0966R.C0970id.a64);
            root.disable(C0966R.C0970id.ajw);
            root.disable(C0966R.C0970id.ajy);
            root.disable(C0966R.C0970id.ajz);
            root.disable(C0966R.C0970id.f357574ak0);
            root.disable(C0966R.C0970id.ksw);
            root.disable(C0966R.C0970id.ak4);
            root.view(C0966R.C0970id.jcg).descFormat(C0966R.string.ahn).valueByView(C0966R.C0970id.ajz).valueByView(C0966R.C0970id.f357574ak0);
            root.view(C0966R.C0970id.ksv).descFormat(C0966R.string.ahp).valueByView(C0966R.C0970id.ksw).valueByView(C0966R.C0970id.ak4);
            MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.cga);
            root2.disable(C0966R.C0970id.ljn);
            root2.disable(C0966R.C0970id.lj4);
            root2.disable(C0966R.C0970id.lg_);
            root2.focusFirst(C0966R.C0970id.gyl);
            root2.view(C0966R.C0970id.gyl).clickAs(C0966R.C0970id.lg_).type(ViewType.EditText).desc((C32226l<? super View, String>) new C70518a((TenpaySecureEditText) findViewById(C0966R.C0970id.ajw).findViewById(C0966R.C0970id.lg_)));
        }

        public void onResume() {
            super.onResume();
        }
    }

    /* renamed from: J7 */
    public static void m83042J7(BankRemitMoneyInputUI bankRemitMoneyInputUI, String str, String str2, String str3, String str4) {
        bankRemitMoneyInputUI.getClass();
        Log.m105924i("MicroMsg.BankRemitMoneyInputUI", "do start pay");
        PayInfo payInfo = new PayInfo();
        payInfo.f212592j = str;
        payInfo.f212587e = 49;
        payInfo.f212589g = C78843b.f231662a;
        Bundle bundle = new Bundle();
        payInfo.f212600u = bundle;
        if (bankRemitMoneyInputUI.mKindaEnable) {
            bundle.putString("key_transfer_bill_id", bankRemitMoneyInputUI.f203799J);
            bundle.putString("extinfo_key_2", str2);
            bundle.putString("extinfo_key_3", str3);
            bundle.putString("extinfo_key_4", str4);
            ((C76324c) C86312j.m106911c(C76324c.class)).startSNSPay(bankRemitMoneyInputUI, payInfo);
            return;
        }
        bundle.putString("extinfo_key_1", bankRemitMoneyInputUI.getString(C0966R.string.ai7, new Object[]{str3, str4}) + str2);
        C76331i.m91761e(bankRemitMoneyInputUI, payInfo, 1);
    }

    /* renamed from: K7 */
    public static boolean m83043K7(BankRemitMoneyInputUI bankRemitMoneyInputUI, C77715m mVar) {
        bankRemitMoneyInputUI.getClass();
        C77971o4 o4Var = mVar.f226502s.f228045n;
        if (o4Var == null || o4Var.f227901d != 1) {
            return false;
        }
        Log.m105924i("MicroMsg.BankRemitMoneyInputUI", "show alert item");
        C76879j.m92709C(bankRemitMoneyInputUI, o4Var.f227902e, "", o4Var.f227904g, o4Var.f227903f, false, new C78175i(bankRemitMoneyInputUI, o4Var, mVar), new C78176j(bankRemitMoneyInputUI));
        return true;
    }

    /* renamed from: L7 */
    public final void mo97187L7(String str) {
        Log.m105925i("MicroMsg.BankRemitMoneyInputUI", "do business callback: %s, %s", this.f203799J, str);
        doSceneProgress(new C48383c(this.f203799J, str), false);
    }

    /* renamed from: M7 */
    public final void mo97188M7() {
        if (Util.getDouble(this.f203811j.getText(), 0.0d) <= 0.0d || Util.isNullOrNil(this.f203790A) || Util.isNullOrNil(this.f203791B) || Util.isNullOrNil(this.f203793D) || Util.isNullOrNil(this.f203792C)) {
            Log.m105925i("MicroMsg.BankRemitMoneyInputUI", "disable btn: money: %s, seqNo: %s, tail: %s, bankType: %s, encrypt: %s", this.f203811j.getText(), Boolean.valueOf(Util.isNullOrNil(this.f203790A)), Boolean.valueOf(Util.isNullOrNil(this.f203791B)), Boolean.valueOf(Util.isNullOrNil(this.f203793D)), Boolean.valueOf(Util.isNullOrNil(this.f203792C)));
            this.f203817s.setEnabled(false);
            return;
        }
        this.f203817s.setEnabled(true);
    }

    /* renamed from: N7 */
    public final void mo97189N7() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!Util.isNullOrNil(this.f203796G)) {
            spannableStringBuilder.append(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), this.f203796G));
            spannableStringBuilder.append(" " + getString(C0966R.string.f360161ai1));
            spannableStringBuilder.setSpan(this.f203797H, this.f203796G.length(), spannableStringBuilder.length(), 34);
        } else {
            spannableStringBuilder.append(getString(C0966R.string.f360162ai2));
            spannableStringBuilder.setSpan(this.f203797H, 0, spannableStringBuilder.length(), 18);
        }
        this.f203816r.setText(spannableStringBuilder);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6554i6;
    }

    public void initView() {
        ez4 ez4;
        this.f203810i = (ScrollView) findViewById(C0966R.C0970id.iwq);
        this.f203807f = (CdnImageView) findViewById(C0966R.C0970id.ajv);
        this.f203808g = (TextView) findViewById(C0966R.C0970id.ajx);
        this.f203809h = (TextView) findViewById(C0966R.C0970id.f357576ak2);
        this.f203811j = (WalletFormView) findViewById(C0966R.C0970id.ajw);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.ajy);
        this.f203812n = linearLayout;
        this.f203813o = (TextView) linearLayout.findViewById(C0966R.C0970id.ajz);
        this.f203814p = (TextView) this.f203812n.findViewById(C0966R.C0970id.f357574ak0);
        this.f203815q = (TextView) this.f203812n.findViewById(C0966R.C0970id.ak4);
        this.f203816r = (TextView) this.f203812n.findViewById(C0966R.C0970id.f357577ak3);
        this.f203817s = (Button) findViewById(C0966R.C0970id.f357575ak1);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.in9);
        this.f203818t = viewGroup;
        this.f203819u = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.f359074io2);
        this.f203820v = (TextView) this.f203818t.findViewById(C0966R.C0970id.io5);
        this.f203821w = (CdnImageView) this.f203818t.findViewById(C0966R.C0970id.f359075io3);
        this.f203822x = (CdnImageView) this.f203818t.findViewById(C0966R.C0970id.io4);
        this.f203813o.setText(getString(C0966R.string.ahg, new Object[]{this.f203823y.f115904p}));
        this.f203807f.setUrl(this.f203823y.f115897f);
        this.f203808g.setText(getString(C0966R.string.ai7, new Object[]{this.f203823y.f115896e, this.f203791B}));
        this.f203809h.setText(this.f203824z);
        this.f203811j.setTitleText(C45121z0.m49962b());
        setEditFocusListener(this.f203811j, 2, false);
        this.f203811j.setmContentAbnormalMoneyCheck(true);
        this.f203811j.mo105069a(new C70513a());
        this.f203816r.setClickable(true);
        this.f203816r.setOnTouchListener(new C75355a0(this));
        this.f203797H = new C72476y0(2, (C72476y0.C72477a) new C78173h(this, getIntent().getIntExtra("key_reason_len", 10)));
        mo97189N7();
        this.f203817s.setOnClickListener(new C70514b());
        mo97188M7();
        dz4 dz4 = this.f203805Q;
        if (dz4 == null || dz4.f132590d != 1 || (ez4 = dz4.f132591e) == null || Util.isNullOrNil(ez4.f133210d)) {
            Log.m105924i("MicroMsg.BankRemitMoneyInputUI", "  do not show WarningView");
            this.f203818t.setVisibility(8);
        } else {
            dz4 dz42 = this.f203805Q;
            ez4 ez42 = dz42.f132591e;
            this.f203818t.setVisibility(0);
            Log.m105925i("MicroMsg.BankRemitMoneyInputUI", "warning textInfo.wording:%s", ez42.f133210d);
            this.f203820v.setText(ez42.f133210d);
            if (!C85875k4.m106211z() || Util.isNullOrNil(dz42.f132593g)) {
                this.f203820v.setTextColor(C75228t.m90235a0(dz42.f132592f));
            } else {
                this.f203820v.setTextColor(C75228t.m90235a0(dz42.f132593g));
            }
            int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 20.0f);
            int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 8.0f);
            int fromDPToPix3 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 16.0f);
            if (!C85875k4.m106211z() || Util.isNullOrNil(dz42.f132595i)) {
                this.f203821w.mo100288c(dz42.f132594h, fromDPToPix, fromDPToPix, -1);
            } else {
                this.f203821w.mo100288c(dz42.f132595i, fromDPToPix, fromDPToPix, -1);
            }
            if (C85875k4.m106211z() && !Util.isNullOrNil(dz42.f132597n)) {
                this.f203822x.mo100288c(dz42.f132597n, fromDPToPix2, fromDPToPix3, -1);
            } else if (C85875k4.m106211z() || Util.isNullOrNil(dz42.f132596j)) {
                this.f203822x.setVisibility(8);
            } else {
                this.f203822x.mo100288c(dz42.f132596j, fromDPToPix2, fromDPToPix3, -1);
            }
            this.f203818t.postDelayed(new C78172f(this), 10);
            this.f203819u.setClickable(true);
            this.f203819u.setOnClickListener(new C52583g(this, ez42));
        }
        setTenpayKBStateListener(new C70515c());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C48391l lVar;
        if (i == 1) {
            if (i2 == -1) {
                Log.m105924i("MicroMsg.BankRemitMoneyInputUI", "goto detail");
                Intent intent2 = new Intent(getContext(), BankRemitDetailUI.class);
                intent2.putExtra("key_transfer_bill_id", this.f203799J);
                intent2.putExtra("key_enter_scene", 0);
                startActivityForResult(intent2, 2);
                mo97187L7(intent != null ? intent.getStringExtra("key_trans_id") : "");
                this.f203801L = 1;
                lVar = new C48391l(this.f203799J, this.f203800K, 1);
            } else if (C75157y0.m90140c(intent)) {
                finish();
                return;
            } else if (!C75157y0.m90141d(intent)) {
                Log.m105925i("MicroMsg.BankRemitMoneyInputUI", "pay failed: %d", Integer.valueOf(i2));
                this.f203801L = intent.getIntExtra("key_pay_reslut_type", 0);
                lVar = new C48391l(this.f203799J, this.f203800K, this.f203801L);
                Log.m105925i("MicroMsg.BankRemitMoneyInputUI", "onActivityResult() requestCode == REQ_PAY resultCode != RESULT_OK  mUnpayType:%s", Integer.valueOf(this.f203801L));
            } else {
                return;
            }
            doSceneProgress(lVar, false);
        } else if (i == 2) {
            Log.m105918d("MicroMsg.BankRemitMoneyInputUI", "return from detail");
            Intent intent3 = new Intent();
            intent3.addFlags(67108864);
            C88144b.m109791i(getContext(), "offline", ".ui.WalletOfflineCoinPurseUI", intent3, (Bundle) null);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        addSceneEndListener(1380);
        addSceneEndListener(2739);
        int i = 10;
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_BANK_REMIT_MIN_POUNDAGE_INT_SYNC, 10)).intValue();
        if (intValue >= 0) {
            i = intValue;
        }
        this.f203802M = i;
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_BANK_REMIT_MAX_TRANSFER_AMOUNT_INT_SYNC;
        int i3 = GmsVersion.VERSION_LONGHORN;
        int intValue2 = ((Integer) i2.mo119685f(aVar, Integer.valueOf(GmsVersion.VERSION_LONGHORN))).intValue();
        if (intValue2 > 0) {
            i3 = intValue2;
        }
        this.f203803N = i3;
        Log.m105925i("MicroMsg.BankRemitMoneyInputUI", "minFee: %s, maxAmount: %s", Integer.valueOf(this.f203802M), Integer.valueOf(this.f203803N));
        this.f203800K = getIntent().getStringExtra("key_unique_id");
        this.f203823y = (BankcardElemParcel) getIntent().getParcelableExtra("key_bank_card_elem_parcel");
        this.f203824z = getIntent().getStringExtra("key_payee_name");
        this.f203790A = getIntent().getStringExtra("key_bank_card_seqno");
        this.f203791B = getIntent().getStringExtra("key_bank_card_tailno");
        this.f203792C = getIntent().getStringExtra("key_encrypt_data");
        this.f203794E = getIntent().getIntExtra("key_enter_time_scene", 0);
        this.f203795F = getIntent().getIntExtra("key_input_type", 0);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_notice_item");
        if (byteArrayExtra != null) {
            dz4 dz4 = new dz4();
            try {
                dz4.parseFrom(byteArrayExtra);
                this.f203805Q = dz4;
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.BankRemitMoneyInputUI", e, "", new Object[0]);
            }
        }
        Log.m105919d("MicroMsg.BankRemitMoneyInputUI", "set uniqueId:%s", this.f203800K);
        if (this.f203823y == null) {
            Log.m105928w("MicroMsg.BankRemitMoneyInputUI", "bankcard elem is null");
            this.f203823y = new BankcardElemParcel();
        }
        this.f203793D = this.f203823y.f115895d;
        initView();
        setMMTitle((int) C0966R.string.aie);
        C79144b.m95773a().getClass();
        this.mKindaEnable = true;
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1380);
        removeSceneEndListener(2739);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C77715m) {
            C77715m mVar = (C77715m) yVar;
            mVar.mo104823q1(new C70516d(mVar));
            if (mVar.f221040j) {
                Log.m105921e("MicroMsg.BankRemitMoneyInputUI", "request order error: %s, %s", Integer.valueOf(mVar.f226502s.f228038d), mVar.f226502s.f228039e);
                m83043K7(this, mVar);
                if (this.mKindaEnable) {
                    hideLoading();
                }
            }
            if (mVar.f221039i) {
                Log.m105921e("MicroMsg.BankRemitMoneyInputUI", "net error: %s", mVar);
                if (this.mKindaEnable) {
                    hideLoading();
                }
            }
        }
        return false;
    }

    public boolean shouldEnsureSoterConnection() {
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C70517e.class);
    }
}
