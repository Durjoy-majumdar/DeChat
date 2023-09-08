package vt0;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import com.tencent.p014mm.plugin.appbrand.utils.C84722b1;
import com.tencent.p014mm.plugin.appbrand.utils.C84747i;
import com.tencent.p014mm.plugin.appbrand.utils.C84797y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p385u2.C111105a;

/* renamed from: vt0.g */
public class C22784g extends FrameLayout {

    /* renamed from: w */
    public static final /* synthetic */ int f65510w = 0;

    /* renamed from: d */
    public C17925e f65511d;

    /* renamed from: e */
    public FrameLayout f65512e;

    /* renamed from: f */
    public TextView f65513f;

    /* renamed from: g */
    public View f65514g;

    /* renamed from: h */
    public View f65515h;

    /* renamed from: i */
    public View f65516i;

    /* renamed from: j */
    public C22787c f65517j;

    /* renamed from: n */
    public boolean f65518n;

    /* renamed from: o */
    public View f65519o;

    /* renamed from: p */
    public View f65520p;

    /* renamed from: q */
    public boolean f65521q;

    /* renamed from: r */
    public boolean f65522r;

    /* renamed from: s */
    public int f65523s = getResources().getConfiguration().uiMode;

    /* renamed from: t */
    public Runnable f65524t;

    /* renamed from: u */
    public C22788d f65525u;

    /* renamed from: v */
    public C84722b1 f65526v = null;

    /* renamed from: vt0.g$a */
    public class C22785a implements Animation.AnimationListener {
        public C22785a() {
        }

        public void onAnimationEnd(Animation animation) {
            C22784g.this.mo35926f();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: vt0.g$b */
    public class C22786b implements Runnable {
        public C22786b() {
        }

        public void run() {
            C22784g gVar = C22784g.this;
            View view = gVar.f65519o;
            Context context = gVar.getContext();
            Object obj = C111105a.f332697a;
            view.setBackground(C111105a.C111110c.m151511b(context, C0966R.C0969drawable.f4450cw));
            C22784g gVar2 = C22784g.this;
            gVar2.f65513f.setTextColor(C111105a.m151500b(gVar2.getContext(), C0966R.color.BW_0_Alpha_0_9));
            C22784g gVar3 = C22784g.this;
            gVar3.f65515h.setBackgroundColor(C111105a.m151500b(gVar3.getContext(), C0966R.color.f2932f));
            ((Button) C22784g.this.f65515h.findViewById(C0966R.C0970id.akz)).setTextColor(C111105a.m151500b(C22784g.this.getContext(), C0966R.color.f3257l0));
            ((Button) C22784g.this.f65515h.findViewById(C0966R.C0970id.akz)).setBackground(C111105a.C111110c.m151511b(C22784g.this.getContext(), C0966R.C0969drawable.f4653j6));
            ((Button) C22784g.this.f65515h.findViewById(C0966R.C0970id.aky)).setTextColor(C111105a.m151500b(C22784g.this.getContext(), C0966R.color.al7));
            ((Button) C22784g.this.f65515h.findViewById(C0966R.C0970id.aky)).setBackground(C111105a.C111110c.m151511b(C22784g.this.getContext(), C0966R.C0969drawable.f4665jf));
        }
    }

    /* renamed from: vt0.g$c */
    public interface C22787c<T> {
        /* renamed from: a */
        void mo22193a(boolean z, T t);
    }

    /* renamed from: vt0.g$d */
    public interface C22788d<T> {
        /* renamed from: a */
        void mo22201a(T t);
    }

    public C22784g(Context context) {
        super(context);
        setClickable(true);
        setLongClickable(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6435es, this, false);
        this.f65519o = inflate;
        this.f65512e = (FrameLayout) inflate.findViewById(C0966R.C0970id.f5966tk);
        this.f65520p = this.f65519o.findViewById(C0966R.C0970id.f5964ti);
        View findViewById = this.f65519o.findViewById(C0966R.C0970id.hwi);
        this.f65515h = findViewById;
        this.f65516i = findViewById.findViewById(C0966R.C0970id.l87);
        mo35922b();
        this.f65515h.findViewById(C0966R.C0970id.akz).setOnClickListener(new C111613i(this));
        this.f65515h.findViewById(C0966R.C0970id.aky).setOnClickListener(new C111614j(this));
        this.f65515h.setOnClickListener(new C15007k(this));
        View findViewById2 = this.f65519o.findViewById(C0966R.C0970id.f5966tk);
        findViewById2.setOnClickListener(new C15008l(this));
        findViewById2.setBackgroundColor(C111105a.m151500b(findViewById2.getContext(), C0966R.color.f2932f));
        addView(this.f65519o, layoutParams);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f5963th);
        this.f65513f = textView;
        textView.setClickable(true);
        this.f65514g = findViewById(C0966R.C0970id.f5962tg);
        addOnLayoutChangeListener(new C22789h(this));
    }

