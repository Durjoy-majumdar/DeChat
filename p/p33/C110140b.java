package p33;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53873d2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import f14.C58901s;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import p196ln.C76705f;
import p196ln.C76708i;
import p206nj.C11171e;
import qe0.C47806g;
import rx3.C13598b0;
import sn0.C90259e;
import w33.C65925a0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: p33.b */
public abstract class C110140b {

    /* renamed from: a */
    public C53973z1 f329505a;

    /* renamed from: b */
    public boolean f329506b;

    /* renamed from: c */
    public volatile C0000n0 f329507c;

    /* renamed from: d */
    public ViewManager f329508d;

    /* renamed from: e */
    public View f329509e;

    /* renamed from: f */
    public Intent f329510f;

    /* renamed from: g */
    public long f329511g;

    /* renamed from: h */
    public int f329512h;

    /* renamed from: i */
    public C110141a f329513i;

    /* renamed from: j */
    public Animator f329514j;

    /* renamed from: k */
    public String f329515k = "";

    /* renamed from: l */
    public boolean f329516l;

    /* renamed from: m */
    public int f329517m;

    /* renamed from: n */
    public int f329518n;

    /* renamed from: o */
    public float f329519o;

    /* renamed from: p */
    public String f329520p = "";

    /* renamed from: q */
    public View f329521q;

    /* renamed from: r */
    public int f329522r;

    /* renamed from: s */
    public final GestureDetector.SimpleOnGestureListener f329523s = new C110146e(this);

    /* renamed from: t */
    public GestureDetector f329524t;

    /* renamed from: u */
    public final C114668z f329525u = new C110143c(this);

    /* renamed from: p33.b$f */
    public static final class C11803f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C110140b f34527d;

        public C11803f(C110140b bVar) {
            this.f34527d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("VoipBaseFloatCardManager", "initView: onReject clicked");
            this.f34527d.mo161550q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: p33.b$g */
    public static final class C11804g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C110140b f34528d;

        /* renamed from: e */
        public final /* synthetic */ Intent f34529e;

        public C11804g(C110140b bVar, Intent intent) {
            this.f34528d = bVar;
            this.f34529e = intent;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("VoipBaseFloatCardManager", "initView: onAccept clicked");
            this.f34528d.mo150887j(this.f34529e);
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: p33.b$i */
    public static final class C11805i implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C110140b f34530d;

        /* renamed from: e */
        public final /* synthetic */ View f34531e;

        public C11805i(C110140b bVar, View view) {
            this.f34530d = bVar;
            this.f34531e = view;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            MotionEvent motionEvent2 = motionEvent;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            if (action == 0) {
                C110140b bVar = this.f34530d;
                ViewGroup.LayoutParams layoutParams = this.f34531e.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                bVar.getClass();
                Log.m105924i("VoipBaseFloatCardManager", "onDown: ");
                bVar.f329519o = motionEvent.getRawY();
                bVar.f329518n = ((WindowManager.LayoutParams) layoutParams).y;
            } else if (action == 1 || action == 3) {
                C110140b bVar2 = this.f34530d;
                bVar2.getClass();
                int g = bVar2.mo161548g(motionEvent.getRawY());
                Log.m105924i("VoipBaseFloatCardManager", "onDragFinish: " + g);
                if (bVar2.f329516l || bVar2.mo161548g(motionEvent.getRawY()) > bVar2.f329518n) {
                    bVar2.f329516l = false;
                } else {
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{bVar2.mo161548g(motionEvent.getRawY()), bVar2.f329518n});
                    View view2 = bVar2.f329509e;
                    if (view2 != null) {
                        ofInt.addListener(new C11813c(g, view2, bVar2));
                        ofInt.addUpdateListener(new C11814d(view2, bVar2));
                    }
                    ofInt.setDuration(300);
                    ofInt.start();
                }
            }
            GestureDetector gestureDetector = this.f34530d.f329524t;
            if (gestureDetector != null) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(motionEvent2);
                GestureDetector gestureDetector2 = gestureDetector;
                C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$6", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
                C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$6", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                z = onTouchEvent;
            } else {
                z = false;
            }
            C117292a.m165362h(z, this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return z;
        }
    }

    /* renamed from: p33.b$j */
    public static final class C11806j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C110140b f34532d;

