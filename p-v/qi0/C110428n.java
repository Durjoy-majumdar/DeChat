package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.RotateActionArg;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.n */
public class C110428n implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        RotateActionArg rotateActionArg = (RotateActionArg) drawActionArg;
        if (rotateActionArg == null) {
            return false;
        }
        canvas.rotate((float) ((((double) rotateActionArg.f311111e) / 3.141592653589793d) * 180.0d));
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        canvas.rotate((float) ((((double) ((float) jSONArray.optDouble(0))) / 3.141592653589793d) * 180.0d));
        return true;
    }

    public String getMethod() {
        return FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION;
    }
}
