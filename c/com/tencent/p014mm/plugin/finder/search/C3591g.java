package com.tencent.p014mm.plugin.finder.search;

import com.tencent.p014mm.autogen.events.FeedContactChangeEvent;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C8676n0;
import java.util.ArrayList;
import java.util.Iterator;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C48868bk1;

/* renamed from: com.tencent.mm.plugin.finder.search.g */
public final class C3591g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FeedContactChangeEvent f16651d;

    /* renamed from: e */
    public final /* synthetic */ FinderMixSearchPresenter f16652e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3591g(FeedContactChangeEvent feedContactChangeEvent, FinderMixSearchPresenter finderMixSearchPresenter) {
        super(0);
        this.f16651d = feedContactChangeEvent;
        this.f16652e = finderMixSearchPresenter;
    }

    public Object invoke() {
        C8676n0 n0Var;
        if (!Util.isNullOrNil(this.f16651d.f154748d.f154749a)) {
            String str = this.f16652e.f16574d;
            Log.m105918d(str, "contactChangelistener " + this.f16651d.f154748d.f154749a);
            FinderMixSearchPresenter finderMixSearchPresenter = this.f16652e;
            ArrayList<C48868bk1> arrayList = finderMixSearchPresenter.f16580j;
            FeedContactChangeEvent feedContactChangeEvent = this.f16651d;
            int i = 0;
            Iterator<C48868bk1> it = arrayList.iterator();
            while (it.hasNext()) {
                C48868bk1 next = it.next();
                int i2 = i + 1;
                String str2 = null;
                if (i >= 0) {
                    String str3 = feedContactChangeEvent.f154748d.f154749a;
                    FinderContact finderContact = next.f131162d;
                    if (finderContact != null) {
                        str2 = finderContact.username;
                    }
                    if (C87412m.m108589b(str3, str2) && (n0Var = finderMixSearchPresenter.f16589v) != null) {
                        n0Var.notifyItemChanged(i2);
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
