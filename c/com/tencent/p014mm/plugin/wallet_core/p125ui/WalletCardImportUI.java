package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import b63.C67212y;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.MMScrollView;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import di3.C86312j;
import gr3.C76024a;
import gr3.C76035b;
import hr3.C76241b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import nj3.C76879j;
import ob0.C117747y;
import p281yz.C79173v;
import qo3.C77390c0;
import v53.C78342e0;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI */
public class WalletCardImportUI extends WalletBaseUI implements WalletFormView.C75209c, TextView.OnEditorActionListener {

    /* renamed from: L */
    public static final /* synthetic */ int f209948L = 0;

    /* renamed from: A */
    public Authen f209949A = new Authen();

    /* renamed from: B */
    public Orders f209950B = null;

    /* renamed from: C */
    public PayInfo f209951C = null;

    /* renamed from: D */
    public Bankcard f209952D = null;

    /* renamed from: E */
    public CheckBox f209953E;

    /* renamed from: F */
    public CheckBox f209954F;

    /* renamed from: G */
    public String f209955G;

    /* renamed from: H */
    public String f209956H;

    /* renamed from: I */
    public String f209957I;

    /* renamed from: J */
    public int f209958J = 1;

    /* renamed from: K */
    public BaseAdapter f209959K = new C72249i();

    /* renamed from: d */
    public Button f209960d;

    /* renamed from: e */
    public TextView f209961e;

    /* renamed from: f */
    public WalletFormView f209962f;

    /* renamed from: g */
    public WalletFormView f209963g;

    /* renamed from: h */
    public WalletFormView f209964h;

    /* renamed from: i */
    public WalletFormView f209965i;

    /* renamed from: j */
    public WalletFormView f209966j;

    /* renamed from: n */
    public WalletFormView f209967n;

    /* renamed from: o */
    public WalletFormView f209968o;

    /* renamed from: p */
    public WalletFormView f209969p;

    /* renamed from: q */
    public WalletFormView f209970q;

    /* renamed from: r */
    public WalletFormView f209971r;

    /* renamed from: s */
    public WalletFormView f209972s;

    /* renamed from: t */
    public WalletFormView f209973t;

    /* renamed from: u */
    public WalletFormView f209974u;

    /* renamed from: v */
    public WalletFormView f209975v;

    /* renamed from: w */
    public MMScrollView f209976w;

    /* renamed from: x */
    public WalletFormView f209977x;

    /* renamed from: y */
    public MMHandler f209978y = new MMHandler();

