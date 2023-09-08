package com.tencent.p014mm.plugin.collect.reward.p037ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.F2fPayCheckEvent;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import di3.C86312j;
import f21.C45737a;
import f21.C45742d;
import f21.C75671e;
import ie3.C76324c;
import ie3.C76331i;
import java.lang.ref.WeakReference;
import m63.C76746a;
import nj3.C76879j;
import ob0.C117747y;
import p196ln.C76705f;
import p629ny.C76979h;
import p910lj.C76701a;
import te3.C64663qq;
import te3.C77933g43;
import yq3.C79144b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI */
public class QrRewardGrantUI extends QrRewardBaseUI {

    /* renamed from: K */
    public static final /* synthetic */ int f197657K = 0;

    /* renamed from: A */
    public String f197658A;

    /* renamed from: B */
    public String f197659B;

    /* renamed from: C */
    public String f197660C;

    /* renamed from: D */
    public String f197661D;

    /* renamed from: E */
    public String f197662E;

    /* renamed from: F */
    public int f197663F;

    /* renamed from: G */
    public String f197664G;

    /* renamed from: H */
    public String f197665H;

    /* renamed from: I */
    public C77933g43 f197666I;

    /* renamed from: J */
    public IListener<F2fPayCheckEvent> f197667J = new IListener<F2fPayCheckEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1822922800;
        }

        public boolean callback(IEvent iEvent) {
            F2fPayCheckEvent f2fPayCheckEvent = (F2fPayCheckEvent) iEvent;
            F2fPayCheckEvent.C67693a aVar = f2fPayCheckEvent.f193594d;
            if (aVar.f193598d) {
                Log.m105922f("MicroMsg.QrRewardGrantUI", "F2fPayCheckEvent is from kinda");
                F2fPayCheckEvent.C67693a aVar2 = f2fPayCheckEvent.f193594d;
                if (aVar2.f193599e == 1) {
                    QrRewardGrantUI qrRewardGrantUI = QrRewardGrantUI.this;
                    String str = aVar2.f193595a;
                    String str2 = aVar2.f193597c;
                    int i = QrRewardGrantUI.f197657K;
                    qrRewardGrantUI.mo94650J7(str, str2);
                    QrRewardGrantUI.this.setResult(-1);
                    C119179t tVar = C119157j.f356862d;
                    C68826a aVar3 = new C68826a(this);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(aVar3, 100, false);
                }
            } else {
                QrRewardGrantUI qrRewardGrantUI2 = QrRewardGrantUI.this;
                String str3 = aVar.f193595a;
                String str4 = aVar.f193597c;
                int i2 = QrRewardGrantUI.f197657K;
                qrRewardGrantUI2.mo94650J7(str3, str4);
            }
            return false;
        }
    };

    /* renamed from: d */
    public CdnImageView f197668d;

    /* renamed from: e */
    public TextView f197669e;

    /* renamed from: f */
    public TextView f197670f;

    /* renamed from: g */
    public WalletTextView f197671g;

    /* renamed from: h */
    public LinearLayout f197672h;

    /* renamed from: i */
    public WalletFormView f197673i;

    /* renamed from: j */
    public MMEditText f197674j;

    /* renamed from: n */
    public Button f197675n;

    /* renamed from: o */
    public RadioButton f197676o;

    /* renamed from: p */
    public WcPayBannerView f197677p;

    /* renamed from: q */
    public int f197678q;

    /* renamed from: r */
    public int f197679r;

    /* renamed from: s */
    public String f197680s;

    /* renamed from: t */
    public String f197681t;

    /* renamed from: u */
    public String f197682u;

    /* renamed from: v */
    public String f197683v;

    /* renamed from: w */
    public String f197684w;

    /* renamed from: x */
    public String f197685x;

    /* renamed from: y */
    public int f197686y;

    /* renamed from: z */
    public String f197687z;

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI$a */
    public class C68803a implements TextWatcher {
        public C68803a() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().startsWith(".")) {
                editable.insert(0, "0");
            }
            String obj = editable.toString();
            int indexOf = obj.indexOf(".");
            int length = obj.length();
            if (indexOf >= 0 && length - indexOf > 3) {
                editable.delete(indexOf + 3, length);
            } else if (indexOf > 6) {
                editable.delete(6, indexOf);
            } else if (indexOf == -1 && length > 6) {
                editable.delete(6, length);
            }
            int round = (int) Math.round(Util.getDouble(editable.toString(), 0.0d) * 100.0d);
            QrRewardGrantUI.m81069H7(QrRewardGrantUI.this, round);
            QrRewardGrantUI.this.f197678q = round;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI$b */
    public class C68804b extends C30870z1 {
        public C68804b() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            if (QrRewardGrantUI.m81069H7(QrRewardGrantUI.this, (int) Math.round(Util.getDouble(QrRewardGrantUI.this.f197673i.getText(), 0.0d) * 100.0d))) {
                QrRewardGrantUI qrRewardGrantUI = QrRewardGrantUI.this;
                String replace = qrRewardGrantUI.f197674j.getText().toString().replace("\n", "");
                boolean isChecked = qrRewardGrantUI.f197676o.isChecked();
                Log.m105925i("MicroMsg.QrRewardGrantUI", "do place order, amt: %s, amtType: %s, payer desc: %s showPayInfo %s", Integer.valueOf(qrRewardGrantUI.f197678q), Integer.valueOf(qrRewardGrantUI.f197679r), replace, Integer.valueOf(isChecked ? 1 : 0));
                C75671e eVar = new C75671e(qrRewardGrantUI.f197678q, qrRewardGrantUI.f197679r, qrRewardGrantUI.f197687z, qrRewardGrantUI.f197680s, replace, qrRewardGrantUI.f197686y, qrRewardGrantUI.f197659B, qrRewardGrantUI.f197684w, qrRewardGrantUI.f197660C, qrRewardGrantUI.f197661D, qrRewardGrantUI.f197662E, isChecked);
                eVar.f123589g = new WeakReference<>(qrRewardGrantUI);
                if (qrRewardGrantUI.mKindaEnable) {
                    qrRewardGrantUI.showLoading();
                    qrRewardGrantUI.doSceneProgress(eVar, false);
                    return;
                }
                qrRewardGrantUI.doSceneProgress(eVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI$c */
    public class C68805c extends C7089c0 {
        public C68805c() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            QrRewardGrantUI.this.f197676o.setChecked(!QrRewardGrantUI.this.f197676o.isChecked());
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI$d */
    public class C68806d implements CompoundButton.OnCheckedChangeListener {
        public C68806d(QrRewardGrantUI qrRewardGrantUI) {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI$e */
    public class C68807e implements C45737a.C45739b {

        /* renamed from: a */
        public final /* synthetic */ C75671e f197692a;

        public C68807e(C75671e eVar) {
            this.f197692a = eVar;
        }

        /* renamed from: a */
        public void mo63897a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.QrRewardGrantUI", "place order error: %s, %s", Integer.valueOf(this.f197692a.f222270n.f185063d), this.f197692a.f222270n.f185064e);
            if (!Util.isNullOrNil(this.f197692a.f222270n.f185064e)) {
                C76701a.makeText((Context) QrRewardGrantUI.this, (CharSequence) this.f197692a.f222270n.f185064e, 0).show();
            }
            QrRewardGrantUI qrRewardGrantUI = QrRewardGrantUI.this;
            int i3 = QrRewardGrantUI.f197657K;
            if (qrRewardGrantUI.mKindaEnable) {
                qrRewardGrantUI.hideLoading();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI$f */
    public class C68808f implements C45737a.C45739b {

        /* renamed from: a */
        public final /* synthetic */ C75671e f197694a;

        /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI$f$a */
        public class C68809a implements DialogInterface.OnClickListener {
            public C68809a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                QrRewardGrantUI.m81070I7(QrRewardGrantUI.this);
            }
        }

        /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI$f$b */
        public class C68810b implements DialogInterface.OnClickListener {
            public C68810b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                QrRewardGrantUI qrRewardGrantUI = QrRewardGrantUI.this;
                int i2 = QrRewardGrantUI.f197657K;
                if (qrRewardGrantUI.mKindaEnable) {
                    qrRewardGrantUI.hideLoading();
                }
            }
        }

        public C68808f(C75671e eVar) {
            this.f197694a = eVar;
        }

        /* renamed from: a */
        public void mo63897a(int i, int i2, String str, C117747y yVar) {
            QrRewardGrantUI qrRewardGrantUI = QrRewardGrantUI.this;
            C64663qq qqVar = this.f197694a.f222270n;
            qrRewardGrantUI.f197681t = qqVar.f185065f;
            qrRewardGrantUI.f197682u = qqVar.f185066g;
            qrRewardGrantUI.f197683v = qqVar.f185067h;
            qrRewardGrantUI.f197684w = qqVar.f185070n;
            qrRewardGrantUI.f197685x = qqVar.f185071o;
            Log.m105925i("MicroMsg.QrRewardGrantUI", "remind str: %s", qqVar.f185069j);
            if (!Util.isNullOrNil(this.f197694a.f222270n.f185069j)) {
                C76879j.m92707A(QrRewardGrantUI.this.getContext(), this.f197694a.f222270n.f185069j, "", QrRewardGrantUI.this.getString(C0966R.string.i0h), QrRewardGrantUI.this.getString(C0966R.string.f7926wf), new C68809a(), new C68810b());
            } else {
                QrRewardGrantUI.m81070I7(QrRewardGrantUI.this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m81069H7(com.tencent.p014mm.plugin.collect.reward.p037ui.QrRewardGrantUI r7, int r8) {
        /*
            int r0 = r7.f197679r
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0007
            goto L_0x001d
        L_0x0007:
            double r3 = (double) r8
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0011
            r8 = 0
            r0 = 1
            goto L_0x0029
        L_0x0011:
            int r0 = r7.f197663F
            if (r8 > r0) goto L_0x001f
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r8 = r7.f197673i
            r0 = 2131101252(0x7f060644, float:1.7814908E38)
            r8.setContentTextColorRes(r0)
        L_0x001d:
            r8 = 1
            goto L_0x0028
        L_0x001f:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r8 = r7.f197673i
            r0 = 2131099891(0x7f0600f3, float:1.7812148E38)
            r8.setContentTextColorRes(r0)
            r8 = 0
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r8 == 0) goto L_0x004c
            android.widget.TextView r0 = r7.f197670f
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0046
            android.widget.TextView r0 = r7.f197670f
            r2 = 2130772123(0x7f01009b, float:1.7147356E38)
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r7, r2)
            r0.startAnimation(r2)
            android.widget.TextView r0 = r7.f197670f
            r2 = 8
            r0.setVisibility(r2)
        L_0x0046:
            android.widget.Button r7 = r7.f197675n
            r7.setEnabled(r1)
            goto L_0x0072
        L_0x004c:
            if (r0 == 0) goto L_0x0054
            android.widget.Button r7 = r7.f197675n
            r7.setEnabled(r2)
            goto L_0x0072
        L_0x0054:
            android.widget.TextView r0 = r7.f197670f
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L_0x006d
            android.widget.TextView r0 = r7.f197670f
            r1 = 2130772100(0x7f010084, float:1.7147309E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r7, r1)
            r0.startAnimation(r1)
            android.widget.TextView r0 = r7.f197670f
            r0.setVisibility(r2)
        L_0x006d:
            android.widget.Button r7 = r7.f197675n
            r7.setEnabled(r2)
        L_0x0072:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.collect.reward.p037ui.QrRewardGrantUI.m81069H7(com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI, int):boolean");
    }

    /* renamed from: I7 */
    public static void m81070I7(QrRewardGrantUI qrRewardGrantUI) {
        qrRewardGrantUI.getClass();
        Log.m105924i("MicroMsg.QrRewardGrantUI", "start pay");
        PayInfo payInfo = new PayInfo();
        payInfo.f212592j = qrRewardGrantUI.f197681t;
        payInfo.f212587e = 48;
        payInfo.f212589g = qrRewardGrantUI.f197686y;
        Bundle bundle = new Bundle();
        bundle.putString("extinfo_key_1", qrRewardGrantUI.f197687z);
        bundle.putString("extinfo_key_2", qrRewardGrantUI.f197658A);
        bundle.putString("extinfo_key_3", qrRewardGrantUI.f197680s);
        bundle.putString("extinfo_key_7", qrRewardGrantUI.f197674j.getText().toString().replace("\n", ""));
        bundle.putString("extinfo_key_27", qrRewardGrantUI.f197665H);
        bundle.putString("extinfo_key_28", qrRewardGrantUI.f197664G);
        int intExtra = qrRewardGrantUI.getIntent().getIntExtra("key_chat_type", 0);
        int intExtra2 = qrRewardGrantUI.getIntent().getIntExtra("key_send_type", 0);
        bundle.putInt("chat_type", intExtra);
        bundle.putInt("send_type", intExtra2);
        payInfo.f212600u = bundle;
        if (qrRewardGrantUI.mKindaEnable) {
            ((C76324c) C86312j.m106911c(C76324c.class)).startSNSPay(qrRewardGrantUI, payInfo);
        } else {
            C76331i.m91761e(qrRewardGrantUI, payInfo, 1);
        }
    }

    /* renamed from: J7 */
    public final void mo94650J7(String str, String str2) {
        Log.m105924i("MicroMsg.QrRewardGrantUI", "do pay check");
        if (Util.isNullOrNil(this.f197681t)) {
            this.f197681t = str;
        }
        if (Util.isNullOrNil(this.f197683v)) {
            this.f197683v = str2;
        }
        doSceneProgress(new C45742d(this.f197681t, this.f197682u, this.f197683v, this.f197678q, this.f197684w, this.f197685x), false);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bp4;
    }

    public void initView() {
        this.f197668d = (CdnImageView) findViewById(C0966R.C0970id.f358994ia1);
        this.f197669e = (TextView) findViewById(C0966R.C0970id.f358995ia2);
        this.f197671g = (WalletTextView) findViewById(C0966R.C0970id.ia6);
        this.f197672h = (LinearLayout) findViewById(C0966R.C0970id.ia5);
        this.f197673i = (WalletFormView) findViewById(C0966R.C0970id.f358996ia3);
        this.f197674j = (MMEditText) findViewById(C0966R.C0970id.ia4);
        this.f197675n = (Button) findViewById(C0966R.C0970id.ia7);
        this.f197670f = (TextView) findViewById(C0966R.C0970id.f358993ia0);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f197677p = wcPayBannerView;
        wcPayBannerView.mo105020a();
        RadioButton radioButton = (RadioButton) findViewById(C0966R.C0970id.f359004ic2);
        this.f197676o = radioButton;
        radioButton.setChecked(true);
        TextView textView = this.f197670f;
        textView.setText(getString(C0966R.string.hpv, new Object[]{"" + Math.round(((float) this.f197663F) / 100.0f)}));
        if (Util.isNullOrNil(this.f197665H)) {
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f197668d, this.f197687z, 0.03f);
        } else {
            int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 50.0f);
            this.f197668d.setRoundCorner(true);
            this.f197668d.mo100288c(this.f197665H, fromDPToPix, fromDPToPix, C0966R.C0969drawable.bfa);
        }
        this.f197669e.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, getString(C0966R.string.hph, new Object[]{Util.isNullOrNil(this.f197664G) ? C75228t.m90277z(C75228t.m90268r(this.f197687z), 10) : this.f197664G})));
        if (this.f197679r == 2) {
            Log.m105924i("MicroMsg.QrRewardGrantUI", "edit layout");
            setEditFocusListener(this.f197673i, 2, false);
            this.f197673i.mo105069a(new C68803a());
            this.f197673i.setVisibility(0);
            this.f197672h.setVisibility(8);
            this.f197673i.mo105095m();
            this.f197675n.setEnabled(false);
        } else {
            this.f197671g.setText(C75228t.m90260n(((double) this.f197678q) / 100.0d));
            this.f197673i.setVisibility(8);
            this.f197672h.setVisibility(0);
        }
        this.f197675n.setOnClickListener(new C68804b());
        findViewById(C0966R.C0970id.f359005ic3).setOnClickListener(new C68805c());
        this.f197676o.setOnCheckedChangeListener(new C68806d(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1);
            if (intent != null) {
                mo94650J7(intent.getStringExtra("key_reqKey"), intent.getStringExtra("key_trans_id"));
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1336);
        this.f197667J.alive();
        setMMTitle((int) C0966R.string.hpg);
        this.f197678q = getIntent().getIntExtra("key_money_amt", 20000);
        this.f197679r = getIntent().getIntExtra("key_amt_type", 0);
        this.f197680s = getIntent().getStringExtra("key_qrcode_desc");
        this.f197686y = getIntent().getIntExtra("key_channel", 0);
        this.f197684w = getIntent().getStringExtra("key_rcvr_open_id");
        this.f197687z = getIntent().getStringExtra("key_rcvr_name");
        this.f197658A = getIntent().getStringExtra("key_rcvr_true_name");
        this.f197659B = getIntent().getStringExtra("key_scan_id");
        this.f197660C = getIntent().getStringExtra("key_web_url");
        this.f197661D = getIntent().getStringExtra("key_sxtend_1");
        this.f197662E = getIntent().getStringExtra("key_sxtend_2");
        this.f197663F = getIntent().getIntExtra("key_max_amt", 20000);
        this.f197664G = getIntent().getStringExtra("key_receiver_nickname");
        this.f197665H = getIntent().getStringExtra("key_photo_url");
        String stringExtra = getIntent().getStringExtra("key_notice_item");
        if (!Util.isNullOrNil(stringExtra)) {
            C77933g43 g432 = new C77933g43();
            try {
                g432.parseFrom(C76746a.m92458a(stringExtra));
                this.f197666I = g432;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.QrRewardGrantUI", e, "", new Object[0]);
            }
        }
        Log.m105925i("MicroMsg.QrRewardGrantUI", "amtType: %s, channel: %s, maxAmt: %s", Integer.valueOf(this.f197679r), Integer.valueOf(this.f197686y), Integer.valueOf(this.f197663F));
        initView();
        this.f197677p.setBannerData(this.f197666I);
        C79144b.m95773a().getClass();
        this.mKindaEnable = true;
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1336);
        this.f197667J.dead();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C75671e) {
            C75671e eVar = (C75671e) yVar;
            eVar.mo71234m1(new C68808f(eVar));
            eVar.mo71233l1(new C68807e(eVar));
            if (eVar.f123590h) {
                Log.m105921e("MicroMsg.QrRewardGrantUI", "net error: %s", eVar);
                if (this.mKindaEnable) {
                    hideLoading();
                }
            }
        }
        return true;
    }
}
