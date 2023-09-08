package xg3;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import en3.C75627f;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: xg3.a */
public final class C78804a extends C75627f {

    /* renamed from: a */
    public final View f230573a;

    /* renamed from: b */
    public final C78805b f230574b;

    /* renamed from: c */
    public VelocityTracker f230575c;

    /* renamed from: d */
    public int f230576d = C76577a.m92151b(MMApplicationContext.getContext(), 32);

    /* renamed from: e */
    public final int f230577e = C76577a.m92151b(MMApplicationContext.getContext(), 96);

    /* renamed from: f */
    public float f230578f;

    /* renamed from: g */
    public float f230579g;

    /* renamed from: h */
    public float f230580h;

    /* renamed from: i */
    public float f230581i;

    /* renamed from: j */
    public int f230582j;

    /* renamed from: k */
    public boolean f230583k;

    public C78804a(View view, C78805b bVar) {
        C87412m.m108594g(view, "galleryView");
        C87412m.m108594g(bVar, "galleryScaleListener");
        this.f230573a = view;
        this.f230574b = bVar;
    }

    /* renamed from: a */
    public boolean mo105974a(MotionEvent motionEvent, boolean z, int i) {
        C87412m.m108594g(motionEvent, "event");
        if (this.f230575c == null) {
            this.f230575c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f230575c;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z2 = true;
            float f = 0.0f;
            if (actionMasked == 1) {
                if (this.f230583k) {
                    VelocityTracker velocityTracker2 = this.f230575c;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000);
                    }
                    VelocityTracker velocityTracker3 = this.f230575c;
                    float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
                    VelocityTracker velocityTracker4 = this.f230575c;
                    float yVelocity = velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f;
                    if (this.f230582j != 2 ? !(this.f230580h > ((float) (this.f230573a.getWidth() / 2)) || xVelocity > 50.0f) : !(this.f230581i > ((float) this.f230577e) || yVelocity > 0.0f)) {
                        z2 = false;
                    }
                    if (z2) {
                        this.f230574b.mo106140b();
                    } else {
                        this.f230573a.animate().translationY(0.0f).start();
                    }
                }
                this.f230582j = 0;
                this.f230580h = 0.0f;
                this.f230581i = 0.0f;
                this.f230583k = false;
                VelocityTracker velocityTracker5 = this.f230575c;
                if (velocityTracker5 != null) {
                    velocityTracker5.clear();
                }
                VelocityTracker velocityTracker6 = this.f230575c;
                if (velocityTracker6 != null) {
                    velocityTracker6.recycle();
                }
                this.f230575c = null;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.f230582j = 0;
                    this.f230573a.setTranslationY(0.0f);
                    this.f230580h = 0.0f;
                    this.f230581i = 0.0f;
                    this.f230583k = false;
                    VelocityTracker velocityTracker7 = this.f230575c;
                    if (velocityTracker7 != null) {
                        velocityTracker7.clear();
                    }
                    VelocityTracker velocityTracker8 = this.f230575c;
                    if (velocityTracker8 != null) {
                        velocityTracker8.recycle();
                    }
                    this.f230575c = null;
                }
            } else if (z) {
                this.f230582j = i;
                if ((i != 8 || this.f230578f >= ((float) this.f230576d)) && i != 2) {
                    z2 = false;
                }
                this.f230583k = z2;
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                this.f230580h = rawX - this.f230578f;
                this.f230581i = rawY - this.f230579g;
                if (this.f230583k) {
                    this.f230573a.animate().cancel();
                    float height = this.f230582j == 2 ? this.f230581i : (this.f230580h * ((float) this.f230573a.getHeight())) / ((float) this.f230573a.getWidth());
                    if (height >= 0.0f) {
                        f = height;
                    }
                    this.f230573a.setTranslationY(f);
                    this.f230574b.mo106139a(0.8f - (f / ((float) this.f230573a.getHeight())));
                }
            }
        } else {
            this.f230578f = motionEvent.getRawX();
            this.f230579g = motionEvent.getRawY();
        }
        return this.f230583k;
    }

    /* renamed from: b */
    public int mo105975b() {
        return 10;
    }
}
