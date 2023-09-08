package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.HashSet;
import nj3.C76879j;
import ob0.C117747y;
import q02.C47743g;
import te3.C50348m32;
import te3.C50452mu2;
import te3.eh4;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI */
public class HoneyPayModifyQuotaUI extends HoneyPayBaseUI {

    /* renamed from: w */
    public static final /* synthetic */ int f114869w = 0;

    /* renamed from: f */
    public WalletFormView f114870f;

    /* renamed from: g */
    public Button f114871g;

    /* renamed from: h */
    public TextView f114872h;

    /* renamed from: i */
    public TextView f114873i;

    /* renamed from: j */
    public TextView f114874j;

    /* renamed from: n */
    public long f114875n;

    /* renamed from: o */
    public long f114876o;

    /* renamed from: p */
    public String f114877p;

    /* renamed from: q */
    public String f114878q;

    /* renamed from: r */
    public String f114879r;

    /* renamed from: s */
    public String f114880s;

    /* renamed from: t */
    public String f114881t;

    /* renamed from: u */
    public String f114882u;

    /* renamed from: v */
    public eh4 f114883v;

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI$e */
    public static class C4602e extends MMBaseAccessibilityConfig {
        public C4602e(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            root(C0966R.C0970id.ezm).view(C0966R.C0970id.ljn).disable();
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI$a */
    public class C42443a implements TextWatcher {
        public C42443a() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().startsWith(".")) {
                editable.insert(0, "0");
            }
            String obj = editable.toString();
            int indexOf = obj.indexOf(".");
            int length = obj.length();
            if (indexOf >= 0 && length - indexOf > 2) {
                editable.delete(indexOf + 3, length);
            }
            HoneyPayModifyQuotaUI.m46111I7(HoneyPayModifyQuotaUI.this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI$b */
    public class C42444b extends C7089c0 {
        public C42444b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            if (HoneyPayModifyQuotaUI.m46111I7(HoneyPayModifyQuotaUI.this)) {
                HoneyPayModifyQuotaUI honeyPayModifyQuotaUI = HoneyPayModifyQuotaUI.this;
                long Y = C75228t.m90232Y(honeyPayModifyQuotaUI.f114870f.getText(), "100");
                Log.m105924i(honeyPayModifyQuotaUI.f114712d, "modify credit line token sign");
                honeyPayModifyQuotaUI.showSafeProgress();
                C47743g gVar = new C47743g(honeyPayModifyQuotaUI.f114877p, Y, honeyPayModifyQuotaUI.f114878q);
                gVar.mo104821m1(honeyPayModifyQuotaUI);
                honeyPayModifyQuotaUI.doSceneProgress(gVar, true);
                HoneyPayModifyQuotaUI.this.hideTenpayKB();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI$c */
    public class C42445c implements Runnable {
        public C42445c() {
        }

        public void run() {
            HoneyPayModifyQuotaUI honeyPayModifyQuotaUI = HoneyPayModifyQuotaUI.this;
            honeyPayModifyQuotaUI.f114870f.mo105096n(honeyPayModifyQuotaUI);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI$d */
    public class C42446d implements DialogInterface.OnClickListener {
        public C42446d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            HoneyPayModifyQuotaUI honeyPayModifyQuotaUI = HoneyPayModifyQuotaUI.this;
            int i2 = HoneyPayModifyQuotaUI.f114869w;
            honeyPayModifyQuotaUI.mo66529J7();
        }
    }

    /* renamed from: I7 */
    public static boolean m46111I7(HoneyPayModifyQuotaUI honeyPayModifyQuotaUI) {
        if (Util.isNullOrNil(honeyPayModifyQuotaUI.f114870f.getText())) {
            honeyPayModifyQuotaUI.mo66530K7(false);
            honeyPayModifyQuotaUI.mo66531L7(false);
            honeyPayModifyQuotaUI.f114871g.setEnabled(false);
        } else {
            int X = C75228t.m90231X(honeyPayModifyQuotaUI.f114870f.getText(), "100");
            Log.m105919d(honeyPayModifyQuotaUI.f114712d, "current fen: %s", Integer.valueOf(X));
            long j = (long) X;
            if (j < honeyPayModifyQuotaUI.f114876o) {
                honeyPayModifyQuotaUI.mo66531L7(true);
                honeyPayModifyQuotaUI.f114871g.setEnabled(false);
            } else if (j > honeyPayModifyQuotaUI.f114875n) {
                honeyPayModifyQuotaUI.mo66530K7(true);
                honeyPayModifyQuotaUI.f114871g.setEnabled(false);
            } else if (X == 0) {
                honeyPayModifyQuotaUI.f114871g.setEnabled(false);
            } else {
                honeyPayModifyQuotaUI.mo66530K7(false);
                honeyPayModifyQuotaUI.mo66531L7(false);
                honeyPayModifyQuotaUI.f114871g.setEnabled(true);
                return true;
            }
        }
        return false;
    }

    /* renamed from: J7 */
    public final void mo66529J7() {
        Log.m105924i(this.f114712d, "go to check pwd ui");
        long Y = C75228t.m90232Y(this.f114870f.getText(), "100");
        Intent intent = new Intent(this, HoneyPayCheckPwdUI.class);
        intent.putExtra("key_scene", 2);
        intent.putExtra("key_credit_line", Y);
        intent.putExtra("key_card_no", this.f114877p);
        intent.putExtra("key_take_message", this.f114878q);
        try {
            intent.putExtra("key_toke_mess", this.f114883v.toByteArray());
        } catch (IOException e) {
            Log.printErrStackTrace(this.f114712d, e, "", new Object[0]);
        }
        startActivityForResult(intent, 1);
    }

    /* renamed from: K7 */
    public final void mo66530K7(boolean z) {
        if (z && !this.f114872h.isShown()) {
            StringBuilder sb = new StringBuilder();
            sb.append(C45121z0.m49962b());
            sb.append(C75228t.m90248h("" + this.f114875n, "100", 2, RoundingMode.HALF_UP));
            String sb4 = sb.toString();
            if (!Util.isNullOrNil(this.f114881t)) {
                this.f114872h.setText(this.f114881t);
            } else {
                this.f114872h.setText(getString(C0966R.string.fkq, new Object[]{sb4}));
            }
            this.f114872h.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2425cq));
            this.f114872h.setVisibility(0);
        } else if (!z && this.f114872h.isShown()) {
            this.f114872h.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2447d_));
            this.f114872h.setVisibility(8);
        }
    }

    /* renamed from: L7 */
    public final void mo66531L7(boolean z) {
        if (z && !this.f114872h.isShown()) {
            StringBuilder sb = new StringBuilder();
            sb.append(C45121z0.m49962b());
            sb.append(C75228t.m90248h("" + this.f114876o, "100", 2, RoundingMode.HALF_UP).toString());
            String sb4 = sb.toString();
            this.f114872h.setText(getString(C0966R.string.fku, new Object[]{sb4}));
            this.f114872h.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2425cq));
            this.f114872h.setVisibility(0);
        } else if (!z && this.f114872h.isShown()) {
            this.f114872h.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2447d_));
            this.f114872h.setVisibility(8);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.azp;
    }

    public void initView() {
        this.f114870f = (WalletFormView) findViewById(C0966R.C0970id.ezl);
        this.f114871g = (Button) findViewById(C0966R.C0970id.ezk);
        this.f114872h = (TextView) findViewById(C0966R.C0970id.ezn);
        this.f114873i = (TextView) findViewById(C0966R.C0970id.nnn);
        this.f114874j = (TextView) findViewById(C0966R.C0970id.nnm);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2927a));
        if (!Util.isNullOrNil(this.f114880s)) {
            this.f114873i.setText(this.f114880s);
        } else {
            this.f114873i.setText(C0966R.string.fkl);
        }
        if (!Util.isNullOrNil(this.f114882u)) {
            this.f114874j.setText(this.f114882u);
        }
        TenpaySecureEditText tenpaySecureEditText = this.f114870f.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setPadding(0, 0, 0, 0);
        }
        this.f114870f.getTitleTv().setText(C45121z0.m49962b());
        setEditFocusListener(this.f114870f, 2, false);
        this.f114870f.mo105069a(new C42443a());
        this.f114871g.setOnClickListener(new C42444b());
        this.f114870f.postDelayed(new C42445c(), 100);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1 && intent.getBooleanExtra("key_modify_create_line_succ", false)) {
            setResult(-1, intent);
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f114875n = getIntent().getLongExtra("key_max_credit_line", 0);
        this.f114876o = getIntent().getLongExtra("key_min_credit_line", 0);
        this.f114877p = getIntent().getStringExtra("key_card_no");
        this.f114878q = getIntent().getStringExtra("key_take_message");
        this.f114879r = getIntent().getStringExtra("key_title");
        this.f114880s = getIntent().getStringExtra("key_subtitle");
        this.f114881t = getIntent().getStringExtra("key_over_quota_tips");
        this.f114882u = getIntent().getStringExtra("key_bottom_tips");
        initView();
        if (!Util.isNullOrNil(this.f114879r)) {
            setMMTitle(this.f114879r);
        } else {
            setMMTitle((int) C0966R.string.fkv);
        }
        addSceneEndListener(2815);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2815);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105919d(this.f114712d, "scene end. errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar instanceof C47743g) {
            hideProgress();
            C50348m32 m322 = ((C47743g) yVar).f128258r;
            this.f114878q = m322.f137816g;
            this.f114883v = m322.f137813d;
            C50452mu2 mu22 = m322.f137817h;
            if (mu22 != null) {
                C76879j.m92709C(this, mu22.f138212d, "", mu22.f138214f, mu22.f138213e, false, new C42446d(), (DialogInterface.OnClickListener) null);
            } else {
                mo66529J7();
            }
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C4602e.class);
    }
}
