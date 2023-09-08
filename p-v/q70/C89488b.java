package q70;

import com.tencent.matrix.util.MemInfo;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: q70.b */
public final class C89488b extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f257561d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89488b(long j) {
        super(4);
        this.f257561d = j;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        MemInfo[] memInfoArr = (MemInfo[]) obj3;
        C87412m.m108594g(memInfoArr, "amsMemInfos");
        C87412m.m108594g((MemInfo[]) obj4, "debugMemInfos");
        ((C119157j) C119157j.f356862d).mo183884o(new C89486a(this.f257561d, memInfoArr, intValue));
        return C13598b0.f38549a;
    }
}
