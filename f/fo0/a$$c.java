package fo0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sn0.C90259e;

public class a$$c {

    /* renamed from: a */
    public C82520h f252506a;

    /* renamed from: b */
    public GestureDetector f252507b;

    /* renamed from: c */
    public C82919r2 f252508c = new C90259e.C90262c();

    /* renamed from: d */
    public C82919r2 f252509d = new C90259e.C90264e();

    /* renamed from: e */
    public C82919r2 f252510e = new C90259e.C90263d();

    /* renamed from: f */
    public C82919r2 f252511f = new C90259e.C90261b();

    /* renamed from: g */
    public C82919r2 f252512g = new C90259e.C90260a();

    /* renamed from: h */
    public C82919r2 f252513h = new a$$d((C87014b) null);

    /* renamed from: i */
    public C82919r2 f252514i = new a$$e((C87014b) null);

    /* renamed from: j */
    public String f252515j;

    /* renamed from: k */
    public long f252516k = 0;

    /* renamed from: fo0.a$$c$a */
    public class C87013a extends GestureDetector.SimpleOnGestureListener {
        public C87013a() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/canvas/AppBrandCanvasPluginHandler$CanvasTouchEventDispatcher$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/canvas/AppBrandCanvasPluginHandler$CanvasTouchEventDispatcher$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/canvas/AppBrandCanvasPluginHandler$CanvasTouchEventDispatcher$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/canvas/AppBrandCanvasPluginHandler$CanvasTouchEventDispatcher$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/canvas/AppBrandCanvasPluginHandler$CanvasTouchEventDispatcher$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            a$$c a__c = a$$c.this;
            a__c.mo121420d(a__c.f252512g, a__c.mo121417a(motionEvent));
            C82919r2 r2Var = a__c.f252513h;
            JSONObject a = a__c.mo121417a(motionEvent);
            HashMap hashMap = new HashMap(1);
            hashMap.put("data", a__c.f252515j);
            hashMap.put("touch", a);
            C82520h hVar = a__c.f252506a;
            r2Var.mo115165o(hashMap);
            hVar.mo109676w(r2Var);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/canvas/AppBrandCanvasPluginHandler$CanvasTouchEventDispatcher$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/canvas/AppBrandCanvasPluginHandler$CanvasTouchEventDispatcher$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/canvas/AppBrandCanvasPluginHandler$CanvasTouchEventDispatcher$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    public a$$c(C82520h hVar) {
        this.f252506a = hVar;
        this.f252507b = new GestureDetector(this.f252506a.getContext(), new C87013a());
    }

    /* renamed from: a */
    public final JSONObject mo121417a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float x = motionEvent.getX(actionIndex);
        float y = motionEvent.getY(actionIndex);
        C90259e.C90265f fVar = new C90259e.C90265f();
        fVar.f259090a = pointerId;
        fVar.f259091b = x;
        fVar.f259092c = y;
        return fVar.mo124487a();
    }

    /* renamed from: b */
    public final JSONArray mo121418b(MotionEvent motionEvent) {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            C90259e.C90265f fVar = new C90259e.C90265f();
            fVar.f259090a = motionEvent.getPointerId(i);
            fVar.f259091b = motionEvent.getX(i);
            fVar.f259092c = motionEvent.getY(i);
            arrayList.add(fVar);
        }
        int size = arrayList.size();
        C90259e.C90265f[] fVarArr = new C90259e.C90265f[size];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            fVarArr[i2] = (C90259e.C90265f) arrayList.get(i2);
        }
        if (size > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                jSONArray.put(fVarArr[i3].mo124487a());
            }
        }
        return jSONArray;
    }

    /* renamed from: c */
    public final void mo121419c(C82919r2 r2Var, JSONArray jSONArray) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("data", this.f252515j);
        hashMap.put("touches", jSONArray);
        this.f252506a.mo109669n(r2Var.mo115165o(hashMap), (int[]) null);
    }

    /* renamed from: d */
    public final void mo121420d(C82919r2 r2Var, JSONObject jSONObject) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("data", this.f252515j);
        hashMap.put("touch", jSONObject);
        this.f252506a.mo109669n(r2Var.mo115165o(hashMap), (int[]) null);
    }
}
