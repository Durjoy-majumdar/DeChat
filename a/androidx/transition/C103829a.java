package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.ChangeTransform;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;
import p853i4.C108360v;

/* renamed from: androidx.transition.a */
public class C103829a extends AnimatorListenerAdapter {

    /* renamed from: d */
    public boolean f306759d;

    /* renamed from: e */
    public Matrix f306760e = new Matrix();

    /* renamed from: f */
    public final /* synthetic */ boolean f306761f;

    /* renamed from: g */
    public final /* synthetic */ Matrix f306762g;

    /* renamed from: h */
    public final /* synthetic */ View f306763h;

    /* renamed from: i */
    public final /* synthetic */ ChangeTransform.C103809e f306764i;

    /* renamed from: j */
    public final /* synthetic */ ChangeTransform.C103808d f306765j;

    /* renamed from: n */
    public final /* synthetic */ ChangeTransform f306766n;

    public C103829a(ChangeTransform changeTransform, boolean z, Matrix matrix, View view, ChangeTransform.C103809e eVar, ChangeTransform.C103808d dVar) {
        this.f306766n = changeTransform;
        this.f306761f = z;
        this.f306762g = matrix;
        this.f306763h = view;
        this.f306764i = eVar;
        this.f306765j = dVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f306759d = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f306759d) {
            if (!this.f306761f || !this.f306766n.f306668K) {
                this.f306763h.setTag(C0966R.C0970id.ktv, (Object) null);
                this.f306763h.setTag(C0966R.C0970id.hr7, (Object) null);
            } else {
                this.f306760e.set(this.f306762g);
                this.f306763h.setTag(C0966R.C0970id.ktv, this.f306760e);
                ChangeTransform.C103809e eVar = this.f306764i;
                View view = this.f306763h;
                float f = eVar.f306678a;
                float f2 = eVar.f306679b;
                float f3 = eVar.f306680c;
                float f4 = eVar.f306681d;
                float f5 = eVar.f306682e;
                float f6 = eVar.f306683f;
                float f7 = eVar.f306684g;
                float f8 = eVar.f306685h;
                String[] strArr = ChangeTransform.f306664N;
                view.setTranslationX(f);
                view.setTranslationY(f2);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107213g.m145238w(view, f3);
                view.setScaleX(f4);
                view.setScaleY(f5);
                view.setRotationX(f6);
                view.setRotationY(f7);
                view.setRotation(f8);
            }
        }
        C108360v.m146763a(this.f306763h, (Matrix) null);
        ChangeTransform.C103809e eVar2 = this.f306764i;
        View view2 = this.f306763h;
        float f9 = eVar2.f306678a;
        float f15 = eVar2.f306679b;
        float f16 = eVar2.f306680c;
        float f17 = eVar2.f306681d;
        float f18 = eVar2.f306682e;
        float f19 = eVar2.f306683f;
        float f25 = eVar2.f306684g;
        float f26 = eVar2.f306685h;
        String[] strArr2 = ChangeTransform.f306664N;
        view2.setTranslationX(f9);
        view2.setTranslationY(f15);
        WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
        C107207u.C107213g.m145238w(view2, f16);
        view2.setScaleX(f17);
        view2.setScaleY(f18);
        view2.setRotationX(f19);
        view2.setRotationY(f25);
        view2.setRotation(f26);
    }

    public void onAnimationPause(Animator animator) {
        this.f306760e.set(this.f306765j.f306673a);
        this.f306763h.setTag(C0966R.C0970id.ktv, this.f306760e);
        ChangeTransform.C103809e eVar = this.f306764i;
        View view = this.f306763h;
        float f = eVar.f306678a;
        float f2 = eVar.f306679b;
        float f3 = eVar.f306680c;
        float f4 = eVar.f306681d;
        float f5 = eVar.f306682e;
        float f6 = eVar.f306683f;
        float f7 = eVar.f306684g;
        float f8 = eVar.f306685h;
        String[] strArr = ChangeTransform.f306664N;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107213g.m145238w(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    public void onAnimationResume(Animator animator) {
        View view = this.f306763h;
        String[] strArr = ChangeTransform.f306664N;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107213g.m145238w(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
