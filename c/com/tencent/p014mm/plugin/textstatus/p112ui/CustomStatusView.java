package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b03.C39691c;
import b03.C67130e0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import qy2.C63347a;
import rx3.C13598b0;
import rz2.C48201c;
import zp3.C79406f;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR6\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000fR*\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR*\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR\"\u0010-\u001a\u00020*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00067"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/CustomStatusView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "d", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext", "Lkotlin/Function0;", "Lrx3/b0;", "v", "Lfy3/a;", "getExpandListener", "()Lfy3/a;", "setExpandListener", "(Lfy3/a;)V", "expandListener", "w", "getFoldListener", "setFoldListener", "foldListener", "Lkotlin/Function2;", "", "x", "Lfy3/p;", "getConfirmListener", "()Lfy3/p;", "setConfirmListener", "(Lfy3/p;)V", "confirmListener", "y", "getCancelListener", "setCancelListener", "cancelListener", "z", "getShowEmojiPanelListener", "setShowEmojiPanelListener", "showEmojiPanelListener", "A", "getHideEmojiPanelListener", "setHideEmojiPanelListener", "hideEmojiPanelListener", "", "B", "Z", "isExpand", "()Z", "setExpand", "(Z)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.CustomStatusView */
public final class CustomStatusView extends FrameLayout {

    /* renamed from: C */
    public static final /* synthetic */ int f206684C = 0;

    /* renamed from: A */
    public C32224a<C13598b0> f206685A;

    /* renamed from: B */
    public boolean f206686B;

    /* renamed from: d */
    public final Context f206687d;

    /* renamed from: e */
    public final long f206688e;

    /* renamed from: f */
    public final AccelerateInterpolator f206689f;

    /* renamed from: g */
    public MMEditText f206690g;

    /* renamed from: h */
    public View f206691h;

    /* renamed from: i */
    public TextView f206692i;

    /* renamed from: j */
    public TextView f206693j;

    /* renamed from: n */
    public View f206694n;

    /* renamed from: o */
    public ViewGroup f206695o;

    /* renamed from: p */
    public ImageView f206696p;

    /* renamed from: q */
    public View f206697q;

    /* renamed from: r */
    public ViewGroup f206698r;

    /* renamed from: s */
    public View f206699s;

    /* renamed from: t */
    public View f206700t;

    /* renamed from: u */
    public View f206701u;

    /* renamed from: v */
    public C32224a<C13598b0> f206702v;

    /* renamed from: w */
    public C32224a<C13598b0> f206703w;

    /* renamed from: x */
    public C32227p<? super String, ? super String, C13598b0> f206704x;

    /* renamed from: y */
    public C32224a<C13598b0> f206705y;

    /* renamed from: z */
    public C32224a<C13598b0> f206706z;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.CustomStatusView$a */
    public static final class C71360a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ CustomStatusView f206707d;

        /* renamed from: e */
        public final /* synthetic */ Context f206708e;

        /* renamed from: f */
        public final /* synthetic */ View f206709f;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.CustomStatusView$a$a */
        public static final class C71361a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ CustomStatusView f206710d;

            /* renamed from: e */
            public final /* synthetic */ Context f206711e;

            public C71361a(CustomStatusView customStatusView, Context context) {
                this.f206710d = customStatusView;
                this.f206711e = context;
            }

