package com.tencent.p014mm.sdk.json;

import fy3.C32226l;
import gy3.C87412m;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C64188i0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0007J&\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0015\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n*\u00020\u0005H\u0002J(\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00052\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\f0\u0006H\bø\u0001\u0000J)\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000f\"\u00020\u00022\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/sdk/json/JSONUtils;", "", "Lorg/json/JSONObject;", "copy", "T", "Lorg/json/JSONArray;", "Lkotlin/Function1;", "Lrx3/b0;", "block", "forEach", "", "iterator", "", "predicate", "find", "", "jsonObjects", "replaceSameKey", "merge", "([Lorg/json/JSONObject;Z)Lorg/json/JSONObject;", "<init>", "()V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.json.JSONUtils */
public final class JSONUtils {
    public static final JSONUtils INSTANCE = new JSONUtils();

    private JSONUtils() {
    }

    public static final JSONObject copy(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "<this>");
        String[] strArr = new String[jSONObject.length()];
        Iterator<String> keys = jSONObject.keys();
        C87412m.m108593f(keys, "this.keys()");
        int i = 0;
        while (keys.hasNext()) {
            int i2 = i + 1;
            if (i >= 0) {
                C64188i0 i0Var = new C64188i0(i, keys.next());
                strArr[i0Var.f181909a] = (String) i0Var.f181910b;
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return new JSONObject(jSONObject, strArr);
    }

    public static final <T> void forEach(JSONArray jSONArray, C32226l<? super T, C13598b0> lVar) {
        C87412m.m108594g(jSONArray, "<this>");
        C87412m.m108594g(lVar, "block");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            lVar.invoke(jSONArray.get(i));
        }
    }

    public final Object find(JSONArray jSONArray, C32226l<Object, Boolean> lVar) {
        C87412m.m108594g(jSONArray, "<this>");
        C87412m.m108594g(lVar, "predicate");
        Iterator<Object> it = iterator(jSONArray);
        while (it.hasNext()) {
            Object next = it.next();
            if (lVar.invoke(next).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    public final Iterator<Object> iterator(JSONArray jSONArray) {
        C87412m.m108594g(jSONArray, "<this>");
        return new JSONUtils$iterator$1(jSONArray);
    }

    public final JSONObject merge(JSONObject[] jSONObjectArr, boolean z) {
        C87412m.m108594g(jSONObjectArr, "jsonObjects");
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (z) {
                    jSONObject.put(next, jSONObject2.get(next));
                } else if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
        }
        return jSONObject;
    }
}
