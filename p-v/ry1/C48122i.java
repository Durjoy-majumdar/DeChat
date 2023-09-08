package ry1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42051e1;
import com.tencent.p014mm.plugin.game.model.C42112t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import js0.C9512b;
import p159gw.C45962f;
import p237sp.C13754y;
import p763ym.C79138l;
import uy1.C52642c;

/* renamed from: ry1.i */
public class C48122i {

    /* renamed from: a */
    public Context f128996a;

    /* renamed from: b */
    public C48148q f128997b = null;

    /* renamed from: c */
    public C48176z0 f128998c = null;

    /* renamed from: d */
    public C48167w0 f128999d = null;

    /* renamed from: e */
    public C48172y0 f129000e = null;

    /* renamed from: f */
    public DialogInterface.OnClickListener f129001f = null;

    /* renamed from: g */
    public int f129002g = 0;

    /* renamed from: h */
    public String f129003h = null;

    /* renamed from: i */
    public MTimerHandler f129004i = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C48123a(), false);

    /* renamed from: ry1.i$a */
    public class C48123a implements MTimerHandler.CallBack {
        public C48123a() {
        }

        public boolean onTimerExpired() {
            C48122i.this.getClass();
            return true;
        }
    }

    public C48122i(Context context) {
        this.f128996a = context;
    }

    /* renamed from: a */
    public void mo72863a(C42039b bVar, C42112t tVar) {
        int i;
        C42039b bVar2 = bVar;
        C42112t tVar2 = tVar;
        Class cls = C13754y.class;
        if (bVar2 == null || tVar2 == null) {
            Log.m105920e("MicroMsg.GameActionBtnHandler", "Null appInfo or null downloadInfo");
            return;
        }
        View view = new View(this.f128996a);
        view.setTag(bVar2);
        Log.m105925i("MicroMsg.GameActionBtnHandler", "App Status: %d, Download Mode: %d, Download Status: %d", Integer.valueOf(bVar2.f113270y1), Integer.valueOf(tVar2.f113425c), Integer.valueOf(tVar2.f113424b));
        if (((C79138l) C86312j.m106911c(C79138l.class)).Tb0(this.f128996a, bVar2.field_appId) || bVar.mo65996u2()) {
            tVar2.f113425c = 1;
        }
        if (tVar2.f113425c == 3) {
            C42051e1 a = C42051e1.m45759a();
            Context context = this.f128996a;
            int i2 = bVar2.f149258Y;
            a.getClass();
            if (Util.isNullOrNil("com.tencent.android.qqdownloader")) {
                Log.m105920e("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState fail, packageName is null");
                i = -1;
            } else {
                try {
                    PackageInfo a2 = C9512b.m9207a(context, "com.tencent.android.qqdownloader");
                    if (a2 == null) {
                        i = 1;
                    } else {
                        Log.m105919d("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState, installed versionCode = %d", Integer.valueOf(a2.versionCode));
                        i = a2.versionCode >= i2 ? 0 : 2;
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState fail, ex = %s", e.getMessage());
                    i = -1;
                }
                Log.m105919d("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState, ret = %d", Integer.valueOf(i));
            }
            Log.m105925i("MicroMsg.GameActionBtnHandler", "qqdownloader install status:[%d], yybSupportedVersionCode:[%d]", Integer.valueOf(i), Integer.valueOf(bVar2.f149258Y));
            if (i == -1 || i == 1 || i == 2) {
                tVar2.f113425c = 1;
            }
        }
        int i3 = bVar2.f113270y1;
        if (i3 != 0) {
            if (i3 == 1) {
                if (this.f129000e == null) {
                    C48172y0 y0Var = new C48172y0(this.f128996a);
                    this.f129000e = y0Var;
                    y0Var.f129112f = this.f129001f;
                }
                C48172y0 y0Var2 = this.f129000e;
                y0Var2.f129113g = this.f129002g;
                y0Var2.onClick(view);
                C40314g.m43488g(this.f128996a, bVar2.f113254G1, bVar2.f113255H1, bVar2.f113256I1, 9, bVar2.field_appId, this.f129002g, bVar2.f113252E1, this.f129003h);
                return;
            } else if (i3 == 2) {
                FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63967o(bVar2.field_appId);
                if (o != null && o.f12194d > 0) {
                    ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63970r(o.f12194d);
                }
                if (this.f128999d == null) {
                    this.f128999d = new C48167w0(this.f128996a, (String) null);
                }
                C48167w0 w0Var = this.f128999d;
                w0Var.f129102g = this.f129002g;
                w0Var.f129100e = bVar2.f149253T;
                w0Var.onClick(view);
                return;
            } else if (!(i3 == 3 || i3 == 4)) {
                return;
            }
        }
        int i4 = tVar2.f113425c;
        if (i4 == 3) {
            FileDownloadTaskInfo o2 = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63967o(bVar2.field_appId);
            if (o2 != null && o2.f12194d > 0) {
                ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63970r(o2.f12194d);
            }
            if (this.f128998c == null) {
                this.f128998c = new C48176z0(this.f128996a);
            }
            C48176z0 z0Var = this.f128998c;
            int i5 = this.f129002g;
            String str = this.f129003h;
            z0Var.f129123f = i5;
            z0Var.f129124g = str;
            z0Var.onClick(view);
        } else if (i4 != 4) {
            Log.m105919d("MicroMsg.GameActionBtnHandler", "summertoken downloadInfo.mode[%d]", Integer.valueOf(i4));
            if (this.f128997b == null) {
                this.f128997b = new C48148q(this.f128996a);
            }
            C48148q qVar = this.f128997b;
            qVar.f128980j = this.f129002g;
            qVar.f128981n = this.f129003h;
            qVar.f128982o = "";
            qVar.onClick(view);
        } else if (!Util.isNullOrNil(bVar2.f149247P)) {
            Log.m105924i("MicroMsg.GameActionBtnHandler", "gp download url is not null and download flag is download directly by gp store");
            ((C45962f) C86312j.m106911c(C45962f.class)).Qt0(this.f128996a, bVar2.f149247P);
            C40314g.m43488g(this.f128996a, bVar2.f113254G1, bVar2.f113255H1, bVar2.f113256I1, 25, bVar2.field_appId, this.f129002g, bVar2.f113252E1, this.f129003h);
        }
    }

    /* renamed from: b */
    public void mo72864b(ProgressBar progressBar, Button button, C42039b bVar, C42112t tVar) {
        ProgressBar progressBar2 = progressBar;
        Button button2 = button;
        C42039b bVar2 = bVar;
        C42112t tVar2 = tVar;
        if (progressBar2 == null || button2 == null) {
            return;
        }
        button2.setEnabled(true);
        button2.setVisibility(0);
        if (bVar2.f113270y1 == 1) {
            if (bVar2.f113253F1) {
                button2.setEnabled(false);
                button2.setText(C0966R.string.f75);
                button2.setVisibility(0);
                progressBar2.setVisibility(8);
                return;
            }
            button2.setText(C0966R.string.f74);
            button2.setVisibility(0);
            progressBar2.setVisibility(8);
        } else if (((C79138l) C86312j.m106911c(C79138l.class)).mo74016tz(this.f128996a, bVar2)) {
            int j = C52642c.m58992j(bVar2.field_packageName);
            if (bVar2.f113257J1 <= j) {
                button2.setVisibility(0);
                progressBar2.setVisibility(8);
                if (bVar2.f113254G1 == 12) {
                    button2.setText(C0966R.string.f8i);
                } else {
                    button2.setText(C0966R.string.f_m);
                }
            } else if (tVar2.f113424b == 1) {
                progressBar2.setVisibility(0);
                progressBar2.setProgress(tVar2.f113426d);
                button2.setVisibility(8);
            } else {
                if (bVar2.f113254G1 == 12) {
                    button2.setText(C0966R.string.f8k);
                } else {
                    button2.setText(C0966R.string.f77);
                }
                button2.setVisibility(0);
                progressBar2.setVisibility(8);
            }
            Log.m105925i("MicroMsg.GameActionBtnHandler", "AppId: %s installed, local: %d, server: %d", bVar2.field_appId, Integer.valueOf(j), Integer.valueOf(bVar2.f113257J1));
        } else if (bVar.mo65996u2()) {
            button2.setVisibility(0);
            progressBar2.setVisibility(8);
            if (bVar2.f113254G1 == 12) {
                button2.setText(C0966R.string.f8i);
            } else {
                button2.setText(C0966R.string.f_m);
            }
        } else {
            int i = bVar2.f113270y1;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        button2.setText(C0966R.string.f360838f73);
                        button2.setVisibility(0);
                        progressBar2.setVisibility(8);
                    } else if (i != 3) {
                        if (i != 4) {
                            button2.setVisibility(8);
                            progressBar2.setVisibility(8);
                        } else {
                            button2.setText(C0966R.string.f76);
                            button2.setVisibility(0);
                            progressBar2.setVisibility(8);
                        }
                    } else if (tVar2 == null) {
                        button2.setText(C0966R.string.f360837f72);
                        button2.setVisibility(0);
                        progressBar2.setVisibility(8);
                        return;
                    } else {
                        int i2 = tVar2.f113424b;
                        if (i2 == 0) {
                            button2.setText(C0966R.string.f360837f72);
                            button2.setVisibility(0);
                            progressBar2.setVisibility(8);
                        } else if (i2 == 1) {
                            int i3 = tVar2.f113425c;
                            if (i3 == 3) {
                                button2.setText(C0966R.string.f_k);
                            } else if (i3 == 1) {
                                progressBar2.setProgress(tVar2.f113426d);
                                button2.setVisibility(8);
                                progressBar2.setVisibility(0);
                            }
                        } else if (i2 == 2) {
                            if (bVar2.f113254G1 == 12) {
                                button2.setText(C0966R.string.f8r);
                            } else {
                                button2.setText(C0966R.string.f_i);
                            }
                            button2.setVisibility(0);
                            progressBar2.setVisibility(8);
                        } else if (i2 == 3) {
                            if (bVar2.f113254G1 == 12) {
                                button2.setText(C0966R.string.f_c);
                            } else {
                                button2.setText(C0966R.string.f_b);
                            }
                            button2.setVisibility(0);
                            progressBar2.setVisibility(8);
                        }
                    }
                } else if (bVar2.f113253F1) {
                    button2.setEnabled(false);
                    button2.setText(C0966R.string.f75);
                    button2.setVisibility(0);
                    progressBar2.setVisibility(8);
                } else {
                    button2.setText(C0966R.string.f74);
                    button2.setVisibility(0);
                    progressBar2.setVisibility(8);
                }
            } else if (tVar2 == null) {
                button2.setVisibility(8);
                progressBar2.setVisibility(8);
                return;
            } else {
                int i4 = tVar2.f113424b;
                if (i4 == 0) {
                    if (bVar2.f113254G1 == 12) {
                        button2.setText(C0966R.string.f_e);
                    } else {
                        button2.setText(C0966R.string.f_d);
                    }
                    button2.setVisibility(0);
                    progressBar2.setVisibility(8);
                } else if (i4 == 1) {
                    int i5 = tVar2.f113425c;
                    if (i5 == 3) {
                        button2.setText(C0966R.string.f_k);
                        button2.setVisibility(0);
                        progressBar2.setVisibility(8);
                    } else if (i5 == 1) {
                        progressBar2.setProgress(tVar2.f113426d);
                        button2.setVisibility(8);
                        progressBar2.setVisibility(0);
                    }
                } else if (i4 == 2) {
                    if (bVar2.f113254G1 == 12) {
                        button2.setText(C0966R.string.f8r);
                    } else {
                        button2.setText(C0966R.string.f_i);
                    }
                    button2.setVisibility(0);
                    progressBar2.setVisibility(8);
                } else if (i4 == 3) {
                    if (bVar2.f113254G1 == 12) {
                        button2.setText(C0966R.string.f_c);
                    } else {
                        button2.setText(C0966R.string.f_b);
                    }
                    button2.setVisibility(0);
                    progressBar2.setVisibility(8);
                }
            }
            Log.m105925i("MicroMsg.GameActionBtnHandler", "updateBtnStateAndText: %s, Status: %d, Text: %s", bVar2.field_appId, Integer.valueOf(bVar2.f113270y1), button.getText());
        }
    }
}
