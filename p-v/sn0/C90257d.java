package sn0;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import junit.framework.Assert;
import org.json.JSONException;
import org.json.JSONObject;
import p849e3.C107168a0;
import p849e3.C107207u;
import sn0.C90259e;

/* renamed from: sn0.d */
public class C90257d implements View.OnTouchListener {

    /* renamed from: t */
    public static volatile View f259074t;

    /* renamed from: d */
    public Map<Integer, C90259e.C90265f> f259075d = new HashMap();

    /* renamed from: e */
    public boolean f259076e;

    /* renamed from: f */
    public boolean f259077f;

    /* renamed from: g */
    public C90259e.C90265f f259078g;

    /* renamed from: h */
    public Runnable f259079h;

    /* renamed from: i */
    public C86493v0.C86495c f259080i;

    /* renamed from: j */
    public float f259081j;

    /* renamed from: n */
    public MotionEvent f259082n;

    /* renamed from: o */
    public MotionEvent f259083o;

    /* renamed from: p */
    public C90259e.C90265f f259084p;

    /* renamed from: q */
    public C90259e.C90265f f259085q;

    /* renamed from: r */
    public View f259086r;

    /* renamed from: s */
    public C82381f f259087s;

    /* renamed from: sn0.d$a */
    public class C90258a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f259088d;

        public C90258a(C82381f fVar) {
            this.f259088d = fVar;
        }

