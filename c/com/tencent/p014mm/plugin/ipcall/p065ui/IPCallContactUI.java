package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.ipcall.C4609b;
import com.tencent.p014mm.plugin.ipcall.model.C4613b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C9556a;
import nj3.C76879j;
import p447aw.C103918d;
import s12.C13611b;
import s12.C13612c;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallContactUI */
public class IPCallContactUI extends MMActivity {

    /* renamed from: d */
    public C106742j1 f19450d = new C106742j1(true, true);

    /* renamed from: e */
    public ProgressDialog f19451e = null;

    /* renamed from: f */
    public ListView f19452f;

    /* renamed from: g */
    public C4684j f19453g;

    /* renamed from: h */
    public RelativeLayout f19454h;

    /* renamed from: i */
    public LinearLayout f19455i;

    /* renamed from: j */
    public IPCallAddressCountView f19456j = null;

    /* renamed from: n */
    public VerticalScrollBar f19457n;

    /* renamed from: o */
    public LinearLayout f19458o;

    /* renamed from: p */
    public String f19459p;

    /* renamed from: q */
    public int f19460q = -1;

    /* renamed from: r */
    public int f19461r = -1;

    /* renamed from: s */
    public C4613b.C4615b f19462s = new C4634g();

    /* renamed from: t */
    public Runnable f19463t = new C4635h();

    /* renamed from: u */
    public Runnable f19464u = new C4636i();

    /* renamed from: v */
    public boolean f19465v = true;

