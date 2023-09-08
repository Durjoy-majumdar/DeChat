package w82;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: w82.i */
public final class C111765i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111759e f334695d;

    /* renamed from: e */
    public final /* synthetic */ Rect f334696e;

    /* renamed from: f */
    public final /* synthetic */ C111773l f334697f;

    /* renamed from: w82.i$a */
    public static final class C111766a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111759e f334698d;

        /* renamed from: e */
        public final /* synthetic */ Rect f334699e;

        /* renamed from: w82.i$a$a */
        public static final class C111767a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C111759e f334700d;

            /* renamed from: w82.i$a$a$a */
            public static final class C111768a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C111759e f334701d;

                public C111768a(C111759e eVar) {
                    this.f334701d = eVar;
                }

                public final void run() {
                    this.f334701d.mo163495b().animate().alpha(0.0f).setDuration(150).start();
                }
            }

            public C111767a(C111759e eVar) {
                this.f334700d = eVar;
            }

            public final void run() {
                C111759e eVar = this.f334700d;
                C119179t tVar = C119157j.f356862d;
                C111768a aVar = new C111768a(eVar);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                eVar.f334680f = jVar.mo183892w(aVar, 3000, false);
            }
        }

        public C111766a(C111759e eVar, Rect rect) {
            this.f334698d = eVar;
            this.f334699e = rect;
        }

        public final void run() {
            this.f334698d.mo163495b().setX((float) this.f334699e.left);
            this.f334698d.mo163495b().setY((float) (this.f334699e.bottom - this.f334698d.mo163495b().getMeasuredHeight()));
            this.f334698d.mo163495b().setVisibility(0);
            this.f334698d.f334677c.setVisibility(4);
            this.f334698d.mo163495b().setAlpha(0.0f);
            ViewPropertyAnimator animate = this.f334698d.mo163495b().animate();
            if (animate != null) {
                animate.cancel();
            }
            this.f334698d.mo163495b().animate().alpha(1.0f).setDuration(150).withEndAction(new C111767a(this.f334698d));
        }
    }

    public C111765i(C111759e eVar, Rect rect, C111773l lVar) {
        this.f334695d = eVar;
        this.f334696e = rect;
        this.f334697f = lVar;
    }

    public final void run() {
        TextView b = this.f334695d.mo163495b();
        ViewGroup.LayoutParams layoutParams = this.f334695d.mo163495b().getLayoutParams();
        if (layoutParams != null) {
            Rect rect = this.f334696e;
            C111773l lVar = this.f334697f;
            layoutParams.width = rect.width();
            layoutParams.height = lVar.getResources().getDimensionPixelSize(C0966R.dimen.f3753d4);
        } else {
            layoutParams = null;
        }
        b.setLayoutParams(layoutParams);
        this.f334695d.mo163495b().post(new C111766a(this.f334695d, this.f334696e));
    }
}
