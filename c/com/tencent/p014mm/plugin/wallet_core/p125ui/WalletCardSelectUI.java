package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.MaxListView;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import ob0.C117747y;
import p281yz.C79173v;
import v53.C78358z;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI */
public class WalletCardSelectUI extends WalletBaseUI {

    /* renamed from: s */
    public static final /* synthetic */ int f209990s = 0;

    /* renamed from: d */
    public List<ElementQuery> f209991d = new LinkedList();

    /* renamed from: e */
    public List<ElementQuery> f209992e = new LinkedList();

    /* renamed from: f */
    public CheckedTextView f209993f;

    /* renamed from: g */
    public CheckedTextView f209994g;

    /* renamed from: h */
    public String f209995h;

    /* renamed from: i */
    public int f209996i = 3;

    /* renamed from: j */
    public int f209997j;

    /* renamed from: n */
    public int f209998n = -1;

    /* renamed from: o */
    public int f209999o = -1;

    /* renamed from: p */
    public int f210000p = -1;

    /* renamed from: q */
    public C72255f f210001q;

    /* renamed from: r */
    public MaxListView f210002r;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI$a */
    public class C72250a implements AdapterView.OnItemClickListener {
        public C72250a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            ElementQuery elementQuery = WalletCardSelectUI.this.f210001q.f210009e.get(i);
            if (!Util.isNullOrNil(elementQuery.f209522y)) {
                C76879j.m92713G(WalletCardSelectUI.this, elementQuery.f209522y, (String) null, true, (DialogInterface.OnClickListener) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (elementQuery.mo99416b()) {
                WalletCardSelectUI.this.f209998n = i;
            } else {
                WalletCardSelectUI.this.f209999o = i;
            }
            WalletCardSelectUI.this.enableOptionMenu(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI$b */
    public class C72251b implements MenuItem.OnMenuItemClickListener {
        public C72251b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletCardSelectUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI$c */
    public class C72252c implements MenuItem.OnMenuItemClickListener {
        public C72252c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
            r0 = r2.f210005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
            r0 = r2.f210005d;
            r1 = r0.f209999o;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onMenuItemClick(android.view.MenuItem r3) {
            /*
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardSelectUI.this
                android.widget.CheckedTextView r0 = r0.f209993f
                boolean r0 = r0.isChecked()
                if (r0 == 0) goto L_0x0020
                com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardSelectUI.this
                int r1 = r0.f209998n
                if (r1 < 0) goto L_0x0020
                java.util.List<com.tencent.mm.plugin.wallet_core.model.ElementQuery> r0 = r0.f209991d
                java.util.LinkedList r0 = (java.util.LinkedList) r0
                java.lang.Object r0 = r0.get(r1)
                com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = (com.tencent.p014mm.plugin.wallet_core.model.ElementQuery) r0
                goto L_0x003c
            L_0x0020:
                com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardSelectUI.this
                android.widget.CheckedTextView r0 = r0.f209994g
                boolean r0 = r0.isChecked()
                if (r0 == 0) goto L_0x003b
                com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardSelectUI.this
                int r1 = r0.f209999o
                if (r1 < 0) goto L_0x003b
                java.util.List<com.tencent.mm.plugin.wallet_core.model.ElementQuery> r0 = r0.f209992e
                java.util.LinkedList r0 = (java.util.LinkedList) r0
                java.lang.Object r0 = r0.get(r1)
                com.tencent.mm.plugin.wallet_core.model.ElementQuery r0 = (com.tencent.p014mm.plugin.wallet_core.model.ElementQuery) r0
                goto L_0x003c
            L_0x003b:
                r0 = 0
            L_0x003c:
                if (r0 == 0) goto L_0x004a
                java.lang.String r1 = "elemt_query"
                r3.putExtra(r1, r0)
                com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardSelectUI.this
                r1 = -1
                r0.setResult(r1, r3)
                goto L_0x0050
            L_0x004a:
                com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI r3 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardSelectUI.this
                r0 = 0
                r3.setResult(r0)
            L_0x0050:
                com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI r3 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardSelectUI.this
                r3.finish()
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardSelectUI.C72252c.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI$d */
    public class C72253d implements View.OnClickListener {
        public C72253d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletCardSelectUI walletCardSelectUI = WalletCardSelectUI.this;
            int i = WalletCardSelectUI.f209990s;
            walletCardSelectUI.mo99556H7(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI$e */
    public class C72254e implements View.OnClickListener {
        public C72254e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletCardSelectUI walletCardSelectUI = WalletCardSelectUI.this;
            int i = WalletCardSelectUI.f209990s;
            walletCardSelectUI.mo99556H7(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI$f */
    public class C72255f extends BaseAdapter {

        /* renamed from: d */
        public Context f210008d;

        /* renamed from: e */
        public List<ElementQuery> f210009e = new ArrayList();

        public C72255f(WalletCardSelectUI walletCardSelectUI, Context context) {
            this.f210008d = context;
        }

        public int getCount() {
            return this.f210009e.size();
        }

        public Object getItem(int i) {
            return this.f210009e.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = View.inflate(this.f210008d, C0966R.C0971layout.cds, (ViewGroup) null);
            CheckedTextView checkedTextView = (CheckedTextView) inflate.findViewById(C0966R.C0970id.ba6);
            ElementQuery elementQuery = this.f210009e.get(i);
            String nullAs = Util.nullAs(elementQuery.f209505e, "");
            if (!Util.isNullOrNil(elementQuery.f209522y)) {
                nullAs = nullAs + "[" + elementQuery.f209522y + "]";
                checkedTextView.setEnabled(false);
            } else {
                checkedTextView.setEnabled(true);
            }
            checkedTextView.setText(nullAs);
            return inflate;
        }

        public boolean isEnabled(int i) {
            return Util.isNullOrNil(this.f210009e.get(i).f209522y);
        }
    }

    /* renamed from: H7 */
    public final void mo99556H7(boolean z) {
        this.f210002r.setVisibility(0);
        if (z) {
            this.f209993f.setChecked(true);
            this.f209994g.setChecked(false);
            C72255f fVar = this.f210001q;
            fVar.f210009e = this.f209991d;
            fVar.notifyDataSetChanged();
            this.f210002r.clearChoices();
            int i = this.f209998n;
            if (i >= 0) {
                this.f210002r.setItemChecked(i, true);
                enableOptionMenu(true);
                return;
            }
            enableOptionMenu(false);
            return;
        }
        this.f209993f.setChecked(false);
        this.f209994g.setChecked(true);
        C72255f fVar2 = this.f210001q;
        fVar2.f210009e = this.f209992e;
        fVar2.notifyDataSetChanged();
        this.f210002r.clearChoices();
        int i2 = this.f209999o;
        if (i2 >= 0) {
            this.f210002r.setItemChecked(i2, true);
            enableOptionMenu(true);
            return;
        }
        enableOptionMenu(false);
    }

    public boolean checkProcLife() {
        return false;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ce8;
    }

    public void initView() {
        this.f209995h = getInput().getString("key_bank_type");
        this.f209997j = getInput().getInt("key_bankcard_type", 1);
        this.f209996i = getInput().getInt("key_support_bankcard", 1);
        this.f210000p = getInput().getInt("key_bind_scene", -1);
        this.f210002r = (MaxListView) findViewById(C0966R.C0970id.jep);
        this.f209993f = (CheckedTextView) findViewById(C0966R.C0970id.ba7);
        this.f209994g = (CheckedTextView) findViewById(C0966R.C0970id.ba8);
        C72255f fVar = new C72255f(this, this);
        this.f210001q = fVar;
        this.f210002r.setAdapter(fVar);
        this.f210002r.setOnItemClickListener(new C72250a());
        setBackBtn(new C72251b());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C72252c(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        enableOptionMenu(false);
        this.f209993f.setOnClickListener(new C72253d());
        this.f209994g.setOnClickListener(new C72254e());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.kqd);
        initView();
        Class cls = C79173v.class;
        ((LinkedList) this.f209992e).clear();
        ((LinkedList) this.f209991d).clear();
        if (((C79173v) C86312j.m106911c(cls)).f232472d.f193007b != null) {
            for (ElementQuery next : ((C79173v) C86312j.m106911c(cls)).f232472d.f193007b) {
                if (this.f210000p == 5 && !next.f209503R) {
                    next.f209522y = getString(C0966R.string.f361618lb1);
                }
                if (2 == next.f209515r) {
                    ((LinkedList) this.f209992e).add(next);
                } else if (next.mo99416b()) {
                    ((LinkedList) this.f209991d).add(next);
                }
            }
        }
        if (this.f209996i == 3 && !this.f209992e.isEmpty()) {
            if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91338t()) {
                Collections.sort(this.f209992e, new C72469w(this));
            } else {
                Collections.sort(this.f209992e, new C72471x(this));
            }
        }
        if (this.f209991d.isEmpty()) {
            int size = ((LinkedList) this.f209992e).size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((ElementQuery) ((LinkedList) this.f209992e).get(i)).f209516s.equals(this.f209995h)) {
                    this.f209999o = i;
                    mo99556H7(false);
                    enableOptionMenu(true);
                    break;
                } else {
                    i++;
                }
            }
            if (this.f209999o < 0) {
                mo99556H7(false);
                enableOptionMenu(false);
            }
            this.f209993f.setVisibility(8);
            this.f209994g.setBackgroundResource(C0966R.C0969drawable.f4855pa);
            this.f209994g.setCheckMarkDrawable(C0966R.C0969drawable.apl);
        } else if (Util.isNullOrNil(this.f209995h)) {
            this.f209993f.setChecked(false);
            this.f209994g.setChecked(false);
            this.f210002r.setVisibility(8);
        } else if (this.f209997j == 2) {
            int size2 = ((LinkedList) this.f209992e).size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                } else if (((ElementQuery) ((LinkedList) this.f209992e).get(i2)).f209516s.equals(this.f209995h)) {
                    this.f209999o = i2;
                    mo99556H7(false);
                    enableOptionMenu(true);
                    break;
                } else {
                    i2++;
                }
            }
            if (this.f209999o < 0) {
                mo99556H7(false);
                enableOptionMenu(false);
            }
        } else {
            int size3 = ((LinkedList) this.f209991d).size();
            int i3 = 0;
            while (true) {
                if (i3 >= size3) {
                    break;
                } else if (((ElementQuery) ((LinkedList) this.f209991d).get(i3)).f209516s.equals(this.f209995h)) {
                    this.f209998n = i3;
                    mo99556H7(true);
                    enableOptionMenu(true);
                    break;
                } else {
                    i3++;
                }
            }
            if (this.f209998n < 0) {
                mo99556H7(false);
                enableOptionMenu(false);
            }
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i != 0 || i2 != 0) {
            return false;
        }
        boolean z = yVar instanceof C78358z;
        return false;
    }
}
