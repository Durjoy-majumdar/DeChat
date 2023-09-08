package com.tencent.p014mm.plugin.scanner;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import p200lx.C34410y;
import p200lx.C46899t;
import sx3.C64197v;
import sx3.C77813z;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00010B\u001b\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-B#\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010.\u001a\u00020\u000b¢\u0006\u0004\b,\u0010/J \u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bR2\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0002j\b\u0012\u0004\u0012\u00020\u000e`\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR2\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\"\u0010'\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00061"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/MultiCodeMaskView;", "Landroid/widget/RelativeLayout;", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/scanner/ImageQBarDataBean;", "Lkotlin/collections/ArrayList;", "srcDataList", "Lrx3/b0;", "setCancelView", "Lcom/tencent/mm/plugin/scanner/MultiCodeMaskView$a;", "listener", "setOnMultiCodeMaskViewListener", "", "offSet", "setTopOffset", "Landroid/view/View;", "j", "Ljava/util/ArrayList;", "getMGreenPointViewList", "()Ljava/util/ArrayList;", "setMGreenPointViewList", "(Ljava/util/ArrayList;)V", "mGreenPointViewList", "n", "Lcom/tencent/mm/plugin/scanner/MultiCodeMaskView$a;", "getMMultiCodeMaskViewListener", "()Lcom/tencent/mm/plugin/scanner/MultiCodeMaskView$a;", "setMMultiCodeMaskViewListener", "(Lcom/tencent/mm/plugin/scanner/MultiCodeMaskView$a;)V", "mMultiCodeMaskViewListener", "o", "getMSrcDataList", "setMSrcDataList", "mSrcDataList", "p", "I", "getTopOffSet", "()I", "setTopOffSet", "(I)V", "topOffSet", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "common-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.MultiCodeMaskView */
public final class MultiCodeMaskView extends RelativeLayout {

    /* renamed from: v */
    public static final /* synthetic */ int f116112v = 0;

    /* renamed from: d */
    public final int f116113d = C76577a.m92157h(getContext(), C0966R.dimen.aid);

    /* renamed from: e */
    public final int f116114e = C76577a.m92157h(getContext(), C0966R.dimen.aie);

    /* renamed from: f */
    public final int f116115f = C76577a.m92157h(getContext(), C0966R.dimen.aif);

    /* renamed from: g */
    public final int f116116g = C76577a.m92157h(getContext(), C0966R.dimen.aig);

    /* renamed from: h */
    public final int f116117h = C76577a.m92157h(getContext(), C0966R.dimen.aih);

    /* renamed from: i */
    public final int f116118i = C74942w4.m89784a(getContext(), 32);

    /* renamed from: j */
    public ArrayList<View> f116119j = new ArrayList<>();

    /* renamed from: n */
    public C42884a f116120n;

    /* renamed from: o */
    public ArrayList<ImageQBarDataBean> f116121o = new ArrayList<>();

    /* renamed from: p */
    public int f116122p;

    /* renamed from: q */
    public final MTimerHandler.CallBack f116123q;

    /* renamed from: r */
    public final MTimerHandler f116124r;

    /* renamed from: s */
    public ValueAnimator f116125s;

    /* renamed from: t */
    public AccelerateInterpolator f116126t;

    /* renamed from: u */
    public DecelerateInterpolator f116127u;

    /* renamed from: com.tencent.mm.plugin.scanner.MultiCodeMaskView$a */
    public interface C42884a {
        /* renamed from: a */
        void mo64868a(ArrayList<ImageQBarDataBean> arrayList);

