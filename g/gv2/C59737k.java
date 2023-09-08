package gv2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;
import ps2.C100891r;

/* renamed from: gv2.k */
public class C59737k implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ WeImageView f170630a;

    /* renamed from: b */
    public final /* synthetic */ String f170631b;

    /* renamed from: c */
    public final /* synthetic */ TextView f170632c;

    public C59737k(WeImageView weImageView, String str, TextView textView) {
        this.f170630a = weImageView;
        this.f170631b = str;
        this.f170632c = textView;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
        this.f170630a.setTag(C0966R.C0970id.joh, "");
        this.f170630a.setVisibility(8);
        Log.m105920e("SnsCardAdTagUtils", "onDownloadError, hash=" + this.f170630a.hashCode() + ", url=" + this.f170631b);
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
        try {
            String str2 = (String) this.f170630a.getTag(C0966R.C0970id.joh);
            String l = TextUtils.isEmpty(str2) ? "" : C100891r.m132217l("adId", str2);
            if (TextUtils.isEmpty(str) || !str.equals(l)) {
                Log.m105918d("SnsCardAdTagUtils", "onDownloaded, url changed");
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
            }
            Bitmap decodeFile = BitmapUtil.decodeFile(str, (BitmapFactory.Options) null);
            if (decodeFile != null) {
                this.f170630a.setImageBitmap(decodeFile);
                this.f170630a.setVisibility(0);
                TextView textView = this.f170632c;
                if (textView != null && (textView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
                    ((LinearLayout.LayoutParams) this.f170632c.getLayoutParams()).leftMargin = 0;
                }
                Log.m105918d("SnsCardAdTagUtils", "onDownloaded succ, hash=" + this.f170630a.hashCode());
            } else {
                Log.m105920e("SnsCardAdTagUtils", "onDownloaded, bitmap==null");
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
        } catch (Throwable th) {
            Log.m105920e("SnsCardAdTagUtils", "onDownloaded, exp=" + th.toString());
        }
    }
}
