package rq2;

import ad0.C91999u;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import java.lang.ref.WeakReference;
import jq2.C33629d;
import p823sg.C101611g;
import p823sg.C101614i;
import ps2.C100880k;
import ps2.C100891r;
import te3.C101804kv2;
import vr2.C102268v;
import zt3.C119157j;

/* renamed from: rq2.a */
public class C63489a {

    /* renamed from: a */
    public static C101611g<String, Bitmap> f180085a = new C101614i(3);

    /* renamed from: rq2.a$a */
    public class C63490a implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f180086a;

        /* renamed from: b */
        public final /* synthetic */ String f180087b;

        public C63490a(WeakReference weakReference, String str) {
            this.f180086a = weakReference;
            this.f180087b = str;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
            ImageView imageView = (ImageView) this.f180086a.get();
            if (imageView == null) {
                Log.m105928w("SnsAd.AdCdnImageLoaderMM", "imageViewRef released");
                SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
                return;
            }
            imageView.setTag(C0966R.C0970id.joh, "");
            imageView.setImageDrawable((Drawable) null);
            Log.m105920e("SnsAd.AdCdnImageLoaderMM", "onDownloadError, hash=" + imageView.hashCode() + ", url=" + this.f180087b);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
            try {
                ImageView imageView = (ImageView) this.f180086a.get();
                if (imageView == null) {
                    Log.m105928w("SnsAd.AdCdnImageLoaderMM", "imageViewRef released");
                    SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
                    return;
                }
                String str2 = (String) imageView.getTag(C0966R.C0970id.joh);
                String l = TextUtils.isEmpty(str2) ? "" : C100891r.m132217l("adId_mm", str2);
                if (TextUtils.isEmpty(str) || !str.equals(l)) {
                    Log.m105918d("SnsAd.AdCdnImageLoaderMM", "onDownloaded, url changed");
                } else {
                    String str3 = this.f180087b;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                    SnsMethodCalculate.markStartTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                    ((C119157j) C119157j.f356862d).mo183875f(new C63497b(str, str3, imageView));
                    SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                }
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
            } catch (Throwable th) {
                Log.m105920e("SnsAd.AdCdnImageLoaderMM", "onDownloaded, exp=" + th.toString());
            }
        }
    }

    /* renamed from: rq2.a$b */
    public class C63491b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100880k.C100881a f180088d;

        /* renamed from: e */
        public final /* synthetic */ String f180089e;

        public C63491b(C100880k.C100881a aVar, String str) {
            this.f180088d = aVar;
            this.f180089e = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$3");
            this.f180088d.mo76115c(this.f180089e);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$3");
        }
    }

    /* renamed from: rq2.a$d */
    public class C63492d implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ C63493f f180090a;

        /* renamed from: b */
        public final /* synthetic */ String f180091b;

        public C63492d(C63493f fVar, String str) {
            this.f180090a = fVar;
            this.f180091b = str;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
            this.f180090a.mo67280a((Bitmap) null, false);
            Log.m105920e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, onDownloadError, hash=" + this.f180090a.hashCode() + ", url=" + this.f180091b);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
            try {
                Log.m105924i("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, onDownloaded and imageUrl is " + this.f180091b);
                String str2 = this.f180091b;
                C63493f fVar = this.f180090a;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                SnsMethodCalculate.markStartTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                ((C119157j) C119157j.f356862d).mo183875f(new C63499c(str, str2, fVar));
                SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            } catch (Throwable th) {
                Log.m105920e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, onDownloaded, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
        }
    }

    /* renamed from: rq2.a$f */
    public interface C63493f {
        /* renamed from: a */
        void mo67280a(Bitmap bitmap, boolean z);
    }

    /* renamed from: rq2.a$c */
    public class C63494c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f180092d;

        /* renamed from: e */
        public final /* synthetic */ String f180093e;

        /* renamed from: f */
        public final /* synthetic */ String f180094f;

        /* renamed from: g */
        public final /* synthetic */ C100880k.C100881a f180095g;

        /* renamed from: h */
        public final /* synthetic */ C102268v f180096h;

        /* renamed from: i */
        public final /* synthetic */ String f180097i;

        /* renamed from: j */
        public final /* synthetic */ String f180098j;

        public C63494c(C101804kv2 kv22, String str, String str2, C100880k.C100881a aVar, C102268v vVar, String str3, String str4) {
            this.f180092d = kv22;
            this.f180093e = str;
            this.f180094f = str2;
            this.f180095g = aVar;
            this.f180096h = vVar;
            this.f180097i = str3;
            this.f180098j = str4;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$4");
            C94866e1.Vx0().mo130978c(new C63495e(this.f180092d.f298689d, this.f180093e, this.f180094f, this.f180095g));
            C94853e Vx0 = C94866e1.Vx0();
            C101804kv2 kv22 = this.f180092d;
            C102268v vVar = this.f180096h;
            C96983o3 c = C96983o3.m124651c();
            c.f284145b = (int) (System.currentTimeMillis() / 1000);
            Vx0.mo130982g(kv22, 8, vVar, c, this.f180097i, this.f180098j);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$4");
        }
    }

    /* renamed from: rq2.a$e */
    public static class C63495e implements C94853e.C94861h {

        /* renamed from: d */
        public String f180099d;

        /* renamed from: e */
        public String f180100e;

        /* renamed from: f */
        public String f180101f;

        /* renamed from: g */
        public C100880k.C100881a f180102g;

        /* renamed from: rq2.a$e$a */
        public class C63496a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f180103d;

            public C63496a(boolean z) {
                this.f180103d = z;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener$1");
                if (this.f180103d) {
                    C63495e eVar = C63495e.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
                    C100880k.C100881a aVar = eVar.f180102g;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
                    C63495e eVar2 = C63495e.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
                    String str = eVar2.f180100e;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
                    aVar.mo76115c(str);
                } else {
                    C63495e eVar3 = C63495e.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
                    C100880k.C100881a aVar2 = eVar3.f180102g;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
                    aVar2.mo76113a();
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener$1");
            }
        }

        public C63495e(String str, String str2, String str3, C100880k.C100881a aVar) {
            this.f180099d = str;
            this.f180102g = aVar;
            this.f180100e = str2;
            this.f180101f = str3;
        }

        public void onImageFinish(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            if (!Util.isNullOrNil(str, this.f180099d) && str.equals(this.f180099d)) {
                Log.m105924i("SnsAd.AdCdnImageLoaderMM", "onImageFinish, mediaId=" + str + ", isOk=" + z);
                C94866e1.Vx0().mo130997v(this);
                if (this.f180102g == null) {
                    SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
                    return;
                }
                ((C119157j) C119157j.f356862d).mo183895z(new C63496a(z));
                if (z) {
                    C33629d.m40145b(0, 0, 1, this.f180101f);
                } else {
                    C33629d.m40145b(1, 0, 1, this.f180101f);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        }

        public void onSetbg() {
            SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        }

        public void onSightFinish(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            if (!Util.isNullOrNil(str, this.f180099d) && str.equals(this.f180099d)) {
                Log.m105924i("SnsAd.AdCdnImageLoaderMM", "onSightFinish, mediaId=" + str + ", isOk=" + z);
                C94866e1.Vx0().mo130997v(this);
            }
            SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        }

        public void onThumbFinish(String str) {
            SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            if (!Util.isNullOrNil(str, this.f180099d) && str.equals(this.f180099d)) {
                Log.m105924i("SnsAd.AdCdnImageLoaderMM", "onThumbFinish, mediaId=" + str);
                C94866e1.Vx0().mo130997v(this);
            }
            SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        }
    }

    /* renamed from: a */
    public static void m74826a(String str, ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            return;
        }
        if (!str.equals((String) imageView.getTag(C0966R.C0970id.joh))) {
            imageView.setImageDrawable((Drawable) null);
            m74830e(str, imageView);
        }
        SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
    }

    /* renamed from: b */
    public static void m74827b(String str, String str2, C100880k.C100881a aVar) {
        String str3 = str;
        C100880k.C100881a aVar2 = aVar;
        SnsMethodCalculate.markStartTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        String g = C100891r.m132212g();
        String j = C100891r.m132215j(str2, str3);
        String str4 = g + j;
        Log.m105924i("SnsAd.AdCdnImageLoaderMM", "downloadImageByCdn, fileName=" + j + ", url=" + str3);
        if (C86013q1.m106450k(str4)) {
            Log.m105924i("SnsAd.AdCdnImageLoaderMM", "hit local cache, fileName=" + j);
            if (aVar2 != null) {
                ((C119157j) C119157j.f356862d).mo183895z(new C63491b(aVar2, str4));
            }
            SnsMethodCalculate.markEndTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            return;
        }
        C86013q1.m106461v(g);
        String str5 = str;
        C101804kv2 h = C91999u.m115562h(j, 2, str, str5, 1, 1, "");
        C102268v vVar = new C102268v(h);
        vVar.mo141832d(3);
        vVar.mo141833e(h.f298689d);
        ((C119157j) C119157j.f356862d).mo183895z(new C63494c(h, str4, str5, aVar, vVar, g, j));
        SnsMethodCalculate.markEndTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
    }

    /* renamed from: c */
    public static void m74828c(String str, C100880k.C100881a aVar) {
        SnsMethodCalculate.markStartTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        m74827b(str, "adId_mm", aVar);
        SnsMethodCalculate.markEndTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
    }

    /* renamed from: d */
    public static String m74829d(String str) {
        SnsMethodCalculate.markStartTimeMs("getPathForImgMM", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        String str2 = C100891r.m132212g() + C100891r.m132215j("adId_mm", str);
        SnsMethodCalculate.markEndTimeMs("getPathForImgMM", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        return str2;
    }

    /* renamed from: e */
    public static void m74830e(String str, ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            return;
        }
        imageView.setTag(C0966R.C0970id.joh, str);
        Log.m105918d("SnsAd.AdCdnImageLoaderMM", "loadImage, hash=" + imageView.hashCode() + ", url=" + str);
        Bitmap bitmap = (Bitmap) ((C101614i) f180085a).get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            m74828c(str, new C63490a(new WeakReference(imageView), str));
            SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            return;
        }
        imageView.setImageBitmap(bitmap);
        Log.m105918d("SnsAd.AdCdnImageLoaderMM", "hit mem cache, url=" + str);
        SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
    }

    /* renamed from: f */
    public static void m74831f(String str, C63493f fVar) {
        SnsMethodCalculate.markStartTimeMs("loadImageAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        if (fVar == null) {
            Log.m105920e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, drawableCallback is null, can not return image");
            SnsMethodCalculate.markEndTimeMs("loadImageAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        } else if (TextUtils.isEmpty(str)) {
            Log.m105920e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, imageUrl is null, you need operate this previously");
            SnsMethodCalculate.markEndTimeMs("loadImageAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        } else {
            Log.m105918d("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, hash=" + fVar.hashCode() + ", url=" + str);
            try {
                Bitmap bitmap = (Bitmap) ((C101614i) f180085a).get(str);
                if (bitmap == null || bitmap.isRecycled()) {
                    m74828c(str, new C63492d(fVar, str));
                    SnsMethodCalculate.markEndTimeMs("loadImageAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                    return;
                }
                fVar.mo67280a(bitmap, true);
                Log.m105918d("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, hit mem cache, url=" + str);
                SnsMethodCalculate.markEndTimeMs("loadImageAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            } catch (Throwable th) {
                Log.m105920e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, exp=" + th.toString());
            }
        }
    }
}
