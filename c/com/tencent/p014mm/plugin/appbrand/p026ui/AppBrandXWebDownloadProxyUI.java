package com.tencent.p014mm.plugin.appbrand.p026ui;

import al3.C0086a;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.internal.IXWebUpdateListener;
import di3.C86312j;
import nj3.C76879j;
import nj3.C88989a;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C89779i0;
import s00.C90110f;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI */
public final class AppBrandXWebDownloadProxyUI extends MMActivity {

    /* renamed from: h */
    public static boolean f246573h;

    /* renamed from: d */
    public IXWebUpdateListener f246574d = null;

    /* renamed from: e */
    public C89779i0 f246575e;

    /* renamed from: f */
    public Handler f246576f;

    /* renamed from: g */
    public Runnable f246577g;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI$a */
    public class C40543a implements DialogInterface.OnCancelListener {
        public C40543a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, xweb is downloading, user canceled");
            AppBrandXWebDownloadProxyUI.this.setResult(2, new Intent());
            AppBrandXWebDownloadProxyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI$b */
    public final class C84476b implements IXWebUpdateListener {

        /* renamed from: a */
        public boolean f246578a = false;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI$b$a */
        public class C84477a implements Runnable {
            public C84477a() {
            }

            public void run() {
                AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI = AppBrandXWebDownloadProxyUI.this;
                boolean z = AppBrandXWebDownloadProxyUI.f246573h;
                Log.m105925i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, finishing[%b] destroyed[%b]", Boolean.valueOf(appBrandXWebDownloadProxyUI.isFinishing()), Boolean.valueOf(appBrandXWebDownloadProxyUI.activityHasDestroyed()));
                if (!appBrandXWebDownloadProxyUI.isFinishing() && !appBrandXWebDownloadProxyUI.activityHasDestroyed()) {
                    C84502c4 c4Var = new C84502c4(appBrandXWebDownloadProxyUI);
                    if (DebuggerShell.f239772d) {
                        c4Var.onClick((DialogInterface) null, 0);
                        return;
                    }
                    C40549d4 d4Var = new C40549d4(appBrandXWebDownloadProxyUI);
                    AppCompatActivity context = appBrandXWebDownloadProxyUI.getContext();
                    C77389a aVar = new C77389a();
                    aVar.f225660q = appBrandXWebDownloadProxyUI.getContext().getString(C0966R.string.f7923wc);
                    aVar.f225668y = false;
                    aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.f7922wb);
                    aVar.f225620C = c4Var;
                    aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7921wa);
                    aVar.f225621D = d4Var;
                    C77398g gVar = new C77398g(context, C0966R.style.a66);
                    gVar.mo107525e(aVar);
                    gVar.show();
                    C115669n.INSTANCE.idkeyStat(366, 1, 1, false);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI$b$b */
        public class C84478b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f246581d;

            public C84478b(int i) {
                this.f246581d = i;
            }

            public void run() {
                AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI = AppBrandXWebDownloadProxyUI.this;
                appBrandXWebDownloadProxyUI.f246575e.setMessage(appBrandXWebDownloadProxyUI.getContext().getString(C0966R.string.f7925we, new Object[]{String.valueOf(this.f246581d)}));
            }
        }

        public C84476b(C40543a aVar) {
        }

        public boolean onNeedDownload() {
            this.f246578a = true;
            MMHandlerThread.postToMainThread(new C84477a());
            return true;
        }

        public void onUpdateCancelled() {
            Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onUpdateCancelled");
            AppBrandXWebDownloadProxyUI.this.f246574d = null;
            XWebSdk.setXWebUpdateListener((IXWebUpdateListener) null);
            AppBrandXWebDownloadProxyUI.this.setResult(0, new Intent());
            AppBrandXWebDownloadProxyUI.this.finish();
        }

        public void onUpdateCompleted() {
            Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onUpdateCompleted");
            AppBrandXWebDownloadProxyUI.this.f246574d = null;
            XWebSdk.setXWebUpdateListener((IXWebUpdateListener) null);
            AppBrandXWebDownloadProxyUI.this.setResult(-1, new Intent());
            AppBrandXWebDownloadProxyUI.this.finish();
        }

        public void onUpdateFailed(int i) {
            Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onUpdateFailed, errorCode:" + i);
            AppBrandXWebDownloadProxyUI.this.f246574d = null;
            XWebSdk.setXWebUpdateListener((IXWebUpdateListener) null);
            AppBrandXWebDownloadProxyUI.this.setResult(0, new Intent());
            AppBrandXWebDownloadProxyUI.this.finish();
        }

        public void onUpdateProgress(int i) {
            if (this.f246578a) {
                Log.m105925i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onDownloadProgress, percent = %d", Integer.valueOf(i));
                if (AppBrandXWebDownloadProxyUI.this.f246575e != null) {
                    MMHandlerThread.postToMainThread(new C84478b(i));
                }
            }
        }

        public void onUpdateStart() {
            Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onUpdateStart");
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C90110f.class;
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate");
        C85864g1.m106129d(getWindow());
        ((C90110f) C86312j.m106911c(cls)).ie0();
        Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, kill tools");
        ((C90110f) C86312j.m106911c(cls)).mo124149ID("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
        boolean isBusy = XWebSdk.isBusy();
        Log.m105925i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, current status downloading:%b", Boolean.valueOf(isBusy));
        if (isBusy) {
            Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, is foreground downloading");
            if (f246573h) {
                setResult(0, new Intent());
                finish();
                return;
            }
            if (this.f246574d == null) {
                this.f246574d = new C84476b((C40543a) null);
            }
            XWebSdk.setXWebUpdateListener(this.f246574d);
            Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, xweb is downloading, ignore duplicated request");
            C89779i0 Q = C76879j.m92723Q(getContext(), getContext().getString(C0966R.string.a3h), getContext().getString(C0966R.string.f7924wd), true, true, (DialogInterface.OnCancelListener) null);
            this.f246575e = Q;
            if (Q.getWindow() != null) {
                WindowManager.LayoutParams attributes = this.f246575e.getWindow().getAttributes();
                attributes.dimAmount = 0.0f;
                this.f246575e.getWindow().setAttributes(attributes);
            }
            this.f246575e.setOnCancelListener(new C40543a());
            Handler handler = new Handler();
            this.f246576f = handler;
            C84482a4 a4Var = new C84482a4(this);
            this.f246577g = a4Var;
            handler.postDelayed(a4Var, 20000);
            return;
        }
        C89779i0 Q2 = C76879j.m92723Q(getContext(), (String) null, (String) null, true, true, (DialogInterface.OnCancelListener) null);
        this.f246575e = Q2;
        Q2.setOnCancelListener(new C40547b4(this));
        if (this.f246574d == null) {
            this.f246574d = new C84476b((C40543a) null);
        }
        XWebSdk.setXWebUpdateListener(this.f246574d);
        XWebSdk.checkNeedDownload();
    }

    public void onDestroy() {
        Runnable runnable;
        Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onDestroy");
        this.f246574d = null;
        XWebSdk.setXWebUpdateListener((IXWebUpdateListener) null);
        Handler handler = this.f246576f;
        if (!(handler == null || (runnable = this.f246577g) == null)) {
            handler.removeCallbacks(runnable);
        }
        super.onDestroy();
    }
}
