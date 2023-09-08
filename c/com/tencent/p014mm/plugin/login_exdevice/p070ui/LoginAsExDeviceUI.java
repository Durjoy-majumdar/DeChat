package com.tencent.p014mm.plugin.login_exdevice.p070ui;

import a32.C39483a;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.backgroundfetch.C1633a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75576f4;
import eb0.C97625j3;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ob0.C11385n;
import p214om.C11502f;
import sf0.C90186h0;
import z22.C53734a;

/* renamed from: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI */
public class LoginAsExDeviceUI extends MMActivity implements C11385n {

    /* renamed from: u */
    public static final /* synthetic */ int f115047u = 0;

    /* renamed from: d */
    public ImageView f115048d;

    /* renamed from: e */
    public ImageView f115049e;

    /* renamed from: f */
    public Button f115050f;

    /* renamed from: g */
    public View f115051g;

    /* renamed from: h */
    public View f115052h;

    /* renamed from: i */
    public View f115053i;

    /* renamed from: j */
    public ImageView f115054j;

    /* renamed from: n */
    public TextView f115055n;

    /* renamed from: o */
    public TextView f115056o;

    /* renamed from: p */
    public ProgressDialog f115057p;

    /* renamed from: q */
    public String f115058q;

    /* renamed from: r */
    public byte[] f115059r;

    /* renamed from: s */
    public int f115060s = 200;

    /* renamed from: t */
    public C90186h0 f115061t = new C90186h0();

    /* renamed from: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI$a */
    public class C4826a implements Runnable {
        public C4826a() {
        }

