package tg3;

import com.tencent.p014mm.sandbox.updater.AppUpdaterUI;
import di3.C86312j;
import nd3.C47223a;
import p159gw.C45962f;

/* renamed from: tg3.k */
public class C90477k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f260030d;

    /* renamed from: e */
    public final /* synthetic */ AppUpdaterUI f260031e;

    public C90477k(AppUpdaterUI appUpdaterUI, String str) {
        this.f260031e = appUpdaterUI;
        this.f260030d = str;
    }

    public void run() {
        ((C45962f) C86312j.m106911c(C45962f.class)).go0(this.f260031e, this.f260030d, (C47223a) null, false);
        AppUpdaterUI appUpdaterUI = this.f260031e;
        AppUpdaterUI appUpdaterUI2 = AppUpdaterUI.f249736j;
        appUpdaterUI.mo119311H7();
    }
}
