package com.tencent.p014mm.plugin.address.p879ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import bh0.C113174b;
import bh0.C54460a;
import bh3.C113177k;
import ch0.C113320j;
import ch0.C113338k;
import ch0.C113339l;
import ch0.C113340m;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.address.p879ui.AddrEditView;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import dh0.C7328a;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p447aw.C103918d;
import xg0.C78803b;
import zg0.C119111e;
import zg0.C119112j;
import zg0.C119113p;

/* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI */
public class WalletAddAddressUI extends MMActivity implements C11385n, AddrEditView.C68518c {

    /* renamed from: r */
    public static final /* synthetic */ int f345265r = 0;

    /* renamed from: d */
    public int f345266d = 0;

    /* renamed from: e */
    public AddrEditView f345267e;

    /* renamed from: f */
    public AddrEditView f345268f;

    /* renamed from: g */
    public AddrEditView f345269g;

    /* renamed from: h */
    public AddrEditView f345270h;

    /* renamed from: i */
    public AddrEditView f345271i;

    /* renamed from: j */
    public C113174b f345272j = null;

    /* renamed from: n */
    public C113174b f345273n = new C113174b();

    /* renamed from: o */
    public Dialog f345274o = null;

    /* renamed from: p */
    public String f345275p = "";

    /* renamed from: q */
    public C113320j f345276q = null;

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$a */
    public class C115213a implements C113177k.C113181e {
        public C115213a() {
        }

