package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import com.tencent.p014mm.p136ui.chatting.component.C73537m5;
import e13.C7583b;
import gy3.C87412m;
import rx3.C36570n;

/* renamed from: com.tencent.mm.ui.chatting.component.x5 */
public final class C73653x5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C73537m5 f216256d;

    /* renamed from: e */
    public final /* synthetic */ C7583b f216257e;

    public C73653x5(C73537m5 m5Var, C7583b bVar) {
        this.f216256d = m5Var;
        this.f216257e = bVar;
    }

    public final void run() {
        C73537m5 m5Var = this.f216256d;
        String str = this.f216257e.f25852b;
        C73537m5.C73538a aVar = m5Var.f216027s;
        C73537m5.C73538a aVar2 = C73537m5.C73538a.BarStatusEmpty;
        if (aVar != aVar2) {
            LoadableTextView loadableTextView = m5Var.f216022n;
            if (loadableTextView != null) {
                boolean z = false;
                loadableTextView.setLoading(false);
                LoadableTextView loadableTextView2 = m5Var.f216022n;
                if (loadableTextView2 != null) {
                    loadableTextView2.f215645h = ((View) ((C36570n) m5Var.f216013D).getValue()).getWidth();
                    loadableTextView2.requestLayout();
                    if (!C87412m.m108589b(str, m5Var.f216030v)) {
                        if (str.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            LoadableTextView loadableTextView3 = m5Var.f216022n;
                            if (loadableTextView3 != null) {
                                loadableTextView3.setOriginText(str);
                                m5Var.mo102531g6(C73537m5.C73538a.BarStatusTranslateFinish);
                                return;
                            }
                            C87412m.m108603p("resultTv");
                            throw null;
                        }
                    }
                    LoadableTextView loadableTextView4 = m5Var.f216022n;
                    if (loadableTextView4 != null) {
                        loadableTextView4.setText("");
                        m5Var.mo102531g6(aVar2);
                        return;
                    }
                    C87412m.m108603p("resultTv");
                    throw null;
                }
                C87412m.m108603p("resultTv");
                throw null;
            }
            C87412m.m108603p("resultTv");
            throw null;
        }
    }
}
