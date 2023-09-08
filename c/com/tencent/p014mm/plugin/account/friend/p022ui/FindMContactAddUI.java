package com.tencent.p014mm.plugin.account.friend.p022ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import hg0.C76176q;
import ig0.C76335a;
import ig0.C76336b;
import ig0.C76337c;
import ig0.C76338d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import mg0.C76754b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C89137b0;
import p011cm.C39989b;
import p214om.C11502f;
import p447aw.C103918d;
import wc3.C15131b;
import wd3.C78553c1;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI */
public class FindMContactAddUI extends MMWizardActivity {

    /* renamed from: e */
    public ListView f196542e;

    /* renamed from: f */
    public C76176q f196543f;

    /* renamed from: g */
    public ProgressDialog f196544g = null;

    /* renamed from: h */
    public View f196545h;

    /* renamed from: i */
    public TextView f196546i = null;

    /* renamed from: j */
    public TextView f196547j = null;

    /* renamed from: n */
    public TextView f196548n = null;

    /* renamed from: o */
    public TextView f196549o = null;

    /* renamed from: p */
    public Button f196550p = null;

    /* renamed from: q */
    public String f196551q = null;

    /* renamed from: r */
    public C11385n f196552r = null;

    /* renamed from: s */
    public String f196553s = "";

    /* renamed from: t */
    public int f196554t = 2;

    /* renamed from: u */
    public int f196555u;

    /* renamed from: v */
    public List<String[]> f196556v;

    /* renamed from: w */
    public String f196557w;

    /* renamed from: x */
    public boolean f196558x = true;

