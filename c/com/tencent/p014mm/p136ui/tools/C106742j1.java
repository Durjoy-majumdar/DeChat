package com.tencent.p014mm.p136ui.tools;

import android.app.Activity;
import android.graphics.Color;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.tools.ActionBarSearchView;
import com.tencent.p014mm.p136ui.tools.SearchViewNotRealTimeHelper;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.vendor.Huawei;
import java.util.ArrayList;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.tools.j1 */
public class C106742j1 {

    /* renamed from: a */
    public final String f319113a;

    /* renamed from: b */
    public boolean f319114b;

    /* renamed from: c */
    public boolean f319115c;

    /* renamed from: d */
    public boolean f319116d;

    /* renamed from: e */
    public boolean f319117e;

    /* renamed from: f */
    public boolean f319118f;

    /* renamed from: g */
    public MenuItem f319119g;

    /* renamed from: h */
    public MMHandler f319120h;

    /* renamed from: i */
    public C106757l0 f319121i;

    /* renamed from: j */
    public C106756o f319122j;

    /* renamed from: k */
    public boolean f319123k;

    /* renamed from: l */
    public int f319124l;

    /* renamed from: m */
    public boolean f319125m;

    /* renamed from: n */
    public boolean f319126n;

    /* renamed from: o */
    public C74847n f319127o;

    /* renamed from: p */
    public MMActivityController f319128p;

    /* renamed from: q */
    public C74846m f319129q;

    /* renamed from: com.tencent.mm.ui.tools.j1$m */
    public interface C74846m {
        void collapseActionView();

        void expandActionView();
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$n */
    public interface C74847n {
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$a */
    public class C106743a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FragmentActivity f319130d;

        /* renamed from: e */
        public final /* synthetic */ boolean f319131e;

        public C106743a(FragmentActivity fragmentActivity, boolean z) {
            this.f319130d = fragmentActivity;
            this.f319131e = z;
        }

