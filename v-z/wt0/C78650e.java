package wt0;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76901s0;
import p385u2.C111105a;

/* renamed from: wt0.e */
public final class C78650e extends C76901s0 {

    /* renamed from: f */
    public final boolean f230349f;

    /* renamed from: g */
    public final TextView f230350g;

    /* renamed from: h */
    public final ImageView f230351h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C78650e(Context context) {
        this(context, true);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final C78650e mo108614a(CharSequence charSequence) {
        if (!this.f230349f) {
            this.f230350g.setText(charSequence);
            this.f230350g.setContentDescription(charSequence);
            return this;
        }
        if (!(charSequence == null || charSequence.length() == 0)) {
            this.f230350g.setLineSpacing(0.0f, 1.0f);
            this.f230350g.setSpannableFactory(new C78652g(C76577a.m92151b(getContentView().getContext(), 17)));
            this.f230350g.setText(charSequence, TextView.BufferType.SPANNABLE);
            this.f230350g.setVisibility(0);
            getContentView().findViewById(C0966R.C0970id.jkd).setPadding(0, C76577a.m92151b(getContentView().getContext(), 27), 0, 0);
            this.f230350g.setContentDescription(charSequence);
        } else {
            this.f230350g.setVisibility(4);
        }
        return this;
    }

    /* renamed from: b */
    public final void mo108615b(long j) {
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(getContentView().getContext());
        if (castActivityOrNull != null) {
            showAtLocation(castActivityOrNull.findViewById(16908290), 17, 0, 0);
            this.f230350g.requestFocus();
            if (j != MAlarmHandler.NEXT_FIRE_INTERVAL) {
                MMHandlerThread.postToMainThreadDelayed(new C78651f(this), j);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78650e(Context context, boolean z) {
        super(context);
        Context context2 = context;
        boolean z2 = z;
        C87412m.m108594g(context2, "context");
        this.f230349f = z2;
        Drawable drawable = null;
        if (z2) {
            FrameLayout frameLayout = new FrameLayout(context2);
            View.inflate(context2, C0966R.C0971layout.f6471fr, frameLayout);
            setContentView(frameLayout);
            View findViewById = getContentView().findViewById(C0966R.C0970id.i7j);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "<init>", "(Landroid/content/Context;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "<init>", "(Landroid/content/Context;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ImageView imageView = (ImageView) getContentView().findViewById(C0966R.C0970id.f358476fd0);
            this.f230351h = imageView;
            View findViewById2 = getContentView().findViewById(C0966R.C0970id.knx);
            C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.title)");
            this.f230350g = (TextView) findViewById2;
            Object obj = C111105a.f332697a;
            Drawable b = C111105a.C111110c.m151511b(context2, C0966R.C0969drawable.cop);
            if (b != null) {
                b.mutate().setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
                drawable = b;
            }
            C87412m.m108591d(imageView);
            imageView.setVisibility(0);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            View findViewById3 = getContentView().findViewById(C0966R.C0970id.i7j);
            if (findViewById3 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(findViewById3, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context2);
            View.inflate(context2, C0966R.C0971layout.f6470fq, frameLayout2);
            setContentView(frameLayout2);
            View findViewById4 = getContentView().findViewById(C0966R.C0970id.knx);
            C87412m.m108593f(findViewById4, "contentView.findViewById(R.id.title)");
            this.f230350g = (TextView) findViewById4;
            this.f230351h = null;
        }
        setFocusable(true);
        getContentView().setFocusable(true);
        this.f230350g.setFocusable(true);
    }
}
