package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C50275lk0;
import te3.C50542nh0;
import te3.C64707sc1;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.finder.ui.w */
public final class C41541w extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C50542nh0 f111851d;

    /* renamed from: e */
    public final /* synthetic */ FinderBlackListUI f111852e;

    /* renamed from: f */
    public final /* synthetic */ C64707sc1 f111853f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41541w(C50542nh0 nh02, FinderBlackListUI finderBlackListUI, C64707sc1 sc12) {
        super(0);
        this.f111851d = nh02;
        this.f111852e = finderBlackListUI;
        this.f111853f = sc12;
    }

    public Object invoke() {
        C50275lk0 lk02;
        if (this.f111851d.f138603e == 0) {
            ArrayList<C50275lk0> arrayList = this.f111852e.f111755r;
            C64707sc1 sc12 = this.f111853f;
            Iterator<C50275lk0> it = arrayList.iterator();
            while (true) {
                lk02 = null;
                if (!it.hasNext()) {
                    break;
                }
                C50275lk0 next = it.next();
                if (C112551y.m153810j(next.f137478f, sc12.f185408h, false, 2, (Object) null)) {
                    lk02 = next;
                    break;
                }
            }
            C50275lk0 lk03 = lk02;
            if (lk03 != null) {
                FinderBlackListUI finderBlackListUI = this.f111852e;
                finderBlackListUI.f111755r.remove(lk03);
                finderBlackListUI.f111754q.mo64610b(finderBlackListUI.f111755r);
                finderBlackListUI.f111754q.notifyDataSetChanged();
                finderBlackListUI.mo64589N7();
            }
        } else {
            C76912y0.makeText((Context) this.f111852e.getContext(), (CharSequence) this.f111852e.getContext().getResources().getString(C0966R.string.de5), 0).show();
        }
        return C13598b0.f38549a;
    }
}
