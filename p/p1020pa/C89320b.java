package p1020pa;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p1005ma.C88718b;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: pa.b */
public final class C89320b extends FrameLayout {

    /* renamed from: q */
    public static final /* synthetic */ int f257277q = 0;

    /* renamed from: d */
    public View f257278d;

    /* renamed from: e */
    public View f257279e;

    /* renamed from: f */
    public int f257280f = -1;

    /* renamed from: g */
    public boolean f257281g = false;

    /* renamed from: h */
    public final int[] f257282h = new int[2];

    /* renamed from: i */
    public C89328e f257283i;

    /* renamed from: j */
    public WeakHashMap<View, C89324d> f257284j = new WeakHashMap<>();

    /* renamed from: n */
    public Runnable f257285n = new C89321a();

    /* renamed from: o */
    public final Runnable f257286o = new C89322b();

    /* renamed from: p */
    public final Set<C89323c> f257287p = new HashSet();

    /* renamed from: pa.b$a */
    public class C89321a implements Runnable {
        public C89321a() {
        }

        public void run() {
            View view = C89320b.this.f257278d;
            if (view != null) {
                C88718b.m110681c("MicroMsg.AppBrandUIdRootFrameLayout", "hideInactivePanelView, mPanel %s", view.getClass().getSimpleName());
                for (int i = 0; i < C89320b.this.getChildCount(); i++) {
                    View childAt = C89320b.this.getChildAt(i);
                    if (childAt != null) {
                        C89320b bVar = C89320b.this;
                        if (!(childAt == bVar.f257279e || childAt == bVar.f257278d)) {
                            bVar.getClass();
                            if (!(childAt == null || childAt.getVisibility() == 8)) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "fast_setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(childAt, "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "fast_setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: pa.b$b */
    public class C89322b implements Runnable {
        public C89322b() {
        }

        public void run() {
            C88718b.m110681c("MicroMsg.AppBrandUIdRootFrameLayout", "callOnPanelChanged, size %d", Integer.valueOf(((HashSet) C89320b.this.f257287p).size()));
            if (((HashSet) C89320b.this.f257287p).size() > 0) {
                int size = ((HashSet) C89320b.this.f257287p).size();
                C89323c[] cVarArr = new C89323c[size];
                C89320b.this.f257287p.toArray(cVarArr);
                for (int i = 0; i < size; i++) {
                    cVarArr[i].mo123685a();
                }
            }
        }
    }

    /* renamed from: pa.b$c */
    public interface C89323c {
        /* renamed from: a */
        void mo123685a();
    }

    /* renamed from: pa.b$d */
    public static final class C89324d {

        /* renamed from: a */
        public boolean f257290a;

        /* renamed from: b */
        public int f257291b = 8;
    }

    public C89320b(Context context, View view) {
        super(context);
        super.setId(C0966R.C0970id.f6025v7);
        this.f257279e = view;
    }

    /* renamed from: b */
    public static C89325c m111641b(View view) {
        C89320b bVar = (C89320b) view.getRootView().findViewById(C0966R.C0970id.f6025v7);
        if (bVar == null) {
            return null;
        }
        if (bVar.getOnLayoutListener() == null || !(bVar.getOnLayoutListener() instanceof C89325c)) {
            bVar.setOnLayoutListener(new C89325c());
        }
        bVar.getViewTreeObserver().addOnGlobalLayoutListener(new C89319a(bVar));
        return (C89325c) bVar.getOnLayoutListener();
    }

    /* renamed from: a */
    public void mo123666a(View view, boolean z) {
        View view2 = this.f257278d;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f257278d = null;
        }
        if (this != view.getParent()) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f257278d = view;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            super.addView(view, layoutParams);
            C89324d dVar = new C89324d();
            dVar.f257290a = z;
            this.f257284j.put(view, dVar);
        }
    }

    public void addView(View view) {
        if (view == this.f257279e || view == this.f257278d) {
            super.addView(view);
        }
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        return false;
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        C89324d dVar = this.f257284j.get(this.f257278d);
        if (dVar != null && dVar.f257290a && (view = this.f257278d) != null && view.isShown() && motionEvent.getAction() == 0) {
            float rawY = motionEvent.getRawY();
            this.f257278d.getLocationOnScreen(this.f257282h);
            float f = (float) this.f257282h[1];
            float height = ((float) this.f257278d.getHeight()) + f;
            if (rawY < f || rawY > height) {
                View view2 = this.f257278d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCurrentBottomPanel() {
        return this.f257278d;
    }

    public C89328e getOnLayoutListener() {
        return this.f257283i;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f257281g = true;
        super.onLayout(z, i, i2, i3, i4);
        this.f257281g = false;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f257280f;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f257284j.remove(view);
    }

    public void setForceHeight(int i) {
        boolean z = i != this.f257280f;
        this.f257280f = i;
        if (z) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145208c(this) && !this.f257281g) {
                requestLayout();
            }
        }
    }

    public void setId(int i) {
    }

    public void setOnLayoutListener(C89328e eVar) {
        this.f257283i = eVar;
    }

    public void addView(View view, int i) {
        if (view == this.f257279e || view == this.f257278d) {
            super.addView(view, i);
        }
    }

    public void addView(View view, int i, int i2) {
        if (view == this.f257279e || view == this.f257278d) {
            super.addView(view, i, i2);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view == this.f257279e || view == this.f257278d) {
            super.addView(view, layoutParams);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view == this.f257279e || view == this.f257278d) {
            super.addView(view, i, layoutParams);
        }
    }
}
