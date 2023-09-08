package rq2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import p823sg.C101611g;
import zt3.C119157j;

/* renamed from: rq2.b */
public class C63497b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f180105d;

    /* renamed from: e */
    public final /* synthetic */ String f180106e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f180107f;

    /* renamed from: rq2.b$a */
    public class C63498a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f180108d;

        public C63498a(Bitmap bitmap) {
            this.f180108d = bitmap;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$2$1");
            try {
                C63497b.this.f180107f.setImageBitmap(this.f180108d);
            } catch (Throwable th) {
                Log.m105920e("SnsAd.AdCdnImageLoaderMM", "setImageBitmapAsync set bitmap, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$2$1");
        }
    }

    public C63497b(String str, String str2, ImageView imageView) {
        this.f180105d = str;
        this.f180106e = str2;
        this.f180107f = imageView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$2");
        try {
            Bitmap decodeFile = BitmapUtil.decodeFile(this.f180105d, (BitmapFactory.Options) null);
            if (decodeFile != null && !decodeFile.isRecycled()) {
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                C101611g<String, Bitmap> gVar = C63489a.f180085a;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                gVar.put(this.f180106e, decodeFile);
                ((C119157j) C119157j.f356862d).mo183895z(new C63498a(decodeFile));
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAd.AdCdnImageLoaderMM", "setImageBitmapAsync decode bitmap, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$2");
    }
}
