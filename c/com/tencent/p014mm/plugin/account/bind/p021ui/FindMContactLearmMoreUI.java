package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.friend.p022ui.FindMContactAddUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import hg0.C46062s0;
import hg0.C76186t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mg0.C76754b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p447aw.C103918d;
import p910lj.C76701a;
import te3.C49174do2;
import wc3.C15131b;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI */
public class FindMContactLearmMoreUI extends MMWizardActivity {

    /* renamed from: q */
    public static final /* synthetic */ int f344374q = 0;

    /* renamed from: e */
    public String f344375e = null;

    /* renamed from: f */
    public String f344376f = "";

    /* renamed from: g */
    public int f344377g = 2;

    /* renamed from: h */
    public List<String[]> f344378h = null;

    /* renamed from: i */
    public C11385n f344379i = null;

    /* renamed from: j */
    public ProgressDialog f344380j = null;

    /* renamed from: n */
    public C46062s0 f344381n;

    /* renamed from: o */
    public Button f344382o;

    /* renamed from: p */
    public TextView f344383p;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI$a */
    public class C114886a implements View.OnClickListener {
        public C114886a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/FindMContactLearmMoreUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76186t.m91542j(true);
            ((C76754b) C86312j.m106911c(C76754b.class)).mo105744cx(true, false);
            FindMContactLearmMoreUI findMContactLearmMoreUI = FindMContactLearmMoreUI.this;
            int i = FindMContactLearmMoreUI.f344374q;
            findMContactLearmMoreUI.mo174571N7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/FindMContactLearmMoreUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI$b */
    public class C114887b implements View.OnClickListener {
        public C114887b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/FindMContactLearmMoreUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76186t.m91542j(false);
            ((C76754b) C86312j.m106911c(C76754b.class)).mo105744cx(true, false);
            FindMContactLearmMoreUI findMContactLearmMoreUI = FindMContactLearmMoreUI.this;
            int i = FindMContactLearmMoreUI.f344374q;
            findMContactLearmMoreUI.mo174572O7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/FindMContactLearmMoreUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI$c */
    public class C114888c implements C11385n {
        public C114888c() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3;
            boolean z;
            ProgressDialog progressDialog = FindMContactLearmMoreUI.this.f344380j;
            if (progressDialog != null) {
                progressDialog.dismiss();
                FindMContactLearmMoreUI.this.f344380j = null;
            }
            if (FindMContactLearmMoreUI.this.f344379i != null) {
                C86709a0.m107524d().mo123470p(431, FindMContactLearmMoreUI.this.f344379i);
                FindMContactLearmMoreUI.this.f344379i = null;
            }
            if (i == 0 && i2 == 0) {
                LinkedList<C49174do2> j1 = ((C46062s0) yVar).mo71476j1();
                ((C76754b) C86312j.m106911c(C76754b.class)).Sw0(j1);
                if (j1 == null || j1.size() <= 0) {
                    z = false;
                    i3 = 0;
                } else {
                    Iterator<C49174do2> it = j1.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        C49174do2 next = it.next();
                        if (next != null && next.f132452f == 1) {
                            i3++;
                        }
                    }
                    z = i3 > 0;
                }
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(j1 == null ? 0 : j1.size());
                objArr[1] = Integer.valueOf(i3);
                Log.m105919d("MicroMsg.FindMContactLearmMoreUI", "tigerreg data size=%d, addcount=%s", objArr);
                String str2 = FindMContactLearmMoreUI.this.f344376f;
                if (str2 == null || !str2.contains("1") || !z) {
                    FindMContactLearmMoreUI.this.mo174572O7();
                    return;
                }
                C78595a.m94985e("R300_300_phone");
                Intent intent = new Intent(FindMContactLearmMoreUI.this, FindMContactAddUI.class);
                intent.putExtra("regsetinfo_ticket", FindMContactLearmMoreUI.this.f344375e);
                intent.putExtra("regsetinfo_NextStep", FindMContactLearmMoreUI.this.f344376f);
                intent.putExtra("regsetinfo_NextStyle", FindMContactLearmMoreUI.this.f344377g);
                intent.putExtra("login_type", 0);
                MMWizardActivity.m7017L7(FindMContactLearmMoreUI.this, intent);
                return;
            }
            FindMContactLearmMoreUI findMContactLearmMoreUI = FindMContactLearmMoreUI.this;
            C76701a.makeText((Context) findMContactLearmMoreUI, (CharSequence) findMContactLearmMoreUI.getString(C0966R.string.f7966xq, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            FindMContactLearmMoreUI.this.mo174572O7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI$d */
    public class C114889d implements DialogInterface.OnCancelListener {
        public C114889d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (FindMContactLearmMoreUI.this.f344379i != null) {
                C86709a0.m107524d().mo123470p(431, FindMContactLearmMoreUI.this.f344379i);
                FindMContactLearmMoreUI.this.f344379i = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI$e */
    public class C114890e implements MMHandlerThread.IWaitWorkThread {
        public C114890e() {
        }

        public boolean doInBackground() {
            try {
                FindMContactLearmMoreUI findMContactLearmMoreUI = FindMContactLearmMoreUI.this;
                findMContactLearmMoreUI.f344378h = C15131b.m14241e(findMContactLearmMoreUI);
                StringBuilder sb = new StringBuilder();
                sb.append("tigerreg mobileList size ");
                List<String[]> list = FindMContactLearmMoreUI.this.f344378h;
                sb.append(list == null ? 0 : list.size());
                Log.m105918d("MicroMsg.FindMContactLearmMoreUI", sb.toString());
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FindMContactLearmMoreUI", e, "", new Object[0]);
                return true;
            }
        }

        public boolean onPostExecute() {
            List<String[]> list = FindMContactLearmMoreUI.this.f344378h;
            if (list == null || list.size() == 0) {
                ProgressDialog progressDialog = FindMContactLearmMoreUI.this.f344380j;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    FindMContactLearmMoreUI.this.f344380j = null;
                }
                FindMContactLearmMoreUI.this.mo174572O7();
                return false;
            }
            FindMContactLearmMoreUI findMContactLearmMoreUI = FindMContactLearmMoreUI.this;
            findMContactLearmMoreUI.f344381n = new C46062s0(findMContactLearmMoreUI.f344375e, (List<String>) null, findMContactLearmMoreUI.f344378h);
            C86709a0.m107524d().mo123460f(FindMContactLearmMoreUI.this.f344381n);
            return false;
        }

        public String toString() {
            return super.toString() + "|doUpload";
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI$f */
    public class C114891f implements DialogInterface.OnClickListener {
        public C114891f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FindMContactLearmMoreUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI$g */
    public class C114892g implements DialogInterface.OnClickListener {
        public C114892g(FindMContactLearmMoreUI findMContactLearmMoreUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: N7 */
    public final void mo174571N7() {
        Class cls = C76754b.class;
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.READ_CONTACTS", 48, (String) null, (String) null);
        Log.m105925i("MicroMsg.FindMContactLearmMoreUI", "summerper checkPermission checkContacts[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
        if (z1) {
            C89137b0 d = C86709a0.m107524d();
            C114888c cVar = new C114888c();
            this.f344379i = cVar;
            d.mo123455a(431, cVar);
            this.f344380j = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f360085a04), true, true, new C114889d());
            C86709a0.m107525e().postAtFrontOfWorker(new C114890e());
            ((C76754b) C86312j.m106911c(cls)).mo105744cx(true, false);
            ((C76754b) C86312j.m106911c(cls)).mo105747jG();
        }
    }

    /* renamed from: O7 */
    public final void mo174572O7() {
        hideVKB();
        mo7681K7(1);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.are;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.cxf);
        this.f344382o = (Button) findViewById(C0966R.C0970id.hll);
        this.f344383p = (TextView) findViewById(C0966R.C0970id.apy);
        this.f344382o.setOnClickListener(new C114886a());
        this.f344383p.setOnClickListener(new C114887b());
        C86709a0.m107535s().mo121142i().mo119676J(12323, Boolean.TRUE);
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        if (str == null || str.equals("")) {
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(4097, (Object) null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f344375e = getIntent().getStringExtra("regsetinfo_ticket");
        this.f344376f = getIntent().getStringExtra("regsetinfo_NextStep");
        this.f344377g = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
        initView();
    }

    public void onDestroy() {
        if (this.f344379i != null) {
            C86709a0.m107524d().mo123470p(431, this.f344379i);
            this.f344379i = null;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo174572O7();
        return true;
    }

    public void onPause() {
        super.onPause();
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("RE300_600");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("RE300_600"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.FindMContactLearmMoreUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.FindMContactLearmMoreUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 48) {
            if (iArr[0] == 0) {
                mo174571N7();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhs), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C114891f(), new C114892g(this));
        }
    }

    public void onResume() {
        super.onResume();
        C78595a.m94984d("R300_100_phone");
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("RE300_600");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("RE300_600"));
        sb.append(",");
        sb.append(1);
        C78595a.m94983c(10645, true, sb.toString());
    }
}
