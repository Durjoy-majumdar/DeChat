package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetFontStyleActionArg;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONException;
import pi0.C110229d;

/* renamed from: qi0.t */
public class C110434t implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetFontStyleActionArg setFontStyleActionArg = (SetFontStyleActionArg) drawActionArg;
        if (setFontStyleActionArg == null) {
            return false;
        }
        mo161930c(dVar, setFontStyleActionArg.f311120e);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            mo161930c(dVar, jSONArray.getString(0));
            return true;
        } catch (JSONException unused) {
            Log.m105924i("MicroMsg.SetFontStyle", "get 'fontStyle' error.");
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo161930c(C110229d dVar, String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1657669071:
                if (str.equals("oblique")) {
                    c = 0;
                    break;
                }
                break;
            case -1178781136:
                if (str.equals("italic")) {
                    c = 1;
                    break;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                dVar.f329744a.mo162352d(2);
                dVar.f329745b.mo162352d(2);
                break;
            case 1:
                dVar.f329744a.mo162352d(2);
                dVar.f329745b.mo162352d(2);
                break;
            case 2:
                dVar.f329744a.mo162352d(0);
                dVar.f329745b.mo162352d(0);
                break;
        }
        return true;
    }

    public String getMethod() {
        return "setFontStyle";
    }
}
