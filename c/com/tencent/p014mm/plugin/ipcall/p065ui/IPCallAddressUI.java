package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.IPCallNewXmlInfoChangeEvent;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ipcall.model.C4613b;
import com.tencent.p014mm.plugin.ipcall.model.IPCallCoutryConfigUpdater;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p12.C11800g;
import p196ln.C76706g;
import p214om.C11502f;
import p447aw.C103918d;
import r12.C12940b;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI */
public class IPCallAddressUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public ListView f19431d;

    /* renamed from: e */
    public C4725w f19432e = null;

    /* renamed from: f */
    public View f19433f;

    /* renamed from: g */
    public int f19434g = 0;

    /* renamed from: h */
    public boolean f19435h = false;

    /* renamed from: i */
    public boolean f19436i = true;

    /* renamed from: j */
    public boolean f19437j = false;

    /* renamed from: n */
    public IListener f19438n = new IListener<IPCallNewXmlInfoChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = 682820784;
        }

        public boolean callback(IEvent iEvent) {
            IPCallNewXmlInfoChangeEvent iPCallNewXmlInfoChangeEvent = (IPCallNewXmlInfoChangeEvent) iEvent;
            C4725w wVar = IPCallAddressUI.this.f19432e;
            if (wVar == null) {
                return true;
            }
            MMHandlerThread.postToMainThread(new C4714s(wVar));
            return true;
        }
    };

    /* renamed from: o */
    public Runnable f19439o = new C4622b(this);

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI$a */
    public class C4621a implements MenuItem.OnMenuItemClickListener {
        public C4621a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallAddressUI iPCallAddressUI = IPCallAddressUI.this;
            if (iPCallAddressUI.f19434g == 1) {
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(new Intent(), IPCallAddressUI.this);
            } else {
                iPCallAddressUI.finish();
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI$b */
    public class C4622b implements Runnable {
        public C4622b(IPCallAddressUI iPCallAddressUI) {
        }

        public void run() {
            if (C4613b.f19412f == null) {
                C4613b.f19412f = new C4613b();
            }
            C4613b.f19412f.mo5492a((C4613b.C4615b) null, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI$c */
    public class C4623c implements DialogInterface.OnClickListener {
        public C4623c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(IPCallAddressUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI$d */
    public class C4624d implements DialogInterface.OnClickListener {
        public C4624d(IPCallAddressUI iPCallAddressUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: H7 */
    public final void mo5500H7() {
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.READ_CONTACTS", 48, (String) null, (String) null);
        Log.m105925i("MicroMsg.IPCallAddressUI", "summerper checkPermission checkContacts[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
        if (z1) {
            ThreadPool.post(this.f19439o, "IPCallAddressUI_LoadSystemAddressBook");
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359836b23;
    }

    public final void init() {
        setMMTitle((int) C0966R.string.fu8);
        this.f19431d = (ListView) findViewById(C0966R.C0970id.f5607jo);
        View findViewById = findViewById(C0966R.C0970id.f5634ke);
        this.f19433f = findViewById;
        C4725w wVar = new C4725w(this, this.f19431d, findViewById);
        this.f19432e = wVar;
        wVar.f19732b = new C4709r0(wVar.f19734d);
        ViewGroup viewGroup = (ViewGroup) View.inflate(wVar.f19734d, C0966R.C0971layout.b2e, (ViewGroup) null);
        wVar.f19731a.addHeaderView(viewGroup, (Object) null, false);
        wVar.f19731a.setAdapter(wVar.f19732b);
        wVar.f19736f = (TextView) viewGroup.findViewById(C0966R.C0970id.f5350cq);
        wVar.f19737g = (TextView) viewGroup.findViewById(C0966R.C0970id.f5362d4);
        wVar.f19738h = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.f5344cj);
        wVar.f19739i = (TextView) viewGroup.findViewById(C0966R.C0970id.f5345ck);
        wVar.f19740j = (ImageView) viewGroup.findViewById(C0966R.C0970id.l09);
        viewGroup.findViewById(C0966R.C0970id.f5364d6).setOnClickListener(new C4696n(wVar));
        viewGroup.findViewById(C0966R.C0970id.bqe).setOnClickListener(new C4699o(wVar));
        viewGroup.findViewById(C0966R.C0970id.c6a).setOnClickListener(new C4702p(wVar));
        wVar.f19731a.setOnItemClickListener(new C4705q(wVar));
        wVar.f19731a.setOnItemLongClickListener(new C4708r(wVar));
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_IPCALL_FIRST_IN_BOOLEAN;
        if (((Boolean) u.mo119685f(aVar, Boolean.TRUE)).booleanValue()) {
            IPCallCoutryConfigUpdater.m46132a().mo66545d(true);
            C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.FALSE);
        } else {
            IPCallCoutryConfigUpdater.m46132a().mo66545d(false);
        }
        if (wVar.f19732b.getCount() > 0) {
            View view = wVar.f19733c;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = wVar.f19733c;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        MMHandlerThread.postToMainThread(new C4717t(wVar));
        MMHandlerThread.postToMainThread(new C4714s(wVar));
        wVar.f19735e = true;
        C97625j3.m125815e().mo123455a(257, this);
        this.f19438n.alive();
    }

    public void onBackPressed() {
        if (this.f19434g == 1) {
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(new Intent(), this);
            return;
        }
        super.onBackPressed();
    }

    public void onBusinessPermissionDenied(String str) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERFINO_IPCALL_HAS_ACTIVITY_BOOLEAN;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) u.mo119685f(aVar, bool)).booleanValue()) {
            C97625j3.m125812b().mo105906u().mo119677K(aVar, bool);
            Intent intent = new Intent();
            intent.setClass(getContext(), IPCallAcitivityUI.class);
            AppCompatActivity context = getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
            this.f19436i = false;
        }
        setBackBtn(new C4621a());
        if (this.f19436i) {
            this.f19437j = true;
            mo5500H7();
        }
        this.f19435h = ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IPCALL_FIRST_IN_BOOLEAN, Boolean.TRUE)).booleanValue();
        init();
        this.f19434g = getIntent().getIntExtra("IPCallAddressUI_KFrom", 0);
        C115669n.INSTANCE.idkeyStat(257, 0, 1, true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Log.m105918d("MicroMsg.IPCallAddressUI", "onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        C4725w wVar = this.f19432e;
        if (wVar != null) {
            wVar.f19731a.setOnItemClickListener((AdapterView.OnItemClickListener) null);
            wVar.f19731a.setOnItemLongClickListener((AdapterView.OnItemLongClickListener) null);
            C4709r0 r0Var = wVar.f19732b;
            r0Var.getClass();
            ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93567p(r0Var);
        }
        C97625j3.m125815e().mo123470p(257, this);
        this.f19438n.dead();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.IPCallAddressUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.IPCallAddressUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 48 && iArr[0] != 0 && this.f19435h) {
            this.f19435h = false;
            C76879j.m92709C(this, getString(C0966R.string.hhs), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C4623c(), new C4624d(this));
        }
    }

    public void onResume() {
        super.onResume();
        C4725w wVar = this.f19432e;
        if (wVar != null) {
            C4709r0 r0Var = wVar.f19732b;
            if (r0Var != null && !wVar.f19735e) {
                r0Var.notifyDataSetChanged();
                if (wVar.f19732b.getCount() > 0) {
                    View view = wVar.f19733c;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View view2 = wVar.f19733c;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            wVar.f19735e = false;
        }
        supportInvalidateOptionsMenu();
        if (C12940b.f36960b == null) {
            C12940b.f36960b = new C12940b();
        }
        C12940b.f36960b.mo12490a(true);
        if (!this.f19437j) {
            this.f19437j = true;
            mo5500H7();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C4725w wVar;
        if ((yVar instanceof C11800g) && i == 0 && i2 == 0 && (wVar = this.f19432e) != null) {
            MMHandlerThread.postToMainThread(new C4717t(wVar));
        }
    }
}
