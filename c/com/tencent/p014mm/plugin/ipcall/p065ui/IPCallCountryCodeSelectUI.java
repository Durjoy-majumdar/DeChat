package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.platformtools.SpellMap;
import com.tencent.p014mm.plugin.ipcall.model.C42464d;
import com.tencent.p014mm.plugin.ipcall.p065ui.IPCallCountryCodeScrollbar;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nj3.C88989a;
import t12.C13818a;
import t12.C13821b;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI */
public class IPCallCountryCodeSelectUI extends MMActivity {

    /* renamed from: d */
    public ListView f52973d;

    /* renamed from: e */
    public C18897a0 f52974e;

    /* renamed from: f */
    public IPCallCountryCodeScrollbar f52975f;

    /* renamed from: g */
    public List<C18896a> f52976g;

    /* renamed from: h */
    public String f52977h;

    /* renamed from: i */
    public String f52978i;

    /* renamed from: j */
    public String f52979j = "";

    /* renamed from: n */
    public C106742j1 f52980n;

    /* renamed from: o */
    public boolean f52981o = false;

    /* renamed from: p */
    public boolean f52982p = false;

    /* renamed from: q */
    public LinearLayout f52983q;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI$a */
    public class C18891a implements MenuItem.OnMenuItemClickListener {
        public C18891a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallCountryCodeSelectUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI$b */
    public class C18892b implements C106742j1.C106756o {
        public C18892b() {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI = IPCallCountryCodeSelectUI.this;
            iPCallCountryCodeSelectUI.f52979j = "";
            IPCallCountryCodeSelectUI.m19842H7(iPCallCountryCodeSelectUI);
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
            IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI = IPCallCountryCodeSelectUI.this;
            iPCallCountryCodeSelectUI.f52979j = str;
            IPCallCountryCodeSelectUI.m19842H7(iPCallCountryCodeSelectUI);
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI$c */
    public class C18893c implements IPCallCountryCodeScrollbar.C69039b {
        public C18893c() {
        }

        /* renamed from: a */
        public void mo23891a(String str) {
            char charAt = str.charAt(0);
            if ("↑".equals(str)) {
                IPCallCountryCodeSelectUI.this.f52973d.setSelection(0);
                return;
            }
            int[] iArr = IPCallCountryCodeSelectUI.this.f52974e.f52997h;
            if (iArr != null) {
                for (int i = 0; i < iArr.length; i++) {
                    if (iArr[i] == charAt) {
                        ListView listView = IPCallCountryCodeSelectUI.this.f52973d;
                        listView.setSelection(i + listView.getHeaderViewsCount());
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI$d */
    public class C18894d implements MenuItem.OnMenuItemClickListener {
        public C18894d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallCountryCodeSelectUI.this.hideVKB();
            Intent intent = new Intent();
            intent.putExtra("country_name", IPCallCountryCodeSelectUI.this.f52977h);
            intent.putExtra("couttry_code", IPCallCountryCodeSelectUI.this.f52978i);
            IPCallCountryCodeSelectUI.this.setResult(100, intent);
            IPCallCountryCodeSelectUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI$e */
    public class C18895e implements AdapterView.OnItemClickListener {
        public C18895e() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallCountryCodeSelectUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Intent intent = new Intent();
            if (i >= IPCallCountryCodeSelectUI.this.f52973d.getHeaderViewsCount()) {
                IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI = IPCallCountryCodeSelectUI.this;
                C18896a aVar = (C18896a) iPCallCountryCodeSelectUI.f52974e.getItem(i - iPCallCountryCodeSelectUI.f52973d.getHeaderViewsCount());
                intent.putExtra("country_name", aVar.f52989a);
                intent.putExtra("couttry_code", aVar.f52990b);
                IPCallCountryCodeSelectUI.this.setResult(100, intent);
            }
            IPCallCountryCodeSelectUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallCountryCodeSelectUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: H7 */
    public static void m19842H7(IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI) {
        String str;
        C18897a0 a0Var = iPCallCountryCodeSelectUI.f52974e;
        if (a0Var != null && (str = iPCallCountryCodeSelectUI.f52979j) != null) {
            a0Var.f52996g = str.trim();
            a0Var.f52994e.clear();
            int size = ((ArrayList) a0Var.f52993d).size();
            for (int i = 0; i < size; i++) {
                if (((C18896a) ((ArrayList) a0Var.f52993d).get(i)).f52989a.toUpperCase().contains(a0Var.f52996g.toUpperCase()) || ((C18896a) ((ArrayList) a0Var.f52993d).get(i)).f52992d.toUpperCase().contains(a0Var.f52996g.toUpperCase()) || ((C18896a) ((ArrayList) a0Var.f52993d).get(i)).f52990b.contains(a0Var.f52996g)) {
                    a0Var.f52994e.add((C18896a) ((ArrayList) a0Var.f52993d).get(i));
                }
            }
            a0Var.mo23896b();
            if (a0Var.f52994e.size() == 0) {
                a0Var.f52995f.f52983q.setVisibility(0);
            } else {
                a0Var.f52995f.f52983q.setVisibility(8);
            }
            a0Var.notifyDataSetChanged();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(-1, C0966R.C0968anim.f2469dt);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b27;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f7497hw);
        C106742j1 j1Var = new C106742j1(true, true);
        this.f52980n = j1Var;
        j1Var.f319122j = new C18892b();
        addSearchMenu(true, j1Var);
        this.f52975f = (IPCallCountryCodeScrollbar) findViewById(C0966R.C0970id.f5628k9);
        long currentTimeMillis = System.currentTimeMillis();
        C42464d a = C42464d.m46136a();
        if (!a.f114953c) {
            a.mo66546b(false);
        }
        Iterator<Integer> it = a.f114951a.iterator();
        int i = 0;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (i >= 5) {
                break;
            }
            String g = C13818a.m13111g(intValue + "");
            if (!Util.isNullOrNil(g) && !C42464d.m46136a().mo66549e(intValue)) {
                List<C18896a> list = this.f52976g;
                ((ArrayList) list).add(new C18896a(g, intValue + "", 0, "0"));
                i++;
            }
        }
        if (i > 0) {
            this.f52982p = true;
        }
        if (LocaleUtil.isChineseAppLang()) {
            if (C13818a.f38951b.size() == 0) {
                C13818a.m13116l();
            }
            for (Map.Entry next : C13818a.f38951b.entrySet()) {
                String str = (String) next.getKey();
                C13821b bVar = (C13821b) next.getValue();
                String str2 = bVar.f38958c;
                if (str2 != null && !"".equals(str2.trim())) {
                    char[] charArray = str2.toCharArray();
                    StringBuffer stringBuffer = new StringBuffer();
                    int length = charArray.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        String a2 = SpellMap.m80581a(charArray[i2]);
                        if (!Util.isNullOrNil(a2)) {
                            stringBuffer.append(a2);
                        } else {
                            stringBuffer.append(charArray[i2]);
                        }
                    }
                    str2 = stringBuffer.toString();
                }
                String upperCase = str2.toUpperCase();
                if (Util.isNullOrNil(upperCase)) {
                    upperCase = " ";
                }
                if (!C42464d.m46136a().mo66549e(Util.getInt(bVar.f38957b, 0))) {
                    ((ArrayList) this.f52976g).add(new C18896a(bVar.f38958c, bVar.f38957b, upperCase.charAt(0), upperCase));
                }
            }
        } else {
            if (C13818a.f38951b.size() == 0) {
                C13818a.m13116l();
            }
            for (Map.Entry next2 : C13818a.f38951b.entrySet()) {
                String str3 = (String) next2.getKey();
                C13821b bVar2 = (C13821b) next2.getValue();
                String upperCase2 = bVar2.f38958c.toUpperCase();
                if (Util.isNullOrNil(upperCase2)) {
                    upperCase2 = " ";
                }
                if (!C42464d.m46136a().mo66549e(Util.getInt(bVar2.f38957b, 0))) {
                    ((ArrayList) this.f52976g).add(new C18896a(bVar2.f38958c, bVar2.f38957b, upperCase2.charAt(0), upperCase2));
                }
            }
        }
        Collections.sort(this.f52976g, new C18899b0(this));
        Iterator it4 = ((ArrayList) this.f52976g).iterator();
        while (it4.hasNext()) {
            int a3 = ((C18896a) it4.next()).mo23894a();
            if (a3 != 0) {
                String valueOf = String.valueOf((char) a3);
                IPCallCountryCodeScrollbar iPCallCountryCodeScrollbar = this.f52975f;
                String[] strArr = IPCallCountryCodeScrollbar.f198432r;
                boolean z = false;
                for (int i3 = 0; i3 < 26; i3++) {
                    iPCallCountryCodeScrollbar.getClass();
                    if (strArr[i3].equals(valueOf)) {
                        z = true;
                    }
                }
                if (!z) {
                    valueOf = "#";
                }
                String[] strArr2 = iPCallCountryCodeScrollbar.f198435f;
                int length2 = strArr2.length + 1;
                String[] strArr3 = new String[length2];
                int length3 = strArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= length3) {
                        strArr3[length2 - 1] = valueOf;
                        iPCallCountryCodeScrollbar.f198435f = strArr3;
                        break;
                    }
                    String str4 = strArr2[i4];
                    if (str4.equals(valueOf)) {
                        break;
                    }
                    strArr3[i5] = str4;
                    i5++;
                    i4++;
                }
            }
        }
        Log.m105919d("MicroMsg.IPCallCountryCodeSelectUI", "initCountryCode used: %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        this.f52983q = (LinearLayout) findViewById(C0966R.C0970id.f5634ke);
        this.f52973d = (ListView) findViewById(C0966R.C0970id.f5610jr);
        C18897a0 a0Var = new C18897a0(this, this.f52976g);
        this.f52974e = a0Var;
        a0Var.f52998i = this.f52981o;
        a0Var.f52999j = this.f52982p;
        this.f52973d.setAdapter(a0Var);
        this.f52973d.setVisibility(0);
        this.f52975f.setOnScrollBarTouchListener(new C18893c());
        setBackBtn(new C18894d());
        this.f52973d.setOnItemClickListener(new C18895e());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f52976g = new ArrayList();
        this.f52977h = Util.nullAs(getIntent().getStringExtra("country_name"), "");
        this.f52978i = Util.nullAs(getIntent().getStringExtra("couttry_code"), "");
        this.f52981o = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", false);
        setBackBtn(new C18891a());
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Intent intent = new Intent();
        intent.putExtra("country_name", this.f52977h);
        intent.putExtra("couttry_code", this.f52978i);
        setResult(100, intent);
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        C106742j1 j1Var = this.f52980n;
        if (j1Var != null) {
            j1Var.mo153850b();
        }
    }
}
