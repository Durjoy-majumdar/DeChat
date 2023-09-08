package dp1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C60168f2;
import java.util.HashMap;

@C86522b
/* renamed from: dp1.r */
public final class C7452r extends C86301e implements C60168f2 {

    /* renamed from: d */
    public final HashMap<Integer, Long> f25646d = new HashMap<>();

    /* renamed from: I6 */
    public void mo8598I6(int i, int i2, String str, String str2) {
        C87412m.m108594g(str, "sourceUsr");
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('-');
        long j = this.f25646d.get(Integer.valueOf(i));
        if (j == null) {
            j = 0L;
        }
        sb.append(j.longValue());
        String sb4 = sb.toString();
        Log.m105924i("FinderFeedCardReporter", "report22144 entersessionId=" + sb4 + ", entersession=" + i + ", eventTime=" + currentTimeMillis + ", cardType=" + i2 + ", sourceUsr=" + str + ", feedId=" + str2);
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[6];
        objArr[0] = sb4;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Long.valueOf(currentTimeMillis);
        objArr[3] = Integer.valueOf(i2);
        objArr[4] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[5] = str2;
        nVar.mo160131h(22144, objArr);
    }

    /* renamed from: Wt */
    public void mo8599Wt(int i) {
        this.f25646d.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() / 1000));
    }
}
