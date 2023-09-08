package sn0;

import android.view.View;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import j20.C117292a;
import js0.C88020k;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sn0.f */
public class C90266f {
    /* renamed from: a */
    public static void m112997a(View view, JSONObject jSONObject) {
        boolean z;
        View view2 = view;
        JSONObject jSONObject2 = jSONObject;
        if (view2 != null && jSONObject2 != null) {
            int a = C88020k.m109550a(jSONObject2.optString("bgColor"));
            int a2 = C88020k.m109550a(jSONObject2.optString("borderColor"));
            float i = C88020k.m109558i(jSONObject2, "borderWidth", 0.0f);
            float i2 = C88020k.m109558i(jSONObject2, "borderRadius", 0.0f);
            float[] fArr = new float[4];
            float[] fArr2 = null;
            if (jSONObject2.has("borderRadius")) {
                try {
                    JSONArray jSONArray = jSONObject2.getJSONArray("borderRadius");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            float f = (float) jSONArray.getDouble(i3);
                            if (i3 >= 4) {
                                break;
                            }
                            fArr[i3] = C88020k.m109552c(f);
                        }
                    } else {
                        fArr = null;
                    }
                    fArr2 = fArr;
                } catch (Exception unused) {
                }
            }
            boolean z2 = true;
            if (view2 instanceof C90267g) {
                C90267g gVar = (C90267g) view2;
                gVar.setBgColor(a);
                gVar.setBorderColor(a2);
                gVar.setBorderRadius(i2);
                gVar.setBorderWidth(i);
                gVar.setBorderRadius(fArr2);
                z = true;
            } else {
                z = false;
            }
            try {
                float f2 = (float) jSONObject2.getDouble("opacity");
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(f2));
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/view/ViewStyleApplier", "apply", "(Landroid/view/View;Lorg/json/JSONObject;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/jsapi/view/ViewStyleApplier", "apply", "(Landroid/view/View;Lorg/json/JSONObject;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    z = true;
                }
            } catch (JSONException unused2) {
            }
            JSONArray optJSONArray = jSONObject2.optJSONArray("padding");
            if (optJSONArray != null && optJSONArray.length() == 4) {
                view.setPadding(C88020k.m109559j(optJSONArray, 3), C88020k.m109559j(optJSONArray, 0), C88020k.m109559j(optJSONArray, 1), C88020k.m109559j(optJSONArray, 2));
            }
            float optDouble = (float) jSONObject2.optDouble(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, 0.0d);
            float optDouble2 = (float) jSONObject2.optDouble("scaleX", 1.0d);
            float optDouble3 = (float) jSONObject2.optDouble("scaleY", 1.0d);
            if (jSONObject2.has(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION)) {
                view.setRotation(optDouble);
                z = true;
            }
            if (jSONObject2.has("scaleX")) {
                view.setScaleX(optDouble2);
                z = true;
            }
            if (jSONObject2.has("scaleY")) {
                view.setScaleY(optDouble3);
            } else {
                z2 = z;
            }
            if (z2) {
                view.invalidate();
            }
        }
    }
}
