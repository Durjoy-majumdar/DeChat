package com.tencent.p014mm.plugin.wxcredit.p132ui;

import al3.C0086a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.ListViewInScrollView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import qo3.C77389a;
import qo3.C77398g;
import rb3.C77501c;
import rb3.C77503e;
import rb3.C77509l;
import sb3.C77638a;
import sb3.C77639b;
import sb3.C77640c;
import sb3.C77641d;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI */
public class WalletWXCreditChangeAmountUI extends WalletBaseUI implements View.OnClickListener {

    /* renamed from: d */
    public List<C77509l> f211375d;

    /* renamed from: e */
    public List<C77509l> f211376e = new ArrayList();

    /* renamed from: f */
    public C77509l f211377f;

    /* renamed from: g */
    public C77509l f211378g;

    /* renamed from: h */
    public int f211379h = -1;

    /* renamed from: i */
    public boolean f211380i;

    /* renamed from: j */
    public boolean f211381j;

    /* renamed from: n */
    public TextView f211382n;

    /* renamed from: o */
    public TextView f211383o;

    /* renamed from: p */
    public TextView f211384p;

    /* renamed from: q */
    public TextView f211385q;

    /* renamed from: r */
    public TextView f211386r;

    /* renamed from: s */
    public TextView f211387s;

    /* renamed from: t */
    public EditText f211388t;

    /* renamed from: u */
    public EditText f211389u;

    /* renamed from: v */
    public EditText f211390v;

    /* renamed from: w */
    public EditText f211391w;

    /* renamed from: x */
    public BaseAdapter f211392x = new C72657g();

    /* renamed from: y */
    public BaseAdapter f211393y = new C72651a();

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI$a */
    public class C72651a extends BaseAdapter {
        public C72651a() {
        }

        public int getCount() {
            return 2;
        }

