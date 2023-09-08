package r80;

import android.media.MediaCodec;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import m80.C109537f;
import rx3.C13598b0;

/* renamed from: r80.x */
public final class C110548x extends C87413o implements C32226l<C109537f, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32229r<ByteBuffer, Long, MediaCodec.BufferInfo, Boolean, C13598b0> f330627d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f330628e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f330629f;

    /* renamed from: g */
    public final /* synthetic */ C110538r f330630g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110548x(C32229r<? super ByteBuffer, ? super Long, ? super MediaCodec.BufferInfo, ? super Boolean, C13598b0> rVar, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C110538r rVar2) {
        super(1);
        this.f330627d = rVar;
        this.f330628e = aVar;
        this.f330629f = aVar2;
        this.f330630g = rVar2;
    }

    public Object invoke(Object obj) {
        C109537f fVar = (C109537f) obj;
        C87412m.m108594g(fVar, "$this$$receiver");
        fVar.f327874h = this.f330627d;
        fVar.f327875i = this.f330628e;
        fVar.f327877k = this.f330629f;
        fVar.f327885s = true;
        fVar.f327876j = new C110547w(this.f330630g);
        return C13598b0.f38549a;
    }
}
