package pu1;

import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import p172io.flutter.plugin.common.EventChannel;
import rx3.C13598b0;

/* renamed from: pu1.g */
public final class C110255g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f329799d;

    /* renamed from: e */
    public final /* synthetic */ C110251b f329800e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110255g(long j, C110251b bVar) {
        super(0);
        this.f329799d = j;
        this.f329800e = bVar;
    }

    public Object invoke() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "onPrepared");
        hashMap.put("playerId", Long.valueOf(this.f329799d));
        EventChannel.EventSink a = this.f329800e.f329786e.mo161672a();
        if (a != null) {
            a.success(hashMap);
        }
        return C13598b0.f38549a;
    }
}
