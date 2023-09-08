package sn0;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87984h;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sn0.e */
public class C90259e {

    /* renamed from: sn0.e$a */
    public static class C90260a extends C82919r2 {
        private static final int CTRL_INDEX = 137;
        public static final String NAME = "onLongPress";
    }

    /* renamed from: sn0.e$b */
    public static class C90261b extends C82919r2 {
        private static final int CTRL_INDEX = -2;
        public static final String NAME = "onTouchCancel";
    }

    /* renamed from: sn0.e$c */
    public static class C90262c extends C82919r2 {
        private static final int CTRL_INDEX = -2;
        public static final String NAME = "onTouchStart";
    }

    /* renamed from: sn0.e$d */
    public static class C90263d extends C82919r2 {
        private static final int CTRL_INDEX = -2;
        public static final String NAME = "onTouchMove";
    }

    /* renamed from: sn0.e$e */
    public static class C90264e extends C82919r2 {
        private static final int CTRL_INDEX = -2;
        public static final String NAME = "onTouchEnd";
    }

    /* renamed from: sn0.e$f */
    public static class C90265f {

        /* renamed from: a */
        public int f259090a;

        /* renamed from: b */
        public float f259091b;

        /* renamed from: c */
        public float f259092c;

        public C90265f() {
        }

        /* renamed from: a */
        public JSONObject mo124487a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f259090a);
                jSONObject.put("x", (double) (this.f259091b / C88020k.m109556g()));
                jSONObject.put("y", (double) (this.f259092c / C88020k.m109556g()));
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public String toString() {
            return mo124487a().toString();
        }

        public C90265f(int i, float f, float f2) {
            this.f259090a = i;
            this.f259091b = f;
            this.f259092c = f2;
        }
    }

    /* renamed from: a */
    public static boolean m112993a(ViewGroup viewGroup, MotionEvent motionEvent, boolean z, View view, int i) {
        MotionEvent motionEvent2;
        if (view == null) {
            Log.m105926v("MicroMsg.ViewMotionHelper", "child is null.");
            return false;
        }
        int action = motionEvent.getAction();
        if (z || action == 3) {
            motionEvent.setAction(3);
            boolean dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
            motionEvent.setAction(action);
            return dispatchTouchEvent;
        }
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            i2 |= 1 << motionEvent.getPointerId(i3);
        }
        int i4 = i & i2;
        if (i4 == 0) {
            Log.m105926v("MicroMsg.ViewMotionHelper", "newPointerIdBits is 0.");
            return false;
        }
        boolean isIdentity = view.getMatrix().isIdentity();
        if (i4 != i2) {
            MotionEvent c = AppBrandViewMotionCompat.m104663c(motionEvent, i4);
            motionEvent2 = c == null ? MotionEvent.obtain(motionEvent) : c;
        } else if (isIdentity) {
            float scrollX = (float) (viewGroup.getScrollX() - view.getLeft());
            float scrollY = (float) (viewGroup.getScrollY() - view.getTop());
            motionEvent.offsetLocation(scrollX, scrollY);
            boolean dispatchTouchEvent2 = view.dispatchTouchEvent(motionEvent);
            motionEvent.offsetLocation(-scrollX, -scrollY);
            return dispatchTouchEvent2;
        } else {
            motionEvent2 = MotionEvent.obtain(motionEvent);
        }
        motionEvent2.offsetLocation((float) (viewGroup.getScrollX() - view.getLeft()), (float) (viewGroup.getScrollY() - view.getTop()));
        if (!isIdentity) {
            Matrix matrix = (Matrix) view.getTag(C0966R.C0970id.f6103xd);
            if (matrix == null) {
                matrix = new Matrix();
                view.setTag(C0966R.C0970id.f6103xd, matrix);
            }
            view.getMatrix().invert(matrix);
            motionEvent2.transform(matrix);
        }
        boolean dispatchTouchEvent3 = view.dispatchTouchEvent(motionEvent2);
        motionEvent2.recycle();
        return dispatchTouchEvent3;
    }

    /* renamed from: b */
    public static void m112994b(ViewGroup viewGroup, MotionEvent motionEvent) {
        int childCount = viewGroup.getChildCount();
        int pointerId = viewGroup.isMotionEventSplittingEnabled() ? 1 << motionEvent.getPointerId(motionEvent.getActionIndex()) : -1;
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = viewGroup.getChildAt(i);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (AppBrandViewMotionCompat.m104661a(childAt) && AppBrandViewMotionCompat.m104662b(viewGroup, x, y, childAt, (PointF) null) && childAt.isDuplicateParentStateEnabled()) {
                m112993a(viewGroup, motionEvent, false, childAt, pointerId);
                if ((childAt instanceof C87984h) && ((C87984h) childAt).mo115841a()) {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public static C90265f m112995c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new C90265f(0, (float) iArr[0], (float) iArr[1]);
    }
}
