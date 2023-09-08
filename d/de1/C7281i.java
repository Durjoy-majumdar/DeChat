package de1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: de1.i */
public final class C7281i extends C87413o implements C32226l<View, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Intent f25363d;

    /* renamed from: e */
    public final /* synthetic */ C32227p<Intent, C32226l<? super View, C13598b0>, C13598b0> f25364e;

    /* renamed from: f */
    public final /* synthetic */ View f25365f;

    /* renamed from: g */
    public final /* synthetic */ long f25366g;

    /* renamed from: h */
    public final /* synthetic */ ImageView f25367h;

    /* renamed from: i */
    public final /* synthetic */ Activity f25368i;

    /* renamed from: j */
    public final /* synthetic */ C32224a<C13598b0> f25369j;

    /* renamed from: n */
    public final /* synthetic */ C7292u f25370n;

    /* renamed from: o */
    public final /* synthetic */ long f25371o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7281i(Intent intent, C32227p<? super Intent, ? super C32226l<? super View, C13598b0>, C13598b0> pVar, View view, long j, ImageView imageView, Activity activity, C32224a<C13598b0> aVar, C7292u uVar, long j2) {
        super(1);
        this.f25363d = intent;
        this.f25364e = pVar;
        this.f25365f = view;
        this.f25366g = j;
        this.f25367h = imageView;
        this.f25368i = activity;
        this.f25369j = aVar;
        this.f25370n = uVar;
        this.f25371o = j2;
    }

    public Object invoke(Object obj) {
        View view = (View) obj;
        if (view != null) {
            String stringExtra = this.f25363d.getStringExtra("key_anim_intent_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getResources(), C7287o.m7445a(view));
            view.setTag(C0966R.C0970id.d_n, this.f25364e);
            C7267b bVar = C7267b.f25328d;
            bVar.getClass();
            C7267b.f25329e.put(stringExtra, new C7301x(bitmapDrawable, new WeakReference(view)));
            this.f25363d.putExtra("key_intent_source_rect", C7287o.m7446b(view));
            C7267b.vx0(bVar, this.f25365f, this.f25363d);
            Rect rect = (Rect) this.f25363d.getParcelableExtra("key_intent_source_rect");
            if (rect == null) {
                rect = new Rect();
            }
            this.f25363d.putExtra("KEY_INTENT_ENTER_ITEM_ID", this.f25366g);
            this.f25367h.setImageDrawable(bitmapDrawable);
            ImageView imageView = this.f25367h;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            layoutParams.topMargin = rect.top;
            layoutParams.leftMargin = rect.left;
            imageView.setLayoutParams(layoutParams);
        }
        if (this.f25366g != this.f25368i.getIntent().getLongExtra("KEY_INTENT_ENTER_ITEM_ID", -1)) {
            this.f25369j.invoke();
            this.f25368i.overridePendingTransition(C0966R.C0968anim.f2393bw, C0966R.C0968anim.f2394bx);
        } else {
            this.f25363d.putExtra("key_intent_animating_flag", 2);
            C7267b bVar2 = C7267b.f25328d;
            View Dx0 = bVar2.Dx0(this.f25363d);
            Rect rect2 = new Rect();
            this.f25365f.getDrawingRect(rect2);
            Rect Bx0 = bVar2.Bx0(this.f25363d);
            float Cx0 = bVar2.Cx0(rect2, Bx0, true);
            float[] Ex0 = bVar2.Ex0(rect2, Bx0);
            View view2 = this.f25365f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1", "invoke", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1", "invoke", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            float alpha = this.f25370n.getBgView().getAlpha();
            ViewPropertyAnimator animate = this.f25365f.animate();
            if (animate != null) {
                animate.cancel();
            }
            ViewPropertyAnimator scaleY = this.f25365f.animate().translationX(Ex0[0]).translationY(Ex0[1]).scaleX(Cx0).scaleY(Cx0);
            ViewPropertyAnimator animate2 = this.f25365f.animate();
            C87412m.m108593f(animate2, "contentView.animate()");
            scaleY.setListener(new C7291s(animate2, C7276d.f25351d)).setUpdateListener(new C7277e(this.f25370n, alpha)).setDuration(this.f25371o).start();
            ImageView imageView2 = this.f25367h;
            Rect b = C7287o.m7446b(this.f25365f);
            float Cx02 = bVar2.Cx0(Bx0, b, false);
            float[] Ex02 = bVar2.Ex0(b, Bx0);
            imageView2.setVisibility(0);
            imageView2.setTranslationX(-Ex02[0]);
            imageView2.setTranslationY(-Ex02[1]);
            imageView2.setScaleX(Cx02);
            imageView2.setScaleY(Cx02);
            imageView2.setAlpha(1.0f);
            ViewPropertyAnimator animate3 = this.f25367h.animate();
            if (animate3 != null) {
                animate3.cancel();
            }
            ViewPropertyAnimator updateListener = this.f25367h.animate().scaleX(1.0f).scaleY(1.0f).translationY(1.0f).translationX(1.0f).setUpdateListener(C7278f.f25354d);
            ViewPropertyAnimator animate4 = this.f25365f.animate();
            C87412m.m108593f(animate4, "contentView.animate()");
            updateListener.setListener(new C7291s(animate4, new C7280h(Dx0, this.f25367h, this.f25369j, this.f25368i, this.f25363d))).setDuration(this.f25371o).start();
        }
        return C13598b0.f38549a;
    }
}
