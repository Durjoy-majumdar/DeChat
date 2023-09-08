package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.Transition;
import com.tencent.p014mm.C0966R;
import java.util.HashMap;
import p853i4.C108335a;
import p853i4.C108353o;
import p853i4.C108355q;

public class Explode extends Visibility {

    /* renamed from: N */
    public static final TimeInterpolator f306686N = new DecelerateInterpolator();

    /* renamed from: P */
    public static final TimeInterpolator f306687P = new AccelerateInterpolator();

    /* renamed from: M */
    public int[] f306688M = new int[2];

    public Explode() {
        this.f306710E = new C108335a();
    }

    /* renamed from: S */
    private void m138258S(C108353o oVar) {
        View view = oVar.f324392b;
        view.getLocationOnScreen(this.f306688M);
        int[] iArr = this.f306688M;
        int i = iArr[0];
        int i2 = iArr[1];
        ((HashMap) oVar.f324391a).put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: U */
    public Animator mo145299U(ViewGroup viewGroup, View view, C108353o oVar, C108353o oVar2) {
        if (oVar2 == null) {
            return null;
        }
        Rect rect = (Rect) ((HashMap) oVar2.f324391a).get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        mo145301W(viewGroup, rect, this.f306688M);
        int[] iArr = this.f306688M;
        return C108355q.m146759a(view, oVar2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, f306686N);
    }

    /* renamed from: V */
    public Animator mo145300V(ViewGroup viewGroup, View view, C108353o oVar, C108353o oVar2) {
        float f;
        float f2;
        if (oVar == null) {
            return null;
        }
        Rect rect = (Rect) ((HashMap) oVar.f324391a).get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) oVar.f324392b.getTag(C0966R.C0970id.ktt);
        if (iArr != null) {
            int i3 = iArr[0];
            f2 = ((float) (i3 - rect.left)) + translationX;
            int i4 = iArr[1];
            f = ((float) (i4 - rect.top)) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f2 = translationX;
            f = translationY;
        }
        mo145301W(viewGroup, rect, this.f306688M);
        int[] iArr2 = this.f306688M;
        return C108355q.m146759a(view, oVar, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), f306687P);
    }

    /* renamed from: W */
    public final void mo145301W(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        view.getLocationOnScreen(this.f306688M);
        int[] iArr2 = this.f306688M;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Transition.C103823d dVar = this.f306711F;
        Rect a = dVar == null ? null : dVar.mo145345a(this);
        if (a == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = a.centerX();
            i = a.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == 0.0f && centerY == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float sqrt = (float) Math.sqrt((double) ((centerX2 * centerX2) + (centerY * centerY)));
        int i5 = i2 - i3;
        int i6 = i - i4;
        float max = (float) Math.max(i5, view.getWidth() - i5);
        float max2 = (float) Math.max(i6, view.getHeight() - i6);
        float sqrt2 = (float) Math.sqrt((double) ((max * max) + (max2 * max2)));
        iArr[0] = Math.round((centerX2 / sqrt) * sqrt2);
        iArr[1] = Math.round(sqrt2 * (centerY / sqrt));
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        mo145352S(oVar);
        m138258S(oVar);
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        mo145352S(oVar);
        m138258S(oVar);
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f306710E = new C108335a();
    }
}
