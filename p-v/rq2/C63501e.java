package rq2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;
import ps2.C100891r;

/* renamed from: rq2.e */
public class C63501e implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ ImageView f180115a;

    /* renamed from: b */
    public final /* synthetic */ String f180116b;

    public C63501e(ImageView imageView, String str) {
        this.f180115a = imageView;
        this.f180116b = str;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
        this.f180115a.setTag(C0966R.C0970id.joh, "");
        Log.m105920e("SnsAd.AdImageLoader", "onDownloadError, hash=" + this.f180115a.hashCode() + ", url=" + this.f180116b);
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
        try {
            String str2 = (String) this.f180115a.getTag(C0966R.C0970id.joh);
            String l = TextUtils.isEmpty(str2) ? "" : C100891r.m132217l("adId", str2);
            if (TextUtils.isEmpty(str) || !str.equals(l)) {
                Log.m105918d("SnsAd.AdImageLoader", "onDownloaded, url changed");
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
            }
            Bitmap decodeFile = BitmapUtil.decodeFile(str, (BitmapFactory.Options) null);
            if (decodeFile != null) {
                this.f180115a.setImageBitmap(decodeFile);
                Log.m105918d("SnsAd.AdImageLoader", "onDownloaded succ, hash=" + this.f180115a.hashCode());
            } else {
                Log.m105920e("SnsAd.AdImageLoader", "onDownloaded, bitmap==null");
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
        } catch (Throwable th) {
            Log.m105920e("SnsAd.AdImageLoader", "onDownloaded, exp=" + th.toString());
        }
    }
}
