package p1139o8;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.HashMap;
import java.util.Map;
import p853i4.C108353o;

/* renamed from: o8.j */
public class C109989j extends Transition {

    /* renamed from: o8.j$a */
    public class C109990a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f329151d;

        public C109990a(C109989j jVar, TextView textView) {
            this.f329151d = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f329151d.setScaleX(floatValue);
            this.f329151d.setScaleY(floatValue);
        }
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        View view = oVar.f324392b;
        if (view instanceof TextView) {
            ((HashMap) oVar.f324391a).put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        View view = oVar.f324392b;
        if (view instanceof TextView) {
            ((HashMap) oVar.f324391a).put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: o */
    public Animator mo145268o(ViewGroup viewGroup, C108353o oVar, C108353o oVar2) {
        if (oVar == null || oVar2 == null || !(oVar.f324392b instanceof TextView)) {
            return null;
        }
        View view = oVar2.f324392b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = oVar.f324391a;
        Map<String, Object> map2 = oVar2.f324391a;
        HashMap hashMap = (HashMap) map;
        float f = 1.0f;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        HashMap hashMap2 = (HashMap) map2;
        if (hashMap2.get("android:textscale:scale") != null) {
            f = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new C109990a(this, textView));
        return ofFloat;
    }
}
