package pu1;

import com.tencent.thumbplayer.api.ITPPlayer;
import fy3.C32226l;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: pu1.h */
public final class C110256h extends C87413o implements C32226l<ITPPlayer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f329801d;

    /* renamed from: e */
    public final /* synthetic */ C110251b f329802e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110256h(long j, C110251b bVar) {
        super(1);
        this.f329801d = j;
        this.f329802e = bVar;
    }

    public Object invoke(Object obj) {
        ITPPlayer iTPPlayer = (ITPPlayer) obj;
        C61926c.m72668M(new C110255g(this.f329801d, this.f329802e));
        return C13598b0.f38549a;
    }
}
