package nu2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import br2.C54550e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import jp2.C98963o;
import nq2.C100151a;
import rq2.C101432s;
import te3.C101789j00;
import te3.C101804kv2;

/* renamed from: nu2.h */
public final class C100208h extends C100198b {

    /* renamed from: k */
    public C54550e f293609k;

    /* renamed from: a */
    public void mo139487a(Activity activity, C98963o oVar, TimelineClickListener timelineClickListener, C100151a.C100155d dVar, C100151a aVar) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.mo139487a(activity, oVar, timelineClickListener, dVar, aVar);
        if (this.f293574a == null) {
            SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
            return;
        }
        if (dVar.f293354J == null) {
            View inflate = ((ViewStub) dVar.f293377v.findViewById(C0966R.C0970id.oop)).inflate();
            C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            dVar.f293354J = (AdLivingStreamContainer) inflate;
        } else {
            Log.m105920e("LiveStreamAdBusiness", "buildContent many times");
        }
        this.f293609k = new C54550e(this.f293576c.f293354J);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    /* renamed from: b */
    public void mo139488b() {
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.mo139488b();
        C54550e eVar = this.f293609k;
        if (eVar != null) {
            eVar.mo75427b();
        }
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    /* renamed from: c */
    public void mo139489c() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.mo139489c();
        C54550e eVar = this.f293609k;
        if (eVar != null) {
            eVar.mo75431f();
        }
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    /* renamed from: d */
    public void mo139490d(int i, SnsInfo snsInfo, ADXml.C95018g gVar, ViewGroup.LayoutParams layoutParams) {
        TimeLineObject timeLine;
        C101789j00 j002;
        SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.mo139490d(i, snsInfo, gVar, layoutParams);
        C101804kv2 kv22 = null;
        Integer valueOf = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
        Integer valueOf2 = layoutParams != null ? Integer.valueOf(layoutParams.height) : null;
        if (valueOf == null || valueOf2 == null || valueOf.intValue() <= 0 || valueOf2.intValue() <= 0) {
            Log.m105920e("LiveStreamAdBusiness", "width is " + valueOf + ", height is " + valueOf2);
        } else {
            C101432s.m133131m(this.f293576c.f293354J, valueOf.intValue(), valueOf2.intValue());
        }
        if (((snsInfo == null || (timeLine = snsInfo.getTimeLine()) == null || (j002 = timeLine.ContentObj) == null) ? null : j002.f298427h) != null) {
            LinkedList<C101804kv2> linkedList = snsInfo.getTimeLine().ContentObj.f298427h;
            C87412m.m108591d(linkedList);
            if (linkedList.size() >= 1) {
                LinkedList<C101804kv2> linkedList2 = snsInfo.getTimeLine().ContentObj.f298427h;
                C87412m.m108591d(linkedList2);
                kv22 = linkedList2.get(0);
            }
        }
        C101804kv2 kv23 = kv22;
        this.f293577d.mo139444d(snsInfo);
        C54550e eVar = this.f293609k;
        if (eVar != null) {
            eVar.mo75429d(snsInfo, this.f293576c.f293355K.f293340a, kv23, valueOf, valueOf2);
        }
        SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    /* renamed from: e */
    public void mo139491e() {
        SnsMethodCalculate.markStartTimeMs("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.mo139491e();
        C54550e eVar = this.f293609k;
        if (eVar != null) {
            eVar.mo75434i();
        }
        SnsMethodCalculate.markEndTimeMs("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    /* renamed from: g */
    public void mo139502g(long j, int i) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    public void onVideoPause() {
        SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.onVideoPause();
        C54550e eVar = this.f293609k;
        if (eVar != null) {
            eVar.mo75432g();
        }
        SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }
}
