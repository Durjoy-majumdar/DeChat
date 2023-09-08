package com.tencent.p014mm.plugin.luckymoney.p073ui;

import al3.C0086a;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.ListViewInScrollView;
import com.tencent.p014mm.p136ui.base.MMLoadMoreListView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.luckymoney.model.C69159a2;
import com.tencent.p014mm.plugin.luckymoney.model.C69195b1;
import com.tencent.p014mm.plugin.luckymoney.model.C69197c1;
import com.tencent.p014mm.plugin.luckymoney.model.C69203d1;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69278z1;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKBeforeDetailUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C117747y;
import p196ln.C76705f;
import p910lj.C76701a;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI */
public class LuckyMoneyMyRecordUI extends LuckyMoneyBaseUI {

    /* renamed from: G */
    public static final /* synthetic */ int f200023G = 0;

    /* renamed from: A */
    public boolean f200024A = false;

    /* renamed from: B */
    public String f200025B;

    /* renamed from: C */
    public int f200026C = -1;

    /* renamed from: D */
    public List<String> f200027D = new ArrayList();

    /* renamed from: E */
    public String f200028E = "";

    /* renamed from: F */
    public String f200029F = "";

    /* renamed from: g */
    public int f200030g;

    /* renamed from: h */
    public MMLoadMoreListView f200031h;

    /* renamed from: i */
    public ImageView f200032i;

    /* renamed from: j */
    public TextView f200033j;

    /* renamed from: n */
    public TextView f200034n;

    /* renamed from: o */
    public TextView f200035o;

    /* renamed from: p */
    public TextView f200036p;

    /* renamed from: q */
    public TextView f200037q;

    /* renamed from: r */
    public TextView f200038r;

    /* renamed from: s */
    public TextView f200039s;

    /* renamed from: t */
    public TextView f200040t;

    /* renamed from: u */
    public View f200041u;

    /* renamed from: v */
    public C69656o1 f200042v;

    /* renamed from: w */
    public int f200043w = 0;

    /* renamed from: x */
    public List<C69197c1> f200044x = new LinkedList();

    /* renamed from: y */
    public Map<String, Integer> f200045y = new HashMap();

    /* renamed from: z */
    public boolean f200046z = true;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$a */
    public class C69413a implements MenuItem.OnMenuItemClickListener {
        public C69413a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LuckyMoneyMyRecordUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$b */
    public class C69414b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$b$a */
        public class C69415a implements C11182m0 {
            public C69415a(C69414b bVar) {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107125a(1, C0966R.string.ghd);
                e0Var.mo107125a(2, C0966R.string.ghf);
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$b$b */
        public class C69416b implements C11184p0 {
            public C69416b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 1) {
                    LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = LuckyMoneyMyRecordUI.this;
                    if (luckyMoneyMyRecordUI.f200030g != 2) {
                        luckyMoneyMyRecordUI.f200030g = 2;
                        List<C69197c1> list = luckyMoneyMyRecordUI.f200044x;
                        if (list != null) {
                            ((LinkedList) list).clear();
                        }
                        Map<String, Integer> map = luckyMoneyMyRecordUI.f200045y;
                        if (map != null) {
                            ((HashMap) map).clear();
                        }
                        luckyMoneyMyRecordUI.f200043w = 0;
                        LuckyMoneyMyRecordUI.this.mo95605K7();
                        LuckyMoneyMyRecordUI.this.mo95604J7();
                    }
                } else if (itemId == 2) {
                    LuckyMoneyMyRecordUI luckyMoneyMyRecordUI2 = LuckyMoneyMyRecordUI.this;
                    if (luckyMoneyMyRecordUI2.f200030g != 1) {
                        luckyMoneyMyRecordUI2.f200030g = 1;
                        List<C69197c1> list2 = luckyMoneyMyRecordUI2.f200044x;
                        if (list2 != null) {
                            ((LinkedList) list2).clear();
                        }
                        Map<String, Integer> map2 = luckyMoneyMyRecordUI2.f200045y;
                        if (map2 != null) {
                            ((HashMap) map2).clear();
                        }
                        luckyMoneyMyRecordUI2.f200043w = 0;
                        LuckyMoneyMyRecordUI.this.mo95605K7();
                        LuckyMoneyMyRecordUI.this.mo95604J7();
                    }
                }
            }
        }

