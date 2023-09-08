package vp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import br2.C92297b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import io2.C98770a;
import io2.C98771b;
import qo3.C77407n;
import qo3.C89779i0;
import rq2.C63505q;

/* renamed from: vp2.d */
public final class C102228d implements C98771b.C98772a {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f301016a;

    /* renamed from: b */
    public final /* synthetic */ C102229e f301017b;

    /* renamed from: c */
    public final /* synthetic */ String f301018c;

    /* renamed from: d */
    public final /* synthetic */ String f301019d;

    /* renamed from: e */
    public final /* synthetic */ Context f301020e;

    /* renamed from: f */
    public final /* synthetic */ int f301021f;

    /* renamed from: g */
    public final /* synthetic */ SnsInfo f301022g;

    /* renamed from: h */
    public final /* synthetic */ AdClickActionInfo f301023h;

    /* renamed from: i */
    public final /* synthetic */ String f301024i;

    public C102228d(C89779i0 i0Var, C102229e eVar, String str, String str2, Context context, int i, SnsInfo snsInfo, AdClickActionInfo adClickActionInfo, String str3) {
        this.f301016a = i0Var;
        this.f301017b = eVar;
        this.f301018c = str;
        this.f301019d = str2;
        this.f301020e = context;
        this.f301021f = i;
        this.f301022g = snsInfo;
        this.f301023h = adClickActionInfo;
        this.f301024i = str3;
    }

    /* renamed from: a */
    public void mo130218a(String str, int i, int i2, Object obj) {
        String str2;
        int i3;
        String str3 = str;
        int i4 = i2;
        SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1");
        C89779i0 i0Var = this.f301016a;
        if (i0Var != null && i0Var.isShowing()) {
            this.f301016a.dismiss();
        }
        C102229e eVar = this.f301017b;
        SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        eVar.getClass();
        SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        Log.m105924i("AdFinderLiveNoticeClick2", "outSnsId is " + this.f301018c + ", snsId is " + str3 + ", finderUsername is " + this.f301019d + ", actionType is " + i + ", errorCode is " + i4);
        if (i4 == 0) {
            C94762a.m120038g(str3, 513);
            C92297b bVar = new C92297b(this.f301020e);
            int i5 = this.f301021f;
            SnsInfo snsInfo = this.f301022g;
            AdClickActionInfo adClickActionInfo = this.f301023h;
            SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
            if (str3 == null) {
                SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
            } else if (adClickActionInfo == null) {
                SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
            } else if (snsInfo == null) {
                SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
            } else {
                bVar.f264117i = adClickActionInfo;
                bVar.f264116h = snsInfo;
                bVar.f264118j = i5;
                bVar.f264119n = str3;
                if (i5 == 0) {
                    str2 = "onResult";
                    i3 = 1;
                } else {
                    str2 = "onResult";
                    i3 = 2;
                }
                bVar.f264124s = new SnsAdClick(i5, i3, snsInfo.field_snsId, 41, 41);
                if (bVar.f264114f == null) {
                    Log.m105924i(bVar.f264113e, "init finder notice success bottomSheet");
                    SnsMethodCalculate.markStartTimeMs("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                    SnsMethodCalculate.markStartTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                    String str4 = null;
                    View inflate = LayoutInflater.from(bVar.f264112d).inflate(C0966R.C0971layout.d2u, (ViewGroup) null);
                    C87412m.m108593f(inflate, "from(context).inflate(R.…ice_success_layout, null)");
                    bVar.f264115g = inflate;
                    bVar.f264120o = (TextView) inflate.findViewById(C0966R.C0970id.nok);
                    bVar.f264121p = (TextView) inflate.findViewById(C0966R.C0970id.nml);
                    bVar.f264122q = (TextView) inflate.findViewById(C0966R.C0970id.l0e);
                    bVar.f264123r = (TextView) inflate.findViewById(C0966R.C0970id.c9b);
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.nmk);
                    View findViewById = inflate.findViewById(C0966R.C0970id.be4);
                    C87412m.m108593f(findViewById, "root.findViewById(R.id.close)");
                    findViewById.setOnClickListener(bVar);
                    Button button = (Button) inflate.findViewById(C0966R.C0970id.noj);
                    if (button != null) {
                        button.setOnClickListener(bVar);
                    }
                    TextView textView2 = bVar.f264120o;
                    C85875k4.m106189j0(textView2 != null ? textView2.getPaint() : null, 0.8f);
                    TextView textView3 = bVar.f264121p;
                    C85875k4.m106189j0(textView3 != null ? textView3.getPaint() : null, 0.8f);
                    TextView textView4 = bVar.f264122q;
                    C85875k4.m106189j0(textView4 != null ? textView4.getPaint() : null, 0.8f);
                    TextView textView5 = bVar.f264123r;
                    C85875k4.m106189j0(textView5 != null ? textView5.getPaint() : null, 0.8f);
                    SnsMethodCalculate.markEndTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                    C77407n nVar = new C77407n(bVar.f264112d, true, 0);
                    bVar.f264114f = nVar;
                    nVar.mo107569n(bVar.f264115g, true);
                    C77407n nVar2 = bVar.f264114f;
                    if (nVar2 != null) {
                        nVar2.mo107559d(true);
                    }
                    C77407n nVar3 = bVar.f264114f;
                    if (nVar3 != null) {
                        nVar3.f225776l1 = true;
                    }
                    SnsMethodCalculate.markEndTimeMs("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                    SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                    TextView textView6 = bVar.f264121p;
                    if (textView6 != null) {
                        AdClickActionInfo adClickActionInfo2 = bVar.f264117i;
                        if (adClickActionInfo2 != null) {
                            str4 = adClickActionInfo2.f273625M;
                        }
                        textView6.setText(str4);
                    }
                    SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                }
                C77407n nVar4 = bVar.f264114f;
                if (nVar4 != null && !nVar4.mo107563h()) {
                    String str5 = bVar.f264113e;
                    Log.m105924i(str5, "show finder notice success bottomSheet, snsId is " + bVar.f264119n + ", mSource is " + bVar.f264118j);
                    C77407n nVar5 = bVar.f264114f;
                    if (nVar5 != null) {
                        nVar5.mo107573q();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
            }
            str2 = "onResult";
        } else {
            str2 = "onResult";
            C98771b.m128553b(this.f301020e, i4);
        }
        C102229e eVar2 = this.f301017b;
        int i6 = this.f301021f;
        SnsInfo snsInfo2 = this.f301022g;
        String str6 = this.f301019d;
        C87412m.m108593f(str6, "finderUsername");
        String str7 = this.f301024i;
        C87412m.m108593f(str7, "finderLiveNoticeId");
        SnsMethodCalculate.markStartTimeMs("access$reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        eVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        String str8 = snsInfo2.getAdXml().adExtInfo;
        String str9 = snsInfo2.getAdInfo(i6).uxInfo;
        C98770a aVar = new C98770a();
        aVar.mo138150c(str, str9, str8, str6, str7, i2, 3);
        C63505q.m74843b(aVar);
        SnsMethodCalculate.markEndTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        SnsMethodCalculate.markEndTimeMs("access$reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1");
    }
}
