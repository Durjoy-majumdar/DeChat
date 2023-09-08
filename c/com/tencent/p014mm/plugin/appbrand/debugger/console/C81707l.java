package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.animation.Animator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import p385u2.C111105a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.l */
public final class C81707l extends LinearLayout {

    /* renamed from: d */
    public final C32224a<C13598b0> f239812d;

    /* renamed from: e */
    public final C32224a<C13598b0> f239813e;

    /* renamed from: f */
    public boolean f239814f;

    /* renamed from: g */
    public final C81718u f239815g;

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.l$a */
    public static final class C81708a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81707l f239816d;

        public C81708a(C81707l lVar) {
            this.f239816d = lVar;
        }

        public final void run() {
            int measuredHeight = this.f239816d.getMeasuredHeight();
            Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "<init>, measured, measuredHeight: " + measuredHeight);
            this.f239816d.setTranslationY((float) measuredHeight);
            this.f239816d.setVisibility(0);
            this.f239816d.mo114068b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.l$b */
    public static final class C81709b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C81707l f239817d;

        public C81709b(C81707l lVar) {
            this.f239817d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanel$3$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "onClick#clearTv");
            C81718u printer = this.f239817d.getPrinter();
            printer.setText("");
            printer.f239833g.clear();
            printer.f239834h = new SpannableStringBuilder();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanel$3$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.l$c */
    public static final class C81710c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C81707l f239818d;

        public C81710c(C81707l lVar) {
            this.f239818d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanel$3$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "onClick#hideTv");
            this.f239818d.mo114067a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanel$3$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.l$d */
    public static final class C81711d implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C81707l f239819d;

        public C81711d(C81707l lVar) {
            this.f239819d = lVar;
        }

        public void onAnimationCancel(Animator animator) {
            Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationCancel#hide");
            C81707l lVar = this.f239819d;
            lVar.f239814f = false;
            C32224a<C13598b0> aVar = lVar.f239813e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationEnd#hide");
            C81707l lVar = this.f239819d;
            lVar.f239814f = false;
            C32224a<C13598b0> aVar = lVar.f239813e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animator animator) {
            Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationRepeat#hide");
        }

        public void onAnimationStart(Animator animator) {
            Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationStart#hide");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.l$e */
    public static final class C81712e implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C81707l f239820d;

        public C81712e(C81707l lVar) {
            this.f239820d = lVar;
        }

        public void onAnimationCancel(Animator animator) {
            Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationCancel#show");
            C81707l lVar = this.f239820d;
            lVar.f239814f = false;
            C32224a<C13598b0> aVar = lVar.f239812d;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationEnd#show");
            C81707l lVar = this.f239820d;
            lVar.f239814f = false;
            C32224a<C13598b0> aVar = lVar.f239812d;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animator animator) {
            Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationRepeat#show");
        }

        public void onAnimationStart(Animator animator) {
            Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationStart#show");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81707l(Context context, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f239812d = aVar;
        this.f239813e = aVar2;
        setOrientation(1);
        setBackgroundColor(C111105a.m151500b(context, C0966R.color.f2927a));
        setVisibility(4);
        post(new C81708a(this));
        C81718u uVar = new C81718u(context);
        addView(uVar, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.f239815g = uVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(C111105a.m151500b(context, C0966R.color.f2930d));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        int f = C76577a.m92155f(context, C0966R.dimen.f3723cd);
        textView.setPadding(0, f, 0, f);
        textView.setTextColor(C111105a.m151500b(context, C0966R.color.FG_0));
        textView.setTextSize(0, (float) C76577a.m92155f(context, C0966R.dimen.f3951l_));
        textView.setText("Clear");
        textView.setOnClickListener(new C81709b(this));
        linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        View view = new View(context);
        int f2 = C76577a.m92155f(context, C0966R.dimen.f3703bv);
        view.setPadding(0, f2, 0, f2);
        view.setBackgroundColor(C111105a.m151500b(context, C0966R.color.FG_3));
        linearLayout.addView(view, new LinearLayout.LayoutParams(C76577a.m92155f(context, C0966R.dimen.f3699bs), -1));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        int f3 = C76577a.m92155f(context, C0966R.dimen.f3723cd);
        textView2.setPadding(0, f3, 0, f3);
        textView2.setTextColor(C111105a.m151500b(context, C0966R.color.FG_0));
        textView2.setTextSize(0, (float) C76577a.m92155f(context, C0966R.dimen.f3951l_));
        textView2.setText("Hide");
        textView2.setOnClickListener(new C81710c(this));
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(linearLayout, -1, -2);
    }

    /* renamed from: a */
    public final void mo114067a() {
        float translationY = getTranslationY();
        boolean z = this.f239814f;
        Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "hide, curTranslationY: " + translationY + ", curIsAnimating: " + z);
        if (!(((float) getMeasuredHeight()) == translationY) && !z) {
            this.f239814f = true;
            animate().translationY((float) getMeasuredHeight()).setDuration(300).setInterpolator(new DecelerateInterpolator()).setListener(new C81711d(this));
        }
    }

    /* renamed from: b */
    public final void mo114068b() {
        float translationY = getTranslationY();
        boolean z = this.f239814f;
        Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanel", "show, curTranslationY: " + translationY + ", curIsAnimating: " + z);
        if (!(0.0f == translationY) && !z) {
            this.f239814f = true;
            animate().translationY(0.0f).setDuration(300).setInterpolator(new DecelerateInterpolator()).setListener(new C81712e(this));
        }
    }

    public final C81718u getPrinter() {
        return this.f239815g;
    }
}
