package com.tencent.p014mm.plugin.account.security.p023ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI */
public class SecurityAccountIntroUI extends MMWizardActivity implements C11385n {

    /* renamed from: p */
    public static final String f196633p = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?lang=%s&t=w_unprotect&step=1&f=Android");

    /* renamed from: e */
    public String f196634e;

    /* renamed from: f */
    public String f196635f;

    /* renamed from: g */
    public String f196636g;

    /* renamed from: h */
    public String f196637h;

    /* renamed from: i */
    public boolean f196638i = false;

    /* renamed from: j */
    public ProgressDialog f196639j = null;

    /* renamed from: n */
    public Button f196640n;

    /* renamed from: o */
    public String f196641o;

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI$a */
    public class C68436a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI$a$a */
        public class C68437a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C117747y f196643d;

            public C68437a(C68436a aVar, C117747y yVar) {
                this.f196643d = yVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f196643d);
            }
        }

        public C68436a() {
        }

        /* JADX WARNING: type inference failed for: r1v3, types: [ob0.y] */
        /* JADX WARNING: type inference failed for: r14v1, types: [hg0.j0] */
        /* JADX WARNING: type inference failed for: r7v2, types: [bc0.a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r22) {
            /*
                r21 = this;
                r6 = r21
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r22
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r21
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI r0 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountIntroUI.this
                boolean r1 = r0.f196638i
                if (r1 != 0) goto L_0x0038
                bc0.a r1 = new bc0.a
                java.lang.String r8 = r0.f196635f
                r9 = 10
                r11 = 0
                java.lang.String r13 = r0.f196634e
                java.lang.String r10 = ""
                java.lang.String r12 = ""
                r7 = r1
                r7.<init>((java.lang.String) r8, (int) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12, (java.lang.String) r13)
                goto L_0x004a
            L_0x0038:
                hg0.j0 r1 = new hg0.j0
                java.lang.String r15 = r0.f196635f
                r16 = 10
                r18 = 0
                java.lang.String r17 = ""
                java.lang.String r19 = ""
                java.lang.String r20 = ""
                r14 = r1
                r14.<init>(r15, r16, r17, r18, r19, r20)
            L_0x004a:
                ob0.b0 r0 = f40.C86709a0.m107524d()
                r0.mo123460f(r1)
                com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI r0 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountIntroUI.this
                r2 = 2131821704(0x7f110488, float:1.9276159E38)
                java.lang.String r8 = r0.getString(r2)
                com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI r2 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountIntroUI.this
                r3 = 2131835145(0x7f113909, float:1.930342E38)
                java.lang.String r9 = r2.getString(r3)
                r10 = 1
                r11 = 1
                com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI$a$a r12 = new com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI$a$a
                r12.<init>(r6, r1)
                r7 = r0
                qo3.i0 r1 = nj3.C76879j.m92723Q(r7, r8, r9, r10, r11, r12)
                r0.f196639j = r1
                java.lang.String r0 = "com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountIntroUI.C68436a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI$b */
    public class C68438b implements View.OnClickListener {
        public C68438b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(SecurityAccountIntroUI.this.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), SecurityAccountIntroUI.this);
            Intent intent = new Intent();
            if (Util.isNullOrNil(SecurityAccountIntroUI.this.f196637h)) {
                intent.putExtra("rawUrl", String.format(SecurityAccountIntroUI.f196633p, new Object[]{loadApplicationLanguage}));
            } else {
                intent.putExtra("rawUrl", SecurityAccountIntroUI.this.f196637h);
            }
            intent.putExtra("useJs", true);
            intent.putExtra("vertical_scroll", true);
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, SecurityAccountIntroUI.this.getString(C0966R.string.ia9));
            intent.putExtra("show_bottom", false);
            intent.putExtra("showShare", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, SecurityAccountIntroUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI$c */
    public class C68439c implements MenuItem.OnMenuItemClickListener {
        public C68439c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SecurityAccountIntroUI securityAccountIntroUI = SecurityAccountIntroUI.this;
            String str = SecurityAccountIntroUI.f196633p;
            C78595a.m94985e(securityAccountIntroUI.f196641o);
            securityAccountIntroUI.mo7678H7();
            securityAccountIntroUI.mo7681K7(1);
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bvl;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.iah);
        findViewById(C0966R.C0970id.hn8).setOnClickListener(new C68436a());
        if (!this.f196638i) {
            this.f196640n = (Button) findViewById(C0966R.C0970id.be9);
            if (!Util.isNullOrNil(this.f196636g)) {
                this.f196640n.setText(this.f196636g);
            }
            this.f196640n.setVisibility(0);
            this.f196640n.setOnClickListener(new C68438b());
        }
        setBackBtn(new C68439c());
    }

    public void onCreate(Bundle bundle) {
        Map<String, String> parseXml;
        super.onCreate(bundle);
        this.f196634e = getIntent().getStringExtra("auth_ticket");
        this.f196635f = getIntent().getStringExtra("binded_mobile");
        this.f196638i = getIntent().getBooleanExtra("re_open_verify", false);
        String stringExtra = getIntent().getStringExtra("close_safe_device_style");
        Log.m105925i("MicroMsg.SecurityAccountIntroUI", "summerphone authTicket[%s], showStyle[%s]", Util.secPrint(this.f196634e), stringExtra);
        if (!Util.isNullOrNil(stringExtra) && (parseXml = XmlParser.parseXml(stringExtra, "wording", (String) null)) != null) {
            this.f196636g = parseXml.get(".wording.title");
            String str = parseXml.get(".wording.url");
            this.f196637h = str;
            Log.m105925i("MicroMsg.SecurityAccountIntroUI", "summerphone closeBtnText[%s], jumpUrl[%s]", this.f196636g, str);
        }
        this.f196641o = C78595a.m94981a();
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        C78595a.m94985e(this.f196641o);
        mo7678H7();
        mo7681K7(1);
        return true;
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107524d().mo123470p(145, this);
        C86709a0.m107524d().mo123470p(132, this);
        if (!this.f196638i) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("L600_100");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L600_100"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, false, sb.toString());
        }
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(145, this);
        C86709a0.m107524d().mo123455a(132, this);
        if (!this.f196638i) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("L600_100");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L600_100"));
            sb.append(",");
            sb.append(1);
            C78595a.m94983c(10645, true, sb.toString());
            C78595a.m94984d("L600_100");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r5, int r6, java.lang.String r7, ob0.C117747y r8) {
        /*
            r4 = this;
            android.app.ProgressDialog r0 = r4.f196639j
            r1 = 0
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0012
            android.app.ProgressDialog r0 = r4.f196639j
            r0.dismiss()
            r4.f196639j = r1
        L_0x0012:
            r0 = 1
            if (r5 != 0) goto L_0x008e
            if (r6 != 0) goto L_0x008e
            boolean r5 = r4.f196638i
            if (r5 != 0) goto L_0x0028
            bc0.a r8 = (bc0.C67216a) r8
            com.tencent.mm.network.u r5 = r8.f193010d
            bc0.a$c r5 = (bc0.C67216a.C67220c) r5
            qe3.a0 r5 = r5.f193017b
            te3.gd r5 = r5.f353291a
            java.lang.String r5 = r5.f227449o
            goto L_0x0034
        L_0x0028:
            hg0.j0 r8 = (hg0.C76170j0) r8
            ob0.c r5 = r8.f223161d
            ob0.c$d r5 = r5.f127056b
            pe3.a r5 = r5.f127083a
            te3.gd r5 = (te3.C77934gd) r5
            java.lang.String r5 = r5.f227449o
        L_0x0034:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "duanyi test authTicket_login = "
            r6.append(r7)
            java.lang.String r7 = r4.f196634e
            r6.append(r7)
            java.lang.String r7 = "duanyi test authTicket_check = "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.SecurityAccountIntroUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r6)
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI> r7 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountVerifyUI.class
            r6.<init>(r4, r7)
            java.lang.String r7 = "auth_ticket"
            r6.putExtra(r7, r5)
            java.lang.String r5 = r4.f196635f
            java.lang.String r7 = "binded_mobile"
            r6.putExtra(r7, r5)
            boolean r5 = r4.f196638i
            java.lang.String r7 = "re_open_verify"
            r6.putExtra(r7, r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r7 = "from_source"
            int r5 = r5.getIntExtra(r7, r0)
            r6.putExtra(r7, r5)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r4, r6)
            android.content.Intent r5 = r4.getIntent()
            int r5 = r5.getIntExtra(r7, r0)
            r6 = 3
            if (r5 != r6) goto L_0x0101
            r4.finish()
            goto L_0x0101
        L_0x008e:
            r8 = -74
            r2 = 0
            if (r6 == r8) goto L_0x00c5
            r8 = -57
            if (r6 == r8) goto L_0x00ba
            r8 = -41
            if (r6 == r8) goto L_0x00af
            r8 = -34
            if (r6 == r8) goto L_0x00a4
            r8 = -1
            if (r6 == r8) goto L_0x00ba
            r8 = 0
            goto L_0x00cf
        L_0x00a4:
            r8 = 2131822482(0x7f110792, float:1.9277737E38)
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r4, (int) r8, (int) r2)
            r8.show()
            goto L_0x00ce
        L_0x00af:
            r8 = 2131822481(0x7f110791, float:1.9277735E38)
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r4, (int) r8, (int) r2)
            r8.show()
            goto L_0x00ce
        L_0x00ba:
            r8 = 2131821478(0x7f1103a6, float:1.92757E38)
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r4, (int) r8, (int) r2)
            r8.show()
            goto L_0x00ce
        L_0x00c5:
            r8 = 2131822478(0x7f11078e, float:1.9277729E38)
            r3 = 2131821704(0x7f110488, float:1.9276159E38)
            nj3.C76879j.m92742m(r4, r8, r3, r1)
        L_0x00ce:
            r8 = 1
        L_0x00cf:
            if (r8 != 0) goto L_0x0101
            java.lang.Class<om.f> r8 = p214om.C11502f.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            om.f r8 = (p214om.C11502f) r8
            wc3.y r8 = r8.mo11461Sr()
            boolean r7 = r8.mo93163uP(r4, r5, r6, r7)
            if (r7 == 0) goto L_0x00e4
            goto L_0x0101
        L_0x00e4:
            r7 = 2131835143(0x7f113907, float:1.9303416E38)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8[r2] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r8[r0] = r5
            java.lang.String r5 = r4.getString(r7, r8)
            android.widget.Toast r5 = p910lj.C76701a.makeText((android.content.Context) r4, (java.lang.CharSequence) r5, (int) r2)
            r5.show()
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountIntroUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
