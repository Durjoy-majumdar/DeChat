package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScanBankCardResultEvent;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.p136ui.widget.picker.CustomDatePickerNew;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.RealNameBundle;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72394l;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletPhoneInputView;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import com.tenpay.android.wechat.TenpaySecureEncrypt;
import com.tenpay.ndk.Encrypt;
import di3.C86312j;
import gr3.C76024a;
import gr3.C76035b;
import hr3.C76241b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C117747y;
import p281yz.C79173v;
import qo3.C77426q;
import te3.C77922en3;
import v53.C78342e0;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI */
public class WalletCardElementUI extends WalletBaseUI implements WalletFormView.C75209c, TextView.OnEditorActionListener {

    /* renamed from: L1 */
    public static final /* synthetic */ int f209822L1 = 0;

    /* renamed from: A */
    public WalletFormView f209823A;

    /* renamed from: A1 */
    public int f209824A1;

    /* renamed from: B */
    public WalletFormView f209825B;

    /* renamed from: B1 */
    public int f209826B1;

    /* renamed from: C */
    public WalletFormView f209827C;

    /* renamed from: C1 */
    public String f209828C1;

    /* renamed from: D */
    public WalletFormView f209829D;

    /* renamed from: D1 */
    public String[] f209830D1;

    /* renamed from: E */
    public WalletFormView f209831E;

    /* renamed from: E1 */
    public List<C77922en3> f209832E1 = new ArrayList();

    /* renamed from: F */
    public WalletFormView f209833F;

    /* renamed from: F1 */
    public boolean f209834F1;

    /* renamed from: G */
    public WalletFormView f209835G;

    /* renamed from: G1 */
    public int f209836G1;

    /* renamed from: H */
    public WalletFormView f209837H;

    /* renamed from: H1 */
    public int f209838H1;

    /* renamed from: I */
    public WalletFormView f209839I;

    /* renamed from: I1 */
    public int f209840I1;

    /* renamed from: J */
    public WalletFormView f209841J;

    /* renamed from: J1 */
    public View.OnClickListener f209842J1 = new C72225h();

    /* renamed from: K */
    public WalletFormView f209843K;

