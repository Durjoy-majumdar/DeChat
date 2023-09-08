package p161h8;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import p1042u.C111059i;

/* renamed from: h8.h */
public class C108168h {

    /* renamed from: a */
    public final C111059i<String, C108169i> f323897a = new C111059i<>();

    /* renamed from: a */
    public static C108168h m146495a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m146496b(context, resourceId);
    }

    /* renamed from: b */
    public static C108168h m146496b(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m146497c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m146497c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    /* renamed from: c */
    public static C108168h m146497c(List<Animator> list) {
        C108168h hVar = new C108168h();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C108164a.f323891b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C108164a.f323892c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C108164a.f323893d;
                }
                C108169i iVar = new C108169i(startDelay, duration, interpolator);
                iVar.f323901d = objectAnimator.getRepeatCount();
                iVar.f323902e = objectAnimator.getRepeatMode();
                hVar.f323897a.put(propertyName, iVar);
                i++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return hVar;
    }

    /* renamed from: d */
    public C108169i mo158568d(String str) {
        if (this.f323897a.getOrDefault(str, null) != null) {
            return this.f323897a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C108168h.class != obj.getClass()) {
            return false;
        }
        return this.f323897a.equals(((C108168h) obj).f323897a);
    }

    public int hashCode() {
        return this.f323897a.hashCode();
    }

    public String toString() {
        return 10 + C108168h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f323897a + "}\n";
    }
}
