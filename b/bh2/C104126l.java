package bh2;

import android.media.MediaCodec;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import n80.C109697b;
import rx3.C13598b0;

/* renamed from: bh2.l */
public final class C104126l extends C87413o implements C32226l<C109697b, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32227p<ByteBuffer, MediaCodec.BufferInfo, C13598b0> f308104d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f308105e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104126l(C32227p<? super ByteBuffer, ? super MediaCodec.BufferInfo, C13598b0> pVar, C32224a<C13598b0> aVar) {
        super(1);
        this.f308104d = pVar;
        this.f308105e = aVar;
    }

    public Object invoke(Object obj) {
        C109697b bVar = (C109697b) obj;
        C87412m.m108594g(bVar, "$this$$receiver");
        bVar.f328347d = this.f308104d;
        bVar.f328348e = this.f308105e;
        bVar.f328350g = true;
        return C13598b0.f38549a;
    }
}
