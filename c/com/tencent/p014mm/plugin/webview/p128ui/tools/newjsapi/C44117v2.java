package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44111u2;
import gy3.C87412m;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C76874e0;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.v2 */
public final class C44117v2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C13855j f119511d;

    public C44117v2(C13855j jVar) {
        this.f119511d = jVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        ArrayList<C44111u2.C44113b.C44115b> arrayList;
        C44111u2 u2Var = C44111u2.f119490d;
        u2Var.getClass();
        C44111u2.C44116c cVar = C44111u2.f119494h;
        C87412m.m108591d(cVar);
        if (cVar.f119498a) {
            u2Var.getClass();
            C44111u2.C44116c cVar2 = C44111u2.f119494h;
            C87412m.m108591d(cVar2);
            if (cVar2.mo68754a()) {
                e0Var.mo107146h(2147483646, this.f119511d.f38998a.getString(C0966R.string.hre), C0966R.raw.icons_filled_share, this.f119511d.f38998a.getResources().getColor(C0966R.color.f2939n));
            }
        }
        u2Var.getClass();
        C44111u2.C44116c cVar3 = C44111u2.f119495i;
        C87412m.m108591d(cVar3);
        if (cVar3.f119498a) {
            u2Var.getClass();
            C44111u2.C44116c cVar4 = C44111u2.f119495i;
            C87412m.m108591d(cVar4);
            if (cVar4.mo68754a()) {
                e0Var.mo107146h(2147483645, this.f119511d.f38998a.getString(C0966R.string.hrf), C0966R.raw.bottomsheet_icon_moment, 0);
            }
        }
        u2Var.getClass();
        C44111u2.C44113b bVar = C44111u2.f119496j;
        if (bVar != null && (arrayList = bVar.f119500c) != null) {
            C13855j jVar = this.f119511d;
            for (C44111u2.C44113b.C44115b bVar2 : arrayList) {
                e0Var.mo107153m(bVar2.f119503b, bVar2.f119502a, new BitmapDrawable(jVar.f38998a.getResources(), bVar2.f119505d), 0);
            }
        }
    }
}
