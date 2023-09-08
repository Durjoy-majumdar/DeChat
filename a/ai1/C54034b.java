package ai1;

import c02.C92331c;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import fy3.C32224a;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C52005xq0;

/* renamed from: ai1.b */
public final class C54034b extends C8313a {

    /* renamed from: j */
    public final C13601g f151303j = C36568h.m40985a(new C54035a(this));

    /* renamed from: ai1.b$a */
    public static final class C54035a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C54034b f151304d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54035a(C54034b bVar) {
            super(0);
            this.f151304d = bVar;
        }

        public Object invoke() {
            return Long.valueOf(((C55001u) this.f151304d.business(C55001u.class)).f154420q.f182392d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54034b(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    public void onLiveActivate() {
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        Log.m105924i("MicroMsg.LiveHandOffController", "onLiveDeactivate " + ((Number) ((C36570n) this.f151303j).getValue()).longValue());
        C54033a aVar = C54033a.f151301a;
        HandOff c = aVar.mo74698c(getStore().getLiveRoomData());
        if (c != null) {
            Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "delHandOff " + c);
            ((C92331c) C86312j.m106911c(C92331c.class)).mo58349Bn(c.getKey());
        }
        aVar.mo74697b((HandOff) null);
    }

    public void onLiveStart(C52005xq0 xq02) {
        super.onLiveStart(xq02);
        Log.m105924i("MicroMsg.LiveHandOffController", "onLiveStart " + ((Number) ((C36570n) this.f151303j).getValue()).longValue());
        C54033a aVar = C54033a.f151301a;
        HandOff c = aVar.mo74698c(getStore().getLiveRoomData());
        if (c != null) {
            aVar.mo74697b(c);
            HandOff handOff = C54033a.f151302b;
            if (!C87412m.m108589b(handOff != null ? handOff.getKey() : null, c.getKey())) {
                Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "addOrUpdateHandOff " + c);
                C54033a.f151302b = c;
                String key = c.getKey();
                Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "save currentHandOffKey " + key);
                if (key == null || MultiProcessMMKV.getDefault().putString("FinderLiveHandOffUtil_current", key) == null) {
                    MultiProcessMMKV.getDefault().remove("FinderLiveHandOffUtil_current");
                }
                ((C92331c) C86312j.m106911c(C92331c.class)).Gg0(c);
            }
        }
    }
}
