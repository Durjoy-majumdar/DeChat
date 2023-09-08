package er1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import sx3.C110818d0;
import sx3.C64197v;
import te3.va4;

/* renamed from: er1.d5 */
public final class C58709d5 implements Runnable {

    /* renamed from: d */
    public static final C58709d5 f168059d = new C58709d5();

    public final void run() {
        ArrayList<va4> arrayList;
        synchronized (C58704c5.f168044a) {
            StringBuilder sb = new StringBuilder();
            ArrayList<va4> arrayList2 = C58704c5.f168045b;
            va4 va4 = (va4) C110818d0.m150916N(arrayList2);
            long j = va4 != null ? va4.f185868f : 0;
            va4 va42 = (va4) C110818d0.m150925W(arrayList2);
            long j2 = (va42 != null ? va42.f185868f : 0) - j;
            Iterator<va4> it = arrayList2.iterator();
            int i = 0;
            while (true) {
                Long l = null;
                if (it.hasNext()) {
                    va4 next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        va4 va43 = next;
                        if (i > 0) {
                            va4 va44 = C58704c5.f168045b.get(i - 1);
                            C87412m.m108593f(va44, "flow.get(index - 1)");
                            va4 va45 = va44;
                            float f = j2 != 0 ? (((float) (va43.f185868f - va45.f185868f)) * 100.0f) / ((float) j2) : 0.0f;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(va43.f185867e);
                            sb4.append(XVFSFile.PATH_SEPARATOR_CHAR);
                            sb4.append(va43.f185868f - va45.f185868f);
                            sb4.append("ms,");
                            String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            C87412m.m108593f(format, "format(format, *args)");
                            sb4.append(format);
                            sb4.append("%\n");
                            sb.append(sb4.toString());
                        } else {
                            sb.append("Total Cost:" + j2 + "ms... start at " + va43.f185868f + "\n " + va43.f185867e + 10);
                        }
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("end at ");
                    arrayList = C58704c5.f168045b;
                    va4 va46 = (va4) C110818d0.m150925W(arrayList);
                    if (va46 != null) {
                        l = Long.valueOf(va46.f185868f);
                    }
                    sb5.append(l);
                    sb.append(sb5.toString());
                    String sb6 = sb.toString();
                    C87412m.m108593f(sb6, "flowData.toString()");
                    C58704c5.f168046c = sb6;
                    Log.m105924i("Finder.LiveAnchorFlowStats", String.valueOf(sb));
                }
            }
        }
        C58704c5 c5Var = C58704c5.f168044a;
        arrayList.clear();
    }
}
