package com.tencent.weui.base.preference;

import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.preference.Preference;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.BaseActivity;
import com.tencent.p014mm.p136ui.C85975v4;
import j20.C117292a;
import java.util.ArrayList;
import qw3.C89853a;
import qw3.C89854b;
import qw3.C89855c;

public abstract class WeUIPreference extends BaseActivity {

    /* renamed from: A */
    public ListView f250541A;

    /* renamed from: B */
    public SharedPreferences f250542B;

    /* renamed from: C */
    public boolean f250543C = false;

    /* renamed from: z */
    public C89854b f250544z;

    /* renamed from: com.tencent.weui.base.preference.WeUIPreference$a */
    public class C86071a implements Preference.OnPreferenceChangeListener {
        public C86071a() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            boolean z;
            if (!WeUIPreference.this.f250543C && preference.isEnabled() && preference.isSelectable()) {
                WeUIPreference.this.f250543C = true;
                if (preference instanceof CheckBoxPreference) {
                    CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
                    checkBoxPreference.f25005d = checkBoxPreference.mo8242b();
                    if (checkBoxPreference.isPersistent()) {
                        WeUIPreference.this.f250542B.edit().putBoolean(preference.getKey(), checkBoxPreference.mo8242b()).commit();
                    }
                    WeUIPreference.this.getClass();
                    z = true;
                } else {
                    z = false;
                }
                if (preference.getKey() != null) {
                    WeUIPreference weUIPreference = WeUIPreference.this;
                    weUIPreference.mo117043M7(weUIPreference.f250544z, preference);
                }
                if (z) {
                    WeUIPreference.this.f250544z.notifyDataSetChanged();
                }
                WeUIPreference.this.f250543C = false;
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.weui.base.preference.WeUIPreference$b */
    public class C86072b implements AdapterView.OnItemClickListener {
        public C86072b() {
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
                java.lang.String r1 = "com/tencent/weui/base/preference/WeUIPreference$2"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                android.widget.Adapter r8 = r8.getAdapter()
                java.lang.Object r8 = r8.getItem(r10)
                android.preference.Preference r8 = (android.preference.Preference) r8
                java.lang.String r9 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r10 = "onItemClick"
                java.lang.String r11 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r12 = "com/tencent/weui/base/preference/WeUIPreference$2"
                if (r8 != 0) goto L_0x0044
                j20.C117292a.m165361g(r7, r12, r11, r10, r9)
                return
            L_0x0044:
                boolean r0 = r8.isEnabled()
                if (r0 == 0) goto L_0x0065
                boolean r0 = r8.isSelectable()
                if (r0 == 0) goto L_0x0065
                boolean r0 = r8 instanceof com.tencent.weui.base.preference.CheckBoxPreference
                if (r0 == 0) goto L_0x0058
                j20.C117292a.m165361g(r7, r12, r11, r10, r9)
                return
            L_0x0058:
                java.lang.String r0 = r8.getKey()
                if (r0 == 0) goto L_0x0065
                com.tencent.weui.base.preference.WeUIPreference r0 = com.tencent.weui.base.preference.WeUIPreference.this
                qw3.b r1 = r0.f250544z
                r0.mo117043M7(r1, r8)
            L_0x0065:
                j20.C117292a.m165361g(r7, r12, r11, r10, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.weui.base.preference.WeUIPreference.C86072b.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.weui.base.preference.WeUIPreference$c */
    public class C86073c implements AdapterView.OnItemLongClickListener {
        public C86073c() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < WeUIPreference.this.f250541A.getHeaderViewsCount()) {
                return false;
            }
            int headerViewsCount = i - WeUIPreference.this.f250541A.getHeaderViewsCount();
            if (headerViewsCount >= WeUIPreference.this.f250544z.getCount()) {
                C85975v4.m106305b("MicroMsg.mmui.WeUIPreference", "itemlongclick, outofindex, %d, %d", Integer.valueOf(headerViewsCount), Integer.valueOf(WeUIPreference.this.f250544z.getCount()));
                return false;
            }
            Preference preference = (Preference) WeUIPreference.this.f250544z.getItem(headerViewsCount);
            WeUIPreference weUIPreference = WeUIPreference.this;
            C89854b bVar = weUIPreference.f250544z;
            ListView listView = weUIPreference.f250541A;
            weUIPreference.getClass();
            return false;
        }
    }

    /* renamed from: com.tencent.weui.base.preference.WeUIPreference$d */
    public class C86074d implements AbsListView.OnScrollListener {
        public C86074d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/weui/base/preference/WeUIPreference$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/weui/base/preference/WeUIPreference$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            View currentFocus;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/weui/base/preference/WeUIPreference$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (1 == i && (currentFocus = WeUIPreference.this.getCurrentFocus()) != null) {
                currentFocus.clearFocus();
            }
            C117292a.m165361g(this, "com/tencent/weui/base/preference/WeUIPreference$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: M7 */
    public abstract boolean mo117043M7(C89853a aVar, Preference preference);

    public int getFooterResourceId() {
        return -1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.beo;
    }

    public abstract int getResourceId();

    public boolean onContextItemSelected(MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.f250542B = sharedPreferences;
        this.f250544z = new C89854b(this, sharedPreferences);
        this.f250541A = (ListView) findViewById(16908298);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.i1j);
        TextView textView = (TextView) findViewById(C0966R.C0970id.i1i);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.i1h);
        int footerResourceId = getFooterResourceId();
        if (footerResourceId != -1) {
            this.f250541A.addFooterView(getLayoutInflater().inflate(footerResourceId, (ViewGroup) null));
        }
        C89854b bVar = this.f250544z;
        bVar.f258289s = new C86071a();
        bVar.notifyDataSetChanged();
        int resourceId = getResourceId();
        if (resourceId != -1) {
            C89854b bVar2 = this.f250544z;
            bVar2.f258287q = true;
            C89855c cVar = bVar2.f258277d;
            XmlResourceParser xml = cVar.f258292a.getResources().getXml(resourceId);
            if (xml != null) {
                try {
                    cVar.mo124147c(xml, bVar2, true);
                } finally {
                    xml.close();
                }
            }
            bVar2.f258287q = false;
            bVar2.notifyDataSetChanged();
        }
        this.f250541A.setAdapter(this.f250544z);
        this.f250541A.setOnItemClickListener(new C86072b());
        this.f250541A.setOnItemLongClickListener(new C86073c());
        this.f250541A.setOnScrollListener(new C86074d());
    }

    public void onResume() {
        this.f250544z.notifyDataSetChanged();
        super.onResume();
    }
}