        /* renamed from: b */
        void mo64869b(ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean, boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.scanner.MultiCodeMaskView$b */
    public static final class C42885b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MultiCodeMaskView f116128d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<ImageQBarDataBean> f116129e;

        /* renamed from: f */
        public final /* synthetic */ ImageQBarDataBean f116130f;

        public C42885b(MultiCodeMaskView multiCodeMaskView, ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean) {
            this.f116128d = multiCodeMaskView;
            this.f116129e = arrayList;
            this.f116130f = imageQBarDataBean;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/MultiCodeMaskView$initData$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C42884a mMultiCodeMaskViewListener = this.f116128d.getMMultiCodeMaskViewListener();
            if (mMultiCodeMaskViewListener != null) {
                mMultiCodeMaskViewListener.mo64869b(this.f116129e, this.f116130f, false);
            }
            this.f116128d.mo67038a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/MultiCodeMaskView$initData$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.MultiCodeMaskView$c */
    public static final class C42886c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ MultiCodeMaskView f116131d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<ImageQBarDataBean> f116132e;

        /* renamed from: f */
        public final /* synthetic */ ImageQBarDataBean f116133f;

        public C42886c(MultiCodeMaskView multiCodeMaskView, ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean) {
            this.f116131d = multiCodeMaskView;
            this.f116132e = arrayList;
            this.f116133f = imageQBarDataBean;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C42884a mMultiCodeMaskViewListener = this.f116131d.getMMultiCodeMaskViewListener();
            if (mMultiCodeMaskViewListener != null) {
                mMultiCodeMaskViewListener.mo64869b(this.f116132e, this.f116133f, true);
            }
            this.f116131d.mo67038a();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.MultiCodeMaskView$d */
    public static final class C42887d implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ MultiCodeMaskView f116134d;

        /* renamed from: e */
        public final /* synthetic */ C42890f f116135e;

        /* renamed from: com.tencent.mm.plugin.scanner.MultiCodeMaskView$d$a */
        public static final class C42888a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MultiCodeMaskView f116136d;

            /* renamed from: e */
            public final /* synthetic */ C42890f f116137e;

            public C42888a(MultiCodeMaskView multiCodeMaskView, C42890f fVar) {
                this.f116136d = multiCodeMaskView;
                this.f116137e = fVar;
            }

            public final void run() {
                MultiCodeMaskView multiCodeMaskView = this.f116136d;
                multiCodeMaskView.mo67042e(0.8f, 1.0f, multiCodeMaskView.f116127u, this.f116137e);
            }
        }

        public C42887d(MultiCodeMaskView multiCodeMaskView, C42890f fVar) {
            this.f116134d = multiCodeMaskView;
            this.f116135e = fVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            MMHandlerThread.postToMainThreadDelayed(new C42888a(this.f116134d, this.f116135e), 50);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.MultiCodeMaskView$e */
    public static final class C42889e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ MultiCodeMaskView f116138d;

        public C42889e(MultiCodeMaskView multiCodeMaskView) {
            this.f116138d = multiCodeMaskView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = 0;
            for (T next : this.f116138d.getMGreenPointViewList()) {
                int i2 = i + 1;
                if (i >= 0) {
                    View view = (View) next;
                    view.setScaleX(floatValue);
                    view.setScaleY(floatValue);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.MultiCodeMaskView$f */
    public static final class C42890f implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ int f116139d;

        /* renamed from: e */
        public final /* synthetic */ MultiCodeMaskView f116140e;

        /* renamed from: com.tencent.mm.plugin.scanner.MultiCodeMaskView$f$a */
        public static final class C42891a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f116141d;

            /* renamed from: e */
            public final /* synthetic */ MultiCodeMaskView f116142e;

            public C42891a(int i, MultiCodeMaskView multiCodeMaskView) {
                this.f116141d = i;
                this.f116142e = multiCodeMaskView;
            }

            public final void run() {
                int i = this.f116141d;
                if (i < 2) {
                    int i2 = MultiCodeMaskView.f116112v;
                    this.f116142e.mo67043f(i + 1);
                }
            }
        }

        public C42890f(int i, MultiCodeMaskView multiCodeMaskView) {
            this.f116139d = i;
            this.f116140e = multiCodeMaskView;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            MMHandlerThread.postToMainThreadDelayed(new C42891a(this.f116139d, this.f116140e), 50);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.MultiCodeMaskView$g */
    public static final class C42892g implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ MultiCodeMaskView f116143d;

        public C42892g(MultiCodeMaskView multiCodeMaskView) {
            this.f116143d = multiCodeMaskView;
        }

        public final boolean onTimerExpired() {
            MultiCodeMaskView multiCodeMaskView = this.f116143d;
            int i = MultiCodeMaskView.f116112v;
            multiCodeMaskView.getClass();
            Log.m105918d("MicroMsg.MultiCodeMaskView", "runScaleAnimation");
            multiCodeMaskView.mo67043f(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.MultiCodeMaskView$h */
    public static final class C42893h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MultiCodeMaskView f116144d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<ImageQBarDataBean> f116145e;

        public C42893h(MultiCodeMaskView multiCodeMaskView, ArrayList<ImageQBarDataBean> arrayList) {
            this.f116144d = multiCodeMaskView;
            this.f116145e = arrayList;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/MultiCodeMaskView$setCancelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f116144d.mo67038a();
            C42884a mMultiCodeMaskViewListener = this.f116144d.getMMultiCodeMaskViewListener();
            if (mMultiCodeMaskViewListener != null) {
                mMultiCodeMaskViewListener.mo64868a(this.f116145e);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/MultiCodeMaskView$setCancelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiCodeMaskView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setClickable(true);
        C42892g gVar = new C42892g(this);
        this.f116123q = gVar;
        this.f116124r = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) gVar, true);
        this.f116126t = new AccelerateInterpolator(1.5f);
        this.f116127u = new DecelerateInterpolator(1.5f);
    }

    private final void setCancelView(ArrayList<ImageQBarDataBean> arrayList) {
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.b4e, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…e_mask_cancel_view, null)");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f116114e;
        layoutParams.topMargin = this.f116115f;
        int i = this.f116116g;
        inflate.setPadding(i, i, i, i);
        addView(inflate, layoutParams);
        inflate.setOnClickListener(new C42893h(this, arrayList));
    }

    /* renamed from: a */
    public final void mo67038a() {
        ValueAnimator valueAnimator = this.f116125s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f116125s;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.f116125s;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f116125s = null;
        this.f116124r.stopTimer();
        this.f116119j.clear();
        this.f116121o.clear();
        removeAllViews();
        setVisibility(8);
    }

    /* renamed from: b */
    public final Rect mo67039b(View view, int i) {
        Rect rect = new Rect();
        rect.left = (getRootView().getWidth() / 2) - (view.getMeasuredWidth() / 2);
        rect.top = (i - this.f116117h) - view.getMeasuredHeight();
        rect.right = (getRootView().getWidth() / 2) + (view.getMeasuredWidth() / 2);
        rect.bottom = i - this.f116117h;
        return rect;
    }

    /* renamed from: c */
    public final void mo67040c(ArrayList<ImageQBarDataBean> arrayList, ArrayList<PointF> arrayList2, ArrayList<ImageQBarDataBean> arrayList3, int i) {
        int i2;
        String string;
        ArrayList<ImageQBarDataBean> arrayList4 = arrayList;
        ArrayList<PointF> arrayList5 = arrayList2;
        ArrayList<ImageQBarDataBean> arrayList6 = arrayList3;
        int i3 = i;
        C87412m.m108594g(arrayList4, "srcDataList");
        C87412m.m108594g(arrayList5, "dstPointList");
        C87412m.m108594g(arrayList6, "dataList");
        setVisibility(0);
        removeAllViews();
        this.f116119j.clear();
        this.f116121o.clear();
        this.f116121o.addAll(arrayList4);
        int i4 = this.f116122p;
        if (i4 > 0) {
            if (i3 > i4) {
                i3 -= i4;
            }
            for (PointF pointF : arrayList2) {
                float f = pointF.y;
                float f2 = (float) this.f116122p;
                if (f > f2) {
                    pointF.y = f - f2;
                }
            }
        }
        int size = arrayList2.size();
        int i5 = C0966R.C0970id.j1z;
        int i6 = C0966R.C0971layout.b4q;
        if (size > 1) {
            setBackgroundColor(Color.parseColor("#B3000000"));
            int i7 = 0;
            for (T next : arrayList2) {
                int i8 = i7 + 1;
                if (i7 >= 0) {
                    PointF pointF2 = (PointF) next;
                    View inflate = LayoutInflater.from(getContext()).inflate(i6, (ViewGroup) null);
                    C87412m.m108593f(inflate, "from(context).inflate(R.…_success_mark_view, null)");
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = inflate;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/MultiCodeMaskView", "initData", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/MultiCodeMaskView", "initData", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById = inflate.findViewById(i5);
                    C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                    ((ImageView) findViewById).setImageResource(C0966R.raw.scan_success_mark_dot_with_arrow);
                    int i9 = this.f116113d;
                    addView(inflate, new RelativeLayout.LayoutParams(i9, i9));
                    inflate.setTranslationX(pointF2.x - ((float) this.f116118i));
                    inflate.setTranslationY(pointF2.y - ((float) this.f116118i));
                    ImageQBarDataBean imageQBarDataBean = arrayList6.get(i7);
                    C87412m.m108593f(imageQBarDataBean, "dataList[index]");
                    inflate.setOnClickListener(new C42885b(this, arrayList4, imageQBarDataBean));
                    this.f116119j.add(inflate);
                    i7 = i8;
                    i5 = C0966R.C0970id.j1z;
                    i6 = C0966R.C0971layout.b4q;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            setCancelView(arrayList);
            View inflate2 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.b4f, (ViewGroup) null);
            C87412m.m108592e(inflate2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate2;
            HashSet hashSet = new HashSet();
            String str = "";
            for (ImageQBarDataBean imageQBarDataBean2 : arrayList3) {
                C7335d c = C86312j.m106911c(C34410y.class);
                C87412m.m108591d(c);
                if (((C34410y) c).mo59579h3(imageQBarDataBean2.f273114e, imageQBarDataBean2.f273113d)) {
                    string = getContext().getString(C0966R.string.gxp);
                    C87412m.m108593f(string, "context.getString(R.stri…_mask_view_appbrand_tips)");
                    hashSet.add(Integer.valueOf(imageQBarDataBean2.f273114e));
                } else if (!C5177x.m5205b(imageQBarDataBean2.f273114e)) {
                    string = getContext().getString(C0966R.string.gxs);
                    C87412m.m108593f(string, "context.getString(R.stri…code_mask_view_tiao_tips)");
                    hashSet.add(Integer.valueOf(imageQBarDataBean2.f273114e));
                } else {
                    string = getContext().getString(C0966R.string.gxt);
                    C87412m.m108593f(string, "context.getString(R.stri…_view_two_dimension_tips)");
                    hashSet.add(Integer.valueOf(imageQBarDataBean2.f273114e));
                }
                str = string;
            }
            if (hashSet.size() > 1) {
                str = getContext().getString(C0966R.string.gxr);
                C87412m.m108593f(str, "context.getString(R.stri…ode_mask_view_multi_tips)");
            }
            textView.setText(str);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            layoutParams.bottomMargin = this.f116117h;
            textView.measure(-2, -2);
            Rect b = mo67039b(textView, i3);
            boolean z = false;
            for (PointF pointF3 : arrayList2) {
                Log.m105918d("MicroMsg.MultiCodeMaskView", "isInGreenPointZone:" + pointF3 + "   r:" + this.f116118i);
                float f3 = pointF3.x;
                float f4 = (float) this.f116118i;
                if (!b.contains((int) (f3 - f4), (int) (pointF3.y - f4))) {
                    float f5 = pointF3.x;
                    float f6 = (float) this.f116118i;
                    if (!b.contains((int) (f5 - f6), (int) (pointF3.y + f6))) {
                        float f7 = pointF3.x;
                        float f8 = (float) this.f116118i;
                        if (!b.contains((int) (f7 + f8), (int) (pointF3.y - f8))) {
                            float f9 = pointF3.x;
                            float f15 = (float) this.f116118i;
                            if (!b.contains((int) (f9 + f15), (int) (pointF3.y + f15))) {
                            }
                        }
                    }
                }
                Log.m105924i("MicroMsg.MultiCodeMaskView", "isInGreenPointZone match point:" + pointF3 + "   r:" + this.f116118i);
                z = true;
            }
            Log.m105918d("MicroMsg.MultiCodeMaskView", "isInGreenPointZone   viewRect：" + b + "  " + z);
            if (z) {
                int i15 = this.f116117h;
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList5);
                    C77813z.m93909o(arrayList7, new C42913o());
                    Rect b2 = mo67039b(textView, i3);
                    int i16 = b2.bottom;
                    int i17 = b2.top;
                    Iterator<T> it = arrayList2.iterator();
                    int i18 = i3;
                    int i19 = 0;
                    int i25 = 0;
                    while (it.hasNext()) {
                        T next2 = it.next();
                        int i26 = i19 + 1;
                        if (i19 >= 0) {
                            PointF pointF4 = (PointF) next2;
                            Iterator<T> it4 = it;
                            if ((pointF4.y - ((float) this.f116118i)) - ((float) i25) > ((float) b2.height())) {
                                int abs = Math.abs(i17 - i25);
                                i2 = i16;
                                float abs2 = Math.abs((((float) i16) - pointF4.y) + ((float) this.f116118i));
                                if (((float) abs) < abs2 && abs < i18) {
                                    i15 = (i3 - b2.height()) - i25;
                                    i18 = abs;
                                } else if (abs2 < ((float) i18)) {
                                    i18 = (int) abs2;
                                    i15 = (int) ((((float) i3) - pointF4.y) + ((float) this.f116118i));
                                }
                            } else {
                                i2 = i16;
                            }
                            if (i19 == arrayList2.size() - 1) {
                                float f16 = (float) i3;
                                if ((f16 - pointF4.y) - ((float) this.f116118i) > ((float) b2.height())) {
                                    float abs3 = Math.abs(((float) i17) - (pointF4.y + ((float) this.f116118i)));
                                    if (abs3 < ((float) i18)) {
                                        i18 = (int) abs3;
                                        i15 = (int) (((f16 - pointF4.y) - ((float) this.f116118i)) - ((float) b2.height()));
                                    }
                                }
                            }
                            i25 = (int) (pointF4.y + ((float) this.f116118i));
                            it = it4;
                            i19 = i26;
                            i16 = i2;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    Log.m105918d("MicroMsg.MultiCodeMaskView", "getTipsViewFixBottomMargin:" + i15);
                }
                layoutParams.bottomMargin = i15;
            }
            addView(textView, layoutParams);
            this.f116124r.stopTimer();
            Log.m105919d("MicroMsg.MultiCodeMaskView", "initScaleAnimation period: %d", 3350L);
            this.f116124r.startTimer(0, 3350);
        } else if (arrayList2.size() == 1) {
            setBackgroundColor(0);
            PointF pointF5 = arrayList5.get(0);
            C87412m.m108593f(pointF5, "dstPointList[0]");
            PointF pointF6 = pointF5;
            ImageQBarDataBean imageQBarDataBean3 = arrayList6.get(0);
            C87412m.m108593f(imageQBarDataBean3, "dataList[0]");
            View inflate3 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.b4q, (ViewGroup) null);
            C87412m.m108593f(inflate3, "from(context).inflate(R.…_success_mark_view, null)");
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(inflate3, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/MultiCodeMaskView", "initData", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(inflate3, "com/tencent/mm/plugin/scanner/MultiCodeMaskView", "initData", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = inflate3.findViewById(C0966R.C0970id.j1z);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) findViewById2).setImageResource(C0966R.raw.scan_success_mark_dot);
            int i27 = this.f116113d;
            addView(inflate3, new RelativeLayout.LayoutParams(i27, i27));
            inflate3.setTranslationX(pointF6.x - ((float) this.f116118i));
            inflate3.setTranslationY(pointF6.y - ((float) this.f116118i));
            this.f116119j.add(inflate3);
            mo67042e(0.0f, 1.0f, this.f116127u, new C42886c(this, arrayList4, imageQBarDataBean3));
        }
    }

    /* renamed from: d */
    public final void mo67041d(long j, boolean z) {
        C7335d c = C86312j.m106911c(C46899t.class);
        C87412m.m108591d(c);
        ((C46899t) c).mo71991ls(j, 3, this.f116121o, (ImageQBarDataBean) null, 0, z);
        mo67038a();
    }

    /* renamed from: e */
    public final void mo67042e(float f, float f2, Interpolator interpolator, Animator.AnimatorListener animatorListener) {
        Log.m105919d("MicroMsg.MultiCodeMaskView", "runZoomAnimation from: %f, to: %f", Float.valueOf(f), Float.valueOf(f2));
        ValueAnimator valueAnimator = this.f116125s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f116125s;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.f116125s;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f116125s = null;
        ValueAnimator valueAnimator4 = new ValueAnimator();
        this.f116125s = valueAnimator4;
        valueAnimator4.setFloatValues(new float[]{f, f2});
        valueAnimator4.setInterpolator(interpolator);
        valueAnimator4.setDuration(300);
        valueAnimator4.addUpdateListener(new C42889e(this));
        valueAnimator4.addListener(animatorListener);
        valueAnimator4.start();
    }

    /* renamed from: f */
    public final void mo67043f(int i) {
        Log.m105919d("MicroMsg.MultiCodeMaskView", "runZoomAnimation %d", Integer.valueOf(i));
        mo67042e(1.0f, 0.8f, this.f116126t, new C42887d(this, new C42890f(i, this)));
    }

    public final ArrayList<View> getMGreenPointViewList() {
        return this.f116119j;
    }

    public final C42884a getMMultiCodeMaskViewListener() {
        return this.f116120n;
    }

    public final ArrayList<ImageQBarDataBean> getMSrcDataList() {
        return this.f116121o;
    }

    public final int getTopOffSet() {
        return this.f116122p;
    }

    public final void setMGreenPointViewList(ArrayList<View> arrayList) {
        C87412m.m108594g(arrayList, "<set-?>");
        this.f116119j = arrayList;
    }

    public final void setMMultiCodeMaskViewListener(C42884a aVar) {
        this.f116120n = aVar;
    }

    public final void setMSrcDataList(ArrayList<ImageQBarDataBean> arrayList) {
        C87412m.m108594g(arrayList, "<set-?>");
        this.f116121o = arrayList;
    }

    public final void setOnMultiCodeMaskViewListener(C42884a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f116120n = aVar;
    }

    public final void setTopOffSet(int i) {
        this.f116122p = i;
    }

    public final void setTopOffset(int i) {
        this.f116122p = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiCodeMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setClickable(true);
        C42892g gVar = new C42892g(this);
        this.f116123q = gVar;
        this.f116124r = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) gVar, true);
        this.f116126t = new AccelerateInterpolator(1.5f);
        this.f116127u = new DecelerateInterpolator(1.5f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiCodeMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setClickable(true);
        C42892g gVar = new C42892g(this);
        this.f116123q = gVar;
        this.f116124r = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) gVar, true);
        this.f116126t = new AccelerateInterpolator(1.5f);
        this.f116127u = new DecelerateInterpolator(1.5f);
    }
}
