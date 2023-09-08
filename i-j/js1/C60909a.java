package js1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.view.sidebar.DraggableConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: js1.a */
public final class C60909a {

    /* renamed from: a */
    public final String f173515a = "Finder.FinderSideBar";

    /* renamed from: b */
    public final Context f173516b;

    /* renamed from: c */
    public final ConstraintLayout f173517c;

    /* renamed from: d */
    public final ConstraintLayout f173518d;

    /* renamed from: e */
    public final DraggableConstraintLayout f173519e;

    /* renamed from: f */
    public final ConstraintLayout f173520f;

    /* renamed from: g */
    public final C60912c f173521g;

    /* renamed from: h */
    public final ViewGroup f173522h;

    /* renamed from: i */
    public int f173523i;

    /* renamed from: j */
    public int f173524j;

    /* renamed from: k */
    public int f173525k;

    /* renamed from: l */
    public int f173526l;

    /* renamed from: m */
    public int f173527m;

    /* renamed from: n */
    public float f173528n;

    /* renamed from: js1.a$a */
    public static final class C60910a implements DraggableConstraintLayout.C105319a {

        /* renamed from: a */
        public final /* synthetic */ C60909a f173529a;

        public C60910a(C60909a aVar) {
            this.f173529a = aVar;
        }

        /* renamed from: a */
        public void mo85825a() {
            C60909a aVar = this.f173529a;
            aVar.f173528n = 0.0f;
            C60912c cVar = aVar.f173521g;
            int i = aVar.f173523i;
            int i2 = DraggableConstraintLayout.f312947L;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            cVar.mo77750h(z);
        }

        /* renamed from: b */
        public void mo85826b(int i) {
            C60909a aVar = this.f173529a;
            aVar.getClass();
            float f = 1.0f;
            float abs = (((float) Math.abs(i)) * 1.0f) / ((float) aVar.f173524j);
            if (abs <= 1.0f) {
                f = abs;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            aVar.mo85822b(f);
        }

        /* renamed from: c */
        public void mo85827c(boolean z) {
            C60909a aVar = this.f173529a;
            int i = aVar.f173523i;
            int i2 = DraggableConstraintLayout.f312947L;
            boolean z2 = false;
            boolean z3 = (i == 1 && !z) || (i == 2 && z);
            float f = aVar.f173528n;
            float f2 = 0.0f;
            if (f <= 0.0f || f >= 1.0f) {
                aVar.mo85823c(z3);
                C60912c cVar = aVar.f173521g;
                if (aVar.f173523i == 2) {
                    z2 = true;
                }
                cVar.mo77748f(z2);
                return;
            }
            DraggableConstraintLayout draggableConstraintLayout = aVar.f173519e;
            draggableConstraintLayout.f312948A = 0;
            if (!z) {
                f2 = 1.0f;
            }
            aVar.mo85824d(draggableConstraintLayout, f, f2, new C60919f(aVar, z3));
        }
    }

    /* renamed from: js1.a$b */
    public static final class C60911b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60909a f173530d;

        public C60911b(C60909a aVar) {
            this.f173530d = aVar;
        }

        public final void run() {
            C60909a aVar = this.f173530d;
            int height = aVar.f173517c.getHeight();
            int height2 = aVar.f173518d.getHeight();
            int width = aVar.f173520f.getWidth();
            int i = C85875k4.m106184h(aVar.f173516b).x;
            aVar.f173524j = width;
            aVar.f173525k = i - width;
            aVar.f173526l = height;
            aVar.f173527m = height2;
            Log.m105924i(aVar.f173515a, "totalDistance:" + aVar.f173524j + ", targetBodyWidth:" + aVar.f173525k + ", targetBodyMarginTop:" + aVar.f173526l + " targetBodyMarginBottom:" + aVar.f173527m);
        }
    }

    /* renamed from: js1.a$c */
    public static abstract class C60912c {
        /* renamed from: a */
        public abstract void mo77743a(ConstraintLayout constraintLayout);

        /* renamed from: b */
        public abstract void mo77744b(ConstraintLayout constraintLayout);

        /* renamed from: c */
        public abstract void mo77745c(ConstraintLayout constraintLayout);

        /* renamed from: d */
        public abstract void mo77746d(ConstraintLayout constraintLayout);

        /* renamed from: e */
        public abstract long mo77747e();

        /* renamed from: f */
        public abstract void mo77748f(boolean z);

        /* renamed from: g */
        public abstract void mo77749g(float f);

        /* renamed from: h */
        public abstract void mo77750h(boolean z);
    }

    /* renamed from: js1.a$d */
    public static final class C60913d implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C32224a<C13598b0> f173531a;

