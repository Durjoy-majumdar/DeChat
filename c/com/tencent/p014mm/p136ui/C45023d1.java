package com.tencent.p014mm.p136ui;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19636w0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import te3.C118459qf;

/* renamed from: com.tencent.mm.ui.d1 */
public class C45023d1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f122118d;

    /* renamed from: e */
    public final /* synthetic */ LiveBizSessionTipsBar f122119e;

    public C45023d1(LiveBizSessionTipsBar liveBizSessionTipsBar, int i) {
        this.f122119e = liveBizSessionTipsBar;
        this.f122118d = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/LiveBizSessionTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LiveBizSessionTipsBar liveBizSessionTipsBar = this.f122119e;
        C67391b bVar = liveBizSessionTipsBar.f121179e;
        if (bVar != null) {
            liveBizSessionTipsBar.f121181g = bVar.mo91577r();
        }
        C19428d dVar = C19428d.f54856a;
        String f = dVar.mo25172f(this.f122119e.f121181g);
        int h = dVar.mo25174h(this.f122119e.f121181g);
        int i = C19636w0.f55626c;
        C115669n.INSTANCE.mo160131h(23044, 2, this.f122119e.f121181g, Integer.valueOf(this.f122118d), Integer.valueOf(i), f, Integer.valueOf(h), 0, "");
        dVar.mo25190y(this.f122119e.f121179e.mo91565f(), this.f122119e.f121181g, f, 4, h, (List<? extends C118459qf>) null);
        dVar.mo25156I(this.f122119e.f121181g, (C19623o0) null);
        C117292a.m165361g(this, "com/tencent/mm/ui/LiveBizSessionTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
