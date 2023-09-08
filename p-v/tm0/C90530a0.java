package tm0;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import org.json.JSONObject;

/* renamed from: tm0.a0 */
public class C90530a0 extends C82268c {
    public static final int CTRL_INDEX = 229;
    public static final String NAME = "setScreenBrightness";

    /* renamed from: g */
    public float f260135g = Float.NaN;

    /* renamed from: h */
    public float f260136h;

    /* renamed from: tm0.a0$a */
    public class C90531a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f260137d;

        /* renamed from: e */
        public final /* synthetic */ C82381f f260138e;

        /* renamed from: f */
        public final /* synthetic */ int f260139f;

        /* renamed from: tm0.a0$a$a */
        public class C90532a extends C83231l.C83234d {

            /* renamed from: d */
            public final /* synthetic */ WindowManager.LayoutParams f260141d;

            /* renamed from: e */
            public final /* synthetic */ Activity f260142e;

            public C90532a(WindowManager.LayoutParams layoutParams, Activity activity) {
                this.f260141d = layoutParams;
                this.f260142e = activity;
            }

            /* renamed from: e */
            public void mo74049e(C83231l.C83235e eVar) {
                this.f260141d.screenBrightness = C90530a0.this.f260135g;
                Activity activity = this.f260142e;
                if (activity != null && !activity.isFinishing() && this.f260142e.getWindow() != null) {
                    this.f260142e.getWindow().setAttributes(this.f260141d);
                }
            }

            /* renamed from: f */
            public void mo109498f() {
                this.f260141d.screenBrightness = C90530a0.this.f260136h;
                Activity activity = this.f260142e;
                if (activity != null && !activity.isFinishing() && this.f260142e.getWindow() != null) {
                    this.f260142e.getWindow().setAttributes(this.f260141d);
                }
            }
        }

        public C90531a(JSONObject jSONObject, C82381f fVar, int i) {
            this.f260137d = jSONObject;
            this.f260138e = fVar;
            this.f260139f = i;
        }

        public void run() {
            C90530a0.this.f260136h = (float) this.f260137d.optDouble("value");
            Object[] objArr = new Object[2];
            objArr[0] = Float.valueOf(C90530a0.this.f260136h);
            objArr[1] = Float.valueOf(Float.isNaN(C90530a0.this.f260135g) ? -100.0f : C90530a0.this.f260135g);
            Log.m105925i("MicroMsg.JsApiSetScreenBrightness", "set brightness: %f, system brightness: %f", objArr);
            if (!Float.isNaN(C90530a0.this.f260136h)) {
                float f = C90530a0.this.f260136h;
                if ((f >= 0.0f || ((int) f) == -1) && f <= 1.0f) {
                    Context context = this.f260138e.getContext();
                    if (context == null) {
                        this.f260138e.mo109647a(this.f260139f, C90530a0.this.mo115109j("fail"));
                        Log.m105920e("MicroMsg.JsApiSetScreenBrightness", "context is null, invoke fail!");
                        return;
                    } else if (!(this.f260138e.getContext() instanceof Activity)) {
                        Log.m105920e("MicroMsg.JsApiSetScreenBrightness", "setScreenBrightness, server context is not activity, don't do invoke");
                        this.f260138e.mo109647a(this.f260139f, C90530a0.this.mo115109j("fail:context is not activity"));
                        return;
                    } else {
                        Activity activity = (Activity) context;
                        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                        if (Float.isNaN(C90530a0.this.f260135g)) {
                            C90530a0.this.f260135g = attributes.screenBrightness;
                            C83231l.m102140a(this.f260138e.getAppId(), new C90532a(attributes, activity));
                        }
                        float f2 = C90530a0.this.f260136h;
                        if (((int) f2) == -1) {
                            attributes.screenBrightness = -1.0f;
                        } else {
                            attributes.screenBrightness = Math.max(f2, 0.01f);
                        }
                        activity.getWindow().setAttributes(attributes);
                        this.f260138e.mo109647a(this.f260139f, C90530a0.this.mo115109j("ok"));
                        return;
                    }
                }
            }
            this.f260138e.mo109647a(this.f260139f, C90530a0.this.mo115109j("fail:value invalid"));
            Log.m105920e("MicroMsg.JsApiSetScreenBrightness", "value invalid");
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105918d("MicroMsg.JsApiSetScreenBrightness", "JsApiSetScreenBrightness!");
        if (jSONObject == null) {
            fVar.mo109647a(i, mo115109j("fail:data is null"));
            Log.m105920e("MicroMsg.JsApiSetScreenBrightness", "data is null");
        } else if (!(fVar.getContext() instanceof Activity)) {
            Log.m105920e("MicroMsg.JsApiSetScreenBrightness", "setScreenBrightness, server context is not activity, don't do invoke");
            fVar.mo109647a(i, mo115109j("fail:context is not activity"));
        } else {
            MMHandlerThread.postToMainThread(new C90531a(jSONObject, fVar, i));
        }
    }
}
