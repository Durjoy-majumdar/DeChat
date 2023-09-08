package com.tencent.p014mm.plugin.finder.live.micintercom.widget;

import al1.C39611s;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.live.micintercom.widget.a */
public final class C41452a implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f111624d;

    /* renamed from: e */
    public final /* synthetic */ LiveMicIntercomWidget f111625e;

    /* renamed from: f */
    public final /* synthetic */ View f111626f;

    public C41452a(C77407n nVar, LiveMicIntercomWidget liveMicIntercomWidget, View view) {
        this.f111624d = nVar;
        this.f111625e = liveMicIntercomWidget;
        this.f111626f = view;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        this.f111624d.mo107569n((TextView) ((C36570n) this.f111625e.f111615i).getValue(), false);
        TextView textView = (TextView) ((C36570n) this.f111625e.f111615i).getValue();
        C39611s sVar = this.f111625e.f111614h;
        textView.setText(sVar != null ? sVar.f106360d : null);
        e0Var.mo107140d(1, this.f111626f.getContext().getResources().getColor(C0966R.color.f3424sc), this.f111626f.getContext().getResources().getString(C0966R.string.fpp));
        e0Var.mo107142f(2, this.f111626f.getContext().getResources().getString(C0966R.string.fpo));
    }
}
