package com.tencent.p014mm.plugin.account.security.p023ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import bc0.C67216a;
import com.pay.tool.APPluginConstants;
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
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p910lj.C76701a;
import rg0.C13002g;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI */
public class SecurityAccountVerifyUI extends MMWizardActivity implements C11385n {

    /* renamed from: t */
    public static final String f196646t = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?lang=%s&t=w_unprotect&step=1&f=Android");

    /* renamed from: e */
    public EditText f196647e;

    /* renamed from: f */
    public TextView f196648f;

    /* renamed from: g */
    public TextView f196649g;

    /* renamed from: h */
    public Button f196650h;

    /* renamed from: i */
    public Button f196651i;

    /* renamed from: j */
    public String f196652j;

    /* renamed from: n */
    public String f196653n;

    /* renamed from: o */
    public String f196654o;

    /* renamed from: p */
    public String f196655p;

    /* renamed from: q */
    public MTimerHandler f196656q;

    /* renamed from: r */
    public ProgressDialog f196657r = null;

    /* renamed from: s */
    public boolean f196658s = false;

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI$a */
    public class C68440a implements TextWatcher {
        public C68440a() {
        }

        public void afterTextChanged(Editable editable) {
            SecurityAccountVerifyUI.this.enableOptionMenu(editable != null && !Util.isNullOrNil(editable.toString()));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI$b */
    public class C68441b implements MTimerHandler.CallBack {
        public C68441b() {
        }

        public boolean onTimerExpired() {
            int intValue = ((Integer) SecurityAccountVerifyUI.this.f196649g.getTag()).intValue();
            if (intValue <= 1) {
                SecurityAccountVerifyUI.this.f196651i.setVisibility(0);
                SecurityAccountVerifyUI.this.f196649g.setVisibility(8);
                return false;
            }
            int i = intValue - 1;
            SecurityAccountVerifyUI.this.f196649g.setTag(Integer.valueOf(i));
            SecurityAccountVerifyUI securityAccountVerifyUI = SecurityAccountVerifyUI.this;
            securityAccountVerifyUI.f196649g.setText(securityAccountVerifyUI.getString(C0966R.string.iaa, new Object[]{Integer.valueOf(i)}));
            if (SecurityAccountVerifyUI.this.f196649g.getVisibility() != 0) {
                SecurityAccountVerifyUI.this.f196649g.setVisibility(0);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI$c */
    public class C68442c implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI$c$a */
        public class C68443a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C117747y f196662d;

            public C68443a(C68442c cVar, C117747y yVar) {
                this.f196662d = yVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f196662d);
            }
        }

        public C68442c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105926v("MicroMsg.SecurityAccountVerifyUI", "on resend verify code button click");
            SecurityAccountVerifyUI.this.f196651i.setVisibility(8);
            SecurityAccountVerifyUI.this.f196649g.setTag(60);
            SecurityAccountVerifyUI.this.f196656q.stopTimer();
            SecurityAccountVerifyUI.this.f196656q.startTimer(1000);
            SecurityAccountVerifyUI securityAccountVerifyUI = SecurityAccountVerifyUI.this;
            C67216a aVar = new C67216a(securityAccountVerifyUI.f196652j, 10, "", 0, "", securityAccountVerifyUI.f196653n);
            C86709a0.m107524d().mo123460f(aVar);
            SecurityAccountVerifyUI securityAccountVerifyUI2 = SecurityAccountVerifyUI.this;
            securityAccountVerifyUI2.f196657r = C76879j.m92723Q(securityAccountVerifyUI2.getContext(), SecurityAccountVerifyUI.this.getString(C0966R.string.a3h), SecurityAccountVerifyUI.this.getString(C0966R.string.iad), true, true, new C68443a(this, aVar));
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI$d */
    public class C68444d implements View.OnClickListener {
        public C68444d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C68444d.class.getName());
            sb.append(",");
            sb.append("L600_300");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L600_300"));
            sb.append(",");
            sb.append(1);
            C78595a.m94982b(10645, sb.toString());
            String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(SecurityAccountVerifyUI.this.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), SecurityAccountVerifyUI.this);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", String.format(SecurityAccountVerifyUI.f196646t, new Object[]{loadApplicationLanguage}));
            intent.putExtra("useJs", true);
            intent.putExtra("vertical_scroll", true);
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, SecurityAccountVerifyUI.this.getString(C0966R.string.ia9));
            intent.putExtra("show_bottom", false);
            intent.putExtra("showShare", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, SecurityAccountVerifyUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI$e */
    public class C68445e implements MenuItem.OnMenuItemClickListener {
        public C68445e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SecurityAccountVerifyUI securityAccountVerifyUI = SecurityAccountVerifyUI.this;
            String str = SecurityAccountVerifyUI.f196646t;
            securityAccountVerifyUI.mo7678H7();
            securityAccountVerifyUI.mo7681K7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI$f */
    public class C68446f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI$f$a */
        public class C68447a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C117747y f196666d;

            public C68447a(C68446f fVar, C117747y yVar) {
                this.f196666d = yVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f196666d);
            }
        }