    /* renamed from: y */
    public C76176q.C76182f f196559y = new C68405e();

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI$a */
    public class C68401a implements DialogInterface.OnClickListener {
        public C68401a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FindMContactAddUI.this.getContext());
            FindMContactAddUI findMContactAddUI = FindMContactAddUI.this;
            findMContactAddUI.f196558x = true;
            findMContactAddUI.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI$b */
    public class C68402b implements DialogInterface.OnClickListener {
        public C68402b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            FindMContactAddUI findMContactAddUI = FindMContactAddUI.this;
            findMContactAddUI.f196558x = true;
            findMContactAddUI.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI$c */
    public class C68403c implements DialogInterface.OnCancelListener {
        public C68403c(FindMContactAddUI findMContactAddUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI$d */
    public class C68404d implements MMHandlerThread.IWaitWorkThread {
        public C68404d() {
        }

        public boolean doInBackground() {
            try {
                FindMContactAddUI findMContactAddUI = FindMContactAddUI.this;
                findMContactAddUI.f196556v = C15131b.m14241e(findMContactAddUI);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FindMContactAddUI", e, "", new Object[0]);
            }
            FindMContactAddUI findMContactAddUI2 = FindMContactAddUI.this;
            C76176q qVar = findMContactAddUI2.f196543f;
            qVar.f223192g = findMContactAddUI2.f196556v;
            qVar.mo106436g(((C76754b) C86312j.m106911c(C76754b.class)).mo105742Vj());
            return true;
        }

        public boolean onPostExecute() {
            ProgressDialog progressDialog = FindMContactAddUI.this.f196544g;
            if (progressDialog != null) {
                progressDialog.dismiss();
                FindMContactAddUI.this.f196544g = null;
            }
            FindMContactAddUI.this.f196543f.notifyDataSetChanged();
            return false;
        }

        public String toString() {
            return super.toString() + "|listMFriendData";
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI$e */
    public class C68405e implements C76176q.C76182f {
        public C68405e() {
        }

        public void notifyDataSetChanged() {
            FindMContactAddUI findMContactAddUI = FindMContactAddUI.this;
            int i = findMContactAddUI.f196554t;
            if (i == 2) {
                findMContactAddUI.f196550p.setText(findMContactAddUI.getString(C0966R.string.cwk, new Object[]{Integer.valueOf(findMContactAddUI.f196543f.getCount())}));
            } else if (i == 1) {
                findMContactAddUI.f196550p.setText(findMContactAddUI.getString(C0966R.string.cwl));
            } else {
                findMContactAddUI.f196550p.setText(findMContactAddUI.getString(C0966R.string.cwk, new Object[]{Integer.valueOf(findMContactAddUI.f196543f.getCount())}));
            }
            if (FindMContactAddUI.this.f196543f.mo106434d()) {
                FindMContactAddUI findMContactAddUI2 = FindMContactAddUI.this;
                if (findMContactAddUI2.f196554t != 1 && findMContactAddUI2.f196550p.getVisibility() == 0) {
                    FindMContactAddUI findMContactAddUI3 = FindMContactAddUI.this;
                    if (findMContactAddUI3.f196549o != null) {
                        findMContactAddUI3.f196550p.setVisibility(8);
                        FindMContactAddUI.this.f196549o.setVisibility(0);
                    }
                }
            } else {
                FindMContactAddUI findMContactAddUI4 = FindMContactAddUI.this;
                if (findMContactAddUI4.f196554t != 1 && findMContactAddUI4.f196550p.getVisibility() == 8) {
                    FindMContactAddUI findMContactAddUI5 = FindMContactAddUI.this;
                    if (findMContactAddUI5.f196549o != null) {
                        findMContactAddUI5.f196550p.setVisibility(0);
                        FindMContactAddUI.this.f196549o.setVisibility(8);
                    }
                }
            }
            if (FindMContactAddUI.this.f196543f.mo106433b() > 0) {
                FindMContactAddUI findMContactAddUI6 = FindMContactAddUI.this;
                if (findMContactAddUI6.f196554t != 1) {
                    findMContactAddUI6.f196546i.setText(findMContactAddUI6.getResources().getQuantityString(C0966R.plurals.f7225f, FindMContactAddUI.this.f196543f.mo106433b(), new Object[]{Integer.valueOf(FindMContactAddUI.this.f196543f.mo106433b())}));
                    return;
                }
            }
            FindMContactAddUI findMContactAddUI7 = FindMContactAddUI.this;
            findMContactAddUI7.f196546i.setText(findMContactAddUI7.getResources().getQuantityString(C0966R.plurals.f7228i, FindMContactAddUI.this.f196543f.getCount(), new Object[]{Integer.valueOf(FindMContactAddUI.this.f196543f.getCount())}));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI$f */
    public class C68406f implements View.OnClickListener {
        public C68406f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(FindMContactAddUI.this.getClass().getName());
            sb.append(",");
            sb.append("R300_300_AddAllButton");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_300_AddAllButton"));
            sb.append(",");
            sb.append(3);
            C78595a.m94982b(10645, sb.toString());
            FindMContactAddUI findMContactAddUI = FindMContactAddUI.this;
            int i = findMContactAddUI.f196554t;
            if (i == 2) {
                findMContactAddUI.f196543f.mo106435f(true);
                FindMContactAddUI.this.f196543f.notifyDataSetChanged();
                FindMContactAddUI.this.f196550p.setVisibility(8);
                TextView textView = FindMContactAddUI.this.f196549o;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else if (i == 1) {
                findMContactAddUI.f196543f.mo106435f(true);
                FindMContactAddUI.this.f196543f.notifyDataSetChanged();
                FindMContactAddUI.m80738N7(FindMContactAddUI.this);
            } else {
                findMContactAddUI.f196543f.mo106435f(true);
                FindMContactAddUI.this.f196543f.notifyDataSetChanged();
                FindMContactAddUI.this.f196550p.setVisibility(8);
                TextView textView2 = FindMContactAddUI.this.f196549o;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI$g */
    public class C68407g implements View.OnClickListener {
        public C68407g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FindMContactAddUI.this.f196550p.setVisibility(0);
            FindMContactAddUI.this.f196549o.setVisibility(8);
            FindMContactAddUI.this.f196543f.mo106435f(false);
            FindMContactAddUI.this.f196543f.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI$h */
    public class C68408h implements MenuItem.OnMenuItemClickListener {
        public C68408h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FindMContactAddUI.m80738N7(FindMContactAddUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI$i */
    public class C68409i implements View.OnClickListener {
        public C68409i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = FindMContactAddUI.this.f196542e;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$7", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$7", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: N7 */
    public static void m80738N7(FindMContactAddUI findMContactAddUI) {
        findMContactAddUI.hideVKB();
        if (findMContactAddUI.f196543f.mo106433b() == 0) {
            C76879j.m92707A(findMContactAddUI, findMContactAddUI.getString(C0966R.string.cx6), "", findMContactAddUI.getString(C0966R.string.cwi), findMContactAddUI.getString(C0966R.string.cwj), new C76337c(findMContactAddUI), new C76338d(findMContactAddUI));
            return;
        }
        C89137b0 d = C86709a0.m107524d();
        C76335a aVar = new C76335a(findMContactAddUI);
        findMContactAddUI.f196552r = aVar;
        d.mo123455a(30, aVar);
        findMContactAddUI.f196544g = C76879j.m92723Q(findMContactAddUI.getContext(), findMContactAddUI.getString(C0966R.string.a3h), findMContactAddUI.getString(C0966R.string.cww), true, true, new C76336b(findMContactAddUI));
        C76176q qVar = findMContactAddUI.f196543f;
        qVar.getClass();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (int i = 0; i < qVar.f223190e.size(); i++) {
            if (qVar.f223194i[i] == 1) {
                linkedList.add(qVar.f223190e.get(i).f132451e);
                linkedList2.add(52);
            }
        }
        ((C78553c1) ((C39989b) C86312j.m106911c(C39989b.class)).Sv0(qVar.f223189d, (C39989b.C39992e) null)).mo108533i(linkedList, linkedList2);
    }

    /* renamed from: O7 */
    public final void mo93953O7() {
        C78595a.m94985e(this.f196557w);
        hideVKB();
        mo7681K7(1);
    }

    /* renamed from: P7 */
    public final void mo93954P7() {
        this.f196544g = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.gti), true, true, new C68403c(this));
        C86709a0.m107525e().postAtFrontOfWorker(new C68404d());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a8d;
    }

    public void initView() {
        ((TextView) findViewById(C0966R.C0970id.gvx)).setText(C0966R.string.gtg);
        this.f196542e = (ListView) findViewById(C0966R.C0970id.gvz);
        int i = this.f196554t;
        if (i == 2) {
            View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.a8e, (ViewGroup) null);
            this.f196545h = inflate;
            this.f196546i = (TextView) inflate.findViewById(C0966R.C0970id.e95);
            this.f196547j = (TextView) this.f196545h.findViewById(C0966R.C0970id.e98);
            this.f196548n = (TextView) this.f196545h.findViewById(C0966R.C0970id.d39);
            this.f196550p = (Button) this.f196545h.findViewById(C0966R.C0970id.d38);
            this.f196547j.setText(getString(C0966R.string.cxg));
            this.f196548n.setText(getString(C0966R.string.cxh));
            this.f196550p.setText(getString(C0966R.string.cwk, new Object[]{0}));
            this.f196549o = (TextView) this.f196545h.findViewById(C0966R.C0970id.gvs);
        } else if (i == 1) {
            View inflate2 = LayoutInflater.from(this).inflate(C0966R.C0971layout.a8f, (ViewGroup) null);
            this.f196545h = inflate2;
            this.f196546i = (TextView) inflate2.findViewById(C0966R.C0970id.e95);
            this.f196547j = (TextView) this.f196545h.findViewById(C0966R.C0970id.e98);
            this.f196548n = (TextView) this.f196545h.findViewById(C0966R.C0970id.d39);
            this.f196550p = (Button) this.f196545h.findViewById(C0966R.C0970id.d38);
            this.f196547j.setText(getString(C0966R.string.cxg));
            this.f196548n.setText(getString(C0966R.string.cxh));
            this.f196550p.setText(getString(C0966R.string.cwl));
        } else {
            View inflate3 = LayoutInflater.from(this).inflate(C0966R.C0971layout.a8e, (ViewGroup) null);
            this.f196545h = inflate3;
            this.f196546i = (TextView) inflate3.findViewById(C0966R.C0970id.e95);
            this.f196547j = (TextView) this.f196545h.findViewById(C0966R.C0970id.e98);
            this.f196548n = (TextView) this.f196545h.findViewById(C0966R.C0970id.d39);
            this.f196550p = (Button) this.f196545h.findViewById(C0966R.C0970id.d38);
            this.f196547j.setText(getString(C0966R.string.cxg));
            this.f196548n.setText(getString(C0966R.string.cxh));
            this.f196550p.setText(getString(C0966R.string.cwk, new Object[]{0}));
            this.f196549o = (TextView) this.f196545h.findViewById(C0966R.C0970id.gvs);
        }
        this.f196543f = new C76176q(this, this.f196559y, 1);
        this.f196550p.setOnClickListener(new C68406f());
        TextView textView = this.f196549o;
        if (textView != null) {
            textView.setOnClickListener(new C68407g());
            this.f196549o.setVisibility(8);
        }
        this.f196542e.addHeaderView(this.f196545h);
        this.f196542e.setAdapter(this.f196543f);
        addTextOptionMenu(0, getString(C0966R.string.f360089a13), new C68408h());
        setToTop(new C68409i());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cwp);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
        this.f196551q = getIntent().getStringExtra("regsetinfo_ticket");
        this.f196553s = getIntent().getStringExtra("regsetinfo_NextStep");
        this.f196554t = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
        this.f196555u = getIntent().getIntExtra("login_type", 0);
        this.f196557w = C78595a.m94981a();
        initView();
    }

    public void onDestroy() {
        if (this.f196552r != null) {
            C86709a0.m107524d().mo123470p(30, this.f196552r);
            this.f196552r = null;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo93953O7();
        return true;
    }

    public void onPause() {
        super.onPause();
        if (this.f196555u == 1) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R300_300_QQ");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_300_QQ"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, false, sb.toString());
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        C86709a0.m107523b();
        sb4.append(C86718e.m107547e());
        sb4.append(",");
        sb4.append(getClass().getName());
        sb4.append(",");
        sb4.append("R300_300_phone");
        sb4.append(",");
        C86709a0.m107523b();
        sb4.append(C86718e.m107548f("R300_300_phone"));
        sb4.append(",");
        sb4.append(2);
        C78595a.m94983c(10645, false, sb4.toString());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.FindMContactAddUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.FindMContactAddUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 48) {
            if (iArr[0] == 0) {
                mo93954P7();
                return;
            }
            this.f196558x = false;
            C76879j.m92709C(this, getString(C0966R.string.hhs), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C68401a(), new C68402b());
        }
    }

    public void onResume() {
        super.onResume();
        this.f196543f.notifyDataSetChanged();
        if (this.f196555u == 1) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R300_300_QQ");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_300_QQ"));
            sb.append(",");
            sb.append(1);
            C78595a.m94983c(10645, true, sb.toString());
            C78595a.m94984d("R300_300_QQ");
        } else {
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107523b();
            sb4.append(C86718e.m107547e());
            sb4.append(",");
            sb4.append(getClass().getName());
            sb4.append(",");
            sb4.append("R300_300_phone");
            sb4.append(",");
            C86709a0.m107523b();
            sb4.append(C86718e.m107548f("R300_300_phone"));
            sb4.append(",");
            sb4.append(1);
            C78595a.m94983c(10645, true, sb4.toString());
            C78595a.m94984d("R300_300_phone");
        }
        if (this.f196558x) {
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.READ_CONTACTS", 48, (String) null, (String) null);
            Log.m105925i("MicroMsg.FindMContactAddUI", "summerper checkPermission checkContacts[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
            if (z1) {
                mo93954P7();
            }
        }
    }
}
