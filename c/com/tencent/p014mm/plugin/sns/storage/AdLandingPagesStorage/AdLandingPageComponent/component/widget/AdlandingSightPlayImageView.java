package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.memory.p1073ui.QPictureView;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import hd0.C98398h0;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView */
public class AdlandingSightPlayImageView extends QPictureView {

    /* renamed from: P */
    public static final /* synthetic */ int f54307P = 0;

    /* renamed from: H */
    public int f54308H;

    /* renamed from: I */
    public int f54309I;

    /* renamed from: J */
    public int f54310J;

    /* renamed from: K */
    public int f54311K;

    /* renamed from: L */
    public C96875r0.C96876a f54312L;

    /* renamed from: M */
    public AdlandingSightPlayController f54313M;

    /* renamed from: N */
    public boolean f54314N;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$a */
    public static final class C19268a extends AdlandingSightPlayController {

        /* renamed from: G */
        public WeakReference<AdlandingSightPlayImageView> f54315G;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$a$a */
        public class C19269a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AdlandingSightPlayImageView f54316d;

            /* renamed from: e */
            public final /* synthetic */ ViewGroup.LayoutParams f54317e;

            public C19269a(C19268a aVar, AdlandingSightPlayImageView adlandingSightPlayImageView, ViewGroup.LayoutParams layoutParams) {
                this.f54316d = adlandingSightPlayImageView;
                this.f54317e = layoutParams;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController$1");
                this.f54316d.setLayoutParams(this.f54317e);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController$1");
            }
        }

        public C19268a(int i, AdlandingSightPlayImageView adlandingSightPlayImageView) {
            super(i, adlandingSightPlayImageView);
            this.f54315G = new WeakReference<>(adlandingSightPlayImageView);
        }

