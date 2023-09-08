package com.tencent.p014mm.plugin.qqmail.p090ui;

import ag2.C27900o;
import ag2.C67038p;
import ag2.C67042s;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import k20.C9556a;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI */
public class MailAddrListUI extends MMActivity {

    /* renamed from: d */
    public C89779i0 f203173d = null;

    /* renamed from: e */
    public TextView f203174e = null;

    /* renamed from: f */
    public ListView f203175f;

    /* renamed from: g */
    public C67042s f203176g = null;

    /* renamed from: h */
    public C70345i f203177h;

    /* renamed from: i */
    public List<C67038p> f203178i;

    /* renamed from: j */
    public C67042s.C67044b f203179j = new C70337a();

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI$a */
    public class C70337a extends C67042s.C67044b {
        public C70337a() {
        }

        /* renamed from: a */
        public void mo91029a() {
            String str;
            Log.m105924i("MicroMsg.MailAddrListUI", "sync addr complete");
            C89779i0 i0Var = MailAddrListUI.this.f203173d;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            MailAddrListUI mailAddrListUI = MailAddrListUI.this;
            mailAddrListUI.f203178i = mailAddrListUI.f203176g.mo91026e((String) null);
            if (MailAddrListUI.this.f203178i.size() == 0) {
                MailAddrListUI.this.f203174e.setText(C0966R.string.ixj);
                MailAddrListUI.this.f203174e.setVisibility(0);
            }
            MailAddrListUI mailAddrListUI2 = MailAddrListUI.this;
            StringBuilder sb = new StringBuilder();
            sb.append(MailAddrListUI.this.getString(C0966R.string.hk9));
            if (((HashMap) MailAddrListUI.this.f203177h.f203188e).size() > 0) {
                str = "(" + ((HashMap) MailAddrListUI.this.f203177h.f203188e).size() + ")";
            } else {
                str = "";
            }
            sb.append(str);
            mailAddrListUI2.setMMTitle(sb.toString());
            String[] stringArrayExtra = MailAddrListUI.this.getIntent().getStringArrayExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA");
            if (stringArrayExtra != null) {
                HashSet hashSet = new HashSet();
                for (String split : stringArrayExtra) {
                    String[] split2 = split.split(" ");
                    if (split2.length == 2) {
                        hashSet.add(split2[1]);
                    }
                }
                for (C67038p next : MailAddrListUI.this.f203178i) {
                    if (hashSet.contains(next.f192576f)) {
                        ((HashMap) MailAddrListUI.this.f203177h.f203188e).put(next.f192576f, next);
                    }
                }
            }
            MailAddrListUI.this.f203177h.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI$b */
    public class C70338b implements C106742j1.C106756o {
        public C70338b() {
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
            String nullAs = Util.nullAs(str, "");
            MailAddrListUI mailAddrListUI = MailAddrListUI.this;
            mailAddrListUI.f203178i = mailAddrListUI.f203176g.mo91026e(nullAs.toLowerCase().trim());
            if (MailAddrListUI.this.f203178i.size() == 0) {
                MailAddrListUI.this.f203174e.setText(C0966R.string.hkh);
                MailAddrListUI.this.f203174e.setVisibility(0);
                MailAddrListUI.this.enableOptionMenu(false);
            } else {
                MailAddrListUI.this.f203174e.setVisibility(8);
                MailAddrListUI.this.enableOptionMenu(true);
            }
            MailAddrListUI.this.f203177h.notifyDataSetChanged();
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI$c */
    public class C70339c implements AdapterView.OnItemClickListener {
        public C70339c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            MailAddrListUI mailAddrListUI = MailAddrListUI.this;
            C70345i iVar = mailAddrListUI.f203177h;
            C67038p pVar = MailAddrListUI.this.f203178i.get(i - mailAddrListUI.f203175f.getHeaderViewsCount());
            String str2 = pVar.f192576f;
            if (((HashMap) iVar.f203188e).containsKey(str2)) {
                ((HashMap) iVar.f203188e).remove(str2);
            } else {
                ((HashMap) iVar.f203188e).put(str2, pVar);
            }
            iVar.notifyDataSetChanged();
            MailAddrListUI mailAddrListUI2 = MailAddrListUI.this;
            StringBuilder sb = new StringBuilder();
            sb.append(MailAddrListUI.this.getString(C0966R.string.hk9));
            if (((HashMap) MailAddrListUI.this.f203177h.f203188e).size() > 0) {
                str = "(" + ((HashMap) MailAddrListUI.this.f203177h.f203188e).size() + ")";
            } else {
                str = "";
            }
            sb.append(str);
            mailAddrListUI2.setMMTitle(sb.toString());
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI$d */
    public class C70340d implements AbsListView.OnScrollListener {
        public C70340d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (1 == i) {
                MailAddrListUI.this.hideVKB();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI$e */
    public class C70341e implements MenuItem.OnMenuItemClickListener {
        public C70341e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MailAddrListUI.this.setResult(0);
            MailAddrListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI$f */
    public class C70342f implements View.OnClickListener {
        public C70342f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = MailAddrListUI.this.f203175f;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$6", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$6", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI$g */
    public class C70343g implements MenuItem.OnMenuItemClickListener {
        public C70343g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C70345i iVar = MailAddrListUI.this.f203177h;
            iVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (String str : ((HashMap) iVar.f203188e).keySet()) {
                arrayList.add((C67038p) ((HashMap) iVar.f203188e).get(str));
            }
            ComposeUI.f203091Q0 = arrayList;
            MailAddrListUI.this.setResult(-1);
            MailAddrListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI$h */
    public class C70344h implements DialogInterface.OnCancelListener {
        public C70344h(MailAddrListUI mailAddrListUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI$i */
    public class C70345i extends BaseAdapter {

        /* renamed from: d */
        public final Context f203187d;

        /* renamed from: e */
        public Map<String, C67038p> f203188e = new HashMap();

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI$i$a */
        public class C70346a {

            /* renamed from: a */
            public TextView f203190a;

            /* renamed from: b */
            public TextView f203191b;

            /* renamed from: c */
            public TextView f203192c;

            /* renamed from: d */
            public CheckBox f203193d;

            public C70346a(C70345i iVar) {
            }
        }

        public C70345i(Context context) {
            this.f203187d = context;
        }

        /* renamed from: a */
        public final String mo96845a(C67038p pVar) {
            if (pVar == null) {
                return null;
            }
            String str = pVar.f192578h;
            char charAt = str.length() > 1 ? str.charAt(0) : '~';
            if (charAt != '{') {
                return (charAt == '~' || !Util.isAlpha(charAt)) ? "~" : String.valueOf(charAt);
            }
            char charAt2 = str.charAt(1);
            return Util.isNum(charAt2) ? String.valueOf(charAt2) : "~";
        }

        public int getCount() {
            return MailAddrListUI.this.f203178i.size();
        }

        public Object getItem(int i) {
            return MailAddrListUI.this.f203178i.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C70346a aVar;
            C67038p pVar = null;
            if (view == null || view.getTag() == null) {
                aVar = new C70346a(this);
                view = View.inflate(this.f203187d, C0966R.C0971layout.boy, (ViewGroup) null);
                aVar.f203190a = (TextView) view.findViewById(C0966R.C0970id.i9m);
                aVar.f203191b = (TextView) view.findViewById(C0966R.C0970id.i9o);
                aVar.f203192c = (TextView) view.findViewById(C0966R.C0970id.i9l);
                aVar.f203193d = (CheckBox) view.findViewById(C0966R.C0970id.i9p);
                view.setTag(aVar);
            } else {
                aVar = (C70346a) view.getTag();
            }
            C67038p pVar2 = MailAddrListUI.this.f203178i.get(i);
            boolean z = true;
            if (i > 0) {
                pVar = MailAddrListUI.this.f203178i.get(i - 1);
            }
            String a = mo96845a(pVar2);
            String a2 = mo96845a(pVar);
            if (a == null) {
                aVar.f203190a.setVisibility(8);
            } else if (!a.equals(a2)) {
                aVar.f203190a.setText(a.toUpperCase());
                aVar.f203190a.setVisibility(0);
            } else {
                aVar.f203190a.setVisibility(8);
            }
            aVar.f203191b.setText(pVar2.f192575e);
            aVar.f203192c.setText(pVar2.f192576f);
            CheckBox checkBox = aVar.f203193d;
            if (((HashMap) this.f203188e).get(pVar2.f192576f) == null) {
                z = false;
            }
            checkBox.setChecked(z);
            return view;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.box;
    }

    public void initView() {
        this.f203175f = (ListView) findViewById(C0966R.C0970id.i9q);
        this.f203174e = (TextView) findViewById(C0966R.C0970id.cja);
        this.f203177h = new C70345i(this);
        C106742j1 j1Var = new C106742j1(true, true);
        j1Var.f319122j = new C70338b();
        addSearchMenu(true, j1Var);
        this.f203175f.setAdapter(this.f203177h);
        this.f203175f.setOnItemClickListener(new C70339c());
        this.f203175f.setOnScrollListener(new C70340d());
        this.f203178i = this.f203176g.mo91026e((String) null);
        this.f203177h.notifyDataSetChanged();
        setBackBtn(new C70341e());
        setToTop(new C70342f());
        addTextOptionMenu(0, getString(C0966R.string.hk8), new C70343g());
        enableOptionMenu(!this.f203178i.isEmpty());
        this.f203173d = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.hk7), true, true, new C70344h(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.hk9);
        this.f203178i = new ArrayList();
        this.f203176g = ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI().f233202b;
        initView();
        this.f203176g.mo91023b(this.f203179j);
        this.f203176g.mo91025d();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f203176g.mo91027f(this.f203179j);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f203177h.notifyDataSetChanged();
    }
}
