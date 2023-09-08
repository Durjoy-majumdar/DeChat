package fu2;

import ad0.C91998s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import gu2.C98214b;
import gy3.C87412m;
import ht1.C98522w3;
import java.util.Arrays;
import ke3.C88144b;
import lc3.C10485b;
import p214om.C11502f;
import qe3.C89625d;
import te3.C101802kr2;
import te3.m74;
import vr2.C102236a0;

/* renamed from: fu2.b */
public final class C97995b extends C97987a {

    /* renamed from: fu2.b$a */
    public static final class C97996a implements C98522w3.C8812d {

        /* renamed from: a */
        public final /* synthetic */ m74 f287396a;

        /* renamed from: b */
        public final /* synthetic */ Intent f287397b;

        /* renamed from: c */
        public final /* synthetic */ C97995b f287398c;

        /* renamed from: d */
        public final /* synthetic */ TimeLineObject f287399d;

        public C97996a(m74 m74, Intent intent, C97995b bVar, TimeLineObject timeLineObject) {
            this.f287396a = m74;
            this.f287397b = intent;
            this.f287398c = bVar;
            this.f287399d = timeLineObject;
        }

        /* renamed from: a */
        public void mo9639a(C98522w3.C8811b bVar) {
            String str;
            SnsMethodCalculate.markStartTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick$click$1");
            C87412m.m108594g(bVar, "type");
            if (!(bVar == C98522w3.C8811b.FINDER_POI_REDIRECT_TYPE_DEFAULT ? !Util.isNullOrNil(this.f287396a.f184224i) : bVar != C98522w3.C8811b.FINDER_POI_REDIRECT_TYPE_MAP)) {
                this.f287397b.putExtra("map_view_type", 7);
                this.f287397b.putExtra("kwebmap_slat", (double) this.f287396a.f184220e);
                this.f287397b.putExtra("kwebmap_lng", (double) this.f287396a.f184219d);
                this.f287397b.putExtra("kPoiName", this.f287396a.f184222g);
                this.f287397b.putExtra("Kwebmap_locaion", this.f287396a.f184223h);
                C88144b.m109791i(this.f287398c.mo137309b(), FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", this.f287397b, (Bundle) null);
            } else {
                if (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SnsPOICommentFeedNewUrlSwitch"), 0) == 0) {
                    String str2 = C89625d.f257847m;
                    C87412m.m108593f(str2, "MM_NEAR_LIFE_URI");
                    str = String.format(str2, Arrays.copyOf(new Object[]{this.f287396a.f184224i}, 1));
                    C87412m.m108593f(str, "format(format, *args)");
                } else {
                    String str3 = C89625d.f257848n;
                    C87412m.m108593f(str3, "MM_NEAR_LIFE_URI_DETAIL");
                    str = String.format(str3, Arrays.copyOf(new Object[]{this.f287396a.f184224i, this.f287399d.f283893Id}, 2));
                    C87412m.m108593f(str, "format(format, *args)");
                }
                this.f287397b.putExtra("rawUrl", str);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(this.f287397b, this.f287398c.mo137309b());
            }
            SnsMethodCalculate.markEndTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick$click$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97995b(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick");
        C98214b c = mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick");
            return;
        }
        SnsInfo C2 = c.mo137505C2();
        TimeLineObject timeLine = C2.getTimeLine();
        C87412m.m108593f(timeLine, "snsInfo.timeLine");
        C101802kr2 kr22 = timeLine.Location;
        C91998s.m115550d(724);
        C102236a0.m134728W(C2);
        C2.isAd();
        C2.getUxinfo();
        String str = kr22.f298652i;
        Intent intent = new Intent();
        m74 m74 = new m74();
        m74.f184219d = kr22.f298647d;
        m74.f184220e = kr22.f298648e;
        m74.f184221f = kr22.f298649f;
        m74.f184222g = kr22.f298650g;
        m74.f184223h = kr22.f298651h;
        m74.f184224i = kr22.f298652i;
        m74.f184225j = kr22.f298653j;
        m74.f184226n = kr22.f298654n;
        m74.f184227o = kr22.f298655o;
        m74.f184228p = kr22.f298656p;
        m74.f184229q = kr22.f298657q;
        m74.f184234v = kr22.f298662v;
        ((C98522w3) C86312j.m106911c(C98522w3.class)).mo3994aU(mo137309b(), m74, C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS, 7, timeLine.f283893Id, new C97996a(m74, intent, this, timeLine));
        SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick");
    }
}
