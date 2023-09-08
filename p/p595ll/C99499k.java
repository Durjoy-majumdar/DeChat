package p595ll;

import com.tencent.p014mm.autogen.events.RefreshSmileyPanelEvent;
import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C30764p2;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87413o;
import java.util.ArrayList;
import p490dl.C97489o;
import p490dl.C97491p;
import rx3.C13598b0;

/* renamed from: ll.k */
public final class C99499k extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C99500l f291719d;

    /* renamed from: e */
    public final /* synthetic */ C72994y1.C72995a f291720e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99499k(C99500l lVar, C72994y1.C72995a aVar) {
        super(2);
        this.f291719d = lVar;
        this.f291720e = aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        ArrayList arrayList = (ArrayList) C30790w2.m39221h().mo57717d().mo142065uP(0);
        if (arrayList.size() > 0) {
            this.f291719d.getClass();
            Log.m105925i("MicroMsg.EmojiSyncFetchList", "try to sync emoji downloadList:%d", Integer.valueOf(arrayList.size()));
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(11595, 2, Integer.valueOf(this.f291719d.f291721a));
            if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                nVar.mo160131h(11595, 3, Integer.valueOf(this.f291719d.f291721a));
            }
        } else {
            C86709a0.m107535s().mo121142i().mo119677K(this.f291720e, Boolean.FALSE);
            this.f291719d.getClass();
            Log.m105924i("MicroMsg.EmojiSyncFetchList", "no things need to download.");
        }
        if (this.f291719d.f291721a == 1) {
            C97489o.m125592g().mo136770l(true);
            C92668a.f266699q.mo126717a(false).mo126702d(true);
        } else {
            C97489o.m125592g().mo136771m(true);
            C97489o.m125592g().mo136769k(true);
            C92668a.f266699q.mo126718b(false).mo126702d(true);
        }
        C97491p.f286143a.mo136773a(true);
        new RefreshSmileyPanelEvent().publish();
        if (this.f291719d.f291722b != null) {
            C30764p2.f82718j.mo57680g();
        }
        return C13598b0.f38549a;
    }
}
