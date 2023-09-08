package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetGlobalAlphaActionArg;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONException;
import pi0.C110229d;
import si0.C110791a;

/* renamed from: qi0.v */
public class C110436v implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetGlobalAlphaActionArg setGlobalAlphaActionArg = (SetGlobalAlphaActionArg) drawActionArg;
        if (setGlobalAlphaActionArg == null) {
            return false;
        }
        int i = setGlobalAlphaActionArg.f311122e;
        C110791a aVar = dVar.f329744a;
        float f = ((float) i) / 255.0f;
        aVar.f331432e = f;
        aVar.setColor(aVar.f331433f);
        C110791a aVar2 = dVar.f329745b;
        aVar2.f331432e = f;
        aVar2.setColor(aVar2.f331433f);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        try {
            int i = jSONArray.getInt(0);
            C110791a aVar = dVar.f329744a;
            float f = ((float) i) / 255.0f;
            aVar.f331432e = f;
            aVar.setColor(aVar.f331433f);
            C110791a aVar2 = dVar.f329745b;
            aVar2.f331432e = f;
            aVar2.setColor(aVar2.f331433f);
            return true;
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SetGlobalAlphaAction", "getGlobalAlpha value error. exception : %s", e);
            return false;
        }
    }

    public String getMethod() {
        return "setGlobalAlpha";
    }
}
