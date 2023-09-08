package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import ht1.C98522w3;
import ke3.C88144b;
import lc3.C10485b;
import p214om.C11502f;
import qe3.C89625d;
import te3.m74;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$n */
public class n8$$n implements C98522w3.C8812d {

    /* renamed from: a */
    public final /* synthetic */ m74 f280618a;

    /* renamed from: b */
    public final /* synthetic */ Intent f280619b;

    /* renamed from: c */
    public final /* synthetic */ Context f280620c;

    /* renamed from: d */
    public final /* synthetic */ TimeLineObject f280621d;

    public n8$$n(m74 m74, Intent intent, Context context, TimeLineObject timeLineObject) {
        this.f280618a = m74;
        this.f280619b = intent;
        this.f280620c = context;
        this.f280621d = timeLineObject;
    }

    /* renamed from: a */
    public void mo9639a(C98522w3.C8811b bVar) {
        SnsMethodCalculate.markStartTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$1");
        if (!(bVar == C98522w3.C8811b.FINDER_POI_REDIRECT_TYPE_DEFAULT ? !Util.isNullOrNil(this.f280618a.f184224i) : bVar != C98522w3.C8811b.FINDER_POI_REDIRECT_TYPE_MAP)) {
            this.f280619b.putExtra("map_view_type", 7);
            this.f280619b.putExtra("kwebmap_slat", (double) this.f280618a.f184220e);
            this.f280619b.putExtra("kwebmap_lng", (double) this.f280618a.f184219d);
            this.f280619b.putExtra("kPoiName", this.f280618a.f184222g);
            this.f280619b.putExtra("Kwebmap_locaion", this.f280618a.f184223h);
            C88144b.m109791i(this.f280620c, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", this.f280619b, (Bundle) null);
        } else {
            this.f280619b.putExtra("rawUrl", Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SnsPOICommentFeedNewUrlSwitch"), 0) == 0 ? String.format(C89625d.f257847m, new Object[]{this.f280618a.f184224i}) : String.format(C89625d.f257848n, new Object[]{this.f280618a.f184224i, this.f280621d.f283893Id}));
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(this.f280619b, this.f280620c);
        }
        SnsMethodCalculate.markEndTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$1");
    }
}
