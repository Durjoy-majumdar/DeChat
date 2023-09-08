package com.tencent.p014mm.plugin.account.friend.p022ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import hg0.C46058m0;
import hg0.C46069x;
import hg0.C46070y;
import ig0.C46246g;
import ig0.C46248h;
import ig0.C8914i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import junit.framework.Assert;
import k20.C9556a;
import mg0.C76754b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import tc0.C77885p;
import te3.C50349m33;
import te3.C50776p33;
import te3.C50965qi2;
import te3.C51283sq1;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI */
public class RecommendFriendUI extends MMActivity implements C11385n {

    /* renamed from: p */
    public static final /* synthetic */ int f108621p = 0;

    /* renamed from: d */
    public ProgressDialog f108622d = null;

    /* renamed from: e */
    public C46246g f108623e;

    /* renamed from: f */
    public ListView f108624f;

    /* renamed from: g */
    public TextView f108625g;

    /* renamed from: h */
    public LinkedList<C50776p33> f108626h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<C51283sq1> f108627i = new LinkedList<>();

    /* renamed from: j */
    public int f108628j = -1;

    /* renamed from: n */
    public boolean f108629n;

    /* renamed from: o */
    public boolean f108630o = false;

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI$d */
    public class C1383d implements View.OnClickListener {
        public C1383d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/RecommendFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = RecommendFriendUI.this.f108624f;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/account/friend/ui/RecommendFriendUI$4", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/account/friend/ui/RecommendFriendUI$4", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/ui/RecommendFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI$a */
    public class C40412a implements AdapterView.OnItemClickListener {
        public C40412a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/RecommendFriendUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            RecommendFriendUI recommendFriendUI = RecommendFriendUI.this;
            int i2 = 0;
            if (!recommendFriendUI.f108629n) {
                C46246g gVar = recommendFriendUI.f108623e;
                if (i >= 0) {
                    boolean[] zArr = gVar.f124660h;
                    if (i < zArr.length) {
                        zArr[i] = !zArr[i];
                        gVar.notifyDataSetChanged();
                    }
                } else {
                    gVar.getClass();
                }
                if (RecommendFriendUI.this.f108623e.mo71658a().length > 0) {
                    RecommendFriendUI.this.showOptionMenu(true);
                } else {
                    RecommendFriendUI.this.showOptionMenu(false);
                }
            } else {
                C46246g gVar2 = recommendFriendUI.f108623e;
                if (gVar2.f124659g) {
                    i2 = gVar2.f124658f.get(i).f141673d;
                }
                recommendFriendUI.mo63173I7(i2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/ui/RecommendFriendUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI$b */
    public class C40413b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI$b$a */
        public class C40414a implements DialogInterface.OnClickListener {
            public C40414a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                RecommendFriendUI recommendFriendUI = RecommendFriendUI.this;
                for (int i2 = 0; i2 < recommendFriendUI.f108623e.mo71658a().length; i2++) {
                    C50965qi2 qi22 = new C50965qi2();
                    qi22.f140331h = Util.nullAsNil(recommendFriendUI.f108623e.mo71658a()[i2]);
                    qi22.f140332i = recommendFriendUI.f108628j;
                    ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(22, qi22));
                    C46069x xVar = new C46069x();
                    xVar.f124212a = recommendFriendUI.f108623e.mo71658a()[i2];
                    xVar.f124213b = recommendFriendUI.f108628j;
                    xVar.f124214c = (int) Util.nowSecond();
                    ((C46070y) ((C76754b) C86312j.m106911c(C76754b.class)).mo105750tV()).mo71489jo(xVar);
                }
                C76879j.m92742m(recommendFriendUI.getContext(), C0966R.string.fs9, C0966R.string.a3h, new C8914i(recommendFriendUI));
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI$b$b */
        public class C40415b implements DialogInterface.OnClickListener {
            public C40415b(C40413b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C40413b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            int length = RecommendFriendUI.this.f108623e.mo71658a().length;
            C76879j.m92750u(RecommendFriendUI.this.getContext(), RecommendFriendUI.this.getContext().getResources().getQuantityString(C0966R.plurals.f7237s, length, new Object[]{Integer.valueOf(length)}), RecommendFriendUI.this.getString(C0966R.string.a3h), new C40414a(), new C40415b(this));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI$c */
    public class C40416c implements MenuItem.OnMenuItemClickListener {
        public C40416c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RecommendFriendUI recommendFriendUI = RecommendFriendUI.this;
            int i = RecommendFriendUI.f108621p;
            if (recommendFriendUI.f108628j != 0) {
                recommendFriendUI.finish();
                return true;
            } else if (recommendFriendUI.f108629n || recommendFriendUI.f108630o) {
                recommendFriendUI.finish();
                return true;
            } else {
                recommendFriendUI.mo63172H7();
                return true;
            }
        }
    }

    /* renamed from: H7 */
    public final void mo63172H7() {
        Assert.assertTrue("dealGetInviteFriendGroupSuccess just only qq", this.f108628j == 0);
        Log.m105924i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendGroupSuccess  respList.size:" + this.f108627i.size());
        this.f108623e.mo71659b(this.f108627i);
        this.f108624f.setAdapter(this.f108623e);
        showOptionMenu(false);
        this.f108629n = true;
        setMMTitle((int) C0966R.string.isw);
        this.f108623e.mo71660d(this.f108629n);
        this.f108623e.notifyDataSetChanged();
    }

    /* renamed from: I7 */
    public final void mo63173I7(int i) {
        Log.m105924i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendSuccess  respList.size:" + this.f108626h.size());
        C46246g gVar = this.f108623e;
        LinkedList<C50776p33> linkedList = this.f108626h;
        if (i < 0) {
            gVar.f124657e = linkedList;
        } else {
            gVar.getClass();
            gVar.f124657e = new LinkedList<>();
            for (int i2 = 0; i2 < linkedList.size(); i2++) {
                if (i == linkedList.get(i2).f139554j) {
                    gVar.f124657e.add(linkedList.get(i2));
                }
            }
        }
        gVar.f124660h = new boolean[gVar.f124657e.size()];
        this.f108624f.setAdapter(this.f108623e);
        this.f108629n = false;
        if (this.f108628j == 0) {
            String str = "";
            for (int i3 = 0; i3 < this.f108627i.size(); i3++) {
                if (i == this.f108627i.get(i3).f141673d) {
                    str = this.f108627i.get(i3).f141674e;
                }
            }
            setMMTitle(str);
        }
        C46246g gVar2 = this.f108623e;
        gVar2.f124659g = this.f108629n;
        gVar2.notifyDataSetChanged();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b1v;
    }

    public void initView() {
        this.f108625g = (TextView) findViewById(C0966R.C0970id.cja);
        int i = this.f108628j;
        if (i == 1) {
            setMMTitle((int) C0966R.string.ixg);
            this.f108625g.setText(C0966R.string.ixk);
        } else if (i == 2) {
            setMMTitle((int) C0966R.string.ixf);
            this.f108625g.setText(C0966R.string.ixj);
        } else {
            setMMTitle((int) C0966R.string.isw);
            this.f108625g.setText(C0966R.string.ixl);
        }
        this.f108623e = new C46246g(getLayoutInflater());
        ListView listView = (ListView) findViewById(C0966R.C0970id.f9h);
        this.f108624f = listView;
        listView.setOnItemClickListener(new C40412a());
        this.f108624f.setAdapter(this.f108623e);
        addTextOptionMenu(0, getString(C0966R.string.fs8), new C40413b());
        showOptionMenu(false);
        this.f108630o = true;
        C46058m0 m0Var = new C46058m0(this.f108628j);
        C86709a0.m107524d().mo123460f(m0Var);
        this.f108622d = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.fsa), true, true, new C46248h(this, m0Var));
        setBackBtn(new C40416c());
        setToTop(new C1383d());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f108628j = Util.getInt(getIntent().getStringExtra("recommend_type"), 0);
        this.f108629n = false;
        C86709a0.m107524d().mo123455a(135, this);
        initView();
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(135, this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f108628j != 0) {
            finish();
            return true;
        } else if (this.f108629n || this.f108630o) {
            finish();
            return true;
        } else {
            mo63172H7();
            return true;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.RecommendFriendUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        ProgressDialog progressDialog = this.f108622d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f108622d = null;
        }
        if (i == 0 && i2 == 0 && yVar.getType() == 135) {
            C50349m33 m332 = (C50349m33) ((C46058m0) yVar).f124182d.f127056b.f127083a;
            LinkedList<C50776p33> linkedList = m332.f137819e;
            this.f108626h = linkedList;
            this.f108627i = m332.f137821g;
            this.f108630o = false;
            if (linkedList.size() <= 0) {
                this.f108625g.setVisibility(0);
                this.f108624f.setVisibility(8);
            } else if (this.f108628j == 0 && this.f108627i.size() <= 0) {
                this.f108625g.setVisibility(0);
                this.f108624f.setVisibility(8);
            } else if (this.f108628j != 0) {
                mo63173I7(-1);
            } else {
                mo63172H7();
            }
        } else {
            this.f108625g.setVisibility(0);
            this.f108624f.setVisibility(8);
        }
    }
}
