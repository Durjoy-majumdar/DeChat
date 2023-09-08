package fn3;

import com.tencent.p014mm.autogen.mmdata.rpt.LeftSlideOptionStruct;
import com.tencent.p014mm.storage.C72976h2;
import eb0.C45629t0;
import gy3.C87412m;

/* renamed from: fn3.b */
public final class C45804b {
    /* renamed from: a */
    public static final void m51082a(int i, String str, C72976h2 h2Var) {
        long j;
        C87412m.m108594g(str, "talker");
        LeftSlideOptionStruct leftSlideOptionStruct = new LeftSlideOptionStruct();
        if (i == 1) {
            j = 12;
        } else if (i == 2) {
            j = 15;
        } else if (i == 3) {
            j = 16;
        } else if (i == 4) {
            j = 17;
        } else {
            return;
        }
        leftSlideOptionStruct.f107964d = j;
        leftSlideOptionStruct.f107965e = leftSlideOptionStruct.mo86045b("SessionName", str, true);
        leftSlideOptionStruct.f107967g = (long) C45629t0.m50816c(str);
        leftSlideOptionStruct.f107966f = h2Var != null ? (long) h2Var.mo108786G2() : 0;
        leftSlideOptionStruct.mo86054n();
        if (i == 1) {
            int G2 = h2Var != null ? h2Var.mo108786G2() : 0;
            LeftSlideOptionStruct leftSlideOptionStruct2 = new LeftSlideOptionStruct();
            leftSlideOptionStruct2.f107964d = 1;
            leftSlideOptionStruct2.f107965e = leftSlideOptionStruct2.mo86045b("SessionName", str, true);
            leftSlideOptionStruct2.f107967g = (long) C45629t0.m50816c(str);
            leftSlideOptionStruct2.f107966f = (long) G2;
            leftSlideOptionStruct2.mo86054n();
        }
    }
}
