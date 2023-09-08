package d60;

import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i60.C46169a;
import i60.C46170d;
import rx3.C13598b0;

/* renamed from: d60.p */
public final class C45281p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46169a f122650d;

    /* renamed from: e */
    public final /* synthetic */ C45272n f122651e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45281p(C46169a aVar, C45272n nVar) {
        super(0);
        this.f122650d = aVar;
        this.f122651e = nVar;
    }

    public Object invoke() {
        RoomLiveService.f157195f.remove(this.f122650d);
        C46170d dVar = this.f122651e.f122637j;
        C46169a aVar = this.f122650d;
        dVar.getClass();
        C87412m.m108594g(aVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        int indexOf = dVar.f124462d.indexOf(aVar);
        if (indexOf != -1) {
            dVar.f124462d.remove(aVar);
            dVar.notifyItemRemoved(indexOf);
        }
        Log.m105924i("MicroMsg.LiveCommentPlugin", "removeComment:" + this.f122650d);
        return C13598b0.f38549a;
    }
}
