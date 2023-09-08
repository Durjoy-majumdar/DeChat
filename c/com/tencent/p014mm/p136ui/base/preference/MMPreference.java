package com.tencent.p014mm.p136ui.base.preference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.DialogPreference;
import com.tencent.p014mm.p136ui.base.preference.EditPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import pj3.C47511g;
import xi3.C78846k;

/* renamed from: com.tencent.mm.ui.base.preference.MMPreference */
public abstract class MMPreference extends BaseMvvmActivity {
    public static final String TAG = "MicroMsg.mmui.MMPreference";
    private byte _hellAccFlag_;
    /* access modifiers changed from: private */
    public C73244a adapter;
    public ImageView bannerCloseBtn;
    public TextView bannerTv;
    public RelativeLayout bannerView;
    private View bottomMask;
    /* access modifiers changed from: private */
    public boolean dirty = false;
    /* access modifiers changed from: private */
    public boolean isRefreshing = false;
    /* access modifiers changed from: private */
    public ListView list;
    /* access modifiers changed from: private */
    public final List<AbsListView.OnScrollListener> scrollListeners = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: sp */
    public SharedPreferences f215089sp;

    /* renamed from: com.tencent.mm.ui.base.preference.MMPreference$a */
    public class C73232a implements Preference.C6763a {
        public C73232a() {
        }