        public C69414b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) LuckyMoneyMyRecordUI.this.getContext(), 1, false);
            nVar.f225771i = new C69415a(this);
            nVar.f225782p = new C69416b();
            nVar.mo107573q();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$c */
    public class C69417c implements AdapterView.OnItemClickListener {
        public C69417c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C69197c1 a;
            Class<LuckyMoneyBeforeDetailUI> cls = LuckyMoneyBeforeDetailUI.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            int i2 = (int) j;
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[5];
            LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = LuckyMoneyMyRecordUI.this;
            int i3 = LuckyMoneyMyRecordUI.f200023G;
            int i4 = 1;
            objArr[0] = Integer.valueOf(luckyMoneyMyRecordUI.f200030g == 1 ? 8 : 9);
            objArr[1] = 0;
            objArr[2] = 0;
            objArr[3] = 0;
            objArr[4] = 2;
            nVar.mo160131h(11701, objArr);
            if (i2 >= 0 && i2 < LuckyMoneyMyRecordUI.this.f200042v.getCount() && (a = LuckyMoneyMyRecordUI.this.f200042v.getItem(i2)) != null && !Util.isNullOrNil(a.f199103t)) {
                Intent intent = new Intent();
                int i5 = a.f199104u;
                if (i5 == 2) {
                    Log.m105924i("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go busi detail");
                    intent.setClass(LuckyMoneyMyRecordUI.this.getContext(), LuckyMoneyBusiDetailUI.class);
                } else if (i5 == 5) {
                    Log.m105924i("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go union detail");
                    intent.putExtra("key_hb_kind", a.f199104u);
                    intent.setClass(LuckyMoneyMyRecordUI.this.getContext(), cls);
                } else if (i5 == 6) {
                    intent.putExtra("key_hb_kind", i5);
                    intent.putExtra("key_hk_scene", 2);
                    intent.setClass(LuckyMoneyMyRecordUI.this.getContext(), LuckyMoneyHKBeforeDetailUI.class);
                } else if (i5 == 7) {
                    intent.putExtra("key_hb_kind", i5);
                    intent.setClass(LuckyMoneyMyRecordUI.this.getContext(), cls);
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go normal detail");
                    intent.setClass(LuckyMoneyMyRecordUI.this.getContext(), cls);
                }
                intent.putExtra("key_sendid", a.f199103t);
                if (LuckyMoneyMyRecordUI.this.f200030g == 1) {
                    i4 = 3;
                }
                intent.putExtra("key_jump_from", i4);
                LuckyMoneyMyRecordUI luckyMoneyMyRecordUI2 = LuckyMoneyMyRecordUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                LuckyMoneyMyRecordUI luckyMoneyMyRecordUI3 = luckyMoneyMyRecordUI2;
                C117292a.m165358d(luckyMoneyMyRecordUI3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                luckyMoneyMyRecordUI2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(luckyMoneyMyRecordUI3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$d */
    public class C69418d implements AdapterView.OnItemLongClickListener {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$d$a */
        public class C69419a implements C76879j.C11180n {

            /* renamed from: a */
            public final /* synthetic */ int f200052a;

            public C69419a(int i) {
                this.f200052a = i;
            }

            /* renamed from: j */
            public void mo782j(int i) {
                C69197c1 a;
                if (i == 0 && (a = LuckyMoneyMyRecordUI.this.f200042v.getItem(this.f200052a)) != null) {
                    LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = LuckyMoneyMyRecordUI.this;
                    int i2 = this.f200052a;
                    luckyMoneyMyRecordUI.f200026C = i2;
                    luckyMoneyMyRecordUI.getClass();
                    if (i2 < 0 || i2 > luckyMoneyMyRecordUI.f200042v.getCount()) {
                        Log.m105920e("MicroMsg.LuckyMoneyMyRecordUI", "param is illegal");
                    } else {
                        luckyMoneyMyRecordUI.doSceneProgress(new C69159a2(a.f199103t, a.f199102s, luckyMoneyMyRecordUI.f200030g, i2, "v1.0"));
                    }
                }
            }
        }

        public C69418d() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 1 && i <= LuckyMoneyMyRecordUI.this.f200042v.getCount()) {
                LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = LuckyMoneyMyRecordUI.this;
                C76879j.m92736g(luckyMoneyMyRecordUI, luckyMoneyMyRecordUI.getResources().getString(C0966R.string.f360986gh1), (String[]) null, LuckyMoneyMyRecordUI.this.getResources().getString(C0966R.string.f7944x1), new C69419a(i - 1));
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$e */
    public class C69420e implements MMLoadMoreListView.C73175b {
        public C69420e() {
        }

        public void onLoadMore() {
            C69203d1 d1Var = LuckyMoneyMyRecordUI.this.f199660d;
            if (!(!d1Var.f199127g.isEmpty() || !d1Var.f199126f.isEmpty())) {
                LuckyMoneyMyRecordUI.this.f200024A = false;
            }
            LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = LuckyMoneyMyRecordUI.this;
            if (luckyMoneyMyRecordUI.f200046z && !luckyMoneyMyRecordUI.f200024A) {
                luckyMoneyMyRecordUI.mo95604J7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$f */
    public class C69421f extends C7089c0 {
        public C69421f() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            if (!Util.isNullOrNil(LuckyMoneyMyRecordUI.this.f200029F)) {
                LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = LuckyMoneyMyRecordUI.this;
                C75228t.m90219L(luckyMoneyMyRecordUI, luckyMoneyMyRecordUI.f200029F, true);
                return;
            }
            Log.m105928w("MicroMsg.LuckyMoneyMyRecordUI", "hy: no avatar jump h5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$g */
    public class C69422g extends C7089c0 {
        public C69422g() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            LuckyMoneyMyRecordUI.this.showDialog(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$h */
    public static class C69423h extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$h$a */
        public class C69424a implements C32226l<View, String> {
            public C69424a(C69423h hVar) {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return ((TextView) view.findViewById(C0966R.C0970id.ggg)).getText() + "\n" + ((TextView) view.findViewById(C0966R.C0970id.ggf)).getText() + "\n" + ((TextView) view.findViewById(C0966R.C0970id.gg_)).getText() + "\n" + ((TextView) view.findViewById(C0966R.C0970id.gga)).getText();
            }
        }

        public C69423h(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            root(C0966R.C0971layout.b9z).view(C0966R.C0970id.gd4).type(ViewType.TextView);
            ViewSetter desc = root(C0966R.C0971layout.b9z).view(C0966R.C0970id.gg9).desc((int) C0966R.C0970id.gg7);
            ViewType viewType = ViewType.Button;
            desc.type(viewType);
            root(C0966R.C0971layout.b_0).view(C0966R.C0970id.ggd).desc((C32226l<? super View, String>) new C69424a(this)).type(viewType);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI$i */
    public class C69425i extends BaseAdapter {

        /* renamed from: d */
        public List<String> f200057d;

        /* renamed from: e */
        public int f200058e;

        public C69425i() {
        }

        public int getCount() {
            return this.f200057d.size();
        }

        public Object getItem(int i) {
            return this.f200057d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            CheckedTextView checkedTextView = (CheckedTextView) LayoutInflater.from(LuckyMoneyMyRecordUI.this.getContext()).inflate(C0966R.C0971layout.cf5, viewGroup, false);
            checkedTextView.setText(this.f200057d.get(i));
            if (i == this.f200058e) {
                checkedTextView.setChecked(true);
            } else {
                checkedTextView.setChecked(false);
            }
            return checkedTextView;
        }
    }

    /* renamed from: J7 */
    public final void mo95604J7() {
        this.f200024A = true;
        int i = this.f200043w;
        if (i == 0) {
            this.f200028E = "";
        }
        doSceneProgress(new C69278z1(11, i, this.f200030g, this.f200025B, "v1.0", this.f200028E));
    }

    /* renamed from: K7 */
    public final void mo95605K7() {
        this.f200039s.setVisibility(8);
        View findViewById = this.f200041u.findViewById(C0966R.C0970id.gg5);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f200030g == 1) {
            setMMTitle(getString(C0966R.string.ghf));
            C69242l1.m81616v(getContext(), this.f200033j, getString(C0966R.string.f361001gj1, new Object[]{C75592q0.m90783m()}));
            this.f200036p.setText(C0966R.string.gj7);
            this.f200042v = new C69667q1(getContext());
            this.f200039s.setVisibility(0);
        } else {
            setMMTitle(getString(C0966R.string.ghd));
            C69242l1.m81616v(getContext(), this.f200033j, getString(C0966R.string.gio, new Object[]{C75592q0.m90783m()}));
            this.f200036p.setText(C0966R.string.gip);
            this.f200042v = new C69647n1(getContext());
            View findViewById2 = this.f200041u.findViewById(C0966R.C0970id.gg5);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view = findViewById2;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f200031h.setAdapter(this.f200042v);
        ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f200032i, C75592q0.m90789s(), 0.0f);
        this.f200038r.setText(getString(C0966R.string.giq, new Object[]{Util.nullAsNil(this.f200025B)}));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_1;
    }

    public void initView() {
        setBackBtn(new C69413a());
        addIconOptionMenu(0, C0966R.raw.actionbar_icon_dark_more, new C69414b());
        this.f200040t = (TextView) findViewById(C0966R.C0970id.ggb);
        this.f200031h = (MMLoadMoreListView) findViewById(C0966R.C0970id.gge);
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.b9z, (ViewGroup) null);
        this.f200041u = inflate;
        this.f200031h.addHeaderView(inflate);
        this.f200032i = (ImageView) this.f200041u.findViewById(C0966R.C0970id.gfz);
        this.f200033j = (TextView) this.f200041u.findViewById(C0966R.C0970id.f358680gg2);
        this.f200034n = (TextView) this.f200041u.findViewById(C0966R.C0970id.gfy);
        this.f200035o = (TextView) this.f200041u.findViewById(C0966R.C0970id.f358681gg3);
        this.f200036p = (TextView) this.f200041u.findViewById(C0966R.C0970id.gg4);
        this.f200037q = (TextView) this.f200041u.findViewById(C0966R.C0970id.f358678gg0);
        TextView textView = (TextView) this.f200041u.findViewById(C0966R.C0970id.f358679gg1);
        this.f200038r = (TextView) this.f200041u.findViewById(C0966R.C0970id.gg7);
        this.f200039s = (TextView) this.f200041u.findViewById(C0966R.C0970id.gg6);
        this.f200031h.setOnItemClickListener(new C69417c());
        this.f200031h.setOnItemLongClickListener(new C69418d());
        this.f200031h.setOnLoadMoreListener(new C69420e());
        this.f200032i.setOnClickListener(new C69421f());
        mo95605K7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.a3b));
        setActionbarElementColor(getResources().getColor(C0966R.color.a2w));
        this.f200030g = getIntent().getIntExtra("key_type", 2);
        initView();
        mo95604J7();
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(this.f200030g == 1 ? 8 : 9);
        objArr[1] = 0;
        objArr[2] = 0;
        objArr[3] = 0;
        objArr[4] = 1;
        nVar.mo160131h(11701, objArr);
    }

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return null;
        }
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.b_g, (ViewGroup) null);
        ListViewInScrollView listViewInScrollView = (ListViewInScrollView) inflate.findViewById(C0966R.C0970id.gjp);
        C69425i iVar = new C69425i();
        List<String> list = this.f200027D;
        if (list == null) {
            iVar.f200057d = new ArrayList();
        } else {
            iVar.f200057d = list;
        }
        iVar.notifyDataSetChanged();
        iVar.f200058e = 0;
        listViewInScrollView.setAdapter(iVar);
        listViewInScrollView.setOnItemClickListener(new C69662p1(this, iVar));
        C77389a aVar = new C77389a();
        aVar.f225644a = C0086a.m38a(this).getString(C0966R.string.f361000gj0);
        aVar.f225627J = inflate;
        aVar.f225622E = null;
        C77398g gVar = new C77398g(this, C0966R.style.a66);
        gVar.mo107525e(aVar);
        return gVar;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C69278z1) {
            if (i == 0 && i2 == 0) {
                C69278z1 z1Var = (C69278z1) yVar;
                LinkedList<C69197c1> linkedList = z1Var.f199397h.f199089j;
                this.f200028E = z1Var.f199400n;
                this.f200029F = z1Var.f199401o;
                if (this.f200043w == 0) {
                    this.f200027D = z1Var.f199398i;
                    this.f200025B = z1Var.f199399j;
                    View findViewById = findViewById(C0966R.C0970id.gg9);
                    ImageView imageView = (ImageView) findViewById(C0966R.C0970id.gg8);
                    if (((ArrayList) this.f200027D).size() > 1) {
                        imageView.setVisibility(0);
                        findViewById.setOnClickListener(new C69422g());
                    }
                    this.f200038r.setText(getString(C0966R.string.giq, new Object[]{this.f200025B}));
                }
                C69195b1 b1Var = z1Var.f199397h;
                if (b1Var != null) {
                    if (this.f200030g == 1) {
                        this.f200034n.setText(C75228t.m90260n(((double) b1Var.f199086g) / 100.0d));
                        String str2 = b1Var.f199085f + "";
                        String string = getString(C0966R.string.gj6, new Object[]{str2});
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(C0966R.color.a2u));
                        int indexOf = string.indexOf(str2);
                        SpannableString spannableString = new SpannableString(string);
                        spannableString.setSpan(foregroundColorSpan, indexOf, str2.length() + indexOf, 33);
                        this.f200039s.setText(spannableString);
                    } else {
                        this.f200034n.setText(C75228t.m90260n(((double) b1Var.f199084e) / 100.0d));
                        this.f200035o.setText(b1Var.f199083d + "");
                        this.f200037q.setText(b1Var.f199087h + "");
                    }
                }
                if (linkedList != null) {
                    for (int i3 = 0; i3 < linkedList.size(); i3++) {
                        C69197c1 c1Var = linkedList.get(i3);
                        if (!((HashMap) this.f200045y).containsKey(c1Var.f199103t)) {
                            ((LinkedList) this.f200044x).add(linkedList.get(i3));
                            ((HashMap) this.f200045y).put(c1Var.f199103t, 1);
                        }
                    }
                    this.f200043w += linkedList.size();
                    C69195b1 b1Var2 = z1Var.f199397h;
                    this.f200046z = b1Var2 == null || b1Var2.f199088i == 1;
                    this.f200024A = false;
                    C69656o1 o1Var = this.f200042v;
                    List<C69197c1> list = this.f200044x;
                    if (list == null) {
                        o1Var.getClass();
                        o1Var.f201040d = new LinkedList();
                    } else {
                        o1Var.f201040d = list;
                    }
                    o1Var.notifyDataSetChanged();
                }
                List<C69197c1> list2 = this.f200044x;
                if (list2 == null || ((LinkedList) list2).size() == 0) {
                    this.f200040t.setVisibility(0);
                } else {
                    this.f200040t.setVisibility(8);
                }
                if (this.f200046z) {
                    this.f200031h.mo101731g();
                } else {
                    this.f200031h.mo101727b();
                }
                return true;
            }
            this.f200029F = null;
        } else if (yVar instanceof C69159a2) {
            int i4 = this.f200026C;
            this.f200026C = -1;
            if (i == 0 && i2 == 0) {
                C69197c1 a = this.f200042v.getItem(i4);
                if (a != null) {
                    C76701a.makeText((Context) this, (int) C0966R.string.f360987gh2, 0).show();
                    this.f200042v.f201040d.remove(a);
                    this.f200042v.notifyDataSetChanged();
                } else {
                    Log.m105920e("MicroMsg.LuckyMoneyMyRecordUI", "can't found local record");
                }
                return true;
            }
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C69423h.class);
    }
}