        public C60913d(C32224a<C13598b0> aVar) {
            this.f173531a = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f173531a.invoke();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: js1.a$e */
    public static final class C60914e extends Animation {

        /* renamed from: d */
        public final /* synthetic */ C60909a f173532d;

        /* renamed from: e */
        public final /* synthetic */ float f173533e;

        /* renamed from: f */
        public final /* synthetic */ float f173534f;

        public C60914e(C60909a aVar, float f, float f2) {
            this.f173532d = aVar;
            this.f173533e = f;
            this.f173534f = f2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            C60909a aVar = this.f173532d;
            float f2 = this.f173533e;
            aVar.mo85822b(f2 + (f * (this.f173534f - f2)));
        }
    }

    public C60909a(C60912c cVar, ViewGroup viewGroup, int i, int i2) {
        C87412m.m108594g(cVar, "config");
        C87412m.m108594g(viewGroup, "parent");
        int i3 = DraggableConstraintLayout.f312947L;
        this.f173523i = 0;
        this.f173521g = cVar;
        this.f173522h = viewGroup;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "parent.context");
        this.f173516b = context;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        if (i2 >= 0) {
            viewGroup.addView(constraintLayout, i2, new ViewGroup.LayoutParams(-1, -1));
        } else {
            viewGroup.addView(constraintLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        View findViewById = constraintLayout.findViewById(C0966R.C0970id.jku);
        C87412m.m108593f(findViewById, "rootLayout.findViewById(R.id.sidebar_header)");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById;
        this.f173517c = constraintLayout2;
        View findViewById2 = constraintLayout.findViewById(C0966R.C0970id.jkt);
        C87412m.m108593f(findViewById2, "rootLayout.findViewById(R.id.sidebar_footer)");
        ConstraintLayout constraintLayout3 = (ConstraintLayout) findViewById2;
        this.f173518d = constraintLayout3;
        View findViewById3 = constraintLayout.findViewById(C0966R.C0970id.jkp);
        C87412m.m108593f(findViewById3, "rootLayout.findViewById(R.id.sidebar_body_left)");
        DraggableConstraintLayout draggableConstraintLayout = (DraggableConstraintLayout) findViewById3;
        this.f173519e = draggableConstraintLayout;
        View findViewById4 = constraintLayout.findViewById(C0966R.C0970id.jkq);
        C87412m.m108593f(findViewById4, "rootLayout.findViewById(R.id.sidebar_body_right)");
        ConstraintLayout constraintLayout4 = (ConstraintLayout) findViewById4;
        this.f173520f = constraintLayout4;
        cVar.mo77745c(constraintLayout2);
        cVar.mo77743a(draggableConstraintLayout);
        cVar.mo77746d(constraintLayout4);
        cVar.mo77744b(constraintLayout3);
        draggableConstraintLayout.setDragListener(new C60910a(this));
        viewGroup.post(new C60911b(this));
    }

    /* renamed from: a */
    public static final void m71381a(C60909a aVar) {
        int i;
        int abs = Math.abs(aVar.f173519e.getWidth() - aVar.f173525k);
        int abs2 = Math.abs((aVar.f173519e.getWidth() - aVar.f173525k) - aVar.f173524j);
        Log.m105924i(aVar.f173515a, "determineDragMode distanceFromTarget:" + abs + ", " + abs2 + ", bodyRoot.width:" + aVar.f173519e.getWidth() + ", targetBodyWidth:" + aVar.f173525k + ", totalDistance:" + aVar.f173524j);
        boolean z = true;
        if (abs > abs2) {
            int i2 = DraggableConstraintLayout.f312947L;
            i = 1;
        } else {
            int i3 = DraggableConstraintLayout.f312947L;
            i = 2;
        }
        aVar.f173523i = i;
        DraggableConstraintLayout draggableConstraintLayout = aVar.f173519e;
        if (i != 1) {
            z = false;
        }
        int i4 = aVar.f173524j;
        draggableConstraintLayout.mo149808w(z, i4 / 2, i4);
    }

    /* renamed from: b */
    public final void mo85822b(float f) {
        Log.m105924i(this.f173515a, "dragging percent:" + f);
        if (!(f == this.f173528n)) {
            int i = this.f173523i;
            int i2 = DraggableConstraintLayout.f312947L;
            float f2 = i == 1 ? f : 1.0f - f;
            ViewGroup.LayoutParams layoutParams = this.f173519e.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.width = (int) ((((float) this.f173524j) * (1.0f - f2)) + ((float) this.f173525k));
            layoutParams2.topMargin = (int) (((float) this.f173526l) * f2);
            layoutParams2.bottomMargin = (int) (((float) this.f173527m) * f2);
            this.f173519e.requestLayout();
            this.f173521g.mo77749g(f2);
            this.f173528n = f;
        }
    }

    /* renamed from: c */
    public final void mo85823c(boolean z) {
        int i;
        Log.m105924i(this.f173515a, "innerEnableDrag showing:" + z);
        if (!z) {
            int i2 = DraggableConstraintLayout.f312947L;
            i = 1;
        } else {
            int i3 = DraggableConstraintLayout.f312947L;
            i = 2;
        }
        this.f173523i = i;
        int i4 = this.f173524j;
        this.f173519e.mo149808w(!z, i4 / 2, i4);
    }

    /* renamed from: d */
    public final void mo85824d(View view, float f, float f2, C32224a<C13598b0> aVar) {
        C60914e eVar = new C60914e(this, f, f2);
        eVar.setDuration((long) (((float) this.f173521g.mo77747e()) * Math.abs(f2 - f)));
        eVar.setAnimationListener(new C60913d(aVar));
        eVar.setInterpolator(new LinearInterpolator());
        view.startAnimation(eVar);
    }
}
