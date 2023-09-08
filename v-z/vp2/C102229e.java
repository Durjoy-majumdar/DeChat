package vp2;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import io2.C98771b;
import lo2.C99542h0;
import nj3.C76879j;
import qo3.C89779i0;
import rq2.C101431r;
import t91.C64208c;
import tp2.C101914d;
import up2.C102060a;
import vr2.C102236a0;

/* renamed from: vp2.e */
public final class C102229e extends C102060a {
    public C102229e(AdClickActionInfo adClickActionInfo) {
        this.f300548a = adClickActionInfo;
    }

    /* renamed from: c */
    public boolean mo73731c(View view, int i, SnsInfo snsInfo, AdClickActionInfo adClickActionInfo, C101914d dVar) {
        C89779i0 i0Var;
        SnsInfo snsInfo2 = snsInfo;
        AdClickActionInfo adClickActionInfo2 = adClickActionInfo;
        C101914d dVar2 = dVar;
        SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            return false;
        } else if (snsInfo2 == null) {
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            return false;
        } else if (adClickActionInfo2 == null) {
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            return false;
        } else {
            Context context = view.getContext();
            if (context == null) {
                SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                return false;
            }
            String nullAsNil = Util.nullAsNil(adClickActionInfo2.finderUsername);
            String nullAsNil2 = Util.nullAsNil(adClickActionInfo2.f273622J);
            int c = C99542h0.m129905c(adClickActionInfo2.f273639a);
            String W = C102236a0.m134728W(snsInfo);
            int c2 = C94762a.m120036c(W, 1);
            String str = snsInfo2.getAdInfo(i).uxInfo;
            Log.m105924i("AdFinderLiveNoticeClick2", "finderLivingNoticeStatus is " + c2 + ", finderUsername is " + nullAsNil + ", finderLiveNoticeId is " + nullAsNil2 + ", snsIdStr is " + W + ", scene is " + c + ", uxInfo is " + str);
            SnsAdClick snsAdClick = dVar2 != null ? (SnsAdClick) dVar2.mo141403a("snsAdClick", null) : null;
            if (c2 == 513) {
                C101431r.m133118a(snsAdClick, 41);
                boolean g = C99542h0.m129909g(context, nullAsNil, str, W, c);
                SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                return g;
            }
            C101431r.m133118a(snsAdClick, 43);
            C64208c.f181951a.mo89032g(C99542h0.m129912j(str, W, c), nullAsNil);
            SnsMethodCalculate.markStartTimeMs("doNoticeLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            SnsMethodCalculate.markStartTimeMs("showProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            if (context instanceof Activity) {
                i0Var = C76879j.m92723Q(context, "", context.getString(C0966R.string.gap), true, true, (DialogInterface.OnCancelListener) null);
                SnsMethodCalculate.markEndTimeMs("showProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            } else {
                SnsMethodCalculate.markEndTimeMs("showProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                i0Var = null;
            }
            String W2 = C102236a0.m134728W(snsInfo);
            String nullAsNil3 = Util.nullAsNil(adClickActionInfo2.finderUsername);
            String nullAsNil4 = Util.nullAsNil(adClickActionInfo2.f273622J);
            C98771b.m128556e(W2, nullAsNil3, nullAsNil4, new C102228d(i0Var, this, W2, nullAsNil3, context, i, snsInfo, adClickActionInfo, nullAsNil4));
            SnsMethodCalculate.markEndTimeMs("doNoticeLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            return true;
        }
    }
}
