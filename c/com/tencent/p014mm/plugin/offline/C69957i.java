package com.tencent.p014mm.plugin.offline;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.offline.C69954h;
import ie3.C76331i;

/* renamed from: com.tencent.mm.plugin.offline.i */
public class C69957i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f201772d;

    /* renamed from: e */
    public final /* synthetic */ int f201773e;

    /* renamed from: f */
    public final /* synthetic */ C69954h.C69955a f201774f;

    public C69957i(C69954h.C69955a aVar, MMActivity mMActivity, int i) {
        this.f201774f = aVar;
        this.f201772d = mMActivity;
        this.f201773e = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C76331i.m91759c(this.f201772d, this.f201773e);
        C69954h hVar = C69954h.this;
        hVar.mo91264o(this.f201772d, 0, hVar.f232423c);
    }
}
