package lq2;

import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ps2.C100880k;
import ps2.C100891r;

/* renamed from: lq2.e */
public class C61379e implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ ImageView f174582a;

    /* renamed from: b */
    public final /* synthetic */ String f174583b;

    /* renamed from: c */
    public final /* synthetic */ C99586f f174584c;

    public C61379e(C99586f fVar, ImageView imageView, String str) {
        this.f174584c = fVar;
        this.f174582a = imageView;
        this.f174583b = str;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$1");
        this.f174582a.setTag(C0966R.C0970id.joh, "");
        Log.m105920e("SnsAd.SlideFullCardRecyclerViewAdapter", "onDownloadError, hash = " + this.f174582a.hashCode() + ", url = " + this.f174583b);
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$1");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$1");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$1");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$1");
        try {
            String str2 = (String) this.f174582a.getTag(C0966R.C0970id.joh);
            String l = Util.isNullOrNil(str2) ? "" : C100891r.m132217l("adId", str2);
            if (Util.isNullOrNil(str) || !str.equals(l)) {
                Log.m105918d("SnsAd.SlideFullCardRecyclerViewAdapter", "onDownloaded, url changed");
            } else {
                C99586f fVar = this.f174584c;
                ImageView imageView = this.f174582a;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                fVar.mo138961w5(imageView, str);
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                Log.m105918d("SnsAd.SlideFullCardRecyclerViewAdapter", "onDownloaded succ, hash = " + this.f174582a.hashCode());
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAd.SlideFullCardRecyclerViewAdapter", "onDownloaded, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$1");
    }
}
