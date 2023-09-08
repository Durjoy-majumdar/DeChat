package b90;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import c90.C104325a;
import c90.C28515c;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: b90.b */
public final class C104059b {
    /* renamed from: a */
    public static final void m138818a(CaptureRequest.Builder builder, C104325a aVar, boolean z, Object obj) {
        CaptureRequest.Key<String> key;
        C87412m.m108594g(builder, "builder");
        C87412m.m108594g(obj, "value");
        if (aVar != null) {
            Class<String> cls = String.class;
            Object obj2 = aVar.f308796j;
            Object obj3 = null;
            if (obj2 instanceof Integer) {
                String str = aVar.f308799m;
                C87412m.m108591d(str);
                key = C28515c.m38232a(str, Integer.TYPE);
            } else if (obj2 instanceof Boolean) {
                String str2 = aVar.f308799m;
                C87412m.m108591d(str2);
                key = C28515c.m38232a(str2, Boolean.TYPE);
            } else if (obj2 instanceof String) {
                String str3 = aVar.f308799m;
                C87412m.m108591d(str3);
                key = C28515c.m38232a(str3, cls);
            } else {
                Log.m105920e("MicroMsg.WCCameraEffectHelper", "getVendorTagCaptureKeyByCreator: with unknow type value = " + aVar.f308796j + " key = " + aVar.f308799m);
                key = null;
            }
            Object obj4 = aVar.f308798l;
            if (obj4 instanceof Range) {
                C87412m.m108592e(obj4, "null cannot be cast to non-null type android.util.Range<kotlin.Int>");
                obj3 = ((Range) obj4).getLower();
            } else if (obj4 instanceof ArrayList) {
                C87412m.m108592e(obj4, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) obj4;
                Object obj5 = arrayList.get(0);
                if (obj5 instanceof Integer) {
                    Object obj6 = arrayList.get(0);
                    C87412m.m108592e(obj6, "null cannot be cast to non-null type kotlin.Int");
                    obj3 = (Integer) obj6;
                } else if (obj5 instanceof Boolean) {
                    Object obj7 = arrayList.get(0);
                    C87412m.m108592e(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                    obj3 = (Boolean) obj7;
                } else if (obj5 instanceof String) {
                    Object obj8 = arrayList.get(0);
                    C87412m.m108592e(obj8, "null cannot be cast to non-null type kotlin.String");
                    obj3 = (String) obj8;
                }
            }
            Log.m105924i("MicroMsg.WCCameraEffectHelper", aVar.f308797k + " has been set value is " + z);
            if (obj instanceof Integer) {
                C87412m.m108592e(key, "null cannot be cast to non-null type android.hardware.camera2.CaptureRequest.Key<kotlin.Int>");
                if (!z) {
                    obj = obj3;
                }
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Int");
                builder.set(key, (Integer) obj);
            } else if (obj instanceof Boolean) {
                C87412m.m108592e(key, "null cannot be cast to non-null type android.hardware.camera2.CaptureRequest.Key<kotlin.Boolean>");
                builder.set(key, Boolean.valueOf(z));
            } else if (obj instanceof String) {
                C87412m.m108592e(key, "null cannot be cast to non-null type android.hardware.camera2.CaptureRequest.Key<kotlin.String>");
                if (!z) {
                    obj = obj3;
                }
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
                builder.set(key, (String) obj);
            } else {
                Log.m105924i("MicroMsg.WCCameraEffectHelper", "error set config");
            }
        }
    }
}
