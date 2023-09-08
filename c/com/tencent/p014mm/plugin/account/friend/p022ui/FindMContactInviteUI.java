package com.tencent.p014mm.plugin.account.friend.p022ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
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
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import hg0.C76176q;
import ig0.C76339e;
import ig0.C76340f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import lj3.C10541a;
import lj3.C46863b;
import mg0.C76754b;
import nj3.C76879j;
import ob0.C11385n;
import p214om.C11502f;
import p447aw.C103918d;
import wc3.C15131b;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI */
public class FindMContactInviteUI extends MMWizardActivity {

    /* renamed from: e */
    public ListView f196568e;

    /* renamed from: f */
    public C76176q f196569f;

    /* renamed from: g */
    public ProgressDialog f196570g = null;

    /* renamed from: h */
    public View f196571h;

    /* renamed from: i */
    public TextView f196572i = null;

    /* renamed from: j */
    public TextView f196573j = null;

    /* renamed from: n */
    public TextView f196574n = null;

    /* renamed from: o */
    public TextView f196575o = null;

    /* renamed from: p */
    public Button f196576p = null;

    /* renamed from: q */
    public String f196577q = null;

    /* renamed from: r */
    public C11385n f196578r = null;

    /* renamed from: s */
    public int f196579s = 2;

    /* renamed from: t */
    public int f196580t;

    /* renamed from: u */
    public List<String[]> f196581u;

    /* renamed from: v */
    public String f196582v;

    /* renamed from: w */
    public boolean f196583w = true;