        public Object getItem(int i) {
            return (C77509l) ((ArrayList) WalletWXCreditChangeAmountUI.this.f211376e).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            CheckedTextView checkedTextView = (CheckedTextView) View.inflate(WalletWXCreditChangeAmountUI.this, C0966R.C0971layout.cf5, (ViewGroup) null);
            if (i == 0) {
                checkedTextView.setText(C0966R.string.a4h);
            } else {
                checkedTextView.setText(C0966R.string.f360090a14);
            }
            WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = WalletWXCreditChangeAmountUI.this;
            boolean z = true;
            if (walletWXCreditChangeAmountUI.f211381j) {
                C77509l lVar = walletWXCreditChangeAmountUI.f211377f;
                if (lVar.f226012h == null || !"Y".equals(lVar.f226007c)) {
                    if (i == 0) {
                        z = false;
                    }
                    checkedTextView.setChecked(z);
                } else {
                    if (i != 0) {
                        z = false;
                    }
                    checkedTextView.setChecked(z);
                }
            } else {
                C77509l lVar2 = walletWXCreditChangeAmountUI.f211378g;
                if (lVar2.f226012h == null || !"Y".equals(lVar2.f226007c)) {
                    if (i == 0) {
                        z = false;
                    }
                    checkedTextView.setChecked(z);
                } else {
                    if (i != 0) {
                        z = false;
                    }
                    checkedTextView.setChecked(z);
                }
            }
            return checkedTextView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI$b */
    public class C72652b implements DialogInterface.OnClickListener {
        public C72652b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C79148e g = C79143a.m95768g(WalletWXCreditChangeAmountUI.this);
            if (g != null) {
                WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = WalletWXCreditChangeAmountUI.this;
                g.mo91259f(walletWXCreditChangeAmountUI, walletWXCreditChangeAmountUI.getInput());
                return;
            }
            WalletWXCreditChangeAmountUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI$c */
    public class C72653c implements View.OnClickListener {
        public C72653c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = WalletWXCreditChangeAmountUI.this;
            walletWXCreditChangeAmountUI.f211380i = true;
            WalletWXCreditChangeAmountUI.m84982H7(walletWXCreditChangeAmountUI);
            WalletWXCreditChangeAmountUI.this.showDialog(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI$d */
    public class C72654d implements View.OnClickListener {
        public C72654d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = WalletWXCreditChangeAmountUI.this;
            walletWXCreditChangeAmountUI.f211380i = false;
            WalletWXCreditChangeAmountUI.m84982H7(walletWXCreditChangeAmountUI);
            WalletWXCreditChangeAmountUI.this.showDialog(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI$e */
    public class C72655e implements MenuItem.OnMenuItemClickListener {
        public C72655e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletWXCreditChangeAmountUI.this.hideVKB();
            WalletWXCreditChangeAmountUI.this.showDialog(3);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI$f */
    public class C72656f implements View.OnClickListener {
        public C72656f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = WalletWXCreditChangeAmountUI.this;
            if ((walletWXCreditChangeAmountUI.f211377f == null || walletWXCreditChangeAmountUI.f211378g == null || (walletWXCreditChangeAmountUI.f211388t.getVisibility() == 0 && Util.isNullOrNil(walletWXCreditChangeAmountUI.f211388t.getText().toString())) || ((walletWXCreditChangeAmountUI.f211389u.getVisibility() == 0 && Util.isNullOrNil(walletWXCreditChangeAmountUI.f211389u.getText().toString())) || ((walletWXCreditChangeAmountUI.f211386r.getVisibility() == 0 && Util.isNullOrNil(walletWXCreditChangeAmountUI.f211386r.getText().toString())) || ((walletWXCreditChangeAmountUI.f211390v.getVisibility() == 0 && Util.isNullOrNil(walletWXCreditChangeAmountUI.f211390v.getText().toString())) || ((walletWXCreditChangeAmountUI.f211391w.getVisibility() == 0 && Util.isNullOrNil(walletWXCreditChangeAmountUI.f211391w.getText().toString())) || (walletWXCreditChangeAmountUI.f211387s.getVisibility() == 0 && Util.isNullOrNil(walletWXCreditChangeAmountUI.f211387s.getText().toString()))))))) ? false : true) {
                WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI2 = WalletWXCreditChangeAmountUI.this;
                C77509l lVar = walletWXCreditChangeAmountUI2.f211377f;
                if (lVar.f226012h == null) {
                    lVar.f226007c = walletWXCreditChangeAmountUI2.f211388t.getText().toString();
                } else if (walletWXCreditChangeAmountUI2.f211389u.getVisibility() == 0) {
                    WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI3 = WalletWXCreditChangeAmountUI.this;
                    walletWXCreditChangeAmountUI3.f211377f.f226012h.f226007c = walletWXCreditChangeAmountUI3.f211389u.getText().toString();
                }
                WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI4 = WalletWXCreditChangeAmountUI.this;
                C77509l lVar2 = walletWXCreditChangeAmountUI4.f211378g;
                if (lVar2.f226012h == null) {
                    lVar2.f226007c = walletWXCreditChangeAmountUI4.f211390v.getText().toString();
                } else if (walletWXCreditChangeAmountUI4.f211391w.getVisibility() == 0) {
                    WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI5 = WalletWXCreditChangeAmountUI.this;
                    walletWXCreditChangeAmountUI5.f211378g.f226012h.f226007c = walletWXCreditChangeAmountUI5.f211391w.getText().toString();
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(WalletWXCreditChangeAmountUI.this.f211377f);
                arrayList2.add(WalletWXCreditChangeAmountUI.this.f211378g);
                WalletWXCreditChangeAmountUI.this.doSceneForceProgress(new C77501c(arrayList2, WalletWXCreditChangeAmountUI.this.getInput().getString("kreq_token"), WalletWXCreditChangeAmountUI.this.getInput().getString("key_bank_type")));
            } else {
                C76912y0.makeText((Context) WalletWXCreditChangeAmountUI.this.getContext(), (int) C0966R.string.lcj, 0).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI$g */
    public class C72657g extends BaseAdapter {
        public C72657g() {
        }

        public int getCount() {
            List<C77509l> list = WalletWXCreditChangeAmountUI.this.f211376e;
            if (list != null) {
                return ((ArrayList) list).size();
            }
            return 0;
        }

        public Object getItem(int i) {
            return (C77509l) ((ArrayList) WalletWXCreditChangeAmountUI.this.f211376e).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            CheckedTextView checkedTextView = (CheckedTextView) View.inflate(WalletWXCreditChangeAmountUI.this, C0966R.C0971layout.cf5, (ViewGroup) null);
            C77509l lVar = (C77509l) ((ArrayList) WalletWXCreditChangeAmountUI.this.f211376e).get(i);
            checkedTextView.setText(lVar.f226009e);
            checkedTextView.setChecked(lVar.f226005a != 0);
            return checkedTextView;
        }
    }

    /* renamed from: H7 */
    public static void m84982H7(WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        ((ArrayList) walletWXCreditChangeAmountUI.f211376e).clear();
        if (walletWXCreditChangeAmountUI.f211380i) {
            Iterator it = ((ArrayList) walletWXCreditChangeAmountUI.f211375d).iterator();
            while (it.hasNext()) {
                C77509l lVar = (C77509l) it.next();
                if (lVar.f226005a != 2) {
                    ((ArrayList) walletWXCreditChangeAmountUI.f211376e).add(lVar);
                }
            }
            return;
        }
        Iterator it4 = ((ArrayList) walletWXCreditChangeAmountUI.f211375d).iterator();
        while (it4.hasNext()) {
            C77509l lVar2 = (C77509l) it4.next();
            if (lVar2.f226005a != 1) {
                ((ArrayList) walletWXCreditChangeAmountUI.f211376e).add(lVar2);
            }
        }
    }

    /* renamed from: I7 */
    public final void mo100094I7() {
        C77509l lVar = this.f211377f;
        if (lVar != null) {
            this.f211382n.setText(lVar.f226009e);
            if (this.f211377f.f226012h != null) {
                this.f211386r.setVisibility(0);
                this.f211388t.setVisibility(8);
                this.f211384p.setText(this.f211377f.f226012h.f226009e);
                this.f211389u.setHint(this.f211377f.f226012h.f226010f);
                if ("Y".equals(this.f211377f.f226007c)) {
                    this.f211384p.setVisibility(0);
                    this.f211389u.setVisibility(0);
                    this.f211386r.setText(C0966R.string.a4h);
                } else {
                    this.f211384p.setVisibility(8);
                    this.f211389u.setVisibility(8);
                    if ("N".equals(this.f211377f.f226007c)) {
                        this.f211386r.setText(C0966R.string.f360090a14);
                    }
                }
            } else {
                this.f211386r.setVisibility(8);
                this.f211388t.setVisibility(0);
                this.f211388t.setHint(this.f211377f.f226010f);
                this.f211384p.setVisibility(8);
                this.f211389u.setVisibility(8);
            }
        }
        C77509l lVar2 = this.f211378g;
        if (lVar2 != null) {
            this.f211383o.setText(lVar2.f226009e);
            if (this.f211378g.f226012h != null) {
                this.f211387s.setVisibility(0);
                this.f211390v.setVisibility(8);
                this.f211385q.setText(this.f211378g.f226012h.f226009e);
                this.f211391w.setHint(this.f211378g.f226012h.f226010f);
                if ("Y".equals(this.f211378g.f226007c)) {
                    this.f211385q.setVisibility(0);
                    this.f211391w.setVisibility(0);
                    this.f211387s.setText(C0966R.string.a4h);
                    return;
                }
                this.f211385q.setVisibility(8);
                this.f211391w.setVisibility(8);
                if ("N".equals(this.f211378g.f226007c)) {
                    this.f211387s.setText(C0966R.string.f360090a14);
                    return;
                }
                return;
            }
            this.f211387s.setVisibility(8);
            this.f211390v.setVisibility(0);
            this.f211390v.setHint(this.f211378g.f226010f);
            this.f211385q.setVisibility(8);
            this.f211391w.setVisibility(8);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgu;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.lcn);
        this.f211382n = (TextView) findViewById(C0966R.C0970id.lk7);
        this.f211384p = (TextView) findViewById(C0966R.C0970id.lk8);
        this.f211383o = (TextView) findViewById(C0966R.C0970id.lk9);
        this.f211385q = (TextView) findViewById(C0966R.C0970id.lk_);
        this.f211388t = (EditText) findViewById(C0966R.C0970id.ljx);
        this.f211389u = (EditText) findViewById(C0966R.C0970id.ljy);
        this.f211390v = (EditText) findViewById(C0966R.C0970id.ljz);
        this.f211391w = (EditText) findViewById(C0966R.C0970id.f359563lk0);
        this.f211386r = (TextView) findViewById(C0966R.C0970id.f359564lk1);
        this.f211387s = (TextView) findViewById(C0966R.C0970id.f359565lk2);
        this.f211386r.setOnClickListener(this);
        this.f211387s.setOnClickListener(this);
        this.f211382n.setOnClickListener(new C72653c());
        this.f211383o.setOnClickListener(new C72654d());
        setBackBtn(new C72655e());
        findViewById(C0966R.C0970id.hfe).setOnClickListener(new C72656f());
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.f359564lk1) {
            this.f211381j = true;
            showDialog(2);
        } else if (view.getId() == C0966R.C0970id.f359565lk2) {
            this.f211381j = false;
            showDialog(2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        mo100094I7();
    }

    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            View inflate = getLayoutInflater().inflate(C0966R.C0971layout.cf4, (ViewGroup) null);
            ListViewInScrollView listViewInScrollView = (ListViewInScrollView) inflate.findViewById(C0966R.C0970id.f5610jr);
            listViewInScrollView.setAdapter(this.f211392x);
            listViewInScrollView.setOnItemClickListener(new C77638a(this));
            C77389a aVar = new C77389a();
            aVar.f225644a = C0086a.m38a(this).getString(C0966R.string.lcl);
            aVar.f225627J = inflate;
            aVar.f225622E = null;
            C77398g gVar = new C77398g(this, C0966R.style.a66);
            gVar.mo107525e(aVar);
            return gVar;
        } else if (i == 2) {
            View inflate2 = getLayoutInflater().inflate(C0966R.C0971layout.cf4, (ViewGroup) null);
            ListViewInScrollView listViewInScrollView2 = (ListViewInScrollView) inflate2.findViewById(C0966R.C0970id.f5610jr);
            listViewInScrollView2.setAdapter(this.f211393y);
            listViewInScrollView2.setOnItemClickListener(new C77639b(this));
            C77389a aVar2 = new C77389a();
            aVar2.f225644a = C0086a.m38a(this).getString(C0966R.string.lch);
            aVar2.f225627J = inflate2;
            aVar2.f225622E = null;
            C77398g gVar2 = new C77398g(this, C0966R.style.a66);
            gVar2.mo107525e(aVar2);
            return gVar2;
        } else if (i != 3) {
            return C76879j.m92712F(this, "", "", true);
        } else {
            String string = getString(C0966R.string.lck);
            int i2 = this.f211379h;
            if (i2 > 0) {
                string = getString(C0966R.string.lci, new Object[]{Integer.valueOf(i2)});
            }
            return C76879j.m92750u(this, string, (String) null, new C77640c(this), new C77641d(this));
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C77503e) {
                C77503e eVar = (C77503e) yVar;
                List<C77509l> list = eVar.f225986d;
                this.f211375d = list;
                this.f211379h = eVar.f225988f;
                if (list != null && list.size() >= 2) {
                    this.f211377f = this.f211375d.get(0);
                    C77509l lVar = this.f211375d.get(1);
                    this.f211378g = lVar;
                    this.f211377f.f226005a = 1;
                    lVar.f226005a = 2;
                }
                mo100094I7();
                return true;
            }
        } else if (yVar instanceof C77501c) {
            C76879j.m92713G(this, str, (String) null, false, new C72652b());
            return true;
        }
        return false;
    }
}