    /* renamed from: z */
    public ElementQuery f209979z = new ElementQuery();

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI$a */
    public class C72240a implements MMScrollView.C75167c {
        public C72240a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI$b */
    public class C72241b implements View.OnClickListener {
        public C72241b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Bundle bundle = new Bundle();
            bundle.putInt("key_support_bankcard", WalletCardImportUI.this.getInput().getInt("key_support_bankcard", 3));
            bundle.putString("key_bank_type", WalletCardImportUI.this.f209979z.f209516s);
            bundle.putInt("key_bankcard_type", WalletCardImportUI.this.f209979z.f209515r);
            C79143a.m95768g(WalletCardImportUI.this).mo109106E(WalletCardImportUI.this, WalletCardSelectUI.class, bundle, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI$c */
    public class C72242c implements View.OnClickListener {
        public C72242c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletCardImportUI.this.showDialog(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI$d */
    public class C72243d implements CompoundButton.OnCheckedChangeListener {
        public C72243d() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            WalletCardImportUI walletCardImportUI = WalletCardImportUI.this;
            int i = WalletCardImportUI.f209948L;
            walletCardImportUI.mo99540H7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI$e */
    public class C72244e implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI$e$a */
        public class C72245a implements C76879j.C76888o {
            public C72245a() {
            }

            /* renamed from: a */
            public void mo5759a(int i, int i2) {
                Intent intent = new Intent();
                if (i == 0) {
                    intent.putExtra("rawUrl", WalletCardImportUI.this.getString(C0966R.string.kka, new Object[]{LocaleUtil.getApplicationLanguage()}));
                } else if (i == 1) {
                    WalletCardImportUI walletCardImportUI = WalletCardImportUI.this;
                    if (walletCardImportUI.f209979z != null) {
                        intent.putExtra("rawUrl", walletCardImportUI.getString(C0966R.string.kk9, new Object[]{LocaleUtil.getApplicationLanguage(), WalletCardImportUI.this.f209979z.f209516s}));
                    }
                }
                intent.putExtra("showShare", false);
                C75228t.m90217J(WalletCardImportUI.this.getContext(), intent);
            }
        }

        public C72244e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            linkedList.add(WalletCardImportUI.this.getString(C0966R.string.knu));
            linkedList2.add(0);
            WalletCardImportUI walletCardImportUI = WalletCardImportUI.this;
            ElementQuery elementQuery = walletCardImportUI.f209979z;
            if (elementQuery != null && elementQuery.f209499M) {
                linkedList.add(walletCardImportUI.getString(C0966R.string.kns));
                linkedList2.add(1);
            }
            C76879j.m92732c(WalletCardImportUI.this, "", linkedList, linkedList2, "", new C72245a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI$f */
    public class C72246f implements View.OnClickListener {
        public C72246f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletCardImportUI.this.startActivityForResult(new Intent("com.tencent.mm.action.GET_ADRESS").putExtra("GetAddress", true), 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI$g */
    public class C72247g implements View.OnClickListener {
        public C72247g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletCardImportUI walletCardImportUI = WalletCardImportUI.this;
            int i = WalletCardImportUI.f209948L;
            walletCardImportUI.mo99541I7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI$h */
    public class C72248h implements AdapterView.OnItemClickListener {
        public C72248h() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            WalletCardImportUI.this.dismissDialog(1);
            int intValue = WalletCardImportUI.this.f209979z.mo99415a().get(i).intValue();
            WalletCardImportUI walletCardImportUI = WalletCardImportUI.this;
            if (walletCardImportUI.f209958J != intValue) {
                walletCardImportUI.f209958J = intValue;
                walletCardImportUI.f209966j.setText(((CheckedTextView) view).getText().toString());
                WalletCardImportUI walletCardImportUI2 = WalletCardImportUI.this;
                WalletFormView walletFormView = walletCardImportUI2.f209967n;
                int i2 = walletCardImportUI2.f209958J;
                walletCardImportUI2.getClass();
                C76241b logicDelegate = walletFormView.getLogicDelegate();
                if (logicDelegate instanceof C76024a.C76033i) {
                    ((C76024a.C76033i) logicDelegate).mo106242f(i2);
                }
                WalletCardImportUI.this.f209967n.mo105071c();
                WalletCardImportUI.this.mo99543K7();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI$i */
    public class C72249i extends BaseAdapter {
        public C72249i() {
        }

        public int getCount() {
            if (WalletCardImportUI.this.f209979z.mo99415a() != null) {
                return WalletCardImportUI.this.f209979z.mo99415a().size();
            }
            return 0;
        }

        public Object getItem(int i) {
            return WalletCardImportUI.this.f209979z.mo99415a().get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            CheckedTextView checkedTextView = (CheckedTextView) View.inflate(WalletCardImportUI.this, C0966R.C0971layout.cf5, (ViewGroup) null);
            C67212y yVar = ((C79173v) C86312j.m106911c(C79173v.class)).f232472d;
            WalletCardImportUI walletCardImportUI = WalletCardImportUI.this;
            checkedTextView.setText(yVar.mo91346b(walletCardImportUI, walletCardImportUI.f209979z.mo99415a().get(i).intValue()));
            WalletCardImportUI walletCardImportUI2 = WalletCardImportUI.this;
            if (walletCardImportUI2.f209958J == walletCardImportUI2.f209979z.mo99415a().get(i).intValue()) {
                checkedTextView.setChecked(true);
            } else {
                checkedTextView.setChecked(false);
            }
            checkedTextView.setBackgroundResource(C0966R.C0969drawable.f4855pa);
            return checkedTextView;
        }
    }

    /* renamed from: H7 */
    public final boolean mo99540H7() {
        boolean z = this.f209953E.isChecked();
        if (z) {
            this.f209960d.setEnabled(true);
            this.f209960d.setClickable(true);
        } else {
            this.f209960d.setEnabled(false);
            this.f209960d.setClickable(false);
        }
        return z;
    }

    /* renamed from: I7 */
    public final void mo99541I7() {
        if (mo99540H7()) {
            C72517z.m84857e();
            this.f209949A = new Authen();
            getInput().putBoolean("key_is_follow_bank_username", this.f209954F.isChecked());
            Bankcard bankcard = this.f209952D;
            if (bankcard == null || Util.isNullOrNil(bankcard.f209425t2)) {
                String string = getInput().getString("key_card_id");
                if (this.f209977x.getVisibility() == 0) {
                    string = this.f209977x.getText();
                }
                this.f209949A.f209382v = (PayInfo) getInput().getParcelable("key_pay_info");
                Authen authen = this.f209949A;
                authen.f209376p = string;
                authen.f209370g = this.f209979z.f209516s;
                authen.f209374n = this.f209958J;
                authen.f209369f = getInput().getString("key_pwd1");
                if (!Util.isNullOrNil(this.f209964h.getText())) {
                    this.f209949A.f209377q = this.f209964h.getText();
                }
                this.f209949A.f209375o = this.f209968o.getText();
                this.f209949A.f209383w = this.f209969p.getText();
                this.f209949A.f209384x = this.f209970q.getText();
                Authen authen2 = this.f209949A;
                authen2.f209385y = this.f209955G;
                authen2.f209386z = this.f209956H;
                authen2.f209348A = this.f209957I;
                authen2.f209349B = this.f209972s.getText();
                this.f209949A.f209350C = this.f209973t.getText();
                this.f209949A.f209351D = this.f209974u.getText();
                this.f209949A.f209352E = this.f209975v.getText();
                getInput().putString("key_mobile", C75228t.m90227T(this.f209949A.f209375o));
                getInput().putBoolean("key_is_oversea", this.f209979z.f209495I == 2);
                this.f209949A.f209373j = this.f209967n.getText();
                this.f209949A.f209372i = this.f209965i.getText();
                this.f209949A.f209378r = this.f209963g.getText();
                Log.m105918d("MicroMsg.WalletCardElmentUI", "payInfo " + this.f209949A.f209382v + " elemt.bankcardTag : " + this.f209979z.f209495I);
            } else {
                Authen authen3 = this.f209949A;
                Bankcard bankcard2 = this.f209952D;
                authen3.f209353F = bankcard2.f209425t2;
                authen3.f209371h = bankcard2.field_bindSerial;
                authen3.f209370g = bankcard2.field_bankcardType;
                authen3.f209374n = bankcard2.f209424s2;
                authen3.f209369f = getInput().getString("key_pwd1");
                this.f209949A.f209379s = getInput().getString("kreq_token");
            }
            C79143a.m95768g(this);
            if (getNetController().mo91271d(this.f209949A, this.f209950B)) {
                Log.m105924i("MicroMsg.WalletCardElmentUI", "process controller deal with!!!");
            } else {
                Log.m105920e("MicroMsg.WalletCardElmentUI", "error process in the tenpay!!");
            }
        }
    }

    /* renamed from: J7 */
    public final boolean mo99542J7(WalletFormView walletFormView, String str) {
        if (!Util.isNullOrNil(str)) {
            KeyListener keyListener = walletFormView.getKeyListener();
            walletFormView.setKeyListener((KeyListener) null);
            walletFormView.setEnabled(false);
            walletFormView.setClickable(false);
            walletFormView.setText(str);
            walletFormView.setKeyListener(keyListener);
            walletFormView.setVisibility(0);
            return true;
        }
        walletFormView.setVisibility(8);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01cc  */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99543K7() {
        /*
            r12 = this;
            java.lang.Class<yz.v> r0 = p281yz.C79173v.class
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = r12.f209952D
            if (r1 == 0) goto L_0x01d4
            r1 = 2131316706(0x7f094fe2, float:1.8251901E38)
            android.view.View r1 = r12.findViewById(r1)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r11 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r10.mo10233c(r2)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI"
            java.lang.String r5 = "updateView"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI"
            java.lang.String r4 = "updateView"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r1
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            android.os.Bundle r1 = r12.getInput()
            java.lang.String r2 = "key_bank_username"
            java.lang.String r1 = r1.getString(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r2 = 8
            if (r1 != 0) goto L_0x0092
            android.os.Bundle r1 = r12.getInput()
            java.lang.String r3 = "key_recommand_desc"
            java.lang.String r1 = r1.getString(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 == 0) goto L_0x0087
            android.widget.CheckBox r1 = r12.f209954F
            r3 = 2131838945(0x7f1147e1, float:1.9311128E38)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r12.f209952D
            java.lang.String r5 = r5.field_bankName
            r4[r11] = r5
            java.lang.String r3 = r12.getString(r3, r4)
            r1.setText(r3)
            goto L_0x008c
        L_0x0087:
            android.widget.CheckBox r3 = r12.f209954F
            r3.setText(r1)
        L_0x008c:
            android.widget.CheckBox r1 = r12.f209954F
            r1.setVisibility(r11)
            goto L_0x0097
        L_0x0092:
            android.widget.CheckBox r1 = r12.f209954F
            r1.setVisibility(r2)
        L_0x0097:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209969p
            r1.setVisibility(r2)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209970q
            r1.setVisibility(r2)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209971r
            r1.setVisibility(r2)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209972s
            r1.setVisibility(r2)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209973t
            r1.setVisibility(r2)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209974u
            r1.setVisibility(r2)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209975v
            r1.setVisibility(r2)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = r12.f209952D
            java.lang.String r1 = r1.field_bankcardTail
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r3 = 0
            if (r1 != 0) goto L_0x00d4
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209977x
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r12.f209952D
            java.lang.String r4 = r4.f209410e2
            boolean r1 = r12.mo99542J7(r1, r4)
            if (r1 == 0) goto L_0x00d4
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r12.f209977x
            goto L_0x00d9
        L_0x00d4:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209977x
            r1.setVisibility(r2)
        L_0x00d9:
            r1 = r3
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r12.f209952D
            boolean r4 = r4.mo99389o2()
            if (r4 == 0) goto L_0x00ea
            r4 = 2131839040(0x7f114840, float:1.931132E38)
            java.lang.String r4 = r12.getString(r4)
            goto L_0x00f1
        L_0x00ea:
            r4 = 2131839067(0x7f11485b, float:1.9311375E38)
            java.lang.String r4 = r12.getString(r4)
        L_0x00f1:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r12.f209952D
            java.lang.String r5 = r5.field_bankName
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0123
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = r12.f209962f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r7 = r12.f209952D
            java.lang.String r7 = r7.field_bankName
            r6.append(r7)
            java.lang.String r7 = " "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            boolean r4 = r12.mo99542J7(r5, r4)
            if (r4 == 0) goto L_0x0123
            if (r3 != 0) goto L_0x0120
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209962f
            r3 = r1
        L_0x0120:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209962f
            goto L_0x0128
        L_0x0123:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r4 = r12.f209962f
            r4.setVisibility(r2)
        L_0x0128:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r12.f209965i
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r12.f209952D
            java.lang.String r4 = r4.field_trueName
            boolean r2 = r12.mo99542J7(r2, r4)
            if (r2 == 0) goto L_0x013b
            if (r3 != 0) goto L_0x0139
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209965i
            r3 = r1
        L_0x0139:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209965i
        L_0x013b:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r12.f209966j
            di3.d r4 = di3.C86312j.m106911c(r0)
            yz.v r4 = (p281yz.C79173v) r4
            b63.y r4 = r4.f232472d
            androidx.appcompat.app.AppCompatActivity r5 = r12.getContext()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r6 = r12.f209952D
            int r6 = r6.f209424s2
            java.lang.String r4 = r4.mo91346b(r5, r6)
            boolean r2 = r12.mo99542J7(r2, r4)
            if (r2 == 0) goto L_0x015e
            if (r3 != 0) goto L_0x015c
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209966j
            r3 = r1
        L_0x015c:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209966j
        L_0x015e:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r12.f209967n
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r12.f209952D
            java.lang.String r4 = r4.f209409d2
            boolean r2 = r12.mo99542J7(r2, r4)
            if (r2 == 0) goto L_0x0171
            if (r3 != 0) goto L_0x016f
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209967n
            r3 = r1
        L_0x016f:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209967n
        L_0x0171:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r12.f209968o
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r12.f209952D
            java.lang.String r4 = r4.field_mobile
            boolean r2 = r12.mo99542J7(r2, r4)
            if (r2 == 0) goto L_0x0184
            if (r3 != 0) goto L_0x0182
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209968o
            r3 = r1
        L_0x0182:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209968o
        L_0x0184:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r12.f209964h
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r12.f209952D
            java.lang.String r4 = r4.f209411f2
            boolean r2 = r12.mo99542J7(r2, r4)
            if (r2 == 0) goto L_0x0197
            if (r3 != 0) goto L_0x0195
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209964h
            r3 = r1
        L_0x0195:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209964h
        L_0x0197:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r12.f209963g
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r12.f209952D
            java.lang.String r4 = r4.f209412g2
            boolean r2 = r12.mo99542J7(r2, r4)
            if (r2 == 0) goto L_0x01aa
            if (r3 != 0) goto L_0x01a8
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209963g
            r3 = r1
        L_0x01a8:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r12.f209963g
        L_0x01aa:
            r2 = 2131231818(0x7f08044a, float:1.8079728E38)
            r3.setBackgroundResource(r2)
            r1.setBackgroundResource(r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            yz.v r0 = (p281yz.C79173v) r0
            b63.s0 r0 = r0.Ex0()
            boolean r0 = r0.mo91343y()
            if (r0 == 0) goto L_0x01cc
            android.widget.Button r0 = r12.f209960d
            r1 = 2131838957(0x7f1147ed, float:1.9311152E38)
            r0.setText(r1)
            goto L_0x01d4
        L_0x01cc:
            android.widget.Button r0 = r12.f209960d
            r1 = 2131838955(0x7f1147eb, float:1.9311148E38)
            r0.setText(r1)
        L_0x01d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardImportUI.mo99543K7():void");
    }

    public boolean getCancelable() {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ce7;
    }

    public void initView() {
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.lfy);
        this.f209977x = walletFormView;
        C76024a.m91320a(walletFormView);
        WalletFormView walletFormView2 = (WalletFormView) findViewById(C0966R.C0970id.gvt);
        this.f209968o = walletFormView2;
        C76024a.m91325f(this, walletFormView2);
        WalletFormView walletFormView3 = (WalletFormView) findViewById(C0966R.C0970id.h_9);
        this.f209965i = walletFormView3;
        C76024a.m91327h(this, walletFormView3);
        this.f209966j = (WalletFormView) findViewById(C0966R.C0970id.lgk);
        WalletFormView walletFormView4 = (WalletFormView) findViewById(C0966R.C0970id.f358436f34);
        this.f209967n = walletFormView4;
        C76024a.m91324e(walletFormView4);
        this.f209962f = (WalletFormView) findViewById(C0966R.C0970id.lg7);
        WalletFormView walletFormView5 = (WalletFormView) findViewById(C0966R.C0970id.bym);
        this.f209964h = walletFormView5;
        C76024a.m91322c(this, walletFormView5);
        WalletFormView walletFormView6 = (WalletFormView) findViewById(C0966R.C0970id.f357829bz1);
        this.f209963g = walletFormView6;
        C76024a.m91323d(this, walletFormView6);
        this.f209961e = (TextView) findViewById(C0966R.C0970id.f359562lj3);
        this.f209969p = (WalletFormView) findViewById(C0966R.C0970id.e__);
        this.f209970q = (WalletFormView) findViewById(C0966R.C0970id.fhv);
        this.f209971r = (WalletFormView) findViewById(C0966R.C0970id.f6144yi);
        this.f209972s = (WalletFormView) findViewById(C0966R.C0970id.f5619k0);
        this.f209973t = (WalletFormView) findViewById(C0966R.C0970id.huu);
        this.f209974u = (WalletFormView) findViewById(C0966R.C0970id.f358942i04);
        WalletFormView walletFormView7 = (WalletFormView) findViewById(C0966R.C0970id.f357913ce3);
        this.f209975v = walletFormView7;
        if (walletFormView7 == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView7.setLogicDelegate(new C76035b());
        }
        this.f209953E = (CheckBox) findViewById(C0966R.C0970id.f5661l6);
        this.f209954F = (CheckBox) findViewById(C0966R.C0970id.f5657l2);
        this.f209960d = (Button) findViewById(C0966R.C0970id.hfe);
        MMScrollView mMScrollView = (MMScrollView) findViewById(C0966R.C0970id.ljl);
        this.f209976w = mMScrollView;
        mMScrollView.mo104932a(mMScrollView, mMScrollView);
        this.f209976w.setOnSizeChangeListener(new C72240a());
        this.f209965i.setOnInputValidChangeListener(this);
        this.f209977x.setOnInputValidChangeListener(this);
        this.f209966j.setOnInputValidChangeListener(this);
        this.f209967n.setOnInputValidChangeListener(this);
        this.f209968o.setOnInputValidChangeListener(this);
        this.f209964h.setOnInputValidChangeListener(this);
        this.f209963g.setOnInputValidChangeListener(this);
        this.f209969p.setOnInputValidChangeListener(this);
        this.f209970q.setOnInputValidChangeListener(this);
        this.f209971r.setOnInputValidChangeListener(this);
        this.f209972s.setOnInputValidChangeListener(this);
        this.f209973t.setOnInputValidChangeListener(this);
        this.f209974u.setOnInputValidChangeListener(this);
        this.f209975v.setOnInputValidChangeListener(this);
        this.f209965i.setOnEditorActionListener(this);
        this.f209977x.setOnEditorActionListener(this);
        this.f209966j.setOnEditorActionListener(this);
        this.f209967n.setOnEditorActionListener(this);
        this.f209968o.setOnEditorActionListener(this);
        this.f209964h.setOnEditorActionListener(this);
        this.f209963g.setOnEditorActionListener(this);
        this.f209969p.setOnEditorActionListener(this);
        this.f209970q.setOnEditorActionListener(this);
        this.f209971r.setOnEditorActionListener(this);
        this.f209972s.setOnEditorActionListener(this);
        this.f209973t.setOnEditorActionListener(this);
        this.f209974u.setOnEditorActionListener(this);
        this.f209975v.setOnEditorActionListener(this);
        this.f209962f.setOnClickListener(new C72241b());
        this.f209966j.setOnClickListener(new C72242c());
        this.f209953E.setChecked(true);
        this.f209953E.setOnCheckedChangeListener(new C72243d());
        this.f209954F.setChecked(true);
        findViewById(C0966R.C0970id.f5655l0).setOnClickListener(new C72244e());
        this.f209971r.setOnClickListener(new C72246f());
        this.f209960d.setOnClickListener(new C72247g());
        mo99543K7();
        mo99540H7();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.WalletCardElmentUI", "onAcvityResult requestCode:" + i);
        if (i2 == -1) {
            if (i == 1) {
                this.f209979z = (ElementQuery) intent.getParcelableExtra("elemt_query");
                mo99543K7();
            } else if (i == 2) {
                String stringExtra = intent.getStringExtra("CountryName");
                String stringExtra2 = intent.getStringExtra("Country");
                this.f209955G = stringExtra + "|" + stringExtra2;
                String stringExtra3 = intent.getStringExtra("ProviceName");
                String stringExtra4 = intent.getStringExtra("CityName");
                if (!Util.isNullOrNil(intent.getStringExtra("Contact_City"))) {
                    this.f209956H = stringExtra3 + "|" + intent.getStringExtra("Contact_Province");
                    this.f209957I = stringExtra4 + "|" + intent.getStringExtra("Contact_City");
                    WalletFormView walletFormView = this.f209971r;
                    walletFormView.setText(stringExtra + " " + stringExtra4);
                } else if (!Util.isNullOrNil(intent.getStringExtra("Contact_Province"))) {
                    this.f209957I = stringExtra3 + "|" + intent.getStringExtra("Contact_Province");
                    WalletFormView walletFormView2 = this.f209971r;
                    walletFormView2.setText(stringExtra + " " + stringExtra3);
                } else {
                    this.f209957I = this.f209955G;
                    this.f209971r.setText(stringExtra);
                }
                if ("US".equals(stringExtra2) || "CA".equals(stringExtra2) || this.f209979z.f209492F) {
                    this.f209974u.setVisibility(0);
                } else {
                    this.f209974u.setVisibility(8);
                }
            }
            mo99540H7();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.ksj);
        this.f209979z = (ElementQuery) getInput().getParcelable("elemt_query");
        this.f209950B = (Orders) getInput().getParcelable("key_orders");
        this.f209951C = (PayInfo) getInput().getParcelable("key_pay_info");
        this.f209952D = (Bankcard) getInput().getParcelable("key_import_bankcard");
        if (this.f209951C == null) {
            this.f209951C = new PayInfo();
        }
        Log.m105918d("MicroMsg.WalletCardElmentUI", "mPayInfo " + this.f209951C);
        initView();
        this.f209976w.pageScroll(33);
        C72517z.m84856d(this, getInput(), 3);
    }

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C77390c0 c0Var = new C77390c0(this, C0966R.style.f8745tq);
        c0Var.setContentView(C0966R.C0971layout.cf4);
        ListView listView = (ListView) c0Var.findViewById(C0966R.C0970id.f5610jr);
        listView.setAdapter(this.f209959K);
        listView.setOnItemClickListener(new C72248h());
        return c0Var;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Log.m105918d("MicroMsg.WalletCardElmentUI", "onEditorAction actionId : " + i);
        if (i != 5) {
            mo99541I7();
            return false;
        }
        mo99541I7();
        return true;
    }

    public void onInputValidChange(boolean z) {
        mo99540H7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.WalletCardElmentUI", " errCode: " + i2 + " errMsg :" + str);
        if (i != 0 || i2 != 0) {
            return false;
        }
        Bundle input = getInput();
        Log.m105918d("MicroMsg.WalletCardElmentUI", "PayInfo  " + this.f209951C);
        if (!(yVar instanceof C78342e0)) {
            return false;
        }
        input.putBoolean("intent_bind_end", true);
        C79143a.m95765d(this, input);
        C76879j.m92726T(this, getString(C0966R.string.kmi));
        return true;
    }
}
