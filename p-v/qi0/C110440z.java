package qi0;

import android.graphics.Canvas;
import android.util.DisplayMetrics;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88020k;
import org.json.JSONArray;
import org.json.JSONException;
import pi0.C110229d;

@Deprecated
/* renamed from: qi0.z */
public class C110440z implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        return false;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            DisplayMetrics displayMetrics = C88020k.f254629a;
            Math.round(C88020k.m109552c((float) jSONArray.getDouble(0)));
        } catch (JSONException unused) {
            Log.m105924i("MicroMsg.SetLineHeight", "get 'lineHeight' error");
        }
        return false;
    }

    public String getMethod() {
        return "setLineHeight";
    }
}
