package os1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import di3.C86312j;
import gy3.C87412m;
import te3.C64586nn1;

/* renamed from: os1.v */
public final class C11758v extends C11748p {
    /* renamed from: c3 */
    public int mo11610c3(int i, String str) {
        C87412m.m108594g(str, "username");
        return super.mo11610c3(i, str);
    }

    /* renamed from: e3 */
    public void mo11611e3(Boolean[] boolArr, String str) {
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(boolArr, "redDotFlags");
        C87412m.m108594g(str, "username");
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("WxMessageLike");
        C64586nn1 R52 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("WxMessageComment");
        boolean z = false;
        boolArr[0] = Boolean.valueOf(R5 != null && R5.f184503e > 0);
        if (R52 != null && R52.f184503e > 0) {
            z = true;
        }
        boolArr[1] = Boolean.valueOf(z);
    }
}
