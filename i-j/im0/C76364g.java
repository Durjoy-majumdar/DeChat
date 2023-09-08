package im0;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: im0.g */
public class C76364g implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener {

    /* renamed from: d */
    public TouchDelegate f223644d;

    /* renamed from: e */
    public View f223645e;

    /* renamed from: f */
    public View f223646f;

    /* renamed from: im0.g$a */
    public class C76365a implements View.OnTouchListener {
        public C76365a(C76364g gVar, C76362f fVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/prompt/JsApiShowToast$1$1ToastBlockTouchInjector$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/jsapi/prompt/JsApiShowToast$1$1ToastBlockTouchInjector$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    public C76364g(C76362f fVar, View view) {
        view.addOnAttachStateChangeListener(this);
        view.setOnTouchListener(new C76365a(this, fVar));
        this.f223645e = view;
    }

    /* renamed from: a */
    public final void mo106586a() {
        if (this.f223646f != null) {
            View view = this.f223645e;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(view)) {
                Rect rect = new Rect(0, 0, this.f223646f.getWidth(), this.f223646f.getHeight());
                View view2 = this.f223646f;
                TouchDelegate touchDelegate = new TouchDelegate(rect, this.f223645e);
                this.f223644d = touchDelegate;
                view2.setTouchDelegate(touchDelegate);
            }
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mo106586a();
    }

    public void onViewAttachedToWindow(View view) {
        this.f223646f = (View) view.getParent();
        mo106586a();
        this.f223646f.addOnLayoutChangeListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        View view2 = this.f223646f;
        if (view2 != null && view2.getTouchDelegate() == this.f223644d) {
            this.f223646f.setTouchDelegate((TouchDelegate) null);
        }
        View view3 = this.f223646f;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
    }
}
