package ly2;

import fy3.C32224a;
import gy3.C87413o;
import ky2.C10432i;
import rx3.C13598b0;

/* renamed from: ly2.a */
public final class C10671a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10432i.C10433a f32088d;

    /* renamed from: e */
    public final /* synthetic */ int f32089e;

    /* renamed from: f */
    public final /* synthetic */ String f32090f;

    /* renamed from: g */
    public final /* synthetic */ boolean f32091g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10671a(C10432i.C10433a aVar, int i, String str, boolean z) {
        super(0);
        this.f32088d = aVar;
        this.f32089e = i;
        this.f32090f = str;
        this.f32091g = z;
    }

    public Object invoke() {
        this.f32088d.onResult(this.f32089e, this.f32090f, this.f32091g);
        return C13598b0.f38549a;
    }
}
