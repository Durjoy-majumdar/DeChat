package com.tencent.p014mm.p136ui.contact;

import xc0.C78795g;

/* renamed from: com.tencent.mm.ui.contact.k0 */
public class C74517k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f219084d;

    /* renamed from: e */
    public final /* synthetic */ C74520l0 f219085e;

    public C74517k0(C74520l0 l0Var, int i) {
        this.f219085e = l0Var;
        this.f219084d = i;
    }

    public void run() {
        C78795g e = C78795g.m95196e();
        ContactRemarkInfoModUI contactRemarkInfoModUI = this.f219085e.f219088a;
        String d = e.mo108707d(contactRemarkInfoModUI.f218568z, contactRemarkInfoModUI.f218500D.get(this.f219084d).f130298d);
        this.f219085e.f219088a.f218509M.add(this.f219084d, d);
        if (this.f219084d < this.f219085e.f219088a.f218512Q.size()) {
            this.f219085e.f219088a.f218512Q.get(this.f219084d).f186188f = d;
        }
        int i = this.f219084d;
        if (i == 0 && this.f219085e.f219088a.f218500D.get(i).f130299e == null) {
            this.f219085e.f219088a.f218507K.add(d);
            this.f219085e.f219088a.f218501E.remove(this.f219084d);
        }
        ContactRemarkInfoModUI contactRemarkInfoModUI2 = this.f219085e.f219088a;
        contactRemarkInfoModUI2.mo103351V7(contactRemarkInfoModUI2.f218509M, 0);
    }
}
