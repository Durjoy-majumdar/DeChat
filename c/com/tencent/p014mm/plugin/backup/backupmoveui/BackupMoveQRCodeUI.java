package com.tencent.p014mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import av0.C16686a;
import av0.C16710c;
import com.pay.tool.APPluginConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C0991y;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86718e;
import gv0.C20842c;
import gv0.C20859o;
import java.util.HashSet;
import nj3.C76879j;
import sv0.C22400b;
import yu0.C102909e;
import yu0.C102910f;
import zu0.C23584k;

/* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI */
public class BackupMoveQRCodeUI extends MMWizardActivity {

    /* renamed from: n */
    public static final /* synthetic */ int f50003n = 0;

    /* renamed from: e */
    public ImageView f50004e;

    /* renamed from: f */
    public TextView f50005f;

    /* renamed from: g */
    public TextView f50006g;

    /* renamed from: h */
    public boolean f50007h = false;

    /* renamed from: i */
    public C22400b f50008i;

    /* renamed from: j */
    public C102909e f50009j = new C18073a();

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI$a */
    public class C18073a implements C102909e {

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI$a$a */
        public class C18074a implements DialogInterface.OnClickListener {
            public C18074a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_SELECT_TIME_AND_QUICK_BACKUP, user click move all.");
                BackupMoveQRCodeUI.this.f50007h = false;
                C16686a.m16193i().mo17662k().mo17702f(true);
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI$a$b */
        public class C18075b implements DialogInterface.OnClickListener {
            public C18075b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_SELECT_TIME_AND_QUICK_BACKUP, user click cancel.");
                BackupMoveQRCodeUI.m18706N7(BackupMoveQRCodeUI.this);
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI$a$c */
        public class C18076c implements DialogInterface.OnClickListener {
            public C18076c() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_SELECT_TIME, user click move all.");
                BackupMoveQRCodeUI.this.f50007h = false;
                C16686a.m16193i().mo17662k().mo17702f(true);
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI$a$d */
        public class C18077d implements DialogInterface.OnClickListener {
            public C18077d() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_SELECT_TIME, user click cancel.");
                BackupMoveQRCodeUI.m18706N7(BackupMoveQRCodeUI.this);
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI$a$e */
        public class C18078e implements DialogInterface.OnClickListener {
            public C18078e(C18073a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.BackupMoveQRCodeUI", "move phone old version");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI$a$f */
        public class C18079f implements DialogInterface.OnClickListener {
            public C18079f() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_QUICK_BACKUP, user click move all.");
                BackupMoveQRCodeUI.this.f50007h = false;
                C16686a.m16193i().mo17662k().mo17702f(true);
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI$a$g */
        public class C18080g implements DialogInterface.OnClickListener {
            public C18080g() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_QUICK_BACKUP, user click cancel.");
                BackupMoveQRCodeUI.m18706N7(BackupMoveQRCodeUI.this);
            }
        }

        public C18073a() {
        }

        /* renamed from: K */
        public void mo17667K(int i) {
            Log.m105925i("MicroMsg.BackupMoveQRCodeUI", "onUpdateUIProgress backupState:%d", Integer.valueOf(i));
            BackupMoveQRCodeUI backupMoveQRCodeUI = BackupMoveQRCodeUI.this;
            if (!backupMoveQRCodeUI.f50007h) {
                if (i == -12) {
                    C76879j.m92741l(backupMoveQRCodeUI, C0966R.string.f360136ab0, 0, C0966R.string.aei, 0, false, new C18078e(this), (DialogInterface.OnClickListener) null, C0966R.color.f3113fp);
                } else if (i == -11 || i == -4) {
                    backupMoveQRCodeUI.f50005f.setText(C0966R.string.aap);
                    BackupMoveQRCodeUI backupMoveQRCodeUI2 = BackupMoveQRCodeUI.this;
                    backupMoveQRCodeUI2.f50005f.setTextColor(backupMoveQRCodeUI2.getContext().getResources().getColor(C0966R.color.a_0));
                    BackupMoveQRCodeUI.this.f50004e.setImageResource(C0966R.raw.backup_move_qrcode_light);
                    BackupMoveQRCodeUI.this.f50006g.setVisibility(4);
                } else if (i == 2) {
                    Log.m105924i("MicroMsg.BackupMoveQRCodeUI", "auth success. go to BackupMoveUI.");
                    C16686a.m16193i().mo142622e().mo142628f(12);
                    MMWizardActivity.m7017L7(BackupMoveQRCodeUI.this, new Intent(BackupMoveQRCodeUI.this, BackupMoveUI.class));
                } else if (i != 51) {
                    switch (i) {
                        case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidClassException /*-33*/:
                            backupMoveQRCodeUI.f50007h = true;
                            C76879j.m92741l(backupMoveQRCodeUI, C0966R.string.aaw, 0, C0966R.string.a_t, C0966R.string.a_u, false, new C18079f(), new C18080g(), C0966R.color.f3113fp);
                            return;
                        case APPluginConstants.ERROR_IO_NoHttpResponseException /*-32*/:
                            backupMoveQRCodeUI.f50007h = true;
                            C76879j.m92741l(backupMoveQRCodeUI, C0966R.string.aax, 0, C0966R.string.a_s, C0966R.string.a_u, false, new C18076c(), new C18077d(), C0966R.color.f3113fp);
                            return;
                        case APPluginConstants.ERROR_IO_MalformedChunkCodingException /*-31*/:
                            backupMoveQRCodeUI.f50007h = true;
                            C76879j.m92741l(backupMoveQRCodeUI, C0966R.string.aay, 0, C0966R.string.a_t, C0966R.string.a_u, false, new C18074a(), new C18075b(), C0966R.color.f3113fp);
                            return;
                        default:
                            return;
                    }
                } else {
                    byte[] bArr = C16686a.m16193i().mo17662k().f45195p;
                    BackupMoveQRCodeUI.this.f50004e.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                    BackupMoveQRCodeUI.this.f50005f.setText(C0966R.string.abf);
                    BackupMoveQRCodeUI backupMoveQRCodeUI3 = BackupMoveQRCodeUI.this;
                    backupMoveQRCodeUI3.f50005f.setTextColor(backupMoveQRCodeUI3.getContext().getResources().getColor(C0966R.color.a7f));
                    BackupMoveQRCodeUI.this.f50006g.setVisibility(4);
                }
            }
        }

        /* renamed from: P */
        public void mo17668P() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI$b */
    public class C18081b implements MenuItem.OnMenuItemClickListener {
        public C18081b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BackupMoveQRCodeUI backupMoveQRCodeUI = BackupMoveQRCodeUI.this;
            int i = BackupMoveQRCodeUI.f50003n;
            backupMoveQRCodeUI.mo22652O7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI$c */
    public class C18082c implements DialogInterface.OnClickListener {
        public C18082c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.BackupMoveQRCodeUI", "user click close. stop move.");
            C16686a.m16193i().mo17660h().mo37036e();
            C16686a.m16193i().mo17662k().mo17701e(true);
            C16686a.m16193i().mo142622e().mo142628f(-100);
            BackupMoveQRCodeUI backupMoveQRCodeUI = BackupMoveQRCodeUI.this;
            int i2 = BackupMoveQRCodeUI.f50003n;
            backupMoveQRCodeUI.mo7681K7(1);
        }
    }

    /* renamed from: N7 */
    public static void m18706N7(BackupMoveQRCodeUI backupMoveQRCodeUI) {
        backupMoveQRCodeUI.f50007h = false;
        C16686a.m16193i().mo17662k().mo17702f(false);
        C16686a.m16193i().mo17660h().mo37036e();
        C16686a.m16193i().mo17662k().mo17701e(false);
        C16686a.m16193i().mo142622e().mo142628f(-100);
        backupMoveQRCodeUI.mo7681K7(1);
    }

    /* renamed from: O7 */
    public final void mo22652O7() {
        if (C86718e.m107551r()) {
            C76879j.m92741l(this, C0966R.string.abe, C0966R.string.abd, C0966R.string.abz, C0966R.string.a_u, false, new C18082c(), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
            return;
        }
        Log.m105924i("MicroMsg.BackupMoveQRCodeUI", "user click close. stop move.");
        C16686a.m16193i().mo17660h().mo37036e();
        C16686a.m16193i().mo17662k().mo17701e(true);
        C16686a.m16193i().mo142622e().mo142628f(-100);
        mo7681K7(1);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6536hj;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f360131aa2);
        this.f50004e = (ImageView) findViewById(C0966R.C0970id.a48);
        this.f50005f = (TextView) findViewById(C0966R.C0970id.a4_);
        this.f50006g = (TextView) findViewById(C0966R.C0970id.a49);
        setBackBtn(new C18081b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {
            if (!C97625j3.m125811a()) {
                finish();
                return;
            }
            initView();
            C20842c.m22881n1();
            C16710c k = C16686a.m16193i().mo17662k();
            C20842c.f58882p = new C20859o(k.f45194o);
            C102910f.f303738g = 21;
            C20842c.f58886t = k.f45193n;
            C16686a.m16193i().mo17658f();
            C20842c.f58878i = k.f45191l;
            C20842c.f58879j = C16686a.m16193i().mo17660h();
            C20842c.f58880n = 2;
            C16686a.m16193i().f303745e = null;
            k.f45184e = false;
            k.f45181b = new C23584k(C16686a.m16193i(), 2, k.f45192m);
            C16686a.m16193i().mo17662k().f45185f = 0;
            Log.m105924i("MicroMsg.BackupModel", "holdReset");
            C102910f.f303741j = true;
            ((C0991y) C86312j.m106911c(C0991y.class)).R20();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C22400b bVar = this.f50008i;
        if (bVar != null) {
            bVar.mo35550c();
        }
        ((C0991y) C86312j.m106911c(C0991y.class)).mo1001Kg();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo22652O7();
        return true;
    }

    public void onPause() {
        Log.m105924i("MicroMsg.BackupMoveQRCodeUI", "BackupMoveQRCodeUI onPause.");
        C16710c k = C16686a.m16193i().mo17662k();
        C102909e eVar = this.f50009j;
        synchronized (k.f45190k) {
            ((HashSet) k.f45190k).remove(eVar);
        }
        if (C16686a.m16193i().mo17662k().f45196q != null) {
            C16686a.m16193i().mo17662k().f45196q.mo75112d();
        }
        super.onPause();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r5 = this;
            super.onResume()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = p385u2.C111105a.m151499a(r0, r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            r3 = 0
            if (r0 == 0) goto L_0x0071
            bp3.p r0 = bp3.C79758p.f233760a
            bp3.f r4 = bp3.C104160f.RepairerConfig_Backup_OpenWifiDirect_Int
            int r0 = r0.mo109882e(r4, r1)
            if (r2 == r0) goto L_0x0057
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r4 = "clicfg_backup_wifi_direct_enable"
            int r0 = r0.mo182443e(r4, r1, r1, r2)
            if (r0 == r2) goto L_0x0057
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 != 0) goto L_0x0054
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 != 0) goto L_0x0048
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x0048
            int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r4 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r0 != r4) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r0 = 0
            goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            if (r0 != 0) goto L_0x0054
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r0 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 0
            goto L_0x0055
        L_0x0054:
            r0 = 1
        L_0x0055:
            if (r0 == 0) goto L_0x0058
        L_0x0057:
            r1 = 1
        L_0x0058:
            if (r1 == 0) goto L_0x0071
            sv0.b r0 = new sv0.b
            r0.<init>(r5)
            r5.f50008i = r0
            r0.mo35551d(r3)
            sv0.b r0 = r5.f50008i
            cv0.e r1 = new cv0.e
            r1.<init>(r5)
            r0.f63508h = r1
            r0.mo35549b()
            goto L_0x009e
        L_0x0071:
            av0.a r0 = av0.C16686a.m16193i()
            av0.c r0 = r0.mo17662k()
            av0.d r0 = r0.f45196q
            r0.mo75111c(r3, r3)
            av0.a r0 = av0.C16686a.m16193i()
            av0.c r0 = r0.mo17662k()
            yu0.e r1 = r5.f50009j
            r0.mo17699c(r1)
            yu0.e r0 = r5.f50009j
            av0.a r1 = av0.C16686a.m16193i()
            yu0.g r1 = r1.mo142622e()
            int r1 = r1.mo142623a()
            com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI$a r0 = (com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI.C18073a) r0
            r0.mo17667K(r1)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI.onResume():void");
    }
}
