package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75375u;
import eb0.C75576f4;
import eb0.C7624i3;
import f40.C86709a0;
import nj3.C76879j;
import ob0.C11385n;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI */
public class LoginByMobileSendSmsUI extends MMActivity implements C11385n {

    /* renamed from: A */
    public static final /* synthetic */ int f344474A = 0;

    /* renamed from: d */
    public String f344475d = "";

    /* renamed from: e */
    public String f344476e = "";

    /* renamed from: f */
    public String f344477f = "";

    /* renamed from: g */
    public C115135m0 f344478g = new C115135m0();

    /* renamed from: h */
    public boolean f344479h;

    /* renamed from: i */
    public boolean f344480i;

    /* renamed from: j */
    public String f344481j;

    /* renamed from: n */
    public SecurityImage f344482n = null;

    /* renamed from: o */
    public String f344483o = "";

    /* renamed from: p */
    public String f344484p;

    /* renamed from: q */
    public String f344485q;

    /* renamed from: r */
    public String f344486r = "";

    /* renamed from: s */
    public ProgressDialog f344487s;

    /* renamed from: t */
    public int f344488t;

    /* renamed from: u */
    public Button f344489u;

    /* renamed from: v */
    public Button f344490v;

    /* renamed from: w */
    public TextView f344491w;

    /* renamed from: x */
    public TextView f344492x;

    /* renamed from: y */
    public MTimerHandler f344493y;

    /* renamed from: z */
    public int f344494z = 15;

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI$a */
    public class C114924a implements MenuItem.OnMenuItemClickListener {
        public C114924a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LoginByMobileSendSmsUI loginByMobileSendSmsUI = LoginByMobileSendSmsUI.this;
            int i = LoginByMobileSendSmsUI.f344474A;
            C76879j.m92750u(loginByMobileSendSmsUI, loginByMobileSendSmsUI.getString(C0966R.string.hx_), "", new C115193w(loginByMobileSendSmsUI), (DialogInterface.OnClickListener) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI$b */
    public class C114925b implements C75576f4.C75578b {
        public C114925b(LoginByMobileSendSmsUI loginByMobileSendSmsUI) {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55443A3().mo55422X0(new byte[0], new byte[0], new byte[0], C86709a0.m107523b().mo121110g());
            }
        }
    }

    /* renamed from: H7 */
    public final C75375u mo174611H7(String str) {
        C75375u uVar = new C75375u(str);
        Log.m105919d("MicroMsg.LoginByMobileSendSmsUI", "content: %s", str);
        int indexOf = str.indexOf(32) + 1;
        uVar.mo105705b(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(C0966R.dimen.f3883ht)), indexOf, str.length(), 33);
        uVar.mo105705b(new ForegroundColorSpan(getResources().getColor(C0966R.color.f3536x0)), indexOf, str.length(), 33);
        return uVar;
    }

    /* renamed from: I7 */
    public final void mo174612I7() {
        MTimerHandler mTimerHandler = this.f344493y;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f344490v.setText(C0966R.string.hx8);
        this.f344490v.setEnabled(true);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bgf;
    }

