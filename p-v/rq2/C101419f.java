package rq2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;
import ps2.C100891r;
import vr2.C102260r;
import zq2.C103063b;
import zt3.C119157j;

/* renamed from: rq2.f */
public class C101419f {

    /* renamed from: rq2.f$a */
    public class C101420a implements C100880k.C100881a {

        /* renamed from: a */
        public boolean f297060a = false;

        /* renamed from: b */
        public final /* synthetic */ int f297061b;

        /* renamed from: c */
        public final /* synthetic */ ImageView f297062c;

        /* renamed from: d */
        public final /* synthetic */ String f297063d;

        public C101420a(int i, ImageView imageView, String str) {
            this.f297061b = i;
            this.f297062c = imageView;
            this.f297063d = str;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
            try {
                C102260r.m134852U(this.f297061b, 1);
                this.f297062c.setTag(C0966R.C0970id.joh, "");
                this.f297062c.setImageDrawable((Drawable) null);
            } catch (Throwable unused) {
            }
            Log.m105920e("SnsAd.AdImageLoader", "onDownloadError, hash=" + this.f297062c.hashCode() + ", url=" + this.f297063d);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
            this.f297060a = true;
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
            C101419f.m133078a(this.f297062c, str, 0.0f);
            try {
                if (this.f297060a) {
                    C102260r.m134852U(this.f297061b, 0);
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
        }
    }

    /* renamed from: rq2.f$b */
    public class C101421b implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ ImageView f297064a;

        /* renamed from: b */
        public final /* synthetic */ String f297065b;

        /* renamed from: c */
        public final /* synthetic */ float f297066c;

        public C101421b(ImageView imageView, String str, float f) {
            this.f297064a = imageView;
            this.f297065b = str;
            this.f297066c = f;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
            this.f297064a.setTag(C0966R.C0970id.joh, "");
            Log.m105920e("SnsAd.AdImageLoader", "onDownloadError, hash=" + this.f297064a.hashCode() + ", url=" + this.f297065b);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
            try {
                Log.m105918d("SnsAd.AdImageLoader", "loadImageByCdn, succ, hash=" + this.f297064a.hashCode() + ", url=" + this.f297065b);
                C101419f.m133078a(this.f297064a, str, this.f297066c);
            } catch (Throwable th) {
                Log.m105920e("SnsAd.AdImageLoader", "loadImageByCdn, onDownloaded, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
        }
    }

    /* renamed from: a */
    public static void m133078a(ImageView imageView, String str, float f) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        SnsMethodCalculate.markStartTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (imageView != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) imageView.getTag(C0966R.C0970id.joh);
                    if (!str.equals(TextUtils.isEmpty(str2) ? "" : C100891r.m132217l("adId", str2))) {
                        Log.m105928w("SnsAd.AdImageLoader", "the input file path is not same as the tag file path");
                        SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    }
                    ((C119157j) C119157j.f356862d).mo183875f(new C63502g(imageView.getWidth(), imageView.getHeight(), str, f, imageView));
                    SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                }
            } catch (Throwable th) {
                Log.m105920e("SnsAd.AdImageLoader", "setImageBitmapAsync, exp=" + th.toString());
            }
        }
        Log.m105928w("SnsAd.AdImageLoader", "are you sure the input param is valid?");
        SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    /* renamed from: b */
    public static void m133079b(C103063b bVar, String str, float f) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        SnsMethodCalculate.markStartTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (bVar != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    SnsMethodCalculate.markStartTimeMs("getWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                    float f2 = bVar.f304074d;
                    SnsMethodCalculate.markEndTimeMs("getWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                    int i = (int) f2;
                    SnsMethodCalculate.markStartTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                    float f3 = bVar.f304075e;
                    SnsMethodCalculate.markEndTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                    ((C119157j) C119157j.f356862d).mo183875f(new C101423i(i, (int) f3, str, f, bVar));
                    SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                }
            } catch (Throwable th) {
                Log.m105920e("SnsAd.AdImageLoader", "setImageBitmapAsync, exp=" + th.toString());
            }
        }
        Log.m105928w("SnsAd.AdImageLoader", "are you sure the input param is valid?");
        SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    /* renamed from: c */
    public static void m133080c(String str, ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (!str.equals((String) imageView.getTag(C0966R.C0970id.joh))) {
            imageView.setImageDrawable((Drawable) null);
            SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            if (TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            } else {
                Log.m105918d("SnsAd.AdImageLoader", "loadImage, hash=" + imageView.hashCode() + ", url=" + str);
                imageView.setTag(C0966R.C0970id.joh, str);
                C100891r.m132206a(str, false, 41, 0, new C63501e(imageView, str));
                SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    /* renamed from: d */
    public static void m133081d(String str, ImageView imageView, int i) {
        SnsMethodCalculate.markStartTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (imageView == null || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return;
        }
        try {
            if (!str.equals((String) imageView.getTag(C0966R.C0970id.joh))) {
                m133085h(str, imageView, i);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    /* renamed from: e */
    public static Drawable m133082e(Resources resources, String str) {
        SnsMethodCalculate.markStartTimeMs("getDrawableFromFile", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        try {
            Bitmap decodeFile = BitmapUtil.decodeFile(str, (BitmapFactory.Options) null);
            if (decodeFile != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, decodeFile);
                SnsMethodCalculate.markEndTimeMs("getDrawableFromFile", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                return bitmapDrawable;
            }
            Log.m105920e("SnsAd.AdImageLoader", "getDrawableFromFile bitmap==null, path=" + str);
            SnsMethodCalculate.markEndTimeMs("getDrawableFromFile", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return null;
        } catch (Throwable th) {
            Log.m105920e("SnsAd.AdImageLoader", "getDrawableFromFile exp=" + th.toString() + ", path=" + str);
        }
    }

    /* renamed from: f */
    public static void m133083f(String str, ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        m133084g(str, imageView, 0.0f);
        SnsMethodCalculate.markEndTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    /* renamed from: g */
    public static void m133084g(String str, ImageView imageView, float f) {
        SnsMethodCalculate.markStartTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return;
        }
        Log.m105918d("SnsAd.AdImageLoader", "loadImageByCdn, hash=" + imageView.hashCode() + ", url=" + str);
        imageView.setTag(C0966R.C0970id.joh, str);
        C100891r.m132208c(str, false, 1, 0, new C101421b(imageView, str, f));
        SnsMethodCalculate.markEndTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    /* renamed from: h */
    public static void m133085h(String str, ImageView imageView, int i) {
        SnsMethodCalculate.markStartTimeMs("loadImageEx", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (TextUtils.isEmpty(str) || imageView == null) {
            SnsMethodCalculate.markEndTimeMs("loadImageEx", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return;
        }
        Log.m105918d("SnsAd.AdImageLoader", "loadImageEx, hash=" + imageView.hashCode() + ", url=" + str);
        imageView.setTag(C0966R.C0970id.joh, str);
        C100891r.m132206a(str, false, 41, 0, new C101420a(i, imageView, str));
        SnsMethodCalculate.markEndTimeMs("loadImageEx", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }
}
