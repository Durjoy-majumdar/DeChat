package com.tencent.p014mm.p136ui.chatting;

import android.content.DialogInterface;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import eb0.C97625j3;
import ob0.C117747y;

/* renamed from: com.tencent.mm.ui.chatting.d0 */
public class C44850d0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C117747y f121688d;

    /* renamed from: e */
    public final /* synthetic */ C44851e0 f121689e;

    public C44850d0(C44851e0 e0Var, C117747y yVar) {
        this.f121689e = e0Var;
        this.f121688d = yVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C97625j3.m125815e().mo123458d(this.f121688d);
        C72709y1.wx0().mo69347a(2, this.f121689e);
    }
}
