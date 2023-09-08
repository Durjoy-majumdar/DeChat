package com.tencent.p014mm.plugin.webview.luggage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;

/* renamed from: com.tencent.mm.plugin.webview.luggage.l0 */
public class C85514l0 extends FrameLayout {

    /* renamed from: d */
    public View f249185d;

    /* renamed from: e */
    public FrameLayout f249186e;

    /* renamed from: f */
    public View f249187f;

    /* renamed from: g */
    public FrameLayout f249188g;

    /* renamed from: h */
    public int f249189h;

    /* renamed from: i */
    public boolean f249190i = true;

    /* renamed from: j */
    public boolean f249191j = false;

    /* renamed from: n */
    public boolean f249192n = false;

    /* renamed from: o */
    public boolean f249193o = false;

    /* renamed from: p */
    public boolean f249194p = false;

    /* renamed from: q */
    public int f249195q;

    /* renamed from: r */
    public int f249196r;

    /* renamed from: s */
    public int f249197s;

    /* renamed from: t */
    public ObjectAnimator f249198t = null;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.l0$a */
    public class C85515a implements ValueAnimator.AnimatorUpdateListener {
        public C85515a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C85514l0.this.mo118898d((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public C85514l0(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f249189h = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    public final boolean mo118895a() {
        Log.m105919d("MicroMsg.AppBrandPullDownView", "canOverScroll, scrollY = %d, topY = %d", Integer.valueOf(this.f249187f.getScrollY()), Integer.valueOf(this.f249187f.getTop()));
        View view = this.f249187f;
        return view instanceof WebView ? ((WebView) view).getWebScrollY() == 0 : view instanceof RecyclerView ? ((LinearLayoutManager) ((RecyclerView) view).getLayoutManager()).mo16957C() == 0 && this.f249187f.getScrollY() == 0 : view.getScrollY() == 0;
    }

    /* renamed from: b */
    public void mo118896b() {
        mo118897c(0);
        this.f249193o = false;
        this.f249192n = false;
        this.f249194p = false;
    }

    /* renamed from: c */
    public final void mo118897c(int i) {
        int translationY = (int) this.f249188g.getTranslationY();
        if (translationY != i) {
            Log.m105925i("MicroMsg.AppBrandPullDownView", "fastScrollTo from = %s, to = %s", Integer.valueOf(translationY), Integer.valueOf(i));
            ObjectAnimator objectAnimator = this.f249198t;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f249188g, "translationY", new float[]{(float) translationY, (float) i});
            ofFloat.setDuration(Math.min((long) ((((float) Math.abs(translationY - i)) / ((float) getStayHeight())) * 250.0f), 250));
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.start();
            ofFloat.addUpdateListener(new C85515a());
            this.f249198t = ofFloat;
        }
    }

    /* renamed from: d */
    public void mo118898d(int i) {
    }

    /* renamed from: e */
    public void mo118899e() {
    }

    /* renamed from: f */
    public void mo118900f(View view, View view2) {
        removeAllViews();
        this.f249185d = view;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f249186e = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f249186e.addView(view);
        this.f249187f = view2;
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f249188g = frameLayout2;
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f249188g.addView(view2);
        addView(this.f249186e);
        addView(this.f249188g);
    }

    public int getMaxOverScrollDistance() {
        return getHeight();
    }

    public int getOpenHeight() {
        return this.f249185d.getHeight();
    }

    public int getStayHeight() {
        return this.f249185d.getHeight();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f249190i) {
            return this.f249194p;
        }
        int action = motionEvent.getAction();
        if (!(action == 3 || action == 1)) {
            if (this.f249193o) {
                return true;
            }
            if (action != 0) {
                if (action == 2 && mo118895a()) {
                    int x = ((int) motionEvent.getX()) - this.f249195q;
                    int y = ((int) motionEvent.getY()) - this.f249196r;
                    if (Math.abs(y) > this.f249189h && Math.abs(y) > Math.abs(x) && y > 0) {
                        this.f249193o = true;
                        return true;
                    }
                }
            } else if (mo118895a()) {
                this.f249195q = (int) motionEvent.getX();
                this.f249196r = (int) motionEvent.getY();
                this.f249197s = (int) motionEvent.getY();
            }
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f249190i) {
            if (this.f249194p) {
                mo118896b();
            }
            return this.f249194p;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int y = ((int) motionEvent.getY()) - this.f249197s;
                    int i = y >> 1;
                    int maxOverScrollDistance = getMaxOverScrollDistance();
                    if (i > maxOverScrollDistance) {
                        i = maxOverScrollDistance;
                    }
                    if (this.f249192n) {
                        i += getStayHeight();
                    }
                    int max = Math.max(i, 0);
                    Log.m105919d("MicroMsg.AppBrandPullDownView", "real diff: %d, calc diff: %d", Integer.valueOf(y), Integer.valueOf(max));
                    this.f249188g.setTranslationY((float) Math.min(getMaxOverScrollDistance(), max));
                    mo118898d(max);
                    return true;
                } else if (action != 3) {
                    return false;
                }
            }
            if (this.f249188g.getTranslationY() <= ((float) getOpenHeight()) || !this.f249191j) {
                mo118896b();
            } else {
                mo118897c(getStayHeight());
                if (!this.f249192n) {
                    mo118899e();
                }
                this.f249193o = true;
                this.f249192n = true;
                this.f249194p = true;
            }
            return true;
        }
        this.f249197s = (int) motionEvent.getY();
        return true;
    }

    public void setNeedStay(boolean z) {
        this.f249191j = z;
    }

    public void setPullDownBackgroundColor(int i) {
        this.f249186e.setBackgroundColor(i);
    }

    public void setPullDownEnabled(boolean z) {
        this.f249190i = !z;
    }
}
