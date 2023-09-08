package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.emoji.ui.TouchInterceptorListView */
public class TouchInterceptorListView extends ListView {

    /* renamed from: A */
    public Drawable f197842A;

    /* renamed from: B */
    public int f197843B = 0;

    /* renamed from: d */
    public ImageView f197844d;

    /* renamed from: e */
    public WindowManager f197845e;

    /* renamed from: f */
    public WindowManager.LayoutParams f197846f;

    /* renamed from: g */
    public int f197847g;

    /* renamed from: h */
    public int f197848h;

    /* renamed from: i */
    public int f197849i;

    /* renamed from: j */
    public int f197850j;

    /* renamed from: n */
    public int f197851n;

    /* renamed from: o */
    public int f197852o;

    /* renamed from: p */
    public int f197853p;

    /* renamed from: q */
    public int f197854q;

    /* renamed from: r */
    public int f197855r;

    /* renamed from: s */
    public GestureDetector f197856s;

    /* renamed from: t */
    public int f197857t = -1;

    /* renamed from: u */
    public Rect f197858u = new Rect();

    /* renamed from: v */
    public Bitmap f197859v;

    /* renamed from: w */
    public final int f197860w;

    /* renamed from: x */
    public int f197861x;

    /* renamed from: y */
    public int f197862y;

    /* renamed from: z */
    public int f197863z;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.TouchInterceptorListView$a */
    public class C68858a extends GestureDetector.SimpleOnGestureListener {
        public C68858a() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            TouchInterceptorListView touchInterceptorListView = TouchInterceptorListView.this;
            ImageView imageView = touchInterceptorListView.f197844d;
            if (imageView == null) {
                return false;
            }
            if (f > 1000.0f) {
                Rect rect = touchInterceptorListView.f197858u;
                imageView.getDrawingRect(rect);
                if (motionEvent2.getX() > ((float) ((rect.right * 2) / 3))) {
                    TouchInterceptorListView.this.mo94716c();
                    TouchInterceptorListView touchInterceptorListView2 = TouchInterceptorListView.this;
                    touchInterceptorListView2.getClass();
                    int i = touchInterceptorListView2.f197848h;
                    throw null;
                }
            }
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.TouchInterceptorListView$b */
    public interface C68859b {
        /* renamed from: a */
        void mo94729a(int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.TouchInterceptorListView$c */
    public interface C68860c {
        /* renamed from: b */
        void mo94730b(int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.TouchInterceptorListView$d */
    public interface C68861d {
        void remove(int i);
    }

    public TouchInterceptorListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197860w = ViewConfiguration.get(context).getScaledTouchSlop();
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0966R.dimen.f357024a41) + 1;
        this.f197861x = dimensionPixelSize;
        this.f197863z = dimensionPixelSize / 2;
        this.f197862y = dimensionPixelSize * 2;
        this.f197843B = resources.getDimensionPixelOffset(C0966R.dimen.a48);
    }

    /* renamed from: b */
    public final int mo94715b(int i, int i2) {
        int b;
        if (i2 < 0 && (b = mo94715b(i, this.f197861x + i2)) > 0) {
            return b - 1;
        }
        Rect rect = this.f197858u;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            getChildAt(childCount).getHitRect(rect);
            if (rect.contains(i, i2)) {
                return getFirstVisiblePosition() + childCount;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final void mo94716c() {
        ImageView imageView = this.f197844d;
        if (imageView != null) {
            imageView.setVisibility(8);
            ((WindowManager) getContext().getSystemService("window")).removeView(this.f197844d);
            this.f197844d.setImageDrawable((Drawable) null);
            this.f197844d = null;
        }
        Bitmap bitmap = this.f197859v;
        if (bitmap != null) {
            Log.m105925i("MicroMsg.emoji.TouchInterceptorListView", "bitmap recycle %s", bitmap);
            this.f197859v.recycle();
            this.f197859v = null;
        }
        Drawable drawable = this.f197842A;
        if (drawable != null) {
            drawable.setLevel(0);
        }
    }

    /* renamed from: e */
    public final void mo94717e(boolean z) {
        int i = 0;
        while (true) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                if (z) {
                    int firstVisiblePosition = getFirstVisiblePosition();
                    int top = getChildAt(0).getTop();
                    setAdapter(getAdapter());
                    setSelectionFromTop(firstVisiblePosition, top);
                }
                try {
                    layoutChildren();
                    childAt = getChildAt(i);
                } catch (IllegalStateException unused) {
                }
                if (childAt == null) {
                    return;
                }
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = this.f197861x;
            childAt.setLayoutParams(layoutParams);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView", "unExpandViews", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(childAt, "com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView", "unExpandViews", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i++;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f197856s;
        if (gestureDetector != null) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/emoji/ui/TouchInterceptorListView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setDragListener(C68859b bVar) {
    }

    public void setDropListener(C68860c cVar) {
    }

    public void setRemoveListener(C68861d dVar) {
    }

    public void setTrashcan(Drawable drawable) {
        this.f197842A = drawable;
        this.f197857t = 2;
    }
}
