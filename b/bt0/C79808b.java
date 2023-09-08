package bt0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import at0.C103915c;
import bt0.C79815i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83971x3;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView;
import com.tencent.p014mm.plugin.appbrand.utils.C40568j2;
import com.tencent.p014mm.plugin.appbrand.utils.C84725c;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView;
import com.tencent.p014mm.plugin.appbrand.widget.CircleProgressDrawable;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import fy3.C32224a;
import j20.C117292a;
import java.util.LinkedHashSet;
import java.util.Set;
import jp3.C46566c;
import jp3.C9486a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: bt0.b */
public class C79808b extends LinearLayout implements C79815i, C82531i.C82535d, C82531i.C82533b {

    /* renamed from: H */
    public static final /* synthetic */ int f233880H = 0;

    /* renamed from: A */
    public b$$l f233881A;

    /* renamed from: B */
    public boolean f233882B = false;

    /* renamed from: C */
    public final Set<C54553a> f233883C = new LinkedHashSet();

    /* renamed from: D */
    public final View.OnClickListener f233884D = new b$$d(this);

    /* renamed from: E */
    public AppBrandActionBarCustomImageView f233885E;

    /* renamed from: F */
    public View f233886F;

    /* renamed from: G */
    public final Runnable f233887G = new b$$a(this);

    /* renamed from: d */
    public final String f233888d;

    /* renamed from: e */
    public final C46566c<C9486a> f233889e;

    /* renamed from: f */
    public final C0125s f233890f;

    /* renamed from: g */
    public ImageView f233891g;

    /* renamed from: h */
    public ImageView f233892h;

    /* renamed from: i */
    public View f233893i;

    /* renamed from: j */
    public View f233894j;

    /* renamed from: n */
    public View f233895n;

    /* renamed from: o */
    public TextView f233896o;

    /* renamed from: p */
    public ProgressBar f233897p;

    /* renamed from: q */
    public CircleProgressDrawable f233898q;

    /* renamed from: r */
    public int f233899r;

    /* renamed from: s */
    public int f233900s;

    /* renamed from: t */
    public double f233901t;

    /* renamed from: u */
    public boolean f233902u;

    /* renamed from: v */
    public boolean f233903v;

    /* renamed from: w */
    public C79810e f233904w = new C79810e();

    /* renamed from: x */
    public b$$j f233905x;

    /* renamed from: y */
    public AppBrandCapsuleBarPlaceHolderView f233906y;

