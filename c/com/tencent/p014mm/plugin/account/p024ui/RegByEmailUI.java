package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMAutoCompleteTextView;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82102w;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import hg0.C59887l0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lg3.C88504k;
import nj3.C76879j;
import ob0.C11385n;
import p214om.C11502f;
import qe3.C89625d;
import sf0.C118277g;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByEmailUI */
public class RegByEmailUI extends MMActivity implements C11385n {

    /* renamed from: o */
    public static String[] f344804o;

    /* renamed from: d */
    public MMAutoCompleteTextView f344805d;

    /* renamed from: e */
    public EditText f344806e;

    /* renamed from: f */
    public CheckBox f344807f;

    /* renamed from: g */
    public ProgressDialog f344808g = null;

    /* renamed from: h */
    public String f344809h;

    /* renamed from: i */
    public String f344810i;

    /* renamed from: j */
    public Map<String, String> f344811j;

    /* renamed from: n */
    public String f344812n;

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByEmailUI$a */
    public class C114994a implements Runnable {
        public C114994a() {
        }

        public void run() {
            RegByEmailUI.this.f344806e.requestFocus();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByEmailUI$b */
    public class C114995b implements View.OnClickListener {
        public C114995b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByEmailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RegByEmailUI regByEmailUI = RegByEmailUI.this;
            Util.jump(regByEmailUI, regByEmailUI.getString(C0966R.string.f361485k83, new Object[]{LocaleUtil.getApplicationLanguage(), LocaleUtil.getCurrentCountryCode()}));
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByEmailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByEmailUI$c */
    public class C114996c implements CompoundButton.OnCheckedChangeListener {
        public C114996c() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            RegByEmailUI.m161882H7(RegByEmailUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByEmailUI$d */
    public class C114997d implements MenuItem.OnMenuItemClickListener {
        public C114997d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RegByEmailUI.m161883I7(RegByEmailUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByEmailUI$e */
    public class C114998e implements TextWatcher {
        public C114998e() {
        }

        public void afterTextChanged(Editable editable) {
            RegByEmailUI.m161882H7(RegByEmailUI.this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByEmailUI$f */
    public class C114999f implements TextWatcher {
        public C114999f() {
        }

        public void afterTextChanged(Editable editable) {
            RegByEmailUI.m161882H7(RegByEmailUI.this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByEmailUI$g */
    public class C115000g implements TextView.OnEditorActionListener {
        public C115000g() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((i != 6 && i != 5) || !RegByEmailUI.this.f344807f.isChecked()) {
                return false;
            }
            RegByEmailUI.m161883I7(RegByEmailUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByEmailUI$h */
    public class C115001h implements View.OnKeyListener {
        public C115001h() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByEmailUI$8", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (66 != i || keyEvent.getAction() != 0) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/RegByEmailUI$8", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            } else if (!RegByEmailUI.this.f344807f.isChecked()) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/RegByEmailUI$8", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            } else {
                RegByEmailUI.m161883I7(RegByEmailUI.this);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/account/ui/RegByEmailUI$8", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByEmailUI$i */
    public class C115002i implements MenuItem.OnMenuItemClickListener {
        public C115002i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RegByEmailUI regByEmailUI = RegByEmailUI.this;
            String[] strArr = RegByEmailUI.f344804o;
            regByEmailUI.getClass();
            C76879j.m92739j(regByEmailUI, C0966R.string.hvu, C0966R.string.hvx, C0966R.string.a18, C0966R.string.f7926wf, new C115173q2(regByEmailUI), (DialogInterface.OnClickListener) null);
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m161882H7(RegByEmailUI regByEmailUI) {
        if (Util.isNullOrNil(regByEmailUI.f344805d.getText().toString().trim()) || Util.isNullOrNil(regByEmailUI.f344806e.getText().toString().trim()) || !regByEmailUI.f344807f.isChecked()) {
            regByEmailUI.enableOptionMenu(false);
        } else {
            regByEmailUI.enableOptionMenu(true);
        }
    }

    /* renamed from: I7 */
    public static void m161883I7(RegByEmailUI regByEmailUI) {
        regByEmailUI.f344809h = regByEmailUI.f344805d.getText().toString().trim();
        regByEmailUI.f344810i = regByEmailUI.f344806e.getText().toString();
        if (Util.isNullOrNil(regByEmailUI.f344809h)) {
            C76879j.m92738i(regByEmailUI, C0966R.string.f361174hw1, C0966R.string.hvx);
        } else if (!Util.isValidEmail(regByEmailUI.f344809h)) {
            C76879j.m92738i(regByEmailUI, C0966R.string.f361173hw0, C0966R.string.hvx);
        } else if (Util.isNullOrNil(regByEmailUI.f344810i)) {
            C76879j.m92738i(regByEmailUI, C0966R.string.f361175hw2, C0966R.string.hvx);
        } else if (!Util.isValidPassword(regByEmailUI.f344810i)) {
            C76879j.m92738i(regByEmailUI, C0966R.string.k_1, C0966R.string.hvx);
        } else {
            regByEmailUI.hideVKB();
            C59887l0 l0Var = new C59887l0(regByEmailUI.f344809h, regByEmailUI.f344810i);
            C86709a0.m107524d().mo123460f(l0Var);
            regByEmailUI.f344808g = C76879j.m92723Q(regByEmailUI, regByEmailUI.getString(C0966R.string.a3h), regByEmailUI.getString(C0966R.string.a4d), true, true, new C115177r2(regByEmailUI, l0Var));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359943br3;
    }

    public void initView() {
        this.f344805d = (MMAutoCompleteTextView) findViewById(C0966R.C0970id.ijw);
        this.f344806e = (EditText) findViewById(C0966R.C0970id.f359050ik3);
        this.f344807f = (CheckBox) findViewById(C0966R.C0970id.f5656l1);
        if (!Util.isNullOrNil((String) null)) {
            this.f344806e.postDelayed(new C114994a(), 500);
            this.f344805d.setText((CharSequence) null);
        }
        if (f344804o != null) {
            C68495f fVar = new C68495f(this, f344804o, "@");
            this.f344805d.setSpilter("@");
            this.f344805d.setDropDownAnchor(C0966R.C0970id.ijx);
            MMAutoCompleteTextView mMAutoCompleteTextView = this.f344805d;
            mMAutoCompleteTextView.setDropDownVerticalOffset(mMAutoCompleteTextView.getPaddingBottom());
            this.f344805d.setAdapter(fVar);
        }
        findViewById(C0966R.C0970id.f5655l0).setOnClickListener(new C114995b());
        this.f344807f.setOnCheckedChangeListener(new C114996c());
        addTextOptionMenu(0, getString(C0966R.string.f360089a13), new C114997d());
        enableOptionMenu(false);
        this.f344805d.addTextChangedListener(new C114998e());
        this.f344806e.addTextChangedListener(new C114999f());
        this.f344806e.setOnEditorActionListener(new C115000g());
        this.f344806e.setOnKeyListener(new C115001h());
        setBackBtn(new C115002i());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getString(C0966R.string.hw_);
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            string = getString(C0966R.string.a0u) + C88504k.m110376b(this);
        }
        setMMTitle(string);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
        Map<String, String> map = null;
        Log.m105925i("MicroMsg.RegByEmailUI", "get google account:[%s]", null);
        C118277g gVar = C118277g.f353517b;
        try {
            String streamToString = Util.streamToString(getAssets().open("config/EmailAddress.xml"));
            if (!Util.isNullOrNil(streamToString)) {
                Map<String, String> parseXml = XmlParser.parseXml(streamToString, "config", (String) null);
                if (parseXml != null) {
                    if (!parseXml.isEmpty()) {
                        Map<String, String> map2 = gVar.f353518a;
                        if (map2 == null) {
                            gVar.f353518a = new HashMap();
                            int i = 0;
                            while (true) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(".config.format");
                                sb.append(i == 0 ? "" : Integer.valueOf(i));
                                String sb4 = sb.toString();
                                if (parseXml.get(sb4) == null) {
                                    break;
                                }
                                String str = sb4 + ".emaildomain";
                                String str2 = parseXml.get(str);
                                String str3 = parseXml.get(sb4 + ".loginpage");
                                if (!Util.isNullOrNil(str2) && !Util.isNullOrNil(str3)) {
                                    ((HashMap) gVar.f353518a).put(str2, str3);
                                }
                                i++;
                            }
                            map = gVar.f353518a;
                        } else {
                            map = map2;
                        }
                    }
                }
                Log.m105918d("MicroMsg.EmailFormater", "values null");
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.EmailFormater", "parse email failed:[%s]", e.getMessage());
        }
        this.f344811j = map;
        if (map != null && !map.isEmpty()) {
            f344804o = new String[this.f344811j.size()];
            this.f344811j.keySet().toArray(f344804o);
        }
        this.f344812n = C78595a.m94981a();
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        C76879j.m92739j(this, C0966R.string.hvu, C0966R.string.hvx, C0966R.string.a18, C0966R.string.f7926wf, new C115173q2(this), (DialogInterface.OnClickListener) null);
        return true;
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107524d().mo123470p(C82102w.CTRL_INDEX, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("R500_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("R500_100"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(C82102w.CTRL_INDEX, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("R500_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("R500_100"));
        sb.append(",");
        sb.append(1);
        C78595a.m94983c(10645, true, sb.toString());
        C78595a.m94984d("R500_100");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x017f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r17, int r18, java.lang.String r19, ob0.C117747y r20) {
        /*
            r16 = this;
            r8 = r16
            r7 = r17
            r9 = r18
            r10 = r19
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onSceneEnd: errType = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " errCode = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = " errMsg = "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.RegByEmailUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.app.ProgressDialog r0 = r8.f344808g
            r11 = 0
            if (r0 == 0) goto L_0x0040
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0040
            android.app.ProgressDialog r0 = r8.f344808g
            r0.dismiss()
            r8.f344808g = r11
        L_0x0040:
            int r0 = r20.getType()
            r2 = 481(0x1e1, float:6.74E-43)
            r12 = 1
            r13 = 0
            if (r0 == r2) goto L_0x005c
            java.lang.Object[] r0 = new java.lang.Object[r12]
            int r2 = r20.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r13] = r2
            java.lang.String r2 = "error cgi type callback:[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            return
        L_0x005c:
            r14 = 2
            if (r7 != 0) goto L_0x00dc
            if (r9 != 0) goto L_0x00dc
            java.lang.String r0 = "R500_200"
            wg0.C78595a.m94985e(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.ui.EmailVerifyUI> r1 = com.tencent.p014mm.plugin.account.p024ui.EmailVerifyUI.class
            r0.<init>(r8, r1)
            java.lang.String r1 = r8.f344809h
            java.lang.String r2 = "email_address"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r8.f344810i
            java.lang.String r2 = "password"
            r0.putExtra(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f344811j
            if (r1 == 0) goto L_0x00a1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00a1
            java.lang.String r1 = r8.f344809h
            java.lang.String r2 = "@"
            java.lang.String[] r1 = r1.split(r2)
            if (r1 == 0) goto L_0x00a1
            int r2 = r1.length
            if (r2 != r14) goto L_0x00a1
            r1 = r1[r12]
            java.util.Map<java.lang.String, java.lang.String> r2 = r8.f344811j
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "email_login_page"
            r0.putExtra(r2, r1)
        L_0x00a1:
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/account/ui/RegByEmailUI"
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r16
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r9.mo10231a(r13)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/account/ui/RegByEmailUI"
            java.lang.String r2 = "onSceneEnd"
            java.lang.String r3 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r16
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01c6
        L_0x00dc:
            java.lang.Class<om.f> r0 = p214om.C11502f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.y r0 = r0.mo11461Sr()
            boolean r0 = r0.mo93163uP(r8, r7, r9, r10)
            r15 = 2131834530(0x7f1136a2, float:1.9302173E38)
            if (r0 == 0) goto L_0x00f3
            goto L_0x017c
        L_0x00f3:
            r0 = -111(0xffffffffffffff91, float:NaN)
            if (r9 == r0) goto L_0x0176
            r0 = -75
            if (r9 == r0) goto L_0x016c
            r0 = -34
            if (r9 == r0) goto L_0x0161
            r0 = -7
            if (r9 == r0) goto L_0x0105
            r0 = 0
            goto L_0x017d
        L_0x0105:
            r0 = 10645(0x2995, float:1.4917E-41)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f40.C86709a0.m107523b()
            java.lang.String r2 = f40.C86718e.m107547e()
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            java.lang.Class r3 = r16.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "R20_email_duplicate_confirm"
            r1.append(r3)
            r1.append(r2)
            f40.C86709a0.m107523b()
            int r3 = f40.C86718e.m107548f(r3)
            r1.append(r3)
            r1.append(r2)
            r2 = 3
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            wg0.C78595a.m94982b(r0, r1)
            r1 = 2131834544(0x7f1136b0, float:1.9302201E38)
            r2 = 2131834530(0x7f1136a2, float:1.9302173E38)
            r3 = 2131834546(0x7f1136b2, float:1.9302205E38)
            r4 = 2131834545(0x7f1136b1, float:1.9302203E38)
            com.tencent.mm.plugin.account.ui.s2 r5 = new com.tencent.mm.plugin.account.ui.s2
            r5.<init>(r8)
            r6 = 0
            r0 = r16
            nj3.C76879j.m92739j(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x017c
        L_0x0161:
            r0 = 2131834528(0x7f1136a0, float:1.9302169E38)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r8, (int) r0, (int) r13)
            r0.show()
            goto L_0x017c
        L_0x016c:
            r0 = 2131820929(0x7f110181, float:1.9274587E38)
            r1 = 2131834523(0x7f11369b, float:1.9302159E38)
            nj3.C76879j.m92738i(r8, r0, r1)
            goto L_0x017c
        L_0x0176:
            r0 = 2131834533(0x7f1136a5, float:1.930218E38)
            nj3.C76879j.m92738i(r8, r0, r15)
        L_0x017c:
            r0 = 1
        L_0x017d:
            if (r0 == 0) goto L_0x0180
            return
        L_0x0180:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r0 != 0) goto L_0x01aa
            java.lang.String r0 = "e"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r10, r0, r11)
            if (r0 == 0) goto L_0x01aa
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x01aa
            java.lang.String r1 = ".e.Content"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x01aa
            java.lang.String r1 = r8.getString(r15)
            nj3.C76879j.m92748s(r8, r0, r1)
            return
        L_0x01aa:
            r0 = 2131834541(0x7f1136ad, float:1.9302195E38)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r1[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r1[r12] = r2
            java.lang.String r0 = r8.getString(r0, r1)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r8, (java.lang.CharSequence) r0, (int) r13)
            r0.show()
        L_0x01c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.RegByEmailUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
