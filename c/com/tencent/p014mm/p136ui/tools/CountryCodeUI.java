package com.tencent.p014mm.p136ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import nc0.C76850a;
import xi3.C15698g;

/* renamed from: com.tencent.mm.ui.tools.CountryCodeUI */
public class CountryCodeUI extends MMActivity {

    /* renamed from: d */
    public ListView f219987d;

    /* renamed from: e */
    public C74852r f219988e;

    /* renamed from: f */
    public VerticalScrollBar f219989f;

    /* renamed from: g */
    public List<C76850a.C76851a> f219990g;

    /* renamed from: h */
    public String f219991h;

    /* renamed from: i */
    public String f219992i;

    /* renamed from: j */
    public String f219993j;

    /* renamed from: n */
    public VerticalScrollBar.C6756b f219994n;

    /* renamed from: o */
    public C106742j1 f219995o;

    /* renamed from: p */
    public boolean f219996p = false;

    /* renamed from: q */
    public String[] f219997q = null;

    /* renamed from: r */
    public String f219998r = null;

    /* renamed from: com.tencent.mm.ui.tools.CountryCodeUI$a */
    public class C74831a implements C106742j1.C106756o {
        public C74831a() {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            return false;
        }

        /* renamed from: i7 */
        public void mo1323i7() {
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            CountryCodeUI countryCodeUI = CountryCodeUI.this;
            countryCodeUI.getClass();
            C74852r rVar = countryCodeUI.f219988e;
            if (rVar != null && str != null) {
                rVar.f220085g = str.trim();
                rVar.f220083e.clear();
                int size = ((ArrayList) rVar.f220082d).size();
                for (int i = 0; i < size; i++) {
                    if (((C76850a.C76851a) ((ArrayList) rVar.f220082d).get(i)).f224677c.toUpperCase().contains(rVar.f220085g.toUpperCase()) || ((C76850a.C76851a) ((ArrayList) rVar.f220082d).get(i)).f224678d.toUpperCase().contains(rVar.f220085g.toUpperCase()) || ((C76850a.C76851a) ((ArrayList) rVar.f220082d).get(i)).f224676b.contains(rVar.f220085g)) {
                        rVar.f220083e.add((C76850a.C76851a) ((ArrayList) rVar.f220082d).get(i));
                    }
                }
                rVar.mo104075b();
                rVar.notifyDataSetChanged();
            }
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CountryCodeUI$b */
    public class C74832b implements VerticalScrollBar.C6756b {
        public C74832b() {
        }

        /* renamed from: S0 */
        public void mo5638S0(String str) {
            char charAt = str.charAt(0);
            if (CountryCodeUI.this.getString(C0966R.string.ifx).equals(str)) {
                CountryCodeUI.this.f219987d.setSelection(0);
                return;
            }
            int[] iArr = CountryCodeUI.this.f219988e.f220086h;
            if (iArr != null) {
                for (int i = 0; i < iArr.length; i++) {
                    if (iArr[i] == charAt) {
                        ListView listView = CountryCodeUI.this.f219987d;
                        listView.setSelection(i + listView.getHeaderViewsCount());
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CountryCodeUI$c */
    public class C74833c implements VerticalScrollBar.C6756b {
        public C74833c() {
        }

        /* renamed from: S0 */
        public void mo5638S0(String str) {
            if (CountryCodeUI.this.getString(C0966R.string.ifx).equals(str)) {
                CountryCodeUI.this.f219987d.setSelection(0);
                return;
            }
            int intValue = Integer.decode(str.substring(0, str.length() - 1)).intValue();
            int[] iArr = CountryCodeUI.this.f219988e.f220086h;
            if (iArr != null) {
                for (int i = 0; i < iArr.length; i++) {
                    if (iArr[i] == intValue) {
                        ListView listView = CountryCodeUI.this.f219987d;
                        listView.setSelection(i + listView.getHeaderViewsCount());
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CountryCodeUI$d */
    public class C74834d implements MenuItem.OnMenuItemClickListener {
        public C74834d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CountryCodeUI.this.hideVKB();
            Intent intent = new Intent();
            intent.putExtra("country_name", CountryCodeUI.this.f219991h);
            intent.putExtra("couttry_code", CountryCodeUI.this.f219992i);
            intent.putExtra("iso_code", CountryCodeUI.this.f219993j);
            CountryCodeUI.this.setResult(100, intent);
            CountryCodeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CountryCodeUI$e */
    public class C74835e implements AdapterView.OnItemClickListener {
        public C74835e() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/CountryCodeUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Intent intent = new Intent();
            if (i >= CountryCodeUI.this.f219987d.getHeaderViewsCount()) {
                CountryCodeUI countryCodeUI = CountryCodeUI.this;
                C76850a.C76851a aVar = (C76850a.C76851a) countryCodeUI.f219988e.getItem(i - countryCodeUI.f219987d.getHeaderViewsCount());
                intent.putExtra("country_name", aVar.f224677c);
                intent.putExtra("couttry_code", aVar.f224676b);
                intent.putExtra("iso_code", aVar.f224675a);
                CountryCodeUI.this.setResult(100, intent);
            }
            CountryCodeUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/ui/tools/CountryCodeUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    public int getLayoutId() {
        return LocaleUtil.isTraditionalChineseAppLang() ? C0966R.C0971layout.f7103yd : C0966R.C0971layout.f7102yc;
    }

    public void initView() {
        boolean z;
        if (!Util.isNullOrNil(this.f219998r)) {
            setMMTitle(this.f219998r);
        } else {
            setMMTitle((int) C0966R.string.f7497hw);
        }
        List<C76850a.C76851a> b = C76850a.m92630b(this, getString(C0966R.string.bvs));
        this.f219990g = b;
        String[] strArr = this.f219997q;
        if (strArr != null && strArr.length > 0) {
            for (int size = ((ArrayList) b).size() - 1; size >= 0; size--) {
                String str = ((C76850a.C76851a) ((ArrayList) this.f219990g).get(size)).f224675a;
                String[] strArr2 = this.f219997q;
                int length = strArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (strArr2[i].equals(str)) {
                        Log.m105925i("MicroMsg.CountryCodeUI", "exclude country: %s", str);
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    ((ArrayList) this.f219990g).remove(size);
                }
            }
        }
        if (!LocaleUtil.isTraditionalChineseAppLang()) {
            Collections.sort(this.f219990g, new C74858s(this));
        } else {
            Collections.sort(this.f219990g, new C74859t(this));
        }
        C106742j1 j1Var = new C106742j1(true, true);
        this.f219995o = j1Var;
        j1Var.f319122j = new C74831a();
        addSearchMenu(true, j1Var);
        this.f219987d = (ListView) findViewById(C0966R.C0970id.f5610jr);
        C74852r rVar = new C74852r(this, this.f219990g);
        this.f219988e = rVar;
        rVar.f220087i = this.f219996p;
        this.f219987d.setAdapter(rVar);
        this.f219987d.setVisibility(0);
        this.f219989f = (VerticalScrollBar) findViewById(C0966R.C0970id.f5628k9);
        if (!LocaleUtil.isTraditionalChineseAppLang()) {
            this.f219994n = new C74832b();
        } else {
            this.f219994n = new C74833c();
        }
        this.f219989f.setOnScrollBarTouchListener(this.f219994n);
        setBackBtn(new C74834d());
        this.f219987d.setOnItemClickListener(new C74835e());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f219991h = Util.nullAs(getIntent().getStringExtra("country_name"), "");
        this.f219992i = Util.nullAs(getIntent().getStringExtra("couttry_code"), "");
        this.f219993j = Util.nullAs(getIntent().getStringExtra("iso_code"), "");
        this.f219996p = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", true);
        this.f219997q = getIntent().getStringArrayExtra("exclude_countries_iso");
        this.f219998r = getIntent().getStringExtra("ui_title");
        initView();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        Intent intent = new Intent();
        intent.putExtra("country_name", this.f219991h);
        intent.putExtra("couttry_code", this.f219992i);
        intent.putExtra("iso_code", this.f219993j);
        setResult(100, intent);
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        C106742j1 j1Var = this.f219995o;
        if (j1Var != null) {
            j1Var.mo153850b();
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C15698g.class);
    }
}