    /* renamed from: a */
    public final void mo35921a() {
        int dimensionPixelSize = mo35925e() ? 0 : getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f65520p.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        this.f65520p.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public final void mo35922b() {
        int i;
        int i2;
        int i3;
        if (mo35925e()) {
            i3 = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            i2 = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            i = getContext().getResources().getDimensionPixelSize(C0966R.dimen.ajc);
        } else {
            i3 = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3753d4);
            i2 = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3749d0);
            i = getContext().getResources().getDimensionPixelSize(C0966R.dimen.ajd);
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f65516i.getLayoutParams();
        layoutParams.topMargin = i3;
        layoutParams.bottomMargin = i2;
        this.f65516i.setLayoutParams(layoutParams);
        this.f65515h.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
    }

    /* renamed from: c */
    public final void mo35923c(boolean z, Object obj) {
        C22787c cVar;
        if (!this.f65518n && (cVar = this.f65517j) != null) {
            this.f65518n = true;
            cVar.mo22193a(z, obj);
            this.f65518n = false;
        }
    }

    /* renamed from: d */
    public void mo35924d(boolean z) {
        if (this.f65521q) {
            clearAnimation();
            this.f65521q = false;
        }
        if (!this.f65522r && getVisibility() == 0) {
            mo35923c(false, (Object) null);
            C17925e eVar = this.f65511d;
            if (eVar != null) {
                eVar.onHide(this);
                if (!z) {
                    mo35926f();
                    return;
                }
                this.f65522r = true;
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2443d6);
                this.f65519o.startAnimation(loadAnimation);
                startAnimation(AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2344a9));
                loadAnimation.setAnimationListener(new C22785a());
            }
        }
    }

    /* renamed from: e */
    public final boolean mo35925e() {
        C84797y1 y1Var = C84797y1.LANDSCAPE;
        if (this.f65526v == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandPickerBottomPanelBase", "requireOrientationGetter, orientationGetter is null, use AndroidOrientationGetter as fallback");
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "componentView?.context ?…ationContext.getContext()");
            this.f65526v = new C84747i(context);
        }
        return y1Var == this.f65526v.mo109926a();
    }

    /* renamed from: f */
    public final void mo35926f() {
        setBackgroundResource(C0966R.color.ahf);
        clearAnimation();
        super.setVisibility(8);
        requestLayout();
        this.f65522r = false;
    }

    /* renamed from: g */
    public final void mo35927g(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public C17925e getPicker() {
        return this.f65511d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.uiMode;
        if (i != this.f65523s && this.f65524t == null) {
            this.f65524t = new C22786b();
        }
        this.f65523s = i;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f65517j = null;
        this.f65525u = null;
        removeAllViews();
    }

    public void onMeasure(int i, int i2) {
        if (!isShown()) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
        }
    }

    public void setHeader(String str) {
        String str2 = str;
        if (Util.isNullOrNil(str)) {
            mo35921a();
            View view = this.f65520p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showNoTitlePlaceHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showNoTitlePlaceHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f65513f.setText("");
            View view3 = this.f65514g;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "hideHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "hideHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f65513f.setVisibility(8);
            return;
        }
        if ("设置时间".equals(str2)) {
            str2 = getContext().getString(C0966R.string.f7807s6);
        } else if ("设置地区".equals(str2)) {
            str2 = getContext().getString(C0966R.string.f7806s5);
        } else if ("设置日期".equals(str2)) {
            str2 = getContext().getString(C0966R.string.f7805s4);
        } else if (str2 == null) {
            str2 = "";
        }
        View view5 = this.f65520p;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view7 = this.f65514g;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65513f.setVisibility(0);
        this.f65513f.setText(str2);
    }

    public void setOnResultListener(C22787c cVar) {
        this.f65517j = cVar;
    }

    public void setOnValueUpdateListener(C22788d dVar) {
        this.f65525u = dVar;
    }

    public void setOrientationGetter(C84722b1 b1Var) {
        Log.m105918d("MicroMsg.AppBrand.AppBrandPickerBottomPanelBase", "setOrientationGetter, orientationGetter is " + b1Var.getName());
        this.f65526v = b1Var;
    }

    public void setPickerImpl(C17925e eVar) {
        C17925e eVar2;
        C17925e eVar3 = this.f65511d;
        if (eVar3 != null) {
            eVar3.onDetach(this);
        }
        this.f65511d = eVar;
        if (eVar != null) {
            eVar.onAttach(this);
        }
        if (this.f65512e != null && (eVar2 = this.f65511d) != null && eVar2.getView() != null) {
            this.f65512e.removeAllViews();
            this.f65517j = null;
            this.f65525u = null;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f65512e.addView(this.f65511d.getView(), layoutParams);
        }
    }

    public void setVisibility(int i) {
        if (i != 0) {
            mo35924d(false);
        } else {
            super.setVisibility(i);
        }
    }
}
