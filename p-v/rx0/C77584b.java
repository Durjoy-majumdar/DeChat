package rx0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: rx0.b */
public final class C77584b {

    /* renamed from: a */
    public final MMActivity f226183a;

    /* renamed from: b */
    public final AppCompatActivity f226184b;

    /* renamed from: c */
    public final C77589p f226185c;

    /* renamed from: d */
    public final C77591r f226186d;

    public C77584b(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "timelineUI");
        this.f226183a = mMActivity;
        this.f226184b = mMActivity.getContext();
        this.f226185c = new C77589p(mMActivity, this);
        this.f226186d = new C77591r(mMActivity, this);
    }

    /* renamed from: a */
    public final void mo107766a(View view) {
        View view2 = view;
        if (view2 != null) {
            C77589p pVar = this.f226185c;
            pVar.getClass();
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            AppCompatActivity appCompatActivity = pVar.f226203c;
            C87412m.m108593f(createBitmap, "bitmap");
            C77587m mVar = new C77587m(appCompatActivity, createBitmap);
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(i);
            layoutParams.topMargin = i2;
            String str = pVar.f226202b;
            Log.m105924i(str, "dummyView, x = " + i + ", y = " + i2);
            mVar.setListener(new C77588o(mVar, pVar));
            View decorView = pVar.f226201a.getWindow().getDecorView();
            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).addView(mVar, layoutParams);
            int[] iArr2 = new int[2];
            pVar.f226201a.getMabBackBtn().getLocationInWindow(iArr2);
            int width = iArr2[0] + (pVar.f226201a.getMabBackBtn().getWidth() / 2);
            int height = iArr2[1] + (pVar.f226201a.getMabBackBtn().getHeight() / 2);
            String str2 = pVar.f226202b;
            Log.m105924i(str2, "leftBackAnchor, x = " + width + ", y = " + height);
            int i3 = -(i - width);
            int i4 = -(i2 - height);
            String str3 = pVar.f226202b;
            Log.m105924i(str3, "move, x = " + i3 + ", y = " + i4);
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("translateX", new float[]{0.0f, (float) i3});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("translateY", new float[]{0.0f, (float) i4});
            PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("alpha", new int[]{255, 128});
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, (((float) mVar.f226195j) * 2.0f) / ((float) mVar.f226196n)}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, (((float) mVar.f226195j) * 2.0f) / ((float) mVar.f226197o)}), ofFloat, ofFloat2, ofInt});
            ofPropertyValuesHolder.addUpdateListener(new C77585k(mVar));
            ofPropertyValuesHolder.addListener(new C77586l(mVar));
            C77591r rVar = this.f226186d;
            int[] iArr3 = new int[2];
            rVar.f226206a.getMabBackBtn().getLocationInWindow(iArr3);
            int width2 = iArr3[0] + (rVar.f226206a.getMabBackBtn().getWidth() / 2);
            int height2 = iArr3[1] + (rVar.f226206a.getMabBackBtn().getHeight() / 2);
            String str4 = rVar.f226207b;
            Log.m105924i(str4, "leftBackAnchor, x = " + width2 + ", y = $" + height2);
            View decorView2 = rVar.f226206a.getWindow().getDecorView();
            C87412m.m108592e(decorView2, "null cannot be cast to non-null type android.view.ViewGroup");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            int b = C76577a.m92151b(rVar.f226208c, 56);
            int i5 = b / 2;
            layoutParams2.setMarginStart(width2 - i5);
            layoutParams2.topMargin = height2 - i5;
            String str5 = rVar.f226207b;
            Log.m105924i(str5, "rootBall, x = " + layoutParams2.getMarginStart() + ", y = $" + layoutParams2.topMargin);
            View inflate = LayoutInflater.from(rVar.f226208c).inflate(C0966R.C0971layout.b4g, (ViewGroup) null, false);
            inflate.setBackground(rVar.f226208c.getResources().getDrawable(C0966R.C0969drawable.b8e));
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            View view3 = inflate;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/popmenu/MultiTaskTipsAnimHandler", "getTipsAnimator", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/popmenu/MultiTaskTipsAnimHandler$Result;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            inflate.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/popmenu/MultiTaskTipsAnimHandler", "getTipsAnimator", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/popmenu/MultiTaskTipsAnimHandler$Result;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            ((ViewGroup) decorView2).addView(inflate, layoutParams2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(inflate, "alpha", new float[]{1.0f});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(inflate, "translationX", new float[]{-((float) (width2 + b))});
            ofFloat4.addListener(new C77590q(rVar, inflate));
            C87412m.m108593f(ofFloat3, "alphaAnimator");
            long j = (long) 1;
            long j2 = 300 * j;
            ofPropertyValuesHolder.setDuration(j2);
            ofFloat3.setDuration(j2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat3);
            ofFloat4.setDuration(j * 200);
            animatorSet.play(ofFloat4).after(j2 + (400 * j));
            ofPropertyValuesHolder.start();
            animatorSet.start();
        }
    }
}
