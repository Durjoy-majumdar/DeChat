package pu1;

import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import p172io.flutter.plugin.common.EventChannel;
import rx3.C13598b0;

/* renamed from: pu1.e */
public final class C110253e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f329795d;

    /* renamed from: e */
    public final /* synthetic */ C110251b f329796e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110253e(long j, C110251b bVar) {
        super(0);
        this.f329795d = j;
        this.f329796e = bVar;
    }

    public Object invoke() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "onFirstFrameRendered");
        hashMap.put("playerId", Long.valueOf(this.f329795d));
        EventChannel.EventSink a = this.f329796e.f329786e.mo161672a();
        if (a != null) {
            a.success(hashMap);
        }
        return C13598b0.f38549a;
    }
}