        public void onOp(Boolean bool) {
            if (bool.booleanValue()) {
                WalletAddAddressUI walletAddAddressUI = WalletAddAddressUI.this;
                int i = WalletAddAddressUI.f345265r;
                walletAddAddressUI.mo174968K7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$b */
    public class C115214b implements DialogInterface.OnClickListener {
        public C115214b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(WalletAddAddressUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$c */
    public class C115215c implements DialogInterface.OnClickListener {
        public C115215c(WalletAddAddressUI walletAddAddressUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$d */
    public class C115216d implements DialogInterface.OnClickListener {
        public C115216d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(WalletAddAddressUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$e */
    public class C115217e implements DialogInterface.OnClickListener {
        public C115217e(WalletAddAddressUI walletAddAddressUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$f */
    public class C115218f implements AddrEditView.C68517b {
        public C115218f() {
        }

        /* renamed from: a */
        public void mo94098a() {
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(WalletAddAddressUI.this, "android.permission.READ_CONTACTS", 48, (String) null, (String) null);
            Log.m105925i("MicroMsg.WalletAddAddressUI", "summerper checkPermission checkContacts[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
            if (z1) {
                WalletAddAddressUI walletAddAddressUI = WalletAddAddressUI.this;
                int i = WalletAddAddressUI.f345265r;
                walletAddAddressUI.mo174968K7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$g */
    public class C115219g implements AddrEditView.C68517b {
        public C115219g() {
        }

        /* renamed from: a */
        public void mo94098a() {
            boolean Uu0 = ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(WalletAddAddressUI.this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 64, (String) null, (String) null);
            Log.m105925i("MicroMsg.WalletAddAddressUI", "summerper checkPermission checkLocation[%b]", Boolean.valueOf(Uu0));
            if (Uu0) {
                WalletAddAddressUI walletAddAddressUI = WalletAddAddressUI.this;
                int i = WalletAddAddressUI.f345265r;
                walletAddAddressUI.mo174969L7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$h */
    public class C115220h implements View.OnClickListener {
        public C115220h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletAddAddressUI walletAddAddressUI = WalletAddAddressUI.this;
            C113320j jVar = walletAddAddressUI.f345276q;
            if (jVar != null) {
                jVar.dismiss();
                walletAddAddressUI.f345276q = null;
            }
            C113320j jVar2 = new C113320j(walletAddAddressUI, walletAddAddressUI.f345268f.getText(), new C113338k(walletAddAddressUI), Integer.MAX_VALUE, C78803b.xx0(), true);
            walletAddAddressUI.f345276q = jVar2;
            jVar2.show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$i */
    public class C115221i implements MenuItem.OnMenuItemClickListener {
        public C115221i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletAddAddressUI walletAddAddressUI = WalletAddAddressUI.this;
            int i = WalletAddAddressUI.f345265r;
            walletAddAddressUI.mo174967J7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$j */
    public class C115222j implements MenuItem.OnMenuItemClickListener {
        public C115222j() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletAddAddressUI walletAddAddressUI = WalletAddAddressUI.this;
            int i = WalletAddAddressUI.f345265r;
            if (!walletAddAddressUI.mo174965H7()) {
                return true;
            }
            WalletAddAddressUI walletAddAddressUI2 = WalletAddAddressUI.this;
            if (walletAddAddressUI2.f345266d != 0) {
                walletAddAddressUI2.f345272j = C78803b.xx0().mo183777b(WalletAddAddressUI.this.f345266d);
                Log.m105918d("MicroMsg.WalletAddAddressUI", "get addr " + WalletAddAddressUI.this.f345272j.toString());
                WalletAddAddressUI walletAddAddressUI3 = WalletAddAddressUI.this;
                walletAddAddressUI3.mo174966I7(walletAddAddressUI3.f345272j, walletAddAddressUI3.f345273n);
            } else {
                walletAddAddressUI2.f345272j = new C113174b();
            }
            String text = WalletAddAddressUI.this.f345267e.getText();
            String text2 = WalletAddAddressUI.this.f345268f.getText();
            String text3 = WalletAddAddressUI.this.f345269g.getText();
            String text4 = WalletAddAddressUI.this.f345270h.getText();
            String text5 = WalletAddAddressUI.this.f345271i.getText();
            String[] split = text2.split(" ");
            if (split.length >= 1) {
                WalletAddAddressUI.this.f345273n.f338616f = split[0];
            }
            if (split.length >= 2) {
                WalletAddAddressUI.this.f345273n.f338617g = split[1];
            }
            if (split.length >= 3) {
                WalletAddAddressUI.this.f345273n.f338618h = split[2];
            } else {
                WalletAddAddressUI.this.f345273n.f338618h = "";
            }
            if (split.length >= 4) {
                WalletAddAddressUI.this.f345273n.f338624q = split[3];
            } else {
                WalletAddAddressUI.this.f345273n.f338624q = "";
            }
            WalletAddAddressUI walletAddAddressUI4 = WalletAddAddressUI.this;
            C113174b bVar = walletAddAddressUI4.f345273n;
            bVar.f338620j = text3;
            bVar.f338621n = text;
            bVar.f338622o = text5;
            bVar.f338619i = text4;
            if (!Util.isNullOrNil(walletAddAddressUI4.f345275p)) {
                WalletAddAddressUI walletAddAddressUI5 = WalletAddAddressUI.this;
                walletAddAddressUI5.f345273n.f338623p = walletAddAddressUI5.f345275p;
            }
            WalletAddAddressUI walletAddAddressUI6 = WalletAddAddressUI.this;
            if (walletAddAddressUI6.f345266d != 0) {
                Log.m105918d("MicroMsg.WalletAddAddressUI", "modify save addr " + walletAddAddressUI6.f345273n.toString());
                C78803b.xx0().mo183784i();
                C97625j3.m125815e().mo123460f(new C119112j(walletAddAddressUI6.f345273n));
                walletAddAddressUI6.f345274o = C76879j.m92723Q(walletAddAddressUI6, "", "", true, true, new C113339l(walletAddAddressUI6));
            } else {
                Log.m105918d("MicroMsg.WalletAddAddressUI", "add save addr " + walletAddAddressUI6.f345273n.toString());
                C97625j3.m125815e().mo123460f(new C119111e(walletAddAddressUI6.f345273n));
                walletAddAddressUI6.f345274o = C76879j.m92723Q(walletAddAddressUI6, "", "", true, true, new C113340m(walletAddAddressUI6));
            }
            C5139t.m5183e(4, 7);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$k */
    public class C115223k implements DialogInterface.OnClickListener {
        public C115223k() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletAddAddressUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$l */
    public class C115224l implements DialogInterface.OnClickListener {
        public C115224l(WalletAddAddressUI walletAddAddressUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$m */
    public class C115225m implements DialogInterface.OnClickListener {
        public C115225m(WalletAddAddressUI walletAddAddressUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletAddAddressUI$n */
    public class C115226n implements DialogInterface.OnClickListener {
        public C115226n() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletAddAddressUI.this.setResult(0);
            WalletAddAddressUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public final boolean mo174965H7() {
        boolean d = this.f345267e.mo94078d();
        boolean z = false;
        if (!this.f345269g.mo94078d()) {
            d = false;
        }
        if (!this.f345268f.mo94078d()) {
            d = false;
        }
        if (!this.f345270h.mo94078d()) {
            d = false;
        }
        if (this.f345271i.mo94078d()) {
            z = d;
        }
        enableOptionMenu(z);
        return z;
    }

    /* renamed from: I7 */
    public final void mo174966I7(C113174b bVar, C113174b bVar2) {
        if (bVar != null && bVar2 != null) {
            bVar2.f338614d = bVar.f338614d;
            bVar2.f338616f = bVar.f338616f;
            bVar2.f338617g = bVar.f338617g;
            bVar2.f338618h = bVar.f338618h;
            bVar2.f338620j = bVar.f338620j;
            bVar2.f338621n = bVar.f338621n;
            bVar2.f338622o = bVar.f338622o;
            bVar2.f338619i = bVar.f338619i;
            bVar2.f338623p = bVar.f338623p;
            bVar2.f338624q = bVar.f338624q;
        }
    }

    /* renamed from: J7 */
    public final void mo174967J7() {
        int i = this.f345266d == 0 ? C0966R.string.f7418fq : C0966R.string.f7419fr;
        boolean e = this.f345267e.mo94079e();
        boolean z = true;
        if (this.f345269g.mo94079e()) {
            e = true;
        }
        if (this.f345268f.mo94079e()) {
            e = true;
        }
        if (this.f345270h.mo94079e()) {
            e = true;
        }
        if (!this.f345271i.mo94079e()) {
            z = e;
        }
        if (z) {
            C76879j.m92743n(this, i, C0966R.string.a3h, new C115226n(), (DialogInterface.OnClickListener) null);
            return;
        }
        setResult(0);
        finish();
    }

    /* renamed from: K7 */
    public final void mo174968K7() {
        if (!((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.CONTRACT, C113177k.C113178a.MINE, new C115213a())) {
            try {
                startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 2);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WalletAddAddressUI", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: L7 */
    public final void mo174969L7() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f345268f.getText())) {
            sb.append(this.f345268f.getText());
        }
        if (!TextUtils.isEmpty(this.f345269g.getText())) {
            sb.append(this.f345269g.getText());
        }
        Intent intent = new Intent();
        intent.putExtra("wallet_address", sb.toString());
        intent.putExtra("map_view_type", 8);
        intent.putExtra("type_tag", -1);
        intent.putExtra("key_geo_coder_four_level", true);
        C88144b.m109795m(this, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 3);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cdb;
    }

    public void initView() {
        C78803b.xx0().mo183782g();
        MMScrollView mMScrollView = (MMScrollView) findViewById(C0966R.C0970id.ljl);
        mMScrollView.mo94158a(mMScrollView, mMScrollView);
        this.f345267e = (AddrEditView) findViewById(C0966R.C0970id.f5625k6);
        this.f345268f = (AddrEditView) findViewById(C0966R.C0970id.f5613ju);
        this.f345269g = (AddrEditView) findViewById(C0966R.C0970id.f5614jv);
        this.f345270h = (AddrEditView) findViewById(C0966R.C0970id.f5637kh);
        this.f345271i = (AddrEditView) findViewById(C0966R.C0970id.f5627k8);
        if (getIntent().getBooleanExtra("force_light_mode", false)) {
            findViewById(C0966R.C0970id.ljl).setBackgroundResource(C0966R.color.f2975b6);
            this.f345267e.mo94076b();
            this.f345268f.mo94076b();
            this.f345269g.mo94076b();
            this.f345270h.mo94076b();
            this.f345271i.mo94076b();
            setActionbarColor(getContext().getResources().getColor(C0966R.color.UN_BW_93));
            setNavigationbarColor(getContext().getResources().getColor(C0966R.color.UN_BW_93));
        }
        this.f345267e.setOnInputValidChangeListener(this);
        this.f345268f.setOnInputValidChangeListener(this);
        this.f345269g.setOnInputValidChangeListener(this);
        this.f345270h.setOnInputValidChangeListener(this);
        this.f345271i.setOnInputValidChangeListener(this);
        this.f345267e.setInfoIvOnClickListener(new C115218f());
        this.f345268f.setInfoIvOnClickListener(new C115219g());
        this.f345268f.setOnClickListener(new C115220h());
        if (this.f345266d != 0) {
            C113174b b = C78803b.xx0().mo183777b(this.f345266d);
            this.f345272j = b;
            if (b == null) {
                Log.m105928w("MicroMsg.WalletAddAddressUI", "addr is null");
                finish();
                return;
            }
            this.f345267e.setValStr(b.f338621n);
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f345272j.f338616f)) {
                sb.append(this.f345272j.f338616f);
            }
            if (!TextUtils.isEmpty(this.f345272j.f338617g)) {
                sb.append(" ");
                sb.append(this.f345272j.f338617g);
            }
            if (!TextUtils.isEmpty(this.f345272j.f338618h)) {
                sb.append(" ");
                sb.append(this.f345272j.f338618h);
            }
            if (!TextUtils.isEmpty(this.f345272j.f338624q)) {
                sb.append(" ");
                sb.append(this.f345272j.f338624q);
            }
            this.f345268f.setValStr(sb.toString());
            this.f345269g.setValStr(this.f345272j.f338620j);
            this.f345270h.setValStr(this.f345272j.f338619i);
            this.f345271i.setValStr(this.f345272j.f338622o);
        }
        setBackBtn(new C115221i());
        addTextOptionMenu(0, getString(C0966R.string.a2n), new C115222j(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        mo174965H7();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x024a, code lost:
        if (r5.isClosed() == false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024c, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0234, code lost:
        if (r5.isClosed() == false) goto L_0x024c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0230  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r23, int r24, android.content.Intent r25) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = 1
            r5 = -1
            java.lang.String r6 = "MicroMsg.WalletAddAddressUI"
            if (r0 == r4) goto L_0x02a0
            java.lang.String r7 = ""
            r8 = 2
            if (r0 == r8) goto L_0x00fa
            r4 = 3
            if (r0 == r4) goto L_0x0018
            goto L_0x02f4
        L_0x0018:
            if (r2 != r5) goto L_0x00f3
            java.lang.String r0 = "key_pick_addr"
            android.os.Parcelable r0 = r3.getParcelableExtra(r0)
            com.tencent.mm.modelgeo.Addr r0 = (com.tencent.p014mm.modelgeo.Addr) r0
            if (r0 == 0) goto L_0x02f4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "addr: "
            r2.append(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
            java.lang.String r2 = r0.f343960h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x0046
            java.lang.String r2 = r0.f343959g
        L_0x0046:
            zg0.p r3 = xg0.C78803b.xx0()
            java.lang.String r4 = r0.f343958f
            java.lang.String r5 = r0.f343961i
            java.lang.String r6 = r0.f343965p
            com.tencent.mm.plugin.address.model.RcptItem r2 = r3.mo183783h(r4, r2, r5, r6)
            java.lang.String r3 = " "
            if (r2 == 0) goto L_0x0082
            java.lang.String r4 = r2.f196786d
            r5 = r2
        L_0x005b:
            zg0.p r6 = xg0.C78803b.xx0()
            int r5 = r5.f196790h
            com.tencent.mm.plugin.address.model.RcptItem r5 = r6.mo183779d(r5)
            if (r5 == 0) goto L_0x007c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.f196786d
            r6.append(r7)
            r6.append(r3)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            goto L_0x005b
        L_0x007c:
            com.tencent.mm.plugin.address.ui.AddrEditView r5 = r1.f345268f
            r5.setValStr(r4)
            goto L_0x0087
        L_0x0082:
            com.tencent.mm.plugin.address.ui.AddrEditView r4 = r1.f345268f
            r4.setValStr(r7)
        L_0x0087:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r0.f343962j
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0099
            java.lang.String r5 = r0.f343962j
            r4.append(r5)
        L_0x0099:
            java.lang.String r5 = r0.f343963n
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00a6
            java.lang.String r5 = r0.f343963n
            r4.append(r5)
        L_0x00a6:
            java.lang.String r5 = r0.f343964o
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00b3
            java.lang.String r5 = r0.f343964o
            r4.append(r5)
        L_0x00b3:
            java.lang.String r5 = r0.f343967r
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00c3
            r4.append(r3)
            java.lang.String r3 = r0.f343967r
            r4.append(r3)
        L_0x00c3:
            java.lang.String r3 = r0.f343967r
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x00db
            java.lang.String r3 = r0.f343956d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x00db
            com.tencent.mm.plugin.address.ui.AddrEditView r3 = r1.f345269g
            java.lang.String r0 = r0.f343956d
            r3.setValStr(r0)
            goto L_0x00e4
        L_0x00db:
            com.tencent.mm.plugin.address.ui.AddrEditView r0 = r1.f345269g
            java.lang.String r3 = r4.toString()
            r0.setValStr(r3)
        L_0x00e4:
            if (r2 == 0) goto L_0x02f4
            com.tencent.mm.plugin.address.ui.AddrEditView r0 = r1.f345270h
            java.lang.String r3 = r2.f196788f
            r0.setValStr(r3)
            java.lang.String r0 = r2.f196787e
            r1.f345275p = r0
            goto L_0x02f4
        L_0x00f3:
            java.lang.String r0 = "MallRecharge pay result : cancel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x02f4
        L_0x00fa:
            if (r2 != r5) goto L_0x02f4
            android.net.Uri r10 = r25.getData()
            if (r10 != 0) goto L_0x010a
            java.lang.String r0 = "uri == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            goto L_0x02f4
        L_0x010a:
            android.content.Context r0 = r22.getBaseContext()
            java.lang.String r2 = "phoneNumber : "
            java.lang.String r3 = "MicroMsg.AddressBookUtil"
            java.lang.Class<aw.d> r5 = p447aw.C103918d.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            aw.d r5 = (p447aw.C103918d) r5
            r6 = 0
            java.lang.String r9 = "android.permission.READ_CONTACTS"
            boolean r5 = r5.Un0(r0, r9, r6)
            r15 = 0
            if (r5 != 0) goto L_0x012b
            java.lang.String r0 = "no contact permission"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x025b
        L_0x012b:
            android.content.ContentResolver r9 = r0.getContentResolver()     // Catch:{ Exception -> 0x0239, all -> 0x0237 }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            android.database.Cursor r5 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0239, all -> 0x0237 }
            if (r5 == 0) goto L_0x022c
            int r9 = r5.getCount()     // Catch:{ Exception -> 0x022a }
            if (r9 <= 0) goto L_0x022c
            r5.moveToFirst()     // Catch:{ Exception -> 0x022a }
            java.lang.String r9 = "has_phone_number"
            int r9 = r5.getColumnIndex(r9)     // Catch:{ Exception -> 0x022a }
            if (r9 <= 0) goto L_0x0150
            int r9 = r5.getInt(r9)     // Catch:{ Exception -> 0x022a }
            if (r9 <= 0) goto L_0x022c
        L_0x0150:
            java.lang.String r9 = "_id"
            int r9 = r5.getColumnIndex(r9)     // Catch:{ Exception -> 0x022a }
            java.lang.String r9 = r5.getString(r9)     // Catch:{ Exception -> 0x022a }
            android.content.ContentResolver r16 = r0.getContentResolver()     // Catch:{ Exception -> 0x017c }
            android.net.Uri r17 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ Exception -> 0x017c }
            r18 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017c }
            r0.<init>()     // Catch:{ Exception -> 0x017c }
            java.lang.String r10 = "contact_id = "
            r0.append(r10)     // Catch:{ Exception -> 0x017c }
            r0.append(r9)     // Catch:{ Exception -> 0x017c }
            java.lang.String r19 = r0.toString()     // Catch:{ Exception -> 0x017c }
            r20 = 0
            r21 = 0
            android.database.Cursor r0 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x017c }
            goto L_0x0185
        L_0x017c:
            r0 = move-exception
            java.lang.String r9 = "getContactsInfo2:"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x022a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r9, r10)     // Catch:{ Exception -> 0x022a }
            r0 = r15
        L_0x0185:
            if (r0 == 0) goto L_0x0216
            boolean r9 = r0.moveToFirst()     // Catch:{ Exception -> 0x022a }
            if (r9 == 0) goto L_0x0216
            r9 = r15
            r10 = r9
        L_0x018f:
            boolean r11 = r0.isAfterLast()     // Catch:{ Exception -> 0x0224 }
            if (r11 != 0) goto L_0x0218
            java.lang.String r11 = "data1"
            int r11 = r0.getColumnIndex(r11)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r12 = "display_name"
            int r12 = r0.getColumnIndex(r12)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r11 = r0.getString(r11)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r10 = r0.getString(r12)     // Catch:{ Exception -> 0x0224 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0224 }
            r12.<init>()     // Catch:{ Exception -> 0x0224 }
            java.lang.String r13 = "username : "
            r12.append(r13)     // Catch:{ Exception -> 0x0224 }
            r12.append(r10)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0224 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r12)     // Catch:{ Exception -> 0x0224 }
            if (r11 == 0) goto L_0x0211
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0224 }
            r12.<init>()     // Catch:{ Exception -> 0x0224 }
            r12.append(r2)     // Catch:{ Exception -> 0x0224 }
            r12.append(r11)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0224 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r12)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r12 = "\\D"
            java.lang.String r11 = r11.replaceAll(r12, r7)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r12 = "86"
            boolean r12 = r11.startsWith(r12)     // Catch:{ Exception -> 0x0224 }
            if (r12 == 0) goto L_0x01e4
            java.lang.String r11 = r11.substring(r8)     // Catch:{ Exception -> 0x0224 }
        L_0x01e4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0224 }
            r12.<init>()     // Catch:{ Exception -> 0x0224 }
            r12.append(r2)     // Catch:{ Exception -> 0x0224 }
            r12.append(r11)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0224 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r12)     // Catch:{ Exception -> 0x0224 }
            boolean r12 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r11)     // Catch:{ Exception -> 0x0224 }
            if (r12 == 0) goto L_0x01fd
            r9 = r11
        L_0x01fd:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0224 }
            r11.<init>()     // Catch:{ Exception -> 0x0224 }
            java.lang.String r12 = "phoneResult : "
            r11.append(r12)     // Catch:{ Exception -> 0x0224 }
            r11.append(r9)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0224 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r11)     // Catch:{ Exception -> 0x0224 }
        L_0x0211:
            r0.moveToNext()     // Catch:{ Exception -> 0x0224 }
            goto L_0x018f
        L_0x0216:
            r9 = r15
            r10 = r9
        L_0x0218:
            if (r0 == 0) goto L_0x022e
            boolean r2 = r0.isClosed()     // Catch:{ Exception -> 0x0224 }
            if (r2 != 0) goto L_0x022e
            r0.close()     // Catch:{ Exception -> 0x0224 }
            goto L_0x022e
        L_0x0224:
            r0 = move-exception
            goto L_0x023d
        L_0x0226:
            r0 = move-exception
            r15 = r5
            goto L_0x0294
        L_0x022a:
            r0 = move-exception
            goto L_0x023b
        L_0x022c:
            r9 = r15
            r10 = r9
        L_0x022e:
            if (r5 == 0) goto L_0x024f
            boolean r0 = r5.isClosed()
            if (r0 != 0) goto L_0x024f
            goto L_0x024c
        L_0x0237:
            r0 = move-exception
            goto L_0x0294
        L_0x0239:
            r0 = move-exception
            r5 = r15
        L_0x023b:
            r9 = r15
            r10 = r9
        L_0x023d:
            java.lang.String r2 = "getContactsInfo1:"
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0226 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r11)     // Catch:{ all -> 0x0226 }
            if (r5 == 0) goto L_0x024f
            boolean r0 = r5.isClosed()
            if (r0 != 0) goto L_0x024f
        L_0x024c:
            r5.close()
        L_0x024f:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x025d
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x025d
        L_0x025b:
            r0 = r15
            goto L_0x0263
        L_0x025d:
            java.lang.String[] r0 = new java.lang.String[r8]
            r0[r6] = r10
            r0[r4] = r9
        L_0x0263:
            r2 = 2131820858(0x7f11013a, float:1.9274443E38)
            if (r0 == 0) goto L_0x0270
            int r3 = r0.length
            if (r3 != r8) goto L_0x0270
            r15 = r0[r6]
            r0 = r0[r4]
            goto L_0x0278
        L_0x0270:
            java.lang.String r0 = r1.getString(r2)
            nj3.C76879j.m92748s(r1, r0, r7)
            r0 = r15
        L_0x0278:
            com.tencent.mm.plugin.address.ui.AddrEditView r3 = r1.f345267e
            r3.setValStr(r15)
            com.tencent.mm.plugin.address.ui.AddrEditView r3 = r1.f345271i
            r3.setValStr(r0)
            boolean r0 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r0)
            if (r0 == 0) goto L_0x028c
            r22.mo174965H7()
            goto L_0x02f4
        L_0x028c:
            java.lang.String r0 = r1.getString(r2)
            nj3.C76879j.m92748s(r1, r0, r7)
            goto L_0x02f4
        L_0x0294:
            if (r15 == 0) goto L_0x029f
            boolean r2 = r15.isClosed()
            if (r2 != 0) goto L_0x029f
            r15.close()
        L_0x029f:
            throw r0
        L_0x02a0:
            if (r2 != r5) goto L_0x02f4
            java.lang.String r0 = "karea_result"
            java.lang.String r0 = r3.getStringExtra(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x02c7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "AREA_RESULT:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
            com.tencent.mm.plugin.address.ui.AddrEditView r2 = r1.f345268f
            r2.setValStr(r0)
        L_0x02c7:
            java.lang.String r0 = "kpost_code"
            java.lang.String r0 = r3.getStringExtra(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x02ec
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "post:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
            com.tencent.mm.plugin.address.ui.AddrEditView r2 = r1.f345270h
            r2.setValStr(r0)
        L_0x02ec:
            java.lang.String r0 = "kwcode"
            java.lang.String r0 = r3.getStringExtra(r0)
            r1.f345275p = r0
        L_0x02f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.address.p879ui.WalletAddAddressUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C97625j3.m125815e().mo123455a(v2helper.EMethodOutputVolumeScaleEnable, this);
        C97625j3.m125815e().mo123455a(418, this);
        Log.m105918d("MicroMsg.WalletAddAddressUI", "index Oncreate");
        Log.setLevel(0, false);
        int intExtra = getIntent().getIntExtra("address_id", 0);
        this.f345266d = intExtra;
        if (intExtra == 0) {
            setMMTitle((int) C0966R.string.f7416fo);
        } else {
            setMMTitle((int) C0966R.string.f7475h9);
        }
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(v2helper.EMethodOutputVolumeScaleEnable, this);
        C97625j3.m125815e().mo123470p(418, this);
        C119113p xx02 = C78803b.xx0();
        xx02.getClass();
        Log.m105924i("MicroMsg.WalletAddrMgr", "clean data");
        ((ArrayList) xx02.f356683d).clear();
        xx02.f356682c.clear();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        mo174967J7();
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.WalletAddAddressUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.WalletAddAddressUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 48) {
            if (i == 64) {
                if (iArr[0] == 0) {
                    mo174969L7();
                    return;
                }
                C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C115216d(), new C115217e(this));
            }
        } else if (iArr[0] == 0) {
            mo174968K7();
        } else {
            C76879j.m92709C(this, getString(C0966R.string.hhs), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C115214b(), new C115215c(this));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Dialog dialog = this.f345274o;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (i == 0 && i2 == 0) {
            C54460a aVar = C78803b.xx0().f356680a;
            if (aVar.f152728d.size() > 0) {
                mo174966I7(this.f345273n, this.f345272j);
                C113174b first = aVar.f152728d.getFirst();
                if (first != null) {
                    setResult(-1, C7328a.m7472a(first));
                } else {
                    setResult(0);
                }
            } else {
                setResult(0);
            }
            finish();
            return;
        }
        switch (i2) {
            case -3104:
            case -3103:
            case -3102:
                C76879j.m92749t(this, str, "", new C115224l(this));
                return;
            case -3100:
                C76879j.m92744o(this, C0966R.string.f7415fn, 0, false, new C115223k());
                return;
            default:
                C76879j.m92744o(this, C0966R.string.f7413fl, 0, false, new C115225m(this));
                return;
        }
    }
}
