package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: q70.j */
public final class C89514j extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f257606d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89514j(long j) {
        super(4);
        this.f257606d = j;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        MemInfo[] memInfoArr = (MemInfo[]) obj4;
        C87412m.m108594g((MemInfo[]) obj3, "amsMemInfos");
        C87412m.m108594g(memInfoArr, "debugMemInfos");
        if (C89496f.f257579g) {
            ((C119157j) C119157j.f356862d).mo183884o(new C89513i(this.f257606d, memInfoArr, intValue));
        } else {
            Log.m105924i("MicroMsg.monitor.AppBackgroundMemory", "Isolated XWeb is recycled or invalid");
        }
        return C13598b0.f38549a;
    }
}
