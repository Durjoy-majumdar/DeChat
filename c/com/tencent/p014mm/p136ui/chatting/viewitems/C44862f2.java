package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import nj3.C76912y0;
import p244tt.C14088e;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.f2 */
public class C44862f2 implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f121713a;

    /* renamed from: b */
    public final /* synthetic */ C67391b f121714b;

    public C44862f2(C89779i0 i0Var, C67391b bVar) {
        this.f121713a = i0Var;
        this.f121714b = bVar;
    }

    /* renamed from: a */
    public void mo1717a() {
        this.f121713a.cancel();
    }

    /* renamed from: b */
    public void mo1718b() {
        C76912y0.makeText((Context) this.f121714b.mo91565f(), (int) C0966R.string.gaq, 0).show();
        this.f121713a.cancel();
    }
}
