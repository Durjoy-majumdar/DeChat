package cl0;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sn0.C90259e;

/* renamed from: cl0.e */
public class C80049e {

    /* renamed from: a */
    public static int f234491a;

    /* renamed from: b */
    public static int f234492b;

    /* renamed from: c */
    public static long f234493c;

    /* renamed from: d */
    public static long f234494d;

    /* renamed from: a */
    public static void m97328a(C82520h hVar, View view, int i, MotionEvent motionEvent, String str, boolean z) {
        C82919r2 r2Var;
        C82520h hVar2 = hVar;
        MotionEvent motionEvent2 = motionEvent;
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent2.getPointerId(actionIndex);
        float x = motionEvent2.getX(actionIndex);
        float y = motionEvent2.getY(actionIndex);
        int i2 = 0;
        if (f234491a == motionEvent.getAction() && f234492b == pointerId && f234493c == motionEvent.getEventTime() && f234494d == motionEvent.getDownTime()) {
            Log.m105925i("MicroMsg.InsertViewTouchEventDispatch", "action:%d, eventId:%d, eventTime:%d, downTime:%d, don't send Duplicate event", Integer.valueOf(motionEvent.getAction()), Integer.valueOf(pointerId), Long.valueOf(motionEvent.getEventTime()), Long.valueOf(motionEvent.getDownTime()));
            return;
        }
        f234491a = motionEvent.getAction();
        f234492b = pointerId;
        f234493c = motionEvent.getEventTime();
        f234494d = motionEvent.getDownTime();
        C90259e.C90265f fVar = new C90259e.C90265f();
        fVar.f259090a = pointerId;
        fVar.f259091b = x;
        fVar.f259092c = y;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", str);
            jSONObject.put("viewId", i);
        } catch (JSONException unused) {
        }
        Log.m105925i("MicroMsg.InsertViewTouchEventDispatch", "action:%d, eventId:%d, eventTime:%d, downTime:%d", Integer.valueOf(motionEvent.getAction()), Integer.valueOf(pointerId), Long.valueOf(f234493c), Long.valueOf(f234494d));
        int action = motionEvent.getAction();
        if (action == 0) {
            try {
                jSONObject.put("touch", fVar.mo124487a());
            } catch (JSONException unused2) {
            }
            r2Var = new C90259e.C90262c();
        } else if (action == 1) {
            try {
                jSONObject.put("touch", fVar.mo124487a());
            } catch (JSONException unused3) {
            }
            r2Var = new C90259e.C90264e();
        } else if (action == 2) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONObject.put("touches", jSONArray);
            } catch (JSONException unused4) {
            }
            C90259e.C90265f[] b = m97329b(motionEvent);
            if (b.length > 0) {
                while (i2 < b.length) {
                    jSONArray.put(b[i2].mo124487a());
                    i2++;
                }
            }
            r2Var = new C90259e.C90263d();
        } else if (action != 3) {
            r2Var = null;
        } else {
            JSONArray jSONArray2 = new JSONArray();
            try {
                jSONObject.put("touches", jSONArray2);
            } catch (JSONException unused5) {
            }
            C90259e.C90265f[] b2 = m97329b(motionEvent);
            if (b2.length > 0) {
                while (i2 < b2.length) {
                    jSONArray2.put(b2[i2].mo124487a());
                    i2++;
                }
            }
            r2Var = new C90259e.C90261b();
        }
        if (r2Var != null && z) {
            r2Var.mo115163m(jSONObject.toString());
            hVar2.mo109676w(r2Var);
        } else if (r2Var != null) {
            r2Var.mo115163m(jSONObject.toString());
            hVar2.mo109669n(r2Var, (int[]) null);
        }
    }

    /* renamed from: b */
    public static C90259e.C90265f[] m97329b(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            C90259e.C90265f fVar = new C90259e.C90265f();
            fVar.f259090a = motionEvent.getPointerId(i);
            fVar.f259091b = motionEvent.getX(i);
            fVar.f259092c = motionEvent.getY(i);
            arrayList.add(fVar);
        }
        C90259e.C90265f[] fVarArr = new C90259e.C90265f[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            fVarArr[i2] = (C90259e.C90265f) arrayList.get(i2);
        }
        return fVarArr;
    }
}
