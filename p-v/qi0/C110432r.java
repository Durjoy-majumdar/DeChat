package qi0;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetFontFamilyActionArg;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONException;
import pi0.C110229d;
import si0.C110791a;

/* renamed from: qi0.r */
public class C110432r implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetFontFamilyActionArg setFontFamilyActionArg = (SetFontFamilyActionArg) drawActionArg;
        if (setFontFamilyActionArg == null) {
            return false;
        }
        String str = setFontFamilyActionArg.f311118e;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C110791a aVar = dVar.f329744a;
        aVar.f331434g = str;
        aVar.setTypeface(Typeface.create(str, aVar.f331435h));
        C110791a aVar2 = dVar.f329745b;
        aVar2.f331434g = str;
        aVar2.setTypeface(Typeface.create(str, aVar2.f331435h));
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            String string = jSONArray.getString(0);
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            C110791a aVar = dVar.f329744a;
            aVar.f331434g = string;
            aVar.setTypeface(Typeface.create(string, aVar.f331435h));
            C110791a aVar2 = dVar.f329745b;
            aVar2.f331434g = string;
            aVar2.setTypeface(Typeface.create(string, aVar2.f331435h));
            return true;
        } catch (JSONException unused) {
            Log.m105924i("MicroMsg.SetFontFamily", "get 'fontFamily' error.");
            return false;
        }
    }

    public String getMethod() {
        return "setFontFamily";
    }
}
