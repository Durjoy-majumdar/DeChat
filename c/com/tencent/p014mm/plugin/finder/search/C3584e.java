package com.tencent.p014mm.plugin.finder.search;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.autogen.events.FeedContactChangeEvent;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C48868bk1;

/* renamed from: com.tencent.mm.plugin.finder.search.e */
public final class C3584e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FeedContactChangeEvent f16640d;

    /* renamed from: e */
    public final /* synthetic */ FinderContactSearchUI f16641e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3584e(FeedContactChangeEvent feedContactChangeEvent, FinderContactSearchUI finderContactSearchUI) {
        super(0);
        this.f16640d = feedContactChangeEvent;
        this.f16641e = finderContactSearchUI;
    }

    public Object invoke() {
        if (!Util.isNullOrNil(this.f16640d.f154748d.f154749a)) {
            String str = this.f16641e.f16440o;
            Log.m105918d(str, "contactChangelistener " + this.f16640d.f154748d.f154749a);
            FinderContactSearchUI finderContactSearchUI = this.f16641e;
            ArrayList<C48868bk1> arrayList = finderContactSearchUI.f16446u;
            FeedContactChangeEvent feedContactChangeEvent = this.f16640d;
            int i = 0;
            Iterator<C48868bk1> it = arrayList.iterator();
            while (it.hasNext()) {
                C48868bk1 next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = feedContactChangeEvent.f154748d.f154749a;
                    FinderContact finderContact = next.f131162d;
                    if (C87412m.m108589b(str2, finderContact != null ? finderContact.username : null)) {
                        RecyclerView recyclerView = finderContactSearchUI.f16430D;
                        if (recyclerView != null) {
                            RecyclerView.C16613e adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                adapter.notifyItemChanged(i);
                            }
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
