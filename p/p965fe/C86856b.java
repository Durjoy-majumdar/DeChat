package p965fe;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;

/* renamed from: fe.b */
public class C86856b implements View.OnTouchListener {

    /* renamed from: d */
    public float f252134d = 0.0f;

    /* renamed from: e */
    public float f252135e = 0.0f;

    /* renamed from: f */
    public int f252136f = 0;

    /* renamed from: g */
    public int f252137g = 0;

    /* renamed from: h */
    public final /* synthetic */ WindowManager.LayoutParams f252138h;

    /* renamed from: i */
    public final /* synthetic */ WindowManager f252139i;

    /* renamed from: j */
    public final /* synthetic */ int f252140j;

    /* renamed from: n */
    public final /* synthetic */ C86853a f252141n;

    /* renamed from: fe.b$a */
    public class C86857a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f252142d;

        public C86857a(View view) {
            this.f252142d = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = C86856b.this.f252141n.f252125e;
            if (view != null) {
                int hashCode = view.hashCode();
                C86856b bVar = C86856b.this;
                if (hashCode == bVar.f252140j) {
                    bVar.f252138h.x = ((Integer) valueAnimator.getAnimatedValue("trans")).intValue();
                    C86856b bVar2 = C86856b.this;
                    bVar2.f252139i.updateViewLayout(this.f252142d, bVar2.f252138h);
                }
            }
        }
    }

    public C86856b(C86853a aVar, WindowManager.LayoutParams layoutParams, WindowManager windowManager, int i) {
        this.f252141n = aVar;
        this.f252138h = layoutParams;
        this.f252139i = windowManager;
        this.f252140j = i;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f252134d = motionEvent.getX();
            this.f252135e = motionEvent.getY();
            WindowManager.LayoutParams layoutParams = this.f252138h;
            this.f252136f = layoutParams.x;
            this.f252137g = layoutParams.y;
        } else if (action == 1) {
            int[] iArr = new int[2];
            int i2 = this.f252138h.x;
            iArr[0] = i2;
            C86853a aVar = this.f252141n;
            if (i2 > (aVar.f252121a.widthPixels - aVar.f252125e.getWidth()) / 2) {
                C86853a aVar2 = this.f252141n;
                i = aVar2.f252121a.widthPixels - aVar2.f252125e.getWidth();
            } else {
                i = 0;
            }
            iArr[1] = i;
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("trans", iArr)});
            ofPropertyValuesHolder.addUpdateListener(new C86857a(view));
            ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
            ofPropertyValuesHolder.setDuration(180).start();
            WindowManager.LayoutParams layoutParams2 = this.f252138h;
            int i3 = layoutParams2.x;
            int i4 = layoutParams2.y;
            if (Math.abs(i3 - this.f252136f) > 20 || Math.abs(i4 - this.f252137g) > 20) {
                return true;
            }
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            WindowManager.LayoutParams layoutParams3 = this.f252138h;
            layoutParams3.x = (int) (((float) layoutParams3.x) + ((x - this.f252134d) / 3.0f));
            layoutParams3.y = (int) (((float) layoutParams3.y) + ((y - this.f252135e) / 3.0f));
            if (view != null) {
                this.f252139i.updateViewLayout(view, layoutParams3);
            }
        }
        return false;
    }
}
