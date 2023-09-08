package jq2;

import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.LivingDescBarLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import ps2.C100880k;
import ps2.C100891r;

/* renamed from: jq2.s */
public class C60892s implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f173470a;

    /* renamed from: b */
    public final /* synthetic */ String f173471b;

    /* renamed from: c */
    public final /* synthetic */ C60893t f173472c;

    public C60892s(C60893t tVar, WeakReference weakReference, String str) {
        this.f173472c = tVar;
        this.f173470a = weakReference;
        this.f173471b = str;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
        LivingDescBarLayout livingDescBarLayout = (LivingDescBarLayout) this.f173470a.get();
        if (livingDescBarLayout == null) {
            Log.m105928w("SnsAdRollHelper", "realBar released");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
            return;
        }
        livingDescBarLayout.setTag(C0966R.C0970id.joh, "");
        SnsMethodCalculate.markStartTimeMs("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        ImageView imageView = livingDescBarLayout.f164310d;
        if (imageView != null) {
            imageView.setImageResource(C0966R.raw.ad_living_description_icon);
        }
        SnsMethodCalculate.markEndTimeMs("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        Log.m105920e("SnsAdRollHelper", "onDownloadError, hash = " + livingDescBarLayout.hashCode() + ", url = " + this.f173471b);
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
        try {
            LivingDescBarLayout livingDescBarLayout = (LivingDescBarLayout) this.f173470a.get();
            if (livingDescBarLayout == null) {
                Log.m105928w("SnsAdRollHelper", "realBar released");
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
                return;
            }
            String str2 = (String) livingDescBarLayout.getTag(C0966R.C0970id.joh);
            String l = Util.isNullOrNil(str2) ? "" : C100891r.m132217l("adId_mm", str2);
            if (Util.isNullOrNil(str) || !str.equals(l)) {
                Log.m105918d("SnsAdRollHelper", "onDownloaded, url changed");
            } else {
                C60893t tVar = this.f173472c;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
                tVar.mo85786c(str, livingDescBarLayout);
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
        } catch (Throwable th) {
            Log.m105920e("SnsAdRollHelper", "onDownloaded, exp = " + th.toString());
        }
    }
}
