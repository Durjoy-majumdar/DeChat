package xk0;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: xk0.e */
public class C91267e extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 100;
    public static final String NAME = "canvasToTempFilePath";

    /* renamed from: w */
    public static Bitmap.CompressFormat m114491w(JSONObject jSONObject) {
        return "jpg".equalsIgnoreCase(jSONObject.optString("fileType")) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG;
    }

    /* renamed from: x */
    public static int m114492x(JSONObject jSONObject) {
        float optDouble = (float) jSONObject.optDouble("quality", 1.0d);
        float f = 100.0f;
        if (optDouble < 0.0f) {
            f = 0.0f;
        } else if (optDouble <= 1.0f) {
            f = 100.0f * optDouble;
        }
        return (int) f;
    }
}
