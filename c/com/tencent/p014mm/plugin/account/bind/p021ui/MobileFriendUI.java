package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.account.bind.p021ui.C1373b;
import com.tencent.p014mm.plugin.account.friend.p022ui.InviteFriendUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gg0.C8276c0;
import hg0.C59893x0;
import hg0.C76166a;
import hg0.C76168b;
import hg0.C76173n0;
import hg0.C76186t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import mg0.C76754b;
import mg0.C76755c;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C11171e;
import p214om.C11502f;
import p286zl.C79396l;
import p447aw.C103918d;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI */
public class MobileFriendUI extends MMActivity implements C11385n {

    /* renamed from: o */
    public static final /* synthetic */ int f10544o = 0;

    /* renamed from: d */
    public ListView f10545d;

    /* renamed from: e */
    public C1373b f10546e;

    /* renamed from: f */
    public View f10547f;

    /* renamed from: g */
    public ProgressDialog f10548g = null;

    /* renamed from: h */
    public C59893x0 f10549h;

    /* renamed from: i */
    public String f10550i;

    /* renamed from: j */
    public TextView f10551j = null;

    /* renamed from: n */
    public TextView f10552n = null;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$a */
    public class C1360a implements View.OnClickListener {
        public C1360a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(MobileFriendUI.this.getContext(), BindMContactIntroUI.class);
            intent.putExtra("key_upload_scene", 6);
            MMWizardActivity.m7017L7(MobileFriendUI.this, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$b */
    public class C1361b implements MenuItem.OnMenuItemClickListener {
        public C1361b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MobileFriendUI.this.hideVKB();
            MobileFriendUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$c */
    public class C1362c implements View.OnClickListener {
        public C1362c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = MobileFriendUI.this.f10545d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$12", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$12", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$d */
    public class C1363d implements DialogInterface.OnClickListener {
        public C1363d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(11438, 6);
            Log.m105925i("MicroMsg.MobileFriendUI", "[cpan] kv report logid:%d scene:%d", 11438, 6);
            C76186t.m91542j(true);
            ((C76754b) C86312j.m106911c(C76754b.class)).mo105744cx(true, true);
            MobileFriendUI mobileFriendUI = MobileFriendUI.this;
            int i2 = MobileFriendUI.f10544o;
            mobileFriendUI.mo1308H7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$e */
    public class C1364e implements DialogInterface.OnClickListener {
        public C1364e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C76186t.m91542j(false);
            ((C76754b) C86312j.m106911c(C76754b.class)).mo105744cx(false, true);
            MobileFriendUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$f */
    public class C1365f implements DialogInterface.OnClickListener {
        public C1365f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(MobileFriendUI.this.getContext());
            MobileFriendUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$g */
    public class C1366g implements DialogInterface.OnClickListener {
        public C1366g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MobileFriendUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$h */
    public class C1367h implements DialogInterface.OnCancelListener {
        public C1367h() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (MobileFriendUI.this.f10549h != null) {
                C86709a0.m107524d().mo123458d(MobileFriendUI.this.f10549h);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$i */
    public class C1368i implements C76755c {
        public C1368i() {
        }

        /* renamed from: a */
        public void mo1320a(boolean z) {
            Log.m105925i("MicroMsg.MobileFriendUI", "syncAddrBookAndUpload onSyncEnd suc:%b", Boolean.valueOf(z));
            if (!z) {
                ProgressDialog progressDialog = MobileFriendUI.this.f10548g;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    MobileFriendUI.this.f10548g = null;
                    return;
                }
                return;
            }
            System.currentTimeMillis();
            C86709a0.m107524d().mo123460f(new C59893x0(C76186t.m91538f(), C76186t.m91536d()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$j */
    public class C1369j implements C106742j1.C106756o {
        public C1369j() {
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
            MobileFriendUI.this.f10550i = Util.escapeSqlValue(str);
            MobileFriendUI mobileFriendUI = MobileFriendUI.this;
            C1373b bVar = mobileFriendUI.f10546e;
            if (bVar != null) {
                C1379f fVar = (C1379f) bVar;
                fVar.f10572o = Util.escapeSqlValue(mobileFriendUI.f10550i.trim());
                fVar.mo5580b();
                fVar.mo1333o();
            }
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$k */
    public class C1370k implements C6975i1.C6977b {
        public C1370k() {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            MobileFriendUI mobileFriendUI = MobileFriendUI.this;
            mobileFriendUI.f10546e.getCount();
            if (C76186t.m91534b() != C79396l.SUCC && C76186t.m91534b() != C79396l.SUCC_UNLOAD) {
                View view = mobileFriendUI.f10547f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mobileFriendUI.f10547f.setOnClickListener(new C8276c0(mobileFriendUI));
                mobileFriendUI.f10545d.setVisibility(8);
                mobileFriendUI.f10551j.setVisibility(8);
            } else if (mobileFriendUI.f10546e.getCount() <= 0) {
                mobileFriendUI.f10551j.setVisibility(0);
                mobileFriendUI.f10545d.setVisibility(8);
                View view3 = mobileFriendUI.f10547f;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                mobileFriendUI.f10551j.setVisibility(8);
                mobileFriendUI.f10545d.setVisibility(0);
                View view5 = mobileFriendUI.f10547f;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$l */
    public class C1371l implements AdapterView.OnItemClickListener {
        public C1371l() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (i < MobileFriendUI.this.f10545d.getHeaderViewsCount()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            C76166a aVar = (C76166a) MobileFriendUI.this.f10546e.getItem(i - MobileFriendUI.this.f10545d.getHeaderViewsCount());
            int i2 = aVar.f223127o;
            if (i2 == 1 || i2 == 2) {
                MobileFriendUI.this.mo1309I7(aVar);
            }
            if (aVar.f223127o == 0) {
                Intent intent = new Intent(MobileFriendUI.this, InviteFriendUI.class);
                intent.putExtra("friend_type", 1);
                intent.putExtra("friend_user_name", aVar.mo106389i());
                intent.putExtra("friend_num", aVar.mo106386f() + "");
                intent.putExtra("friend_nick", aVar.mo106388h());
                intent.putExtra("friend_weixin_nick", aVar.mo106387g());
                intent.putExtra("friend_scene", 13);
                MobileFriendUI mobileFriendUI = MobileFriendUI.this;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                MobileFriendUI mobileFriendUI2 = mobileFriendUI;
                C117292a.m165358d(mobileFriendUI2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mobileFriendUI.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(mobileFriendUI2, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI$m */
    public class C1372m implements C1373b.C1374a {
        public C1372m() {
        }
    }

    /* renamed from: H7 */
    public final void mo1308H7() {
        ProgressDialog progressDialog;
        if (!C76186t.m91539g()) {
            this.f10548g = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.gti), true, true, new C1367h());
            if (!C76186t.m91533a()) {
                List<String> f = C76186t.m91538f();
                List<String> d = C76186t.m91536d();
                if (((ArrayList) f).size() == 0 && ((ArrayList) d).size() == 0) {
                    C86709a0.m107524d().mo123460f(new C76173n0());
                    return;
                }
                this.f10549h = new C59893x0(C76186t.m91538f(), C76186t.m91536d());
                C86709a0.m107524d().mo123460f(this.f10549h);
            } else if (!((C76754b) C86312j.m106911c(C76754b.class)).Yn0(new C1368i()) && (progressDialog = this.f10548g) != null) {
                progressDialog.dismiss();
                this.f10548g = null;
            }
        }
    }

    /* renamed from: I7 */
    public void mo1309I7(C76166a aVar) {
        if (Util.isNullOrNil(aVar.mo106389i())) {
            Log.m105920e("MicroMsg.MobileFriendUI", "username is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_User", aVar.mo106389i());
        intent.putExtra("Contact_Nick", aVar.mo106387g());
        intent.putExtra("Contact_Mobile_MD5", aVar.mo106385e());
        intent.putExtra("Contact_Alias", aVar.f223098A);
        intent.putExtra("Contact_Sex", aVar.f223134v);
        intent.putExtra("Contact_Signature", aVar.f223137y);
        intent.putExtra("Contact_RegionCode", RegionCodeDecoder.m124564q(aVar.f223102E, aVar.f223135w, aVar.f223136x));
        intent.putExtra("Contact_Scene", 13);
        intent.putExtra("Contact_ShowUserName", false);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, this);
    }

    /* renamed from: J7 */
    public final void mo1310J7() {
        if (C11171e.m11046c(26)) {
            Log.m105925i("MicroMsg.MobileFriendUI", "onCreateAfterMPermissionGranted() checkContacts(android.Manifest.permission.WRITE_CONTACTS)[%b]", Boolean.TRUE);
        }
        mo1308H7();
        C5139t.m5183e(13, 33);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359896bg1;
    }

    public void initView() {
        TextView textView = (TextView) findViewById(C0966R.C0970id.gvx);
        this.f10551j = textView;
        textView.setText(C0966R.string.gtg);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.f357932cj1);
        this.f10552n = textView2;
        textView2.setText(C0966R.string.gur);
        this.f10547f = findViewById(C0966R.C0970id.f358755gw0);
        this.f10545d = (ListView) findViewById(C0966R.C0970id.gvz);
        boolean z = true;
        C106742j1 j1Var = new C106742j1(true, true);
        j1Var.f319122j = new C1369j();
        addSearchMenu(true, j1Var);
        Log.m105925i("MicroMsg.MobileFriendUI", "ABTest Type, NEW(%B)", Boolean.TRUE);
        C1379f fVar = new C1379f(this, new C1370k());
        this.f10546e = fVar;
        this.f10545d.setAdapter(fVar);
        this.f10545d.setOnItemClickListener(new C1371l());
        ((C1379f) this.f10546e).f10573p = new C1372m();
        if (!(C76186t.m91534b() == C79396l.SUCC || C76186t.m91534b() == C79396l.SUCC_UNLOAD)) {
            View findViewById = findViewById(C0966R.C0970id.f358755gw0);
            this.f10547f = findViewById;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f10547f.setOnClickListener(new C1360a());
            this.f10545d.setVisibility(8);
        }
        setBackBtn(new C1361b());
        setToTop(new C1362c());
        if ((C75592q0.m90787q() & 131072) != 0) {
            z = false;
        }
        if (!z || C76186t.m91539g()) {
            C76879j.m92739j(this, C0966R.string.ajg, C0966R.string.a3h, C0966R.string.a18, C0966R.string.f7926wf, new C1363d(), new C1364e());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.gtk);
        ((C76168b) ((C76754b) C86312j.m106911c(C76754b.class)).R50()).f223157c.execSQL("qqlist", "update addr_upload2 set reserved4=0");
        C86709a0.m107524d().mo123455a(32, this);
        C86709a0.m107524d().mo123455a(133, this);
        initView();
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.READ_CONTACTS", 48, (String) null, (String) null);
        Log.m105925i("MicroMsg.MobileFriendUI", "summerper checkPermission checkContacts(android.Manifest.permission.READ_CONTACTS)[%b]", Boolean.valueOf(z1));
        if (z1) {
            mo1310J7();
        }
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(32, this);
        C86709a0.m107524d().mo123470p(133, this);
        this.f10546e.mo5580b();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.MobileFriendUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.MobileFriendUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 48) {
            if (iArr[0] == 0) {
                mo1310J7();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhs), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C1365f(), new C1366g());
        }
    }

    public void onResume() {
        super.onResume();
        this.f10546e.notifyDataSetChanged();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ProgressDialog progressDialog;
        Log.m105924i("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        if (yVar.getType() == 32 && (progressDialog = this.f10548g) != null) {
            progressDialog.dismiss();
            this.f10548g = null;
        }
        if (!(i == 0 && i2 == 0)) {
            Log.m105920e("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + i + ", errCode = " + i2);
        }
        if (yVar.getType() == 133) {
            C86709a0.m107524d().mo123460f(new C76173n0());
        }
        if (i == 0 && i2 == 0) {
            if (yVar.getType() == 32) {
                ((C76754b) C86312j.m106911c(C76754b.class)).mo105739Rh();
            }
            this.f10546e.mo7991f();
        } else if (yVar.getType() == 32) {
            C76701a.makeText((Context) this, (int) C0966R.string.gth, 0).show();
        }
    }
}
