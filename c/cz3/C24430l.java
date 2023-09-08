package cz3;

import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C87412m;
import java.lang.reflect.Member;
import ny3.C109824f;

/* renamed from: cz3.l */
public final /* synthetic */ class C24430l extends C24563k implements C32226l<Member, Boolean> {

    /* renamed from: d */
    public static final C24430l f69881d = new C24430l();

    public C24430l() {
        super(1);
    }

    public final String getName() {
        return "isSynthetic";
    }

    public final C109824f getOwner() {
        return C24560g0.m30725a(Member.class);
    }

    public final String getSignature() {
        return "isSynthetic()Z";
    }

    public Object invoke(Object obj) {
        Member member = (Member) obj;
        C87412m.m108594g(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}
