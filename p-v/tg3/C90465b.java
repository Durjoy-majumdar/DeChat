package tg3;

import com.tencent.p014mm.sandbox.updater.AppInstallerUI;
import di3.C86312j;
import nd3.C47223a;
import p159gw.C45962f;

/* renamed from: tg3.b */
public class C90465b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f260019d;

    /* renamed from: e */
    public final /* synthetic */ AppInstallerUI f260020e;

    public C90465b(AppInstallerUI appInstallerUI, String str) {
        this.f260020e = appInstallerUI;
        this.f260019d = str;
    }

    public void run() {
        ((C45962f) C86312j.m106911c(C45962f.class)).go0(this.f260020e, this.f260019d, (C47223a) null, false);
        AppInstallerUI appInstallerUI = this.f260020e;
        AppInstallerUI appInstallerUI2 = AppInstallerUI.f249728n;
        appInstallerUI.finish();
    }
}
