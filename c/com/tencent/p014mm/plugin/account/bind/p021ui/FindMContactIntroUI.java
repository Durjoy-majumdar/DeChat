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
import gg0.C116959w;
import gg0.C116960x;
import gg0.C116961y;
import gg0.C116962z;
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
import p214om.C11502f;
import p286zl.C79396l;
import p447aw.C103918d;
import p910lj.C76701a;
import te3.C49174do2;
import wc3.C15131b;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI */
public class FindMContactIntroUI extends MMWizardActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f344354t = 0;

    /* renamed from: e */
    public Button f344355e;

    /* renamed from: f */
    public String f344356f = null;

    /* renamed from: g */
    public String f344357g = "";

    /* renamed from: h */
    public int f344358h = 2;

    /* renamed from: i */
    public boolean f344359i = false;

    /* renamed from: j */
    public List<String[]> f344360j = null;

    /* renamed from: n */
    public C11385n f344361n = null;

    /* renamed from: o */
    public ProgressDialog f344362o = null;

    /* renamed from: p */
    public C46062s0 f344363p;

    /* renamed from: q */
    public TextView f344364q;

    /* renamed from: r */
    public TextView f344365r;

    /* renamed from: s */
    public String f344366s;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI$a */
    public class C114877a implements DialogInterface.OnClickListener {
        public C114877a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FindMContactIntroUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI$b */
    public class C114878b implements DialogInterface.OnClickListener {
        public C114878b(FindMContactIntroUI findMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI$c */
    public class C114879c implements View.OnClickListener {
        public C114879c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/FindMContactIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FindMContactIntroUI findMContactIntroUI = FindMContactIntroUI.this;
            if (findMContactIntroUI.f344359i) {
                StringBuilder sb = new StringBuilder();
                C86709a0.m107523b();
                sb.append(C86718e.m107547e());
                sb.append(",");
                sb.append(findMContactIntroUI.getClass().getName());
                sb.append(",");
                sb.append("R300_200_phone");
                sb.append(",");
                C86709a0.m107523b();
                sb.append(C86718e.m107548f("R300_200_phone"));
                sb.append(",");
                sb.append(1);
                C78595a.m94982b(10645, sb.toString());
                C76879j.m92739j(findMContactIntroUI, C0966R.string.cwq, C0966R.string.a3h, C0966R.string.a18, C0966R.string.f7926wf, new C116959w(findMContactIntroUI), new C116960x(findMContactIntroUI));
            } else if (C76186t.m91539g()) {
                StringBuilder sb4 = new StringBuilder();
                C86709a0.m107523b();
                sb4.append(C86718e.m107547e());
                sb4.append(",");
                sb4.append(findMContactIntroUI.getClass().getName());
                sb4.append(",");
                sb4.append("R300_200_phone");
                sb4.append(",");
                C86709a0.m107523b();
                sb4.append(C86718e.m107548f("R300_200_phone"));
                sb4.append(",");
                sb4.append(1);
                C78595a.m94982b(10645, sb4.toString());
                C76879j.m92739j(findMContactIntroUI, C0966R.string.cwq, C0966R.string.a3h, C0966R.string.a18, C0966R.string.f7926wf, new C116961y(findMContactIntroUI), new C116962z(findMContactIntroUI));
            } else {
                findMContactIntroUI.mo174561N7();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/FindMContactIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI$d */
    public class C114880d implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI$d$a */
        public class C114881a implements DialogInterface.OnClickListener {
            public C114881a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                FindMContactIntroUI findMContactIntroUI = FindMContactIntroUI.this;
                int i2 = FindMContactIntroUI.f344354t;
                findMContactIntroUI.mo174562O7();
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI$d$b */
        public class C114882b implements DialogInterface.OnClickListener {
            public C114882b(C114880d dVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C114880d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/FindMContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FindMContactIntroUI findMContactIntroUI = FindMContactIntroUI.this;
            C76879j.m92707A(findMContactIntroUI, findMContactIntroUI.getString(C0966R.string.cx4), (String) null, FindMContactIntroUI.this.getString(C0966R.string.cx5), FindMContactIntroUI.this.getString(C0966R.string.f360450cx3), new C114881a(), new C114882b(this));
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/FindMContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI$e */
    public class C114883e implements C11385n {
        public C114883e() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3;
            boolean z;
            ProgressDialog progressDialog = FindMContactIntroUI.this.f344362o;
            if (progressDialog != null) {
                progressDialog.dismiss();
                FindMContactIntroUI.this.f344362o = null;
            }
            if (FindMContactIntroUI.this.f344361n != null) {
                C86709a0.m107524d().mo123470p(431, FindMContactIntroUI.this.f344361n);
                FindMContactIntroUI.this.f344361n = null;
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
                Log.m105919d("MicroMsg.FindMContactIntroUI", "tigerreg data size=%d, addcount=%s", objArr);
                String str2 = FindMContactIntroUI.this.f344357g;
                if (str2 == null || !str2.contains("1") || !z) {
                    FindMContactIntroUI.this.mo174562O7();
                    return;
                }
                C78595a.m94985e("R300_300_phone");
                Intent intent = new Intent(FindMContactIntroUI.this, FindMContactAddUI.class);
                intent.putExtra("regsetinfo_ticket", FindMContactIntroUI.this.f344356f);
                intent.putExtra("regsetinfo_NextStep", FindMContactIntroUI.this.f344357g);
                intent.putExtra("regsetinfo_NextStyle", FindMContactIntroUI.this.f344358h);
                intent.putExtra("login_type", 0);
                MMWizardActivity.m7017L7(FindMContactIntroUI.this, intent);
                return;
            }
            FindMContactIntroUI findMContactIntroUI = FindMContactIntroUI.this;
            C76701a.makeText((Context) findMContactIntroUI, (CharSequence) findMContactIntroUI.getString(C0966R.string.f7966xq, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI$f */
    public class C114884f implements DialogInterface.OnCancelListener {
        public C114884f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (FindMContactIntroUI.this.f344361n != null) {
                C86709a0.m107524d().mo123470p(431, FindMContactIntroUI.this.f344361n);
                FindMContactIntroUI.this.f344361n = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI$g */
    public class C114885g implements MMHandlerThread.IWaitWorkThread {
        public C114885g() {
        }

        public boolean doInBackground() {
            try {
                FindMContactIntroUI findMContactIntroUI = FindMContactIntroUI.this;
                findMContactIntroUI.f344360j = C15131b.m14241e(findMContactIntroUI);
                StringBuilder sb = new StringBuilder();
                sb.append("tigerreg mobileList size ");
                List<String[]> list = FindMContactIntroUI.this.f344360j;
                sb.append(list == null ? 0 : list.size());
                Log.m105918d("MicroMsg.FindMContactIntroUI", sb.toString());
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FindMContactIntroUI", e, "", new Object[0]);
                return true;
            }
        }

        public boolean onPostExecute() {
            List<String[]> list = FindMContactIntroUI.this.f344360j;
            if (list == null || list.size() == 0) {
                ProgressDialog progressDialog = FindMContactIntroUI.this.f344362o;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    FindMContactIntroUI.this.f344362o = null;
                }
                FindMContactIntroUI.this.mo174562O7();
                return false;
            }
            FindMContactIntroUI findMContactIntroUI = FindMContactIntroUI.this;
            findMContactIntroUI.f344363p = new C46062s0(findMContactIntroUI.f344356f, (List<String>) null, findMContactIntroUI.f344360j);
            C86709a0.m107524d().mo123460f(FindMContactIntroUI.this.f344363p);
            return false;
        }

        public String toString() {
            return super.toString() + "|doUpload";
        }
    }

    /* renamed from: N7 */
    public final void mo174561N7() {
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.READ_CONTACTS", 48, (String) null, (String) null);
        Log.m105925i("MicroMsg.FindMContactIntroUI", "summerper checkPermission checkContacts[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
        if (z1) {
            C89137b0 d = C86709a0.m107524d();
            C114883e eVar = new C114883e();
            this.f344361n = eVar;
            d.mo123455a(431, eVar);
            this.f344362o = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f360085a04), true, true, new C114884f());
            C86709a0.m107525e().postAtFrontOfWorker(new C114885g());
        }
    }

    /* renamed from: O7 */
    public final void mo174562O7() {
        C78595a.m94985e(this.f344366s);
        hideVKB();
        mo7681K7(1);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ard;
    }

    public void initView() {
        this.f344355e = (Button) findViewById(C0966R.C0970id.jdd);
        this.f344365r = (TextView) findViewById(C0966R.C0970id.e97);
        this.f344364q = (TextView) findViewById(C0966R.C0970id.e96);
        String str = this.f344357g;
        if (str == null || !str.contains("2")) {
            this.f344364q.setText(getString(C0966R.string.cwo));
        } else {
            this.f344364q.setText(getString(C0966R.string.cwn));
        }
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        if (str2 == null || str2.equals("")) {
            String str3 = (String) C86709a0.m107535s().mo121142i().mo119684e(4097, (Object) null);
        }
        this.f344355e.setOnClickListener(new C114879c());
        this.f344365r.setOnClickListener(new C114880d());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cx7);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
        this.f344356f = getIntent().getStringExtra("regsetinfo_ticket");
        this.f344357g = getIntent().getStringExtra("regsetinfo_NextStep");
        this.f344358h = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
        this.f344359i = C76186t.m91534b() != C79396l.SUCC;
        this.f344366s = C78595a.m94981a();
        Log.m105919d("MicroMsg.FindMContactIntroUI", "tigerreg mNextStep %s  mNextStyle %s ", this.f344357g, Integer.valueOf(this.f344358h));
    }

    public void onDestroy() {
        if (this.f344361n != null) {
            C86709a0.m107524d().mo123470p(431, this.f344361n);
            this.f344361n = null;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo174562O7();
        return true;
    }

    public void onPause() {
        super.onPause();
        C78595a.m94985e("RE900_100");
        if (this.f344359i) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R300_100_QQ");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_100_QQ"));
            sb.append(",");
            sb.append(4);
            C78595a.m94983c(10645, false, sb.toString());
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        C86709a0.m107523b();
        sb4.append(C86718e.m107547e());
        sb4.append(",");
        sb4.append(getClass().getName());
        sb4.append(",");
        sb4.append("R300_100_phone");
        sb4.append(",");
        C86709a0.m107523b();
        sb4.append(C86718e.m107548f("R300_100_phone"));
        sb4.append(",");
        sb4.append(4);
        C78595a.m94983c(10645, false, sb4.toString());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.FindMContactIntroUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.FindMContactIntroUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 48) {
            if (iArr[0] == 0) {
                mo174561N7();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhs), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C114877a(), new C114878b(this));
        }
    }

    public void onResume() {
        super.onResume();
        initView();
        if (this.f344359i) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R300_100_QQ");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_100_QQ"));
            sb.append(",");
            sb.append(1);
            C78595a.m94983c(10645, true, sb.toString());
            C78595a.m94984d("R300_100_QQ");
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        C86709a0.m107523b();
        sb4.append(C86718e.m107547e());
        sb4.append(",");
        sb4.append(getClass().getName());
        sb4.append(",");
        sb4.append("R300_100_phone");
        sb4.append(",");
        C86709a0.m107523b();
        sb4.append(C86718e.m107548f("R300_100_phone"));
        sb4.append(",");
        sb4.append(1);
        C78595a.m94983c(10645, true, sb4.toString());
        C78595a.m94984d("R300_100_phone");
    }
}
