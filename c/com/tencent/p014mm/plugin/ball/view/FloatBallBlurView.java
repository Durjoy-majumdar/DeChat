package com.tencent.p014mm.plugin.ball.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bw0.C104167b;
import bw0.C104168d;
import bw0.C104169e;
import bw0.C28429c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import lb0.C88394b;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import z04.C112551y;
import zp3.C23564m;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallBlurView;", "Landroid/widget/FrameLayout;", "", "url", "Lrx3/b0;", "setImageUrl", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "", "d", "Lrx3/g;", "getBitmapTargetSize", "()I", "bitmapTargetSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ball.view.FloatBallBlurView */
public final class FloatBallBlurView extends FrameLayout {

    /* renamed from: j */
    public static final /* synthetic */ int f311896j = 0;

    /* renamed from: d */
    public final C13601g f311897d = C36568h.m40985a(new C105096a(this));

    /* renamed from: e */
    public ImageView f311898e;

    /* renamed from: f */
    public ImageView f311899f;

    /* renamed from: g */
    public ImageView f311900g;

    /* renamed from: h */
    public String f311901h = "";

    /* renamed from: i */
    public boolean f311902i = true;

    /* renamed from: com.tencent.mm.plugin.ball.view.FloatBallBlurView$a */
    public static final class C105096a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FloatBallBlurView f311903d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105096a(FloatBallBlurView floatBallBlurView) {
            super(0);
            this.f311903d = floatBallBlurView;
        }