    /* renamed from: w */
    public MMHandler f19466w = new C4628a(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallContactUI$a */
    public class C4628a extends MMHandler {
        public C4628a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                ProgressDialog progressDialog = IPCallContactUI.this.f19451e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                IPCallContactUI.this.f19454h.setVisibility(0);
                C4684j jVar = IPCallContactUI.this.f19453g;
                HashMap<String, C13612c> hashMap = C13611b.f38574b;
                jVar.getClass();
                C4684j.f19652x = hashMap;
                IPCallContactUI.this.f19453g.mo1333o();
                IPCallContactUI.this.f19453g.notifyDataSetChanged();
                IPCallContactUI.this.f19452f.invalidateViews();
                IPCallContactUI iPCallContactUI = IPCallContactUI.this;
                iPCallContactUI.f19456j.setAddressCount(iPCallContactUI.f19453g.getCount());
                if (C4609b.f19406g == null) {
                    C4609b.f19406g = new C4609b();
                }
                C4609b.f19406g.mo5490a();
            } else if (i == 2) {
                if (IPCallContactUI.this.f19453g.getCount() == 0) {
                    IPCallContactUI.this.f19458o.setVisibility(0);
                } else {
                    IPCallContactUI.this.f19458o.setVisibility(8);
                }
                if (IPCallContactUI.this.f19453g.getCount() != 0) {
                    IPCallContactUI iPCallContactUI2 = IPCallContactUI.this;
                    if (iPCallContactUI2.f19465v) {
                        iPCallContactUI2.f19453g.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallContactUI$b */
    public class C4629b implements DialogInterface.OnClickListener {
        public C4629b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            IPCallContactUI.this.finish();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(IPCallContactUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallContactUI$c */
    public class C4630c implements DialogInterface.OnClickListener {
        public C4630c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            IPCallContactUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallContactUI$d */
    public class C4631d implements MenuItem.OnMenuItemClickListener {
        public C4631d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallContactUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallContactUI$e */
    public class C4632e implements C106742j1.C106756o {
        public C4632e() {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            Log.m105918d("MicroMsg.IPCallContactUI", "onQuitSearch");
            IPCallContactUI iPCallContactUI = IPCallContactUI.this;
            iPCallContactUI.f19459p = "";
            iPCallContactUI.f19466w.removeCallbacks(iPCallContactUI.f19464u);
            iPCallContactUI.f19466w.postDelayed(iPCallContactUI.f19464u, 200);
            IPCallContactUI iPCallContactUI2 = IPCallContactUI.this;
            iPCallContactUI2.f19465v = true;
            iPCallContactUI2.f19453g.notifyDataSetChanged();
            IPCallContactUI.this.f19455i.setVisibility(8);
            IPCallContactUI.this.f19452f.setVisibility(0);
            IPCallContactUI.this.f19456j.setVisibility(0);
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            Log.m105918d("MicroMsg.IPCallContactUI", "onSearchKeyDown");
            return false;
        }

        /* renamed from: i7 */
        public void mo1323i7() {
            Log.m105918d("MicroMsg.IPCallContactUI", "onEnterSearch");
            C115669n.INSTANCE.mo160131h(12767, 1);
            IPCallContactUI.this.f19455i.setVisibility(0);
            IPCallContactUI.this.f19452f.setVisibility(8);
            IPCallContactUI.this.f19456j.setVisibility(8);
            IPCallContactUI.this.f19465v = false;
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            Log.m105918d("MicroMsg.IPCallContactUI", "onSearchChange");
            IPCallContactUI iPCallContactUI = IPCallContactUI.this;
            iPCallContactUI.f19459p = str;
            iPCallContactUI.f19466w.removeCallbacks(iPCallContactUI.f19464u);
            iPCallContactUI.f19466w.postDelayed(iPCallContactUI.f19464u, 200);
            if (!Util.isNullOrNil(str)) {
                IPCallContactUI.this.f19455i.setVisibility(8);
                IPCallContactUI.this.f19452f.setVisibility(0);
                IPCallContactUI.this.f19456j.setVisibility(8);
            }
        }

        /* renamed from: l5 */
        public void mo1325l5() {
            IPCallContactUI.this.f19455i.setVisibility(0);
            IPCallContactUI.this.f19452f.setVisibility(8);
            IPCallContactUI.this.f19456j.setVisibility(8);
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallContactUI$f */
    public class C4633f implements AdapterView.OnItemClickListener {
        public C4633f() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            int i2 = i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (IPCallContactUI.this.f19453g.mo7996n(i2)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            C13612c t = IPCallContactUI.this.f19453g.getItem(i2);
            if (t != null) {
                if (!IPCallContactUI.this.f19465v) {
                    C115669n.INSTANCE.mo160131h(12767, 2);
                }
                Intent intent = new Intent(IPCallContactUI.this.getContext(), IPCallUserProfileUI.class);
                intent.putExtra("IPCallProfileUI_contactid", t.field_contactId);
                intent.putExtra("IPCallProfileUI_systemUsername", t.field_systemAddressBookUsername);
                intent.putExtra("IPCallProfileUI_wechatUsername", t.field_wechatUsername);
                AppCompatActivity context = IPCallContactUI.this.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = context;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                str = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            } else {
                str = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallContactUI$g */
    public class C4634g implements C4613b.C4615b {
        public C4634g() {
        }

        /* renamed from: a */
        public void mo5493a() {
            IPCallContactUI.this.f19466w.sendEmptyMessage(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallContactUI$h */
    public class C4635h implements Runnable {
        public C4635h() {
        }

        public void run() {
            if (C4613b.f19412f == null) {
                C4613b.f19412f = new C4613b();
            }
            C4613b.f19412f.mo5492a(IPCallContactUI.this.f19462s, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallContactUI$i */
    public class C4636i implements Runnable {
        public C4636i() {
        }

        public void run() {
            IPCallContactUI iPCallContactUI = IPCallContactUI.this;
            C4684j jVar = iPCallContactUI.f19453g;
            if (jVar != null && iPCallContactUI.f19452f != null && !jVar.f19660v) {
                String str = iPCallContactUI.f19459p;
                jVar.f19658t = str;
                if (Util.isNullOrNil(str)) {
                    jVar.f19659u = false;
                } else {
                    jVar.f19659u = true;
                }
                ((HashMap) jVar.f24698g).clear();
                jVar.mo1333o();
                jVar.notifyDataSetChanged();
                IPCallContactUI.this.f19466w.sendEmptyMessage(2);
                IPCallContactUI.this.f19452f.invalidateViews();
            }
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b25;
    }

    public final void init() {
        setMMTitle((int) C0966R.string.ftm);
        setBackBtn(new C4631d());
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.READ_CONTACTS", 48, (String) null, (String) null);
        Log.m105925i("MicroMsg.IPCallContactUI", "summerper checkPermission checkContacts[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
        if (z1) {
            this.f19454h = (RelativeLayout) findViewById(C0966R.C0970id.fja);
            this.f19455i = (LinearLayout) findViewById(C0966R.C0970id.f5635kf);
            this.f19452f = (ListView) findViewById(C0966R.C0970id.f5607jo);
            this.f19457n = (VerticalScrollBar) findViewById(C0966R.C0970id.f5628k9);
            this.f19458o = (LinearLayout) findViewById(C0966R.C0970id.f5634ke);
            C106742j1 j1Var = this.f19450d;
            j1Var.f319122j = new C4632e();
            j1Var.f319124l = C0966R.string.a2p;
            addSearchMenu(true, j1Var);
            this.f19453g = new C4684j(getContext());
            C4684j.f19652x = C13611b.f38574b;
            IPCallAddressCountView iPCallAddressCountView = new IPCallAddressCountView((Context) getContext(), this.f19453g.mo5587s());
            this.f19456j = iPCallAddressCountView;
            this.f19452f.addFooterView(iPCallAddressCountView, (Object) null, false);
            this.f19452f.setAdapter(this.f19453g);
            this.f19452f.setOnItemClickListener(new C4633f());
            this.f19457n.setVisibility(0);
            this.f19452f.setOnScrollListener(new C4732y(this));
            this.f19457n.setOnScrollBarTouchListener(new C4737z(this));
            if (this.f19453g.mo5587s() <= 0) {
                this.f19454h.setVisibility(8);
                this.f19451e = C76879j.m92723Q(getContext(), getContext().getString(C0966R.string.a3h), getContext().getString(C0966R.string.fu7), true, true, new C4728x(this));
                ThreadPool.post(this.f19463t, "IPCall_LoadSystemAddressBook");
                return;
            }
            if (C4609b.f19406g == null) {
                C4609b.f19406g = new C4609b();
            }
            C4609b.f19406g.mo5490a();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onBusinessPermissionDenied(String str) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Log.m105918d("MicroMsg.IPCallContactUI", "onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        if (C4613b.f19412f == null) {
            C4613b.f19412f = new C4613b();
        }
        C4613b bVar = C4613b.f19412f;
        C4613b.C4615b bVar2 = this.f19462s;
        if (bVar.f19414b.contains(bVar2)) {
            bVar.f19414b.remove(bVar2);
        }
        this.f19466w.removeMessages(1);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.IPCallContactUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.IPCallContactUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 48 && iArr[0] != 0) {
            C76879j.m92709C(this, getString(C0966R.string.hhs), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C4629b(), new C4630c());
        }
    }

    public void onResume() {
        super.onResume();
        supportInvalidateOptionsMenu();
    }
}
