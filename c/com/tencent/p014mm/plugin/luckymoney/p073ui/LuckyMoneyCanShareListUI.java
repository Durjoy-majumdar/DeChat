package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMLoadMoreListView;
import com.tencent.p014mm.plugin.luckymoney.model.C69195b1;
import com.tencent.p014mm.plugin.luckymoney.model.C69197c1;
import com.tencent.p014mm.plugin.luckymoney.model.C69278z1;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI */
public class LuckyMoneyCanShareListUI extends LuckyMoneyBaseUI {

    /* renamed from: g */
    public MMLoadMoreListView f199782g;

    /* renamed from: h */
    public C69656o1 f199783h;

    /* renamed from: i */
    public int f199784i = 0;

    /* renamed from: j */
    public List<C69197c1> f199785j = new LinkedList();

    /* renamed from: n */
    public boolean f199786n = true;

    /* renamed from: o */
    public boolean f199787o = false;

    /* renamed from: p */
    public String f199788p = "";

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI$a */
    public class C69360a implements MenuItem.OnMenuItemClickListener {
        public C69360a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LuckyMoneyCanShareListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI$b */
    public class C69361b implements AdapterView.OnItemClickListener {
        public C69361b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyCanShareListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C69197c1 a = LuckyMoneyCanShareListUI.this.f199783h.getItem((int) j);
            if (a != null && !Util.isNullOrNil(a.f199103t)) {
                Intent intent = new Intent();
                intent.setClass(LuckyMoneyCanShareListUI.this.getContext(), LuckyMoneyBeforeDetailUI.class);
                intent.putExtra("key_sendid", a.f199103t);
                LuckyMoneyCanShareListUI luckyMoneyCanShareListUI = LuckyMoneyCanShareListUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                LuckyMoneyCanShareListUI luckyMoneyCanShareListUI2 = luckyMoneyCanShareListUI;
                C117292a.m165358d(luckyMoneyCanShareListUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyCanShareListUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                luckyMoneyCanShareListUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(luckyMoneyCanShareListUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyCanShareListUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyCanShareListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI$c */
    public class C69362c implements MMLoadMoreListView.C73175b {
        public C69362c() {
        }

        public void onLoadMore() {
            LuckyMoneyCanShareListUI luckyMoneyCanShareListUI = LuckyMoneyCanShareListUI.this;
            if (luckyMoneyCanShareListUI.f199786n && !luckyMoneyCanShareListUI.f199787o) {
                luckyMoneyCanShareListUI.mo95551J7();
            }
        }
    }

    /* renamed from: J7 */
    public final void mo95551J7() {
        this.f199787o = true;
        int i = this.f199784i;
        if (i == 0) {
            this.f199788p = "";
        }
        doSceneProgress(new C69278z1(10, i, 3, "", "v1.0", this.f199788p));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_1;
    }

    public void initView() {
        setBackBtn(new C69360a());
        this.f199782g = (MMLoadMoreListView) findViewById(C0966R.C0970id.gge);
        setMMTitle(getString(C0966R.string.ggx));
        C69667q1 q1Var = new C69667q1(getContext());
        this.f199783h = q1Var;
        this.f199782g.setAdapter(q1Var);
        this.f199782g.setOnItemClickListener(new C69361b());
        this.f199782g.setOnLoadMoreListener(new C69362c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        mo95551J7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C69278z1) || i != 0 || i2 != 0) {
            return false;
        }
        C69278z1 z1Var = (C69278z1) yVar;
        LinkedList<C69197c1> linkedList = z1Var.f199397h.f199089j;
        this.f199788p = z1Var.f199400n;
        if (linkedList != null) {
            for (int i3 = 0; i3 < linkedList.size(); i3++) {
                ((LinkedList) this.f199785j).add(linkedList.get(i3));
            }
            this.f199784i += linkedList.size();
            C69195b1 b1Var = z1Var.f199397h;
            this.f199786n = b1Var == null || b1Var.f199088i == 1;
            this.f199787o = false;
            C69656o1 o1Var = this.f199783h;
            List<C69197c1> list = this.f199785j;
            if (list == null) {
                o1Var.getClass();
                o1Var.f201040d = new LinkedList();
            } else {
                o1Var.f201040d = list;
            }
            o1Var.notifyDataSetChanged();
        }
        if (this.f199786n) {
            this.f199782g.mo101731g();
        } else {
            this.f199782g.mo101727b();
        }
        return true;
    }
}
