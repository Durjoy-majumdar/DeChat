package gt0;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Vibrator;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$d$$a;
import com.tencent.p014mm.plugin.appbrand.utils.html.C84746b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p385u2.C111105a;
import p849e3.C107166a;
import p849e3.C107207u;

/* renamed from: gt0.h */
public final class C87350h implements C87374n0 {

    /* renamed from: d */
    public final Context f253165d;

    /* renamed from: e */
    public final View f253166e;

    /* renamed from: f */
    public View f253167f;

    /* renamed from: g */
    public TextView f253168g;

    /* renamed from: h */
    public CheckBox f253169h;

    /* renamed from: i */
    public View f253170i;

    /* renamed from: j */
    public C40469j0 f253171j;

    /* renamed from: n */
    public boolean f253172n;

    /* renamed from: o */
    public C87381r0 f253173o;

    /* renamed from: gt0.h$a */
    public static final class C87351a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C87350h f253174d;

        public C87351a(C87350h hVar) {
            this.f253174d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeUserAgreementComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckBox checkBox = this.f253174d.f253169h;
            checkBox.setChecked(!checkBox.isChecked());
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeUserAgreementComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: gt0.h$b */
    public static final class C87352b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C87350h f253175d;

        public C87352b(C87350h hVar) {
            this.f253175d = hVar;
        }

        public void onGlobalLayout() {
            int lineHeight = this.f253175d.f253168g.getLineHeight();
            int height = this.f253175d.f253169h.getHeight();
            if (lineHeight > height) {
                if (this.f253175d.f253170i.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.LayoutParams layoutParams = this.f253175d.f253170i.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (lineHeight - height) / 2;
                }
            } else if (this.f253175d.f253168g.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams2 = this.f253175d.f253168g.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (height - lineHeight) / 2;
            }
            this.f253175d.f253168g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: gt0.h$c */
    public static final class C87353c implements C84746b.C40567a {

        /* renamed from: a */
        public final /* synthetic */ C87350h f253176a;

        public C87353c(C87350h hVar) {
            this.f253176a = hVar;
        }

        /* renamed from: a */
        public final void mo63415a(String str) {
            C87350h hVar = this.f253176a;
            C40469j0 j0Var = hVar.f253171j;
            if (j0Var != null) {
                j0Var.mo56167JF(hVar.f253165d, str, "", (C40469j0.C40470a) null);
            }
        }
    }

    public C87350h(Context context, View view) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "view");
        this.f253165d = context;
        this.f253166e = view;
        this.f253167f = view.findViewById(C0966R.C0970id.l1t);
        this.f253168g = (TextView) view.findViewById(C0966R.C0970id.l1s);
        this.f253169h = (CheckBox) view.findViewById(C0966R.C0970id.l1q);
        this.f253170i = view.findViewById(C0966R.C0970id.l1r);
        this.f253167f.setOnClickListener(new C87351a(this));
        this.f253168g.getViewTreeObserver().addOnGlobalLayoutListener(new C87352b(this));
    }

    /* renamed from: a */
    public boolean mo121760a() {
        if (!this.f253172n) {
            return false;
        }
        if (this.f253169h.isChecked()) {
            return true;
        }
        int dimensionPixelOffset = this.f253165d.getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
        float f = (float) dimensionPixelOffset;
        float f2 = -f;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f253166e, "translationX", new float[]{0.0f, f2, f, f2, 0.0f}).setDuration(300);
        C87412m.m108593f(duration, "ofFloat(\n            vie…       ).setDuration(300)");
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
        if (C111105a.m151499a(MMApplicationContext.getContext(), "android.permission.VIBRATE") == 0) {
            Object systemService = MMApplicationContext.getContext().getSystemService("vibrator");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) systemService).vibrate(100);
        }
        C87381r0 r0Var = this.f253173o;
        if (r0Var != null) {
            ((JsApiAuthorize$AuthorizeTask$$d$$a) r0Var).f240792a.f80377c = true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo121761b() {
        return this.f253172n && this.f253166e.getVisibility() == 0;
    }

    /* renamed from: c */
    public final boolean mo121762c() {
        return this.f253167f.getVisibility() == 0 && this.f253169h.isChecked();
    }

    public void setIExternalToolsHelper(C40469j0 j0Var) {
        this.f253171j = j0Var;
    }

    public void setUserAgreementCheckBoxWording(String str) {
        C87412m.m108594g(str, "wording");
        if (!(str.length() == 0)) {
            if (this.f253166e.getVisibility() != 0) {
                View view = this.f253166e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeUserAgreementComponent", "ensureUserAgreementLayoutVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeUserAgreementComponent", "ensureUserAgreementLayoutVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f253168g.setText(C84746b.m104407a(str, false, new C87353c(this)));
            this.f253168g.setMovementMethod(LinkMovementMethod.getInstance());
            this.f253168g.setLinkTextColor(C111105a.m151500b(this.f253165d, C0966R.color.f2958ae));
            TextView textView = this.f253168g;
            View.AccessibilityDelegate c = C107207u.m145162c(textView);
            C107166a aVar2 = c == null ? null : c instanceof C107166a.C107167a ? ((C107166a.C107167a) c).f320754a : new C107166a(c);
            if (aVar2 == null) {
                aVar2 = new C107166a();
            }
            C107207u.m145168i(textView, aVar2);
            this.f253172n = true;
        }
    }

    public void setUserAgreementCheckedAlertListener(C87381r0 r0Var) {
        this.f253173o = r0Var;
    }
}
