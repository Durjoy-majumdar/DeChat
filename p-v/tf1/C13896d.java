package tf1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: tf1.d */
public abstract class C13896d extends C13911k<C0740i2> implements C11385n {
    private final Map<C117747y, C13910j<C0740i2>> map = new LinkedHashMap();

    public void alive() {
        super.alive();
        for (Number intValue : getCmdIds()) {
            C86709a0.m107524d().mo123455a(intValue.intValue(), this);
        }
    }

    public IResponse<C0740i2> callInit() {
        return new C13899f();
    }

    public void dead() {
        super.dead();
        for (Number intValue : getCmdIds()) {
            C86709a0.m107524d().mo123470p(intValue.intValue(), this);
        }
    }

    public abstract IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar);

    public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
        C87412m.m108594g(jVar, "callback");
        if (obj != null && (obj instanceof C117747y)) {
            this.map.put(obj, jVar);
            C86709a0.m107524d().mo123460f((C117747y) obj);
        }
    }

    public void fetchInit(C13910j<C0740i2> jVar) {
        C87412m.m108594g(jVar, "callback");
        IResponse<C0740i2> callInit = callInit();
        callInit.setPullType(1000);
        jVar.onFetchDone(callInit);
    }

    public void fetchLoadMore(C13910j<C0740i2> jVar, boolean z) {
        C87412m.m108594g(jVar, "callback");
        C13911k.fetch$default(this, genLoadMoreNetScene(), jVar, false, 4, (Object) null);
    }

    public void fetchPreload(C13910j<C0740i2> jVar) {
        C87412m.m108594g(jVar, "callback");
        super.fetchPreload(jVar);
        C13911k.fetch$default(this, genRefreshNetScene(), jVar, false, 4, (Object) null);
    }

    public void fetchRefresh(C13910j<C0740i2> jVar) {
        C87412m.m108594g(jVar, "callback");
        C13911k.fetch$default(this, genRefreshNetScene(), jVar, false, 4, (Object) null);
    }

    public abstract C117747y genLoadMoreNetScene();

    public abstract C117747y genRefreshNetScene();

    public abstract List<Integer> getCmdIds();

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C13910j jVar = this.map.get(yVar);
        if (jVar != null) {
            this.map.remove(yVar);
            IResponse<C0740i2> dealOnSceneEnd = dealOnSceneEnd(i, i2, str, yVar);
            if (dealOnSceneEnd != null) {
                jVar.onFetchDone(dealOnSceneEnd);
            }
        }
    }
}
