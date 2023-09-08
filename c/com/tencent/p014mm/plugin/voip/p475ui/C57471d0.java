package com.tencent.p014mm.plugin.voip.p475ui;

import android.widget.LinearLayout;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import gy3.C87412m;
import nj2.C61767o;
import w33.C111730z;
import wj2.C53183e;
import wj2.C66132f;

/* renamed from: com.tencent.mm.plugin.voip.ui.d0 */
public final class C57471d0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C106444e0 f164667d;

    public C57471d0(C106444e0 e0Var) {
        this.f164667d = e0Var;
    }

    public void onChanged(Object obj) {
        C53183e eVar;
        C66132f fVar = (C66132f) obj;
        if (fVar != null && (eVar = fVar.f190090m) != C53183e.DEFAULT && eVar != C53183e.UNKNOWN) {
            C111730z.f334570C = true;
            LinearLayout linearLayout = this.f164667d.f317979e;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            C106444e0 e0Var = this.f164667d;
            LinearLayout linearLayout2 = e0Var.f317979e;
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(new C57470c0(fVar, e0Var));
            }
            String e = C61767o.m72469e(false);
            LinearLayout linearLayout3 = this.f164667d.f317979e;
            MMAnimateView mMAnimateView = linearLayout3 != null ? (MMAnimateView) linearLayout3.findViewById(C0966R.C0970id.iud) : null;
            C87412m.m108592e(mMAnimateView, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMAnimateView");
            mMAnimateView.setImageFilePath(e);
            mMAnimateView.mo129237x();
            mMAnimateView.mo129236w();
        }
    }
}
