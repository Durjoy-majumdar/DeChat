package co2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import ps2.C100880k;
import ps2.C118127b0;
import rq2.C63489a;
import zt3.C119157j;

/* renamed from: co2.f */
public class C92429f {
    @C118127b0(resType = 1)

    /* renamed from: a */
    public String f264494a;

    /* renamed from: b */
    public int f264495b;

    /* renamed from: c */
    public int f264496c;

    /* renamed from: d */
    public Rect f264497d;

    /* renamed from: e */
    public Rect f264498e;

    /* renamed from: f */
    public Rect f264499f;

    /* renamed from: g */
    public Rect f264500g;

    /* renamed from: h */
    public Bitmap f264501h;

    /* renamed from: i */
    public boolean f264502i = false;

    /* renamed from: co2.f$a */
    public class C92430a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f264503d;

        public C92430a(String str) {
            this.f264503d = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$1");
            C92429f fVar = C92429f.this;
            Bitmap decodeFile = BitmapUtil.decodeFile(this.f264503d, (BitmapFactory.Options) null);
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            fVar.f264501h = decodeFile;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$1");
        }
    }

    /* renamed from: co2.f$b */
    public class C92431b implements C100880k.C100881a {

        /* renamed from: co2.f$b$a */
        public class C92432a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f264506d;

            public C92432a(String str) {
                this.f264506d = str;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2$1");
                C92429f fVar = C92429f.this;
                Bitmap decodeFile = BitmapUtil.decodeFile(this.f264506d, (BitmapFactory.Options) null);
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                fVar.f264501h = decodeFile;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2$1");
            }
        }

        public C92431b() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
            C92429f fVar = C92429f.this;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            fVar.f264502i = false;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            Log.m105928w("AdDragInfo", "onDownloadError, url=" + C92429f.this.f264494a);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
            C92429f fVar = C92429f.this;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            fVar.f264502i = false;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            Log.m105924i("AdDragInfo", "onDownloaded, url=" + C92429f.this.f264494a);
            ((C119157j) C119157j.f356862d).mo183875f(new C92432a(str));
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
        }
    }

    /* renamed from: a */
    public static Rect m116257a(Rect rect, int i, Point point) {
        SnsMethodCalculate.markStartTimeMs("calcRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        Rect rect2 = new Rect();
        rect2.left = m116258c((float) rect.left, i) + point.x;
        rect2.top = m116258c((float) rect.top, i) + point.y;
        rect2.right = m116258c((float) rect.right, i) + point.x;
        rect2.bottom = m116258c((float) rect.bottom, i) + point.y;
        SnsMethodCalculate.markEndTimeMs("calcRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return rect2;
    }

    /* renamed from: c */
    public static int m116258c(float f, int i) {
        SnsMethodCalculate.markStartTimeMs("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        float f2 = (f * ((float) i)) / 1280.0f;
        SnsMethodCalculate.markStartTimeMs("safeParseIntPxFromFloat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        int i2 = (int) f2;
        if (((double) (f2 - ((float) i2))) > 0.001d) {
            i2++;
        }
        SnsMethodCalculate.markEndTimeMs("safeParseIntPxFromFloat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        SnsMethodCalculate.markEndTimeMs("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return i2;
    }

    /* renamed from: d */
    public static Rect m116259d(String str) {
        SnsMethodCalculate.markStartTimeMs("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            return null;
        }
        try {
            String[] split = str.split("\\|");
            if (split != null && split.length >= 4) {
                Rect rect = new Rect();
                rect.left = Integer.parseInt(split[0]);
                rect.top = Integer.parseInt(split[1]);
                rect.right = Integer.parseInt(split[2]);
                rect.bottom = Integer.parseInt(split[3]);
                SnsMethodCalculate.markEndTimeMs("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                return rect;
            }
        } catch (Exception e) {
            Log.m105920e("AdDragInfo", "parseRect, exp=" + e.toString() + ", data=" + str);
        }
        SnsMethodCalculate.markEndTimeMs("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return null;
    }

    /* renamed from: b */
    public Bitmap mo126431b() {
        SnsMethodCalculate.markStartTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        if (TextUtils.isEmpty(this.f264494a)) {
            SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            return null;
        }
        Bitmap bitmap = this.f264501h;
        if (bitmap != null) {
            SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            return bitmap;
        }
        String d = C63489a.m74829d(this.f264494a);
        if (TextUtils.isEmpty(d) || !C86013q1.m106450k(d)) {
            Log.m105924i("AdDragInfo", "no cache, try download, hash=" + hashCode() + ", isDownloading=" + this.f264502i + ", url=" + this.f264494a);
            if (!this.f264502i) {
                this.f264502i = true;
                C63489a.m74828c(this.f264494a, new C92431b());
            }
        } else {
            Log.m105924i("AdDragInfo", "hit local cache, hash=" + hashCode());
            ((C119157j) C119157j.f356862d).mo183875f(new C92430a(d));
        }
        Bitmap bitmap2 = this.f264501h;
        SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return bitmap2;
    }
}
