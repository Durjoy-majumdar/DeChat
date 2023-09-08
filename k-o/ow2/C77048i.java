package ow2;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import en3.C75627f;
import gy3.C87412m;
import jw2.C99069d;
import kg3.C76577a;

/* renamed from: ow2.i */
public final class C77048i extends C75627f {

    /* renamed from: a */
    public final View f225085a;

    /* renamed from: b */
    public final StoryGalleryView.C71277m f225086b;

    /* renamed from: c */
    public VelocityTracker f225087c;

    /* renamed from: d */
    public int f225088d = C76577a.m92151b(MMApplicationContext.getContext(), 32);

    /* renamed from: e */
    public final int f225089e = C76577a.m92151b(MMApplicationContext.getContext(), 96);

    /* renamed from: f */
    public float f225090f;

    /* renamed from: g */
    public float f225091g;

    /* renamed from: h */
    public float f225092h;

    /* renamed from: i */
    public float f225093i;

    /* renamed from: j */
    public int f225094j;

    /* renamed from: k */
    public boolean f225095k;

    public C77048i(View view, StoryGalleryView.C71277m mVar) {
        C87412m.m108594g(view, "galleryView");
        C87412m.m108594g(mVar, "galleryScaleListener");
        this.f225085a = view;
        this.f225086b = mVar;
    }

    /* renamed from: a */
    public boolean mo105974a(MotionEvent motionEvent, boolean z, int i) {
        C87412m.m108594g(motionEvent, "event");
        if (this.f225087c == null) {
            this.f225087c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f225087c;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z2 = true;
            float f = 0.0f;
            if (actionMasked == 1) {
                if (this.f225095k) {
                    VelocityTracker velocityTracker2 = this.f225087c;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000);
                    }
                    VelocityTracker velocityTracker3 = this.f225087c;
                    float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
                    VelocityTracker velocityTracker4 = this.f225087c;
                    float yVelocity = velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f;
                    if (this.f225094j != 2 ? !(this.f225092h > ((float) (this.f225085a.getWidth() / 2)) || xVelocity > 50.0f) : !(this.f225093i > ((float) this.f225089e) || yVelocity > 0.0f)) {
                        z2 = false;
                    }
                    if (z2) {
                        C99069d.f290418a.mo138412a(13);
                        this.f225086b.mo98131b();
                    } else {
                        this.f225085a.animate().translationY(0.0f).start();
                    }
                }
                this.f225094j = 0;
                this.f225092h = 0.0f;
                this.f225093i = 0.0f;
                this.f225095k = false;
                VelocityTracker velocityTracker5 = this.f225087c;
                if (velocityTracker5 != null) {
                    velocityTracker5.clear();
                }
                VelocityTracker velocityTracker6 = this.f225087c;
                if (velocityTracker6 != null) {
                    velocityTracker6.recycle();
                }
                this.f225087c = null;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.f225094j = 0;
                    this.f225085a.setTranslationY(0.0f);
                    this.f225092h = 0.0f;
                    this.f225093i = 0.0f;
                    this.f225095k = false;
                    VelocityTracker velocityTracker7 = this.f225087c;
                    if (velocityTracker7 != null) {
                        velocityTracker7.clear();
                    }
                    VelocityTracker velocityTracker8 = this.f225087c;
                    if (velocityTracker8 != null) {
                        velocityTracker8.recycle();
                    }
                    this.f225087c = null;
                }
            } else if (z) {
                this.f225094j = i;
                if ((i != 8 || this.f225090f >= ((float) this.f225088d)) && i != 2) {
                    z2 = false;
                }
                this.f225095k = z2;
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                this.f225092h = rawX - this.f225090f;
                this.f225093i = rawY - this.f225091g;
                if (this.f225095k) {
                    this.f225085a.animate().cancel();
                    float height = this.f225094j == 2 ? this.f225093i : (this.f225092h * ((float) this.f225085a.getHeight())) / ((float) this.f225085a.getWidth());
                    if (height >= 0.0f) {
                        f = height;
                    }
                    this.f225085a.setTranslationY(f);
                    this.f225086b.mo98130a(0.8f - (f / ((float) this.f225085a.getHeight())));
                }
            }
        } else {
            this.f225090f = motionEvent.getRawX();
            this.f225091g = motionEvent.getRawY();
        }
        return this.f225095k;
    }

    /* renamed from: b */
    public int mo105975b() {
        return 10;
    }
}
