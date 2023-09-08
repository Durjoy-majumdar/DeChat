package dp1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C87412m;
import java.util.Iterator;
import kf1.C9833k9;
import o40.C61926c;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C64629pl1;
import z04.C112550d0;

/* renamed from: dp1.n1 */
public final class C58394n1 {

    /* renamed from: a */
    public static final C58394n1 f167305a = new C58394n1();

    /* renamed from: a */
    public final void mo83233a(String str, C9833k9 k9Var, int i, long j, C49712hj1 hj12) {
        C9833k9 k9Var2 = k9Var;
        C49712hj1 hj13 = hj12;
        C87412m.m108594g(k9Var, "cardFeed");
        C64629pl1 pl12 = k9Var2.f30387d;
        Iterator<T> it = k9Var2.f30389f.iterator();
        String str2 = "";
        int i2 = 0;
        while (true) {
            String str3 = null;
            if (it.hasNext()) {
                T next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) next;
                    String p = C61926c.m72691p(baseFinderFeed.getItemId());
                    if (baseFinderFeed.mo75c() == 4 && i2 == 0) {
                        str2 = str2 + p + ';' + i2 + ";1|";
                    } else {
                        str2 = str2 + p + ';' + i2 + ";0|";
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            } else {
                C112550d0.m153780P(str2, "|");
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[11];
                objArr[0] = hj13 != null ? Integer.valueOf(hj13.f134675i) : null;
                objArr[1] = C61926c.m72691p(k9Var2.f30387d.f184854u);
                objArr[2] = str;
                objArr[3] = str2;
                objArr[4] = pl12.f184853t;
                objArr[5] = Integer.valueOf(k9Var2.f30389f.size());
                objArr[6] = hj13 != null ? hj13.f134670d : null;
                objArr[7] = hj13 != null ? hj13.f134671e : null;
                if (hj13 != null) {
                    str3 = hj13.f134672f;
                }
                objArr[8] = str3;
                objArr[9] = Long.valueOf(j);
                objArr[10] = Integer.valueOf(i);
                nVar.mo160131h(21086, objArr);
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo83234b(String str, long j, int i, long j2, C49712hj1 hj12, int i2) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[9];
        String str2 = null;
        objArr[0] = hj12 != null ? Integer.valueOf(hj12.f134675i) : null;
        objArr[1] = C61926c.m72691p(j);
        objArr[2] = str;
        objArr[3] = Integer.valueOf(i);
        objArr[4] = C61926c.m72691p(j2);
        objArr[5] = hj12 != null ? hj12.f134670d : null;
        objArr[6] = hj12 != null ? hj12.f134671e : null;
        if (hj12 != null) {
            str2 = hj12.f134672f;
        }
        objArr[7] = str2;
        objArr[8] = Integer.valueOf(i2);
        nVar.mo160131h(21087, objArr);
    }
}
