package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.profile.ui.j1 */
public class C42634j1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C42643m1 f115412d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.j1$a */
    public class C42635a implements Runnable {
        public C42635a() {
        }

        public void run() {
            C42634j1.this.f115412d.mo66772a().mo66774a(6, 1);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101089TE("gh_579db1f2cf89");
        }
    }

    public C42634j1(C42643m1 m1Var) {
        this.f115412d = m1Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ((C119157j) C119157j.f356862d).mo183875f(new C42635a());
    }
}