        public C11806j(C110140b bVar) {
            this.f34532d = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C110140b bVar = this.f34532d;
            View view = bVar.f329509e;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    layoutParams2.y = ((Integer) animatedValue).intValue();
                    ViewManager viewManager = bVar.f329508d;
                    if (viewManager != null) {
                        viewManager.updateViewLayout(view, layoutParams2);
                    }
                }
            }
        }
    }

    /* renamed from: p33.b$k */
    public static final class C11807k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110140b f34533d;

        /* renamed from: e */
        public final /* synthetic */ View f34534e;

        /* renamed from: p33.b$k$a */
        public static final class C11808a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ View f34535d;

            /* renamed from: e */
            public final /* synthetic */ C110140b f34536e;

            public C11808a(View view, C110140b bVar) {
                this.f34535d = view;
                this.f34536e = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams layoutParams = this.f34535d.getLayoutParams();
                WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    C110140b bVar = this.f34536e;
                    View view = this.f34535d;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    layoutParams2.y = ((Integer) animatedValue).intValue();
                    ViewManager viewManager = bVar.f329508d;
                    if (viewManager != null) {
                        viewManager.updateViewLayout(view, layoutParams2);
                    }
                }
            }
        }

        /* renamed from: p33.b$k$b */
        public static final class C11809b extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ View f34537d;

            /* renamed from: e */
            public final /* synthetic */ C110140b f34538e;

            public C11809b(View view, C110140b bVar) {
                this.f34537d = view;
                this.f34538e = bVar;
            }

            public void onAnimationEnd(Animator animator) {
                Context context;
                super.onAnimationEnd(animator);
                C110140b bVar = this.f34538e;
                bVar.f329506b = true;
                String str = null;
                bVar.f329514j = null;
                View view = bVar.f329521q;
                if (view != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f34538e.mo150881a());
                    View view2 = this.f34538e.f329521q;
                    if (!(view2 == null || (context = view2.getContext()) == null)) {
                        str = context.getString(C0966R.string.kh8);
                    }
                    sb.append(str);
                    view.setContentDescription(sb.toString());
                }
                View view3 = this.f34538e.f329521q;
                if (view3 != null) {
                    view3.sendAccessibilityEvent(128);
                }
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                View view = this.f34537d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$showCard$2$1$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$showCard$2$1$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C11807k(C110140b bVar, View view) {
            this.f34533d = bVar;
            this.f34534e = view;
        }

        public final void run() {
            this.f34533d.f329517m = this.f34534e.getMeasuredHeight();
            Animator animator = this.f34533d.f329514j;
            if (animator != null) {
                animator.cancel();
            }
            C110140b bVar = this.f34533d;
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{-bVar.f329517m, 0});
            C110140b bVar2 = this.f34533d;
            View view = this.f34534e;
            View view2 = bVar2.f329509e;
            if (view2 != null) {
                ofInt.addUpdateListener(new C11808a(view2, bVar2));
            }
            ofInt.addListener(new C11809b(view, bVar2));
            ofInt.setDuration(200);
            ofInt.start();
            bVar.f329514j = ofInt;
        }
    }

    /* renamed from: p33.b$l */
    public static final class C11810l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110140b f34539d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f34540e;

        /* renamed from: f */
        public final /* synthetic */ View f34541f;

        /* renamed from: g */
        public final /* synthetic */ ImageView f34542g;

        /* renamed from: h */
        public final /* synthetic */ View f34543h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.voip.floatcard.VoipBaseFloatCardManager$updateBackground$1$1$1", mo125469f = "VoipBaseFloatCardManager.kt", mo125470l = {418}, mo125471m = "invokeSuspend")
        /* renamed from: p33.b$l$a */
        public static final class C11811a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f34544d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f34545e;

            /* renamed from: f */
            public final /* synthetic */ C110140b f34546f;

            /* renamed from: g */
            public final /* synthetic */ View f34547g;

            /* renamed from: h */
            public final /* synthetic */ ImageView f34548h;

            /* renamed from: i */
            public final /* synthetic */ View f34549i;

            @C91590f(mo125468c = "com.tencent.mm.plugin.voip.floatcard.VoipBaseFloatCardManager$updateBackground$1$1$1$1", mo125469f = "VoipBaseFloatCardManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: p33.b$l$a$a */
            public static final class C11812a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ ImageView f34550d;

                /* renamed from: e */
                public final /* synthetic */ View f34551e;

                /* renamed from: f */
                public final /* synthetic */ View f34552f;

                /* renamed from: g */
                public final /* synthetic */ Bitmap f34553g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C11812a(ImageView imageView, View view, View view2, Bitmap bitmap, C15601d<? super C11812a> dVar) {
                    super(2, dVar);
                    this.f34550d = imageView;
                    this.f34551e = view;
                    this.f34552f = view2;
                    this.f34553g = bitmap;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C11812a(this.f34550d, this.f34551e, this.f34552f, this.f34553g, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C11812a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    ImageView imageView = this.f34550d;
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    View view = this.f34552f;
                    layoutParams.width = view.getWidth();
                    layoutParams.height = view.getHeight();
                    imageView.setLayoutParams(layoutParams);
                    View view2 = this.f34551e;
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    View view3 = this.f34552f;
                    layoutParams2.width = view3.getWidth();
                    layoutParams2.height = view3.getHeight();
                    view2.setLayoutParams(layoutParams2);
                    this.f34551e.setBackground(new BitmapDrawable(this.f34552f.getResources(), this.f34553g));
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11811a(Bitmap bitmap, C110140b bVar, View view, ImageView imageView, View view2, C15601d<? super C11811a> dVar) {
                super(2, dVar);
                this.f34545e = bitmap;
                this.f34546f = bVar;
                this.f34547g = view;
                this.f34548h = imageView;
                this.f34549i = view2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C11811a(this.f34545e, this.f34546f, this.f34547g, this.f34548h, this.f34549i, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C11811a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f34544d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Bitmap bitmap = this.f34545e;
                    Bitmap bitmap2 = null;
                    if (bitmap != null) {
                        C110140b bVar = this.f34546f;
                        View view = this.f34547g;
                        int width = view.getWidth();
                        int height = view.getHeight();
                        bVar.getClass();
                        Bitmap createBitmap = BitmapUtil.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        if (createBitmap != null) {
                            Bitmap fastblur = BitmapUtil.fastblur(bitmap, 3);
                            if (width > 0 && fastblur != null) {
                                Bitmap centerCropBitmap = BitmapUtil.getCenterCropBitmap(fastblur, fastblur.getWidth(), (height * fastblur.getWidth()) / width, true);
                                Canvas canvas = new Canvas(createBitmap);
                                canvas.drawBitmap(centerCropBitmap, (Rect) null, new Rect(0, 0, canvas.getWidth(), canvas.getHeight()), (Paint) null);
                            }
                            bitmap2 = createBitmap;
                        }
                    }
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53915k2 k2Var = C58901s.f168555a;
                    C11812a aVar2 = new C11812a(this.f34548h, this.f34549i, this.f34547g, bitmap2, (C15601d<? super C11812a>) null);
                    this.f34544d = 1;
                    if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        public C11810l(C110140b bVar, Bitmap bitmap, View view, ImageView imageView, View view2) {
            this.f34539d = bVar;
            this.f34540e = bitmap;
            this.f34541f = view;
            this.f34542g = imageView;
            this.f34543h = view2;
        }

        public final void run() {
            C0000n0 n0Var = this.f34539d.f329507c;
            if (n0Var != null) {
                C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C11811a(this.f34540e, this.f34539d, this.f34541f, this.f34542g, this.f34543h, (C15601d<? super C11811a>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: p33.b$b */
    public static final class C89313b implements ViewManager {

        /* renamed from: d */
        public final WindowManager f257266d;

        public C89313b(WindowManager windowManager) {
            C87412m.m108594g(windowManager, "windowManager");
            this.f257266d = windowManager;
        }

        public void addView(View view, ViewGroup.LayoutParams layoutParams) {
            Log.m105924i("VoipBaseFloatCardManager", "addView() called with: view = " + view + ", params = " + layoutParams);
            try {
                this.f257266d.addView(view, layoutParams);
            } catch (Exception e) {
                Log.m105921e("VoipBaseFloatCardManager", "addView: ", e);
            }
        }

        public void removeView(View view) {
            Log.m105924i("VoipBaseFloatCardManager", "removeView() called with: view = " + view);
            try {
                this.f257266d.removeView(view);
            } catch (Exception e) {
                Log.m105921e("VoipBaseFloatCardManager", "updateViewLayout: ", e);
            }
        }

        public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
            Log.m105924i("VoipBaseFloatCardManager", "updateViewLayout() called with: view = " + view + ", params = " + layoutParams);
            try {
                this.f257266d.updateViewLayout(view, layoutParams);
            } catch (Exception e) {
                Log.m105921e("VoipBaseFloatCardManager", "updateViewLayout: ", e);
            }
        }
    }

    /* renamed from: p33.b$a */
    public static final class C110141a {

        /* renamed from: a */
        public String[] f329526a;

        /* renamed from: b */
        public String[] f329527b;

        /* renamed from: c */
        public TextView f329528c;

        /* renamed from: d */
        public int f329529d;

        /* renamed from: e */
        public int f329530e;

        /* renamed from: f */
        public MTimerHandler f329531f;

        /* renamed from: p33.b$a$a */
        public static final class C110142a implements MTimerHandler.CallBack {

            /* renamed from: d */
            public final /* synthetic */ C110141a f329532d;

            public C110142a(C110141a aVar) {
                this.f329532d = aVar;
            }

            public final boolean onTimerExpired() {
                C110141a aVar = this.f329532d;
                TextView textView = aVar.f329528c;
                if (textView != null) {
                    String[] strArr = aVar.f329526a;
                    textView.setText(strArr[aVar.f329530e % strArr.length]);
                }
                this.f329532d.f329530e++;
                return true;
            }
        }

        public C110141a() {
            String[] strArr = new String[1];
            for (int i = 0; i < 1; i++) {
                strArr[i] = "";
            }
            this.f329526a = strArr;
            this.f329527b = new String[]{"...", "", ".", ".."};
            this.f329531f = new MTimerHandler(new C110142a(this), true);
        }

        /* renamed from: a */
        public final void mo161554a(TextView textView, String str, int i) {
            C87412m.m108594g(textView, "tv");
            C87412m.m108594g(str, "baseStr");
            mo161555b();
            this.f329530e = 0;
            this.f329528c = textView;
            this.f329529d = i;
            String[] strArr = this.f329527b;
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str2 : strArr) {
                arrayList.add(str + str2);
            }
            Object[] array = arrayList.toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            this.f329526a = (String[]) array;
            MTimerHandler mTimerHandler = this.f329531f;
            if (mTimerHandler != null) {
                C87412m.m108591d(mTimerHandler);
                mTimerHandler.startTimer((long) this.f329529d);
            }
            Log.printDebugStack("MicroMsg.DynamicTextWrap", "start textview:" + textView, new Object[0]);
        }

        /* renamed from: b */
        public final void mo161555b() {
            MTimerHandler mTimerHandler = this.f329531f;
            if (mTimerHandler != null) {
                C87412m.m108591d(mTimerHandler);
                mTimerHandler.stopTimer();
            }
            Log.printDebugStack("MicroMsg.DynamicTextWrap", "stop textview: " + this.f329528c, new Object[0]);
            this.f329528c = null;
        }
    }

    /* renamed from: p33.b$c */
    public static final class C110143c implements C114668z {

        /* renamed from: d */
        public final /* synthetic */ C110140b f329533d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.voip.floatcard.VoipBaseFloatCardManager$appForegroundDelegateListener$1$onAppBackground$1", mo125469f = "VoipBaseFloatCardManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: p33.b$c$a */
        public static final class C110144a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C110140b f329534d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C110144a(C110140b bVar, C15601d<? super C110144a> dVar) {
                super(2, dVar);
                this.f329534d = bVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C110144a(this.f329534d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C110144a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C110140b bVar = this.f329534d;
                if (bVar.f329509e != null) {
                    bVar.mo150885h();
                }
                return C13598b0.f38549a;
            }
        }

        public C110143c(C110140b bVar) {
            this.f329533d = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r0 = r0.getContext();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAppBackground(java.lang.String r10) {
            /*
                r9 = this;
                java.lang.String r10 = "VoipBaseFloatCardManager"
                java.lang.String r0 = "onAppBackground: "
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                p33.b r0 = r9.f329533d
                android.view.View r0 = r0.f329509e
                r1 = 0
                if (r0 == 0) goto L_0x001b
                android.content.Context r0 = r0.getContext()
                if (r0 == 0) goto L_0x001b
                java.lang.String r2 = "power"
                java.lang.Object r0 = r0.getSystemService(r2)
                goto L_0x001c
            L_0x001b:
                r0 = r1
            L_0x001c:
                boolean r2 = r0 instanceof android.os.PowerManager
                if (r2 == 0) goto L_0x0023
                android.os.PowerManager r0 = (android.os.PowerManager) r0
                goto L_0x0024
            L_0x0023:
                r0 = r1
            L_0x0024:
                if (r0 == 0) goto L_0x002b
                boolean r0 = r0.isInteractive()
                goto L_0x002c
            L_0x002b:
                r0 = 1
            L_0x002c:
                if (r0 == 0) goto L_0x004c
                java.lang.String r0 = "onAppBackground: hideCard"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                p33.b r10 = r9.f329533d
                int r0 = r10.f329522r
                r2 = 3
                if (r0 == r2) goto L_0x0051
                a14.s1 r3 = a14.C0001s1.f0d
                a14.h0 r0 = a14.C53872d1.f151117a
                a14.k2 r4 = f14.C58901s.f168555a
                r5 = 0
                p33.b$c$a r6 = new p33.b$c$a
                r6.<init>(r10, r1)
                r7 = 2
                r8 = 0
                a14.C53895h.m60466d(r3, r4, r5, r6, r7, r8)
                goto L_0x0051
            L_0x004c:
                p33.b r10 = r9.f329533d
                r10.mo150888k()
            L_0x0051:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p33.C110140b.C110143c.onAppBackground(java.lang.String):void");
        }

        public void onAppForeground(String str) {
        }
    }

    /* renamed from: p33.b$d */
    public static final class C110145d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ View f329535d;

        /* renamed from: e */
        public final /* synthetic */ C110140b f329536e;

        /* renamed from: f */
        public final /* synthetic */ boolean f329537f;

        public C110145d(View view, C110140b bVar, boolean z) {
            this.f329535d = view;
            this.f329536e = bVar;
            this.f329537f = z;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f329535d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$dismissCard$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$dismissCard$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ViewManager viewManager = this.f329536e.f329508d;
            if (viewManager != null) {
                viewManager.removeView(this.f329535d);
            }
            C65925a0 a0Var = C65925a0.f189525a;
            C65925a0.C65926a aVar2 = C65925a0.f189527c;
            if (aVar2.f189531d == 1) {
                aVar2.f189529b = 1;
            }
            if (this.f329537f) {
                this.f329536e.mo161551r(this.f329535d);
            }
            C110140b bVar = this.f329536e;
            bVar.f329508d = null;
            bVar.f329514j = null;
            bVar.f329506b = false;
        }
    }

    /* renamed from: p33.b$e */
    public static final class C110146e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ C110140b f329538d;

        /* renamed from: p33.b$e$a */
        public static final class C110147a implements Animator.AnimatorListener {

            /* renamed from: d */
            public final /* synthetic */ C110140b f329539d;

            public C110147a(C110140b bVar) {
                this.f329539d = bVar;
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                C110140b.m149726c(this.f329539d, true, false, false, 2, (Object) null);
                this.f329539d.mo150889m();
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        /* renamed from: p33.b$e$b */
        public static final class C110148b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ WindowManager.LayoutParams f329540d;

            /* renamed from: e */
            public final /* synthetic */ C110140b f329541e;

            /* renamed from: f */
            public final /* synthetic */ View f329542f;

            public C110148b(WindowManager.LayoutParams layoutParams, C110140b bVar, View view) {
                this.f329540d = layoutParams;
                this.f329541e = bVar;
                this.f329542f = view;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                WindowManager.LayoutParams layoutParams = this.f329540d;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.y = ((Integer) animatedValue).intValue();
                ViewManager viewManager = this.f329541e.f329508d;
                if (viewManager != null) {
                    viewManager.updateViewLayout(this.f329542f, this.f329540d);
                }
            }
        }

        public C110146e(C110140b bVar) {
            this.f329538d = bVar;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Log.m105924i("VoipBaseFloatCardManager", "onFling: " + this.f329538d.f329516l + ' ' + f2);
            if (f2 < 0.0f && motionEvent2 != null) {
                C110140b bVar = this.f329538d;
                if (bVar.f329522r != 3) {
                    bVar.f329516l = true;
                    View view = bVar.f329509e;
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{bVar.mo161548g(motionEvent2.getRawY()), -((int) (bVar.f329519o + ((float) view.getHeight())))});
                            ofInt.addListener(new C110147a(bVar));
                            ofInt.addUpdateListener(new C110148b(layoutParams2, bVar, view));
                            ofInt.setDuration(300);
                            ofInt.start();
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent2 == null) {
                return false;
            }
            Log.m105924i("VoipBaseFloatCardManager", "onScroll, distanceY: " + f2);
            if (Math.abs(f2) <= 2.0f) {
                return false;
            }
            C110140b bVar = this.f329538d;
            View view = bVar.f329509e;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.y = Math.min(bVar.mo161548g(motionEvent2.getRawY()), bVar.f329518n);
                    ViewManager viewManager = bVar.f329508d;
                    if (viewManager != null) {
                        viewManager.updateViewLayout(view, layoutParams2);
                    }
                }
            }
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            Log.m105924i("VoipBaseFloatCardManager", "onSingleTapConfirmed: ");
            C110140b bVar = this.f329538d;
            Intent intent = bVar.f329510f;
            if (intent == null) {
                return true;
            }
            bVar.mo150890n(intent);
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: p33.b$h */
    public static final class C110149h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110140b f329543d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f329544e;

        /* renamed from: f */
        public final /* synthetic */ View f329545f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.voip.floatcard.VoipBaseFloatCardManager$initView$1$5$1", mo125469f = "VoipBaseFloatCardManager.kt", mo125470l = {375}, mo125471m = "invokeSuspend")
        /* renamed from: p33.b$h$a */
        public static final class C110150a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f329546d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f329547e;

            /* renamed from: f */
            public final /* synthetic */ View f329548f;

            @C91590f(mo125468c = "com.tencent.mm.plugin.voip.floatcard.VoipBaseFloatCardManager$initView$1$5$1$1", mo125469f = "VoipBaseFloatCardManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: p33.b$h$a$a */
            public static final class C110151a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ ImageView f329549d;

                /* renamed from: e */
                public final /* synthetic */ View f329550e;

                /* renamed from: f */
                public final /* synthetic */ Bitmap f329551f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C110151a(ImageView imageView, View view, Bitmap bitmap, C15601d<? super C110151a> dVar) {
                    super(2, dVar);
                    this.f329549d = imageView;
                    this.f329550e = view;
                    this.f329551f = bitmap;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C110151a(this.f329549d, this.f329550e, this.f329551f, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C110151a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    ImageView imageView = this.f329549d;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f329550e.getResources(), this.f329551f);
                    bitmapDrawable.setAlpha(230);
                    bitmapDrawable.setFilterBitmap(true);
                    imageView.setBackground(bitmapDrawable);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C110150a(ImageView imageView, View view, C15601d<? super C110150a> dVar) {
                super(2, dVar);
                this.f329547e = imageView;
                this.f329548f = view;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C110150a(this.f329547e, this.f329548f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C110150a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f329546d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Bitmap bitmapNative = BitmapUtil.getBitmapNative((int) C0966R.C0969drawable.ced, this.f329547e.getWidth(), this.f329547e.getHeight());
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53915k2 k2Var = C58901s.f168555a;
                    C110151a aVar2 = new C110151a(this.f329547e, this.f329548f, bitmapNative, (C15601d<? super C110151a>) null);
                    this.f329546d = 1;
                    if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        public C110149h(C110140b bVar, ImageView imageView, View view) {
            this.f329543d = bVar;
            this.f329544e = imageView;
            this.f329545f = view;
        }

        public final void run() {
            C0000n0 n0Var = this.f329543d.f329507c;
            if (n0Var != null) {
                C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C110150a(this.f329544e, this.f329545f, (C15601d<? super C110150a>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m149726c(C110140b bVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            if ((i & 4) != 0) {
                z3 = true;
            }
            bVar.mo150882b(z, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismissCard");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r1 = (r1 = r1.mo96097Ni()).get(r3.f329515k);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo150881a() {
        /*
            r3 = this;
            java.lang.Class<d62.i> r0 = d62.C75339i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            d62.i r0 = (d62.C75339i) r0
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            if (r1 == 0) goto L_0x0025
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            if (r1 == 0) goto L_0x0025
            java.lang.String r2 = r3.f329515k
            com.tencent.mm.storage.z1 r1 = r1.get(r2)
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = r1.getUsername()
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            java.lang.String r0 = r0.getDisplayName(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r3.f329520p
            r1.append(r0)
            r0 = 44
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p33.C110140b.mo150881a():java.lang.String");
    }

    /* renamed from: b */
    public void mo150882b(boolean z, boolean z2, boolean z3) {
        Log.m105924i("VoipBaseFloatCardManager", "dismissCard() called with: quickHide = " + z + ", releaseViewAndIntent = " + z2);
        AppForegroundDelegate.INSTANCE.mo174215k(this.f329525u);
        C65925a0 a0Var = C65925a0.f189525a;
        C65925a0.C65926a aVar = C65925a0.f189527c;
        if (aVar.f189531d == 1) {
            aVar.f189528a = 1;
            aVar.f189532e = System.currentTimeMillis() - C65925a0.f189526b;
        }
        View view = this.f329509e;
        if (view != null) {
            if (z) {
                ViewManager viewManager = this.f329508d;
                if (viewManager != null) {
                    viewManager.removeView(view);
                }
                C65925a0.C65926a aVar2 = C65925a0.f189527c;
                if (aVar2.f189531d == 1) {
                    aVar2.f189529b = 1;
                }
                this.f329508d = null;
                if (z2) {
                    mo161551r(view);
                }
            } else {
                Animator animator = this.f329514j;
                if (animator != null) {
                    animator.cancel();
                }
                Animator l = mo161549l();
                l.addListener(new C110145d(view, this, z2));
                l.setDuration(200);
                l.start();
                this.f329514j = l;
            }
        }
        this.f329516l = false;
        C110141a aVar3 = this.f329513i;
        if (aVar3 != null) {
            aVar3.mo161555b();
        }
        this.f329513i = null;
        this.f329507c = null;
        C53973z1 z1Var = this.f329505a;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f329505a = null;
        this.f329515k = "";
    }

    /* renamed from: d */
    public abstract int mo150883d();

    /* renamed from: e */
    public int mo161547e() {
        return C0966R.C0971layout.d4s;
    }

    /* renamed from: f */
    public abstract int mo150884f();

    /* renamed from: g */
    public final int mo161548g(float f) {
        return this.f329518n + ((int) (f - this.f329519o));
    }

    /* renamed from: h */
    public void mo150885h() {
        Log.m105924i("VoipBaseFloatCardManager", "hideCard() called");
        m149726c(this, true, false, false, 2, (Object) null);
        this.f329506b = false;
    }

    /* renamed from: i */
    public void mo150886i(Intent intent, String str) {
        TextView textView;
        Class cls = C75700k0.class;
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "toUser");
        Log.m105924i("VoipBaseFloatCardManager", "initView: ");
        View view = this.f329509e;
        if (view != null) {
            String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str).getUsername());
            this.f329515k = str;
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
            this.f329521q = view.findViewById(C0966R.C0970id.ead);
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.f358874hk1);
            if (textView2 != null) {
                textView2.setText(displayName);
            }
            String a = C47806g.m53116a(z1Var);
            if (!TextUtils.isEmpty(a) && (textView = (TextView) view.findViewById(C0966R.C0970id.f358874hk1)) != null) {
                SpannableString spannableString = new SpannableString(displayName + ' ' + a);
                spannableString.setSpan(new ForegroundColorSpan(view.getResources().getColor(C0966R.color.a7s)), displayName.length() + 1, spannableString.length(), 33);
                textView.setText(spannableString);
            }
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.hjk);
            if (imageView != null) {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, str);
                TextView textView3 = (TextView) view.findViewById(C0966R.C0970id.hjz);
                if (textView3 != null) {
                    int f = mo150884f();
                    textView3.setText(f);
                    this.f329520p = textView3.getText().toString();
                    if (this.f329513i == null) {
                        this.f329513i = new C110141a();
                    }
                    C110141a aVar = this.f329513i;
                    if (aVar != null) {
                        aVar.mo161555b();
                    }
                    C110141a aVar2 = this.f329513i;
                    if (aVar2 != null) {
                        String string = view.getResources().getString(f);
                        C87412m.m108593f(string, "resources.getString(text)");
                        aVar2.mo161554a(textView3, string, 500);
                    }
                }
                View findViewById = view.findViewById(C0966R.C0970id.hjx);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C11803f(this));
                }
                View findViewById2 = view.findViewById(C0966R.C0970id.hjj);
                if (findViewById2 != null) {
                    findViewById2.setBackground(findViewById2.getResources().getDrawable(mo150883d()));
                    findViewById2.setOnClickListener(new C11804g(this, intent));
                }
                ImageView imageView2 = (ImageView) view.findViewById(C0966R.C0970id.hjt);
                if (imageView2 != null) {
                    imageView2.post(new C110149h(this, imageView2, view));
                    mo161553t();
                    view.setOnTouchListener(new C11805i(this, view));
                }
            }
        }
    }

    /* renamed from: j */
    public abstract void mo150887j(Intent intent);

    /* renamed from: k */
    public void mo150888k() {
    }

    /* renamed from: l */
    public Animator mo161549l() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, -this.f329517m});
        ofInt.addUpdateListener(new C11806j(this));
        ofInt.setDuration(200);
        ofInt.start();
        return ofInt;
    }

    /* renamed from: m */
    public abstract void mo150889m();

    /* renamed from: n */
    public abstract void mo150890n(Intent intent);

    /* renamed from: o */
    public abstract void mo150891o();

    /* renamed from: p */
    public abstract void mo150892p();

    /* renamed from: q */
    public void mo161550q() {
        m149726c(this, false, false, false, 3, (Object) null);
        mo150892p();
    }

    /* renamed from: r */
    public final void mo161551r(View view) {
        C87412m.m108594g(view, "view");
        Log.m105924i("VoipBaseFloatCardManager", "releaseViewAndIntent: view: " + view + " floatView: " + this.f329509e);
        if (C87412m.m108589b(this.f329509e, view)) {
            this.f329510f = null;
            this.f329509e = null;
            this.f329521q = null;
        }
    }

    /* renamed from: s */
    public final void mo161552s(Context context, Intent intent, long j, int i, String str, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "toUser");
        Log.m105924i("VoipBaseFloatCardManager", "showCard() called with: context = " + context + ", intent = " + intent + ", roomKey = " + j + ", toUser = " + str + ", quickShow = " + z + " and roomId=" + i);
        this.f329511g = j;
        this.f329512h = i;
        AppForegroundDelegate.INSTANCE.mo174208a(this.f329525u);
        if (this.f329505a == null) {
            C0002w a = C53873d2.m60389a((C53973z1) null, 1, (Object) null);
            this.f329507c = C53930o0.m60554a(C53872d1.f151119c.plus(a));
            this.f329505a = a;
        }
        if (this.f329508d == null) {
            Object systemService = context.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f329508d = new C89313b((WindowManager) systemService);
        }
        if (this.f329509e == null) {
            this.f329524t = new GestureDetector(context, this.f329523s);
            this.f329509e = LayoutInflater.from(context).inflate(mo161547e(), (ViewGroup) null, false);
        }
        this.f329510f = intent;
        mo150886i(intent, str);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = C11171e.m11046c(26) ? 2038 : 2002;
        layoutParams.flags = 2621992;
        layoutParams.format = -3;
        layoutParams.packageName = context.getPackageName();
        layoutParams.gravity = 49;
        layoutParams.width = -1;
        layoutParams.height = -2;
        View view = this.f329509e;
        if (view == null) {
            return;
        }
        if (z) {
            ViewManager viewManager = this.f329508d;
            if (viewManager != null) {
                viewManager.addView(view, layoutParams);
                return;
            }
            return;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager", "showCard", "(Landroid/content/Context;Landroid/content/Intent;JILjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager", "showCard", "(Landroid/content/Context;Landroid/content/Intent;JILjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ViewManager viewManager2 = this.f329508d;
        if (viewManager2 != null) {
            viewManager2.addView(view, layoutParams);
        }
        view.post(new C11807k(this, view));
    }

    /* renamed from: t */
    public final void mo161553t() {
        View view;
        if (!(this.f329515k.length() == 0) && (view = this.f329509e) != null) {
            view.post(new C11810l(this, ((C76708i) C86312j.m106911c(C76708i.class)).mo106840jC(this.f329515k, false, 0), view, (ImageView) view.findViewById(C0966R.C0970id.hjt), view.findViewById(C0966R.C0970id.hjm)));
        }
    }
}