    /* renamed from: z */
    public b$$h f233907z = new b$$k(this, (b$$d) null);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79808b(Context context) {
        super(context);
        String str = "MicroMsg.AppBrandActionBar#" + hashCode();
        this.f233888d = str;
        C46566c<C9486a> cVar = new C46566c<>();
        this.f233889e = cVar;
        C40568j2 j2Var = new C40568j2(hashCode(), cVar);
        this.f233890f = j2Var;
        Log.m105924i(str, "<init>, context: " + context);
        this.f233902u = false;
        this.f233903v = false;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setBackgroundResource(C0966R.color.f3008c5);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6378d8, this, false);
        this.f233886F = inflate;
        addView(inflate);
        this.f233899r = -1;
        this.f233900s = getResources().getColor(C0966R.color.f3008c5);
        this.f233901t = 1.0d;
        this.f233894j = findViewById(C0966R.C0970id.f5454fk);
        this.f233891g = (ImageView) findViewById(C0966R.C0970id.f5455fl);
        this.f233892h = (ImageView) findViewById(C0966R.C0970id.dvt);
        this.f233893i = findViewById(C0966R.C0970id.f5453fj);
        View findViewById = findViewById(C0966R.C0970id.f5465fv);
        this.f233895n = findViewById;
        findViewById.setClickable(false);
        this.f233896o = (TextView) findViewById(C0966R.C0970id.f5468fy);
        this.f233897p = (ProgressBar) findViewById(C0966R.C0970id.f5452fi);
        this.f233898q = new CircleProgressDrawable(getContext());
        this.f233906y = (AppBrandCapsuleBarPlaceHolderView) findViewById(C0966R.C0970id.f5444fa);
        Integer valueOf = Integer.valueOf(C0966R.string.f7367e4);
        C103915c.m138604a(this.f233891g, Button.class, valueOf, false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a<Boolean>) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null);
        this.f233891g.setOnClickListener(new b$$b(this));
        ImageView imageView = this.f233891g;
        if (imageView != null) {
            View view = (View) imageView.getParent();
            view.post(new C54554d(this, imageView, 100, view));
        }
        C103915c.m138604a(this.f233892h, Button.class, valueOf, false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a<Boolean>) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null);
        this.f233892h.setOnClickListener(new b$$c(this));
        C84725c.f247120e.mo117450Q9().uiObserve(j2Var, new b$$i(this));
    }

    private void setBackgroundColorInternal(int i) {
        if (!this.f233903v) {
            super.setBackgroundColor(i);
        } else {
            super.setBackgroundColor(0);
        }
    }

    /* renamed from: b */
    public void mo22089b() {
        CircleProgressDrawable circleProgressDrawable = this.f233898q;
        if (circleProgressDrawable != null) {
            circleProgressDrawable.mo148694d();
        }
    }

    /* renamed from: c */
    public void mo22090c() {
        CircleProgressDrawable circleProgressDrawable;
        if ((this.f233897p.getVisibility() == 0) && (circleProgressDrawable = this.f233898q) != null) {
            circleProgressDrawable.mo148693c();
        }
    }

    /* renamed from: d */
    public void mo109614d(boolean z) {
        int i = 0;
        this.f233906y.setVisibility(z ? 0 : 4);
        if (this.f233906y.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = this.f233906y.getLayoutParams();
            if (z) {
                i = -2;
            }
            layoutParams.width = i;
            this.f233906y.requestLayout();
        }
        b$$j b__j = this.f233905x;
        if (b__j != null) {
            b__j.mo109612d(this.f233906y.getVisibility());
        }
        AppBrandActionBarCustomImageView appBrandActionBarCustomImageView = this.f233885E;
        if (appBrandActionBarCustomImageView != null) {
            appBrandActionBarCustomImageView.setVisibility(8);
        }
    }

    public View getActionView() {
        return this;
    }

    public final double getBackgroundAlpha() {
        return this.f233901t;
    }

    public final int getBackgroundColor() {
        if (this.f233903v) {
            return 0;
        }
        return this.f233900s;
    }

    public int getForegroundColor() {
        return this.f233899r;
    }

    public CharSequence getMainTitle() {
        return this.f233896o.getText();
    }

    public b$$h getNavResetStyleListener() {
        return this.f233907z;
    }

    /* renamed from: k */
    public void mo109942k() {
        Log.m105924i(this.f233888d, "destroy");
        CircleProgressDrawable circleProgressDrawable = this.f233898q;
        if (circleProgressDrawable != null) {
            circleProgressDrawable.mo148694d();
        }
        removeAllViews();
        this.f233907z = null;
        this.f233889e.dead();
    }

    /* renamed from: l */
    public final void mo109943l(boolean z, CharSequence charSequence) {
        Log.m105925i(this.f233888d, "operateDoubleClickEmitter, isAccessibilityEnable: %b, title: %s", Boolean.valueOf(z), charSequence);
        if (!z) {
            if (!this.f233883C.isEmpty() && !this.f233882B) {
                Log.m105924i(this.f233888d, "setupDoubleClickEmitter");
                this.f233895n.setOnClickListener(this.f233884D);
                this.f233882B = true;
            }
        } else if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f233883C.isEmpty() && !this.f233882B) {
                Log.m105924i(this.f233888d, "setupDoubleClickEmitter");
                this.f233895n.setOnClickListener(this.f233884D);
                this.f233882B = true;
            }
        } else if (this.f233882B) {
            Log.m105924i(this.f233888d, "resetDoubleClickEmitter");
            this.f233895n.setOnClickListener((View.OnClickListener) null);
            this.f233895n.setClickable(false);
            this.f233882B = false;
        }
    }

    /* renamed from: n */
    public void mo109944n() {
        C79815i.C79816a aVar = C79815i.C79816a.WHITE;
        b$$h b__h = this.f233907z;
        if (b__h != null) {
            b__h.mo109969d(this.f233891g, this.f233892h, this.f233893i, this.f233894j);
        }
        this.f233896o.setTextColor(this.f233899r);
        CircleProgressDrawable circleProgressDrawable = this.f233898q;
        circleProgressDrawable.f311310e = this.f233899r;
        circleProgressDrawable.invalidateSelf();
        this.f233897p.setIndeterminateDrawable(this.f233898q);
        if ((this.f233899r == -1 ? aVar : C79815i.C79816a.BLACK) == aVar) {
            b$$j b__j = this.f233905x;
            if (b__j != null) {
                b__j.mo109609a(-1);
                return;
            }
            return;
        }
        b$$j b__j2 = this.f233905x;
        if (b__j2 != null) {
            b__j2.mo109609a(-16777216);
        }
    }

    /* renamed from: o */
    public final void mo109945o() {
        View view = this.f233893i;
        int i = (this.f233903v || this.f233902u) ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetNavVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetNavVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f233893i.isLayoutRequested()) {
            requestLayout();
            post(this.f233887G);
        }
    }

    public void onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents();
        View view = this.f233893i;
        if (view != null && view.getVisibility() == 0) {
            this.f233893i.cancelPendingInputEvents();
            this.f233893i.setPressed(false);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* renamed from: q */
    public void mo109949q(boolean z) {
        View view = this.f233893i;
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "showNavArea", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "showNavArea", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        requestLayout();
    }

    public void setActionBarHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.f233886F.getLayoutParams();
        if (layoutParams != null && layoutParams.height != i) {
            layoutParams.height = i;
            this.f233886F.setLayoutParams(layoutParams);
        }
    }

    public void setBackButtonClickListener(View.OnClickListener onClickListener) {
        C79810e eVar = this.f233904w;
        if (onClickListener == null) {
            eVar.getClass();
        } else {
            eVar.f233920b.add(onClickListener);
        }
    }

    public final void setBackgroundAlpha(double d) {
        this.f233901t = d;
        if (!this.f233903v) {
            Drawable background = super.getBackground();
            if (background == null) {
                setBackgroundColorInternal(this.f233900s);
                background = super.getBackground();
            }
            background.setAlpha((int) (d * 255.0d));
        }
    }

    public final void setBackgroundColor(int i) {
        this.f233900s = i;
        setBackgroundColorInternal(i);
        setBackgroundAlpha(this.f233901t);
    }

    public final void setCapsuleBarInteractionDelegate(b$$j b__j) {
        this.f233905x = b__j;
        if (b__j != null) {
            b__j.mo109611c(new b$$e(this));
            this.f233905x.mo109610b(new b$$f(this));
        }
    }

    public void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        C79810e eVar = this.f233904w;
        if (onClickListener == null) {
            eVar.getClass();
        } else {
            eVar.f233919a.add(onClickListener);
        }
    }

    public void setForegroundColor(int i) {
        this.f233899r = i;
        mo109944n();
    }

    public void setForegroundStyle(String str) {
        this.f233899r = C79815i.C79816a.m96974a(str).f233934d;
        mo109944n();
    }

    public void setFullscreenMode(boolean z) {
        this.f233903v = z;
        mo109945o();
        View view = this.f233895n;
        int i = this.f233903v ? 4 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetTitleVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetTitleVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        requestLayout();
        setBackgroundColor(this.f233900s);
    }

    public void setLoadingIconVisibility(boolean z) {
        b$$l b__l = this.f233881A;
        if (b__l != null) {
            ((C83971x3) b__l).f245157g = z;
            return;
        }
        this.f233897p.setVisibility(z ? 0 : 8);
        if (z) {
            this.f233898q.mo148692a();
            this.f233898q.mo148693c();
            return;
        }
        this.f233898q.mo148694d();
    }

    public void setMainTitle(CharSequence charSequence) {
        boolean isLayoutRequested = isLayoutRequested();
        this.f233896o.setText(charSequence);
        float f = (float) C76577a.m92155f(this.f233896o.getContext(), C0966R.dimen.f3619c);
        TextView textView = this.f233896o;
        float p = C76577a.m92165p(textView.getContext());
        float f2 = 1.0f;
        if (p == 0.8f) {
            f2 = 0.91f;
        } else if (p != 1.0f) {
            if (p == 1.1f || p == 1.12f) {
                f2 = 1.11f;
            } else if (p == 1.125f || p == 1.4f || p == 1.55f || p == 1.65f) {
                f2 = 1.18f;
            } else if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
                throw new IllegalStateException(String.format("unhandled scale[%f]", new Object[]{Float.valueOf(p)}));
            } else {
                Log.m105929w("MicroMsg.AppBrandActionBarCommon", "getActionBarTextSizeScale: unhandled scale[%f]", Float.valueOf(p));
            }
        }
        textView.setTextSize(0, f * f2);
        mo109943l(C84725c.f247120e.isEnable(), charSequence);
        if (isLayoutRequested) {
            requestLayout();
        }
    }

    public void setNavButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f233893i.setOnLongClickListener(new b$$g(this, onLongClickListener));
    }

    public void setNavContainerMinimumWidth(int i) {
        View view = this.f233894j;
        if (view != null) {
            view.setMinimumWidth(i);
        }
    }

    public void setNavHidden(boolean z) {
        this.f233902u = z;
        mo109945o();
        mo109944n();
    }

    public void setNavLoadingIconVisibilityResetListener(b$$l b__l) {
        this.f233881A = b__l;
    }

    public void setNavResetStyleListener(b$$h b__h) {
        this.f233907z = b__h;
    }

    public void setOptionButtonClickListener(View.OnClickListener onClickListener) {
        C79810e eVar = this.f233904w;
        if (onClickListener == null) {
            eVar.getClass();
        } else {
            eVar.f233921c.add(onClickListener);
        }
    }

    public AppBrandCapsuleBarPlaceHolderView getCapsuleView() {
        return this.f233906y;
    }

    public void setForegroundStyle(boolean z) {
        this.f233899r = z ? -16777216 : -1;
        mo109944n();
    }
}