        public C68446f() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: hg0.j0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: bc0.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: bc0.a} */
        /* JADX WARNING: type inference failed for: r7v0, types: [ob0.y] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onMenuItemClick(android.view.MenuItem r12) {
            /*
                r11 = this;
                com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI r12 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountVerifyUI.this
                android.widget.EditText r12 = r12.f196647e
                android.text.Editable r12 = r12.getText()
                java.lang.String r12 = r12.toString()
                java.lang.String r3 = r12.trim()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                r8 = 1
                r9 = 2131821704(0x7f110488, float:1.9276159E38)
                if (r12 == 0) goto L_0x0023
                com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI r12 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountVerifyUI.this
                r0 = 2131822541(0x7f1107cd, float:1.9277856E38)
                nj3.C76879j.m92738i(r12, r0, r9)
                return r8
            L_0x0023:
                com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI r12 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountVerifyUI.this
                r12.hideVKB()
                com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI r12 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountVerifyUI.this
                java.lang.String r0 = rg0.C13002g.m12461a(r12)
                r12.f196654o = r0
                com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI r12 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountVerifyUI.this
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = android.os.Build.MANUFACTURER
                r0.append(r1)
                java.lang.String r1 = "-"
                r0.append(r1)
                java.lang.String r1 = p156gj.C87203t.m108275k()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r12.f196655p = r0
                com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI r12 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountVerifyUI.this
                boolean r0 = r12.f196658s
                if (r0 != 0) goto L_0x0076
                bc0.a r7 = new bc0.a
                java.lang.String r1 = r12.f196652j
                r2 = 11
                r4 = 0
                java.lang.String r6 = r12.f196653n
                java.lang.String r10 = r12.f196654o
                java.lang.String r12 = r12.f196655p
                java.lang.String r5 = ""
                r0 = r7
                r0.<init>((java.lang.String) r1, (int) r2, (java.lang.String) r3, (int) r4, (java.lang.String) r5, (java.lang.String) r6)
                com.tencent.mm.network.u r0 = r7.f193010d
                qe3.w$d r0 = r0.getReqObj()
                qe3.z r0 = (qe3.C101131z) r0
                te3.fd r0 = r0.f296026a
                r0.f227369o = r10
                r0.f227370p = r12
                goto L_0x0088
            L_0x0076:
                hg0.j0 r10 = new hg0.j0
                java.lang.String r1 = r12.f196652j
                r2 = 11
                r4 = 0
                java.lang.String r6 = r12.f196654o
                java.lang.String r7 = r12.f196655p
                java.lang.String r5 = ""
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r7 = r10
            L_0x0088:
                ob0.b0 r12 = f40.C86709a0.m107524d()
                r12.mo123460f(r7)
                com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI r12 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountVerifyUI.this
                java.lang.String r1 = r12.getString(r9)
                com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI r0 = com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountVerifyUI.this
                r2 = 2131822529(0x7f1107c1, float:1.9277832E38)
                java.lang.String r2 = r0.getString(r2)
                r3 = 1
                r4 = 1
                com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI$f$a r5 = new com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI$f$a
                r5.<init>(r11, r7)
                r0 = r12
                qo3.i0 r0 = nj3.C76879j.m92723Q(r0, r1, r2, r3, r4, r5)
                r12.f196657r = r0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.security.p023ui.SecurityAccountVerifyUI.C68446f.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: N7 */
    public final boolean mo93985N7(int i, int i2, String str) {
        if (((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(getContext(), i, i2, str)) {
            return true;
        }
        if (i2 != -74) {
            if (i2 != -57) {
                if (i2 == -41) {
                    C76701a.makeText((Context) getContext(), (int) C0966R.string.ajw, 0).show();
                    return true;
                } else if (i2 != -1) {
                    switch (i2) {
                        case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidObjectException:
                            C76701a.makeText((Context) this, (int) C0966R.string.ajx, 0).show();
                            return true;
                        case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidClassException:
                            C76879j.m92742m(getContext(), C0966R.string.al9, C0966R.string.ale, (DialogInterface.OnClickListener) null);
                            return true;
                        case APPluginConstants.ERROR_IO_NoHttpResponseException:
                            C76879j.m92742m(getContext(), C0966R.string.al_, C0966R.string.ale, (DialogInterface.OnClickListener) null);
                            return true;
                        default:
                            return false;
                    }
                }
            }
            C76701a.makeText((Context) getContext(), (int) C0966R.string.f7966xq, 0).show();
            return true;
        }
        C76879j.m92742m(getContext(), C0966R.string.ajt, C0966R.string.a3h, (DialogInterface.OnClickListener) null);
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bvn;
    }

    public void initView() {
        this.f196652j = getIntent().getStringExtra("binded_mobile");
        this.f196653n = getIntent().getStringExtra("auth_ticket");
        this.f196658s = getIntent().getBooleanExtra("re_open_verify", false);
        this.f196647e = (EditText) findViewById(C0966R.C0970id.a9x);
        this.f196648f = (TextView) findViewById(C0966R.C0970id.gwa);
        this.f196649g = (TextView) findViewById(C0966R.C0970id.iqb);
        this.f196651i = (Button) findViewById(C0966R.C0970id.iqa);
        this.f196647e.addTextChangedListener(new C68440a());
        this.f196648f.setText(Util.getPrivacyPhoneNum(this.f196652j));
        this.f196649g.setTag(60);
        this.f196656q = new MTimerHandler(new C68441b(), true);
        this.f196651i.setOnClickListener(new C68442c());
        if (!this.f196658s) {
            Button button = (Button) findViewById(C0966R.C0970id.be9);
            this.f196650h = button;
            button.setVisibility(0);
            this.f196650h.setOnClickListener(new C68444d());
        }
        setBackBtn(new C68445e());
        addTextOptionMenu(0, getString(C0966R.string.f360089a13), new C68446f());
        enableOptionMenu(false);
        setMMTitle((int) C0966R.string.f361225ia3);
        this.f196656q.startTimer(1000);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C78595a.m94981a();
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f196656q.stopTimer();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo7678H7();
        mo7681K7(1);
        return true;
    }

    public void onPause() {
        C86709a0.m107524d().mo123470p(145, this);
        C86709a0.m107524d().mo123470p(132, this);
        super.onPause();
        if (!this.f196658s) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("L600_200");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L600_200"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, false, sb.toString());
        }
    }

    public void onResume() {
        C86709a0.m107524d().mo123455a(145, this);
        C86709a0.m107524d().mo123455a(132, this);
        super.onResume();
        if (!this.f196658s) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("L600_200");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L600_200"));
            sb.append(",");
            sb.append(1);
            C78595a.m94983c(10645, true, sb.toString());
            C78595a.m94984d("L600_200");
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ProgressDialog progressDialog = this.f196657r;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f196657r.dismiss();
            this.f196657r = null;
        }
        int type = yVar.getType();
        if (type != 132) {
            if (type == 145) {
                C67216a aVar = (C67216a) yVar;
                if (aVar.mo91368f() == 10) {
                    if (i == 0 && i2 == 0) {
                        Log.m105924i("MicroMsg.SecurityAccountVerifyUI", "resend verify code successfully");
                        return;
                    }
                    Log.m105929w("MicroMsg.SecurityAccountVerifyUI", "resend verify code fail, errType %d, errCode %d", Integer.valueOf(i), Integer.valueOf(i2));
                    if (!mo93985N7(i, i2, str)) {
                        C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.iab, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                    }
                } else if (aVar.mo91368f() != 11) {
                    Log.m105929w("MicroMsg.SecurityAccountVerifyUI", "unknow bind mobile for reg op code %d, errType %d, errCode %d", Integer.valueOf(aVar.mo91368f()), Integer.valueOf(i), Integer.valueOf(i2));
                } else if (i == 0 && i2 == 0) {
                    this.f196653n = ((C67216a.C67220c) aVar.f193010d).f193017b.f353291a.f227449o;
                    Log.m105918d("MicroMsg.SecurityAccountVerifyUI", "duanyi test bind opmobile verify authticket = " + this.f196653n);
                    Class cls = C11502f.class;
                    int intExtra = getIntent().getIntExtra("from_source", 1);
                    Intent intent = new Intent();
                    intent.putExtra("from_source", intExtra);
                    intent.putExtra("binded_mobile", this.f196652j);
                    if (!(intExtra == 1 || intExtra == 2)) {
                        if (intExtra == 3) {
                            intent.addFlags(67108864);
                            intent.putExtra("auth_ticket", this.f196653n);
                            String stringExtra = getIntent().getStringExtra("WizardTransactionId");
                            if (stringExtra == null) {
                                stringExtra = "";
                            }
                            HashMap hashMap = (HashMap) MMWizardActivity.f24166d;
                            Intent intent2 = (Intent) hashMap.get(stringExtra);
                            hashMap.clear();
                            if (intent2 != null) {
                                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93181n(this, intent, intent2);
                            } else {
                                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93181n(this, intent, (Intent) null);
                            }
                            finish();
                            return;
                        } else if (!(intExtra == 5 || intExtra == 6)) {
                            mo7681K7(1);
                            return;
                        }
                    }
                    intent.addFlags(67108864);
                    intent.putExtra("auth_ticket", this.f196653n);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93181n(this, intent, (Intent) null);
                    finish();
                } else {
                    Log.m105929w("MicroMsg.SecurityAccountVerifyUI", "verify verify-code fail, errType %d, errCode %d", Integer.valueOf(i), Integer.valueOf(i2));
                    if (!mo93985N7(i, i2, str)) {
                        C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.iaf, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                    }
                }
            }
        } else if (i == 0 && i2 == 0) {
            C13002g.m12462b(true, true);
            Intent intent3 = new Intent(this, MySafeDeviceListUI.class);
            intent3.addFlags(67108864);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent3);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
        } else if (!mo93985N7(i, i2, str)) {
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.iaf, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
        }
    }
}
