package com.tencent.p014mm.plugin.sight.decode.p1077ui;

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
import com.tencent.p014mm.plugin.sight.decode.model.C94571a;
import com.tencent.p014mm.plugin.sight.decode.model.SightPlayController;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.lang.ref.WeakReference;
import p682rz.C101485o;

/* renamed from: com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView */
public class SightPlayImageView extends QPictureView implements C94571a {

    /* renamed from: H */
    public int f273540H;

    /* renamed from: I */
    public int f273541I;

    /* renamed from: J */
    public int f273542J;

    /* renamed from: K */
    public int f273543K;

    /* renamed from: L */
    public C96875r0.C96876a f273544L;

    /* renamed from: M */
    public SightPlayController f273545M;

    /* renamed from: N */
    public boolean f273546N;

    /* renamed from: P */
    public boolean f273547P;

    /* renamed from: Q */
    public int f273548Q;

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView$a */
    public static final class C94574a extends SightPlayController {

        /* renamed from: J */
        public WeakReference<SightPlayImageView> f273549J;

        /* renamed from: com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView$a$a */
        public class C94575a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ SightPlayImageView f273550d;

            /* renamed from: e */
            public final /* synthetic */ ViewGroup.LayoutParams f273551e;

            public C94575a(C94574a aVar, SightPlayImageView sightPlayImageView, ViewGroup.LayoutParams layoutParams) {
                this.f273550d = sightPlayImageView;
                this.f273551e = layoutParams;
            }

            public void run() {
                this.f273550d.setLayoutParams(this.f273551e);
            }
        }

        public C94574a(int i, SightPlayImageView sightPlayImageView) {
            super(i, sightPlayImageView);
            this.f273549J = new WeakReference<>(sightPlayImageView);
        }

        /* renamed from: g */
        public int mo130047g() {
            return C0966R.C0968anim.f2491ef;
        }

        /* renamed from: k */
        public void mo130051k(Bitmap bitmap) {
            SightPlayImageView sightPlayImageView = this.f273549J.get();
            if (sightPlayImageView == null) {
                Log.m105920e("MicroMsg.SightPlayImageView", "onGetFrameBmp, imageView is null, do clear");
                mo130043c();
                return;
            }
            sightPlayImageView.setImageBitmap(bitmap);
        }