    /* renamed from: x */
    public C76176q.C76182f f196584x = new C68414e();

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI$a */
    public class C68410a implements DialogInterface.OnClickListener {
        public C68410a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FindMContactInviteUI.this.getContext());
            FindMContactInviteUI findMContactInviteUI = FindMContactInviteUI.this;
            findMContactInviteUI.f196583w = true;
            findMContactInviteUI.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI$b */
    public class C68411b implements DialogInterface.OnClickListener {
        public C68411b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            FindMContactInviteUI findMContactInviteUI = FindMContactInviteUI.this;
            findMContactInviteUI.f196583w = true;
            findMContactInviteUI.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI$c */
    public class C68412c implements DialogInterface.OnCancelListener {
        public C68412c(FindMContactInviteUI findMContactInviteUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI$d */
    public class C68413d implements MMHandlerThread.IWaitWorkThread {
        public C68413d() {
        }

        public boolean doInBackground() {
            try {
                FindMContactInviteUI findMContactInviteUI = FindMContactInviteUI.this;
                findMContactInviteUI.f196581u = C15131b.m14241e(findMContactInviteUI);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FindMContactInviteUI", e, "", new Object[0]);
            }
            FindMContactInviteUI findMContactInviteUI2 = FindMContactInviteUI.this;
            C76176q qVar = findMContactInviteUI2.f196569f;
            qVar.f223192g = findMContactInviteUI2.f196581u;
            qVar.mo106436g(((C76754b) C86312j.m106911c(C76754b.class)).mo105742Vj());
            return true;
        }

        public boolean onPostExecute() {
            ProgressDialog progressDialog = FindMContactInviteUI.this.f196570g;
            if (progressDialog != null) {
                progressDialog.dismiss();
                FindMContactInviteUI.this.f196570g = null;
            }
            FindMContactInviteUI.this.f196569f.notifyDataSetChanged();
            return false;
        }

        public String toString() {
            return super.toString() + "|listMFriendData";
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI$e */
    public class C68414e implements C76176q.C76182f {
        public C68414e() {
        }

        public void notifyDataSetChanged() {
            FindMContactInviteUI findMContactInviteUI = FindMContactInviteUI.this;
            int i = findMContactInviteUI.f196579s;
            if (i == 2) {
                findMContactInviteUI.f196576p.setText(findMContactInviteUI.getString(C0966R.string.cwt, new Object[]{Integer.valueOf(findMContactInviteUI.f196569f.getCount())}));
            } else if (i == 1) {
                findMContactInviteUI.f196576p.setText(findMContactInviteUI.getString(C0966R.string.cwu));
            } else {
                findMContactInviteUI.f196576p.setText(findMContactInviteUI.getString(C0966R.string.cwt, new Object[]{Integer.valueOf(findMContactInviteUI.f196569f.getCount())}));
            }
            if (FindMContactInviteUI.this.f196569f.mo106434d()) {
                FindMContactInviteUI findMContactInviteUI2 = FindMContactInviteUI.this;
                if (findMContactInviteUI2.f196579s != 1 && findMContactInviteUI2.f196576p.getVisibility() == 0) {
                    FindMContactInviteUI findMContactInviteUI3 = FindMContactInviteUI.this;
                    if (findMContactInviteUI3.f196575o != null) {
                        findMContactInviteUI3.f196576p.setVisibility(8);
                        FindMContactInviteUI.this.f196575o.setVisibility(0);
                    }
                }
            } else {
                FindMContactInviteUI findMContactInviteUI4 = FindMContactInviteUI.this;
                if (findMContactInviteUI4.f196579s != 1 && findMContactInviteUI4.f196576p.getVisibility() == 8) {
                    FindMContactInviteUI findMContactInviteUI5 = FindMContactInviteUI.this;
                    if (findMContactInviteUI5.f196575o != null) {
                        findMContactInviteUI5.f196576p.setVisibility(0);
                        FindMContactInviteUI.this.f196575o.setVisibility(8);
                    }
                }
            }
            if (FindMContactInviteUI.this.f196569f.mo106433b() > 0) {
                FindMContactInviteUI findMContactInviteUI6 = FindMContactInviteUI.this;
                if (findMContactInviteUI6.f196579s != 1) {
                    findMContactInviteUI6.f196572i.setText(findMContactInviteUI6.getResources().getQuantityString(C0966R.plurals.f7226g, FindMContactInviteUI.this.f196569f.mo106433b(), new Object[]{Integer.valueOf(FindMContactInviteUI.this.f196569f.mo106433b())}));
                    return;
                }
            }
            FindMContactInviteUI findMContactInviteUI7 = FindMContactInviteUI.this;
            findMContactInviteUI7.f196572i.setText(findMContactInviteUI7.getResources().getQuantityString(C0966R.plurals.f7227h, FindMContactInviteUI.this.f196569f.getCount(), new Object[]{Integer.valueOf(FindMContactInviteUI.this.f196569f.getCount())}));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI$f */
    public class C68415f implements View.OnClickListener {
        public C68415f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(FindMContactInviteUI.this.getClass().getName());
            sb.append(",");
            sb.append("R300_400_AddAllButton");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_300_AddAllButton"));
            sb.append(",");
            sb.append(3);
            C78595a.m94982b(10645, sb.toString());
            FindMContactInviteUI findMContactInviteUI = FindMContactInviteUI.this;
            int i = findMContactInviteUI.f196579s;
            if (i == 2) {
                findMContactInviteUI.f196569f.mo106435f(true);
                FindMContactInviteUI.this.f196569f.notifyDataSetChanged();
                FindMContactInviteUI.this.f196576p.setVisibility(8);
                TextView textView = FindMContactInviteUI.this.f196575o;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else if (i == 1) {
                findMContactInviteUI.f196569f.mo106435f(true);
                FindMContactInviteUI.this.f196569f.notifyDataSetChanged();
                FindMContactInviteUI.m80741N7(FindMContactInviteUI.this);
            } else {
                findMContactInviteUI.f196569f.mo106435f(true);
                FindMContactInviteUI.this.f196569f.notifyDataSetChanged();
                FindMContactInviteUI.this.f196576p.setVisibility(8);
                TextView textView2 = FindMContactInviteUI.this.f196575o;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI$g */
    public class C68416g implements View.OnClickListener {
        public C68416g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FindMContactInviteUI.this.f196576p.setVisibility(0);
            FindMContactInviteUI.this.f196575o.setVisibility(8);
            FindMContactInviteUI.this.f196569f.mo106435f(false);
            FindMContactInviteUI.this.f196569f.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI$h */
    public class C68417h implements View.OnTouchListener {
        public C68417h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C46863b bVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C76176q qVar = FindMContactInviteUI.this.f196569f;
            if (!(qVar == null || (bVar = qVar.f223197o) == null)) {
                bVar.mo72073c(motionEvent);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI$i */
    public class C68418i implements MenuItem.OnMenuItemClickListener {
        public C68418i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FindMContactInviteUI.m80741N7(FindMContactInviteUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI$j */
    public class C68419j implements View.OnClickListener {
        public C68419j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = FindMContactInviteUI.this.f196568e;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$8", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$8", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: N7 */
    public static void m80741N7(FindMContactInviteUI findMContactInviteUI) {
        findMContactInviteUI.hideVKB();
        if (findMContactInviteUI.f196569f.mo106433b() == 0) {
            C78595a.m94985e(findMContactInviteUI.f196582v);
            findMContactInviteUI.hideVKB();
            findMContactInviteUI.mo7681K7(1);
            return;
        }
        C76879j.m92750u(findMContactInviteUI, findMContactInviteUI.getString(C0966R.string.cws), "", new C76340f(findMContactInviteUI), new C76339e(findMContactInviteUI));
    }

    /* renamed from: O7 */
    public final void mo93964O7() {
        this.f196570g = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.gti), true, true, new C68412c(this));
        C86709a0.m107525e().postAtFrontOfWorker(new C68413d());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a8d;
    }

    public void initView() {
        ((TextView) findViewById(C0966R.C0970id.gvx)).setText(C0966R.string.gtg);
        this.f196568e = (ListView) findViewById(C0966R.C0970id.gvz);
        int i = this.f196579s;
        if (i == 2) {
            View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.a8e, (ViewGroup) null);
            this.f196571h = inflate;
            this.f196572i = (TextView) inflate.findViewById(C0966R.C0970id.e95);
            this.f196573j = (TextView) this.f196571h.findViewById(C0966R.C0970id.e98);
            this.f196574n = (TextView) this.f196571h.findViewById(C0966R.C0970id.d39);
            this.f196576p = (Button) this.f196571h.findViewById(C0966R.C0970id.d38);
            this.f196573j.setText(getString(C0966R.string.cwy));
            this.f196574n.setText(getString(C0966R.string.cwv));
            this.f196576p.setText(getString(C0966R.string.cwt, new Object[]{0}));
            this.f196575o = (TextView) this.f196571h.findViewById(C0966R.C0970id.gvs);
        } else if (i == 1) {
            View inflate2 = LayoutInflater.from(this).inflate(C0966R.C0971layout.a8f, (ViewGroup) null);
            this.f196571h = inflate2;
            this.f196572i = (TextView) inflate2.findViewById(C0966R.C0970id.e95);
            this.f196573j = (TextView) this.f196571h.findViewById(C0966R.C0970id.e98);
            this.f196574n = (TextView) this.f196571h.findViewById(C0966R.C0970id.d39);
            this.f196576p = (Button) this.f196571h.findViewById(C0966R.C0970id.d38);
            this.f196573j.setText(getString(C0966R.string.cwv));
            this.f196574n.setText(getString(C0966R.string.cwv));
            this.f196576p.setText(getString(C0966R.string.cwu));
        } else {
            View inflate3 = LayoutInflater.from(this).inflate(C0966R.C0971layout.a8e, (ViewGroup) null);
            this.f196571h = inflate3;
            this.f196572i = (TextView) inflate3.findViewById(C0966R.C0970id.e95);
            this.f196573j = (TextView) this.f196571h.findViewById(C0966R.C0970id.e98);
            this.f196574n = (TextView) this.f196571h.findViewById(C0966R.C0970id.d39);
            this.f196576p = (Button) this.f196571h.findViewById(C0966R.C0970id.d38);
            this.f196573j.setText(getString(C0966R.string.cwy));
            this.f196574n.setText(getString(C0966R.string.cwv));
            this.f196576p.setText(getString(C0966R.string.cwt, new Object[]{0}));
            this.f196575o = (TextView) this.f196571h.findViewById(C0966R.C0970id.gvs);
        }
        this.f196569f = new C76176q(this, this.f196584x, 2);
        this.f196576p.setOnClickListener(new C68415f());
        TextView textView = this.f196575o;
        if (textView != null) {
            textView.setOnClickListener(new C68416g());
            this.f196575o.setVisibility(8);
        }
        this.f196568e.addHeaderView(this.f196571h);
        this.f196568e.setAdapter(this.f196569f);
        this.f196568e.setOnScrollListener(new C10541a());
        this.f196568e.setOnTouchListener(new C68417h());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C68418i());
        setToTop(new C68419j());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cwx);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
        this.f196577q = getIntent().getStringExtra("regsetinfo_ticket");
        this.f196580t = getIntent().getIntExtra("login_type", 0);
        this.f196579s = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
        this.f196582v = C78595a.m94981a();
        initView();
    }

    public void onDestroy() {
        C46863b bVar;
        if (this.f196578r != null) {
            C86709a0.m107524d().mo123470p(v2helper.EMethodSetSendToNetworkOn, this.f196578r);
            this.f196578r = null;
        }
        C76176q qVar = this.f196569f;
        if (!(qVar == null || (bVar = qVar.f223197o) == null)) {
            bVar.mo72071a();
            qVar.f223197o = null;
        }
        ((C76754b) C86312j.m106911c(C76754b.class)).mo105741VY();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C78595a.m94985e(this.f196582v);
        hideVKB();
        mo7681K7(1);
        return true;
    }

    public void onPause() {
        super.onPause();
        if (this.f196580t == 1) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R300_400_QQ");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_400_QQ"));
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
        sb4.append("R300_400_phone");
        sb4.append(",");
        C86709a0.m107523b();
        sb4.append(C86718e.m107548f("R300_400_phone"));
        sb4.append(",");
        sb4.append(2);
        C78595a.m94983c(10645, false, sb4.toString());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.FindMContactInviteUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.FindMContactInviteUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 48) {
            if (iArr[0] == 0) {
                mo93964O7();
                return;
            }
            this.f196583w = false;
            C76879j.m92709C(this, getString(C0966R.string.hhs), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C68410a(), new C68411b());
        }
    }

    public void onResume() {
        super.onResume();
        this.f196569f.notifyDataSetChanged();
        if (this.f196580t == 1) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R300_400_QQ");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_400_QQ"));
            sb.append(",");
            sb.append(1);
            C78595a.m94983c(10645, true, sb.toString());
        } else {
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107523b();
            sb4.append(C86718e.m107547e());
            sb4.append(",");
            sb4.append(getClass().getName());
            sb4.append(",");
            sb4.append("R300_400_phone");
            sb4.append(",");
            C86709a0.m107523b();
            sb4.append(C86718e.m107548f("R300_400_phone"));
            sb4.append(",");
            sb4.append(1);
            C78595a.m94983c(10645, true, sb4.toString());
        }
        if (this.f196583w) {
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.READ_CONTACTS", 48, (String) null, (String) null);
            Log.m105925i("MicroMsg.FindMContactInviteUI", "summerper checkPermission checkContacts[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
            if (z1) {
                mo93964O7();
            }
        }
    }
}
