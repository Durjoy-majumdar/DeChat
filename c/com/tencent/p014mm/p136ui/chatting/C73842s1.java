package com.tencent.p014mm.p136ui.chatting;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.ui.chatting.s1 */
public class C73842s1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f216683d;

    /* renamed from: e */
    public final /* synthetic */ int f216684e;

    /* renamed from: f */
    public final /* synthetic */ C73852u1 f216685f;

    public C73842s1(C73852u1 u1Var, boolean z, int i) {
        this.f216685f = u1Var;
        this.f216683d = z;
        this.f216684e = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f216683d) {
            C73852u1.m87499I(12, this.f216684e, this.f216685f.f216743l);
        } else {
            C73852u1.m87499I(9, this.f216684e, this.f216685f.f216743l);
        }
    }
}
