package af0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import bf0.C16794b;
import com.tencent.p014mm.particles.ConfettiView;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/* renamed from: af0.c */
public class C16459c {

    /* renamed from: A */
    public float f43922A;

    /* renamed from: B */
    public Float f43923B;

    /* renamed from: C */
    public Float f43924C;

    /* renamed from: D */
    public long f43925D;

    /* renamed from: E */
    public float f43926E;

    /* renamed from: F */
    public float f43927F;

    /* renamed from: G */
    public C16461b f43928G = null;

    /* renamed from: a */
    public final Random f43929a = new Random();

    /* renamed from: b */
    public C16458b f43930b;

    /* renamed from: c */
    public C16463e f43931c;

    /* renamed from: d */
    public ViewGroup f43932d;

    /* renamed from: e */
    public ConfettiView f43933e;

    /* renamed from: f */
    public final Queue<C16794b> f43934f = new LinkedList();

    /* renamed from: g */
    public final List<C16794b> f43935g = new ArrayList(300);

    /* renamed from: h */
    public ValueAnimator f43936h;

    /* renamed from: i */
    public long f43937i;

    /* renamed from: j */
    public int f43938j;

    /* renamed from: k */
    public long f43939k;

    /* renamed from: l */
    public float f43940l;

    /* renamed from: m */
    public float f43941m;

    /* renamed from: n */
    public Interpolator f43942n;

    /* renamed from: o */
    public Rect f43943o;

    /* renamed from: p */
    public float f43944p;

    /* renamed from: q */
    public float f43945q;

    /* renamed from: r */
    public float f43946r;

    /* renamed from: s */
    public float f43947s;

    /* renamed from: t */
    public float f43948t;

    /* renamed from: u */
    public float f43949u;

    /* renamed from: v */
    public float f43950v;

    /* renamed from: w */
    public float f43951w;

    /* renamed from: x */
    public int f43952x;

    /* renamed from: y */
    public int f43953y;

    /* renamed from: z */
    public float f43954z;

    /* renamed from: af0.c$a */
    public class C16460a implements View.OnAttachStateChangeListener {
        public C16460a() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            C16459c.this.mo14942h();
        }
    }

    /* renamed from: af0.c$b */
    public interface C16461b {
        /* renamed from: a */
        void mo14945a(C16459c cVar);
    }

    public C16459c(Context context, C16458b bVar, C16463e eVar, ViewGroup viewGroup) {
        ConfettiView a = ConfettiView.m18216a(context);
        mo14938d(bVar, eVar, viewGroup, a);
    }

    /* renamed from: a */
    public final void mo14935a(int i, long j) {
        for (int i2 = 0; i2 < i; i2++) {
            C16794b bVar = (C16794b) ((LinkedList) this.f43934f).poll();
            if (bVar == null) {
                bVar = this.f43930b.mo14934a(this.f43929a);
            }
            C16463e eVar = this.f43931c;
            Random random = this.f43929a;
            bVar.mo17826i();
            bVar.f45371d = j;
            float nextFloat = random.nextFloat();
            int i3 = eVar.f43957a;
            bVar.f45372e = ((float) i3) + (((float) (eVar.f43959c - i3)) * nextFloat);
            float nextFloat2 = random.nextFloat();
            int i4 = eVar.f43958b;
            bVar.f45373f = ((float) i4) + (((float) (eVar.f43960d - i4)) * nextFloat2);
            bVar.f45374g = mo14937c(this.f43944p, this.f43945q, random);
            bVar.f45375h = mo14937c(this.f43946r, this.f43947s, random);
            bVar.f45376i = mo14937c(this.f43948t, this.f43949u, random);
            bVar.f45377j = mo14937c(this.f43950v, this.f43951w, random);
            Float f = null;
            bVar.f45378k = null;
            bVar.f45379l = null;
            bVar.f45382o = mo14937c((float) this.f43952x, (float) this.f43953y, random);
            bVar.f45383p = mo14937c(0.0f, 0.0f, random);
            bVar.f45384q = mo14937c(this.f43954z, this.f43922A, random);
            Float f2 = this.f43923B;
            if (f2 != null) {
                f = Float.valueOf(mo14937c(f2.floatValue(), this.f43924C.floatValue(), random));
            }
            bVar.f45385r = f;
            bVar.f45387t = this.f43925D;
            bVar.f45388u = this.f43942n;
            bVar.f45389v = mo14937c(this.f43926E, this.f43927F, random);
            bVar.mo17825h(this.f43943o);
            ((ArrayList) this.f43935g).add(bVar);
        }
    }

    /* renamed from: b */
    public C16459c mo14936b() {
        ValueAnimator valueAnimator = this.f43936h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f43937i = 0;
        Iterator it = ((ArrayList) this.f43935g).iterator();
        while (it.hasNext()) {
            ((LinkedList) this.f43934f).add((C16794b) it.next());
            it.remove();
        }
        ViewParent parent = this.f43933e.getParent();
        if (parent == null) {
            this.f43932d.addView(this.f43933e);
        } else if (parent != this.f43932d) {
            ((ViewGroup) parent).removeView(this.f43933e);
            this.f43932d.addView(this.f43933e);
        }
        this.f43933e.f49120e = false;
        mo14935a(this.f43938j, 0);
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{0}).setDuration(MAlarmHandler.NEXT_FIRE_INTERVAL);
        this.f43936h = duration;
        duration.addUpdateListener(new C16462d(this));
        this.f43936h.start();
        return this;
    }

    /* renamed from: c */
    public final float mo14937c(float f, float f2, Random random) {
        return f + (f2 * ((random.nextFloat() * 2.0f) - 1.0f));
    }

    /* renamed from: d */
    public void mo14938d(C16458b bVar, C16463e eVar, ViewGroup viewGroup, ConfettiView confettiView) {
        this.f43930b = bVar;
        this.f43931c = eVar;
        this.f43932d = viewGroup;
        this.f43933e = confettiView;
        confettiView.f49119d = this.f43935g;
        confettiView.addOnAttachStateChangeListener(new C16460a());
        this.f43925D = -1;
        this.f43943o = new Rect(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
    }

    /* renamed from: e */
    public C16459c mo14939e(float f) {
        this.f43923B = Float.valueOf(f / 1000.0f);
        this.f43924C = Float.valueOf(0.0f);
        return this;
    }

    /* renamed from: f */
    public C16459c mo14940f(float f, float f2) {
        this.f43944p = f / 1000.0f;
        this.f43945q = f2 / 1000.0f;
        return this;
    }

    /* renamed from: g */
    public C16459c mo14941g(float f, float f2) {
        this.f43946r = f / 1000.0f;
        this.f43947s = f2 / 1000.0f;
        return this;
    }

    /* renamed from: h */
    public void mo14942h() {
        ValueAnimator valueAnimator = this.f43936h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ConfettiView confettiView = this.f43933e;
        if (!confettiView.f49120e) {
            confettiView.f49120e = true;
            confettiView.getParent().requestLayout();
        }
        C16461b bVar = this.f43928G;
        if (bVar != null) {
            bVar.mo14945a(this);
            ((LinkedList) this.f43934f).clear();
        }
    }
}
