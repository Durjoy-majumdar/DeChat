package com.tencent.p014mm.plugin.appbrand.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import hr0.C87583a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p224ra.C89909e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.e */
public class C84927e extends FrameLayout {

    /* renamed from: d */
    public final C87583a f247546d;

    /* renamed from: e */
    public C84930c f247547e = new C84930c();

    /* renamed from: f */
    public C85007k f247548f = null;

    /* renamed from: g */
    public boolean f247549g;

    /* renamed from: h */
    public View f247550h;

    /* renamed from: i */
    public final Set<Runnable> f247551i = new HashSet();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.e$a */
    public class C84928a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f247552d;

        public C84928a(Runnable runnable) {
            this.f247552d = runnable;
        }

        public void run() {
            C84927e.this.mo117763a(this.f247552d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.e$b */
    public interface C84929b {
        /* renamed from: a */
        float[] mo117774a(Context context);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.e$c */
    public class C84930c {

        /* renamed from: a */
        public C84929b f247554a = null;

        /* renamed from: b */
        public Rect f247555b = new Rect();

        /* renamed from: c */
        public RectF f247556c = new RectF();

        /* renamed from: d */
        public Path f247557d = new Path();

        public C84930c() {
        }
    }

    public C84927e(Context context) {
        super(context);
        setWillNotDraw(false);
        this.f247546d = (C87583a) C89909e.m112439d(C87583a.class, true);
    }

    /* renamed from: a */
    public void mo117763a(Runnable runnable) {
        if (runnable != null) {
            if (!C2039g2.m1987a()) {
                ((C119157j) C119157j.f356862d).mo183895z(new C84928a(runnable));
            } else if (getAnimation() == null) {
                runnable.run();
            } else {
                ((HashSet) this.f247551i).add(runnable);
            }
        }
    }

    public void dispatchDraw(Canvas canvas) {
        if (!willNotDraw()) {
            try {
                super.dispatchDraw(canvas);
            } catch (Exception e) {
                Exception exc = e;
                Log.printErrStackTrace("Luggage.WXA.AppBrandRuntimeFrameLayout", exc, "", new Object[0]);
                if (exc instanceof NullPointerException) {
                    this.f247546d.idkeyStat(1088, 0, 1, false);
                } else {
                    this.f247546d.idkeyStat(1088, 1, 1, false);
                }
                throw exc;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f247550h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
        /*
            r1 = this;
            boolean r0 = r1.f247549g
            if (r0 == 0) goto L_0x000d
            android.view.View r0 = r1.f247550h
            if (r0 == 0) goto L_0x000d
            boolean r2 = r0.dispatchTouchEvent(r2)
            return r2
        L_0x000d:
            boolean r2 = super.dispatchTouchEvent(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.C84927e.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Iterator it = ((HashSet) this.f247551i).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((HashSet) this.f247551i).clear();
    }

    public void onDraw(Canvas canvas) {
        C84930c cVar = this.f247547e;
        Context context = getContext();
        C84929b bVar = cVar.f247554a;
        if (bVar != null) {
            float[] a = bVar.mo117774a(context);
            cVar.f247555b.setEmpty();
            C84927e.this.getGlobalVisibleRect(cVar.f247555b);
            Rect rect = cVar.f247555b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) (rect.right - rect.left), (float) (rect.bottom - rect.top));
            cVar.f247556c.setEmpty();
            RectF rectF2 = cVar.f247556c;
            rectF2.left = 0.0f;
            rectF2.top = 0.0f;
            Rect rect2 = cVar.f247555b;
            rectF2.right = (float) (rect2.right - rect2.left);
            rectF2.bottom = (float) (rect2.bottom - rect2.top);
            cVar.f247557d.rewind();
            cVar.f247557d.addRoundRect(rectF, a, Path.Direction.CW);
            cVar.f247557d.close();
            canvas.clipPath(cVar.f247557d);
        }
        super.onDraw(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C85007k kVar = this.f247548f;
        if (kVar != null) {
            kVar.mo117948c(i, i2, i3, i4);
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Log.m105925i("Luggage.WXA.AppBrandRuntimeFrameLayout", "onViewRemoved %s", view);
    }

    public void removeAllViews() {
        Log.m105919d("Luggage.WXA.AppBrandRuntimeFrameLayout", "removeAllViews stack = %s", android.util.Log.getStackTraceString(new Throwable()));
        super.removeAllViews();
    }

    public void setRoundCornerProvider(C84929b bVar) {
        this.f247547e.f247554a = bVar;
    }

    public void setWxaHalfScreenGestureController(C85007k kVar) {
        this.f247548f = kVar;
    }

    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }
}
