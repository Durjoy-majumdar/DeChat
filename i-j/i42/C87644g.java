package i42;

import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.view.MBSurfaceStub;
import d42.C86193x;
import e42.C7594e;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: i42.g */
public final class C87644g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87609c<C7594e> f253839d;

    /* renamed from: e */
    public final /* synthetic */ int f253840e;

    /* renamed from: f */
    public final /* synthetic */ MBSurfaceStub f253841f;

    /* renamed from: g */
    public final /* synthetic */ int f253842g;

    /* renamed from: h */
    public final /* synthetic */ int f253843h;

    /* renamed from: i */
    public final /* synthetic */ int f253844i;

    /* renamed from: j */
    public final /* synthetic */ int f253845j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87644g(C87609c<C7594e> cVar, int i, MBSurfaceStub mBSurfaceStub, int i2, int i3, int i4, int i5) {
        super(0);
        this.f253839d = cVar;
        this.f253840e = i;
        this.f253841f = mBSurfaceStub;
        this.f253842g = i2;
        this.f253843h = i3;
        this.f253844i = i4;
        this.f253845j = i5;
    }

    public Object invoke() {
        C86193x xVar;
        MBBuildConfig<T> mBBuildConfig = this.f253839d.f253732f;
        if (!(mBBuildConfig == null || (xVar = mBBuildConfig.f248375n) == null)) {
            xVar.mo109583R(this.f253840e, this.f253841f, this.f253842g, this.f253843h, this.f253844i, this.f253845j);
        }
        return C13598b0.f38549a;
    }
}
