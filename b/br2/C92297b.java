package br2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lo2.C99542h0;
import qo3.C77407n;
import vr2.C102236a0;

/* renamed from: br2.b */
public final class C92297b implements View.OnClickListener {

    /* renamed from: d */
    public final Context f264112d;

    /* renamed from: e */
    public final String f264113e = "AdFinderNoticeSuccessHalfScreenWidget";

    /* renamed from: f */
    public C77407n f264114f;

    /* renamed from: g */
    public View f264115g;

    /* renamed from: h */
    public SnsInfo f264116h;

    /* renamed from: i */
    public AdClickActionInfo f264117i;

    /* renamed from: j */
    public int f264118j;

    /* renamed from: n */
    public String f264119n;

    /* renamed from: o */
    public TextView f264120o;

    /* renamed from: p */
    public TextView f264121p;

    /* renamed from: q */
    public TextView f264122q;

    /* renamed from: r */
    public TextView f264123r;

    /* renamed from: s */
    public SnsAdClick f264124s;

    public C92297b(Context context) {
        C87412m.m108594g(context, "context");
        this.f264112d = context;
    }

    /* renamed from: a */
    public final void mo126284a() {
        C77407n nVar;
        SnsMethodCalculate.markStartTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
        C77407n nVar2 = this.f264114f;
        boolean z = true;
        if (nVar2 == null || !nVar2.mo107563h()) {
            z = false;
        }
        if (z && (nVar = this.f264114f) != null) {
            nVar.mo107572p();
        }
        SnsMethodCalculate.markEndTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
    }

    public void onClick(View view) {
        ADInfo adInfo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/widget/living/AdFinderNoticeSuccessHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
        String str = null;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.be4) {
            mo126284a();
            Log.m105924i(this.f264113e, "click close btn");
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.noj) {
            String str2 = this.f264113e;
            Log.m105924i(str2, "click notice more btn, jump to finder profile UI, snsId is " + this.f264119n + ", mSource is " + this.f264118j);
            mo126284a();
            AdClickActionInfo adClickActionInfo = this.f264117i;
            int nullAsNil = Util.nullAsNil(adClickActionInfo != null ? Integer.valueOf(adClickActionInfo.f273639a) : null);
            Context context = this.f264112d;
            AdClickActionInfo adClickActionInfo2 = this.f264117i;
            String str3 = adClickActionInfo2 != null ? adClickActionInfo2.finderUsername : null;
            SnsInfo snsInfo = this.f264116h;
            if (!(snsInfo == null || (adInfo = snsInfo.getAdInfo(this.f264118j)) == null)) {
                str = adInfo.uxInfo;
            }
            C99542h0.m129909g(context, str3, str, this.f264119n, C99542h0.m129905c(nullAsNil));
            SnsAdClick snsAdClick = this.f264124s;
            if (snsAdClick == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/widget/living/AdFinderNoticeSuccessHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C102236a0.m134773u0(snsAdClick);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/widget/living/AdFinderNoticeSuccessHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
