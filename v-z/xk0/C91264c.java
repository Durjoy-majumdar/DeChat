package xk0;

import android.graphics.Bitmap;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.C81602a;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2encoder;
import java.nio.ByteBuffer;
import jk0.C87985i;
import js0.C88016e;
import js0.C88020k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xk0.c */
public class C91264c extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 373;
    public static final String NAME = "canvasPutImageData";

    /* renamed from: xk0.c$a */
    public class C91265a implements C81602a.C81603a {

        /* renamed from: a */
        public final /* synthetic */ C82381f f261856a;

        /* renamed from: b */
        public final /* synthetic */ int f261857b;

        public C91265a(C82381f fVar, int i) {
            this.f261856a = fVar;
            this.f261857b = i;
        }

        /* renamed from: a */
        public void mo113886a(DrawCanvasArg drawCanvasArg) {
            this.f261856a.mo109647a(this.f261857b, C91264c.this.mo115109j("ok"));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        String str = "MicroMsg.JsApiCanvasPutImageData";
        int i3 = 0;
        try {
            int i4 = jSONObject2.getInt("canvasId");
            C82520h pG = ((C87985i) fVar2.mo109668l(C87985i.class)).mo116941pG(fVar2, jSONObject2);
            if (pG == null) {
                Log.m105928w(str, "invoke JsApi canvasPutImageData failed, component view is null.");
                fVar2.mo109647a(i2, mo115109j("fail:page is null"));
                return;
            }
            View p = ((C83873p2) pG.mo109649c(jSONObject2.optBoolean("independent", false))).mo116438p(i4);
            if (p == null) {
                Log.m105929w(str, "view(%s) is null.", Integer.valueOf(i4));
                fVar2.mo109647a(i2, mo115109j("fail:view is null"));
            } else if (!(p instanceof CoverViewContainer)) {
                Log.m105929w(str, "the viewId is not a canvas(%s).", Integer.valueOf(i4));
                fVar2.mo109647a(i2, mo115109j("fail:illegal view type"));
            } else {
                View view = (View) ((CoverViewContainer) p).mo114736d(View.class);
                if (!(view instanceof C81602a)) {
                    Log.m105925i(str, "the view is not a instance of CanvasView.(%s)", Integer.valueOf(i4));
                    fVar2.mo109647a(i2, mo115109j("fail:illegal view type"));
                    return;
                }
                float g = C88020k.m109556g();
                int optInt = jSONObject2.optInt("x");
                int optInt2 = jSONObject2.optInt("y");
                int optInt3 = jSONObject2.optInt("width");
                int optInt4 = jSONObject2.optInt("height");
                Math.round(((float) optInt) * g);
                Math.round(((float) optInt2) * g);
                Math.round(((float) optInt3) * g);
                Math.round(((float) optInt4) * g);
                if (optInt3 == 0 || optInt4 == 0) {
                    Log.m105925i(str, "width(%s) or height(%s) is 0.(%s)", Integer.valueOf(optInt3), Integer.valueOf(optInt4), Integer.valueOf(i4));
                    fVar2.mo109647a(i2, mo115109j("fail:width or height is 0"));
                    return;
                }
                if (optInt3 < 0) {
                    optInt += optInt3;
                    optInt3 = -optInt3;
                }
                if (optInt4 < 0) {
                    optInt2 += optInt4;
                    optInt4 = -optInt4;
                }
                try {
                    Object obj = jSONObject2.get("data");
                    if (!(obj instanceof ByteBuffer)) {
                        Log.m105924i(str, "get data failed, value is not a ByteBuffer");
                        fVar2.mo109647a(i2, mo115109j("fail:illegal data"));
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    JSONArray jSONArray = new JSONArray();
                    byte[] a = C88016e.m109544a(byteBuffer);
                    int length = a.length / 4;
                    int[] iArr = new int[length];
                    int i5 = 0;
                    while (i3 < length) {
                        int i6 = i5 + 1;
                        int i7 = i6 + 1;
                        int i8 = length;
                        byte b = ((a[i5] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((a[i6] & ExifInterface.MARKER) << 8);
                        int i9 = i7 + 1;
                        i5 = i9 + 1;
                        iArr[i3] = (a[i7] & ExifInterface.MARKER) | b | ((a[i9] & ExifInterface.MARKER) << 24);
                        i3++;
                        length = i8;
                        str = str;
                    }
                    String str2 = str;
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(optInt);
                        jSONArray2.put(optInt2);
                        jSONArray2.put(optInt3);
                        jSONArray2.put(optInt4);
                        jSONArray2.put(Bitmap.createBitmap(iArr, optInt3, optInt4, Bitmap.Config.ARGB_8888));
                        jSONObject3.put(FirebaseAnalytics.C113379b.METHOD, "__setPixels");
                        jSONObject3.put("data", jSONArray2);
                        jSONArray.put(jSONObject3);
                        C81602a aVar = (C81602a) view;
                        aVar.mo113881a(jSONArray, new C91265a(fVar2, i2));
                        aVar.mo113883c();
                    } catch (JSONException e) {
                        Log.m105929w(str2, "put json value error : %s", e);
                        fVar2.mo109647a(i2, mo115109j("fail:build action JSON error"));
                    }
                } catch (JSONException e2) {
                    Log.m105925i(str, "get data failed, %s", android.util.Log.getStackTraceString(e2));
                    fVar2.mo109647a(i2, mo115109j("fail:missing data"));
                }
            }
        } catch (JSONException e3) {
            Log.m105925i(str, "get canvas id failed, %s", android.util.Log.getStackTraceString(e3));
            fVar2.mo109647a(i2, mo115109j("fail:illegal canvasId"));
        }
    }
}
