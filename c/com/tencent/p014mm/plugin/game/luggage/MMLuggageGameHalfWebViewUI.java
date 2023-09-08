package com.tencent.p014mm.plugin.game.luggage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.game.luggage.page.C41944c;
import com.tencent.p014mm.plugin.game.luggage.page.C41945d;
import com.tencent.p014mm.plugin.game.luggage.page.C41962j;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C88989a;
import p828wa.C53118n;
import p828wa.C53133t;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/MMLuggageGameHalfWebViewUI;", "Lcom/tencent/mm/plugin/game/luggage/MMLuggageGameWebViewUI;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI */
public final class MMLuggageGameHalfWebViewUI extends MMLuggageGameWebViewUI {

    /* renamed from: h */
    public final C13601g f112871h = C36568h.m40985a(new C41890a(this));

    /* renamed from: i */
    public int f112872i;

    /* renamed from: j */
    public boolean f112873j = true;

    /* renamed from: n */
    public final C13601g f112874n = C36568h.m40985a(new C41893c(this));

    /* renamed from: o */
    public final C13601g f112875o = C36568h.m40985a(new C41894d(this));

    /* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI$a */
    public static final class C41890a extends C87413o implements C32224a<Double> {

        /* renamed from: d */
        public final /* synthetic */ MMLuggageGameHalfWebViewUI f112876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41890a(MMLuggageGameHalfWebViewUI mMLuggageGameHalfWebViewUI) {
            super(0);
            this.f112876d = mMLuggageGameHalfWebViewUI;
        }

        public Object invoke() {
            return Double.valueOf(((double) C76577a.m92159j(this.f112876d)) * 1.0d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI$b */
    public static final class C41891b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMLuggageGameHalfWebViewUI f112877d;

        /* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI$b$a */
        public static final class C41892a extends AnimatorListenerAdapter {
            public void onAnimationEnd(Animator animator) {
            }
        }

        public C41891b(MMLuggageGameHalfWebViewUI mMLuggageGameHalfWebViewUI) {
            this.f112877d = mMLuggageGameHalfWebViewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/luggage/MMLuggageGameHalfWebViewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FrameLayout frameLayout = this.f112877d.f112880d.f148203c;
            ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, "translationY", new float[]{frameLayout.getTranslationY(), this.f112877d.f112880d.f148203c.getTranslationY() + ((float) this.f112877d.f112872i)}).setDuration(200);
            duration.addListener(new C41892a());
            duration.start();
            this.f112877d.finish();
            this.f112877d.overridePendingTransition(C0966R.C0968anim.f2393bw, C0966R.C0968anim.f2394bx);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/luggage/MMLuggageGameHalfWebViewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI$c */
    public static final class C41893c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ MMLuggageGameHalfWebViewUI f112878d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41893c(MMLuggageGameHalfWebViewUI mMLuggageGameHalfWebViewUI) {
            super(0);
            this.f112878d = mMLuggageGameHalfWebViewUI;
        }

        public Object invoke() {
            return this.f112878d.findViewById(C0966R.C0970id.f359415kt1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI$d */
    public static final class C41894d extends C87413o implements C32224a<GameRoundContainerView> {

        /* renamed from: d */
        public final /* synthetic */ MMLuggageGameHalfWebViewUI f112879d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41894d(MMLuggageGameHalfWebViewUI mMLuggageGameHalfWebViewUI) {
            super(0);
            this.f112879d = mMLuggageGameHalfWebViewUI;
        }

        public Object invoke() {
            return (GameRoundContainerView) this.f112879d.findViewById(C0966R.C0970id.lty);
        }
    }

    /* renamed from: H7 */
    public GameWebPage mo65733H7(Bundle bundle, String str) {
        C87412m.m108594g(bundle, "params");
        C87412m.m108594g(str, "url");
        C53133t g = C41985r.m45639g(this, str);
        StringBuilder sb = new StringBuilder();
        sb.append("createPage, wc : ");
        sb.append(g != null);
        Log.m105924i("MicroMsg.MMLuggageGameHalfWebViewUI", sb.toString());
        ViewParent viewParent = null;
        if (g != null) {
            C41962j jVar = (C41962j) g.mo73819g();
            if (jVar != null) {
                viewParent = jVar.getParent();
            }
            if (viewParent instanceof ViewGroup) {
                ViewParent parent = jVar.getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(jVar);
            }
            C53118n nVar = this.f112880d.f148210j;
            C87412m.m108593f(nVar, "mContainer.ctrl");
            return new C41944c(nVar, g, bundle);
        }
        C53118n nVar2 = this.f112880d.f148210j;
        C87412m.m108593f(nVar2, "mContainer.ctrl");
        return new C41945d(nVar2, (C53133t) null, bundle);
    }

    /* renamed from: K7 */
    public void mo65734K7(View view) {
    }

    /* renamed from: L7 */
    public final double mo65735L7() {
        return ((Number) ((C36570n) this.f112871h).getValue()).doubleValue();
    }

    /* renamed from: M7 */
    public final void mo65736M7(ViewGroup viewGroup) {
        Log.m105918d("MicroMsg.MMLuggageGameHalfWebViewUI", "start rootView:" + viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                childAt.setBackgroundResource(0);
                mo65736M7((ViewGroup) childAt);
            } else if (!C87412m.m108589b(childAt, (View) ((C36570n) this.f112874n).getValue())) {
                Log.m105918d("MicroMsg.MMLuggageGameHalfWebViewUI", "start childView:" + childAt);
                childAt.setBackgroundColor(0);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.awi;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C0966R.C0968anim.f2393bw, C0966R.C0968anim.f2394bx);
        float floatExtra = getIntent().getFloatExtra("KHalfScreenHeightPercent", -1.0f);
        if (floatExtra <= 0.0f || floatExtra > 1.0f) {
            int intExtra = getIntent().getIntExtra("KHalfScreenHeight", (int) mo65735L7());
            this.f112872i = intExtra;
            this.f112872i = C74942w4.m89784a(this, intExtra);
            this.f112873j = true;
        } else {
            this.f112872i = (int) (((double) floatExtra) * mo65735L7());
            this.f112873j = false;
        }
        if (((double) this.f112872i) > mo65735L7()) {
            this.f112872i = (int) mo65735L7();
        }
        if (C85875k4.m106211z()) {
            ((View) ((C36570n) this.f112874n).getValue()).setBackgroundResource(C0966R.color.f3556xm);
        }
        ((View) ((C36570n) this.f112874n).getValue()).setOnClickListener(new C41891b(this));
        this.f112880d.f148203c.setAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2421cm));
        ((GameRoundContainerView) ((C36570n) this.f112875o).getValue()).addView(this.f112880d.f148203c, new ViewGroup.LayoutParams(-1, this.f112872i));
        if (!this.f112873j) {
            try {
                if (getWindow() != null) {
                    Window window = getWindow();
                    C87412m.m108591d(window);
                    window.getDecorView().setSystemUiVisibility(1280);
                    Window window2 = getWindow();
                    C87412m.m108591d(window2);
                    window2.addFlags(Integer.MIN_VALUE);
                    Window window3 = getWindow();
                    C87412m.m108591d(window3);
                    window3.setStatusBarColor(0);
                    Window window4 = getWindow();
                    C87412m.m108591d(window4);
                    window4.setFlags(134217728, 134217728);
                }
                if (getWindow() != null) {
                    View findViewById = getWindow().getDecorView().findViewById(16908290);
                    C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                    View childAt = ((ViewGroup) findViewById).getChildAt(0);
                    C87412m.m108592e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                    mo65736M7((ViewGroup) childAt);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
