package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import b63.C67209v;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSelectProfessionUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import gr3.C76024a;
import hr3.C76241b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C117747y;
import yq3.C79148e;
import z53.C79309g;
import z53.C79312k;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI */
public class WalletRealNameVerifyUI extends WalletBaseUI implements View.OnClickListener, WalletFormView.C75209c {

    /* renamed from: w */
    public static final /* synthetic */ int f209084w = 0;

    /* renamed from: d */
    public WalletFormView f209085d;

    /* renamed from: e */
    public WalletFormView f209086e;

    /* renamed from: f */
    public WalletFormView f209087f;

    /* renamed from: g */
    public WalletFormView f209088g;

    /* renamed from: h */
    public Button f209089h;

    /* renamed from: i */
    public CheckBox f209090i;

    /* renamed from: j */
    public TextView f209091j;

    /* renamed from: n */
    public TextView f209092n;

    /* renamed from: o */
    public ElementQuery f209093o;

    /* renamed from: p */
    public Profession[] f209094p;

    /* renamed from: q */
    public Profession f209095q;

    /* renamed from: r */
    public boolean f209096r = false;

    /* renamed from: s */
    public boolean f209097s = false;

    /* renamed from: t */
    public String f209098t;

    /* renamed from: u */
    public String f209099u;

