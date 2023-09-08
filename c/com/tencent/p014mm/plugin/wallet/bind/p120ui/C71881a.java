package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.view.View;
import com.tencent.p014mm.plugin.wallet.bind.p120ui.C71882b;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.a */
public class C71881a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C71882b.C71883a f208507d;

    /* renamed from: e */
    public final /* synthetic */ View f208508e;

    public C71881a(C71882b bVar, C71882b.C71883a aVar, View view) {
        this.f208507d = aVar;
        this.f208508e = view;
    }

    public void run() {
        int[] iArr = new int[2];
        this.f208507d.f208514a.getLocationInWindow(iArr);
        int i = iArr[0];
        this.f208507d.f208521h.getLocationInWindow(iArr);
        this.f208507d.f208514a.setMaxWidth((iArr[0] - i) - C76577a.m92151b(this.f208508e.getContext(), 16));
    }
}
