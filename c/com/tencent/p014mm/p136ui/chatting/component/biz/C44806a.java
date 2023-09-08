package com.tencent.p014mm.p136ui.chatting.component.biz;

import android.content.DialogInterface;
import eb0.C97625j3;
import sb0.C48368x;

/* renamed from: com.tencent.mm.ui.chatting.component.biz.a */
public class C44806a implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C48368x f121600d;

    public C44806a(BizComponent bizComponent, C48368x xVar) {
        this.f121600d = xVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C97625j3.m125815e().mo123458d(this.f121600d);
    }
}
