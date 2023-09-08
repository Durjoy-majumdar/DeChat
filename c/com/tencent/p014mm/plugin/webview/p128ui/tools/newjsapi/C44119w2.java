package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44111u2;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C76874e0;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.w2 */
public final class C44119w2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C13855j f119515d;

    public C44119w2(C13855j jVar) {
        this.f119515d = jVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        ArrayList<C44111u2.C44113b.C44115b> arrayList;
        C44111u2.f119490d.getClass();
        C44111u2.C44113b bVar = C44111u2.f119497n;
        if (bVar != null && (arrayList = bVar.f119500c) != null) {
            C13855j jVar = this.f119515d;
            for (C44111u2.C44113b.C44115b bVar2 : arrayList) {
                e0Var.mo107153m(bVar2.f119503b, bVar2.f119502a, new BitmapDrawable(jVar.f38998a.getResources(), bVar2.f119505d), 0);
            }
        }
    }
}
