package op1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import sk1.C63965x;
import te3.C64370fp1;

/* renamed from: op1.t */
public final class C62113t extends C87413o implements C32227p<Integer, C63965x, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62084h f176624d;

    /* renamed from: e */
    public final /* synthetic */ C64370fp1 f176625e;

    /* renamed from: f */
    public final /* synthetic */ int f176626f;

    /* renamed from: g */
    public final /* synthetic */ Object f176627g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62113t(C62084h hVar, C64370fp1 fp12, int i, Object obj) {
        super(2);
        this.f176624d = hVar;
        this.f176625e = fp12;
        this.f176626f = i;
        this.f176627g = obj;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C63965x xVar = (C63965x) obj2;
        int indexOf = this.f176624d.f176539p.indexOf(2) + intValue;
        Log.m105924i("Finder.LiveShoppingListAdapter", "notifyProductItem " + this.f176625e.f183177e + ", source:" + this.f176626f + ", sellingPrice:" + this.f176625e.f183181i + " dataPos:" + intValue + "(realPos:" + indexOf + "),size:" + this.f176624d.getItemCount());
        boolean z = false;
        if (intValue >= 0 && intValue < this.f176624d.getItemCount()) {
            z = true;
        }
        if (z) {
            C61926c.m72668M(new C62112s(this.f176624d, intValue, this.f176625e, indexOf, this.f176627g));
        }
        return C13598b0.f38549a;
    }
}
