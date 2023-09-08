package vp3;

import android.graphics.SurfaceTexture;
import com.tencent.tav.decoder.RenderContext;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import vp3.C111601n;
import yp3.C112478a;
import yp3.C91542c;

/* renamed from: vp3.r */
public final class C111610r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C111601n f334101d;

    /* renamed from: e */
    public final /* synthetic */ int f334102e;

    /* renamed from: f */
    public final /* synthetic */ int f334103f;

    /* renamed from: g */
    public final /* synthetic */ int f334104g;

    /* renamed from: h */
    public final /* synthetic */ String f334105h;

    /* renamed from: i */
    public final /* synthetic */ C32226l f334106i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111610r(C111601n nVar, int i, int i2, int i3, String str, C32226l lVar) {
        super(0);
        this.f334101d = nVar;
        this.f334102e = i;
        this.f334103f = i2;
        this.f334104g = i3;
        this.f334105h = str;
        this.f334106i = lVar;
    }

    public Object invoke() {
        int createTexture = RenderContext.createTexture(36197);
        String str = this.f334101d.f334078t;
        C112478a.m153625c(str, "newVideoInputTexture id:" + createTexture, new Object[0]);
        SurfaceTexture surfaceTexture = new SurfaceTexture(createTexture);
        C111601n.C111602a aVar = new C111601n.C111602a(this.f334105h, new C111601n.C111603b(createTexture, true, this.f334102e, this.f334103f, this.f334104g, surfaceTexture), (C111601n.C111604c) null);
        surfaceTexture.setOnFrameAvailableListener(C111608p.f334098d);
        this.f334101d.f334079u.add(aVar);
        C91542c.m114881b(new C111609q(this, surfaceTexture));
        return C13598b0.f38549a;
    }
}
