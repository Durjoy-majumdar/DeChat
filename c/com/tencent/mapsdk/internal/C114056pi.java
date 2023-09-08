package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngDeserializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.tencent.mapsdk.internal.pi */
public final class C114056pi extends JsonComposer {
    @Json(name = "detail")

    /* renamed from: a */
    public C114060d f341264a;

    /* renamed from: com.tencent.mapsdk.internal.pi$a */
    public static final class C114057a extends JsonComposer {
        @Json(name = "aoi_latitude")

        /* renamed from: a */
        public String f341265a;
        @Json(name = "aoi_longitude")

        /* renamed from: b */
        public String f341266b;
        @Json(name = "area")

        /* renamed from: c */
        public C114058b f341267c;

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("PoiArea{");
            stringBuffer.append("latitude=");
            stringBuffer.append(this.f341265a);
            stringBuffer.append(", longitude=");
            stringBuffer.append(this.f341266b);
            stringBuffer.append(", area=");
            stringBuffer.append(this.f341267c);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.pi$b */
    public static final class C114058b extends JsonComposer implements JsonParser.Deserializer<List<List<LatLng>>> {
        @Json(name = "type")

        /* renamed from: a */
        public String f341268a;
        @Json(deserializer = C114058b.class, name = "coordinates")

        /* renamed from: b */
        public List<List<LatLng>> f341269b;

