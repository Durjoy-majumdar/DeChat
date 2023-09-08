package xk0;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.C81602a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import jk0.C87985i;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;
import pi0.C110232f;

/* renamed from: xk0.b */
public class C91263b extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 372;
    public static final String NAME = "canvasGetImageData";

    /* renamed from: w */
    public static Map<String, Object> m114487w(int[] iArr, int i, int i2) {
        byte[] bArr = new byte[(iArr.length * 4)];
        int i3 = 0;
        for (int i4 : iArr) {
            int i5 = i3 + 1;
            bArr[i3] = (byte) ((i4 >> 16) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) ((i4 >> 8) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (i4 & 255);
            i3 = i7 + 1;
            bArr[i7] = (byte) ((i4 >> 24) & 255);
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        HashMap hashMap = new HashMap();
        hashMap.put("data", wrap);
        hashMap.put("width", Integer.valueOf(i));
        hashMap.put("height", Integer.valueOf(i2));
        return hashMap;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        int i2;
        String str;
        char c;
        int i3;
        int i4;
        int i5;
        View view;
        int i6;
        int i7;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i8 = i;
        try {
            int i9 = jSONObject2.getInt("canvasId");
            C82520h pG = ((C87985i) fVar2.mo109668l(C87985i.class)).mo116941pG(fVar2, jSONObject2);
            if (pG == null) {
                Log.m105928w("MicroMsg.JsApiCanvasGetImageData", "invoke JsApi canvasGetImageData failed, component view is null.");
                fVar2.mo109647a(i8, mo115109j("fail:page is null"));
                return;
            }
            View p = ((C83873p2) pG.mo109649c(jSONObject2.optBoolean("independent", false))).mo116438p(i9);
            if (p == null) {
                Log.m105929w("MicroMsg.JsApiCanvasGetImageData", "view(%s) is null.", Integer.valueOf(i9));
                fVar2.mo109647a(i8, mo115109j("fail:view is null"));
            } else if (!(p instanceof CoverViewContainer)) {
                Log.m105929w("MicroMsg.JsApiCanvasGetImageData", "the viewId is not a canvas(%s).", Integer.valueOf(i9));
                fVar2.mo109647a(i8, mo115109j("fail:illegal view type"));
            } else {
                View view2 = (View) ((CoverViewContainer) p).mo114736d(View.class);
                if (!(view2 instanceof C81602a)) {
                    Log.m105925i("MicroMsg.JsApiCanvasGetImageData", "the view is not a instance of CanvasView.(%s)", Integer.valueOf(i9));
                    fVar2.mo109647a(i8, mo115109j("fail:illegal view type"));
                    return;
                }
                float g = C88020k.m109556g();
                int optInt = jSONObject2.optInt("x");
                int optInt2 = jSONObject2.optInt("y");
                int optInt3 = jSONObject2.optInt("width");
                int optInt4 = jSONObject2.optInt("height");
                if (optInt3 == 0) {
                    str = "MicroMsg.JsApiCanvasGetImageData";
                    i2 = i9;
                    c = 0;
                    i3 = 3;
                } else if (optInt4 == 0) {
                    str = "MicroMsg.JsApiCanvasGetImageData";
                    i2 = i9;
                    i3 = 3;
                    c = 0;
                } else {
                    if (optInt3 < 0) {
                        optInt += optInt3;
                        optInt3 = -optInt3;
                    }
                    if (optInt4 < 0) {
                        optInt2 += optInt4;
                        optInt4 = -optInt4;
                    }
                    int round = Math.round(((float) optInt) * g);
                    int round2 = Math.round(((float) optInt2) * g);
                    int round3 = Math.round(((float) optInt3) * g);
                    int round4 = Math.round(((float) optInt4) * g);
                    int measuredWidth = view2.getMeasuredWidth();
                    String str2 = "MicroMsg.JsApiCanvasGetImageData";
                    int measuredHeight = view2.getMeasuredHeight();
                    int i15 = i9;
                    if (round < 0) {
                        i4 = optInt;
                        i5 = 0;
                    } else if (round >= measuredWidth) {
                        fVar2.mo109647a(i8, mo115117r(fVar2, "ok", m114487w(new int[(optInt3 * optInt4)], optInt3, optInt4)));
                        return;
                    } else {
                        i4 = optInt;
                        i5 = round;
                    }
                    if (round2 < 0) {
                        view = view2;
                        i6 = optInt2;
                        i7 = 0;
                    } else if (round2 >= measuredHeight) {
                        fVar2.mo109647a(i8, mo115117r(fVar2, "ok", m114487w(new int[(optInt3 * optInt4)], optInt3, optInt4)));
                        return;
                    } else {
                        view = view2;
                        i6 = optInt2;
                        i7 = round2;
                    }
                    int i16 = round + round3;
                    if (i16 > measuredWidth) {
                        round3 = measuredWidth - i5;
                    } else if (i16 <= 0) {
                        fVar2.mo109647a(i8, mo115117r(fVar2, "ok", m114487w(new int[(optInt3 * optInt4)], optInt3, optInt4)));
                        return;
                    } else if (round < 0) {
                        round3 = i16;
                    }
                    int i17 = round2 + round4;
                    if (i17 > measuredHeight) {
                        round4 = measuredHeight - i7;
                    } else if (i17 <= 0) {
                        fVar2.mo109647a(i8, mo115117r(fVar2, "ok", m114487w(new int[(optInt3 * optInt4)], optInt3, optInt4)));
                        return;
                    } else if (round2 < 0) {
                        round4 = i17;
                    }
                    int round5 = Math.round(((float) i5) / g);
                    int round6 = Math.round(((float) i7) / g);
                    int round7 = Math.round(((float) round3) / g);
                    int round8 = Math.round(((float) round4) / g);
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                        C110232f fVar3 = new C110232f(createBitmap);
                        fVar3.save();
                        fVar3.translate((float) (-i5), (float) (-i7));
                        ((C81602a) view).mo113885e(fVar3);
                        fVar3.restore();
                        int[] iArr = new int[(optInt3 * optInt4)];
                        try {
                            Bitmap.createScaledBitmap(createBitmap, round7, round8, false).getPixels(iArr, ((round6 - i6) * optInt3) + (round5 - i4), optInt3, 0, 0, round7, round8);
                            fVar2.mo109647a(i8, mo115117r(fVar2, "ok", m114487w(iArr, optInt3, optInt4)));
                            return;
                        } catch (Exception e) {
                            String str3 = str2;
                            Log.m105929w(str3, "getPixels failed, viewId(%s). Exception: %s", Integer.valueOf(i15), e);
                            Log.m105929w(str3, "getPixels failed. finalXDp:%d finalYDp:%d finalWidthDp:%d finalHeightDp:%d wDp:%d data:%s", Integer.valueOf(round5), Integer.valueOf(round6), Integer.valueOf(round7), Integer.valueOf(round8), Integer.valueOf(optInt3), jSONObject);
                            fVar2.mo109647a(i8, mo115109j("fail: getPixels failed"));
                            return;
                        }
                    } catch (Exception e2) {
                        Log.m105929w(str2, "create bitmap failed, viewId(%s). Exception : %s", Integer.valueOf(i15), e2);
                        fVar2.mo109647a(i8, mo115109j("fail:create bitmap failed"));
                        return;
                    }
                }
                Object[] objArr = new Object[i3];
                objArr[c] = Integer.valueOf(optInt3);
                objArr[1] = Integer.valueOf(optInt4);
                objArr[2] = Integer.valueOf(i2);
                Log.m105925i(str, "width(%s) or height(%s) is 0.(%s)", objArr);
                fVar2.mo109647a(i8, mo115109j("fail:width or height is 0"));
            }
        } catch (JSONException e3) {
            Log.m105925i("MicroMsg.JsApiCanvasGetImageData", "get canvas id failed, %s", android.util.Log.getStackTraceString(e3));
            fVar2.mo109647a(i8, mo115109j("fail:illegal canvasId"));
        }
    }
}
