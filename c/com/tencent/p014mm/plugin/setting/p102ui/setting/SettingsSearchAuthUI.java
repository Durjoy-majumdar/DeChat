package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75375u;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import sj0.C90211g;
import te3.C51031qy3;
import te3.io4;
import vo3.C90852c;
import xm2.C15862w;
import xm2.C53380i;
import xm2.C53387r;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI */
public class SettingsSearchAuthUI extends MMActivity implements C11385n {

    /* renamed from: z */
    public static final /* synthetic */ int f116336z = 0;

    /* renamed from: d */
    public FTSSearchView f116337d;

    /* renamed from: e */
    public View f116338e;

    /* renamed from: f */
    public View f116339f;

    /* renamed from: g */
    public TextView f116340g;

    /* renamed from: h */
    public TextView f116341h;

    /* renamed from: i */
    public ProgressBar f116342i;

    /* renamed from: j */
    public List<io4> f116343j = new ArrayList();

    /* renamed from: n */
    public C42975g f116344n;

    /* renamed from: o */
    public ListView f116345o;

    /* renamed from: p */
    public String f116346p;

    /* renamed from: q */
    public Integer f116347q = null;

    /* renamed from: r */
    public boolean f116348r = false;

    /* renamed from: s */
    public byte[] f116349s;

    /* renamed from: t */
    public View f116350t = null;

    /* renamed from: u */
    public int f116351u = -1;

    /* renamed from: v */
    public View f116352v = null;

    /* renamed from: w */
    public View f116353w = null;

    /* renamed from: x */
    public View f116354x = null;

    /* renamed from: y */
    public boolean f116355y = false;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI$a */
    public class C42969a implements FTSSearchView.C6995e {
        public C42969a() {
        }

        public void onClickBackBtn(View view) {
            Log.m105924i("MicroMsg.SettingsSearchAuthUI", "click search back");
            SettingsSearchAuthUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI$b */
    public class C42970b implements FTSEditTextView.C45051l {
        public C42970b() {
        }

        /* renamed from: D */
        public void mo3000D(boolean z) {
            Log.m105925i("MicroMsg.SettingsSearchAuthUI", "searchView hasFocus %s", Boolean.valueOf(z));
            if (z) {
                SettingsSearchAuthUI.this.showVKB();
            } else {
                SettingsSearchAuthUI.this.hideVKB();
            }
        }

        /* renamed from: b3 */
        public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
            Log.m105925i("MicroMsg.SettingsSearchAuthUI", "onEditTextChange search totalText %s", str);
            SettingsSearchAuthUI settingsSearchAuthUI = SettingsSearchAuthUI.this;
            int i = SettingsSearchAuthUI.f116336z;
            settingsSearchAuthUI.mo67173K7();
            if (!Util.isNullOrNil(str)) {
                SettingsSearchAuthUI settingsSearchAuthUI2 = SettingsSearchAuthUI.this;
                View view = settingsSearchAuthUI2.f116338e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchBgView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchBgView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                settingsSearchAuthUI2.f116340g.setVisibility(0);
                settingsSearchAuthUI2.f116342i.setVisibility(8);
                settingsSearchAuthUI2.f116341h.setVisibility(8);
                settingsSearchAuthUI2.f116345o.setVisibility(8);
                ((ArrayList) settingsSearchAuthUI2.f116343j).clear();
                settingsSearchAuthUI2.removeAllOptionMenu();
                String string = SettingsSearchAuthUI.this.getString(C0966R.string.a2p);
                C75375u uVar = new C75375u(string + " " + str.trim());
                uVar.mo105705b(new ForegroundColorSpan(SettingsSearchAuthUI.this.getResources().getColor(C0966R.color.f3154h3)), string.length(), uVar.length(), 33);
                SettingsSearchAuthUI.this.f116340g.setText(uVar);
                return;
            }
            SettingsSearchAuthUI.m46627J7(SettingsSearchAuthUI.this);
        }

        /* renamed from: m7 */
        public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
        }

        public void onClickClearTextBtn(View view) {
            Log.m105924i("MicroMsg.SettingsSearchAuthUI", "clear search text");
            SettingsSearchAuthUI settingsSearchAuthUI = SettingsSearchAuthUI.this;
            int i = SettingsSearchAuthUI.f116336z;
            settingsSearchAuthUI.mo67173K7();
            SettingsSearchAuthUI.m46627J7(SettingsSearchAuthUI.this);
        }

