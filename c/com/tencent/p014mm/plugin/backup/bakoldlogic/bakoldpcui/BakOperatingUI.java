package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.FileReaderHelper;
import di3.C86312j;
import mv0.C99980a;
import mv0.C99984g;
import mv0.C99990k;
import mv0.C99996l;
import nj3.C76879j;
import p214om.C11502f;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI */
public class BakOperatingUI extends MMWizardActivity implements C99990k.C99994d {

    /* renamed from: r */
    public static final /* synthetic */ int f267657r = 0;

    /* renamed from: e */
    public int f267658e = -1;

    /* renamed from: f */
    public boolean f267659f = false;

    /* renamed from: g */
    public ProgressBar f267660g = null;

    /* renamed from: h */
    public TextView f267661h = null;

    /* renamed from: i */
    public TextView f267662i = null;

    /* renamed from: j */
    public TextView f267663j = null;

    /* renamed from: n */
    public MMHandler f267664n = new MMHandler(Looper.getMainLooper());

    /* renamed from: o */
    public boolean f267665o = false;

    /* renamed from: p */
    public int f267666p = 0;

    /* renamed from: q */
    public boolean f267667q = false;

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$a */
    public class C92925a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f267668d;

        public C92925a(int i) {
            this.f267668d = i;
        }