        /* renamed from: l */
        public void mo130052l(int i, int i2) {
            SightPlayImageView sightPlayImageView = this.f273549J.get();
            if (sightPlayImageView == null) {
                Log.m105920e("MicroMsg.SightPlayImageView", "onGetVideoSizeEnd, imageView is null, do clear");
                mo130043c();
            } else if (!sightPlayImageView.f273547P) {
                sightPlayImageView.f273542J = i;
                sightPlayImageView.f273543K = i2;
                C96875r0.C96876a aVar = sightPlayImageView.f273544L;
                if (aVar != null) {
                    aVar.mo76226p3(i, i2);
                }
                if (sightPlayImageView.f273540H > 0) {
                    ViewGroup.LayoutParams layoutParams = sightPlayImageView.getLayoutParams();
                    int i3 = layoutParams.width;
                    int i4 = sightPlayImageView.f273540H;
                    if (!(i3 == i4 && layoutParams.height == (i4 * i2) / i)) {
                        layoutParams.width = i4;
                        layoutParams.height = (i4 * i2) / i;
                        MMHandlerThread.postToMainThread(new C94575a(this, sightPlayImageView, layoutParams));
                        sightPlayImageView.postInvalidate();
                    }
                    Log.m105925i("MicroMsg.SightPlayImageView", "onGetVideoSize::params width %d height %d", Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height));
                }
                Log.m105925i("MicroMsg.SightPlayImageView", "onGetVideoSize::DrawWidth %d, video size %d*%d", Integer.valueOf(sightPlayImageView.f273540H), Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    public SightPlayImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f273546N = true;
        this.f273547P = false;
        this.f273548Q = 0;
        this.f273545M = new C94574a(0, this);
        Log.m105925i("MicroMsg.SightPlayImageView", "mController %s", Util.getStack().toString());
    }

    /* renamed from: b */
    public void mo130071b(String str, boolean z, int i) {
        SightPlayController sightPlayController = this.f273545M;
        Log.m105925i("MicroMsg.SightPlayController", "#0x%x data: set video[%s], old path[%s], fling[%B], last video id %d, recording %B, canPlay %B", Integer.valueOf(sightPlayController.hashCode()), str, sightPlayController.f273470c, Boolean.valueOf(z), Integer.valueOf(sightPlayController.f273472e), Boolean.valueOf(sightPlayController.f273464E), Boolean.valueOf(sightPlayController.f273490w));
        if (sightPlayController.f273464E) {
            sightPlayController.mo130054n(false);
            return;
        }
        sightPlayController.mo130049i();
        if (!sightPlayController.f273490w) {
            sightPlayController.mo130043c();
        } else if (z) {
            sightPlayController.f273471d = str;
            sightPlayController.mo130054n(false);
        } else if (sightPlayController.f273470c.equals(str)) {
            sightPlayController.f273471d = "ERROR#PATH";
            sightPlayController.mo130054n(false);
            sightPlayController.mo130053m();
        } else {
            sightPlayController.mo130043c();
            if (str == null) {
                str = "";
            }
            sightPlayController.f273470c = str;
            if (Util.isNullOrNil(str)) {
                Log.m105928w("MicroMsg.SightPlayController", "empty video path, do draw empty thumb and return");
                sightPlayController.mo130044d((Bitmap) null);
            } else if (!SightPlayController.m119571b(sightPlayController.f273470c)) {
                Log.m105928w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
                sightPlayController.mo130043c();
            } else {
                sightPlayController.f273482o = new SightPlayController.C94566h((SightPlayController.C94556a) null);
                ((C101485o) C86312j.m106911c(C101485o.class)).mo140808fO(sightPlayController.f273482o, 0);
            }
        }
    }

    /* renamed from: c */
    public void mo130072c(int i, int i2) {
        this.f273546N = false;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        this.f273540H = i;
        int i3 = (i2 * i) / i;
        this.f273541I = i3;
        layoutParams.width = i;
        layoutParams.height = i3;
        setLayoutParams(layoutParams);
        postInvalidate();
    }

    public void clear() {
        this.f273545M.mo130043c();
    }

    public SightPlayController getController() {
        return this.f273545M;
    }

    public int getDuration() {
        SightPlayController sightPlayController = this.f273545M;
        if (sightPlayController == null) {
            return 0;
        }
        return (int) sightPlayController.mo130046f();
    }

    public Object getTagObject() {
        return getTag();
    }

    public Context getUIContext() {
        return getContext();
    }

    public String getVideoPath() {
        return this.f273545M.f273470c;
    }

    public void onAttachedToWindow() {
        Log.m105919d("MicroMsg.SightPlayImageView", "#0x%x on attached from window", Integer.valueOf(hashCode()));
        super.onAttachedToWindow();
        this.f273545M.mo130048h().alive();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105925i("MicroMsg.SightPlayImageView", "#0x%x clear, on deattached to window", Integer.valueOf(hashCode()));
        clear();
        this.f273545M.mo130048h().dead();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* renamed from: p */
    public void mo130096p(boolean z) {
        SightPlayController sightPlayController = this.f273545M;
        sightPlayController.getClass();
        Log.m105925i("MicroMsg.SightPlayController", "configure: need sound %B", Boolean.valueOf(z));
        if (!z) {
            if (sightPlayController.f273484q != null) {
                sightPlayController.f273484q.f273512e = 0;
                ((C101485o) C86312j.m106911c(C101485o.class)).mo140808fO(sightPlayController.f273484q, 0);
            }
            sightPlayController.f273484q = null;
        } else if (sightPlayController.f273484q == null) {
            sightPlayController.f273484q = new SightPlayController.C94567i((SightPlayController.C94556a) null);
        }
    }

    /* renamed from: q */
    public void mo130097q() {
        this.f273547P = true;
    }

    /* renamed from: r */
    public void mo130098r(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    public void setCanPlay(boolean z) {
        this.f273545M.f273490w = z;
    }

    public void setDrawWidthAndHeightFix(boolean z) {
        this.f273547P = z;
    }

    public void setDrawableWidth(int i) {
        this.f273546N = false;
        this.f273540H = i;
        if (this.f273542J > 0 && this.f273543K > 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int i2 = this.f273540H;
            int i3 = (this.f273543K * i2) / this.f273542J;
            this.f273541I = i3;
            if (layoutParams.width != i2 || layoutParams.height != i3) {
                layoutParams.width = i2;
                layoutParams.height = i3;
                setLayoutParams(layoutParams);
            }
        }
    }

    public void setForceRecordState(boolean z) {
    }

    public void setImageBitmap(Bitmap bitmap) {
        int i;
        int i2;
        super.setImageBitmap(bitmap);
        if (!this.f273547P) {
            if (bitmap == null) {
                i = this.f273541I;
                if (i == 0) {
                    i = 240;
                }
            } else {
                i = bitmap.getHeight();
            }
            if (bitmap == null) {
                i2 = this.f273540H;
                if (i2 == 0) {
                    i2 = C0947jz.f2205e;
                }
            } else {
                i2 = bitmap.getWidth();
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int i3 = layoutParams.height;
            int i4 = this.f273540H;
            float f = (float) i2;
            if (i3 != ((int) (((float) (i4 * i)) / f))) {
                layoutParams.width = i4;
                layoutParams.height = (int) ((((float) i4) * ((float) i)) / f);
                setLayoutParams(layoutParams);
            }
        }
    }

    public void setImageDrawable(Drawable drawable) {
        int i;
        int i2;
        super.setImageDrawable(drawable);
        if (!this.f273547P) {
            if (drawable == null) {
                i = this.f273541I;
                if (i == 0) {
                    i = 240;
                }
            } else {
                i = drawable.getIntrinsicHeight();
            }
            if (drawable == null) {
                i2 = this.f273540H;
                if (i2 == 0) {
                    i2 = C0947jz.f2205e;
                }
            } else {
                i2 = drawable.getIntrinsicWidth();
            }
            if (i != 0 && i2 != 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                int i3 = layoutParams.height;
                int i4 = this.f273540H;
                float f = (float) i;
                float f2 = (float) i2;
                if (i3 != ((int) ((((float) i4) * f) / f2)) && this.f273548Q == 0) {
                    layoutParams.width = i4;
                    layoutParams.height = (int) ((((float) i4) * f) / f2);
                    setLayoutParams(layoutParams);
                }
            }
        }
    }

    public void setIsAdVideo(boolean z) {
        SightPlayController sightPlayController = this.f273545M;
        if (sightPlayController != null) {
            sightPlayController.f273491x = z;
        }
    }

    public void setIsForbidLoopAnim(boolean z) {
        SightPlayController sightPlayController = this.f273545M;
        if (sightPlayController != null) {
            sightPlayController.f273492y = z;
        }
    }

    public void setIsWhatsNew(boolean z) {
        this.f273545M.f273493z = z;
    }

    public void setLoopImp(boolean z) {
        SightPlayController sightPlayController = this.f273545M;
        if (sightPlayController != null) {
            sightPlayController.f273460A = z;
        }
    }

    public void setMaskID(int i) {
    }

    public void setOnCompletionListener(SightPlayController.C94564e eVar) {
        this.f273545M.f273466G = eVar;
    }

    public void setOnDecodeDurationListener(SightPlayController.C94565f fVar) {
        SightPlayController sightPlayController = this.f273545M;
        if (fVar == null) {
            sightPlayController.f273467H = sightPlayController.f273488u;
        }
        sightPlayController.f273467H = fVar;
    }

    public void setOnSightCompletionAction(SightPlayController.C30395g gVar) {
        this.f273545M.getClass();
    }

    public void setPosition(int i) {
        this.f273545M.f273463D = i;
    }

    public void setScaleMode(int i) {
        this.f273548Q = i;
    }

    public void setSightInfoView(TextView textView) {
        this.f273545M.getClass();
        new WeakReference(textView);
    }

    public void setTagObject(Object obj) {
        setTag(obj);
    }

    public void setThumbBgView(View view) {
        SightPlayController sightPlayController = this.f273545M;
        sightPlayController.getClass();
        sightPlayController.f273476i = new WeakReference<>(view);
    }

    public void setThumbBmp(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public SightPlayImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
