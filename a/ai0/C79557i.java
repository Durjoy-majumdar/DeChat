package ai0;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p225rc.C89923l;
import qq0.C89796d;
import qq0.C89797e;

/* renamed from: ai0.i */
public class C79557i extends FrameLayout {

    /* renamed from: d */
    public AppBrandRuntime f233295d;

    /* renamed from: e */
    public FrameLayout f233296e;

    /* renamed from: f */
    public LinearLayout f233297f;

    /* renamed from: g */
    public C79550b f233298g;

    /* renamed from: h */
    public C79559b f233299h;

    /* renamed from: ai0.i$a */
    public class C79558a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f233300d;

        public C79558a(String str) {
            this.f233300d = str;
        }

        public void run() {
            C79557i iVar = C79557i.this;
            String str = this.f233300d;
            C79559b bVar = iVar.f233299h;
            if (bVar != null) {
                bVar.mo109643a(str);
            }
            iVar.setVisibility(8);
        }
    }

    /* renamed from: ai0.i$b */
    public interface C79559b {
        /* renamed from: a */
        void mo109643a(String str);

        void onDetach();
    }

    public C79557i(Context context, AppBrandRuntime appBrandRuntime) {
        super(context);
        this.f233295d = appBrandRuntime;
        if (C89923l.f258408a.mo117495a()) {
            setBackgroundColor(-16777216);
        } else {
            setBackgroundColor(-1);
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f233296e = frameLayout;
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f233297f = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.f233297f, new ViewGroup.LayoutParams(-1, -2));
        if (this.f233297f.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            C79774c.C79777c statusBar = appBrandRuntime.mo113054f0().getStatusBar();
            int i = statusBar == null ? 0 : statusBar.f233795a;
            ((ViewGroup.MarginLayoutParams) this.f233297f.getLayoutParams()).topMargin = i;
            Log.m105925i("MicroMsg.AppBrandRuntimeAdViewContainer[AppBrandSplashAd]", "fakeActionBarLayout topMargin=%d", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo109630a(boolean z, String str) {
        int i;
        C89797e eVar;
        int i2 = 0;
        Log.m105925i("MicroMsg.AppBrandRuntimeAdViewContainer[AppBrandSplashAd]", "hideOnMainThread, animation:%s, source:%s", Boolean.valueOf(z), str);
        if (z) {
            AppBrandRuntime appBrandRuntime = this.f233295d;
            AppBrandOptionButton appBrandOptionButton = null;
            if (appBrandRuntime == null || (eVar = appBrandRuntime.f238159x) == null) {
                C79550b bVar = this.f233298g;
                if (bVar != null) {
                    C89796d dVar = bVar.f233266e;
                    if (dVar != null) {
                        appBrandOptionButton = dVar.getOptionBtn();
                    } else {
                        C87412m.m108603p("capsuleBarImplView");
                        throw null;
                    }
                }
            } else {
                C89796d dVar2 = eVar.f258188c;
                if (dVar2 != null) {
                    appBrandOptionButton = dVar2.getOptionBtn();
                    C87412m.m108593f(appBrandOptionButton, "capsuleBarView.optionBtn");
                } else {
                    C87412m.m108603p("capsuleBarView");
                    throw null;
                }
            }
            if (appBrandOptionButton != null) {
                int width = appBrandOptionButton.getWidth();
                int height = appBrandOptionButton.getHeight();
                int[] iArr = new int[2];
                appBrandOptionButton.getLocationInWindow(iArr);
                i2 = iArr[0] + (width / 2);
                i = iArr[1] + (height / 2);
            } else {
                i = 0;
            }
            if (i2 <= 0 || i <= 0 || !isAttachedToWindow()) {
                C79559b bVar2 = this.f233299h;
                if (bVar2 != null) {
                    bVar2.mo109643a(str);
                }
                setVisibility(8);
                return;
            }
            C79558a aVar = new C79558a(str);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, i2, i, (float) Math.hypot((double) i2, (double) i), 0.0f);
            createCircularReveal.addListener(new C79561k(this, aVar));
            createCircularReveal.setDuration(300).setInterpolator(new DecelerateInterpolator());
            createCircularReveal.start();
            return;
        }
        C79559b bVar3 = this.f233299h;
        if (bVar3 != null) {
            bVar3.mo109643a(str);
        }
        setVisibility(8);
    }

    /* renamed from: b */
    public void mo109631b() {
        this.f233297f.removeAllViews();
        C79550b bVar = new C79550b(getContext());
        this.f233298g = bVar;
        this.f233297f.addView(bVar.getActionView());
        this.f233298g.f233265d.setFullscreenMode(true);
        this.f233298g.f233265d.mo109949q(false);
        this.f233298g.mo109613a(false);
        this.f233298g.mo109614d(false);
        this.f233298g.f233265d.setBackgroundColor(0);
    }

    public ViewGroup getContentContainer() {
        return this.f233296e;
    }

    public void onDetachedFromWindow() {
        Log.m105924i("MicroMsg.AppBrandRuntimeAdViewContainer[AppBrandSplashAd]", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        C79559b bVar = this.f233299h;
        if (bVar != null) {
            bVar.onDetach();
        }
    }

    public void setActionBarFullscreenMode(boolean z) {
        C79550b bVar = this.f233298g;
        if (bVar != null) {
            bVar.f233265d.setFullscreenMode(z);
        }
    }

    public void setBackButtonClickListener(View.OnClickListener onClickListener) {
        C79550b bVar = this.f233298g;
        if (bVar != null) {
            bVar.setBackButtonClickListener(onClickListener);
        }
    }

    public void setBarTopMargin(int i) {
        if (this.f233298g != null) {
            ((ViewGroup.MarginLayoutParams) this.f233297f.getLayoutParams()).topMargin = i;
        }
    }

    public void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        C79550b bVar = this.f233298g;
        if (bVar != null) {
            bVar.setCloseButtonClickListener(onClickListener);
        }
    }

    public void setForegroundStyle(boolean z) {
        C79550b bVar = this.f233298g;
        if (bVar != null) {
            bVar.f233265d.setForegroundStyle(z);
        }
    }

    public void setOnHideListener(C79559b bVar) {
        this.f233299h = bVar;
    }

    public void setOptionButtonClickListener(View.OnClickListener onClickListener) {
        C79550b bVar = this.f233298g;
        if (bVar != null) {
            bVar.f233265d.setOptionButtonClickListener(onClickListener);
        }
    }

    public void setTitle(String str) {
        C79550b bVar = this.f233298g;
        if (bVar != null) {
            bVar.setMainTitle(str);
        }
    }
}
