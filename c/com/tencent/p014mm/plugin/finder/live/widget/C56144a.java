package com.tencent.p014mm.plugin.finder.live.widget;

import af0.C16463e;
import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C8478d0;
import gy3.C87412m;
import il1.C60538w1;
import java.util.ArrayList;
import java.util.Iterator;
import ky3.C88334c;
import ok1.C62041a;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.finder.live.widget.a */
public final class C56144a implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveConfettiView f160131d;

    public C56144a(FinderLiveConfettiView finderLiveConfettiView) {
        this.f160131d = finderLiveConfettiView;
    }

    public final boolean onTimerExpired() {
        FinderLiveConfettiView finderLiveConfettiView = this.f160131d;
        C16463e eVar = new C16463e(finderLiveConfettiView.f160070n, finderLiveConfettiView.f160071o);
        ArrayList<Bitmap> arrayList = finderLiveConfettiView.f160064e;
        int size = arrayList.size();
        int i = 0;
        Bitmap bitmap = arrayList.get(size <= 0 ? 0 : C88334c.f255322d.mo122723h(0, size));
        C87412m.m108593f(bitmap, "confettiBitmaps[nextInt(confettiBitmaps.size)]");
        Bitmap bitmap2 = bitmap;
        if (finderLiveConfettiView.f160065f.size() > 0 && finderLiveConfettiView.f160068i > 0) {
            synchronized (finderLiveConfettiView.f160065f) {
                Iterator<Integer> it = finderLiveConfettiView.f160066g.iterator();
                if (it.hasNext()) {
                    Integer next = it.next();
                    while (it.hasNext()) {
                        next = Integer.valueOf(next.intValue() + it.next().intValue());
                    }
                    int intValue = next.intValue();
                    int i2 = 100;
                    if (intValue >= 100) {
                        i2 = intValue;
                    }
                    C8478d0 d0Var = new C8478d0();
                    int h = i2 <= 0 ? 0 : C88334c.f255322d.mo122723h(0, i2);
                    d0Var.f27483d = h;
                    if (h <= intValue) {
                        Iterator<Integer> it4 = finderLiveConfettiView.f160066g.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                C13598b0 b0Var = C13598b0.f38549a;
                                break;
                            }
                            Integer next2 = it4.next();
                            int i3 = i + 1;
                            if (i >= 0) {
                                int intValue2 = next2.intValue();
                                int i4 = d0Var.f27483d;
                                if (i4 <= intValue2) {
                                    Bitmap bitmap3 = (Bitmap) C110818d0.m150917O(finderLiveConfettiView.f160065f, i);
                                    if (bitmap3 != null) {
                                        bitmap2 = bitmap3;
                                    }
                                } else {
                                    d0Var.f27483d = i4 - intValue2;
                                    i = i3;
                                }
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                    }
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
        }
        C60538w1 w1Var = new C60538w1(bitmap2, finderLiveConfettiView);
        C62041a aVar = finderLiveConfettiView.f160067h;
        Context context = finderLiveConfettiView.getContext();
        C87412m.m108593f(context, "context");
        aVar.mo86987b(context, w1Var, eVar, finderLiveConfettiView).mo14936b();
        Log.m105918d(finderLiveConfettiView.f160063d, "[emitLikeConfetti]");
        return true;
    }
}