        public Object invoke() {
            return Integer.valueOf(this.f311903d.getResources().getDimensionPixelSize(C0966R.dimen.f3761db));
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.FloatBallBlurView$b */
    public static final class C105097b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FloatBallBlurView f311904d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f311905e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105097b(FloatBallBlurView floatBallBlurView, Bitmap bitmap) {
            super(0);
            this.f311904d = floatBallBlurView;
            this.f311905e = bitmap;
        }

        public Object invoke() {
            FloatBallBlurView floatBallBlurView = this.f311904d;
            Bitmap bitmap = this.f311905e;
            int i = FloatBallBlurView.f311896j;
            floatBallBlurView.getClass();
            Log.m105924i("MicroMsg.FloatBallBlurView", "onBlurDone bitmap: " + bitmap);
            if (bitmap == null) {
                ImageView imageView = floatBallBlurView.f311898e;
                if (imageView != null) {
                    imageView.setImageBitmap((Bitmap) null);
                } else {
                    C87412m.m108603p("mBlurImageView");
                    throw null;
                }
            } else if (!bitmap.isRecycled()) {
                ImageView imageView2 = floatBallBlurView.f311898e;
                if (imageView2 != null) {
                    imageView2.setImageBitmap(bitmap);
                    ImageView imageView3 = floatBallBlurView.f311898e;
                    if (imageView3 == null) {
                        C87412m.m108603p("mBlurImageView");
                        throw null;
                    } else if (floatBallBlurView.f311902i && imageView3.getVisibility() != 0) {
                        ImageView imageView4 = floatBallBlurView.f311898e;
                        if (imageView4 != null) {
                            imageView4.setVisibility(0);
                            ImageView imageView5 = floatBallBlurView.f311900g;
                            if (imageView5 != null) {
                                imageView5.setVisibility(0);
                                ImageView imageView6 = floatBallBlurView.f311900g;
                                if (imageView6 != null) {
                                    imageView6.setAlpha(1.0f);
                                    ImageView imageView7 = floatBallBlurView.f311900g;
                                    if (imageView7 != null) {
                                        imageView7.setBackgroundColor(floatBallBlurView.getResources().getColor(C0966R.color.f2937k));
                                    } else {
                                        C87412m.m108603p("mBottomBlurMask");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mBottomBlurMask");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mBottomBlurMask");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mBlurImageView");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("mBlurImageView");
                    throw null;
                }
            } else {
                ImageView imageView8 = floatBallBlurView.f311898e;
                if (imageView8 != null) {
                    imageView8.setImageBitmap((Bitmap) null);
                } else {
                    C87412m.m108603p("mBlurImageView");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.FloatBallBlurView$c */
    public static final class C105098c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FloatBallBlurView f311906d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f311907e;

        public C105098c(FloatBallBlurView floatBallBlurView, Bitmap bitmap) {
            this.f311906d = floatBallBlurView;
            this.f311907e = bitmap;
        }

        public final void run() {
            FloatBallBlurView floatBallBlurView = this.f311906d;
            Bitmap bitmap = this.f311907e;
            int i = FloatBallBlurView.f311896j;
            floatBallBlurView.mo149248b(bitmap);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatBallBlurView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo149249c((AttributeSet) null, 0);
    }

    /* renamed from: a */
    public static final Bitmap m141026a(FloatBallBlurView floatBallBlurView, String str) {
        floatBallBlurView.getClass();
        int orientationInDegree = Exif.fromFile(str).getOrientationInDegree();
        Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(str, floatBallBlurView.getBitmapTargetSize(), floatBallBlurView.getBitmapTargetSize(), true);
        if (decodeFileWithSample != null) {
            return BitmapUtil.rotate(decodeFileWithSample, (float) orientationInDegree);
        }
        return null;
    }

    private final int getBitmapTargetSize() {
        return ((Number) this.f311897d.getValue()).intValue();
    }

    /* renamed from: b */
    public final void mo149248b(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            C23564m.m28136f(new C104167b(this));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        float f = max <= 480 ? 5.0f : max <= 720 ? 10.0f : max <= 1080 ? 20.0f : max <= 1440 ? 25.0f : 30.0f;
        Bitmap fastBlurBitmap = BitmapUtil.fastBlurBitmap(bitmap, 0.1f, (int) f, true, 500);
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.m105927v("MicroMsg.FloatBallBlurView", "doUpdateBlur size: %s, %s, blurRadius: %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Float.valueOf(f));
        Log.m105927v("MicroMsg.FloatBallBlurView", "doUpdateBlur cost: %s", Long.valueOf(currentTimeMillis2 - currentTimeMillis));
        C61926c.m72668M(new C105097b(this, fastBlurBitmap));
    }

    /* renamed from: c */
    public final void mo149249c(AttributeSet attributeSet, int i) {
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.d54, this, true);
        View findViewById = findViewById(C0966R.C0970id.ns9);
        C87412m.m108593f(findViewById, "findViewById(R.id.blur_image_view)");
        this.f311898e = (ImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.nzk);
        C87412m.m108593f(findViewById2, "findViewById(R.id.top_blur_mask)");
        this.f311899f = (ImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.ns_);
        C87412m.m108593f(findViewById3, "findViewById(R.id.bottom_blur_mask)");
        this.f311900g = (ImageView) findViewById3;
        ImageView imageView = this.f311899f;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
            ImageView imageView2 = this.f311900g;
            if (imageView2 != null) {
                imageView2.setAlpha(1.0f);
            } else {
                C87412m.m108603p("mBottomBlurMask");
                throw null;
            }
        } else {
            C87412m.m108603p("mTopBlurMask");
            throw null;
        }
    }

    /* renamed from: d */
    public final void mo149250d(Bitmap bitmap, boolean z) {
        if (z) {
            ((C119157j) C119157j.f356862d).mo183875f(new C105098c(this, bitmap));
            return;
        }
        mo149248b(bitmap);
    }

    public final void setBitmap(Bitmap bitmap) {
        mo149250d(bitmap, true);
    }

    public final void setImageUrl(String str) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            C23564m.m28136f(new C104167b(this));
        } else if (!C87412m.m108589b(str, this.f311901h)) {
            this.f311901h = str;
            Log.m105927v("MicroMsg.FloatBallBlurView", "loadImageUrl: %s", str);
            if (C112551y.m153820t(this.f311901h, "http", false, 2, (Object) null) || C112551y.m153820t(this.f311901h, C113600ck.f339986i, false, 2, (Object) null)) {
                String str2 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122796o(new C104168d(this), this.f311901h, (C88394b.C88408j) null);
                return;
            }
            String i = C86013q1.m106448i(this.f311901h, false);
            if (!C86013q1.m106450k(i)) {
                Log.m105921e("MicroMsg.FloatBallBlurView", "loadImageBitmap file not exist %s", i);
                C23564m.m28136f(new C104167b(this));
                return;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            MMBitmapFactory.m98735d(i, options);
            C104169e eVar = new C104169e(this, i);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            if (i2 > 480 || i3 > 480) {
                z = false;
            }
            if (z) {
                eVar.invoke();
            } else {
                ((C119157j) C119157j.f356862d).mo183875f(new C28429c(eVar));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatBallBlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo149249c(attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatBallBlurView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo149249c(attributeSet, i);
    }
}
