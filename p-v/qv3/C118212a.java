package qv3;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import rv3.C118244g;

/* renamed from: qv3.a */
public class C118212a {

    /* renamed from: b */
    public static final C118244g<C118212a> f353358b = new C118213a();

    /* renamed from: a */
    public final Map<Integer, Set<C47885b>> f353359a = new HashMap();

    /* renamed from: qv3.a$b */
    public class C47884b implements View.OnTouchListener {

        /* renamed from: d */
        public final View.OnTouchListener f128483d;

        public C47884b(View.OnTouchListener onTouchListener) {
            this.f128483d = onTouchListener;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/turingshield/touch/TouchEventWrapperManager$TouchListenerWrapper", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Map<Integer, Set<C47885b>> map = C118212a.this.f353359a;
            if (map != null && !((HashMap) map).isEmpty()) {
                for (C47885b onTouch : (Set) ((HashMap) C118212a.this.f353359a).get(Integer.valueOf(view.hashCode()))) {
                    onTouch.onTouch(view, motionEvent);
                }
            }
            View.OnTouchListener onTouchListener = this.f128483d;
            if (onTouchListener != null) {
                boolean onTouch2 = onTouchListener.onTouch(view, motionEvent);
                C117292a.m165362h(onTouch2, this, "com/tencent/turingshield/touch/TouchEventWrapperManager$TouchListenerWrapper", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return onTouch2;
            }
            C117292a.m165362h(false, this, "com/tencent/turingshield/touch/TouchEventWrapperManager$TouchListenerWrapper", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: qv3.a$a */
    public class C118213a extends C118244g<C118212a> {
        /* renamed from: a */
        public Object mo181965a() {
            return new C118212a();
        }
    }

    public C118212a() {
        new HashMap();
    }
}
