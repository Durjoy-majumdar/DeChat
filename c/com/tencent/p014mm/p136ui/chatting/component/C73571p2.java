package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.chatting.component.p2 */
public class C73571p2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ Context f216075d;

    public C73571p2(GroupToolsComponet groupToolsComponet, Context context) {
        this.f216075d = context;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107142f(0, this.f216075d.getString(C0966R.string.f360949g70));
        e0Var.mo107142f(1, this.f216075d.getString(C0966R.string.g6z));
    }
}
