package w80;

import android.media.MediaFormat;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p914oj.C110052b;
import sx3.C110818d0;
import sx3.C64186f0;
import z04.C112551y;

/* renamed from: w80.c */
public final class C90899c {
    /* renamed from: a */
    public static final List<Long> m114027a(String str, double[] dArr, int i) {
        boolean z;
        String str2 = str;
        double[] dArr2 = dArr;
        int i2 = i;
        C87412m.m108594g(dArr2, "result");
        if (str2 == null || !C86013q1.m106450k(str)) {
            return C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = Integer.MAX_VALUE;
        C110052b bVar = new C110052b();
        try {
            bVar.mo161392k(str2);
            int d = bVar.mo161385d();
            int i4 = 0;
            while (true) {
                if (i4 >= d) {
                    z = false;
                    break;
                }
                MediaFormat e = bVar.mo161386e(i4);
                C87412m.m108593f(e, "mediaExtractor.getTrackFormat(i)");
                String string = e.getString("mime");
                C87412m.m108591d(string);
                if (C112551y.m153819s(string, "video/", false)) {
                    bVar.mo161390i(i4);
                    z = true;
                    break;
                }
                i4++;
            }
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                int i5 = 0;
                int i6 = 1000000;
                int i7 = 0;
                while (true) {
                    long b = bVar.mo161383b();
                    if (b == -1) {
                        break;
                    }
                    arrayList.add(Long.valueOf(b));
                    ArrayList arrayList3 = arrayList2;
                    if (b > ((long) i6)) {
                        arrayList2 = arrayList3;
                        arrayList2.add(Integer.valueOf(i7));
                        i5 = Math.max(i5, i7);
                        i3 = Math.min(i3, i7);
                        if (i5 - i3 >= i2) {
                            break;
                        }
                        i6 += 1000000;
                        i7 = 0;
                    } else {
                        arrayList2 = arrayList3;
                        i7++;
                    }
                    if (!bVar.mo161382a()) {
                        break;
                    }
                }
                if (i6 <= 1000000) {
                    arrayList2.add(Integer.valueOf(i7));
                    i5 = Math.max(i5, i7);
                    i3 = Math.min(i3, i7);
                }
                dArr2[0] = (double) i3;
                dArr2[1] = (double) i5;
                dArr2[2] = C110818d0.m150899B(arrayList2);
            }
        } catch (Exception e2) {
            Log.m105920e("FPSComputer", "compute fps error: " + e2.getLocalizedMessage());
            C115669n.INSTANCE.mo175912v(986, 103);
        } catch (Throwable th) {
            bVar.mo161388g();
            throw th;
        }
        bVar.mo161388g();
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("compute fps for file: ");
        sb.append(str2);
        sb.append(", threshold = ");
        sb.append(i2);
        sb.append(" frames = ");
        sb.append(arrayList.size());
        sb.append(", execute time = ");
        long j = currentTimeMillis2 - currentTimeMillis;
        sb.append(j);
        sb.append("ms, min fps = ");
        sb.append(dArr2[0]);
        sb.append(", max fps = ");
        sb.append(dArr2[1]);
        sb.append(", avg fps = ");
        sb.append(dArr2[2]);
        Log.m105924i("FPSComputer", sb.toString());
        C115669n.INSTANCE.mo175913w(986, 102, j);
        return arrayList;
    }
}
