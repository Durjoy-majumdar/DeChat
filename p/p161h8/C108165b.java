package p161h8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* renamed from: h8.b */
public class C108165b {
    /* renamed from: a */
    public static void m146494a(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
