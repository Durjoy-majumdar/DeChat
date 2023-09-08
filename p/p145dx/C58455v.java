package p145dx;

import java.util.List;
import pj2.C62323d;

/* renamed from: dx.v */
public interface C58455v {

    /* renamed from: dx.v$a */
    public static final class C58456a {
        /* renamed from: a */
        public static /* synthetic */ void m67861a(C58455v vVar, long j, int i, C62323d dVar, long j2, int i2, Object obj) {
            if (obj == null) {
                int i3 = (i2 & 2) != 0 ? 0 : i;
                if ((i2 & 4) != 0) {
                    dVar = null;
                }
                C62323d dVar2 = dVar;
                if ((i2 & 8) != 0) {
                    j2 = 0;
                }
                vVar.mo75841s1(j, i3, dVar2, j2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doReportRingtoneRecommend");
        }
    }

    /* renamed from: K0 */
    void mo75839K0(List<? extends C62323d> list);

    /* renamed from: g1 */
    void mo75840g1(String str);

    /* renamed from: s1 */
    void mo75841s1(long j, int i, C62323d dVar, long j2);

    /* renamed from: x1 */
    void mo75842x1(int i);
}