    /* renamed from: v */
    public String f209100v;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI$a */
    public class C72079a implements View.OnClickListener {
        public C72079a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(WalletRealNameVerifyUI.this.getContext(), WalletSelectProfessionUI.class);
            intent.putExtra("key_profession_list", WalletRealNameVerifyUI.this.f209094p);
            WalletRealNameVerifyUI.this.startActivityForResult(intent, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI$b */
    public class C72080b implements View.OnClickListener {
        public C72080b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("GetAddress", true);
            intent.putExtra("ShowSelectedLocation", false);
            intent.putExtra("IsRealNameVerifyScene", true);
            intent.putExtra("IsNeedShowSearchBar", true);
            C88144b.m109802t(WalletRealNameVerifyUI.this.getContext(), ".ui.tools.MultiStageCitySelectUI", intent, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI$c */
    public class C72081c implements View.OnClickListener {
        public C72081c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String text = WalletRealNameVerifyUI.this.f209085d.getText();
            String text2 = WalletRealNameVerifyUI.this.f209086e.getText();
            WalletRealNameVerifyUI walletRealNameVerifyUI = WalletRealNameVerifyUI.this;
            walletRealNameVerifyUI.doSceneProgress(new C79309g(text, text2, walletRealNameVerifyUI.getInput().getInt("entry_scene", -1)), true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI$d */
    public class C72082d implements MenuItem.OnMenuItemClickListener {
        public C72082d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RealNameVerifyProcess realNameVerifyProcess = (RealNameVerifyProcess) WalletRealNameVerifyUI.this.getProcess();
            if (realNameVerifyProcess != null) {
                realNameVerifyProcess.mo91257c(WalletRealNameVerifyUI.this, 0);
            }
            WalletRealNameVerifyUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI$e */
    public class C72083e implements CompoundButton.OnCheckedChangeListener {
        public C72083e() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                WalletRealNameVerifyUI.this.f209089h.setEnabled(true);
                WalletRealNameVerifyUI.this.f209089h.setClickable(true);
                return;
            }
            WalletRealNameVerifyUI.this.f209089h.setEnabled(false);
            WalletRealNameVerifyUI.this.f209089h.setClickable(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI$f */
    public class C72084f implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI$f$a */
        public class C72085a implements C76879j.C76888o {
            public C72085a() {
            }

            /* renamed from: a */
            public void mo5759a(int i, int i2) {
                Intent intent = new Intent();
                if (i == 0) {
                    intent.putExtra("rawUrl", WalletRealNameVerifyUI.this.getString(C0966R.string.kka, new Object[]{LocaleUtil.getApplicationLanguage()}));
                } else if (i == 1) {
                    WalletRealNameVerifyUI walletRealNameVerifyUI = WalletRealNameVerifyUI.this;
                    if (walletRealNameVerifyUI.f209093o != null) {
                        intent.putExtra("rawUrl", walletRealNameVerifyUI.getString(C0966R.string.kk9, new Object[]{LocaleUtil.getApplicationLanguage(), WalletRealNameVerifyUI.this.f209093o.f209516s}));
                    }
                }
                intent.putExtra("showShare", false);
                intent.putExtra("allow_mix_content_mode", false);
                C75228t.m90217J(WalletRealNameVerifyUI.this.getContext(), intent);
            }
        }

        public C72084f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            linkedList.add(WalletRealNameVerifyUI.this.getString(C0966R.string.knu));
            linkedList2.add(0);
            WalletRealNameVerifyUI walletRealNameVerifyUI = WalletRealNameVerifyUI.this;
            ElementQuery elementQuery = walletRealNameVerifyUI.f209093o;
            if (elementQuery != null && elementQuery.f209499M) {
                linkedList.add(walletRealNameVerifyUI.getString(C0966R.string.kns));
                linkedList2.add(1);
            }
            C76879j.m92732c(WalletRealNameVerifyUI.this, "", linkedList, linkedList2, "", new C72085a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI$g */
    public class C72086g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f209108d;

        public C72086g(C117747y yVar) {
            this.f209108d = yVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify dialog lOk");
            WalletRealNameVerifyUI walletRealNameVerifyUI = WalletRealNameVerifyUI.this;
            C117747y yVar = this.f209108d;
            int i2 = WalletRealNameVerifyUI.f209084w;
            walletRealNameVerifyUI.mo99294H7(yVar);
            C67209v.m79539a(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI$h */
    public class C72087h implements DialogInterface.OnClickListener {
        public C72087h(WalletRealNameVerifyUI walletRealNameVerifyUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify dialog lCancel");
            C67209v.m79539a(0);
        }
    }

    /* renamed from: H7 */
    public final void mo99294H7(C117747y yVar) {
        C79148e process = getProcess();
        Bundle bundle = process != null ? process.f232423c : null;
        String str = ((C79309g) yVar).f232830d;
        Log.m105924i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response succ");
        if (process != null) {
            bundle.putString("key_real_name_token", str);
            bundle.putString("key_country_code", this.f209098t);
            bundle.putString("key_province_code", this.f209099u);
            bundle.putString("key_city_code", this.f209100v);
            bundle.putParcelable("key_profession", this.f209095q);
            process.mo91264o(this, 0, bundle);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cg7;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.l6b);
        this.f209089h = (Button) findViewById(C0966R.C0970id.hfe);
        this.f209085d = (WalletFormView) findViewById(C0966R.C0970id.h_9);
        this.f209086e = (WalletFormView) findViewById(C0966R.C0970id.aw9);
        this.f209087f = (WalletFormView) findViewById(C0966R.C0970id.f358963i34);
        this.f209088g = (WalletFormView) findViewById(C0966R.C0970id.i2w);
        this.f209092n = (TextView) findViewById(C0966R.C0970id.f7w);
        this.f209085d.setOnInputValidChangeListener(this);
        this.f209086e.setOnInputValidChangeListener(this);
        this.f209087f.setOnInputValidChangeListener(this);
        this.f209088g.setOnInputValidChangeListener(this);
        this.f209085d.setFocusable(true);
        this.f209085d.getInfoIv().setVisibility(8);
        C76024a.m91324e(this.f209086e);
        C76241b logicDelegate = this.f209086e.getLogicDelegate();
        if (logicDelegate instanceof C76024a.C76033i) {
            ((C76024a.C76033i) logicDelegate).mo106242f(1);
        }
        this.f209087f.setOnClickListener(new C72079a());
        this.f209088g.setOnClickListener(new C72080b());
        this.f209089h.setOnClickListener(new C72081c());
        setEditFocusListener(this.f209086e, 1, false);
        setBackBtn(new C72082d());
        this.f209090i = (CheckBox) findViewById(C0966R.C0970id.f5661l6);
        this.f209091j = (TextView) findViewById(C0966R.C0970id.f5660l5);
        this.f209090i.setChecked(true);
        this.f209090i.setOnCheckedChangeListener(new C72083e());
        this.f209091j.setOnClickListener(new C72084f());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1) {
                Profession profession = (Profession) intent.getParcelableExtra("key_select_profession");
                this.f209095q = profession;
                this.f209087f.setText(profession.f209290d);
                return;
            }
            Log.m105924i("MicroMsg.WalletRealNameVerifyUI", "no choose!");
        } else if (i != 2) {
        } else {
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("CountryName");
                String stringExtra2 = intent.getStringExtra("ProviceName");
                String stringExtra3 = intent.getStringExtra("CityName");
                this.f209098t = intent.getStringExtra("Country");
                this.f209099u = intent.getStringExtra("Contact_Province");
                this.f209100v = intent.getStringExtra("Contact_City");
                StringBuilder sb = new StringBuilder();
                if (!Util.isNullOrNil(stringExtra)) {
                    sb.append(stringExtra);
                }
                if (!Util.isNullOrNil(stringExtra2)) {
                    sb.append(" ");
                    sb.append(stringExtra2);
                }
                if (!Util.isNullOrNil(stringExtra3)) {
                    sb.append(" ");
                    sb.append(stringExtra3);
                }
                this.f209088g.setText(sb.toString());
                return;
            }
            Log.m105924i("MicroMsg.WalletRealNameVerifyUI", "no area choose!");
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mNetSceneMgr.mo105624c(1616);
        this.f209093o = (ElementQuery) getInput().getParcelable("elemt_query");
        initView();
        doSceneForceProgress(new C79312k((String) null));
    }

    public void onDestroy() {
        this.mNetSceneMgr.mo105630i(1616);
        super.onDestroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if ((!com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r3.f209098t) || !com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r3.f209099u) || !com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r3.f209100v)) == false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInputValidChange(boolean r4) {
        /*
            r3 = this;
            java.lang.String r4 = "MicroMsg.WalletRealNameVerifyUI"
            java.lang.String r0 = "check info"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r4 = r3.f209085d
            java.lang.String r4 = r4.getText()
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r3.f209086e
            java.lang.String r0 = r0.getText()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r1 = 0
            r2 = 1
            if (r4 == 0) goto L_0x001c
            goto L_0x004e
        L_0x001c:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 == 0) goto L_0x0023
            goto L_0x004e
        L_0x0023:
            boolean r4 = r3.f209096r
            if (r4 == 0) goto L_0x0046
            java.lang.String r4 = r3.f209098t
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0042
            java.lang.String r4 = r3.f209099u
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0042
            java.lang.String r4 = r3.f209100v
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r4 = 0
            goto L_0x0043
        L_0x0042:
            r4 = 1
        L_0x0043:
            if (r4 != 0) goto L_0x0046
            goto L_0x004e
        L_0x0046:
            boolean r4 = r3.f209097s
            if (r4 == 0) goto L_0x0050
            com.tencent.mm.plugin.wallet_core.id_verify.model.Profession r4 = r3.f209095q
            if (r4 != 0) goto L_0x0050
        L_0x004e:
            r4 = 0
            goto L_0x0051
        L_0x0050:
            r4 = 1
        L_0x0051:
            if (r4 != 0) goto L_0x005e
            android.widget.Button r4 = r3.f209089h
            r4.setEnabled(r1)
            android.widget.Button r4 = r3.f209089h
            r4.setClickable(r1)
            goto L_0x0068
        L_0x005e:
            android.widget.Button r4 = r3.f209089h
            r4.setEnabled(r2)
            android.widget.Button r4 = r3.f209089h
            r4.setClickable(r2)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI.onInputValidChange(boolean):void");
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = false;
        if (i != 0 || i2 != 0) {
            Log.m105920e("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response fail");
        } else if (yVar instanceof C79309g) {
            C79309g gVar = (C79309g) yVar;
            if (gVar.f232837n == null) {
                mo99294H7(yVar);
            } else {
                Log.m105924i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify show juveniles dialog");
                C67209v vVar = gVar.f232837n;
                C76879j.m92707A(this, vVar.f192980a, "", vVar.f192982c, vVar.f192981b, new C72086g(yVar), new C72087h(this));
            }
            return true;
        } else if (yVar instanceof C79312k) {
            C79312k kVar = (C79312k) yVar;
            this.f209096r = kVar.f232853d == 1;
            if (kVar.f232854e == 1) {
                z = true;
            }
            this.f209097s = z;
            if (!z) {
                this.f209087f.setVisibility(8);
            }
            if (!this.f209096r) {
                this.f209088g.setVisibility(8);
            }
            if (this.f209096r || this.f209097s) {
                this.f209092n.setText(C0966R.string.l67);
            }
            this.f209094p = kVar.f232855f;
            return true;
        }
        return false;
    }
}
