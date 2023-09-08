package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.DialogInterface;
import di3.C86312j;
import he0.C46021h;
import ne0.C47224a;

/* renamed from: com.tencent.mm.ui.z3 */
public class C45111z3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f122380d;

    /* renamed from: e */
    public final /* synthetic */ SingleChatInfoUI f122381e;

    public C45111z3(SingleChatInfoUI singleChatInfoUI, Context context) {
        this.f122381e = singleChatInfoUI;
        this.f122380d = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C47224a.m52531b(this.f122381e.f121200n, 9, 0);
        SingleChatInfoUI singleChatInfoUI = this.f122381e;
        Context context = this.f122380d;
        String str = singleChatInfoUI.f121200n;
        singleChatInfoUI.getClass();
        ((C46021h) C86312j.m106911c(C46021h.class)).mo71461gx(str, new C44702a4(singleChatInfoUI, context));
    }
}
