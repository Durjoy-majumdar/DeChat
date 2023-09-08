package bl0;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView;
import com.tencent.p014mm.plugin.appbrand.jsapi.container.WrapperNativeContainerView;
import j20.C117292a;
import java.util.ArrayList;
import jk0.C87978d;
import js0.C88020k;
import org.json.JSONObject;
import sn0.C90259e;

/* renamed from: bl0.a */
public class C79711a extends C87978d {
    public static final int CTRL_INDEX = 509;
    public static final String NAME = "insertPositioningContainer";

    /* renamed from: bl0.a$a */
    public class C79712a implements View.OnTouchListener {
        public C79712a(C79711a aVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/container/JsApiInsertPositioningContainer$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() != 0) {
                C90259e.m112994b((ViewGroup) view, motionEvent);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/jsapi/container/JsApiInsertPositioningContainer$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("containerId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        AppBrandNativeContainerView appBrandNativeContainerView = new AppBrandNativeContainerView(hVar.getContext());
        int i = 0;
        appBrandNativeContainerView.setBackgroundColor(0);
        boolean optBoolean = jSONObject.optBoolean("visible", true);
        boolean optBoolean2 = jSONObject.optBoolean("canFullScreenByChild", false);
        int k = C88020k.m109560k(jSONObject, "contentOffsetLeft", 0);
        int k2 = C88020k.m109560k(jSONObject, "contentOffsetTop", 0);
        appBrandNativeContainerView.setX((float) (-k));
        appBrandNativeContainerView.setY((float) (-k2));
        WrapperNativeContainerView wrapperNativeContainerView = new WrapperNativeContainerView(hVar.getContext(), (View) appBrandNativeContainerView);
        if (!optBoolean) {
            i = 4;
        }
        wrapperNativeContainerView.setVisibility(i);
        wrapperNativeContainerView.setDuplicateParentStateEnabled(true);
        appBrandNativeContainerView.setDuplicateParentStateEnabled(true);
        appBrandNativeContainerView.setFullscreenWithChild(optBoolean2);
        return wrapperNativeContainerView;
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        view.setOnTouchListener(new C79712a(this));
    }
}
