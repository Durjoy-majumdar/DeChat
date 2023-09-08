package p659qe;

import com.tencent.matrix.util.MemInfo;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import p723vf.C118672d;
import rx3.C13598b0;

/* renamed from: qe.e */
public final class C89610e extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

    /* renamed from: d */
    public static final C89610e f257803d = new C89610e();

    public C89610e() {
        super(4);
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        MemInfo[] memInfoArr = (MemInfo[]) obj3;
        MemInfo[] memInfoArr2 = (MemInfo[]) obj4;
        C87412m.m108594g(memInfoArr, "amsMemInfos");
        C87412m.m108594g(memInfoArr2, "debugMemInfos");
        StringBuilder sb = new StringBuilder();
        sb.append("sum pss of all process over threshold: amsSumPss = ");
        sb.append(intValue);
        sb.append(" KB, debugSumPss = ");
        sb.append(intValue2);
        sb.append(" KB ");
        sb.append("amsMemDetail: ");
        String arrays = Arrays.toString(memInfoArr);
        C87412m.m108593f(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        sb.append("\n==========\n");
        sb.append("debugMemDetail: ");
        String arrays2 = Arrays.toString(memInfoArr2);
        C87412m.m108593f(arrays2, "java.util.Arrays.toString(this)");
        sb.append(arrays2);
        C118672d.m167352b("Matrix.monitor.AppBgSumPssMonitor", sb.toString(), new Object[0]);
        return C13598b0.f38549a;
    }
}