        public void run() {
            Log.m105925i("MicroMsg.BakOperatingUI", "BakOperatingUI onCloseSocket, %d", Integer.valueOf(this.f267668d));
            if (this.f267668d == 15) {
                BakOperatingUI bakOperatingUI = BakOperatingUI.this;
                int i = BakOperatingUI.f267657r;
                bakOperatingUI.mo7681K7(1);
                return;
            }
            MMWizardActivity.m7017L7(BakOperatingUI.this, new Intent(BakOperatingUI.this, BakConnErrorUI.class));
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$b */
    public class C92926b implements Runnable {
        public C92926b() {
        }

        public void run() {
            Log.m105918d("MicroMsg.BakOperatingUI", "BakOperatingUI onOperateCancel");
            BakOperatingUI bakOperatingUI = BakOperatingUI.this;
            int i = BakOperatingUI.f267657r;
            bakOperatingUI.mo7681K7(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$c */
    public class C92927c implements MenuItem.OnMenuItemClickListener {
        public C92927c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BakOperatingUI bakOperatingUI = BakOperatingUI.this;
            if (bakOperatingUI.f267659f) {
                return true;
            }
            bakOperatingUI.f267667q = true;
            bakOperatingUI.mo7681K7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$d */
    public class C92928d implements MenuItem.OnMenuItemClickListener {
        public C92928d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BakOperatingUI bakOperatingUI = BakOperatingUI.this;
            if (bakOperatingUI.f267659f) {
                return true;
            }
            bakOperatingUI.f267667q = true;
            bakOperatingUI.mo7681K7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$e */
    public class C92929e implements MenuItem.OnMenuItemClickListener {
        public C92929e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BakOperatingUI bakOperatingUI = BakOperatingUI.this;
            if (bakOperatingUI.f267659f) {
                bakOperatingUI.mo127334N7();
                return false;
            }
            bakOperatingUI.f267667q = true;
            bakOperatingUI.mo7681K7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$f */
    public class C92930f implements DialogInterface.OnClickListener {
        public C92930f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            int i2;
            C99990k k = C99980a.m130643h().mo139322k();
            k.f292963h.mo139325a();
            k.f292964i.mo139340c();
            int i3 = k.f292966n;
            if (i3 == 1 || (i2 = k.f292970r) == 2) {
                k.mo139333g(4);
            } else if (i3 == 6 || i2 == 4 || i2 == 6) {
                k.mo139333g(7);
            }
            C99980a.m130643h().mo139322k().f292969q = -1;
            C99980a.m130643h().mo139321j().f292938g++;
            BakOperatingUI bakOperatingUI = BakOperatingUI.this;
            bakOperatingUI.f267667q = true;
            bakOperatingUI.mo7681K7(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$g */
    public class C92931g implements DialogInterface.OnClickListener {
        public C92931g(BakOperatingUI bakOperatingUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C99990k k = C99980a.m130643h().mo139322k();
            int i2 = k.f292966n;
            if (i2 == 1) {
                C99984g gVar = k.f292963h;
                gVar.getClass();
                Log.m105924i("MicroMsg.BakPCServer", "resume");
                gVar.f292943f = false;
                synchronized (gVar.f292941d) {
                    gVar.f292941d.notifyAll();
                }
            } else if (i2 == 6) {
                C99996l lVar = k.f292964i;
                lVar.getClass();
                Log.m105924i("MicroMsg.RecoverPCServer", "resume");
                lVar.f292975g = false;
                synchronized (lVar.f292974f) {
                    lVar.f292974f.notifyAll();
                }
            } else {
                Log.m105921e("MicroMsg.BakPcProcessMgr", "cancel in error state, %d", Integer.valueOf(i2));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$h */
    public class C92932h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f267675d;

        public C92932h(int i) {
            this.f267675d = i;
        }

        public void run() {
            ProgressBar progressBar = BakOperatingUI.this.f267660g;
            if (progressBar != null) {
                progressBar.setProgress(this.f267675d);
            }
            BakOperatingUI bakOperatingUI = BakOperatingUI.this;
            TextView textView = bakOperatingUI.f267661h;
            if (textView != null) {
                int i = C0966R.string.aey;
                int i2 = C0966R.string.af9;
                if (6 == bakOperatingUI.f267658e) {
                    i = C0966R.string.af5;
                    i2 = C0966R.string.aff;
                }
                textView.setText(BakOperatingUI.this.getString(i) + this.f267675d + "%");
                BakOperatingUI bakOperatingUI2 = BakOperatingUI.this;
                bakOperatingUI2.f267662i.setText(bakOperatingUI2.getString(i2));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$i */
    public class C92933i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f267677d;

        public C92933i(int i) {
            this.f267677d = i;
        }

        public void run() {
            ProgressBar progressBar = BakOperatingUI.this.f267660g;
            if (progressBar != null) {
                progressBar.setProgress(this.f267677d);
            }
            BakOperatingUI bakOperatingUI = BakOperatingUI.this;
            TextView textView = bakOperatingUI.f267661h;
            if (textView != null && bakOperatingUI.f267662i != null) {
                textView.setText(BakOperatingUI.this.getString(C0966R.string.f360156af3) + this.f267677d + "%");
                BakOperatingUI bakOperatingUI2 = BakOperatingUI.this;
                bakOperatingUI2.f267662i.setText(bakOperatingUI2.getString(C0966R.string.afc));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$j */
    public class C92934j implements Runnable {

        /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$j$a */
        public class C92935a implements Runnable {
            public C92935a() {
            }

            public void run() {
                BakOperatingUI.this.showOptionMenu(false);
                ProgressBar progressBar = BakOperatingUI.this.f267660g;
                if (progressBar != null) {
                    progressBar.setProgress(0);
                }
                BakOperatingUI bakOperatingUI = BakOperatingUI.this;
                TextView textView = bakOperatingUI.f267662i;
                if (textView != null) {
                    textView.setText(bakOperatingUI.getString(C0966R.string.afc));
                }
                BakOperatingUI bakOperatingUI2 = BakOperatingUI.this;
                TextView textView2 = bakOperatingUI2.f267663j;
                if (textView2 != null) {
                    textView2.setText(bakOperatingUI2.getString(C0966R.string.afb));
                }
                TextView textView3 = BakOperatingUI.this.f267661h;
                if (textView3 != null) {
                    textView3.setText(BakOperatingUI.this.getString(C0966R.string.f360156af3) + "0%");
                }
            }
        }

        public C92934j() {
        }

        public void run() {
            BakOperatingUI bakOperatingUI = BakOperatingUI.this;
            int i = bakOperatingUI.f267658e;
            if (6 == i) {
                bakOperatingUI.f267664n.post(new C92935a());
            } else if (1 == i) {
                Intent intent = new Intent(BakOperatingUI.this, BakFinishUI.class);
                intent.putExtra(FileReaderHelper.OPEN_FILE_FROM_CMD, BakOperatingUI.this.f267658e);
                MMWizardActivity.m7017L7(BakOperatingUI.this, intent);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI$k */
    public class C92936k implements Runnable {
        public C92936k() {
        }

        public void run() {
            Intent intent = new Intent(BakOperatingUI.this, BakFinishUI.class);
            intent.putExtra(FileReaderHelper.OPEN_FILE_FROM_CMD, BakOperatingUI.this.f267658e);
            MMWizardActivity.m7017L7(BakOperatingUI.this, intent);
        }
    }

    /* renamed from: N7 */
    public final void mo127334N7() {
        C99990k k = C99980a.m130643h().mo139322k();
        int i = k.f292966n;
        if (i == 1) {
            C99984g gVar = k.f292963h;
            gVar.getClass();
            Log.m105924i("MicroMsg.BakPCServer", "pause");
            gVar.f292943f = true;
        } else if (i == 6) {
            C99996l lVar = k.f292964i;
            lVar.getClass();
            Log.m105924i("MicroMsg.RecoverPCServer", "pause");
            lVar.f292975g = true;
        }
        C77398g j = C76879j.m92739j(this, C0966R.string.af7, 0, C0966R.string.a4h, C0966R.string.f360090a14, new C92930f(), new C92931g(this));
        j.setCanceledOnTouchOutside(false);
        j.setCancelable(false);
    }

    /* renamed from: P */
    public synchronized void mo127335P() {
        if (!this.f267667q) {
            this.f267659f = false;
            Log.m105919d("MicroMsg.BakOperatingUI", "onMergeFinish now cmd:%d", Integer.valueOf(this.f267658e));
            this.f267664n.post(new C92936k());
        }
    }

    /* renamed from: W2 */
    public synchronized void mo127336W2() {
        Log.m105919d("MicroMsg.BakOperatingUI", "onNetFinish now cmd:%d", Integer.valueOf(this.f267658e));
        if (!this.f267667q) {
            if (6 != this.f267658e) {
                if (5 != C99980a.m130643h().mo139322k().f292970r) {
                    Log.m105921e("MicroMsg.BakOperatingUI", "onNetFinish now cmd:%d", Integer.valueOf(this.f267658e));
                    this.f267664n.post(new C92934j());
                }
            }
            this.f267658e = 6;
            this.f267659f = true;
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).getClass();
            MMAppMgr.m85986f();
            C99980a.m130643h().mo139322k().mo139339m();
            this.f267664n.post(new C92934j());
        }
    }

    /* renamed from: a2 */
    public void mo127337a2() {
        this.f267664n.post(new C92926b());
    }

    /* renamed from: d */
    public void mo127331d(int i) {
        this.f267664n.post(new C92925a(i));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6543hr;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.afk);
        if (!this.f267659f) {
            int i = this.f267658e;
            if (6 == i) {
                addTextOptionMenu(0, getString(C0966R.string.af6), new C92927c());
            } else if (1 == i) {
                addTextOptionMenu(0, getString(C0966R.string.aen), new C92928d());
            } else {
                Log.m105920e("MicroMsg.BakOperatingUI", "BakOperatingUI operate type is invalid");
            }
        }
        setBackBtn(new C92929e());
        ProgressBar progressBar = (ProgressBar) findViewById(C0966R.C0970id.a4g);
        this.f267660g = progressBar;
        progressBar.setProgress(this.f267666p);
        this.f267662i = (TextView) findViewById(C0966R.C0970id.a4m);
        this.f267663j = (TextView) findViewById(C0966R.C0970id.a4n);
        this.f267661h = (TextView) findViewById(C0966R.C0970id.a4h);
    }

    /* renamed from: m4 */
    public synchronized void mo127338m4(int i) {
        if (!this.f267667q) {
            Log.m105919d("MicroMsg.BakOperatingUI", "BakOperatingUI onMergeProgress percent:%d", Integer.valueOf(i));
            this.f267664n.post(new C92933i(i));
        }
    }

    /* renamed from: o1 */
    public synchronized void mo127339o1(int i) {
        Log.m105919d("MicroMsg.BakOperatingUI", "BakOperatingUI onNetProgress percent:%d, isFinishingWizard:%b", Integer.valueOf(i), Boolean.valueOf(this.f267667q));
        if (!this.f267667q) {
            this.f267664n.post(new C92932h(i));
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C11502f.class;
        Log.m105924i("MicroMsg.BakOperatingUI", "onCreate");
        super.onCreate(bundle);
        if (getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            Log.m105925i("MicroMsg.BakOperatingUI", "onCreate WizardRootKillSelf cmd:%d", Integer.valueOf(this.f267658e));
            return;
        }
        C99980a.m130643h().mo139322k().mo139336j(this);
        C99990k k = C99980a.m130643h().mo139322k();
        synchronized (k) {
            k.f292971s = true;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("from_bak_banner", false);
        this.f267665o = booleanExtra;
        if (booleanExtra) {
            int i = C99980a.m130643h().mo139322k().f292970r;
            if (2 == i || C99980a.m130643h().mo139322k().f292969q == 2) {
                this.f267658e = 1;
                this.f267666p = C99980a.m130643h().mo139322k().mo139331d();
            } else if (4 == i) {
                this.f267658e = 6;
                this.f267666p = C99980a.m130643h().mo139322k().mo139331d();
            } else if (5 == i) {
                this.f267658e = 6;
                this.f267659f = true;
                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).getClass();
                MMAppMgr.m85986f();
                C99980a.m130643h().mo139322k().mo139339m();
            }
        } else {
            this.f267658e = getIntent().getIntExtra(FileReaderHelper.OPEN_FILE_FROM_CMD, 6);
        }
        if (this.f267658e == 6 && C99980a.m130643h().mo139322k().f292964i.f292982q) {
            this.f267659f = true;
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).getClass();
            MMAppMgr.m85986f();
            C99980a.m130643h().mo139322k().mo139339m();
        }
        Log.m105925i("MicroMsg.BakOperatingUI", "before initView onCreate BakOperatingUI  nowCmd:%d fromBanner:%b status:%d opePercent:%d", Integer.valueOf(this.f267658e), Boolean.valueOf(this.f267665o), Integer.valueOf(C99980a.m130643h().mo139322k().f292970r), Integer.valueOf(this.f267666p));
        initView();
        if (C99980a.m130643h().mo139322k().f292969q == 2) {
            this.f267662i.setText(getString(C0966R.string.afe));
            TextView textView = this.f267661h;
            textView.setText(getString(C0966R.string.af4) + this.f267666p + "%");
            this.f267663j.setText(getString(C0966R.string.afd));
            return;
        }
        int i2 = this.f267658e;
        if (6 == i2) {
            if (this.f267659f) {
                this.f267662i.setText(getString(C0966R.string.afc));
                this.f267663j.setText(getString(C0966R.string.afb));
                TextView textView2 = this.f267661h;
                textView2.setText(getString(C0966R.string.f360156af3) + this.f267666p + "%");
                return;
            }
            this.f267662i.setText(getString(C0966R.string.aff));
            TextView textView3 = this.f267661h;
            textView3.setText(getString(C0966R.string.af5) + this.f267666p + "%");
            this.f267663j.setText(getString(C0966R.string.afd));
        } else if (1 == i2) {
            this.f267662i.setText(getString(C0966R.string.af9));
            TextView textView4 = this.f267661h;
            textView4.setText(getString(C0966R.string.aey) + this.f267666p + "%");
            this.f267663j.setText(getString(C0966R.string.afd));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C99980a.m130643h().mo139322k().mo139336j((C99990k.C99994d) null);
        C99990k k = C99980a.m130643h().mo139322k();
        synchronized (k) {
            k.f292971s = false;
        }
        Log.m105925i("MicroMsg.BakOperatingUI", "BakOperatingUI onDestroy nowCmd:%d", Integer.valueOf(this.f267658e));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 4
            if (r5 != r0) goto L_0x0062
            boolean r5 = r4.f267659f     // Catch:{ all -> 0x0068 }
            r6 = 1
            if (r5 == 0) goto L_0x0039
            r4.mo127334N7()     // Catch:{ all -> 0x0068 }
            mv0.a r5 = mv0.C99980a.m130643h()     // Catch:{ all -> 0x0068 }
            mv0.k r5 = r5.mo139322k()     // Catch:{ all -> 0x0068 }
            int r0 = r5.f292966n     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = "pause"
            if (r0 != r6) goto L_0x0028
            mv0.g r5 = r5.f292963h     // Catch:{ all -> 0x0068 }
            r5.getClass()     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "MicroMsg.BakPCServer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0068 }
            r5.f292943f = r6     // Catch:{ all -> 0x0068 }
            goto L_0x0037
        L_0x0028:
            r2 = 6
            if (r0 != r2) goto L_0x0037
            mv0.l r5 = r5.f292964i     // Catch:{ all -> 0x0068 }
            r5.getClass()     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "MicroMsg.RecoverPCServer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0068 }
            r5.f292975g = r6     // Catch:{ all -> 0x0068 }
        L_0x0037:
            monitor-exit(r4)
            return r6
        L_0x0039:
            java.lang.String r5 = "MicroMsg.BakOperatingUI"
            java.lang.String r0 = "onKeyDown keyCode == KeyEvent.KEYCODE_BACK  finishWizard cmd:%d"
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0068 }
            int r2 = r4.f267658e     // Catch:{ all -> 0x0068 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0068 }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x0068 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r0, r1)     // Catch:{ all -> 0x0068 }
            r4.f267667q = r6     // Catch:{ all -> 0x0068 }
            mv0.a r5 = mv0.C99980a.m130643h()     // Catch:{ all -> 0x0068 }
            mv0.k r5 = r5.mo139322k()     // Catch:{ all -> 0x0068 }
            monitor-enter(r5)     // Catch:{ all -> 0x0068 }
            r5.f292971s = r3     // Catch:{ all -> 0x005f }
            monitor-exit(r5)     // Catch:{ all -> 0x0068 }
            r4.mo7681K7(r6)     // Catch:{ all -> 0x0068 }
            monitor-exit(r4)
            return r6
        L_0x005f:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0068 }
            throw r6     // Catch:{ all -> 0x0068 }
        L_0x0062:
            boolean r5 = super.onKeyDown(r5, r6)     // Catch:{ all -> 0x0068 }
            monitor-exit(r4)
            return r5
        L_0x0068:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public void onPause() {
        C99990k k = C99980a.m130643h().mo139322k();
        synchronized (k) {
            k.f292971s = false;
        }
        super.onPause();
        Log.m105925i("MicroMsg.BakOperatingUI", "onPause nowCmd:%d", Integer.valueOf(this.f267658e));
    }

    public void onResume() {
        C99990k k = C99980a.m130643h().mo139322k();
        synchronized (k) {
            k.f292971s = true;
        }
        C99980a.m130643h().mo139322k().mo139336j(this);
        Log.m105925i("MicroMsg.BakOperatingUI", "onResume nowCmd:%d", Integer.valueOf(this.f267658e));
        super.onResume();
    }

    public void onStart() {
        super.onStart();
    }
}