    /* renamed from: K1 */
    public IListener f209844K1 = new IListener<ScanBankCardResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 96068484;
        }

        public boolean callback(IEvent iEvent) {
            ScanBankCardResultEvent scanBankCardResultEvent = (ScanBankCardResultEvent) iEvent;
            if (!(scanBankCardResultEvent instanceof ScanBankCardResultEvent)) {
                Log.m105922f("MicroMsg.WalletCardElmentUI", "mismatched ScanBankCardResultEvent event");
                return false;
            }
            Encrypt encrypt = new Encrypt();
            String randomKey = encrypt.getRandomKey();
            String desedeEncode = encrypt.desedeEncode(scanBankCardResultEvent.f9465d.f9466a, randomKey);
            Bitmap bitmap = scanBankCardResultEvent.f9465d.f9467b;
            WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
            int i = WalletCardElementUI.f209822L1;
            walletCardElementUI.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_bankcard_cropimg", bitmap);
            bundle.putString("key_bankcard_des", randomKey);
            bundle.putString("key_bankcard_id", desedeEncode);
            C79148e g = C79143a.m95768g(walletCardElementUI);
            if (g != null) {
                g.mo109106E(walletCardElementUI, WalletConfirmCardIDUI.class, bundle, 3);
            }
            return true;
        }
    };

    /* renamed from: L */
    public WalletFormView f209845L;

    /* renamed from: M */
    public WalletFormView f209846M;

    /* renamed from: N */
    public WalletFormView f209847N;

    /* renamed from: P */
    public WalletFormView f209848P;

    /* renamed from: Q */
    public WalletFormView f209849Q;

    /* renamed from: Q0 */
    public boolean f209850Q0 = false;

    /* renamed from: R */
    public WalletFormView f209851R;

    /* renamed from: R0 */
    public CheckBox f209852R0;

    /* renamed from: S */
    public WalletPhoneInputView f209853S;

    /* renamed from: S0 */
    public CheckBox f209854S0;

    /* renamed from: T */
    public ScrollView f209855T;

    /* renamed from: T0 */
    public String f209856T0;

    /* renamed from: U */
    public WalletFormView f209857U = null;

    /* renamed from: U0 */
    public String f209858U0;

    /* renamed from: V */
    public WalletFormView f209859V;

    /* renamed from: V0 */
    public String f209860V0;

    /* renamed from: W */
    public ElementQuery f209861W = new ElementQuery();

    /* renamed from: W0 */
    public int f209862W0 = 1;

    /* renamed from: X */
    public Authen f209863X = new Authen();

    /* renamed from: X0 */
    public boolean f209864X0;

    /* renamed from: Y */
    public Orders f209865Y = null;

    /* renamed from: Y0 */
    public boolean f209866Y0;

    /* renamed from: Z */
    public PayInfo f209867Z = null;

    /* renamed from: Z0 */
    public boolean f209868Z0 = false;

    /* renamed from: a1 */
    public boolean f209869a1 = false;

    /* renamed from: b1 */
    public boolean f209870b1 = false;

    /* renamed from: c1 */
    public boolean f209871c1 = false;

    /* renamed from: d */
    public Button f209872d;

    /* renamed from: d1 */
    public boolean f209873d1 = false;

    /* renamed from: e */
    public TextView f209874e;

    /* renamed from: e1 */
    public boolean f209875e1 = false;

    /* renamed from: f */
    public TextView f209876f;

    /* renamed from: f1 */
    public boolean f209877f1 = false;

    /* renamed from: g */
    public TextView f209878g;

    /* renamed from: g1 */
    public String[] f209879g1 = null;

    /* renamed from: h */
    public TextView f209880h;

    /* renamed from: h1 */
    public String f209881h1;

    /* renamed from: i */
    public TextView f209882i;

    /* renamed from: i1 */
    public String f209883i1;

    /* renamed from: j */
    public TextView f209884j;

    /* renamed from: j1 */
    public String f209885j1;

    /* renamed from: k1 */
    public String f209886k1;

    /* renamed from: l1 */
    public Profession[] f209887l1;

    /* renamed from: m1 */
    public Profession f209888m1;

    /* renamed from: n */
    public TextView f209889n;

    /* renamed from: n1 */
    public String f209890n1;

    /* renamed from: o */
    public TextView f209891o;

    /* renamed from: o1 */
    public String f209892o1;

    /* renamed from: p */
    public TextView f209893p;

    /* renamed from: p0 */
    public Bankcard f209894p0 = null;

    /* renamed from: p1 */
    public WalletFormView f209895p1;

    /* renamed from: q */
    public TextView f209896q;

    /* renamed from: q1 */
    public List<ElementQuery> f209897q1 = new ArrayList();

    /* renamed from: r */
    public TextView f209898r;

    /* renamed from: r1 */
    public int f209899r1;

    /* renamed from: s */
    public TextView f209900s;

    /* renamed from: s1 */
    public int f209901s1;

    /* renamed from: t */
    public WalletFormView f209902t;

    /* renamed from: t1 */
    public int f209903t1;

    /* renamed from: u */
    public WalletFormView f209904u;

    /* renamed from: u1 */
    public int f209905u1;

    /* renamed from: v */
    public WalletFormView f209906v;

    /* renamed from: v1 */
    public int f209907v1;

    /* renamed from: w */
    public WalletFormView f209908w;

    /* renamed from: w1 */
    public int f209909w1;

    /* renamed from: x */
    public WalletFormView f209910x;

    /* renamed from: x0 */
    public Map<String, C72394l.C72395a> f209911x0 = null;

    /* renamed from: x1 */
    public int f209912x1;

    /* renamed from: y */
    public WalletFormView f209913y;

    /* renamed from: y0 */
    public C72394l f209914y0 = null;

    /* renamed from: y1 */
    public int f209915y1;

    /* renamed from: z */
    public WalletFormView f209916z;

    /* renamed from: z1 */
    public int f209917z1;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$a */
    public class C72217a implements View.OnClickListener {
        public C72217a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(WalletCardElementUI.this.getContext(), WalletSelectProfessionUI.class);
            intent.putExtra("key_profession_list", WalletCardElementUI.this.f209887l1);
            WalletCardElementUI.this.startActivityForResult(intent, 5);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$b */
    public class C72218b implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$b$a */
        public class C72219a implements C19877i.C19878a {

            /* renamed from: a */
            public final /* synthetic */ C19877i f209921a;

            public C72219a(C19877i iVar) {
                this.f209921a = iVar;
            }

            public void onResult(boolean z, int i, int i2, int i3) {
                if (z) {
                    WalletCardElementUI.this.f209839I.setText(String.format("%04d%02d%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                    WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
                    walletCardElementUI.f209917z1 = i;
                    walletCardElementUI.f209824A1 = i2;
                    walletCardElementUI.f209826B1 = i3;
                    walletCardElementUI.mo99512H7();
                }
                this.f209921a.mo26532b();
            }
        }

        public C72218b() {
        }

        public void onClick(View view) {
            int i;
            int i2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C19877i iVar = new C19877i(WalletCardElementUI.this.getContext());
            iVar.f56638o = new C72219a(iVar);
            WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
            int i3 = walletCardElementUI.f209917z1;
            if (i3 > 0 && (i = walletCardElementUI.f209824A1) > 0 && (i2 = walletCardElementUI.f209826B1) > 0) {
                iVar.mo26533c(i3, i, i2);
            }
            iVar.mo26536f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$c */
    public class C72220c implements View.OnClickListener {
        public C72220c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.setClassName(WalletCardElementUI.this.getContext(), "com.tencent.mm.ui.tools.CountryCodeUI");
            intent.putExtra("exclude_countries_iso", WalletCardElementUI.this.f209879g1);
            intent.putExtra("CountryCodeUI_isShowCountryCode", false);
            intent.putExtra("ui_title", WalletCardElementUI.this.getString(C0966R.string.l8x));
            WalletCardElementUI.this.startActivityForResult(intent, 6);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$d */
    public class C72221d implements CompoundButton.OnCheckedChangeListener {
        public C72221d() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
            int i = WalletCardElementUI.f209822L1;
            walletCardElementUI.mo99512H7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$e */
    public class C72222e implements View.OnClickListener {
        public C72222e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
            ElementQuery elementQuery = walletCardElementUI.f209861W;
            C75228t.m90214G(walletCardElementUI, elementQuery.f209516s, elementQuery.f209505e, false, elementQuery.f209499M);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$f */
    public class C72223f implements View.OnClickListener {
        public C72223f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent putExtra = new Intent("com.tencent.mm.action.GET_ADRESS").putExtra("GetAddress", true).putExtra("ShowSelectedLocation", false);
            int i = WalletCardElementUI.this.f209861W.f209495I;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = Bankcard.f209387V2;
            if ((i & 2) > 0) {
                putExtra.putExtra("IsAutoPosition", false);
            } else {
                putExtra.putExtra("IsRealNameVerifyScene", true);
                putExtra.putExtra("IsNeedShowSearchBar", true);
            }
            WalletCardElementUI.this.startActivityForResult(putExtra, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$g */
    public class C72224g implements View.OnClickListener {
        public C72224g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
            int i = WalletCardElementUI.f209822L1;
            walletCardElementUI.mo99513I7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$h */
    public class C72225h implements View.OnClickListener {
        public C72225h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n.INSTANCE.mo160131h(11353, 2, 0);
            C75228t.m90265p0(WalletCardElementUI.this, ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91335q());
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$i */
    public class C72226i implements WalletFormView.C75209c {
        public C72226i() {
        }

        public void onInputValidChange(boolean z) {
            if (!z) {
                WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
                walletCardElementUI.f209894p0 = null;
                walletCardElementUI.getInput().putParcelable("key_history_bankcard", (Parcelable) null);
            }
            WalletCardElementUI walletCardElementUI2 = WalletCardElementUI.this;
            int i = WalletCardElementUI.f209822L1;
            walletCardElementUI2.mo99512H7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$j */
    public class C72227j implements View.OnClickListener {
        public C72227j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Bundle bundle = new Bundle();
            bundle.putInt("key_support_bankcard", WalletCardElementUI.this.getInput().getInt("key_support_bankcard", 3));
            bundle.putInt("key_bind_scene", WalletCardElementUI.this.getInput().getInt("key_bind_scene", -1));
            Util.isNullOrNil(WalletCardElementUI.this.f209902t.getText());
            WalletCardElementUI.this.hideTenpayKB();
            C79148e g = C79143a.m95768g(WalletCardElementUI.this);
            if (g != null) {
                g.mo109106E(WalletCardElementUI.this, WalletBankCardSelectUI.class, bundle, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$k */
    public class C72228k implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$k$a */
        public class C72229a implements C7045j.C7056k {

            /* renamed from: a */
            public final /* synthetic */ C7045j f209932a;

            public C72229a(C7045j jVar) {
                this.f209932a = jVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
                r5 = r4.f209933b.f209931d;
                r5.f209861W = r0;
                r5.mo99520P7(false);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResult(boolean r5, java.lang.Object r6, java.lang.Object r7) {
                /*
                    r4 = this;
                    com.tencent.mm.ui.widget.picker.j r7 = r4.f209932a
                    r7.mo8101d()
                    if (r5 == 0) goto L_0x0059
                    java.lang.String r6 = (java.lang.String) r6
                    com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$k r5 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.C72228k.this
                    com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI r5 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.this
                    com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = r5.f209895p1
                    r5.setText(r6)
                    com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$k r5 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.C72228k.this
                    com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI r5 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.this
                    r7 = 2131839040(0x7f114840, float:1.931132E38)
                    java.lang.String r5 = r5.getString(r7)
                    boolean r5 = r6.equals(r5)
                    r6 = 1
                    r5 = r5 ^ r6
                    com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$k r7 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.C72228k.this
                    com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI r7 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.this
                    java.util.List<com.tencent.mm.plugin.wallet_core.model.ElementQuery> r7 = r7.f209897q1
                    java.util.ArrayList r7 = (java.util.ArrayList) r7
                    java.util.Iterator r7 = r7.iterator()
                L_0x002f:
                    boolean r0 = r7.hasNext()
                    if (r0 == 0) goto L_0x0059
                    java.lang.Object r0 = r7.next()
                    com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = (com.tencent.p014mm.plugin.wallet_core.model.ElementQuery) r0
                    r1 = 0
                    if (r5 == 0) goto L_0x0044
                    boolean r2 = r0.mo99416b()
                    if (r2 != 0) goto L_0x0050
                L_0x0044:
                    if (r5 != 0) goto L_0x002f
                    int r2 = r0.f209515r
                    r3 = 2
                    if (r3 != r2) goto L_0x004d
                    r2 = 1
                    goto L_0x004e
                L_0x004d:
                    r2 = 0
                L_0x004e:
                    if (r2 == 0) goto L_0x002f
                L_0x0050:
                    com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$k r5 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.C72228k.this
                    com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI r5 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.this
                    r5.f209861W = r0
                    r5.mo99520P7(r1)
                L_0x0059:
                    com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$k r5 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.C72228k.this
                    com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI r5 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.this
                    com.tencent.mm.ui.widget.picker.j r6 = r4.f209932a
                    int r6 = r6.mo8099b()
                    r5.f209899r1 = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.C72228k.C72229a.onResult(boolean, java.lang.Object, java.lang.Object):void");
            }
        }

        public C72228k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(WalletCardElementUI.this.getString(C0966R.string.ksc));
            arrayList2.add(WalletCardElementUI.this.getString(C0966R.string.krm));
            boolean z = true;
            if (((ArrayList) WalletCardElementUI.this.f209897q1).size() == 1) {
                ElementQuery elementQuery = (ElementQuery) ((ArrayList) WalletCardElementUI.this.f209897q1).get(0);
                if (elementQuery.mo99416b()) {
                    arrayList2.remove(1);
                } else {
                    if (2 != elementQuery.f209515r) {
                        z = false;
                    }
                    if (z) {
                        arrayList2.remove(0);
                    }
                }
            }
            C7045j jVar = new C7045j((Context) WalletCardElementUI.this.getContext(), (ArrayList<String>) arrayList2);
            jVar.mo8106i(WalletCardElementUI.this.f209899r1);
            jVar.f24869t = new C72229a(jVar);
            jVar.mo8109l();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$l */
    public class C72230l implements View.OnClickListener {
        public C72230l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
            List<Integer> a = walletCardElementUI.f209861W.mo99415a();
            ArrayList arrayList2 = new ArrayList();
            for (Integer intValue : a) {
                arrayList2.add(((C79173v) C86312j.m106911c(C79173v.class)).f232472d.mo91346b(walletCardElementUI.getContext(), intValue.intValue()));
            }
            C72431t tVar = new C72431t(walletCardElementUI);
            walletCardElementUI.f209838H1 = -1;
            walletCardElementUI.f209840I1 = a.indexOf(Integer.valueOf(walletCardElementUI.f209862W0));
            C77426q qVar = new C77426q(walletCardElementUI.getContext());
            qVar.mo107606r(walletCardElementUI.getString(C0966R.string.kog));
            qVar.mo107605q(arrayList2, tVar, walletCardElementUI.f209840I1);
            qVar.mo107590b(new C72433u(walletCardElementUI));
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$m */
    public class C72231m implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$m$a */
        public class C72232a implements C7045j.C7056k {

            /* renamed from: a */
            public final /* synthetic */ C7045j f209936a;

            public C72232a(C7045j jVar) {
                this.f209936a = jVar;
            }

            public void onResult(boolean z, Object obj, Object obj2) {
                if (z) {
                    WalletCardElementUI.this.f209833F.setText((String) obj);
                    WalletCardElementUI.this.f209901s1 = this.f209936a.mo8099b();
                    WalletCardElementUI.this.mo99512H7();
                }
                this.f209936a.mo8101d();
            }
        }

        public C72231m() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7045j jVar = new C7045j((Context) WalletCardElementUI.this.getContext(), WalletCardElementUI.this.f209830D1);
            jVar.f24869t = new C72232a(jVar);
            jVar.mo8106i(WalletCardElementUI.this.f209901s1);
            jVar.mo8109l();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$n */
    public class C72233n implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$n$a */
        public class C72234a implements C19877i.C19878a {

            /* renamed from: a */
            public final /* synthetic */ C19877i f209939a;

            public C72234a(C19877i iVar) {
                this.f209939a = iVar;
            }

            public void onResult(boolean z, int i, int i2, int i3) {
                if (z) {
                    if (i > 0 && i2 > 0 && i3 > 0) {
                        WalletCardElementUI.this.f209835G.setText(String.format("%04d%02d%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                        WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
                        walletCardElementUI.f209909w1 = i;
                        walletCardElementUI.f209912x1 = i2;
                        walletCardElementUI.f209915y1 = i3;
                        walletCardElementUI.mo99512H7();
                    } else {
                        return;
                    }
                }
                this.f209939a.mo26532b();
            }
        }

        public C72233n() {
        }

        public void onClick(View view) {
            int i;
            int i2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C19877i iVar = new C19877i(WalletCardElementUI.this.getContext());
            iVar.f56638o = new C72234a(iVar);
            Calendar instance = Calendar.getInstance();
            int i3 = instance.get(1);
            int i4 = instance.get(2) + 1;
            int i5 = instance.get(5);
            iVar.mo26534d(i3, i4, i5);
            String obj = WalletCardElementUI.this.f209835G.getContentEt().getText().toString();
            WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
            int i6 = walletCardElementUI.f209909w1;
            if (i6 > 0 && (i = walletCardElementUI.f209912x1) > 0 && (i2 = walletCardElementUI.f209915y1) > 0) {
                iVar.mo26533c(i6, i, i2);
            } else if (!Util.isNullOrNil(obj) && obj.length() == 8) {
                WalletCardElementUI.this.f209909w1 = Util.getInt(obj.substring(0, 4), i3);
                WalletCardElementUI.this.f209912x1 = Util.getInt(obj.substring(4, 6), i4);
                WalletCardElementUI.this.f209915y1 = Util.getInt(obj.substring(6, 8), i5);
                WalletCardElementUI walletCardElementUI2 = WalletCardElementUI.this;
                iVar.mo26533c(walletCardElementUI2.f209909w1, walletCardElementUI2.f209912x1, walletCardElementUI2.f209915y1);
            }
            iVar.mo26536f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$o */
    public class C72235o implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$o$a */
        public class C72236a implements C19877i.C19878a {

            /* renamed from: a */
            public final /* synthetic */ C19877i f209942a;

            public C72236a(C19877i iVar) {
                this.f209942a = iVar;
            }

            public void onResult(boolean z, int i, int i2, int i3) {
                if (z) {
                    if (i > 0 && i2 > 0 && i3 > 0) {
                        if (i == 1) {
                            WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
                            walletCardElementUI.f209837H.setText(walletCardElementUI.getString(C0966R.string.ldg));
                            WalletCardElementUI walletCardElementUI2 = WalletCardElementUI.this;
                            walletCardElementUI2.f209903t1 = 9999;
                            walletCardElementUI2.f209905u1 = 12;
                            walletCardElementUI2.f209907v1 = 31;
                        } else {
                            WalletCardElementUI.this.f209837H.setText(String.format("%04d%02d%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                            WalletCardElementUI walletCardElementUI3 = WalletCardElementUI.this;
                            walletCardElementUI3.f209903t1 = i;
                            walletCardElementUI3.f209905u1 = i2;
                            walletCardElementUI3.f209907v1 = i3;
                        }
                        WalletCardElementUI walletCardElementUI4 = WalletCardElementUI.this;
                        int i4 = WalletCardElementUI.f209822L1;
                        walletCardElementUI4.mo99512H7();
                    } else {
                        return;
                    }
                }
                this.f209942a.mo26532b();
            }
        }

        public C72235o() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C19877i iVar = new C19877i(WalletCardElementUI.this.getContext());
            iVar.f56638o = new C72236a(iVar);
            Calendar instance = Calendar.getInstance();
            int i = instance.get(1);
            int i2 = instance.get(2) + 1;
            int i3 = instance.get(5);
            iVar.mo26535e(i, i2, i3);
            iVar.mo26534d(i + 200, 12, 31);
            CustomDatePickerNew customDatePickerNew = iVar.f56637n;
            if (customDatePickerNew != null) {
                customDatePickerNew.setLongTermYear(true);
            }
            String obj = WalletCardElementUI.this.f209837H.getContentEt().getText().toString();
            WalletCardElementUI walletCardElementUI = WalletCardElementUI.this;
            if (walletCardElementUI.f209903t1 <= 0 || walletCardElementUI.f209905u1 <= 0 || walletCardElementUI.f209907v1 <= 0) {
                if (!Util.isNullOrNil(obj) && obj.length() == 8) {
                    WalletCardElementUI.this.f209903t1 = Util.getInt(obj.substring(0, 4), i);
                    WalletCardElementUI.this.f209905u1 = Util.getInt(obj.substring(4, 6), i2);
                    WalletCardElementUI.this.f209907v1 = Util.getInt(obj.substring(6, 8), i3);
                } else if (obj.equals(WalletCardElementUI.this.getString(C0966R.string.ldg))) {
                    WalletCardElementUI walletCardElementUI2 = WalletCardElementUI.this;
                    walletCardElementUI2.f209903t1 = 9999;
                    walletCardElementUI2.f209905u1 = 12;
                    walletCardElementUI2.f209907v1 = 31;
                }
            }
            WalletCardElementUI walletCardElementUI3 = WalletCardElementUI.this;
            int i4 = walletCardElementUI3.f209903t1;
            if (i4 == 9999) {
                iVar.mo26533c(1, 1, 1);
            } else {
                iVar.mo26533c(i4, walletCardElementUI3.f209905u1, walletCardElementUI3.f209907v1);
            }
            iVar.mo26536f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$p */
    public class C72237p implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$p$a */
        public class C72238a implements C7045j.C7056k {

            /* renamed from: a */
            public final /* synthetic */ C7045j f209945a;

            public C72238a(C7045j jVar) {
                this.f209945a = jVar;
            }

            public void onResult(boolean z, Object obj, Object obj2) {
                if (z) {
                    String str = (String) obj;
                    WalletCardElementUI.this.f209831E.setText(str);
                    if (str.equalsIgnoreCase(WalletCardElementUI.this.getString(C0966R.string.f361346j32))) {
                        WalletCardElementUI.this.f209836G1 = 0;
                    } else {
                        WalletCardElementUI.this.f209836G1 = 1;
                    }
                    this.f209945a.mo8106i(WalletCardElementUI.this.f209836G1);
                }
                this.f209945a.mo8101d();
            }
        }

        public C72237p() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7045j jVar = new C7045j((Context) WalletCardElementUI.this.getContext(), WalletCardElementUI.this.getResources().getStringArray(C0966R.array.f2612b0));
            jVar.f24869t = new C72238a(jVar);
            jVar.mo8109l();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI$q */
    public class C72239q implements View.OnClickListener {
        public C72239q() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("GetAddress", true);
            boolean z = false;
            intent.putExtra("ShowSelectedLocation", false);
            int i = WalletCardElementUI.this.f209861W.f209495I;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = Bankcard.f209387V2;
            if ((i & 2) > 0) {
                z = true;
            }
            if (!z) {
                intent.putExtra("IsRealNameVerifyScene", true);
                intent.putExtra("IsNeedShowSearchBar", true);
            }
            String[] strArr = WalletCardElementUI.this.f209879g1;
            if (strArr != null && strArr.length > 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(Arrays.asList(WalletCardElementUI.this.f209879g1));
                arrayList2.remove("CN");
                arrayList2.remove("TW");
                arrayList2.remove("HK");
                arrayList2.remove("MO");
                intent.putStringArrayListExtra("BlockedCountries", arrayList2);
            }
            C88144b.m109802t(WalletCardElementUI.this.getContext(), ".ui.tools.MultiStageCitySelectUI", intent, 4);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public final boolean mo99512H7() {
        boolean z;
        boolean z2;
        boolean z3;
        WalletFormView walletFormView;
        WalletFormView walletFormView2;
        WalletFormView walletFormView3;
        WalletFormView walletFormView4;
        WalletFormView walletFormView5;
        WalletFormView walletFormView6;
        WalletFormView walletFormView7;
        WalletFormView walletFormView8;
        WalletFormView walletFormView9;
        WalletFormView walletFormView10;
        WalletFormView walletFormView11;
        WalletFormView walletFormView12;
        WalletFormView walletFormView13;
        WalletFormView walletFormView14;
        WalletFormView walletFormView15;
        WalletFormView walletFormView16;
        WalletFormView walletFormView17;
        WalletFormView walletFormView18;
        WalletFormView walletFormView19;
        WalletFormView walletFormView20;
        WalletFormView walletFormView21;
        WalletFormView walletFormView22 = this.f209857U;
        this.f209857U = null;
        if (!this.f209902t.mo105070b((View) null)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView21 = this.f209902t)) {
                this.f209857U = walletFormView21;
            }
            this.f209880h.setText(C0966R.string.f361541ko1);
            this.f209880h.setTextColor(getResources().getColor(C0966R.color.a_0));
            z = false;
        } else {
            z = true;
        }
        if (!this.f209908w.mo105070b((View) null)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView20 = this.f209908w)) {
                this.f209857U = walletFormView20;
            }
            z = false;
        }
        if (!this.f209859V.mo105070b(this.f209876f)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView19 = this.f209859V)) {
                this.f209857U = walletFormView19;
            }
            z = false;
        }
        if (this.f209916z.mo105070b(this.f209884j) || this.f209850Q0) {
            z2 = false;
        } else {
            if (this.f209857U == null && walletFormView22 != (walletFormView18 = this.f209916z)) {
                this.f209857U = walletFormView18;
            }
            this.f209884j.setText(C0966R.string.kp5);
            this.f209884j.setTextColor(getResources().getColor(C0966R.color.a_0));
            z = false;
            z2 = true;
        }
        if (this.f209868Z0 && !this.f209833F.mo105070b((View) null)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView17 = this.f209833F)) {
                this.f209857U = walletFormView17;
            }
            z = false;
        }
        if (this.f209869a1 && !this.f209837H.mo105070b((View) null)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView16 = this.f209837H)) {
                this.f209857U = walletFormView16;
            }
            z = false;
        }
        if (!this.f209823A.mo105070b(this.f209884j)) {
            if (z2) {
                this.f209884j.setText(C0966R.string.koy);
                this.f209884j.setTextColor(getResources().getColor(C0966R.color.a_0));
            } else {
                this.f209884j.setText(C0966R.string.koz);
                this.f209884j.setTextColor(getResources().getColor(C0966R.color.a_0));
            }
            if (this.f209857U == null && walletFormView22 != (walletFormView15 = this.f209823A)) {
                this.f209857U = walletFormView15;
            }
            z = false;
        } else if (z2) {
            this.f209884j.setVisibility(0);
        }
        if (this.f209884j.getVisibility() == 4) {
            if (this.f209861W.f209507g) {
                this.f209884j.setText(getString(C0966R.string.kp6));
            } else {
                this.f209884j.setText(getString(C0966R.string.kp9));
            }
            this.f209884j.setTextColor(getResources().getColor(C0966R.color.f3563xt));
            this.f209884j.setVisibility(0);
        }
        if (!this.f209906v.mo105070b(this.f209891o)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView14 = this.f209906v)) {
                this.f209857U = walletFormView14;
            }
            z = false;
            z3 = true;
        } else {
            z3 = false;
        }
        if (!this.f209904u.mo105070b(this.f209891o)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView13 = this.f209904u)) {
                this.f209857U = walletFormView13;
            }
            z = false;
        } else if (z3) {
            this.f209891o.setVisibility(4);
        }
        if (!this.f209852R0.isChecked()) {
            z = false;
        }
        if (!this.f209843K.mo105070b(this.f209893p)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView12 = this.f209843K)) {
                this.f209857U = walletFormView12;
            }
            z = false;
        }
        if (!this.f209845L.mo105070b(this.f209893p)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView11 = this.f209845L)) {
                this.f209857U = walletFormView11;
            }
            z = false;
        }
        if (!this.f209846M.mo105070b(this.f209893p)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView10 = this.f209846M)) {
                this.f209857U = walletFormView10;
            }
            z = false;
        }
        if (!this.f209847N.mo105070b(this.f209893p)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView9 = this.f209847N)) {
                this.f209857U = walletFormView9;
            }
            z = false;
        }
        if (!this.f209848P.mo105070b(this.f209893p)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView8 = this.f209848P)) {
                this.f209857U = walletFormView8;
            }
            z = false;
        }
        if (!this.f209849Q.mo105070b(this.f209893p)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView7 = this.f209849Q)) {
                this.f209857U = walletFormView7;
            }
            z = false;
        }
        if (!this.f209851R.mo105070b(this.f209893p)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView6 = this.f209851R)) {
                this.f209857U = walletFormView6;
            }
            z = false;
        }
        if (this.f209866Y0 && !this.f209825B.mo105070b((View) null)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView5 = this.f209825B)) {
                this.f209857U = walletFormView5;
            }
            z = false;
        }
        if (this.f209864X0 && !this.f209827C.mo105070b((View) null)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView4 = this.f209827C)) {
                this.f209857U = walletFormView4;
            }
            z = false;
        }
        if (this.f209864X0 && !this.f209829D.mo105070b((View) null)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView3 = this.f209829D)) {
                this.f209857U = walletFormView3;
            }
            z = false;
        }
        if (this.f209834F1 && !this.f209831E.mo105070b((View) null)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView2 = this.f209831E)) {
                this.f209857U = walletFormView2;
            }
            z = false;
        }
        if (this.f209871c1 && !this.f209839I.mo105070b((View) null)) {
            if (this.f209857U == null && walletFormView22 != (walletFormView = this.f209839I)) {
                this.f209857U = walletFormView;
            }
            z = false;
        }
        if (z) {
            this.f209872d.setEnabled(true);
            this.f209872d.setClickable(true);
            if (walletFormView22 != null) {
                walletFormView22.setImeOptions(1073741824);
            }
        } else {
            this.f209872d.setEnabled(false);
            this.f209872d.setClickable(false);
        }
        return z;
    }

    /* renamed from: I7 */
    public final void mo99513I7() {
        Map<String, C72394l.C72395a> map;
        if (mo99512H7()) {
            C72517z.m84857e();
            if (!Util.isNullOrNil(this.f209861W.f209520w)) {
                getInput().putBoolean("key_is_follow_bank_username", this.f209854S0.getVisibility() == 0 && this.f209854S0.isChecked());
                getInput().putString("key_bank_username", this.f209861W.f209520w);
            }
            FavorPayInfo favorPayInfo = (FavorPayInfo) getInput().getParcelable("key_favor_pay_info");
            ElementQuery elementQuery = this.f209861W;
            if (!(elementQuery == null || favorPayInfo == null || this.f209914y0 == null || (map = this.f209911x0) == null)) {
                if (((HashMap) map).containsKey(elementQuery.f209516s)) {
                    favorPayInfo.f209524d = ((C72394l.C72395a) ((HashMap) this.f209911x0).get(this.f209861W.f209516s)).f210617a.f232085d;
                } else {
                    favorPayInfo.f209524d = this.f209914y0.mo99767c(favorPayInfo.f209524d, false);
                }
                getInput().putParcelable("key_favor_pay_info", favorPayInfo);
            }
            Authen authen = new Authen();
            this.f209863X = authen;
            Bankcard bankcard = this.f209894p0;
            if (bankcard != null) {
                authen.f209371h = bankcard.f209413h2;
                authen.f209380t = bankcard.field_bankcardTail;
            }
            String string = getInput().getString("key_card_id");
            if (this.f209859V.getVisibility() == 0) {
                string = this.f209859V.getText();
            }
            this.f209863X.f209382v = (PayInfo) getInput().getParcelable("key_pay_info");
            Authen authen2 = this.f209863X;
            authen2.f209376p = string;
            authen2.f209370g = this.f209861W.f209516s;
            authen2.f209374n = this.f209862W0;
            authen2.f209369f = getInput().getString("key_pwd1");
            if (!Util.isNullOrNil(this.f209906v.getText())) {
                this.f209863X.f209377q = this.f209906v.getText();
            }
            this.f209863X.f209375o = this.f209823A.getText();
            this.f209863X.f209383w = this.f209843K.getText();
            this.f209863X.f209384x = this.f209845L.getText();
            Authen authen3 = this.f209863X;
            authen3.f209385y = this.f209856T0;
            authen3.f209386z = this.f209858U0;
            authen3.f209348A = this.f209860V0;
            authen3.f209349B = this.f209847N.getText();
            this.f209863X.f209350C = this.f209848P.getText();
            this.f209863X.f209351D = this.f209849Q.getText();
            this.f209863X.f209352E = this.f209851R.getText();
            String T = C75228t.m90227T(this.f209863X.f209375o);
            getInput().putString("key_mobile", T);
            getInput().putBoolean("key_is_oversea", this.f209861W.f209495I == 2);
            this.f209863X.f209373j = this.f209916z.getText();
            this.f209863X.f209372i = this.f209908w.getText();
            this.f209863X.f209378r = this.f209904u.getText();
            FavorPayInfo favorPayInfo2 = (FavorPayInfo) getInput().getParcelable("key_favor_pay_info");
            if (favorPayInfo2 != null) {
                Authen authen4 = this.f209863X;
                authen4.f209354G = favorPayInfo2.f209527g;
                authen4.f209355H = favorPayInfo2.f209524d;
            }
            Authen authen5 = this.f209863X;
            authen5.f209360M = "+" + this.f209853S.getCountryCode();
            Authen authen6 = this.f209863X;
            authen6.f209361N = this.f209901s1;
            if (this.f209903t1 == 9999) {
                Log.m105924i("MicroMsg.WalletCardElmentUI", "is long term");
                this.f209863X.f209363Q = new TenpaySecureEncrypt().desedeEncode(String.format("%04d%02d%02d", new Object[]{Integer.valueOf(this.f209903t1), Integer.valueOf(this.f209905u1), Integer.valueOf(this.f209907v1)}), C75228t.m90271t());
            } else {
                authen6.f209363Q = this.f209837H.getText();
            }
            Log.m105919d("MicroMsg.WalletCardElmentUI", "expire date: %s", this.f209837H.getText());
            this.f209863X.f209362P = this.f209839I.getText();
            Log.m105919d("MicroMsg.WalletCardElmentUI", "birth date: %s", this.f209839I.getText());
            RealNameBundle realNameBundle = (RealNameBundle) getInput().getParcelable("realname_verify_process_bundle");
            if (realNameBundle == null) {
                realNameBundle = new RealNameBundle();
            }
            realNameBundle.f209301d = this.f209908w.getText();
            realNameBundle.f209300I = this.f209836G1 + 1;
            realNameBundle.f209307j = this.f209881h1;
            realNameBundle.f209308n = this.f209883i1;
            realNameBundle.f209309o = this.f209885j1;
            realNameBundle.f209294C = this.f209829D.getText();
            realNameBundle.f209306i = this.f209888m1;
            realNameBundle.f209320z = this.f209886k1;
            realNameBundle.f209316v = this.f209839I.getText();
            realNameBundle.f209304g = this.f209862W0;
            realNameBundle.f209305h = this.f209913y.getText();
            realNameBundle.f209302e = "";
            realNameBundle.f209303f = this.f209916z.getText();
            realNameBundle.f209295D = this.f209835G.getText();
            realNameBundle.f209312r = this.f209837H.getText();
            realNameBundle.f209311q = this.f209901s1;
            getInput().putParcelable("realname_verify_process_bundle", realNameBundle);
            Authen authen7 = this.f209863X;
            Log.m105919d("MicroMsg.WalletCardElmentUI", "renewal: %s, expire: %s, birth: %s", Integer.valueOf(this.f209863X.f209361N), authen7.f209363Q, authen7.f209362P);
            if (mo99515K7() && !Util.isNullOrNil(getInput().getString("key_identity")) && getInput().getInt("key_id_type", -1) != -1 && !Util.isNullOrNil(getInput().getString("key_true_name"))) {
                Log.m105924i("MicroMsg.WalletCardElmentUI", "isForgot process, get identity info from input");
                this.f209863X.f209373j = getInput().getString("key_identity");
                this.f209863X.f209374n = getInput().getInt("key_id_type", -1);
                this.f209863X.f209372i = this.f209890n1;
                Log.m105924i("MicroMsg.WalletCardElmentUI", "authen.true_name：" + this.f209863X.f209372i);
            }
            Log.m105918d("MicroMsg.WalletCardElmentUI", "payInfo " + this.f209863X.f209382v + " elemt.bankcardTag : " + this.f209861W.f209495I);
            StringBuilder sb = new StringBuilder();
            sb.append(" elemt.bankcardTag : ");
            sb.append(this.f209861W.f209495I);
            Log.m105924i("MicroMsg.WalletCardElmentUI", sb.toString());
            Bundle input = getInput();
            input.putString("key_mobile", T);
            input.putParcelable("key_authen", this.f209863X);
            input.putString("key_bank_phone", this.f209861W.f209519v);
            input.putString("key_country_code", this.f209881h1);
            input.putString("key_province_code", this.f209883i1);
            input.putString("key_city_code", this.f209885j1);
            input.putParcelable("key_profession", this.f209888m1);
            input.putString("key_country_iso", this.f209886k1);
            input.putString("key_bind_card_type", this.f209863X.f209370g);
            input.putString("key_bind_card_show1", this.f209861W.f209505e);
            input.putString("key_bind_card_show2", getString(2 == this.f209861W.f209515r ? C0966R.string.krm : C0966R.string.ksc));
            String string2 = input.getString("key_bind_card_user_token", (String) null);
            if (!Util.isNullOrNil(string2)) {
                Authen authen8 = this.f209863X;
                authen8.f209364R = 1;
                authen8.f209365S = string2;
            }
            this.f209863X.f209366T = input.getString("kreq_token");
            if (getNetController().mo91271d(this.f209863X, this.f209865Y)) {
                Log.m105924i("MicroMsg.WalletCardElmentUI", "process controller deal with!!!");
            } else {
                Log.m105920e("MicroMsg.WalletCardElmentUI", "error process in the tenpay!!");
            }
        }
    }

    /* renamed from: J7 */
    public final void mo99514J7(String str) {
        List<ElementQuery> list = ((C79173v) C86312j.m106911c(C79173v.class)).f232472d.f193007b;
        ((ArrayList) this.f209897q1).clear();
        if (list != null) {
            for (ElementQuery next : list) {
                if (next.f209505e.equals(str)) {
                    Log.m105925i("MicroMsg.WalletCardElmentUI", "add element: %s, %s", next.f209505e, next.f209516s);
                    ((ArrayList) this.f209897q1).add(next);
                    if (getInput().getInt("key_bind_scene", -1) == 5 && !next.f209503R) {
                        next.f209522y = getString(C0966R.string.f361618lb1);
                    }
                    if (((ArrayList) this.f209897q1).size() >= 2) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: K7 */
    public final boolean mo99515K7() {
        return getInput().getBoolean("key_is_forgot_process", false);
    }

    /* renamed from: L7 */
    public final boolean mo99516L7() {
        C79148e process = getProcess();
        return process != null && "realname_verify_process".equals(process.mo91258e()) && process.f232423c.getInt("real_name_verify_mode", 0) == 4;
    }

    /* renamed from: M7 */
    public final void mo99517M7(WalletFormView walletFormView, int i) {
        C76241b logicDelegate = walletFormView.getLogicDelegate();
        if (logicDelegate instanceof C76024a.C76033i) {
            ((C76024a.C76033i) logicDelegate).mo106242f(i);
            if (i == 1) {
                setEditFocusListener(this.f209916z, 1, false, false, false);
                return;
            }
            setEditFocusListener(this.f209916z, 1, true, false, false);
        }
    }

    /* renamed from: N7 */
    public final void mo99518N7(WalletFormView walletFormView, String str) {
        if (!Util.isNullOrNil(str)) {
            KeyListener keyListener = walletFormView.getKeyListener();
            walletFormView.setKeyListener((KeyListener) null);
            walletFormView.setEnabled(false);
            walletFormView.setClickable(false);
            walletFormView.setText(str);
            walletFormView.setKeyListener(keyListener);
            walletFormView.setVisibility(0);
            return;
        }
        walletFormView.setVisibility(8);
    }

    /* renamed from: O7 */
    public final void mo99519O7(boolean z) {
        int i = 8;
        if (z) {
            this.f209896q.setVisibility(this.f209861W.f209523z ? 0 : 8);
            this.f209843K.setVisibility(this.f209861W.f209523z ? 0 : 8);
            this.f209845L.setVisibility(this.f209861W.f209487A ? 0 : 8);
            this.f209846M.setVisibility(this.f209861W.f209488B ? 0 : 8);
            this.f209847N.setVisibility(this.f209861W.f209491E ? 0 : 8);
            this.f209848P.setVisibility(this.f209861W.f209493G ? 0 : 8);
            this.f209849Q.setVisibility(this.f209861W.f209492F ? 0 : 8);
            WalletFormView walletFormView = this.f209851R;
            if (this.f209861W.f209494H) {
                i = 0;
            }
            walletFormView.setVisibility(i);
            this.f209893p.setVisibility(4);
            return;
        }
        this.f209896q.setVisibility(8);
        this.f209843K.setVisibility(8);
        this.f209845L.setVisibility(8);
        this.f209846M.setVisibility(8);
        this.f209847N.setVisibility(8);
        this.f209848P.setVisibility(8);
        this.f209849Q.setVisibility(8);
        this.f209851R.setVisibility(8);
        this.f209893p.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x08ac  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x08f8  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x093e  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x094d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x023d A[Catch:{ IOException -> 0x0258 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03c2  */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99520P7(boolean r17) {
        /*
            r16 = this;
            r8 = r16
            java.lang.Class<yz.v> r9 = p281yz.C79173v.class
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            if (r0 != 0) goto L_0x000f
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = new com.tencent.mm.plugin.wallet_core.model.ElementQuery
            r0.<init>()
            r8.f209861W = r0
        L_0x000f:
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r1 = r8.f209861W
            java.lang.String r2 = r1.f209505e
            r11 = 0
            r0[r11] = r2
            java.lang.String r1 = r1.f209516s
            r12 = 1
            r0[r12] = r1
            java.lang.String r13 = "MicroMsg.WalletCardElmentUI"
            java.lang.String r1 = "element: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            int r0 = r0.f209501P
            r14 = 8
            if (r0 != 0) goto L_0x0061
            com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView r0 = r8.f209853S
            r0.f210731h = r11
            java.util.Map<java.lang.String, nc0.a$a> r1 = r0.f210732i
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "86"
            java.lang.Object r1 = r1.get(r2)
            nc0.a$a r1 = (nc0.C76850a.C76851a) r1
            java.lang.String r2 = r1.f224676b
            r0.f210734n = r2
            java.lang.String r1 = r1.f224677c
            r0.f210733j = r1
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r0.f210727d
            r2.setText(r1)
            com.tenpay.android.wechat.TenpaySecureEditText r1 = r0.f210729f
            java.lang.String r2 = r0.f210734n
            r1.setText(r2)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r0.f210727d
            r1.setVisibility(r14)
            com.tenpay.android.wechat.TenpaySecureEditText r1 = r0.f210729f
            r1.setVisibility(r14)
            android.widget.TextView r0 = r0.f210730g
            r0.setVisibility(r14)
            goto L_0x0081
        L_0x0061:
            com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView r0 = r8.f209853S
            r0.mo99815c()
            com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView r0 = r8.f209853S
            r1 = 2131311229(0x7f093a7d, float:1.8240792E38)
            android.view.View r0 = r0.findViewById(r1)
            r3 = r0
            android.widget.EditText r3 = (android.widget.EditText) r3
            com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView r0 = r8.f209853S
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r0.getPhoneNumberEt()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r1 = r16
            r1.setEditFocusListener(r2, r3, r4, r5, r6, r7)
        L_0x0081:
            di3.d r0 = di3.C86312j.m106911c(r9)
            yz.v r0 = (p281yz.C79173v) r0
            b63.y r0 = r0.f232472d
            java.util.List<z53.a> r0 = r0.f193008c
            r7 = 0
            if (r0 == 0) goto L_0x00ab
            java.util.Iterator r0 = r0.iterator()
        L_0x0092:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ab
            java.lang.Object r1 = r0.next()
            z53.a r1 = (z53.C79306a) r1
            java.lang.String r2 = r1.f232817a
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r3 = r8.f209861W
            java.lang.String r3 = r3.f209516s
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0092
            goto L_0x00ac
        L_0x00ab:
            r1 = r7
        L_0x00ac:
            com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView r0 = r8.f209853S
            r0.getClass()
            if (r1 != 0) goto L_0x00b4
            goto L_0x00e0
        L_0x00b4:
            java.lang.String r2 = r1.f232818b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x00c4
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r0.f210728e
            java.lang.String r3 = r1.f232818b
            r2.setHint(r3)
            goto L_0x00d4
        L_0x00c4:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r0.f210728e
            android.content.Context r3 = r0.getContext()
            r4 = 2131838960(0x7f1147f0, float:1.9311158E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setHint(r3)
        L_0x00d4:
            java.lang.String r2 = r1.f232819c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x00e0
            java.lang.String r1 = r1.f232819c
            r0.f210736p = r1
        L_0x00e0:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            if (r0 == 0) goto L_0x0124
            java.util.Map<java.lang.String, com.tencent.mm.plugin.wallet_core.ui.l$a> r1 = r8.f209911x0
            if (r1 == 0) goto L_0x0124
            java.lang.String r0 = r0.f209516s
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0124
            java.util.Map<java.lang.String, com.tencent.mm.plugin.wallet_core.ui.l$a> r0 = r8.f209911x0
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r1 = r8.f209861W
            java.lang.String r1 = r1.f209516s
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            com.tencent.mm.plugin.wallet_core.ui.l$a r0 = (com.tencent.p014mm.plugin.wallet_core.p125ui.C72394l.C72395a) r0
            r1 = 0
            if (r0 == 0) goto L_0x010a
            y43.n r3 = r0.f210617a
            if (r3 == 0) goto L_0x010a
            double r1 = r0.f210619c
        L_0x010a:
            r0 = 2131838906(0x7f1147ba, float:1.9311048E38)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90256l(r1)
            r3[r11] = r1
            java.lang.String r0 = r8.getString(r0, r3)
            android.widget.TextView r1 = r8.f209898r
            r1.setText(r0)
            android.widget.TextView r0 = r8.f209898r
            r0.setVisibility(r11)
            goto L_0x0129
        L_0x0124:
            android.widget.TextView r0 = r8.f209898r
            r0.setVisibility(r14)
        L_0x0129:
            yq3.C79143a.m95768g(r16)
            android.os.Bundle r0 = r16.getInput()
            java.lang.String r1 = "key_bankcard"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r0
            boolean r1 = r16.mo99515K7()
            r15 = 4
            if (r1 == 0) goto L_0x0177
            if (r0 == 0) goto L_0x0177
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r8.f209859V
            r2 = 2131838946(0x7f1147e2, float:1.931113E38)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.String r0 = r0.field_bankcardTail
            r3[r11] = r0
            java.lang.String r0 = r8.getString(r2, r3)
            r1.setHint(r0)
            boolean[] r0 = new boolean[r12]
            r0[r11] = r12
            com.tencent.mm.wallet_core.ui.formview.WalletFormView[] r1 = new com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView[r12]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r8.f209859V
            r1[r11] = r2
            android.widget.TextView r2 = r8.f209874e
            android.widget.TextView r3 = r8.f209876f
            r8.mo99521Q7(r0, r1, r2, r3)
            boolean[] r0 = new boolean[r12]
            r0[r11] = r11
            com.tencent.mm.wallet_core.ui.formview.WalletFormView[] r1 = new com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView[r12]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r8.f209902t
            r1[r11] = r2
            android.widget.TextView r2 = r8.f209878g
            android.widget.TextView r3 = r8.f209880h
            r8.mo99521Q7(r0, r1, r2, r3)
            goto L_0x0222
        L_0x0177:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            java.lang.String r0 = r0.f209505e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0182
            goto L_0x01bf
        L_0x0182:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209902t
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r1 = r8.f209861W
            java.lang.String r1 = r1.f209505e
            r0.setText(r1)
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            int r1 = r0.f209515r
            if (r10 != r1) goto L_0x0193
            r1 = 1
            goto L_0x0194
        L_0x0193:
            r1 = 0
        L_0x0194:
            if (r1 == 0) goto L_0x01a8
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209895p1
            r0.setVisibility(r11)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209895p1
            r1 = 2131839040(0x7f114840, float:1.931132E38)
            java.lang.String r1 = r8.getString(r1)
            r0.setText(r1)
            goto L_0x01bf
        L_0x01a8:
            boolean r0 = r0.mo99416b()
            if (r0 == 0) goto L_0x01bf
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209895p1
            r0.setVisibility(r11)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209895p1
            r1 = 2131839067(0x7f11485b, float:1.9311375E38)
            java.lang.String r1 = r8.getString(r1)
            r0.setText(r1)
        L_0x01bf:
            boolean[] r2 = new boolean[r12]
            r2[r11] = r11
            com.tencent.mm.wallet_core.ui.formview.WalletFormView[] r3 = new com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView[r12]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209859V
            r3[r11] = r0
            android.widget.TextView r4 = r8.f209874e
            android.widget.TextView r5 = r8.f209876f
            r0 = 1
            r6 = 1
            r1 = r16
            r1.mo99522R7(r2, r3, r4, r5, r6)
            boolean[] r2 = new boolean[r12]
            r2[r11] = r12
            com.tencent.mm.wallet_core.ui.formview.WalletFormView[] r3 = new com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView[r12]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r8.f209902t
            r3[r11] = r1
            android.widget.TextView r4 = r8.f209878g
            android.widget.TextView r5 = r8.f209880h
            r1 = r16
            r6 = r0
            r1.mo99522R7(r2, r3, r4, r5, r6)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209859V
            android.view.View$OnClickListener r1 = r8.f209842J1
            r0.setOnInfoIvClickListener(r1)
            di3.d r0 = di3.C86312j.m106911c(r9)
            yz.v r0 = (p281yz.C79173v) r0
            b63.s0 r0 = r0.Ex0()
            b63.q0 r0 = r0.mo91334p()
            boolean r0 = r0.mo91307g()
            if (r0 == 0) goto L_0x0219
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209859V
            com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView r0 = r0.getInfoIv()
            r1 = 2131757144(0x7f100858, float:1.9145215E38)
            r0.setImageResource(r1)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209859V
            com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView r0 = r0.getInfoIv()
            r0.setVisibility(r11)
            goto L_0x0222
        L_0x0219:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209859V
            com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView r0 = r0.getInfoIv()
            r0.setVisibility(r15)
        L_0x0222:
            java.lang.String r1 = ""
            r2 = 3
            if (r17 == 0) goto L_0x03b4
            boolean r0 = r16.mo99516L7()
            if (r0 == 0) goto L_0x03b4
            android.os.Bundle r0 = r16.getInput()
            java.lang.String r3 = "realname_verify_process_get_wording_cache"
            java.lang.String r0 = r0.getString(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ IOException -> 0x0258 }
            if (r3 != 0) goto L_0x025e
            te3.e72 r3 = new te3.e72     // Catch:{ IOException -> 0x0258 }
            r3.<init>()     // Catch:{ IOException -> 0x0258 }
            java.nio.charset.Charset r4 = s24.C77613a.f226275a     // Catch:{ IOException -> 0x0258 }
            byte[] r0 = r0.getBytes(r4)     // Catch:{ IOException -> 0x0258 }
            pe3.a r0 = r3.parseFrom(r0)     // Catch:{ IOException -> 0x0258 }
            te3.e72 r0 = (te3.C77919e72) r0     // Catch:{ IOException -> 0x0258 }
            java.util.List<te3.en3> r3 = r8.f209832E1     // Catch:{ IOException -> 0x0258 }
            java.util.LinkedList<te3.en3> r0 = r0.f227216E     // Catch:{ IOException -> 0x0258 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ IOException -> 0x0258 }
            r3.addAll(r0)     // Catch:{ IOException -> 0x0258 }
            goto L_0x025e
        L_0x0258:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r1, r3)
        L_0x025e:
            android.os.Bundle r0 = r16.getInput()
            java.lang.String r3 = "realname_verify_process_bundle"
            android.os.Parcelable r0 = r0.getParcelable(r3)
            com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle r0 = (com.tencent.p014mm.plugin.wallet_core.id_verify.model.RealNameBundle) r0
            if (r0 == 0) goto L_0x03b4
            java.lang.String r3 = r0.f209301d
            r8.f209890n1 = r3
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r3 = r8.f209861W
            java.lang.String r4 = "%04d%02d%02d"
            if (r3 == 0) goto L_0x032c
            java.util.List r3 = r3.mo99415a()
            if (r3 == 0) goto L_0x032c
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r3 = r8.f209861W
            java.util.List r3 = r3.mo99415a()
            int r5 = r0.f209304g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x032c
            java.lang.Object[] r3 = new java.lang.Object[r10]
            int r5 = r0.f209304g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r11] = r5
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r5 = r8.f209861W
            java.util.List r5 = r5.mo99415a()
            r3[r12] = r5
            java.lang.String r5 = "set cretype: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r5, r3)
            int r3 = r0.f209304g
            r8.f209862W0 = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209913y
            java.lang.String r5 = r0.f209305h
            r3.setText(r5)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209916z
            java.lang.String r5 = r0.f209302e
            r3.setText(r5)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209916z
            int r5 = r8.f209862W0
            r8.mo99517M7(r3, r5)
            int r3 = r0.f209313s
            r5 = 9999(0x270f, float:1.4012E-41)
            if (r3 != r5) goto L_0x02db
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209837H
            r6 = 2131839916(0x7f114bac, float:1.9313097E38)
            java.lang.String r6 = r8.getString(r6)
            r3.setText(r6)
            r8.f209903t1 = r5
            r3 = 12
            r8.f209905u1 = r3
            r3 = 31
            r8.f209907v1 = r3
            goto L_0x02fc
        L_0x02db:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = r8.f209837H
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r11] = r3
            int r3 = r0.f209314t
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r12] = r3
            int r3 = r0.f209315u
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r10] = r3
            java.lang.String r3 = java.lang.String.format(r4, r6)
            r5.setText(r3)
        L_0x02fc:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209835G
            java.lang.Object[] r5 = new java.lang.Object[r2]
            int r6 = r0.f209296E
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r11] = r6
            int r6 = r0.f209297F
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r12] = r6
            int r6 = r0.f209298G
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r10] = r6
            java.lang.String r5 = java.lang.String.format(r4, r5)
            r3.setText(r5)
            int r3 = r0.f209311q
            r8.f209901s1 = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = r8.f209833F
            java.lang.String[] r6 = r8.f209830D1
            r3 = r6[r3]
            r5.setText(r3)
        L_0x032c:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209908w
            java.lang.String r5 = r0.f209301d
            r3.setText(r5)
            java.lang.String r3 = r0.f209307j
            r8.f209881h1 = r3
            java.lang.String r3 = r0.f209308n
            r8.f209883i1 = r3
            java.lang.String r3 = r0.f209309o
            r8.f209885j1 = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209827C
            java.lang.String r5 = r0.f209310p
            r3.setText(r5)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209829D
            java.lang.String r5 = r0.f209294C
            r3.setText(r5)
            java.lang.String r3 = r0.f209320z
            r8.f209886k1 = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209841J
            java.lang.String r5 = r0.f209292A
            r3.setText(r5)
            com.tencent.mm.plugin.wallet_core.id_verify.model.Profession r3 = r0.f209306i
            r8.f209888m1 = r3
            if (r3 == 0) goto L_0x0365
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = r8.f209825B
            java.lang.String r3 = r3.f209290d
            r5.setText(r3)
        L_0x0365:
            int r3 = r0.f209300I
            int r5 = r3 + -1
            r8.f209836G1 = r5
            if (r5 >= 0) goto L_0x036f
            r8.f209836G1 = r11
        L_0x036f:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = r8.f209831E
            if (r3 != r12) goto L_0x0377
            r3 = 2131836499(0x7f113e53, float:1.9306167E38)
            goto L_0x037a
        L_0x0377:
            r3 = 2131836498(0x7f113e52, float:1.9306164E38)
        L_0x037a:
            java.lang.String r3 = r8.getString(r3)
            r5.setText(r3)
            int r3 = r0.f209317w
            r8.f209917z1 = r3
            int r5 = r0.f209318x
            r8.f209824A1 = r5
            int r0 = r0.f209319y
            r8.f209826B1 = r0
            if (r3 <= 0) goto L_0x03b4
            if (r5 <= 0) goto L_0x03b4
            if (r0 <= 0) goto L_0x03b4
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209839I
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r11] = r3
            int r3 = r8.f209824A1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r12] = r3
            int r3 = r8.f209826B1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r10] = r3
            java.lang.String r3 = java.lang.String.format(r4, r5)
            r0.setText(r3)
        L_0x03b4:
            r8.f209868Z0 = r11
            r8.f209869a1 = r11
            r8.f209871c1 = r11
            r8.f209873d1 = r11
            boolean r0 = r16.mo99516L7()
            if (r0 == 0) goto L_0x0401
            java.util.List<te3.en3> r0 = r8.f209832E1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x03ca:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x049b
            java.lang.Object r3 = r0.next()
            te3.en3 r3 = (te3.C77922en3) r3
            te3.l10 r4 = r3.f227260d
            int r4 = r4.f184008d
            int r5 = r8.f209862W0
            if (r4 != r5) goto L_0x03ca
            boolean r4 = r3.f227264h
            r8.f209868Z0 = r4
            boolean r4 = r3.f227263g
            r8.f209869a1 = r4
            boolean r4 = r3.f227267n
            r8.f209870b1 = r4
            boolean r4 = r3.f227265i
            r8.f209871c1 = r4
            boolean r4 = r3.f227269p
            r8.f209834F1 = r4
            boolean r4 = r3.f227261e
            r8.f209866Y0 = r4
            boolean r4 = r3.f227262f
            r8.f209864X0 = r4
            boolean r3 = r3.f227266j
            r8.f209875e1 = r3
            r8.f209873d1 = r12
            goto L_0x03ca
        L_0x0401:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo> r0 = r0.f209502Q
            if (r0 == 0) goto L_0x048e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x048e
            java.lang.Object[] r0 = new java.lang.Object[r12]
            int r3 = r8.f209862W0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r11] = r3
            java.lang.String r3 = "identity type： %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r0)
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo> r0 = r0.f209502Q
            java.util.Iterator r0 = r0.iterator()
        L_0x0424:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0480
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo r3 = (com.tencent.p014mm.plugin.wallet_core.model.CreTypeRuleInfo) r3
            int r4 = r3.f209485d
            int r5 = r8.f209862W0
            if (r4 != r5) goto L_0x0424
            com.tencent.mm.plugin.wallet_core.model.CreExtInfo r4 = r3.f209486e
            int r4 = r4.f209481d
            if (r4 != r12) goto L_0x0443
            java.lang.String r4 = "need show cre count"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
            r8.f209868Z0 = r12
        L_0x0443:
            com.tencent.mm.plugin.wallet_core.model.CreExtInfo r4 = r3.f209486e
            int r4 = r4.f209483f
            if (r4 != r12) goto L_0x0450
            java.lang.String r4 = "need show cre expire"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
            r8.f209869a1 = r12
        L_0x0450:
            com.tencent.mm.plugin.wallet_core.model.CreExtInfo r4 = r3.f209486e
            int r4 = r4.f209482e
            if (r4 != r12) goto L_0x045d
            java.lang.String r4 = "need show birthday"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
            r8.f209871c1 = r12
        L_0x045d:
            com.tencent.mm.plugin.wallet_core.model.CreExtInfo r3 = r3.f209486e
            int r3 = r3.f209484g
            if (r3 != r12) goto L_0x0424
            java.lang.String r3 = "need show cre type"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            di3.d r3 = di3.C86312j.m106911c(r9)
            yz.v r3 = (p281yz.C79173v) r3
            b63.s0 r3 = r3.Ex0()
            int r3 = r3.mo91333o()
            if (r3 <= 0) goto L_0x0424
            java.lang.String r3 = "realnamed, show cre type"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            r8.f209873d1 = r12
            goto L_0x0424
        L_0x0480:
            int r0 = r8.f209862W0
            if (r0 != r10) goto L_0x048b
            boolean r0 = r8.f209877f1
            if (r0 == 0) goto L_0x048b
            r8.f209875e1 = r12
            goto L_0x049b
        L_0x048b:
            r8.f209875e1 = r11
            goto L_0x049b
        L_0x048e:
            int r0 = r8.f209862W0
            if (r0 != r10) goto L_0x0499
            boolean r0 = r8.f209877f1
            if (r0 == 0) goto L_0x0499
            r8.f209875e1 = r12
            goto L_0x049b
        L_0x0499:
            r8.f209875e1 = r11
        L_0x049b:
            boolean r0 = r8.f209869a1
            if (r0 != 0) goto L_0x04a5
            r8.f209903t1 = r11
            r8.f209905u1 = r11
            r8.f209907v1 = r11
        L_0x04a5:
            boolean r0 = r8.f209871c1
            if (r0 != 0) goto L_0x04af
            r8.f209917z1 = r11
            r8.f209824A1 = r11
            r8.f209826B1 = r11
        L_0x04af:
            boolean r0 = r8.f209868Z0
            if (r0 != 0) goto L_0x04b5
            r8.f209901s1 = r11
        L_0x04b5:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209910x
            r0.setVisibility(r14)
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            int r3 = r0.f209495I
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r4 = com.tencent.p014mm.plugin.wallet_core.model.Bankcard.f209387V2
            r3 = r3 & r10
            if (r3 <= 0) goto L_0x04c5
            r3 = 1
            goto L_0x04c6
        L_0x04c5:
            r3 = 0
        L_0x04c6:
            r4 = 5
            r5 = 6
            if (r3 == 0) goto L_0x052d
            boolean[] r0 = new boolean[r5]
            r0 = {0, 0, 0, 0, 0, 0} // fill-array
            com.tencent.mm.wallet_core.ui.formview.WalletFormView[] r1 = new com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView[r5]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209908w
            r1[r11] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209913y
            r1[r12] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209916z
            r1[r10] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209833F
            r1[r2] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209835G
            r1[r15] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209837H
            r1[r4] = r3
            android.widget.TextView r3 = r8.f209882i
            android.widget.TextView r6 = r8.f209884j
            r8.mo99521Q7(r0, r1, r3, r6)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209823A
            r0.setVisibility(r14)
            r8.mo99519O7(r12)
            boolean[] r0 = new boolean[r5]
            r0[r11] = r11
            r0[r12] = r11
            r0[r10] = r11
            boolean r1 = r8.f209871c1
            r0[r2] = r1
            boolean r1 = r8.f209875e1
            r0[r15] = r1
            boolean r1 = r8.f209834F1
            r0[r4] = r1
            com.tencent.mm.wallet_core.ui.formview.WalletFormView[] r1 = new com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView[r5]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209827C
            r1[r11] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209829D
            r1[r12] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209825B
            r1[r10] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209839I
            r1[r2] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209841J
            r1[r15] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209831E
            r1[r4] = r3
            android.widget.TextView r3 = r8.f209900s
            r8.mo99521Q7(r0, r1, r3, r7)
            goto L_0x0887
        L_0x052d:
            java.util.List r0 = r0.mo99415a()
            if (r0 == 0) goto L_0x0541
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            java.util.List r0 = r0.mo99415a()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0541
            r0 = 1
            goto L_0x0542
        L_0x0541:
            r0 = 0
        L_0x0542:
            boolean r3 = r16.mo99515K7()
            if (r3 != 0) goto L_0x05cd
            di3.d r3 = di3.C86312j.m106911c(r9)
            yz.v r3 = (p281yz.C79173v) r3
            b63.s0 r3 = r3.Ex0()
            boolean r3 = r3.mo91343y()
            if (r3 == 0) goto L_0x0559
            goto L_0x05cd
        L_0x0559:
            boolean[] r3 = new boolean[r5]
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r6 = r8.f209861W
            boolean r14 = r6.f209507g
            r3[r11] = r14
            boolean r14 = r8.f209873d1
            if (r14 != 0) goto L_0x056e
            if (r0 == 0) goto L_0x056c
            boolean r0 = r6.f209508h
            if (r0 == 0) goto L_0x056c
            goto L_0x056e
        L_0x056c:
            r0 = 0
            goto L_0x056f
        L_0x056e:
            r0 = 1
        L_0x056f:
            r3[r12] = r0
            boolean r0 = r6.f209508h
            r3[r10] = r0
            boolean r0 = r8.f209868Z0
            r3[r2] = r0
            boolean r0 = r8.f209870b1
            r3[r15] = r0
            boolean r0 = r8.f209869a1
            r3[r4] = r0
            com.tencent.mm.wallet_core.ui.formview.WalletFormView[] r0 = new com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView[r5]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209908w
            r0[r11] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209913y
            r0[r12] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209916z
            r0[r10] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209833F
            r0[r2] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209835G
            r0[r15] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209837H
            r0[r4] = r6
            android.widget.TextView r6 = r8.f209882i
            android.widget.TextView r14 = r8.f209884j
            r8.mo99521Q7(r3, r0, r6, r14)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209823A
            r0.setVisibility(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "elemt canModifyName:"
            r0.append(r3)
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r3 = r8.f209861W
            boolean r3 = r3.f209507g
            r0.append(r3)
            java.lang.String r3 = " canModifyIdentity:"
            r0.append(r3)
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r3 = r8.f209861W
            boolean r3 = r3.f209508h
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            goto L_0x06f4
        L_0x05cd:
            di3.d r3 = di3.C86312j.m106911c(r9)
            yz.v r3 = (p281yz.C79173v) r3
            b63.s0 r3 = r3.Ex0()
            java.lang.String r3 = r3.mo91335q()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r14 = "key_true_name"
            if (r6 == 0) goto L_0x05f3
            yq3.e r6 = r16.getProcess()
            if (r6 == 0) goto L_0x05f3
            yq3.e r3 = r16.getProcess()
            android.os.Bundle r3 = r3.f232423c
            java.lang.String r3 = r3.getString(r14)
        L_0x05f3:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r6 != 0) goto L_0x0613
            r6 = 2131838997(0x7f114815, float:1.9311233E38)
            java.lang.Object[] r7 = new java.lang.Object[r12]
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90270s(r3)
            r7[r11] = r3
            java.lang.String r3 = r8.getString(r6, r7)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209908w
            r6.setHint(r3)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209910x
            r6.setHint(r3)
            goto L_0x0624
        L_0x0613:
            r3 = 2131838996(0x7f114814, float:1.9311231E38)
            java.lang.String r3 = r8.getString(r3)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209908w
            r6.setHint(r3)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209910x
            r6.setHint(r3)
        L_0x0624:
            boolean r3 = r16.mo99515K7()
            if (r3 == 0) goto L_0x06b0
            android.os.Bundle r3 = r16.getInput()
            java.lang.String r6 = "key_identity"
            java.lang.String r3 = r3.getString(r6)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x06b0
            android.os.Bundle r3 = r16.getInput()
            java.lang.String r6 = "key_id_type"
            r7 = -1
            int r3 = r3.getInt(r6, r7)
            if (r3 == r7) goto L_0x06b0
            android.os.Bundle r3 = r16.getInput()
            java.lang.String r3 = r3.getString(r14)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x06b0
            java.lang.String r0 = "is forgot process, hide id info form"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            boolean[] r0 = new boolean[r5]
            r0[r11] = r11
            r0[r12] = r11
            r0[r10] = r11
            boolean r3 = r8.f209868Z0
            r0[r2] = r3
            boolean r3 = r8.f209870b1
            r0[r15] = r3
            boolean r3 = r8.f209869a1
            r0[r4] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView[] r3 = new com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView[r5]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209908w
            r3[r11] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209913y
            r3[r12] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209916z
            r3[r10] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209833F
            r3[r2] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209835G
            r3[r15] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209837H
            r3[r4] = r6
            android.widget.TextView r6 = r8.f209882i
            android.widget.TextView r7 = r8.f209884j
            r8.mo99521Q7(r0, r3, r6, r7)
            android.os.Bundle r0 = r16.getInput()
            java.lang.String r0 = r0.getString(r14)
            r8.f209890n1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "name is "
            r0.append(r3)
            java.lang.String r3 = r8.f209890n1
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            goto L_0x06ef
        L_0x06b0:
            boolean[] r3 = new boolean[r5]
            r3[r11] = r12
            boolean r6 = r8.f209873d1
            if (r6 != 0) goto L_0x06bd
            if (r0 == 0) goto L_0x06bb
            goto L_0x06bd
        L_0x06bb:
            r0 = 0
            goto L_0x06be
        L_0x06bd:
            r0 = 1
        L_0x06be:
            r3[r12] = r0
            r3[r10] = r12
            boolean r0 = r8.f209868Z0
            r3[r2] = r0
            boolean r0 = r8.f209870b1
            r3[r15] = r0
            boolean r0 = r8.f209869a1
            r3[r4] = r0
            com.tencent.mm.wallet_core.ui.formview.WalletFormView[] r0 = new com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView[r5]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209908w
            r0[r11] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209913y
            r0[r12] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209916z
            r0[r10] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209833F
            r0[r2] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209835G
            r0[r15] = r6
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r8.f209837H
            r0[r4] = r6
            android.widget.TextView r6 = r8.f209882i
            android.widget.TextView r7 = r8.f209884j
            r8.mo99521Q7(r3, r0, r6, r7)
        L_0x06ef:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209823A
            r0.setVisibility(r11)
        L_0x06f4:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r8.f209894p0
            if (r0 == 0) goto L_0x072f
            java.lang.String r0 = r0.field_mobile
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0709
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209823A
            com.tencent.mm.plugin.wallet_core.model.Bankcard r3 = r8.f209894p0
            java.lang.String r3 = r3.field_mobile
            r8.mo99518N7(r0, r3)
        L_0x0709:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r8.f209894p0
            java.lang.String r0 = r0.f209411f2
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x071c
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209906v
            com.tencent.mm.plugin.wallet_core.model.Bankcard r3 = r8.f209894p0
            java.lang.String r3 = r3.f209411f2
            r8.mo99518N7(r0, r3)
        L_0x071c:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r8.f209894p0
            java.lang.String r0 = r0.f209412g2
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x072f
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209904u
            com.tencent.mm.plugin.wallet_core.model.Bankcard r3 = r8.f209894p0
            java.lang.String r3 = r3.f209412g2
            r8.mo99518N7(r0, r3)
        L_0x072f:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            boolean r0 = r0.f209507g
            if (r0 == 0) goto L_0x073b
            android.widget.TextView r0 = r8.f209884j
            r0.setText(r1)
            goto L_0x0747
        L_0x073b:
            android.widget.TextView r0 = r8.f209884j
            r1 = 2131838952(0x7f1147e8, float:1.9311142E38)
            java.lang.String r1 = r8.getString(r1)
            r0.setText(r1)
        L_0x0747:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            java.lang.String r0 = r0.f209511n
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x075a
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209916z
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r1 = r8.f209861W
            java.lang.String r1 = r1.f209511n
            r0.setText(r1)
        L_0x075a:
            di3.d r0 = di3.C86312j.m106911c(r9)
            yz.v r0 = (p281yz.C79173v) r0
            b63.s0 r0 = r0.Ex0()
            int r0 = r0.mo91333o()
            if (r0 <= 0) goto L_0x07ba
            java.lang.Object[] r0 = new java.lang.Object[r12]
            di3.d r1 = di3.C86312j.m106911c(r9)
            yz.v r1 = (p281yz.C79173v) r1
            b63.s0 r1 = r1.Ex0()
            int r1 = r1.mo91333o()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r11] = r1
            java.lang.String r1 = "has cre_type: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209913y
            r0.setClickable(r11)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209913y
            di3.d r1 = di3.C86312j.m106911c(r9)
            yz.v r1 = (p281yz.C79173v) r1
            b63.y r1 = r1.f232472d
            r1.getClass()
            di3.d r3 = di3.C86312j.m106911c(r9)
            yz.v r3 = (p281yz.C79173v) r3
            b63.s0 r3 = r3.Ex0()
            int r3 = r3.mo91333o()
            java.lang.String r1 = r1.mo91346b(r8, r3)
            r0.setText(r1)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209913y
            r0.setInputEnable(r11)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209916z
            int r1 = r8.f209862W0
            r8.mo99517M7(r0, r1)
            goto L_0x084c
        L_0x07ba:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            java.util.List r0 = r0.mo99415a()
            if (r0 == 0) goto L_0x07cd
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            java.util.List r0 = r0.mo99415a()
            int r0 = r0.size()
            goto L_0x07ce
        L_0x07cd:
            r0 = 0
        L_0x07ce:
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1[r11] = r3
            java.lang.String r3 = "cre_type count: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r1)
            if (r0 > r12) goto L_0x07ed
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209913y
            r0.setClickable(r11)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209913y
            r0.setInputEnable(r11)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209916z
            r0.setInputEnable(r12)
            goto L_0x07fc
        L_0x07ed:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209913y
            r0.setClickable(r12)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209913y
            r0.setInputEnable(r12)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209916z
            r0.setInputEnable(r12)
        L_0x07fc:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            java.util.List r0 = r0.mo99415a()
            if (r0 == 0) goto L_0x0810
            int r1 = r8.f209862W0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0812
        L_0x0810:
            r8.f209862W0 = r12
        L_0x0812:
            di3.d r0 = di3.C86312j.m106911c(r9)
            yz.v r0 = (p281yz.C79173v) r0
            b63.y r0 = r0.f232472d
            int r1 = r8.f209862W0
            java.lang.String r0 = r0.mo91346b(r8, r1)
            java.lang.String r1 = r8.f209828C1
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0839
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 16816(0x41b0, float:2.3564E-41)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            int r6 = r8.f209862W0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r11] = r6
            r0.mo160131h(r1, r3)
        L_0x0839:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209913y
            di3.d r1 = di3.C86312j.m106911c(r9)
            yz.v r1 = (p281yz.C79173v) r1
            b63.y r1 = r1.f232472d
            int r3 = r8.f209862W0
            java.lang.String r1 = r1.mo91346b(r8, r3)
            r0.setText(r1)
        L_0x084c:
            r8.mo99519O7(r11)
            boolean[] r0 = new boolean[r5]
            boolean r1 = r8.f209834F1
            r0[r11] = r1
            boolean r1 = r8.f209864X0
            r0[r12] = r1
            r0[r10] = r1
            boolean r1 = r8.f209866Y0
            r0[r2] = r1
            boolean r1 = r8.f209871c1
            r0[r15] = r1
            boolean r1 = r8.f209875e1
            r0[r4] = r1
            com.tencent.mm.wallet_core.ui.formview.WalletFormView[] r1 = new com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView[r5]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209831E
            r1[r11] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209827C
            r1[r12] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209829D
            r1[r10] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209825B
            r1[r2] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209839I
            r1[r15] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209841J
            r1[r4] = r3
            android.widget.TextView r3 = r8.f209900s
            r4 = 0
            r8.mo99521Q7(r0, r1, r3, r4)
        L_0x0887:
            boolean[] r0 = new boolean[r10]
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r1 = r8.f209861W
            boolean r3 = r1.f209509i
            r0[r11] = r3
            boolean r1 = r1.f209510j
            r0[r12] = r1
            com.tencent.mm.wallet_core.ui.formview.WalletFormView[] r1 = new com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView[r10]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209906v
            r1[r11] = r3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r8.f209904u
            r1[r12] = r3
            android.widget.TextView r3 = r8.f209889n
            android.widget.TextView r4 = r8.f209891o
            r8.mo99521Q7(r0, r1, r3, r4)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f209902t
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x08f8
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            int r0 = r0.f209514q
            if (r0 == r12) goto L_0x08e0
            if (r0 == r10) goto L_0x08d8
            if (r0 == r2) goto L_0x08c8
            if (r0 == r15) goto L_0x08c0
            android.widget.TextView r0 = r8.f209880h
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x08e7
        L_0x08c0:
            r1 = 8
            android.widget.TextView r0 = r8.f209880h
            r0.setVisibility(r1)
            goto L_0x08e7
        L_0x08c8:
            r1 = 8
            android.widget.TextView r0 = r8.f209880h
            r2 = 2131838912(0x7f1147c0, float:1.931106E38)
            r0.setText(r2)
            android.widget.TextView r0 = r8.f209880h
            r0.setVisibility(r11)
            goto L_0x08e7
        L_0x08d8:
            r1 = 8
            android.widget.TextView r0 = r8.f209880h
            r0.setVisibility(r1)
            goto L_0x08e7
        L_0x08e0:
            r1 = 8
            android.widget.TextView r0 = r8.f209880h
            r0.setVisibility(r1)
        L_0x08e7:
            android.widget.TextView r0 = r8.f209880h
            android.content.res.Resources r2 = r16.getResources()
            r3 = 2131101248(0x7f060640, float:1.78149E38)
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            goto L_0x08ff
        L_0x08f8:
            r1 = 8
            android.widget.TextView r0 = r8.f209880h
            r0.setVisibility(r1)
        L_0x08ff:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            java.lang.String r0 = r0.f209500N
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0924
            android.widget.TextView r0 = r8.f209880h
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0924
            java.lang.String r0 = "show pre auth word"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            android.widget.TextView r0 = r8.f209880h
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r1 = r8.f209861W
            java.lang.String r1 = r1.f209500N
            r0.setText(r1)
            android.widget.TextView r0 = r8.f209880h
            r0.setVisibility(r11)
        L_0x0924:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            java.lang.String r0 = r0.f209520w
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x094d
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = r8.f209861W
            java.lang.String r0 = r0.f209520w
            boolean r0 = eb0.C45628s0.m50740E(r0)
            if (r0 == 0) goto L_0x094d
            boolean r0 = r16.mo99515K7()
            if (r0 != 0) goto L_0x094d
            android.widget.CheckBox r0 = r8.f209854S0
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r1 = r8.f209861W
            java.lang.String r1 = r1.f209521x
            r0.setText(r1)
            android.widget.CheckBox r0 = r8.f209854S0
            r0.setVisibility(r11)
            goto L_0x0954
        L_0x094d:
            android.widget.CheckBox r0 = r8.f209854S0
            r1 = 8
            r0.setVisibility(r1)
        L_0x0954:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI.mo99520P7(boolean):void");
    }

    /* renamed from: Q7 */
    public final void mo99521Q7(boolean[] zArr, WalletFormView[] walletFormViewArr, TextView textView, TextView textView2) {
        mo99522R7(zArr, walletFormViewArr, textView, textView2, false);
    }

    /* renamed from: R7 */
    public final void mo99522R7(boolean[] zArr, WalletFormView[] walletFormViewArr, TextView textView, TextView textView2, boolean z) {
        int length = zArr.length;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            if (zArr[i]) {
                walletFormViewArr[i].setVisibility(0);
                z2 = true;
            } else {
                walletFormViewArr[i].setVisibility(8);
                walletFormViewArr[i].mo105071c();
            }
        }
        if (z2) {
            textView.setVisibility(0);
            if (textView2 == null) {
                return;
            }
            if (z) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(4);
            }
        } else {
            textView.setVisibility(8);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    public boolean getCancelable() {
        return false;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ce6;
    }

    public void initView() {
        this.f209874e = (TextView) findViewById(C0966R.C0970id.f359545lg0);
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.lfy);
        this.f209859V = walletFormView;
        C76024a.m91320a(walletFormView);
        this.f209876f = (TextView) findViewById(C0966R.C0970id.lfz);
        this.f209882i = (TextView) findViewById(C0966R.C0970id.f359547lg2);
        this.f209908w = (WalletFormView) findViewById(C0966R.C0970id.h_9);
        this.f209910x = (WalletFormView) findViewById(C0966R.C0970id.ee7);
        C76024a.m91327h(this, this.f209908w);
        C76024a.m91327h(this, this.f209910x);
        this.f209913y = (WalletFormView) findViewById(C0966R.C0970id.lgk);
        WalletFormView walletFormView2 = (WalletFormView) findViewById(C0966R.C0970id.f358436f34);
        this.f209916z = walletFormView2;
        C76024a.m91324e(walletFormView2);
        this.f209884j = (TextView) findViewById(C0966R.C0970id.f359546lg1);
        this.f209878g = (TextView) findViewById(C0966R.C0970id.lfr);
        this.f209902t = (WalletFormView) findViewById(C0966R.C0970id.f359548lg3);
        this.f209895p1 = (WalletFormView) findViewById(C0966R.C0970id.lg7);
        this.f209880h = (TextView) findViewById(C0966R.C0970id.lfs);
        this.f209898r = (TextView) findViewById(C0966R.C0970id.lfw);
        this.f209889n = (TextView) findViewById(C0966R.C0970id.lfu);
        WalletFormView walletFormView3 = (WalletFormView) findViewById(C0966R.C0970id.bym);
        this.f209906v = walletFormView3;
        C76024a.m91322c(this, walletFormView3);
        WalletFormView walletFormView4 = (WalletFormView) findViewById(C0966R.C0970id.f357829bz1);
        this.f209904u = walletFormView4;
        C76024a.m91323d(this, walletFormView4);
        this.f209891o = (TextView) findViewById(C0966R.C0970id.lft);
        this.f209896q = (TextView) findViewById(C0966R.C0970id.lfp);
        this.f209843K = (WalletFormView) findViewById(C0966R.C0970id.e__);
        this.f209845L = (WalletFormView) findViewById(C0966R.C0970id.fhv);
        this.f209846M = (WalletFormView) findViewById(C0966R.C0970id.f6144yi);
        this.f209847N = (WalletFormView) findViewById(C0966R.C0970id.f5619k0);
        this.f209848P = (WalletFormView) findViewById(C0966R.C0970id.huu);
        this.f209849Q = (WalletFormView) findViewById(C0966R.C0970id.f358942i04);
        WalletFormView walletFormView5 = (WalletFormView) findViewById(C0966R.C0970id.f357913ce3);
        this.f209851R = walletFormView5;
        if (walletFormView5 == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView5.setLogicDelegate(new C76035b());
        }
        this.f209893p = (TextView) findViewById(C0966R.C0970id.lfo);
        this.f209852R0 = (CheckBox) findViewById(C0966R.C0970id.f5661l6);
        this.f209854S0 = (CheckBox) findViewById(C0966R.C0970id.f5657l2);
        this.f209872d = (Button) findViewById(C0966R.C0970id.hfe);
        this.f209855T = (ScrollView) findViewById(C0966R.C0970id.ljl);
        this.f209825B = (WalletFormView) findViewById(C0966R.C0970id.f358963i34);
        this.f209827C = (WalletFormView) findViewById(C0966R.C0970id.i2w);
        this.f209829D = (WalletFormView) findViewById(C0966R.C0970id.i2v);
        this.f209831E = (WalletFormView) findViewById(C0966R.C0970id.i35);
        this.f209833F = (WalletFormView) findViewById(C0966R.C0970id.lgh);
        this.f209835G = (WalletFormView) findViewById(C0966R.C0970id.lgi);
        this.f209837H = (WalletFormView) findViewById(C0966R.C0970id.lgj);
        this.f209839I = (WalletFormView) findViewById(C0966R.C0970id.i2x);
        this.f209841J = (WalletFormView) findViewById(C0966R.C0970id.i2y);
        this.f209900s = (TextView) findViewById(C0966R.C0970id.lg5);
        WalletPhoneInputView walletPhoneInputView = (WalletPhoneInputView) findViewById(C0966R.C0970id.gw8);
        this.f209853S = walletPhoneInputView;
        this.f209823A = walletPhoneInputView.getPhoneNumberEt();
        this.f209908w.setOnInputValidChangeListener(this);
        this.f209910x.setOnInputValidChangeListener(this);
        this.f209859V.setOnInputValidChangeListener(this);
        this.f209913y.setOnInputValidChangeListener(this);
        this.f209916z.setOnInputValidChangeListener(this);
        this.f209823A.setOnInputValidChangeListener(new C72226i());
        this.f209906v.setOnInputValidChangeListener(this);
        this.f209904u.setOnInputValidChangeListener(this);
        this.f209843K.setOnInputValidChangeListener(this);
        this.f209845L.setOnInputValidChangeListener(this);
        this.f209846M.setOnInputValidChangeListener(this);
        this.f209847N.setOnInputValidChangeListener(this);
        this.f209848P.setOnInputValidChangeListener(this);
        this.f209849Q.setOnInputValidChangeListener(this);
        this.f209851R.setOnInputValidChangeListener(this);
        this.f209825B.setOnInputValidChangeListener(this);
        this.f209827C.setOnInputValidChangeListener(this);
        this.f209908w.setOnEditorActionListener(this);
        this.f209910x.setOnEditorActionListener(this);
        this.f209859V.setOnEditorActionListener(this);
        this.f209913y.setOnEditorActionListener(this);
        this.f209916z.setOnEditorActionListener(this);
        this.f209823A.setOnEditorActionListener(this);
        this.f209906v.setOnEditorActionListener(this);
        this.f209904u.setOnEditorActionListener(this);
        this.f209843K.setOnEditorActionListener(this);
        this.f209845L.setOnEditorActionListener(this);
        this.f209846M.setOnEditorActionListener(this);
        this.f209847N.setOnEditorActionListener(this);
        this.f209848P.setOnEditorActionListener(this);
        this.f209849Q.setOnEditorActionListener(this);
        this.f209851R.setOnEditorActionListener(this);
        this.f209827C.setOnEditorActionListener(this);
        this.f209825B.setOnEditorActionListener(this);
        this.f209902t.setOnClickListener(new C72227j());
        this.f209895p1.setOnClickListener(new C72228k());
        this.f209913y.setOnClickListener(new C72230l());
        this.f209833F.setOnClickListener(new C72231m());
        this.f209835G.setOnClickListener(new C72233n());
        this.f209837H.setOnClickListener(new C72235o());
        this.f209831E.setOnClickListener(new C72237p());
        this.f209827C.setOnClickListener(new C72239q());
        this.f209825B.setOnClickListener(new C72217a());
        this.f209839I.setOnClickListener(new C72218b());
        this.f209841J.setOnClickListener(new C72220c());
        this.f209852R0.setChecked(true);
        this.f209852R0.setOnCheckedChangeListener(new C72221d());
        findViewById(C0966R.C0970id.f5655l0).setOnClickListener(new C72222e());
        this.f209846M.setOnClickListener(new C72223f());
        this.f209829D.setOnInputValidChangeListener(this);
        this.f209872d.setOnClickListener(new C72224g());
        setEditFocusListener(this.f209859V, 0, false, false, true);
        setEditFocusListener(this.f209916z, 1, false, false, true);
        setEditFocusListener(this.f209823A, 0, false, false, true);
        ElementQuery elementQuery = this.f209861W;
        if (elementQuery != null && !Util.isNullOrNil(elementQuery.f209522y)) {
            C76879j.m92713G(this, this.f209861W.f209522y, (String) null, true, (DialogInterface.OnClickListener) null);
            this.f209861W = null;
        } else if (getInput().getInt("key_bind_scene", -1) == 5 && !this.f209861W.f209503R) {
            C76879j.m92713G(this, getString(C0966R.string.f361619lb3), (String) null, true, (DialogInterface.OnClickListener) null);
            this.f209861W.f209505e = null;
        }
        mo99520P7(true);
        mo99512H7();
        C79148e g = C79143a.m95768g(this);
        if (g != null && g.mo109117s()) {
            Orders orders = (Orders) getInput().getParcelable("key_orders");
            if (orders == null || orders.f209571p != 1) {
                this.f209850Q0 = false;
                return;
            }
            this.f209850Q0 = true;
            this.f209908w.setText(C75228t.m90270s(orders.f209573q));
            this.f209908w.setEnabled(false);
            this.f209908w.setFocusable(false);
            this.f209862W0 = orders.f209575s;
            this.f209913y.setText(((C79173v) C86312j.m106911c(C79173v.class)).f232472d.mo91346b(this, this.f209862W0));
            this.f209913y.setEnabled(false);
            this.f209916z.setText(orders.f209574r);
            this.f209916z.setInputEnable(false);
            this.f209916z.setFocusable(false);
            this.f209882i.setText(C0966R.string.knz);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        Log.m105924i("MicroMsg.WalletCardElmentUI", "onAcvityResult requestCode:" + i3);
        if (!this.f209853S.mo99816d(i3, i4, intent2)) {
            if (i3 == 6 && i4 == 100) {
                if (!Util.isNullOrNil(intent2.getStringExtra("country_name"))) {
                    this.f209886k1 = intent2.getStringExtra("iso_code");
                    this.f209841J.setText(intent2.getStringExtra("country_name"));
                }
            } else if (i4 == -1) {
                if (i3 == 1) {
                    this.f209861W = null;
                    this.f209899r1 = 0;
                    String stringExtra = intent2.getStringExtra("bank_name");
                    this.f209892o1 = stringExtra;
                    this.f209902t.setText(stringExtra);
                    this.f209895p1.setVisibility(0);
                    this.f209895p1.setText("");
                    mo99514J7(this.f209892o1);
                    if (((ArrayList) this.f209897q1).size() == 1) {
                        this.f209861W = (ElementQuery) ((ArrayList) this.f209897q1).get(0);
                    }
                    Log.m105925i("MicroMsg.WalletCardElmentUI", "select bank: %s, %s", this.f209892o1, Integer.valueOf(((ArrayList) this.f209897q1).size()));
                    this.f209894p0 = null;
                    mo99520P7(false);
                } else if (i3 == 2) {
                    String stringExtra2 = intent2.getStringExtra("CountryName");
                    String stringExtra3 = intent2.getStringExtra("Country");
                    this.f209856T0 = stringExtra2 + "|" + stringExtra3;
                    String stringExtra4 = intent2.getStringExtra("ProviceName");
                    String stringExtra5 = intent2.getStringExtra("CityName");
                    if (!Util.isNullOrNil(intent2.getStringExtra("Contact_City"))) {
                        this.f209858U0 = stringExtra4 + "|" + intent2.getStringExtra("Contact_Province");
                        this.f209860V0 = stringExtra5 + "|" + intent2.getStringExtra("Contact_City");
                        if (Util.isNullOrNil(stringExtra2)) {
                            WalletFormView walletFormView = this.f209846M;
                            walletFormView.setText(stringExtra4 + " " + stringExtra5);
                        } else {
                            WalletFormView walletFormView2 = this.f209846M;
                            walletFormView2.setText(stringExtra2 + " " + stringExtra5);
                        }
                    } else if (!Util.isNullOrNil(intent2.getStringExtra("Contact_Province"))) {
                        this.f209860V0 = stringExtra4 + "|" + intent2.getStringExtra("Contact_Province");
                        WalletFormView walletFormView3 = this.f209846M;
                        walletFormView3.setText(stringExtra2 + " " + stringExtra4);
                    } else {
                        this.f209860V0 = this.f209856T0;
                        this.f209846M.setText(stringExtra2);
                    }
                    if ("US".equals(stringExtra3) || "CA".equals(stringExtra3) || this.f209861W.f209492F) {
                        this.f209849Q.setVisibility(0);
                    } else {
                        this.f209849Q.setVisibility(8);
                    }
                    Log.m105925i("MicroMsg.WalletCardElmentUI", "onActivityResult for address countryName %s,countryCode %s, provinceName %s, cityName %s, mCity %s", stringExtra2, stringExtra3, stringExtra4, stringExtra5, this.f209860V0);
                } else if (i3 == 3) {
                    this.f209859V.set3DesValStr(intent2.getStringExtra("key_bankcard_id"));
                } else if (i3 == 4) {
                    String stringExtra6 = intent2.getStringExtra("CountryName");
                    String stringExtra7 = intent2.getStringExtra("ProviceName");
                    String stringExtra8 = intent2.getStringExtra("CityName");
                    this.f209881h1 = intent2.getStringExtra("Country");
                    this.f209883i1 = intent2.getStringExtra("Contact_Province");
                    this.f209885j1 = intent2.getStringExtra("Contact_City");
                    StringBuilder sb = new StringBuilder();
                    if (!Util.isNullOrNil(stringExtra6)) {
                        sb.append(stringExtra6);
                    }
                    if (!Util.isNullOrNil(stringExtra7)) {
                        sb.append(" ");
                        sb.append(stringExtra7);
                    }
                    if (!Util.isNullOrNil(stringExtra8)) {
                        sb.append(" ");
                        sb.append(stringExtra8);
                    }
                    this.f209827C.setText(sb.toString());
                } else if (i3 == 5) {
                    Profession profession = (Profession) intent2.getParcelableExtra("key_select_profession");
                    this.f209888m1 = profession;
                    this.f209825B.setText(profession.f209290d);
                }
                mo99512H7();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        this.f209861W = (ElementQuery) getInput().getParcelable("elemt_query");
        this.f209865Y = (Orders) getInput().getParcelable("key_orders");
        this.f209867Z = (PayInfo) getInput().getParcelable("key_pay_info");
        this.f209862W0 = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91333o();
        this.f209894p0 = (Bankcard) getInput().getParcelable("key_history_bankcard");
        this.f209864X0 = getInput().getBoolean("key_need_area", false);
        this.f209866Y0 = getInput().getBoolean("key_need_profession", false);
        this.f209877f1 = getInput().getBoolean("key_need_country", false);
        this.f209879g1 = getInput().getStringArray("key_country_excludes");
        ElementQuery elementQuery = this.f209861W;
        if (elementQuery != null) {
            mo99514J7(elementQuery.f209505e);
        }
        Log.m105919d("MicroMsg.WalletCardElmentUI", "neeCountry: %s", Boolean.valueOf(this.f209877f1));
        if (this.f209864X0 || this.f209866Y0) {
            setMMTitle((int) C0966R.string.ksk);
        } else {
            setMMTitle((int) C0966R.string.ksj);
        }
        Parcelable[] parcelableArray = getInput().getParcelableArray("key_profession_list");
        if (parcelableArray != null) {
            this.f209887l1 = new Profession[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; i++) {
                this.f209887l1[i] = (Profession) parcelableArray[i];
            }
        }
        if (this.f209867Z == null) {
            this.f209867Z = new PayInfo();
        }
        Log.m105918d("MicroMsg.WalletCardElmentUI", "mPayInfo " + this.f209867Z);
        this.f209830D1 = new String[100];
        int i2 = 0;
        while (true) {
            String[] strArr = this.f209830D1;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = getString(C0966R.string.krl, new Object[]{Integer.valueOf(i2)});
            i2++;
        }
        FavorPayInfo favorPayInfo = (FavorPayInfo) getInput().getParcelable("key_favor_pay_info");
        Orders orders = this.f209865Y;
        if (!(orders == null || favorPayInfo == null)) {
            C72394l a = C72400m.INSTANCE.mo99776a(orders);
            this.f209914y0 = a;
            if (a != null) {
                this.f209911x0 = this.f209914y0.mo99766b(a.mo99767c(favorPayInfo.f209524d, false), false);
            } else {
                Log.m105928w("MicroMsg.WalletCardElmentUI", " get favorLogicHelper null");
            }
        }
        initView();
        this.f209855T.pageScroll(33);
        C72517z.m84856d(this, getInput(), 3);
        this.f209844K1.alive();
    }

    public void onDestroy() {
        this.f209844K1.dead();
        super.onDestroy();
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Log.m105918d("MicroMsg.WalletCardElmentUI", "onEditorAction actionId : " + i);
        boolean z = false;
        if (i != 5) {
            if (this.f209857U == null) {
                mo99513I7();
            }
            return false;
        }
        WalletFormView walletFormView = this.f209857U;
        if (walletFormView != null) {
            TenpaySecureEditText tenpaySecureEditText = walletFormView.f221285g;
            if (tenpaySecureEditText != null ? tenpaySecureEditText.isFocusable() : false) {
                TenpaySecureEditText tenpaySecureEditText2 = this.f209857U.f221285g;
                if (tenpaySecureEditText2 != null ? tenpaySecureEditText2.isClickable() : false) {
                    TenpaySecureEditText tenpaySecureEditText3 = this.f209857U.f221285g;
                    if (tenpaySecureEditText3 != null) {
                        z = tenpaySecureEditText3.isFocusable();
                    }
                    if (z) {
                        this.f209857U.mo105095m();
                        return true;
                    }
                }
            }
            this.f209857U.performClick();
            return true;
        }
        mo99513I7();
        return true;
    }

    public void onInputValidChange(boolean z) {
        mo99512H7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.WalletCardElmentUI", " errCode: " + i2 + " errMsg :" + str);
        if (i == 0 && i2 == 0) {
            Bundle input = getInput();
            Log.m105918d("MicroMsg.WalletCardElmentUI", "PayInfo  " + this.f209867Z);
            if (yVar instanceof C78342e0) {
                Log.m105924i("MicroMsg.WalletCardElmentUI", "query bound bank card resp, forwardProcess");
                C79143a.m95765d(this, input);
                return true;
            }
        }
        return false;
    }
}
