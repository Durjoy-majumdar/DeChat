package lo2;

import android.content.Context;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ps2.C100880k;
import ps2.C100891r;
import qs2.C101287r;

/* renamed from: lo2.c0 */
public class C61318c0 implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ Button f174436a;

    /* renamed from: b */
    public final /* synthetic */ String f174437b;

    /* renamed from: c */
    public final /* synthetic */ Context f174438c;

    /* renamed from: d */
    public final /* synthetic */ C101287r f174439d;

    public C61318c0(Button button, String str, Context context, C101287r rVar) {
        this.f174436a = button;
        this.f174437b = str;
        this.f174438c = context;
        this.f174439d = rVar;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
        this.f174436a.setTag(C0966R.C0970id.joh, "");
        Log.m105920e("BtnIconUpdateHelper", "onDownloadError, hash = " + this.f174436a.hashCode() + ", url = " + this.f174437b);
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
        try {
            String str2 = (String) this.f174436a.getTag(C0966R.C0970id.joh);
            String l = Util.isNullOrNil(str2) ? "" : C100891r.m132217l("adId", str2);
            if (Util.isNullOrNil(str) || !str.equals(l)) {
                Log.m105918d("BtnIconUpdateHelper", "onDownloaded, url changed");
            } else {
                Context context = this.f174438c;
                C101287r rVar = this.f174439d;
                Button button = this.f174436a;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                C99525b0.m129880c(context, rVar, button, str);
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                Log.m105918d("BtnIconUpdateHelper", "onDownloaded succ, hash = " + this.f174436a.hashCode());
            }
        } catch (Throwable th) {
            Log.m105920e("BtnIconUpdateHelper", "onDownloaded, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
    }
}
