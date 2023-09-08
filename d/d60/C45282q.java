package d60;

import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i60.C46169a;
import i60.C46170d;
import java.util.ArrayList;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: d60.q */
public final class C45282q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45272n f122652d;

    /* renamed from: e */
    public final /* synthetic */ String f122653e;

    /* renamed from: f */
    public final /* synthetic */ String f122654f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45282q(C45272n nVar, String str, String str2) {
        super(0);
        this.f122652d = nVar;
        this.f122653e = str;
        this.f122654f = str2;
    }

    public Object invoke() {
        if (RoomLiveService.f157197h.f133060q) {
            C46170d dVar = this.f122652d.f122637j;
            ArrayList<C46169a> arrayList = RoomLiveService.f157195f;
            dVar.getClass();
            C87412m.m108594g(arrayList, "commentList");
            dVar.f124462d.clear();
            dVar.f124462d.addAll(arrayList);
            this.f122652d.f122637j.notifyDataSetChanged();
            C45272n nVar = this.f122652d;
            nVar.f122636i.post(new C45280o(nVar));
            Log.m105924i("MicroMsg.LiveCommentPlugin", "notify by true");
        } else {
            this.f122652d.f122634g.setVisibility(8);
            C46170d dVar2 = this.f122652d.f122637j;
            ArrayList arrayList2 = new ArrayList();
            dVar2.getClass();
            dVar2.f124462d.clear();
            dVar2.f124462d.addAll(arrayList2);
            this.f122652d.f122637j.notifyDataSetChanged();
            Log.m105924i("MicroMsg.LiveCommentPlugin", "notify by false");
        }
        C46169a aVar = new C46169a(this.f122653e, "", this.f122654f, 10001, C31543z5.m39455e());
        RoomLiveService.f157195f.add(aVar);
        C46170d dVar3 = this.f122652d.f122637j;
        dVar3.getClass();
        int size = dVar3.f124462d.size();
        dVar3.f124462d.add(aVar);
        dVar3.notifyItemInserted(size);
        Log.m105924i("MicroMsg.LiveCommentPlugin", "appendComment" + aVar);
        if (!RoomLiveService.f157197h.f133060q) {
            C45272n nVar2 = this.f122652d;
            C61926c.m72666K(nVar2.f122638n, new C45281p(aVar, nVar2));
        }
        return C13598b0.f38549a;
    }
}