    public void initView() {
        super.initView();
        ((TextView) findViewById(C0966R.C0970id.jbu)).setText(getString(C0966R.string.hxd, new Object[]{this.f344475d}));
        TextView textView = (TextView) findViewById(C0966R.C0970id.jbr);
        this.f344491w = textView;
        textView.setText(mo174611H7(getString(C0966R.string.hxc, new Object[]{this.f344476e})));
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.jbv);
        this.f344492x = textView2;
        textView2.setText(mo174611H7(getString(C0966R.string.hxf, new Object[]{this.f344477f})));
        this.f344489u = (Button) findViewById(C0966R.C0970id.jbq);
        this.f344490v = (Button) findViewById(C0966R.C0970id.hfe);
        setMMTitle((int) C0966R.string.hxe);
        setBackBtn(new C114924a());
        this.f344478g.f345162b = this.f344475d;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f344475d = Util.nullAsNil(getIntent().getStringExtra("from_mobile"));
        this.f344480i = getIntent().getBooleanExtra("from_switch_account", false);
        this.f344481j = C7624i3.f25910c.mo19a("login_weixin_username", "");
        initView();
        C67216a aVar = new C67216a(this.f344475d, 16, "", 0, "", 1);
        C86709a0.m107524d().mo123460f(aVar);
        this.f344487s = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C115202z(this, aVar));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C76879j.m92750u(this, getString(C0966R.string.hx_), "", new C115193w(this), (DialogInterface.OnClickListener) null);
        return true;
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(145, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x03af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r18, int r19, java.lang.String r20, ob0.C117747y r21) {
        /*
            r17 = this;
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            java.lang.Class<om.f> r0 = p214om.C11502f.class
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r14 = 0
            r2[r14] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r15 = 1
            r2[r15] = r3
            r9 = 2
            r2[r9] = r13
            java.lang.String r3 = "MicroMsg.LoginByMobileSendSmsUI"
            java.lang.String r4 = "errType %s, errCode %d, errMsg %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            int r2 = r21.getType()
            r6 = -106(0xffffffffffffff96, float:NaN)
            r7 = -75
            java.lang.String r8 = ""
            r4 = 701(0x2bd, float:9.82E-43)
            r5 = 145(0x91, float:2.03E-43)
            if (r2 != r5) goto L_0x0155
            android.app.ProgressDialog r0 = r10.f344487s
            if (r0 == 0) goto L_0x003c
            r0.dismiss()
        L_0x003c:
            r0 = r21
            bc0.a r0 = (bc0.C67216a) r0
            int r2 = r0.mo91368f()
            r5 = 16
            if (r2 != r5) goto L_0x0102
            r2 = -41
            if (r12 != r2) goto L_0x0056
            r0 = 2131834576(0x7f1136d0, float:1.9302266E38)
            r1 = 2131834577(0x7f1136d1, float:1.9302268E38)
            nj3.C76879j.m92738i(r10, r0, r1)
            return
        L_0x0056:
            if (r12 != r7) goto L_0x0063
            r0 = 2131820928(0x7f110180, float:1.9274585E38)
            java.lang.String r0 = r10.getString(r0)
            nj3.C76879j.m92748s(r10, r0, r8)
            return
        L_0x0063:
            if (r12 != r6) goto L_0x006b
            r0 = 32045(0x7d2d, float:4.4905E-41)
            sf0.C13665i0.m12970c(r10, r13, r0)
            return
        L_0x006b:
            if (r12 != 0) goto L_0x014a
            com.tencent.mm.network.u r0 = r0.f193010d
            r2 = r0
            bc0.a$c r2 = (bc0.C67216a.C67220c) r2
            qe3.a0 r2 = r2.f193017b
            te3.gd r2 = r2.f353291a
            java.lang.String r2 = r2.f227458x
            r10.f344476e = r2
            bc0.a$c r0 = (bc0.C67216a.C67220c) r0
            qe3.a0 r0 = r0.f193017b
            te3.gd r0 = r0.f353291a
            java.lang.String r0 = r0.f227459y
            r10.f344477f = r0
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r4[r14] = r2
            r4[r15] = r0
            java.lang.String r0 = "verifyCode %s, smsUpMobile %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r4)
            android.widget.TextView r0 = r10.f344491w
            java.lang.Object[] r2 = new java.lang.Object[r15]
            java.lang.String r3 = r10.f344476e
            r2[r14] = r3
            r3 = 2131834583(0x7f1136d7, float:1.930228E38)
            java.lang.String r2 = r10.getString(r3, r2)
            de3.u r2 = r10.mo174611H7(r2)
            r0.setText(r2)
            android.widget.TextView r0 = r10.f344492x
            java.lang.Object[] r2 = new java.lang.Object[r15]
            java.lang.String r3 = r10.f344477f
            r2[r14] = r3
            r3 = 2131834586(0x7f1136da, float:1.9302286E38)
            java.lang.String r2 = r10.getString(r3, r2)
            de3.u r2 = r10.mo174611H7(r2)
            r0.setText(r2)
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.String r1 = r10.f344475d
            r0[r14] = r1
            java.lang.String r1 = r10.f344477f
            r0[r15] = r1
            java.lang.String r1 = r10.f344476e
            r0[r9] = r1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r0)
            if (r0 == 0) goto L_0x00db
            android.widget.Button r0 = r10.f344489u
            r0.setEnabled(r14)
            android.widget.Button r0 = r10.f344490v
            r0.setEnabled(r14)
            goto L_0x00e5
        L_0x00db:
            android.widget.Button r0 = r10.f344490v
            com.tencent.mm.plugin.account.ui.x r1 = new com.tencent.mm.plugin.account.ui.x
            r1.<init>(r10)
            r0.setOnClickListener(r1)
        L_0x00e5:
            java.lang.String r0 = p156gj.C87203t.m108277m()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x00f7
            android.widget.Button r0 = r10.f344489u
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x0101
        L_0x00f7:
            android.widget.Button r0 = r10.f344489u
            com.tencent.mm.plugin.account.ui.y r1 = new com.tencent.mm.plugin.account.ui.y
            r1.<init>(r10)
            r0.setOnClickListener(r1)
        L_0x0101:
            return
        L_0x0102:
            r1 = 17
            if (r2 != r1) goto L_0x014a
            if (r12 != 0) goto L_0x0134
            java.lang.String r1 = r10.f344475d
            java.lang.String r0 = r0.mo91380q1()
            java.lang.String r2 = "start auto login"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123455a(r4, r10)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r3 = 252(0xfc, float:3.53E-43)
            r2.mo123455a(r3, r10)
            com.tencent.mm.plugin.account.ui.z0 r2 = new com.tencent.mm.plugin.account.ui.z0
            com.tencent.mm.plugin.account.ui.u r3 = new com.tencent.mm.plugin.account.ui.u
            r3.<init>(r10)
            java.lang.String r4 = r10.f344475d
            r2.<init>(r3, r1, r0, r4)
            r2.mo174958b(r10)
            goto L_0x0149
        L_0x0134:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)
            if (r0 != 0) goto L_0x0149
            int r0 = r10.f344488t
            r1 = 4
            if (r0 < r1) goto L_0x0149
            ei.a r0 = p148ei.C7660a.m7782a(r20)
            if (r0 == 0) goto L_0x0149
            r1 = 0
            r0.mo8792b(r10, r1, r1)
        L_0x0149:
            return
        L_0x014a:
            r1 = 0
            ei.a r0 = p148ei.C7660a.m7782a(r20)
            if (r0 == 0) goto L_0x03db
            r0.mo8792b(r10, r1, r1)
            return
        L_0x0155:
            int r2 = r21.getType()
            if (r2 == r4) goto L_0x0164
            int r2 = r21.getType()
            r5 = 252(0xfc, float:3.53E-43)
            if (r2 != r5) goto L_0x03db
            goto L_0x0166
        L_0x0164:
            r5 = 252(0xfc, float:3.53E-43)
        L_0x0166:
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123470p(r4, r10)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123470p(r5, r10)
            com.tencent.mm.plugin.account.ui.m0 r2 = r10.f344478g
            r16 = r21
            com.tencent.mm.modelsimple.a0 r16 = (com.tencent.p014mm.modelsimple.C114735a0) r16
            int r5 = r16.mo174360p1()
            r2.f345168h = r5
            com.tencent.mm.plugin.account.ui.m0 r2 = r10.f344478g
            java.lang.String r5 = r16.mo174359o1()
            r2.f345165e = r5
            com.tencent.mm.plugin.account.ui.m0 r2 = r10.f344478g
            byte[] r5 = r16.mo174357m1()
            r2.f345167g = r5
            com.tencent.mm.plugin.account.ui.m0 r2 = r10.f344478g
            java.lang.String r5 = r16.mo174358n1()
            r2.f345166f = r5
            r2 = -205(0xffffffffffffff33, float:NaN)
            if (r12 != r2) goto L_0x01a8
            java.lang.String r5 = r16.mo174355k1()
            r10.f344484p = r5
            java.lang.String r5 = r16.mo174356l1()
            r10.f344485q = r5
        L_0x01a8:
            r5 = 4
            if (r11 != r5) goto L_0x01c7
            r5 = -16
            if (r12 == r5) goto L_0x01b3
            r5 = -17
            if (r12 != r5) goto L_0x01c7
        L_0x01b3:
            ob0.b0 r5 = f40.C86709a0.m107524d()
            eb0.f4 r9 = new eb0.f4
            com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI$b r1 = new com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI$b
            r1.<init>(r10)
            r15 = 0
            r9.<init>(r1, r15)
            r5.mo123460f(r9)
            r1 = 1
            goto L_0x01c8
        L_0x01c7:
            r1 = 0
        L_0x01c8:
            r5 = 5
            if (r1 != 0) goto L_0x03dc
            if (r11 != 0) goto L_0x01d1
            if (r12 != 0) goto L_0x01d1
            goto L_0x03dc
        L_0x01d1:
            android.app.ProgressDialog r1 = r10.f344487s
            if (r1 == 0) goto L_0x01e4
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x01e4
            android.app.ProgressDialog r1 = r10.f344487s
            r1.dismiss()
            r9 = 0
            r10.f344487s = r9
            goto L_0x01e5
        L_0x01e4:
            r9 = 0
        L_0x01e5:
            if (r12 != r6) goto L_0x01ed
            r0 = 31685(0x7bc5, float:4.44E-41)
            sf0.C13665i0.m12970c(r10, r13, r0)
            return
        L_0x01ed:
            r1 = -217(0xffffffffffffff27, float:NaN)
            if (r12 != r1) goto L_0x01f9
            com.tencent.mm.modelsimple.a0$c r0 = sf0.C118276e.m166845a(r16)
            sf0.C13665i0.m12973f(r10, r0, r12)
            return
        L_0x01f9:
            r1 = 4
            if (r11 != r1) goto L_0x038a
            r1 = -2023(0xfffffffffffff819, float:NaN)
            r6 = 2131821704(0x7f110488, float:1.9276159E38)
            if (r12 == r1) goto L_0x035c
            if (r12 == r2) goto L_0x0311
            r1 = -140(0xffffffffffffff74, float:NaN)
            if (r12 == r1) goto L_0x0302
            r1 = -100
            if (r12 == r1) goto L_0x035c
            if (r12 == r7) goto L_0x02fd
            r1 = -72
            if (r12 == r1) goto L_0x02f5
            r1 = -9
            r2 = 2131832276(0x7f112dd4, float:1.9297601E38)
            if (r12 == r1) goto L_0x02ed
            r1 = -6
            if (r12 == r1) goto L_0x0273
            r1 = -3
            if (r12 == r1) goto L_0x0268
            r1 = -1
            if (r12 == r1) goto L_0x0254
            r1 = -311(0xfffffffffffffec9, float:NaN)
            if (r12 == r1) goto L_0x0273
            r1 = -310(0xfffffffffffffeca, float:NaN)
            if (r12 == r1) goto L_0x0273
            r1 = -33
            if (r12 == r1) goto L_0x0245
            r1 = -32
            if (r12 == r1) goto L_0x0235
            goto L_0x038a
        L_0x0235:
            r0 = 2131822536(0x7f1107c8, float:1.9277846E38)
            java.lang.String r0 = r10.getString(r0)
            com.tencent.mm.plugin.account.ui.a0 r1 = new com.tencent.mm.plugin.account.ui.a0
            r1.<init>(r10)
            nj3.C76879j.m92749t(r10, r0, r8, r1)
            goto L_0x026e
        L_0x0245:
            r0 = 2131822534(0x7f1107c6, float:1.9277842E38)
            r1 = 2131822540(0x7f1107cc, float:1.9277854E38)
            com.tencent.mm.plugin.account.ui.b0 r2 = new com.tencent.mm.plugin.account.ui.b0
            r2.<init>(r10)
            nj3.C76879j.m92742m(r10, r0, r1, r2)
            goto L_0x026e
        L_0x0254:
            ob0.b0 r0 = f40.C86709a0.m107524d()
            int r0 = r0.mo123467m()
            if (r0 != r5) goto L_0x02ed
            r0 = 2131833496(0x7f113298, float:1.9300076E38)
            r1 = 2131833495(0x7f113297, float:1.9300074E38)
            nj3.C76879j.m92738i(r10, r0, r1)
            goto L_0x026e
        L_0x0268:
            r0 = 2131825174(0x7f111216, float:1.9283197E38)
            nj3.C76879j.m92738i(r10, r0, r2)
        L_0x026e:
            r1 = r9
            r0 = 1
            r14 = 2
            goto L_0x03ad
        L_0x0273:
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123455a(r4, r10)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 252(0xfc, float:3.53E-43)
            r0.mo123455a(r1, r10)
            com.tencent.mm.ui.applet.SecurityImage r0 = r10.f344482n
            if (r0 != 0) goto L_0x02ab
            r1 = 2131834632(0x7f113708, float:1.930238E38)
            com.tencent.mm.plugin.account.ui.m0 r15 = r10.f344478g
            int r2 = r15.f345168h
            byte[] r3 = r15.f345167g
            java.lang.String r4 = r15.f345165e
            java.lang.String r5 = r15.f345166f
            com.tencent.mm.plugin.account.ui.c0 r6 = new com.tencent.mm.plugin.account.ui.c0
            r6.<init>(r10, r11)
            r7 = 0
            com.tencent.mm.plugin.account.ui.d0 r8 = new com.tencent.mm.plugin.account.ui.d0
            r8.<init>(r10)
            r0 = r17
            r14 = 2
            r9 = r15
            com.tencent.mm.ui.applet.SecurityImage r0 = com.tencent.p014mm.p136ui.applet.SecurityImage.C116047a.m163296a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f344482n = r0
            goto L_0x035a
        L_0x02ab:
            r14 = 2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "imgSid:"
            r0.append(r1)
            com.tencent.mm.plugin.account.ui.m0 r1 = r10.f344478g
            java.lang.String r1 = r1.f345165e
            r0.append(r1)
            java.lang.String r1 = " img len"
            r0.append(r1)
            com.tencent.mm.plugin.account.ui.m0 r1 = r10.f344478g
            byte[] r1 = r1.f345167g
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = p206nj.C76861g.m92660c()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            com.tencent.mm.ui.applet.SecurityImage r0 = r10.f344482n
            com.tencent.mm.plugin.account.ui.m0 r1 = r10.f344478g
            int r2 = r1.f345168h
            byte[] r3 = r1.f345167g
            java.lang.String r4 = r1.f345165e
            java.lang.String r1 = r1.f345166f
            r0.mo177230b(r2, r3, r4, r1)
            goto L_0x035a
        L_0x02ed:
            r14 = 2
            r0 = 2131832275(0x7f112dd3, float:1.92976E38)
            nj3.C76879j.m92738i(r10, r0, r2)
            goto L_0x035a
        L_0x02f5:
            r14 = 2
            r0 = 2131834619(0x7f1136fb, float:1.9302353E38)
            nj3.C76879j.m92738i(r10, r0, r6)
            goto L_0x035a
        L_0x02fd:
            r14 = 2
            sf0.C13665i0.m12971d(r17)
            goto L_0x035a
        L_0x0302:
            r14 = 2
            java.lang.String r0 = r10.f344483o
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x035a
            java.lang.String r0 = r10.f344483o
            sf0.C13665i0.m12972e(r10, r13, r0)
            goto L_0x035a
        L_0x0311:
            r14 = 2
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r2 = r10.f344484p
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r2)
            r4 = 0
            r1[r4] = r2
            java.lang.String r2 = r10.f344485q
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
            com.tencent.mm.plugin.account.ui.m0 r1 = r10.f344478g
            com.tencent.p014mm.plugin.account.p024ui.C115135m0.f345161i = r1
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = r10.f344484p
            java.lang.String r3 = "auth_ticket"
            r1.putExtra(r3, r2)
            java.lang.String r2 = r10.f344475d
            java.lang.String r3 = "binded_mobile"
            r1.putExtra(r3, r2)
            java.lang.String r2 = r10.f344485q
            java.lang.String r3 = "close_safe_device_style"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "from_source"
            r1.putExtra(r2, r14)
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            r0.mo93189v(r10, r1)
        L_0x035a:
            r1 = 0
            goto L_0x03a9
        L_0x035c:
            r14 = 2
            f40.C86718e.m107550n()
            f40.C86709a0.m107523b()
            java.lang.String r0 = f40.C86718e.f251747w
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0373
            r0 = 2131832656(0x7f112f50, float:1.9298372E38)
            java.lang.String r0 = kg3.C76577a.m92166q(r10, r0)
            goto L_0x0378
        L_0x0373:
            f40.C86709a0.m107523b()
            java.lang.String r0 = f40.C86718e.f251747w
        L_0x0378:
            java.lang.String r1 = r10.getString(r6)
            com.tencent.mm.plugin.account.ui.s r2 = new com.tencent.mm.plugin.account.ui.s
            r2.<init>(r10)
            com.tencent.mm.plugin.account.ui.t r3 = new com.tencent.mm.plugin.account.ui.t
            r3.<init>(r10)
            nj3.C76879j.m92719M(r10, r0, r1, r2, r3)
            goto L_0x035a
        L_0x038a:
            r14 = 2
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.y r0 = r0.mo11461Sr()
            boolean r0 = r0.mo93163uP(r10, r11, r12, r13)
            if (r0 == 0) goto L_0x03ab
            com.tencent.mm.ui.applet.SecurityImage r0 = r10.f344482n
            if (r0 == 0) goto L_0x035a
            qo3.g r1 = r0.f348170n
            if (r1 == 0) goto L_0x035a
            r1.dismiss()
            r1 = 0
            r0.f348170n = r1
        L_0x03a9:
            r0 = 1
            goto L_0x03ad
        L_0x03ab:
            r1 = 0
            r0 = 0
        L_0x03ad:
            if (r0 == 0) goto L_0x03b0
            return
        L_0x03b0:
            ei.a r0 = p148ei.C7660a.m7782a(r20)
            if (r0 == 0) goto L_0x03bd
            boolean r0 = r0.mo8792b(r10, r1, r1)
            if (r0 == 0) goto L_0x03bd
            return
        L_0x03bd:
            r0 = 2131830303(0x7f11261f, float:1.92936E38)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r3 = 0
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r4 = 1
            r1[r4] = r2
            java.lang.String r0 = r10.getString(r0, r1)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r10, (java.lang.CharSequence) r0, (int) r3)
            r0.show()
        L_0x03db:
            return
        L_0x03dc:
            r14 = 2
            r17.mo174612I7()
            f40.C86718e.m107546E()
            com.tencent.mm.plugin.account.ui.m0 r1 = r10.f344478g
            java.lang.String r1 = r1.f345162b
            sf0.C13665i0.m12968a(r10, r1)
            eb0.i3 r1 = eb0.C7624i3.f25910c
            java.lang.String r2 = "login_weixin_username"
            java.lang.String r1 = r1.mo19a(r2, r8)
            boolean r2 = r10.f344480i
            if (r2 == 0) goto L_0x043b
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r4 = r10.f344481j
            r2.mo105939b(r4, r1)
            eb0.t5 r1 = eb0.C75593t5.f222075c
            java.lang.String r2 = eb0.C75592q0.m90789s()
            java.util.Map r4 = eb0.C75592q0.m90788r()
            r1.mo105945h(r2, r4)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 14978(0x3a82, float:2.0989E-41)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = 0
            r4[r7] = r6
            r6 = 9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            eb0.t5 r5 = eb0.C75593t5.f222075c
            java.lang.String r5 = r5.mo105944g()
            r4[r14] = r5
            eb0.t5 r5 = eb0.C75593t5.f222075c
            java.lang.String r5 = r5.mo105943f()
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = p156gj.C87203t.m108273i()
            r6 = 4
            r4[r6] = r5
            r1.mo160131h(r2, r4)
        L_0x043b:
            android.app.ProgressDialog r1 = r10.f344487s
            if (r1 == 0) goto L_0x0451
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x0451
            android.app.ProgressDialog r1 = r10.f344487s
            r2 = 2131821571(0x7f110403, float:1.9275889E38)
            java.lang.String r2 = r10.getString(r2)
            r1.setMessage(r2)
        L_0x0451:
            java.lang.Object[] r1 = new java.lang.Object[r14]
            int r2 = r17.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r2
            com.tencent.mm.sdk.platformtools.MMStack r2 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "checktask LoginByMobileSendSmsUI startLauncher 0x%x, stack: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            android.content.Intent r0 = r0.mo93169b(r10)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            int r1 = r16.mo174361q1()
            java.lang.String r2 = "kstyle_show_bind_mobile_afterauth"
            r0.putExtra(r2, r1)
            int r1 = r16.mo174362r1()
            java.lang.String r2 = "kstyle_bind_recommend_show"
            r0.putExtra(r2, r1)
            com.tencent.mm.modelsimple.BindWordingContent r1 = r16.mo174363s1()
            java.lang.String r2 = "kstyle_bind_wording"
            r0.putExtra(r2, r1)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r0)
            java.lang.Object[] r1 = r8.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI"
            java.lang.String r3 = "startLauncher"
            java.lang.String r4 = "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r1 = r8.mo10231a(r0)
            android.content.Intent r1 = (android.content.Intent) r1
            r10.startActivity(r1)
            java.lang.String r1 = "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI"
            java.lang.String r2 = "startLauncher"
            java.lang.String r3 = "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r17.finish()
            boolean r0 = r16.mo174368x1()
            r10.f344479h = r0
            boolean r0 = r16.mo174365u1()
            if (r0 == 0) goto L_0x0539
            boolean r0 = r10.f344479h
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI> r2 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileSetPwdUI.class
            r1.<init>(r10, r2)
            r2 = 2131836107(0x7f113ccb, float:1.9305371E38)
            java.lang.String r2 = r10.getString(r2)
            java.lang.String r3 = "kintent_hint"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "kintent_cancelable"
            r1.putExtra(r2, r0)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r1)
            java.lang.Object[] r1 = r8.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI"
            java.lang.String r3 = "goToSetIndepPwd"
            java.lang.String r4 = "(Z)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r0 = r8.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r10.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI"
            java.lang.String r2 = "goToSetIndepPwd"
            java.lang.String r3 = "(Z)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
        L_0x0539:
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r0 != 0) goto L_0x0545
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            if (r0 == 0) goto L_0x0551
        L_0x0545:
            r0 = 2
            com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct
            r2.<init>()
            r2.f107894d = r0
            r2.mo86054n()
        L_0x0551:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.LoginByMobileSendSmsUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void onStop() {
        super.onStop();
        mo174612I7();
        C86709a0.m107524d().mo123470p(145, this);
    }
}
