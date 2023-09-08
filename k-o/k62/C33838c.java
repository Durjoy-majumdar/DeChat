package k62;

import com.tencent.p014mm.sdk.p134kt.DataPair3;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: k62.c */
public final class C33838c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f91466d;

    /* renamed from: e */
    public final /* synthetic */ DataPair3<Integer, Integer, String> f91467e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33838c(long j, DataPair3<Integer, Integer, String> dataPair3) {
        super(0);
        this.f91466d = j;
        this.f91467e = dataPair3;
    }

    public Object invoke() {
        C13601g<HashMap<Long, DataPair3<Integer, Integer, String>>> gVar = C33839d.f91468d;
        ((HashMap) ((C36570n) C33839d.f91468d).getValue()).put(Long.valueOf(this.f91466d), this.f91467e);
        return C13598b0.f38549a;
    }
}