        public void run() {
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(LoginAsExDeviceUI.this);
            b.addFlags(67108864);
            LoginAsExDeviceUI loginAsExDeviceUI = LoginAsExDeviceUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            LoginAsExDeviceUI loginAsExDeviceUI2 = loginAsExDeviceUI;
            C117292a.m165358d(loginAsExDeviceUI2, aVar.mo10232b(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            loginAsExDeviceUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(loginAsExDeviceUI2, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            LoginAsExDeviceUI.this.finish();
            LoginAsExDeviceUI.this.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
            C115669n.INSTANCE.mo175904A(1570, 7);
        }
    }

    /* renamed from: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI$b */
    public class C42506b implements MenuItem.OnMenuItemClickListener {
        public C42506b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LoginAsExDeviceUI loginAsExDeviceUI = LoginAsExDeviceUI.this;
            int i = LoginAsExDeviceUI.f115047u;
            loginAsExDeviceUI.getClass();
            C80610p1.m98242b(-1);
            loginAsExDeviceUI.finish();
            loginAsExDeviceUI.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI$c */
    public class C42507c implements View.OnClickListener {
        public C42507c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LoginAsExDeviceUI loginAsExDeviceUI = LoginAsExDeviceUI.this;
            int i = LoginAsExDeviceUI.f115047u;
            loginAsExDeviceUI.getClass();
            MMHandlerThread.postToMainThreadDelayed(new C39483a(loginAsExDeviceUI), 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI$d */
    public class C42508d implements Runnable {
        public C42508d() {
        }

        public void run() {
            LoginAsExDeviceUI loginAsExDeviceUI = LoginAsExDeviceUI.this;
            C86709a0.m107524d().mo123460f(new C53734a(loginAsExDeviceUI.f115058q, loginAsExDeviceUI.f115059r));
        }
    }

    /* renamed from: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI$e */
    public class C42509e implements View.OnClickListener {
        public C42509e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LoginAsExDeviceUI loginAsExDeviceUI = LoginAsExDeviceUI.this;
            int i = LoginAsExDeviceUI.f115047u;
            loginAsExDeviceUI.getClass();
            MMHandlerThread.postToMainThreadDelayed(new C39483a(loginAsExDeviceUI), 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI$f */
    public class C42510f implements C75576f4.C75578b {
        public C42510f(LoginAsExDeviceUI loginAsExDeviceUI) {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55443A3().mo55422X0(new byte[0], new byte[0], new byte[0], C97625j3.m125812b().mo105881G());
            }
        }
    }

    /* renamed from: H7 */
    public final void mo66597H7() {
        long j;
        Log.m105925i("MicroMsg.LoginAsExDeviceUI", "doCheckLogin %s", Util.getStack());
        C42508d dVar = new C42508d();
        int i = this.f115060s;
        if (i > 2000) {
            j = 2000;
        } else {
            int i2 = i + 200;
            this.f115060s = i2;
            j = (long) i2;
        }
        MMHandlerThread.postToMainThreadDelayed(dVar, j);
    }

    /* renamed from: I7 */
    public final void mo66598I7() {
        if (Util.isNullOrNil(this.f115058q) || this.f115059r == null) {
            this.f115050f.setVisibility(0);
            TextView textView = this.f115056o;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f115049e;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f115050f.setText(C0966R.string.gbz);
            this.f115050f.setOnClickListener(new C42509e());
            return;
        }
        this.f115050f.setText(C0966R.string.gck);
        TextView textView2 = this.f115056o;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        ImageView imageView2 = this.f115049e;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    /* renamed from: J7 */
    public final void mo66599J7() {
        this.f115058q = null;
        this.f115059r = null;
        this.f115048d.setImageResource(C0966R.C0969drawable.bxe);
        this.f115048d.setOnClickListener(new C42507c());
        mo66598I7();
    }

    public int getLayoutId() {
        return BuildInfo.EX_DEVICE_LOGIN ? C0966R.C0971layout.b8_ : getResources().getConfiguration().orientation == 2 ? C0966R.C0971layout.b8b : C0966R.C0971layout.b8a;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.g6e);
        this.f115051g = findViewById;
        this.f115048d = (ImageView) findViewById.findViewById(C0966R.C0970id.g5l);
        this.f115050f = (Button) this.f115051g.findViewById(C0966R.C0970id.g5k);
        this.f115056o = (TextView) this.f115051g.findViewById(C0966R.C0970id.g5i);
        this.f115049e = (ImageView) this.f115051g.findViewById(C0966R.C0970id.i_x);
        View findViewById2 = findViewById(C0966R.C0970id.g67);
        this.f115052h = findViewById2;
        ImageView imageView = (ImageView) findViewById2.findViewById(C0966R.C0970id.g69);
        TextView textView = (TextView) this.f115052h.findViewById(C0966R.C0970id.g6_);
        Button button = (Button) this.f115052h.findViewById(C0966R.C0970id.g68);
        Button button2 = (Button) this.f115052h.findViewById(C0966R.C0970id.kam);
        View findViewById3 = findViewById(C0966R.C0970id.g5h);
        this.f115053i = findViewById3;
        this.f115054j = (ImageView) findViewById3.findViewById(C0966R.C0970id.f358629g60);
        this.f115055n = (TextView) this.f115053i.findViewById(C0966R.C0970id.f358630g61);
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        hideActionbarLine();
        setBackBtn(new C42506b(), C0966R.raw.actionbar_icon_close_black);
        if (Util.isNullOrNil(null, null, null, null)) {
            setMMTitle(getResources().getString(C0966R.string.f360969gc3));
            MMHandlerThread.postToMainThreadDelayed(new C39483a(this), 0);
            return;
        }
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C80610p1.m98242b(0);
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C80610p1.m98242b(-1);
        finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f115061t.mo124431c(this, i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(502, this);
        C86709a0.m107524d().mo123455a(503, this);
        C86709a0.m107524d().mo123455a(701, this);
        C86709a0.m107524d().mo123455a(252, this);
        C86709a0.m107524d().mo123455a(C1633a.CTRL_INDEX, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x035c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r29, int r30, java.lang.String r31, ob0.C117747y r32) {
        /*
            r28 = this;
            r7 = r28
            r0 = r29
            r1 = r30
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r29)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r30)
            r8 = 1
            r3[r8] = r4
            r4 = 2
            r3[r4] = r31
            int r9 = r32.getType()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 3
            r3[r10] = r9
            java.lang.String r9 = "MicroMsg.LoginAsExDeviceUI"
            java.lang.String r11 = "errType %d, errCode %d, errMsg %s, sceneType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r3)
            android.app.ProgressDialog r3 = r7.f115057p
            if (r3 == 0) goto L_0x0037
            r3.dismiss()
        L_0x0037:
            int r3 = r32.getType()
            r11 = 502(0x1f6, float:7.03E-43)
            r12 = 200(0xc8, float:2.8E-43)
            r13 = 1570(0x622, double:7.757E-321)
            if (r3 != r11) goto L_0x00a2
            if (r0 != 0) goto L_0x0091
            if (r1 != 0) goto L_0x0091
            r0 = r32
            z22.b r0 = (z22.C53735b) r0
            ob0.c r1 = r0.f150855e
            ob0.c$d r1 = r1.f127056b
            pe3.a r1 = r1.f127083a
            te3.i32 r1 = (te3.C49793i32) r1
            te3.qv3 r1 = r1.f135077d
            byte[] r1 = sf0.C48374j0.m53715d(r1)
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r1)
            android.widget.ImageView r2 = r7.f115048d
            r2.setImageBitmap(r1)
            ob0.c r1 = r0.f150855e
            ob0.c$d r1 = r1.f127056b
            pe3.a r1 = r1.f127083a
            te3.i32 r1 = (te3.C49793i32) r1
            te3.qv3 r1 = r1.f135080g
            byte[] r1 = sf0.C48374j0.m53715d(r1)
            r7.f115059r = r1
            ob0.c r0 = r0.f150855e
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            te3.i32 r0 = (te3.C49793i32) r0
            java.lang.String r0 = r0.f135078e
            r7.f115058q = r0
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r5] = r0
            java.lang.String r0 = "get UUID %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r1)
            r28.mo66598I7()
            r7.f115060s = r12
            r28.mo66597H7()
            goto L_0x04fd
        L_0x0091:
            java.lang.String r0 = "get login qrcode failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r28.mo66599J7()
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 5
            r0.mo175904A(r13, r1)
            goto L_0x04fd
        L_0x00a2:
            int r3 = r32.getType()
            r11 = 503(0x1f7, float:7.05E-43)
            r12 = 8
            if (r3 != r11) goto L_0x037e
            r13 = 6
            if (r0 != 0) goto L_0x036d
            if (r1 != 0) goto L_0x036d
            r0 = r32
            z22.a r0 = (z22.C53734a) r0
            ob0.c r1 = r0.f150852e
            ob0.c$d r1 = r1.f127056b
            pe3.a r1 = r1.f127083a
            te3.cu r1 = (te3.C49048cu) r1
            te3.tr2 r1 = r1.f131958d
            te3.qv3 r1 = r1.f142375d
            byte[] r1 = sf0.C48374j0.m53715d(r1)
            byte[] r3 = r0.f150853f
            if (r3 == 0) goto L_0x0103
            int r11 = r3.length
            if (r11 <= 0) goto L_0x0103
            byte[] r3 = com.tencent.p014mm.protocal.MMProtocalJni.aesDecrypt(r1, r3)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            byte[] r0 = r0.f150853f
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r5] = r0
            int r0 = r1.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r8] = r0
            int r0 = r3.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r4] = r0
            java.lang.String r1 = "MicroMsg.NetSceneCheckLoginQRCode"
            java.lang.String r0 = "decrypt notifyData %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r11)
            te3.sr2 r0 = new te3.sr2
            r0.<init>()
            r0.parseFrom(r3)     // Catch:{ IOException -> 0x00fa }
            goto L_0x0104
        L_0x00fa:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r11 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r11, r0)
        L_0x0103:
            r0 = 0
        L_0x0104:
            if (r0 == 0) goto L_0x035c
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r0.f141700d
            r1[r5] = r3
            java.lang.String r3 = r7.f115058q
            r1[r8] = r3
            java.lang.String r3 = r0.f141704h
            r1[r4] = r3
            java.lang.String r3 = r0.f141706j
            r1[r10] = r3
            int r3 = r0.f141701e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 5
            int r3 = r0.f141707n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "uuid %s, UUID %s, imgurl:%s, nickName:%s, status:%s, expire %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r1)
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r2 = r0.f141700d
            r1[r5] = r2
            java.lang.String r2 = r7.f115058q
            r1[r8] = r2
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r1)
            if (r1 != 0) goto L_0x034b
            java.lang.String r1 = r7.f115058q
            java.lang.String r2 = r0.f141700d
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x034b
            int r1 = r0.f141701e
            if (r1 == r8) goto L_0x0270
            if (r1 == r4) goto L_0x0162
            if (r1 == r10) goto L_0x0156
            r28.mo66597H7()
            goto L_0x04fd
        L_0x0156:
            r28.mo66599J7()
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1570(0x622, double:7.757E-321)
            r0.mo175904A(r1, r13)
            goto L_0x04fd
        L_0x0162:
            java.lang.String r1 = r0.f141702f
            java.lang.String r0 = r0.f141703g
            java.lang.String[] r2 = new java.lang.String[r4]
            r2[r5] = r1
            r2[r8] = r0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r2)
            if (r2 != 0) goto L_0x0269
            android.view.View r2 = r7.f115053i
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r3.mo10233c(r6)
            java.lang.Object[] r14 = r3.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r16 = "onSceneEnd"
            java.lang.String r17 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r14 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r15 = "onSceneEnd"
            java.lang.String r16 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r2 = r7.f115051g
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r3.mo10233c(r4)
            java.lang.Object[] r21 = r3.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r23 = "onSceneEnd"
            java.lang.String r24 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r2
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r21 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r22 = "onSceneEnd"
            java.lang.String r23 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            android.view.View r2 = r7.f115052h
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r3.mo10233c(r4)
            java.lang.Object[] r14 = r3.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r16 = "onSceneEnd"
            java.lang.String r17 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r14 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r15 = "onSceneEnd"
            java.lang.String r16 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            com.tencent.mm.modelsimple.a0 r2 = new com.tencent.mm.modelsimple.a0
            r18 = 0
            r22 = 0
            r24 = 1
            r25 = 0
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            java.lang.String r21 = ""
            java.lang.String r23 = ""
            r15 = r2
            r16 = r1
            r17 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r2)
            android.app.ProgressDialog r0 = r7.f115057p
            if (r0 == 0) goto L_0x0253
            r0.dismiss()
        L_0x0253:
            r0 = 2131832291(0x7f112de3, float:1.9297632E38)
            java.lang.String r3 = r7.getString(r0)
            r4 = 0
            r5 = 1
            r6 = 0
            java.lang.String r2 = ""
            r1 = r28
            qo3.i0 r0 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            r7.f115057p = r0
            goto L_0x04fd
        L_0x0269:
            java.lang.String r0 = "login error when confirm, usename and pwd is empty or null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            goto L_0x04fd
        L_0x0270:
            android.view.View r1 = r7.f115053i
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r6)
            java.lang.Object[] r14 = r2.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r16 = "onSceneEnd"
            java.lang.String r17 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r15 = "onSceneEnd"
            java.lang.String r16 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r1 = r7.f115051g
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2.mo10233c(r3)
            java.lang.Object[] r21 = r2.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r23 = "onSceneEnd"
            java.lang.String r24 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r1
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r21 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r22 = "onSceneEnd"
            java.lang.String r23 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            android.view.View r1 = r7.f115052h
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2.mo10233c(r3)
            java.lang.Object[] r14 = r2.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r16 = "onSceneEnd"
            java.lang.String r17 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r15 = "onSceneEnd"
            java.lang.String r16 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r1 = r0.f141706j
            android.widget.TextView r2 = r7.f115055n
            r2.setText(r1)
            java.lang.String r1 = r0.f141704h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0346
            java.lang.String r0 = r0.f141704h
            zt3.t r1 = zt3.C119157j.f356862d
            a32.b r2 = new a32.b
            r2.<init>(r7, r0)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183875f(r2)
        L_0x0346:
            r28.mo66597H7()
            goto L_0x04fd
        L_0x034b:
            java.lang.String r0 = "check login qrcode failed! uuid invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r28.mo66599J7()
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1570(0x622, double:7.757E-321)
            r0.mo175904A(r1, r13)
            goto L_0x04fd
        L_0x035c:
            r0 = 1570(0x622, double:7.757E-321)
            java.lang.String r2 = "check login qrcode failed! loginnotify invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            r28.mo66599J7()
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2.mo175904A(r0, r13)
            goto L_0x04fd
        L_0x036d:
            r0 = 1570(0x622, double:7.757E-321)
            java.lang.String r2 = "check login qrcode failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            r28.mo66599J7()
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2.mo175904A(r0, r13)
            goto L_0x04fd
        L_0x037e:
            int r3 = r32.getType()
            r4 = 252(0xfc, float:3.53E-43)
            if (r3 == r4) goto L_0x0439
            int r3 = r32.getType()
            r4 = 701(0x2bd, float:9.82E-43)
            if (r3 != r4) goto L_0x0390
            goto L_0x0439
        L_0x0390:
            int r2 = r32.getType()
            r3 = 654(0x28e, float:9.16E-43)
            if (r2 != r3) goto L_0x04fd
            if (r0 != 0) goto L_0x03a6
            if (r1 == 0) goto L_0x039d
            goto L_0x03a6
        L_0x039d:
            r0 = r32
            z22.c r0 = (z22.C16096c) r0
            r0.getClass()
            r0 = 0
            throw r0
        L_0x03a6:
            java.lang.String r0 = "push loginurl failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            android.content.res.Resources r0 = r28.getResources()
            r1 = 2131832246(0x7f112db6, float:1.929754E38)
            java.lang.String r0 = r0.getString(r1)
            r7.setMMTitle((java.lang.String) r0)
            android.view.View r0 = r7.f115051g
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r1.mo10233c(r6)
            java.lang.Object[] r14 = r1.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r16 = "onSceneEnd"
            java.lang.String r17 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r0
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r1 = r1.mo10231a(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r14 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r15 = "onSceneEnd"
            java.lang.String r16 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r0 = r7.f115052h
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1.mo10233c(r2)
            java.lang.Object[] r21 = r1.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r23 = "onSceneEnd"
            java.lang.String r24 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r1 = r1.mo10231a(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r21 = "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI"
            java.lang.String r22 = "onSceneEnd"
            java.lang.String r23 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            r28.mo66599J7()
            goto L_0x04fd
        L_0x0439:
            if (r0 != r2) goto L_0x0456
            r2 = -16
            if (r1 == r2) goto L_0x0443
            r2 = -17
            if (r1 != r2) goto L_0x0456
        L_0x0443:
            ob0.b0 r2 = eb0.C97625j3.m125815e()
            eb0.f4 r3 = new eb0.f4
            com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI$f r4 = new com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI$f
            r4.<init>(r7)
            r6 = 0
            r3.<init>(r4, r6)
            r2.mo123460f(r3)
            goto L_0x0457
        L_0x0456:
            r8 = 0
        L_0x0457:
            if (r8 != 0) goto L_0x0476
            if (r0 != 0) goto L_0x045e
            if (r1 != 0) goto L_0x045e
            goto L_0x0476
        L_0x045e:
            java.lang.String r0 = "login failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            ei.a r0 = p148ei.C7660a.m7782a(r31)
            if (r0 == 0) goto L_0x0471
            r1 = 0
            boolean r0 = r0.mo8792b(r7, r1, r1)
            if (r0 == 0) goto L_0x0471
            return
        L_0x0471:
            r28.mo66599J7()
            goto L_0x04fd
        L_0x0476:
            r0 = 0
            f40.C86718e.m107546E()
            r1 = r32
            com.tencent.mm.modelsimple.a0 r1 = (com.tencent.p014mm.modelsimple.C114735a0) r1
            java.lang.String r2 = r1.f343983h
            eb0.i3 r3 = eb0.C7624i3.f25910c
            java.lang.String r4 = "last_login_exdevice_weixin_username"
            r3.mo8756d(r4, r2)
            com.tencent.mm.network.u r3 = r1.f343980e
            eb0.l3 r3 = (eb0.C116746l3) r3
            qe3.t r3 = r3.f350049c
            qe3.r r3 = (qe3.C118189r) r3
            te3.xk4 r3 = r3.f353315a
            te3.y7 r3 = r3.f354538e
            te3.qv3 r3 = r3.f354586g
            byte[] r3 = sf0.C48374j0.m53715d(r3)
            if (r3 == 0) goto L_0x04a9
            int r4 = r3.length
            if (r4 <= 0) goto L_0x04a9
            eb0.i3 r4 = eb0.C7624i3.f25910c
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r5)
            java.lang.String r5 = "last_login_exdevice_auth_key"
            r4.mo8756d(r5, r3)
        L_0x04a9:
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85802I4(r2)
            if (r3 == 0) goto L_0x04d8
            com.tencent.mm.network.u r3 = r1.f343980e
            eb0.l3 r3 = (eb0.C116746l3) r3
            qe3.t r3 = r3.f350049c
            qe3.r r3 = (qe3.C118189r) r3
            te3.xk4 r3 = r3.f353315a
            if (r3 == 0) goto L_0x04c0
            te3.c1 r3 = r3.f354539f
            java.lang.String r3 = r3.f353934i
            goto L_0x04c1
        L_0x04c0:
            r3 = r0
        L_0x04c1:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x04d8
            com.tencent.mm.network.u r1 = r1.f343980e
            eb0.l3 r1 = (eb0.C116746l3) r1
            qe3.t r1 = r1.f350049c
            qe3.r r1 = (qe3.C118189r) r1
            te3.xk4 r1 = r1.f353315a
            if (r1 == 0) goto L_0x04d7
            te3.c1 r0 = r1.f354539f
            java.lang.String r0 = r0.f353934i
        L_0x04d7:
            r2 = r0
        L_0x04d8:
            sf0.C13665i0.m12968a(r7, r2)
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r0 != 0) goto L_0x04e7
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            if (r0 == 0) goto L_0x04f3
        L_0x04e7:
            r0 = 1
            com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct
            r2.<init>()
            r2.f107894d = r0
            r2.mo86054n()
        L_0x04f3:
            sf0.h0 r0 = r7.f115061t
            com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI$a r1 = new com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI$a
            r1.<init>()
            r0.mo124429a(r7, r1)
        L_0x04fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.login_exdevice.p070ui.LoginAsExDeviceUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void onStop() {
        C86709a0.m107524d().mo123470p(502, this);
        C86709a0.m107524d().mo123470p(503, this);
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        C86709a0.m107524d().mo123470p(C1633a.CTRL_INDEX, this);
        super.onStop();
    }
}
