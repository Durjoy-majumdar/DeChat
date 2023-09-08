package d60;

import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87413o;
import i60.C46169a;
import i60.C46170d;
import rx3.C13598b0;

/* renamed from: d60.r */
public final class C45283r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f122655d;

    /* renamed from: e */
    public final /* synthetic */ String f122656e;

    /* renamed from: f */
    public final /* synthetic */ C45272n f122657f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45283r(String str, String str2, C45272n nVar) {
        super(0);
        this.f122655d = str;
        this.f122656e = str2;
        this.f122657f = nVar;
    }

    public Object invoke() {
        C46169a aVar = new C46169a(this.f122655d, "", this.f122656e, 10001, C31543z5.m39455e());
        RoomLiveService.f157195f.add(aVar);
        C46170d dVar = this.f122657f.f122637j;
        dVar.getClass();
        int size = dVar.f124462d.size();
        dVar.f124462d.add(aVar);
        dVar.notifyItemInserted(size);
        Log.m105924i("MicroMsg.LiveCommentPlugin", "linkMicMsg：" + aVar);
        return C13598b0.f38549a;
    }
}