        /* renamed from: A */
        public void mo24731A(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController");
            AdlandingSightPlayImageView adlandingSightPlayImageView = this.f54315G.get();
            if (adlandingSightPlayImageView == null) {
                Log.m105920e("MicroMsg.SightPlayImageView", "onGetVideoSizeEnd, imageView is null, do clear");
                mo24734t();
                SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController");
                return;
            }
            int i3 = AdlandingSightPlayImageView.f54307P;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
            adlandingSightPlayImageView.getClass();
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
            adlandingSightPlayImageView.f54310J = i;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
            adlandingSightPlayImageView.f54311K = i2;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
            C96875r0.C96876a aVar = adlandingSightPlayImageView.f54312L;
            if (aVar != null) {
                aVar.mo76226p3(i, i2);
            }
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
            if (AdlandingSightPlayImageView.m20456p(adlandingSightPlayImageView) > 0) {
                ViewGroup.LayoutParams layoutParams = adlandingSightPlayImageView.getLayoutParams();
                if (!(layoutParams.width == AdlandingSightPlayImageView.m20456p(adlandingSightPlayImageView) && layoutParams.height == (AdlandingSightPlayImageView.m20456p(adlandingSightPlayImageView) * i2) / i)) {
                    layoutParams.width = AdlandingSightPlayImageView.m20456p(adlandingSightPlayImageView);
                    layoutParams.height = (AdlandingSightPlayImageView.m20456p(adlandingSightPlayImageView) * i2) / i;
                    MMHandlerThread.postToMainThread(new C19269a(this, adlandingSightPlayImageView, layoutParams));
                    adlandingSightPlayImageView.postInvalidate();
                }
                Log.m105925i("MicroMsg.SightPlayImageView", "onGetVideoSize::params width %d height %d", Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height));
            }
            Log.m105925i("MicroMsg.SightPlayImageView", "onGetVideoSize::DrawWidth %d, video size %d*%d", Integer.valueOf(AdlandingSightPlayImageView.m20456p(adlandingSightPlayImageView)), Integer.valueOf(i), Integer.valueOf(i2));
            SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController");
        }

        /* renamed from: v */
        public int mo24736v() {
            SnsMethodCalculate.markStartTimeMs("getLoopAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController");
            SnsMethodCalculate.markEndTimeMs("getLoopAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController");
            return C0966R.C0968anim.f2491ef;
        }

        /* renamed from: z */
        public void mo24740z(Bitmap bitmap) {
            SnsMethodCalculate.markStartTimeMs("onGetFrameBmp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController");
            AdlandingSightPlayImageView adlandingSightPlayImageView = this.f54315G.get();
            if (adlandingSightPlayImageView == null) {
                Log.m105920e("MicroMsg.SightPlayImageView", "onGetFrameBmp, imageView is null, do clear");
                mo24734t();
                SnsMethodCalculate.markEndTimeMs("onGetFrameBmp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController");
                return;
            }
            adlandingSightPlayImageView.setImageBitmap(bitmap);
            SnsMethodCalculate.markEndTimeMs("onGetFrameBmp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView$SightImageViewController");
        }
    }

    public AdlandingSightPlayImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54314N = true;
        this.f54313M = new C19268a(0, this);
        Log.m105925i("MicroMsg.SightPlayImageView", "mController %s", Util.getStack().toString());
    }

    /* renamed from: p */
    public static /* synthetic */ int m20456p(AdlandingSightPlayImageView adlandingSightPlayImageView) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        int i = adlandingSightPlayImageView.f54308H;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        return i;
    }

    /* renamed from: b */
    public void mo24759b(String str, boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        Log.m105925i("MicroMsg.SightPlayController", "#0x%x data: set video[%s], old path[%s], fling[%B], last video id %d, recording %B, canPlay %B", Integer.valueOf(adlandingSightPlayController.hashCode()), str, adlandingSightPlayController.f54256c, Boolean.valueOf(z), Integer.valueOf(adlandingSightPlayController.f54258e), Boolean.valueOf(adlandingSightPlayController.f54250B), Boolean.valueOf(adlandingSightPlayController.f54275v));
        if (adlandingSightPlayController.f54250B) {
            adlandingSightPlayController.mo24733C(false);
            SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        } else {
            adlandingSightPlayController.mo24738x();
            if (!adlandingSightPlayController.f54275v) {
                adlandingSightPlayController.mo24734t();
                SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            } else if (z) {
                adlandingSightPlayController.f54257d = str;
                adlandingSightPlayController.mo24733C(false);
                SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            } else if (adlandingSightPlayController.f54256c.equals(str)) {
                adlandingSightPlayController.f54257d = "ERROR#PATH";
                adlandingSightPlayController.mo24733C(false);
                adlandingSightPlayController.mo24732B();
                SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            } else {
                adlandingSightPlayController.mo24734t();
                if (str == null) {
                    str = "";
                }
                adlandingSightPlayController.f54256c = str;
                if (Util.isNullOrNil(str)) {
                    Log.m105928w("MicroMsg.SightPlayController", "empty video path, do draw empty thumb and return");
                    adlandingSightPlayController.mo24735u((Bitmap) null);
                    SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                } else if (!AdlandingSightPlayController.m20440s(adlandingSightPlayController.f54256c)) {
                    Log.m105928w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
                    adlandingSightPlayController.mo24734t();
                    SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                } else {
                    adlandingSightPlayController.f54268o = new AdlandingSightPlayController.C19262g((C115736b) null);
                    C98398h0.m127699fO(adlandingSightPlayController.f54268o, 0);
                    SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public AdlandingSightPlayController getController() {
        SnsMethodCalculate.markStartTimeMs("getController", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        SnsMethodCalculate.markEndTimeMs("getController", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        return adlandingSightPlayController;
    }

    public int getDuration() {
        double d;
        SnsMethodCalculate.markStartTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        if (adlandingSightPlayController == null) {
            SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
            return 0;
        }
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        int i = adlandingSightPlayController.f54258e;
        if (i == -1) {
            d = 0.0d;
            SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        } else {
            d = SightVideoJNI.getVideoDuration(i);
            SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        }
        int i2 = (int) d;
        SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        return i2;
    }

    public Object getTagObject() {
        SnsMethodCalculate.markStartTimeMs("getTagObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        Object tag = getTag();
        SnsMethodCalculate.markEndTimeMs("getTagObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        return tag;
    }

    public Context getUIContext() {
        SnsMethodCalculate.markStartTimeMs("getUIContext", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        Context context = getContext();
        SnsMethodCalculate.markEndTimeMs("getUIContext", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        return context;
    }

    public String getVideoPath() {
        SnsMethodCalculate.markStartTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        String str = adlandingSightPlayController.f54256c;
        SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        return str;
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        Log.m105919d("MicroMsg.SightPlayImageView", "#0x%x on attached from window", Integer.valueOf(hashCode()));
        super.onAttachedToWindow();
        this.f54313M.mo24737w().alive();
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        super.onDetachedFromWindow();
        Log.m105925i("MicroMsg.SightPlayImageView", "#0x%x clear, on deattached to window", Integer.valueOf(hashCode()));
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        this.f54313M.mo24734t();
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        this.f54313M.mo24737w().dead();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        super.onDraw(canvas);
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    /* renamed from: q */
    public void mo24768q(boolean z) {
        SnsMethodCalculate.markStartTimeMs("needSound", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("needSound", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        Log.m105925i("MicroMsg.SightPlayController", "configure: need sound %B", Boolean.valueOf(z));
        if (!z) {
            if (adlandingSightPlayController.f54270q != null) {
                adlandingSightPlayController.f54270q.f54298e = 0;
                C98398h0.m127699fO(adlandingSightPlayController.f54270q, 0);
            }
            adlandingSightPlayController.f54270q = null;
        } else if (adlandingSightPlayController.f54270q == null) {
            adlandingSightPlayController.f54270q = new AdlandingSightPlayController.C19263h((C115736b) null);
        }
        SnsMethodCalculate.markEndTimeMs("needSound", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        SnsMethodCalculate.markEndTimeMs("needSound", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    /* renamed from: r */
    public void mo24769r(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("simpleSetImageBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        super.setImageBitmap(bitmap);
        SnsMethodCalculate.markEndTimeMs("simpleSetImageBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setCanPlay(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setCanPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("setCanPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.f54275v = z;
        SnsMethodCalculate.markEndTimeMs("setCanPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        SnsMethodCalculate.markEndTimeMs("setCanPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setDrawableWidth(int i) {
        SnsMethodCalculate.markStartTimeMs("setDrawableWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        this.f54314N = false;
        this.f54308H = i;
        if (this.f54310J > 0 && this.f54311K > 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int i2 = this.f54308H;
            int i3 = (this.f54311K * i2) / this.f54310J;
            this.f54309I = i3;
            if (!(layoutParams.width == i2 && layoutParams.height == i3)) {
                layoutParams.width = i2;
                layoutParams.height = i3;
                setLayoutParams(layoutParams);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setDrawableWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setForceRecordState(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setForceRecordState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        SnsMethodCalculate.markEndTimeMs("setForceRecordState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setImageBitmap(Bitmap bitmap) {
        int i;
        int i2;
        SnsMethodCalculate.markStartTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        super.setImageBitmap(bitmap);
        if (bitmap == null) {
            i = this.f54309I;
            if (i == 0) {
                i = 240;
            }
        } else {
            i = bitmap.getHeight();
        }
        if (bitmap == null) {
            i2 = this.f54308H;
            if (i2 == 0) {
                i2 = C0947jz.f2205e;
            }
        } else {
            i2 = bitmap.getWidth();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i3 = this.f54308H;
        float f = (float) i2;
        if (((float) layoutParams.height) != ((float) (i3 * i)) / f) {
            layoutParams.width = i3;
            layoutParams.height = (int) ((((float) i3) * ((float) i)) / f);
            setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setImageDrawable(Drawable drawable) {
        int i;
        int i2;
        SnsMethodCalculate.markStartTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        super.setImageDrawable(drawable);
        if (drawable == null) {
            i = this.f54309I;
            if (i == 0) {
                i = 240;
            }
        } else {
            i = drawable.getIntrinsicHeight();
        }
        if (drawable == null) {
            i2 = this.f54308H;
            if (i2 == 0) {
                i2 = C0947jz.f2205e;
            }
        } else {
            i2 = drawable.getIntrinsicWidth();
        }
        if (!(i == 0 || i2 == 0)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int i3 = this.f54308H;
            float f = (float) i;
            float f2 = (float) i2;
            if (((float) layoutParams.height) != (((float) i3) * f) / f2) {
                layoutParams.width = i3;
                layoutParams.height = (int) ((((float) i3) * f) / f2);
                setLayoutParams(layoutParams);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setIsWhatsNew(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsWhatsNew", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        this.f54313M.f54276w = z;
        SnsMethodCalculate.markEndTimeMs("setIsWhatsNew", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setLoopImp(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setLoopImp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        if (adlandingSightPlayController != null) {
            adlandingSightPlayController.getClass();
            SnsMethodCalculate.markStartTimeMs("setLoop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            adlandingSightPlayController.f54277x = z;
            SnsMethodCalculate.markEndTimeMs("setLoop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        }
        SnsMethodCalculate.markEndTimeMs("setLoopImp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setMaskID(int i) {
        SnsMethodCalculate.markStartTimeMs("setMaskID", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        SnsMethodCalculate.markEndTimeMs("setMaskID", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setOnCompletionListener(AdlandingSightPlayController.C19259d dVar) {
        SnsMethodCalculate.markStartTimeMs("setOnCompletionListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("setOnCompletionListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.f54252D = dVar;
        SnsMethodCalculate.markEndTimeMs("setOnCompletionListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        SnsMethodCalculate.markEndTimeMs("setOnCompletionListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setOnDecodeDurationListener(AdlandingSightPlayController.C19260e eVar) {
        SnsMethodCalculate.markStartTimeMs("setOnDecodeDurationListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("setOnDecodeDurationListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.f54253E = eVar;
        SnsMethodCalculate.markEndTimeMs("setOnDecodeDurationListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        SnsMethodCalculate.markEndTimeMs("setOnDecodeDurationListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setOnSightCompletionAction(AdlandingSightPlayController.C19261f fVar) {
        SnsMethodCalculate.markStartTimeMs("setOnSightCompletionAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("setOnSightCompletionAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markEndTimeMs("setOnSightCompletionAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        SnsMethodCalculate.markEndTimeMs("setOnSightCompletionAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setPosition(int i) {
        SnsMethodCalculate.markStartTimeMs("setPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("setPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.f54249A = i;
        SnsMethodCalculate.markEndTimeMs("setPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        SnsMethodCalculate.markEndTimeMs("setPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setSightInfoView(TextView textView) {
        SnsMethodCalculate.markStartTimeMs("setSightInfoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("setSightInfoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.f54262i = new WeakReference<>(textView);
        SnsMethodCalculate.markEndTimeMs("setSightInfoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        SnsMethodCalculate.markEndTimeMs("setSightInfoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setTagObject(Object obj) {
        SnsMethodCalculate.markStartTimeMs("setTagObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        setTag(obj);
        SnsMethodCalculate.markEndTimeMs("setTagObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setThumbBgView(View view) {
        SnsMethodCalculate.markStartTimeMs("setThumbBgView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("setThumbBgView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.f54261h = new WeakReference<>(view);
        SnsMethodCalculate.markEndTimeMs("setThumbBgView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        SnsMethodCalculate.markEndTimeMs("setThumbBgView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public void setThumbBmp(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setThumbBmp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        setImageBitmap(bitmap);
        SnsMethodCalculate.markEndTimeMs("setThumbBmp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
    }

    public AdlandingSightPlayImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
