package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetFontWeightArg;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONException;
import pi0.C110229d;

/* renamed from: qi0.u */
public class C110435u implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetFontWeightArg setFontWeightArg = (SetFontWeightArg) drawActionArg;
        if (setFontWeightArg == null) {
            return false;
        }
        mo161931c(dVar, setFontWeightArg.f311121e);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            mo161931c(dVar, jSONArray.getString(0));
            return true;
        } catch (JSONException unused) {
            Log.m105924i("MicroMsg.SetFontWeight", "get 'fontWeight' error.");
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo161931c(C110229d dVar, String str) {
        str.getClass();
        if (str.equals("normal")) {
            dVar.f329744a.setFakeBoldText(false);
            dVar.f329745b.setFakeBoldText(false);
        } else if (str.equals("bold")) {
            dVar.f329744a.setFakeBoldText(true);
            dVar.f329745b.setFakeBoldText(true);
        }
        return true;
    }

    public String getMethod() {
        return "setFontWeight";
    }
}
