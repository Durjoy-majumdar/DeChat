package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import di3.C86312j;
import java.util.ArrayList;
import kv1.C99260q;
import lv1.C99664b;

/* renamed from: com.tencent.mm.plugin.aa.ui.h0 */
public class C68288h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C99664b f196303d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f196304e;

    /* renamed from: f */
    public final /* synthetic */ LaunchAAUI f196305f;

    public C68288h0(LaunchAAUI launchAAUI, C99664b bVar, ArrayList arrayList) {
        this.f196305f = launchAAUI;
        this.f196303d = bVar;
        this.f196304e = arrayList;
    }

    public void run() {
        LaunchAAUI launchAAUI = this.f196305f;
        if (launchAAUI.f196120V0) {
            Dialog dialog = launchAAUI.f196118U0;
            if (dialog != null && dialog.isShowing()) {
                this.f196305f.f196118U0.dismiss();
            }
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f196303d);
            this.f196305f.f196120V0 = false;
            this.f196304e.clear();
            this.f196305f.mo93795Q7(this.f196304e);
        }
    }
}
