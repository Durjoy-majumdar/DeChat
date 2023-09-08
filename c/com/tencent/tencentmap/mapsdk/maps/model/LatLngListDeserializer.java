package com.tencent.tencentmap.mapsdk.maps.model;

import com.tencent.map.tools.json.JsonParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public class LatLngListDeserializer implements JsonParser.Deserializer<List<LatLng>> {
    public List<LatLng> deserialize(Object obj, String str, Object obj2) {
        Object obj3 = obj2;
        if (obj3 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!(obj3 instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj3;
        if (jSONArray.length() == 0) {
            return null;
        }
        if ((jSONArray.get(0) instanceof Double) || (jSONArray.get(0) instanceof Integer)) {
            if (jSONArray.length() < 2) {
                return null;
            }
            if (jSONArray.length() % 2 == 0) {
                for (int i = 0; i < jSONArray.length() - 1; i += 2) {
                    arrayList.add(new LatLng(jSONArray.getDouble(i), jSONArray.getDouble(i + 1)));
                }
            } else {
                arrayList.add(new LatLng(jSONArray.getDouble(0), jSONArray.getDouble(1), jSONArray.getDouble(2)));
            }
        } else if (jSONArray.get(0) instanceof JSONArray) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONArray jSONArray2 = (JSONArray) jSONArray.get(i2);
                if (jSONArray2.length() < 2) {
                    return null;
                }
                if (jSONArray2.length() > 2) {
                    arrayList.add(new LatLng(jSONArray2.getDouble(0), jSONArray2.getDouble(1), jSONArray2.getDouble(2)));
                } else {
                    arrayList.add(new LatLng(jSONArray2.getDouble(0), jSONArray2.getDouble(1)));
                }
            }
        }
        return arrayList;
    }
}