        /* renamed from: y */
        public boolean mo3009y() {
            Editable text = SettingsSearchAuthUI.this.f116337d.getFtsEditText().getEditText().getText();
            Log.m105925i("MicroMsg.SettingsSearchAuthUI", "search key down text: %s", text.toString());
            SettingsSearchAuthUI.this.f116340g.setVisibility(8);
            SettingsSearchAuthUI.this.f116337d.getFtsEditText().getEditText().clearFocus();
            SettingsSearchAuthUI.this.hideVKB();
            SettingsSearchAuthUI.this.removeAllOptionMenu();
            if (!Util.isNullOrNil((CharSequence) text)) {
                SettingsSearchAuthUI.m46625H7(SettingsSearchAuthUI.this, text.toString().trim());
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI$c */
    public class C42971c implements View.OnClickListener {
        public C42971c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Editable text = SettingsSearchAuthUI.this.f116337d.getFtsEditText().getEditText().getText();
            SettingsSearchAuthUI.this.f116337d.getFtsEditText().getEditText().clearFocus();
            SettingsSearchAuthUI.this.hideVKB();
            if (!Util.isNullOrNil((CharSequence) text)) {
                SettingsSearchAuthUI.m46625H7(SettingsSearchAuthUI.this, text.toString().trim());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI$d */
    public class C42972d implements AdapterView.OnItemClickListener {
        public C42972d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            try {
                io4 a = SettingsSearchAuthUI.this.f116344n.getItem(i);
                if (a != null) {
                    SettingsSearchAuthUI.this.f116351u = i;
                    Intent intent = new Intent(SettingsSearchAuthUI.this, SettingsDelAuthUI.class);
                    intent.putExtra("key_user_auth_app", a.toByteArray());
                    SettingsSearchAuthUI.this.startActivityForResult(intent, 1000);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SettingsSearchAuthUI", e, "", new Object[0]);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI$e */
    public class C42973e implements AbsListView.OnScrollListener {
        public C42973e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (i + i2 == i3) {
                Log.m105925i("MicroMsg.SettingsSearchAuthUI", "scroll to the end nexPageData: %s", SettingsSearchAuthUI.this.f116349s);
                SettingsSearchAuthUI settingsSearchAuthUI = SettingsSearchAuthUI.this;
                if (settingsSearchAuthUI.f116349s != null && settingsSearchAuthUI.f116353w.getVisibility() == 0) {
                    SettingsSearchAuthUI settingsSearchAuthUI2 = SettingsSearchAuthUI.this;
                    SettingsSearchAuthUI.m46626I7(settingsSearchAuthUI2, settingsSearchAuthUI2.f116346p, settingsSearchAuthUI2.f116349s);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI$f */
    public class C42974f implements ViewTreeObserver.OnGlobalLayoutListener {
        public C42974f() {
        }

        public void onGlobalLayout() {
            SettingsSearchAuthUI.this.f116339f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int A = C76577a.m92145A(SettingsSearchAuthUI.this);
            int j = C76577a.m92159j(SettingsSearchAuthUI.this);
            int min = Math.min(Math.max(SettingsSearchAuthUI.this.f116339f.getMeasuredHeight(), 0), j);
            Log.m105919d("MicroMsg.SettingsSearchAuthUI", "onGlobalLayout width: %s, height: %s, root_container: %s, rootViewHeight: %s", Integer.valueOf(A), Integer.valueOf(j), Integer.valueOf(SettingsSearchAuthUI.this.f116339f.getMeasuredHeight()), Integer.valueOf(min));
            TextView textView = SettingsSearchAuthUI.this.f116341h;
            if (textView != null) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (((float) min) * 0.3f);
                    SettingsSearchAuthUI.this.f116341h.setLayoutParams(layoutParams);
                }
            }
            ProgressBar progressBar = SettingsSearchAuthUI.this.f116342i;
            if (progressBar != null) {
                ViewGroup.LayoutParams layoutParams2 = progressBar.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) (((float) min) * 0.3f);
                    SettingsSearchAuthUI.this.f116342i.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI$g */
    public class C42975g extends BaseAdapter {

        /* renamed from: d */
        public List<io4> f116362d;

        /* renamed from: e */
        public int f116363e = 0;

        /* renamed from: f */
        public int f116364f = 0;

        /* renamed from: g */
        public int f116365g = 0;

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI$g$a */
        public class C42976a {

            /* renamed from: a */
            public RelativeLayout f116367a;

            /* renamed from: b */
            public MMNeat7extView f116368b;

            /* renamed from: c */
            public TextView f116369c;

            public C42976a(C42975g gVar, C42983e3 e3Var) {
            }
        }

        public C42975g() {
            int A = C76577a.m92145A(SettingsSearchAuthUI.this.getContext());
            Resources resources = SettingsSearchAuthUI.this.getContext().getResources();
            int dimensionPixelSize = (A - (resources.getDimensionPixelSize(C0966R.dimen.f3736cp) * 2)) - resources.getDimensionPixelSize(C0966R.dimen.f3703bv);
            this.f116363e = dimensionPixelSize;
            int i = dimensionPixelSize / 2;
            this.f116364f = i;
            this.f116365g = dimensionPixelSize / 2;
            Log.m105925i("MicroMsg.SettingsSearchAuthUI", "computeViewWidth appName: %s, appType: %s, content: %s", Integer.valueOf(i), Integer.valueOf(this.f116365g), Integer.valueOf(this.f116363e));
        }

        /* renamed from: a */
        public io4 getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f116362d.get(i);
        }

        public int getCount() {
            List<io4> list = this.f116362d;
            if (list == null || list.isEmpty()) {
                return 0;
            }
            return this.f116362d.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C42976a aVar;
            if (view == null) {
                view = SettingsSearchAuthUI.this.getLayoutInflater().inflate(C0966R.C0971layout.b59, (ViewGroup) null);
                aVar = new C42976a(this, (C42983e3) null);
                view.setTag(aVar);
            } else {
                aVar = (C42976a) view.getTag();
            }
            aVar.f116368b = (MMNeat7extView) view.findViewById(C0966R.C0970id.je4);
            aVar.f116369c = (TextView) view.findViewById(C0966R.C0970id.je7);
            aVar.f116367a = (RelativeLayout) view.findViewById(C0966R.C0970id.f359174je3);
            io4 a = getItem(i);
            if (a != null) {
                aVar.f116368b.mo104279b(a.f135549e);
                aVar.f116369c.setText(a.f135553i);
                aVar.f116367a.setContentDescription(String.format("%s,%s", new Object[]{Util.nullAs(a.f135549e, ""), Util.nullAs(a.f135553i, "")}));
            }
            C15862w.m14786a(aVar.f116368b, aVar.f116369c, this.f116363e, this.f116364f, this.f116365g, true);
            return view;
        }
    }

    /* renamed from: H7 */
    public static void m46625H7(SettingsSearchAuthUI settingsSearchAuthUI, String str) {
        if (settingsSearchAuthUI.f116348r) {
            Log.m105928w("MicroMsg.SettingsSearchAuthUI", "isSearching and ignore");
            return;
        }
        C53387r rVar = new C53387r(str, (byte[]) null, true);
        C86709a0.m107524d().mo123460f(rVar);
        settingsSearchAuthUI.f116346p = str;
        settingsSearchAuthUI.f116348r = true;
        settingsSearchAuthUI.f116347q = Integer.valueOf(rVar.hashCode());
        View view = settingsSearchAuthUI.f116338e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        settingsSearchAuthUI.f116342i.setVisibility(0);
        settingsSearchAuthUI.f116340g.setVisibility(8);
        settingsSearchAuthUI.f116341h.setVisibility(8);
        settingsSearchAuthUI.f116345o.setVisibility(8);
        ((ArrayList) settingsSearchAuthUI.f116343j).clear();
        settingsSearchAuthUI.removeAllOptionMenu();
        View view3 = settingsSearchAuthUI.f116350t;
        if (view3 != null) {
            settingsSearchAuthUI.f116345o.removeFooterView(view3);
        }
        Log.m105925i("MicroMsg.SettingsSearchAuthUI", "doSearchUserAuth id: %s, keyword: %s", settingsSearchAuthUI.f116347q, str);
    }

    /* renamed from: I7 */
    public static void m46626I7(SettingsSearchAuthUI settingsSearchAuthUI, String str, byte[] bArr) {
        if (settingsSearchAuthUI.f116348r) {
            Log.m105928w("MicroMsg.SettingsSearchAuthUI", "isSearching and ignore");
            return;
        }
        C53387r rVar = new C53387r(str, bArr, true);
        C86709a0.m107524d().mo123460f(rVar);
        settingsSearchAuthUI.f116346p = str;
        settingsSearchAuthUI.f116348r = true;
        Integer valueOf = Integer.valueOf(rVar.hashCode());
        settingsSearchAuthUI.f116347q = valueOf;
        Log.m105925i("MicroMsg.SettingsSearchAuthUI", "doSearchUserAuth id: %s", valueOf);
    }

    /* renamed from: J7 */
    public static void m46627J7(SettingsSearchAuthUI settingsSearchAuthUI) {
        View view = settingsSearchAuthUI.f116338e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "hideAllView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "hideAllView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        settingsSearchAuthUI.f116340g.setText("");
        ((ArrayList) settingsSearchAuthUI.f116343j).clear();
        settingsSearchAuthUI.f116345o.setVisibility(8);
        settingsSearchAuthUI.f116346p = null;
        settingsSearchAuthUI.removeAllOptionMenu();
    }

    /* renamed from: K7 */
    public final void mo67173K7() {
        Log.m105925i("MicroMsg.SettingsSearchAuthUI", "cancelSearch searchId: %s, searchingKeyWord: %s", this.f116347q, this.f116346p);
        this.f116348r = false;
        this.f116346p = null;
        if (this.f116347q != null) {
            C86709a0.m107524d().mo123457c(this.f116347q.intValue());
            this.f116347q = null;
        }
    }

    /* renamed from: L7 */
    public final void mo67174L7() {
        View view = this.f116338e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f116340g.setVisibility(8);
        this.f116342i.setVisibility(8);
        this.f116341h.setVisibility(0);
        this.f116341h.setText(getResources().getString(C0966R.string.iqj));
        this.f116345o.setVisibility(8);
        ((ArrayList) this.f116343j).clear();
        removeAllOptionMenu();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2461dn);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxt;
    }

    public void initView() {
        this.f116337d = new FTSSearchView((Context) this, false);
        this.f116345o = (ListView) findViewById(C0966R.C0970id.a0m);
        C42975g gVar = new C42975g();
        this.f116344n = gVar;
        this.f116345o.setAdapter(gVar);
        this.f116338e = findViewById(C0966R.C0970id.j6u);
        this.f116340g = (TextView) findViewById(C0966R.C0970id.j4v);
        this.f116341h = (TextView) findViewById(C0966R.C0970id.j6l);
        this.f116342i = (ProgressBar) findViewById(C0966R.C0970id.j6_);
        removeAllOptionMenu();
        getSupportActionBar().mo91114y(this.f116337d);
        this.f116337d.setSearchViewListener(new C42969a());
        this.f116337d.getFtsEditText().mo70338f();
        this.f116337d.getFtsEditText().setFtsEditTextListener(new C42970b());
        this.f116337d.getFtsEditText().mo70355k();
        this.f116337d.getFtsEditText().mo70361q();
        this.f116340g.setOnClickListener(new C42971c());
        this.f116345o.setOnItemClickListener(new C42972d());
        this.f116345o.setOnScrollListener(new C42973e());
        View findViewById = findViewById(C0966R.C0970id.iwf);
        this.f116339f = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C42974f());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        List<io4> list;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && i2 == -1 && (list = this.f116343j) != null && this.f116344n != null && (i3 = this.f116351u) >= 0 && i3 < ((ArrayList) list).size()) {
            ((ArrayList) this.f116343j).remove(this.f116351u);
            this.f116344n.notifyDataSetChanged();
            if (this.f116349s == null && ((ArrayList) this.f116343j).size() <= 1) {
                mo67174L7();
            }
        }
    }

    public void onBackPressed() {
        mo67173K7();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107524d().mo123470p(C90211g.CTRL_INDEX, this);
        C86709a0.m107524d().mo123470p(1127, this);
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(C90211g.CTRL_INDEX, this);
        C86709a0.m107524d().mo123455a(1127, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = str;
        int i3 = -1;
        objArr[3] = Integer.valueOf(yVar != null ? yVar.getType() : -1);
        if (yVar != null) {
            i3 = yVar.hashCode();
        }
        objArr[4] = Integer.valueOf(i3);
        objArr[5] = this.f116347q;
        Log.m105925i("MicroMsg.SettingsSearchAuthUI", "errType %d, errCode %d, errMsg %s, type: %s, id: %s, currentSearchId: %s", objArr);
        if (yVar != null && yVar.hashCode() == this.f116347q.intValue()) {
            this.f116348r = false;
        }
        if (yVar != null && i == 0 && i2 == 0) {
            if (yVar.getType() == 1169) {
                if (yVar.hashCode() != this.f116347q.intValue()) {
                    Log.m105929w("MicroMsg.SettingsSearchAuthUI", "search scene is cancelled and ignore, %s", Integer.valueOf(yVar.hashCode()));
                    return;
                }
                C53387r rVar = (C53387r) yVar;
                C51031qy3 qy32 = rVar.f150223f;
                this.f116349s = (qy32 == null || qy32.f140619g != 1) ? null : qy32.f140618f.mo123703f();
                if (!(rVar.f150224g != null)) {
                    ((ArrayList) this.f116343j).clear();
                }
                List<io4> list = this.f116343j;
                C51031qy3 qy33 = rVar.f150223f;
                ((ArrayList) list).addAll(qy33 != null ? qy33.f140617e : Collections.emptyList());
                if (!((ArrayList) this.f116343j).isEmpty()) {
                    C42975g gVar = this.f116344n;
                    gVar.f116362d = this.f116343j;
                    gVar.notifyDataSetChanged();
                    View view = this.f116338e;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f116345o.setVisibility(0);
                    removeAllOptionMenu();
                    if (!((ArrayList) this.f116343j).isEmpty() && this.f116349s == null) {
                        View view3 = this.f116352v;
                        if (view3 != null) {
                            this.f116355y = false;
                            this.f116345o.removeFooterView(view3);
                        }
                        View view4 = this.f116350t;
                        if (view4 != null) {
                            this.f116345o.removeFooterView(view4);
                        }
                        if (this.f116350t == null) {
                            this.f116350t = LayoutInflater.from(this).inflate(C0966R.C0971layout.b58, (ViewGroup) null);
                        }
                        this.f116345o.addFooterView(this.f116350t);
                    }
                    if (!((ArrayList) this.f116343j).isEmpty() && this.f116349s != null && !this.f116355y) {
                        View view5 = this.f116350t;
                        if (view5 != null) {
                            this.f116345o.removeFooterView(view5);
                        }
                        this.f116355y = true;
                        if (this.f116352v == null) {
                            View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.b55, (ViewGroup) null);
                            this.f116352v = inflate;
                            this.f116353w = inflate.findViewById(C0966R.C0970id.g3k);
                            View findViewById = this.f116352v.findViewById(C0966R.C0970id.g3l);
                            this.f116354x = findViewById;
                            findViewById.setOnClickListener(new C42983e3(this));
                        }
                        this.f116345o.addFooterView(this.f116352v);
                        return;
                    }
                    return;
                }
                mo67174L7();
            } else if (yVar.getType() == 1127) {
                String str2 = ((C53380i) yVar).f150200e;
                if (!Util.isNullOrNil(str2)) {
                    if (!((ArrayList) this.f116343j).isEmpty()) {
                        Iterator it = ((ArrayList) this.f116343j).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((io4) it.next()).f135548d.equals(str2)) {
                                    it.remove();
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    this.f116344n.notifyDataSetChanged();
                }
            }
        } else if (yVar == null || yVar.getType() != 1169 || yVar.hashCode() != this.f116347q.intValue()) {
        } else {
            if (((ArrayList) this.f116343j).isEmpty()) {
                View view6 = this.f116338e;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view7 = view6;
                C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f116340g.setVisibility(8);
                this.f116342i.setVisibility(8);
                this.f116341h.setVisibility(0);
                this.f116341h.setText(getResources().getString(C0966R.string.iqi));
                this.f116345o.setVisibility(8);
                ((ArrayList) this.f116343j).clear();
                removeAllOptionMenu();
            } else if (this.f116352v != null) {
                View view8 = this.f116353w;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view9 = view8;
                C117292a.m165358d(view9, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view10 = this.f116354x;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view11 = view10;
                C117292a.m165358d(view11, aVar4.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
