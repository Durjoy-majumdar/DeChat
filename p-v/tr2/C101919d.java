package tr2;

import android.graphics.Bitmap;
import android.util.Size;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import ic0.C108455d;
import iy3.C60641c;
import kg3.C76577a;
import o40.C61926c;
import os2.C100423z;
import p166hy.C98563j0;
import p564iq.C87790d;
import pr2.C100846e;
import rx3.C13598b0;
import rx3.C13604l;
import vp3.C65849b;
import z04.C112551y;

/* renamed from: tr2.d */
public final class C101919d implements C98563j0 {

    /* renamed from: a */
    public final AppCompatImageView f300084a;

    /* renamed from: b */
    public C32226l<? super Bitmap, C13598b0> f300085b;

    /* renamed from: c */
    public C100846e f300086c;

    /* renamed from: tr2.d$a */
    public static final class C101920a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101919d f300087d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f300088e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101920a(C101919d dVar, Bitmap bitmap) {
            super(1);
            this.f300087d = dVar;
            this.f300088e = bitmap;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1");
            C61926c.m72668M(new C101918c((Bitmap) obj, this.f300087d, this.f300088e));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1");
            return b0Var;
        }
    }

    /* renamed from: tr2.d$b */
    public static final class C101921b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101919d f300089d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f300090e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101921b(C101919d dVar, Bitmap bitmap) {
            super(0);
            this.f300089d = dVar;
            this.f300090e = bitmap;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImageBitmapWithFade$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImageBitmapWithFade$1");
            this.f300089d.mo141420g().setImageBitmap(this.f300090e);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImageBitmapWithFade$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImageBitmapWithFade$1");
            return b0Var;
        }
    }

    /* renamed from: tr2.d$c */
    public static final class C101922c implements C108455d {

        /* renamed from: a */
        public final /* synthetic */ String f300091a;

        /* renamed from: b */
        public final /* synthetic */ long f300092b;

        /* renamed from: c */
        public final /* synthetic */ String f300093c;

        /* renamed from: d */
        public final /* synthetic */ C101919d f300094d;

        /* renamed from: e */
        public final /* synthetic */ boolean f300095e;

        /* renamed from: f */
        public final /* synthetic */ String f300096f;

        public C101922c(String str, long j, String str2, C101919d dVar, boolean z, String str3) {
            this.f300091a = str;
            this.f300092b = j;
            this.f300093c = str2;
            this.f300094d = dVar;
            this.f300095e = z;
            this.f300096f = str3;
        }

        /* renamed from: a */
        public final void mo26263a(boolean z, Object[] objArr) {
            SnsMethodCalculate.markStartTimeMs("onImageDownload", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$1");
            if (z) {
                C94866e1.Ux0().mo139912qq(this.f300091a, this.f300092b, this.f300093c);
                C101919d dVar = this.f300094d;
                String str = this.f300093c;
                boolean z2 = this.f300095e;
                SnsMethodCalculate.markStartTimeMs("access$setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                dVar.mo141421h(str, z2);
                SnsMethodCalculate.markEndTimeMs("access$setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            } else {
                Log.m105920e("MicroMsg.SnsCoverFadeImageView", "downloadImage error:" + this.f300096f);
            }
            SnsMethodCalculate.markEndTimeMs("onImageDownload", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$1");
        }
    }

    /* renamed from: tr2.d$d */
    public static final class C101923d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101919d f300097d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f300098e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101923d(C101919d dVar, Bitmap bitmap) {
            super(0);
            this.f300097d = dVar;
            this.f300098e = bitmap;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$1");
            C32226l<Bitmap, C13598b0> b = this.f300097d.mo137934b();
            if (b != null) {
                b.invoke(this.f300098e);
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$1");
            return b0Var;
        }
    }

    /* renamed from: tr2.d$e */
    public static final class C101924e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101919d f300099d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f300100e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101924e(C101919d dVar, Bitmap bitmap) {
            super(0);
            this.f300099d = dVar;
            this.f300100e = bitmap;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$2");
            this.f300099d.mo141420g().setImageBitmap(this.f300100e);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$2$2");
            return b0Var;
        }
    }

    public C101919d(AppCompatImageView appCompatImageView) {
        C87412m.m108594g(appCompatImageView, "host");
        this.f300084a = appCompatImageView;
    }

    /* renamed from: a */
    public void mo137933a(C32226l<? super Bitmap, C13598b0> lVar) {
        SnsMethodCalculate.markStartTimeMs("setSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        this.f300085b = lVar;
        SnsMethodCalculate.markEndTimeMs("setSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    /* renamed from: b */
    public C32226l<Bitmap, C13598b0> mo137934b() {
        SnsMethodCalculate.markStartTimeMs("getSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        C32226l<? super Bitmap, C13598b0> lVar = this.f300085b;
        SnsMethodCalculate.markEndTimeMs("getSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        return lVar;
    }

    /* renamed from: c */
    public void mo137935c(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setImageBitmapWithFade", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        if (bitmap == null) {
            SnsMethodCalculate.markEndTimeMs("setImageBitmapWithFade", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            return;
        }
        if ((((float) bitmap.getHeight()) * 1.0f) / ((float) bitmap.getWidth()) < 1.7777778f) {
            mo141419f(bitmap, bitmap.getWidth(), (int) (((float) bitmap.getWidth()) * 1.7777778f));
        } else {
            C61926c.m72668M(new C101921b(this, bitmap));
        }
        SnsMethodCalculate.markEndTimeMs("setImageBitmapWithFade", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    /* renamed from: d */
    public void mo137936d(String str, long j, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        SnsMethodCalculate.markStartTimeMs("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        C87412m.m108594g(str, "userName");
        Log.m105924i("MicroMsg.SnsCoverFadeImageView", "SnsCoverFadeImageView load cover,imagePath:" + str4);
        if (str4 != null && C112551y.m153819s(str4, "http", false)) {
            C100846e snsCoverReporter = getSnsCoverReporter();
            if (snsCoverReporter != null) {
                snsCoverReporter.mo140315b(false);
            }
            String a = C100423z.f294196g.mo139913a(str);
            C20828a b = C20828a.m22825b();
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59350f = a;
            bVar.f59346b = true;
            b.mo32515d(str4, bVar.mo32666a(), new C101922c(str, j, a, this, z, str2));
        } else {
            C100846e snsCoverReporter2 = getSnsCoverReporter();
            if (snsCoverReporter2 != null) {
                snsCoverReporter2.mo140315b(true);
            }
            mo141421h(str4, z);
        }
        SnsMethodCalculate.markEndTimeMs("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    /* renamed from: e */
    public void mo137937e(C100846e eVar) {
        SnsMethodCalculate.markStartTimeMs("setSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        this.f300086c = eVar;
        SnsMethodCalculate.markEndTimeMs("setSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    /* renamed from: f */
    public final void mo141419f(Bitmap bitmap, int i, int i2) {
        Class cls = C87790d.class;
        SnsMethodCalculate.markStartTimeMs("blurBitmap", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        if (!((C87790d) C86312j.m106911c(cls)).isInstalled("xlab")) {
            Log.m105928w("MicroMsg.SnsCoverFadeImageView", "Expansions not yet installed, drop blurBitmap");
            SnsMethodCalculate.markEndTimeMs("blurBitmap", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            return;
        }
        ((C87790d) C86312j.m106911c(cls)).mo122034R0("xlabeffect");
        ((C87790d) C86312j.m106911c(cls)).mo122034R0("pag");
        C65849b bVar = new C65849b();
        bVar.f189366e.f334049r.f334062b = 1;
        bVar.mo89891b(bitmap);
        SnsMethodCalculate.markStartTimeMs("clamSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$Companion");
        if (i > 1080) {
            i2 = C60641c.m70920a(((((double) 1080) * 1.0d) / ((double) i)) * ((double) i2));
            i = 1080;
        }
        Size size = new Size(i, i2);
        SnsMethodCalculate.markEndTimeMs("clamSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$Companion");
        int width = size.getWidth();
        int height = size.getHeight();
        bVar.f189363b = width;
        bVar.f189364c = height;
        bVar.f189366e.f334033b.mo154924d();
        bVar.mo89890a(new C101920a(this, bitmap));
        SnsMethodCalculate.markEndTimeMs("blurBitmap", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    /* renamed from: g */
    public final AppCompatImageView mo141420g() {
        SnsMethodCalculate.markStartTimeMs("getHost", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        AppCompatImageView appCompatImageView = this.f300084a;
        SnsMethodCalculate.markEndTimeMs("getHost", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        return appCompatImageView;
    }

    public C100846e getSnsCoverReporter() {
        SnsMethodCalculate.markStartTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        C100846e eVar = this.f300086c;
        SnsMethodCalculate.markEndTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        return eVar;
    }

    /* renamed from: h */
    public final void mo141421h(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        SnsMethodCalculate.markStartTimeMs("decodeImg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(str, 1080, 1080);
        if (decodeFileWithSample != null) {
            int width = decodeFileWithSample.getWidth();
            int height = decodeFileWithSample.getHeight();
            int maxTextureSize = ForceGpuUtil.getMaxTextureSize();
            if (width > maxTextureSize) {
                decodeFileWithSample = BitmapUtil.getCenterCropBitmap(decodeFileWithSample, maxTextureSize, decodeFileWithSample.getHeight(), true);
            } else if (height > maxTextureSize) {
                decodeFileWithSample = BitmapUtil.getCenterCropBitmap(decodeFileWithSample, decodeFileWithSample.getWidth(), maxTextureSize, true);
            }
        }
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
        if (exifOrientation != 0) {
            decodeFileWithSample = BitmapUtil.rotateAndScale(decodeFileWithSample, (float) exifOrientation, 1.0f, 1.0f);
        }
        SnsMethodCalculate.markEndTimeMs("decodeImg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        if (decodeFileWithSample != null) {
            if (z) {
                SnsMethodCalculate.markStartTimeMs("centerCropImage", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                float h = ((float) C76577a.m92157h(this.f300084a.getContext(), C0966R.dimen.aoc)) / ((float) C76577a.m92145A(this.f300084a.getContext()));
                C13604l lVar = h > ((float) decodeFileWithSample.getHeight()) / ((float) decodeFileWithSample.getWidth()) ? new C13604l(BitmapUtil.getCenterCropBitmap(decodeFileWithSample, (int) (((float) decodeFileWithSample.getHeight()) / h), decodeFileWithSample.getHeight(), false), Boolean.TRUE) : new C13604l(BitmapUtil.getCenterCropBitmap(decodeFileWithSample, decodeFileWithSample.getWidth(), (int) (((float) decodeFileWithSample.getWidth()) * h), false), Boolean.FALSE);
                SnsMethodCalculate.markEndTimeMs("centerCropImage", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                Bitmap bitmap = (Bitmap) lVar.f38555d;
                C61926c.m72668M(new C101923d(this, bitmap));
                if (((Boolean) lVar.f38556e).booleanValue()) {
                    mo141419f(bitmap, bitmap.getWidth(), (int) (((float) bitmap.getWidth()) * 1.7777778f));
                }
            }
            if ((((float) decodeFileWithSample.getHeight()) * 1.0f) / ((float) decodeFileWithSample.getWidth()) < 1.7777778f) {
                mo141419f(decodeFileWithSample, decodeFileWithSample.getWidth(), (int) (((float) decodeFileWithSample.getWidth()) * 1.7777778f));
            } else {
                C61926c.m72668M(new C101924e(this, decodeFileWithSample));
            }
        }
        SnsMethodCalculate.markEndTimeMs("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }
}