        public void run() {
            FragmentActivity fragmentActivity = this.f319130d;
            if (fragmentActivity == null || fragmentActivity.isFinishing()) {
                Log.m105928w(C106742j1.this.f319113a, "want to collapse search view, but activity status error");
            } else if (this.f319131e) {
                this.f319130d.supportInvalidateOptionsMenu();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$b */
    public class C106744b implements Runnable {
        public C106744b() {
        }

        public void run() {
            C106756o oVar = C106742j1.this.f319122j;
            if (oVar != null) {
                oVar.mo1321H5();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$c */
    public class C106745c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FragmentActivity f319134d;

        public C106745c(FragmentActivity fragmentActivity) {
            this.f319134d = fragmentActivity;
        }

        public void run() {
            View findViewById;
            View currentFocus;
            IBinder windowToken;
            C106742j1 j1Var = C106742j1.this;
            if (j1Var.f319119g == null) {
                Log.m105928w(j1Var.f319113a, "want to collapse search view, but search menu item is null");
                return;
            }
            FragmentActivity fragmentActivity = this.f319134d;
            if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
                C106742j1 j1Var2 = C106742j1.this;
                FragmentActivity fragmentActivity2 = this.f319134d;
                j1Var2.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) fragmentActivity2.getSystemService("input_method");
                if (!(inputMethodManager == null || (currentFocus = fragmentActivity2.getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null)) {
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                }
            }
            View actionView = C106742j1.this.f319119g.getActionView();
            if (actionView != null && (findViewById = actionView.findViewById(C0966R.C0970id.cd7)) != null) {
                findViewById.clearFocus();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$d */
    public class C106746d implements ActionBarSearchView.C106733j {
        public C106746d() {
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$e */
    public class C106747e implements TextView.OnEditorActionListener {
        public C106747e() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r1 = r0.f319137d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onEditorAction(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            /*
                r0 = this;
                r1 = 3
                if (r1 != r2) goto L_0x0012
                com.tencent.mm.ui.tools.j1 r1 = com.tencent.p014mm.p136ui.tools.C106742j1.this
                com.tencent.mm.ui.tools.j1$o r2 = r1.f319122j
                if (r2 == 0) goto L_0x0012
                java.lang.String r1 = r1.mo153855g()
                boolean r1 = r2.mo1322S6(r1)
                return r1
            L_0x0012:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.C106742j1.C106747e.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$f */
    public class C106748f implements C74846m {

        /* renamed from: a */
        public final /* synthetic */ FragmentActivity f319138a;

        /* renamed from: b */
        public final /* synthetic */ Menu f319139b;

        public C106748f(FragmentActivity fragmentActivity, Menu menu) {
            this.f319138a = fragmentActivity;
            this.f319139b = menu;
        }

        public void collapseActionView() {
            C106742j1 j1Var = C106742j1.this;
            FragmentActivity fragmentActivity = this.f319138a;
            j1Var.mo153852d(fragmentActivity, true, j1Var.mo153854f(this.f319139b, fragmentActivity));
        }

        public void expandActionView() {
            C106742j1 j1Var = C106742j1.this;
            FragmentActivity fragmentActivity = this.f319138a;
            j1Var.mo153853e(fragmentActivity, true, j1Var.mo153854f(this.f319139b, fragmentActivity));
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$g */
    public class C106749g implements C74846m {

        /* renamed from: a */
        public final /* synthetic */ FragmentActivity f319141a;

        /* renamed from: b */
        public final /* synthetic */ Menu f319142b;

        public C106749g(FragmentActivity fragmentActivity, Menu menu) {
            this.f319141a = fragmentActivity;
            this.f319142b = menu;
        }

        public void collapseActionView() {
            C106742j1 j1Var = C106742j1.this;
            FragmentActivity fragmentActivity = this.f319141a;
            j1Var.mo153852d(fragmentActivity, true, j1Var.mo153854f(this.f319142b, fragmentActivity));
        }

        public void expandActionView() {
            C106742j1 j1Var = C106742j1.this;
            FragmentActivity fragmentActivity = this.f319141a;
            j1Var.mo153853e(fragmentActivity, true, j1Var.mo153854f(this.f319142b, fragmentActivity));
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$h */
    public class C106750h implements ActionBarSearchView.C106732i {
        public C106750h() {
        }

        /* renamed from: a */
        public void mo153864a() {
            ViewGroup viewGroup;
            C106742j1 j1Var = C106742j1.this;
            if (j1Var.f319114b) {
                if (j1Var.f319119g != null) {
                    try {
                        if (Huawei.ifHUAWEI() && C85875k4.m106197n0() && (viewGroup = (ViewGroup) C106742j1.this.f319119g.getActionView().getParent()) != null) {
                            viewGroup.removeView(viewGroup.findViewById(C0966R.C0970id.bxy));
                        }
                    } catch (Exception unused) {
                    }
                }
                C74846m mVar = C106742j1.this.f319129q;
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            }
            C74846m mVar2 = j1Var.f319129q;
            if (mVar2 != null) {
                mVar2.collapseActionView();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$i */
    public class C106751i implements MenuItem.OnMenuItemClickListener {
        public C106751i(C106742j1 j1Var) {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$j */
    public class C106752j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Activity f319145d;

        /* renamed from: com.tencent.mm.ui.tools.j1$j$a */
        public class C106753a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f319147d;

            public C106753a(View view) {
                this.f319147d = view;
            }

            public void run() {
                ((InputMethodManager) C106752j.this.f319145d.getSystemService("input_method")).showSoftInput(this.f319147d.findViewById(C0966R.C0970id.cd7), 0);
            }
        }

        public C106752j(Activity activity) {
            this.f319145d = activity;
        }

        public void run() {
            C106742j1 j1Var = C106742j1.this;
            if (j1Var.f319119g == null) {
                Log.m105928w(j1Var.f319113a, "on post expand search menu, but item is null");
                return;
            }
            Log.m105925i(j1Var.f319113a, "try to expand action view, searchViewExpand %B", Boolean.valueOf(j1Var.f319115c));
            C106742j1 j1Var2 = C106742j1.this;
            if (j1Var2.f319114b) {
                C74846m mVar = j1Var2.f319129q;
                if (mVar != null) {
                    mVar.expandActionView();
                }
            } else {
                C74846m mVar2 = j1Var2.f319129q;
                if (mVar2 != null) {
                    mVar2.expandActionView();
                }
            }
            View actionView = C106742j1.this.f319119g.getActionView();
            if (actionView != null && C106742j1.this.f319115c) {
                actionView.findViewById(C0966R.C0970id.cd7).requestFocus();
                if (C106742j1.this.mo136222i()) {
                    C106742j1.this.f319120h.postDelayed(new C106753a(actionView), 128);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$k */
    public class C106754k implements Runnable {
        public C106754k() {
        }

        public void run() {
            C106742j1 j1Var = C106742j1.this;
            if (j1Var.f319119g == null) {
                Log.m105928w(j1Var.f319113a, "post do expand search menu, but search menu item is null");
            } else if (j1Var.f319114b) {
                C74846m mVar = j1Var.f319129q;
                if (mVar != null) {
                    mVar.expandActionView();
                }
            } else {
                C74846m mVar2 = j1Var.f319129q;
                if (mVar2 != null) {
                    mVar2.expandActionView();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$l */
    public class C106755l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FragmentActivity f319150d;

        /* renamed from: e */
        public final /* synthetic */ boolean f319151e;

        public C106755l(FragmentActivity fragmentActivity, boolean z) {
            this.f319150d = fragmentActivity;
            this.f319151e = z;
        }

        public void run() {
            FragmentActivity fragmentActivity = this.f319150d;
            if (fragmentActivity == null || fragmentActivity.isFinishing()) {
                Log.m105928w(C106742j1.this.f319113a, "want to expand search view, but activity status error");
            } else if (this.f319151e) {
                this.f319150d.supportInvalidateOptionsMenu();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.j1$o */
    public interface C106756o {
        /* renamed from: H5 */
        void mo1321H5();

        /* renamed from: S6 */
        boolean mo1322S6(String str);

        /* renamed from: i7 */
        void mo1323i7();

        /* renamed from: l3 */
        void mo1324l3(String str);

        /* renamed from: l5 */
        void mo1325l5();

        /* renamed from: y4 */
        void mo1326y4();
    }

    public C106742j1() {
        this.f319114b = false;
        this.f319115c = false;
        this.f319116d = false;
        this.f319117e = true;
        this.f319118f = true;
        this.f319119g = null;
        this.f319120h = new MMHandler(Looper.getMainLooper());
        this.f319121i = null;
        this.f319124l = C0966R.string.f7961xj;
        this.f319125m = false;
        this.f319126n = false;
        this.f319123k = true;
        this.f319114b = false;
        this.f319113a = "MicroMsg.SearchViewHelper-" + String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public void mo153849a() {
        C106757l0 l0Var = this.f319121i;
        if (l0Var != null) {
            l0Var.mo153790b();
        }
    }

    /* renamed from: b */
    public void mo153850b() {
        MenuItem menuItem;
        Log.m105918d(this.f319113a, "do collapse");
        if (this.f319115c && (menuItem = this.f319119g) != null) {
            if (this.f319114b) {
                try {
                    ViewGroup viewGroup = (ViewGroup) menuItem.getActionView().getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(viewGroup.findViewById(C0966R.C0970id.bxy));
                    }
                } catch (Exception unused) {
                }
                C74846m mVar = this.f319129q;
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            }
            C74846m mVar2 = this.f319129q;
            if (mVar2 != null) {
                mVar2.collapseActionView();
            }
        }
    }

    /* renamed from: c */
    public void mo153851c(boolean z) {
        String str = this.f319113a;
        Object[] objArr = new Object[2];
        boolean z2 = false;
        objArr[0] = Boolean.valueOf(this.f319115c);
        if (this.f319119g == null) {
            z2 = true;
        }
        objArr[1] = Boolean.valueOf(z2);
        Log.m105919d(str, "do expand, expanded[%B], search menu item null[%B]", objArr);
        if (!this.f319115c) {
            if (!this.f319117e) {
                Log.m105928w(this.f319113a, "can not expand now");
                return;
            }
            this.f319118f = z;
            if (this.f319119g != null) {
                this.f319120h.post(new C106754k());
            } else {
                this.f319116d = true;
            }
        }
    }

    /* renamed from: d */
    public void mo153852d(FragmentActivity fragmentActivity, boolean z, Menu menu) {
        MenuItem menuItem;
        ViewGroup viewGroup;
        String str = this.f319113a;
        Log.m105918d(str, "doNewCollapse, searchViewExpand " + this.f319115c);
        if (this.f319115c) {
            this.f319115c = false;
            try {
                if (Huawei.ifHUAWEI() && C85875k4.m106197n0() && (menuItem = this.f319119g) != null && (viewGroup = (ViewGroup) menuItem.getActionView().getParent()) != null) {
                    viewGroup.removeView(viewGroup.findViewById(C0966R.C0970id.bxy));
                }
            } catch (Exception unused) {
            }
            mo136223n(menu);
            C74847n nVar = this.f319127o;
            if (nVar != null) {
                LabelSearchUI.this.finish();
            }
            C106757l0 l0Var = this.f319121i;
            if (l0Var != null) {
                l0Var.mo153793e(false);
            }
            this.f319120h.post(new C106743a(fragmentActivity, z));
            if (this.f319122j != null) {
                this.f319120h.post(new C106744b());
            }
        }
        this.f319120h.post(new C106745c(fragmentActivity));
    }

    /* renamed from: e */
    public void mo153853e(FragmentActivity fragmentActivity, boolean z, Menu menu) {
        String str = this.f319113a;
        Log.m105918d(str, "doNewExpand, searchViewExpand " + this.f319115c);
        if (!this.f319115c) {
            this.f319115c = true;
            mo136224o();
            mo153856k(fragmentActivity, menu);
            this.f319120h.post(new C106755l(fragmentActivity, z));
            C106756o oVar = this.f319122j;
            if (oVar != null) {
                oVar.mo1323i7();
            }
        }
    }

    /* renamed from: f */
    public Menu mo153854f(Menu menu, Activity activity) {
        C76874e0 e0Var = null;
        if (!(menu instanceof C76874e0)) {
            if (this.f319128p != null) {
                Log.m105924i(this.f319113a, "getCurrentMenu, mActivityController.");
                C106741c cVar = this.f319128p.f348063D;
                if (cVar != null && cVar.f319109c) {
                    e0Var = cVar.f319110d;
                }
            } else if (activity instanceof MMActivity) {
                e0Var = ((MMActivity) activity).getMenu();
            }
        }
        if (e0Var != null) {
            Log.m105925i(this.f319113a, "getCurrentMenu, localmenu size = %s.", Integer.valueOf(e0Var.size()));
            return e0Var;
        }
        Log.m105924i(this.f319113a, "getCurrentMenu, localmenu is null.");
        return menu;
    }

    /* renamed from: g */
    public String mo153855g() {
        C106757l0 l0Var = this.f319121i;
        return l0Var != null ? l0Var.getSearchContent() : "";
    }

    /* renamed from: h */
    public boolean mo23881h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo136222i() {
        return this.f319118f;
    }

    /* renamed from: j */
    public void mo23882j(FragmentActivity fragmentActivity, Menu menu) {
        Log.m105926v(this.f319113a, "on create options menu");
        if (fragmentActivity == null) {
            Log.m105928w(this.f319113a, "on add search menu, activity is null");
            return;
        }
        if (this.f319121i == null) {
            if (this.f319123k) {
                ActionBarSearchView actionBarSearchView = new ActionBarSearchView(fragmentActivity);
                this.f319121i = actionBarSearchView;
                if (this.f319125m) {
                    ActionBarSearchView actionBarSearchView2 = actionBarSearchView;
                    actionBarSearchView.findViewById(C0966R.C0970id.f5462fs).setBackgroundColor(actionBarSearchView.getResources().getColor(C0966R.color.f2947a4));
                    actionBarSearchView.findViewById(C0966R.C0970id.j69).setBackgroundResource(C0966R.C0969drawable.f4627i9);
                    ((TextView) actionBarSearchView.f319070d).setTextColor(Color.parseColor("#7D90A9"));
                    ((WeImageView) actionBarSearchView.findViewById(C0966R.C0970id.j5t)).setIconColor(Color.parseColor("#6B6B6B"));
                    actionBarSearchView.f319071e.setTextColor(Color.parseColor("#CCFFFFFF"));
                    actionBarSearchView.f319071e.setHintTextColor(Color.parseColor("#4DFFFFFF"));
                }
            } else {
                SearchViewNotRealTimeHelper searchViewNotRealTimeHelper = new SearchViewNotRealTimeHelper(fragmentActivity);
                this.f319121i = searchViewNotRealTimeHelper;
                searchViewNotRealTimeHelper.setNotRealCallBack((SearchViewNotRealTimeHelper.C45055f) null);
            }
            this.f319121i.setAutoMatchKeywords(false);
            this.f319121i.setKeywords((ArrayList<String>) null);
        }
        this.f319121i.setCallBack(new C106746d());
        this.f319121i.mo153792d(mo23881h());
        this.f319121i.setOnEditorActionListener(new C106747e());
        MenuItem add = menu.add(0, C0966R.C0970id.gsl, 0, this.f319124l);
        this.f319119g = add;
        add.setEnabled(this.f319117e);
        if (!this.f319126n) {
            if (this.f319125m) {
                this.f319119g.setIcon(C74933u4.m89768e(fragmentActivity, C0966R.raw.actionbar_icon_dark_search, fragmentActivity.getResources().getColor(C0966R.color.BW_100_Alpha_0_8)));
            } else {
                this.f319119g.setIcon(C74933u4.m89768e(fragmentActivity, C0966R.raw.actionbar_icon_dark_search, fragmentActivity.getResources().getColor(C0966R.color.FG_0)));
            }
        }
        this.f319119g.setActionView((View) this.f319121i);
        if (this.f319114b) {
            this.f319119g.setShowAsAction(9);
        } else {
            this.f319119g.setShowAsAction(2);
        }
        if (this.f319114b) {
            this.f319129q = new C106748f(fragmentActivity, menu);
        } else {
            this.f319129q = new C106749g(fragmentActivity, menu);
        }
        this.f319121i.setBackClickCallback(new C106750h());
    }

    /* renamed from: k */
    public final void mo153856k(Activity activity, Menu menu) {
        if (!this.f319117e) {
            return;
        }
        if (this.f319115c || this.f319116d) {
            this.f319116d = false;
            if (activity instanceof MMActivity) {
                if (this.f319125m) {
                    ((MMActivity) activity).setActionbarColor(activity.getResources().getColor(C0966R.color.f2947a4));
                } else {
                    ((MMActivity) activity).setActionbarColor(activity.getResources().getColor(C0966R.color.f2927a));
                }
            }
            if (menu != null) {
                for (int i = 0; i < menu.size(); i++) {
                    MenuItem item = menu.getItem(i);
                    if (item.getItemId() != C0966R.C0970id.gsl) {
                        item.setVisible(false);
                    }
                }
            }
            this.f319120h.postDelayed(new C106752j(activity), 128);
        }
    }

    /* renamed from: l */
    public boolean mo153857l(int i, KeyEvent keyEvent) {
        Log.m105927v(this.f319113a, "on key down, key code %d, expand %B", Integer.valueOf(i), Boolean.valueOf(this.f319115c));
        if (4 != i || !this.f319115c) {
            return false;
        }
        mo153850b();
        return true;
    }

    /* renamed from: m */
    public void mo153858m(Activity activity, Menu menu) {
        Log.m105927v(this.f319113a, "on prepare options menu, searchViewExpand %B, triggerExpand %B, canExpand %B", Boolean.valueOf(this.f319115c), Boolean.valueOf(this.f319116d), Boolean.valueOf(this.f319117e));
        if (activity == null) {
            Log.m105928w(this.f319113a, "on hanle status fail, activity is null");
            return;
        }
        Menu f = mo153854f(menu, activity);
        MenuItem menuItem = this.f319119g;
        if (menuItem == null) {
            Log.m105928w(this.f319113a, "can not find search menu, error");
            return;
        }
        menuItem.setOnMenuItemClickListener(new C106751i(this));
        mo153856k(activity, f);
    }

    /* renamed from: n */
    public void mo136223n(Menu menu) {
        if (menu != null) {
            for (int i = 0; i < menu.size(); i++) {
                MenuItem item = menu.getItem(i);
                if (item.getItemId() != C0966R.C0970id.gsl) {
                    item.setVisible(true);
                }
            }
        }
    }

    /* renamed from: o */
    public void mo136224o() {
    }

    /* renamed from: p */
    public void mo23883p() {
    }

    /* renamed from: q */
    public void mo153859q(CharSequence charSequence) {
        C106757l0 l0Var = this.f319121i;
        if (l0Var != null) {
            l0Var.setHint(charSequence);
        }
    }

    /* renamed from: r */
    public void mo23884r(String str) {
        C106757l0 l0Var = this.f319121i;
        if (l0Var != null) {
            l0Var.setSearchContent(str);
        }
    }

    public C106742j1(boolean z, boolean z2) {
        this.f319114b = false;
        this.f319115c = false;
        this.f319116d = false;
        this.f319117e = true;
        this.f319118f = true;
        this.f319119g = null;
        this.f319120h = new MMHandler(Looper.getMainLooper());
        this.f319121i = null;
        this.f319124l = C0966R.string.f7961xj;
        this.f319125m = false;
        this.f319126n = false;
        this.f319123k = z;
        this.f319114b = z2;
        this.f319113a = "MicroMsg.SearchViewHelper-" + String.valueOf(System.currentTimeMillis());
    }
}
