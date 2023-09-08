package so2;

import co2.C92435h;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.List;
import ps2.C118127b0;
import qs2.C101255a0;

/* renamed from: so2.d */
public class C101668d extends C101255a0 {
    @C118127b0(resType = 7)

    /* renamed from: A */
    public C92435h.C92441e f297601A;
    @C118127b0(resType = 7)

    /* renamed from: B */
    public C92435h.C92436a f297602B;

    /* renamed from: C */
    public C101669a f297603C;

    /* renamed from: z */
    public List<C101255a0> f297604z = new ArrayList();

    /* renamed from: so2.d$a */
    public static class C101669a {

        /* renamed from: a */
        public int f297605a;

        /* renamed from: b */
        public String f297606b;

        /* renamed from: c */
        public String f297607c;

        /* renamed from: d */
        public int f297608d;

        /* renamed from: e */
        public int f297609e;
    }

    /* renamed from: a */
    public List<C101255a0> mo140732a() {
        SnsMethodCalculate.markStartTimeMs("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingEggCardContainerInfo");
        List<C101255a0> list = this.f297604z;
        SnsMethodCalculate.markEndTimeMs("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingEggCardContainerInfo");
        return list;
    }
}
