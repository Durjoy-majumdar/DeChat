package dp1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderSnsPostStruct;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;

/* renamed from: dp1.k1 */
public final class C58380k1 {

    /* renamed from: a */
    public static final C58380k1 f167276a = new C58380k1();

    /* renamed from: b */
    public static String f167277b;

    /* renamed from: a */
    public static void m67708a(C58380k1 k1Var, String str, int i, String str2, boolean z, boolean z2, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        if ((i2 & 16) != 0) {
            z2 = true;
        }
        long j2 = 0;
        if ((i2 & 32) != 0) {
            j = 0;
        }
        k1Var.getClass();
        Class cls = C58417y0.class;
        C87412m.m108594g(str, "sessionID");
        C87412m.m108594g(str2, "wording");
        FinderSnsPostStruct finderSnsPostStruct = new FinderSnsPostStruct();
        String str3 = f167277b;
        if (str3 != null) {
            str = str3;
        }
        finderSnsPostStruct.f156063d = finderSnsPostStruct.mo86045b("SessinId", str, true);
        f167277b = null;
        finderSnsPostStruct.f156064e = (long) i;
        finderSnsPostStruct.f156065f = C31543z5.m39453c();
        finderSnsPostStruct.f156068i = finderSnsPostStruct.mo86045b("FinderFeedId", ((C58417y0) C86312j.m106911c(cls)).xx0(j), true);
        finderSnsPostStruct.f156069j = z ? 1 : 0;
        if (z2) {
            j2 = 1;
        }
        finderSnsPostStruct.f156070k = j2;
        finderSnsPostStruct.f156071l = finderSnsPostStruct.mo86045b("Wording", str2, true);
        finderSnsPostStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(cls)).Ec0(finderSnsPostStruct);
    }
}
