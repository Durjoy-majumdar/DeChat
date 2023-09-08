package vf1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderInteractionSearchUIContract$ViewCallback;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import java.util.ArrayList;
import jm2.C117361f;
import jq3.C60898l;
import jq3.C60905o;
import rs1.C13442s8;

/* renamed from: vf1.a1 */
public final class C14716a1 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f40675d;

    public C14716a1(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
        this.f40675d = finderInteractionSearchUIContract$ViewCallback;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback = this.f40675d;
        finderInteractionSearchUIContract$ViewCallback.getClass();
        Class cls = C58684b.class;
        C117361f fVar = C117361f.INSTANCE;
        Intent intent = new Intent();
        intent.putExtra("KEY_FAV_QUERY", finderInteractionSearchUIContract$ViewCallback.f14446e.f40850n);
        intent.putExtra("KEY_REQUEST_ID", finderInteractionSearchUIContract$ViewCallback.f14446e.f40851o);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(finderInteractionSearchUIContract$ViewCallback.f14446e.f40852p);
        intent.putExtra("KEY_TAGS", arrayList);
        if (finderInteractionSearchUIContract$ViewCallback.f14448g == 2) {
            fVar.mo182041q(540999706);
            int c6 = i - ((C60898l) eVar).mo85796c6();
            if (c6 >= 0 && c6 < finderInteractionSearchUIContract$ViewCallback.f14446e.f40853q.size()) {
                C0740i2 i2Var = finderInteractionSearchUIContract$ViewCallback.f14446e.f40853q.get(c6);
                C87412m.m108593f(i2Var, "presenter.feedList[fixPos]");
                C0740i2 i2Var2 = i2Var;
                if (i2Var2 instanceof BaseFinderFeed) {
                    Log.m105924i("Finder.InteractionSearchViewCallback", "onClick " + c6 + " id:" + ((BaseFinderFeed) i2Var2).mo3513o().getId() + ", pos:" + c6);
                    finderInteractionSearchUIContract$ViewCallback.f14446e.mo13929n(i, i2Var2.getItemId());
                    finderInteractionSearchUIContract$ViewCallback.f14446e.mo13930q(intent, c6);
                    C13442s8.f38060Q0.mo12871c(finderInteractionSearchUIContract$ViewCallback.f14445d, intent);
                    ((C58684b) C86312j.m106911c(cls)).zx0(finderInteractionSearchUIContract$ViewCallback.f14445d, intent, 10001);
                    return;
                }
                return;
            }
            return;
        }
        fVar.mo182041q(540999705);
        int c64 = i - ((C60898l) eVar).mo85796c6();
        if (c64 >= 0 && c64 < finderInteractionSearchUIContract$ViewCallback.f14446e.f40853q.size()) {
            C0740i2 i2Var3 = finderInteractionSearchUIContract$ViewCallback.f14446e.f40853q.get(c64);
            C87412m.m108593f(i2Var3, "presenter.feedList[fixPos]");
            C0740i2 i2Var4 = i2Var3;
            if (i2Var4 instanceof BaseFinderFeed) {
                finderInteractionSearchUIContract$ViewCallback.f14446e.mo13929n(i, i2Var4.getItemId());
                Log.m105924i("Finder.InteractionSearchViewCallback", "onClick " + c64 + " id:" + ((BaseFinderFeed) i2Var4).mo3513o().getId() + ", pos:" + c64);
                finderInteractionSearchUIContract$ViewCallback.f14446e.mo13930q(intent, c64);
                C13442s8.f38060Q0.mo12871c(finderInteractionSearchUIContract$ViewCallback.f14445d, intent);
                Context context = view.getContext();
                C87412m.m108593f(context, "view.context");
                ((C58684b) C86312j.m106911c(cls)).Nx0(context, intent);
            }
        }
    }
}
