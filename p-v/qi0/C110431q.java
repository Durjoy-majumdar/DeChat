package qi0;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetFillStyleActionArg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;
import si0.C110791a;

/* renamed from: qi0.q */
public class C110431q implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetFillStyleActionArg setFillStyleActionArg = (SetFillStyleActionArg) drawActionArg;
        if (setFillStyleActionArg == null) {
            return false;
        }
        return setFillStyleActionArg.mo148409a(dVar, canvas);
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        BitmapShader bitmapShader;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        C110229d dVar2 = dVar;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray.length() < 2) {
            return false;
        }
        String optString = jSONArray2.optString(0);
        C110791a aVar = dVar2.f329745b;
        if ("linear".equalsIgnoreCase(optString)) {
            if (jSONArray.length() >= 3 && (optJSONArray2 = jSONArray2.optJSONArray(1)) != null && optJSONArray2.length() >= 4) {
                float h = C88020k.m109557h(optJSONArray2, 0);
                float h2 = C88020k.m109557h(optJSONArray2, 1);
                float h3 = C88020k.m109557h(optJSONArray2, 2);
                float h4 = C88020k.m109557h(optJSONArray2, 3);
                JSONArray optJSONArray3 = jSONArray2.optJSONArray(2);
                if (!(optJSONArray3 == null || optJSONArray3.length() == 0)) {
                    int[] iArr = new int[optJSONArray3.length()];
                    float[] fArr = new float[optJSONArray3.length()];
                    for (int i = 0; i < optJSONArray3.length(); i++) {
                        JSONArray optJSONArray4 = optJSONArray3.optJSONArray(i);
                        if (optJSONArray4.length() >= 2) {
                            fArr[i] = (float) optJSONArray4.optDouble(0);
                            iArr[i] = C88020k.m109551b(optJSONArray4.optJSONArray(1));
                        }
                    }
                    aVar.setShader(new LinearGradient(h, h2, h3, h4, iArr, fArr, Shader.TileMode.CLAMP));
                }
            }
            return false;
        } else if (!"radial".equalsIgnoreCase(optString)) {
            BitmapShader bitmapShader2 = null;
            if ("normal".equalsIgnoreCase(optString)) {
                JSONArray optJSONArray5 = jSONArray2.optJSONArray(1);
                if (optJSONArray5 == null || optJSONArray5.length() < 4) {
                    return false;
                }
                aVar.setShader((Shader) null);
                aVar.setColor(C88020k.m109551b(optJSONArray5));
            } else if ("pattern".equalsIgnoreCase(optString)) {
                String optString2 = jSONArray2.optString(1);
                String optString3 = jSONArray2.optString(2);
                if (Util.isNullOrNil(optString2)) {
                    Log.m105928w("MicroMsg.Canvas.SetFillStyleAction", "setFillStyle failed, type is pattern but image path is null or nil.");
                    return false;
                }
                Bitmap Zu0 = dVar2.f329750g.Zu0(dVar2, optString2);
                if (Zu0 != null && !Zu0.isRecycled()) {
                    int d = C88020k.m109553d(Zu0.getWidth());
                    int d2 = C88020k.m109553d(Zu0.getHeight());
                    optString3.getClass();
                    char c = 65535;
                    switch (optString3.hashCode()) {
                        case -934531685:
                            if (optString3.equals("repeat")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -724648153:
                            if (optString3.equals("no-repeat")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -436782906:
                            if (optString3.equals("repeat-x")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -436782905:
                            if (optString3.equals("repeat-y")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            Bitmap createBitmap = Bitmap.createBitmap(d + 1, d2 + 1, Bitmap.Config.ARGB_8888);
                            new Canvas(createBitmap).drawBitmap(Zu0, new Rect(0, 0, Zu0.getWidth(), Zu0.getHeight()), new RectF(0.0f, 0.0f, (float) d, (float) d2), (Paint) null);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                        } else if (c == 2) {
                            Bitmap createBitmap2 = Bitmap.createBitmap(d, d2 + 1, Bitmap.Config.ARGB_8888);
                            new Canvas(createBitmap2).drawBitmap(Zu0, new Rect(0, 0, Zu0.getWidth(), Zu0.getHeight()), new RectF(0.0f, 0.0f, (float) d, (float) d2), (Paint) null);
                            bitmapShader = new BitmapShader(createBitmap2, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
                        } else if (c == 3) {
                            Bitmap createBitmap3 = Bitmap.createBitmap(d + 1, d2, Bitmap.Config.ARGB_8888);
                            new Canvas(createBitmap3).drawBitmap(Zu0, new Rect(0, 0, Zu0.getWidth(), Zu0.getHeight()), new RectF(0.0f, 0.0f, (float) d, (float) d2), (Paint) null);
                            bitmapShader = new BitmapShader(createBitmap3, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT);
                        }
                        bitmapShader2 = bitmapShader;
                    } else {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(Zu0, d, d2, false);
                        Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                        bitmapShader2 = new BitmapShader(createScaledBitmap, tileMode2, tileMode2);
                    }
                    aVar.setShader(bitmapShader2);
                }
            }
        } else if (jSONArray.length() < 3 || (optJSONArray = jSONArray2.optJSONArray(1)) == null || optJSONArray.length() < 3) {
            return false;
        } else {
            float h5 = C88020k.m109557h(optJSONArray, 0);
            float h6 = C88020k.m109557h(optJSONArray, 1);
            float h7 = C88020k.m109557h(optJSONArray, 2);
            if (h7 <= 0.0f) {
                Log.m105925i("MicroMsg.Canvas.SetFillStyleAction", "setFillStyle(radial) failed, sr(%s) <= 0.", Float.valueOf(h7));
                return false;
            }
            JSONArray optJSONArray6 = jSONArray2.optJSONArray(2);
            int[] iArr2 = new int[optJSONArray6.length()];
            float[] fArr2 = new float[optJSONArray6.length()];
            for (int i2 = 0; i2 < optJSONArray6.length(); i2++) {
                JSONArray optJSONArray7 = optJSONArray6.optJSONArray(i2);
                if (optJSONArray7.length() >= 2) {
                    fArr2[i2] = (float) optJSONArray7.optDouble(0);
                    iArr2[i2] = C88020k.m109551b(optJSONArray7.optJSONArray(1));
                }
            }
            aVar.setShader(new RadialGradient(h5, h6, h7, iArr2, fArr2, Shader.TileMode.CLAMP));
        }
        return true;
    }

    public String getMethod() {
        return "setFillStyle";
    }
}
