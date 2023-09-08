package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.DialogInterface;
import eb0.C97625j3;
import kb0.C46664n;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u4 */
public class C74264u4 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C46664n f218131d;

    public C74264u4(ChattingItemDyeingTemplate chattingItemDyeingTemplate, C46664n nVar) {
        this.f218131d = nVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C97625j3.m125815e().mo123458d(this.f218131d);
    }
}