        /* renamed from: a */
        private static List<List<LatLng>> m158800a(Object obj) {
            ArrayList arrayList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj2 = jSONArray.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    if (obj2 instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) obj2;
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            Object obj3 = jSONArray2.get(i2);
                            if (obj3 instanceof JSONArray) {
                                JSONArray jSONArray3 = (JSONArray) obj3;
                                if (jSONArray3.length() == 2) {
                                    arrayList2.add(new LatLng(jSONArray3.optDouble(1), jSONArray3.optDouble(0)));
                                }
                            }
                        }
                        if (arrayList2.size() != length2) {
                            C113889km.m157549c("coordinates's data deserialize error!!");
                        }
                    }
                    arrayList.add(arrayList2);
                }
                if (arrayList.size() != length) {
                    C113889km.m157549c("coordinates's area deserialize error!!");
                }
            }
            return arrayList;
        }

        public final /* synthetic */ Object deserialize(Object obj, String str, Object obj2) {
            if (obj2 == null || !(obj2 instanceof JSONArray)) {
                return null;
            }
            JSONArray jSONArray = (JSONArray) obj2;
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj3 = jSONArray.get(i);
                ArrayList arrayList2 = new ArrayList();
                if (obj3 instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) obj3;
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        Object obj4 = jSONArray2.get(i2);
                        if (obj4 instanceof JSONArray) {
                            JSONArray jSONArray3 = (JSONArray) obj4;
                            if (jSONArray3.length() == 2) {
                                arrayList2.add(new LatLng(jSONArray3.optDouble(1), jSONArray3.optDouble(0)));
                            }
                        }
                    }
                    if (arrayList2.size() != length2) {
                        C113889km.m157549c("coordinates's data deserialize error!!");
                    }
                }
                arrayList.add(arrayList2);
            }
            if (arrayList.size() != length) {
                C113889km.m157549c("coordinates's area deserialize error!!");
            }
            return arrayList;
        }

        public final String toString() {
            int[] iArr;
            List<List<LatLng>> list = this.f341269b;
            int i = 0;
            if (list != null) {
                int size = list.size();
                iArr = new int[size];
                while (i < size) {
                    iArr[i] = this.f341269b.get(i).size();
                    i++;
                }
                i = size;
            } else {
                iArr = null;
            }
            StringBuffer stringBuffer = new StringBuffer("AreaData{");
            stringBuffer.append("type='");
            stringBuffer.append(this.f341268a);
            stringBuffer.append('\'');
            stringBuffer.append(", coordinates=");
            stringBuffer.append(i);
            stringBuffer.append("#");
            stringBuffer.append(Arrays.toString(iArr));
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.pi$c */
    public static class C114059c extends JsonComposer {
        @Json(name = "fill_color")

        /* renamed from: a */
        public String f341270a;
        @Json(name = "stroke_color")

        /* renamed from: b */
        public String f341271b;
        @Json(name = "stroke_width")

        /* renamed from: c */
        public int f341272c;

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("AoiStyle{");
            stringBuffer.append("fillColor='");
            stringBuffer.append(this.f341270a);
            stringBuffer.append('\'');
            stringBuffer.append(", strokeColor='");
            stringBuffer.append(this.f341271b);
            stringBuffer.append('\'');
            stringBuffer.append(", strokeWidth=");
            stringBuffer.append(this.f341272c);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.pi$d */
    public static class C114060d extends JsonComposer {
        @Json(ignore = true)

        /* renamed from: a */
        public int f341273a = -1;
        @Json(name = "uid")

        /* renamed from: b */
        public String f341274b;
        @Json(name = "name")

        /* renamed from: c */
        public String f341275c;
        @Json(name = "alias")

        /* renamed from: d */
        public String f341276d;
        @Json(name = "type")

        /* renamed from: e */
        public String f341277e;
        @Json(name = "styles")

        /* renamed from: f */
        public List<C114061e> f341278f;
        @Json(name = "shinei_id")

        /* renamed from: g */
        public String f341279g;
        @Json(deserializer = LatLngDeserializer.class, name = "location")

        /* renamed from: h */
        public LatLng f341280h;
        @Json(name = "aoi_info")

        /* renamed from: i */
        public C114057a f341281i;
        @Json(name = "sub_pois")

        /* renamed from: j */
        public List<C114060d> f341282j;

        /* renamed from: a */
        public final String mo172648a() {
            return !TextUtils.isEmpty(this.f341276d) ? this.f341276d : this.f341275c;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("PoiDetail{");
            stringBuffer.append("displayId=");
            stringBuffer.append(this.f341273a);
            stringBuffer.append(", poiId='");
            stringBuffer.append(this.f341274b);
            stringBuffer.append('\'');
            stringBuffer.append(", name='");
            stringBuffer.append(this.f341275c);
            stringBuffer.append('\'');
            stringBuffer.append(", alias='");
            stringBuffer.append(this.f341276d);
            stringBuffer.append('\'');
            stringBuffer.append(", type='");
            stringBuffer.append(this.f341277e);
            stringBuffer.append('\'');
            stringBuffer.append(", poiStyles=");
            stringBuffer.append(this.f341278f);
            stringBuffer.append(", indoorId='");
            stringBuffer.append(this.f341279g);
            stringBuffer.append('\'');
            stringBuffer.append(", point=");
            stringBuffer.append(this.f341280h);
            stringBuffer.append(", poiArea=");
            stringBuffer.append(this.f341281i);
            stringBuffer.append(", subPois=");
            stringBuffer.append(this.f341282j);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.pi$e */
    public static class C114061e extends JsonComposer {
        @Json(ignore = true)

        /* renamed from: a */
        public BitmapDescriptor f341283a;
        @Json(ignore = true)

        /* renamed from: b */
        public BitmapDescriptor f341284b;
        @Json(name = "style_class")

        /* renamed from: c */
        public int f341285c;
        @Json(name = "icon_url")

        /* renamed from: d */
        public String f341286d;
        @Json(name = "icon_type")

        /* renamed from: e */
        public int f341287e;
        @Json(name = "font_color")

        /* renamed from: f */
        public String f341288f;
        @Json(name = "font_size")

        /* renamed from: g */
        public int f341289g;
        @Json(name = "font_stroke_color")

        /* renamed from: h */
        public String f341290h;
        @Json(name = "font_stroke_width")

        /* renamed from: i */
        public int f341291i;
        @Json(name = "level")

        /* renamed from: j */
        public int f341292j;
        @Json(name = "zindex")

        /* renamed from: k */
        public int f341293k;
        @Json(name = "aoi")

        /* renamed from: l */
        public C114059c f341294l;

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("PoiStyle{");
            stringBuffer.append("icon=");
            stringBuffer.append(this.f341283a);
            stringBuffer.append(", type=");
            stringBuffer.append(this.f341285c);
            stringBuffer.append(", iconUrl='");
            stringBuffer.append(this.f341286d);
            stringBuffer.append('\'');
            stringBuffer.append(", iconDisplayType=");
            stringBuffer.append(this.f341287e);
            stringBuffer.append(", fontColor='");
            stringBuffer.append(this.f341288f);
            stringBuffer.append('\'');
            stringBuffer.append(", fontSize=");
            stringBuffer.append(this.f341289g);
            stringBuffer.append(", fontStrokeColor='");
            stringBuffer.append(this.f341290h);
            stringBuffer.append('\'');
            stringBuffer.append(", fontStrokeWidth=");
            stringBuffer.append(this.f341291i);
            stringBuffer.append(", level=");
            stringBuffer.append(this.f341292j);
            stringBuffer.append(", zindex=");
            stringBuffer.append(this.f341293k);
            stringBuffer.append(", aoiStyle=");
            stringBuffer.append(this.f341294l);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("AoiInfo{");
        stringBuffer.append("poiDetail=");
        stringBuffer.append(this.f341264a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
