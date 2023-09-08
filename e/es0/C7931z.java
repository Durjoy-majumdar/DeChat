package es0;

import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86295k;
import gy3.C87412m;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: es0.z */
public final class C7931z implements C86295k {

    /* renamed from: d */
    public final int f26616d;

    /* renamed from: e */
    public final int[] f26617e;

    public C7931z(int i, int[] iArr) {
        this.f26616d = i;
        this.f26617e = iArr;
    }

    /* renamed from: a */
    public String mo3693a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("showOrderEntrance", this.f26616d);
            if (this.f26617e != null) {
                JSONArray jSONArray = new JSONArray();
                for (int put : this.f26617e) {
                    jSONArray.put(put);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                jSONObject.put("redDotTypeList", jSONArray);
            }
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "{\n            val obj = … obj.toString()\n        }");
            return jSONObject2;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AppBrand.WeAppNativeExtraDataWeUse", th, "toJsonString", new Object[0]);
            return "{}";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7931z)) {
            return false;
        }
        C7931z zVar = (C7931z) obj;
        return this.f26616d == zVar.f26616d && C87412m.m108589b(this.f26617e, zVar.f26617e);
    }

    public int hashCode() {
        int i = this.f26616d * 31;
        int[] iArr = this.f26617e;
        return i + (iArr == null ? 0 : Arrays.hashCode(iArr));
    }

    public String toString() {
        return mo3693a();
    }
}
