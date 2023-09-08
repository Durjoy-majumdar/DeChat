package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.tencent.mapsdk.internal.ei */
public final class C113698ei implements JsonParser.Deserializer<List<WeightedLatLng>> {
    /* renamed from: a */
    private static List<WeightedLatLng> m156698a(List<Double> list) {
        if (list.size() < 3) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeightedLatLng(new LatLng(list.get(0).doubleValue(), list.get(1).doubleValue()), list.get(2).doubleValue()));
        for (int i = 3; i < list.size(); i += 3) {
            WeightedLatLng weightedLatLng = (WeightedLatLng) arrayList.get((i / 3) - 1);
            arrayList.add(new WeightedLatLng(new LatLng(weightedLatLng.getPoint().latitude + (list.get(i).doubleValue() / 1000000.0d), weightedLatLng.getPoint().longitude + (list.get(i + 1).doubleValue() / 1000000.0d)), weightedLatLng.getIntensity() + (list.get(i + 2).doubleValue() / 100.0d)));
        }
        return arrayList;
    }

    public final /* synthetic */ Object deserialize(Object obj, String str, Object obj2) {
        if (obj2 == null || !(obj2 instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj2;
        if (jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
        }
        return m156698a((List<Double>) arrayList);
    }

    /* renamed from: a */
    private static List<WeightedLatLng> m156697a(Object obj) {
        if (obj != null && (obj instanceof JSONArray)) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
                }
                return m156698a((List<Double>) arrayList);
            }
        }
        return null;
    }
}
