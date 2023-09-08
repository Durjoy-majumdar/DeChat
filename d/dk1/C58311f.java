package dk1;

import dk1.C58312g;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: dk1.f */
public final class C58311f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f166961d;

    /* renamed from: e */
    public final /* synthetic */ int f166962e;

    /* renamed from: f */
    public final /* synthetic */ C58312g.C58313a f166963f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList<C58307a> f166964g;

    /* renamed from: h */
    public final /* synthetic */ C32224a<C13598b0> f166965h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58311f(int i, int i2, C58312g.C58313a aVar, ArrayList<C58307a> arrayList, C32224a<C13598b0> aVar2) {
        super(0);
        this.f166961d = i;
        this.f166962e = i2;
        this.f166963f = aVar;
        this.f166964g = arrayList;
        this.f166965h = aVar2;
    }

    public Object invoke() {
        int i;
        int i2 = this.f166961d;
        if (i2 >= 0 && (i = this.f166962e) >= 0 && i2 <= i) {
            while (true) {
                C58312g.C58313a aVar = this.f166963f;
                C58307a aVar2 = (C58307a) C110818d0.m150917O(this.f166964g, i2);
                int i3 = 1;
                if (this.f166963f.f166978g != 1) {
                    i3 = 2;
                }
                aVar.mo83066d(i2, aVar2, i3);
                this.f166963f.f166980i.add(Integer.valueOf(i2));
                if (i2 == this.f166962e) {
                    break;
                }
                i2++;
            }
        }
        C61926c.m72668M(new C7357e(this.f166965h));
        return C13598b0.f38549a;
    }
}