        public void run() {
            C90257d dVar = C90257d.this;
            if (!dVar.f259076e) {
                Log.m105926v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but pressed is false or pointer is null.");
                return;
            }
            View view = dVar.f259086r;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (!C107207u.C107211e.m145207b(view)) {
                Log.m105926v("MicroMsg.OnTouchListenerImpl", "check long press timeout, view removed");
                if (C90257d.f259074t != null && C90257d.f259074t.equals(C90257d.this.f259086r)) {
                    C90257d.f259074t = null;
                    return;
                }
                return;
            }
            C90259e.C90265f c = C90259e.m112995c(C90257d.this.f259086r);
            if (Math.abs(C90257d.this.f259078g.f259091b - c.f259091b) > 1.0f || Math.abs(C90257d.this.f259078g.f259092c - c.f259092c) > 1.0f) {
                Log.m105926v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but view has moved.");
            } else if (((HashMap) C90257d.this.f259075d).size() != 1) {
                Log.m105926v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but more then one point.");
            } else {
                C90257d dVar2 = C90257d.this;
                float abs = Math.abs(dVar2.f259084p.f259091b - dVar2.f259085q.f259091b);
                C90257d dVar3 = C90257d.this;
                if (abs <= dVar3.f259081j) {
                    float abs2 = Math.abs(dVar3.f259084p.f259092c - dVar3.f259085q.f259092c);
                    C90257d dVar4 = C90257d.this;
                    if (abs2 <= dVar4.f259081j) {
                        Log.m105927v("MicroMsg.OnTouchListenerImpl", "check long press timeout, publish event(%s, %s, %s, %s).", Float.valueOf(dVar4.f259084p.f259091b), Float.valueOf(C90257d.this.f259085q.f259091b), Float.valueOf(C90257d.this.f259084p.f259092c), Float.valueOf(C90257d.this.f259085q.f259092c));
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("data", C90257d.this.f259080i.mo120959f("data", ""));
                            jSONObject.put("touch", C90257d.this.f259084p.mo124487a());
                        } catch (JSONException unused) {
                        }
                        if (!C90257d.this.f259080i.mo120957d("disableScroll", false)) {
                            C90257d dVar5 = C90257d.this;
                            dVar5.f259082n = MotionEvent.obtain(dVar5.f259083o);
                            C90257d.this.f259082n.setAction(0);
                            C90257d.this.f259080i.mo120963j("fakeDownEvent", true);
                            C90257d.this.f259086r.getParent().requestDisallowInterceptTouchEvent(true);
                            C90257d.this.f259086r.setDuplicateParentStateEnabled(false);
                            C90257d dVar6 = C90257d.this;
                            dVar6.mo124481a(dVar6.f259086r, MotionEvent.obtain(dVar6.f259082n));
                        }
                        C90257d dVar7 = C90257d.this;
                        C82381f fVar = this.f259088d;
                        C90259e.C90260a aVar = new C90259e.C90260a();
                        String jSONObject2 = jSONObject.toString();
                        dVar7.getClass();
                        fVar.mo109651e(aVar.mo114779e(), jSONObject2, (int[]) null);
                        return;
                    }
                }
                Log.m105927v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but point has moved(%s, %s, %s, %s).", Float.valueOf(C90257d.this.f259084p.f259091b), Float.valueOf(C90257d.this.f259085q.f259091b), Float.valueOf(C90257d.this.f259084p.f259092c), Float.valueOf(C90257d.this.f259085q.f259092c));
            }
        }
    }

    public C90257d(C82381f fVar, C86493v0.C86495c cVar) {
        Assert.assertNotNull(fVar);
        Assert.assertNotNull(cVar);
        this.f259080i = cVar;
        fVar.getComponentId();
        this.f259087s = fVar;
        this.f259081j = (float) ViewConfiguration.get(fVar.getContext()).getScaledTouchSlop();
        this.f259084p = new C90259e.C90265f();
        this.f259085q = new C90259e.C90265f();
        this.f259079h = new C90258a(fVar);
    }

    /* renamed from: a */
    public final void mo124481a(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            view.dispatchTouchEvent(motionEvent);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        motionEvent.offsetLocation(-(((float) viewGroup.getScrollX()) - view.getX()), -(((float) viewGroup.getScrollY()) - view.getY()));
        mo124481a((View) parent, motionEvent);
    }

    /* renamed from: b */
    public C90259e.C90265f[] mo124482b(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            int pointerId = motionEvent.getPointerId(i);
            C90259e.C90265f fVar = (C90259e.C90265f) ((HashMap) this.f259075d).get(Integer.valueOf(pointerId));
            if (fVar != null) {
                fVar.f259091b = motionEvent.getX(i);
                fVar.f259092c = motionEvent.getY(i);
                arrayList.add(fVar);
            }
        }
        C90259e.C90265f[] fVarArr = new C90259e.C90265f[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            fVarArr[i2] = (C90259e.C90265f) arrayList.get(i2);
        }
        return fVarArr;
    }

    /* renamed from: c */
    public final void mo124483c(C82381f fVar, C90259e.C90265f fVar2, C82919r2 r2Var, String str) {
        if (fVar2 != null && r2Var != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", str);
                jSONObject.put("touch", fVar2.mo124487a());
            } catch (JSONException unused) {
            }
            fVar.mo109651e(r2Var.mo114779e(), jSONObject.toString(), (int[]) null);
        }
    }

    /* renamed from: d */
    public final void mo124484d(View view, boolean z, C90259e.C90265f fVar) {
        this.f259086r = view;
        this.f259076e = z;
        if (!z) {
            this.f259080i.mo120963j("fakeDownEvent", false);
            this.f259080i.mo120963j("onLongClick", false);
            this.f259086r.removeCallbacks(this.f259079h);
            C90259e.C90265f fVar2 = this.f259084p;
            fVar2.f259090a = -1;
            fVar2.f259091b = 0.0f;
            fVar2.f259092c = 0.0f;
            this.f259082n = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00df, code lost:
        if (r0 != 6) goto L_0x034d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r24, android.view.MotionEvent r25) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            r8 = r25
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            r0.add(r8)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/appbrand/jsapi/view/ViewMotionFactory$CanvasOnTouchListener"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r23
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            android.view.View r0 = f259074t
            r9 = 0
            java.lang.String r1 = "MicroMsg.OnTouchListenerImpl"
            if (r0 == 0) goto L_0x004b
            android.view.View r0 = f259074t
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "onTouch, not current motion view"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r0)
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/appbrand/jsapi/view/ViewMotionFactory$CanvasOnTouchListener"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r23
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r9
        L_0x004b:
            r6.f259083o = r8
            int r0 = r25.getActionMasked()
            int r2 = r25.getActionIndex()
            r25.getPointerCount()
            int r3 = r8.getPointerId(r2)
            float r4 = r8.getX(r2)
            float r2 = r8.getY(r2)
            java.lang.String r5 = "isTouching"
            r10 = 3
            if (r0 == 0) goto L_0x008b
            eb0.v0$c r11 = r6.f259080i
            boolean r11 = r11.mo120960g(r5)
            if (r11 != 0) goto L_0x008b
            java.util.WeakHashMap<android.view.View, e3.a0> r11 = p849e3.C107207u.f320808a
            boolean r11 = p849e3.C107207u.C107211e.m145207b(r24)
            if (r11 != 0) goto L_0x008b
            if (r0 == r10) goto L_0x008b
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/appbrand/jsapi/view/ViewMotionFactory$CanvasOnTouchListener"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r23
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r9
        L_0x008b:
            eb0.v0$c r11 = r6.f259080i
            java.lang.String r12 = "data"
            java.lang.String r13 = ""
            java.lang.String r11 = r11.mo120959f(r12, r13)
            eb0.v0$c r13 = r6.f259080i
            java.lang.String r14 = "disableScroll"
            boolean r13 = r13.mo120957d(r14, r9)
            eb0.v0$c r15 = r6.f259080i
            java.lang.String r10 = "fakeDownEvent"
            boolean r15 = r15.mo120957d(r10, r9)
            r16 = r15
            eb0.v0$c r15 = r6.f259080i
            r17 = r1
            java.lang.String r1 = "onLongClick"
            boolean r15 = r15.mo120957d(r1, r9)
            r18 = r1
            eb0.v0$c r1 = r6.f259080i
            r19 = r10
            java.lang.String r10 = "enableLongClick"
            boolean r1 = r1.mo120957d(r10, r9)
            r6.f259077f = r1
            sn0.e$f r1 = r6.f259085q
            r1.f259090a = r3
            r1.f259091b = r4
            r1.f259092c = r2
            r1 = r13 | r15
            r10 = 1
            if (r0 == 0) goto L_0x0269
            java.lang.String r9 = "disableScroll-nextState"
            r20 = r1
            if (r0 == r10) goto L_0x021b
            r10 = 2
            java.lang.String r1 = "touches"
            if (r0 == r10) goto L_0x015e
            r10 = 3
            if (r0 == r10) goto L_0x00e9
            r1 = 5
            if (r0 == r1) goto L_0x00e3
            r1 = 6
            if (r0 == r1) goto L_0x0246
            goto L_0x034d
        L_0x00e3:
            r1 = r20
            r9 = 1
            r10 = 0
            goto L_0x02f7
        L_0x00e9:
            r10 = 0
            f259074t = r10
            r0 = 0
            r6.mo124484d(r7, r0, r10)
            if (r13 != 0) goto L_0x00f9
            if (r15 == 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            r7.setDuplicateParentStateEnabled(r0)
            goto L_0x0100
        L_0x00f9:
            android.view.ViewParent r2 = r24.getParent()
            r2.requestDisallowInterceptTouchEvent(r0)
        L_0x0100:
            eb0.v0$c r2 = r6.f259080i
            r2.mo120963j(r5, r0)
            eb0.v0$c r0 = r6.f259080i
            boolean r0 = r0.mo120954a(r9)
            if (r0 == 0) goto L_0x0116
            eb0.v0$c r0 = r6.f259080i
            boolean r2 = r0.mo120957d(r9, r13)
            r0.mo120963j(r14, r2)
        L_0x0116:
            java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
            boolean r0 = p849e3.C107207u.C107211e.m145207b(r24)
            if (r0 == 0) goto L_0x0155
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            r0.put(r12, r11)     // Catch:{ JSONException -> 0x012e }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x012e }
        L_0x012e:
            sn0.e$f[] r1 = r6.mo124482b(r8)
            r9 = 0
        L_0x0133:
            int r3 = r1.length
            if (r9 >= r3) goto L_0x0142
            r3 = r1[r9]
            org.json.JSONObject r3 = r3.mo124487a()
            r2.put(r3)
            int r9 = r9 + 1
            goto L_0x0133
        L_0x0142:
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r6.f259087s
            sn0.e$b r2 = new sn0.e$b
            r2.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r2.mo114779e()
            r3 = 0
            r1.mo109651e(r2, r0, r3)
        L_0x0155:
            java.util.Map<java.lang.Integer, sn0.e$f> r0 = r6.f259075d
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
            goto L_0x034d
        L_0x015e:
            r0 = 0
        L_0x015f:
            int r2 = r25.getPointerCount()
            if (r0 >= r2) goto L_0x0194
            float r2 = r8.getX(r0)
            float r3 = r8.getY(r0)
            int r4 = r8.getPointerId(r0)
            java.util.Map<java.lang.Integer, sn0.e$f> r5 = r6.f259075d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r4 = r5.get(r4)
            sn0.e$f r4 = (sn0.C90259e.C90265f) r4
            if (r4 != 0) goto L_0x0182
            goto L_0x018f
        L_0x0182:
            float r5 = r4.f259091b
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0192
            float r2 = r4.f259092c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x018f
            goto L_0x0192
        L_0x018f:
            int r0 = r0 + 1
            goto L_0x015f
        L_0x0192:
            r0 = 1
            goto L_0x0195
        L_0x0194:
            r0 = 0
        L_0x0195:
            if (r0 != 0) goto L_0x0199
            goto L_0x034d
        L_0x0199:
            java.util.Map<java.lang.Integer, sn0.e$f> r0 = r6.f259075d
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L_0x01d3
            boolean r0 = r6.f259076e
            if (r0 == 0) goto L_0x01d3
            sn0.e$f r0 = r6.f259084p
            float r0 = r0.f259091b
            sn0.e$f r2 = r6.f259085q
            float r2 = r2.f259091b
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = r6.f259081j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x01ce
            sn0.e$f r0 = r6.f259084p
            float r0 = r0.f259092c
            sn0.e$f r2 = r6.f259085q
            float r2 = r2.f259092c
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = r6.f259081j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d3
        L_0x01ce:
            r0 = 0
            r2 = 0
            r6.mo124484d(r7, r2, r0)
        L_0x01d3:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            r0.put(r12, r11)     // Catch:{ JSONException -> 0x01e4 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x01e4 }
            goto L_0x01e5
        L_0x01e4:
        L_0x01e5:
            sn0.e$f[] r1 = r6.mo124482b(r8)
            int r3 = r1.length
            if (r3 <= 0) goto L_0x01fc
            r9 = 0
        L_0x01ed:
            int r3 = r1.length
            if (r9 >= r3) goto L_0x01fc
            r3 = r1[r9]
            org.json.JSONObject r3 = r3.mo124487a()
            r2.put(r3)
            int r9 = r9 + 1
            goto L_0x01ed
        L_0x01fc:
            java.util.Map<java.lang.Integer, sn0.e$f> r1 = r6.f259075d
            java.util.HashMap r1 = (java.util.HashMap) r1
            int r1 = r1.size()
            if (r1 == 0) goto L_0x034d
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r6.f259087s
            sn0.e$d r2 = new sn0.e$d
            r2.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r2.mo114779e()
            r3 = 0
            r1.mo109651e(r2, r0, r3)
            goto L_0x034d
        L_0x021b:
            if (r13 != 0) goto L_0x0225
            if (r15 == 0) goto L_0x0220
            goto L_0x0225
        L_0x0220:
            r0 = 0
            r7.setDuplicateParentStateEnabled(r0)
            goto L_0x022d
        L_0x0225:
            r0 = 0
            android.view.ViewParent r1 = r24.getParent()
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x022d:
            r1 = 0
            f259074t = r1
            eb0.v0$c r1 = r6.f259080i
            r1.mo120963j(r5, r0)
            eb0.v0$c r0 = r6.f259080i
            boolean r0 = r0.mo120954a(r9)
            if (r0 == 0) goto L_0x0246
            eb0.v0$c r0 = r6.f259080i
            boolean r1 = r0.mo120957d(r9, r13)
            r0.mo120963j(r14, r1)
        L_0x0246:
            java.util.Map<java.lang.Integer, sn0.e$f> r0 = r6.f259075d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.remove(r1)
            sn0.e$f r0 = (sn0.C90259e.C90265f) r0
            if (r0 != 0) goto L_0x0258
            goto L_0x034d
        L_0x0258:
            r1 = 0
            r2 = 0
            r6.mo124484d(r7, r2, r1)
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r6.f259087s
            sn0.e$e r2 = new sn0.e$e
            r2.<init>()
            r6.mo124483c(r1, r0, r2, r11)
            goto L_0x034d
        L_0x0269:
            r20 = r1
            android.view.MotionEvent r1 = r6.f259082n
            if (r1 == 0) goto L_0x0290
            long r8 = r25.getDownTime()
            android.view.MotionEvent r1 = r6.f259082n
            long r21 = r1.getDownTime()
            int r1 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r1 == 0) goto L_0x0290
            eb0.v0$c r1 = r6.f259080i
            r8 = r19
            r9 = 0
            r1.mo120963j(r8, r9)
            java.lang.String r1 = "try to handle fake event failed"
            r9 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r9, r1)
            r16 = 0
            goto L_0x0294
        L_0x0290:
            r9 = r17
            r8 = r19
        L_0x0294:
            if (r13 != 0) goto L_0x029f
            if (r16 == 0) goto L_0x0299
            goto L_0x029f
        L_0x0299:
            r1 = 1
            r7.setDuplicateParentStateEnabled(r1)
            r10 = 0
            goto L_0x02b0
        L_0x029f:
            r1 = 1
            android.view.ViewParent r10 = r24.getParent()
            r10.requestDisallowInterceptTouchEvent(r1)
            r10 = 0
            r7.setDuplicateParentStateEnabled(r10)
            java.lang.String r12 = "onLongClick fake down event."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r12)
        L_0x02b0:
            if (r16 == 0) goto L_0x02c1
            eb0.v0$c r9 = r6.f259080i
            r9.mo120963j(r8, r10)
            eb0.v0$c r8 = r6.f259080i
            r9 = r18
            r8.mo120963j(r9, r1)
            r1 = 1
            r15 = 1
            goto L_0x02d3
        L_0x02c1:
            f259074t = r7
            sn0.e$f r1 = sn0.C90259e.m112995c(r24)
            r6.f259078g = r1
            sn0.e$f r1 = r6.f259084p
            r1.f259090a = r3
            r1.f259091b = r4
            r1.f259092c = r2
            r1 = r20
        L_0x02d3:
            eb0.v0$c r8 = r6.f259080i
            r9 = 1
            r8.mo120963j(r5, r9)
            boolean r5 = r6.f259077f
            if (r5 == 0) goto L_0x02f7
            if (r15 != 0) goto L_0x02f7
            java.util.Map<java.lang.Integer, sn0.e$f> r5 = r6.f259075d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r5 = (java.util.HashMap) r5
            boolean r5 = r5.containsKey(r8)
            if (r5 != 0) goto L_0x02f7
            java.lang.Runnable r5 = r6.f259079h
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r12 = (long) r8
            r7.postDelayed(r5, r12)
        L_0x02f7:
            r5 = 0
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x0314
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0314
            int r5 = r24.getWidth()
            float r5 = (float) r5
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0314
            int r5 = r24.getHeight()
            float r5 = (float) r5
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0314
            r5 = 1
            goto L_0x0315
        L_0x0314:
            r5 = 0
        L_0x0315:
            if (r5 != 0) goto L_0x0318
            goto L_0x034b
        L_0x0318:
            sn0.e$f r5 = new sn0.e$f
            r5.<init>(r3, r4, r2)
            if (r0 != 0) goto L_0x0322
            if (r15 != 0) goto L_0x0322
            goto L_0x0323
        L_0x0322:
            r9 = 0
        L_0x0323:
            r6.mo124484d(r7, r9, r5)
            java.util.Map<java.lang.Integer, sn0.e$f> r0 = r6.f259075d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r2)
            java.util.Map<java.lang.Integer, sn0.e$f> r2 = r6.f259075d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r3, r5)
            if (r16 != 0) goto L_0x034b
            if (r0 != 0) goto L_0x034b
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r6.f259087s
            sn0.e$c r2 = new sn0.e$c
            r2.<init>()
            r6.mo124483c(r0, r5, r2, r11)
        L_0x034b:
            r20 = r1
        L_0x034d:
            java.lang.String r2 = "com/tencent/mm/plugin/appbrand/jsapi/view/ViewMotionFactory$CanvasOnTouchListener"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r0 = r20
            r1 = r23
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: sn0.C90257d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