        /* renamed from: a */
        public boolean mo7744a(Preference preference, Object obj) {
            boolean z;
            if (!MMPreference.this.isRefreshing && preference.mo69930u() && preference.f121288u) {
                boolean unused = MMPreference.this.isRefreshing = true;
                if (preference instanceof CheckBoxPreference) {
                    CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
                    checkBoxPreference.mo6805K(checkBoxPreference.mo6804J());
                    if (checkBoxPreference.f121290w) {
                        MMPreference.this.f215089sp.edit().putBoolean(preference.f121285r, checkBoxPreference.mo6804J()).commit();
                    }
                    boolean unused2 = MMPreference.this.dirty = true;
                    z = true;
                } else {
                    z = false;
                }
                if (preference.f121285r != null) {
                    MMPreference mMPreference = MMPreference.this;
                    mMPreference.onPreferenceTreeClick(mMPreference.adapter, preference);
                }
                if (z) {
                    MMPreference.this.adapter.notifyDataSetChanged();
                }
                boolean unused3 = MMPreference.this.isRefreshing = false;
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.MMPreference$b */
    public class C73233b implements AdapterView.OnItemClickListener {

        /* renamed from: com.tencent.mm.ui.base.preference.MMPreference$b$a */
        public class C73234a implements DialogPreference.C73227b {

            /* renamed from: a */
            public final /* synthetic */ DialogPreference f215092a;

            /* renamed from: b */
            public final /* synthetic */ Preference f215093b;

            public C73234a(DialogPreference dialogPreference, Preference preference) {
                this.f215092a = dialogPreference;
                this.f215093b = preference;
            }

            /* renamed from: a */
            public void mo101923a(boolean z) {
                if (z) {
                    boolean unused = MMPreference.this.dirty = true;
                    if (this.f215092a.f121290w) {
                        MMPreference.this.f215089sp.edit().putString(this.f215093b.f121285r, this.f215092a.f215037J.f225199h).commit();
                    }
                    MMPreference.this.adapter.notifyDataSetChanged();
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.base.preference.MMPreference$b$b */
        public class C73235b implements EditPreference.C73230c {

            /* renamed from: a */
            public final /* synthetic */ EditPreference f215095a;

            /* renamed from: b */
            public final /* synthetic */ Preference f215096b;

            public C73235b(EditPreference editPreference, Preference preference) {
                this.f215095a = editPreference;
                this.f215096b = preference;
            }

            /* renamed from: a */
            public void mo101927a(boolean z) {
                if (z) {
                    boolean unused = MMPreference.this.dirty = true;
                    if (this.f215095a.f121290w) {
                        MMPreference.this.f215089sp.edit().putString(this.f215096b.f121285r, this.f215095a.f215045M).commit();
                    }
                    MMPreference.this.adapter.notifyDataSetChanged();
                }
            }
        }

        public C73233b() {
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
                r0.add(r9)
                java.lang.Long r9 = java.lang.Long.valueOf(r11)
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/ui/base/preference/MMPreference$2"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                android.widget.Adapter r8 = r8.getAdapter()
                java.lang.Object r8 = r8.getItem(r10)
                com.tencent.mm.ui.base.preference.Preference r8 = (com.tencent.p014mm.p136ui.base.preference.Preference) r8
                java.lang.String r9 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r10 = "onItemClick"
                java.lang.String r11 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r12 = "com/tencent/mm/ui/base/preference/MMPreference$2"
                if (r8 != 0) goto L_0x0044
                j20.C117292a.m165361g(r7, r12, r11, r10, r9)
                return
            L_0x0044:
                boolean r0 = r8.mo69930u()
                if (r0 == 0) goto L_0x0085
                boolean r0 = r8.f121288u
                if (r0 == 0) goto L_0x0085
                boolean r0 = r8 instanceof com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference
                if (r0 == 0) goto L_0x0056
                j20.C117292a.m165361g(r7, r12, r11, r10, r9)
                return
            L_0x0056:
                boolean r0 = r8 instanceof com.tencent.p014mm.p136ui.base.preference.DialogPreference
                if (r0 == 0) goto L_0x0067
                r0 = r8
                com.tencent.mm.ui.base.preference.DialogPreference r0 = (com.tencent.p014mm.p136ui.base.preference.DialogPreference) r0
                r0.mo101921I()
                com.tencent.mm.ui.base.preference.MMPreference$b$a r1 = new com.tencent.mm.ui.base.preference.MMPreference$b$a
                r1.<init>(r0, r8)
                r0.f215039L = r1
            L_0x0067:
                boolean r0 = r8 instanceof com.tencent.p014mm.p136ui.base.preference.EditPreference
                if (r0 == 0) goto L_0x0078
                r0 = r8
                com.tencent.mm.ui.base.preference.EditPreference r0 = (com.tencent.p014mm.p136ui.base.preference.EditPreference) r0
                r0.mo101924I()
                com.tencent.mm.ui.base.preference.MMPreference$b$b r1 = new com.tencent.mm.ui.base.preference.MMPreference$b$b
                r1.<init>(r0, r8)
                r0.f215043K = r1
            L_0x0078:
                java.lang.String r0 = r8.f121285r
                if (r0 == 0) goto L_0x0085
                com.tencent.mm.ui.base.preference.MMPreference r0 = com.tencent.p014mm.p136ui.base.preference.MMPreference.this
                com.tencent.mm.ui.base.preference.a r1 = r0.adapter
                r0.onPreferenceTreeClick(r1, r8)
            L_0x0085:
                j20.C117292a.m165361g(r7, r12, r11, r10, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.preference.MMPreference.C73233b.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.MMPreference$c */
    public class C73236c implements AdapterView.OnItemLongClickListener {
        public C73236c() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < MMPreference.this.list.getHeaderViewsCount()) {
                return false;
            }
            int headerViewsCount = i - MMPreference.this.list.getHeaderViewsCount();
            if (headerViewsCount >= MMPreference.this.adapter.getCount()) {
                Log.m105921e(MMPreference.TAG, "itemlongclick, outofindex, %d, %d", Integer.valueOf(headerViewsCount), Integer.valueOf(MMPreference.this.adapter.getCount()));
                return false;
            }
            MMPreference mMPreference = MMPreference.this;
            return mMPreference.onPreferenceTreeLongClick(mMPreference.adapter, (Preference) MMPreference.this.adapter.getItem(headerViewsCount), MMPreference.this.list);
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.MMPreference$d */
    public class C73237d implements AbsListView.OnScrollListener {
        public C73237d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/preference/MMPreference$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            for (AbsListView.OnScrollListener onScroll : MMPreference.this.scrollListeners) {
                onScroll.onScroll(absListView, i, i2, i3);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/preference/MMPreference$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            View currentFocus;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/preference/MMPreference$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (1 == i && (currentFocus = MMPreference.this.getCurrentFocus()) != null) {
                currentFocus.clearFocus();
            }
            for (AbsListView.OnScrollListener onScrollStateChanged : MMPreference.this.scrollListeners) {
                onScrollStateChanged.onScrollStateChanged(absListView, i);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/preference/MMPreference$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    private void setupList() {
        C73244a aVar = this.adapter;
        aVar.f215134u = new C73232a();
        aVar.notifyDataSetChanged();
        int resourceId = getResourceId();
        if (resourceId != -1) {
            this.adapter.mo72520b(resourceId);
        }
        this.list.setAdapter(this.adapter);
        this.list.setOnItemClickListener(new C73233b());
        this.list.setOnItemLongClickListener(new C73236c());
        this.list.setOnScrollListener(new C73237d());
    }

    public void addOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.scrollListeners.add(onScrollListener);
    }

    public boolean autoRefresh() {
        return true;
    }

    public C73244a createAdapter(SharedPreferences sharedPreferences) {
        return new C73244a(this, getListView(), sharedPreferences);
    }

    public void createUI() {
        this.list.setAdapter(this.adapter);
    }

    public boolean dirty() {
        return this.dirty;
    }

    public void doPrepareData() {
    }

    public View getBottomView() {
        return null;
    }

    public SharedPreferences getDefaultSharedPreferences() {
        return this.f215089sp;
    }

    public int getFooterResourceId() {
        return -1;
    }

    public View getFooterView() {
        return null;
    }

    public int getHeaderResourceId() {
        return -1;
    }

    public View getHeaderView() {
        return null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.beo;
    }

    public ListView getListView() {
        return this.list;
    }

    public C47511g getPreferenceScreen() {
        return this.adapter;
    }

    public abstract int getResourceId();

    public boolean onContextItemSelected(MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f215089sp = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.list = (ListView) findViewById(16908298);
        this.bottomMask = findViewById(C0966R.C0970id.e5c);
        this.adapter = createAdapter(this.f215089sp);
        this.bannerView = (RelativeLayout) findViewById(C0966R.C0970id.i1j);
        this.bannerTv = (TextView) findViewById(C0966R.C0970id.i1i);
        this.bannerCloseBtn = (ImageView) findViewById(C0966R.C0970id.i1h);
        doPrepareData();
        int headerResourceId = getHeaderResourceId();
        View headerView = getHeaderView();
        if (headerResourceId != -1) {
            this.list.addHeaderView(getLayoutInflater().inflate(headerResourceId, (ViewGroup) null));
        } else if (headerView != null) {
            if (headerView.getLayoutParams() != null) {
                headerView.setLayoutParams(new AbsListView.LayoutParams(headerView.getLayoutParams()));
            } else {
                Log.m105920e(TAG, "[arthurdan.mmpreference] Notice!!! header.getLayoutParams() is null!!!\n");
            }
            this.list.addHeaderView(headerView);
        }
        int footerResourceId = getFooterResourceId();
        View footerView = getFooterView();
        if (footerResourceId != -1) {
            this.list.addFooterView(getLayoutInflater().inflate(footerResourceId, (ViewGroup) null));
        } else if (footerView != null) {
            if (footerView.getLayoutParams() != null) {
                footerView.setLayoutParams(new AbsListView.LayoutParams(footerView.getLayoutParams()));
            } else {
                Log.m105920e(TAG, "[arthurdan.mmpreference] Notice!!! footer.getLayoutParams() is null!!!\n");
            }
            this.list.addFooterView(footerView);
        }
        View bottomView = getBottomView();
        if (bottomView != null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.i1f);
            frameLayout.addView(bottomView);
            frameLayout.setVisibility(0);
        }
        View view = this.bottomMask;
        if (view != null) {
            int i = showBottomMask().booleanValue() ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/preference/MMPreference", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/base/preference/MMPreference", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setupList();
    }

    public void onPointerCaptureChanged(boolean z) {
    }

    public abstract boolean onPreferenceTreeClick(C47511g gVar, Preference preference);

    public boolean onPreferenceTreeLongClick(C47511g gVar, Preference preference, View view) {
        return false;
    }

    public void onResume() {
        if (autoRefresh()) {
            this.adapter.notifyDataSetChanged();
        }
        super.onResume();
    }

    public boolean onSetToTop() {
        ListView listView = this.list;
        C9556a aVar = new C9556a();
        aVar.mo10233c(listView);
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/ui/base/preference/MMPreference", "onSetToTop", "()Z", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/ui/base/preference/MMPreference", "onSetToTop", "()Z", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        return true;
    }

    public void releaseUI() {
        this.list.setAdapter((ListAdapter) null);
    }

    public void removeOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.scrollListeners.remove(onScrollListener);
    }

    public void setSelection(int i) {
        this.list.setSelection(i);
    }

    public Boolean showBottomMask() {
        return Boolean.FALSE;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C78846k.class);
    }

    public void updateAdapter(C73244a aVar) {
        this.adapter = aVar;
        setupList();
    }
}