            public final void run() {
                CustomStatusView customStatusView = this.f206710d;
                Context context = this.f206711e;
                int i = CustomStatusView.f206684C;
                customStatusView.getClass();
                Object systemService = context.getSystemService("input_method");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(customStatusView.f206690g, 0);
            }
        }

        public C71360a(CustomStatusView customStatusView, Context context, View view) {
            this.f206707d = customStatusView;
            this.f206708e = context;
            this.f206709f = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Log.m105918d("MicroMsg.TextStatus.CustomStatusView", "expand() setUpdateListener " + valueAnimator.getAnimatedFraction());
            float animatedFraction = valueAnimator.getAnimatedFraction();
            MMEditText mMEditText = this.f206707d.f206690g;
            if (mMEditText != null) {
                mMEditText.setVisibility(0);
            }
            CustomStatusView customStatusView = this.f206707d;
            CustomStatusView.m83879a(customStatusView, customStatusView.f206690g, 0, (int) (((float) C79406f.m96347a(this.f206708e, 48.0f)) * animatedFraction));
            CustomStatusView customStatusView2 = this.f206707d;
            CustomStatusView.m83879a(customStatusView2, customStatusView2.f206695o, 0, (int) (((float) C79406f.m96347a(this.f206708e, 64.0f)) * animatedFraction));
            if (animatedFraction >= 0.5f) {
                if (IStatusIconHelperKt.m39109a().mo62311w()) {
                    View view = this.f206707d.f206694n;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    View view2 = this.f206707d.f206694n;
                    if (view2 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(4);
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                View view3 = this.f206707d.f206697q;
                if (view3 != null) {
                    view3.setBackground(this.f206708e.getDrawable(C0966R.C0969drawable.clz));
                }
                this.f206709f.setBackground(this.f206708e.getDrawable(C0966R.C0969drawable.cm8));
            }
            if (((double) animatedFraction) >= 1.0d) {
                MMEditText mMEditText2 = this.f206707d.f206690g;
                if (mMEditText2 != null) {
                    mMEditText2.requestFocus();
                }
                C119179t tVar = C119157j.f356862d;
                C71361a aVar3 = new C71361a(this.f206707d, this.f206708e);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar3, 50, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.CustomStatusView$b */
    public static final class C71362b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ CustomStatusView f206712d;

        /* renamed from: e */
        public final /* synthetic */ Context f206713e;

        /* renamed from: f */
        public final /* synthetic */ View f206714f;

        public C71362b(CustomStatusView customStatusView, Context context, View view) {
            this.f206712d = customStatusView;
            this.f206713e = context;
            this.f206714f = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Log.m105918d("MicroMsg.TextStatus.CustomStatusView", "fold() setUpdateListener " + valueAnimator.getAnimatedFraction());
            float animatedFraction = valueAnimator.getAnimatedFraction();
            CustomStatusView customStatusView = this.f206712d;
            CustomStatusView.m83879a(customStatusView, customStatusView.f206690g, 0, (int) (((float) C79406f.m96347a(this.f206713e, 48.0f)) - (((float) C79406f.m96347a(this.f206713e, 48.0f)) * animatedFraction)));
            CustomStatusView customStatusView2 = this.f206712d;
            CustomStatusView.m83879a(customStatusView2, customStatusView2.f206695o, 0, (int) (((float) C79406f.m96347a(this.f206713e, 64.0f)) - (((float) C79406f.m96347a(this.f206713e, 64.0f)) * animatedFraction)));
            if (animatedFraction >= 0.5f) {
                View view = this.f206712d.f206694n;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$fold$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$fold$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view3 = this.f206712d.f206697q;
                if (view3 != null) {
                    view3.setBackground((Drawable) null);
                }
                this.f206714f.setBackground(this.f206713e.getDrawable(C0966R.C0969drawable.f357388cm0));
            }
            if (((double) animatedFraction) >= 1.0d) {
                MMEditText mMEditText = this.f206712d.f206690g;
                if (mMEditText != null) {
                    mMEditText.setVisibility(8);
                }
                TextView textView = this.f206712d.f206692i;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "mContext");
    }

    /* renamed from: a */
    public static final void m83879a(CustomStatusView customStatusView, View view, int i, int i2) {
        customStatusView.getClass();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public final void mo98318b() {
        Context context = this.f206687d;
        View view = this.f206691h;
        if (view == null) {
            return;
        }
        if (this.f206686B) {
            Log.m105924i("MicroMsg.TextStatus.CustomStatusView", "expand: isExpand");
            return;
        }
        this.f206686B = true;
        C32224a<C13598b0> aVar = this.f206702v;
        if (aVar != null) {
            aVar.invoke();
        }
        TextView textView = this.f206692i;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ViewGroup viewGroup = this.f206695o;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        mo98320d(this.f206696p, 1.0f, 1.42f);
        ViewGroup viewGroup2 = this.f206698r;
        if (viewGroup2 != null) {
            ViewPropertyAnimator animate = viewGroup2.animate();
            animate.setDuration(this.f206688e);
            animate.setInterpolator(this.f206689f);
            animate.setUpdateListener(new C71360a(this, context, view));
            animate.start();
        }
        View view2 = this.f206699s;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView", "expand", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView", "expand", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public final void mo98319c() {
        Context context = this.f206687d;
        View view = this.f206691h;
        if (view == null) {
            return;
        }
        if (!this.f206686B) {
            Log.m105924i("MicroMsg.TextStatus.CustomStatusView", "fold: is fold");
            return;
        }
        this.f206686B = false;
        C32224a<C13598b0> aVar = this.f206703w;
        if (aVar != null) {
            aVar.invoke();
        }
        ViewGroup viewGroup = this.f206695o;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ImageView imageView = this.f206696p;
        if (imageView != null) {
            mo98320d(imageView, 1.4f, 1.0f);
        }
        ViewGroup viewGroup2 = this.f206698r;
        if (viewGroup2 != null) {
            ViewPropertyAnimator animate = viewGroup2.animate();
            animate.setDuration(this.f206688e);
            animate.setInterpolator(this.f206689f);
            animate.setUpdateListener(new C71362b(this, context, view));
            animate.start();
        }
        View view2 = this.f206699s;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView", "fold", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView", "fold", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: d */
    public final void mo98320d(View view, float f, float f2) {
        if (view != null) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, ((float) view.getWidth()) * 0.5f, ((float) view.getHeight()) * 0.5f);
            scaleAnimation.setInterpolator(this.f206689f);
            scaleAnimation.setDuration(this.f206688e);
            scaleAnimation.setFillAfter(true);
            view.startAnimation(scaleAnimation);
        }
    }

    public final C32224a<C13598b0> getCancelListener() {
        return this.f206705y;
    }

    public final C32227p<String, String, C13598b0> getConfirmListener() {
        return this.f206704x;
    }

    public final C32224a<C13598b0> getExpandListener() {
        return this.f206702v;
    }

    public final C32224a<C13598b0> getFoldListener() {
        return this.f206703w;
    }

    public final C32224a<C13598b0> getHideEmojiPanelListener() {
        return this.f206685A;
    }

    public final Context getMContext() {
        return this.f206687d;
    }

    public final C32224a<C13598b0> getShowEmojiPanelListener() {
        return this.f206706z;
    }

    public final void setCancelListener(C32224a<C13598b0> aVar) {
        this.f206705y = aVar;
    }

    public final void setConfirmListener(C32227p<? super String, ? super String, C13598b0> pVar) {
        this.f206704x = pVar;
    }

    public final void setExpand(boolean z) {
        this.f206686B = z;
    }

    public final void setExpandListener(C32224a<C13598b0> aVar) {
        this.f206702v = aVar;
    }

    public final void setFoldListener(C32224a<C13598b0> aVar) {
        this.f206703w = aVar;
    }

    public final void setHideEmojiPanelListener(C32224a<C13598b0> aVar) {
        this.f206685A = aVar;
    }

    public final void setShowEmojiPanelListener(C32224a<C13598b0> aVar) {
        this.f206706z = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "mContext");
        this.f206687d = context;
        this.f206688e = 300;
        this.f206689f = new AccelerateInterpolator();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.d38, this);
        this.f206691h = inflate;
        if (inflate != null) {
            this.f206698r = (ViewGroup) inflate.findViewById(C0966R.C0970id.nkg);
            MMEditText mMEditText = (MMEditText) inflate.findViewById(C0966R.C0970id.nks);
            this.f206690g = mMEditText;
            C67130e0 e0Var = C67130e0.f192743a;
            e0Var.mo91236b(context, mMEditText, 17.0f);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.nqo);
            this.f206692i = textView;
            e0Var.mo91236b(context, textView, 12.0f);
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.kyk);
            this.f206693j = textView2;
            e0Var.mo91236b(context, textView2, 12.0f);
            this.f206694n = inflate.findViewById(C0966R.C0970id.nfp);
            this.f206695o = (ViewGroup) inflate.findViewById(C0966R.C0970id.f358515no2);
            this.f206696p = (ImageView) inflate.findViewById(C0966R.C0970id.nnr);
            C39691c.m42340S(IStatusIconHelperKt.m39109a(), this.f206696p, "userdefine", (C63347a.C47893d) null, (C63347a.C47891b) null, (C48201c) null, false, false, 124, (Object) null);
            this.f206697q = inflate.findViewById(C0966R.C0970id.ngm);
            this.f206699s = inflate.findViewById(C0966R.C0970id.nkh);
            this.f206700t = inflate.findViewById(C0966R.C0970id.nqp);
            this.f206701u = inflate.findViewById(C0966R.C0970id.n4l);
        }
    }
}
