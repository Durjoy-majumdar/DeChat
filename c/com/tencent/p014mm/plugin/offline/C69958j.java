package com.tencent.p014mm.plugin.offline;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.offline.C69954h;

/* renamed from: com.tencent.mm.plugin.offline.j */
public class C69958j implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f201775d;

    /* renamed from: e */
    public final /* synthetic */ C69954h.C69955a f201776e;

    public C69958j(C69954h.C69955a aVar, MMActivity mMActivity) {
        this.f201776e = aVar;
        this.f201775d = mMActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C69954h hVar = C69954h.this;
        hVar.mo91264o(this.f201775d, 0, hVar.f232423c);
    }
}
