package r80;

import android.media.MediaCodec;
import com.tencent.p014mm.plugin.report.service.C115669n;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import n80.C109697b;
import rx3.C13598b0;

/* renamed from: r80.s */
public final class C110543s extends C87413o implements C32226l<C109697b, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32227p<ByteBuffer, MediaCodec.BufferInfo, C13598b0> f330620d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f330621e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110543s(C32227p<? super ByteBuffer, ? super MediaCodec.BufferInfo, C13598b0> pVar, C32224a<C13598b0> aVar) {
        super(1);
        this.f330620d = pVar;
        this.f330621e = aVar;
    }

    public Object invoke(Object obj) {
        C109697b bVar = (C109697b) obj;
        C87412m.m108594g(bVar, "$this$$receiver");
        C115669n.INSTANCE.idkeyStat(985, 161, 1, false);
        bVar.f328347d = this.f330620d;
        bVar.f328348e = this.f330621e;
        bVar.f328350g = true;
        return C13598b0.f38549a;
    }
}
