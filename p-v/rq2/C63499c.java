package rq2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import p823sg.C101611g;
import rq2.C63489a;
import zt3.C119157j;

/* renamed from: rq2.c */
public class C63499c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f180110d;

    /* renamed from: e */
    public final /* synthetic */ String f180111e;

    /* renamed from: f */
    public final /* synthetic */ C63489a.C63493f f180112f;

    /* renamed from: rq2.c$a */
    public class C63500a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f180113d;

        public C63500a(Bitmap bitmap) {
            this.f180113d = bitmap;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$6$1");
            C63499c.this.f180112f.mo67280a(this.f180113d, true);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$6$1");
        }
    }

    public C63499c(String str, String str2, C63489a.C63493f fVar) {
        this.f180110d = str;
        this.f180111e = str2;
        this.f180112f = fVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$6");
        try {
            Bitmap decodeFile = BitmapUtil.decodeFile(this.f180110d, (BitmapFactory.Options) null);
            if (decodeFile == null || decodeFile.isRecycled()) {
                Log.m105928w("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, setImageBitmapAsync bitmap is not exist and imgUrl is " + this.f180111e);
            } else {
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                C101611g<String, Bitmap> gVar = C63489a.f180085a;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                gVar.put(this.f180111e, decodeFile);
                Log.m105924i("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, setImageBitmapAsync bitmap is exist and imgUrl is " + this.f180111e);
                ((C119157j) C119157j.f356862d).mo183895z(new C63500a(decodeFile));
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAd.AdCdnImageLoaderMM", "setImageBitmapAsync decode bitmap, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$6");
    }
}
