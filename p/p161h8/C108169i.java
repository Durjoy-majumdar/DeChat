package p161h8;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: h8.i */
public class C108169i {

    /* renamed from: a */
    public long f323898a;

    /* renamed from: b */
    public long f323899b;

    /* renamed from: c */
    public TimeInterpolator f323900c;

    /* renamed from: d */
    public int f323901d;

    /* renamed from: e */
    public int f323902e;

    public C108169i(long j, long j2) {
        this.f323900c = null;
        this.f323901d = 0;
        this.f323902e = 1;
        this.f323898a = j;
        this.f323899b = j2;
    }

    /* renamed from: a */
    public void mo158572a(Animator animator) {
        animator.setStartDelay(this.f323898a);
        animator.setDuration(this.f323899b);
        animator.setInterpolator(mo158573b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f323901d);
            valueAnimator.setRepeatMode(this.f323902e);
        }
    }

    /* renamed from: b */
    public TimeInterpolator mo158573b() {
        TimeInterpolator timeInterpolator = this.f323900c;
        return timeInterpolator != null ? timeInterpolator : C108164a.f323891b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C108169i.class != obj.getClass()) {
            return false;
        }
        C108169i iVar = (C108169i) obj;
        if (this.f323898a == iVar.f323898a && this.f323899b == iVar.f323899b && this.f323901d == iVar.f323901d && this.f323902e == iVar.f323902e) {
            return mo158573b().getClass().equals(iVar.mo158573b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f323898a;
        long j2 = this.f323899b;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + mo158573b().getClass().hashCode()) * 31) + this.f323901d) * 31) + this.f323902e;
    }

    public String toString() {
        return 10 + C108169i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f323898a + " duration: " + this.f323899b + " interpolator: " + mo158573b().getClass() + " repeatCount: " + this.f323901d + " repeatMode: " + this.f323902e + "}\n";
    }

    public C108169i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f323901d = 0;
        this.f323902e = 1;
        this.f323898a = j;
        this.f323899b = j2;
        this.f323900c = timeInterpolator;
    }
}
