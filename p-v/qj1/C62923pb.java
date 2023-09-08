package qj1;

import cj1.C54847z3;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C51493u41;
import te3.C52066y41;
import te3.C64239aq2;
import te3.C64265bq2;
import te3.C64293cq2;

/* renamed from: qj1.pb */
public final class C62923pb extends C54847z3.C54849b<C51493u41> {

    /* renamed from: b */
    public final /* synthetic */ C62843kb f178553b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62923pb(C62843kb kbVar, Class<C51493u41> cls) {
        super(cls);
        this.f178553b = kbVar;
    }

    /* renamed from: a */
    public void mo9116a(C47465a aVar) {
        C89349b bVar;
        C51493u41 u412 = (C51493u41) aVar;
        C87412m.m108594g(u412, "result");
        Log.m105924i("MultiStreamPlugin", "onPollingSuccess multistream sequence: " + this.f178553b.f178348s + " op: " + u412.f142591e + " resSeq: " + u412.f142590d);
        FinderLiveService.f159376d.getClass();
        C54847z3 z3Var = FinderLiveService.f159383n;
        C52066y41 y412 = new C52066y41();
        y412.f145110d = this.f178553b.f178348s;
        C13598b0 b0Var = C13598b0.f38549a;
        z3Var.mo75802h(13, y412);
        if (u412.f142591e == 0) {
            C62843kb kbVar = this.f178553b;
            kbVar.f178348s = u412.f142590d;
            C64265bq2 bq22 = u412.f142592f;
            if (bq22 != null && (bVar = bq22.f182318j) != null) {
                C47465a parseFrom = new C64293cq2().parseFrom(bVar.f257327a);
                C64293cq2 cq22 = parseFrom instanceof C64293cq2 ? (C64293cq2) parseFrom : null;
                if (cq22 != null) {
                    Log.m105924i("MultiStreamPlugin", "update multistream list: " + cq22.f182557g);
                    LinkedList<C64239aq2> linkedList = cq22.f182557g;
                    C87412m.m108593f(linkedList, "channel_params_desc");
                    C62843kb.m73930Z0(kbVar, linkedList);
                }
            }
        }
    }
}
