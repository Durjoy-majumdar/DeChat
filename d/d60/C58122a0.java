package d60;

import android.view.ViewGroup;
import com.tencent.p014mm.live.model.RoomLiveService;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: d60.a0 */
public final class C58122a0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f166289d;

    /* renamed from: e */
    public final /* synthetic */ C58234z f166290e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58122a0(ViewGroup viewGroup, C58234z zVar) {
        super(0);
        this.f166289d = viewGroup;
        this.f166290e = zVar;
    }

    public Object invoke() {
        if (this.f166289d.getVisibility() == 0) {
            this.f166290e.f166762i.setText(RoomLiveService.f157190a.mo76445c());
        }
        return C13598b0.f38549a;
    }
}
