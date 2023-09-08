package qi0;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.SetGlobalCompositeOperationActionArg;
import org.json.JSONArray;
import org.json.JSONException;
import pi0.C110229d;
import si0.C110791a;

/* renamed from: qi0.w */
public class C110437w implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        SetGlobalCompositeOperationActionArg setGlobalCompositeOperationActionArg = (SetGlobalCompositeOperationActionArg) drawActionArg;
        if (setGlobalCompositeOperationActionArg == null) {
            return false;
        }
        mo161932c(dVar, setGlobalCompositeOperationActionArg.f311123e);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        try {
            mo161932c(dVar, jSONArray.getString(0));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo161932c(C110229d dVar, String str) {
        C110791a aVar = dVar.f329745b;
        char c = 65535;
        switch (str.hashCode()) {
            case -2120744511:
                if (str.equals("luminosity")) {
                    c = 24;
                    break;
                }
                break;
            case -1763725041:
                if (str.equals("destination-out")) {
                    c = 6;
                    break;
                }
                break;
            case -1698458601:
                if (str.equals("source-in")) {
                    c = 1;
                    break;
                }
                break;
            case -1427739212:
                if (str.equals("hard-light")) {
                    c = 17;
                    break;
                }
                break;
            case -1338968417:
                if (str.equals("darken")) {
                    c = 13;
                    break;
                }
                break;
            case -1247677005:
                if (str.equals("soft-light")) {
                    c = 18;
                    break;
                }
                break;
            case -1112602980:
                if (str.equals("source-out")) {
                    c = 2;
                    break;
                }
                break;
            case -1091287984:
                if (str.equals("overlay")) {
                    c = 12;
                    break;
                }
                break;
            case -230491182:
                if (str.equals("saturation")) {
                    c = 22;
                    break;
                }
                break;
            case -131372090:
                if (str.equals("source-atop")) {
                    c = 3;
                    break;
                }
                break;
            case -130953402:
                if (str.equals("source-over")) {
                    c = 0;
                    break;
                }
                break;
            case -120580883:
                if (str.equals("color-dodge")) {
                    c = 15;
                    break;
                }
                break;
            case 103672:
                if (str.equals("hue")) {
                    c = 21;
                    break;
                }
                break;
            case 118875:
                if (str.equals("xor")) {
                    c = 10;
                    break;
                }
                break;
            case 3059573:
                if (str.equals("copy")) {
                    c = 9;
                    break;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = 23;
                    break;
                }
                break;
            case 170546239:
                if (str.equals("lighten")) {
                    c = 14;
                    break;
                }
                break;
            case 170546243:
                if (str.equals("lighter")) {
                    c = 8;
                    break;
                }
                break;
            case 653829668:
                if (str.equals("multiply")) {
                    c = 11;
                    break;
                }
                break;
            case 912936772:
                if (str.equals("destination-in")) {
                    c = 5;
                    break;
                }
                break;
            case 1158680499:
                if (str.equals("destination-atop")) {
                    c = 7;
                    break;
                }
                break;
            case 1159099187:
                if (str.equals("destination-over")) {
                    c = 4;
                    break;
                }
                break;
            case 1242982905:
                if (str.equals("color-burn")) {
                    c = 16;
                    break;
                }
                break;
            case 1686617550:
                if (str.equals("exclusion")) {
                    c = 20;
                    break;
                }
                break;
            case 1728361789:
                if (str.equals("difference")) {
                    c = 19;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                break;
            case 1:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                break;
            case 2:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                break;
            case 3:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                break;
            case 4:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                break;
            case 5:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                break;
            case 6:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                break;
            case 7:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                break;
            case 8:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                break;
            case 9:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
                break;
            case 10:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                break;
            case 11:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
                break;
            case 12:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
                break;
            case 13:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
                break;
            case 14:
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                break;
        }
        return true;
    }

    public String getMethod() {
        return "setGlobalCompositeOperation";
    }
}
